package com.xinchen.springboot.start.core.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Component;

/**
 * @author Xin Chen
 * @date 2017/11/28 14:08
 */
@Component
public class EhCacheManage {

    @Autowired
    private EhCacheCacheManager cacheManager;


}
