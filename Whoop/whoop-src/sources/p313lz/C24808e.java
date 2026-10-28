package p313lz;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lz.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C24808e extends AbstractC24810g {

    /* JADX INFO: renamed from: a */
    public final String f97127a;

    public C24808e(String str) {
        this.f97127a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24808e) && AbstractC22676k.m65745e(this.f97127a, ((C24808e) obj).f97127a);
    }

    public final int hashCode() {
        return this.f97127a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("OpenAuthFlowWithUrl(url=", this.f97127a, ")");
    }
}
