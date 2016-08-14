/*
 * Copyright ( c ) 2016 Heren Tianjin Corporation. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Heren Tianjin
 * Corporation ("Confidential Information").  You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with Heren Tianjin Corporation or a
 * Heren Tianjin authorized reseller (the "License Agreement").
 */

package com.heren.turtle.entry.command;

/**
 * com.heren.turtle.entry.command
 *
 * @author zhiwei
 * @create 2016-08-08 13:24.
 */
public interface Channel<T> {

    String channelUrl = "http://%s:%s/%s";

    /**
     * @param aClass
     * @param isFilter
     * @param port
     * @param args
     * @return
     */
    T start(Class<?> aClass, boolean isFilter, int port, String... args);

}
