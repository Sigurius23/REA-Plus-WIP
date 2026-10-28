package pn;

import ed3.C13117a;
import in.C18715c;
import in.C18717e;
import in.InterfaceC18714b;
import io.sentry.config.AbstractC20301a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p309lo.C24561s;
import p309lo.C24566x;

/* JADX INFO: renamed from: pn.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C29370d extends AbstractC20301a {

    /* JADX INFO: renamed from: b */
    public final C13117a f119124b = new C13117a();

    /* JADX INFO: renamed from: c */
    public final C24561s f119125c = new C24561s(0);

    /* JADX INFO: renamed from: d */
    public C24566x f119126d;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // io.sentry.config.AbstractC20301a
    /* JADX INFO: renamed from: t */
    public final C18715c mo56358t(C18717e c18717e, ByteBuffer byteBuffer) {
        int i13;
        InterfaceC18714b c29373g;
        long j7;
        long j13;
        long j14;
        boolean z4;
        boolean z13;
        boolean z14;
        int iM36682D;
        int iM36715y;
        int iM36715y2;
        long jM36716z;
        boolean z15;
        long j15;
        long j16;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i14;
        int i15;
        int iM36715y3;
        long j17;
        boolean z24;
        long j18;
        C13117a c13117a = this.f119124b;
        C24561s c24561s = this.f119125c;
        C24566x c24566x = this.f119126d;
        if (c24566x != null) {
            long j19 = c18717e.f73527I;
            synchronized (c24566x) {
                j18 = c24566x.f95872b;
            }
            if (j19 != j18) {
                C24566x c24566x2 = new C24566x(c18717e.f148797F);
                this.f119126d = c24566x2;
                c24566x2.m71659a(c18717e.f148797F - c18717e.f73527I);
            }
        } else {
            C24566x c24566x3 = new C24566x(c18717e.f148797F);
            this.f119126d = c24566x3;
            c24566x3.m71659a(c18717e.f148797F - c18717e.f73527I);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        c13117a.m36687I(iLimit, bArrArray);
        c24561s.m71638o(iLimit, bArrArray);
        c24561s.m71643t(39);
        boolean z25 = true;
        long jM71632i = (((long) c24561s.m71632i(1)) << 32) | ((long) c24561s.m71632i(32));
        c24561s.m71643t(20);
        int iM71632i = c24561s.m71632i(12);
        int iM71632i2 = c24561s.m71632i(8);
        c13117a.m36690L(14);
        if (iM71632i2 == 0) {
            i13 = 0;
            c29373g = new C29373g();
        } else if (iM71632i2 != 255) {
            long j24 = 1;
            long jM36716z2 = -9223372036854775807L;
            if (iM71632i2 == 4) {
                int iM36715y4 = c13117a.m36715y();
                ArrayList arrayList = new ArrayList(iM36715y4);
                int i16 = 0;
                while (i16 < iM36715y4) {
                    long jM36716z3 = c13117a.m36716z();
                    boolean z26 = (c13117a.m36715y() & 128) != 0 ? z25 : false;
                    ArrayList arrayList2 = new ArrayList();
                    if (z26) {
                        j7 = j24;
                        j13 = -9223372036854775807L;
                        j14 = -9223372036854775807L;
                        z4 = false;
                        z13 = false;
                        z14 = false;
                        iM36682D = 0;
                        iM36715y = 0;
                        iM36715y2 = 0;
                    } else {
                        int iM36715y5 = c13117a.m36715y();
                        boolean z27 = (iM36715y5 & 128) != 0 ? z25 : false;
                        boolean z28 = (iM36715y5 & 64) != 0 ? z25 : false;
                        boolean z29 = (iM36715y5 & 32) != 0 ? z25 : false;
                        long jM36716z4 = z28 ? c13117a.m36716z() : -9223372036854775807L;
                        if (!z28) {
                            int iM36715y6 = c13117a.m36715y();
                            ArrayList arrayList3 = new ArrayList(iM36715y6);
                            int i17 = 0;
                            while (i17 < iM36715y6) {
                                arrayList3.add(new C29374h(c13117a.m36715y(), c13117a.m36716z()));
                                i17++;
                                j24 = j24;
                            }
                            arrayList2 = arrayList3;
                        }
                        j7 = j24;
                        if (z29) {
                            long jM36715y = c13117a.m36715y();
                            z15 = (jM36715y & 128) != 0;
                            jM36716z = ((((jM36715y & j7) << 32) | c13117a.m36716z()) * 1000) / 90;
                        } else {
                            jM36716z = -9223372036854775807L;
                            z15 = false;
                        }
                        j14 = jM36716z;
                        z14 = z15;
                        iM36682D = c13117a.m36682D();
                        z4 = z27;
                        z13 = z28;
                        j13 = jM36716z4;
                        iM36715y = c13117a.m36715y();
                        iM36715y2 = c13117a.m36715y();
                    }
                    arrayList.add(new C29375i(jM36716z3, z26, z4, z13, arrayList2, j13, z14, j14, iM36682D, iM36715y, iM36715y2));
                    i16++;
                    j24 = j7;
                    z25 = true;
                }
                c29373g = new C29376j(arrayList);
            } else if (iM71632i2 == 5) {
                C24566x c24566x4 = this.f119126d;
                long jM36716z5 = c13117a.m36716z();
                boolean z34 = (c13117a.m36715y() & 128) != 0;
                List list = Collections.EMPTY_LIST;
                if (z34) {
                    j15 = -9223372036854775807L;
                    j16 = -9223372036854775807L;
                    z16 = false;
                    z17 = false;
                    z18 = false;
                    z19 = false;
                    i14 = 0;
                    i15 = 0;
                    iM36715y3 = 0;
                } else {
                    int iM36715y7 = c13117a.m36715y();
                    boolean z35 = (iM36715y7 & 128) != 0;
                    boolean z36 = (iM36715y7 & 64) != 0;
                    boolean z37 = (iM36715y7 & 32) != 0;
                    boolean z38 = (iM36715y7 & 16) != 0;
                    long jM89533b = (!z36 || z38) ? -9223372036854775807L : C29377k.m89533b(jM71632i, c13117a);
                    if (z36) {
                        j17 = 90;
                    } else {
                        int iM36715y8 = c13117a.m36715y();
                        ArrayList arrayList4 = new ArrayList(iM36715y8);
                        j17 = 90;
                        for (int i18 = 0; i18 < iM36715y8; i18++) {
                            int iM36715y9 = c13117a.m36715y();
                            long jM89533b2 = !z38 ? C29377k.m89533b(jM71632i, c13117a) : -9223372036854775807L;
                            arrayList4.add(new C29371e(iM36715y9, jM89533b2, c24566x4.m71660b(jM89533b2)));
                        }
                        list = arrayList4;
                    }
                    if (z37) {
                        long jM36715y2 = c13117a.m36715y();
                        z24 = (jM36715y2 & 128) != 0;
                        jM36716z2 = ((((jM36715y2 & 1) << 32) | c13117a.m36716z()) * 1000) / j17;
                    } else {
                        z24 = false;
                    }
                    int iM36682D2 = c13117a.m36682D();
                    int iM36715y10 = c13117a.m36715y();
                    iM36715y3 = c13117a.m36715y();
                    z19 = z24;
                    z16 = z35;
                    i14 = iM36682D2;
                    i15 = iM36715y10;
                    j16 = jM36716z2;
                    long j25 = jM89533b;
                    z18 = z38;
                    z17 = z36;
                    j15 = j25;
                }
                c29373g = new C29372f(jM36716z5, z34, z16, z17, z18, j15, c24566x4.m71660b(j15), list, z19, j16, i14, i15, iM36715y3);
            } else if (iM71632i2 != 6) {
                c29373g = null;
            } else {
                C24566x c24566x5 = this.f119126d;
                long jM89533b3 = C29377k.m89533b(jM71632i, c13117a);
                c29373g = new C29377k(jM89533b3, c24566x5.m71660b(jM89533b3));
            }
            i13 = 0;
        } else {
            long jM36716z6 = c13117a.m36716z();
            int i19 = iM71632i - 4;
            byte[] bArr = new byte[i19];
            i13 = 0;
            c13117a.m36697g(bArr, 0, i19);
            c29373g = new C29368b(jM36716z6, bArr, jM71632i);
        }
        if (c29373g == null) {
            return new C18715c(new InterfaceC18714b[i13]);
        }
        InterfaceC18714b[] interfaceC18714bArr = new InterfaceC18714b[1];
        interfaceC18714bArr[i13] = c29373g;
        return new C18715c(interfaceC18714bArr);
    }
}
