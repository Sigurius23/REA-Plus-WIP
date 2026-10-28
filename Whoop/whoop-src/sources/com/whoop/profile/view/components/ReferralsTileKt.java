package com.whoop.profile.view.components;

import a80.C0545i;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.C9691R;
import dp0.C12253i;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import i91.AbstractC18249c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.C25235a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import ny0.EnumC27243c;
import ny0.EnumC27272p;
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
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p734sl0.C32627j2;
import p739ui0.C35015q;
import pf.AbstractC29125c;
import pp2.C29451o;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import so2.C32848f;
import te0.AbstractC33745d;
import v01.C35509k;
import v31.C35608d;
import v41.C35658c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010 \u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010\u001f\"\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'\"\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'\"\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/profile/view/components/ReferralsTileViewState;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "ReferralsTile", "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/ReferralsTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;", "header", "ReferralsTileHeader", "(Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/profile/view/components/ReferredListViewState;", "referredList", "ReferredListSection", "(Lcom/whoop/profile/view/components/ReferredListViewState;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/profile/view/components/ReferredMemberViewState;", "member", "ReferredMemberItem", "(Lcom/whoop/profile/view/components/ReferredMemberViewState;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;", "footer", "ReferralsTileFooter", "(Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;Landroidx/compose/runtime/Composer;I)V", "Lny0/h;", "button", "ReferralsTileButton", "(Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReferralsTilePreview", "(Landroidx/compose/runtime/Composer;I)V", "ReferralsTileFontScalingPreview", "Lkd1/o$a;", "sampleRoundedImage", "Lkd1/o$a;", "sampleReferralsTileWithActiveReferrals", "Lcom/whoop/profile/view/components/ReferralsTileViewState;", "getSampleReferralsTileWithActiveReferrals", "()Lcom/whoop/profile/view/components/ReferralsTileViewState;", "sampleReferralsTileStartReferring", "getSampleReferralsTileStartReferring", "sampleReferralsTileMinimal", "getSampleReferralsTileMinimal", "sampleReferralsTileWithSingleReferral", "getSampleReferralsTileWithSingleReferral", "", "sampleReferralsTileViewStates", "Ljava/util/List;", "getSampleReferralsTileViewStates", "()Ljava/util/List;", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ReferralsTileKt {
    private static final ReferralsTileViewState sampleReferralsTileMinimal;
    private static final ReferralsTileViewState sampleReferralsTileStartReferring;
    private static final List<ReferralsTileViewState> sampleReferralsTileViewStates;
    private static final ReferralsTileViewState sampleReferralsTileWithActiveReferrals;
    private static final ReferralsTileViewState sampleReferralsTileWithSingleReferral;
    private static final AbstractC22403o.a sampleRoundedImage;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC11895b.m31985d(C38072d.f163053a));
        sampleRoundedImage = aVar;
        ReferralsTileHeaderViewState referralsTileHeaderViewState = new ReferralsTileHeaderViewState("Past Referrals", "It's official. You're in the top 50% of referrers.", 4, aVar);
        int i13 = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        String str2 = null;
        String str3 = "+1 more friend referred";
        ReferredListViewState referredListViewState = new ReferredListViewState(str2, AbstractC37056f.m118959K(new ReferredMemberViewState("Johann Miller", aVar, C9691R.drawable.design_ic_completed_checkmark, str, i13, defaultConstructorMarker), new ReferredMemberViewState("Alli Butler", aVar, C9691R.drawable.design_ic_completed_checkmark, str, i13, defaultConstructorMarker), new ReferredMemberViewState("Casey Stephens", aVar, C9691R.drawable.design_ic_pending_checkmark, "Pending")), str3, 1, null);
        ReferralsTileFooterViewState referralsTileFooterViewState = new ReferralsTileFooterViewState("+$50 in cash", "Keep growing the WHOOP community. For each successful referral, you earn a reward.");
        TextResource textResourceM21278l = AbstractC8693b.m21278l("SEND INVITES");
        EnumC27272p enumC27272p = EnumC27272p.HIGHLIGHT;
        Object[] objArr = 0 == true ? 1 : 0;
        EnumC16313m0 enumC16313m0 = null;
        String str4 = null;
        EnumC27243c enumC27243c = null;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        String str5 = null;
        C9598e c9598e = null;
        ReferralsTileViewState referralsTileViewState = new ReferralsTileViewState(str5, referralsTileHeaderViewState, referredListViewState, referralsTileFooterViewState, new C27256h(textResourceM21278l, enumC16313m0, AbstractC18249c.m52570h(AbstractC15673b0.m43989I0()), objArr2, objArr3, str4, enumC27272p, new C9598e(null, objArr, null, 7, null), null, null, null, null, null, false, true, null, false, false, null, null, null, enumC27243c, null, null, null, 33529658, null), c9598e, 33, null);
        sampleReferralsTileWithActiveReferrals = referralsTileViewState;
        ReferralsTileHeaderViewState referralsTileHeaderViewState2 = new ReferralsTileHeaderViewState("Start Referring, Start Earning", "Make your first referral official. They get 1 month free, WHOOP device included.", 0, aVar);
        ReferralsTileFooterViewState referralsTileFooterViewState2 = new ReferralsTileFooterViewState("+$50 in cash", "Plus, you get rewarded when they become a member.");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("SEND INVITES");
        C9598e c9598e2 = new C9598e(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        int i14 = 33529658;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z4 = true;
        String str6 = null;
        boolean z13 = false;
        boolean z14 = false;
        InterfaceC21430b interfaceC21430b = null;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        String str7 = null;
        ReferralsTileViewState referralsTileViewState2 = new ReferralsTileViewState(str7, referralsTileHeaderViewState2, 0 == true ? 1 : 0, referralsTileFooterViewState2, new C27256h(textResourceM21278l2, objArr4, AbstractC18249c.m52570h(AbstractC15673b0.m43989I0()), objArr6, null, null, enumC27272p, c9598e2, objArr7, null, objArr8, null, null, false, z4, str6, z13, z14, 0 == true ? 1 : 0, enumC27243c, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC21430b, objArr5, i14, defaultConstructorMarker2), 0 == true ? 1 : 0, 37, defaultConstructorMarker3);
        sampleReferralsTileStartReferring = referralsTileViewState2;
        Object[] objArr9 = 0 == true ? 1 : 0;
        ReferralsTileViewState referralsTileViewState3 = new ReferralsTileViewState(str7, new ReferralsTileHeaderViewState("Past Referrals", "Virgil is in the top 50% of referrers.", 4, aVar), objArr9, null, null, 0 == true ? 1 : 0, 45, defaultConstructorMarker3);
        sampleReferralsTileMinimal = referralsTileViewState3;
        ReferralsTileHeaderViewState referralsTileHeaderViewState3 = new ReferralsTileHeaderViewState("Single Referral", "You have one successful referral.", 1, aVar);
        String str8 = null;
        String str9 = null;
        ReferredListViewState referredListViewState2 = new ReferredListViewState(str8, AbstractC37056f.m118958J(new ReferredMemberViewState("Alex Johnson", aVar, C9691R.drawable.design_ic_completed_checkmark, null, 8, null)), str9, 5, null);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("SEND INVITES");
        C9598e c9598e3 = new C9598e(null, null, null, 7, null);
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        String str10 = null;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        ReferralsTileViewState referralsTileViewState4 = new ReferralsTileViewState(str10, referralsTileHeaderViewState3, referredListViewState2, objArr20, new C27256h(textResourceM21278l3, null, AbstractC18249c.m52570h(AbstractC15673b0.m43989I0()), objArr11, null, null, enumC27272p, c9598e3, null, objArr17, objArr18, objArr16, null, false, z4, str6, z13, z14, objArr12, enumC27243c, objArr13, objArr14, objArr15, interfaceC21430b, objArr10, i14, defaultConstructorMarker2), objArr19, 41, null);
        sampleReferralsTileWithSingleReferral = referralsTileViewState4;
        sampleReferralsTileViewStates = AbstractC37056f.m118959K(referralsTileViewState3, referralsTileViewState2, referralsTileViewState4, referralsTileViewState);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void ReferralsTile(Modifier modifier, ReferralsTileViewState viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(477080664);
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
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35509k(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
                zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C35015q(viewState, function4, 9);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC31926e.m99375j(AbstractC1772c1.m5391i(modifierM3409f, false, null, (InterfaceC4339a) objM87133R, 3), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent(), null, null, null, 0.0f, AbstractC37817c.m121344e(-798046520, c28655q, new C29451o(18, viewState, function4)), c28655q, 12582912, 122);
                function3 = function4;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(modifier2, viewState, function3, i13, i14, 3);
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
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35509k(13);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier3);
            zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C35015q(viewState, function4, 9);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C35015q(viewState, function4, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC31926e.m99375j(AbstractC1772c1.m5391i(modifierM3409f2, false, null, (InterfaceC4339a) objM87133R, 3), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent(), null, null, null, 0.0f, AbstractC37817c.m121344e(-798046520, c28655q, new C29451o(18, viewState, function4)), c28655q, 12582912, 122);
            function3 = function4;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(modifier2, viewState, function3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferralsTile$lambda$0$0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferralsTile$lambda$1$0(ReferralsTileViewState referralsTileViewState, Function1 function1) {
        C9598e destination = referralsTileViewState.getDestination();
        if (destination != null) {
            function1.invoke(destination);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferralsTile$lambda$2(ReferralsTileViewState referralsTileViewState, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1092a.m3357b(AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), C17919x.m51541c(0.05f, C17919x.f69629f), AbstractC17918w0.f69621a), AbstractC15673b0.m43997M0(), null, 0.0f, 6));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            ReferralsTileHeader(referralsTileViewState.getHeader(), c28655q, AbstractC22403o.f87638a);
            if (referralsTileViewState.getReferredList() == null && referralsTileViewState.getFooter() == null && referralsTileViewState.getButton() == null) {
                c28655q.m87150e0(-2065772976);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2065965610);
                float f15 = 1;
                AbstractC15751g.m44449b(AbstractC1099a.m3398t(c2314t, 0.0f, f15 * f13, 0.0f, 0.0f, 13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), f15, 0.0f, c28655q, 390, 8);
                c28655q.m87173q(false);
            }
            ReferredListViewState referredList = referralsTileViewState.getReferredList();
            if (referredList == null) {
                c28655q.m87150e0(-2065728678);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2065728677);
                float f16 = 1 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                ReferredListSection(referredList, c28655q, 0);
                AbstractC30007c.m91851u(c2314t, f16, c28655q, false);
            }
            ReferralsTileFooterViewState footer = referralsTileViewState.getFooter();
            if (footer == null) {
                c28655q.m87150e0(-2065487963);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2065487962);
                AbstractC11266d.m30469w((float) 0.5d, f13, c2314t, c28655q);
                ReferralsTileFooter(footer, c28655q, 0);
                c28655q.m87173q(false);
            }
            C27256h button = referralsTileViewState.getButton();
            if (button == null) {
                c28655q.m87150e0(-2065318951);
                c28655q.m87173q(false);
            } else {
                AbstractC33745d.m106667z(c28655q, -2065318950, c2314t, f14, c28655q);
                ReferralsTileButton(button, function1, c28655q, C27256h.f109055z);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferralsTile$lambda$3(Modifier modifier, ReferralsTileViewState referralsTileViewState, Function1 function1, int i13, int i14, Composer composer, int i15) {
        ReferralsTile(modifier, referralsTileViewState, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    private static final void ReferralsTileButton(C27256h c27256h, Function1 function1, Composer composer, int i13) {
        int i14;
        C27256h c27256h2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1702440788);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c27256h) : c28655q.m87157i(c27256h) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            boolean z4 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c27256h))) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C0545i(c27256h, function1, 13);
                c28655q.m87172p0(objM87133R);
            }
            c27256h2 = c27256h;
            AbstractC27249e.m82121d(modifierM3409f, c27256h2, null, (InterfaceC4339a) objM87133R, c28655q, (C27256h.f109055z << 3) | 6 | ((i14 << 3) & 112), 4);
        } else {
            c27256h2 = c27256h;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(c27256h2, function1, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferralsTileButton$lambda$0$0(C27256h c27256h, Function1 function1) {
        function1.invoke(c27256h.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferralsTileButton$lambda$1(C27256h c27256h, Function1 function1, int i13, Composer composer, int i14) {
        ReferralsTileButton(c27256h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void ReferralsTileFontScalingPreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-861607538);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.components.ReferralsTileKt$ReferralsTileFontScalingPreview$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    List<ReferredMemberViewState> referredMembers;
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(-1344615725);
                    float f13 = 2 * 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q2, 6);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
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
                    c28655q2.m87150e0(397219245);
                    List<ReferralsTileViewState> sampleReferralsTileViewStates2 = ReferralsTileKt.getSampleReferralsTileViewStates();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : sampleReferralsTileViewStates2) {
                        ReferralsTileViewState referralsTileViewState = (ReferralsTileViewState) obj;
                        ReferredListViewState referredList = referralsTileViewState.getReferredList();
                        int size = (referredList == null || (referredMembers = referredList.getReferredMembers()) == null) ? 0 : referredMembers.size();
                        if ((referralsTileViewState.getReferredList() == null && referralsTileViewState.getButton() == null) || size > 1) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ReferralsTileKt.ReferralsTile(null, (ReferralsTileViewState) it.next(), null, c28655q2, 0, 5);
                    }
                    AbstractC25012a.m73392y(c28655q2, false, true, false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferralsTileFontScalingPreview$lambda$1(int i13, Composer composer, int i14) {
        ReferralsTileFontScalingPreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    private static final void ReferralsTileFooter(ReferralsTileFooterViewState referralsTileFooterViewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1165602380);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(referralsTileFooterViewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f13 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            String title = referralsTileFooterViewState.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8421b = c38072d.m121952e(c28655q, i15).getB2();
            long jM125385c1 = c38072d.m121949b(c28655q, i15).getWhite70();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(title, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, 0, i16, 196602);
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC11895b.m31987f(2, 4, c2314t, c38072d.m121949b(c28655q, i15).getBlack20()), ((float) 1.5d) * f13, ((float) 0.5d) * f13);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            AbstractC30795n.m94707h(referralsTileFooterViewState.getTag(), AbstractC15673b0.m44061s(c2314t, AbstractC15673b0.m43989I0()), c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getN7(), null, c28655q, 0, i16, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(referralsTileFooterViewState, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferralsTileFooter$lambda$1(ReferralsTileFooterViewState referralsTileFooterViewState, int i13, Composer composer, int i14) {
        ReferralsTileFooter(referralsTileFooterViewState, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    private static final void ReferralsTileHeader(ReferralsTileHeaderViewState referralsTileHeaderViewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1399378384);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(referralsTileHeaderViewState) : c28655q.m87157i(referralsTileHeaderViewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 1 * f13, 7);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            Modifier modifierM3419p = AbstractC1102d.m3419p(18 * 4, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3419p);
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
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(referralsTileHeaderViewState.getReferralsImg(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            String strValueOf = String.valueOf(referralsTileHeaderViewState.getReferralsCount());
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8443x = c38072d.m121952e(c28655q, i15).getN3();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            long jM95626b = AbstractC31061c.m95626b(C39183o.m124805c(c38072d.m121952e(c28655q, i15).getN3().getStyle().f92255a.f92192b), 4294967296L, (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h));
            Modifier modifierM44061s = AbstractC15673b0.m44061s(C1100b.f4583a.mo3400a(c2314t, C2299e.f9103F), AbstractC15673b0.m43989I0());
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strValueOf, modifierM44061s, jM125430y, jM95626b, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8443x, null, c28655q, 0, i16, 196592);
            c28655q.m87173q(true);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC30795n.m94707h(referralsTileHeaderViewState.getTitle(), null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196602);
            AbstractC30795n.m94707h(referralsTileHeaderViewState.getSubtitle(), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 0, i16, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(referralsTileHeaderViewState, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferralsTileHeader$lambda$1(ReferralsTileHeaderViewState referralsTileHeaderViewState, int i13, Composer composer, int i14) {
        ReferralsTileHeader(referralsTileHeaderViewState, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void ReferralsTilePreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1391889850);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.components.ReferralsTileKt$ReferralsTilePreview$$inlined$WhoopPreviewTheme$1
                @Override // c93.InterfaceC4351m
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C23454a0.f92919a;
                }

                public final void invoke(Composer composer2, int i14) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
                        c28655q2.m87138X();
                        return;
                    }
                    c28655q2.m87150e0(-28646064);
                    float f13 = 2 * 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q2, 6);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
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
                    c28655q2.m87150e0(1291375925);
                    Iterator<T> it = ReferralsTileKt.getSampleReferralsTileViewStates().iterator();
                    while (it.hasNext()) {
                        ReferralsTileKt.ReferralsTile(null, (ReferralsTileViewState) it.next(), null, c28655q2, 0, 5);
                    }
                    AbstractC25012a.m73392y(c28655q2, false, true, false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferralsTilePreview$lambda$1(int i13, Composer composer, int i14) {
        ReferralsTilePreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    private static final void ReferredListSection(ReferredListViewState referredListViewState, Composer composer, int i13) {
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(852804659);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(referredListViewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f13 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(223656545);
            Iterator<T> it = referredListViewState.getReferredMembers().iterator();
            while (it.hasNext()) {
                ReferredMemberItem((ReferredMemberViewState) it.next(), c28655q, AbstractC22403o.f87638a);
            }
            c28655q.m87173q(false);
            String additionalReferralDisplay = referredListViewState.getAdditionalReferralDisplay();
            if (additionalReferralDisplay == null) {
                c28655q.m87150e0(-1656458440);
                c28655q.m87173q(false);
                z4 = true;
            } else {
                c28655q.m87150e0(-1656458439);
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                z4 = true;
                AbstractC30795n.m94707h(additionalReferralDisplay, AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f13, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(referredListViewState, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferredListSection$lambda$1(ReferredListViewState referredListViewState, int i13, Composer composer, int i14) {
        ReferredListSection(referredListViewState, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    private static final void ReferredMemberItem(ReferredMemberViewState referredMemberViewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(246364843);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(referredMemberViewState) : c28655q.m87157i(referredMemberViewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f13 = 8;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(((float) 1.5d) * f13), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            float f14 = 4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(referredMemberViewState.getAvatar(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13 * f14, c2314t), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String name = referredMemberViewState.getName();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8421b = c38072d.m121952e(c28655q, i15).getB2();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            int i16 = (C2886a.f11498d << 18) | 3120;
            AbstractC30795n.m94707h(name, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM8421b, null, c28655q, 0, i16, 186362);
            C28655q c28655q2 = c28655q;
            String subtitle = referredMemberViewState.getSubtitle();
            if (subtitle == null) {
                c28655q2.m87150e0(1823597799);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1823597800);
                AbstractC30795n.m94707h(subtitle, null, c38072d.m121949b(c28655q2, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q2, i15).getB3(), null, c28655q2, 0, i16, 186362);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            C28655q c28655q3 = c28655q2;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(referredMemberViewState.getEndIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(5 * f14, c2314t), C17919x.f69637n, c28655q3, 3504, 0);
            c28655q = c28655q3;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(referredMemberViewState, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ReferredMemberItem$lambda$1(ReferredMemberViewState referredMemberViewState, int i13, Composer composer, int i14) {
        ReferredMemberItem(referredMemberViewState, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final ReferralsTileViewState getSampleReferralsTileMinimal() {
        return sampleReferralsTileMinimal;
    }

    public static final ReferralsTileViewState getSampleReferralsTileStartReferring() {
        return sampleReferralsTileStartReferring;
    }

    public static final List<ReferralsTileViewState> getSampleReferralsTileViewStates() {
        return sampleReferralsTileViewStates;
    }

    public static final ReferralsTileViewState getSampleReferralsTileWithActiveReferrals() {
        return sampleReferralsTileWithActiveReferrals;
    }

    public static final ReferralsTileViewState getSampleReferralsTileWithSingleReferral() {
        return sampleReferralsTileWithSingleReferral;
    }
}
