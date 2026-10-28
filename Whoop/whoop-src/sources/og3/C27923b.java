package og3;

import com.squareup.wire.AbstractC5583n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jg3.C21676c;
import jg3.C21677d;
import jg3.C21678e;
import jg3.C21689p;
import jg3.EnumC21674a;
import jg3.EnumC21680g;
import kg3.C22466e;
import ng3.EnumC26688a;
import p047c9.C4320k;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: og3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C27923b extends AbstractC27929h implements Serializable {

    /* JADX INFO: renamed from: E */
    public final C21689p[] f112619E;

    /* JADX INFO: renamed from: F */
    public final C27927f[] f112620F;

    /* JADX INFO: renamed from: G */
    public final ConcurrentHashMap f112621G = new ConcurrentHashMap();

    /* JADX INFO: renamed from: w */
    public final long[] f112622w;

    /* JADX INFO: renamed from: x */
    public final C21689p[] f112623x;

    /* JADX INFO: renamed from: y */
    public final long[] f112624y;

    /* JADX INFO: renamed from: z */
    public final C21678e[] f112625z;

    public C27923b(long[] jArr, C21689p[] c21689pArr, long[] jArr2, C21689p[] c21689pArr2, C27927f[] c27927fArr) {
        this.f112622w = jArr;
        this.f112623x = c21689pArr;
        this.f112624y = jArr2;
        this.f112619E = c21689pArr2;
        this.f112620F = c27927fArr;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < jArr2.length) {
            C21689p c21689p = c21689pArr2[i13];
            int i14 = i13 + 1;
            C21689p c21689p2 = c21689pArr2[i14];
            C21678e c21678eM61019u0 = C21678e.m61019u0(jArr2[i13], 0, c21689p);
            int i15 = c21689p.f83282x;
            int i16 = c21689p2.f83282x;
            if (i16 > i15) {
                arrayList.add(c21678eM61019u0);
                arrayList.add(c21678eM61019u0.m61024w0(c21689p2.f83282x - i15));
            } else {
                arrayList.add(c21678eM61019u0.m61024w0(i16 - i15));
                arrayList.add(c21678eM61019u0);
            }
            i13 = i14;
        }
        this.f112625z = (C21678e[]) arrayList.toArray(new C21678e[arrayList.size()]);
    }

    private Object writeReplace() {
        return new C27922a((byte) 1, this);
    }

    @Override // og3.AbstractC27929h
    /* JADX INFO: renamed from: a */
    public final C21689p mo84265a(C21676c c21676c) {
        long j7 = c21676c.f83235F;
        int length = this.f112620F.length;
        C21689p[] c21689pArr = this.f112619E;
        long[] jArr = this.f112624y;
        if (length <= 0 || (jArr.length != 0 && j7 <= jArr[jArr.length - 1])) {
            int iBinarySearch = Arrays.binarySearch(jArr, j7);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return c21689pArr[iBinarySearch + 1];
        }
        C27926e[] c27926eArrM84269e = m84269e(C21677d.m61004u0(AbstractC5583n.m16742A(((long) c21689pArr[c21689pArr.length - 1].f83282x) + j7, 86400L)).f83240F);
        C27926e c27926e = null;
        for (int i13 = 0; i13 < c27926eArrM84269e.length; i13++) {
            c27926e = c27926eArrM84269e[i13];
            C21678e c21678e = c27926e.f112634w;
            C21689p c21689p = c27926e.f112635x;
            if (j7 < c21678e.m64905o0(c21689p)) {
                return c21689p;
            }
        }
        return c27926e.f112636y;
    }

    @Override // og3.AbstractC27929h
    /* JADX INFO: renamed from: b */
    public final C27926e mo84266b(C21678e c21678e) {
        Object objM84270f = m84270f(c21678e);
        if (objM84270f instanceof C27926e) {
            return (C27926e) objM84270f;
        }
        return null;
    }

    @Override // og3.AbstractC27929h
    /* JADX INFO: renamed from: c */
    public final List mo84267c(C21678e c21678e) {
        Object objM84270f = m84270f(c21678e);
        if (!(objM84270f instanceof C27926e)) {
            return Collections.singletonList((C21689p) objM84270f);
        }
        C27926e c27926e = (C27926e) objM84270f;
        C21689p c21689p = c27926e.f112636y;
        int i13 = c21689p.f83282x;
        C21689p c21689p2 = c27926e.f112635x;
        return i13 > c21689p2.f83282x ? Collections.EMPTY_LIST : Arrays.asList(c21689p2, c21689p);
    }

    @Override // og3.AbstractC27929h
    /* JADX INFO: renamed from: d */
    public final boolean mo84268d(C21678e c21678e, C21689p c21689p) {
        return mo84267c(c21678e).contains(c21689p);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final C27926e[] m84269e(int i13) {
        C21677d c21677dM61001p0;
        C21678e c21678eM61018t0;
        C21689p c21689p;
        int iM35485e;
        Integer numValueOf = Integer.valueOf(i13);
        ConcurrentHashMap concurrentHashMap = this.f112621G;
        C27926e[] c27926eArr = (C27926e[]) concurrentHashMap.get(numValueOf);
        if (c27926eArr != null) {
            return c27926eArr;
        }
        C27927f[] c27927fArr = this.f112620F;
        C27926e[] c27926eArr2 = new C27926e[c27927fArr.length];
        for (int i14 = 0; i14 < c27927fArr.length; i14++) {
            C27927f c27927f = c27927fArr[i14];
            C21689p c21689p2 = c27927f.f112640H;
            int i15 = c21689p2.f83282x;
            EnumC21674a enumC21674a = c27927f.f112644y;
            EnumC21680g enumC21680g = c27927f.f112642w;
            byte b = c27927f.f112643x;
            if (b < 0) {
                C22466e c22466e = C22466e.f88015w;
                long j7 = i13;
                int iM61050m = enumC21680g.m61050m(C22466e.isLeapYear(j7)) + 1 + b;
                C21677d c21677d = C21677d.f83237I;
                EnumC26688a.YEAR.m79394f(j7);
                EnumC26688a.DAY_OF_MONTH.m79394f(iM61050m);
                c21677dM61001p0 = C21677d.m61001p0(i13, enumC21680g, iM61050m);
                if (enumC21674a != null) {
                    c21677dM61001p0 = c21677dM61001p0.mo60996j(new C4320k(1, enumC21674a));
                }
            } else {
                C21677d c21677d2 = C21677d.f83237I;
                EnumC26688a.YEAR.m79394f(i13);
                AbstractC5583n.m16762V(enumC21680g, "month");
                EnumC26688a.DAY_OF_MONTH.m79394f(b);
                c21677dM61001p0 = C21677d.m61001p0(i13, enumC21680g, b);
                if (enumC21674a != null) {
                    c21677dM61001p0 = c21677dM61001p0.mo60996j(new C4320k(0, enumC21674a));
                }
                c21678eM61018t0 = C21678e.m61018t0(c21677dM61001p0.m61014x0(c27927f.f112637E), c27927f.f112645z);
                int i16 = c27927f.f112638F;
                c21689p = c27927f.f112639G;
                iM35485e = AbstractC12682p.m35485e(i16);
                if (iM35485e != 0) {
                    c21678eM61018t0 = c21678eM61018t0.m61024w0(i15 - C21689p.f83278F.f83282x);
                } else if (iM35485e != 2) {
                    c21678eM61018t0 = c21678eM61018t0.m61024w0(i15 - c21689p.f83282x);
                }
                c27926eArr2[i14] = new C27926e(c21678eM61018t0, c21689p2, c27927f.f112641I);
            }
            c21678eM61018t0 = C21678e.m61018t0(c21677dM61001p0.m61014x0(c27927f.f112637E), c27927f.f112645z);
            int i17 = c27927f.f112638F;
            c21689p = c27927f.f112639G;
            iM35485e = AbstractC12682p.m35485e(i17);
            if (iM35485e != 0) {
                c21678eM61018t0 = c21678eM61018t0.m61024w0(i15 - C21689p.f83278F.f83282x);
            } else if (iM35485e != 2) {
                c21678eM61018t0 = c21678eM61018t0.m61024w0(i15 - c21689p.f83282x);
            }
            c27926eArr2[i14] = new C27926e(c21678eM61018t0, c21689p2, c27927f.f112641I);
        }
        if (i13 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, c27926eArr2);
        }
        return c27926eArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27923b)) {
            return (obj instanceof C27928g) && m84271g() && mo84265a(C21676c.f83234H).equals(((C27928g) obj).f112646w);
        }
        C27923b c27923b = (C27923b) obj;
        return Arrays.equals(this.f112622w, c27923b.f112622w) && Arrays.equals(this.f112623x, c27923b.f112623x) && Arrays.equals(this.f112624y, c27923b.f112624y) && Arrays.equals(this.f112619E, c27923b.f112619E) && Arrays.equals(this.f112620F, c27923b.f112620F);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r11.f83247G.m61036C0() <= r0.f83247G.m61036C0()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r11.m61021q0(r0) > 0) goto L16;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m84270f(jg3.C21678e r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og3.C27923b.m84270f(jg3.e):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m84271g() {
        return this.f112624y.length == 0 && this.f112620F.length == 0 && this.f112619E[0].equals(this.f112623x[0]);
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f112622w) ^ Arrays.hashCode(this.f112623x)) ^ Arrays.hashCode(this.f112624y)) ^ Arrays.hashCode(this.f112619E)) ^ Arrays.hashCode(this.f112620F);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("StandardZoneRules[currentStandardOffset=");
        C21689p[] c21689pArr = this.f112623x;
        sb4.append(c21689pArr[c21689pArr.length - 1]);
        sb4.append("]");
        return sb4.toString();
    }
}
