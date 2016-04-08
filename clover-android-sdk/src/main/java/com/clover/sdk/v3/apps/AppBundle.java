/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
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

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class AppBundle implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * The name of the bundle
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  /**
   * DEPRECATED: Instead use per country pricing in bundleCountries
   */
  public java.lang.Long getPrice() {
    return genClient.cacheGet(CacheKey.price);
  }

  /**
   * DEPRECATED: Instead use per country pricing in bundleCountries
   */
  public java.lang.Long getPricePerDevice() {
    return genClient.cacheGet(CacheKey.pricePerDevice);
  }

  public java.util.List<com.clover.sdk.v3.base.Reference> getIncludedApps() {
    return genClient.cacheGet(CacheKey.includedApps);
  }

  /**
   * Bundle country options for this app bundle
   */
  public java.util.List<com.clover.sdk.v3.apps.AppBundleCountry> getBundleCountries() {
    return genClient.cacheGet(CacheKey.bundleCountries);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AppBundle> {
    id {
      @Override
      public Object extractValue(AppBundle instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(AppBundle instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    price {
      @Override
      public Object extractValue(AppBundle instance) {
        return instance.genClient.extractOther("price", java.lang.Long.class);
      }
    },
    pricePerDevice {
      @Override
      public Object extractValue(AppBundle instance) {
        return instance.genClient.extractOther("pricePerDevice", java.lang.Long.class);
      }
    },
    includedApps {
      @Override
      public Object extractValue(AppBundle instance) {
        return instance.genClient.extractListRecord("includedApps", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    bundleCountries {
      @Override
      public Object extractValue(AppBundle instance) {
        return instance.genClient.extractListRecord("bundleCountries", com.clover.sdk.v3.apps.AppBundleCountry.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<AppBundle> genClient = new GenericClient<AppBundle>(this);

  /**
   * Constructs a new empty instance.
   */
  public AppBundle() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AppBundle(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public AppBundle(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AppBundle(AppBundle src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);

    genClient.validateLength(getName(), 31);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'price' field is set and is not null */
  public boolean isNotNullPrice() {
    return genClient.cacheValueIsNotNull(CacheKey.price);
  }

  /** Checks whether the 'pricePerDevice' field is set and is not null */
  public boolean isNotNullPricePerDevice() {
    return genClient.cacheValueIsNotNull(CacheKey.pricePerDevice);
  }

  /** Checks whether the 'includedApps' field is set and is not null */
  public boolean isNotNullIncludedApps() {
    return genClient.cacheValueIsNotNull(CacheKey.includedApps);
  }

  /** Checks whether the 'includedApps' field is set and is not null and is not empty */
  public boolean isNotEmptyIncludedApps() { return isNotNullIncludedApps() && !getIncludedApps().isEmpty(); }

  /** Checks whether the 'bundleCountries' field is set and is not null */
  public boolean isNotNullBundleCountries() {
    return genClient.cacheValueIsNotNull(CacheKey.bundleCountries);
  }

  /** Checks whether the 'bundleCountries' field is set and is not null and is not empty */
  public boolean isNotEmptyBundleCountries() { return isNotNullBundleCountries() && !getBundleCountries().isEmpty(); }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'price' field has been set, however the value could be null */
  public boolean hasPrice() {
    return genClient.cacheHasKey(CacheKey.price);
  }

  /** Checks whether the 'pricePerDevice' field has been set, however the value could be null */
  public boolean hasPricePerDevice() {
    return genClient.cacheHasKey(CacheKey.pricePerDevice);
  }

  /** Checks whether the 'includedApps' field has been set, however the value could be null */
  public boolean hasIncludedApps() {
    return genClient.cacheHasKey(CacheKey.includedApps);
  }

  /** Checks whether the 'bundleCountries' field has been set, however the value could be null */
  public boolean hasBundleCountries() {
    return genClient.cacheHasKey(CacheKey.bundleCountries);
  }


  /**
   * Sets the field 'id'.
   */
  public AppBundle setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public AppBundle setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'price'.
   */
  public AppBundle setPrice(java.lang.Long price) {
    return genClient.setOther(price, CacheKey.price);
  }

  /**
   * Sets the field 'pricePerDevice'.
   */
  public AppBundle setPricePerDevice(java.lang.Long pricePerDevice) {
    return genClient.setOther(pricePerDevice, CacheKey.pricePerDevice);
  }

  /**
   * Sets the field 'includedApps'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public AppBundle setIncludedApps(java.util.List<com.clover.sdk.v3.base.Reference> includedApps) {
    return genClient.setArrayRecord(includedApps, CacheKey.includedApps);
  }

  /**
   * Sets the field 'bundleCountries'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public AppBundle setBundleCountries(java.util.List<com.clover.sdk.v3.apps.AppBundleCountry> bundleCountries) {
    return genClient.setArrayRecord(bundleCountries, CacheKey.bundleCountries);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'price' field, the 'has' method for this field will now return false */
  public void clearPrice() {
    genClient.clear(CacheKey.price);
  }
  /** Clears the 'pricePerDevice' field, the 'has' method for this field will now return false */
  public void clearPricePerDevice() {
    genClient.clear(CacheKey.pricePerDevice);
  }
  /** Clears the 'includedApps' field, the 'has' method for this field will now return false */
  public void clearIncludedApps() {
    genClient.clear(CacheKey.includedApps);
  }
  /** Clears the 'bundleCountries' field, the 'has' method for this field will now return false */
  public void clearBundleCountries() {
    genClient.clear(CacheKey.bundleCountries);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public AppBundle copyChanges() {
    AppBundle copy = new AppBundle();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AppBundle src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AppBundle(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<AppBundle> CREATOR = new android.os.Parcelable.Creator<AppBundle>() {
    @Override
    public AppBundle createFromParcel(android.os.Parcel in) {
      AppBundle instance = new AppBundle(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AppBundle[] newArray(int size) {
      return new AppBundle[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AppBundle> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AppBundle>() {
    @Override
    public AppBundle create(org.json.JSONObject jsonObject) {
      return new AppBundle(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = false;
    public static final long NAME_MAX_LEN = 31;

    public static final boolean PRICE_IS_REQUIRED = false;

    public static final boolean PRICEPERDEVICE_IS_REQUIRED = false;

    public static final boolean INCLUDEDAPPS_IS_REQUIRED = false;

    public static final boolean BUNDLECOUNTRIES_IS_REQUIRED = false;

  }

}
