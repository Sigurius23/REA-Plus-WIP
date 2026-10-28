package oe3;

import java.io.IOException;
import ne3.AbstractC26638s;
import ne3.C26616h;
import ne3.InterfaceC26633p0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: oe3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C27886f extends AbstractC26638s {

    /* JADX INFO: renamed from: x */
    public final long f112440x;

    /* JADX INFO: renamed from: y */
    public final boolean f112441y;

    /* JADX INFO: renamed from: z */
    public long f112442z;

    public C27886f(InterfaceC26633p0 interfaceC26633p0, long j7, boolean z4) {
        super(interfaceC26633p0);
        this.f112440x = j7;
        this.f112441y = z4;
    }

    @Override // ne3.AbstractC26638s, ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        long j13 = this.f112442z;
        long j14 = this.f112440x;
        if (j13 > j14) {
            j7 = 0;
        } else if (this.f112441y) {
            long j15 = j14 - j13;
            if (j15 == 0) {
                return -1L;
            }
            j7 = Math.min(j7, j15);
        }
        long jMo9164h1 = super.mo9164h1(sink, j7);
        if (jMo9164h1 != -1) {
            this.f112442z += jMo9164h1;
        }
        long j16 = this.f112442z;
        if ((j16 >= j14 || jMo9164h1 != -1) && j16 <= j14) {
            return jMo9164h1;
        }
        if (jMo9164h1 > 0 && j16 > j14) {
            long j17 = sink.f105866x - (j16 - j14);
            C26616h c26616h = new C26616h();
            c26616h.mo79189N0(sink);
            sink.write(c26616h, j17);
            c26616h.m79200b();
        }
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j14, "expected ", " bytes but got ");
        sbM125596b.append(this.f112442z);
        throw new IOException(sbM125596b.toString());
    }
}
