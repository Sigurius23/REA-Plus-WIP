package b10;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b10.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C2236h extends AbstractC2238i {

    /* JADX INFO: renamed from: a */
    public final String f8890a;

    public C2236h(String str) {
        this.f8890a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2236h) && AbstractC22676k.m65745e(this.f8890a, ((C2236h) obj).f8890a);
    }

    public final int hashCode() {
        String str = this.f8890a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Success(originalDnsCacheTtl=", this.f8890a, ")");
    }
}
