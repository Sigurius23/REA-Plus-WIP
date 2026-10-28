package lf0;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import b30.C2609r;
import c11.C3837d;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import j11.AbstractC21211n;
import jp2.C21881l;
import jt1.C21937b;
import kd1.AbstractC22403o;
import kw1.C22852c;
import l72.C23399f;
import l72.C23401h;
import l80.C23434k;
import l83.C23454a0;
import la0.C23552a;
import ld0.C23845d;
import ma0.AbstractC25370d;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27246d;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lf0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u000e\u0010\u0015\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/m;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "m", "(Landroidx/compose/ui/Modifier;Llf0/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_EVENT, "", "C", "(Ljava/lang/Object;)Z", "Llf0/v;", "Lkotlin/Function0;", "onApproveRequest", "onDismissRequest", "onSecondaryActionClicked", "x", "(Llf0/v;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "showDialog", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23938l {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m70450A() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m70451B(C23976v c23976v, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, int i14, Composer composer, int i15) {
        m70476x(c23976v, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m70452C(Object event) {
        AbstractC22676k.m65750j(event, "event");
        C27256h c27256h = event instanceof C27256h ? (C27256h) event : null;
        return (c27256h != null ? c27256h.getActionArgument() : null) instanceof AnyModal;
    }

    /* JADX INFO: renamed from: m */
    public static final void m70465m(Modifier modifier, final C23942m state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C2314t c2314t;
        C28676v0 c28676v0;
        boolean z4;
        final Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(509478908);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier3 = i16 != 0 ? c2314t2 : modifier2;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R == c28676v1) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99438g);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            float f13 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            Modifier modifier4 = modifier3;
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
            final InterfaceC28601c1 interfaceC28601c2 = interfaceC28601c1;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23845d c23845dM70518c = state.getAppointmentSummary();
            int i18 = i17 & 896;
            boolean z13 = i18 == 256;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v1) {
                objM87133R2 = new C23434k(onViewEvent, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC23954p.m70583h(null, c23845dM70518c, (Function1) objM87133R2, c28655q, AbstractC22403o.f87638a << 3, 1);
            c28655q = c28655q;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (state.getAddToCalendarButton() == null || state.getAddToCalendarData() == null) {
                onViewEvent = function1;
                c2314t = c2314t2;
                interfaceC28601c2 = interfaceC28601c2;
                c28676v0 = c28676v1;
                z4 = false;
                c28655q.m87150e0(-938114278);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-939190598);
                C27246d c27246d = new C27246d();
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C27256h c27256hM82144b = C27256h.m82144b(state.getAddToCalendarButton(), null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null);
                boolean zM87157i = (i18 == 256) | c28655q.m87157i(context) | c28655q.m87153g(strM92103Y) | ((i17 & 112) == 32 || ((i17 & 64) != 0 && c28655q.m87157i(state)));
                Object objM87133R3 = c28655q.m87133R();
                c28676v0 = c28676v1;
                if (zM87157i || objM87133R3 == c28676v0) {
                    c2314t = c2314t2;
                    onViewEvent = function1;
                    C21881l c21881l = new C21881l(onViewEvent, context, strM92103Y, state, 6);
                    c28655q.m87172p0(c21881l);
                    objM87133R3 = c21881l;
                } else {
                    onViewEvent = function1;
                    c2314t = c2314t2;
                }
                c27246d.Compose(modifierM3409f3, c27256hM82144b, (Function1) objM87133R3, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                z4 = false;
                c28655q.m87173q(false);
            }
            C27256h c27256hM70521g = state.getDownloadLabOrderButton();
            if (c27256hM70521g == null) {
                c28655q.m87150e0(-938050202);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(-938050201);
                C27246d c27246d2 = new C27246d();
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 0.5d) * f13, 0.0f, 0.0f, 13);
                C27256h c27256hM82144b2 = C27256h.m82144b(c27256hM70521g, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null);
                boolean zM87157i2 = (i18 == 256) | c28655q.m87157i(c27256hM70521g);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C3837d(onViewEvent, c27256hM70521g, 8);
                    c28655q.m87172p0(objM87133R4);
                }
                c27246d2.Compose(modifierM3398t, c27256hM82144b2, (Function1) objM87133R4, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                z4 = false;
                c28655q.m87173q(false);
            }
            C27256h c27256hM70519e = state.getCancelRescheduleButton();
            if (c27256hM70519e == null) {
                c28655q.m87150e0(-937354345);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(-937354344);
                C27246d c27246d3 = new C27246d();
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, ((float) 0.5d) * f13, 0.0f, 0.0f, 13);
                C27256h c27256hM82144b3 = C27256h.m82144b(c27256hM70519e, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529855, null);
                boolean z14 = i18 == 256;
                Object objM87133R5 = c28655q.m87133R();
                if (z14 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C2609r(onViewEvent, interfaceC28601c2, 18);
                    c28655q.m87172p0(objM87133R5);
                }
                c27246d3.Compose(modifierM3398t2, c27256hM82144b3, (Function1) objM87133R5, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
                c28655q.m87173q(false);
            }
            boolean z15 = true;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (!m70466n(interfaceC28601c2) || state.getCancelRescheduleDialog() == null) {
                c28655q.m87150e0(-524194746);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-524777112);
                C23976v c23976vM70520f = state.getCancelRescheduleDialog();
                int i19 = i17 & 112;
                boolean z16 = (i19 == 32 || ((i17 & 64) != 0 && c28655q.m87157i(state))) | (i18 == 256);
                Object objM87133R6 = c28655q.m87133R();
                if (z16 || objM87133R6 == c28676v0) {
                    final int i24 = 0;
                    objM87133R6 = new InterfaceC4339a() { // from class: lf0.k
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return AbstractC23938l.m70472t(onViewEvent, state, interfaceC28601c2);
                                default:
                                    return AbstractC23938l.m70474v(onViewEvent, state, interfaceC28601c2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
                Object objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C21937b(10, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R7;
                boolean z17 = i18 == 256;
                if (i19 != 32 && ((i17 & 64) == 0 || !c28655q.m87157i(state))) {
                    z15 = false;
                }
                boolean z18 = z15 | z17;
                Object objM87133R8 = c28655q.m87133R();
                if (z18 || objM87133R8 == c28676v0) {
                    final int i25 = 1;
                    objM87133R8 = new InterfaceC4339a() { // from class: lf0.k
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i25) {
                                case 0:
                                    return AbstractC23938l.m70472t(onViewEvent, state, interfaceC28601c2);
                                default:
                                    return AbstractC23938l.m70474v(onViewEvent, state, interfaceC28601c2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R8);
                }
                m70476x(c23976vM70520f, interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R8, c28655q, C27256h.f109055z | 384, 0);
                c28655q.m87173q(false);
            }
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 7, (Object) modifier2, (Object) state, onViewEvent);
        }
    }

    /* JADX INFO: renamed from: n */
    private static final boolean m70466n(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    private static final void m70467o(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m70468p(Function1 function1, AppointmentSummaryBottomSheet bottomSheet) {
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        function1.invoke(bottomSheet);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m70469q(Function1 function1, Context context, String str, C23942m c23942m, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (m70452C(it)) {
            function1.invoke(it);
        } else if (C23552a.m68200b(C23552a.f93401a, context, str, c23942m.getAddToCalendarData().getDateTimeStart(), c23942m.getAddToCalendarData().getDateTimeEnd(), c23942m.getAppointmentSummary().getLocationValue(), null, null, 96, null)) {
            function1.invoke(AbstractC23926i.a.f94566a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m70470r(Function1 function1, C27256h c27256h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (m70452C(it)) {
            function1.invoke(it);
        } else {
            function1.invoke(new AbstractC23926i.c(c27256h));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m70471s(Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (m70452C(it)) {
            function1.invoke(it);
        } else {
            m70467o(interfaceC28601c1, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m70472t(Function1 function1, C23942m c23942m, InterfaceC28601c1 interfaceC28601c1) {
        m70467o(interfaceC28601c1, false);
        function1.invoke(c23942m.getCancelRescheduleDialog().getPrimaryBtn().getDestination());
        function1.invoke(AbstractC23926i.b.f94567a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m70473u(InterfaceC28601c1 interfaceC28601c1) {
        m70467o(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m70474v(Function1 function1, C23942m c23942m, InterfaceC28601c1 interfaceC28601c1) {
        m70467o(interfaceC28601c1, false);
        function1.invoke(c23942m.getCancelRescheduleDialog().getSecondaryBtn().getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m70475w(Modifier modifier, C23942m c23942m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70465m(modifier, c23942m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:75:0x0156  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    public static final void m70476x(C23976v state, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a4;
        int i16;
        InterfaceC4339a interfaceC4339a5;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a6;
        int i19;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        InterfaceC4339a interfaceC4339a9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a10;
        InterfaceC4339a interfaceC4339a11;
        InterfaceC4339a interfaceC4339a12;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(343535834);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a4 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a4) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a5 = interfaceC4339a2;
                    if (c28655q2.m87157i(interfaceC4339a5)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        interfaceC4339a6 = interfaceC4339a3;
                        if (c28655q2.m87157i(interfaceC4339a6)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C23399f(16);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a10 = interfaceC4339a4;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C23399f(17);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a11 = interfaceC4339a5;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C23399f(15);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a12 = interfaceC4339a6;
                        }
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(state.getTitle());
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(state.getDescription());
                        TextResource title = state.getPrimaryBtn().getTitle();
                        TextResource title2 = state.getSecondaryBtn().getTitle();
                        int i25 = TextResource.$stable;
                        c28655q = c28655q2;
                        AbstractC21211n.m59497o(null, textResourceM21278l, textResourceM21278l2, title, false, null, null, null, null, title2, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11, interfaceC4339a12, interfaceC4339a10, null, null, null, c28655q, (i25 << 3) | (i25 << 6) | (i25 << 9) | (i25 << 27), 0, (i15 & 8064) | ((i15 << 9) & 57344), 239074801);
                        interfaceC4339a8 = interfaceC4339a11;
                        interfaceC4339a9 = interfaceC4339a12;
                        interfaceC4339a7 = interfaceC4339a10;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        interfaceC4339a7 = interfaceC4339a4;
                        interfaceC4339a8 = interfaceC4339a5;
                        interfaceC4339a9 = interfaceC4339a6;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C22852c((Object) state, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 7);
                    }
                }
                i15 |= 3072;
                interfaceC4339a6 = interfaceC4339a3;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C23399f(16);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23399f(17);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23399f(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a12 = interfaceC4339a6;
                    }
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(state.getTitle());
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(state.getDescription());
                    TextResource title3 = state.getPrimaryBtn().getTitle();
                    TextResource title4 = state.getSecondaryBtn().getTitle();
                    int i26 = TextResource.$stable;
                    c28655q = c28655q2;
                    AbstractC21211n.m59497o(null, textResourceM21278l3, textResourceM21278l4, title3, false, null, null, null, null, title4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11, interfaceC4339a12, interfaceC4339a10, null, null, null, c28655q, (i26 << 3) | (i26 << 6) | (i26 << 9) | (i26 << 27), 0, (i15 & 8064) | ((i15 << 9) & 57344), 239074801);
                    interfaceC4339a8 = interfaceC4339a11;
                    interfaceC4339a9 = interfaceC4339a12;
                    interfaceC4339a7 = interfaceC4339a10;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                    interfaceC4339a9 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c((Object) state, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 7);
                }
            }
            i15 |= 384;
            interfaceC4339a5 = interfaceC4339a2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a6 = interfaceC4339a3;
                    if (c28655q2.m87157i(interfaceC4339a6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C23399f(16);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23399f(17);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23399f(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a12 = interfaceC4339a6;
                    }
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(state.getTitle());
                    TextResource textResourceM21278l6 = AbstractC8693b.m21278l(state.getDescription());
                    TextResource title5 = state.getPrimaryBtn().getTitle();
                    TextResource title6 = state.getSecondaryBtn().getTitle();
                    int i27 = TextResource.$stable;
                    c28655q = c28655q2;
                    AbstractC21211n.m59497o(null, textResourceM21278l5, textResourceM21278l6, title5, false, null, null, null, null, title6, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11, interfaceC4339a12, interfaceC4339a10, null, null, null, c28655q, (i27 << 3) | (i27 << 6) | (i27 << 9) | (i27 << 27), 0, (i15 & 8064) | ((i15 << 9) & 57344), 239074801);
                    interfaceC4339a8 = interfaceC4339a11;
                    interfaceC4339a9 = interfaceC4339a12;
                    interfaceC4339a7 = interfaceC4339a10;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                    interfaceC4339a9 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c((Object) state, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 7);
                }
            }
            i15 |= 3072;
            interfaceC4339a6 = interfaceC4339a3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C23399f(16);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a10 = interfaceC4339a4;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23399f(17);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C23399f(15);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a12 = interfaceC4339a6;
                }
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(state.getTitle());
                TextResource textResourceM21278l8 = AbstractC8693b.m21278l(state.getDescription());
                TextResource title7 = state.getPrimaryBtn().getTitle();
                TextResource title8 = state.getSecondaryBtn().getTitle();
                int i28 = TextResource.$stable;
                c28655q = c28655q2;
                AbstractC21211n.m59497o(null, textResourceM21278l7, textResourceM21278l8, title7, false, null, null, null, null, title8, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11, interfaceC4339a12, interfaceC4339a10, null, null, null, c28655q, (i28 << 3) | (i28 << 6) | (i28 << 9) | (i28 << 27), 0, (i15 & 8064) | ((i15 << 9) & 57344), 239074801);
                interfaceC4339a8 = interfaceC4339a11;
                interfaceC4339a9 = interfaceC4339a12;
                interfaceC4339a7 = interfaceC4339a10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
                interfaceC4339a9 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) state, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 7);
            }
        }
        i15 |= 48;
        interfaceC4339a4 = interfaceC4339a;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a5 = interfaceC4339a2;
                if (c28655q2.m87157i(interfaceC4339a5)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a6 = interfaceC4339a3;
                    if (c28655q2.m87157i(interfaceC4339a6)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C23399f(16);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a10 = interfaceC4339a4;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C23399f(17);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C23399f(15);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a12 = interfaceC4339a6;
                    }
                    TextResource textResourceM21278l9 = AbstractC8693b.m21278l(state.getTitle());
                    TextResource textResourceM21278l10 = AbstractC8693b.m21278l(state.getDescription());
                    TextResource title9 = state.getPrimaryBtn().getTitle();
                    TextResource title10 = state.getSecondaryBtn().getTitle();
                    int i29 = TextResource.$stable;
                    c28655q = c28655q2;
                    AbstractC21211n.m59497o(null, textResourceM21278l9, textResourceM21278l10, title9, false, null, null, null, null, title10, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11, interfaceC4339a12, interfaceC4339a10, null, null, null, c28655q, (i29 << 3) | (i29 << 6) | (i29 << 9) | (i29 << 27), 0, (i15 & 8064) | ((i15 << 9) & 57344), 239074801);
                    interfaceC4339a8 = interfaceC4339a11;
                    interfaceC4339a9 = interfaceC4339a12;
                    interfaceC4339a7 = interfaceC4339a10;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                    interfaceC4339a9 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c((Object) state, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 7);
                }
            }
            i15 |= 3072;
            interfaceC4339a6 = interfaceC4339a3;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C23399f(16);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a10 = interfaceC4339a4;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23399f(17);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C23399f(15);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a12 = interfaceC4339a6;
                }
                TextResource textResourceM21278l11 = AbstractC8693b.m21278l(state.getTitle());
                TextResource textResourceM21278l12 = AbstractC8693b.m21278l(state.getDescription());
                TextResource title11 = state.getPrimaryBtn().getTitle();
                TextResource title12 = state.getSecondaryBtn().getTitle();
                int i210 = TextResource.$stable;
                c28655q = c28655q2;
                AbstractC21211n.m59497o(null, textResourceM21278l11, textResourceM21278l12, title11, false, null, null, null, null, title12, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11, interfaceC4339a12, interfaceC4339a10, null, null, null, c28655q, (i210 << 3) | (i210 << 6) | (i210 << 9) | (i210 << 27), 0, (i15 & 8064) | ((i15 << 9) & 57344), 239074801);
                interfaceC4339a8 = interfaceC4339a11;
                interfaceC4339a9 = interfaceC4339a12;
                interfaceC4339a7 = interfaceC4339a10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
                interfaceC4339a9 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) state, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 7);
            }
        }
        i15 |= 384;
        interfaceC4339a5 = interfaceC4339a2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a6 = interfaceC4339a3;
                if (c28655q2.m87157i(interfaceC4339a6)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C23399f(16);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a10 = interfaceC4339a4;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C23399f(17);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C23399f(15);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a12 = interfaceC4339a6;
                }
                TextResource textResourceM21278l13 = AbstractC8693b.m21278l(state.getTitle());
                TextResource textResourceM21278l14 = AbstractC8693b.m21278l(state.getDescription());
                TextResource title13 = state.getPrimaryBtn().getTitle();
                TextResource title14 = state.getSecondaryBtn().getTitle();
                int i211 = TextResource.$stable;
                c28655q = c28655q2;
                AbstractC21211n.m59497o(null, textResourceM21278l13, textResourceM21278l14, title13, false, null, null, null, null, title14, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11, interfaceC4339a12, interfaceC4339a10, null, null, null, c28655q, (i211 << 3) | (i211 << 6) | (i211 << 9) | (i211 << 27), 0, (i15 & 8064) | ((i15 << 9) & 57344), 239074801);
                interfaceC4339a8 = interfaceC4339a11;
                interfaceC4339a9 = interfaceC4339a12;
                interfaceC4339a7 = interfaceC4339a10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
                interfaceC4339a9 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) state, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 7);
            }
        }
        i15 |= 3072;
        interfaceC4339a6 = interfaceC4339a3;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C23399f(16);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a10 = interfaceC4339a4;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C23399f(17);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a11 = interfaceC4339a5;
            }
            if (i18 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C23399f(15);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a12 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a12 = interfaceC4339a6;
            }
            TextResource textResourceM21278l15 = AbstractC8693b.m21278l(state.getTitle());
            TextResource textResourceM21278l16 = AbstractC8693b.m21278l(state.getDescription());
            TextResource title15 = state.getPrimaryBtn().getTitle();
            TextResource title16 = state.getSecondaryBtn().getTitle();
            int i212 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, textResourceM21278l15, textResourceM21278l16, title15, false, null, null, null, null, title16, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a11, interfaceC4339a12, interfaceC4339a10, null, null, null, c28655q, (i212 << 3) | (i212 << 6) | (i212 << 9) | (i212 << 27), 0, (i15 & 8064) | ((i15 << 9) & 57344), 239074801);
            interfaceC4339a8 = interfaceC4339a11;
            interfaceC4339a9 = interfaceC4339a12;
            interfaceC4339a7 = interfaceC4339a10;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a7 = interfaceC4339a4;
            interfaceC4339a8 = interfaceC4339a5;
            interfaceC4339a9 = interfaceC4339a6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) state, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m70477y() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m70478z() {
        return C23454a0.f92919a;
    }
}
