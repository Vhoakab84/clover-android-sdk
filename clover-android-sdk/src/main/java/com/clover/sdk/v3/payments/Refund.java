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

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class Refund implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * The order with which the refund is associated
   */
  public com.clover.sdk.v3.base.Reference getOrderRef() {
    return genClient.cacheGet(CacheKey.orderRef);
  }

  /**
   * Device which processed the transaction for this refund
   */
  public com.clover.sdk.v3.base.Reference getDevice() {
    return genClient.cacheGet(CacheKey.device);
  }

  /**
   * Total amount refunded, including tax
   */
  public java.lang.Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }

  /**
   * Tax amount refunded
   */
  public java.lang.Long getTaxAmount() {
    return genClient.cacheGet(CacheKey.taxAmount);
  }

  /**
   * The time when the refund was recorded on the server
   */
  public java.lang.Long getCreatedTime() {
    return genClient.cacheGet(CacheKey.createdTime);
  }

  /**
   * The time when the refund was recorded on the client
   */
  public java.lang.Long getClientCreatedTime() {
    return genClient.cacheGet(CacheKey.clientCreatedTime);
  }

  /**
   * The payment with which the refund is associated
   */
  public com.clover.sdk.v3.base.Reference getPayment() {
    return genClient.cacheGet(CacheKey.payment);
  }

  public com.clover.sdk.v3.base.Reference getEmployee() {
    return genClient.cacheGet(CacheKey.employee);
  }

  public java.util.List<com.clover.sdk.v3.base.Reference> getLineItems() {
    return genClient.cacheGet(CacheKey.lineItems);
  }

  /**
   * The tender type associated with this payment, e.g. credit card, cash, etc.
   */
  public com.clover.sdk.v3.base.Tender getOverrideMerchantTender() {
    return genClient.cacheGet(CacheKey.overrideMerchantTender);
  }

  public java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> getTaxableAmountRates() {
    return genClient.cacheGet(CacheKey.taxableAmountRates);
  }

  public com.clover.sdk.v3.payments.ServiceChargeAmount getServiceChargeAmount() {
    return genClient.cacheGet(CacheKey.serviceChargeAmount);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Refund> {
    id {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    orderRef {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractRecord("orderRef", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    device {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractRecord("device", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    amount {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractOther("amount", java.lang.Long.class);
      }
    },
    taxAmount {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractOther("taxAmount", java.lang.Long.class);
      }
    },
    createdTime {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractOther("createdTime", java.lang.Long.class);
      }
    },
    clientCreatedTime {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractOther("clientCreatedTime", java.lang.Long.class);
      }
    },
    payment {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractRecord("payment", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    employee {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractRecord("employee", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    lineItems {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractListRecord("lineItems", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    overrideMerchantTender {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractRecord("overrideMerchantTender", com.clover.sdk.v3.base.Tender.JSON_CREATOR);
      }
    },
    taxableAmountRates {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractListRecord("taxableAmountRates", com.clover.sdk.v3.payments.TaxableAmountRate.JSON_CREATOR);
      }
    },
    serviceChargeAmount {
      @Override
      public Object extractValue(Refund instance) {
        return instance.genClient.extractRecord("serviceChargeAmount", com.clover.sdk.v3.payments.ServiceChargeAmount.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<Refund> genClient = new GenericClient<Refund>(this);

  /**
   * Constructs a new empty instance.
   */
  public Refund() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Refund(String json) throws IllegalArgumentException {
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
  public Refund(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Refund(Refund src) {
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

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'orderRef' field is set and is not null */
  public boolean isNotNullOrderRef() {
    return genClient.cacheValueIsNotNull(CacheKey.orderRef);
  }

  /** Checks whether the 'device' field is set and is not null */
  public boolean isNotNullDevice() {
    return genClient.cacheValueIsNotNull(CacheKey.device);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'taxAmount' field is set and is not null */
  public boolean isNotNullTaxAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.taxAmount);
  }

  /** Checks whether the 'createdTime' field is set and is not null */
  public boolean isNotNullCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.createdTime);
  }

  /** Checks whether the 'clientCreatedTime' field is set and is not null */
  public boolean isNotNullClientCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.clientCreatedTime);
  }

  /** Checks whether the 'payment' field is set and is not null */
  public boolean isNotNullPayment() {
    return genClient.cacheValueIsNotNull(CacheKey.payment);
  }

  /** Checks whether the 'employee' field is set and is not null */
  public boolean isNotNullEmployee() {
    return genClient.cacheValueIsNotNull(CacheKey.employee);
  }

  /** Checks whether the 'lineItems' field is set and is not null */
  public boolean isNotNullLineItems() {
    return genClient.cacheValueIsNotNull(CacheKey.lineItems);
  }

  /** Checks whether the 'lineItems' field is set and is not null and is not empty */
  public boolean isNotEmptyLineItems() { return isNotNullLineItems() && !getLineItems().isEmpty(); }

  /** Checks whether the 'overrideMerchantTender' field is set and is not null */
  public boolean isNotNullOverrideMerchantTender() {
    return genClient.cacheValueIsNotNull(CacheKey.overrideMerchantTender);
  }

  /** Checks whether the 'taxableAmountRates' field is set and is not null */
  public boolean isNotNullTaxableAmountRates() {
    return genClient.cacheValueIsNotNull(CacheKey.taxableAmountRates);
  }

  /** Checks whether the 'taxableAmountRates' field is set and is not null and is not empty */
  public boolean isNotEmptyTaxableAmountRates() { return isNotNullTaxableAmountRates() && !getTaxableAmountRates().isEmpty(); }

  /** Checks whether the 'serviceChargeAmount' field is set and is not null */
  public boolean isNotNullServiceChargeAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.serviceChargeAmount);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'orderRef' field has been set, however the value could be null */
  public boolean hasOrderRef() {
    return genClient.cacheHasKey(CacheKey.orderRef);
  }

  /** Checks whether the 'device' field has been set, however the value could be null */
  public boolean hasDevice() {
    return genClient.cacheHasKey(CacheKey.device);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'taxAmount' field has been set, however the value could be null */
  public boolean hasTaxAmount() {
    return genClient.cacheHasKey(CacheKey.taxAmount);
  }

  /** Checks whether the 'createdTime' field has been set, however the value could be null */
  public boolean hasCreatedTime() {
    return genClient.cacheHasKey(CacheKey.createdTime);
  }

  /** Checks whether the 'clientCreatedTime' field has been set, however the value could be null */
  public boolean hasClientCreatedTime() {
    return genClient.cacheHasKey(CacheKey.clientCreatedTime);
  }

  /** Checks whether the 'payment' field has been set, however the value could be null */
  public boolean hasPayment() {
    return genClient.cacheHasKey(CacheKey.payment);
  }

  /** Checks whether the 'employee' field has been set, however the value could be null */
  public boolean hasEmployee() {
    return genClient.cacheHasKey(CacheKey.employee);
  }

  /** Checks whether the 'lineItems' field has been set, however the value could be null */
  public boolean hasLineItems() {
    return genClient.cacheHasKey(CacheKey.lineItems);
  }

  /** Checks whether the 'overrideMerchantTender' field has been set, however the value could be null */
  public boolean hasOverrideMerchantTender() {
    return genClient.cacheHasKey(CacheKey.overrideMerchantTender);
  }

  /** Checks whether the 'taxableAmountRates' field has been set, however the value could be null */
  public boolean hasTaxableAmountRates() {
    return genClient.cacheHasKey(CacheKey.taxableAmountRates);
  }

  /** Checks whether the 'serviceChargeAmount' field has been set, however the value could be null */
  public boolean hasServiceChargeAmount() {
    return genClient.cacheHasKey(CacheKey.serviceChargeAmount);
  }


  /**
   * Sets the field 'id'.
   */
  public Refund setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'orderRef'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Refund setOrderRef(com.clover.sdk.v3.base.Reference orderRef) {
    return genClient.setRecord(orderRef, CacheKey.orderRef);
  }

  /**
   * Sets the field 'device'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Refund setDevice(com.clover.sdk.v3.base.Reference device) {
    return genClient.setRecord(device, CacheKey.device);
  }

  /**
   * Sets the field 'amount'.
   */
  public Refund setAmount(java.lang.Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'taxAmount'.
   */
  public Refund setTaxAmount(java.lang.Long taxAmount) {
    return genClient.setOther(taxAmount, CacheKey.taxAmount);
  }

  /**
   * Sets the field 'createdTime'.
   */
  public Refund setCreatedTime(java.lang.Long createdTime) {
    return genClient.setOther(createdTime, CacheKey.createdTime);
  }

  /**
   * Sets the field 'clientCreatedTime'.
   */
  public Refund setClientCreatedTime(java.lang.Long clientCreatedTime) {
    return genClient.setOther(clientCreatedTime, CacheKey.clientCreatedTime);
  }

  /**
   * Sets the field 'payment'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Refund setPayment(com.clover.sdk.v3.base.Reference payment) {
    return genClient.setRecord(payment, CacheKey.payment);
  }

  /**
   * Sets the field 'employee'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Refund setEmployee(com.clover.sdk.v3.base.Reference employee) {
    return genClient.setRecord(employee, CacheKey.employee);
  }

  /**
   * Sets the field 'lineItems'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Refund setLineItems(java.util.List<com.clover.sdk.v3.base.Reference> lineItems) {
    return genClient.setArrayRecord(lineItems, CacheKey.lineItems);
  }

  /**
   * Sets the field 'overrideMerchantTender'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Refund setOverrideMerchantTender(com.clover.sdk.v3.base.Tender overrideMerchantTender) {
    return genClient.setRecord(overrideMerchantTender, CacheKey.overrideMerchantTender);
  }

  /**
   * Sets the field 'taxableAmountRates'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Refund setTaxableAmountRates(java.util.List<com.clover.sdk.v3.payments.TaxableAmountRate> taxableAmountRates) {
    return genClient.setArrayRecord(taxableAmountRates, CacheKey.taxableAmountRates);
  }

  /**
   * Sets the field 'serviceChargeAmount'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Refund setServiceChargeAmount(com.clover.sdk.v3.payments.ServiceChargeAmount serviceChargeAmount) {
    return genClient.setRecord(serviceChargeAmount, CacheKey.serviceChargeAmount);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'orderRef' field, the 'has' method for this field will now return false */
  public void clearOrderRef() {
    genClient.clear(CacheKey.orderRef);
  }
  /** Clears the 'device' field, the 'has' method for this field will now return false */
  public void clearDevice() {
    genClient.clear(CacheKey.device);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'taxAmount' field, the 'has' method for this field will now return false */
  public void clearTaxAmount() {
    genClient.clear(CacheKey.taxAmount);
  }
  /** Clears the 'createdTime' field, the 'has' method for this field will now return false */
  public void clearCreatedTime() {
    genClient.clear(CacheKey.createdTime);
  }
  /** Clears the 'clientCreatedTime' field, the 'has' method for this field will now return false */
  public void clearClientCreatedTime() {
    genClient.clear(CacheKey.clientCreatedTime);
  }
  /** Clears the 'payment' field, the 'has' method for this field will now return false */
  public void clearPayment() {
    genClient.clear(CacheKey.payment);
  }
  /** Clears the 'employee' field, the 'has' method for this field will now return false */
  public void clearEmployee() {
    genClient.clear(CacheKey.employee);
  }
  /** Clears the 'lineItems' field, the 'has' method for this field will now return false */
  public void clearLineItems() {
    genClient.clear(CacheKey.lineItems);
  }
  /** Clears the 'overrideMerchantTender' field, the 'has' method for this field will now return false */
  public void clearOverrideMerchantTender() {
    genClient.clear(CacheKey.overrideMerchantTender);
  }
  /** Clears the 'taxableAmountRates' field, the 'has' method for this field will now return false */
  public void clearTaxableAmountRates() {
    genClient.clear(CacheKey.taxableAmountRates);
  }
  /** Clears the 'serviceChargeAmount' field, the 'has' method for this field will now return false */
  public void clearServiceChargeAmount() {
    genClient.clear(CacheKey.serviceChargeAmount);
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
  public Refund copyChanges() {
    Refund copy = new Refund();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Refund src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Refund(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Refund> CREATOR = new android.os.Parcelable.Creator<Refund>() {
    @Override
    public Refund createFromParcel(android.os.Parcel in) {
      Refund instance = new Refund(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Refund[] newArray(int size) {
      return new Refund[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Refund> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Refund>() {
    @Override
    public Refund create(org.json.JSONObject jsonObject) {
      return new Refund(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;

    public static final boolean ORDERREF_IS_REQUIRED = false;

    public static final boolean DEVICE_IS_REQUIRED = false;

    public static final boolean AMOUNT_IS_REQUIRED = false;

    public static final boolean TAXAMOUNT_IS_REQUIRED = false;

    public static final boolean CREATEDTIME_IS_REQUIRED = false;

    public static final boolean CLIENTCREATEDTIME_IS_REQUIRED = false;

    public static final boolean PAYMENT_IS_REQUIRED = false;

    public static final boolean EMPLOYEE_IS_REQUIRED = false;

    public static final boolean LINEITEMS_IS_REQUIRED = false;

    public static final boolean OVERRIDEMERCHANTTENDER_IS_REQUIRED = false;

    public static final boolean TAXABLEAMOUNTRATES_IS_REQUIRED = false;

    public static final boolean SERVICECHARGEAMOUNT_IS_REQUIRED = false;

  }

}
