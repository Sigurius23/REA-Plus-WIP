package p128ew;

import java.util.Arrays;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ew.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C13714a {

    /* JADX INFO: renamed from: a */
    public final byte[] f48684a;

    public C13714a(byte[] byteArray) {
        AbstractC22676k.m65750j(byteArray, "byteArray");
        this.f48684a = byteArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13714a) && AbstractC22676k.m65745e(this.f48684a, ((C13714a) obj).f48684a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48684a) * 31;
    }

    public final String toString() {
        return AbstractC11895b.m31996o("DataRequestBody(byteArray=", Arrays.toString(this.f48684a), ", contentType=null)");
    }
}
