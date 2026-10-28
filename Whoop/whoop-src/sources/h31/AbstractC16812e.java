package h31;

import android.graphics.PointF;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.models.GenericInteraction;
import f02.C13917c;
import fc0.C14361e;
import gb1.AbstractC15673b0;
import gy0.AbstractC16276e;
import gz0.EnumC16313m0;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.List;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13989w1;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p426qi.InterfaceC30372a0;
import p524ui.C34970a0;
import p584wi.C37305e;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import v41.AbstractC35687q0;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h31.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0011*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0013\u001a=\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lh31/g;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "d", "(Lh31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lh31/c;", "backgroundStyle", "g", "(Lh31/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lh31/a;", "i", "(Lh31/c;Landroidx/compose/runtime/Composer;I)Lh31/a;", "Lny0/h;", "l", "(Lh31/g;)Lny0/h;", "n", "m", "Lh31/f;", "style", "", "title", "Lgz0/m0;", "icon", "", "enabled", "j", "(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;)Lh31/g;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16812e {

    /* JADX INFO: renamed from: h31.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64577a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f64578b;

        static {
            int[] iArr = new int[EnumC16813f.values().length];
            try {
                iArr[EnumC16813f.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16813f.COMMITTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16813f.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC16813f.UNCOMMITTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f64577a = iArr;
            int[] iArr2 = new int[EnumC16810c.values().length];
            try {
                iArr2[EnumC16810c.CAROUSEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC16810c.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f64578b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m47353d(C16814g viewState, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        boolean z13;
        boolean z14;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1315061539);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (a.f64577a[viewState.getStyle().ordinal()] == 1) {
                    c28655q.m87150e0(1053761397);
                    m47356g(viewState.getBackgroundStyle(), AbstractC1102d.m3409f(1.0f, modifier3), c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1053766692);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                    C27256h c27256hM47361l = m47361l(viewState);
                    if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i15 & 112) == 32);
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C13989w1(22, viewState, onViewEvent);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27249e.m82121d(modifierM3409f, c27256hM47361l, null, (InterfaceC4339a) objM87133R, c28655q, 0, 4);
                    c28655q.m87173q(false);
                }
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13917c(i13, i14, 25, viewState, modifier2, onViewEvent);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (a.f64577a[viewState.getStyle().ordinal()] == 1) {
                c28655q.m87150e0(1053761397);
                m47356g(viewState.getBackgroundStyle(), AbstractC1102d.m3409f(1.0f, modifier3), c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1053766692);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier3);
                C27256h c27256hM47361l2 = m47361l(viewState);
                if ((i15 & 14) != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                z14 = z13 | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C13989w1(22, viewState, onViewEvent);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C13989w1(22, viewState, onViewEvent);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27249e.m82121d(modifierM3409f2, c27256hM47361l2, null, (InterfaceC4339a) objM87133R, c28655q, 0, 4);
                c28655q.m87173q(false);
            }
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 25, viewState, modifier2, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m47354e(C16814g c16814g, Function1 function1) {
        GenericInteraction genericInteractionM47369g = c16814g.getInteraction();
        if (genericInteractionM47369g != null) {
            function1.invoke(genericInteractionM47369g);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m47355f(C16814g c16814g, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m47353d(c16814g, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x0135  */
    /* JADX WARN: Code duplicated, block: B:49:0x0140  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    private static final void m47356g(EnumC16810c enumC16810c, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iM51506H;
        boolean zM87149e;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(828533451);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87149e(enumC16810c.ordinal()) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                C16808a c16808aM47358i = m47358i(enumC16810c, c28655q, i15 & 14);
                iM51506H = AbstractC17918w0.m51506H(c16808aM47358i.getSpinnerColor());
                zM87149e = c28655q.m87149e(iM51506H);
                objM87133R = c28655q.m87133R();
                if (zM87149e || objM87133R == C28635l.f115821a) {
                    PointF pointF = InterfaceC30372a0.f124620a;
                    objM87133R = AbstractC37056f.m118958J(new C34970a0(2, new C37305e("**"), Integer.valueOf(iM51506H)));
                    c28655q.m87172p0(objM87133R);
                }
                List list = (List) objM87133R;
                float f13 = 4;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC18249c.m52565c(AbstractC18489d0.m53364e(modifier4, 2, f13), c16808aM47358i.getBackground()), 0.0f, ((float) 1.5d) * 8, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC35687q0.m113102l(AbstractC1102d.m3419p(f13 * f13, c2314t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62208b)), list, null, null, null, Integer.MAX_VALUE, false, null, null, null, null, c28655q, 806879238, 0, 3512);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(enumC16810c, i13, modifier3, i14, 13);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            C16808a c16808aM47358i2 = m47358i(enumC16810c, c28655q, i15 & 14);
            iM51506H = AbstractC17918w0.m51506H(c16808aM47358i2.getSpinnerColor());
            zM87149e = c28655q.m87149e(iM51506H);
            objM87133R = c28655q.m87133R();
            if (zM87149e) {
                PointF pointF2 = InterfaceC30372a0.f124620a;
                objM87133R = AbstractC37056f.m118958J(new C34970a0(2, new C37305e("**"), Integer.valueOf(iM51506H)));
                c28655q.m87172p0(objM87133R);
            } else {
                PointF pointF3 = InterfaceC30372a0.f124620a;
                objM87133R = AbstractC37056f.m118958J(new C34970a0(2, new C37305e("**"), Integer.valueOf(iM51506H)));
                c28655q.m87172p0(objM87133R);
            }
            List list2 = (List) objM87133R;
            float f14 = 4;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC18249c.m52565c(AbstractC18489d0.m53364e(modifier4, 2, f14), c16808aM47358i2.getBackground()), 0.0f, ((float) 1.5d) * 8, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC35687q0.m113102l(AbstractC1102d.m3419p(f14 * f14, c2314t), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62208b)), list2, null, null, null, Integer.MAX_VALUE, false, null, null, null, null, c28655q, 806879238, 0, 3512);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(enumC16810c, i13, modifier3, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m47357h(EnumC16810c enumC16810c, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m47356g(enumC16810c, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final C16808a m47358i(EnumC16810c enumC16810c, Composer composer, int i13) {
        int i14 = a.f64578b[enumC16810c.ordinal()];
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(461588255);
            C16808a c16808a = new C16808a(EnumC27272p.LIGHT_BACKGROUND.getBackground(), C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack(), defaultConstructorMarker);
            c28655q.m87173q(false);
            return c16808a;
        }
        if (i14 != 2) {
            throw AbstractC11895b.m32003v(461585934, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(461594395);
        C16808a c16808a2 = new C16808a(AbstractC18249c.m52575m(EnumC39333f.BLACK_30), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), defaultConstructorMarker);
        c28655q2.m87173q(false);
        return c16808a2;
    }

    /* JADX INFO: renamed from: j */
    public static final C16814g m47359j(EnumC16813f style, String title, EnumC16313m0 enumC16313m0, boolean z4, EnumC16810c backgroundStyle) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        return new C16814g(AbstractC8693b.m21278l(title), style, backgroundStyle, enumC16313m0, z4, null, 32, null);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ C16814g m47360k(EnumC16813f enumC16813f, String str, EnumC16313m0 enumC16313m0, boolean z4, EnumC16810c enumC16810c, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            enumC16313m0 = EnumC16313m0.ADD;
        }
        if ((i13 & 8) != 0) {
            z4 = true;
        }
        if ((i13 & 16) != 0) {
            enumC16810c = EnumC16810c.CAROUSEL;
        }
        return m47359j(enumC16813f, str, enumC16313m0, z4, enumC16810c);
    }

    /* JADX INFO: renamed from: l */
    private static final C27256h m47361l(C16814g c16814g) {
        int i13 = a.f64578b[c16814g.getBackgroundStyle().ordinal()];
        if (i13 == 1) {
            return m47362m(c16814g);
        }
        if (i13 == 2) {
            return m47363n(c16814g);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: m */
    private static final C27256h m47362m(C16814g c16814g) {
        int i13 = a.f64577a[c16814g.getStyle().ordinal()];
        if (i13 == 1) {
            throw new IllegalStateException("LOADING is rendered by RecommendationTileButtonLoading, not CardButton");
        }
        if (i13 == 2 || i13 == 3) {
            return new C27256h(c16814g.getTitle(), c16814g.getIcon(), AbstractC18249c.m52570h(AbstractC15673b0.m43972A()), EnumC39333f.BRAND_WHITE, null, null, null, null, null, null, null, null, null, false, false, null, c16814g.getEnabled(), false, null, null, null, null, null, null, null, 33488880, null);
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new C27256h(c16814g.getTitle(), c16814g.getIcon(), null, null, null, null, EnumC27272p.LIGHT_BACKGROUND, null, null, null, null, null, null, false, false, null, c16814g.getEnabled(), false, null, null, null, null, null, null, null, 33488828, null);
    }

    /* JADX INFO: renamed from: n */
    private static final C27256h m47363n(C16814g c16814g) {
        int i13 = a.f64577a[c16814g.getStyle().ordinal()];
        if (i13 == 1) {
            throw new IllegalStateException("LOADING is rendered by RecommendationTileButtonLoading, not CardButton");
        }
        if (i13 == 2 || i13 == 3) {
            return new C27256h(c16814g.getTitle(), c16814g.getIcon(), null, null, null, null, EnumC27272p.SUCCESS, null, null, null, null, null, null, false, false, null, c16814g.getEnabled(), false, null, null, null, null, null, null, null, 33488828, null);
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new C27256h(c16814g.getTitle(), c16814g.getIcon(), null, null, null, null, EnumC27272p.LIGHT_BACKGROUND, null, null, null, null, null, null, false, false, null, c16814g.getEnabled(), false, null, null, null, null, null, null, null, 33488828, null);
    }
}
