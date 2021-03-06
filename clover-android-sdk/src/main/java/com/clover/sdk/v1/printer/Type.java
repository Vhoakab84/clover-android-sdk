/**
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.clover.sdk.v1.printer;

import android.os.Parcel;
import android.os.Parcelable;

public enum Type implements Parcelable {

  STAR_TSP100_ETHERNET("com.clover.engine.services.ReceiptPrinterPlugins.Star.StarTSP100Ethernet", "Star TSP100", true, true, 1, 576),
  STAR_TSP100_USB("com.clover.engine.services.ReceiptPrinterPlugins.Star.StarTSP100USB", "Star TSP100U", true, true, 1, 576),
  STAR_TSP700_ETHERNET("com.clover.engine.services.ReceiptPrinterPlugins.Star.StarSP700Ethernet", "Star SP700", false, true, 1, 0),
  SEIKO_USB("com.clover.engine.services.ReceiptPrinterPlugins.seiko.Seiko", "Station", true, true, 1, 576),
  FIGLEAF_BT("com.clover.engine.services.ReceiptPrinterPlugins.figleaf.Figleaf", "Mobile", true, true, 0, 384),
  SEIKO_MINI_USB("com.clover.engine.services.ReceiptPrinterPlugins.seiko.SeikoMini", "Mini", true, true, 1, 384),
  SEIKO_REMOTE("com.clover.engine.services.ReceiptPrinterPlugins.seiko.SeikoRemote", "Station Remote", true, true, 1, 576),
  BAYLEAF_USB("com.clover.engine.services.ReceiptPrinterPlugins.bayleaf.Bayleaf", "Flex", true, true, 0, 384),
  GOLDEN_OAK_USB("com.clover.engine.services.ReceiptPrinterPlugins.goldenoak.Goldenoak", "Station", true, true, 2, 576),
  ACORN_USB("com.clover.engine.services.ReceiptPrinterPlugins.goldenoak.Goldenoak", "Station", true, true, 2, 576),
  ;

  public final String baseClassName;
  public final String model;
  /**
   * Capable of printing receipts and images.
   */
  public final boolean receipt;
  /**
   * Capable of printing orders.
   */
  public final boolean order;
  public final boolean supportsCashDrawer; // keeping this for backward compatibility
  public final int numCashDrawersSupported;
  /**
   * Width of the print head in dots. Use to determine optimal image pixel width when printing
   * bitmaps or views. Has value 0 if printing images is not supported such as on an order-only printer.
   */
  public final int numDotsWidth;

  private Type(String baseClassName, String model, boolean receipt, boolean order, int numCashDrawersSupported, int numDotsWidth) {
    this.baseClassName = baseClassName;
    this.model = model;
    this.receipt = receipt;
    this.order = order;
    this.numCashDrawersSupported = numCashDrawersSupported;
    this.supportsCashDrawer = (numCashDrawersSupported > 0);
    this.numDotsWidth = numDotsWidth;
  }

  public boolean isReceipt() {
    return receipt;
  }

  public boolean isOrder() {
    return order;
  }

  public String getDriverClassName(Category category) {
    switch (category) {
      case RECEIPT:
        if (isReceipt()) {
          return baseClassName;
        } else {
          return null;
        }
      case ORDER:
        if (isOrder()) {
          return baseClassName + "Order";
        } else {
          return null;
        }
      default:
        return null;
    }
  }

  public static Type valueOfModel(String model) {
    for (Type t : values()) {
      if (t.model.equals(model)) {
        return t;
      }
    }
    return null;
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<Type> CREATOR = new Creator<Type>() {
    @Override
    public Type createFromParcel(final Parcel source) {
      return Type.valueOf(source.readString());
    }

    @Override
    public Type[] newArray(final int size) {
      return new Type[size];
    }
  };

  public boolean isUsb() {
    // do better please
    return name().endsWith("_USB");
  }

  public boolean isBluetooth() {
    // do better please
    return name().endsWith("_BT");
  }
}
