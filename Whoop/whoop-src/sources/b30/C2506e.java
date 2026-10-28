package b30;

import p088dc.AbstractC11895b;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C2506e extends AbstractC32073e {

    /* JADX INFO: renamed from: a */
    public final String f9761a;

    public C2506e(String code) {
        AbstractC22676k.m65750j(code, "code");
        this.f9761a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2506e) && AbstractC22676k.m65745e(this.f9761a, ((C2506e) obj).f9761a);
    }

    public final int hashCode() {
        return this.f9761a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("ReportFieldInteraction(code=", this.f9761a, ")");
    }
}
