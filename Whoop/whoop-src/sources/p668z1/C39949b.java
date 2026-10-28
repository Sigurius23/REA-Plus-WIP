package p668z1;

import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.C25271y;
import p002a0.AbstractC0018e1;
import p002a0.C0059w0;
import p390p1.AbstractC28657q1;
import p446r1.C30851e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: z1.b */
/* JADX INFO: loaded from: classes.dex */
public class C39949b extends AbstractC39957f {

    /* JADX INFO: renamed from: n */
    public static final int[] f172409n = new int[0];

    /* JADX INFO: renamed from: e */
    public final Function1 f172410e;

    /* JADX INFO: renamed from: f */
    public final Function1 f172411f;

    /* JADX INFO: renamed from: g */
    public int f172412g;

    /* JADX INFO: renamed from: h */
    public C0059w0 f172413h;

    /* JADX INFO: renamed from: i */
    public ArrayList f172414i;

    /* JADX INFO: renamed from: j */
    public C39961j f172415j;

    /* JADX INFO: renamed from: k */
    public int[] f172416k;

    /* JADX INFO: renamed from: l */
    public int f172417l;

    /* JADX INFO: renamed from: m */
    public boolean f172418m;

    public C39949b(long j7, C39961j c39961j, Function1 function1, Function1 function2) {
        super(j7, c39961j);
        this.f172410e = function1;
        this.f172411f = function2;
        this.f172415j = C39961j.f172454E;
        this.f172416k = f172409n;
        this.f172417l = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m128130A(long j7) {
        synchronized (AbstractC39963l.f172462c) {
            this.f172415j = this.f172415j.m128160g(j7);
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo128131B(C0059w0 c0059w0) {
        this.f172413h = c0059w0;
    }

    /* JADX INFO: renamed from: C */
    public C39949b mo128121C(Function1 function1, Function1 function2) throws Throwable {
        if (this.f172444c) {
            AbstractC28657q1.m87188a("Cannot use a disposed snapshot");
        }
        if (this.f172418m && this.f172445d < 0) {
            AbstractC28657q1.m87189b("Unsupported operation on a disposed or applied snapshot");
        }
        m128130A(mo128147g());
        Object obj = AbstractC39963l.f172462c;
        synchronized (obj) {
            try {
                long j7 = AbstractC39963l.f172464e;
                long j13 = 1;
                AbstractC39963l.f172464e = j7 + j13;
                AbstractC39963l.f172463d = AbstractC39963l.f172463d.m128160g(j7);
                C39961j c39961jMo128146d = mo128146d();
                mo128148r(c39961jMo128146d.m128160g(j7));
                try {
                    C39951c c39951c = new C39951c(j7, AbstractC39963l.m128165e(c39961jMo128146d, mo128147g() + j13, j7), AbstractC39963l.m128172l(function1, mo128133e(), true), AbstractC39963l.m128162b(function2, mo128136i()), this);
                    if (this.f172418m || this.f172444c) {
                        return c39951c;
                    }
                    long jMo128147g = mo128147g();
                    synchronized (obj) {
                        long j14 = AbstractC39963l.f172464e;
                        AbstractC39963l.f172464e = j14 + j13;
                        mo128149s(j14);
                        AbstractC39963l.f172463d = AbstractC39963l.f172463d.m128160g(mo128147g());
                    }
                    mo128148r(AbstractC39963l.m128165e(mo128146d(), jMo128147g + j13, mo128147g()));
                    return c39951c;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: b */
    public final void mo128132b() {
        AbstractC39963l.f172463d = AbstractC39963l.f172463d.m128157c(mo128147g()).m128156a(this.f172415j);
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: c */
    public void mo128122c() {
        if (this.f172444c) {
            return;
        }
        this.f172444c = true;
        synchronized (AbstractC39963l.f172462c) {
            m128154o();
        }
        mo128124l();
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: f */
    public boolean mo128134f() {
        return false;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: h */
    public int mo128135h() {
        return this.f172412g;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: i */
    public Function1 mo128136i() {
        return this.f172411f;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: k */
    public void mo128123k() {
        this.f172417l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: l */
    public void mo128124l() {
        if (this.f172417l <= 0) {
            AbstractC28657q1.m87188a("no pending nested snapshots");
        }
        int i13 = this.f172417l - 1;
        this.f172417l = i13;
        if (i13 != 0 || this.f172418m) {
            return;
        }
        C0059w0 c0059w0Mo128141x = mo128141x();
        if (c0059w0Mo128141x != null) {
            if (this.f172418m) {
                AbstractC28657q1.m87189b("Unsupported operation on a snapshot that has been applied");
            }
            mo128131B(null);
            long jMo128147g = mo128147g();
            Object[] objArr = c0059w0Mo128141x.f178b;
            long[] jArr = c0059w0Mo128141x.f177a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j7 = jArr[i14];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i14 != length) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((255 & j7) < 128) {
                                for (AbstractC39950b0 abstractC39950b0Mo87010N = ((InterfaceC39977z) objArr[(i14 << 3) + i16]).mo87010N(); abstractC39950b0Mo87010N != null; abstractC39950b0Mo87010N = abstractC39950b0Mo87010N.f172420b) {
                                    long j13 = abstractC39950b0Mo87010N.f172419a;
                                    if (j13 == jMo128147g || AbstractC25265s.m74155w0(this.f172415j, Long.valueOf(j13))) {
                                        C39962k c39962k = AbstractC39963l.f172460a;
                                        abstractC39950b0Mo87010N.f172419a = 0L;
                                    }
                                }
                            }
                            j7 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        } else if (i14 != length) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
            }
        }
        m128152a();
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: m */
    public void mo128125m() {
        if (this.f172418m || this.f172444c) {
            return;
        }
        m128140v();
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: n */
    public void mo128137n(InterfaceC39977z interfaceC39977z) {
        C0059w0 c0059w0Mo128141x = mo128141x();
        if (c0059w0Mo128141x == null) {
            C0059w0 c0059w0 = AbstractC0018e1.f44a;
            c0059w0Mo128141x = new C0059w0();
            mo128131B(c0059w0Mo128141x);
        }
        c0059w0Mo128141x.m136a(interfaceC39977z);
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: p */
    public final void mo128138p() {
        int length = this.f172416k.length;
        for (int i13 = 0; i13 < length; i13++) {
            AbstractC39963l.m128181u(this.f172416k[i13]);
        }
        m128154o();
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: t */
    public void mo128139t(int i13) {
        this.f172412g = i13;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: u */
    public AbstractC39957f mo128126u(Function1 function1) throws Throwable {
        if (this.f172444c) {
            AbstractC28657q1.m87188a("Cannot use a disposed snapshot");
        }
        if (this.f172418m && this.f172445d < 0) {
            AbstractC28657q1.m87189b("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo128147g = mo128147g();
        m128130A(mo128147g());
        Object obj = AbstractC39963l.f172462c;
        synchronized (obj) {
            try {
                long j7 = AbstractC39963l.f172464e;
                long j13 = 1;
                AbstractC39963l.f172464e = j7 + j13;
                AbstractC39963l.f172463d = AbstractC39963l.f172463d.m128160g(j7);
                try {
                    C39953d c39953d = new C39953d(j7, AbstractC39963l.m128165e(mo128146d(), jMo128147g + j13, j7), AbstractC39963l.m128172l(function1, mo128133e(), true), this);
                    if (this.f172418m || this.f172444c) {
                        return c39953d;
                    }
                    long jMo128147g2 = mo128147g();
                    synchronized (obj) {
                        long j14 = AbstractC39963l.f172464e;
                        AbstractC39963l.f172464e = j14 + j13;
                        mo128149s(j14);
                        AbstractC39963l.f172463d = AbstractC39963l.f172463d.m128160g(mo128147g());
                    }
                    mo128148r(AbstractC39963l.m128165e(mo128146d(), jMo128147g2 + j13, mo128147g()));
                    return c39953d;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m128140v() {
        long j7;
        m128130A(mo128147g());
        if (this.f172418m || this.f172444c) {
            return;
        }
        long jMo128147g = mo128147g();
        synchronized (AbstractC39963l.f172462c) {
            long j13 = AbstractC39963l.f172464e;
            j7 = 1;
            AbstractC39963l.f172464e = j13 + j7;
            mo128149s(j13);
            AbstractC39963l.f172463d = AbstractC39963l.f172463d.m128160g(mo128147g());
        }
        mo128148r(AbstractC39963l.m128165e(mo128146d(), jMo128147g + j7, mo128147g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150 A[EDGE_INSN: B:101:0x0150->B:77:0x0150 BREAK  A[LOOP:4: B:66:0x0121->B:76:0x014d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x010e A[Catch: all -> 0x0104, LOOP:2: B:48:0x00dc->B:60:0x010e, LOOP_END, TryCatch #0 {all -> 0x0104, blocks: (B:43:0x00c0, B:45:0x00d0, B:48:0x00dc, B:50:0x00e8, B:52:0x00f2, B:54:0x00f8, B:57:0x0106, B:63:0x0117, B:66:0x0121, B:68:0x012b, B:70:0x0135, B:72:0x013b, B:73:0x0145, B:76:0x014d, B:77:0x0150, B:79:0x0154, B:81:0x015b, B:82:0x0167, B:60:0x010e), top: B:90:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x014d A[Catch: all -> 0x0104, LOOP:4: B:66:0x0121->B:76:0x014d, LOOP_END, TryCatch #0 {all -> 0x0104, blocks: (B:43:0x00c0, B:45:0x00d0, B:48:0x00dc, B:50:0x00e8, B:52:0x00f2, B:54:0x00f8, B:57:0x0106, B:63:0x0117, B:66:0x0121, B:68:0x012b, B:70:0x0135, B:72:0x013b, B:73:0x0145, B:76:0x014d, B:77:0x0150, B:79:0x0154, B:81:0x015b, B:82:0x0167, B:60:0x010e), top: B:90:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0115 A[EDGE_INSN: B:96:0x0115->B:62:0x0115 BREAK  A[LOOP:2: B:48:0x00dc->B:60:0x010e], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: w */
    public AbstractC39968q mo128127w() {
        HashMap mapM128163c;
        ?? r10;
        C0059w0 c0059w0;
        long j7;
        long j13;
        C0059w0 c0059w0Mo128141x = mo128141x();
        if (c0059w0Mo128141x != null) {
            long j14 = AbstractC39963l.f172469j.f172443b;
            mapM128163c = AbstractC39963l.m128163c(j14, this, AbstractC39963l.f172463d.m128157c(j14));
        } else {
            mapM128163c = null;
        }
        C25271y c25271y = C25271y.f99162w;
        synchronized (AbstractC39963l.f172462c) {
            try {
                AbstractC39963l.m128164d(this);
                if (c0059w0Mo128141x == null || c0059w0Mo128141x.f180d == 0) {
                    mo128132b();
                    C39947a c39947a = AbstractC39963l.f172469j;
                    C0059w0 c0059w1 = c39947a.f172413h;
                    AbstractC39963l.m128182v(c39947a, AbstractC39963l.f172460a);
                    if (c0059w1 == null || !c0059w1.m143h()) {
                        r10 = c25271y;
                        c0059w0 = null;
                    } else {
                        r10 = AbstractC39963l.f172467h;
                        c0059w0 = c0059w1;
                    }
                } else {
                    C39947a c39947a2 = AbstractC39963l.f172469j;
                    AbstractC39968q abstractC39968qM128143z = m128143z(AbstractC39963l.f172464e, c0059w0Mo128141x, mapM128163c, AbstractC39963l.f172463d.m128157c(c39947a2.f172443b));
                    if (!abstractC39968qM128143z.equals(C39959h.f172447b)) {
                        return abstractC39968qM128143z;
                    }
                    mo128132b();
                    c0059w0 = c39947a2.f172413h;
                    AbstractC39963l.m128182v(c39947a2, AbstractC39963l.f172460a);
                    mo128131B(null);
                    c39947a2.f172413h = null;
                    r10 = AbstractC39963l.f172467h;
                }
                this.f172418m = true;
                if (c0059w0 != null) {
                    C30851e c30851e = new C30851e(c0059w0);
                    if (!c0059w0.m142g()) {
                        int size = ((Collection) r10).size();
                        for (int i13 = 0; i13 < size; i13++) {
                            ((InterfaceC4351m) r10.get(i13)).invoke(c30851e, this);
                        }
                    }
                }
                if (c0059w0Mo128141x != null && c0059w0Mo128141x.m143h()) {
                    C30851e c30851e2 = new C30851e(c0059w0Mo128141x);
                    int size2 = ((Collection) r10).size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        ((InterfaceC4351m) r10.get(i14)).invoke(c30851e2, this);
                    }
                }
                synchronized (AbstractC39963l.f172462c) {
                    try {
                        mo128138p();
                        AbstractC39963l.m128167g();
                        if (c0059w0 != null) {
                            Object[] objArr = c0059w0.f178b;
                            long[] jArr = c0059w0.f177a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i15 = 0;
                                j7 = 128;
                                while (true) {
                                    long j15 = jArr[i15];
                                    j13 = 255;
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i15 != length) {
                                            break;
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j15 & 255) < 128) {
                                                AbstractC39963l.m128177q((InterfaceC39977z) objArr[(i15 << 3) + i17]);
                                            }
                                            j15 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                        if (i15 != length) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            } else {
                                j7 = 128;
                                j13 = 255;
                            }
                        } else {
                            j7 = 128;
                            j13 = 255;
                        }
                        if (c0059w0Mo128141x != null) {
                            Object[] objArr2 = c0059w0Mo128141x.f178b;
                            long[] jArr2 = c0059w0Mo128141x.f177a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i18 = 0;
                                while (true) {
                                    long j16 = jArr2[i18];
                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i18 != length2) {
                                            break;
                                            break;
                                        }
                                        i18++;
                                    } else {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        for (int i24 = 0; i24 < i19; i24++) {
                                            if ((j16 & j13) < j7) {
                                                AbstractC39963l.m128177q((InterfaceC39977z) objArr2[(i18 << 3) + i24]);
                                            }
                                            j16 >>= 8;
                                        }
                                        if (i19 != 8) {
                                            break;
                                        }
                                        if (i18 != length2) {
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f172414i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i25 = 0; i25 < size3; i25++) {
                                AbstractC39963l.m128177q((InterfaceC39977z) arrayList.get(i25));
                            }
                        }
                        this.f172414i = null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return C39959h.f172447b;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public C0059w0 mo128141x() {
        return this.f172413h;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 mo128133e() {
        return this.f172410e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[LOOP:3: B:79:0x01a7->B:80:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final AbstractC39968q m128143z(long j7, C0059w0 c0059w0, HashMap map, C39961j c39961j) {
        ArrayList arrayList;
        ArrayList arrayListM74129g1;
        ArrayList arrayList2;
        int size;
        int i13;
        ArrayList arrayList3;
        int size2;
        int i14;
        InterfaceC39977z interfaceC39977z;
        AbstractC39950b0 abstractC39950b0;
        C39961j c39961j2;
        Object[] objArr;
        long[] jArr;
        C39961j c39961j3;
        Object[] objArr2;
        long[] jArr2;
        int i15;
        long j13;
        ArrayList arrayList4;
        AbstractC39950b0 abstractC39950b0Mo87020S;
        C39961j c39961jM128159e = mo128146d().m128160g(mo128147g()).m128159e(this.f172415j);
        Object[] objArr3 = c0059w0.f178b;
        long[] jArr3 = c0059w0.f177a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i16 = 0;
            arrayList2 = null;
            arrayListM74129g1 = null;
            while (true) {
                long j14 = jArr3[i16];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j14 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC39977z interfaceC39977z2 = (InterfaceC39977z) objArr3[(i16 << 3) + i18];
                            jArr2 = jArr3;
                            AbstractC39950b0 abstractC39950b0Mo87010N = interfaceC39977z2.mo87010N();
                            i15 = i18;
                            ArrayList arrayList5 = arrayList2;
                            AbstractC39950b0 abstractC39950b0M128179s = AbstractC39963l.m128179s(abstractC39950b0Mo87010N, j7, c39961j);
                            if (abstractC39950b0M128179s == null) {
                                c39961j3 = c39961jM128159e;
                                arrayList4 = arrayListM74129g1;
                                j13 = j14;
                            } else {
                                arrayList4 = arrayListM74129g1;
                                j13 = j14;
                                AbstractC39950b0 abstractC39950b0M128179s2 = AbstractC39963l.m128179s(abstractC39950b0Mo87010N, mo128147g(), c39961jM128159e);
                                if (abstractC39950b0M128179s2 == null) {
                                    c39961j3 = c39961jM128159e;
                                } else {
                                    c39961j3 = c39961jM128159e;
                                    if (abstractC39950b0M128179s2.f172419a != 1 && !abstractC39950b0M128179s.equals(abstractC39950b0M128179s2)) {
                                        AbstractC39950b0 abstractC39950b0M128179s3 = AbstractC39963l.m128179s(abstractC39950b0Mo87010N, mo128147g(), mo128146d());
                                        if (abstractC39950b0M128179s3 == null) {
                                            AbstractC39963l.m128178r();
                                            throw null;
                                        }
                                        if (map == null || (abstractC39950b0Mo87020S = (AbstractC39950b0) map.get(abstractC39950b0M128179s)) == null) {
                                            abstractC39950b0Mo87020S = interfaceC39977z2.mo87020S(abstractC39950b0M128179s2, abstractC39950b0M128179s, abstractC39950b0M128179s3);
                                        }
                                        if (abstractC39950b0Mo87020S == null) {
                                            return new C39958g(this);
                                        }
                                        if (!abstractC39950b0Mo87020S.equals(abstractC39950b0M128179s3)) {
                                            if (abstractC39950b0Mo87020S.equals(abstractC39950b0M128179s)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new C23465k(interfaceC39977z2, abstractC39950b0M128179s.mo86986b(mo128147g())));
                                                arrayListM74129g1 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayListM74129g1.add(interfaceC39977z2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList2.add(!abstractC39950b0Mo87020S.equals(abstractC39950b0M128179s2) ? new C23465k(interfaceC39977z2, abstractC39950b0Mo87020S) : new C23465k(interfaceC39977z2, abstractC39950b0M128179s2.mo86986b(mo128147g())));
                                            }
                                        }
                                        arrayListM74129g1 = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListM74129g1 = arrayList4;
                        } else {
                            c39961j3 = c39961jM128159e;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i15 = i18;
                            j13 = j14;
                        }
                        j14 = j13 >> 8;
                        i18 = i15 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c39961jM128159e = c39961j3;
                    }
                    c39961j2 = c39961jM128159e;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i17 != 8) {
                        break;
                    }
                } else {
                    c39961j2 = c39961jM128159e;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i16 != length) {
                    i16++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    c39961jM128159e = c39961j2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                m128140v();
                size2 = arrayList2.size();
                for (i14 = 0; i14 < size2; i14++) {
                    C23465k c23465k = (C23465k) arrayList2.get(i14);
                    interfaceC39977z = (InterfaceC39977z) c23465k.f92937w;
                    abstractC39950b0 = (AbstractC39950b0) c23465k.f92938x;
                    abstractC39950b0.f172419a = j7;
                    synchronized (AbstractC39963l.f172462c) {
                        abstractC39950b0.f172420b = interfaceC39977z.mo87010N();
                        interfaceC39977z.mo87011m0(abstractC39950b0);
                    }
                }
            }
            if (arrayListM74129g1 != null) {
                size = arrayListM74129g1.size();
                for (i13 = 0; i13 < size; i13++) {
                    c0059w0.m147l((InterfaceC39977z) arrayListM74129g1.get(i13));
                }
                arrayList3 = this.f172414i;
                if (arrayList3 != null) {
                    arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList3, arrayListM74129g1);
                }
                this.f172414i = arrayListM74129g1;
            }
            return C39959h.f172447b;
        }
        arrayList = null;
        arrayListM74129g1 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m128140v();
            size2 = arrayList2.size();
            while (i14 < size2) {
                C23465k c23465k2 = (C23465k) arrayList2.get(i14);
                interfaceC39977z = (InterfaceC39977z) c23465k2.f92937w;
                abstractC39950b0 = (AbstractC39950b0) c23465k2.f92938x;
                abstractC39950b0.f172419a = j7;
                synchronized (AbstractC39963l.f172462c) {
                    abstractC39950b0.f172420b = interfaceC39977z.mo87010N();
                    interfaceC39977z.mo87011m0(abstractC39950b0);
                }
            }
        }
        if (arrayListM74129g1 != null) {
            size = arrayListM74129g1.size();
            while (i13 < size) {
                c0059w0.m147l((InterfaceC39977z) arrayListM74129g1.get(i13));
            }
            arrayList3 = this.f172414i;
            if (arrayList3 != null) {
                arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList3, arrayListM74129g1);
            }
            this.f172414i = arrayListM74129g1;
        }
        return C39959h.f172447b;
    }
}
