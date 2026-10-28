package be;

import cg.C4559n;
import cg.C4560o;
import p003a1.C0106e;
import p007a6.C0416e;
import p048ce.C4470k;
import p116ef.C13140a;
import p474s.C31983m2;
import p505ts.AbstractC34132o;
import p522uf.C34896w;
import p522uf.InterfaceC34875f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: be.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C3158k implements InterfaceC34875f {

    /* JADX INFO: renamed from: w */
    public final InterfaceC35967n f12360w;

    /* JADX INFO: renamed from: x */
    public final C31983m2 f12361x;

    /* JADX INFO: renamed from: y */
    public final C31983m2 f12362y;

    public C3158k(InterfaceC35967n platformProvider) {
        AbstractC22676k.m65750j(platformProvider, "platformProvider");
        this.f12360w = platformProvider;
        this.f12361x = new C31983m2(new C0106e(1, this, C3158k.class, "doResolveEndpoint", "doResolveEndpoint(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10));
        this.f12362y = new C31983m2(new C0416e(this, null, 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9055a(AbstractC32269c abstractC32269c) throws Throwable {
        C3155h c3155h;
        if (abstractC32269c instanceof C3155h) {
            c3155h = (C3155h) abstractC32269c;
            int i13 = c3155h.f12353y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3155h.f12353y = i13 - Integer.MIN_VALUE;
            } else {
                c3155h = new C3155h(this, abstractC32269c);
            }
        } else {
            c3155h = new C3155h(this, abstractC32269c);
        }
        Object objM99483g = c3155h.f12351w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3155h.f12353y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM99483g);
            c3155h.f12353y = 1;
            objM99483g = this.f12362y.m99483g(c3155h);
            if (objM99483g == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM99483g);
        }
        String strM13963a = ((C4470k) objM99483g).m13963a("ec2_metadata_service_endpoint", null);
        if (strM13963a != null) {
            return new C13140a(C4559n.m14242a(C4560o.f18367i, strM13963a));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Enum m9056b(AbstractC32269c abstractC32269c) throws Throwable {
        C3156i c3156i;
        if (abstractC32269c instanceof C3156i) {
            c3156i = (C3156i) abstractC32269c;
            int i13 = c3156i.f12356y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3156i.f12356y = i13 - Integer.MIN_VALUE;
            } else {
                c3156i = new C3156i(this, abstractC32269c);
            }
        } else {
            c3156i = new C3156i(this, abstractC32269c);
        }
        Object objM99483g = c3156i.f12354w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3156i.f12356y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM99483g);
            c3156i.f12356y = 1;
            objM99483g = this.f12362y.m99483g(c3156i);
            if (objM99483g == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM99483g);
        }
        String strM13963a = ((C4470k) objM99483g).m13963a("ec2_metadata_service_endpoint_mode", null);
        if (strM13963a == null) {
            return null;
        }
        EnumC3149b.f12327x.getClass();
        return C3148a.m9050a(strM13963a);
    }

    @Override // p522uf.InterfaceC34875f
    /* JADX INFO: renamed from: c */
    public final Object mo8834c(C34896w c34896w, InterfaceC30057d interfaceC30057d) {
        return this.f12361x.m99483g((AbstractC32269c) interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9057d(q83.InterfaceC30057d r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof be.C3157j
            if (r0 == 0) goto L13
            r0 = r9
            be.j r0 = (be.C3157j) r0
            int r1 = r0.f12359y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12359y = r1
            goto L18
        L13:
            be.j r0 = new be.j
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f12357w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f12359y
            vg.n r3 = r8.f12360w
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            p505ts.AbstractC34132o.m107864I(r9)
            goto L82
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            p505ts.AbstractC34132o.m107864I(r9)
            goto L5e
        L39:
            p505ts.AbstractC34132o.m107864I(r9)
            jf.a r9 = p646yd.AbstractC39455f.f169749k
            java.lang.Object r9 = p250jf.AbstractC21636e.m60881b(r9, r3)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L52
            ef.a r2 = new ef.a
            cg.n r7 = cg.C4560o.f18367i
            cg.o r9 = cg.C4559n.m14242a(r7, r9)
            r2.<init>(r9)
            goto L53
        L52:
            r2 = r6
        L53:
            if (r2 != 0) goto L61
            r0.f12359y = r5
            java.lang.Object r9 = r8.m9055a(r0)
            if (r9 != r1) goto L5e
            goto L81
        L5e:
            r2 = r9
            ef.a r2 = (p116ef.C13140a) r2
        L61:
            if (r2 == 0) goto L64
            return r2
        L64:
            jf.a r9 = p646yd.AbstractC39455f.f169750l
            java.lang.Object r9 = p250jf.AbstractC21636e.m60881b(r9, r3)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L77
            be.a r2 = be.EnumC3149b.f12327x
            r2.getClass()
            be.b r6 = be.C3148a.m9050a(r9)
        L77:
            if (r6 != 0) goto L89
            r0.f12359y = r4
            java.lang.Enum r9 = r8.m9056b(r0)
            if (r9 != r1) goto L82
        L81:
            return r1
        L82:
            r6 = r9
            be.b r6 = (be.EnumC3149b) r6
            if (r6 != 0) goto L89
            be.b r6 = be.EnumC3149b.f12328y
        L89:
            ef.a r9 = r6.f12330w
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: be.C3158k.m9057d(q83.d):java.lang.Object");
    }
}
