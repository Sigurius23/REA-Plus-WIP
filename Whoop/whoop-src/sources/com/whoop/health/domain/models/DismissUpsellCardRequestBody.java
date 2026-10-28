package com.whoop.health.domain.models;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/health/domain/models/DismissUpsellCardRequestBody;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DismissUpsellCardRequestBody {
    public static final int $stable = 0;
    private final String id;

    public DismissUpsellCardRequestBody(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
    }

    public static /* synthetic */ DismissUpsellCardRequestBody copy$default(DismissUpsellCardRequestBody dismissUpsellCardRequestBody, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dismissUpsellCardRequestBody.id;
        }
        return dismissUpsellCardRequestBody.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final DismissUpsellCardRequestBody copy(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return new DismissUpsellCardRequestBody(id4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DismissUpsellCardRequestBody) && AbstractC22676k.m65745e(this.id, ((DismissUpsellCardRequestBody) other).id);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("DismissUpsellCardRequestBody(id=", this.id, ")");
    }
}
