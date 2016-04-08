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

package com.clover.sdk.v3.customers;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class Card implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  public java.lang.String getFirst6() {
    return genClient.cacheGet(CacheKey.first6);
  }

  public java.lang.String getLast4() {
    return genClient.cacheGet(CacheKey.last4);
  }

  public java.lang.String getFirstName() {
    return genClient.cacheGet(CacheKey.firstName);
  }

  public java.lang.String getLastName() {
    return genClient.cacheGet(CacheKey.lastName);
  }

  public java.lang.String getExpirationDate() {
    return genClient.cacheGet(CacheKey.expirationDate);
  }

  public java.lang.String getCardType() {
    return genClient.cacheGet(CacheKey.cardType);
  }

  public java.lang.String getToken() {
    return genClient.cacheGet(CacheKey.token);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Card> {
    id {
      @Override
      public Object extractValue(Card instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    first6 {
      @Override
      public Object extractValue(Card instance) {
        return instance.genClient.extractOther("first6", java.lang.String.class);
      }
    },
    last4 {
      @Override
      public Object extractValue(Card instance) {
        return instance.genClient.extractOther("last4", java.lang.String.class);
      }
    },
    firstName {
      @Override
      public Object extractValue(Card instance) {
        return instance.genClient.extractOther("firstName", java.lang.String.class);
      }
    },
    lastName {
      @Override
      public Object extractValue(Card instance) {
        return instance.genClient.extractOther("lastName", java.lang.String.class);
      }
    },
    expirationDate {
      @Override
      public Object extractValue(Card instance) {
        return instance.genClient.extractOther("expirationDate", java.lang.String.class);
      }
    },
    cardType {
      @Override
      public Object extractValue(Card instance) {
        return instance.genClient.extractOther("cardType", java.lang.String.class);
      }
    },
    token {
      @Override
      public Object extractValue(Card instance) {
        return instance.genClient.extractOther("token", java.lang.String.class);
      }
    },
    ;
  }

  private GenericClient<Card> genClient = new GenericClient<Card>(this);

  /**
   * Constructs a new empty instance.
   */
  public Card() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Card(String json) throws IllegalArgumentException {
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
  public Card(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Card(Card src) {
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

    genClient.validateNull(getFirst6(), "first6");
    genClient.validateLength(getFirst6(), 6);

    genClient.validateNull(getLast4(), "last4");
    genClient.validateLength(getLast4(), 4);

    genClient.validateLength(getFirstName(), 64);

    genClient.validateLength(getLastName(), 64);

    genClient.validateLength(getExpirationDate(), 4);

    genClient.validateLength(getToken(), 72);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'first6' field is set and is not null */
  public boolean isNotNullFirst6() {
    return genClient.cacheValueIsNotNull(CacheKey.first6);
  }

  /** Checks whether the 'last4' field is set and is not null */
  public boolean isNotNullLast4() {
    return genClient.cacheValueIsNotNull(CacheKey.last4);
  }

  /** Checks whether the 'firstName' field is set and is not null */
  public boolean isNotNullFirstName() {
    return genClient.cacheValueIsNotNull(CacheKey.firstName);
  }

  /** Checks whether the 'lastName' field is set and is not null */
  public boolean isNotNullLastName() {
    return genClient.cacheValueIsNotNull(CacheKey.lastName);
  }

  /** Checks whether the 'expirationDate' field is set and is not null */
  public boolean isNotNullExpirationDate() {
    return genClient.cacheValueIsNotNull(CacheKey.expirationDate);
  }

  /** Checks whether the 'cardType' field is set and is not null */
  public boolean isNotNullCardType() {
    return genClient.cacheValueIsNotNull(CacheKey.cardType);
  }

  /** Checks whether the 'token' field is set and is not null */
  public boolean isNotNullToken() {
    return genClient.cacheValueIsNotNull(CacheKey.token);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'first6' field has been set, however the value could be null */
  public boolean hasFirst6() {
    return genClient.cacheHasKey(CacheKey.first6);
  }

  /** Checks whether the 'last4' field has been set, however the value could be null */
  public boolean hasLast4() {
    return genClient.cacheHasKey(CacheKey.last4);
  }

  /** Checks whether the 'firstName' field has been set, however the value could be null */
  public boolean hasFirstName() {
    return genClient.cacheHasKey(CacheKey.firstName);
  }

  /** Checks whether the 'lastName' field has been set, however the value could be null */
  public boolean hasLastName() {
    return genClient.cacheHasKey(CacheKey.lastName);
  }

  /** Checks whether the 'expirationDate' field has been set, however the value could be null */
  public boolean hasExpirationDate() {
    return genClient.cacheHasKey(CacheKey.expirationDate);
  }

  /** Checks whether the 'cardType' field has been set, however the value could be null */
  public boolean hasCardType() {
    return genClient.cacheHasKey(CacheKey.cardType);
  }

  /** Checks whether the 'token' field has been set, however the value could be null */
  public boolean hasToken() {
    return genClient.cacheHasKey(CacheKey.token);
  }


  /**
   * Sets the field 'id'.
   */
  public Card setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'first6'.
   */
  public Card setFirst6(java.lang.String first6) {
    return genClient.setOther(first6, CacheKey.first6);
  }

  /**
   * Sets the field 'last4'.
   */
  public Card setLast4(java.lang.String last4) {
    return genClient.setOther(last4, CacheKey.last4);
  }

  /**
   * Sets the field 'firstName'.
   */
  public Card setFirstName(java.lang.String firstName) {
    return genClient.setOther(firstName, CacheKey.firstName);
  }

  /**
   * Sets the field 'lastName'.
   */
  public Card setLastName(java.lang.String lastName) {
    return genClient.setOther(lastName, CacheKey.lastName);
  }

  /**
   * Sets the field 'expirationDate'.
   */
  public Card setExpirationDate(java.lang.String expirationDate) {
    return genClient.setOther(expirationDate, CacheKey.expirationDate);
  }

  /**
   * Sets the field 'cardType'.
   */
  public Card setCardType(java.lang.String cardType) {
    return genClient.setOther(cardType, CacheKey.cardType);
  }

  /**
   * Sets the field 'token'.
   */
  public Card setToken(java.lang.String token) {
    return genClient.setOther(token, CacheKey.token);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'first6' field, the 'has' method for this field will now return false */
  public void clearFirst6() {
    genClient.clear(CacheKey.first6);
  }
  /** Clears the 'last4' field, the 'has' method for this field will now return false */
  public void clearLast4() {
    genClient.clear(CacheKey.last4);
  }
  /** Clears the 'firstName' field, the 'has' method for this field will now return false */
  public void clearFirstName() {
    genClient.clear(CacheKey.firstName);
  }
  /** Clears the 'lastName' field, the 'has' method for this field will now return false */
  public void clearLastName() {
    genClient.clear(CacheKey.lastName);
  }
  /** Clears the 'expirationDate' field, the 'has' method for this field will now return false */
  public void clearExpirationDate() {
    genClient.clear(CacheKey.expirationDate);
  }
  /** Clears the 'cardType' field, the 'has' method for this field will now return false */
  public void clearCardType() {
    genClient.clear(CacheKey.cardType);
  }
  /** Clears the 'token' field, the 'has' method for this field will now return false */
  public void clearToken() {
    genClient.clear(CacheKey.token);
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
  public Card copyChanges() {
    Card copy = new Card();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Card src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Card(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Card> CREATOR = new android.os.Parcelable.Creator<Card>() {
    @Override
    public Card createFromParcel(android.os.Parcel in) {
      Card instance = new Card(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Card[] newArray(int size) {
      return new Card[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Card> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Card>() {
    @Override
    public Card create(org.json.JSONObject jsonObject) {
      return new Card(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;

    public static final boolean FIRST6_IS_REQUIRED = true;
    public static final long FIRST6_MAX_LEN = 6;

    public static final boolean LAST4_IS_REQUIRED = true;
    public static final long LAST4_MAX_LEN = 4;

    public static final boolean FIRSTNAME_IS_REQUIRED = false;
    public static final long FIRSTNAME_MAX_LEN = 64;

    public static final boolean LASTNAME_IS_REQUIRED = false;
    public static final long LASTNAME_MAX_LEN = 64;

    public static final boolean EXPIRATIONDATE_IS_REQUIRED = false;
    public static final long EXPIRATIONDATE_MAX_LEN = 4;

    public static final boolean CARDTYPE_IS_REQUIRED = false;

    public static final boolean TOKEN_IS_REQUIRED = false;
    public static final long TOKEN_MAX_LEN = 72;

  }

}
