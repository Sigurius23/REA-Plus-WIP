package p247ja;

import ca.C4358a;
import g73.C15553a;
import g73.C15556d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p309lo.C24561s;
import p516u8.C34585c0;
import p516u8.InterfaceC34583b0;
import p550vd.AbstractC35903f;
import p607x8.C38059n;
import p607x8.C38064s;

/* JADX INFO: renamed from: ja.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C21496c extends AbstractC35903f {

    /* JADX INFO: renamed from: a */
    public final C38059n f82453a = new C38059n();

    /* JADX INFO: renamed from: b */
    public final C24561s f82454b = new C24561s(5);

    /* JADX INFO: renamed from: c */
    public C38064s f82455c;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // p550vd.AbstractC35903f
    /* JADX INFO: renamed from: n */
    public final C34585c0 mo31690n(C4358a c4358a, ByteBuffer byteBuffer) {
        InterfaceC34583b0 c21497d;
        long j7;
        long j13;
        C38059n c38059n = this.f82453a;
        C24561s c24561s = this.f82454b;
        C38064s c38064s = this.f82455c;
        if (c38064s != null) {
            long j14 = c4358a.f17631J;
            synchronized (c38064s) {
                j13 = c38064s.f163028b;
            }
            if (j14 != j13) {
                C38064s c38064s2 = new C38064s(c4358a.f2065G);
                this.f82455c = c38064s2;
                c38064s2.m121882a(c4358a.f2065G - c4358a.f17631J);
            }
        } else {
            C38064s c38064s3 = new C38064s(c4358a.f2065G);
            this.f82455c = c38064s3;
            c38064s3.m121882a(c4358a.f2065G - c4358a.f17631J);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        c38059n.m121844D(iLimit, bArrArray);
        c24561s.m71638o(iLimit, bArrArray);
        c24561s.m71643t(39);
        long jM71632i = (((long) c24561s.m71632i(1)) << 32) | ((long) c24561s.m71632i(32));
        c24561s.m71643t(20);
        int iM71632i = c24561s.m71632i(12);
        int iM71632i2 = c24561s.m71632i(8);
        c38059n.m121847G(14);
        if (iM71632i2 == 0) {
            c21497d = new C21497d();
        } else if (iM71632i2 == 255) {
            long jM121869v = c38059n.m121869v();
            int i13 = iM71632i - 4;
            c38059n.m121852e(new byte[i13], 0, i13);
            c21497d = new C21494a(jM121869v, jM71632i, 0);
        } else if (iM71632i2 == 4) {
            int iM121867t = c38059n.m121867t();
            ArrayList arrayList = new ArrayList(iM121867t);
            for (int i14 = 0; i14 < iM121867t; i14++) {
                c38059n.m121869v();
                boolean z4 = (c38059n.m121867t() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z4) {
                    int iM121867t2 = c38059n.m121867t();
                    boolean z13 = (iM121867t2 & 64) != 0;
                    boolean z14 = (iM121867t2 & 32) != 0;
                    if (z13) {
                        c38059n.m121869v();
                    }
                    if (!z13) {
                        int iM121867t3 = c38059n.m121867t();
                        ArrayList arrayList3 = new ArrayList(iM121867t3);
                        for (int i15 = 0; i15 < iM121867t3; i15++) {
                            c38059n.m121867t();
                            c38059n.m121869v();
                            arrayList3.add(new C15553a(13));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z14) {
                        c38059n.m121867t();
                        c38059n.m121869v();
                    }
                    c38059n.m121873z();
                    c38059n.m121867t();
                    c38059n.m121867t();
                }
                C15556d c15556d = new C15556d(13);
                Collections.unmodifiableList(arrayList2);
                arrayList.add(c15556d);
            }
            c21497d = new C21497d();
            Collections.unmodifiableList(arrayList);
        } else if (iM71632i2 == 5) {
            C38064s c38064s4 = this.f82455c;
            c38059n.m121869v();
            boolean z15 = (c38059n.m121867t() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z15) {
                j7 = -9223372036854775807L;
            } else {
                int iM121867t4 = c38059n.m121867t();
                boolean z16 = (iM121867t4 & 64) != 0;
                boolean z17 = (iM121867t4 & 32) != 0;
                boolean z18 = (iM121867t4 & 16) != 0;
                long jM60456b = (!z16 || z18) ? -9223372036854775807L : C21494a.m60456b(jM71632i, c38059n);
                if (!z16) {
                    int iM121867t5 = c38059n.m121867t();
                    ArrayList arrayList4 = new ArrayList(iM121867t5);
                    for (int i16 = 0; i16 < iM121867t5; i16++) {
                        c38059n.m121867t();
                        c38064s4.m121883b(!z18 ? C21494a.m60456b(jM71632i, c38059n) : -9223372036854775807L);
                        arrayList4.add(new C15556d(12));
                    }
                    list = arrayList4;
                }
                if (z17) {
                    c38059n.m121867t();
                    c38059n.m121869v();
                }
                c38059n.m121873z();
                c38059n.m121867t();
                c38059n.m121867t();
                j7 = jM60456b;
            }
            c21497d = new C21494a(list, j7, c38064s4.m121883b(j7));
        } else if (iM71632i2 != 6) {
            c21497d = null;
        } else {
            C38064s c38064s5 = this.f82455c;
            long jM60456b2 = C21494a.m60456b(jM71632i, c38059n);
            c21497d = new C21494a(jM60456b2, c38064s5.m121883b(jM60456b2), 2);
        }
        return c21497d == null ? new C34585c0(new InterfaceC34583b0[0]) : new C34585c0(c21497d);
    }
}
