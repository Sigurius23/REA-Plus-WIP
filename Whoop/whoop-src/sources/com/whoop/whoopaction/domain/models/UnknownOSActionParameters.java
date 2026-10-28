package com.whoop.whoopaction.domain.models;

import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/UnknownOSActionParameters;", "Lcom/whoop/whoopaction/domain/models/OSActionParameters;", "raw", "Lkotlinx/serialization/json/JsonElement;", "<init>", "(Lkotlinx/serialization/json/JsonElement;)V", "getRaw", "()Lkotlinx/serialization/json/JsonElement;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class UnknownOSActionParameters implements OSActionParameters {
    public static final int $stable = 8;
    private final JsonElement raw;

    public UnknownOSActionParameters(JsonElement raw) {
        AbstractC22676k.m65750j(raw, "raw");
        this.raw = raw;
    }

    public static /* synthetic */ UnknownOSActionParameters copy$default(UnknownOSActionParameters unknownOSActionParameters, JsonElement jsonElement, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            jsonElement = unknownOSActionParameters.raw;
        }
        return unknownOSActionParameters.copy(jsonElement);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonElement getRaw() {
        return this.raw;
    }

    public final UnknownOSActionParameters copy(JsonElement raw) {
        AbstractC22676k.m65750j(raw, "raw");
        return new UnknownOSActionParameters(raw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UnknownOSActionParameters) && AbstractC22676k.m65745e(this.raw, ((UnknownOSActionParameters) other).raw);
    }

    public final JsonElement getRaw() {
        return this.raw;
    }

    public int hashCode() {
        return this.raw.hashCode();
    }

    public String toString() {
        return "UnknownOSActionParameters(raw=" + this.raw + ")";
    }
}
