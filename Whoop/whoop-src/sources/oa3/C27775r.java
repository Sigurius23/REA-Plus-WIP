package oa3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oa3.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C27775r {

    /* JADX INFO: renamed from: a */
    public final String f111972a;

    public C27775r(String str) {
        this.f111972a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m83878a() {
        return this.f111972a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27775r) && AbstractC22676k.m65745e(this.f111972a, ((C27775r) obj).f111972a);
    }

    public final int hashCode() {
        return this.f111972a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("MemberSignature(signature="), this.f111972a, ')');
    }
}
