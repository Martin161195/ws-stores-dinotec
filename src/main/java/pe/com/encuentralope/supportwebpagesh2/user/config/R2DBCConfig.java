package pe.com.encuentralope.supportwebpagesh2.user.config;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static io.r2dbc.pool.PoolingConnectionFactoryProvider.MAX_SIZE;
import static io.r2dbc.spi.ConnectionFactoryOptions.*;
@Configuration
public class R2DBCConfig {


    @Bean
    public ConnectionFactory connectionFactory() {
        return ConnectionFactories.get(
                ConnectionFactoryOptions.builder()
                        .option(DRIVER, "postgresql")
                        .option(HOST, "ec2-18-212-57-164.compute-1.amazonaws.com")
                        .option(PORT, 5432)
                        .option(USER, "dinotec")
                        .option(PASSWORD, "sTaWRuq0p9ldRL-utrUf")
                        .option(DATABASE, "encuentralo_pe")
                        .option(MAX_SIZE, 40)
                        .build());
    }
}

