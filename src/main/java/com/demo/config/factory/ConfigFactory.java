package com.demo.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.demo.config.FrameworkConfig;

public final class ConfigFactory {

  private ConfigFactory() {
  }

  public static FrameworkConfig getConfig() {
    return ConfigCache.getOrCreate(FrameworkConfig.class);
  }
}
