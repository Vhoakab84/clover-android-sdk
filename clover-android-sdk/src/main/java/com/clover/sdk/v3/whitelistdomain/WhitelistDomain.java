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

package com.clover.sdk.v3.whitelistdomain;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class WhitelistDomain implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  public java.lang.String getDomain() {
    return genClient.cacheGet(CacheKey.domain);
  }

  public java.lang.String getApprovalStatus() {
    return genClient.cacheGet(CacheKey.approvalStatus);
  }

  public java.lang.Long getCreatedTime() {
    return genClient.cacheGet(CacheKey.createdTime);
  }

  public java.lang.Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }

  public java.lang.String getRejectedReason() {
    return genClient.cacheGet(CacheKey.rejectedReason);
  }

  public com.clover.sdk.v3.base.Reference getReseller() {
    return genClient.cacheGet(CacheKey.reseller);
  }

  public com.clover.sdk.v3.base.Reference getRequesterAccount() {
    return genClient.cacheGet(CacheKey.requesterAccount);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<WhitelistDomain> {
    id {
      @Override
      public Object extractValue(WhitelistDomain instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    domain {
      @Override
      public Object extractValue(WhitelistDomain instance) {
        return instance.genClient.extractOther("domain", java.lang.String.class);
      }
    },
    approvalStatus {
      @Override
      public Object extractValue(WhitelistDomain instance) {
        return instance.genClient.extractOther("approvalStatus", java.lang.String.class);
      }
    },
    createdTime {
      @Override
      public Object extractValue(WhitelistDomain instance) {
        return instance.genClient.extractOther("createdTime", java.lang.Long.class);
      }
    },
    modifiedTime {
      @Override
      public Object extractValue(WhitelistDomain instance) {
        return instance.genClient.extractOther("modifiedTime", java.lang.Long.class);
      }
    },
    rejectedReason {
      @Override
      public Object extractValue(WhitelistDomain instance) {
        return instance.genClient.extractOther("rejectedReason", java.lang.String.class);
      }
    },
    reseller {
      @Override
      public Object extractValue(WhitelistDomain instance) {
        return instance.genClient.extractRecord("reseller", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    requesterAccount {
      @Override
      public Object extractValue(WhitelistDomain instance) {
        return instance.genClient.extractRecord("requesterAccount", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<WhitelistDomain> genClient = new GenericClient<WhitelistDomain>(this);

  /**
   * Constructs a new empty instance.
   */
  public WhitelistDomain() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public WhitelistDomain(String json) throws IllegalArgumentException {
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
  public WhitelistDomain(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public WhitelistDomain(WhitelistDomain src) {
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

  /** Checks whether the 'domain' field is set and is not null */
  public boolean isNotNullDomain() {
    return genClient.cacheValueIsNotNull(CacheKey.domain);
  }

  /** Checks whether the 'approvalStatus' field is set and is not null */
  public boolean isNotNullApprovalStatus() {
    return genClient.cacheValueIsNotNull(CacheKey.approvalStatus);
  }

  /** Checks whether the 'createdTime' field is set and is not null */
  public boolean isNotNullCreatedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }

  /** Checks whether the 'rejectedReason' field is set and is not null */
  public boolean isNotNullRejectedReason() {
    return genClient.cacheValueIsNotNull(CacheKey.rejectedReason);
  }

  /** Checks whether the 'reseller' field is set and is not null */
  public boolean isNotNullReseller() {
    return genClient.cacheValueIsNotNull(CacheKey.reseller);
  }

  /** Checks whether the 'requesterAccount' field is set and is not null */
  public boolean isNotNullRequesterAccount() {
    return genClient.cacheValueIsNotNull(CacheKey.requesterAccount);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'domain' field has been set, however the value could be null */
  public boolean hasDomain() {
    return genClient.cacheHasKey(CacheKey.domain);
  }

  /** Checks whether the 'approvalStatus' field has been set, however the value could be null */
  public boolean hasApprovalStatus() {
    return genClient.cacheHasKey(CacheKey.approvalStatus);
  }

  /** Checks whether the 'createdTime' field has been set, however the value could be null */
  public boolean hasCreatedTime() {
    return genClient.cacheHasKey(CacheKey.createdTime);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }

  /** Checks whether the 'rejectedReason' field has been set, however the value could be null */
  public boolean hasRejectedReason() {
    return genClient.cacheHasKey(CacheKey.rejectedReason);
  }

  /** Checks whether the 'reseller' field has been set, however the value could be null */
  public boolean hasReseller() {
    return genClient.cacheHasKey(CacheKey.reseller);
  }

  /** Checks whether the 'requesterAccount' field has been set, however the value could be null */
  public boolean hasRequesterAccount() {
    return genClient.cacheHasKey(CacheKey.requesterAccount);
  }


  /**
   * Sets the field 'id'.
   */
  public WhitelistDomain setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'domain'.
   */
  public WhitelistDomain setDomain(java.lang.String domain) {
    return genClient.setOther(domain, CacheKey.domain);
  }

  /**
   * Sets the field 'approvalStatus'.
   */
  public WhitelistDomain setApprovalStatus(java.lang.String approvalStatus) {
    return genClient.setOther(approvalStatus, CacheKey.approvalStatus);
  }

  /**
   * Sets the field 'createdTime'.
   */
  public WhitelistDomain setCreatedTime(java.lang.Long createdTime) {
    return genClient.setOther(createdTime, CacheKey.createdTime);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public WhitelistDomain setModifiedTime(java.lang.Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }

  /**
   * Sets the field 'rejectedReason'.
   */
  public WhitelistDomain setRejectedReason(java.lang.String rejectedReason) {
    return genClient.setOther(rejectedReason, CacheKey.rejectedReason);
  }

  /**
   * Sets the field 'reseller'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public WhitelistDomain setReseller(com.clover.sdk.v3.base.Reference reseller) {
    return genClient.setRecord(reseller, CacheKey.reseller);
  }

  /**
   * Sets the field 'requesterAccount'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public WhitelistDomain setRequesterAccount(com.clover.sdk.v3.base.Reference requesterAccount) {
    return genClient.setRecord(requesterAccount, CacheKey.requesterAccount);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'domain' field, the 'has' method for this field will now return false */
  public void clearDomain() {
    genClient.clear(CacheKey.domain);
  }
  /** Clears the 'approvalStatus' field, the 'has' method for this field will now return false */
  public void clearApprovalStatus() {
    genClient.clear(CacheKey.approvalStatus);
  }
  /** Clears the 'createdTime' field, the 'has' method for this field will now return false */
  public void clearCreatedTime() {
    genClient.clear(CacheKey.createdTime);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
  }
  /** Clears the 'rejectedReason' field, the 'has' method for this field will now return false */
  public void clearRejectedReason() {
    genClient.clear(CacheKey.rejectedReason);
  }
  /** Clears the 'reseller' field, the 'has' method for this field will now return false */
  public void clearReseller() {
    genClient.clear(CacheKey.reseller);
  }
  /** Clears the 'requesterAccount' field, the 'has' method for this field will now return false */
  public void clearRequesterAccount() {
    genClient.clear(CacheKey.requesterAccount);
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
  public WhitelistDomain copyChanges() {
    WhitelistDomain copy = new WhitelistDomain();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(WhitelistDomain src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new WhitelistDomain(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<WhitelistDomain> CREATOR = new android.os.Parcelable.Creator<WhitelistDomain>() {
    @Override
    public WhitelistDomain createFromParcel(android.os.Parcel in) {
      WhitelistDomain instance = new WhitelistDomain(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public WhitelistDomain[] newArray(int size) {
      return new WhitelistDomain[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<WhitelistDomain> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<WhitelistDomain>() {
    @Override
    public WhitelistDomain create(org.json.JSONObject jsonObject) {
      return new WhitelistDomain(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean DOMAIN_IS_REQUIRED = false;

    public static final boolean APPROVALSTATUS_IS_REQUIRED = false;

    public static final boolean CREATEDTIME_IS_REQUIRED = false;

    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;

    public static final boolean REJECTEDREASON_IS_REQUIRED = false;

    public static final boolean RESELLER_IS_REQUIRED = false;

    public static final boolean REQUESTERACCOUNT_IS_REQUIRED = false;

  }

}
