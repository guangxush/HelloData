package com.shgx.hidata.controller;

import com.shgx.hidata.model.Sentences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author: guangxush
 * @create: 2019/08/04
 */
@RestController
public class HiDataController {

    private static Logger logger = LoggerFactory.getLogger(HiDataController.class);

    @RequestMapping(path = "/hello", method = RequestMethod.POST)
    @ResponseBody
    public void insertBusiness(@RequestBody Sentences sentences) {
        logger.info(sentences.getContext());
    }
}
