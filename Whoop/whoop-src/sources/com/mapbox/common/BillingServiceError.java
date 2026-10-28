package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class BillingServiceError implements Serializable {
    private final BillingServiceErrorCode code;
    private final String message;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public BillingServiceError(BillingServiceErrorCode billingServiceErrorCode, String str) {
        this.code = billingServiceErrorCode;
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BillingServiceError billingServiceError = (BillingServiceError) obj;
        return Objects.equals(this.code, billingServiceError.code) && Objects.equals(this.message, billingServiceError.message);
    }

    public BillingServiceErrorCode getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return Objects.hash(this.code, this.message);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[code: ");
        sb4.append(RecordUtils.fieldToString(this.code));
        sb4.append(", message: ");
        return AbstractC3855a.m11826j(this.message, "]", sb4);
    }
}
