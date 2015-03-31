/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2015 Clover Network, Inc.
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

package com.clover.sdk.v3.payments;

@SuppressWarnings("all")
public final class BatchCardTotal implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.payments.CardType getCardType() {
    return cacheGet(CacheKey.cardType);
  }
 /**
   * Total count of types
  */
  public java.lang.Long getCount() {
    return cacheGet(CacheKey.count);
  }
 /**
   * Total amount for type
  */
  public java.lang.Long getTotal() {
    return cacheGet(CacheKey.total);
  }


  private enum CacheKey {
    cardType {
      @Override
      public Object extractValue(BatchCardTotal instance) {
        return instance.extractCardType();
      }
    },
    count {
      @Override
      public Object extractValue(BatchCardTotal instance) {
        return instance.extractCount();
      }
    },
    total {
      @Override
      public Object extractValue(BatchCardTotal instance) {
        return instance.extractTotal();
      }
    },
    ;

    public abstract Object extractValue(BatchCardTotal instance);
  }

  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public BatchCardTotal() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public BatchCardTotal(String json) throws java.lang.IllegalArgumentException {
    try {
      this.jsonObject = new org.json.JSONObject(json);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public BatchCardTotal(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public BatchCardTotal(BatchCardTotal src) {
    if (src.jsonObject != null) {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    if (jsonObject == null) {
      jsonObject = new org.json.JSONObject();
    }
    return jsonObject;
  }


  @Override
  public void validate() {
  }



  private com.clover.sdk.v3.payments.CardType extractCardType() {
    if (!getJSONObject().isNull("cardType")) {
      try {
        return com.clover.sdk.v3.payments.CardType.valueOf(getJSONObject().optString("cardType"));
      } catch(Exception e) {
        e.printStackTrace();
      }
    }

    return null;
  }


  private java.lang.Long extractCount() {
    return getJSONObject().isNull("count") ? null :
      getJSONObject().optLong("count");
  }


  private java.lang.Long extractTotal() {
    return getJSONObject().isNull("total") ? null :
      getJSONObject().optLong("total");
  }


  /** Checks whether the 'cardType' field is set and is not null */
  public boolean isNotNullCardType() {
    return cacheValueIsNotNull(CacheKey.cardType);
  }

  /** Checks whether the 'count' field is set and is not null */
  public boolean isNotNullCount() {
    return cacheValueIsNotNull(CacheKey.count);
  }

  /** Checks whether the 'total' field is set and is not null */
  public boolean isNotNullTotal() {
    return cacheValueIsNotNull(CacheKey.total);
  }


  /** Checks whether the 'cardType' field has been set, however the value could be null */
  public boolean hasCardType() {
    return cacheHasKey(CacheKey.cardType);
  }

  /** Checks whether the 'count' field has been set, however the value could be null */
  public boolean hasCount() {
    return cacheHasKey(CacheKey.count);
  }

  /** Checks whether the 'total' field has been set, however the value could be null */
  public boolean hasTotal() {
    return cacheHasKey(CacheKey.total);
  }


  /**
   * Sets the field 'cardType'.
   */
  public BatchCardTotal setCardType(com.clover.sdk.v3.payments.CardType cardType) {
    logChange("cardType");

    try {
      getJSONObject().put("cardType", cardType == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(cardType));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.cardType);
    return this;
  }

  /**
   * Sets the field 'count'.
   */
  public BatchCardTotal setCount(java.lang.Long count) {
    logChange("count");

    try {
      getJSONObject().put("count", count == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(count));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.count);
    return this;
  }

  /**
   * Sets the field 'total'.
   */
  public BatchCardTotal setTotal(java.lang.Long total) {
    logChange("total");

    try {
      getJSONObject().put("total", total == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(total));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.total);
    return this;
  }


  /** Clears the 'cardType' field, the 'has' method for this field will now return false */
  public void clearCardType() {
    unlogChange("cardType");
    getJSONObject().remove("cardType");
    cacheRemoveValue(CacheKey.cardType);
  }

  /** Clears the 'count' field, the 'has' method for this field will now return false */
  public void clearCount() {
    unlogChange("count");
    getJSONObject().remove("count");
    cacheRemoveValue(CacheKey.count);
  }

  /** Clears the 'total' field, the 'has' method for this field will now return false */
  public void clearTotal() {
    unlogChange("total");
    getJSONObject().remove("total");
    cacheRemoveValue(CacheKey.total);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public BatchCardTotal copyChanges() {
    BatchCardTotal copy = new BatchCardTotal();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(BatchCardTotal src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new BatchCardTotal(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "BatchCardTotal{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<BatchCardTotal> CREATOR = new android.os.Parcelable.Creator<BatchCardTotal>() {
    @Override
    public BatchCardTotal createFromParcel(android.os.Parcel in) {
      BatchCardTotal instance = new BatchCardTotal(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public BatchCardTotal[] newArray(int size) {
      return new BatchCardTotal[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<BatchCardTotal> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<BatchCardTotal>() {
    @Override
    public BatchCardTotal create(org.json.JSONObject jsonObject) {
      return new BatchCardTotal(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean CARDTYPE_IS_REQUIRED = false;

    public static final boolean COUNT_IS_REQUIRED = false;

    public static final boolean TOTAL_IS_REQUIRED = false;

  }

}