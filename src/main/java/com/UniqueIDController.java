package com;

import com.uniqueId.dto.Id;
import com.uniqueId.service.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kangkang on 20/1/5.
 */
@RestController
@RequestMapping("/id")
public class UniqueIDController {

    @Autowired
    IdService idService;

    @RequestMapping("/gen")
    @ResponseBody
    public String gen(HttpServletRequest request) {

        long id = idService.genId();
        Id ido = idService.expId(id);
        long id1 = idService.makeId(ido.getVersion(), ido.getType(),
                ido.getGenMethod(), ido.getTime(), ido.getSeq(),
                ido.getMachine());

        System.err.println(id + ":" + ido);

        return "OK";
    }


}
