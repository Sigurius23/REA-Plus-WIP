package oe3;

import c93.InterfaceC4351m;
import java.io.IOException;
import l83.C23454a0;
import ne3.C26621j0;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: oe3.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C27890j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C22669g0 f112465E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112466w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22669g0 f112467x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26621j0 f112468y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C22669g0 f112469z;

    public /* synthetic */ C27890j(C22669g0 c22669g0, C26621j0 c26621j0, C22669g0 c22669g1, C22669g0 c22669g2) {
        this.f112467x = c22669g0;
        this.f112468y = c26621j0;
        this.f112469z = c22669g1;
        this.f112465E = c22669g2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i13 = this.f112466w;
        int iIntValue = ((Integer) obj).intValue();
        Long l7 = (Long) obj2;
        switch (i13) {
            case 0:
                long jLongValue = l7.longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    C26621j0 c26621j0 = this.f112468y;
                    byte b = c26621j0.readByte();
                    boolean z4 = (b & 1) == 1;
                    boolean z13 = (b & 2) == 2;
                    boolean z14 = (b & 4) == 4;
                    long j7 = z4 ? 5L : 1L;
                    if (z13) {
                        j7 += 4;
                    }
                    if (z14) {
                        j7 += 4;
                    }
                    if (jLongValue < j7) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z4) {
                        this.f112467x.f89336w = Integer.valueOf(c26621j0.mo79192Q0());
                    }
                    if (z13) {
                        this.f112469z.f89336w = Integer.valueOf(c26621j0.mo79192Q0());
                    }
                    if (z14) {
                        this.f112465E.f89336w = Integer.valueOf(c26621j0.mo79192Q0());
                    }
                }
                return C23454a0.f92919a;
            default:
                long jLongValue2 = l7.longValue();
                if (iIntValue == 1) {
                    C22669g0 c22669g0 = this.f112467x;
                    if (c22669g0.f89336w != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    C26621j0 c26621j1 = this.f112468y;
                    c22669g0.f89336w = Long.valueOf(c26621j1.mo79204e0());
                    this.f112469z.f89336w = Long.valueOf(c26621j1.mo79204e0());
                    this.f112465E.f89336w = Long.valueOf(c26621j1.mo79204e0());
                }
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C27890j(C26621j0 c26621j0, C22669g0 c22669g0, C22669g0 c22669g1, C22669g0 c22669g2) {
        this.f112468y = c26621j0;
        this.f112467x = c22669g0;
        this.f112469z = c22669g1;
        this.f112465E = c22669g2;
    }
}
