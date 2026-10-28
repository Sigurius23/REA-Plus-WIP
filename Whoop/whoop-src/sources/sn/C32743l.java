package sn;

import android.net.Uri;
import ed3.C13117a;
import java.util.Map;
import p284ko.C22630n;
import p284ko.InterfaceC22625j0;
import p284ko.InterfaceC22628l;
import p309lo.AbstractC24543a;

/* JADX INFO: renamed from: sn.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C32743l implements InterfaceC22628l {

    /* JADX INFO: renamed from: E */
    public int f136160E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC22628l f136161w;

    /* JADX INFO: renamed from: x */
    public final int f136162x;

    /* JADX INFO: renamed from: y */
    public final C32736h0 f136163y;

    /* JADX INFO: renamed from: z */
    public final byte[] f136164z;

    public C32743l(InterfaceC22628l interfaceC22628l, int i13, C32736h0 c32736h0) {
        AbstractC24543a.m71569e(i13 > 0);
        this.f136161w = interfaceC22628l;
        this.f136162x = i13;
        this.f136163y = c32736h0;
        this.f136164z = new byte[1];
        this.f136160E = i13;
    }

    @Override // p284ko.InterfaceC22628l
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p284ko.InterfaceC22628l
    public final Map getResponseHeaders() {
        return this.f136161w.getResponseHeaders();
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        return this.f136161w.getUri();
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) {
        int i15 = this.f136160E;
        InterfaceC22628l interfaceC22628l = this.f136161w;
        if (i15 == 0) {
            byte[] bArr2 = this.f136164z;
            int i16 = 0;
            if (interfaceC22628l.read(bArr2, 0, 1) != -1) {
                int i17 = (bArr2[0] & 255) << 4;
                if (i17 != 0) {
                    byte[] bArr3 = new byte[i17];
                    int i18 = i17;
                    while (i18 > 0) {
                        int i19 = interfaceC22628l.read(bArr3, i16, i18);
                        if (i19 != -1) {
                            i16 += i19;
                            i18 -= i19;
                        }
                    }
                    while (i17 > 0 && bArr3[i17 - 1] == 0) {
                        i17--;
                    }
                    if (i17 > 0) {
                        C13117a c13117a = new C13117a(bArr3, i17, 1, false);
                        C32736h0 c32736h0 = this.f136163y;
                        long jMax = !c32736h0.f136104m ? c32736h0.f136100i : Math.max(c32736h0.f136105n.m102722w(), c32736h0.f136100i);
                        int iM36692a = c13117a.m36692a();
                        C32754q0 c32754q0 = c32736h0.f136103l;
                        c32754q0.getClass();
                        c32754q0.mo102732c(iM36692a, c13117a);
                        c32754q0.mo102733d(jMax, 1, iM36692a, 0, null);
                        c32736h0.f136104m = true;
                    }
                }
                this.f136160E = this.f136162x;
            }
            return -1;
        }
        int i24 = interfaceC22628l.read(bArr, i13, Math.min(this.f136160E, i14));
        if (i24 != -1) {
            this.f136160E -= i24;
        }
        return i24;
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: y */
    public final void mo65561y(InterfaceC22625j0 interfaceC22625j0) {
        interfaceC22625j0.getClass();
        this.f136161w.mo65561y(interfaceC22625j0);
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) {
        throw new UnsupportedOperationException();
    }
}
