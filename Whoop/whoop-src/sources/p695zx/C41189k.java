package p695zx;

import java.io.IOException;
import p088dc.AbstractC11895b;
import p479s4.AbstractC32126g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zx.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C41189k extends AbstractC32126g {

    /* JADX INFO: renamed from: w */
    public final String f177705w;

    /* JADX INFO: renamed from: x */
    public final String f177706x;

    public C41189k(String denormalized) throws IOException {
        AbstractC22676k.m65750j(denormalized, "denormalized");
        this.f177705w = denormalized;
        StringBuilder sb4 = new StringBuilder();
        int length = denormalized.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = denormalized.charAt(i13);
            if (Character.isDigit(cCharAt)) {
                sb4.append(cCharAt);
            }
        }
        this.f177706x = sb4.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41189k) && AbstractC22676k.m65745e(this.f177705w, ((C41189k) obj).f177705w);
    }

    public final int hashCode() {
        return this.f177705w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Unvalidated(denormalized=", this.f177705w, ")");
    }
}
