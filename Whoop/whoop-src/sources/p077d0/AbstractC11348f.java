package p077d0;

import androidx.compose.runtime.Composer;
import b11.C2275b;
import bp0.C3526n;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.C6659f;
import com.whoop.profile.view.edit.form.C9779c;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p007a6.C0428i;
import p026b2.C2299e;
import p026b2.InterfaceC2317w;
import p027b3.C2384h2;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11348f {

    /* JADX INFO: renamed from: a */
    public static final C11380n f36359a = new C11380n(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static final C11384o f36360b = new C11384o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    public static final C11388p f36361c = new C11388p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final C11392q f36362d = new C11392q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final C11380n f36363e = new C11380n(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    public static final C11384o f36364f = new C11384o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    public static final C11388p f36365g = new C11388p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    public static final C11392q f36366h = new C11392q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i */
    public static final C11351f2 f36367i = new C11351f2(new C6659f(3), new C6659f(20));

    /* JADX INFO: renamed from: j */
    public static final C11351f2 f36368j = new C11351f2(new C6659f(4), new C6659f(5));

    /* JADX INFO: renamed from: k */
    public static final C11351f2 f36369k = new C11351f2(new C6659f(6), new C6659f(7));

    /* JADX INFO: renamed from: l */
    public static final C11351f2 f36370l = new C11351f2(new C6659f(8), new C6659f(9));

    /* JADX INFO: renamed from: m */
    public static final C11351f2 f36371m = new C11351f2(new C6659f(10), new C6659f(11));

    /* JADX INFO: renamed from: n */
    public static final C11351f2 f36372n = new C11351f2(new C6659f(12), new C6659f(13));

    /* JADX INFO: renamed from: o */
    public static final C11351f2 f36373o = new C11351f2(new C6659f(14), new C6659f(15));

    /* JADX INFO: renamed from: p */
    public static final C11351f2 f36374p = new C11351f2(new C6659f(16), new C6659f(17));

    /* JADX INFO: renamed from: q */
    public static final C11351f2 f36375q = new C11351f2(new C6659f(18), new C6659f(19));

    /* JADX INFO: renamed from: a */
    public static C11344e m30553a(float f13) {
        return new C11344e(Float.valueOf(f13), f36367i, Float.valueOf(0.01f), 8);
    }

    /* JADX INFO: renamed from: b */
    public static C11376m m30554b(float f13, float f14, int i13) {
        if ((i13 & 2) != 0) {
            f14 = 0.0f;
        }
        return new C11376m(f36367i, Float.valueOf(f13), new C11380n(f14), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m30555c(float f13, float f14, float f15, InterfaceC11372l interfaceC11372l, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        Float f16 = new Float(f13);
        Float f17 = new Float(f14);
        Float f18 = new Float(f15);
        C11351f2 c11351f2 = f36367i;
        Function1 function1 = c11351f2.f36396a;
        AbstractC11395r abstractC11395rMo30609c = (AbstractC11395r) function1.invoke(f18);
        if (abstractC11395rMo30609c == null) {
            abstractC11395rMo30609c = ((AbstractC11395r) function1.invoke(f16)).mo30609c();
        }
        AbstractC11395r abstractC11395r = abstractC11395rMo30609c;
        Object objM30556d = m30556d(new C11376m(c11351f2, f16, abstractC11395r, 56), new C11390p1(interfaceC11372l, c11351f2, f16, f17, abstractC11395r), Long.MIN_VALUE, new C0428i(interfaceC4351m, 8), interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (objM30556d != enumC31071a) {
            objM30556d = c23454a0;
        }
        return objM30556d == enumC31071a ? objM30556d : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x015d  */
    /* JADX WARN: Code duplicated, block: B:68:0x016a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public static final Object m30556d(C11376m c11376m, InterfaceC11356h interfaceC11356h, long j7, final Function1 function1, InterfaceC30057d interfaceC30057d) {
        C11386o1 c11386o1;
        final C22669g0 c22669g0;
        final C11376m c11376m2;
        C11376m c11376m3;
        C22669g0 c22669g1;
        Object objMo7286k;
        Function1 function2;
        C11368k c11368k;
        C11368k c11368k2;
        Object objMo7286k2;
        final InterfaceC11356h interfaceC11356h2 = interfaceC11356h;
        if (interfaceC30057d instanceof C11386o1) {
            c11386o1 = (C11386o1) interfaceC30057d;
            int i13 = c11386o1.f36509F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11386o1.f36509F = i13 - Integer.MIN_VALUE;
            } else {
                c11386o1 = new C11386o1(interfaceC30057d);
            }
        } else {
            c11386o1 = new C11386o1(interfaceC30057d);
        }
        C11386o1 c11386o2 = c11386o1;
        Object obj = c11386o2.f36508E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11386o2.f36509F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            final Object objMo30596f = interfaceC11356h2.mo30596f(0L);
            final AbstractC11395r abstractC11395rMo30592b = interfaceC11356h2.mo30592b(0L);
            c22669g0 = new C22669g0();
            if (j7 == Long.MIN_VALUE) {
                try {
                    final float fM30568p = m30568p(c11386o2.getContext());
                    c11376m2 = c11376m;
                    try {
                        Function1 function3 = new Function1() { // from class: d0.l1
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                InterfaceC11356h interfaceC11356h3 = interfaceC11356h2;
                                C11351f2 c11351f2Mo30595e = interfaceC11356h3.mo30595e();
                                Object objMo30597g = interfaceC11356h3.mo30597g();
                                C11376m c11376m4 = c11376m2;
                                C11368k c11368k3 = new C11368k(objMo30596f, c11351f2Mo30595e, abstractC11395rMo30592b, jLongValue, objMo30597g, jLongValue, new C11378m1(1, c11376m4));
                                AbstractC11348f.m30566n(c11368k3, jLongValue, fM30568p, interfaceC11356h3, c11376m4, function1);
                                c22669g0.f89336w = c11368k3;
                                return C23454a0.f92919a;
                            }
                        };
                        c22669g1 = c22669g0;
                        try {
                            c11386o2.f36510w = c11376m2;
                            c11386o2.f36511x = interfaceC11356h2;
                            c11386o2.f36512y = function1;
                            c11386o2.f36513z = c22669g1;
                            c11386o2.f36509F = 1;
                            if (interfaceC11356h2.mo30591a()) {
                                objMo7286k = m30576x(function3, c11386o2);
                            } else {
                                objMo7286k = AbstractC28683x.m87268v(c11386o2.getContext()).mo7286k(new C2275b(function3, 3), c11386o2);
                            }
                            if (objMo7286k != enumC31071a) {
                                c11376m3 = c11376m2;
                                function2 = function1;
                                c22669g0 = c22669g1;
                            }
                            return enumC31071a;
                        } catch (CancellationException e5) {
                            e = e5;
                            c11376m3 = c11376m2;
                            c22669g0 = c22669g1;
                            c11368k = (C11368k) c22669g0.f89336w;
                            if (c11368k != null) {
                                c11368k.f36444i.setValue(Boolean.FALSE);
                            }
                            c11368k2 = (C11368k) c22669g0.f89336w;
                            if (c11368k2 != null) {
                                c11376m3.f36469F = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e13) {
                        e = e13;
                        c11376m3 = c11376m2;
                        c11368k = (C11368k) c22669g0.f89336w;
                        if (c11368k != null) {
                            c11368k.f36444i.setValue(Boolean.FALSE);
                        }
                        c11368k2 = (C11368k) c22669g0.f89336w;
                        if (c11368k2 != null) {
                            c11376m3.f36469F = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e14) {
                    e = e14;
                    c11376m2 = c11376m;
                }
            } else {
                c22669g1 = c22669g0;
                try {
                    C11368k c11368k3 = new C11368k(objMo30596f, interfaceC11356h2.mo30595e(), abstractC11395rMo30592b, j7, interfaceC11356h2.mo30597g(), j7, new C11378m1(0, c11376m));
                    m30566n(c11368k3, j7, m30568p(c11386o2.getContext()), interfaceC11356h2, c11376m, function1);
                    c22669g1.f89336w = c11368k3;
                    c11376m3 = c11376m;
                    interfaceC11356h2 = interfaceC11356h;
                    function2 = function1;
                    c22669g0 = c22669g1;
                } catch (CancellationException e15) {
                    e = e15;
                    c11376m3 = c11376m;
                    c22669g0 = c22669g1;
                    c11368k = (C11368k) c22669g0.f89336w;
                    if (c11368k != null) {
                        c11368k.f36444i.setValue(Boolean.FALSE);
                    }
                    c11368k2 = (C11368k) c22669g0.f89336w;
                    if (c11368k2 != null && c11368k2.f36442g == c11376m3.f36473z) {
                        c11376m3.f36469F = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c11386o2.f36513z;
            function2 = c11386o2.f36512y;
            interfaceC11356h2 = c11386o2.f36511x;
            c11376m3 = c11386o2.f36510w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (CancellationException e16) {
                e = e16;
                c11368k = (C11368k) c22669g0.f89336w;
                if (c11368k != null) {
                    c11368k.f36444i.setValue(Boolean.FALSE);
                }
                c11368k2 = (C11368k) c22669g0.f89336w;
                if (c11368k2 != null) {
                    c11376m3.f36469F = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = c22669g0.f89336w;
            AbstractC22676k.m65747g(obj2);
            if (!((Boolean) ((C11368k) obj2).f36444i.getValue()).booleanValue()) {
                return C23454a0.f92919a;
            }
            final float fM30568p2 = m30568p(c11386o2.getContext());
            final C22669g0 c22669g2 = c22669g0;
            final Function1 function4 = function2;
            final InterfaceC11356h interfaceC11356h3 = interfaceC11356h2;
            final C11376m c11376m4 = c11376m3;
            try {
                Function1 function5 = new Function1() { // from class: d0.n1
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = c22669g2.f89336w;
                        AbstractC22676k.m65747g(obj4);
                        AbstractC11348f.m30566n((C11368k) obj4, jLongValue, fM30568p2, interfaceC11356h3, c11376m4, function4);
                        return C23454a0.f92919a;
                    }
                };
                c22669g0 = c22669g2;
                interfaceC11356h2 = interfaceC11356h3;
                c11376m3 = c11376m4;
                function2 = function4;
                c11386o2.f36510w = c11376m3;
                c11386o2.f36511x = interfaceC11356h2;
                c11386o2.f36512y = function2;
                c11386o2.f36513z = c22669g0;
                c11386o2.f36509F = 2;
                if (interfaceC11356h2.mo30591a()) {
                    objMo7286k2 = m30576x(function5, c11386o2);
                } else {
                    objMo7286k2 = AbstractC28683x.m87268v(c11386o2.getContext()).mo7286k(new C2275b(function5, 3), c11386o2);
                }
            } catch (CancellationException e17) {
                e = e17;
                c22669g0 = c22669g2;
                c11376m3 = c11376m4;
                c11368k = (C11368k) c22669g0.f89336w;
                if (c11368k != null) {
                    c11368k.f36444i.setValue(Boolean.FALSE);
                }
                c11368k2 = (C11368k) c22669g0.f89336w;
                if (c11368k2 != null) {
                    c11376m3.f36469F = false;
                }
                throw e;
            }
        } while (objMo7286k2 != enumC31071a);
        return enumC31071a;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m30557e(float f13, float f14, InterfaceC11372l interfaceC11372l, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d, int i13) {
        if ((i13 & 8) != 0) {
            interfaceC11372l = m30573u(0.0f, 0.0f, 7, null);
        }
        return m30555c(f13, f14, 0.0f, interfaceC11372l, interfaceC4351m, interfaceC30057d);
    }

    /* JADX INFO: renamed from: f */
    public static final Object m30558f(C11376m c11376m, C11413x c11413x, boolean z4, Function1 function1, AbstractC32269c abstractC32269c) {
        Object objM30556d = m30556d(c11376m, new C11410w(c11413x, c11376m.f36470w, c11376m.f36471x.getValue(), c11376m.f36472y), z4 ? c11376m.f36473z : Long.MIN_VALUE, function1, abstractC32269c);
        return objM30556d == EnumC31071a.f128113w ? objM30556d : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final C11365j0 m30559g(C11373l0 c11373l0, float f13, float f14, C11361i0 c11361i0, String str, Composer composer, int i13, int i14) {
        if ((i14 & 8) != 0) {
            str = "FloatAnimation";
        }
        Float fValueOf = Float.valueOf(f13);
        Float fValueOf2 = Float.valueOf(f14);
        int i15 = i13 << 3;
        return m30562j(c11373l0, fValueOf, fValueOf2, f36367i, c11361i0, str, composer, (i13 & 1022) | (57344 & i15) | (i15 & 458752), 0);
    }

    /* JADX INFO: renamed from: h */
    public static final Object m30560h(C11376m c11376m, Float f13, InterfaceC11372l interfaceC11372l, boolean z4, Function1 function1, AbstractC32269c abstractC32269c) {
        Object objM30556d = m30556d(c11376m, new C11390p1(interfaceC11372l, c11376m.f36470w, c11376m.f36471x.getValue(), f13, c11376m.f36472y), z4 ? c11376m.f36473z : Long.MIN_VALUE, function1, abstractC32269c);
        return objM30556d == EnumC31071a.f128113w ? objM30556d : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m30561i(C11376m c11376m, Float f13, InterfaceC11372l interfaceC11372l, boolean z4, Function1 function1, AbstractC32269c abstractC32269c, int i13) {
        if ((i13 & 2) != 0) {
            interfaceC11372l = m30573u(0.0f, 0.0f, 7, null);
        }
        InterfaceC11372l interfaceC11372l2 = interfaceC11372l;
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        boolean z13 = z4;
        if ((i13 & 8) != 0) {
            function1 = new C9779c(26);
        }
        return m30560h(c11376m, f13, interfaceC11372l2, z13, function1, abstractC32269c);
    }

    /* JADX INFO: renamed from: j */
    public static final C11365j0 m30562j(C11373l0 c11373l0, Number number, Number number2, C11351f2 c11351f2, C11361i0 c11361i0, String str, Composer composer, int i13, int i14) {
        C11373l0 c11373l1;
        Number number3;
        Number number4;
        C11361i0 c11361i1;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            c11373l1 = c11373l0;
            number3 = number;
            number4 = number2;
            c11361i1 = c11361i0;
            C11365j0 c11365j0 = new C11365j0(c11373l1, number3, number4, c11351f2, c11361i1);
            c28655q.m87172p0(c11365j0);
            objM87133R = c11365j0;
        } else {
            c11373l1 = c11373l0;
            number3 = number;
            number4 = number2;
            c11361i1 = c11361i0;
        }
        C11365j0 c11365j1 = (C11365j0) objM87133R;
        boolean z4 = true;
        boolean z13 = ((((i13 & 112) ^ 48) > 32 && c28655q.m87157i(number3)) || (i13 & 48) == 32) | ((((i13 & 896) ^ 384) > 256 && c28655q.m87157i(number4)) || (i13 & 384) == 256);
        if ((((57344 & i13) ^ 24576) <= 16384 || !c28655q.m87157i(c11361i1)) && (i13 & 24576) != 16384) {
            z4 = false;
        }
        boolean z14 = z13 | z4;
        Object objM87133R2 = c28655q.m87133R();
        if (z14 || objM87133R2 == c28676v0) {
            objM87133R2 = new C11377m0(number3, c11365j1, number4, c11361i1);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87257k((InterfaceC4339a) objM87133R2, c28655q);
        boolean zM87157i = c28655q.m87157i(c11373l1);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i || objM87133R3 == c28676v0) {
            objM87133R3 = new C3526n(8, c11373l1, c11365j1);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87251e(c11365j1, (Function1) objM87133R3, c28655q);
        return c11365j1;
    }

    /* JADX INFO: renamed from: k */
    public static final float m30563k(C11413x c11413x, float f13, float f14) {
        return ((C11380n) new C11371k2(c11413x.f36609a).m30601a(new C11380n(f13), new C11380n(f14))).f36483a;
    }

    /* JADX INFO: renamed from: l */
    public static final AbstractC11395r m30564l(AbstractC11395r abstractC11395r) {
        AbstractC11395r abstractC11395rMo30609c = abstractC11395r.mo30609c();
        int iMo30608b = abstractC11395rMo30609c.mo30608b();
        for (int i13 = 0; i13 < iMo30608b; i13++) {
            abstractC11395rMo30609c.mo30611e(abstractC11395r.mo30607a(i13), i13);
        }
        return abstractC11395rMo30609c;
    }

    /* JADX INFO: renamed from: m */
    public static C11376m m30565m(C11376m c11376m, float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = ((Number) c11376m.f36471x.getValue()).floatValue();
        }
        if ((i13 & 2) != 0) {
            f14 = ((C11380n) c11376m.f36472y).f36483a;
        }
        return new C11376m(c11376m.f36470w, Float.valueOf(f13), new C11380n(f14), c11376m.f36473z, c11376m.f36468E, c11376m.f36469F);
    }

    /* JADX INFO: renamed from: n */
    public static final void m30566n(C11368k c11368k, long j7, float f13, InterfaceC11356h interfaceC11356h, C11376m c11376m, Function1 function1) {
        long jMo30594d = f13 == 0.0f ? interfaceC11356h.mo30594d() : (long) ((j7 - c11368k.f36438c) / f13);
        c11368k.f36442g = j7;
        c11368k.f36440e.setValue(interfaceC11356h.mo30596f(jMo30594d));
        c11368k.f36441f = interfaceC11356h.mo30592b(jMo30594d);
        if (interfaceC11356h.m30593c(jMo30594d)) {
            c11368k.f36443h = c11368k.f36442g;
            c11368k.f36444i.setValue(Boolean.FALSE);
        }
        m30575w(c11368k, c11376m);
        function1.invoke(c11368k);
    }

    /* JADX INFO: renamed from: o */
    public static C11413x m30567o() {
        return new C11413x(new C11349f0(0));
    }

    /* JADX INFO: renamed from: p */
    public static final float m30568p(InterfaceC30063j interfaceC30063j) {
        InterfaceC2317w interfaceC2317w = (InterfaceC2317w) interfaceC30063j.get(C2299e.f9113P);
        float fMo7160h = interfaceC2317w != null ? interfaceC2317w.mo7160h() : 1.0f;
        if (fMo7160h >= 0.0f) {
            return fMo7160h;
        }
        AbstractC11405u0.m30639b("negative scale factor");
        return fMo7160h;
    }

    /* JADX INFO: renamed from: q */
    public static C11361i0 m30569q(InterfaceC11416y interfaceC11416y, EnumC11408v0 enumC11408v0, int i13) {
        if ((i13 & 2) != 0) {
            enumC11408v0 = EnumC11408v0.f36577w;
        }
        return new C11361i0(interfaceC11416y, enumC11408v0, 0);
    }

    /* JADX INFO: renamed from: r */
    public static final C11389p0 m30570r(Function1 function1) {
        C11385o0 c11385o0 = new C11385o0();
        function1.invoke(c11385o0);
        return new C11389p0(c11385o0);
    }

    /* JADX INFO: renamed from: s */
    public static final C11373l0 m30571s(String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C11373l0();
            c28655q.m87172p0(objM87133R);
        }
        C11373l0 c11373l0 = (C11373l0) objM87133R;
        c11373l0.m30603a(c28655q, 0);
        return c11373l0;
    }

    /* JADX INFO: renamed from: t */
    public static C11354g1 m30572t() {
        return new C11354g1(0);
    }

    /* JADX INFO: renamed from: u */
    public static C11362i1 m30573u(float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = 1.0f;
        }
        if ((i13 & 2) != 0) {
            f14 = 1500.0f;
        }
        if ((i13 & 4) != 0) {
            obj = null;
        }
        return new C11362i1(f13, f14, obj);
    }

    /* JADX INFO: renamed from: v */
    public static C11347e2 m30574v(int i13, int i14, InterfaceC11419z interfaceC11419z, int i15) {
        if ((i15 & 1) != 0) {
            i13 = 300;
        }
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        if ((i15 & 4) != 0) {
            interfaceC11419z = AbstractC11333b0.f36310a;
        }
        return new C11347e2(i13, i14, interfaceC11419z);
    }

    /* JADX INFO: renamed from: w */
    public static final void m30575w(C11368k c11368k, C11376m c11376m) {
        c11376m.f36471x.setValue(c11368k.f36440e.getValue());
        AbstractC11395r abstractC11395r = c11376m.f36472y;
        AbstractC11395r abstractC11395r2 = c11368k.f36441f;
        int iMo30608b = abstractC11395r.mo30608b();
        for (int i13 = 0; i13 < iMo30608b; i13++) {
            abstractC11395r.mo30611e(abstractC11395r2.mo30607a(i13), i13);
        }
        c11376m.f36468E = c11368k.f36443h;
        c11376m.f36473z = c11368k.f36442g;
        c11376m.f36469F = ((Boolean) c11368k.f36444i.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: x */
    public static final Object m30576x(Function1 function1, AbstractC32269c abstractC32269c) {
        if (abstractC32269c.getContext().get(C2384h2.f9433w) == null) {
            return AbstractC28683x.m87268v(abstractC32269c.getContext()).mo7286k(function1, abstractC32269c);
        }
        throw new ClassCastException();
    }
}
