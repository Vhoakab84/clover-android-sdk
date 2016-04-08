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

package com.clover.sdk.v3.order;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
/** Snapshot of a line item modifier at the time that the order was placed. */
public final class Modification implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  public java.lang.String getAlternateName() {
    return genClient.cacheGet(CacheKey.alternateName);
  }

  public java.lang.Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }

  /**
   * The modifier object.  Values from the Modifier are copied to the Modification at the time that the order is placed.  Modifier values may change after the order is placed.
   */
  public com.clover.sdk.v3.inventory.Modifier getModifier() {
    return genClient.cacheGet(CacheKey.modifier);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Modification> {
    id {
      @Override
      public Object extractValue(Modification instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(Modification instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    alternateName {
      @Override
      public Object extractValue(Modification instance) {
        return instance.genClient.extractOther("alternateName", java.lang.String.class);
      }
    },
    amount {
      @Override
      public Object extractValue(Modification instance) {
        return instance.genClient.extractOther("amount", java.lang.Long.class);
      }
    },
    modifier {
      @Override
      public Object extractValue(Modification instance) {
        return instance.genClient.extractRecord("modifier", com.clover.sdk.v3.inventory.Modifier.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<Modification> genClient = new GenericClient<Modification>(this);

  /**
   * Constructs a new empty instance.
   */
  public Modification() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Modification(String json) throws IllegalArgumentException {
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
  public Modification(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Modification(Modification src) {
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

    genClient.validateLength(getName(), 255);

    genClient.validateLength(getAlternateName(), 255);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'alternateName' field is set and is not null */
  public boolean isNotNullAlternateName() {
    return genClient.cacheValueIsNotNull(CacheKey.alternateName);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'modifier' field is set and is not null */
  public boolean isNotNullModifier() {
    return genClient.cacheValueIsNotNull(CacheKey.modifier);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'alternateName' field has been set, however the value could be null */
  public boolean hasAlternateName() {
    return genClient.cacheHasKey(CacheKey.alternateName);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'modifier' field has been set, however the value could be null */
  public boolean hasModifier() {
    return genClient.cacheHasKey(CacheKey.modifier);
  }


  /**
   * Sets the field 'id'.
   */
  public Modification setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public Modification setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'alternateName'.
   */
  public Modification setAlternateName(java.lang.String alternateName) {
    return genClient.setOther(alternateName, CacheKey.alternateName);
  }

  /**
   * Sets the field 'amount'.
   */
  public Modification setAmount(java.lang.Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'modifier'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Modification setModifier(com.clover.sdk.v3.inventory.Modifier modifier) {
    return genClient.setRecord(modifier, CacheKey.modifier);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'alternateName' field, the 'has' method for this field will now return false */
  public void clearAlternateName() {
    genClient.clear(CacheKey.alternateName);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'modifier' field, the 'has' method for this field will now return false */
  public void clearModifier() {
    genClient.clear(CacheKey.modifier);
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
  public Modification copyChanges() {
    Modification copy = new Modification();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Modification src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Modification(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Modification> CREATOR = new android.os.Parcelable.Creator<Modification>() {
    @Override
    public Modification createFromParcel(android.os.Parcel in) {
      Modification instance = new Modification(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Modification[] newArray(int size) {
      return new Modification[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Modification> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Modification>() {
    @Override
    public Modification create(org.json.JSONObject jsonObject) {
      return new Modification(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = false;
    public static final long NAME_MAX_LEN = 255;

    public static final boolean ALTERNATENAME_IS_REQUIRED = false;
    public static final long ALTERNATENAME_MAX_LEN = 255;

    public static final boolean AMOUNT_IS_REQUIRED = false;

    public static final boolean MODIFIER_IS_REQUIRED = false;

  }

}
