package com.whoop.profile.view;

import a80.C0542f;
import a81.AbstractC0564o;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import aq1.C1910d;
import b01.C2192m;
import b90.C2880b;
import bf0.C3189a;
import bs1.C3590i;
import c13.AbstractC3855a;
import c41.C4007d1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd0.C4435a;
import ck1.C4785h;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.C8527a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.C9691R;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.analytics.ProfileMembershipAnalyticsProperties;
import com.whoop.profile.domain.ProfileApiKt;
import com.whoop.profile.navigation.ProfileActionRouter;
import com.whoop.profile.navigation.ProfileNavigationRouter;
import com.whoop.profile.presentation.NavigateToAccountViewState;
import com.whoop.profile.presentation.NavigateToSettingsViewState;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.presentation.ProfileViewModel;
import com.whoop.profile.presentation.ProfileViewState;
import e93.AbstractC12889b;
import fi0.InterfaceC14515a;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import io.sentry.config.AbstractC20301a;
import j11.AbstractC21211n;
import j11.EnumC21213p;
import j93.InterfaceC21467g;
import java.util.WeakHashMap;
import jf3.C21647a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m12.AbstractC24936d;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15002f0;
import p163g1.AbstractC15081m5;
import p163g1.C14970c1;
import p163g1.C15071l5;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33205o0;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a_\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0001¢\u0006\u0004\b\u000f\u0010\u0016\u001a+\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001b\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001d\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0003¢\u0006\u0004\b\u001d\u0010\u001c\u001a+\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0003¢\u0006\u0004\b \u0010!\u001a\u0011\u0010#\u001a\u00020\"*\u00020\"¢\u0006\u0004\b#\u0010$\u001a?\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\b\b\u0002\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010,\u001a\u00020+*\u00020*H\u0002¢\u0006\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020&8\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010/\"\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/¨\u00068²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\u000e\u00106\u001a\u0002058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020&8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00107\u001a\u0002058\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/profile/navigation/ProfileNavigationRouter;", "navRouter", "Lcom/whoop/profile/navigation/ProfileActionRouter;", "actionRouter", "Ltr2/n;", "logger", "", "source", "", ProfileApiKt.TARGET_USER_ID_PARAM, ProfileApiKt.COMMUNITY_ID_PARAM, "educationType", "Landroidx/fragment/app/r0;", "activity", "Ll83/a0;", "ProfileScreen", "(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/profile/presentation/ProfileViewState;", "viewState", "Lkotlin/Function1;", "Lcom/whoop/profile/presentation/ProfileEvent;", "onEvent", "(Lcom/whoop/profile/presentation/ProfileViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkd1/o;", "image", "EntitlementLogo", "(Lkd1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SettingsIcon", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ProfileOverflowMenu", "Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;", "dialogState", "ProfileReportDialog", "(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "entitlementImageEffect", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "modifier", "", "scrollOffset", "ProfileToolbar", "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function1;FLandroidx/compose/runtime/Composer;II)V", "Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;", "Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;", "toMembershipAnalyticsProperties", "(Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;)Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;", "TRANSITIONSTART", "F", "TRANSITIONEND", "Ly3/f;", "TOOLBAR_ICON_TOUCH_AREA_SIZE", "Lcom/whoop/profile/presentation/ProfileViewModel;", "viewModel", "", "hasLoggedScreenView", "isMenuExpanded", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileScreenKt {
    private static final float TOOLBAR_ICON_TOUCH_AREA_SIZE = 12 * 4;
    public static final float TRANSITIONEND = 200.0f;
    public static final float TRANSITIONSTART = 0.0f;

    private static final void EntitlementLogo(AbstractC22403o abstractC22403o, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1641381102);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierEntitlementImageEffect = entitlementImageEffect(AbstractC1099a.m3391m(c2314t, (-2) * f13, ((float) (-0.5d)) * f13));
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3189a(function1, 28);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM5391i = AbstractC1772c1.m5391i(modifierEntitlementImageEffect, false, null, (InterfaceC4339a) objM87133R, 3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM5391i);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f14 = 4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | (i14 & 14), 3), AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_entitlement_logo_content_description), AbstractC1102d.m3421r(c2314t, f13 * f14, 2 * f14), null, C39102j.f168200b, 0.0f, null, c28655q, 24960, 104);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(abstractC22403o, function1, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EntitlementLogo$lambda$0$0(Function1 function1) {
        function1.invoke(new ProfileEvent.AppDrivenNavigation(NavigateToAccountViewState.INSTANCE));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 EntitlementLogo$lambda$2(AbstractC22403o abstractC22403o, Function1 function1, int i13, Composer composer, int i14) {
        EntitlementLogo(abstractC22403o, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    private static final void ProfileOverflowMenu(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-575735334);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            Modifier modifierM3419p = AbstractC1102d.m3419p(TOOLBAR_ICON_TOUCH_AREA_SIZE, c2314t);
            C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.DOT_MENU.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, C9691R.string.profile_more_menu_content_description);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C2192m(16, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3419p, null, (InterfaceC4339a) objM87133R2, c28655q2, C27270o.f109105k | 24960, 8);
            AbstractC20301a.m56339g(C14970c1.m43086a((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a), 0L, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack90(), 0L, 8159), null, C15071l5.m43152a((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a), null, AbstractC33253j.m105489e(2 * 4), 5), AbstractC37817c.m121344e(1262712628, c28655q2, new C9810f(interfaceC28601c1, function1, 0)), c28655q2, 3072, 2);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 4);
        }
    }

    private static final boolean ProfileOverflowMenu$lambda$1(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    private static final void ProfileOverflowMenu$lambda$2(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileOverflowMenu$lambda$3$0$0(InterfaceC28601c1 interfaceC28601c1) {
        ProfileOverflowMenu$lambda$2(interfaceC28601c1, !ProfileOverflowMenu$lambda$1(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileOverflowMenu$lambda$3$1(InterfaceC28601c1 interfaceC28601c1, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zProfileOverflowMenu$lambda$1 = ProfileOverflowMenu$lambda$1(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C2192m(17, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15002f0.m43105a(zProfileOverflowMenu$lambda$1, (InterfaceC4339a) objM87133R, null, 0L, null, null, AbstractC37817c.m121344e(1992564833, c28655q, new C9754e(function1, interfaceC28601c1, 0)), c28655q, 1572912, 60);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileOverflowMenu$lambda$3$1$0$0(InterfaceC28601c1 interfaceC28601c1) {
        ProfileOverflowMenu$lambda$2(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileOverflowMenu$lambda$3$1$1(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y DropdownMenu, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenu, "$this$DropdownMenu");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C3590i(function1, interfaceC28601c1, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15002f0.m43106b((InterfaceC4339a) objM87133R, null, false, null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$2006682372$profile_release(), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 30);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileOverflowMenu$lambda$3$1$1$0$0(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        ProfileOverflowMenu$lambda$2(interfaceC28601c1, false);
        function1.invoke(ProfileEvent.Report.INSTANCE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileOverflowMenu$lambda$4(Function1 function1, int i13, Composer composer, int i14) {
        ProfileOverflowMenu(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    private static final void ProfileReportDialog(final ProfileViewState.ProfileDialogState profileDialogState, final Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1616869163);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(profileDialogState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14;
            TextResource title = profileDialogState.getTitle();
            TextResource description = profileDialogState.getDescription();
            TextResource primaryActionText = profileDialogState.getPrimaryActionText();
            InterfaceC39332e primaryActionColor = profileDialogState.getPrimaryActionColor();
            if (primaryActionColor == null) {
                primaryActionColor = EnumC39333f.BRAND_WHITE;
            }
            TextResource secondaryActionText = profileDialogState.getSecondaryActionText();
            boolean useSolidButtons = profileDialogState.getUseSolidButtons();
            boolean showCloseIcon = profileDialogState.getShowCloseIcon();
            EnumC21213p topDialogStyle = profileDialogState.getTopDialogStyle();
            int i16 = i15 & 112;
            boolean zM87157i = c28655q2.m87157i(profileDialogState) | (i16 == 32);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i17 = 0;
                objM87133R = new InterfaceC4339a() { // from class: com.whoop.profile.view.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return ProfileScreenKt.ProfileReportDialog$lambda$0$0(profileDialogState, function1);
                            default:
                                return ProfileScreenKt.ProfileReportDialog$lambda$1$0(profileDialogState, function1);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q2.m87157i(profileDialogState) | (i16 == 32);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i18 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: com.whoop.profile.view.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return ProfileScreenKt.ProfileReportDialog$lambda$0$0(profileDialogState, function1);
                            default:
                                return ProfileScreenKt.ProfileReportDialog$lambda$1$0(profileDialogState, function1);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R2);
            }
            int i19 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, title, description, primaryActionText, useSolidButtons, primaryActionColor, null, null, null, secondaryActionText, null, false, showCloseIcon, topDialogStyle, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i19 << 3) | (i19 << 6) | (i19 << 9) | (i19 << 27), 0, 0, 247451073);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(profileDialogState, function1, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileReportDialog$lambda$0$0(ProfileViewState.ProfileDialogState profileDialogState, Function1 function1) {
        ProfileEvent dismissEvent = profileDialogState.getDismissEvent();
        if (dismissEvent != null) {
            function1.invoke(dismissEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileReportDialog$lambda$1$0(ProfileViewState.ProfileDialogState profileDialogState, Function1 function1) {
        ProfileEvent approveEvent = profileDialogState.getApproveEvent();
        if (approveEvent != null) {
            function1.invoke(approveEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileReportDialog$lambda$2(ProfileViewState.ProfileDialogState profileDialogState, Function1 function1, int i13, Composer composer, int i14) {
        ProfileReportDialog(profileDialogState, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0154  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:117:0x021b  */
    /* JADX WARN: Code duplicated, block: B:118:0x021e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0227 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x023b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0275 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0277  */
    /* JADX WARN: Code duplicated, block: B:131:0x028e  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:145:0x0319 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x031b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0353  */
    /* JADX WARN: Code duplicated, block: B:150:0x0357  */
    /* JADX WARN: Code duplicated, block: B:153:0x036a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0378  */
    /* JADX WARN: Code duplicated, block: B:158:0x038e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x0390  */
    /* JADX WARN: Code duplicated, block: B:162:0x03b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:165:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:169:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:172:0x0400  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [c93.a, java.lang.Object, q83.d, vf3.a] */
    /* JADX WARN: Type inference failed for: r9v9 */
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
    public static final void ProfileScreen(ProfileNavigationRouter profileNavigationRouter, ProfileActionRouter actionRouter, InterfaceC34116n logger, String str, Integer num, Integer num2, String str2, AbstractActivityC1340r0 abstractActivityC1340r0, Composer composer, int i13, int i14) {
        int i15;
        String str3;
        int i16;
        Integer num3;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z4;
        Integer num4;
        String str4;
        String str5;
        Integer num5;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        String str6;
        Integer num6;
        Integer num7;
        String str7;
        boolean z13;
        boolean z14;
        boolean z15;
        C28676v0 c28676v0;
        Object obj;
        InterfaceC4339a interfaceC4339a;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object obj2;
        InterfaceC23462h interfaceC23462h;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        boolean zM87157i;
        Object obj3;
        Object objM87133R;
        Object obj4;
        InterfaceC28601c1 interfaceC28601c1;
        int i26;
        boolean z16;
        boolean z17;
        Object profileScreenKt$ProfileScreen$2$1;
        ?? r10;
        C28676v0 c28676v1;
        ProfileActionRouter profileActionRouter;
        String str8;
        InterfaceC28601c1 interfaceC28601c2;
        boolean zM87153g2;
        Object obj5;
        C26669a c26669a2;
        C38266c c38266c2;
        boolean zM87153g3;
        Object objM87133R2;
        boolean zM87153g4;
        Object objM87133R3;
        ProfileScreenEventRouter profileScreenEventRouter;
        boolean zM87153g5;
        Object obj6;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87157i2;
        Object obj7;
        boolean zM87157i3;
        Object obj8;
        int i27;
        ProfileNavigationRouter navRouter = profileNavigationRouter;
        AbstractC22676k.m65750j(navRouter, "navRouter");
        AbstractC22676k.m65750j(actionRouter, "actionRouter");
        AbstractC22676k.m65750j(logger, "logger");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1724128099);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(navRouter) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(actionRouter) ? 32 : 16;
        }
        int i28 = i14 & 8;
        if (i28 == 0) {
            if ((i13 & 3072) == 0) {
                str3 = str;
                i15 |= c28655q2.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    num3 = num;
                    if (c28655q2.m87153g(num3)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q2.m87153g(num2)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(str2)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(abstractActivityC1340r0)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    if ((i15 & 4793363) != 4793362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        if (i28 != 0) {
                            str6 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                        } else {
                            str6 = str3;
                        }
                        if (i16 != 0) {
                            num6 = null;
                        } else {
                            num6 = num3;
                        }
                        if (i18 != 0) {
                            num7 = null;
                        } else {
                            num7 = num2;
                        }
                        if (i24 != 0) {
                            str7 = null;
                        } else {
                            str7 = str2;
                        }
                        if ((57344 & i15) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((458752 & i15) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z13 | z14;
                        Object objM87133R4 = c28655q2.m87133R();
                        c28676v0 = C28635l.f115821a;
                        obj = objM87133R4;
                        if (z15 || objM87133R4 == c28676v0) {
                            C9811g c9811g = new C9811g(num6, num7, 0);
                            c28655q2.m87172p0(c9811g);
                            obj = c9811g;
                        }
                        interfaceC4339a = (InterfaceC4339a) obj;
                        c28655q2.m87152f0(-1688186518);
                        c26669a = C29155a.f118017b;
                        if (c26669a != null) {
                            throw new IllegalStateException("KoinApplication has not been started");
                        }
                        c38266c = c26669a.f106046a.f159364d;
                        c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
                        zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(interfaceC4339a);
                        Object objM87133R5 = c28655q2.m87133R();
                        if (!zM87153g || objM87133R5 == c28676v0) {
                            InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                            c28655q2.m87172p0(interfaceC23462hM92087G);
                            obj2 = interfaceC23462hM92087G;
                        } else {
                            obj2 = objM87133R5;
                        }
                        c28655q2.m87173q(false);
                        interfaceC23462h = (InterfaceC23462h) obj2;
                        c28655q2.m87173q(false);
                        ProfileEvent.NavigationEvent navigationEvent = null;
                        interfaceC28601c1M87260n = AbstractC28683x.m87260n(ProfileScreen$lambda$1(interfaceC23462h).getViewState(), new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), null, navigationEvent, null, 14, null), false ? 1 : 0, navigationEvent, false ? 1 : 0, null, 61, null), null, c28655q2, 0, 2);
                        ProfileViewModel profileViewModelProfileScreen$lambda$1 = ProfileScreen$lambda$1(interfaceC23462h);
                        zM87157i = c28655q2.m87157i(interfaceC23462h);
                        Object objM87133R6 = c28655q2.m87133R();
                        if (!zM87157i || objM87133R6 == c28676v0) {
                            ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$1 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                            c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$1);
                            obj3 = profileScreenKt$ProfileScreen$1$1;
                        } else {
                            obj3 = objM87133R6;
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, profileViewModelProfileScreen$lambda$1);
                        Object[] objArr = new Object[0];
                        objM87133R = c28655q2.m87133R();
                        obj4 = objM87133R;
                        if (objM87133R == c28676v0) {
                            C8527a c8527a = new C8527a(10);
                            c28655q2.m87172p0(c8527a);
                            obj4 = c8527a;
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) obj4, c28655q2, 48);
                        ProfileViewState.UserData userData = ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().getUserData();
                        Boolean boolValueOf = Boolean.valueOf(ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().isSelfProfile());
                        boolean zM87153g6 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(actionRouter);
                        i26 = i15;
                        if ((i15 & 7168) == 2048) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = zM87153g6 | z16;
                        Object objM87133R7 = c28655q2.m87133R();
                        if (!z17 || objM87133R7 == c28676v0) {
                            r10 = 0;
                            c28676v1 = c28676v0;
                            String str9 = str6;
                            profileActionRouter = actionRouter;
                            profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str9, interfaceC28601c1, interfaceC28601c1M87260n, null);
                            str8 = str9;
                            interfaceC28601c2 = interfaceC28601c1M87260n;
                            c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                        } else {
                            interfaceC28601c2 = interfaceC28601c1M87260n;
                            c28676v1 = c28676v0;
                            str8 = str6;
                            profileActionRouter = actionRouter;
                            profileScreenKt$ProfileScreen$2$1 = objM87133R7;
                            r10 = 0;
                        }
                        AbstractC28683x.m87254h(userData, boolValueOf, (InterfaceC4351m) profileScreenKt$ProfileScreen$2$1, c28655q2);
                        ProfileViewState.UserData userData2 = ProfileScreen$lambda$2(interfaceC28601c2).getMetadata().getUserData();
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(abstractActivityC1340r0);
                        Object objM87133R8 = c28655q2.m87133R();
                        obj5 = objM87133R8;
                        if (zM87153g2 || objM87133R8 == c28676v1) {
                            ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$1 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                            c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$1);
                            obj5 = profileScreenKt$ProfileScreen$3$1;
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj5, userData2);
                        c28655q2.m87152f0(-909571169);
                        c26669a2 = C29155a.f118017b;
                        if (c26669a2 != null) {
                            throw new IllegalStateException("KoinApplication has not been started");
                        }
                        c38266c2 = c26669a2.f106046a.f159364d;
                        c28655q2.m87152f0(-3686552);
                        zM87153g3 = c28655q2.m87153g(r10) | c28655q2.m87153g(r10);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87153g3 || objM87133R2 == c28676v1) {
                            objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        c28655q2.m87173q(false);
                        c28655q2.m87173q(false);
                        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) objM87133R2;
                        zM87153g4 = c28655q2.m87153g(ProfileScreen$lambda$1(interfaceC23462h)) | c28655q2.m87153g(navRouter) | c28655q2.m87153g(profileActionRouter);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87153g4 || objM87133R3 == c28676v1) {
                            ProfileScreenEventRouter profileScreenEventRouter2 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                            navRouter = navRouter;
                            c28655q2.m87172p0(profileScreenEventRouter2);
                            objM87133R3 = profileScreenEventRouter2;
                        }
                        profileScreenEventRouter = (ProfileScreenEventRouter) objM87133R3;
                        ProfileEvent.NavigationEvent pendingNavigation = ProfileScreen$lambda$2(interfaceC28601c2).getPendingNavigation();
                        zM87153g5 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(navRouter) | c28655q2.m87157i(interfaceC23462h);
                        Object objM87133R9 = c28655q2.m87133R();
                        obj6 = objM87133R9;
                        if (zM87153g5 || objM87133R9 == c28676v1) {
                            ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$1 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                            c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$1);
                            obj6 = profileScreenKt$ProfileScreen$4$1;
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj6, pendingNavigation);
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                        ProfileViewState profileViewStateProfileScreen$lambda$2 = ProfileScreen$lambda$2(interfaceC28601c2);
                        zM87157i2 = c28655q2.m87157i(profileScreenEventRouter);
                        Object objM87133R10 = c28655q2.m87133R();
                        obj7 = objM87133R10;
                        if (zM87157i2 || objM87133R10 == c28676v1) {
                            ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$1 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                            c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$1);
                            obj7 = profileScreenKt$ProfileScreen$5$1$1;
                        }
                        String str10 = str7;
                        ProfileScreen(profileViewStateProfileScreen$lambda$2, str10, (Function1) ((InterfaceC21467g) obj7), c28655q2, (i26 >> 15) & 112, 0);
                        AnyModal designModal = ProfileScreen$lambda$2(interfaceC28601c2).getDesignModal();
                        zM87157i3 = c28655q2.m87157i(profileScreenEventRouter);
                        Object objM87133R11 = c28655q2.m87133R();
                        obj8 = objM87133R11;
                        if (zM87157i3 || objM87133R11 == c28676v1) {
                            ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$1 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                            c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$1);
                            obj8 = profileScreenKt$ProfileScreen$5$2$1;
                        }
                        AbstractC0564o.m1394P(designModal, (Function1) ((InterfaceC21467g) obj8), null, interfaceC14515a, null, null, c28655q2, AnyModal.$stable, 52);
                        C28655q c28655q3 = c28655q2;
                        c28655q3.m87173q(true);
                        num5 = num6;
                        str5 = str8;
                        num4 = num7;
                        str4 = str10;
                        c28655q = c28655q3;
                    } else {
                        c28655q2.m87138X();
                        num4 = num2;
                        str4 = str2;
                        str5 = str3;
                        num5 = num3;
                        c28655q = c28655q2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2880b(profileNavigationRouter, actionRouter, logger, str5, num5, num4, str4, abstractActivityC1340r0, i13, i14, 5);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(str2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(abstractActivityC1340r0)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i15 & 4793363) != 4793362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i28 != 0) {
                        str6 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                    } else {
                        str6 = str3;
                    }
                    if (i16 != 0) {
                        num6 = null;
                    } else {
                        num6 = num3;
                    }
                    if (i18 != 0) {
                        num7 = null;
                    } else {
                        num7 = num2;
                    }
                    if (i24 != 0) {
                        str7 = null;
                    } else {
                        str7 = str2;
                    }
                    if ((57344 & i15) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i15) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    Object objM87133R12 = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    obj = objM87133R12;
                    if (z15) {
                        C9811g c9811g2 = new C9811g(num6, num7, 0);
                        c28655q2.m87172p0(c9811g2);
                        obj = c9811g2;
                    } else {
                        C9811g c9811g3 = new C9811g(num6, num7, 0);
                        c28655q2.m87172p0(c9811g3);
                        obj = c9811g3;
                    }
                    interfaceC4339a = (InterfaceC4339a) obj;
                    c28655q2.m87152f0(-1688186518);
                    c26669a = C29155a.f118017b;
                    if (c26669a != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
                    zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(interfaceC4339a);
                    Object objM87133R13 = c28655q2.m87133R();
                    if (zM87153g) {
                        InterfaceC23462h interfaceC23462hM92087G2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                        c28655q2.m87172p0(interfaceC23462hM92087G2);
                        obj2 = interfaceC23462hM92087G2;
                    } else {
                        InterfaceC23462h interfaceC23462hM92087G3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                        c28655q2.m87172p0(interfaceC23462hM92087G3);
                        obj2 = interfaceC23462hM92087G3;
                    }
                    c28655q2.m87173q(false);
                    interfaceC23462h = (InterfaceC23462h) obj2;
                    c28655q2.m87173q(false);
                    ProfileEvent.NavigationEvent navigationEvent2 = null;
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(ProfileScreen$lambda$1(interfaceC23462h).getViewState(), new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), null, navigationEvent2, null, 14, null), false ? 1 : 0, navigationEvent2, false ? 1 : 0, null, 61, null), null, c28655q2, 0, 2);
                    ProfileViewModel profileViewModelProfileScreen$lambda$2 = ProfileScreen$lambda$1(interfaceC23462h);
                    zM87157i = c28655q2.m87157i(interfaceC23462h);
                    Object objM87133R14 = c28655q2.m87133R();
                    if (zM87157i) {
                        ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$2 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$2);
                        obj3 = profileScreenKt$ProfileScreen$1$2;
                    } else {
                        ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$3 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$3);
                        obj3 = profileScreenKt$ProfileScreen$1$3;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, profileViewModelProfileScreen$lambda$2);
                    Object[] objArr2 = new Object[0];
                    objM87133R = c28655q2.m87133R();
                    obj4 = objM87133R;
                    if (objM87133R == c28676v0) {
                        C8527a c8527a2 = new C8527a(10);
                        c28655q2.m87172p0(c8527a2);
                        obj4 = c8527a2;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) obj4, c28655q2, 48);
                    ProfileViewState.UserData userData3 = ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().getUserData();
                    Boolean boolValueOf2 = Boolean.valueOf(ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().isSelfProfile());
                    boolean zM87153g7 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(actionRouter);
                    i26 = i15;
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87153g7 | z16;
                    Object objM87133R15 = c28655q2.m87133R();
                    if (z17) {
                        r10 = 0;
                        c28676v1 = c28676v0;
                        String str11 = str6;
                        profileActionRouter = actionRouter;
                        profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str11, interfaceC28601c1, interfaceC28601c1M87260n, null);
                        str8 = str11;
                        interfaceC28601c2 = interfaceC28601c1M87260n;
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                    } else {
                        r10 = 0;
                        c28676v1 = c28676v0;
                        String str12 = str6;
                        profileActionRouter = actionRouter;
                        profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str12, interfaceC28601c1, interfaceC28601c1M87260n, null);
                        str8 = str12;
                        interfaceC28601c2 = interfaceC28601c1M87260n;
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                    }
                    AbstractC28683x.m87254h(userData3, boolValueOf2, (InterfaceC4351m) profileScreenKt$ProfileScreen$2$1, c28655q2);
                    ProfileViewState.UserData userData4 = ProfileScreen$lambda$2(interfaceC28601c2).getMetadata().getUserData();
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(abstractActivityC1340r0);
                    Object objM87133R16 = c28655q2.m87133R();
                    obj5 = objM87133R16;
                    if (zM87153g2) {
                        ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$2 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$2);
                        obj5 = profileScreenKt$ProfileScreen$3$2;
                    } else {
                        ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$3 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$3);
                        obj5 = profileScreenKt$ProfileScreen$3$3;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj5, userData4);
                    c28655q2.m87152f0(-909571169);
                    c26669a2 = C29155a.f118017b;
                    if (c26669a2 != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c2 = c26669a2.f106046a.f159364d;
                    c28655q2.m87152f0(-3686552);
                    zM87153g3 = c28655q2.m87153g(r10) | c28655q2.m87153g(r10);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(false);
                    InterfaceC14515a interfaceC14515a2 = (InterfaceC14515a) objM87133R2;
                    zM87153g4 = c28655q2.m87153g(ProfileScreen$lambda$1(interfaceC23462h)) | c28655q2.m87153g(navRouter) | c28655q2.m87153g(profileActionRouter);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g4) {
                        ProfileScreenEventRouter profileScreenEventRouter3 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                        navRouter = navRouter;
                        c28655q2.m87172p0(profileScreenEventRouter3);
                        objM87133R3 = profileScreenEventRouter3;
                    } else {
                        ProfileScreenEventRouter profileScreenEventRouter4 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                        navRouter = navRouter;
                        c28655q2.m87172p0(profileScreenEventRouter4);
                        objM87133R3 = profileScreenEventRouter4;
                    }
                    profileScreenEventRouter = (ProfileScreenEventRouter) objM87133R3;
                    ProfileEvent.NavigationEvent pendingNavigation2 = ProfileScreen$lambda$2(interfaceC28601c2).getPendingNavigation();
                    zM87153g5 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(navRouter) | c28655q2.m87157i(interfaceC23462h);
                    Object objM87133R17 = c28655q2.m87133R();
                    obj6 = objM87133R17;
                    if (zM87153g5) {
                        ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$2 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$2);
                        obj6 = profileScreenKt$ProfileScreen$4$2;
                    } else {
                        ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$3 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$3);
                        obj6 = profileScreenKt$ProfileScreen$4$3;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj6, pendingNavigation2);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                    ProfileViewState profileViewStateProfileScreen$lambda$3 = ProfileScreen$lambda$2(interfaceC28601c2);
                    zM87157i2 = c28655q2.m87157i(profileScreenEventRouter);
                    Object objM87133R18 = c28655q2.m87133R();
                    obj7 = objM87133R18;
                    if (zM87157i2) {
                        ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$2 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$2);
                        obj7 = profileScreenKt$ProfileScreen$5$1$2;
                    } else {
                        ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$3 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$3);
                        obj7 = profileScreenKt$ProfileScreen$5$1$3;
                    }
                    String str13 = str7;
                    ProfileScreen(profileViewStateProfileScreen$lambda$3, str13, (Function1) ((InterfaceC21467g) obj7), c28655q2, (i26 >> 15) & 112, 0);
                    AnyModal designModal2 = ProfileScreen$lambda$2(interfaceC28601c2).getDesignModal();
                    zM87157i3 = c28655q2.m87157i(profileScreenEventRouter);
                    Object objM87133R19 = c28655q2.m87133R();
                    obj8 = objM87133R19;
                    if (zM87157i3) {
                        ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$2 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$2);
                        obj8 = profileScreenKt$ProfileScreen$5$2$2;
                    } else {
                        ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$3 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$3);
                        obj8 = profileScreenKt$ProfileScreen$5$2$3;
                    }
                    AbstractC0564o.m1394P(designModal2, (Function1) ((InterfaceC21467g) obj8), null, interfaceC14515a2, null, null, c28655q2, AnyModal.$stable, 52);
                    C28655q c28655q4 = c28655q2;
                    c28655q4.m87173q(true);
                    num5 = num6;
                    str5 = str8;
                    num4 = num7;
                    str4 = str13;
                    c28655q = c28655q4;
                } else {
                    c28655q2.m87138X();
                    num4 = num2;
                    str4 = str2;
                    str5 = str3;
                    num5 = num3;
                    c28655q = c28655q2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2880b(profileNavigationRouter, actionRouter, logger, str5, num5, num4, str4, abstractActivityC1340r0, i13, i14, 5);
                }
            }
            i15 |= 24576;
            num3 = num;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q2.m87153g(num2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(str2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(abstractActivityC1340r0)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i15 & 4793363) != 4793362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i28 != 0) {
                        str6 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                    } else {
                        str6 = str3;
                    }
                    if (i16 != 0) {
                        num6 = null;
                    } else {
                        num6 = num3;
                    }
                    if (i18 != 0) {
                        num7 = null;
                    } else {
                        num7 = num2;
                    }
                    if (i24 != 0) {
                        str7 = null;
                    } else {
                        str7 = str2;
                    }
                    if ((57344 & i15) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i15) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    Object objM87133R110 = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    obj = objM87133R110;
                    if (z15) {
                        C9811g c9811g4 = new C9811g(num6, num7, 0);
                        c28655q2.m87172p0(c9811g4);
                        obj = c9811g4;
                    } else {
                        C9811g c9811g5 = new C9811g(num6, num7, 0);
                        c28655q2.m87172p0(c9811g5);
                        obj = c9811g5;
                    }
                    interfaceC4339a = (InterfaceC4339a) obj;
                    c28655q2.m87152f0(-1688186518);
                    c26669a = C29155a.f118017b;
                    if (c26669a != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
                    zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(interfaceC4339a);
                    Object objM87133R111 = c28655q2.m87133R();
                    if (zM87153g) {
                        InterfaceC23462h interfaceC23462hM92087G4 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                        c28655q2.m87172p0(interfaceC23462hM92087G4);
                        obj2 = interfaceC23462hM92087G4;
                    } else {
                        InterfaceC23462h interfaceC23462hM92087G5 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                        c28655q2.m87172p0(interfaceC23462hM92087G5);
                        obj2 = interfaceC23462hM92087G5;
                    }
                    c28655q2.m87173q(false);
                    interfaceC23462h = (InterfaceC23462h) obj2;
                    c28655q2.m87173q(false);
                    ProfileEvent.NavigationEvent navigationEvent3 = null;
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(ProfileScreen$lambda$1(interfaceC23462h).getViewState(), new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), null, navigationEvent3, null, 14, null), false ? 1 : 0, navigationEvent3, false ? 1 : 0, null, 61, null), null, c28655q2, 0, 2);
                    ProfileViewModel profileViewModelProfileScreen$lambda$3 = ProfileScreen$lambda$1(interfaceC23462h);
                    zM87157i = c28655q2.m87157i(interfaceC23462h);
                    Object objM87133R112 = c28655q2.m87133R();
                    if (zM87157i) {
                        ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$4 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$4);
                        obj3 = profileScreenKt$ProfileScreen$1$4;
                    } else {
                        ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$5 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$5);
                        obj3 = profileScreenKt$ProfileScreen$1$5;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, profileViewModelProfileScreen$lambda$3);
                    Object[] objArr3 = new Object[0];
                    objM87133R = c28655q2.m87133R();
                    obj4 = objM87133R;
                    if (objM87133R == c28676v0) {
                        C8527a c8527a3 = new C8527a(10);
                        c28655q2.m87172p0(c8527a3);
                        obj4 = c8527a3;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) obj4, c28655q2, 48);
                    ProfileViewState.UserData userData5 = ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().getUserData();
                    Boolean boolValueOf3 = Boolean.valueOf(ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().isSelfProfile());
                    boolean zM87153g8 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(actionRouter);
                    i26 = i15;
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87153g8 | z16;
                    Object objM87133R113 = c28655q2.m87133R();
                    if (z17) {
                        r10 = 0;
                        c28676v1 = c28676v0;
                        String str14 = str6;
                        profileActionRouter = actionRouter;
                        profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str14, interfaceC28601c1, interfaceC28601c1M87260n, null);
                        str8 = str14;
                        interfaceC28601c2 = interfaceC28601c1M87260n;
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                    } else {
                        r10 = 0;
                        c28676v1 = c28676v0;
                        String str15 = str6;
                        profileActionRouter = actionRouter;
                        profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str15, interfaceC28601c1, interfaceC28601c1M87260n, null);
                        str8 = str15;
                        interfaceC28601c2 = interfaceC28601c1M87260n;
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                    }
                    AbstractC28683x.m87254h(userData5, boolValueOf3, (InterfaceC4351m) profileScreenKt$ProfileScreen$2$1, c28655q2);
                    ProfileViewState.UserData userData6 = ProfileScreen$lambda$2(interfaceC28601c2).getMetadata().getUserData();
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(abstractActivityC1340r0);
                    Object objM87133R114 = c28655q2.m87133R();
                    obj5 = objM87133R114;
                    if (zM87153g2) {
                        ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$4 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$4);
                        obj5 = profileScreenKt$ProfileScreen$3$4;
                    } else {
                        ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$5 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$5);
                        obj5 = profileScreenKt$ProfileScreen$3$5;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj5, userData6);
                    c28655q2.m87152f0(-909571169);
                    c26669a2 = C29155a.f118017b;
                    if (c26669a2 != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c2 = c26669a2.f106046a.f159364d;
                    c28655q2.m87152f0(-3686552);
                    zM87153g3 = c28655q2.m87153g(r10) | c28655q2.m87153g(r10);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(false);
                    InterfaceC14515a interfaceC14515a3 = (InterfaceC14515a) objM87133R2;
                    zM87153g4 = c28655q2.m87153g(ProfileScreen$lambda$1(interfaceC23462h)) | c28655q2.m87153g(navRouter) | c28655q2.m87153g(profileActionRouter);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g4) {
                        ProfileScreenEventRouter profileScreenEventRouter5 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                        navRouter = navRouter;
                        c28655q2.m87172p0(profileScreenEventRouter5);
                        objM87133R3 = profileScreenEventRouter5;
                    } else {
                        ProfileScreenEventRouter profileScreenEventRouter6 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                        navRouter = navRouter;
                        c28655q2.m87172p0(profileScreenEventRouter6);
                        objM87133R3 = profileScreenEventRouter6;
                    }
                    profileScreenEventRouter = (ProfileScreenEventRouter) objM87133R3;
                    ProfileEvent.NavigationEvent pendingNavigation3 = ProfileScreen$lambda$2(interfaceC28601c2).getPendingNavigation();
                    zM87153g5 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(navRouter) | c28655q2.m87157i(interfaceC23462h);
                    Object objM87133R115 = c28655q2.m87133R();
                    obj6 = objM87133R115;
                    if (zM87153g5) {
                        ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$4 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$4);
                        obj6 = profileScreenKt$ProfileScreen$4$4;
                    } else {
                        ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$5 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$5);
                        obj6 = profileScreenKt$ProfileScreen$4$5;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj6, pendingNavigation3);
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3407d3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                    ProfileViewState profileViewStateProfileScreen$lambda$4 = ProfileScreen$lambda$2(interfaceC28601c2);
                    zM87157i2 = c28655q2.m87157i(profileScreenEventRouter);
                    Object objM87133R116 = c28655q2.m87133R();
                    obj7 = objM87133R116;
                    if (zM87157i2) {
                        ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$4 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$4);
                        obj7 = profileScreenKt$ProfileScreen$5$1$4;
                    } else {
                        ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$5 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$5);
                        obj7 = profileScreenKt$ProfileScreen$5$1$5;
                    }
                    String str16 = str7;
                    ProfileScreen(profileViewStateProfileScreen$lambda$4, str16, (Function1) ((InterfaceC21467g) obj7), c28655q2, (i26 >> 15) & 112, 0);
                    AnyModal designModal3 = ProfileScreen$lambda$2(interfaceC28601c2).getDesignModal();
                    zM87157i3 = c28655q2.m87157i(profileScreenEventRouter);
                    Object objM87133R117 = c28655q2.m87133R();
                    obj8 = objM87133R117;
                    if (zM87157i3) {
                        ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$4 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$4);
                        obj8 = profileScreenKt$ProfileScreen$5$2$4;
                    } else {
                        ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$5 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$5);
                        obj8 = profileScreenKt$ProfileScreen$5$2$5;
                    }
                    AbstractC0564o.m1394P(designModal3, (Function1) ((InterfaceC21467g) obj8), null, interfaceC14515a3, null, null, c28655q2, AnyModal.$stable, 52);
                    C28655q c28655q5 = c28655q2;
                    c28655q5.m87173q(true);
                    num5 = num6;
                    str5 = str8;
                    num4 = num7;
                    str4 = str16;
                    c28655q = c28655q5;
                } else {
                    c28655q2.m87138X();
                    num4 = num2;
                    str4 = str2;
                    str5 = str3;
                    num5 = num3;
                    c28655q = c28655q2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2880b(profileNavigationRouter, actionRouter, logger, str5, num5, num4, str4, abstractActivityC1340r0, i13, i14, 5);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87153g(str2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(abstractActivityC1340r0)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i15 & 4793363) != 4793362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i28 != 0) {
                    str6 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                } else {
                    str6 = str3;
                }
                if (i16 != 0) {
                    num6 = null;
                } else {
                    num6 = num3;
                }
                if (i18 != 0) {
                    num7 = null;
                } else {
                    num7 = num2;
                }
                if (i24 != 0) {
                    str7 = null;
                } else {
                    str7 = str2;
                }
                if ((57344 & i15) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((458752 & i15) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                Object objM87133R118 = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                obj = objM87133R118;
                if (z15) {
                    C9811g c9811g6 = new C9811g(num6, num7, 0);
                    c28655q2.m87172p0(c9811g6);
                    obj = c9811g6;
                } else {
                    C9811g c9811g7 = new C9811g(num6, num7, 0);
                    c28655q2.m87172p0(c9811g7);
                    obj = c9811g7;
                }
                interfaceC4339a = (InterfaceC4339a) obj;
                c28655q2.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
                zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(interfaceC4339a);
                Object objM87133R119 = c28655q2.m87133R();
                if (zM87153g) {
                    InterfaceC23462h interfaceC23462hM92087G6 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                    c28655q2.m87172p0(interfaceC23462hM92087G6);
                    obj2 = interfaceC23462hM92087G6;
                } else {
                    InterfaceC23462h interfaceC23462hM92087G7 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                    c28655q2.m87172p0(interfaceC23462hM92087G7);
                    obj2 = interfaceC23462hM92087G7;
                }
                c28655q2.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) obj2;
                c28655q2.m87173q(false);
                ProfileEvent.NavigationEvent navigationEvent4 = null;
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(ProfileScreen$lambda$1(interfaceC23462h).getViewState(), new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), null, navigationEvent4, null, 14, null), false ? 1 : 0, navigationEvent4, false ? 1 : 0, null, 61, null), null, c28655q2, 0, 2);
                ProfileViewModel profileViewModelProfileScreen$lambda$4 = ProfileScreen$lambda$1(interfaceC23462h);
                zM87157i = c28655q2.m87157i(interfaceC23462h);
                Object objM87133R1110 = c28655q2.m87133R();
                if (zM87157i) {
                    ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$6 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$6);
                    obj3 = profileScreenKt$ProfileScreen$1$6;
                } else {
                    ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$7 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$7);
                    obj3 = profileScreenKt$ProfileScreen$1$7;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, profileViewModelProfileScreen$lambda$4);
                Object[] objArr4 = new Object[0];
                objM87133R = c28655q2.m87133R();
                obj4 = objM87133R;
                if (objM87133R == c28676v0) {
                    C8527a c8527a4 = new C8527a(10);
                    c28655q2.m87172p0(c8527a4);
                    obj4 = c8527a4;
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr4, (InterfaceC4339a) obj4, c28655q2, 48);
                ProfileViewState.UserData userData7 = ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().getUserData();
                Boolean boolValueOf4 = Boolean.valueOf(ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().isSelfProfile());
                boolean zM87153g9 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(actionRouter);
                i26 = i15;
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87153g9 | z16;
                Object objM87133R1111 = c28655q2.m87133R();
                if (z17) {
                    r10 = 0;
                    c28676v1 = c28676v0;
                    String str17 = str6;
                    profileActionRouter = actionRouter;
                    profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str17, interfaceC28601c1, interfaceC28601c1M87260n, null);
                    str8 = str17;
                    interfaceC28601c2 = interfaceC28601c1M87260n;
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                } else {
                    r10 = 0;
                    c28676v1 = c28676v0;
                    String str18 = str6;
                    profileActionRouter = actionRouter;
                    profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str18, interfaceC28601c1, interfaceC28601c1M87260n, null);
                    str8 = str18;
                    interfaceC28601c2 = interfaceC28601c1M87260n;
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                }
                AbstractC28683x.m87254h(userData7, boolValueOf4, (InterfaceC4351m) profileScreenKt$ProfileScreen$2$1, c28655q2);
                ProfileViewState.UserData userData8 = ProfileScreen$lambda$2(interfaceC28601c2).getMetadata().getUserData();
                zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(abstractActivityC1340r0);
                Object objM87133R1112 = c28655q2.m87133R();
                obj5 = objM87133R1112;
                if (zM87153g2) {
                    ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$6 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$6);
                    obj5 = profileScreenKt$ProfileScreen$3$6;
                } else {
                    ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$7 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$7);
                    obj5 = profileScreenKt$ProfileScreen$3$7;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj5, userData8);
                c28655q2.m87152f0(-909571169);
                c26669a2 = C29155a.f118017b;
                if (c26669a2 != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c2 = c26669a2.f106046a.f159364d;
                c28655q2.m87152f0(-3686552);
                zM87153g3 = c28655q2.m87153g(r10) | c28655q2.m87153g(r10);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q2.m87173q(false);
                c28655q2.m87173q(false);
                InterfaceC14515a interfaceC14515a4 = (InterfaceC14515a) objM87133R2;
                zM87153g4 = c28655q2.m87153g(ProfileScreen$lambda$1(interfaceC23462h)) | c28655q2.m87153g(navRouter) | c28655q2.m87153g(profileActionRouter);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g4) {
                    ProfileScreenEventRouter profileScreenEventRouter7 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                    navRouter = navRouter;
                    c28655q2.m87172p0(profileScreenEventRouter7);
                    objM87133R3 = profileScreenEventRouter7;
                } else {
                    ProfileScreenEventRouter profileScreenEventRouter8 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                    navRouter = navRouter;
                    c28655q2.m87172p0(profileScreenEventRouter8);
                    objM87133R3 = profileScreenEventRouter8;
                }
                profileScreenEventRouter = (ProfileScreenEventRouter) objM87133R3;
                ProfileEvent.NavigationEvent pendingNavigation4 = ProfileScreen$lambda$2(interfaceC28601c2).getPendingNavigation();
                zM87153g5 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(navRouter) | c28655q2.m87157i(interfaceC23462h);
                Object objM87133R1113 = c28655q2.m87133R();
                obj6 = objM87133R1113;
                if (zM87153g5) {
                    ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$6 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$6);
                    obj6 = profileScreenKt$ProfileScreen$4$6;
                } else {
                    ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$7 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$7);
                    obj6 = profileScreenKt$ProfileScreen$4$7;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj6, pendingNavigation4);
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3407d4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                ProfileViewState profileViewStateProfileScreen$lambda$5 = ProfileScreen$lambda$2(interfaceC28601c2);
                zM87157i2 = c28655q2.m87157i(profileScreenEventRouter);
                Object objM87133R1114 = c28655q2.m87133R();
                obj7 = objM87133R1114;
                if (zM87157i2) {
                    ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$6 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$6);
                    obj7 = profileScreenKt$ProfileScreen$5$1$6;
                } else {
                    ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$7 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$7);
                    obj7 = profileScreenKt$ProfileScreen$5$1$7;
                }
                String str19 = str7;
                ProfileScreen(profileViewStateProfileScreen$lambda$5, str19, (Function1) ((InterfaceC21467g) obj7), c28655q2, (i26 >> 15) & 112, 0);
                AnyModal designModal4 = ProfileScreen$lambda$2(interfaceC28601c2).getDesignModal();
                zM87157i3 = c28655q2.m87157i(profileScreenEventRouter);
                Object objM87133R1115 = c28655q2.m87133R();
                obj8 = objM87133R1115;
                if (zM87157i3) {
                    ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$6 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$6);
                    obj8 = profileScreenKt$ProfileScreen$5$2$6;
                } else {
                    ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$7 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$7);
                    obj8 = profileScreenKt$ProfileScreen$5$2$7;
                }
                AbstractC0564o.m1394P(designModal4, (Function1) ((InterfaceC21467g) obj8), null, interfaceC14515a4, null, null, c28655q2, AnyModal.$stable, 52);
                C28655q c28655q6 = c28655q2;
                c28655q6.m87173q(true);
                num5 = num6;
                str5 = str8;
                num4 = num7;
                str4 = str19;
                c28655q = c28655q6;
            } else {
                c28655q2.m87138X();
                num4 = num2;
                str4 = str2;
                str5 = str3;
                num5 = num3;
                c28655q = c28655q2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(profileNavigationRouter, actionRouter, logger, str5, num5, num4, str4, abstractActivityC1340r0, i13, i14, 5);
            }
        }
        i15 |= 3072;
        str3 = str;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                num3 = num;
                if (c28655q2.m87153g(num3)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q2.m87153g(num2)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(str2)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(abstractActivityC1340r0)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                if ((i15 & 4793363) != 4793362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    if (i28 != 0) {
                        str6 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                    } else {
                        str6 = str3;
                    }
                    if (i16 != 0) {
                        num6 = null;
                    } else {
                        num6 = num3;
                    }
                    if (i18 != 0) {
                        num7 = null;
                    } else {
                        num7 = num2;
                    }
                    if (i24 != 0) {
                        str7 = null;
                    } else {
                        str7 = str2;
                    }
                    if ((57344 & i15) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((458752 & i15) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    Object objM87133R1116 = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    obj = objM87133R1116;
                    if (z15) {
                        C9811g c9811g8 = new C9811g(num6, num7, 0);
                        c28655q2.m87172p0(c9811g8);
                        obj = c9811g8;
                    } else {
                        C9811g c9811g9 = new C9811g(num6, num7, 0);
                        c28655q2.m87172p0(c9811g9);
                        obj = c9811g9;
                    }
                    interfaceC4339a = (InterfaceC4339a) obj;
                    c28655q2.m87152f0(-1688186518);
                    c26669a = C29155a.f118017b;
                    if (c26669a != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
                    zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(interfaceC4339a);
                    Object objM87133R1117 = c28655q2.m87133R();
                    if (zM87153g) {
                        InterfaceC23462h interfaceC23462hM92087G8 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                        c28655q2.m87172p0(interfaceC23462hM92087G8);
                        obj2 = interfaceC23462hM92087G8;
                    } else {
                        InterfaceC23462h interfaceC23462hM92087G9 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                        c28655q2.m87172p0(interfaceC23462hM92087G9);
                        obj2 = interfaceC23462hM92087G9;
                    }
                    c28655q2.m87173q(false);
                    interfaceC23462h = (InterfaceC23462h) obj2;
                    c28655q2.m87173q(false);
                    ProfileEvent.NavigationEvent navigationEvent5 = null;
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(ProfileScreen$lambda$1(interfaceC23462h).getViewState(), new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), null, navigationEvent5, null, 14, null), false ? 1 : 0, navigationEvent5, false ? 1 : 0, null, 61, null), null, c28655q2, 0, 2);
                    ProfileViewModel profileViewModelProfileScreen$lambda$5 = ProfileScreen$lambda$1(interfaceC23462h);
                    zM87157i = c28655q2.m87157i(interfaceC23462h);
                    Object objM87133R1118 = c28655q2.m87133R();
                    if (zM87157i) {
                        ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$8 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$8);
                        obj3 = profileScreenKt$ProfileScreen$1$8;
                    } else {
                        ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$9 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$9);
                        obj3 = profileScreenKt$ProfileScreen$1$9;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, profileViewModelProfileScreen$lambda$5);
                    Object[] objArr5 = new Object[0];
                    objM87133R = c28655q2.m87133R();
                    obj4 = objM87133R;
                    if (objM87133R == c28676v0) {
                        C8527a c8527a5 = new C8527a(10);
                        c28655q2.m87172p0(c8527a5);
                        obj4 = c8527a5;
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr5, (InterfaceC4339a) obj4, c28655q2, 48);
                    ProfileViewState.UserData userData9 = ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().getUserData();
                    Boolean boolValueOf5 = Boolean.valueOf(ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().isSelfProfile());
                    boolean zM87153g10 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(actionRouter);
                    i26 = i15;
                    if ((i15 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87153g10 | z16;
                    Object objM87133R1119 = c28655q2.m87133R();
                    if (z17) {
                        r10 = 0;
                        c28676v1 = c28676v0;
                        String str110 = str6;
                        profileActionRouter = actionRouter;
                        profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str110, interfaceC28601c1, interfaceC28601c1M87260n, null);
                        str8 = str110;
                        interfaceC28601c2 = interfaceC28601c1M87260n;
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                    } else {
                        r10 = 0;
                        c28676v1 = c28676v0;
                        String str111 = str6;
                        profileActionRouter = actionRouter;
                        profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str111, interfaceC28601c1, interfaceC28601c1M87260n, null);
                        str8 = str111;
                        interfaceC28601c2 = interfaceC28601c1M87260n;
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                    }
                    AbstractC28683x.m87254h(userData9, boolValueOf5, (InterfaceC4351m) profileScreenKt$ProfileScreen$2$1, c28655q2);
                    ProfileViewState.UserData userData10 = ProfileScreen$lambda$2(interfaceC28601c2).getMetadata().getUserData();
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(abstractActivityC1340r0);
                    Object objM87133R11110 = c28655q2.m87133R();
                    obj5 = objM87133R11110;
                    if (zM87153g2) {
                        ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$8 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$8);
                        obj5 = profileScreenKt$ProfileScreen$3$8;
                    } else {
                        ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$9 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$9);
                        obj5 = profileScreenKt$ProfileScreen$3$9;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj5, userData10);
                    c28655q2.m87152f0(-909571169);
                    c26669a2 = C29155a.f118017b;
                    if (c26669a2 != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c2 = c26669a2.f106046a.f159364d;
                    c28655q2.m87152f0(-3686552);
                    zM87153g3 = c28655q2.m87153g(r10) | c28655q2.m87153g(r10);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(false);
                    InterfaceC14515a interfaceC14515a5 = (InterfaceC14515a) objM87133R2;
                    zM87153g4 = c28655q2.m87153g(ProfileScreen$lambda$1(interfaceC23462h)) | c28655q2.m87153g(navRouter) | c28655q2.m87153g(profileActionRouter);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g4) {
                        ProfileScreenEventRouter profileScreenEventRouter9 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                        navRouter = navRouter;
                        c28655q2.m87172p0(profileScreenEventRouter9);
                        objM87133R3 = profileScreenEventRouter9;
                    } else {
                        ProfileScreenEventRouter profileScreenEventRouter10 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                        navRouter = navRouter;
                        c28655q2.m87172p0(profileScreenEventRouter10);
                        objM87133R3 = profileScreenEventRouter10;
                    }
                    profileScreenEventRouter = (ProfileScreenEventRouter) objM87133R3;
                    ProfileEvent.NavigationEvent pendingNavigation5 = ProfileScreen$lambda$2(interfaceC28601c2).getPendingNavigation();
                    zM87153g5 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(navRouter) | c28655q2.m87157i(interfaceC23462h);
                    Object objM87133R11111 = c28655q2.m87133R();
                    obj6 = objM87133R11111;
                    if (zM87153g5) {
                        ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$8 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$8);
                        obj6 = profileScreenKt$ProfileScreen$4$8;
                    } else {
                        ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$9 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$9);
                        obj6 = profileScreenKt$ProfileScreen$4$9;
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj6, pendingNavigation5);
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3407d5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                    ProfileViewState profileViewStateProfileScreen$lambda$6 = ProfileScreen$lambda$2(interfaceC28601c2);
                    zM87157i2 = c28655q2.m87157i(profileScreenEventRouter);
                    Object objM87133R11112 = c28655q2.m87133R();
                    obj7 = objM87133R11112;
                    if (zM87157i2) {
                        ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$8 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$8);
                        obj7 = profileScreenKt$ProfileScreen$5$1$8;
                    } else {
                        ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$9 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$9);
                        obj7 = profileScreenKt$ProfileScreen$5$1$9;
                    }
                    String str112 = str7;
                    ProfileScreen(profileViewStateProfileScreen$lambda$6, str112, (Function1) ((InterfaceC21467g) obj7), c28655q2, (i26 >> 15) & 112, 0);
                    AnyModal designModal5 = ProfileScreen$lambda$2(interfaceC28601c2).getDesignModal();
                    zM87157i3 = c28655q2.m87157i(profileScreenEventRouter);
                    Object objM87133R11113 = c28655q2.m87133R();
                    obj8 = objM87133R11113;
                    if (zM87157i3) {
                        ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$8 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$8);
                        obj8 = profileScreenKt$ProfileScreen$5$2$8;
                    } else {
                        ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$9 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                        c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$9);
                        obj8 = profileScreenKt$ProfileScreen$5$2$9;
                    }
                    AbstractC0564o.m1394P(designModal5, (Function1) ((InterfaceC21467g) obj8), null, interfaceC14515a5, null, null, c28655q2, AnyModal.$stable, 52);
                    C28655q c28655q7 = c28655q2;
                    c28655q7.m87173q(true);
                    num5 = num6;
                    str5 = str8;
                    num4 = num7;
                    str4 = str112;
                    c28655q = c28655q7;
                } else {
                    c28655q2.m87138X();
                    num4 = num2;
                    str4 = str2;
                    str5 = str3;
                    num5 = num3;
                    c28655q = c28655q2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2880b(profileNavigationRouter, actionRouter, logger, str5, num5, num4, str4, abstractActivityC1340r0, i13, i14, 5);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87153g(str2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(abstractActivityC1340r0)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i15 & 4793363) != 4793362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i28 != 0) {
                    str6 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                } else {
                    str6 = str3;
                }
                if (i16 != 0) {
                    num6 = null;
                } else {
                    num6 = num3;
                }
                if (i18 != 0) {
                    num7 = null;
                } else {
                    num7 = num2;
                }
                if (i24 != 0) {
                    str7 = null;
                } else {
                    str7 = str2;
                }
                if ((57344 & i15) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((458752 & i15) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                Object objM87133R11114 = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                obj = objM87133R11114;
                if (z15) {
                    C9811g c9811g10 = new C9811g(num6, num7, 0);
                    c28655q2.m87172p0(c9811g10);
                    obj = c9811g10;
                } else {
                    C9811g c9811g11 = new C9811g(num6, num7, 0);
                    c28655q2.m87172p0(c9811g11);
                    obj = c9811g11;
                }
                interfaceC4339a = (InterfaceC4339a) obj;
                c28655q2.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
                zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(interfaceC4339a);
                Object objM87133R11115 = c28655q2.m87133R();
                if (zM87153g) {
                    InterfaceC23462h interfaceC23462hM92087G10 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                    c28655q2.m87172p0(interfaceC23462hM92087G10);
                    obj2 = interfaceC23462hM92087G10;
                } else {
                    InterfaceC23462h interfaceC23462hM92087G11 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                    c28655q2.m87172p0(interfaceC23462hM92087G11);
                    obj2 = interfaceC23462hM92087G11;
                }
                c28655q2.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) obj2;
                c28655q2.m87173q(false);
                ProfileEvent.NavigationEvent navigationEvent6 = null;
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(ProfileScreen$lambda$1(interfaceC23462h).getViewState(), new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), null, navigationEvent6, null, 14, null), false ? 1 : 0, navigationEvent6, false ? 1 : 0, null, 61, null), null, c28655q2, 0, 2);
                ProfileViewModel profileViewModelProfileScreen$lambda$6 = ProfileScreen$lambda$1(interfaceC23462h);
                zM87157i = c28655q2.m87157i(interfaceC23462h);
                Object objM87133R11116 = c28655q2.m87133R();
                if (zM87157i) {
                    ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$10 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$10);
                    obj3 = profileScreenKt$ProfileScreen$1$10;
                } else {
                    ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$11 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$11);
                    obj3 = profileScreenKt$ProfileScreen$1$11;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, profileViewModelProfileScreen$lambda$6);
                Object[] objArr6 = new Object[0];
                objM87133R = c28655q2.m87133R();
                obj4 = objM87133R;
                if (objM87133R == c28676v0) {
                    C8527a c8527a6 = new C8527a(10);
                    c28655q2.m87172p0(c8527a6);
                    obj4 = c8527a6;
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr6, (InterfaceC4339a) obj4, c28655q2, 48);
                ProfileViewState.UserData userData11 = ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().getUserData();
                Boolean boolValueOf6 = Boolean.valueOf(ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().isSelfProfile());
                boolean zM87153g11 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(actionRouter);
                i26 = i15;
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87153g11 | z16;
                Object objM87133R11117 = c28655q2.m87133R();
                if (z17) {
                    r10 = 0;
                    c28676v1 = c28676v0;
                    String str113 = str6;
                    profileActionRouter = actionRouter;
                    profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str113, interfaceC28601c1, interfaceC28601c1M87260n, null);
                    str8 = str113;
                    interfaceC28601c2 = interfaceC28601c1M87260n;
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                } else {
                    r10 = 0;
                    c28676v1 = c28676v0;
                    String str114 = str6;
                    profileActionRouter = actionRouter;
                    profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str114, interfaceC28601c1, interfaceC28601c1M87260n, null);
                    str8 = str114;
                    interfaceC28601c2 = interfaceC28601c1M87260n;
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                }
                AbstractC28683x.m87254h(userData11, boolValueOf6, (InterfaceC4351m) profileScreenKt$ProfileScreen$2$1, c28655q2);
                ProfileViewState.UserData userData12 = ProfileScreen$lambda$2(interfaceC28601c2).getMetadata().getUserData();
                zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(abstractActivityC1340r0);
                Object objM87133R11118 = c28655q2.m87133R();
                obj5 = objM87133R11118;
                if (zM87153g2) {
                    ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$10 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$10);
                    obj5 = profileScreenKt$ProfileScreen$3$10;
                } else {
                    ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$11 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$11);
                    obj5 = profileScreenKt$ProfileScreen$3$11;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj5, userData12);
                c28655q2.m87152f0(-909571169);
                c26669a2 = C29155a.f118017b;
                if (c26669a2 != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c2 = c26669a2.f106046a.f159364d;
                c28655q2.m87152f0(-3686552);
                zM87153g3 = c28655q2.m87153g(r10) | c28655q2.m87153g(r10);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q2.m87173q(false);
                c28655q2.m87173q(false);
                InterfaceC14515a interfaceC14515a6 = (InterfaceC14515a) objM87133R2;
                zM87153g4 = c28655q2.m87153g(ProfileScreen$lambda$1(interfaceC23462h)) | c28655q2.m87153g(navRouter) | c28655q2.m87153g(profileActionRouter);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g4) {
                    ProfileScreenEventRouter profileScreenEventRouter11 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                    navRouter = navRouter;
                    c28655q2.m87172p0(profileScreenEventRouter11);
                    objM87133R3 = profileScreenEventRouter11;
                } else {
                    ProfileScreenEventRouter profileScreenEventRouter12 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                    navRouter = navRouter;
                    c28655q2.m87172p0(profileScreenEventRouter12);
                    objM87133R3 = profileScreenEventRouter12;
                }
                profileScreenEventRouter = (ProfileScreenEventRouter) objM87133R3;
                ProfileEvent.NavigationEvent pendingNavigation6 = ProfileScreen$lambda$2(interfaceC28601c2).getPendingNavigation();
                zM87153g5 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(navRouter) | c28655q2.m87157i(interfaceC23462h);
                Object objM87133R11119 = c28655q2.m87133R();
                obj6 = objM87133R11119;
                if (zM87153g5) {
                    ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$10 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$10);
                    obj6 = profileScreenKt$ProfileScreen$4$10;
                } else {
                    ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$11 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$11);
                    obj6 = profileScreenKt$ProfileScreen$4$11;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj6, pendingNavigation6);
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3407d6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                ProfileViewState profileViewStateProfileScreen$lambda$7 = ProfileScreen$lambda$2(interfaceC28601c2);
                zM87157i2 = c28655q2.m87157i(profileScreenEventRouter);
                Object objM87133R111110 = c28655q2.m87133R();
                obj7 = objM87133R111110;
                if (zM87157i2) {
                    ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$10 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$10);
                    obj7 = profileScreenKt$ProfileScreen$5$1$10;
                } else {
                    ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$11 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$11);
                    obj7 = profileScreenKt$ProfileScreen$5$1$11;
                }
                String str115 = str7;
                ProfileScreen(profileViewStateProfileScreen$lambda$7, str115, (Function1) ((InterfaceC21467g) obj7), c28655q2, (i26 >> 15) & 112, 0);
                AnyModal designModal6 = ProfileScreen$lambda$2(interfaceC28601c2).getDesignModal();
                zM87157i3 = c28655q2.m87157i(profileScreenEventRouter);
                Object objM87133R111111 = c28655q2.m87133R();
                obj8 = objM87133R111111;
                if (zM87157i3) {
                    ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$10 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$10);
                    obj8 = profileScreenKt$ProfileScreen$5$2$10;
                } else {
                    ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$11 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$11);
                    obj8 = profileScreenKt$ProfileScreen$5$2$11;
                }
                AbstractC0564o.m1394P(designModal6, (Function1) ((InterfaceC21467g) obj8), null, interfaceC14515a6, null, null, c28655q2, AnyModal.$stable, 52);
                C28655q c28655q8 = c28655q2;
                c28655q8.m87173q(true);
                num5 = num6;
                str5 = str8;
                num4 = num7;
                str4 = str115;
                c28655q = c28655q8;
            } else {
                c28655q2.m87138X();
                num4 = num2;
                str4 = str2;
                str5 = str3;
                num5 = num3;
                c28655q = c28655q2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(profileNavigationRouter, actionRouter, logger, str5, num5, num4, str4, abstractActivityC1340r0, i13, i14, 5);
            }
        }
        i15 |= 24576;
        num3 = num;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q2.m87153g(num2)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87153g(str2)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(abstractActivityC1340r0)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            if ((i15 & 4793363) != 4793362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i28 != 0) {
                    str6 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                } else {
                    str6 = str3;
                }
                if (i16 != 0) {
                    num6 = null;
                } else {
                    num6 = num3;
                }
                if (i18 != 0) {
                    num7 = null;
                } else {
                    num7 = num2;
                }
                if (i24 != 0) {
                    str7 = null;
                } else {
                    str7 = str2;
                }
                if ((57344 & i15) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((458752 & i15) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                Object objM87133R111112 = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                obj = objM87133R111112;
                if (z15) {
                    C9811g c9811g12 = new C9811g(num6, num7, 0);
                    c28655q2.m87172p0(c9811g12);
                    obj = c9811g12;
                } else {
                    C9811g c9811g13 = new C9811g(num6, num7, 0);
                    c28655q2.m87172p0(c9811g13);
                    obj = c9811g13;
                }
                interfaceC4339a = (InterfaceC4339a) obj;
                c28655q2.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
                zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(interfaceC4339a);
                Object objM87133R111113 = c28655q2.m87133R();
                if (zM87153g) {
                    InterfaceC23462h interfaceC23462hM92087G12 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                    c28655q2.m87172p0(interfaceC23462hM92087G12);
                    obj2 = interfaceC23462hM92087G12;
                } else {
                    InterfaceC23462h interfaceC23462hM92087G13 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                    c28655q2.m87172p0(interfaceC23462hM92087G13);
                    obj2 = interfaceC23462hM92087G13;
                }
                c28655q2.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) obj2;
                c28655q2.m87173q(false);
                ProfileEvent.NavigationEvent navigationEvent7 = null;
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(ProfileScreen$lambda$1(interfaceC23462h).getViewState(), new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), null, navigationEvent7, null, 14, null), false ? 1 : 0, navigationEvent7, false ? 1 : 0, null, 61, null), null, c28655q2, 0, 2);
                ProfileViewModel profileViewModelProfileScreen$lambda$7 = ProfileScreen$lambda$1(interfaceC23462h);
                zM87157i = c28655q2.m87157i(interfaceC23462h);
                Object objM87133R111114 = c28655q2.m87133R();
                if (zM87157i) {
                    ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$12 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$12);
                    obj3 = profileScreenKt$ProfileScreen$1$12;
                } else {
                    ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$13 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$13);
                    obj3 = profileScreenKt$ProfileScreen$1$13;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, profileViewModelProfileScreen$lambda$7);
                Object[] objArr7 = new Object[0];
                objM87133R = c28655q2.m87133R();
                obj4 = objM87133R;
                if (objM87133R == c28676v0) {
                    C8527a c8527a7 = new C8527a(10);
                    c28655q2.m87172p0(c8527a7);
                    obj4 = c8527a7;
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr7, (InterfaceC4339a) obj4, c28655q2, 48);
                ProfileViewState.UserData userData13 = ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().getUserData();
                Boolean boolValueOf7 = Boolean.valueOf(ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().isSelfProfile());
                boolean zM87153g12 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(actionRouter);
                i26 = i15;
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87153g12 | z16;
                Object objM87133R111115 = c28655q2.m87133R();
                if (z17) {
                    r10 = 0;
                    c28676v1 = c28676v0;
                    String str116 = str6;
                    profileActionRouter = actionRouter;
                    profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str116, interfaceC28601c1, interfaceC28601c1M87260n, null);
                    str8 = str116;
                    interfaceC28601c2 = interfaceC28601c1M87260n;
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                } else {
                    r10 = 0;
                    c28676v1 = c28676v0;
                    String str117 = str6;
                    profileActionRouter = actionRouter;
                    profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str117, interfaceC28601c1, interfaceC28601c1M87260n, null);
                    str8 = str117;
                    interfaceC28601c2 = interfaceC28601c1M87260n;
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
                }
                AbstractC28683x.m87254h(userData13, boolValueOf7, (InterfaceC4351m) profileScreenKt$ProfileScreen$2$1, c28655q2);
                ProfileViewState.UserData userData14 = ProfileScreen$lambda$2(interfaceC28601c2).getMetadata().getUserData();
                zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(abstractActivityC1340r0);
                Object objM87133R111116 = c28655q2.m87133R();
                obj5 = objM87133R111116;
                if (zM87153g2) {
                    ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$12 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$12);
                    obj5 = profileScreenKt$ProfileScreen$3$12;
                } else {
                    ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$13 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$13);
                    obj5 = profileScreenKt$ProfileScreen$3$13;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj5, userData14);
                c28655q2.m87152f0(-909571169);
                c26669a2 = C29155a.f118017b;
                if (c26669a2 != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c2 = c26669a2.f106046a.f159364d;
                c28655q2.m87152f0(-3686552);
                zM87153g3 = c28655q2.m87153g(r10) | c28655q2.m87153g(r10);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q2.m87173q(false);
                c28655q2.m87173q(false);
                InterfaceC14515a interfaceC14515a7 = (InterfaceC14515a) objM87133R2;
                zM87153g4 = c28655q2.m87153g(ProfileScreen$lambda$1(interfaceC23462h)) | c28655q2.m87153g(navRouter) | c28655q2.m87153g(profileActionRouter);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g4) {
                    ProfileScreenEventRouter profileScreenEventRouter13 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                    navRouter = navRouter;
                    c28655q2.m87172p0(profileScreenEventRouter13);
                    objM87133R3 = profileScreenEventRouter13;
                } else {
                    ProfileScreenEventRouter profileScreenEventRouter14 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                    navRouter = navRouter;
                    c28655q2.m87172p0(profileScreenEventRouter14);
                    objM87133R3 = profileScreenEventRouter14;
                }
                profileScreenEventRouter = (ProfileScreenEventRouter) objM87133R3;
                ProfileEvent.NavigationEvent pendingNavigation7 = ProfileScreen$lambda$2(interfaceC28601c2).getPendingNavigation();
                zM87153g5 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(navRouter) | c28655q2.m87157i(interfaceC23462h);
                Object objM87133R111117 = c28655q2.m87133R();
                obj6 = objM87133R111117;
                if (zM87153g5) {
                    ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$12 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$12);
                    obj6 = profileScreenKt$ProfileScreen$4$12;
                } else {
                    ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$13 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$13);
                    obj6 = profileScreenKt$ProfileScreen$4$13;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj6, pendingNavigation7);
                Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3407d7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                ProfileViewState profileViewStateProfileScreen$lambda$8 = ProfileScreen$lambda$2(interfaceC28601c2);
                zM87157i2 = c28655q2.m87157i(profileScreenEventRouter);
                Object objM87133R111118 = c28655q2.m87133R();
                obj7 = objM87133R111118;
                if (zM87157i2) {
                    ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$12 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$12);
                    obj7 = profileScreenKt$ProfileScreen$5$1$12;
                } else {
                    ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$13 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$13);
                    obj7 = profileScreenKt$ProfileScreen$5$1$13;
                }
                String str118 = str7;
                ProfileScreen(profileViewStateProfileScreen$lambda$8, str118, (Function1) ((InterfaceC21467g) obj7), c28655q2, (i26 >> 15) & 112, 0);
                AnyModal designModal7 = ProfileScreen$lambda$2(interfaceC28601c2).getDesignModal();
                zM87157i3 = c28655q2.m87157i(profileScreenEventRouter);
                Object objM87133R111119 = c28655q2.m87133R();
                obj8 = objM87133R111119;
                if (zM87157i3) {
                    ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$12 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$12);
                    obj8 = profileScreenKt$ProfileScreen$5$2$12;
                } else {
                    ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$13 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                    c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$13);
                    obj8 = profileScreenKt$ProfileScreen$5$2$13;
                }
                AbstractC0564o.m1394P(designModal7, (Function1) ((InterfaceC21467g) obj8), null, interfaceC14515a7, null, null, c28655q2, AnyModal.$stable, 52);
                C28655q c28655q9 = c28655q2;
                c28655q9.m87173q(true);
                num5 = num6;
                str5 = str8;
                num4 = num7;
                str4 = str118;
                c28655q = c28655q9;
            } else {
                c28655q2.m87138X();
                num4 = num2;
                str4 = str2;
                str5 = str3;
                num5 = num3;
                c28655q = c28655q2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(profileNavigationRouter, actionRouter, logger, str5, num5, num4, str4, abstractActivityC1340r0, i13, i14, 5);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q2.m87153g(str2)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q2.m87157i(abstractActivityC1340r0)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        if ((i15 & 4793363) != 4793362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i28 != 0) {
                str6 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
            } else {
                str6 = str3;
            }
            if (i16 != 0) {
                num6 = null;
            } else {
                num6 = num3;
            }
            if (i18 != 0) {
                num7 = null;
            } else {
                num7 = num2;
            }
            if (i24 != 0) {
                str7 = null;
            } else {
                str7 = str2;
            }
            if ((57344 & i15) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((458752 & i15) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            Object objM87133R1111110 = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            obj = objM87133R1111110;
            if (z15) {
                C9811g c9811g14 = new C9811g(num6, num7, 0);
                c28655q2.m87172p0(c9811g14);
                obj = c9811g14;
            } else {
                C9811g c9811g15 = new C9811g(num6, num7, 0);
                c28655q2.m87172p0(c9811g15);
                obj = c9811g15;
            }
            interfaceC4339a = (InterfaceC4339a) obj;
            c28655q2.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
            zM87153g = c28655q2.m87153g(null) | c28655q2.m87153g(interfaceC4339a);
            Object objM87133R1111111 = c28655q2.m87133R();
            if (zM87153g) {
                InterfaceC23462h interfaceC23462hM92087G14 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                c28655q2.m87172p0(interfaceC23462hM92087G14);
                obj2 = interfaceC23462hM92087G14;
            } else {
                InterfaceC23462h interfaceC23462hM92087G15 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(c38266c, null, interfaceC4339a, c21647aM114690r));
                c28655q2.m87172p0(interfaceC23462hM92087G15);
                obj2 = interfaceC23462hM92087G15;
            }
            c28655q2.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) obj2;
            c28655q2.m87173q(false);
            ProfileEvent.NavigationEvent navigationEvent8 = null;
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(ProfileScreen$lambda$1(interfaceC23462h).getViewState(), new ProfileViewState(null, new ProfileViewState.FullScreenModal(C33205o0.f138451a.m105288b(), null, navigationEvent8, null, 14, null), false ? 1 : 0, navigationEvent8, false ? 1 : 0, null, 61, null), null, c28655q2, 0, 2);
            ProfileViewModel profileViewModelProfileScreen$lambda$8 = ProfileScreen$lambda$1(interfaceC23462h);
            zM87157i = c28655q2.m87157i(interfaceC23462h);
            Object objM87133R1111112 = c28655q2.m87133R();
            if (zM87157i) {
                ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$14 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$14);
                obj3 = profileScreenKt$ProfileScreen$1$14;
            } else {
                ProfileScreenKt$ProfileScreen$1$1 profileScreenKt$ProfileScreen$1$15 = new ProfileScreenKt$ProfileScreen$1$1(interfaceC23462h, null);
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$1$15);
                obj3 = profileScreenKt$ProfileScreen$1$15;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, profileViewModelProfileScreen$lambda$8);
            Object[] objArr8 = new Object[0];
            objM87133R = c28655q2.m87133R();
            obj4 = objM87133R;
            if (objM87133R == c28676v0) {
                C8527a c8527a8 = new C8527a(10);
                c28655q2.m87172p0(c8527a8);
                obj4 = c8527a8;
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr8, (InterfaceC4339a) obj4, c28655q2, 48);
            ProfileViewState.UserData userData15 = ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().getUserData();
            Boolean boolValueOf8 = Boolean.valueOf(ProfileScreen$lambda$2(interfaceC28601c1M87260n).getMetadata().isSelfProfile());
            boolean zM87153g13 = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(actionRouter);
            i26 = i15;
            if ((i15 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zM87153g13 | z16;
            Object objM87133R1111113 = c28655q2.m87133R();
            if (z17) {
                r10 = 0;
                c28676v1 = c28676v0;
                String str119 = str6;
                profileActionRouter = actionRouter;
                profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str119, interfaceC28601c1, interfaceC28601c1M87260n, null);
                str8 = str119;
                interfaceC28601c2 = interfaceC28601c1M87260n;
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
            } else {
                r10 = 0;
                c28676v1 = c28676v0;
                String str1110 = str6;
                profileActionRouter = actionRouter;
                profileScreenKt$ProfileScreen$2$1 = new ProfileScreenKt$ProfileScreen$2$1(profileActionRouter, str1110, interfaceC28601c1, interfaceC28601c1M87260n, null);
                str8 = str1110;
                interfaceC28601c2 = interfaceC28601c1M87260n;
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$2$1);
            }
            AbstractC28683x.m87254h(userData15, boolValueOf8, (InterfaceC4351m) profileScreenKt$ProfileScreen$2$1, c28655q2);
            ProfileViewState.UserData userData16 = ProfileScreen$lambda$2(interfaceC28601c2).getMetadata().getUserData();
            zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(abstractActivityC1340r0);
            Object objM87133R1111114 = c28655q2.m87133R();
            obj5 = objM87133R1111114;
            if (zM87153g2) {
                ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$14 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$14);
                obj5 = profileScreenKt$ProfileScreen$3$14;
            } else {
                ProfileScreenKt$ProfileScreen$3$1 profileScreenKt$ProfileScreen$3$15 = new ProfileScreenKt$ProfileScreen$3$1(interfaceC28601c2, abstractActivityC1340r0, r10);
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$3$15);
                obj5 = profileScreenKt$ProfileScreen$3$15;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj5, userData16);
            c28655q2.m87152f0(-909571169);
            c26669a2 = C29155a.f118017b;
            if (c26669a2 != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c2 = c26669a2.f106046a.f159364d;
            c28655q2.m87152f0(-3686552);
            zM87153g3 = c28655q2.m87153g(r10) | c28655q2.m87153g(r10);
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g3) {
                objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = c38266c2.m122602a(r10, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), r10);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q2.m87173q(false);
            c28655q2.m87173q(false);
            InterfaceC14515a interfaceC14515a8 = (InterfaceC14515a) objM87133R2;
            zM87153g4 = c28655q2.m87153g(ProfileScreen$lambda$1(interfaceC23462h)) | c28655q2.m87153g(navRouter) | c28655q2.m87153g(profileActionRouter);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g4) {
                ProfileScreenEventRouter profileScreenEventRouter15 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                navRouter = navRouter;
                c28655q2.m87172p0(profileScreenEventRouter15);
                objM87133R3 = profileScreenEventRouter15;
            } else {
                ProfileScreenEventRouter profileScreenEventRouter16 = new ProfileScreenEventRouter(profileActionRouter, ProfileScreen$lambda$1(interfaceC23462h), navRouter, null, 8, null);
                navRouter = navRouter;
                c28655q2.m87172p0(profileScreenEventRouter16);
                objM87133R3 = profileScreenEventRouter16;
            }
            profileScreenEventRouter = (ProfileScreenEventRouter) objM87133R3;
            ProfileEvent.NavigationEvent pendingNavigation8 = ProfileScreen$lambda$2(interfaceC28601c2).getPendingNavigation();
            zM87153g5 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(navRouter) | c28655q2.m87157i(interfaceC23462h);
            Object objM87133R1111115 = c28655q2.m87133R();
            obj6 = objM87133R1111115;
            if (zM87153g5) {
                ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$14 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$14);
                obj6 = profileScreenKt$ProfileScreen$4$14;
            } else {
                ProfileScreenKt$ProfileScreen$4$1 profileScreenKt$ProfileScreen$4$15 = new ProfileScreenKt$ProfileScreen$4$1(interfaceC28601c2, navRouter, interfaceC23462h, r10);
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$4$15);
                obj6 = profileScreenKt$ProfileScreen$4$15;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj6, pendingNavigation8);
            Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3407d8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
            ProfileViewState profileViewStateProfileScreen$lambda$9 = ProfileScreen$lambda$2(interfaceC28601c2);
            zM87157i2 = c28655q2.m87157i(profileScreenEventRouter);
            Object objM87133R1111116 = c28655q2.m87133R();
            obj7 = objM87133R1111116;
            if (zM87157i2) {
                ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$14 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$14);
                obj7 = profileScreenKt$ProfileScreen$5$1$14;
            } else {
                ProfileScreenKt$ProfileScreen$5$1$1 profileScreenKt$ProfileScreen$5$1$15 = new ProfileScreenKt$ProfileScreen$5$1$1(profileScreenEventRouter);
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$1$15);
                obj7 = profileScreenKt$ProfileScreen$5$1$15;
            }
            String str1111 = str7;
            ProfileScreen(profileViewStateProfileScreen$lambda$9, str1111, (Function1) ((InterfaceC21467g) obj7), c28655q2, (i26 >> 15) & 112, 0);
            AnyModal designModal8 = ProfileScreen$lambda$2(interfaceC28601c2).getDesignModal();
            zM87157i3 = c28655q2.m87157i(profileScreenEventRouter);
            Object objM87133R1111117 = c28655q2.m87133R();
            obj8 = objM87133R1111117;
            if (zM87157i3) {
                ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$14 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$14);
                obj8 = profileScreenKt$ProfileScreen$5$2$14;
            } else {
                ProfileScreenKt$ProfileScreen$5$2$1 profileScreenKt$ProfileScreen$5$2$15 = new ProfileScreenKt$ProfileScreen$5$2$1(profileScreenEventRouter);
                c28655q2.m87172p0(profileScreenKt$ProfileScreen$5$2$15);
                obj8 = profileScreenKt$ProfileScreen$5$2$15;
            }
            AbstractC0564o.m1394P(designModal8, (Function1) ((InterfaceC21467g) obj8), null, interfaceC14515a8, null, null, c28655q2, AnyModal.$stable, 52);
            C28655q c28655q10 = c28655q2;
            c28655q10.m87173q(true);
            num5 = num6;
            str5 = str8;
            num4 = num7;
            str4 = str1111;
            c28655q = c28655q10;
        } else {
            c28655q2.m87138X();
            num4 = num2;
            str4 = str2;
            str5 = str3;
            num5 = num3;
            c28655q = c28655q2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(profileNavigationRouter, actionRouter, logger, str5, num5, num4, str4, abstractActivityC1340r0, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C34911a ProfileScreen$lambda$0$0(Integer num, Integer num2) {
        return AbstractC15751g.m44431K(num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileViewModel ProfileScreen$lambda$1(InterfaceC23462h interfaceC23462h) {
        return (ProfileViewModel) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileScreen$lambda$12(ProfileNavigationRouter profileNavigationRouter, ProfileActionRouter profileActionRouter, InterfaceC34116n interfaceC34116n, String str, Integer num, Integer num2, String str2, AbstractActivityC1340r0 abstractActivityC1340r0, int i13, int i14, Composer composer, int i15) {
        ProfileScreen(profileNavigationRouter, profileActionRouter, interfaceC34116n, str, num, num2, str2, abstractActivityC1340r0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileScreen$lambda$13$0(ProfileEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    private static final float ProfileScreen$lambda$15(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    private static final void ProfileScreen$lambda$16(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileScreen$lambda$17(ProfileViewState profileViewState, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC4339a onOpenBottomSheet, Composer composer, int i13) {
        int i14;
        InterfaceC28601c1 interfaceC28601c2;
        AbstractC22676k.m65750j(onOpenBottomSheet, "onOpenBottomSheet");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87157i(onOpenBottomSheet) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (profileViewState.getFullScreenModal() != null) {
                c28655q.m87150e0(760184063);
                ProfileFullScreenModalKt.ProfileContentAreaModal(profileViewState.getFullScreenModal(), function1, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(760415385);
                int i15 = i14;
                ProfileViewState.ScreenContent screenContent = profileViewState.getScreenContent();
                ProfileViewState.Metadata metadata = profileViewState.getMetadata();
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R = new C1910d(11, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                }
                ProfileScreenContentKt.ProfileContentArea(screenContent, metadata, function1, onOpenBottomSheet, (Function1) objM87133R, c28655q, ((i15 << 9) & 7168) | 24576, 0);
                ProfileToolbar(AbstractC1099a.m3396r(C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x), 0.0f, ((float) 1.5d) * 8, 1), profileViewState, function1, ProfileScreen$lambda$15(interfaceC28601c2), c28655q, 0, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileScreen$lambda$17$0$0$0(InterfaceC28601c1 interfaceC28601c1, float f13) {
        ProfileScreen$lambda$16(interfaceC28601c1, f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileScreen$lambda$19(ProfileViewState profileViewState, String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        ProfileScreen(profileViewState, str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileViewState ProfileScreen$lambda$2(InterfaceC28670t2 interfaceC28670t2) {
        return (ProfileViewState) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC28601c1 ProfileScreen$lambda$4$0() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ProfileScreen$lambda$5(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProfileScreen$lambda$6(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    /* JADX WARN: Code duplicated, block: B:54:0x011f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0140  */
    /* JADX WARN: Code duplicated, block: B:62:0x0168  */
    /* JADX WARN: Code duplicated, block: B:63:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:81:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x0200  */
    /* JADX WARN: Code duplicated, block: B:86:0x0217  */
    /* JADX WARN: Code duplicated, block: B:89:0x0267  */
    /* JADX WARN: Code duplicated, block: B:90:0x0269  */
    /* JADX WARN: Code duplicated, block: B:95:0x0274  */
    /* JADX WARN: Code duplicated, block: B:97:0x029b  */
    public static final void ProfileToolbar(Modifier modifier, ProfileViewState viewState, Function1 onEvent, float f13, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        float f14;
        boolean z4;
        float f15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        float f16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        AbstractC22403o entitlementImage;
        C37816b c37816bM121344e;
        boolean z13;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1518018086);
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                f14 = f13;
                i15 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                if (i17 != 0) {
                    f16 = 0.0f;
                } else {
                    f16 = f14;
                }
                float fM36283m = AbstractC12889b.m36283m((f16 - 0.0f) / 200.0f, 0.0f, 1.0f);
                long jM51517e = AbstractC17918w0.m51517e(4280824633L);
                long jM51518f = AbstractC17918w0.m51518f(C17919x.m51547i(jM51517e) * fM36283m, C17919x.m51546h(jM51517e) * fM36283m, C17919x.m51544f(jM51517e) * fM36283m, fM36283m, 16);
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                c28655q.m87150e0(1473518234);
                WeakHashMap weakHashMap = C22944c2.f90553v;
                float fMo733e0 = interfaceC39171c.mo733e0(C22949e.m66712e(c28655q).f90560g.m66705e().f151450b);
                c28655q.m87173q(false);
                float f17 = (float) (((double) fMo733e0) * 1.5d);
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC22953f.m66725n(AbstractC1102d.m3409f(1.0f, modifier2)), 0.0f, -f17, 1), jM51518f, AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                Modifier modifier3 = modifier2;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f17, c2314t));
                entitlementImage = viewState.getMetadata().getEntitlementImage();
                c37816bM121344e = null;
                if (entitlementImage != null || !viewState.getMetadata().isSelfProfile()) {
                    entitlementImage = null;
                }
                if (!viewState.getMetadata().isSelfProfile() && viewState.getMetadata().getShowSettingsButton()) {
                    c28655q.m87150e0(-1202577319);
                    c37816bM121344e = AbstractC37817c.m121344e(479439012, c28655q, new C9812h(onEvent, 0));
                    c28655q.m87173q(false);
                } else if (entitlementImage != null) {
                    c28655q.m87150e0(-1202456388);
                    c37816bM121344e = AbstractC37817c.m121344e(225557915, c28655q, new C0003a0(18, entitlementImage, onEvent));
                    c28655q.m87173q(false);
                } else if (viewState.getMetadata().isSelfProfile()) {
                    c28655q.m87150e0(-1202194625);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1202299342);
                    c37816bM121344e = AbstractC37817c.m121344e(873785372, c28655q, new C9812h(onEvent, 1));
                    c28655q.m87173q(false);
                }
                C37816b c37816b = c37816bM121344e;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_title)), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, c37816b, null, null, null, null, null, null, 65010, null);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C9813i(onEvent, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(modifierM3409f, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier2 = modifier3;
                f15 = f16;
            } else {
                c28655q.m87138X();
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9814j(modifier2, viewState, onEvent, f15, i13, i14, 0);
            }
        }
        i15 |= 3072;
        f14 = f13;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            if (i17 != 0) {
                f16 = 0.0f;
            } else {
                f16 = f14;
            }
            float fM36283m2 = AbstractC12889b.m36283m((f16 - 0.0f) / 200.0f, 0.0f, 1.0f);
            long jM51517e2 = AbstractC17918w0.m51517e(4280824633L);
            long jM51518f2 = AbstractC17918w0.m51518f(C17919x.m51547i(jM51517e2) * fM36283m2, C17919x.m51546h(jM51517e2) * fM36283m2, C17919x.m51544f(jM51517e2) * fM36283m2, fM36283m2, 16);
            InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            c28655q.m87150e0(1473518234);
            WeakHashMap weakHashMap2 = C22944c2.f90553v;
            float fMo733e1 = interfaceC39171c2.mo733e0(C22949e.m66712e(c28655q).f90560g.m66705e().f151450b);
            c28655q.m87173q(false);
            float f18 = (float) (((double) fMo733e1) * 1.5d);
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1099a.m3392n(AbstractC22953f.m66725n(AbstractC1102d.m3409f(1.0f, modifier2)), 0.0f, -f18, 1), jM51518f2, AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            Modifier modifier4 = modifier2;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t));
            entitlementImage = viewState.getMetadata().getEntitlementImage();
            c37816bM121344e = null;
            if (entitlementImage != null) {
                entitlementImage = null;
            } else {
                entitlementImage = null;
            }
            if (!viewState.getMetadata().isSelfProfile()) {
                if (entitlementImage != null) {
                    c28655q.m87150e0(-1202456388);
                    c37816bM121344e = AbstractC37817c.m121344e(225557915, c28655q, new C0003a0(18, entitlementImage, onEvent));
                    c28655q.m87173q(false);
                } else if (viewState.getMetadata().isSelfProfile()) {
                    c28655q.m87150e0(-1202299342);
                    c37816bM121344e = AbstractC37817c.m121344e(873785372, c28655q, new C9812h(onEvent, 1));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1202194625);
                    c28655q.m87173q(false);
                }
            } else if (entitlementImage != null) {
                c28655q.m87150e0(-1202456388);
                c37816bM121344e = AbstractC37817c.m121344e(225557915, c28655q, new C0003a0(18, entitlementImage, onEvent));
                c28655q.m87173q(false);
            } else if (viewState.getMetadata().isSelfProfile()) {
                c28655q.m87150e0(-1202299342);
                c37816bM121344e = AbstractC37817c.m121344e(873785372, c28655q, new C9812h(onEvent, 1));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1202194625);
                c28655q.m87173q(false);
            }
            C37816b c37816b2 = c37816bM121344e;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_title)), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, c37816b2, null, null, null, null, null, null, 65010, null);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C9813i(onEvent, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C9813i(onEvent, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3409f2, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier2 = modifier4;
            f15 = f16;
        } else {
            c28655q.m87138X();
            f15 = f14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9814j(modifier2, viewState, onEvent, f15, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileToolbar$lambda$1$0$1(Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            SettingsIcon(function1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileToolbar$lambda$1$0$2(AbstractC22403o abstractC22403o, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            EntitlementLogo(abstractC22403o, function1, c28655q, AbstractC22403o.f87638a);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileToolbar$lambda$1$0$3(Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            ProfileOverflowMenu(function1, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileToolbar$lambda$1$0$4$0(Function1 function1) {
        function1.invoke(ProfileEvent.GoBack.INSTANCE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileToolbar$lambda$2(Modifier modifier, ProfileViewState profileViewState, Function1 function1, float f13, int i13, int i14, Composer composer, int i15) {
        ProfileToolbar(modifier, profileViewState, function1, f13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    private static final void SettingsIcon(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-867640472);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3419p = AbstractC1102d.m3419p(TOOLBAR_ICON_TOUCH_AREA_SIZE, C2314t.f9131w);
            C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.SETTINGS.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_settings_content_description);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3189a(function1, 29);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3419p, null, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k | 384, 8);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 SettingsIcon$lambda$0$0(Function1 function1) {
        function1.invoke(new ProfileEvent.AppDrivenNavigation(NavigateToSettingsViewState.INSTANCE));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 SettingsIcon$lambda$1(Function1 function1, int i13, Composer composer, int i14) {
        SettingsIcon(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final Modifier entitlementImageEffect(Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return AbstractC37056f.m118997u(modifier, new C4785h(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier entitlementImageEffect$lambda$0(Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1013748162);
        float f13 = ((float) 0.75d) * 8;
        Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC31061c.m95629e(composed, 2, 4, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack30()), f13, f13);
        c28655q.m87173q(false);
        return modifierM3395q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileMembershipAnalyticsProperties toMembershipAnalyticsProperties(ProfileViewState.MembershipData membershipData) {
        return new ProfileMembershipAnalyticsProperties(membershipData.getFollowingState(), membershipData.getCommunityVisible(), membershipData.getAgeVisible(), membershipData.getLocationVisible());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x0123  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void ProfileScreen(ProfileViewState viewState, String str, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        String str3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        int i18;
        String str4;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        ProfileViewState.ProfileDialogState popUpDialog;
        FeatureFlagChecker featureFlagChecker;
        String str5;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1752397811);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i19 != 0) {
                        str4 = null;
                        i18 = i16;
                    } else {
                        i18 = i16;
                        str4 = str2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C6498i(21);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC3855a.m11831o(0.0f, c28655q);
                    }
                    ProfileBottomSheetKt.ProfileBottomSheet(viewState, AbstractC37817c.m121344e(932962730, c28655q, new C0542f((Object) viewState, function4, objM87133R, 8)), c28655q, (i15 & 14) | 48);
                    popUpDialog = viewState.getPopUpDialog();
                    if (popUpDialog == null) {
                        c28655q.m87150e0(357191816);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(357191817);
                        ProfileReportDialog(popUpDialog, function4, c28655q, (i15 >> 3) & 112);
                        c28655q.m87173q(false);
                    }
                    featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                    if (str4 != null) {
                        c28655q.m87150e0(357408848);
                        AbstractC24936d.m73080z(str4, null, false, null, null, null, null, c28655q, (i15 >> 3) & 14, 126);
                        str5 = str4;
                        c28655q.m87173q(false);
                    } else {
                        str5 = str4;
                        if (featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PROFILE_ACHIEVEMENTS_OVERLAY)) {
                            c28655q.m87150e0(357548999);
                            AbstractC24936d.m73080z("OVERLAY_ACHIEVEMENTS_PROFILE", null, false, null, null, null, null, c28655q, 0, 126);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(357648943);
                            c28655q.m87173q(false);
                        }
                    }
                    function3 = function4;
                    str3 = str5;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4007d1(viewState, str3, function3, i13, i14, 17);
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
                if (i19 != 0) {
                    str4 = null;
                    i18 = i16;
                } else {
                    i18 = i16;
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C6498i(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC3855a.m11831o(0.0f, c28655q);
                }
                ProfileBottomSheetKt.ProfileBottomSheet(viewState, AbstractC37817c.m121344e(932962730, c28655q, new C0542f((Object) viewState, function4, objM87133R, 8)), c28655q, (i15 & 14) | 48);
                popUpDialog = viewState.getPopUpDialog();
                if (popUpDialog == null) {
                    c28655q.m87150e0(357191816);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(357191817);
                    ProfileReportDialog(popUpDialog, function4, c28655q, (i15 >> 3) & 112);
                    c28655q.m87173q(false);
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                if (str4 != null) {
                    c28655q.m87150e0(357408848);
                    AbstractC24936d.m73080z(str4, null, false, null, null, null, null, c28655q, (i15 >> 3) & 14, 126);
                    str5 = str4;
                    c28655q.m87173q(false);
                } else {
                    str5 = str4;
                    if (featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PROFILE_ACHIEVEMENTS_OVERLAY)) {
                        c28655q.m87150e0(357548999);
                        AbstractC24936d.m73080z("OVERLAY_ACHIEVEMENTS_PROFILE", null, false, null, null, null, null, c28655q, 0, 126);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(357648943);
                        c28655q.m87173q(false);
                    }
                }
                function3 = function4;
                str3 = str5;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(viewState, str3, function3, i13, i14, 17);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    str4 = null;
                    i18 = i16;
                } else {
                    i18 = i16;
                    str4 = str2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C6498i(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC3855a.m11831o(0.0f, c28655q);
                }
                ProfileBottomSheetKt.ProfileBottomSheet(viewState, AbstractC37817c.m121344e(932962730, c28655q, new C0542f((Object) viewState, function4, objM87133R, 8)), c28655q, (i15 & 14) | 48);
                popUpDialog = viewState.getPopUpDialog();
                if (popUpDialog == null) {
                    c28655q.m87150e0(357191816);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(357191817);
                    ProfileReportDialog(popUpDialog, function4, c28655q, (i15 >> 3) & 112);
                    c28655q.m87173q(false);
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                if (str4 != null) {
                    c28655q.m87150e0(357408848);
                    AbstractC24936d.m73080z(str4, null, false, null, null, null, null, c28655q, (i15 >> 3) & 14, 126);
                    str5 = str4;
                    c28655q.m87173q(false);
                } else {
                    str5 = str4;
                    if (featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PROFILE_ACHIEVEMENTS_OVERLAY)) {
                        c28655q.m87150e0(357548999);
                        AbstractC24936d.m73080z("OVERLAY_ACHIEVEMENTS_PROFILE", null, false, null, null, null, null, c28655q, 0, 126);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(357648943);
                        c28655q.m87173q(false);
                    }
                }
                function3 = function4;
                str3 = str5;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(viewState, str3, function3, i13, i14, 17);
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
            if (i19 != 0) {
                str4 = null;
                i18 = i16;
            } else {
                i18 = i16;
                str4 = str2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C6498i(21);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC3855a.m11831o(0.0f, c28655q);
            }
            ProfileBottomSheetKt.ProfileBottomSheet(viewState, AbstractC37817c.m121344e(932962730, c28655q, new C0542f((Object) viewState, function4, objM87133R, 8)), c28655q, (i15 & 14) | 48);
            popUpDialog = viewState.getPopUpDialog();
            if (popUpDialog == null) {
                c28655q.m87150e0(357191816);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(357191817);
                ProfileReportDialog(popUpDialog, function4, c28655q, (i15 >> 3) & 112);
                c28655q.m87173q(false);
            }
            featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            if (str4 != null) {
                c28655q.m87150e0(357408848);
                AbstractC24936d.m73080z(str4, null, false, null, null, null, null, c28655q, (i15 >> 3) & 14, 126);
                str5 = str4;
                c28655q.m87173q(false);
            } else {
                str5 = str4;
                if (featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.PROFILE_ACHIEVEMENTS_OVERLAY)) {
                    c28655q.m87150e0(357548999);
                    AbstractC24936d.m73080z("OVERLAY_ACHIEVEMENTS_PROFILE", null, false, null, null, null, null, c28655q, 0, 126);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(357648943);
                    c28655q.m87173q(false);
                }
            }
            function3 = function4;
            str3 = str5;
        } else {
            c28655q.m87138X();
            str3 = str2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(viewState, str3, function3, i13, i14, 17);
        }
    }
}
