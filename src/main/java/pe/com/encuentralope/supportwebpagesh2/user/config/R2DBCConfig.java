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
                        .option(HOST, "ec2-44-199-158-170.compute-1.amazonaws.com")
                        .option(PORT, 5432)
                        .option(USER, "dfzndfgxhtkzhb")
                        .option(PASSWORD, "06fa62c5551f54cd2c3d8f43ce085152c7a1a10a8b843d99ae542428c220a4d8")
                        .option(DATABASE, "d5pgi60ga0234n")
                        .option(MAX_SIZE, 40)
                        .build());
    }
}

