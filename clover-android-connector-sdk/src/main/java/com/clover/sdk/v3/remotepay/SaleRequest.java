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

package com.clover.sdk.v3.remotepay;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getTippableAmount tippableAmount}</li>
 * <li>{@link #getTipAmount tipAmount}</li>
 * <li>{@link #getDisableCashback disableCashback}</li>
 * <li>{@link #getDisableTipOnScreen disableTipOnScreen}</li>
 * <li>{@link #getTaxAmount taxAmount}</li>
 * <li>{@link #getAllowOfflinePayment allowOfflinePayment}</li>
 * <li>{@link #getForceOfflinePayment forceOfflinePayment}</li>
 * <li>{@link #getApproveOfflinePaymentWithoutPrompt approveOfflinePaymentWithoutPrompt}</li>
 * <li>{@link #getTipMode tipMode}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class SaleRequest extends com.clover.sdk.v3.remotepay.TransactionRequest {

  /**
   * Total amount used when calculating tips
   */
  public java.lang.Long getTippableAmount() {
    return genClient.cacheGet(CacheKey.tippableAmount);
  }

  /**
   * Included tip
   */
  public java.lang.Long getTipAmount() {
    return genClient.cacheGet(CacheKey.tipAmount);
  }

  /**
   * Do not allow cash back
   */
  public java.lang.Boolean getDisableCashback() {
    return genClient.cacheGet(CacheKey.disableCashback);
  }

  /**
   * If true, the tip screen will not be displayed on the device, even if the merchant is configured for tips on screen
   */
  public java.lang.Boolean getDisableTipOnScreen() {
    return genClient.cacheGet(CacheKey.disableTipOnScreen);
  }

  /**
   * Amount paid in tips
   */
  public java.lang.Long getTaxAmount() {
    return genClient.cacheGet(CacheKey.taxAmount);
  }

  /**
   * If true then offline payments can be accepted
   */
  public java.lang.Boolean getAllowOfflinePayment() {
    return genClient.cacheGet(CacheKey.allowOfflinePayment);
  }

  /**
   * If true then payment will be taken offline, regardless of connection status
   */
  public java.lang.Boolean getForceOfflinePayment() {
    return genClient.cacheGet(CacheKey.forceOfflinePayment);
  }

  /**
   * If true then offline payments will be approved without a prompt
   */
  public java.lang.Boolean getApproveOfflinePaymentWithoutPrompt() {
    return genClient.cacheGet(CacheKey.approveOfflinePaymentWithoutPrompt);
  }

  public com.clover.sdk.v3.payments.TipMode getTipMode() {
    return genClient.cacheGet(CacheKey.tipMode);
  }

  /**
   * Identifier for the order to apply this to.  The order must exist in the clover system.
   */
  @Override
  public java.lang.String getOrderId() {
    return genClient.cacheGet(CacheKey.orderId);
  }

  /**
   * If the amount is equal to or greater than this amount, then a signature should be obtained
   */
  @Override
  public java.lang.Long getSignatureThreshold() {
    return genClient.cacheGet(CacheKey.signatureThreshold);
  }

  /**
   * If true, then do not print using the clover printer.  Return print information.
   */
  @Override
  public java.lang.Boolean getDisablePrinting() {
    return genClient.cacheGet(CacheKey.disablePrinting);
  }

  /**
   * Do not show the receipt options screen
   */
  @Override
  public java.lang.Boolean getDisableReceiptSelection() {
    return genClient.cacheGet(CacheKey.disableReceiptSelection);
  }

  /**
   * Do not do heuristic duplicate checking
   */
  @Override
  public java.lang.Boolean getDisableDuplicateChecking() {
    return genClient.cacheGet(CacheKey.disableDuplicateChecking);
  }

  /**
   * Where the signature should be obtined from (paper, screen...etc)
   */
  @Override
  public com.clover.sdk.v3.payments.DataEntryLocation getSignatureEntryLocation() {
    return genClient.cacheGet(CacheKey.signatureEntryLocation);
  }

  /**
   * If true then card not present is accepted
   */
  @Override
  public java.lang.Boolean getCardNotPresent() {
    return genClient.cacheGet(CacheKey.cardNotPresent);
  }

  /**
   * If the transaction times out or fails because of decline, do not restart it
   */
  @Override
  public java.lang.Boolean getDisableRestartTransactionOnFail() {
    return genClient.cacheGet(CacheKey.disableRestartTransactionOnFail);
  }

  /**
   * Total amount paid
   */
  @Override
  public java.lang.Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }

  /**
   * Allowed entry methods
   */
  @Override
  public java.lang.Integer getCardEntryMethods() {
    return genClient.cacheGet(CacheKey.cardEntryMethods);
  }

  /**
   * A saved card
   */
  @Override
  public com.clover.sdk.v3.payments.VaultedCard getVaultedCard() {
    return genClient.cacheGet(CacheKey.vaultedCard);
  }

  /**
   * An id that will be persisted with transactions.
   */
  @Override
  public java.lang.String getExternalId() {
    return genClient.cacheGet(CacheKey.externalId);
  }

  /**
   * The type of the transaction.
   */
  @Override
  public com.clover.sdk.v3.remotepay.TransactionType getType() {
    return genClient.cacheGet(CacheKey.type);
  }

  /**
   * Do not show/send potential duplicate challenges
   */
  @Override
  public java.lang.Boolean getAutoAcceptPaymentConfirmations() {
    return genClient.cacheGet(CacheKey.autoAcceptPaymentConfirmations);
  }

  /**
   * Do not show/send signature verification challenges
   */
  @Override
  public java.lang.Boolean getAutoAcceptSignature() {
    return genClient.cacheGet(CacheKey.autoAcceptSignature);
  }

  /**
   * Identifier for the request
   */
  @Override
  public java.lang.String getRequestId() {
    return genClient.cacheGet(CacheKey.requestId);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<SaleRequest> {
    tippableAmount {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("tippableAmount", java.lang.Long.class);
      }
    },
    tipAmount {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("tipAmount", java.lang.Long.class);
      }
    },
    disableCashback {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("disableCashback", java.lang.Boolean.class);
      }
    },
    disableTipOnScreen {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("disableTipOnScreen", java.lang.Boolean.class);
      }
    },
    taxAmount {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("taxAmount", java.lang.Long.class);
      }
    },
    allowOfflinePayment {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("allowOfflinePayment", java.lang.Boolean.class);
      }
    },
    forceOfflinePayment {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("forceOfflinePayment", java.lang.Boolean.class);
      }
    },
    approveOfflinePaymentWithoutPrompt {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("approveOfflinePaymentWithoutPrompt", java.lang.Boolean.class);
      }
    },
    tipMode {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractEnum("tipMode", com.clover.sdk.v3.payments.TipMode.class);
      }
    },
    orderId {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("orderId", java.lang.String.class);
      }
    },
    signatureThreshold {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("signatureThreshold", java.lang.Long.class);
      }
    },
    disablePrinting {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("disablePrinting", java.lang.Boolean.class);
      }
    },
    disableReceiptSelection {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("disableReceiptSelection", java.lang.Boolean.class);
      }
    },
    disableDuplicateChecking {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("disableDuplicateChecking", java.lang.Boolean.class);
      }
    },
    signatureEntryLocation {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractEnum("signatureEntryLocation", com.clover.sdk.v3.payments.DataEntryLocation.class);
      }
    },
    cardNotPresent {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("cardNotPresent", java.lang.Boolean.class);
      }
    },
    disableRestartTransactionOnFail {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("disableRestartTransactionOnFail", java.lang.Boolean.class);
      }
    },
    amount {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("amount", java.lang.Long.class);
      }
    },
    cardEntryMethods {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("cardEntryMethods", java.lang.Integer.class);
      }
    },
    vaultedCard {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractRecord("vaultedCard", com.clover.sdk.v3.payments.VaultedCard.JSON_CREATOR);
      }
    },
    externalId {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("externalId", java.lang.String.class);
      }
    },
    type {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractEnum("type", com.clover.sdk.v3.remotepay.TransactionType.class);
      }
    },
    autoAcceptPaymentConfirmations {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("autoAcceptPaymentConfirmations", java.lang.Boolean.class);
      }
    },
    autoAcceptSignature {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("autoAcceptSignature", java.lang.Boolean.class);
      }
    },
    requestId {
      @Override
      public Object extractValue(SaleRequest instance) {
        return instance.genClient.extractOther("requestId", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<SaleRequest> genClient;

  /**
  * Constructs a new empty instance.
  */
  public SaleRequest() {
    super(false);
    genClient = new GenericClient<SaleRequest>(this);
    this.setType(com.clover.sdk.v3.remotepay.TransactionType.PAYMENT);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected SaleRequest(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public SaleRequest(String json) throws IllegalArgumentException {
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
  public SaleRequest(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public SaleRequest(SaleRequest src) {
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

    genClient.validateLength(getOrderId(), 13);

    genClient.validateNull(getAmount(), "amount");

    genClient.validateNull(getExternalId(), "externalId");
    genClient.validateLength(getRequestId(), 13);
  }

  /** Checks whether the 'tippableAmount' field is set and is not null */
  public boolean isNotNullTippableAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.tippableAmount);
  }

  /** Checks whether the 'tipAmount' field is set and is not null */
  public boolean isNotNullTipAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.tipAmount);
  }

  /** Checks whether the 'disableCashback' field is set and is not null */
  public boolean isNotNullDisableCashback() {
    return genClient.cacheValueIsNotNull(CacheKey.disableCashback);
  }

  /** Checks whether the 'disableTipOnScreen' field is set and is not null */
  public boolean isNotNullDisableTipOnScreen() {
    return genClient.cacheValueIsNotNull(CacheKey.disableTipOnScreen);
  }

  /** Checks whether the 'taxAmount' field is set and is not null */
  public boolean isNotNullTaxAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.taxAmount);
  }

  /** Checks whether the 'allowOfflinePayment' field is set and is not null */
  public boolean isNotNullAllowOfflinePayment() {
    return genClient.cacheValueIsNotNull(CacheKey.allowOfflinePayment);
  }

  /** Checks whether the 'forceOfflinePayment' field is set and is not null */
  public boolean isNotNullForceOfflinePayment() {
    return genClient.cacheValueIsNotNull(CacheKey.forceOfflinePayment);
  }

  /** Checks whether the 'approveOfflinePaymentWithoutPrompt' field is set and is not null */
  public boolean isNotNullApproveOfflinePaymentWithoutPrompt() {
    return genClient.cacheValueIsNotNull(CacheKey.approveOfflinePaymentWithoutPrompt);
  }

  /** Checks whether the 'tipMode' field is set and is not null */
  public boolean isNotNullTipMode() {
    return genClient.cacheValueIsNotNull(CacheKey.tipMode);
  }

  /** Checks whether the 'orderId' field is set and is not null */
  @Override
  public boolean isNotNullOrderId() {
    return genClient.cacheValueIsNotNull(CacheKey.orderId);
  }

  /** Checks whether the 'signatureThreshold' field is set and is not null */
  @Override
  public boolean isNotNullSignatureThreshold() {
    return genClient.cacheValueIsNotNull(CacheKey.signatureThreshold);
  }

  /** Checks whether the 'disablePrinting' field is set and is not null */
  @Override
  public boolean isNotNullDisablePrinting() {
    return genClient.cacheValueIsNotNull(CacheKey.disablePrinting);
  }

  /** Checks whether the 'disableReceiptSelection' field is set and is not null */
  @Override
  public boolean isNotNullDisableReceiptSelection() {
    return genClient.cacheValueIsNotNull(CacheKey.disableReceiptSelection);
  }

  /** Checks whether the 'disableDuplicateChecking' field is set and is not null */
  @Override
  public boolean isNotNullDisableDuplicateChecking() {
    return genClient.cacheValueIsNotNull(CacheKey.disableDuplicateChecking);
  }

  /** Checks whether the 'signatureEntryLocation' field is set and is not null */
  @Override
  public boolean isNotNullSignatureEntryLocation() {
    return genClient.cacheValueIsNotNull(CacheKey.signatureEntryLocation);
  }

  /** Checks whether the 'cardNotPresent' field is set and is not null */
  @Override
  public boolean isNotNullCardNotPresent() {
    return genClient.cacheValueIsNotNull(CacheKey.cardNotPresent);
  }

  /** Checks whether the 'disableRestartTransactionOnFail' field is set and is not null */
  @Override
  public boolean isNotNullDisableRestartTransactionOnFail() {
    return genClient.cacheValueIsNotNull(CacheKey.disableRestartTransactionOnFail);
  }

  /** Checks whether the 'amount' field is set and is not null */
  @Override
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'cardEntryMethods' field is set and is not null */
  @Override
  public boolean isNotNullCardEntryMethods() {
    return genClient.cacheValueIsNotNull(CacheKey.cardEntryMethods);
  }

  /** Checks whether the 'vaultedCard' field is set and is not null */
  @Override
  public boolean isNotNullVaultedCard() {
    return genClient.cacheValueIsNotNull(CacheKey.vaultedCard);
  }

  /** Checks whether the 'externalId' field is set and is not null */
  @Override
  public boolean isNotNullExternalId() {
    return genClient.cacheValueIsNotNull(CacheKey.externalId);
  }

  /** Checks whether the 'type' field is set and is not null */
  @Override
  public boolean isNotNullType() {
    return genClient.cacheValueIsNotNull(CacheKey.type);
  }

  /** Checks whether the 'autoAcceptPaymentConfirmations' field is set and is not null */
  @Override
  public boolean isNotNullAutoAcceptPaymentConfirmations() {
    return genClient.cacheValueIsNotNull(CacheKey.autoAcceptPaymentConfirmations);
  }

  /** Checks whether the 'autoAcceptSignature' field is set and is not null */
  @Override
  public boolean isNotNullAutoAcceptSignature() {
    return genClient.cacheValueIsNotNull(CacheKey.autoAcceptSignature);
  }

  /** Checks whether the 'requestId' field is set and is not null */
  @Override
  public boolean isNotNullRequestId() {
    return genClient.cacheValueIsNotNull(CacheKey.requestId);
  }



  /** Checks whether the 'tippableAmount' field has been set, however the value could be null */
  public boolean hasTippableAmount() {
    return genClient.cacheHasKey(CacheKey.tippableAmount);
  }

  /** Checks whether the 'tipAmount' field has been set, however the value could be null */
  public boolean hasTipAmount() {
    return genClient.cacheHasKey(CacheKey.tipAmount);
  }

  /** Checks whether the 'disableCashback' field has been set, however the value could be null */
  public boolean hasDisableCashback() {
    return genClient.cacheHasKey(CacheKey.disableCashback);
  }

  /** Checks whether the 'disableTipOnScreen' field has been set, however the value could be null */
  public boolean hasDisableTipOnScreen() {
    return genClient.cacheHasKey(CacheKey.disableTipOnScreen);
  }

  /** Checks whether the 'taxAmount' field has been set, however the value could be null */
  public boolean hasTaxAmount() {
    return genClient.cacheHasKey(CacheKey.taxAmount);
  }

  /** Checks whether the 'allowOfflinePayment' field has been set, however the value could be null */
  public boolean hasAllowOfflinePayment() {
    return genClient.cacheHasKey(CacheKey.allowOfflinePayment);
  }

  /** Checks whether the 'forceOfflinePayment' field has been set, however the value could be null */
  public boolean hasForceOfflinePayment() {
    return genClient.cacheHasKey(CacheKey.forceOfflinePayment);
  }

  /** Checks whether the 'approveOfflinePaymentWithoutPrompt' field has been set, however the value could be null */
  public boolean hasApproveOfflinePaymentWithoutPrompt() {
    return genClient.cacheHasKey(CacheKey.approveOfflinePaymentWithoutPrompt);
  }

  /** Checks whether the 'tipMode' field has been set, however the value could be null */
  public boolean hasTipMode() {
    return genClient.cacheHasKey(CacheKey.tipMode);
  }

  /** Checks whether the 'orderId' field has been set, however the value could be null */
  @Override
  public boolean hasOrderId() {
    return genClient.cacheHasKey(CacheKey.orderId);
  }

  /** Checks whether the 'signatureThreshold' field has been set, however the value could be null */
  @Override
  public boolean hasSignatureThreshold() {
    return genClient.cacheHasKey(CacheKey.signatureThreshold);
  }

  /** Checks whether the 'disablePrinting' field has been set, however the value could be null */
  @Override
  public boolean hasDisablePrinting() {
    return genClient.cacheHasKey(CacheKey.disablePrinting);
  }

  /** Checks whether the 'disableReceiptSelection' field has been set, however the value could be null */
  @Override
  public boolean hasDisableReceiptSelection() {
    return genClient.cacheHasKey(CacheKey.disableReceiptSelection);
  }

  /** Checks whether the 'disableDuplicateChecking' field has been set, however the value could be null */
  @Override
  public boolean hasDisableDuplicateChecking() {
    return genClient.cacheHasKey(CacheKey.disableDuplicateChecking);
  }

  /** Checks whether the 'signatureEntryLocation' field has been set, however the value could be null */
  @Override
  public boolean hasSignatureEntryLocation() {
    return genClient.cacheHasKey(CacheKey.signatureEntryLocation);
  }

  /** Checks whether the 'cardNotPresent' field has been set, however the value could be null */
  @Override
  public boolean hasCardNotPresent() {
    return genClient.cacheHasKey(CacheKey.cardNotPresent);
  }

  /** Checks whether the 'disableRestartTransactionOnFail' field has been set, however the value could be null */
  @Override
  public boolean hasDisableRestartTransactionOnFail() {
    return genClient.cacheHasKey(CacheKey.disableRestartTransactionOnFail);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  @Override
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'cardEntryMethods' field has been set, however the value could be null */
  @Override
  public boolean hasCardEntryMethods() {
    return genClient.cacheHasKey(CacheKey.cardEntryMethods);
  }

  /** Checks whether the 'vaultedCard' field has been set, however the value could be null */
  @Override
  public boolean hasVaultedCard() {
    return genClient.cacheHasKey(CacheKey.vaultedCard);
  }

  /** Checks whether the 'externalId' field has been set, however the value could be null */
  @Override
  public boolean hasExternalId() {
    return genClient.cacheHasKey(CacheKey.externalId);
  }

  /** Checks whether the 'type' field has been set, however the value could be null */
  @Override
  public boolean hasType() {
    return genClient.cacheHasKey(CacheKey.type);
  }

  /** Checks whether the 'autoAcceptPaymentConfirmations' field has been set, however the value could be null */
  @Override
  public boolean hasAutoAcceptPaymentConfirmations() {
    return genClient.cacheHasKey(CacheKey.autoAcceptPaymentConfirmations);
  }

  /** Checks whether the 'autoAcceptSignature' field has been set, however the value could be null */
  @Override
  public boolean hasAutoAcceptSignature() {
    return genClient.cacheHasKey(CacheKey.autoAcceptSignature);
  }

  /** Checks whether the 'requestId' field has been set, however the value could be null */
  @Override
  public boolean hasRequestId() {
    return genClient.cacheHasKey(CacheKey.requestId);
  }


  /**
   * Sets the field 'tippableAmount'.
   */
  public SaleRequest setTippableAmount(java.lang.Long tippableAmount) {
    return genClient.setOther(tippableAmount, CacheKey.tippableAmount);
  }

  /**
   * Sets the field 'tipAmount'.
   */
  public SaleRequest setTipAmount(java.lang.Long tipAmount) {
    return genClient.setOther(tipAmount, CacheKey.tipAmount);
  }

  /**
   * Sets the field 'disableCashback'.
   */
  public SaleRequest setDisableCashback(java.lang.Boolean disableCashback) {
    return genClient.setOther(disableCashback, CacheKey.disableCashback);
  }

  /**
   * Sets the field 'disableTipOnScreen'.
   */
  public SaleRequest setDisableTipOnScreen(java.lang.Boolean disableTipOnScreen) {
    return genClient.setOther(disableTipOnScreen, CacheKey.disableTipOnScreen);
  }

  /**
   * Sets the field 'taxAmount'.
   */
  public SaleRequest setTaxAmount(java.lang.Long taxAmount) {
    return genClient.setOther(taxAmount, CacheKey.taxAmount);
  }

  /**
   * Sets the field 'allowOfflinePayment'.
   */
  public SaleRequest setAllowOfflinePayment(java.lang.Boolean allowOfflinePayment) {
    return genClient.setOther(allowOfflinePayment, CacheKey.allowOfflinePayment);
  }

  /**
   * Sets the field 'forceOfflinePayment'.
   */
  public SaleRequest setForceOfflinePayment(java.lang.Boolean forceOfflinePayment) {
    return genClient.setOther(forceOfflinePayment, CacheKey.forceOfflinePayment);
  }

  /**
   * Sets the field 'approveOfflinePaymentWithoutPrompt'.
   */
  public SaleRequest setApproveOfflinePaymentWithoutPrompt(java.lang.Boolean approveOfflinePaymentWithoutPrompt) {
    return genClient.setOther(approveOfflinePaymentWithoutPrompt, CacheKey.approveOfflinePaymentWithoutPrompt);
  }

  /**
   * Sets the field 'tipMode'.
   */
  public SaleRequest setTipMode(com.clover.sdk.v3.payments.TipMode tipMode) {
    return genClient.setOther(tipMode, CacheKey.tipMode);
  }

  /**
   * Sets the field 'orderId'.
   */
  @Override
  public TransactionRequest setOrderId(java.lang.String orderId) {
    return genClient.setOther(orderId, CacheKey.orderId);
  }

  /**
   * Sets the field 'signatureThreshold'.
   */
  @Override
  public TransactionRequest setSignatureThreshold(java.lang.Long signatureThreshold) {
    return genClient.setOther(signatureThreshold, CacheKey.signatureThreshold);
  }

  /**
   * Sets the field 'disablePrinting'.
   */
  @Override
  public TransactionRequest setDisablePrinting(java.lang.Boolean disablePrinting) {
    return genClient.setOther(disablePrinting, CacheKey.disablePrinting);
  }

  /**
   * Sets the field 'disableReceiptSelection'.
   */
  @Override
  public TransactionRequest setDisableReceiptSelection(java.lang.Boolean disableReceiptSelection) {
    return genClient.setOther(disableReceiptSelection, CacheKey.disableReceiptSelection);
  }

  /**
   * Sets the field 'disableDuplicateChecking'.
   */
  @Override
  public TransactionRequest setDisableDuplicateChecking(java.lang.Boolean disableDuplicateChecking) {
    return genClient.setOther(disableDuplicateChecking, CacheKey.disableDuplicateChecking);
  }

  /**
   * Sets the field 'signatureEntryLocation'.
   */
  @Override
  public TransactionRequest setSignatureEntryLocation(com.clover.sdk.v3.payments.DataEntryLocation signatureEntryLocation) {
    return genClient.setOther(signatureEntryLocation, CacheKey.signatureEntryLocation);
  }

  /**
   * Sets the field 'cardNotPresent'.
   */
  @Override
  public TransactionRequest setCardNotPresent(java.lang.Boolean cardNotPresent) {
    return genClient.setOther(cardNotPresent, CacheKey.cardNotPresent);
  }

  /**
   * Sets the field 'disableRestartTransactionOnFail'.
   */
  @Override
  public TransactionRequest setDisableRestartTransactionOnFail(java.lang.Boolean disableRestartTransactionOnFail) {
    return genClient.setOther(disableRestartTransactionOnFail, CacheKey.disableRestartTransactionOnFail);
  }

  /**
   * Sets the field 'amount'.
   */
  @Override
  public TransactionRequest setAmount(java.lang.Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'cardEntryMethods'.
   */
  @Override
  public TransactionRequest setCardEntryMethods(java.lang.Integer cardEntryMethods) {
    return genClient.setOther(cardEntryMethods, CacheKey.cardEntryMethods);
  }

  /**
   * Sets the field 'vaultedCard'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  @Override
  public TransactionRequest setVaultedCard(com.clover.sdk.v3.payments.VaultedCard vaultedCard) {
    return genClient.setRecord(vaultedCard, CacheKey.vaultedCard);
  }

  /**
   * Sets the field 'externalId'.
   */
  @Override
  public TransactionRequest setExternalId(java.lang.String externalId) {
    return genClient.setOther(externalId, CacheKey.externalId);
  }

  /**
   * Sets the field 'type'.
   */
  @Override
  public TransactionRequest setType(com.clover.sdk.v3.remotepay.TransactionType type) {
    return genClient.setOther(type, CacheKey.type);
  }

  /**
   * Sets the field 'autoAcceptPaymentConfirmations'.
   */
  @Override
  public TransactionRequest setAutoAcceptPaymentConfirmations(java.lang.Boolean autoAcceptPaymentConfirmations) {
    return genClient.setOther(autoAcceptPaymentConfirmations, CacheKey.autoAcceptPaymentConfirmations);
  }

  /**
   * Sets the field 'autoAcceptSignature'.
   */
  @Override
  public TransactionRequest setAutoAcceptSignature(java.lang.Boolean autoAcceptSignature) {
    return genClient.setOther(autoAcceptSignature, CacheKey.autoAcceptSignature);
  }

  /**
   * Sets the field 'requestId'.
   */
  @Override
  public BaseRequest setRequestId(java.lang.String requestId) {
    return genClient.setOther(requestId, CacheKey.requestId);
  }


  /** Clears the 'tippableAmount' field, the 'has' method for this field will now return false */
  public void clearTippableAmount() {
    genClient.clear(CacheKey.tippableAmount);
  }
  /** Clears the 'tipAmount' field, the 'has' method for this field will now return false */
  public void clearTipAmount() {
    genClient.clear(CacheKey.tipAmount);
  }
  /** Clears the 'disableCashback' field, the 'has' method for this field will now return false */
  public void clearDisableCashback() {
    genClient.clear(CacheKey.disableCashback);
  }
  /** Clears the 'disableTipOnScreen' field, the 'has' method for this field will now return false */
  public void clearDisableTipOnScreen() {
    genClient.clear(CacheKey.disableTipOnScreen);
  }
  /** Clears the 'taxAmount' field, the 'has' method for this field will now return false */
  public void clearTaxAmount() {
    genClient.clear(CacheKey.taxAmount);
  }
  /** Clears the 'allowOfflinePayment' field, the 'has' method for this field will now return false */
  public void clearAllowOfflinePayment() {
    genClient.clear(CacheKey.allowOfflinePayment);
  }
  /** Clears the 'forceOfflinePayment' field, the 'has' method for this field will now return false */
  public void clearForceOfflinePayment() {
    genClient.clear(CacheKey.forceOfflinePayment);
  }
  /** Clears the 'approveOfflinePaymentWithoutPrompt' field, the 'has' method for this field will now return false */
  public void clearApproveOfflinePaymentWithoutPrompt() {
    genClient.clear(CacheKey.approveOfflinePaymentWithoutPrompt);
  }
  /** Clears the 'tipMode' field, the 'has' method for this field will now return false */
  public void clearTipMode() {
    genClient.clear(CacheKey.tipMode);
  }
  /** Clears the 'orderId' field, the 'has' method for this field will now return false */
  @Override
  public void clearOrderId() {
    genClient.clear(CacheKey.orderId);
  }
  /** Clears the 'signatureThreshold' field, the 'has' method for this field will now return false */
  @Override
  public void clearSignatureThreshold() {
    genClient.clear(CacheKey.signatureThreshold);
  }
  /** Clears the 'disablePrinting' field, the 'has' method for this field will now return false */
  @Override
  public void clearDisablePrinting() {
    genClient.clear(CacheKey.disablePrinting);
  }
  /** Clears the 'disableReceiptSelection' field, the 'has' method for this field will now return false */
  @Override
  public void clearDisableReceiptSelection() {
    genClient.clear(CacheKey.disableReceiptSelection);
  }
  /** Clears the 'disableDuplicateChecking' field, the 'has' method for this field will now return false */
  @Override
  public void clearDisableDuplicateChecking() {
    genClient.clear(CacheKey.disableDuplicateChecking);
  }
  /** Clears the 'signatureEntryLocation' field, the 'has' method for this field will now return false */
  @Override
  public void clearSignatureEntryLocation() {
    genClient.clear(CacheKey.signatureEntryLocation);
  }
  /** Clears the 'cardNotPresent' field, the 'has' method for this field will now return false */
  @Override
  public void clearCardNotPresent() {
    genClient.clear(CacheKey.cardNotPresent);
  }
  /** Clears the 'disableRestartTransactionOnFail' field, the 'has' method for this field will now return false */
  @Override
  public void clearDisableRestartTransactionOnFail() {
    genClient.clear(CacheKey.disableRestartTransactionOnFail);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  @Override
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'cardEntryMethods' field, the 'has' method for this field will now return false */
  @Override
  public void clearCardEntryMethods() {
    genClient.clear(CacheKey.cardEntryMethods);
  }
  /** Clears the 'vaultedCard' field, the 'has' method for this field will now return false */
  @Override
  public void clearVaultedCard() {
    genClient.clear(CacheKey.vaultedCard);
  }
  /** Clears the 'externalId' field, the 'has' method for this field will now return false */
  @Override
  public void clearExternalId() {
    genClient.clear(CacheKey.externalId);
  }
  /** Clears the 'type' field, the 'has' method for this field will now return false */
  @Override
  public void clearType() {
    genClient.clear(CacheKey.type);
  }
  /** Clears the 'autoAcceptPaymentConfirmations' field, the 'has' method for this field will now return false */
  @Override
  public void clearAutoAcceptPaymentConfirmations() {
    genClient.clear(CacheKey.autoAcceptPaymentConfirmations);
  }
  /** Clears the 'autoAcceptSignature' field, the 'has' method for this field will now return false */
  @Override
  public void clearAutoAcceptSignature() {
    genClient.clear(CacheKey.autoAcceptSignature);
  }
  /** Clears the 'requestId' field, the 'has' method for this field will now return false */
  @Override
  public void clearRequestId() {
    genClient.clear(CacheKey.requestId);
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
  public SaleRequest copyChanges() {
    SaleRequest copy = new SaleRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(SaleRequest src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new SaleRequest(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<SaleRequest> CREATOR = new android.os.Parcelable.Creator<SaleRequest>() {
    @Override
    public SaleRequest createFromParcel(android.os.Parcel in) {
      SaleRequest instance = new SaleRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public SaleRequest[] newArray(int size) {
      return new SaleRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<SaleRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<SaleRequest>() {
    @Override
    public SaleRequest create(org.json.JSONObject jsonObject) {
      return new SaleRequest(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean TIPPABLEAMOUNT_IS_REQUIRED = false;
    public static final boolean TIPAMOUNT_IS_REQUIRED = false;
    public static final boolean DISABLECASHBACK_IS_REQUIRED = false;
    public static final boolean DISABLETIPONSCREEN_IS_REQUIRED = false;
    public static final boolean TAXAMOUNT_IS_REQUIRED = false;
    public static final boolean ALLOWOFFLINEPAYMENT_IS_REQUIRED = false;
    public static final boolean FORCEOFFLINEPAYMENT_IS_REQUIRED = false;
    public static final boolean APPROVEOFFLINEPAYMENTWITHOUTPROMPT_IS_REQUIRED = false;
    public static final boolean TIPMODE_IS_REQUIRED = false;
    public static final boolean ORDERID_IS_REQUIRED = false;
    public static final long ORDERID_MAX_LEN = 13;
    public static final boolean SIGNATURETHRESHOLD_IS_REQUIRED = false;
    public static final boolean DISABLEPRINTING_IS_REQUIRED = false;
    public static final boolean DISABLERECEIPTSELECTION_IS_REQUIRED = false;
    public static final boolean DISABLEDUPLICATECHECKING_IS_REQUIRED = false;
    public static final boolean SIGNATUREENTRYLOCATION_IS_REQUIRED = false;
    public static final boolean CARDNOTPRESENT_IS_REQUIRED = false;
    public static final boolean DISABLERESTARTTRANSACTIONONFAIL_IS_REQUIRED = false;
    public static final boolean AMOUNT_IS_REQUIRED = true;
    public static final boolean CARDENTRYMETHODS_IS_REQUIRED = false;
    public static final boolean VAULTEDCARD_IS_REQUIRED = false;
    public static final boolean EXTERNALID_IS_REQUIRED = true;
    public static final boolean TYPE_IS_REQUIRED = false;
    public static final boolean AUTOACCEPTPAYMENTCONFIRMATIONS_IS_REQUIRED = false;
    public static final boolean AUTOACCEPTSIGNATURE_IS_REQUIRED = false;
    public static final boolean REQUESTID_IS_REQUIRED = false;
    public static final long REQUESTID_MAX_LEN = 13;

  }

}
