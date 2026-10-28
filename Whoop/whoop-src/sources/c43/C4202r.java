package c43;

import p088dc.AbstractC11895b;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c43.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C4202r extends AbstractC34235f {

    /* JADX INFO: renamed from: a */
    public final String f17060a;

    public C4202r(String str) {
        this.f17060a = str;
    }

    @Override // p507tx.AbstractC34235f
    /* JADX INFO: renamed from: M */
    public final String mo13074M() {
        return this.f17060a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4202r) && AbstractC22676k.m65745e(this.f17060a, ((C4202r) obj).f17060a);
    }

    public final int hashCode() {
        return this.f17060a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Custom(alias=", this.f17060a, ")");
    }
}
