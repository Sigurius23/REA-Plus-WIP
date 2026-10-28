package p313lz;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lz.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C24809f extends AbstractC24810g {

    /* JADX INFO: renamed from: a */
    public final String f97128a;

    public C24809f(String str) {
        this.f97128a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24809f) && AbstractC22676k.m65745e(this.f97128a, ((C24809f) obj).f97128a);
    }

    public final int hashCode() {
        return this.f97128a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("OpenCustomTab(url=", this.f97128a, ")");
    }
}
