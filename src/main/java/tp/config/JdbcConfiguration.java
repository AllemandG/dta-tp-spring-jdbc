package tp.config;
//package tp.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import com.jolbox.bonecp.BoneCPDataSource;
//
//@Configuration
//@EnableTransactionManagement
//@PropertySource("classpath:application.properties")
//public class JdbcConfiguration {
//	
//	@Autowired private Environment env;
//	
//	@Bean(destroyMethod = "close")
//	public DataSource dataSource() {
//		BoneCPDataSource dataSource = new BoneCPDataSource();
//		
//		dataSource.setDriverClass(env.getRequiredProperty("driverClass"));
//		dataSource.setJdbcUrl(env.getRequiredProperty("jdbcUrl"));
//		dataSource.setUsername(env.getRequiredProperty("jdbcUsername"));
//		dataSource.setPassword(env.getRequiredProperty("jdbcPassword"));
//		dataSource.setIdleConnectionTestPeriodInMinutes(Integer.parseInt(env.getRequiredProperty("idleConnectionTestPeriodInMinutes")));
//		dataSource.setIdleMaxAgeInMinutes(Integer.parseInt(env.getRequiredProperty("idleMaxAgeInMinutes")));
//		dataSource.setMaxConnectionsPerPartition(Integer.parseInt(env.getRequiredProperty("maxConnectionsPerPartition")));
//		dataSource.setMinConnectionsPerPartition(Integer.parseInt(env.getRequiredProperty("minConnectionsPerPartition")));
//		dataSource.setPartitionCount(Integer.parseInt(env.getRequiredProperty("partitionCount")));
//		dataSource.setAcquireIncrement(Integer.parseInt(env.getRequiredProperty("acquireIncrement")));
//		dataSource.setStatementsCacheSize(Integer.parseInt(env.getRequiredProperty("statementsCacheSize")));
//		return dataSource;
//	}
//	
//	@Bean
//	public PlatformTransactionManager txManager () {
//		return new DataSourceTransactionManager(dataSource());
//	}
//	
//	
//	
//}
