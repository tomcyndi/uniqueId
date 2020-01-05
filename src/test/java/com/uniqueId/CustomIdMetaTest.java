package com.uniqueId;

import com.uniqueId.dto.Id;
import com.uniqueId.service.IdService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CustomIdMetaTest extends AbstractTestNGSpringContextTests {

    @Test(groups = {"idService"})
    public void testSimple() {
        IdService idService = (IdService) applicationContext.getBean("idService");

        long id = idService.genId();
        Id ido = idService.expId(id);
        long id1 = idService.makeId(ido.getVersion(), ido.getType(),
                ido.getGenMethod(), ido.getTime(), ido.getSeq(),
                ido.getMachine());

        System.out.println(id + ":" + ido);

        AssertJUnit.assertEquals(id, id1);
    }

}
