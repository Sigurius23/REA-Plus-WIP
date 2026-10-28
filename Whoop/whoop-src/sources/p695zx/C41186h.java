package p695zx;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zx.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C41186h extends AbstractC41187i {

    /* JADX INFO: renamed from: c */
    public final String f177701c;

    public C41186h(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f177701c = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41186h) && AbstractC22676k.m65745e(this.f177701c, ((C41186h) obj).f177701c);
    }

    public final int hashCode() {
        return this.f177701c.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Validated(value=", this.f177701c, ")");
    }
}
