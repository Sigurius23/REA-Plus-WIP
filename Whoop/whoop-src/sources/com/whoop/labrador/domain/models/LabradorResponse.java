package com.whoop.labrador.domain.models;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001J\u0014\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/labrador/domain/models/LabradorResponse;", "", "changeMe", "<init>", "(Ljava/lang/Object;)V", "getChangeMe", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LabradorResponse {
    public static final int $stable = 8;
    private final Object changeMe;

    public LabradorResponse(Object changeMe) {
        AbstractC22676k.m65750j(changeMe, "changeMe");
        this.changeMe = changeMe;
    }

    public static /* synthetic */ LabradorResponse copy$default(LabradorResponse labradorResponse, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = labradorResponse.changeMe;
        }
        return labradorResponse.copy(obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getChangeMe() {
        return this.changeMe;
    }

    public final LabradorResponse copy(Object changeMe) {
        AbstractC22676k.m65750j(changeMe, "changeMe");
        return new LabradorResponse(changeMe);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LabradorResponse) && AbstractC22676k.m65745e(this.changeMe, ((LabradorResponse) other).changeMe);
    }

    public final Object getChangeMe() {
        return this.changeMe;
    }

    public int hashCode() {
        return this.changeMe.hashCode();
    }

    public String toString() {
        return AbstractC18489d0.m53369j(this.changeMe, "LabradorResponse(changeMe=", ")");
    }
}
