package p048ce;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C4465f extends AbstractC4466g {

    /* JADX INFO: renamed from: w */
    public final String f17987w;

    public C4465f(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f17987w = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4465f) && AbstractC22676k.m65745e(this.f17987w, ((C4465f) obj).f17987w);
    }

    public final int hashCode() {
        return this.f17987w.hashCode();
    }

    public final String toString() {
        return this.f17987w;
    }
}
