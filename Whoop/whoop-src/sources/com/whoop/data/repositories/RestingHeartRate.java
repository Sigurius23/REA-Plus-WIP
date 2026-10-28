package com.whoop.data.repositories;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/data/repositories/RestingHeartRate;", "", "value", "", "<init>", "(F)V", "getValue", "()F", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class RestingHeartRate {
    private final float value;

    public RestingHeartRate(float f13) {
        this.value = f13;
    }

    public static /* synthetic */ RestingHeartRate copy$default(RestingHeartRate restingHeartRate, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = restingHeartRate.value;
        }
        return restingHeartRate.copy(f13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public final RestingHeartRate copy(float value) {
        return new RestingHeartRate(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RestingHeartRate) && Float.compare(this.value, ((RestingHeartRate) other).value) == 0;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    public String toString() {
        return "RestingHeartRate(value=" + this.value + ")";
    }
}
