package p077d0;

import e93.AbstractC12889b;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C11344e {

    /* JADX INFO: renamed from: a */
    public final C11351f2 f36341a;

    /* JADX INFO: renamed from: b */
    public final Object f36342b;

    /* JADX INFO: renamed from: c */
    public final C11376m f36343c;

    /* JADX INFO: renamed from: d */
    public final C28633k1 f36344d;

    /* JADX INFO: renamed from: e */
    public final C28633k1 f36345e;

    /* JADX INFO: renamed from: f */
    public final C11402t0 f36346f;

    /* JADX INFO: renamed from: g */
    public final C11362i1 f36347g;

    /* JADX INFO: renamed from: h */
    public final AbstractC11395r f36348h;

    /* JADX INFO: renamed from: i */
    public final AbstractC11395r f36349i;

    /* JADX INFO: renamed from: j */
    public final AbstractC11395r f36350j;

    /* JADX INFO: renamed from: k */
    public final AbstractC11395r f36351k;

    public C11344e(Object obj, C11351f2 c11351f2, Object obj2) {
        this.f36341a = c11351f2;
        this.f36342b = obj2;
        C11376m c11376m = new C11376m(c11351f2, obj, null, 60);
        this.f36343c = c11376m;
        this.f36344d = AbstractC28683x.m87272z(Boolean.FALSE);
        this.f36345e = AbstractC28683x.m87272z(obj);
        this.f36346f = new C11402t0();
        this.f36347g = new C11362i1(obj2, 3);
        AbstractC11395r abstractC11395r = c11376m.f36472y;
        boolean z4 = abstractC11395r instanceof C11380n;
        AbstractC11395r abstractC11395r2 = z4 ? AbstractC11348f.f36363e : abstractC11395r instanceof C11384o ? AbstractC11348f.f36364f : abstractC11395r instanceof C11388p ? AbstractC11348f.f36365g : AbstractC11348f.f36366h;
        this.f36348h = abstractC11395r2;
        AbstractC11395r abstractC11395r3 = z4 ? AbstractC11348f.f36359a : abstractC11395r instanceof C11384o ? AbstractC11348f.f36360b : abstractC11395r instanceof C11388p ? AbstractC11348f.f36361c : AbstractC11348f.f36362d;
        this.f36349i = abstractC11395r3;
        this.f36350j = abstractC11395r2;
        this.f36351k = abstractC11395r3;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m30545a(C11344e c11344e, Object obj) {
        C11351f2 c11351f2 = c11344e.f36341a;
        AbstractC11395r abstractC11395r = c11344e.f36351k;
        AbstractC11395r abstractC11395r2 = c11344e.f36350j;
        if (!AbstractC22676k.m65745e(abstractC11395r2, c11344e.f36348h) || !AbstractC22676k.m65745e(abstractC11395r, c11344e.f36349i)) {
            AbstractC11395r abstractC11395r3 = (AbstractC11395r) c11351f2.f36396a.invoke(obj);
            int iMo30608b = abstractC11395r3.mo30608b();
            boolean z4 = false;
            for (int i13 = 0; i13 < iMo30608b; i13++) {
                if (abstractC11395r3.mo30607a(i13) < abstractC11395r2.mo30607a(i13) || abstractC11395r3.mo30607a(i13) > abstractC11395r.mo30607a(i13)) {
                    abstractC11395r3.mo30611e(AbstractC12889b.m36283m(abstractC11395r3.mo30607a(i13), abstractC11395r2.mo30607a(i13), abstractC11395r.mo30607a(i13)), i13);
                    z4 = true;
                }
            }
            if (z4) {
                return c11351f2.f36397b.invoke(abstractC11395r3);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static final void m30546b(C11344e c11344e) {
        C11376m c11376m = c11344e.f36343c;
        c11376m.f36472y.mo30610d();
        c11376m.f36473z = Long.MIN_VALUE;
        c11344e.f36344d.setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d */
    public static Object m30547d(C11344e c11344e, Object obj, InterfaceC11372l interfaceC11372l, Function1 function1, InterfaceC30057d interfaceC30057d, int i13) {
        if ((i13 & 2) != 0) {
            interfaceC11372l = c11344e.f36347g;
        }
        InterfaceC11372l interfaceC11372l2 = interfaceC11372l;
        Object objInvoke = c11344e.f36341a.f36397b.invoke(c11344e.f36343c.f36472y);
        if ((i13 & 8) != 0) {
            function1 = null;
        }
        return c11344e.m30548c(obj, interfaceC11372l2, objInvoke, function1, interfaceC30057d);
    }

    /* JADX INFO: renamed from: c */
    public final Object m30548c(Object obj, InterfaceC11372l interfaceC11372l, Object obj2, Function1 function1, InterfaceC30057d interfaceC30057d) {
        Object objM30549e = m30549e();
        C11351f2 c11351f2 = this.f36341a;
        return C11402t0.m30636a(this.f36346f, new C11332b(this, obj2, new C11390p1(interfaceC11372l, c11351f2, objM30549e, obj, (AbstractC11395r) c11351f2.f36396a.invoke(obj2)), this.f36343c.f36473z, function1, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: e */
    public final Object m30549e() {
        return this.f36343c.f36471x.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m30550f() {
        return ((Boolean) this.f36344d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final Object m30551g(Object obj, InterfaceC30057d interfaceC30057d) {
        Object objM30636a = C11402t0.m30636a(this.f36346f, new C11336c(this, obj, null), interfaceC30057d);
        return objM30636a == EnumC31071a.f128113w ? objM30636a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m30552h(AbstractC32275i abstractC32275i) {
        Object objM30636a = C11402t0.m30636a(this.f36346f, new C11340d(this, null, 0), abstractC32275i);
        return objM30636a == EnumC31071a.f128113w ? objM30636a : C23454a0.f92919a;
    }

    public /* synthetic */ C11344e(Object obj, C11351f2 c11351f2, Object obj2, int i13) {
        this(obj, c11351f2, (i13 & 4) != 0 ? null : obj2);
    }
}
