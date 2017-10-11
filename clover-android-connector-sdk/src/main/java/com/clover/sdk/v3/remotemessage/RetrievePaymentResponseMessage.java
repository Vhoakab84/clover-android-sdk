/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
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

package com.clover.sdk.v3.remotemessage;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getReason reason}</li>
 * <li>{@link #getExternalPaymentId externalPaymentId}</li>
 * <li>{@link #getQueryStatus queryStatus}</li>
 * <li>{@link #getPayment payment}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class RetrievePaymentResponseMessage extends com.clover.sdk.v3.remotemessage.Message {

  /**
   * May be populated when the operation fails.
   */
  public java.lang.String getReason() {
    return genClient.cacheGet(CacheKey.reason);
  }

  /**
   * The externalPaymentId used when a payment was created
   */
  public java.lang.String getExternalPaymentId() {
    return genClient.cacheGet(CacheKey.externalPaymentId);
  }

  /**
   * The status of the query
   */
  public com.clover.sdk.v3.remotemessage.QueryStatus getQueryStatus() {
    return genClient.cacheGet(CacheKey.queryStatus);
  }

  /**
   * Payment information
   */
  public com.clover.sdk.v3.payments.Payment getPayment() {
    return genClient.cacheGet(CacheKey.payment);
  }

  /**
   * The list of message types
   */
  @Override
  public com.clover.sdk.v3.remotemessage.Method getMethod() {
    return genClient.cacheGet(CacheKey.method);
  }

  /**
   * The version of this message
   */
  @Override
  public java.lang.Integer getVersion() {
    return genClient.cacheGet(CacheKey.version);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<RetrievePaymentResponseMessage> {
    reason {
      @Override
      public Object extractValue(RetrievePaymentResponseMessage instance) {
        return instance.genClient.extractOther("reason", java.lang.String.class);
      }
    },
    externalPaymentId {
      @Override
      public Object extractValue(RetrievePaymentResponseMessage instance) {
        return instance.genClient.extractOther("externalPaymentId", java.lang.String.class);
      }
    },
    queryStatus {
      @Override
      public Object extractValue(RetrievePaymentResponseMessage instance) {
        return instance.genClient.extractEnum("queryStatus", com.clover.sdk.v3.remotemessage.QueryStatus.class);
      }
    },
    payment {
      @Override
      public Object extractValue(RetrievePaymentResponseMessage instance) {
        return instance.genClient.extractRecord("payment", com.clover.sdk.v3.payments.Payment.JSON_CREATOR);
      }
    },
    method {
      @Override
      public Object extractValue(RetrievePaymentResponseMessage instance) {
        return instance.genClient.extractEnum("method", com.clover.sdk.v3.remotemessage.Method.class);
      }
    },
    version {
      @Override
      public Object extractValue(RetrievePaymentResponseMessage instance) {
        return instance.genClient.extractOther("version", java.lang.Integer.class);
      }
    },
      ;
  }

  private GenericClient<RetrievePaymentResponseMessage> genClient;

  /**
  * Constructs a new empty instance.
  */
  public RetrievePaymentResponseMessage() {
    super(false);
    genClient = new GenericClient<RetrievePaymentResponseMessage>(this);
    this.setMethod(com.clover.sdk.v3.remotemessage.Method.RETRIEVE_PAYMENT_RESPONSE);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected RetrievePaymentResponseMessage(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public RetrievePaymentResponseMessage(String json) throws IllegalArgumentException {
    this();
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
  public RetrievePaymentResponseMessage(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public RetrievePaymentResponseMessage(RetrievePaymentResponseMessage src) {
    this();
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
  }

  /** Checks whether the 'reason' field is set and is not null */
  public boolean isNotNullReason() {
    return genClient.cacheValueIsNotNull(CacheKey.reason);
  }

  /** Checks whether the 'externalPaymentId' field is set and is not null */
  public boolean isNotNullExternalPaymentId() {
    return genClient.cacheValueIsNotNull(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'queryStatus' field is set and is not null */
  public boolean isNotNullQueryStatus() {
    return genClient.cacheValueIsNotNull(CacheKey.queryStatus);
  }

  /** Checks whether the 'payment' field is set and is not null */
  public boolean isNotNullPayment() {
    return genClient.cacheValueIsNotNull(CacheKey.payment);
  }

  /** Checks whether the 'method' field is set and is not null */
  @Override
  public boolean isNotNullMethod() {
    return genClient.cacheValueIsNotNull(CacheKey.method);
  }

  /** Checks whether the 'version' field is set and is not null */
  @Override
  public boolean isNotNullVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.version);
  }



  /** Checks whether the 'reason' field has been set, however the value could be null */
  public boolean hasReason() {
    return genClient.cacheHasKey(CacheKey.reason);
  }

  /** Checks whether the 'externalPaymentId' field has been set, however the value could be null */
  public boolean hasExternalPaymentId() {
    return genClient.cacheHasKey(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'queryStatus' field has been set, however the value could be null */
  public boolean hasQueryStatus() {
    return genClient.cacheHasKey(CacheKey.queryStatus);
  }

  /** Checks whether the 'payment' field has been set, however the value could be null */
  public boolean hasPayment() {
    return genClient.cacheHasKey(CacheKey.payment);
  }

  /** Checks whether the 'method' field has been set, however the value could be null */
  @Override
  public boolean hasMethod() {
    return genClient.cacheHasKey(CacheKey.method);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  @Override
  public boolean hasVersion() {
    return genClient.cacheHasKey(CacheKey.version);
  }


  /**
   * Sets the field 'reason'.
   */
  public RetrievePaymentResponseMessage setReason(java.lang.String reason) {
    return genClient.setOther(reason, CacheKey.reason);
  }

  /**
   * Sets the field 'externalPaymentId'.
   */
  public RetrievePaymentResponseMessage setExternalPaymentId(java.lang.String externalPaymentId) {
    return genClient.setOther(externalPaymentId, CacheKey.externalPaymentId);
  }

  /**
   * Sets the field 'queryStatus'.
   */
  public RetrievePaymentResponseMessage setQueryStatus(com.clover.sdk.v3.remotemessage.QueryStatus queryStatus) {
    return genClient.setOther(queryStatus, CacheKey.queryStatus);
  }

  /**
   * Sets the field 'payment'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public RetrievePaymentResponseMessage setPayment(com.clover.sdk.v3.payments.Payment payment) {
    return genClient.setRecord(payment, CacheKey.payment);
  }

  /**
   * Sets the field 'method'.
   */
  @Override
  public Message setMethod(com.clover.sdk.v3.remotemessage.Method method) {
    return genClient.setOther(method, CacheKey.method);
  }

  /**
   * Sets the field 'version'.
   */
  @Override
  public Message setVersion(java.lang.Integer version) {
    return genClient.setOther(version, CacheKey.version);
  }


  /** Clears the 'reason' field, the 'has' method for this field will now return false */
  public void clearReason() {
    genClient.clear(CacheKey.reason);
  }
  /** Clears the 'externalPaymentId' field, the 'has' method for this field will now return false */
  public void clearExternalPaymentId() {
    genClient.clear(CacheKey.externalPaymentId);
  }
  /** Clears the 'queryStatus' field, the 'has' method for this field will now return false */
  public void clearQueryStatus() {
    genClient.clear(CacheKey.queryStatus);
  }
  /** Clears the 'payment' field, the 'has' method for this field will now return false */
  public void clearPayment() {
    genClient.clear(CacheKey.payment);
  }
  /** Clears the 'method' field, the 'has' method for this field will now return false */
  @Override
  public void clearMethod() {
    genClient.clear(CacheKey.method);
  }
  /** Clears the 'version' field, the 'has' method for this field will now return false */
  @Override
  public void clearVersion() {
    genClient.clear(CacheKey.version);
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
  public RetrievePaymentResponseMessage copyChanges() {
    RetrievePaymentResponseMessage copy = new RetrievePaymentResponseMessage();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(RetrievePaymentResponseMessage src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new RetrievePaymentResponseMessage(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<RetrievePaymentResponseMessage> CREATOR = new android.os.Parcelable.Creator<RetrievePaymentResponseMessage>() {
    @Override
    public RetrievePaymentResponseMessage createFromParcel(android.os.Parcel in) {
      RetrievePaymentResponseMessage instance = new RetrievePaymentResponseMessage(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public RetrievePaymentResponseMessage[] newArray(int size) {
      return new RetrievePaymentResponseMessage[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<RetrievePaymentResponseMessage> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<RetrievePaymentResponseMessage>() {
    @Override
    public RetrievePaymentResponseMessage create(org.json.JSONObject jsonObject) {
      return new RetrievePaymentResponseMessage(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean REASON_IS_REQUIRED = false;
    public static final boolean EXTERNALPAYMENTID_IS_REQUIRED = false;
    public static final boolean QUERYSTATUS_IS_REQUIRED = false;
    public static final boolean PAYMENT_IS_REQUIRED = false;
    public static final boolean METHOD_IS_REQUIRED = false;
    public static final boolean VERSION_IS_REQUIRED = false;

  }

}
