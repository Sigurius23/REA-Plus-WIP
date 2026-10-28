package t71;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i21.AbstractC17999i;
import i21.C17991a;
import i21.C18000j;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import sg2.C32451b;
import sg2.C32469t;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: t71.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\n\u0010\t\u001a7\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lt71/j;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lt71/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "l", "", "icon", "Li2/x;", "iconColor", "Lcom/whoop/design/util/TextResource;", "text", "textColor", "backgroundIconColor", "o", "(IJLcom/whoop/design/util/TextResource;JJLandroidx/compose/runtime/Composer;I)V", "q", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33576m {
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m106038h(Modifier modifier, C33573j state, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier2;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        Object objM87133R;
        C28655q c28655q2;
        Modifier modifier4;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1730869181);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q3.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C33572i(1);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if (state.m106027g().isEmpty()) {
                    c28655q3.m87150e0(-1053421915);
                    AbstractC33564a.m105986e(null, C33573j.m106024e(state, null, AbstractC33564a.m105991j(), null, null, null, 29, null), c28655q3, 0, 1);
                    c28655q3.m87173q(false);
                    c28655q2 = c28655q3;
                    modifier4 = modifier3;
                } else {
                    c28655q3.m87150e0(-1053320979);
                    z13 = (i15 & 896) == 256;
                    objM87133R = c28655q3.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C32451b(function4, 9);
                        c28655q3.m87172p0(objM87133R);
                    }
                    Function1 function5 = (Function1) objM87133R;
                    int i18 = i15 & 126;
                    c28655q2 = c28655q3;
                    modifier4 = modifier3;
                    m106042l(modifier4, state, function5, c28655q2, i18, 0);
                    c28655q2.m87173q(false);
                }
                modifier2 = modifier4;
                c28655q = c28655q2;
                function3 = function4;
            } else {
                c28655q3.m87138X();
                modifier2 = modifier;
                c28655q = c28655q3;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33574k(modifier2, state, function3, i13, i14, 0);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C33572i(1);
                    c28655q3.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if (state.m106027g().isEmpty()) {
                c28655q3.m87150e0(-1053421915);
                AbstractC33564a.m105986e(null, C33573j.m106024e(state, null, AbstractC33564a.m105991j(), null, null, null, 29, null), c28655q3, 0, 1);
                c28655q3.m87173q(false);
                c28655q2 = c28655q3;
                modifier4 = modifier3;
            } else {
                c28655q3.m87150e0(-1053320979);
                if ((i15 & 896) == 256) {
                }
                objM87133R = c28655q3.m87133R();
                if (z13) {
                    objM87133R = new C32451b(function4, 9);
                    c28655q3.m87172p0(objM87133R);
                } else {
                    objM87133R = new C32451b(function4, 9);
                    c28655q3.m87172p0(objM87133R);
                }
                Function1 function6 = (Function1) objM87133R;
                int i19 = i15 & 126;
                c28655q2 = c28655q3;
                modifier4 = modifier3;
                m106042l(modifier4, state, function6, c28655q2, i19, 0);
                c28655q2.m87173q(false);
            }
            modifier2 = modifier4;
            c28655q = c28655q2;
            function3 = function4;
        } else {
            c28655q3.m87138X();
            modifier2 = modifier;
            c28655q = c28655q3;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33574k(modifier2, state, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m106039i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m106040j(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m106041k(Modifier modifier, C33573j c33573j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m106038h(modifier, c33573j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m106042l(Modifier modifier, C33573j c33573j, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        C2314t c2314t;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2128299260);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(c33573j) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t2;
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9109L, c28655q2, 54);
            int i17 = i15;
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            m106045o(c33573j.getLeftHeaderState().getIcon(), c33573j.getLeftHeaderState().getIconColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), c33573j.getLeftHeaderState().getText(), c33573j.getLeftHeaderState().getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), c33573j.getLeftHeaderState().getBackgroundIconColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c33573j.getMiddleText(), c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH5(), null, c28655q2, 0, 0, 196602);
            C28655q c28655q3 = c28655q2;
            m106047q(c33573j.getRightHeaderState().getIcon(), c33573j.getRightHeaderState().getIconColor().mo134584toComposableColorWaAFU9c(c28655q3, 0), c33573j.getRightHeaderState().getText(), c33573j.getRightHeaderState().getTextColor().mo134584toComposableColorWaAFU9c(c28655q3, 0), c33573j.getRightHeaderState().getBackgroundIconColor().mo134584toComposableColorWaAFU9c(c28655q3, 0), c28655q3, 0);
            c28655q3.m87173q(true);
            if (c33573j.m106027g().isEmpty()) {
                c2314t = c2314t2;
                c28655q3.m87150e0(-1869707404);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-1869773713);
                c2314t = c2314t2;
                AbstractC31061c.m95650z(1, 8, c2314t, c28655q3, false);
            }
            c28655q3.m87150e0(78235596);
            int i18 = 0;
            for (Object obj : c33573j.m106027g()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C18000j c18000j = (C18000j) obj;
                boolean zM87157i = ((i17 & 896) == 256) | c28655q3.m87157i(c33573j);
                Object objM87133R = c28655q3.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C32469t(15, function1, c33573j);
                    c28655q3.m87172p0(objM87133R);
                }
                C28655q c28655q4 = c28655q3;
                int i24 = i18;
                AbstractC17999i.m51632i(null, c18000j, (Function1) objM87133R, c28655q4, 0, 1);
                if (c33573j.m106027g().size() <= 1 || AbstractC37056f.m118951C(c33573j.m106027g()) == i24) {
                    c28655q4.m87150e0(2023464128);
                    c28655q4.m87173q(false);
                } else {
                    c28655q4.m87150e0(2023390131);
                    AbstractC31061c.m95650z(1, 8, c2314t, c28655q4, false);
                }
                c28655q3 = c28655q4;
                i18 = i19;
            }
            c28655q = c28655q3;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33574k(modifier2, c33573j, function1, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m106043m(Function1 function1, C33573j c33573j, C17991a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c33573j.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String().invoke(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m106044n(Modifier modifier, C33573j c33573j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m106042l(modifier, c33573j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m106045o(int i13, long j7, TextResource text, long j13, long j14, Composer composer, int i14) {
        int i15;
        long j15;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1643658019);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(text) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            j15 = j13;
            i15 |= c28655q.m87151f(j15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            j15 = j13;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87151f(j14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
            float f13 = 4;
            float f14 = ((float) 0.5d) * 8;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i15 << 3) & 112) | 6), null, AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3419p(f13 * f13, c2314t), 1, f13), j14, AbstractC17918w0.f69621a), f14, f14), j7, c28655q, ((i15 << 6) & 7168) | 48, 0);
            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q, (i15 >> 6) & 14), null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i15 >> 3) & 896, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33575l(i13, j7, text, j13, j14, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m106046p(int i13, long j7, TextResource textResource, long j13, long j14, int i14, Composer composer, int i15) {
        m106045o(i13, j7, textResource, j13, j14, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m106047q(int i13, long j7, TextResource text, long j13, long j14, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-979128420);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(text) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87151f(j13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q.m87151f(j14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            int i16 = i15;
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
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(text, c28655q, (i16 >> 6) & 14), null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH5(), null, c28655q, (i16 >> 3) & 896, 0, 196602);
            c28655q = c28655q;
            float f13 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f13, c2314t));
            float f14 = ((float) 0.5d) * 8;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i16 << 3) & 112) | 6), null, AbstractC1099a.m3395q(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3419p(f13 * f13, c2314t), 1, f13), j14, AbstractC17918w0.f69621a), f14, f14), j7, c28655q, ((i16 << 6) & 7168) | 48, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33575l(i13, j7, text, j13, j14, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m106048r(int i13, long j7, TextResource textResource, long j13, long j14, int i14, Composer composer, int i15) {
        m106047q(i13, j7, textResource, j13, j14, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }
}
