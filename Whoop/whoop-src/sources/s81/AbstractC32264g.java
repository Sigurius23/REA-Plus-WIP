package s81;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2101a;
import c93.InterfaceC4351m;
import d30.C11545k0;
import java.util.Iterator;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.EnumC22935a1;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import s32.C32112d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: s81.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u0010\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ls81/h;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll0/s1;", "Ls81/d;", "rowItem", "", "weighted", "stretch", "f", "(Ll0/s1;Ls81/d;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32264g {

    /* JADX INFO: renamed from: s81.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f133529a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f133530b;

        static {
            int[] iArr = new int[EnumC32258a.values().length];
            try {
                iArr[EnumC32258a.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32258a.HUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f133529a = iArr;
            int[] iArr2 = new int[EnumC32259b.values().length];
            try {
                iArr2[EnumC32259b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC32259b.STRETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC32259b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC32259b.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f133530b = iArr2;
        }
    }

    /* JADX INFO: renamed from: f */
    private static final void m100402f(InterfaceC22997s1 interfaceC22997s1, C32261d c32261d, boolean z4, boolean z13, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1340515628);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c32261d) : c28655q.m87157i(c32261d) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            InterfaceC32262e width = c32261d.getWidth();
            Modifier modifierM3406c = C2314t.f9131w;
            Modifier modifierMo66772c = (z4 && (width instanceof InterfaceC32262e.a)) ? interfaceC22997s1.mo66772c(modifierM3406c, true, ((InterfaceC32262e.a) width).getWeight()) : modifierM3406c;
            if (z13) {
                modifierM3406c = AbstractC1102d.m3406c(1.0f, modifierM3406c);
            }
            Modifier modifierMo3471e = modifierMo66772c.mo3471e(modifierM3406c);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC25303l.m74291r(c32261d.getItem(), null, new C2101a(10, modifierM3406c), function1, c28655q, (i14 >> 3) & 7168, 2);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11545k0(interfaceC22997s1, c32261d, z4, z13, function1, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m100403g(Modifier modifier, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1797245290);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m100404h(InterfaceC22997s1 interfaceC22997s1, C32261d c32261d, boolean z4, boolean z13, Function1 function1, int i13, Composer composer, int i14) {
        m100402f(interfaceC22997s1, c32261d, z4, z13, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m100405i(Modifier modifier, final C32265h state, Function1 function1, Composer composer, final int i13, final int i14) {
        int i15;
        final Function1 function2;
        Function1 function3;
        Modifier modifierM3409f;
        C2306l c2306l;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1246805757);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i18 = i15;
        if (c28655q.m87135U(i18 & 1, (i18 & 147) != 146)) {
            Modifier modifierM3388j = C2314t.f9131w;
            if (i16 != 0) {
                modifier = modifierM3388j;
            }
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C32112d(12);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            if (state.m100411c().isEmpty()) {
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i19 = 0;
                    final Modifier modifier2 = modifier;
                    final Function1 function4 = function3;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: s81.f
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i19) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC32264g.m100407k(modifier2, state, function4, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC32264g.m100408l(modifier2, state, function4, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    return;
                }
                return;
            }
            boolean z4 = state.getCrossAxisAlignment() == EnumC32259b.STRETCH;
            boolean z13 = state.getCrossAxisSize() == EnumC32258a.FILL;
            int i24 = a.f133529a[state.getMainAxisSize().ordinal()];
            if (i24 == 1) {
                modifierM3409f = AbstractC1102d.m3409f(1.0f, modifierM3388j);
            } else {
                if (i24 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                modifierM3409f = AbstractC1102d.m3429z(modifierM3388j, state.getMainAxisAlignment(), 2);
            }
            Modifier modifierMo3471e = modifier.mo3471e(modifierM3409f).mo3471e(z13 ? AbstractC1102d.m3406c(1.0f, modifierM3388j) : modifierM3388j);
            if (z4) {
                modifierM3388j = AbstractC1099a.m3388j(modifierM3388j, EnumC22935a1.f90538x);
            }
            Modifier modifierM3393o = AbstractC1099a.m3393o(state.getPadding(), modifierMo3471e.mo3471e(modifierM3388j));
            C22949e c22949e = AbstractC22977m.f90650a;
            C22971k c22971kM66747j = AbstractC22977m.m66747j(state.getSpacing(), state.getMainAxisAlignment());
            int i25 = a.f133530b[state.getCrossAxisAlignment().ordinal()];
            if (i25 == 1 || i25 == 2) {
                c2306l = C2299e.f9107J;
            } else if (i25 == 3) {
                c2306l = C2299e.f9108K;
            } else {
                if (i25 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                c2306l = C2299e.f9109L;
            }
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66747j, c2306l, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(271005911);
            Iterator<T> it = state.m100411c().iterator();
            while (it.hasNext()) {
                m100402f(C23000t1.f90727a, (C32261d) it.next(), state.getMainAxisSize() == EnumC32258a.FILL, z4, function3, c28655q, 6 | (57344 & (i18 << 6)));
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        final Modifier modifier3 = modifier;
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            final int i26 = 1;
            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: s81.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i26) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC32264g.m100407k(modifier3, state, function2, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC32264g.m100408l(modifier3, state, function2, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m100406j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m100407k(Modifier modifier, C32265h c32265h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m100405i(modifier, c32265h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m100408l(Modifier modifier, C32265h c32265h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m100405i(modifier, c32265h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
