package lf0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import az1.C2165f;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import kd1.AbstractC22403o;
import l72.C23399f;
import l72.C23401h;
import l83.C23454a0;
import lc0.C23825g;
import ld0.C23845d;
import ld0.C23861t;
import ma0.AbstractC25370d;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
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
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lld0/d;", "viewState", "Lkotlin/Function1;", "Lcom/whoop/advancedlabs/presentation/models/AppointmentSummaryBottomSheet;", "Ll83/a0;", "onShowBottomSheet", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lld0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "label", "value", "Ly81/f;", "valueColor", "Lgz0/m0;", "icon", "Lkotlin/Function0;", "onIconClick", "n", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ly81/f;Lgz0/m0;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23954p {
    /* JADX WARN: Code duplicated, block: B:102:0x0276  */
    /* JADX WARN: Code duplicated, block: B:103:0x0278  */
    /* JADX WARN: Code duplicated, block: B:106:0x0280  */
    /* JADX WARN: Code duplicated, block: B:109:0x0285  */
    /* JADX WARN: Code duplicated, block: B:110:0x0288  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02df  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:132:0x0302  */
    /* JADX WARN: Code duplicated, block: B:134:0x0324  */
    /* JADX WARN: Code duplicated, block: B:140:0x0331  */
    /* JADX WARN: Code duplicated, block: B:143:0x0338  */
    /* JADX WARN: Code duplicated, block: B:144:0x033a  */
    /* JADX WARN: Code duplicated, block: B:147:0x0342 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0344  */
    /* JADX WARN: Code duplicated, block: B:151:0x0363  */
    /* JADX WARN: Code duplicated, block: B:154:0x036f  */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0104  */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x0162  */
    /* JADX WARN: Code duplicated, block: B:68:0x0166  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:73:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e8  */
    /* JADX INFO: renamed from: h */
    public static final void m70583h(Modifier modifier, C23845d viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        final C23845d c23845d;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        C23861t c23861tM70060h;
        int iHashCode2;
        Function1 function5;
        int i17;
        final Function1 function6;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        boolean z16;
        int i18;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        C28676v0 c28676v1;
        final Function1 function7;
        Function1 function8;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1500532634);
        int i19 = i14 & 1;
        if (i19 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
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
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C23825g(7);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                f13 = 1.0f;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                f14 = 8;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 2.5d) * f14), C2299e.f9110M, c28655q, 6);
                Modifier modifier4 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    c23861tM70060h = viewState.getHeader();
                    if (c23861tM70060h == null) {
                        c28655q.m87150e0(1045289098);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1045289099);
                        AbstractC23929i2.m70425b(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 0.5d) * f14, 7), c23861tM70060h, c28655q, (AbstractC22403o.f87638a << 3) | 6, 0);
                        c28655q.m87173q(false);
                        f13 = 1.0f;
                    }
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(f13, c2314t);
                    float f15 = 4;
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f15);
                    C2306l c2306l = C2299e.f9107J;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, i16);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                    c28655q.m87158i0();
                    function5 = function4;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    C23000t1 c23000t1 = C23000t1.f90727a;
                    i17 = i15;
                    m70589n(c23000t1.mo66772c(c2314t, true, 1.0f), viewState.getDateLabel(), viewState.getDateValue(), null, null, null, c28655q, 0, 56);
                    m70589n(c23000t1.mo66772c(c2314t, true, 1.0f), viewState.getTimeLabel(), viewState.getTimeValue(), null, null, null, c28655q, 0, 56);
                    c28655q.m87173q(true);
                    m70589n(null, viewState.getLocationLabel(), viewState.getLocationValue(), null, null, null, c28655q, 0, 57);
                    if (viewState.getReferenceIdLabel() != null || viewState.getReferenceIdValue() == null) {
                        c23845d = viewState;
                        function6 = function5;
                        c28655q.m87150e0(1047087347);
                        String strM70055b = c23845d.getConfirmationLabel();
                        String strM70057e = c23845d.getConfirmationValue();
                        EnumC16313m0 enumC16313m0M70054a = c23845d.getConfirmationIcon();
                        if ((i17 & 112) != 32 || ((i17 & 64) != 0 && c28655q.m87157i(c23845d))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i17 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15 || objM87133R == c28676v0) {
                            final int i25 = 2;
                            objM87133R = new InterfaceC4339a() { // from class: lf0.o
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            return AbstractC23954p.m70585j(c23845d, function6);
                                        case 1:
                                            return AbstractC23954p.m70586k(c23845d, function6);
                                        default:
                                            return AbstractC23954p.m70587l(c23845d, function6);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        m70589n(null, strM70055b, strM70057e, null, enumC16313m0M70054a, (InterfaceC4339a) objM87133R, c28655q, 0, 9);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1046034556);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 6);
                        int iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                        String strM70055b2 = viewState.getConfirmationLabel();
                        String strM70057e2 = viewState.getConfirmationValue();
                        EnumC16313m0 enumC16313m0M70054a2 = viewState.getConfirmationIcon();
                        int i26 = i17 & 112;
                        if (i26 != 32) {
                            if ((i17 & 64) != 0) {
                                c23845d = viewState;
                                if (c28655q.m87157i(c23845d)) {
                                }
                                i18 = i17 & 896;
                                if (i18 == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z16 | z17;
                                objM87133R2 = c28655q.m87133R();
                                if (z18) {
                                    c28676v1 = c28676v0;
                                } else {
                                    c28676v1 = c28676v0;
                                    if (objM87133R2 != c28676v1) {
                                        function7 = function5;
                                    }
                                    C28676v0 c28676v2 = c28676v1;
                                    function8 = function7;
                                    m70589n(modifierMo66772c, strM70055b2, strM70057e2, null, enumC16313m0M70054a2, (InterfaceC4339a) objM87133R2, c28655q, 0, 8);
                                    Modifier modifierMo66772c2 = c23000t1.mo66772c(c2314t, true, 1.0f);
                                    String strM70065m = c23845d.getReferenceIdLabel();
                                    String strM70066n = c23845d.getReferenceIdValue();
                                    EnumC39333f enumC39333fM70064l = c23845d.getReferenceIdColor();
                                    EnumC16313m0 enumC16313m0M70063k = c23845d.getReferenceIcon();
                                    if (i26 != 32 || ((i17 & 64) != 0 && c28655q.m87157i(c23845d))) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    if (i18 == 256) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    z25 = z24 | z19;
                                    objM87133R3 = c28655q.m87133R();
                                    if (!z25 || objM87133R3 == c28676v2) {
                                        final int i27 = 1;
                                        function6 = function8;
                                        objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                switch (i27) {
                                                    case 0:
                                                        return AbstractC23954p.m70585j(c23845d, function6);
                                                    case 1:
                                                        return AbstractC23954p.m70586k(c23845d, function6);
                                                    default:
                                                        return AbstractC23954p.m70587l(c23845d, function6);
                                                }
                                            }
                                        };
                                        c28655q.m87172p0(objM87133R3);
                                    } else {
                                        function6 = function8;
                                    }
                                    m70589n(modifierMo66772c2, strM70065m, strM70066n, enumC39333fM70064l, enumC16313m0M70063k, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
                                    c28655q.m87173q(true);
                                    c28655q.m87173q(false);
                                }
                                final int i28 = 0;
                                function7 = function5;
                                objM87133R2 = new InterfaceC4339a() { // from class: lf0.o
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i28) {
                                            case 0:
                                                return AbstractC23954p.m70585j(c23845d, function7);
                                            case 1:
                                                return AbstractC23954p.m70586k(c23845d, function7);
                                            default:
                                                return AbstractC23954p.m70587l(c23845d, function7);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                                C28676v0 c28676v3 = c28676v1;
                                function8 = function7;
                                m70589n(modifierMo66772c, strM70055b2, strM70057e2, null, enumC16313m0M70054a2, (InterfaceC4339a) objM87133R2, c28655q, 0, 8);
                                Modifier modifierMo66772c3 = c23000t1.mo66772c(c2314t, true, 1.0f);
                                String strM70065m2 = c23845d.getReferenceIdLabel();
                                String strM70066n2 = c23845d.getReferenceIdValue();
                                EnumC39333f enumC39333fM70064l2 = c23845d.getReferenceIdColor();
                                EnumC16313m0 enumC16313m0M70063k2 = c23845d.getReferenceIcon();
                                if (i26 != 32) {
                                    z19 = true;
                                } else {
                                    z19 = true;
                                }
                                if (i18 == 256) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                z25 = z24 | z19;
                                objM87133R3 = c28655q.m87133R();
                                if (z25) {
                                    final int i29 = 1;
                                    function6 = function8;
                                    objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i29) {
                                                case 0:
                                                    return AbstractC23954p.m70585j(c23845d, function6);
                                                case 1:
                                                    return AbstractC23954p.m70586k(c23845d, function6);
                                                default:
                                                    return AbstractC23954p.m70587l(c23845d, function6);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    final int i210 = 1;
                                    function6 = function8;
                                    objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i210) {
                                                case 0:
                                                    return AbstractC23954p.m70585j(c23845d, function6);
                                                case 1:
                                                    return AbstractC23954p.m70586k(c23845d, function6);
                                                default:
                                                    return AbstractC23954p.m70587l(c23845d, function6);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                }
                                m70589n(modifierMo66772c3, strM70065m2, strM70066n2, enumC39333fM70064l2, enumC16313m0M70063k2, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                c23845d = viewState;
                            }
                            z16 = false;
                            i18 = i17 & 896;
                            if (i18 == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z16 | z17;
                            objM87133R2 = c28655q.m87133R();
                            if (z18) {
                                c28676v1 = c28676v0;
                                if (objM87133R2 != c28676v1) {
                                    function7 = function5;
                                }
                                C28676v0 c28676v4 = c28676v1;
                                function8 = function7;
                                m70589n(modifierMo66772c, strM70055b2, strM70057e2, null, enumC16313m0M70054a2, (InterfaceC4339a) objM87133R2, c28655q, 0, 8);
                                Modifier modifierMo66772c4 = c23000t1.mo66772c(c2314t, true, 1.0f);
                                String strM70065m3 = c23845d.getReferenceIdLabel();
                                String strM70066n3 = c23845d.getReferenceIdValue();
                                EnumC39333f enumC39333fM70064l3 = c23845d.getReferenceIdColor();
                                EnumC16313m0 enumC16313m0M70063k3 = c23845d.getReferenceIcon();
                                if (i26 != 32) {
                                    z19 = true;
                                } else {
                                    z19 = true;
                                }
                                if (i18 == 256) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                z25 = z24 | z19;
                                objM87133R3 = c28655q.m87133R();
                                if (z25) {
                                    final int i211 = 1;
                                    function6 = function8;
                                    objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i211) {
                                                case 0:
                                                    return AbstractC23954p.m70585j(c23845d, function6);
                                                case 1:
                                                    return AbstractC23954p.m70586k(c23845d, function6);
                                                default:
                                                    return AbstractC23954p.m70587l(c23845d, function6);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                } else {
                                    final int i212 = 1;
                                    function6 = function8;
                                    objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i212) {
                                                case 0:
                                                    return AbstractC23954p.m70585j(c23845d, function6);
                                                case 1:
                                                    return AbstractC23954p.m70586k(c23845d, function6);
                                                default:
                                                    return AbstractC23954p.m70587l(c23845d, function6);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R3);
                                }
                                m70589n(modifierMo66772c4, strM70065m3, strM70066n3, enumC39333fM70064l3, enumC16313m0M70063k3, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
                                c28655q.m87173q(true);
                                c28655q.m87173q(false);
                            } else {
                                c28676v1 = c28676v0;
                            }
                            final int i213 = 0;
                            function7 = function5;
                            objM87133R2 = new InterfaceC4339a() { // from class: lf0.o
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i213) {
                                        case 0:
                                            return AbstractC23954p.m70585j(c23845d, function7);
                                        case 1:
                                            return AbstractC23954p.m70586k(c23845d, function7);
                                        default:
                                            return AbstractC23954p.m70587l(c23845d, function7);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                            C28676v0 c28676v5 = c28676v1;
                            function8 = function7;
                            m70589n(modifierMo66772c, strM70055b2, strM70057e2, null, enumC16313m0M70054a2, (InterfaceC4339a) objM87133R2, c28655q, 0, 8);
                            Modifier modifierMo66772c5 = c23000t1.mo66772c(c2314t, true, 1.0f);
                            String strM70065m4 = c23845d.getReferenceIdLabel();
                            String strM70066n4 = c23845d.getReferenceIdValue();
                            EnumC39333f enumC39333fM70064l4 = c23845d.getReferenceIdColor();
                            EnumC16313m0 enumC16313m0M70063k4 = c23845d.getReferenceIcon();
                            if (i26 != 32) {
                                z19 = true;
                            } else {
                                z19 = true;
                            }
                            if (i18 == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z24 | z19;
                            objM87133R3 = c28655q.m87133R();
                            if (z25) {
                                final int i214 = 1;
                                function6 = function8;
                                objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i214) {
                                            case 0:
                                                return AbstractC23954p.m70585j(c23845d, function6);
                                            case 1:
                                                return AbstractC23954p.m70586k(c23845d, function6);
                                            default:
                                                return AbstractC23954p.m70587l(c23845d, function6);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                final int i215 = 1;
                                function6 = function8;
                                objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i215) {
                                            case 0:
                                                return AbstractC23954p.m70585j(c23845d, function6);
                                            case 1:
                                                return AbstractC23954p.m70586k(c23845d, function6);
                                            default:
                                                return AbstractC23954p.m70587l(c23845d, function6);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            }
                            m70589n(modifierMo66772c5, strM70065m4, strM70066n4, enumC39333fM70064l4, enumC16313m0M70063k4, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c23845d = viewState;
                        }
                        z16 = true;
                        i18 = i17 & 896;
                        if (i18 == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z16 | z17;
                        objM87133R2 = c28655q.m87133R();
                        if (z18) {
                            c28676v1 = c28676v0;
                            if (objM87133R2 != c28676v1) {
                                function7 = function5;
                            }
                            C28676v0 c28676v6 = c28676v1;
                            function8 = function7;
                            m70589n(modifierMo66772c, strM70055b2, strM70057e2, null, enumC16313m0M70054a2, (InterfaceC4339a) objM87133R2, c28655q, 0, 8);
                            Modifier modifierMo66772c6 = c23000t1.mo66772c(c2314t, true, 1.0f);
                            String strM70065m5 = c23845d.getReferenceIdLabel();
                            String strM70066n5 = c23845d.getReferenceIdValue();
                            EnumC39333f enumC39333fM70064l5 = c23845d.getReferenceIdColor();
                            EnumC16313m0 enumC16313m0M70063k5 = c23845d.getReferenceIcon();
                            if (i26 != 32) {
                                z19 = true;
                            } else {
                                z19 = true;
                            }
                            if (i18 == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z24 | z19;
                            objM87133R3 = c28655q.m87133R();
                            if (z25) {
                                final int i216 = 1;
                                function6 = function8;
                                objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i216) {
                                            case 0:
                                                return AbstractC23954p.m70585j(c23845d, function6);
                                            case 1:
                                                return AbstractC23954p.m70586k(c23845d, function6);
                                            default:
                                                return AbstractC23954p.m70587l(c23845d, function6);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                final int i217 = 1;
                                function6 = function8;
                                objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i217) {
                                            case 0:
                                                return AbstractC23954p.m70585j(c23845d, function6);
                                            case 1:
                                                return AbstractC23954p.m70586k(c23845d, function6);
                                            default:
                                                return AbstractC23954p.m70587l(c23845d, function6);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R3);
                            }
                            m70589n(modifierMo66772c6, strM70065m5, strM70066n5, enumC39333fM70064l5, enumC16313m0M70063k5, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        } else {
                            c28676v1 = c28676v0;
                        }
                        final int i218 = 0;
                        function7 = function5;
                        objM87133R2 = new InterfaceC4339a() { // from class: lf0.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i218) {
                                    case 0:
                                        return AbstractC23954p.m70585j(c23845d, function7);
                                    case 1:
                                        return AbstractC23954p.m70586k(c23845d, function7);
                                    default:
                                        return AbstractC23954p.m70587l(c23845d, function7);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                        C28676v0 c28676v7 = c28676v1;
                        function8 = function7;
                        m70589n(modifierMo66772c, strM70055b2, strM70057e2, null, enumC16313m0M70054a2, (InterfaceC4339a) objM87133R2, c28655q, 0, 8);
                        Modifier modifierMo66772c7 = c23000t1.mo66772c(c2314t, true, 1.0f);
                        String strM70065m6 = c23845d.getReferenceIdLabel();
                        String strM70066n6 = c23845d.getReferenceIdValue();
                        EnumC39333f enumC39333fM70064l6 = c23845d.getReferenceIdColor();
                        EnumC16313m0 enumC16313m0M70063k6 = c23845d.getReferenceIcon();
                        if (i26 != 32) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (i18 == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z24 | z19;
                        objM87133R3 = c28655q.m87133R();
                        if (z25) {
                            final int i219 = 1;
                            function6 = function8;
                            objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i219) {
                                        case 0:
                                            return AbstractC23954p.m70585j(c23845d, function6);
                                        case 1:
                                            return AbstractC23954p.m70586k(c23845d, function6);
                                        default:
                                            return AbstractC23954p.m70587l(c23845d, function6);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            final int i2110 = 1;
                            function6 = function8;
                            objM87133R3 = new InterfaceC4339a() { // from class: lf0.o
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2110) {
                                        case 0:
                                            return AbstractC23954p.m70585j(c23845d, function6);
                                        case 1:
                                            return AbstractC23954p.m70586k(c23845d, function6);
                                        default:
                                            return AbstractC23954p.m70587l(c23845d, function6);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R3);
                        }
                        m70589n(modifierMo66772c7, strM70065m6, strM70066n6, enumC39333fM70064l6, enumC16313m0M70063k6, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function6;
                    modifier3 = modifier4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                c23861tM70060h = viewState.getHeader();
                if (c23861tM70060h == null) {
                    c28655q.m87150e0(1045289098);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1045289099);
                    AbstractC23929i2.m70425b(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 0.5d) * f14, 7), c23861tM70060h, c28655q, (AbstractC22403o.f87638a << 3) | 6, 0);
                    c28655q.m87173q(false);
                    f13 = 1.0f;
                }
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(f13, c2314t);
                float f16 = 4;
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f16);
                C2306l c2306l2 = C2299e.f9107J;
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l2, c28655q, i16);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                c28655q.m87158i0();
                function5 = function4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                C23000t1 c23000t2 = C23000t1.f90727a;
                i17 = i15;
                m70589n(c23000t2.mo66772c(c2314t, true, 1.0f), viewState.getDateLabel(), viewState.getDateValue(), null, null, null, c28655q, 0, 56);
                m70589n(c23000t2.mo66772c(c2314t, true, 1.0f), viewState.getTimeLabel(), viewState.getTimeValue(), null, null, null, c28655q, 0, 56);
                c28655q.m87173q(true);
                m70589n(null, viewState.getLocationLabel(), viewState.getLocationValue(), null, null, null, c28655q, 0, 57);
                if (viewState.getReferenceIdLabel() != null) {
                    c23845d = viewState;
                    function6 = function5;
                    c28655q.m87150e0(1047087347);
                    String strM70055b3 = c23845d.getConfirmationLabel();
                    String strM70057e3 = c23845d.getConfirmationValue();
                    EnumC16313m0 enumC16313m0M70054a3 = c23845d.getConfirmationIcon();
                    if ((i17 & 112) != 32) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if ((i17 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        final int i220 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: lf0.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i220) {
                                    case 0:
                                        return AbstractC23954p.m70585j(c23845d, function6);
                                    case 1:
                                        return AbstractC23954p.m70586k(c23845d, function6);
                                    default:
                                        return AbstractC23954p.m70587l(c23845d, function6);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i221 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: lf0.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i221) {
                                    case 0:
                                        return AbstractC23954p.m70585j(c23845d, function6);
                                    case 1:
                                        return AbstractC23954p.m70586k(c23845d, function6);
                                    default:
                                        return AbstractC23954p.m70587l(c23845d, function6);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    m70589n(null, strM70055b3, strM70057e3, null, enumC16313m0M70054a3, (InterfaceC4339a) objM87133R, c28655q, 0, 9);
                    c28655q.m87173q(false);
                } else {
                    c23845d = viewState;
                    function6 = function5;
                    c28655q.m87150e0(1047087347);
                    String strM70055b4 = c23845d.getConfirmationLabel();
                    String strM70057e4 = c23845d.getConfirmationValue();
                    EnumC16313m0 enumC16313m0M70054a4 = c23845d.getConfirmationIcon();
                    if ((i17 & 112) != 32) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if ((i17 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        final int i222 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: lf0.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i222) {
                                    case 0:
                                        return AbstractC23954p.m70585j(c23845d, function6);
                                    case 1:
                                        return AbstractC23954p.m70586k(c23845d, function6);
                                    default:
                                        return AbstractC23954p.m70587l(c23845d, function6);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i223 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: lf0.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i223) {
                                    case 0:
                                        return AbstractC23954p.m70585j(c23845d, function6);
                                    case 1:
                                        return AbstractC23954p.m70586k(c23845d, function6);
                                    default:
                                        return AbstractC23954p.m70587l(c23845d, function6);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    m70589n(null, strM70055b4, strM70057e4, null, enumC16313m0M70054a4, (InterfaceC4339a) objM87133R, c28655q, 0, 9);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function6;
                modifier3 = modifier4;
            } else {
                c23845d = viewState;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 8, (Object) modifier3, (Object) c23845d, function3);
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
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C23825g(7);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            f13 = 1.0f;
            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, modifier2);
            f14 = 8;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 2.5d) * f14), C2299e.f9110M, c28655q, 6);
            Modifier modifier5 = modifier2;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                i16 = 6;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                c23861tM70060h = viewState.getHeader();
                if (c23861tM70060h == null) {
                    c28655q.m87150e0(1045289098);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1045289099);
                    AbstractC23929i2.m70425b(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 0.5d) * f14, 7), c23861tM70060h, c28655q, (AbstractC22403o.f87638a << 3) | 6, 0);
                    c28655q.m87173q(false);
                    f13 = 1.0f;
                }
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(f13, c2314t);
                float f17 = 4;
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f17);
                C2306l c2306l3 = C2299e.f9107J;
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22971kM66746i3, c2306l3, c28655q, i16);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                c28655q.m87158i0();
                function5 = function4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                C23000t1 c23000t3 = C23000t1.f90727a;
                i17 = i15;
                m70589n(c23000t3.mo66772c(c2314t, true, 1.0f), viewState.getDateLabel(), viewState.getDateValue(), null, null, null, c28655q, 0, 56);
                m70589n(c23000t3.mo66772c(c2314t, true, 1.0f), viewState.getTimeLabel(), viewState.getTimeValue(), null, null, null, c28655q, 0, 56);
                c28655q.m87173q(true);
                m70589n(null, viewState.getLocationLabel(), viewState.getLocationValue(), null, null, null, c28655q, 0, 57);
                if (viewState.getReferenceIdLabel() != null) {
                    c23845d = viewState;
                    function6 = function5;
                    c28655q.m87150e0(1047087347);
                    String strM70055b5 = c23845d.getConfirmationLabel();
                    String strM70057e5 = c23845d.getConfirmationValue();
                    EnumC16313m0 enumC16313m0M70054a5 = c23845d.getConfirmationIcon();
                    if ((i17 & 112) != 32) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if ((i17 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        final int i224 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: lf0.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i224) {
                                    case 0:
                                        return AbstractC23954p.m70585j(c23845d, function6);
                                    case 1:
                                        return AbstractC23954p.m70586k(c23845d, function6);
                                    default:
                                        return AbstractC23954p.m70587l(c23845d, function6);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i225 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: lf0.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i225) {
                                    case 0:
                                        return AbstractC23954p.m70585j(c23845d, function6);
                                    case 1:
                                        return AbstractC23954p.m70586k(c23845d, function6);
                                    default:
                                        return AbstractC23954p.m70587l(c23845d, function6);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    m70589n(null, strM70055b5, strM70057e5, null, enumC16313m0M70054a5, (InterfaceC4339a) objM87133R, c28655q, 0, 9);
                    c28655q.m87173q(false);
                } else {
                    c23845d = viewState;
                    function6 = function5;
                    c28655q.m87150e0(1047087347);
                    String strM70055b6 = c23845d.getConfirmationLabel();
                    String strM70057e6 = c23845d.getConfirmationValue();
                    EnumC16313m0 enumC16313m0M70054a6 = c23845d.getConfirmationIcon();
                    if ((i17 & 112) != 32) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if ((i17 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        final int i226 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: lf0.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i226) {
                                    case 0:
                                        return AbstractC23954p.m70585j(c23845d, function6);
                                    case 1:
                                        return AbstractC23954p.m70586k(c23845d, function6);
                                    default:
                                        return AbstractC23954p.m70587l(c23845d, function6);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i227 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: lf0.o
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i227) {
                                    case 0:
                                        return AbstractC23954p.m70585j(c23845d, function6);
                                    case 1:
                                        return AbstractC23954p.m70586k(c23845d, function6);
                                    default:
                                        return AbstractC23954p.m70587l(c23845d, function6);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    m70589n(null, strM70055b6, strM70057e6, null, enumC16313m0M70054a6, (InterfaceC4339a) objM87133R, c28655q, 0, 9);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function6;
                modifier3 = modifier5;
            } else {
                i16 = 6;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N5);
            c23861tM70060h = viewState.getHeader();
            if (c23861tM70060h == null) {
                c28655q.m87150e0(1045289098);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1045289099);
                AbstractC23929i2.m70425b(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 0.5d) * f14, 7), c23861tM70060h, c28655q, (AbstractC22403o.f87638a << 3) | 6, 0);
                c28655q.m87173q(false);
                f13 = 1.0f;
            }
            Modifier modifierM3409f7 = AbstractC1102d.m3409f(f13, c2314t);
            float f18 = 4;
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f18);
            C2306l c2306l4 = C2299e.f9107J;
            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22971kM66746i4, c2306l4, c28655q, i16);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
            c28655q.m87158i0();
            function5 = function4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a5);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N7);
            C23000t1 c23000t4 = C23000t1.f90727a;
            i17 = i15;
            m70589n(c23000t4.mo66772c(c2314t, true, 1.0f), viewState.getDateLabel(), viewState.getDateValue(), null, null, null, c28655q, 0, 56);
            m70589n(c23000t4.mo66772c(c2314t, true, 1.0f), viewState.getTimeLabel(), viewState.getTimeValue(), null, null, null, c28655q, 0, 56);
            c28655q.m87173q(true);
            m70589n(null, viewState.getLocationLabel(), viewState.getLocationValue(), null, null, null, c28655q, 0, 57);
            if (viewState.getReferenceIdLabel() != null) {
                c23845d = viewState;
                function6 = function5;
                c28655q.m87150e0(1047087347);
                String strM70055b7 = c23845d.getConfirmationLabel();
                String strM70057e7 = c23845d.getConfirmationValue();
                EnumC16313m0 enumC16313m0M70054a7 = c23845d.getConfirmationIcon();
                if ((i17 & 112) != 32) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if ((i17 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    final int i228 = 2;
                    objM87133R = new InterfaceC4339a() { // from class: lf0.o
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i228) {
                                case 0:
                                    return AbstractC23954p.m70585j(c23845d, function6);
                                case 1:
                                    return AbstractC23954p.m70586k(c23845d, function6);
                                default:
                                    return AbstractC23954p.m70587l(c23845d, function6);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i229 = 2;
                    objM87133R = new InterfaceC4339a() { // from class: lf0.o
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i229) {
                                case 0:
                                    return AbstractC23954p.m70585j(c23845d, function6);
                                case 1:
                                    return AbstractC23954p.m70586k(c23845d, function6);
                                default:
                                    return AbstractC23954p.m70587l(c23845d, function6);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                m70589n(null, strM70055b7, strM70057e7, null, enumC16313m0M70054a7, (InterfaceC4339a) objM87133R, c28655q, 0, 9);
                c28655q.m87173q(false);
            } else {
                c23845d = viewState;
                function6 = function5;
                c28655q.m87150e0(1047087347);
                String strM70055b8 = c23845d.getConfirmationLabel();
                String strM70057e8 = c23845d.getConfirmationValue();
                EnumC16313m0 enumC16313m0M70054a8 = c23845d.getConfirmationIcon();
                if ((i17 & 112) != 32) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if ((i17 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    final int i2210 = 2;
                    objM87133R = new InterfaceC4339a() { // from class: lf0.o
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2210) {
                                case 0:
                                    return AbstractC23954p.m70585j(c23845d, function6);
                                case 1:
                                    return AbstractC23954p.m70586k(c23845d, function6);
                                default:
                                    return AbstractC23954p.m70587l(c23845d, function6);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i2211 = 2;
                    objM87133R = new InterfaceC4339a() { // from class: lf0.o
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i2211) {
                                case 0:
                                    return AbstractC23954p.m70585j(c23845d, function6);
                                case 1:
                                    return AbstractC23954p.m70586k(c23845d, function6);
                                default:
                                    return AbstractC23954p.m70587l(c23845d, function6);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                m70589n(null, strM70055b8, strM70057e8, null, enumC16313m0M70054a8, (InterfaceC4339a) objM87133R, c28655q, 0, 9);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function6;
            modifier3 = modifier5;
        } else {
            c23845d = viewState;
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 8, (Object) modifier3, (Object) c23845d, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m70584i(AppointmentSummaryBottomSheet it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m70585j(C23845d c23845d, Function1 function1) {
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheetM70056c = c23845d.getConfirmationNumberBottomSheet();
        if (appointmentSummaryBottomSheetM70056c != null) {
            function1.invoke(appointmentSummaryBottomSheetM70056c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m70586k(C23845d c23845d, Function1 function1) {
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheetM70067o = c23845d.getReferenceNumberBottomSheet();
        if (appointmentSummaryBottomSheetM70067o != null) {
            function1.invoke(appointmentSummaryBottomSheetM70067o);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m70587l(C23845d c23845d, Function1 function1) {
        AppointmentSummaryBottomSheet appointmentSummaryBottomSheetM70056c = c23845d.getConfirmationNumberBottomSheet();
        if (appointmentSummaryBottomSheetM70056c != null) {
            function1.invoke(appointmentSummaryBottomSheetM70056c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m70588m(Modifier modifier, C23845d c23845d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70583h(modifier, c23845d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0177  */
    /* JADX WARN: Code duplicated, block: B:103:0x0185  */
    /* JADX WARN: Code duplicated, block: B:106:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:109:0x0215  */
    /* JADX WARN: Code duplicated, block: B:111:0x0223  */
    /* JADX WARN: Code duplicated, block: B:113:0x0234  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124  */
    /* JADX WARN: Code duplicated, block: B:97:0x0166  */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    /* JADX INFO: renamed from: n */
    private static final void m70589n(Modifier modifier, String str, String str2, EnumC39333f enumC39333f, EnumC16313m0 enumC16313m0, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        EnumC39333f enumC39333f2;
        EnumC16313m0 enumC16313m1;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        EnumC39333f enumC39333f3;
        EnumC16313m0 enumC16313m2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        InterfaceC4339a interfaceC4339a4;
        int iHashCode2;
        InterfaceC4339a interfaceC4339a5;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1962948724);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        int i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87149e(enumC39333f == null ? -1 : enumC39333f.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i14 & 16;
        if (i19 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87149e(enumC16313m0 != null ? enumC16313m0.ordinal() : -1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i24 = i14 & 32;
        if (i24 == 0) {
            if ((196608 & i13) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                if (i18 != 0) {
                    enumC39333f3 = EnumC39333f.BRAND_WHITE;
                } else {
                    enumC39333f3 = enumC39333f;
                }
                if (i19 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                InterfaceC4339a interfaceC4339a6 = i24 == 0 ? interfaceC4339a2 : null;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                Modifier modifier3 = modifier2;
                if (c28655q.f115903S) {
                    i16 = i15;
                } else {
                    i16 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    C2306l c2306l = C2299e.f9108K;
                    C22949e c22949e = AbstractC22977m.f90650a;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 20, 0.0f, 11);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 54);
                    interfaceC4339a4 = interfaceC4339a6;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    C2886a c2886aM8415M = c38072d.m121952e(c28655q, i25).getSh5();
                    long jM125382b1 = c38072d.m121949b(c28655q, i25).getWhite50();
                    int i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(str, AbstractC1102d.m3424u(124, c2314t), jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8415M, null, c28655q, ((i16 >> 3) & 14) | 48, i26, 196600);
                    if (enumC16313m2 == null) {
                        c28655q.m87150e0(-1000102907);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1000102906);
                        C27270o c27270o = new C27270o(AbstractC27274q.g.f109144f, enumC16313m2.toWhoopIcon(), EnumC39333f.WHITE_50, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                        String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99433b);
                        if (interfaceC4339a4 == null) {
                            c28655q.m87150e0(945284634);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C23399f(18);
                                c28655q.m87172p0(objM87133R);
                            }
                            c28655q.m87173q(false);
                            interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                        } else {
                            c28655q.m87150e0(-662244073);
                            c28655q.m87173q(false);
                            interfaceC4339a5 = interfaceC4339a4;
                        }
                        AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, interfaceC4339a5, c28655q, C27270o.f109105k, 12);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    AbstractC30795n.m94707h(str2, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13), enumC39333f3.mo134584toComposableColorWaAFU9c(c28655q, (i16 >> 9) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getB1(), null, c28655q, ((i16 >> 6) & 14) | 48, i26, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    modifier2 = modifier3;
                    enumC39333f2 = enumC39333f3;
                    enumC16313m1 = enumC16313m2;
                    interfaceC4339a3 = interfaceC4339a4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                C2306l c2306l2 = C2299e.f9108K;
                C22949e c22949e2 = AbstractC22977m.f90650a;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 20, 0.0f, 11);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q, 54);
                interfaceC4339a4 = interfaceC4339a6;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                C38072d c38072d2 = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                C2886a c2886aM8415M2 = c38072d2.m121952e(c28655q, i27).getSh5();
                long jM125382b2 = c38072d2.m121949b(c28655q, i27).getWhite50();
                int i28 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(str, AbstractC1102d.m3424u(124, c2314t), jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8415M2, null, c28655q, ((i16 >> 3) & 14) | 48, i28, 196600);
                if (enumC16313m2 == null) {
                    c28655q.m87150e0(-1000102907);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1000102906);
                    C27270o c27270o2 = new C27270o(AbstractC27274q.g.f109144f, enumC16313m2.toWhoopIcon(), EnumC39333f.WHITE_50, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99433b);
                    if (interfaceC4339a4 == null) {
                        c28655q.m87150e0(945284634);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C23399f(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                    } else {
                        c28655q.m87150e0(-662244073);
                        c28655q.m87173q(false);
                        interfaceC4339a5 = interfaceC4339a4;
                    }
                    AbstractC27242b1.m82092d(c27270o2, strM92103Y2, null, null, interfaceC4339a5, c28655q, C27270o.f109105k, 12);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(str2, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13), enumC39333f3.mo134584toComposableColorWaAFU9c(c28655q, (i16 >> 9) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i27).getB1(), null, c28655q, ((i16 >> 6) & 14) | 48, i28, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier2 = modifier3;
                enumC39333f2 = enumC39333f3;
                enumC16313m1 = enumC16313m2;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                enumC39333f2 = enumC39333f;
                enumC16313m1 = enumC16313m0;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(modifier2, str, str2, enumC39333f2, enumC16313m1, interfaceC4339a3, i13, i14, 20);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            if (i18 != 0) {
                enumC39333f3 = EnumC39333f.BRAND_WHITE;
            } else {
                enumC39333f3 = enumC39333f;
            }
            if (i19 != 0) {
                enumC16313m2 = null;
            } else {
                enumC16313m2 = enumC16313m0;
            }
            if (i24 == 0) {
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            Modifier modifier4 = modifier2;
            if (c28655q.f115903S) {
                i16 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                C2306l c2306l3 = C2299e.f9108K;
                C22949e c22949e3 = AbstractC22977m.f90650a;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 20, 0.0f, 11);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e3, c2306l3, c28655q, 54);
                interfaceC4339a4 = interfaceC4339a6;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                C38072d c38072d3 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                C2886a c2886aM8415M3 = c38072d3.m121952e(c28655q, i29).getSh5();
                long jM125382b3 = c38072d3.m121949b(c28655q, i29).getWhite50();
                int i210 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(str, AbstractC1102d.m3424u(124, c2314t), jM125382b3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8415M3, null, c28655q, ((i16 >> 3) & 14) | 48, i210, 196600);
                if (enumC16313m2 == null) {
                    c28655q.m87150e0(-1000102907);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1000102906);
                    C27270o c27270o3 = new C27270o(AbstractC27274q.g.f109144f, enumC16313m2.toWhoopIcon(), EnumC39333f.WHITE_50, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99433b);
                    if (interfaceC4339a4 == null) {
                        c28655q.m87150e0(945284634);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C23399f(18);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                    } else {
                        c28655q.m87150e0(-662244073);
                        c28655q.m87173q(false);
                        interfaceC4339a5 = interfaceC4339a4;
                    }
                    AbstractC27242b1.m82092d(c27270o3, strM92103Y3, null, null, interfaceC4339a5, c28655q, C27270o.f109105k, 12);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(str2, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13), enumC39333f3.mo134584toComposableColorWaAFU9c(c28655q, (i16 >> 9) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i29).getB1(), null, c28655q, ((i16 >> 6) & 14) | 48, i210, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier2 = modifier4;
                enumC39333f2 = enumC39333f3;
                enumC16313m1 = enumC16313m2;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                i16 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
            C2306l c2306l4 = C2299e.f9108K;
            C22949e c22949e4 = AbstractC22977m.f90650a;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 20, 0.0f, 11);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e4, c2306l4, c28655q, 54);
            interfaceC4339a4 = interfaceC4339a6;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            C38072d c38072d4 = C38072d.f163053a;
            int i211 = C38072d.f163054b;
            C2886a c2886aM8415M4 = c38072d4.m121952e(c28655q, i211).getSh5();
            long jM125382b4 = c38072d4.m121949b(c28655q, i211).getWhite50();
            int i212 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str, AbstractC1102d.m3424u(124, c2314t), jM125382b4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8415M4, null, c28655q, ((i16 >> 3) & 14) | 48, i212, 196600);
            if (enumC16313m2 == null) {
                c28655q.m87150e0(-1000102907);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1000102906);
                C27270o c27270o4 = new C27270o(AbstractC27274q.g.f109144f, enumC16313m2.toWhoopIcon(), EnumC39333f.WHITE_50, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC25370d.f99433b);
                if (interfaceC4339a4 == null) {
                    c28655q.m87150e0(945284634);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C23399f(18);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                } else {
                    c28655q.m87150e0(-662244073);
                    c28655q.m87173q(false);
                    interfaceC4339a5 = interfaceC4339a4;
                }
                AbstractC27242b1.m82092d(c27270o4, strM92103Y4, null, null, interfaceC4339a5, c28655q, C27270o.f109105k, 12);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(str2, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13), enumC39333f3.mo134584toComposableColorWaAFU9c(c28655q, (i16 >> 9) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i211).getB1(), null, c28655q, ((i16 >> 6) & 14) | 48, i212, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier2 = modifier4;
            enumC39333f2 = enumC39333f3;
            enumC16313m1 = enumC16313m2;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            enumC39333f2 = enumC39333f;
            enumC16313m1 = enumC16313m0;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(modifier2, str, str2, enumC39333f2, enumC16313m1, interfaceC4339a3, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m70590o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m70591p(Modifier modifier, String str, String str2, EnumC39333f enumC39333f, EnumC16313m0 enumC16313m0, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m70589n(modifier, str, str2, enumC39333f, enumC16313m0, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
