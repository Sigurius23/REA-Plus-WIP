package k31;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import ar2.C1930a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gz0.EnumC16313m0;
import java.io.IOException;
import jp1.C21860l;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p023ay.C2124a0;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15210z4;
import p208i2.C17875c1;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: k31.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "primaryText", "", "isExpanded", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "e", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22172b {
    /* JADX INFO: renamed from: e */
    public static final void m63464e(EnumC16313m0 icon, TextResource primaryText, boolean z4, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(primaryText, "primaryText");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(63827255);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(icon.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(primaryText) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * 4);
            C38072d c38072d = C38072d.f163053a;
            AbstractC12889b.m36263b(C2314t.f9131w, c33252iM105489e, c38072d.m121949b(c28655q, 6).getBlack30(), new C13825t(2, new C17875c1(c38072d.m121949b(c28655q, 6).getBrandBlack())), 0, AbstractC37817c.m121344e(-1046025190, c28655q, new C2124a0(z4, onEvent, icon, primaryText)), c28655q, 1769478, 8);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(icon, primaryText, z4, onEvent, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m63465f(boolean z4, Function1 function1, EnumC16313m0 enumC16313m0, TextResource textResource, Composer composer, int i13) throws XmlPullParserException, IOException {
        Modifier modifierM3394p;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                c28655q.m87150e0(2146410901);
                boolean zM87153g = c28655q.m87153g(function1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C21860l(function1, 15);
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(AbstractC1092a.m3360e(c2314t, interfaceC21083i, c1119dM43228a, false, null, (InterfaceC4339a) objM87133R2, 28), "REPLAY")));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2146752831);
                boolean zM87153g2 = c28655q.m87153g(function1);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C21860l(function1, 16);
                    c28655q.m87172p0(objM87133R3);
                }
                modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1136a.m3599a(AbstractC1092a.m3360e(c2314t, interfaceC21083i, c1119dM43228a, false, null, (InterfaceC4339a) objM87133R3, 28), "REPLAY_NON_EXPANDED_BUTTON"));
                c28655q.m87173q(false);
            }
            Modifier modifierM3355a = AbstractC1091c.m3355a(modifierM3394p, null, 3);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3355a);
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
            C27430e c27430eM107874S = AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(c27430eM107874S, null, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 48, 4);
            if (z4) {
                c28655q.m87150e0(166362875);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q, 0), AbstractC1099a.m3398t(c2314t, ((float) 1.5d) * 8, 0.0f, 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 48, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(166648292);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m63466g(Function1 function1) {
        function1.invoke(EnumC22171a.REPLAY);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m63467h(Function1 function1) {
        function1.invoke(EnumC22171a.REPLAY);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m63468i(EnumC16313m0 enumC16313m0, TextResource textResource, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m63464e(enumC16313m0, textResource, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
