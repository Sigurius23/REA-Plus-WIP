package ny0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dp0.C12253i;
import fy1.C14873i;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import kw1.C22852c;
import l83.C23454a0;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p717lq2.C24679k;
import p719m22.C24965t;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: ny0.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lny0/l;", "state", "Lj0/i;", "interactionSource", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Landroidx/compose/ui/Modifier;Lny0/l;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/runtime/Composer;I)V", "a", "Lny0/l;", "spreadCardIconButtonState", "", "b", "Ljava/util/List;", "cardIconButtonSharedRowStates", "c", "cardIconButtonStripStates", "", "isPressed", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27262k {

    /* JADX INFO: renamed from: a */
    private static final C27264l f109089a;

    /* JADX INFO: renamed from: b */
    private static final List<C27264l> f109090b;

    /* JADX INFO: renamed from: c */
    private static final List<C27264l> f109091c;

    /* JADX INFO: renamed from: ny0.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m82201a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1873122681);
            float f13 = 8;
            float f14 = 1 * f13;
            AbstractC22960g2.m66729a(AbstractC1099a.m3394p(2 * f13, AbstractC1102d.m3409f(1.0f, C2314t.f9131w)), AbstractC22977m.m66746i(f14), AbstractC22977m.m66746i(f14), null, 0, 0, C27268n.f109103a.m82238f(), c28655q, 1573302, 56);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m82201a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC16313m0 enumC16313m0 = EnumC16313m0.HOME;
        f109089a = new C27264l("preview", enumC16313m0, null, false, null, null, 60, null);
        EnumC16313m0 enumC16313m1 = EnumC16313m0.ADD;
        C27264l c27264l = new C27264l("activity", enumC16313m1, null, false, 0 == true ? 1 : 0, EnumC27272p.DEFAULT, 28, null);
        C27264l c27264l2 = new C27264l("home", enumC16313m0, null, false, 0 == true ? 1 : 0, EnumC27272p.HIGHLIGHT, 28, null);
        EnumC16313m0 enumC16313m2 = EnumC16313m0.TINY_EXPAND;
        f109090b = AbstractC37056f.m118959K(c27264l, c27264l2, new C27264l("more", enumC16313m2, null, false, null, EnumC27272p.BLUE_BACKGROUND, 28, null));
        f109091c = AbstractC37056f.m118959K(new C27264l("strip_1", enumC16313m1, null, false, 0 == true ? 1 : 0, EnumC27272p.QUICK_ACTION, 28, null), new C27264l("strip_2", enumC16313m0, null, false, null, EnumC27272p.ONBOARDING, 28, 0 == true ? 1 : 0), new C27264l("strip_3", enumC16313m2, null, false, null, EnumC27272p.TRANSPARENT_BACKGROUND, 28, null), new C27264l("strip_4", enumC16313m1, null, false, 0 == true ? 1 : 0, EnumC27272p.LIGHT_BACKGROUND, 20, null));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:101:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x021d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0248  */
    /* JADX WARN: Code duplicated, block: B:111:0x0253  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0101  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:76:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0153  */
    /* JADX WARN: Code duplicated, block: B:84:0x0176  */
    /* JADX WARN: Code duplicated, block: B:85:0x0178  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cd  */
    /* JADX INFO: renamed from: d */
    public static final void m82192d(Modifier modifier, C27264l state, InterfaceC21083i interfaceC21083i, InterfaceC4339a onClick, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC21083i interfaceC21083i2;
        boolean z4;
        Modifier modifier3;
        InterfaceC21083i interfaceC21083i3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        AbstractC18247a abstractC18247aM82204c;
        InterfaceC21430b borderColor;
        AbstractC17911t abstractC17911tMo60316a;
        C39174f c39174fM134470getCornerRadiuslTKBWiU;
        float f13;
        C33252i c33252iM105489e;
        EnumC39333f iconColor;
        C17919x c17919xM31989h;
        long jMo134584toComposableColorWaAFU9c;
        long jM53358D;
        float f14;
        boolean z13;
        Object objM87133R;
        Modifier modifierM118994r;
        float f15;
        Modifier modifierMo3471e;
        Modifier modifierM52565c;
        InterfaceC22973k1 paddingValues;
        Modifier modifierMo3471e2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        int i16;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1098683588);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC21083i2 = interfaceC21083i;
                i15 |= c28655q.m87153g(interfaceC21083i2) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onClick)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11266d.m30453g(c28655q);
                    }
                    interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                }
                if (m82193e(AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14))) {
                    abstractC18247aM82204c = state.getStyle().getPressedBackground();
                } else {
                    abstractC18247aM82204c = state.m82204c();
                }
                borderColor = state.getStyle().getBorderColor();
                if (borderColor == null) {
                    c28655q.m87150e0(1063407954);
                    c28655q.m87173q(false);
                    abstractC17911tMo60316a = null;
                } else {
                    c28655q.m87150e0(727040143);
                    abstractC17911tMo60316a = borderColor.mo60316a(c28655q, 0);
                    c28655q.m87173q(false);
                }
                c39174fM134470getCornerRadiuslTKBWiU = state.getStyle().getCornerRadius();
                if (c39174fM134470getCornerRadiuslTKBWiU != null) {
                    f13 = c39174fM134470getCornerRadiuslTKBWiU.f168413w;
                } else {
                    f13 = 2 * 4;
                }
                c33252iM105489e = AbstractC33253j.m105489e(f13);
                if (state.getEnabled()) {
                    c28655q.m87150e0(1063651150);
                    iconColor = state.getStyle().getIconColor();
                    if (iconColor == null) {
                        c28655q.m87150e0(1063671826);
                        c28655q.m87173q(false);
                        c17919xM31989h = null;
                    } else {
                        c28655q.m87150e0(727048655);
                        c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, iconColor.mo134584toComposableColorWaAFU9c(c28655q, 0));
                    }
                    if (c17919xM31989h == null) {
                        c28655q.m87150e0(727050127);
                        jMo134584toComposableColorWaAFU9c = state.getStyle().getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(727047988);
                        c28655q.m87173q(false);
                        jMo134584toComposableColorWaAFU9c = c17919xM31989h.f69639a;
                    }
                    jM53358D = jMo134584toComposableColorWaAFU9c;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(727047139);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
                }
                long j7 = jM53358D;
                f14 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(10 * f14, modifier4);
                boolean zM82206f = state.getEnabled();
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C24679k(onClick, 17);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC21083i interfaceC21083i4 = interfaceC21083i2;
                modifierM118994r = AbstractC37056f.m118994r(AbstractC1092a.m3360e(c2314t, interfaceC21083i4, null, zM82206f, null, (InterfaceC4339a) objM87133R, 24), c33252iM105489e);
                if (abstractC17911tMo60316a != null) {
                    f15 = f14;
                    modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44456i(((float) 0.375d) * f15, c2314t, abstractC17911tMo60316a, c33252iM105489e));
                } else {
                    f15 = f14;
                    modifierMo3471e = modifierM118994r.mo3471e(c2314t);
                }
                modifierM52565c = AbstractC18249c.m52565c(modifierMo3471e, abstractC18247aM82204c);
                paddingValues = state.getStyle().getPaddingValues();
                if (paddingValues != null) {
                    modifierMo3471e2 = modifierM52565c.mo3471e(AbstractC1099a.m3393o(paddingValues, c2314t));
                } else {
                    modifierMo3471e2 = modifierM52565c.mo3471e(c2314t);
                }
                Modifier modifierMo3471e3 = modifierM3419p.mo3471e(modifierMo3471e2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
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
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(state.getIcon().toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f15 * f15, c2314t), j7, c28655q, 432, 0);
                c28655q.m87173q(true);
                modifier3 = modifier4;
                interfaceC21083i3 = interfaceC21083i4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC21083i3 = interfaceC21083i2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) state, (Object) interfaceC21083i3, (Object) onClick, i13, i14, 26);
            }
        }
        i15 |= 384;
        interfaceC21083i2 = interfaceC21083i;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onClick)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q);
                }
                interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
            }
            if (m82193e(AbstractC15751g.m44460m(interfaceC21083i2, c28655q, (i15 >> 6) & 14))) {
                abstractC18247aM82204c = state.getStyle().getPressedBackground();
            } else {
                abstractC18247aM82204c = state.m82204c();
            }
            borderColor = state.getStyle().getBorderColor();
            if (borderColor == null) {
                c28655q.m87150e0(1063407954);
                c28655q.m87173q(false);
                abstractC17911tMo60316a = null;
            } else {
                c28655q.m87150e0(727040143);
                abstractC17911tMo60316a = borderColor.mo60316a(c28655q, 0);
                c28655q.m87173q(false);
            }
            c39174fM134470getCornerRadiuslTKBWiU = state.getStyle().getCornerRadius();
            if (c39174fM134470getCornerRadiuslTKBWiU != null) {
                f13 = c39174fM134470getCornerRadiuslTKBWiU.f168413w;
            } else {
                f13 = 2 * 4;
            }
            c33252iM105489e = AbstractC33253j.m105489e(f13);
            if (state.getEnabled()) {
                c28655q.m87150e0(727047139);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(1063651150);
                iconColor = state.getStyle().getIconColor();
                if (iconColor == null) {
                    c28655q.m87150e0(1063671826);
                    c28655q.m87173q(false);
                    c17919xM31989h = null;
                } else {
                    c28655q.m87150e0(727048655);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, iconColor.mo134584toComposableColorWaAFU9c(c28655q, 0));
                }
                if (c17919xM31989h == null) {
                    c28655q.m87150e0(727050127);
                    jMo134584toComposableColorWaAFU9c = state.getStyle().getTitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(727047988);
                    c28655q.m87173q(false);
                    jMo134584toComposableColorWaAFU9c = c17919xM31989h.f69639a;
                }
                jM53358D = jMo134584toComposableColorWaAFU9c;
                c28655q.m87173q(false);
            }
            long j13 = jM53358D;
            f14 = 4;
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(10 * f14, modifier4);
            boolean zM82206f2 = state.getEnabled();
            if ((i15 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C24679k(onClick, 17);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C24679k(onClick, 17);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC21083i interfaceC21083i5 = interfaceC21083i2;
            modifierM118994r = AbstractC37056f.m118994r(AbstractC1092a.m3360e(c2314t, interfaceC21083i5, null, zM82206f2, null, (InterfaceC4339a) objM87133R, 24), c33252iM105489e);
            if (abstractC17911tMo60316a != null) {
                f15 = f14;
                modifierMo3471e = modifierM118994r.mo3471e(AbstractC15751g.m44456i(((float) 0.375d) * f15, c2314t, abstractC17911tMo60316a, c33252iM105489e));
            } else {
                f15 = f14;
                modifierMo3471e = modifierM118994r.mo3471e(c2314t);
            }
            modifierM52565c = AbstractC18249c.m52565c(modifierMo3471e, abstractC18247aM82204c);
            paddingValues = state.getStyle().getPaddingValues();
            if (paddingValues != null) {
                modifierMo3471e2 = modifierM52565c.mo3471e(AbstractC1099a.m3393o(paddingValues, c2314t));
            } else {
                modifierMo3471e2 = modifierM52565c.mo3471e(c2314t);
            }
            Modifier modifierMo3471e4 = modifierM3419p2.mo3471e(modifierMo3471e2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(state.getIcon().toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f15 * f15, c2314t), j13, c28655q, 432, 0);
            c28655q.m87173q(true);
            modifier3 = modifier4;
            interfaceC21083i3 = interfaceC21083i5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC21083i3 = interfaceC21083i2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) modifier3, (Object) state, (Object) interfaceC21083i3, (Object) onClick, i13, i14, 26);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final boolean m82193e(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m82194f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m82195g(Modifier modifier, C27264l c27264l, InterfaceC21083i interfaceC21083i, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m82192d(modifier, c27264l, interfaceC21083i, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m82196h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1622666522);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m82197i(int i13, Composer composer, int i14) {
        m82196h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
