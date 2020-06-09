package test.com.aop02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAOimpl implements TestDAO {

	private static final Logger logger = LoggerFactory.getLogger(TestDAOimpl.class);
	
	@Override
	public int insert() {
		logger.info("insert on");
		return 0;
	}

	@Override
	public int update() {
		logger.info("update on");
		return 0;
	}

	@Override
	public int delete() {
		logger.info("delete on");
		return 0;
	}

	@Override
	public int select() {
		logger.info("select on");
		return 0;
	}

	@Override
	public int search() {
		logger.info("search on");
		return 0;
	}

}
