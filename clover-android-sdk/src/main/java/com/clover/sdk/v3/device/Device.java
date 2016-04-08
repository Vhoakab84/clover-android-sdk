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

package com.clover.sdk.v3.device;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class Device implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Name of the device (if entered)
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  public java.lang.String getModel() {
    return genClient.cacheGet(CacheKey.model);
  }

  public java.lang.String getOrderPrefix() {
    return genClient.cacheGet(CacheKey.orderPrefix);
  }

  public java.lang.Integer getTerminalPrefix() {
    return genClient.cacheGet(CacheKey.terminalPrefix);
  }

  public java.lang.String getSerial() {
    return genClient.cacheGet(CacheKey.serial);
  }

  public java.lang.Long getBuildNumber() {
    return genClient.cacheGet(CacheKey.buildNumber);
  }

  public java.lang.String getSecureId() {
    return genClient.cacheGet(CacheKey.secureId);
  }

  public com.clover.sdk.v3.device.BuildType getBuildType() {
    return genClient.cacheGet(CacheKey.buildType);
  }

  public java.lang.String getCpuId() {
    return genClient.cacheGet(CacheKey.cpuId);
  }

  /**
   * The IMEI of the device
   */
  public java.lang.String getImei() {
    return genClient.cacheGet(CacheKey.imei);
  }

  /**
   * The IMSI of the SIM in the device (if present)
   */
  public java.lang.String getImsi() {
    return genClient.cacheGet(CacheKey.imsi);
  }

  /**
   * The ICCID of the SIM in the device (if present)
   */
  public java.lang.String getSimIccid() {
    return genClient.cacheGet(CacheKey.simIccid);
  }

  public java.lang.String getDeviceCertificate() {
    return genClient.cacheGet(CacheKey.deviceCertificate);
  }

  public java.lang.String getPedCertificate() {
    return genClient.cacheGet(CacheKey.pedCertificate);
  }

  public java.lang.String getDeviceTypeName() {
    return genClient.cacheGet(CacheKey.deviceTypeName);
  }

  public java.lang.Boolean getPinDisabled() {
    return genClient.cacheGet(CacheKey.pinDisabled);
  }

  public java.lang.Boolean getOfflinePayments() {
    return genClient.cacheGet(CacheKey.offlinePayments);
  }

  public java.lang.Boolean getOfflinePaymentsAll() {
    return genClient.cacheGet(CacheKey.offlinePaymentsAll);
  }

  public java.lang.Long getOfflinePaymentsLimit() {
    return genClient.cacheGet(CacheKey.offlinePaymentsLimit);
  }

  public java.lang.Long getOfflinePaymentsPromptThreshold() {
    return genClient.cacheGet(CacheKey.offlinePaymentsPromptThreshold);
  }



  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Device> {
    id {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    model {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("model", java.lang.String.class);
      }
    },
    orderPrefix {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("orderPrefix", java.lang.String.class);
      }
    },
    terminalPrefix {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("terminalPrefix", java.lang.Integer.class);
      }
    },
    serial {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("serial", java.lang.String.class);
      }
    },
    buildNumber {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("buildNumber", java.lang.Long.class);
      }
    },
    secureId {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("secureId", java.lang.String.class);
      }
    },
    buildType {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractEnum("buildType", com.clover.sdk.v3.device.BuildType.class);
      }
    },
    cpuId {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("cpuId", java.lang.String.class);
      }
    },
    imei {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("imei", java.lang.String.class);
      }
    },
    imsi {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("imsi", java.lang.String.class);
      }
    },
    simIccid {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("simIccid", java.lang.String.class);
      }
    },
    deviceCertificate {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("deviceCertificate", java.lang.String.class);
      }
    },
    pedCertificate {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("pedCertificate", java.lang.String.class);
      }
    },
    deviceTypeName {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("deviceTypeName", java.lang.String.class);
      }
    },
    pinDisabled {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("pinDisabled", java.lang.Boolean.class);
      }
    },
    offlinePayments {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("offlinePayments", java.lang.Boolean.class);
      }
    },
    offlinePaymentsAll {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("offlinePaymentsAll", java.lang.Boolean.class);
      }
    },
    offlinePaymentsLimit {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("offlinePaymentsLimit", java.lang.Long.class);
      }
    },
    offlinePaymentsPromptThreshold {
      @Override
      public Object extractValue(Device instance) {
        return instance.genClient.extractOther("offlinePaymentsPromptThreshold", java.lang.Long.class);
      }
    },
    ;
  }

  private GenericClient<Device> genClient = new GenericClient<Device>(this);

  /**
   * Constructs a new empty instance.
   */
  public Device() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Device(String json) throws IllegalArgumentException {
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
  public Device(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Device(Device src) {
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
    genClient.validateLength(getId(), 36);

    genClient.validateLength(getName(), 127);

    genClient.validateLength(getModel(), 64);

    genClient.validateLength(getOrderPrefix(), 1);

    genClient.validateLength(getSerial(), 32);

    genClient.validateLength(getSecureId(), 32);

    genClient.validateLength(getCpuId(), 32);

    genClient.validateLength(getImei(), 15);

    genClient.validateLength(getImsi(), 22);

    genClient.validateLength(getSimIccid(), 22);

    genClient.validateLength(getDeviceCertificate(), 1600);

    genClient.validateLength(getPedCertificate(), 1600);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'model' field is set and is not null */
  public boolean isNotNullModel() {
    return genClient.cacheValueIsNotNull(CacheKey.model);
  }

  /** Checks whether the 'orderPrefix' field is set and is not null */
  public boolean isNotNullOrderPrefix() {
    return genClient.cacheValueIsNotNull(CacheKey.orderPrefix);
  }

  /** Checks whether the 'terminalPrefix' field is set and is not null */
  public boolean isNotNullTerminalPrefix() {
    return genClient.cacheValueIsNotNull(CacheKey.terminalPrefix);
  }

  /** Checks whether the 'serial' field is set and is not null */
  public boolean isNotNullSerial() {
    return genClient.cacheValueIsNotNull(CacheKey.serial);
  }

  /** Checks whether the 'buildNumber' field is set and is not null */
  public boolean isNotNullBuildNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.buildNumber);
  }

  /** Checks whether the 'secureId' field is set and is not null */
  public boolean isNotNullSecureId() {
    return genClient.cacheValueIsNotNull(CacheKey.secureId);
  }

  /** Checks whether the 'buildType' field is set and is not null */
  public boolean isNotNullBuildType() {
    return genClient.cacheValueIsNotNull(CacheKey.buildType);
  }

  /** Checks whether the 'cpuId' field is set and is not null */
  public boolean isNotNullCpuId() {
    return genClient.cacheValueIsNotNull(CacheKey.cpuId);
  }

  /** Checks whether the 'imei' field is set and is not null */
  public boolean isNotNullImei() {
    return genClient.cacheValueIsNotNull(CacheKey.imei);
  }

  /** Checks whether the 'imsi' field is set and is not null */
  public boolean isNotNullImsi() {
    return genClient.cacheValueIsNotNull(CacheKey.imsi);
  }

  /** Checks whether the 'simIccid' field is set and is not null */
  public boolean isNotNullSimIccid() {
    return genClient.cacheValueIsNotNull(CacheKey.simIccid);
  }

  /** Checks whether the 'deviceCertificate' field is set and is not null */
  public boolean isNotNullDeviceCertificate() {
    return genClient.cacheValueIsNotNull(CacheKey.deviceCertificate);
  }

  /** Checks whether the 'pedCertificate' field is set and is not null */
  public boolean isNotNullPedCertificate() {
    return genClient.cacheValueIsNotNull(CacheKey.pedCertificate);
  }

  /** Checks whether the 'deviceTypeName' field is set and is not null */
  public boolean isNotNullDeviceTypeName() {
    return genClient.cacheValueIsNotNull(CacheKey.deviceTypeName);
  }

  /** Checks whether the 'pinDisabled' field is set and is not null */
  public boolean isNotNullPinDisabled() {
    return genClient.cacheValueIsNotNull(CacheKey.pinDisabled);
  }

  /** Checks whether the 'offlinePayments' field is set and is not null */
  public boolean isNotNullOfflinePayments() {
    return genClient.cacheValueIsNotNull(CacheKey.offlinePayments);
  }

  /** Checks whether the 'offlinePaymentsAll' field is set and is not null */
  public boolean isNotNullOfflinePaymentsAll() {
    return genClient.cacheValueIsNotNull(CacheKey.offlinePaymentsAll);
  }

  /** Checks whether the 'offlinePaymentsLimit' field is set and is not null */
  public boolean isNotNullOfflinePaymentsLimit() {
    return genClient.cacheValueIsNotNull(CacheKey.offlinePaymentsLimit);
  }

  /** Checks whether the 'offlinePaymentsPromptThreshold' field is set and is not null */
  public boolean isNotNullOfflinePaymentsPromptThreshold() {
    return genClient.cacheValueIsNotNull(CacheKey.offlinePaymentsPromptThreshold);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'model' field has been set, however the value could be null */
  public boolean hasModel() {
    return genClient.cacheHasKey(CacheKey.model);
  }

  /** Checks whether the 'orderPrefix' field has been set, however the value could be null */
  public boolean hasOrderPrefix() {
    return genClient.cacheHasKey(CacheKey.orderPrefix);
  }

  /** Checks whether the 'terminalPrefix' field has been set, however the value could be null */
  public boolean hasTerminalPrefix() {
    return genClient.cacheHasKey(CacheKey.terminalPrefix);
  }

  /** Checks whether the 'serial' field has been set, however the value could be null */
  public boolean hasSerial() {
    return genClient.cacheHasKey(CacheKey.serial);
  }

  /** Checks whether the 'buildNumber' field has been set, however the value could be null */
  public boolean hasBuildNumber() {
    return genClient.cacheHasKey(CacheKey.buildNumber);
  }

  /** Checks whether the 'secureId' field has been set, however the value could be null */
  public boolean hasSecureId() {
    return genClient.cacheHasKey(CacheKey.secureId);
  }

  /** Checks whether the 'buildType' field has been set, however the value could be null */
  public boolean hasBuildType() {
    return genClient.cacheHasKey(CacheKey.buildType);
  }

  /** Checks whether the 'cpuId' field has been set, however the value could be null */
  public boolean hasCpuId() {
    return genClient.cacheHasKey(CacheKey.cpuId);
  }

  /** Checks whether the 'imei' field has been set, however the value could be null */
  public boolean hasImei() {
    return genClient.cacheHasKey(CacheKey.imei);
  }

  /** Checks whether the 'imsi' field has been set, however the value could be null */
  public boolean hasImsi() {
    return genClient.cacheHasKey(CacheKey.imsi);
  }

  /** Checks whether the 'simIccid' field has been set, however the value could be null */
  public boolean hasSimIccid() {
    return genClient.cacheHasKey(CacheKey.simIccid);
  }

  /** Checks whether the 'deviceCertificate' field has been set, however the value could be null */
  public boolean hasDeviceCertificate() {
    return genClient.cacheHasKey(CacheKey.deviceCertificate);
  }

  /** Checks whether the 'pedCertificate' field has been set, however the value could be null */
  public boolean hasPedCertificate() {
    return genClient.cacheHasKey(CacheKey.pedCertificate);
  }

  /** Checks whether the 'deviceTypeName' field has been set, however the value could be null */
  public boolean hasDeviceTypeName() {
    return genClient.cacheHasKey(CacheKey.deviceTypeName);
  }

  /** Checks whether the 'pinDisabled' field has been set, however the value could be null */
  public boolean hasPinDisabled() {
    return genClient.cacheHasKey(CacheKey.pinDisabled);
  }

  /** Checks whether the 'offlinePayments' field has been set, however the value could be null */
  public boolean hasOfflinePayments() {
    return genClient.cacheHasKey(CacheKey.offlinePayments);
  }

  /** Checks whether the 'offlinePaymentsAll' field has been set, however the value could be null */
  public boolean hasOfflinePaymentsAll() {
    return genClient.cacheHasKey(CacheKey.offlinePaymentsAll);
  }

  /** Checks whether the 'offlinePaymentsLimit' field has been set, however the value could be null */
  public boolean hasOfflinePaymentsLimit() {
    return genClient.cacheHasKey(CacheKey.offlinePaymentsLimit);
  }

  /** Checks whether the 'offlinePaymentsPromptThreshold' field has been set, however the value could be null */
  public boolean hasOfflinePaymentsPromptThreshold() {
    return genClient.cacheHasKey(CacheKey.offlinePaymentsPromptThreshold);
  }


  /**
   * Sets the field 'id'.
   */
  public Device setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public Device setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'model'.
   */
  public Device setModel(java.lang.String model) {
    return genClient.setOther(model, CacheKey.model);
  }

  /**
   * Sets the field 'orderPrefix'.
   */
  public Device setOrderPrefix(java.lang.String orderPrefix) {
    return genClient.setOther(orderPrefix, CacheKey.orderPrefix);
  }

  /**
   * Sets the field 'terminalPrefix'.
   */
  public Device setTerminalPrefix(java.lang.Integer terminalPrefix) {
    return genClient.setOther(terminalPrefix, CacheKey.terminalPrefix);
  }

  /**
   * Sets the field 'serial'.
   */
  public Device setSerial(java.lang.String serial) {
    return genClient.setOther(serial, CacheKey.serial);
  }

  /**
   * Sets the field 'buildNumber'.
   */
  public Device setBuildNumber(java.lang.Long buildNumber) {
    return genClient.setOther(buildNumber, CacheKey.buildNumber);
  }

  /**
   * Sets the field 'secureId'.
   */
  public Device setSecureId(java.lang.String secureId) {
    return genClient.setOther(secureId, CacheKey.secureId);
  }

  /**
   * Sets the field 'buildType'.
   */
  public Device setBuildType(com.clover.sdk.v3.device.BuildType buildType) {
    return genClient.setOther(buildType, CacheKey.buildType);
  }

  /**
   * Sets the field 'cpuId'.
   */
  public Device setCpuId(java.lang.String cpuId) {
    return genClient.setOther(cpuId, CacheKey.cpuId);
  }

  /**
   * Sets the field 'imei'.
   */
  public Device setImei(java.lang.String imei) {
    return genClient.setOther(imei, CacheKey.imei);
  }

  /**
   * Sets the field 'imsi'.
   */
  public Device setImsi(java.lang.String imsi) {
    return genClient.setOther(imsi, CacheKey.imsi);
  }

  /**
   * Sets the field 'simIccid'.
   */
  public Device setSimIccid(java.lang.String simIccid) {
    return genClient.setOther(simIccid, CacheKey.simIccid);
  }

  /**
   * Sets the field 'deviceCertificate'.
   */
  public Device setDeviceCertificate(java.lang.String deviceCertificate) {
    return genClient.setOther(deviceCertificate, CacheKey.deviceCertificate);
  }

  /**
   * Sets the field 'pedCertificate'.
   */
  public Device setPedCertificate(java.lang.String pedCertificate) {
    return genClient.setOther(pedCertificate, CacheKey.pedCertificate);
  }

  /**
   * Sets the field 'deviceTypeName'.
   */
  public Device setDeviceTypeName(java.lang.String deviceTypeName) {
    return genClient.setOther(deviceTypeName, CacheKey.deviceTypeName);
  }

  /**
   * Sets the field 'pinDisabled'.
   */
  public Device setPinDisabled(java.lang.Boolean pinDisabled) {
    return genClient.setOther(pinDisabled, CacheKey.pinDisabled);
  }

  /**
   * Sets the field 'offlinePayments'.
   */
  public Device setOfflinePayments(java.lang.Boolean offlinePayments) {
    return genClient.setOther(offlinePayments, CacheKey.offlinePayments);
  }

  /**
   * Sets the field 'offlinePaymentsAll'.
   */
  public Device setOfflinePaymentsAll(java.lang.Boolean offlinePaymentsAll) {
    return genClient.setOther(offlinePaymentsAll, CacheKey.offlinePaymentsAll);
  }

  /**
   * Sets the field 'offlinePaymentsLimit'.
   */
  public Device setOfflinePaymentsLimit(java.lang.Long offlinePaymentsLimit) {
    return genClient.setOther(offlinePaymentsLimit, CacheKey.offlinePaymentsLimit);
  }

  /**
   * Sets the field 'offlinePaymentsPromptThreshold'.
   */
  public Device setOfflinePaymentsPromptThreshold(java.lang.Long offlinePaymentsPromptThreshold) {
    return genClient.setOther(offlinePaymentsPromptThreshold, CacheKey.offlinePaymentsPromptThreshold);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'model' field, the 'has' method for this field will now return false */
  public void clearModel() {
    genClient.clear(CacheKey.model);
  }
  /** Clears the 'orderPrefix' field, the 'has' method for this field will now return false */
  public void clearOrderPrefix() {
    genClient.clear(CacheKey.orderPrefix);
  }
  /** Clears the 'terminalPrefix' field, the 'has' method for this field will now return false */
  public void clearTerminalPrefix() {
    genClient.clear(CacheKey.terminalPrefix);
  }
  /** Clears the 'serial' field, the 'has' method for this field will now return false */
  public void clearSerial() {
    genClient.clear(CacheKey.serial);
  }
  /** Clears the 'buildNumber' field, the 'has' method for this field will now return false */
  public void clearBuildNumber() {
    genClient.clear(CacheKey.buildNumber);
  }
  /** Clears the 'secureId' field, the 'has' method for this field will now return false */
  public void clearSecureId() {
    genClient.clear(CacheKey.secureId);
  }
  /** Clears the 'buildType' field, the 'has' method for this field will now return false */
  public void clearBuildType() {
    genClient.clear(CacheKey.buildType);
  }
  /** Clears the 'cpuId' field, the 'has' method for this field will now return false */
  public void clearCpuId() {
    genClient.clear(CacheKey.cpuId);
  }
  /** Clears the 'imei' field, the 'has' method for this field will now return false */
  public void clearImei() {
    genClient.clear(CacheKey.imei);
  }
  /** Clears the 'imsi' field, the 'has' method for this field will now return false */
  public void clearImsi() {
    genClient.clear(CacheKey.imsi);
  }
  /** Clears the 'simIccid' field, the 'has' method for this field will now return false */
  public void clearSimIccid() {
    genClient.clear(CacheKey.simIccid);
  }
  /** Clears the 'deviceCertificate' field, the 'has' method for this field will now return false */
  public void clearDeviceCertificate() {
    genClient.clear(CacheKey.deviceCertificate);
  }
  /** Clears the 'pedCertificate' field, the 'has' method for this field will now return false */
  public void clearPedCertificate() {
    genClient.clear(CacheKey.pedCertificate);
  }
  /** Clears the 'deviceTypeName' field, the 'has' method for this field will now return false */
  public void clearDeviceTypeName() {
    genClient.clear(CacheKey.deviceTypeName);
  }
  /** Clears the 'pinDisabled' field, the 'has' method for this field will now return false */
  public void clearPinDisabled() {
    genClient.clear(CacheKey.pinDisabled);
  }
  /** Clears the 'offlinePayments' field, the 'has' method for this field will now return false */
  public void clearOfflinePayments() {
    genClient.clear(CacheKey.offlinePayments);
  }
  /** Clears the 'offlinePaymentsAll' field, the 'has' method for this field will now return false */
  public void clearOfflinePaymentsAll() {
    genClient.clear(CacheKey.offlinePaymentsAll);
  }
  /** Clears the 'offlinePaymentsLimit' field, the 'has' method for this field will now return false */
  public void clearOfflinePaymentsLimit() {
    genClient.clear(CacheKey.offlinePaymentsLimit);
  }
  /** Clears the 'offlinePaymentsPromptThreshold' field, the 'has' method for this field will now return false */
  public void clearOfflinePaymentsPromptThreshold() {
    genClient.clear(CacheKey.offlinePaymentsPromptThreshold);
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
  public Device copyChanges() {
    Device copy = new Device();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Device src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Device(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<Device> CREATOR = new android.os.Parcelable.Creator<Device>() {
    @Override
    public Device createFromParcel(android.os.Parcel in) {
      Device instance = new Device(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Device[] newArray(int size) {
      return new Device[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Device> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Device>() {
    @Override
    public Device create(org.json.JSONObject jsonObject) {
      return new Device(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 36;

    public static final boolean NAME_IS_REQUIRED = false;
    public static final long NAME_MAX_LEN = 127;

    public static final boolean MODEL_IS_REQUIRED = false;
    public static final long MODEL_MAX_LEN = 64;

    public static final boolean ORDERPREFIX_IS_REQUIRED = false;
    public static final long ORDERPREFIX_MAX_LEN = 1;

    public static final boolean TERMINALPREFIX_IS_REQUIRED = false;

    public static final boolean SERIAL_IS_REQUIRED = false;
    public static final long SERIAL_MAX_LEN = 32;

    public static final boolean BUILDNUMBER_IS_REQUIRED = false;

    public static final boolean SECUREID_IS_REQUIRED = false;
    public static final long SECUREID_MAX_LEN = 32;

    public static final boolean BUILDTYPE_IS_REQUIRED = false;

    public static final boolean CPUID_IS_REQUIRED = false;
    public static final long CPUID_MAX_LEN = 32;

    public static final boolean IMEI_IS_REQUIRED = false;
    public static final long IMEI_MAX_LEN = 15;

    public static final boolean IMSI_IS_REQUIRED = false;
    public static final long IMSI_MAX_LEN = 22;

    public static final boolean SIMICCID_IS_REQUIRED = false;
    public static final long SIMICCID_MAX_LEN = 22;

    public static final boolean DEVICECERTIFICATE_IS_REQUIRED = false;
    public static final long DEVICECERTIFICATE_MAX_LEN = 1600;

    public static final boolean PEDCERTIFICATE_IS_REQUIRED = false;
    public static final long PEDCERTIFICATE_MAX_LEN = 1600;

    public static final boolean DEVICETYPENAME_IS_REQUIRED = false;

    public static final boolean PINDISABLED_IS_REQUIRED = false;

    public static final boolean OFFLINEPAYMENTS_IS_REQUIRED = false;

    public static final boolean OFFLINEPAYMENTSALL_IS_REQUIRED = false;

    public static final boolean OFFLINEPAYMENTSLIMIT_IS_REQUIRED = false;

    public static final boolean OFFLINEPAYMENTSPROMPTTHRESHOLD_IS_REQUIRED = false;

  }

}
