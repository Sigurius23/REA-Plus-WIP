package au2;

import a20.C0167g;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kotlin.C1991b1;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.AbstractC27271o0;
import ny0.AbstractC27282u;
import ny0.AbstractC27292z;
import ny0.EnumC27269n0;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
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
import wb3.AbstractC37056f;
import wt2.C37620a;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: au2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lwt2/a;", "primaryButton", "secondaryButton", "", "isNewSummaryEnabled", "Ly3/f;", "bottomSpacing", "Lkotlin/Function1;", "Lcom/whoop/navigation/e;", "Ll83/a0;", "onButtonClicked", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2083h {
    /* JADX WARN: Code duplicated, block: B:100:0x016b  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:118:0x0201  */
    /* JADX WARN: Code duplicated, block: B:120:0x0205  */
    /* JADX WARN: Code duplicated, block: B:124:0x0241  */
    /* JADX WARN: Code duplicated, block: B:127:0x0250  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:142:0x02c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:149:0x031a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0326  */
    /* JADX WARN: Code duplicated, block: B:153:0x032f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0331  */
    /* JADX WARN: Code duplicated, block: B:157:0x0338  */
    /* JADX WARN: Code duplicated, block: B:163:0x0345  */
    /* JADX WARN: Code duplicated, block: B:166:0x034d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x0353  */
    /* JADX WARN: Code duplicated, block: B:172:0x0392  */
    /* JADX WARN: Code duplicated, block: B:175:0x039e  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:76:0x0102  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    /* JADX WARN: Code duplicated, block: B:81:0x0123  */
    /* JADX WARN: Code duplicated, block: B:84:0x0138  */
    /* JADX WARN: Code duplicated, block: B:86:0x014c  */
    /* JADX WARN: Code duplicated, block: B:87:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0154  */
    /* JADX WARN: Code duplicated, block: B:96:0x0161  */
    /* JADX WARN: Code duplicated, block: B:99:0x0169 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: h */
    public static final void m6593h(final C37620a primaryButton, final C37620a c37620a, final boolean z4, float f13, Function1 function1, Composer composer, final int i13, final int i14) {
        int i15;
        int i16;
        Function1 function2;
        int i17;
        boolean z13;
        final float f14;
        final Function1 function3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        final float f15;
        C28676v0 c28676v0;
        final Function1 function4;
        int iHashCode;
        C2314t c2314t;
        C0213j c0213j;
        C0209i c0209i;
        final Function1 function5;
        int i18;
        int i19;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        Function1 function6;
        EnumC16313m0 icon;
        C39274g c39274g;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        Function1 function7;
        boolean z24;
        int i24;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objM87133R3;
        int i25;
        final Function1 function8;
        boolean z28;
        C28655q c28655q;
        boolean z29;
        boolean z34;
        Object objM87133R4;
        C2314t c2314t2;
        Object objM87133R5;
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-425138264);
        int i26 = c28655q2.f115903S ? -c28655q2.f115893I.f115802v : c28655q2.f115891G.f115746i;
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(primaryButton) : c28655q2.m87157i(primaryButton) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(c37620a) : c28655q2.m87157i(c37620a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        int i27 = i14 & 8;
        if (i27 == 0) {
            if ((i13 & 3072) == 0) {
                i15 |= c28655q2.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z13)) {
                    if (i27 != 0) {
                        f15 = 4 * 8;
                    } else {
                        f15 = f13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C1991b1(11);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    c28655q2.m87150e0(-1756052559);
                    if (z4) {
                        c28655q2.m87150e0(-1756062790);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        TextResource title = primaryButton.getTitle();
                        i24 = i15 & 57344;
                        if (i24 == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(primaryButton))) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z25;
                        objM87133R3 = c28655q2.m87133R();
                        if (z27 || objM87133R3 == c28676v0) {
                            final int i28 = 0;
                            objM87133R3 = new InterfaceC4339a() { // from class: au2.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i28) {
                                        case 0:
                                            return AbstractC2083h.m6595j(function4, primaryButton);
                                        case 1:
                                            return AbstractC2083h.m6596k(function4, primaryButton);
                                        default:
                                            return AbstractC2083h.m6598m(function4, primaryButton);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R3);
                        }
                        i25 = TextResource.$stable;
                        function8 = function4;
                        z28 = true;
                        AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, title, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, (i25 << 18) | 6, 0, 8126);
                        c28655q = c28655q2;
                        if (c37620a == null) {
                            c28655q.m87150e0(-1755810017);
                            c28655q.m87173q(false);
                            c2314t2 = c2314t;
                        } else {
                            c28655q.m87150e0(-1755810016);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * 4, c2314t));
                            TextResource title2 = c37620a.getTitle();
                            if (i24 == 16384) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if ((i15 & 112) != 32 && ((i15 & 64) == 0 || !c28655q.m87157i(c37620a))) {
                                z28 = false;
                            }
                            z34 = z29 | z28;
                            objM87133R4 = c28655q.m87133R();
                            if (z34 || objM87133R4 == c28676v0) {
                                final int i29 = 1;
                                objM87133R4 = new InterfaceC4339a() { // from class: au2.f
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i29) {
                                            case 0:
                                                return AbstractC2083h.m6595j(function8, c37620a);
                                            case 1:
                                                return AbstractC2083h.m6596k(function8, c37620a);
                                            default:
                                                return AbstractC2083h.m6598m(function8, c37620a);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R4);
                            }
                            c2314t2 = c2314t;
                            AbstractC27271o0.m82253b(null, false, title2, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R4, c28655q, i25 << 6, 0, 1019);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t2));
                        c28655q.m87183x(i26);
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            return;
                        }
                        final int i34 = 0;
                        interfaceC4351m = new InterfaceC4351m() { // from class: au2.g
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i34) {
                                    case 0:
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC2083h.m6597l(primaryButton, c37620a, z4, f15, function8, i13, i14, (Composer) obj, iIntValue);
                                    default:
                                        int iIntValue2 = ((Integer) obj2).intValue();
                                        return AbstractC2083h.m6600o(primaryButton, c37620a, z4, f15, function8, i13, i14, (Composer) obj, iIntValue2);
                                }
                            }
                        };
                    } else {
                        float f16 = f15;
                        function5 = function4;
                        c28655q2.m87150e0(-1755499644);
                        c28655q2.m87173q(false);
                        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "PrimarySummaryButtonTag")), 5 * 8, 0.0f, 2);
                        EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                        TextResource title3 = primaryButton.getTitle();
                        i18 = TextResource.$stable;
                        String strM21274h = AbstractC8693b.m21274h(title3, c28655q2, i18);
                        boolean enabled = primaryButton.getEnabled();
                        long recovery = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
                        i19 = i15 & 57344;
                        if (i19 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(primaryButton))) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R = c28655q2.m87133R();
                        if (z16 || objM87133R == c28676v0) {
                            final int i35 = 2;
                            objM87133R = new InterfaceC4339a() { // from class: au2.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i35) {
                                        case 0:
                                            return AbstractC2083h.m6595j(function5, primaryButton);
                                        case 1:
                                            return AbstractC2083h.m6596k(function5, primaryButton);
                                        default:
                                            return AbstractC2083h.m6598m(function5, primaryButton);
                                    }
                                }
                            };
                            c28655q2.m87172p0(objM87133R);
                        }
                        function6 = function5;
                        AbstractC27282u.m82292h(modifierM3396r, enumC27284v, strM21274h, enabled, recovery, null, false, (InterfaceC4339a) objM87133R, c28655q2, 54, 96);
                        if (c37620a == null) {
                            c28655q2.m87150e0(-1754961826);
                            c28655q2.m87173q(false);
                            z24 = false;
                        } else {
                            c28655q2.m87150e0(-1754961825);
                            AbstractC11266d.m30469w(2, 4, c2314t, c28655q2);
                            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "SecondarySummaryButtonTag");
                            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                            TextResource title4 = c37620a.getTitle();
                            icon = c37620a.getIcon();
                            if (icon != null) {
                                c39274g = new C39274g(icon.toWhoopIcon(), null, 2, null);
                            } else {
                                c39274g = null;
                            }
                            boolean enabled2 = c37620a.getEnabled();
                            if (i19 == 16384) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q2.m87157i(c37620a))) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z18 | z17;
                            objM87133R2 = c28655q2.m87133R();
                            if (!z19 || objM87133R2 == c28676v0) {
                                function7 = function6;
                                objM87133R2 = new C0167g(17, function7, c37620a);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                function7 = function6;
                            }
                            function6 = function7;
                            z24 = false;
                            AbstractC27265l0.m82217i(modifierM3599a, enumC27269n0, title4, c39274g, null, enabled2, null, null, false, false, null, null, (Function1) objM87133R2, c28655q2, (i18 << 6) | 54 | (C39274g.f168929c << 9), 0, 4048);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z24);
                        c28655q2.m87173q(true);
                        f14 = f16;
                        function3 = function6;
                    }
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
                c28655q2.m87138X();
                f14 = f13;
                function3 = function2;
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    final int i36 = 1;
                    interfaceC4351m = new InterfaceC4351m() { // from class: au2.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i36) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC2083h.m6597l(primaryButton, c37620a, z4, f14, function3, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC2083h.m6600o(primaryButton, c37620a, z4, f14, function3, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    c28677v1M87180u.f115982d = interfaceC4351m;
                }
            }
            i15 |= 24576;
            function2 = function1;
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                if (i27 != 0) {
                    f15 = 4 * 8;
                } else {
                    f15 = f13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1991b1(11);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                c28655q2.m87150e0(-1756052559);
                if (z4) {
                    c28655q2.m87150e0(-1756062790);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    TextResource title5 = primaryButton.getTitle();
                    i24 = i15 & 57344;
                    if (i24 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z26 = true;
                    } else {
                        z26 = true;
                    }
                    z27 = z26 | z25;
                    objM87133R3 = c28655q2.m87133R();
                    if (z27) {
                        final int i210 = 0;
                        objM87133R3 = new InterfaceC4339a() { // from class: au2.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i210) {
                                    case 0:
                                        return AbstractC2083h.m6595j(function4, primaryButton);
                                    case 1:
                                        return AbstractC2083h.m6596k(function4, primaryButton);
                                    default:
                                        return AbstractC2083h.m6598m(function4, primaryButton);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        final int i211 = 0;
                        objM87133R3 = new InterfaceC4339a() { // from class: au2.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i211) {
                                    case 0:
                                        return AbstractC2083h.m6595j(function4, primaryButton);
                                    case 1:
                                        return AbstractC2083h.m6596k(function4, primaryButton);
                                    default:
                                        return AbstractC2083h.m6598m(function4, primaryButton);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R3);
                    }
                    i25 = TextResource.$stable;
                    function8 = function4;
                    z28 = true;
                    AbstractC27292z.m82343j(modifierM3409f2, false, false, null, null, null, title5, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, (i25 << 18) | 6, 0, 8126);
                    c28655q = c28655q2;
                    if (c37620a == null) {
                        c28655q.m87150e0(-1755810017);
                        c28655q.m87173q(false);
                        c2314t2 = c2314t;
                    } else {
                        c28655q.m87150e0(-1755810016);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * 4, c2314t));
                        TextResource title6 = c37620a.getTitle();
                        if (i24 == 16384) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if ((i15 & 112) != 32) {
                            z28 = false;
                        }
                        z34 = z29 | z28;
                        objM87133R4 = c28655q.m87133R();
                        if (z34) {
                            final int i212 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: au2.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i212) {
                                        case 0:
                                            return AbstractC2083h.m6595j(function8, c37620a);
                                        case 1:
                                            return AbstractC2083h.m6596k(function8, c37620a);
                                        default:
                                            return AbstractC2083h.m6598m(function8, c37620a);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            final int i213 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: au2.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i213) {
                                        case 0:
                                            return AbstractC2083h.m6595j(function8, c37620a);
                                        case 1:
                                            return AbstractC2083h.m6596k(function8, c37620a);
                                        default:
                                            return AbstractC2083h.m6598m(function8, c37620a);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                        }
                        c2314t2 = c2314t;
                        AbstractC27271o0.m82253b(null, false, title6, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R4, c28655q, i25 << 6, 0, 1019);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t2));
                    c28655q.m87183x(i26);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i37 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: au2.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i37) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC2083h.m6597l(primaryButton, c37620a, z4, f15, function8, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC2083h.m6600o(primaryButton, c37620a, z4, f15, function8, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    float f17 = f15;
                    function5 = function4;
                    c28655q2.m87150e0(-1755499644);
                    c28655q2.m87173q(false);
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "PrimarySummaryButtonTag")), 5 * 8, 0.0f, 2);
                    EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                    TextResource title7 = primaryButton.getTitle();
                    i18 = TextResource.$stable;
                    String strM21274h2 = AbstractC8693b.m21274h(title7, c28655q2, i18);
                    boolean enabled3 = primaryButton.getEnabled();
                    long recovery2 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
                    i19 = i15 & 57344;
                    if (i19 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z16 = z14 | z15;
                    objM87133R = c28655q2.m87133R();
                    if (z16) {
                        final int i38 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: au2.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i38) {
                                    case 0:
                                        return AbstractC2083h.m6595j(function5, primaryButton);
                                    case 1:
                                        return AbstractC2083h.m6596k(function5, primaryButton);
                                    default:
                                        return AbstractC2083h.m6598m(function5, primaryButton);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        final int i39 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: au2.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i39) {
                                    case 0:
                                        return AbstractC2083h.m6595j(function5, primaryButton);
                                    case 1:
                                        return AbstractC2083h.m6596k(function5, primaryButton);
                                    default:
                                        return AbstractC2083h.m6598m(function5, primaryButton);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    function6 = function5;
                    AbstractC27282u.m82292h(modifierM3396r2, enumC27284v2, strM21274h2, enabled3, recovery2, null, false, (InterfaceC4339a) objM87133R, c28655q2, 54, 96);
                    if (c37620a == null) {
                        c28655q2.m87150e0(-1754961826);
                        c28655q2.m87173q(false);
                        z24 = false;
                    } else {
                        c28655q2.m87150e0(-1754961825);
                        AbstractC11266d.m30469w(2, 4, c2314t, c28655q2);
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "SecondarySummaryButtonTag");
                        EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                        TextResource title8 = c37620a.getTitle();
                        icon = c37620a.getIcon();
                        if (icon != null) {
                            c39274g = new C39274g(icon.toWhoopIcon(), null, 2, null);
                        } else {
                            c39274g = null;
                        }
                        boolean enabled4 = c37620a.getEnabled();
                        if (i19 == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i15 & 112) != 32) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        z19 = z18 | z17;
                        objM87133R2 = c28655q2.m87133R();
                        if (z19) {
                            function7 = function6;
                            objM87133R2 = new C0167g(17, function7, c37620a);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            function7 = function6;
                            objM87133R2 = new C0167g(17, function7, c37620a);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function6 = function7;
                        z24 = false;
                        AbstractC27265l0.m82217i(modifierM3599a2, enumC27269n1, title8, c39274g, null, enabled4, null, null, false, false, null, null, (Function1) objM87133R2, c28655q2, (i18 << 6) | 54 | (C39274g.f168929c << 9), 0, 4048);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z24);
                    c28655q2.m87173q(true);
                    f14 = f17;
                    function3 = function6;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q2.m87138X();
            f14 = f13;
            function3 = function2;
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                final int i310 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: au2.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i310) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC2083h.m6597l(primaryButton, c37620a, z4, f14, function3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC2083h.m6600o(primaryButton, c37620a, z4, f14, function3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 3072;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                if (i27 != 0) {
                    f15 = 4 * 8;
                } else {
                    f15 = f13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1991b1(11);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                c28655q2.m87150e0(-1756052559);
                if (z4) {
                    c28655q2.m87150e0(-1756062790);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    TextResource title9 = primaryButton.getTitle();
                    i24 = i15 & 57344;
                    if (i24 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z26 = true;
                    } else {
                        z26 = true;
                    }
                    z27 = z26 | z25;
                    objM87133R3 = c28655q2.m87133R();
                    if (z27) {
                        final int i214 = 0;
                        objM87133R3 = new InterfaceC4339a() { // from class: au2.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i214) {
                                    case 0:
                                        return AbstractC2083h.m6595j(function4, primaryButton);
                                    case 1:
                                        return AbstractC2083h.m6596k(function4, primaryButton);
                                    default:
                                        return AbstractC2083h.m6598m(function4, primaryButton);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        final int i215 = 0;
                        objM87133R3 = new InterfaceC4339a() { // from class: au2.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i215) {
                                    case 0:
                                        return AbstractC2083h.m6595j(function4, primaryButton);
                                    case 1:
                                        return AbstractC2083h.m6596k(function4, primaryButton);
                                    default:
                                        return AbstractC2083h.m6598m(function4, primaryButton);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R3);
                    }
                    i25 = TextResource.$stable;
                    function8 = function4;
                    z28 = true;
                    AbstractC27292z.m82343j(modifierM3409f3, false, false, null, null, null, title9, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, (i25 << 18) | 6, 0, 8126);
                    c28655q = c28655q2;
                    if (c37620a == null) {
                        c28655q.m87150e0(-1755810017);
                        c28655q.m87173q(false);
                        c2314t2 = c2314t;
                    } else {
                        c28655q.m87150e0(-1755810016);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * 4, c2314t));
                        TextResource title10 = c37620a.getTitle();
                        if (i24 == 16384) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if ((i15 & 112) != 32) {
                            z28 = false;
                        }
                        z34 = z29 | z28;
                        objM87133R4 = c28655q.m87133R();
                        if (z34) {
                            final int i216 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: au2.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i216) {
                                        case 0:
                                            return AbstractC2083h.m6595j(function8, c37620a);
                                        case 1:
                                            return AbstractC2083h.m6596k(function8, c37620a);
                                        default:
                                            return AbstractC2083h.m6598m(function8, c37620a);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            final int i217 = 1;
                            objM87133R4 = new InterfaceC4339a() { // from class: au2.f
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i217) {
                                        case 0:
                                            return AbstractC2083h.m6595j(function8, c37620a);
                                        case 1:
                                            return AbstractC2083h.m6596k(function8, c37620a);
                                        default:
                                            return AbstractC2083h.m6598m(function8, c37620a);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                        }
                        c2314t2 = c2314t;
                        AbstractC27271o0.m82253b(null, false, title10, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R4, c28655q, i25 << 6, 0, 1019);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t2));
                    c28655q.m87183x(i26);
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i311 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: au2.g
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i311) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC2083h.m6597l(primaryButton, c37620a, z4, f15, function8, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC2083h.m6600o(primaryButton, c37620a, z4, f15, function8, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    float f18 = f15;
                    function5 = function4;
                    c28655q2.m87150e0(-1755499644);
                    c28655q2.m87173q(false);
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "PrimarySummaryButtonTag")), 5 * 8, 0.0f, 2);
                    EnumC27284v enumC27284v3 = EnumC27284v.TextLarge;
                    TextResource title11 = primaryButton.getTitle();
                    i18 = TextResource.$stable;
                    String strM21274h3 = AbstractC8693b.m21274h(title11, c28655q2, i18);
                    boolean enabled5 = primaryButton.getEnabled();
                    long recovery3 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
                    i19 = i15 & 57344;
                    if (i19 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z16 = z14 | z15;
                    objM87133R = c28655q2.m87133R();
                    if (z16) {
                        final int i312 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: au2.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i312) {
                                    case 0:
                                        return AbstractC2083h.m6595j(function5, primaryButton);
                                    case 1:
                                        return AbstractC2083h.m6596k(function5, primaryButton);
                                    default:
                                        return AbstractC2083h.m6598m(function5, primaryButton);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        final int i313 = 2;
                        objM87133R = new InterfaceC4339a() { // from class: au2.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i313) {
                                    case 0:
                                        return AbstractC2083h.m6595j(function5, primaryButton);
                                    case 1:
                                        return AbstractC2083h.m6596k(function5, primaryButton);
                                    default:
                                        return AbstractC2083h.m6598m(function5, primaryButton);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R);
                    }
                    function6 = function5;
                    AbstractC27282u.m82292h(modifierM3396r3, enumC27284v3, strM21274h3, enabled5, recovery3, null, false, (InterfaceC4339a) objM87133R, c28655q2, 54, 96);
                    if (c37620a == null) {
                        c28655q2.m87150e0(-1754961826);
                        c28655q2.m87173q(false);
                        z24 = false;
                    } else {
                        c28655q2.m87150e0(-1754961825);
                        AbstractC11266d.m30469w(2, 4, c2314t, c28655q2);
                        Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, "SecondarySummaryButtonTag");
                        EnumC27269n0 enumC27269n2 = EnumC27269n0.TextSmall;
                        TextResource title12 = c37620a.getTitle();
                        icon = c37620a.getIcon();
                        if (icon != null) {
                            c39274g = new C39274g(icon.toWhoopIcon(), null, 2, null);
                        } else {
                            c39274g = null;
                        }
                        boolean enabled6 = c37620a.getEnabled();
                        if (i19 == 16384) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i15 & 112) != 32) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        z19 = z18 | z17;
                        objM87133R2 = c28655q2.m87133R();
                        if (z19) {
                            function7 = function6;
                            objM87133R2 = new C0167g(17, function7, c37620a);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            function7 = function6;
                            objM87133R2 = new C0167g(17, function7, c37620a);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function6 = function7;
                        z24 = false;
                        AbstractC27265l0.m82217i(modifierM3599a3, enumC27269n2, title12, c39274g, null, enabled6, null, null, false, false, null, null, (Function1) objM87133R2, c28655q2, (i18 << 6) | 54 | (C39274g.f168929c << 9), 0, 4048);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z24);
                    c28655q2.m87173q(true);
                    f14 = f18;
                    function3 = function6;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q2.m87138X();
            f14 = f13;
            function3 = function2;
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                final int i314 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: au2.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i314) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC2083h.m6597l(primaryButton, c37620a, z4, f14, function3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC2083h.m6600o(primaryButton, c37620a, z4, f14, function3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            if (i27 != 0) {
                f15 = 4 * 8;
            } else {
                f15 = f13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C1991b1(11);
                    c28655q2.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            c28655q2.m87150e0(-1756052559);
            if (z4) {
                c28655q2.m87150e0(-1756062790);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                TextResource title13 = primaryButton.getTitle();
                i24 = i15 & 57344;
                if (i24 == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i15 & 14) != 4) {
                    z26 = true;
                } else {
                    z26 = true;
                }
                z27 = z26 | z25;
                objM87133R3 = c28655q2.m87133R();
                if (z27) {
                    final int i218 = 0;
                    objM87133R3 = new InterfaceC4339a() { // from class: au2.f
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i218) {
                                case 0:
                                    return AbstractC2083h.m6595j(function4, primaryButton);
                                case 1:
                                    return AbstractC2083h.m6596k(function4, primaryButton);
                                default:
                                    return AbstractC2083h.m6598m(function4, primaryButton);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    final int i219 = 0;
                    objM87133R3 = new InterfaceC4339a() { // from class: au2.f
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i219) {
                                case 0:
                                    return AbstractC2083h.m6595j(function4, primaryButton);
                                case 1:
                                    return AbstractC2083h.m6596k(function4, primaryButton);
                                default:
                                    return AbstractC2083h.m6598m(function4, primaryButton);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                }
                i25 = TextResource.$stable;
                function8 = function4;
                z28 = true;
                AbstractC27292z.m82343j(modifierM3409f4, false, false, null, null, null, title13, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R3, c28655q2, (i25 << 18) | 6, 0, 8126);
                c28655q = c28655q2;
                if (c37620a == null) {
                    c28655q.m87150e0(-1755810017);
                    c28655q.m87173q(false);
                    c2314t2 = c2314t;
                } else {
                    c28655q.m87150e0(-1755810016);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * 4, c2314t));
                    TextResource title14 = c37620a.getTitle();
                    if (i24 == 16384) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if ((i15 & 112) != 32) {
                        z28 = false;
                    }
                    z34 = z29 | z28;
                    objM87133R4 = c28655q.m87133R();
                    if (z34) {
                        final int i2110 = 1;
                        objM87133R4 = new InterfaceC4339a() { // from class: au2.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2110) {
                                    case 0:
                                        return AbstractC2083h.m6595j(function8, c37620a);
                                    case 1:
                                        return AbstractC2083h.m6596k(function8, c37620a);
                                    default:
                                        return AbstractC2083h.m6598m(function8, c37620a);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        final int i2111 = 1;
                        objM87133R4 = new InterfaceC4339a() { // from class: au2.f
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111) {
                                    case 0:
                                        return AbstractC2083h.m6595j(function8, c37620a);
                                    case 1:
                                        return AbstractC2083h.m6596k(function8, c37620a);
                                    default:
                                        return AbstractC2083h.m6598m(function8, c37620a);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    }
                    c2314t2 = c2314t;
                    AbstractC27271o0.m82253b(null, false, title14, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R4, c28655q, i25 << 6, 0, 1019);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t2));
                c28655q.m87183x(i26);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i315 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: au2.g
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i315) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC2083h.m6597l(primaryButton, c37620a, z4, f15, function8, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC2083h.m6600o(primaryButton, c37620a, z4, f15, function8, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                float f19 = f15;
                function5 = function4;
                c28655q2.m87150e0(-1755499644);
                c28655q2.m87173q(false);
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "PrimarySummaryButtonTag")), 5 * 8, 0.0f, 2);
                EnumC27284v enumC27284v4 = EnumC27284v.TextLarge;
                TextResource title15 = primaryButton.getTitle();
                i18 = TextResource.$stable;
                String strM21274h4 = AbstractC8693b.m21274h(title15, c28655q2, i18);
                boolean enabled7 = primaryButton.getEnabled();
                long recovery4 = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getRecovery();
                i19 = i15 & 57344;
                if (i19 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 14) != 4) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                z16 = z14 | z15;
                objM87133R = c28655q2.m87133R();
                if (z16) {
                    final int i316 = 2;
                    objM87133R = new InterfaceC4339a() { // from class: au2.f
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i316) {
                                case 0:
                                    return AbstractC2083h.m6595j(function5, primaryButton);
                                case 1:
                                    return AbstractC2083h.m6596k(function5, primaryButton);
                                default:
                                    return AbstractC2083h.m6598m(function5, primaryButton);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                } else {
                    final int i317 = 2;
                    objM87133R = new InterfaceC4339a() { // from class: au2.f
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i317) {
                                case 0:
                                    return AbstractC2083h.m6595j(function5, primaryButton);
                                case 1:
                                    return AbstractC2083h.m6596k(function5, primaryButton);
                                default:
                                    return AbstractC2083h.m6598m(function5, primaryButton);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                }
                function6 = function5;
                AbstractC27282u.m82292h(modifierM3396r4, enumC27284v4, strM21274h4, enabled7, recovery4, null, false, (InterfaceC4339a) objM87133R, c28655q2, 54, 96);
                if (c37620a == null) {
                    c28655q2.m87150e0(-1754961826);
                    c28655q2.m87173q(false);
                    z24 = false;
                } else {
                    c28655q2.m87150e0(-1754961825);
                    AbstractC11266d.m30469w(2, 4, c2314t, c28655q2);
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "SecondarySummaryButtonTag");
                    EnumC27269n0 enumC27269n3 = EnumC27269n0.TextSmall;
                    TextResource title16 = c37620a.getTitle();
                    icon = c37620a.getIcon();
                    if (icon != null) {
                        c39274g = new C39274g(icon.toWhoopIcon(), null, 2, null);
                    } else {
                        c39274g = null;
                    }
                    boolean enabled8 = c37620a.getEnabled();
                    if (i19 == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i15 & 112) != 32) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    z19 = z18 | z17;
                    objM87133R2 = c28655q2.m87133R();
                    if (z19) {
                        function7 = function6;
                        objM87133R2 = new C0167g(17, function7, c37620a);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        function7 = function6;
                        objM87133R2 = new C0167g(17, function7, c37620a);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function6 = function7;
                    z24 = false;
                    AbstractC27265l0.m82217i(modifierM3599a4, enumC27269n3, title16, c39274g, null, enabled8, null, null, false, false, null, null, (Function1) objM87133R2, c28655q2, (i18 << 6) | 54 | (C39274g.f168929c << 9), 0, 4048);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z24);
                c28655q2.m87173q(true);
                f14 = f19;
                function3 = function6;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q2.m87138X();
        f14 = f13;
        function3 = function2;
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            final int i318 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: au2.g
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i318) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC2083h.m6597l(primaryButton, c37620a, z4, f14, function3, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC2083h.m6600o(primaryButton, c37620a, z4, f14, function3, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m6594i(C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m6595j(Function1 function1, C37620a c37620a) {
        function1.invoke(c37620a.getAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m6596k(Function1 function1, C37620a c37620a) {
        function1.invoke(c37620a.getAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m6597l(C37620a c37620a, C37620a c37620a2, boolean z4, float f13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m6593h(c37620a, c37620a2, z4, f13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m6598m(Function1 function1, C37620a c37620a) {
        function1.invoke(c37620a.getAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m6599n(Function1 function1, C37620a c37620a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c37620a.getAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m6600o(C37620a c37620a, C37620a c37620a2, boolean z4, float f13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m6593h(c37620a, c37620a2, z4, f13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
