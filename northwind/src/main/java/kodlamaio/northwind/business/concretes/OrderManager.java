package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.OrderService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.dataAccess.abstracts.OrderDao;
import kodlamaio.northwind.entities.concretes.Order;

@Service
public class OrderManager implements OrderService {

	private OrderDao orderDao;

	@Autowired
	public OrderManager(OrderDao orderDao) {
		super();
		this.orderDao = orderDao;
	}

	@Override
	public DataResult<List<Order>> getAll() {
		return new SuccessDataResult<List<Order>>(this.orderDao.findAll());
	}

}
