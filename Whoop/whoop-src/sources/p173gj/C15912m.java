package p173gj;

import dc3.C11923h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import l83.C23454a0;
import p223ik.EnumC18597a;
import p255jk.C21743a;
import p505ts.AbstractC34132o;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: gj.m */
/* JADX INFO: loaded from: classes.dex */
public final class C15912m extends C37199o {

    /* JADX INFO: renamed from: E */
    public boolean f60195E;

    /* JADX INFO: renamed from: F */
    public long f60196F;

    /* JADX INFO: renamed from: G */
    public long f60197G;

    /* JADX INFO: renamed from: y */
    public final C11923h f60198y;

    /* JADX INFO: renamed from: z */
    public final AtomicLong f60199z;

    public C15912m() {
        super(25, false);
        this.f60198y = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);
        this.f60199z = new AtomicLong(-1L);
        this.f60197G = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x016a A[DONT_INVERT, PHI: r0 r4 r6 r8
      0x016a: PHI (r0v15 gj.m) = (r0v1 gj.m), (r0v5 gj.m), (r0v6 gj.m), (r0v9 gj.m), (r0v17 gj.m) binds: [B:29:0x00e6, B:17:0x007f, B:39:0x0117, B:45:0x013a, B:52:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r4v32 jk.a) = (r4v21 jk.a), (r4v24 jk.a), (r4v25 jk.a), (r4v27 jk.a), (r4v33 jk.a) binds: [B:29:0x00e6, B:17:0x007f, B:39:0x0117, B:45:0x013a, B:52:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r6v13 int) = (r6v3 int), (r6v6 int), (r6v7 int), (r6v10 int), (r6v14 int) binds: [B:29:0x00e6, B:17:0x007f, B:39:0x0117, B:45:0x013a, B:52:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r8v5 java.lang.Iterable) = 
      (r8v0 java.lang.Iterable)
      (r8v0 java.lang.Iterable)
      (r8v2 java.lang.Iterable)
      (r8v0 java.lang.Iterable)
      (r8v6 java.lang.Iterable)
     binds: [B:29:0x00e6, B:17:0x007f, B:39:0x0117, B:45:0x013a, B:52:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0183  */
    /* JADX WARN: Code duplicated, block: B:65:0x018d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f2 A[LOOP:0: B:81:0x01ec->B:83:0x01f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0136, code lost:
    
        if (r0.m44891e0(r9, r2) == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0150, code lost:
    
        if (r4 == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0166, code lost:
    
        if (r0.m44891e0(r9, r2) == r3) goto L76;
     */
    /* JADX INFO: renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m44889d0(p173gj.C15912m r17, p173gj.C15908i r18, s83.AbstractC32269c r19) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p173gj.C15912m.m44889d0(gj.m, gj.i, s83.c):java.lang.Object");
    }

    @Override // p581we.C37199o
    /* JADX INFO: renamed from: N */
    public final void mo44890N(C21743a incomingEvent) {
        AbstractC22676k.m65750j(incomingEvent, "incomingEvent");
        if (incomingEvent.f83631c == null) {
            incomingEvent.f83631c = Long.valueOf(System.currentTimeMillis());
        }
        this.f60198y.mo32218s(new C15908i(incomingEvent));
    }

    /* JADX INFO: renamed from: e0 */
    public final Object m44891e0(long j7, AbstractC32269c abstractC32269c) {
        long j13 = this.f60199z.get();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (j13 >= 0) {
            this.f60197G = j7;
            m119204G().m44885f().mo33425b(EnumC18597a.LAST_EVENT_TIME, String.valueOf(this.f60197G));
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: f0 */
    public final Object m44892f0(long j7, AbstractC32269c abstractC32269c) {
        AtomicLong atomicLong = this.f60199z;
        atomicLong.set(j7);
        m119204G().m44885f().mo33425b(EnumC18597a.PREVIOUS_SESSION_ID, String.valueOf(atomicLong.get()));
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: g0 */
    public final Object m44893g0(long j7, AbstractC32269c abstractC32269c) {
        C15910k c15910k;
        boolean zContains;
        C15912m c15912m;
        List list;
        boolean z4;
        long j13;
        List list2;
        C15912m c15912m2;
        List list3;
        long j14 = j7;
        if (abstractC32269c instanceof C15910k) {
            c15910k = (C15910k) abstractC32269c;
            int i13 = c15910k.f60187G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15910k.f60187G = i13 - Integer.MIN_VALUE;
            } else {
                c15910k = new C15910k(this, abstractC32269c);
            }
        } else {
            c15910k = new C15910k(this, abstractC32269c);
        }
        Object obj = c15910k.f60185E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15910k.f60187G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            ArrayList arrayList = new ArrayList();
            zContains = m119204G().f60128a.f60169r.contains(EnumC15904e.f60146w);
            if (zContains) {
                AtomicLong atomicLong = this.f60199z;
                if (atomicLong.get() >= 0) {
                    C21743a c21743a = new C21743a();
                    c21743a.f83624M = "session_end";
                    long j15 = this.f60197G;
                    c21743a.f83631c = j15 > 0 ? new Long(j15) : null;
                    c21743a.f83633e = new Long(atomicLong.get());
                    arrayList.add(c21743a);
                }
            }
            c15910k.f60188w = this;
            c15910k.f60189x = arrayList;
            c15910k.f60190y = j14;
            c15910k.f60191z = zContains;
            c15910k.f60187G = 1;
            if (m44892f0(j14, c15910k) != enumC31071a) {
                c15912m = this;
                list = arrayList;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            boolean z13 = c15910k.f60191z;
            long j16 = c15910k.f60190y;
            List list4 = c15910k.f60189x;
            C15912m c15912m3 = c15910k.f60188w;
            AbstractC34132o.m107864I(obj);
            list = list4;
            zContains = z13;
            j14 = j16;
            c15912m = c15912m3;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = c15910k.f60191z;
            j13 = c15910k.f60190y;
            list3 = c15910k.f60189x;
            c15912m2 = c15910k.f60188w;
            AbstractC34132o.m107864I(obj);
        }
        if (z4) {
            list2 = list3;
            C21743a c21743a2 = new C21743a();
            c21743a2.f83624M = "session_start";
            c21743a2.f83631c = new Long(j13);
            c21743a2.f83633e = new Long(c15912m2.f60199z.get());
            list2.add(c21743a2);
        }
        list2 = list3;
        return list2;
        c15910k.f60188w = c15912m;
        c15910k.f60189x = list;
        c15910k.f60190y = j14;
        c15910k.f60191z = zContains;
        c15910k.f60187G = 2;
        if (c15912m.m44891e0(j14, c15910k) != enumC31071a) {
            long j17 = j14;
            z4 = zContains;
            j13 = j17;
            list2 = list;
            c15912m2 = c15912m;
            if (z4) {
                list2 = list3;
                C21743a c21743a3 = new C21743a();
                c21743a3.f83624M = "session_start";
                c21743a3.f83631c = new Long(j13);
                c21743a3.f83633e = new Long(c15912m2.f60199z.get());
                list2.add(c21743a3);
            }
            list2 = list3;
            return list2;
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h0 */
    public final Object m44894h0(long j7, AbstractC32269c abstractC32269c) {
        C15911l c15911l;
        Object objM44893g0;
        if (abstractC32269c instanceof C15911l) {
            c15911l = (C15911l) abstractC32269c;
            int i13 = c15911l.f60194y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15911l.f60194y = i13 - Integer.MIN_VALUE;
            } else {
                c15911l = new C15911l(this, abstractC32269c);
            }
        } else {
            c15911l = new C15911l(this, abstractC32269c);
        }
        Object obj = c15911l.f60192w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c15911l.f60194y;
        if (i14 != 0) {
            if (i14 == 1) {
                AbstractC34132o.m107864I(obj);
                return null;
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        if (this.f60199z.get() >= 0) {
            if (j7 - this.f60197G < m119204G().f60128a.f60162k) {
                c15911l.f60194y = 1;
                if (m44891e0(j7, c15911l) != obj2) {
                    return null;
                }
            } else {
                c15911l.f60194y = 2;
                objM44893g0 = m44893g0(j7, c15911l);
                if (objM44893g0 == obj2) {
                    return objM44893g0;
                }
            }
        } else {
            c15911l.f60194y = 2;
            objM44893g0 = m44893g0(j7, c15911l);
            if (objM44893g0 == obj2) {
                return objM44893g0;
            }
        }
        return obj2;
    }
}
