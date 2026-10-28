package qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41045p;
import p690zr.C41056u0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: qa.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C30098c implements InterfaceC30100e {

    /* JADX INFO: renamed from: y */
    public static final C41045p f122823y = new C41045p(new C30097b(0), C41056u0.f177063x);

    /* JADX INFO: renamed from: w */
    public final AbstractC41023g0 f122824w;

    /* JADX INFO: renamed from: x */
    public final long[] f122825x;

    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    public C30098c(C41060w0 c41060w0) {
        int i13 = c41060w0.f177069z;
        long j7 = -9223372036854775807L;
        int i14 = 0;
        if (i13 == 1) {
            C41017e0 c41017e0ListIterator = c41060w0.listIterator(0);
            Object next = c41017e0ListIterator.next();
            if (c41017e0ListIterator.hasNext()) {
                StringBuilder sb4 = new StringBuilder("expected one element but was: <");
                sb4.append(next);
                while (i14 < 4 && c41017e0ListIterator.hasNext()) {
                    sb4.append(", ");
                    sb4.append(c41017e0ListIterator.next());
                    i14++;
                }
                if (c41017e0ListIterator.hasNext()) {
                    sb4.append(", ...");
                }
                sb4.append('>');
                throw new IllegalArgumentException(sb4.toString());
            }
            C30096a c30096a = (C30096a) next;
            long j13 = c30096a.f122819b;
            AbstractC41023g0 abstractC41023g0 = c30096a.f122818a;
            long j14 = c30096a.f122820c;
            long j15 = j13 == -9223372036854775807L ? 0L : j13;
            if (j14 == -9223372036854775807L) {
                this.f122824w = AbstractC41023g0.m133256r(abstractC41023g0);
                this.f122825x = new long[]{j15};
                return;
            } else {
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                this.f122824w = AbstractC41023g0.m133257t(abstractC41023g0, C41060w0.f177067E);
                this.f122825x = new long[]{j15, j14 + j15};
                return;
            }
        }
        long[] jArr = new long[i13 * 2];
        this.f122825x = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        C41060w0 c41060w0M133258u = AbstractC41023g0.m133258u(f122823y, c41060w0);
        int i15 = 0;
        while (i14 < c41060w0M133258u.f177069z) {
            C30096a c30096a2 = (C30096a) c41060w0M133258u.get(i14);
            long j16 = c30096a2.f122819b;
            long j17 = c30096a2.f122820c;
            AbstractC41023g0 abstractC41023g1 = c30096a2.f122818a;
            j16 = j16 == j7 ? 0L : j16;
            long j18 = j16 + j17;
            if (i15 != 0) {
                int i16 = i15 - 1;
                long j19 = this.f122825x[i16];
                if (j19 < j16) {
                    this.f122825x[i15] = j16;
                    arrayList.add(abstractC41023g1);
                    i15++;
                } else if (j19 == j16 && ((AbstractC41023g0) arrayList.get(i16)).isEmpty()) {
                    arrayList.set(i16, abstractC41023g1);
                } else {
                    AbstractC38046a.m121826u("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f122825x[i16] = j16;
                    arrayList.set(i16, abstractC41023g1);
                }
            } else {
                this.f122825x[i15] = j16;
                arrayList.add(abstractC41023g1);
                i15++;
            }
            if (j17 != j7) {
                this.f122825x[i15] = j18;
                arrayList.add(C41060w0.f177067E);
                i15++;
            }
            i14++;
            j7 = j7;
        }
        this.f122824w = AbstractC41023g0.m133252m(arrayList);
    }

    @Override // qa.InterfaceC30100e
    /* JADX INFO: renamed from: b */
    public final int mo1673b(long j7) {
        int iM121908a = AbstractC38065t.m121908a(this.f122825x, j7, false);
        if (iM121908a < this.f122824w.size()) {
            return iM121908a;
        }
        return -1;
    }

    @Override // qa.InterfaceC30100e
    /* JADX INFO: renamed from: d */
    public final List mo1674d(long j7) {
        int iM121911d = AbstractC38065t.m121911d(this.f122825x, j7, false);
        if (iM121911d != -1) {
            return (AbstractC41023g0) this.f122824w.get(iM121911d);
        }
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        return C41060w0.f177067E;
    }

    @Override // qa.InterfaceC30100e
    /* JADX INFO: renamed from: h */
    public final long mo1675h(int i13) {
        AbstractC35849g.m113802d(i13 < this.f122824w.size());
        return this.f122825x[i13];
    }

    @Override // qa.InterfaceC30100e
    /* JADX INFO: renamed from: j */
    public final int mo1676j() {
        return this.f122824w.size();
    }
}
