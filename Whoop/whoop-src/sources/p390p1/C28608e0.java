package p390p1;

import p002a0.AbstractC0065z0;
import p002a0.C0039m0;
import p446r1.C30849c;
import p668z1.AbstractC39950b0;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.InterfaceC39977z;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28608e0 extends AbstractC39950b0 {

    /* JADX INFO: renamed from: h */
    public static final Object f115731h = new Object();

    /* JADX INFO: renamed from: c */
    public long f115732c;

    /* JADX INFO: renamed from: d */
    public int f115733d;

    /* JADX INFO: renamed from: e */
    public C0039m0 f115734e;

    /* JADX INFO: renamed from: f */
    public Object f115735f;

    /* JADX INFO: renamed from: g */
    public int f115736g;

    public C28608e0(long j7) {
        super(j7);
        C0039m0 c0039m0 = AbstractC0065z0.f204a;
        AbstractC22676k.m65748h(c0039m0, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f115734e = c0039m0;
        this.f115735f = f115731h;
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: a */
    public final void mo86985a(AbstractC39950b0 abstractC39950b0) {
        AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        C28608e0 c28608e0 = (C28608e0) abstractC39950b0;
        this.f115734e = c28608e0.f115734e;
        this.f115735f = c28608e0.f115735f;
        this.f115736g = c28608e0.f115736g;
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: b */
    public final AbstractC39950b0 mo86986b(long j7) {
        return new C28608e0(j7);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m86987c(C28612f0 c28612f0, AbstractC39957f abstractC39957f) {
        boolean z4;
        boolean z13;
        Object obj = AbstractC39963l.f172462c;
        synchronized (obj) {
            z4 = true;
            z13 = (this.f115732c == abstractC39957f.mo128147g() && this.f115733d == abstractC39957f.mo128135h()) ? false : true;
        }
        if (this.f115735f == f115731h || (z13 && this.f115736g != m86988d(c28612f0, abstractC39957f))) {
            z4 = false;
        }
        if (!z4 || !z13) {
            return z4;
        }
        synchronized (obj) {
            this.f115732c = abstractC39957f.mo128147g();
            this.f115733d = abstractC39957f.mo128135h();
        }
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d4 A[LOOP:4: B:48:0x00d2->B:49:0x00d4, LOOP_END] */
    /* JADX INFO: renamed from: d */
    public final int m86988d(C28612f0 c28612f0, AbstractC39957f abstractC39957f) throws Throwable {
        C0039m0 c0039m0;
        int iIdentityHashCode;
        Object[] objArr;
        int i13;
        int i14;
        long[] jArr;
        int i15;
        int i16;
        int i17;
        AbstractC39950b0 abstractC39950b0M87012x;
        synchronized (AbstractC39963l.f172462c) {
            c0039m0 = this.f115734e;
        }
        int i18 = 7;
        if (c0039m0.f118e == 0) {
            return 7;
        }
        C30849c c30849cM87263q = AbstractC28683x.m87263q();
        Object[] objArr2 = c30849cM87263q.f127227w;
        int i19 = c30849cM87263q.f127229y;
        for (int i24 = 0; i24 < i19; i24++) {
            ((C28651p) objArr2[i24]).m87114b();
        }
        try {
            Object[] objArr3 = c0039m0.f115b;
            int[] iArr = c0039m0.f116c;
            long[] jArr2 = c0039m0.f114a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i25 = 0;
                while (true) {
                    long j7 = jArr2[i25];
                    if ((((~j7) << i18) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i26 = 8;
                        int i27 = 8 - ((~(i25 - length)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j7 & 255) < 128) {
                                int i29 = (i25 << 3) + i28;
                                Object obj = objArr3[i29];
                                i16 = i18;
                                int i34 = iArr[i29];
                                i17 = i26;
                                InterfaceC39977z interfaceC39977z = (InterfaceC39977z) obj;
                                if (i34 == 1) {
                                    if (interfaceC39977z instanceof C28612f0) {
                                        try {
                                            C28612f0 c28612f1 = (C28612f0) interfaceC39977z;
                                            abstractC39950b0M87012x = c28612f1.m87012x((C28608e0) AbstractC39963l.m128170j(c28612f1.f115755z, abstractC39957f), abstractC39957f, false, c28612f1.f115753x);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            Object[] objArr4 = c30849cM87263q.f127227w;
                                            int i35 = c30849cM87263q.f127229y;
                                            for (int i36 = 0; i36 < i35; i36++) {
                                                ((C28651p) objArr4[i36]).m87113a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        abstractC39950b0M87012x = AbstractC39963l.m128170j(interfaceC39977z.mo87010N(), abstractC39957f);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(abstractC39950b0M87012x)) * 31) + Long.hashCode(abstractC39950b0M87012x.f172419a);
                                }
                            } else {
                                i16 = i18;
                                i17 = i26;
                            }
                            j7 >>= i17;
                            i28++;
                            i18 = i16;
                            jArr2 = jArr2;
                            i26 = i17;
                        }
                        jArr = jArr2;
                        i15 = i18;
                        if (i27 != i26) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                        i15 = i18;
                    }
                    if (i25 != length) {
                        i25++;
                        i18 = i15;
                        jArr2 = jArr;
                    } else {
                        i18 = iIdentityHashCode;
                    }
                }
                objArr = c30849cM87263q.f127227w;
                i13 = c30849cM87263q.f127229y;
                for (i14 = 0; i14 < i13; i14++) {
                    ((C28651p) objArr[i14]).m87113a();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i18;
            objArr = c30849cM87263q.f127227w;
            i13 = c30849cM87263q.f127229y;
            while (i14 < i13) {
                ((C28651p) objArr[i14]).m87113a();
            }
            return iIdentityHashCode;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
