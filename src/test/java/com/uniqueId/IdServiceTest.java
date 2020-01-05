package com.uniqueId;

import com.App;
import com.BaseTest;
import com.uniqueId.dto.Id;
import com.uniqueId.service.IdService;
import com.uniqueId.service.IdServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@SpringBootTest(classes = App.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class IdServiceTest {

    @Autowired
    IdService idService;

    @Test
    public void testSimple() {

        long id = idService.genId();
        Id ido = idService.expId(id);
        long id1 = idService.makeId(ido.getVersion(), ido.getType(),
                ido.getGenMethod(), ido.getTime(), ido.getSeq(),
                ido.getMachine());

        System.err.println(id + ":" + ido);

        AssertJUnit.assertEquals(id, id1);
    }

    @Test(groups = {"idService"})
    public void testIpConfigurable() {

        long id = idService.genId();
        Id ido = idService.expId(id);
        long id1 = idService.makeId(ido.getVersion(), ido.getType(),
                ido.getGenMethod(), ido.getTime(), ido.getSeq(),
                ido.getMachine());

        System.err.println(id + ":" + ido);

        AssertJUnit.assertEquals(id, id1);
    }

    @Test(groups = {"idService"})
    public void testDb() {

        long id = idService.genId();
        Id ido = idService.expId(id);
        long id1 = idService.makeId(ido.getVersion(), ido.getType(),
                ido.getGenMethod(), ido.getTime(), ido.getSeq(),
                ido.getMachine());

        System.err.println(id + ":" + ido);

        AssertJUnit.assertEquals(id, id1);
    }
}
