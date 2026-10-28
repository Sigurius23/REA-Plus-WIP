package p023ay;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ay.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C2133g implements InterfaceC2134h {

    /* JADX INFO: renamed from: a */
    public final String f8518a;

    public C2133g(String str) {
        this.f8518a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2133g) && AbstractC22676k.m65745e(this.f8518a, ((C2133g) obj).f8518a);
    }

    public final int hashCode() {
        return this.f8518a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Success(clientSecret=", this.f8518a, ")");
    }
}
