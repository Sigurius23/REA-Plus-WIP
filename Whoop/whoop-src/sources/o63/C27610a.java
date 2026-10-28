package o63;

import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: o63.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C27610a {

    /* JADX INFO: renamed from: a */
    public final String f111134a;

    public C27610a(String str) {
        this.f111134a = str;
        if (str.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            return AbstractC22676k.m65745e(c22673i0.getOrCreateKotlinClass(C27610a.class), c22673i0.getOrCreateKotlinClass(obj.getClass())) && AbstractC22676k.m65745e(this.f111134a, ((C27610a) obj).f111134a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f111134a.hashCode();
    }

    public final String toString() {
        return "AttributeKey: " + this.f111134a;
    }
}
