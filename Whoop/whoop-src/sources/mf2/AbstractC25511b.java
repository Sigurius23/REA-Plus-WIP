package mf2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c41.C3990a5;
import c41.C4143w4;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dc0.C11901c;
import gb1.AbstractC15680h;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kf2.AbstractC22445d;
import kf2.C22442a;
import kf2.C22443b;
import l80.C23434k;
import l83.C23454a0;
import lf0.C23956p1;
import m01.C24875c;
import nf2.AbstractC26668a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24958m;
import p745y81.EnumC39333f;
import pf2.AbstractC29153c;
import q83.AbstractC30060g;
import qe2.AbstractC30314g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import we2.AbstractC37232a;
import x81.C38072d;

/* JADX INFO: renamed from: mf2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lkf2/d$e;", "sleepScheduleListViewState", "Lkotlin/Function1;", "Lnf2/a;", "Ll83/a0;", "sleepScheduleListEventListener", "Lpf2/c;", "wakeTimeSchedulingViewEventListener", "Lwe2/a;", "sleepScheduleAnalyticEventListener", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lkf2/d$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25511b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public static final void m75005h(AbstractC22445d.e sleepScheduleListViewState, final Function1 sleepScheduleListEventListener, final Function1 wakeTimeSchedulingViewEventListener, final Function1 sleepScheduleAnalyticEventListener, Composer composer, int i13) {
        C28655q c28655q;
        float f13;
        boolean z4;
        int i14;
        C2314t c2314t;
        int i15;
        C28655q c28655q2;
        boolean z13;
        C28655q c28655q3;
        C28655q c28655q4;
        boolean z14;
        C2305k c2305k = C2299e.f9111N;
        C2307m c2307m = C2299e.f9114w;
        AbstractC22676k.m65750j(sleepScheduleListViewState, "sleepScheduleListViewState");
        AbstractC22676k.m65750j(sleepScheduleListEventListener, "sleepScheduleListEventListener");
        AbstractC22676k.m65750j(wakeTimeSchedulingViewEventListener, "wakeTimeSchedulingViewEventListener");
        AbstractC22676k.m65750j(sleepScheduleAnalyticEventListener, "sleepScheduleAnalyticEventListener");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-638258112);
        int i16 = (i13 & 6) == 0 ? (c28655q5.m87157i(sleepScheduleListViewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i16 |= c28655q5.m87157i(sleepScheduleListEventListener) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q5.m87157i(wakeTimeSchedulingViewEventListener) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= c28655q5.m87157i(sleepScheduleAnalyticEventListener) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q5.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, c2314t2);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N);
            float f14 = 4;
            float f15 = 8;
            float f16 = f14 * f15;
            float f17 = 3 * f15;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC15680h.m44112a(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3395q(c2314t2, f17, f16)), null, 3), !sleepScheduleListViewState.getSleepScheduleList().getShouldShowOverlay()), AbstractC30060g.m92099U(0, c28655q5, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q5, 48);
            int iHashCode2 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, modifierM92116f0);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N2);
            C22443b c22443bM64786a = sleepScheduleListViewState.getSleepScheduleList();
            boolean zM64772k = c22443bM64786a.getShowScheduleList();
            Object obj = C28635l.f115821a;
            float f18 = 0.0f;
            if (zM64772k) {
                c28655q5.m87150e0(-1427860433);
                c28655q5.m87150e0(1062320244);
                for (final C22442a c22442a : c22443bM64786a.m64762a()) {
                    C4143w4 c4143w4 = new C4143w4();
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t2, f18, 1 * f15, 1);
                    List<TextResource> listM64757e = c22442a.m64757e();
                    TextResource textResourceM64760h = c22442a.getLatestWakeTime();
                    C17750h1 c17750h1 = new C17750h1(c22442a.getAlarmTagText(), c22442a.getAlarmTagIcon(), c22442a.getAlarmTagColor(), null, c22442a.getAlarmTagTextColor(), null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194280, null);
                    TextResource textResourceM64759g = c22442a.getEditTitle();
                    TextResource textResourceM64758f = c22442a.getDeleteTitle();
                    int i17 = i16 & 7168;
                    boolean z15 = i17 == 2048;
                    Object objM87133R = c28655q5.m87133R();
                    if (z15 || objM87133R == obj) {
                        objM87133R = new C23434k(sleepScheduleAnalyticEventListener, 17);
                        c28655q5.m87172p0(objM87133R);
                    }
                    Function1 function1 = (Function1) objM87133R;
                    boolean zM87157i = ((i16 & 896) == 256) | c28655q5.m87157i(c22442a) | (i17 == 2048);
                    Object objM87133R2 = c28655q5.m87133R();
                    if (zM87157i || objM87133R2 == obj) {
                        final int i18 = 0;
                        objM87133R2 = new InterfaceC4339a() { // from class: mf2.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        return AbstractC25511b.m75007j(wakeTimeSchedulingViewEventListener, c22442a, sleepScheduleAnalyticEventListener);
                                    default:
                                        return AbstractC25511b.m75008k(wakeTimeSchedulingViewEventListener, c22442a, sleepScheduleAnalyticEventListener);
                                }
                            }
                        };
                        c28655q5.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    boolean zM87157i2 = (i17 == 2048) | ((i16 & 112) == 32) | c28655q5.m87157i(c22442a);
                    Object objM87133R3 = c28655q5.m87133R();
                    if (zM87157i2 || objM87133R3 == obj) {
                        final int i19 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: mf2.a
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        return AbstractC25511b.m75007j(sleepScheduleListEventListener, c22442a, sleepScheduleAnalyticEventListener);
                                    default:
                                        return AbstractC25511b.m75008k(sleepScheduleListEventListener, c22442a, sleepScheduleAnalyticEventListener);
                                }
                            }
                        };
                        c28655q5.m87172p0(objM87133R3);
                    }
                    C3990a5 c3990a5 = new C3990a5(null, listM64757e, textResourceM64760h, false, true, c17750h1, textResourceM64759g, textResourceM64758f, function1, interfaceC4339a2, (InterfaceC4339a) objM87133R3, 9, null);
                    Object objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == obj) {
                        objM87133R4 = new C24875c(25);
                        c28655q5.m87172p0(objM87133R4);
                    }
                    c4143w4.Compose(modifierM3396r, c3990a5, (Function1) objM87133R4, c28655q5, (C4143w4.f16869a << 9) | (C3990a5.f16237l << 3) | 390);
                    f18 = 0.0f;
                }
                z4 = false;
                i14 = 256;
                c28655q5.m87173q(false);
                f13 = f14;
                AbstractC31061c.m95650z(2, f13, c2314t2, c28655q5, false);
            } else {
                f13 = f14;
                z4 = false;
                i14 = 256;
                c28655q5.m87150e0(-1425870202);
                c28655q5.m87173q(false);
            }
            if (c22443bM64786a.getShowCreatedButton()) {
                c28655q5.m87150e0(-1425781139);
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM92103Y = AbstractC30060g.m92103Y(c28655q5, AbstractC30314g.f124294a0);
                Modifier modifierM3429z = AbstractC1102d.m3429z(AbstractC1099a.m3396r(c2314t2, 0.0f, ((float) 1.5d) * f15, 1), null, 3);
                boolean z16 = ((i16 & 7168) == 2048 ? true : z4) | ((i16 & 896) == i14 ? true : z4);
                Object objM87133R5 = c28655q5.m87133R();
                if (z16 || objM87133R5 == obj) {
                    objM87133R5 = new C11901c(wakeTimeSchedulingViewEventListener, 5, sleepScheduleAnalyticEventListener);
                    c28655q5.m87172p0(objM87133R5);
                }
                i15 = 1;
                boolean z17 = z4;
                c2314t = c2314t2;
                AbstractC27282u.m82292h(modifierM3429z, enumC27284v, strM92103Y, false, 0L, null, false, (InterfaceC4339a) objM87133R5, c28655q5, 54, 120);
                C28655q c28655q6 = c28655q5;
                c28655q6.m87173q(z17);
                z13 = z17;
                c28655q2 = c28655q6;
            } else {
                boolean z18 = z4;
                c2314t = c2314t2;
                i15 = 1;
                c28655q5.m87150e0(-1425251194);
                c28655q5.m87173q(z18);
                z13 = z18;
                c28655q2 = c28655q5;
            }
            if (c22443bM64786a.getShouldShowCallOutText()) {
                c28655q2.m87150e0(-1425148894);
                Modifier modifierM3429z2 = AbstractC1102d.m3429z(AbstractC1099a.m3396r(c2314t, 0.0f, i15 * r21, i15), null, 3);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                int iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3429z2);
                InterfaceC0221l.f734a.getClass();
                InterfaceC4339a interfaceC4339a3 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a3);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
                C0209i c0209i7 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i7);
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N3);
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3419p(6 * f13, c2314t), c22443bM64786a.getCallOutTextColor().mo134584toComposableColorWaAFU9c(c28655q2, z13), AbstractC33253j.f138651a);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, z13);
                int iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a3);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N4);
                C28655q c28655q7 = c28655q2;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c22443bM64786a.getCallOutIcon().getIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(((float) 2.5d) * f13, c2314t), EnumC39333f.BRAND_BLACK.mo134584toComposableColorWaAFU9c(c28655q2, 6), c28655q7, 432, 0);
                c28655q7.m87173q(true);
                AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(2 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22443bM64786a.getCallOutText(), c28655q7, TextResource.$stable), c2314t, c22443bM64786a.getCallOutTextColor().mo134584toComposableColorWaAFU9c(c28655q7, 0), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q7, C38072d.f163054b).getB2(), null, c28655q7, 48, C2886a.f11498d << 18, 196088);
                C28655q c28655q8 = c28655q7;
                c28655q8.m87173q(true);
                c28655q8.m87173q(false);
                c28655q3 = c28655q8;
            } else {
                c28655q2.m87150e0(-1423791962);
                c28655q2.m87173q(z13);
                c28655q3 = c28655q2;
            }
            if (c22443bM64786a.getShouldShowDescriptionText()) {
                c28655q3.m87150e0(-1423697691);
                Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1099a.m3395q(c2314t, f17, ((float) 1.5d) * r21));
                String strM21274h = AbstractC8693b.m21274h(c22443bM64786a.getDescriptionText(), c28655q3, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                C28655q c28655q9 = c28655q3;
                AbstractC30795n.m94707h(strM21274h, modifierM38560g, c38072d.m121949b(c28655q3, i24).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i24).getB2(), null, c28655q9, 0, C2886a.f11498d << 18, 196088);
                C28655q c28655q10 = c28655q9;
                c28655q10.m87173q(false);
                c28655q4 = c28655q10;
            } else {
                c28655q3.m87150e0(-1423252314);
                c28655q3.m87173q(false);
                c28655q4 = c28655q3;
            }
            c28655q4.m87173q(true);
            if (sleepScheduleListViewState.getSleepScheduleList().getShouldShowOverlay()) {
                c28655q4.m87150e0(2049639639);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3406c(1.0f, c2314t));
                Object objM87133R6 = c28655q4.m87133R();
                if (objM87133R6 == obj) {
                    objM87133R6 = AbstractC11266d.m30453g(c28655q4);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R6;
                C18027i c18027i = new C18027i(0);
                Object objM87133R7 = c28655q4.m87133R();
                if (objM87133R7 == obj) {
                    objM87133R7 = new C24958m(18);
                    c28655q4.m87172p0(objM87133R7);
                }
                Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1092a.m3360e(modifierM3409f, interfaceC21083i, null, true, c18027i, (InterfaceC4339a) objM87133R7, 8), C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode5 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, modifierM3358c2);
                InterfaceC0221l.f734a.getClass();
                InterfaceC4339a interfaceC4339a4 = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a4);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m5);
                C0209i c0209i9 = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q4, iHashCode5, c0209i9);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N5);
                z14 = true;
                c28655q4.m87173q(true);
                c28655q4.m87173q(false);
            } else {
                z14 = true;
                c28655q4.m87150e0(2050105724);
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(z14);
            c28655q = c28655q4;
        } else {
            c28655q5.m87138X();
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23956p1(sleepScheduleListViewState, sleepScheduleListEventListener, wakeTimeSchedulingViewEventListener, sleepScheduleAnalyticEventListener, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m75006i(Function1 function1, boolean z4) {
        if (z4) {
            function1.invoke(new AbstractC37232a.d("Expand"));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m75007j(Function1 function1, C22442a c22442a, Function1 function2) {
        function1.invoke(new AbstractC29153c.d(c22442a.getScheduleId()));
        function2.invoke(new AbstractC37232a.d("Edit"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m75008k(Function1 function1, C22442a c22442a, Function1 function2) {
        function1.invoke(new AbstractC26668a.b(c22442a.getScheduleId()));
        function2.invoke(new AbstractC37232a.d("Delete"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m75009l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m75010m(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC29153c.c.f118003a);
        function2.invoke(AbstractC37232a.b.f159222a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m75011n() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m75012o(AbstractC22445d.e eVar, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m75005h(eVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
