package ht2;

import a11.C0131i;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import az0.C2158a;
import b11.C2275b;
import b30.C2663y4;
import b61.C2755j;
import b91.C2886a;
import bp0.C3520h;
import c11.C3837d;
import c41.C4065l3;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import fc0.C14361e;
import ga1.C15621b;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import gt2.AbstractC16204b;
import gt2.AbstractC16205c;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import h01.C16554u;
import hb1.C17085h;
import hb3.AbstractC17104a0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ks2.AbstractC22822a;
import l83.C23454a0;
import lz0.AbstractC24821f;
import ny0.C27246d;
import ny0.C27256h;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p01.AbstractC28586f;
import p01.C28582b;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p088dc.AbstractC11895b;
import p133f1.C13989w1;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ht2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00142\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lgt2/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "L", "(Landroidx/compose/ui/Modifier;Lgt2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lht2/a;", "", "isExpanded", "F", "(Lht2/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lht2/i;", "U", "(Lht2/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "B", "(Landroidx/compose/runtime/Composer;I)V", "Lgt2/c$a;", "x", "(Lgt2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17633e {

    /* JADX INFO: renamed from: ht2.e$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68384a;

        static {
            int[] iArr = new int[EnumC17638j.values().length];
            try {
                iArr[EnumC17638j.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17638j.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f68384a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m50193A(AbstractC16205c.a aVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m50243x(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m50194B(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1791627397);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3427x(c2314t, null, 3), "WeeklyPlanHomeTile_LoadingState_Container_Row");
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 4;
            float f14 = 6 * f13;
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f14, c2314t), "WeeklyPlanHomeTile_LoadingState_Container_AnimationBox");
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1102d.m3424u(f14, AbstractC1102d.m3411h(f14, c2314t)), "WeeklyPlanHomeTile_LoadingState_Animation_Loading");
            InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C15621b(16);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C16554u(6);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35684p.m113047h(modifierM3599a3, dVarM113128a, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R2, null, null, c28655q, 1769478, 412);
            c28655q.m87173q(true);
            float f15 = 1;
            float f16 = f15 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f16, c2314t));
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h("Loading...", AbstractC1136a.m3599a(c2314t, "WeeklyPlanHomeTile_LoadingState_Text_LoadingMessage"), c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH5(), null, c28655q, 54, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            AbstractC11266d.m30469w(2, f13, c2314t, c28655q);
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1099a.m3392n(c2314t, (-1) * f13, 0.0f, 2), "WeeklyPlanHomeTile_LoadingState_Container_ProgressBarRow");
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3599a4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC24821f.m72736b(AbstractC1136a.m3599a(c2314t, "WeeklyPlanHomeTile_LoadingState_ProgressBar_Empty"), 0, 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, i14).getAccentPositiveTrend()), new C17919x(c38072d.m121949b(c28655q, i14).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, i14).getWhite10(), false, f16, c28655q, 1769910, 0);
            c28655q.m87173q(true);
            AbstractC11266d.m30469w(f15, 8, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0131i(i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m50195C() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m50196D(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m50197E(int i13, Composer composer, int i14) {
        m50194B(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x01db  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x029e  */
    /* JADX WARN: Code duplicated, block: B:66:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: F */
    private static final void m50198F(C17629a c17629a, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z13;
        C17629a c17629a2;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(202140670);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(c17629a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C16554u(5);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(c2314t, null, 3)), "WeeklyPlanHomeTile_Progress_Container_Row");
                C2306l c2306l = C2299e.f9109L;
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1088385246, c28655q2, new C4065l3(c17629a, 4)), c28655q2, 56);
                float f13 = 1;
                float f14 = 4;
                float f15 = f13 * f14;
                int i17 = i15;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f15, c2314t));
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7), "WeeklyPlanHomeTile_Progress_Text_Subtitle");
                String strM50251b = c17629a.getProgressBreakdownBar().getPercentSubtitle();
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                Function1 function5 = function4;
                AbstractC30795n.m94707h(strM50251b, modifierM3599a2, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getH5(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
                c28655q2.m87173q(true);
                AbstractC11266d.m30469w(2, f14, c2314t, c28655q2);
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1099a.m3392n(c2314t, (-1) * f14, 0.0f, 2), "WeeklyPlanHomeTile_Progress_Container_ProgressBarRow");
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3599a3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                AbstractC24821f.m72736b(AbstractC1136a.m3599a(c2314t, "WeeklyPlanHomeTile_Progress_ProgressBar_Main"), c17629a.getProgressBreakdownBar().getPercentValue(), 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q2, i18).getAccentPositiveTrend()), new C17919x(c38072d.m121949b(c28655q2, i18).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d.m121949b(c28655q2, i18).getWhite10(), false, f15, c28655q2, 1769862, 0);
                c28655q2.m87173q(true);
                AbstractC11266d.m30469w(f13, 8, c2314t, c28655q2);
                c17629a2 = c17629a;
                function3 = function5;
                AbstractC1090b.m3351f(z4, AbstractC1136a.m3599a(c2314t, "WeeklyPlanHomeTile_ExpandedContent_Container_Animated"), AbstractC3788w0.m11576d(null, null, 15), AbstractC3788w0.m11584l(null, null, null, 15), null, AbstractC37817c.m121344e(-1333719850, c28655q2, new C3520h(1, c17629a2, function3)), c28655q2, (14 & (i17 >> 3)) | 200112, 16);
                c28655q = c28655q2;
            } else {
                c17629a2 = c17629a;
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17630b(c17629a2, z4, function3, i13, i14);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            if (i16 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C16554u(5);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(c2314t2, null, 3)), "WeeklyPlanHomeTile_Progress_Container_Row");
            C2306l c2306l2 = C2299e.f9109L;
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3599a4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-1088385246, c28655q2, new C4065l3(c17629a, 4)), c28655q2, 56);
            float f16 = 1;
            float f17 = 4;
            float f18 = f16 * f17;
            int i19 = i15;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f18, c2314t2));
            Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f16, 7), "WeeklyPlanHomeTile_Progress_Text_Subtitle");
            String strM50251b2 = c17629a.getProgressBreakdownBar().getPercentSubtitle();
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            Function1 function6 = function4;
            AbstractC30795n.m94707h(strM50251b2, modifierM3599a5, c38072d2.m121949b(c28655q2, i110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i110).getH5(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
            c28655q2.m87173q(true);
            AbstractC11266d.m30469w(2, f17, c2314t2, c28655q2);
            Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC1099a.m3392n(c2314t2, (-1) * f17, 0.0f, 2), "WeeklyPlanHomeTile_Progress_Container_ProgressBarRow");
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, c28655q2, 0);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3599a6);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            AbstractC24821f.m72736b(AbstractC1136a.m3599a(c2314t2, "WeeklyPlanHomeTile_Progress_ProgressBar_Main"), c17629a.getProgressBreakdownBar().getPercentValue(), 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q2, i110).getAccentPositiveTrend()), new C17919x(c38072d2.m121949b(c28655q2, i110).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q2, i110).getWhite10(), false, f18, c28655q2, 1769862, 0);
            c28655q2.m87173q(true);
            AbstractC11266d.m30469w(f16, 8, c2314t2, c28655q2);
            c17629a2 = c17629a;
            function3 = function6;
            AbstractC1090b.m3351f(z4, AbstractC1136a.m3599a(c2314t2, "WeeklyPlanHomeTile_ExpandedContent_Container_Animated"), AbstractC3788w0.m11576d(null, null, 15), AbstractC3788w0.m11584l(null, null, null, 15), null, AbstractC37817c.m121344e(-1333719850, c28655q2, new C3520h(1, c17629a2, function3)), c28655q2, (14 & (i19 >> 3)) | 200112, 16);
            c28655q = c28655q2;
        } else {
            c17629a2 = c17629a;
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17630b(c17629a2, z4, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m50199G(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m50200H(C17629a c17629a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            String strM21275i = AbstractC8693b.m21275i(c17629a.getProgressBreakdownBar().getPercentString(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8405C = c38072d.m121952e(c28655q, i14).getN6();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "WeeklyPlanHomeTile_Progress_Text_Percentage");
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21275i, modifierM3599a, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C, null, c28655q, 48, i15, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC16277f.f62235F1, c28655q, 0), AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7), "WeeklyPlanHomeTile_Progress_Text_PercentSymbol"), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getN8(), null, c28655q, 48, i15, 196600);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m50201I(C17629a c17629a, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        float f13;
        C28655q c28655q;
        Composer composer2 = composer;
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C2314t c2314t = C2314t.f9131w;
        float f14 = 8;
        float f15 = 1;
        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1102d.m3427x(c2314t, null, 3), 0.0f, 2 * f14, 0.0f, f15 * f14, 5), "WeeklyPlanHomeTile_ExpandedContent_Container_Column");
        float f16 = 3 * 4;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), C2299e.f9110M, composer2, 6);
        C28655q c28655q2 = (C28655q) composer2;
        int iHashCode = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, modifierM3599a);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q2.f115906a;
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c28655q2.m87163l(c0213j);
        } else {
            c28655q2.m87178s0();
        }
        AbstractC28683x.m87239G(composer2, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N);
        List<C17637i> listM50189f = c17629a.m50189f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM50189f) {
            if (((C17637i) obj).getStyle() == EnumC17638j.IN_PROGRESS) {
                arrayList.add(obj);
            }
        }
        List<C17637i> listM50189f2 = c17629a.m50189f();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM50189f2) {
            if (((C17637i) obj2).getStyle() == EnumC17638j.COMPLETE) {
                arrayList2.add(obj2);
            }
        }
        c28655q2.m87150e0(-596839876);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m50213U((C17637i) it.next(), function1, composer2, C28582b.f115652u | C9598e.f28134d, 0);
        }
        c28655q2.m87173q(false);
        if (arrayList.isEmpty() || arrayList2.isEmpty()) {
            f13 = 1.0f;
            c28655q2.m87150e0(-1321694282);
            c28655q2.m87173q(false);
        } else {
            c28655q2.m87150e0(-1321984938);
            f13 = 1.0f;
            AbstractC15751g.m44449b(AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "WeeklyPlanHomeTile_ExpandedContent_Divider_Separator"), C38072d.f163053a.m121949b(composer2, C38072d.f163054b).getWhite10(), f15, 0.0f, composer, 390, 8);
            composer2 = composer;
            c28655q2.m87173q(false);
        }
        c28655q2.m87150e0(-596823620);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            m50213U((C17637i) it3.next(), function1, composer2, C28582b.f115652u | C9598e.f28134d, 0);
        }
        c28655q2.m87173q(false);
        C27256h c27256hM50187c = c17629a.getCardButton();
        if (c27256hM50187c == null) {
            c28655q2.m87150e0(-1321534478);
            c28655q2.m87173q(false);
            c28655q = c28655q2;
        } else {
            c28655q2.m87150e0(-1321534477);
            C27246d c27246d = new C27246d();
            c28655q = c28655q2;
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(AbstractC1102d.m3409f(f13, c2314t), 0.0f, f16, 0.0f, 0.0f, 13), "WeeklyPlanHomeTile_ExpandedContent_Button_ViewPlan");
            C27256h c27256hM82144b = C27256h.m82144b(c27256hM50187c, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33546239, null);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c27256hM50187c);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C3837d(function1, c27256hM50187c, 2);
                c28655q.m87172p0(objM87133R);
            }
            c27246d.Compose(modifierM3599a2, c27256hM82144b, (Function1) objM87133R, composer2, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m50202J(Function1 function1, C27256h c27256h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c27256h.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m50203K(C17629a c17629a, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m50198F(c17629a, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x013e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0148  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public static final void m50204L(Modifier modifier, AbstractC16205c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zIsFeatureEnabled;
        boolean z13;
        String strM21274h;
        AbstractC16205c.c cVar;
        boolean zM87155h;
        Object objM87133R2;
        C17629a c17629a;
        String strM50191h;
        AbstractC16205c.c cVar2;
        Object objM87133R3;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1029597071);
        int i16 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C16554u(4);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled("weekly-plan-home-tile-expanded-state-fix");
                z13 = viewState instanceof AbstractC16205c.c;
                if (z13) {
                    cVar2 = (AbstractC16205c.c) viewState;
                    if (cVar2.getState() instanceof C17629a) {
                        m50207O(interfaceC28601c1, ((C17629a) cVar2.getState()).getIsExpanded());
                    }
                }
                strM21274h = AbstractC8693b.m21274h(new TextResource.C8688b(AbstractC22822a.f89939k, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), c28655q, TextResource.C8688b.f25889c);
                if (z13) {
                    cVar = (AbstractC16205c.c) viewState;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    InterfaceC25312u interfaceC25312uM45877b = cVar.getState();
                    c17629a = interfaceC25312uM45877b instanceof C17629a ? (C17629a) interfaceC25312uM45877b : null;
                    if (c17629a != null || (strM50191h = c17629a.getTitle()) == null) {
                        strM50191h = strM21274h;
                    }
                    if (strM50191h != null) {
                        strM21274h = strM50191h;
                    }
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(modifier, "WeeklyPlanHomeTile_Main_Container_Tile");
                zM87155h = c28655q.m87155h(zIsFeatureEnabled) | ((i15 & 896) == 256);
                objM87133R2 = c28655q.m87133R();
                if (zM87155h || objM87133R2 == c28676v0) {
                    objM87133R2 = new C17631c(zIsFeatureEnabled, function4, interfaceC28601c1, 0);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3599a, false, null, null, (InterfaceC4339a) objM87133R2, 15), null, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1208232959, c28655q, new C2755j(viewState, function4, strM21274h, interfaceC28601c1)), c28655q, 12582912, 126);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2158a(modifier, viewState, function3, i13, i14, 3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C16554u(4);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled("weekly-plan-home-tile-expanded-state-fix");
            z13 = viewState instanceof AbstractC16205c.c;
            if (z13) {
                cVar2 = (AbstractC16205c.c) viewState;
                if (cVar2.getState() instanceof C17629a) {
                    m50207O(interfaceC28601c1, ((C17629a) cVar2.getState()).getIsExpanded());
                }
            }
            strM21274h = AbstractC8693b.m21274h(new TextResource.C8688b(AbstractC22822a.f89939k, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), c28655q, TextResource.C8688b.f25889c);
            if (z13) {
                cVar = (AbstractC16205c.c) viewState;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                InterfaceC25312u interfaceC25312uM45877b2 = cVar.getState();
                if (interfaceC25312uM45877b2 instanceof C17629a) {
                }
                if (c17629a != null) {
                    strM50191h = strM21274h;
                } else {
                    strM50191h = strM21274h;
                }
                if (strM50191h != null) {
                    strM21274h = strM50191h;
                }
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(modifier, "WeeklyPlanHomeTile_Main_Container_Tile");
            zM87155h = c28655q.m87155h(zIsFeatureEnabled) | ((i15 & 896) == 256);
            objM87133R2 = c28655q.m87133R();
            if (zM87155h) {
                objM87133R2 = new C17631c(zIsFeatureEnabled, function4, interfaceC28601c1, 0);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C17631c(zIsFeatureEnabled, function4, interfaceC28601c1, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifierM3599a2, false, null, null, (InterfaceC4339a) objM87133R2, 15), null, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(-1208232959, c28655q, new C2755j(viewState, function4, strM21274h, interfaceC28601c1)), c28655q, 12582912, 126);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a(modifier, viewState, function3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m50205M(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final boolean m50206N(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    private static final void m50207O(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m50208P(boolean z4, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m50207O(interfaceC28601c1, !m50206N(interfaceC28601c1));
        if (z4) {
            function1.invoke(new AbstractC16204b.a(m50206N(interfaceC28601c1)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x021e  */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m50209Q(AbstractC16205c abstractC16205c, Function1 function1, String str, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) throws XmlPullParserException, IOException {
        boolean z4;
        float f13;
        int i14;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f14 = 2;
            float f15 = f14 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(c2314t, null, 3)), "WeeklyPlanHomeTile_Header_Container_Row");
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (9.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(9.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 9.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8414L = c38072d.m121952e(c28655q, i15).getSh4();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, f15, 0.0f, 0.0f, 13), "WeeklyPlanHomeTile_Header_Text_Title");
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str, modifierM3599a2, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 48, i16, 196600);
            C28655q c28655q2 = c28655q;
            boolean z14 = abstractC16205c instanceof AbstractC16205c.c;
            if (z14) {
                AbstractC16205c.c cVar = (AbstractC16205c.c) abstractC16205c;
                if (cVar.getState() instanceof C17629a) {
                    c28655q2.m87150e0(-1924573818);
                    float f16 = 4;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(3 * f16, c2314t));
                    f13 = 0.0f;
                    z4 = z14;
                    AbstractC30795n.m94707h(((C17629a) cVar.getState()).getDaysLeftDisplay(), AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f16, 0.0f, 0.0f, 13), "WeeklyPlanHomeTile_Header_Text_DaysLeft"), c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB3(), null, c28655q2, 48, i16, 196600);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                } else {
                    z4 = z14;
                    f13 = 0.0f;
                    c28655q2.m87150e0(-1924071215);
                    c28655q2.m87173q(false);
                }
            } else {
                z4 = z14;
                f13 = 0.0f;
                c28655q2.m87150e0(-1924071215);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            if (z4) {
                c28655q2.m87150e0(-457934202);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(EnumC16313m0.CARET_UP.toWhoopIcon(), c28655q2, 6);
                long jM125382b1 = c38072d.m121949b(c28655q2, i15).getWhite50();
                i14 = 4;
                float f17 = 4;
                AbstractC15005f3.m43108b(c27430eM107874S, AbstractC30060g.m92103Y(c28655q2, AbstractC22822a.f89938j), AbstractC1136a.m3599a(AbstractC1772c1.m5375L(m50206N(interfaceC28601c1) ? f13 : 180.0f, AbstractC1102d.m3419p(f17 * f17, c2314t)), "WeeklyPlanHomeTile_Header_Icon_ExpandCollapse"), jM125382b1, c28655q2, 0, 0);
                c28655q2.m87173q(false);
            } else {
                i14 = 4;
                c28655q2.m87150e0(-457361849);
                c28655q2.m87173q(false);
            }
            AbstractC18489d0.m53356B(c28655q2, true, c2314t, f15, c28655q2);
            boolean z15 = abstractC16205c instanceof AbstractC16205c.a;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z15) {
                c28655q2.m87150e0(1033258843);
                AbstractC16205c.a aVar = (AbstractC16205c.a) abstractC16205c;
                boolean zM87153g = c28655q2.m87153g(function1);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C2275b(function1, 6);
                    c28655q2.m87172p0(objM87133R);
                }
                m50243x(aVar, (Function1) objM87133R, c28655q2, 0, 0);
                c28655q2.m87173q(false);
            } else if (AbstractC22676k.m65745e(abstractC16205c, AbstractC16205c.b.f61543b)) {
                c28655q2.m87150e0(1033261760);
                m50194B(c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                if (!z4) {
                    throw AbstractC11895b.m32003v(1033256852, c28655q2, false);
                }
                c28655q2.m87150e0(1966416743);
                AbstractC16205c.c cVar2 = (AbstractC16205c.c) abstractC16205c;
                if (cVar2.getState() instanceof C17629a) {
                    c28655q2.m87150e0(1966487299);
                    C17629a c17629a = (C17629a) cVar2.getState();
                    boolean zM50206N = m50206N(interfaceC28601c1);
                    boolean zM87153g2 = c28655q2.m87153g(function1);
                    Object objM87133R2 = c28655q2.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C2275b(function1, 7);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    m50198F(c17629a, zM50206N, (Function1) objM87133R2, c28655q2, 0, 0);
                    z13 = false;
                    c28655q2.m87173q(false);
                } else {
                    z13 = false;
                    c28655q2.m87150e0(1966587243);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z13);
            }
            AbstractC25012a.m73388u(f14, i14, c2314t, c28655q2, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m50210R(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m50211S(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m50212T(Modifier modifier, AbstractC16205c abstractC16205c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m50204L(modifier, abstractC16205c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:110:0x0254  */
    /* JADX WARN: Code duplicated, block: B:112:0x0258  */
    /* JADX WARN: Code duplicated, block: B:117:0x0268  */
    /* JADX WARN: Code duplicated, block: B:119:0x0286  */
    /* JADX WARN: Code duplicated, block: B:122:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x0100  */
    /* JADX WARN: Code duplicated, block: B:72:0x0102  */
    /* JADX WARN: Code duplicated, block: B:76:0x010f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0145  */
    /* JADX WARN: Code duplicated, block: B:80:0x0149  */
    /* JADX WARN: Code duplicated, block: B:85:0x016a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0179  */
    /* JADX WARN: Code duplicated, block: B:89:0x017b  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:94:0x018e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0190  */
    /* JADX WARN: Code duplicated, block: B:99:0x019d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: U */
    private static final void m50213U(C17637i c17637i, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        String strM50255c;
        String strM50255c2;
        String strConcat;
        String strConcat2;
        String strM50255c3;
        String strConcat3;
        String strConcat4;
        String strM50255c4;
        String strConcat5;
        String strConcat6;
        String str;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        boolean z16;
        boolean zM87153g;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z17;
        boolean z18;
        boolean zM87153g2;
        Object objM87133R3;
        C38072d c38072d;
        int i16;
        int i17;
        boolean z19;
        long jM73366B;
        boolean z24;
        boolean zM87153g3;
        Object objM87133R4;
        Object objM87133R5;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1481105729);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c17637i) : c28655q2.m87157i(c17637i) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C17085h(28);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                strM50255c = c17637i.getId();
                if (strM50255c == null) {
                    strM50255c = "UnknownGoal";
                }
                strM50255c2 = c17637i.getId();
                if (strM50255c2 != null) {
                    strConcat = strM50255c2.concat("_HomeTile_Row");
                } else {
                    strConcat = null;
                }
                strConcat2 = "WeeklyPlanHomeTile_Row_Container_".concat(strM50255c);
                strM50255c3 = c17637i.getId();
                if (strM50255c3 != null) {
                    strConcat3 = strM50255c3.concat("_HomeTile_Title");
                } else {
                    strConcat3 = null;
                }
                strConcat4 = "WeeklyPlanHomeTile_Row_Text_Title_".concat(strM50255c);
                strM50255c4 = c17637i.getId();
                if (strM50255c4 != null) {
                    strConcat5 = strM50255c4.concat("_HomeTile_Progress_Indicator");
                } else {
                    strConcat5 = null;
                }
                strConcat6 = "WeeklyPlanHomeTile_Row_ProgressIndicator_".concat(strM50255c);
                str = strConcat5;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(c17637i))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R = c28655q2.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C13989w1(26, c17637i, function4);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15), strConcat);
                if (strConcat == null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87153g = c28655q2.m87153g(strConcat2);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2663y4(strConcat2, 28);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM44101d, z16, (Function1) objM87133R2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM44099b);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                if (1.0f > 0.0d) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM44101d2 = AbstractC15676d.m44101d(new LayoutWeightElement(1.0f, true), strConcat3);
                if (strConcat3 == null) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87153g2 = c28655q2.m87153g(strConcat4);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C2663y4(strConcat4, 29);
                    c28655q2.m87172p0(objM87133R3);
                }
                Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM44101d2, z18, (Function1) objM87133R3);
                String strM21275i = AbstractC8693b.m21275i(c17637i.getTitle(), c28655q2, 0);
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                C2886a c2886aM8420a = c38072d.m121952e(c28655q2, i16).getB1();
                i17 = a.f68384a[c17637i.getStyle().ordinal()];
                if (i17 != 1) {
                    z19 = false;
                    jM73366B = AbstractC25012a.m73366B(c28655q2, 1312146981, c38072d, c28655q2, i16);
                    c28655q2.m87173q(false);
                } else {
                    if (i17 == 2) {
                        throw AbstractC11895b.m32003v(1312144047, c28655q2, false);
                    }
                    c28655q2.m87150e0(1312149582);
                    jM73366B = c38072d.m121949b(c28655q2, i16).getAccentPositiveTrend();
                    z19 = false;
                    c28655q2.m87173q(false);
                }
                Function1 function5 = function4;
                AbstractC30795n.m94707h(strM21275i, modifierM44099b2, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q2;
                C28582b c28582bM50253a = c17637i.getCircularProgressIndicator();
                Modifier modifierM44101d3 = AbstractC15676d.m44101d(c2314t, str);
                if (str == null) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zM87153g3 = c28655q.m87153g(strConcat6);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g3 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C17632d(strConcat6, 0);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28586f.m86944i(AbstractC15676d.m44099b(modifierM44101d3, z24, (Function1) objM87133R4), c28582bM50253a, c28655q, C28582b.f115652u << 3, 0);
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(c17637i, i13, function3, i14, 23);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C17085h(28);
                    c28655q2.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            strM50255c = c17637i.getId();
            if (strM50255c == null) {
                strM50255c = "UnknownGoal";
            }
            strM50255c2 = c17637i.getId();
            if (strM50255c2 != null) {
                strConcat = strM50255c2.concat("_HomeTile_Row");
            } else {
                strConcat = null;
            }
            strConcat2 = "WeeklyPlanHomeTile_Row_Container_".concat(strM50255c);
            strM50255c3 = c17637i.getId();
            if (strM50255c3 != null) {
                strConcat3 = strM50255c3.concat("_HomeTile_Title");
            } else {
                strConcat3 = null;
            }
            strConcat4 = "WeeklyPlanHomeTile_Row_Text_Title_".concat(strM50255c);
            strM50255c4 = c17637i.getId();
            if (strM50255c4 != null) {
                strConcat5 = strM50255c4.concat("_HomeTile_Progress_Indicator");
            } else {
                strConcat5 = null;
            }
            strConcat6 = "WeeklyPlanHomeTile_Row_ProgressIndicator_".concat(strM50255c);
            str = strConcat5;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            if ((i15 & 14) != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z13;
            objM87133R = c28655q2.m87133R();
            if (z15) {
                objM87133R = new C13989w1(26, c17637i, function4);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C13989w1(26, c17637i, function4);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15), strConcat);
            if (strConcat == null) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87153g = c28655q2.m87153g(strConcat2);
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R2 = new C2663y4(strConcat2, 28);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2663y4(strConcat2, 28);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM44099b3 = AbstractC15676d.m44099b(modifierM44101d4, z16, (Function1) objM87133R2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM44099b3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            if (1.0f > 0.0d) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (!z17) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM44101d5 = AbstractC15676d.m44101d(new LayoutWeightElement(1.0f, true), strConcat3);
            if (strConcat3 == null) {
                z18 = true;
            } else {
                z18 = false;
            }
            zM87153g2 = c28655q2.m87153g(strConcat4);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R3 = new C2663y4(strConcat4, 29);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C2663y4(strConcat4, 29);
                c28655q2.m87172p0(objM87133R3);
            }
            Modifier modifierM44099b4 = AbstractC15676d.m44099b(modifierM44101d5, z18, (Function1) objM87133R3);
            String strM21275i2 = AbstractC8693b.m21275i(c17637i.getTitle(), c28655q2, 0);
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            C2886a c2886aM8420a2 = c38072d.m121952e(c28655q2, i16).getB1();
            i17 = a.f68384a[c17637i.getStyle().ordinal()];
            if (i17 != 1) {
                z19 = false;
                jM73366B = AbstractC25012a.m73366B(c28655q2, 1312146981, c38072d, c28655q2, i16);
                c28655q2.m87173q(false);
            } else {
                if (i17 == 2) {
                    throw AbstractC11895b.m32003v(1312144047, c28655q2, false);
                }
                c28655q2.m87150e0(1312149582);
                jM73366B = c38072d.m121949b(c28655q2, i16).getAccentPositiveTrend();
                z19 = false;
                c28655q2.m87173q(false);
            }
            Function1 function6 = function4;
            AbstractC30795n.m94707h(strM21275i2, modifierM44099b4, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q2, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q2;
            C28582b c28582bM50253a2 = c17637i.getCircularProgressIndicator();
            Modifier modifierM44101d6 = AbstractC15676d.m44101d(c2314t2, str);
            if (str == null) {
                z24 = true;
            } else {
                z24 = false;
            }
            zM87153g3 = c28655q.m87153g(strConcat6);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g3) {
                objM87133R4 = new C17632d(strConcat6, 0);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C17632d(strConcat6, 0);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28586f.m86944i(AbstractC15676d.m44099b(modifierM44101d6, z24, (Function1) objM87133R4), c28582bM50253a2, c28655q, C28582b.f115652u << 3, 0);
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(c17637i, i13, function3, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m50214V(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m50215W(C17637i c17637i, Function1 function1) {
        C9598e c9598eM50254b = c17637i.getDestination();
        if (c9598eM50254b != null) {
            function1.invoke(c9598eM50254b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final Modifier m50216X(String str, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC15676d.m44101d(applyIf, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final Modifier m50217Y(String str, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC15676d.m44101d(applyIf, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final Modifier m50218Z(String str, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC15676d.m44101d(applyIf, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m50220a0(C17637i c17637i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m50213U(c17637i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x027b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0283  */
    /* JADX WARN: Code duplicated, block: B:67:0x0293  */
    /* JADX WARN: Code duplicated, block: B:69:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x030a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0314  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    private static final void m50243x(AbstractC16205c.a aVar, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        Function1 function5;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        Function1 function6;
        int iHashCode2;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1559172936);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(aVar) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C17085h(29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                float f13 = 4;
                float f14 = f13 * f13;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3411h(f14, c2314t), "WeeklyPlanHomeTile_ErrorState_Container_Row");
                C2306l c2306l = C2299e.f9108K;
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i16 = i15;
                } else {
                    i16 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    float f15 = 1;
                    float f16 = f15 * f13;
                    Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f14, c2314t), AbstractC33253j.m105489e(f16));
                    C38072d c38072d = C38072d.f163053a;
                    int i18 = C38072d.f163054b;
                    function5 = function4;
                    Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, C17919x.m51541c(0.2f, c38072d.m121949b(c28655q, i18).getAccentNegativeTrend()), AbstractC17918w0.f69621a);
                    float f17 = 8;
                    float f18 = ((float) 0.5d) * f17;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getAttentionOrange(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM3358c, f18, f18), "WeeklyPlanHomeTile_ErrorState_Icon_Warning"), c38072d.m121949b(c28655q, i18).getAccentNegativeTrend(), c28655q, 48, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f16, c2314t));
                    AbstractC30795n.m94707h("Your plan failed to load", AbstractC1136a.m3599a(c2314t, "WeeklyPlanHomeTile_ErrorState_Text_ErrorMessage"), c38072d.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getH5(), null, c28655q, 54, C2886a.f11498d << 18, 196600);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    if ((i16 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = c28655q.m87157i(aVar) | z13;
                    objM87133R = c28655q.m87133R();
                    if (!zM87157i || objM87133R == c28676v0) {
                        function6 = function5;
                        objM87133R = new C13989w1(25, function6, aVar);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function6 = function5;
                    }
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getUndo(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f17 * f13, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15)), AbstractC33253j.m105489e(f16)), f18, 0.0f, 2), "WeeklyPlanHomeTile_ErrorState_Icon_Retry"), c38072d.m121949b(c28655q, i18).getBrandWhite(), c28655q, 48, 0);
                    c28655q.m87173q(true);
                    AbstractC11266d.m30469w(2, f13, c2314t, c28655q);
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3392n(c2314t, (-1) * f13, 0.0f, 2), "WeeklyPlanHomeTile_ErrorState_Container_ProgressBarRow");
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    AbstractC24821f.m72736b(AbstractC1136a.m3599a(c2314t, "WeeklyPlanHomeTile_ErrorState_ProgressBar_Empty"), 0, 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, i18).getAccentPositiveTrend()), new C17919x(c38072d.m121949b(c28655q, i18).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, i18).getWhite10(), false, f16, c28655q, 1769910, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15 * f17, c2314t));
                    function3 = function6;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                float f19 = 1;
                float f110 = f19 * f13;
                Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f14, c2314t), AbstractC33253j.m105489e(f110));
                C38072d c38072d2 = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                function5 = function4;
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM118994r2, C17919x.m51541c(0.2f, c38072d2.m121949b(c28655q, i19).getAccentNegativeTrend()), AbstractC17918w0.f69621a);
                float f111 = 8;
                float f112 = ((float) 0.5d) * f111;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getTinyIcons().getAttentionOrange(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM3358c2, f112, f112), "WeeklyPlanHomeTile_ErrorState_Icon_Warning"), c38072d2.m121949b(c28655q, i19).getAccentNegativeTrend(), c28655q, 48, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f110, c2314t));
                AbstractC30795n.m94707h("Your plan failed to load", AbstractC1136a.m3599a(c2314t, "WeeklyPlanHomeTile_ErrorState_Text_ErrorMessage"), c38072d2.m121949b(c28655q, i19).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i19).getH5(), null, c28655q, 54, C2886a.f11498d << 18, 196600);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = c28655q.m87157i(aVar) | z13;
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    function6 = function5;
                    objM87133R = new C13989w1(25, function6, aVar);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C13989w1(25, function6, aVar);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getAction().getUndo(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f111 * f13, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15)), AbstractC33253j.m105489e(f110)), f112, 0.0f, 2), "WeeklyPlanHomeTile_ErrorState_Icon_Retry"), c38072d2.m121949b(c28655q, i19).getBrandWhite(), c28655q, 48, 0);
                c28655q.m87173q(true);
                AbstractC11266d.m30469w(2, f13, c2314t, c28655q);
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1099a.m3392n(c2314t, (-1) * f13, 0.0f, 2), "WeeklyPlanHomeTile_ErrorState_Container_ProgressBarRow");
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3599a3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                AbstractC24821f.m72736b(AbstractC1136a.m3599a(c2314t, "WeeklyPlanHomeTile_ErrorState_ProgressBar_Empty"), 0, 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, i19).getAccentPositiveTrend()), new C17919x(c38072d2.m121949b(c28655q, i19).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d2.m121949b(c28655q, i19).getWhite10(), false, f110, c28655q, 1769910, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f19 * f111, c2314t));
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(aVar, i13, function3, i14, 22);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C17085h(29);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            float f113 = 4;
            float f114 = f113 * f113;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1102d.m3411h(f114, c2314t2), "WeeklyPlanHomeTile_ErrorState_Container_Row");
            C2306l c2306l2 = C2299e.f9108K;
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3599a4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a4);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i16 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                float f115 = 1;
                float f116 = f115 * f113;
                Modifier modifierM118994r3 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f114, c2314t2), AbstractC33253j.m105489e(f116));
                C38072d c38072d3 = C38072d.f163053a;
                int i110 = C38072d.f163054b;
                function5 = function4;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(modifierM118994r3, C17919x.m51541c(0.2f, c38072d3.m121949b(c28655q, i110).getAccentNegativeTrend()), AbstractC17918w0.f69621a);
                float f117 = 8;
                float f118 = ((float) 0.5d) * f117;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d3.m121951d().getTinyIcons().getAttentionOrange(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM3358c3, f118, f118), "WeeklyPlanHomeTile_ErrorState_Icon_Warning"), c38072d3.m121949b(c28655q, i110).getAccentNegativeTrend(), c28655q, 48, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f116, c2314t2));
                AbstractC30795n.m94707h("Your plan failed to load", AbstractC1136a.m3599a(c2314t2, "WeeklyPlanHomeTile_ErrorState_Text_ErrorMessage"), c38072d3.m121949b(c28655q, i110).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i110).getH5(), null, c28655q, 54, C2886a.f11498d << 18, 196600);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = c28655q.m87157i(aVar) | z13;
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    function6 = function5;
                    objM87133R = new C13989w1(25, function6, aVar);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C13989w1(25, function6, aVar);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d3.m121951d().getAction().getUndo(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f117 * f113, AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15)), AbstractC33253j.m105489e(f116)), f118, 0.0f, 2), "WeeklyPlanHomeTile_ErrorState_Icon_Retry"), c38072d3.m121949b(c28655q, i110).getBrandWhite(), c28655q, 48, 0);
                c28655q.m87173q(true);
                AbstractC11266d.m30469w(2, f113, c2314t2, c28655q);
                Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1099a.m3392n(c2314t2, (-1) * f113, 0.0f, 2), "WeeklyPlanHomeTile_ErrorState_Container_ProgressBarRow");
                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3599a5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a5);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                AbstractC24821f.m72736b(AbstractC1136a.m3599a(c2314t2, "WeeklyPlanHomeTile_ErrorState_ProgressBar_Empty"), 0, 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d3.m121949b(c28655q, i110).getAccentPositiveTrend()), new C17919x(c38072d3.m121949b(c28655q, i110).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d3.m121949b(c28655q, i110).getWhite10(), false, f116, c28655q, 1769910, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f115 * f117, c2314t2));
                function3 = function6;
            } else {
                i16 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            float f119 = 1;
            float f1110 = f119 * f113;
            Modifier modifierM118994r4 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f114, c2314t2), AbstractC33253j.m105489e(f1110));
            C38072d c38072d4 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            function5 = function4;
            Modifier modifierM3358c4 = AbstractC1092a.m3358c(modifierM118994r4, C17919x.m51541c(0.2f, c38072d4.m121949b(c28655q, i111).getAccentNegativeTrend()), AbstractC17918w0.f69621a);
            float f1111 = 8;
            float f1112 = ((float) 0.5d) * f1111;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d4.m121951d().getTinyIcons().getAttentionOrange(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM3358c4, f1112, f1112), "WeeklyPlanHomeTile_ErrorState_Icon_Warning"), c38072d4.m121949b(c28655q, i111).getAccentNegativeTrend(), c28655q, 48, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f1110, c2314t2));
            AbstractC30795n.m94707h("Your plan failed to load", AbstractC1136a.m3599a(c2314t2, "WeeklyPlanHomeTile_ErrorState_Text_ErrorMessage"), c38072d4.m121949b(c28655q, i111).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i111).getH5(), null, c28655q, 54, C2886a.f11498d << 18, 196600);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = c28655q.m87157i(aVar) | z13;
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                function6 = function5;
                objM87133R = new C13989w1(25, function6, aVar);
                c28655q.m87172p0(objM87133R);
            } else {
                function6 = function5;
                objM87133R = new C13989w1(25, function6, aVar);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d4.m121951d().getAction().getUndo(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f1111 * f113, AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15)), AbstractC33253j.m105489e(f1110)), f1112, 0.0f, 2), "WeeklyPlanHomeTile_ErrorState_Icon_Retry"), c38072d4.m121949b(c28655q, i111).getBrandWhite(), c28655q, 48, 0);
            c28655q.m87173q(true);
            AbstractC11266d.m30469w(2, f113, c2314t2, c28655q);
            Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC1099a.m3392n(c2314t2, (-1) * f113, 0.0f, 2), "WeeklyPlanHomeTile_ErrorState_Container_ProgressBarRow");
            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3599a6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a6);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            AbstractC24821f.m72736b(AbstractC1136a.m3599a(c2314t2, "WeeklyPlanHomeTile_ErrorState_ProgressBar_Empty"), 0, 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c38072d4.m121949b(c28655q, i111).getAccentPositiveTrend()), new C17919x(c38072d4.m121949b(c28655q, i111).getAccentPositiveTrend())), 0.0f, 0.0f, 14), c38072d4.m121949b(c28655q, i111).getWhite10(), false, f1110, c28655q, 1769910, 0);
            c28655q = c28655q;
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f119 * f1111, c2314t2));
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(aVar, i13, function3, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m50244y(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m50245z(Function1 function1, AbstractC16205c.a aVar) {
        function1.invoke(new AbstractC16204b.b(aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()));
        return C23454a0.f92919a;
    }
}
