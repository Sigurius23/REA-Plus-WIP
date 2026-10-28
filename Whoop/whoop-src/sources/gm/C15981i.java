package gm;

import a33.C0352d;
import android.util.Base64;
import dm.EnumC12174d;
import java.util.Arrays;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: gm.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C15981i {

    /* JADX INFO: renamed from: a */
    public final String f60488a;

    /* JADX INFO: renamed from: b */
    public final byte[] f60489b;

    /* JADX INFO: renamed from: c */
    public final EnumC12174d f60490c;

    public C15981i(String str, byte[] bArr, EnumC12174d enumC12174d) {
        this.f60488a = str;
        this.f60489b = bArr;
        this.f60490c = enumC12174d;
    }

    /* JADX INFO: renamed from: a */
    public static C0352d m45125a() {
        C0352d c0352d = new C0352d(28);
        c0352d.f1239z = EnumC12174d.f40479w;
        return c0352d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15981i) {
            C15981i c15981i = (C15981i) obj;
            if (this.f60488a.equals(c15981i.f60488a) && Arrays.equals(this.f60489b, c15981i.f60489b) && this.f60490c.equals(c15981i.f60490c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f60488a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f60489b)) * 1000003) ^ this.f60490c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f60489b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb4 = new StringBuilder("TransportContext(");
        sb4.append(this.f60488a);
        sb4.append(", ");
        sb4.append(this.f60490c);
        sb4.append(", ");
        return AbstractC25012a.m73376i(strEncodeToString, ")", sb4);
    }
}
