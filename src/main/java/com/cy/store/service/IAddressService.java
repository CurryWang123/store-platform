package com.cy.store.service;

import com.cy.store.entity.Address;

import java.util.List;

/** 处理收货地址数据的业务层接口 */
public interface IAddressService {
    /**
     * 创建新的收货地址
     * @param address 用户提交的收货地址数据
     */
    void addNewAddress( Address address);

    /**
     * 查询某用户的收货地址列表数据
     * @param uid 收货地址归属的用户id
     * @return 该用户的收货地址列表数据
     */
    List<Address> getByUid(Integer uid);

    /**
     * 设置默认收货地址
     * @param aid 收货地址id
     * @param uid 归属的用户id
     * @param username 当前登录的用户名
     */
    void setDefault(Integer aid, Integer uid, String username);

    /**
     * 删除收货地址
     * @param aid 收货地址id
     * @param uid 归属的用户id
     * @param username 当前登录的用户名
     */
    void delete(Integer aid, Integer uid, String username);

    /**
     * 根据收货地址数据的id，查询收货地址详情
     * @param aid 收货地址id
     * @param uid 归属的用户id
     * @return 匹配的收货地址详情
     */
    Address getByAid(Integer aid, Integer uid);


    /**
     * 更新地址信息
     */
    void updateAddress(Address address);

    /**
     * 根据aid获取详情
     */
    Address findByAid(Integer aid);
}











