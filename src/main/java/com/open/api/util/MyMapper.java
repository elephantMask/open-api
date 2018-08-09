package com.open.api.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * <p>Title: MyMapper . </p>
 * <p>通用mapper接口  </p>
 *
 *
 * @author <a href="xmthnxianyi.com"/>mt</a>
 * @CreateDate 2018-05-02 下午2:47
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
