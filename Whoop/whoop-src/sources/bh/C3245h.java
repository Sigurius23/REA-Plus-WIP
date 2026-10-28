package bh;

import android.graphics.Bitmap;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c41.C4065l3;
import c93.InterfaceC4351m;
import ec3.C13036f1;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import gb.C15648i;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import m83.AbstractC25265s;
import mh.C25542j;
import p007a6.C0458v;
import p077d0.C11362i1;
import p114eb.C12982q;
import p163g1.AbstractC14987d7;
import p163g1.C14998e7;
import p163g1.C15093n7;
import p163g1.C15190x4;
import p195hh.C17280k;
import p341nh.C26714h;
import p390p1.C28617g1;
import p390p1.C28676v0;
import p390p1.C28679w;
import p390p1.C28685x1;
import p390p1.C28688y1;
import p390p1.EnumC28681w1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28680w0;
import p390p1.InterfaceC28690z0;
import p476s1.InterfaceC32058e;
import p505ts.AbstractC34132o;
import p511u1.C34396c;
import p540v1.C35523a;
import p540v1.C35524b;
import p569w1.C36688b;
import p636y3.InterfaceC39171c;
import p668z1.AbstractC39963l;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import vd1.C35909c;

/* JADX INFO: renamed from: bh.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3245h extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f12718E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f12719F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f12720G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12721w = 1;

    /* JADX INFO: renamed from: x */
    public int f12722x;

    /* JADX INFO: renamed from: y */
    public Object f12723y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f12724z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3245h(C15093n7 c15093n7, Map map, C15190x4 c15190x4, InterfaceC39171c interfaceC39171c, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        C11362i1 c11362i1 = AbstractC14987d7.f56024a;
        this.f12723y = c15093n7;
        this.f12724z = map;
        this.f12718E = c15190x4;
        this.f12719F = interfaceC39171c;
        this.f12720G = interfaceC4351m;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        int i13 = this.f12721w;
        Object obj2 = this.f12720G;
        Object obj3 = this.f12719F;
        Object obj4 = this.f12718E;
        switch (i13) {
            case 0:
                return new C3245h((C25542j) this.f12723y, (C3247j) this.f12724z, (C26714h) obj4, (C3240c) obj3, (Bitmap) obj2, interfaceC30057d);
            case 1:
                C11362i1 c11362i1 = AbstractC14987d7.f56024a;
                return new C3245h((C15093n7) this.f12723y, (Map) this.f12724z, (C15190x4) obj4, (InterfaceC39171c) obj3, (InterfaceC4351m) obj2, interfaceC30057d);
            case 2:
                C3245h c3245h = new C3245h((C15648i) this.f12724z, (InterfaceC28601c1) obj4, (InterfaceC28690z0) obj3, (InterfaceC28601c1) obj2, interfaceC30057d);
                c3245h.f12723y = obj;
                return c3245h;
            default:
                C3245h c3245h2 = new C3245h((C28688y1) obj4, (C28685x1) obj3, (InterfaceC28680w0) obj2, interfaceC30057d);
                c3245h2.f12724z = obj;
                return c3245h2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12721w) {
            case 0:
                return ((C3245h) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C3245h) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C3245h) create((InterfaceC13058l) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C3245h) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb A[Catch: all -> 0x0107, LOOP:1: B:44:0x00f9->B:45:0x00fb, LOOP_END, TryCatch #3 {all -> 0x0107, blocks: (B:39:0x00e6, B:40:0x00ec, B:42:0x00f1, B:43:0x00f2, B:45:0x00fb, B:48:0x010c, B:66:0x0153, B:67:0x0154, B:41:0x00ed), top: B:149:0x00e6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138 A[Catch: all -> 0x013b, TryCatch #5 {all -> 0x013b, blocks: (B:54:0x0134, B:56:0x0138, B:59:0x013e), top: B:152:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0163 A[Catch: all -> 0x0166, TryCatch #2 {all -> 0x0166, blocks: (B:70:0x015f, B:72:0x0163, B:75:0x0169), top: B:147:0x015f }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C12982q c12982q;
        C13045h2 c13045h2;
        Object obj2;
        C35524b c35524b;
        InterfaceC3027k1 interfaceC3027k1;
        Throwable th3;
        C35909c c35909c;
        C28688y1 c28688y1;
        List listM87294z;
        int size;
        C0458v c0458v;
        C28688y1 c28688y2;
        C28688y1 c28688y3;
        int i13 = 4;
        C12982q c12982q2 = null;
        Object[] objArr = 0;
        switch (this.f12721w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f12722x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C25542j c25542j = (C25542j) this.f12723y;
                C17280k c17280k = new C17280k(c25542j, ((C3247j) this.f12724z).f12734i, 0, c25542j, (C26714h) this.f12718E, (C3240c) this.f12719F, ((Bitmap) this.f12720G) != null);
                this.f12722x = 1;
                Object objM48925b = c17280k.m48925b(c25542j, this);
                return objM48925b == enumC31071a ? enumC31071a : objM48925b;
            case 1:
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) this.f12719F;
                Map map = (Map) this.f12724z;
                C15093n7 c15093n7 = (C15093n7) this.f12723y;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f12722x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Map map2 = (Map) c15093n7.f56516i.getValue();
                    c15093n7.f56516i.setValue(map);
                    c15093n7.f56522o.setValue((C15190x4) this.f12718E);
                    c15093n7.f56520m.setValue(new C14998e7(map, (InterfaceC4351m) this.f12720G, interfaceC39171c, 0));
                    c15093n7.f56521n.m87023y(interfaceC39171c.mo743q0(AbstractC14987d7.f56025b));
                    this.f12722x = 1;
                    if (c15093n7.m43163b(map2, map, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 2:
                InterfaceC28690z0 interfaceC28690z0 = (InterfaceC28690z0) this.f12719F;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f12720G;
                C15648i c15648i = (C15648i) this.f12724z;
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) this.f12718E;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f12722x;
                try {
                    if (i16 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13058l interfaceC13058l = (InterfaceC13058l) this.f12723y;
                        if (((List) interfaceC28601c2.getValue()).size() > 1) {
                            ((C28617g1) interfaceC28690z0).m87023y(0.0f);
                            c12982q2 = (C12982q) AbstractC25265s.m74114R0((List) interfaceC28601c2.getValue());
                            AbstractC22676k.m65747g(c12982q2);
                            c15648i.m36435b().m36497g(c12982q2);
                            c15648i.m36435b().m36497g((C12982q) ((List) interfaceC28601c2.getValue()).get(((List) interfaceC28601c2.getValue()).size() - 2));
                        }
                        C13036f1 c13036f1 = new C13036f1(interfaceC28601c2, interfaceC28601c1, interfaceC28690z0, i13);
                        this.f12723y = c12982q2;
                        this.f12722x = 1;
                        if (interfaceC13058l.collect(c13036f1, this) == enumC31071a3) {
                            return enumC31071a3;
                        }
                        c12982q = c12982q2;
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c12982q = (C12982q) this.f12723y;
                        AbstractC34132o.m107864I(obj);
                    }
                    if (((List) interfaceC28601c2.getValue()).size() > 1) {
                        interfaceC28601c1.setValue(Boolean.FALSE);
                        AbstractC22676k.m65747g(c12982q);
                        c15648i.mo36441i(c12982q, false);
                    }
                    break;
                } catch (CancellationException unused) {
                    if (((List) interfaceC28601c2.getValue()).size() > 1) {
                        interfaceC28601c1.setValue(Boolean.FALSE);
                    }
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i17 = this.f12722x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c35909c = (C35909c) this.f12723y;
                    interfaceC3027k1 = (InterfaceC3027k1) this.f12724z;
                    try {
                        AbstractC34132o.m107864I(obj);
                        c35909c.m114042a();
                        c28688y3 = (C28688y1) this.f12718E;
                        synchronized (c28688y3.f116037c) {
                            try {
                                if (c28688y3.f116038d == interfaceC3027k1) {
                                    c28688y3.f116038d = null;
                                }
                                c28688y3.m87291w();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        C13045h2 c13045h3 = C28688y1.f116034z;
                        C28676v0.m87199b(((C28688y1) this.f12718E).f116059y);
                        return C23454a0.f92919a;
                    } catch (Throwable th5) {
                        th3 = th5;
                        c35909c.m114042a();
                        c28688y2 = (C28688y1) this.f12718E;
                        synchronized (c28688y2.f116037c) {
                            try {
                                if (c28688y2.f116038d == interfaceC3027k1) {
                                    c28688y2.f116038d = null;
                                }
                                c28688y2.m87291w();
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        C13045h2 c13045h4 = C28688y1.f116034z;
                        C28676v0.m87199b(((C28688y1) this.f12718E).f116059y);
                        throw th3;
                    }
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC3027k1 interfaceC3027k1M8725s = AbstractC3006f0.m8725s(((InterfaceC2994c0) this.f12724z).getCoroutineContext());
                C28688y1 c28688y4 = (C28688y1) this.f12718E;
                synchronized (c28688y4.f116037c) {
                    Throwable th7 = c28688y4.f116039e;
                    if (th7 != null) {
                        throw th7;
                    }
                    if (((EnumC28681w1) c28688y4.f116055u.getValue()).compareTo(EnumC28681w1.f116015x) <= 0) {
                        throw new IllegalStateException("Recomposer shut down");
                    }
                    if (c28688y4.f116038d != null) {
                        throw new IllegalStateException("Recomposer already running");
                    }
                    c28688y4.f116038d = interfaceC3027k1M8725s;
                    c28688y4.m87291w();
                }
                C4065l3 c4065l3 = new C4065l3((C28688y1) this.f12718E, 11);
                AbstractC39963l.m128166f(AbstractC39963l.f172460a);
                synchronized (AbstractC39963l.f172462c) {
                    AbstractC39963l.f172467h = AbstractC25265s.m74128f1(c4065l3, (Collection) AbstractC39963l.f172467h);
                }
                C35909c c35909c2 = new C35909c(c4065l3, 4);
                C13045h2 c13045h5 = C28688y1.f116034z;
                C28676v0 c28676v0 = ((C28688y1) this.f12718E).f116059y;
                try {
                    do {
                        c13045h2 = C28688y1.f116034z;
                        obj2 = (InterfaceC32058e) c13045h2.getValue();
                        c35524b = (C35524b) obj2;
                        C36688b c36688b = C36688b.f157125a;
                        C34396c c34396c = c35524b.f151148y;
                        if (!c34396c.containsKey(c28676v0)) {
                            if (c35524b.isEmpty()) {
                                c35524b = new C35524b(c28676v0, c28676v0, c34396c.m108760b(c28676v0, new C35523a(c36688b, c36688b)));
                            } else {
                                Object obj3 = c35524b.f151147x;
                                Object obj4 = c34396c.get(obj3);
                                AbstractC22676k.m65747g(obj4);
                                c35524b = new C35524b(c35524b.f151146w, c28676v0, c34396c.m108760b(obj3, new C35523a(((C35523a) obj4).f151143a, c28676v0)).m108760b(c28676v0, new C35523a(obj3, c36688b)));
                            }
                        }
                        if (obj2 != c35524b) {
                        }
                        c28688y1 = (C28688y1) this.f12718E;
                        synchronized (c28688y1.f116037c) {
                            listM87294z = c28688y1.m87294z();
                        }
                        size = listM87294z.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            ((C28679w) listM87294z.get(i18)).m87225s();
                        }
                        c0458v = new C0458v(this.f12719F, this.f12720G, (InterfaceC30057d) (objArr == true ? 1 : 0), 17);
                        this.f12724z = interfaceC3027k1M8725s;
                        this.f12723y = c35909c2;
                        this.f12722x = 1;
                        if (AbstractC3006f0.m8719m(c0458v, this) == enumC31071a4) {
                            return enumC31071a4;
                        }
                        interfaceC3027k1 = interfaceC3027k1M8725s;
                        c35909c = c35909c2;
                        c35909c.m114042a();
                        c28688y3 = (C28688y1) this.f12718E;
                        synchronized (c28688y3.f116037c) {
                            if (c28688y3.f116038d == interfaceC3027k1) {
                                c28688y3.f116038d = null;
                            }
                            c28688y3.m87291w();
                            C13045h2 c13045h6 = C28688y1.f116034z;
                            C28676v0.m87199b(((C28688y1) this.f12718E).f116059y);
                            return C23454a0.f92919a;
                        }
                    } while (!c13045h2.m36569i(obj2, c35524b));
                    c28688y1 = (C28688y1) this.f12718E;
                    synchronized (c28688y1.f116037c) {
                        listM87294z = c28688y1.m87294z();
                        size = listM87294z.size();
                        while (i18 < size) {
                            ((C28679w) listM87294z.get(i18)).m87225s();
                        }
                        c0458v = new C0458v(this.f12719F, this.f12720G, (InterfaceC30057d) (objArr == true ? 1 : 0), 17);
                        this.f12724z = interfaceC3027k1M8725s;
                        this.f12723y = c35909c2;
                        this.f12722x = 1;
                        if (AbstractC3006f0.m8719m(c0458v, this) == enumC31071a4) {
                            return enumC31071a4;
                        }
                        interfaceC3027k1 = interfaceC3027k1M8725s;
                        c35909c = c35909c2;
                        c35909c.m114042a();
                        c28688y3 = (C28688y1) this.f12718E;
                        synchronized (c28688y3.f116037c) {
                            if (c28688y3.f116038d == interfaceC3027k1) {
                                c28688y3.f116038d = null;
                            }
                            c28688y3.m87291w();
                            C13045h2 c13045h7 = C28688y1.f116034z;
                            C28676v0.m87199b(((C28688y1) this.f12718E).f116059y);
                            return C23454a0.f92919a;
                        }
                    }
                } catch (Throwable th8) {
                    interfaceC3027k1 = interfaceC3027k1M8725s;
                    th3 = th8;
                    c35909c = c35909c2;
                    c35909c.m114042a();
                    c28688y2 = (C28688y1) this.f12718E;
                    synchronized (c28688y2.f116037c) {
                        if (c28688y2.f116038d == interfaceC3027k1) {
                            c28688y2.f116038d = null;
                        }
                        c28688y2.m87291w();
                        C13045h2 c13045h8 = C28688y1.f116034z;
                        C28676v0.m87199b(((C28688y1) this.f12718E).f116059y);
                        throw th3;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3245h(C15648i c15648i, InterfaceC28601c1 interfaceC28601c1, InterfaceC28690z0 interfaceC28690z0, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f12724z = c15648i;
        this.f12718E = interfaceC28601c1;
        this.f12719F = interfaceC28690z0;
        this.f12720G = interfaceC28601c2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3245h(C25542j c25542j, C3247j c3247j, C26714h c26714h, C3240c c3240c, Bitmap bitmap, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f12723y = c25542j;
        this.f12724z = c3247j;
        this.f12718E = c26714h;
        this.f12719F = c3240c;
        this.f12720G = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3245h(C28688y1 c28688y1, C28685x1 c28685x1, InterfaceC28680w0 interfaceC28680w0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f12718E = c28688y1;
        this.f12719F = c28685x1;
        this.f12720G = interfaceC28680w0;
    }
}
