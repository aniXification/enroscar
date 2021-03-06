package com.stanfy.enroscar.images;

import com.stanfy.enroscar.beans.BeansManager;
import com.stanfy.enroscar.images.cache.ImageFileCache;
import com.stanfy.enroscar.images.cache.SupportLruImageMemoryCache;
import com.stanfy.enroscar.io.BuffersPool;
import com.stanfy.enroscar.net.UrlConnectionBuilderFactory;
import com.stanfy.enroscar.sdkdep.SDKDependentUtilsFactory;

/**
 * Set default beans.
 */
public class BeanSetup {

  private BeanSetup() { }

  public static void setup(final BeansManager.Editor editor) {
    if (!editor.hasBean(BuffersPool.BEAN_NAME)) {
      editor.put(BuffersPool.class);
    }
    if (!editor.hasBean(SDKDependentUtilsFactory.BEAN_NAME)) {
      editor.put(SDKDependentUtilsFactory.class);
    }
    editor.put(ImageFileCache.class);
    editor.put(SupportLruImageMemoryCache.class);
    editor.put(ImagesManager.CONNECTION_BUILDER_FACTORY_NAME, UrlConnectionBuilderFactory.DEFAULT);
    editor.put(ImagesManager.class);
  }

}
