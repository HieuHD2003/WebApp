package hieu.dev.data.dao;

import java.util.List;

import hieu.dev.data.model.OrderDetail;

public interface OrderDetailDao {
	public boolean insert(OrderDetail orderDetail);
	public boolean update(OrderDetail orderDetail);	
	public boolean delete(int id);
	public OrderDetail find(int id);
	public List<OrderDetail> findAll();
}
