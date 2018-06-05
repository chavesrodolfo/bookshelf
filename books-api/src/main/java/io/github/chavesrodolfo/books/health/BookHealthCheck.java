package io.github.chavesrodolfo.books.health;

import com.codahale.metrics.health.HealthCheck;

public class BookHealthCheck extends HealthCheck {
    
	private final String appName;

    public BookHealthCheck(String appName) {
        this.appName = appName;
    }

    @Override
    protected Result check() throws Exception {
        if (!this.appName.equals("Book")) {
            return Result.unhealthy("Application doesn't has a name");
        }
        return Result.healthy();
    }
}