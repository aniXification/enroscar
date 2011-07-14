package com.stanfy.images.decorator;

import android.graphics.Bitmap;

/**
 * Image decorator.
 * As a rule decorator is not thread-safe. Use one instance per thread.
 * But one decorator can be shared between different image views.
 * @author Roman Mazur (Stanfy - http://www.stanfy.com)
 */
public interface ImageDecorator {

  /**
   * Decorade an image.
   * @param bitmap source bitmap
   * @return decorated bitmap
   */
  Bitmap decorateBitmap(final Bitmap bitmap);

  /**
   * Setup the decorator.
   * This method is called by image view before the decorator is applied.
   * @param width required image width
   * @param height required image height
   */
  void setup(final int width, final int height);

}
