package ic2;

import a31.C0341c;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import be1.C3172f;
import bg0.C3226h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9788l;
import ep1.C13412g;
import f01.C13845b;
import f01.C13857f;
import g40.C15369i3;
import gb1.AbstractC15673b0;
import ge0.C15728c;
import h02.C16574h;
import ib0.C18332c;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p180h0.C16416l0;
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
import p602x1.AbstractC37817c;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import y71.C39274g;

/* JADX INFO: renamed from: ic2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a{\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00052\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lic2/g;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onNavbarLeftIconClicked", "Lkotlin/Function2;", "", "", "onNotificationSwitchSelected", "Lkotlin/Function3;", "onShepherdNotificationSwitchSelected", "onSystemSettingsClicked", "onShepherdSettingsClicked", "r", "(Lic2/g;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lic2/a;", "individualSettings", "n", "(Lic2/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "Lic2/h;", "toggleViewState", "isToggleEnabled", "Lkotlin/Function1;", "onSwitchToggle", "y", "(Lic2/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18401f {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m52915A(C18403h c18403h, boolean z4, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, AbstractC8693b.m21274h(c18403h.getTitle(), c28655q, TextResource.$stable));
            boolean zM52950d = c18403h.getIsActive();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C15728c(function1, 23);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(modifierM3599a, zM52950d, z4, 0L, null, null, (Function1) objM87133R, c28655q, 0, 56);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m52916B(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m52917C(C18403h c18403h, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m52942y(c18403h, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m52931n(C18396a c18396a, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1924115887);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c18396a) : c28655q.m87157i(c18396a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 2 * 8, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i15).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(-2087497966, c28655q, new C13857f(25, c18396a, interfaceC4351m)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c18396a.getSubtitle(), c28655q, TextResource.$stable), null, c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            float f13 = 4;
            AbstractC31061c.m95650z(f13, f13, c2314t, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(c18396a, interfaceC4351m, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m52932o(C18396a c18396a, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM21274h = AbstractC8693b.m21274h(c18396a.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "notification_switch_" + c18396a.getNamespace());
            boolean zM52899d = c18396a.getIsActive();
            boolean zM87153g = c28655q.m87153g(interfaceC4351m) | c28655q.m87157i(c18396a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C16574h(14, interfaceC4351m, c18396a);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(modifierM3599a, zM52899d, false, 0L, null, null, (Function1) objM87133R, c28655q, 0, 60);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m52933p(InterfaceC4351m interfaceC4351m, C18396a c18396a, boolean z4) {
        interfaceC4351m.invoke(c18396a.getNamespace(), Boolean.valueOf(c18396a.getIsActive()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m52934q(C18396a c18396a, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m52931n(c18396a, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public static final void m52935r(C18402g viewState, InterfaceC4339a onNavbarLeftIconClicked, InterfaceC4351m onNotificationSwitchSelected, Function3 onShepherdNotificationSwitchSelected, InterfaceC4339a onSystemSettingsClicked, InterfaceC4339a onShepherdSettingsClicked, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavbarLeftIconClicked, "onNavbarLeftIconClicked");
        AbstractC22676k.m65750j(onNotificationSwitchSelected, "onNotificationSwitchSelected");
        AbstractC22676k.m65750j(onShepherdNotificationSwitchSelected, "onShepherdNotificationSwitchSelected");
        AbstractC22676k.m65750j(onSystemSettingsClicked, "onSystemSettingsClicked");
        AbstractC22676k.m65750j(onShepherdSettingsClicked, "onShepherdSettingsClicked");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-946033629);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onNavbarLeftIconClicked) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNotificationSwitchSelected) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onShepherdNotificationSwitchSelected) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(onSystemSettingsClicked) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(onShepherdSettingsClicked) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q2.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, c2314t)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC12922s.f44576M, null, 2, 0 == true ? 1 : 0);
            Integer numM124375e = AbstractC38963t7.m124375e(C38072d.f163053a);
            String string = context.getString(AbstractC35283c.f150167E);
            AbstractC22676k.m65749i(string, "getString(...)");
            AbstractC6721d.a aVar = new AbstractC6721d.a(c8688b, null, numM124375e, string, null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C15369i3(onNavbarLeftIconClicked, 27);
                c28655q2.m87172p0(objM87133R);
            }
            C28676v0 c28676v1 = c28676v0;
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
            c28655q2.m87150e0(-924260756);
            for (C18396a c18396a : viewState.m52944a()) {
                boolean z13 = (i14 & 896) == 256;
                Object objM87133R2 = c28655q2.m87133R();
                C28676v0 c28676v2 = c28676v1;
                if (z13 || objM87133R2 == c28676v2) {
                    objM87133R2 = new C9788l(4, onNotificationSwitchSelected);
                    c28655q2.m87172p0(objM87133R2);
                }
                m52931n(c18396a, (InterfaceC4351m) objM87133R2, c28655q2, TextResource.$stable);
                c28676v1 = c28676v2;
            }
            C28676v0 c28676v3 = c28676v1;
            c28655q2.m87173q(false);
            float f13 = 6 * 4;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "Navigate to system settings");
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextLarge;
            int i15 = 2;
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC12922s.f44574L, null, i15, 0 == true ? 1 : 0);
            C38072d c38072d = C38072d.f163053a;
            C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            boolean z14 = (57344 & i14) == 16384;
            Object objM87133R3 = c28655q2.m87133R();
            if (z14 || objM87133R3 == c28676v3) {
                objM87133R3 = new C16416l0(onSystemSettingsClicked, 7);
                c28655q2.m87172p0(objM87133R3);
            }
            int i16 = TextResource.C8688b.f25889c << 6;
            int i17 = C39274g.f168929c << 12;
            int i18 = 2;
            AbstractC27265l0.m82217i(modifierM3599a, enumC27269n0, c8688b2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q2, i16 | 54 | i17, 0, 4072);
            c28655q = c28655q2;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            C18403h c18403hM52945b = viewState.getShepherdSetting();
            if (c18403hM52945b == null) {
                c28655q.m87150e0(1413474448);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1413474449);
                boolean zM52946c = viewState.getIsShepherdDetectionOn();
                boolean zM87157i = c28655q.m87157i(c18403hM52945b) | ((i14 & 7168) == 2048) | c28655q.m87157i(viewState);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i || objM87133R4 == c28676v3) {
                    objM87133R4 = new C13412g(onShepherdNotificationSwitchSelected, c18403hM52945b, viewState, 27);
                    c28655q.m87172p0(objM87133R4);
                }
                m52942y(c18403hM52945b, zM52946c, (Function1) objM87133R4, c28655q, TextResource.$stable, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC12922s.f44572K, null, i18, 0 == true ? 1 : 0);
                C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(c38072d), 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
                boolean z15 = (i14 & 458752) == 131072;
                Object objM87133R5 = c28655q.m87133R();
                if (z15 || objM87133R5 == c28676v3) {
                    objM87133R5 = new C16416l0(onShepherdSettingsClicked, 8);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC27265l0.m82217i(null, enumC27269n0, c8688b3, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R5, c28655q, i16 | 48 | i17, 0, 4073);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(viewState, onNavbarLeftIconClicked, onNotificationSwitchSelected, onShepherdNotificationSwitchSelected, onSystemSettingsClicked, onShepherdSettingsClicked, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m52936s(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m52937t(InterfaceC4351m interfaceC4351m, String namespace, boolean z4) {
        AbstractC22676k.m65750j(namespace, "namespace");
        interfaceC4351m.invoke(namespace, Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m52938u(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m52939v(Function3 function3, C18403h c18403h, C18402g c18402g, boolean z4) {
        function3.invoke(c18403h.getNamespace(), Boolean.valueOf(c18402g.getIsShepherdDetectionOn()), Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m52940w(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m52941x(C18402g c18402g, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, Function3 function3, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, Composer composer, int i14) {
        m52935r(c18402g, interfaceC4339a, interfaceC4351m, function3, interfaceC4339a2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    private static final void m52942y(C18403h c18403h, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z13;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1925836968);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(c18403h) : c28655q2.m87157i(c18403h) ? 4 : 2) | i13;
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
                        objM87133R = new C18332c(4);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                float f13 = 2 * 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, 2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
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
                TextResource textResourceM52949c = c18403h.getTitle();
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM52949c, c28655q2, i17);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q2, i18).getBrandWhite();
                C2886a c2886aM8437r = c38072d.m121952e(c28655q2, i18).getH4();
                int i19 = C2886a.f11498d << 18;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i19, 196602);
                AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i18).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(1256847981, c28655q, new C0341c(c18403h, z4, function4, 7)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c18403h.getSubtitle(), c28655q, i17), AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), c38072d.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 48, i19, 196600);
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(c18403h, z4, function3, i13, i14, 10);
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
                    objM87133R = new C18332c(4);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            float f14 = 2 * 8;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), f14, 0.0f, 2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
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
            TextResource textResourceM52949c2 = c18403h.getTitle();
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM52949c2, c28655q2, i110);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            long jM125430y2 = c38072d2.m121949b(c28655q2, i111).getBrandWhite();
            C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q2, i111).getH4();
            int i112 = C2886a.f11498d << 18;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q, 0, i112, 196602);
            AbstractC39330c.m125320b(0L, c38072d2.m121949b(c28655q, i111).getAccentAction(), 0L, 0L, AbstractC37817c.m121344e(1256847981, c28655q, new C0341c(c18403h, z4, function4, 7)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c18403h.getSubtitle(), c28655q, i110), AbstractC1099a.m3396r(c2314t2, f14, 0.0f, 2), c38072d2.m121949b(c28655q, i111).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i111).getB2(), null, c28655q, 48, i112, 196600);
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(c18403h, z4, function3, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m52943z(boolean z4) {
        return C23454a0.f92919a;
    }
}
