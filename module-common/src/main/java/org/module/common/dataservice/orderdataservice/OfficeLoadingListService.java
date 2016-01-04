package org.module.common.dataservice.orderdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.module.common.dataservice.MyList;
import org.module.common.po.OfficeLoadingListPO;
import org.module.common.po.State;


public interface OfficeLoadingListService extends Remote,AbstractOrderDataService<OfficeLoadingListPO>{
	/**
	 * 前置：无
	 * 后置：返回所有PO
	 * @return
	 */
	public MyList<OfficeLoadingListPO> getAll() throws RemoteException;
	/**
	 * 前置：w所指定的订单填写人有已填写订单
	 * 后置：查找并返回所有PO组成的序列化列表
	 * @return
	 */
	public MyList<OfficeLoadingListPO> getAll(String w) throws RemoteException;
	/**
	 * 前置：不存在相同ID的寄件单
	 * 后置：增加一个PO，根据操作结果返回
	 * @return
	 */
    public boolean add(OfficeLoadingListPO o) throws RemoteException;
    /**
	 * 前置：欲修改的相同ID的PO存在
	 * 后置：更新PO信息，根据操作结果返回
	 * @param old
	 * @param newone
	 * @return
	 */
	public boolean update(OfficeLoadingListPO newone) throws RemoteException;
   
	/**
	 * 前置：对应状态合法
	 * 后置：查找对应状态PO，返回序列化列表
     * 根据状态查找
     * @param s
     * @return
     */
	public MyList<OfficeLoadingListPO> getByState(State s) throws RemoteException;
}

