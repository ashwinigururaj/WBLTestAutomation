package com.wbl.utils;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;

/**
 * Created by svelupula on 8/8/2015.
 */
public class PageDriver {

    private final Configuration _configuration;
    private final Browsers _browser;
    private WebDriver _webDriver;
    private String _mainWindowHandler;

    public PageDriver(Configuration configuration) {
        _configuration = configuration;
        _browser = _configuration.Browser;
    }

}
