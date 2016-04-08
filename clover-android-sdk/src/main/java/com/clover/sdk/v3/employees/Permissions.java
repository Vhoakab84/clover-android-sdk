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

package com.clover.sdk.v3.employees;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class Permissions implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * A bitmap representing the permissions
   */
  public java.lang.Long getBits() {
    return genClient.cacheGet(CacheKey.bits);
  }

  /**
   * A readable list of permissions
   */
  public java.util.List<com.clover.sdk.v3.employees.Permission> getReadablePermissions() {
    return genClient.cacheGet(CacheKey.readablePermissions);
  }


  public static final String AUTHORITY = "com.clover.roles";

  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Permissions> {
    id {
      @Override
      public Object extractValue(Permissions instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    bits {
      @Override
      public Object extractValue(Permissions instance) {
        return instance.genClient.extractOther("bits", java.lang.Long.class);
      }
    },
    readablePermissions {
      @Override
      public Object extractValue(Permissions instance) {
        return instance.genClient.extractListEnum("readablePermissions", com.clover.sdk.v3.employees.Permission.class);
      }
    },
    ;
  }

  private GenericClient<Permissions> genClient = new GenericClient<Permissions>(this);

  /**
   * Constructs a new empty instance.
   */
  public Permissions() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Permissions(String json) throws IllegalArgumentException {
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
  public Permissions(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Permissions(Permissions src) {
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
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'bits' field is set and is not null */
  public boolean isNotNullBits() {
    return genClient.cacheValueIsNotNull(CacheKey.bits);
  }

  /** Checks whether the 'readablePermissions' field is set and is not null */
  public boolean isNotNullReadablePermissions() {
    return genClient.cacheValueIsNotNull(CacheKey.readablePermissions);
  }

  /** Checks whether the 'readablePermissions' field is set and is not null and is not empty */
  public boolean isNotEmptyReadablePermissions() { return isNotNullReadablePermissions() && !getReadablePermissions().isEmpty(); }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'bits' field has been set, however the value could be null */
  public boolean hasBits() {
    return genClient.cacheHasKey(CacheKey.bits);
  }

  /** Checks whether the 'readablePermissions' field has been set, however the value could be null */
  public boolean hasReadablePermissions() {
    return genClient.cacheHasKey(CacheKey.readablePermissions);
  }


  /**
   * Sets the field 'id'.
   */
  public Permissions setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'bits'.
   */
  public Permissions setBits(java.lang.Long bits) {
    return genClient.setOther(bits, CacheKey.bits);
  }

  /**
   * Sets the field 'readablePermissions'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Permissions setReadablePermissions(java.util.List<com.clover.sdk.v3.employees.Permission> readablePermissions) {
    return genClient.setArrayOther(readablePermissions, CacheKey.readablePermissions);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'bits' field, the 'has' method for this field will now return false */
  public void clearBits() {
    genClient.clear(CacheKey.bits);
  }
  /** Clears the 'readablePermissions' field, the 'has' method for this field will now return false */
  public void clearReadablePermissions() {
    genClient.clear(CacheKey.readablePermissions);
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
  public Permissions copyChanges() {
    Permissions copy = new Permissions();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Permissions src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Permissions(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Permissions> CREATOR = new android.os.Parcelable.Creator<Permissions>() {
    @Override
    public Permissions createFromParcel(android.os.Parcel in) {
      Permissions instance = new Permissions(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Permissions[] newArray(int size) {
      return new Permissions[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Permissions> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Permissions>() {
    @Override
    public Permissions create(org.json.JSONObject jsonObject) {
      return new Permissions(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean BITS_IS_REQUIRED = false;

    public static final boolean READABLEPERMISSIONS_IS_REQUIRED = false;

  }

}
