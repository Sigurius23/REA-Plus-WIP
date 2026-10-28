package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.util.Locale;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p437qt.C30582e;
import se.AbstractC32416g;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5146i implements Iterable, Serializable {

    /* JADX INFO: renamed from: x */
    public static final C5143h f21514x = new C5143h(AbstractC5126b0.f21480b);

    /* JADX INFO: renamed from: y */
    public static final InterfaceC5140g f21515y;

    /* JADX INFO: renamed from: w */
    public int f21516w;

    static {
        f21515y = AbstractC5128c.m16150a() ? new C30582e(13) : new C5134e();
    }

    /* JADX INFO: renamed from: c */
    public static int m16172c(int i13, int i14, int i15) {
        int i16 = i14 - i13;
        if ((i13 | i14 | i16 | (i15 - i14)) >= 0) {
            return i16;
        }
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8296i(i13, "Beginning index: ", " < 0"));
        }
        if (i14 < i13) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i14, i15, "End index: ", " >= "));
    }

    /* JADX INFO: renamed from: d */
    public static C5143h m16173d(byte[] bArr, int i13, int i14) {
        m16172c(i13, i13 + i14, bArr.length);
        return new C5143h(f21515y.mo16163a(bArr, i13, i14));
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo16164a(int i13);

    /* JADX INFO: renamed from: e */
    public abstract void mo16165e(int i13, byte[] bArr);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract byte mo16166f(int i13);

    /* JADX INFO: renamed from: g */
    public final byte[] m16174g() {
        int size = size();
        if (size == 0) {
            return AbstractC5126b0.f21480b;
        }
        byte[] bArr = new byte[size];
        mo16165e(size, bArr);
        return bArr;
    }

    public final int hashCode() {
        int i13 = this.f21516w;
        if (i13 != 0) {
            return i13;
        }
        int size = size();
        C5143h c5143h = (C5143h) this;
        int iMo16167j = c5143h.mo16167j();
        int i14 = size;
        for (int i15 = iMo16167j; i15 < iMo16167j + size; i15++) {
            i14 = (i14 * 31) + c5143h.f21510z[i15];
        }
        if (i14 == 0) {
            i14 = 1;
        }
        this.f21516w = i14;
        return i14;
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC32416g.m101165v(this);
        } else {
            StringBuilder sb4 = new StringBuilder();
            C5143h c5143h = (C5143h) this;
            int iM16172c = m16172c(0, 47, c5143h.size());
            sb4.append(AbstractC32416g.m101165v(iM16172c == 0 ? f21514x : new C5137f(c5143h.f21510z, c5143h.mo16167j(), iM16172c)));
            sb4.append("...");
            string = sb4.toString();
        }
        return AbstractC25012a.m73376i(string, "\">", AbstractC11266d.m30467u(size, "<ByteString@", hexString, " size=", " contents=\""));
    }
}
