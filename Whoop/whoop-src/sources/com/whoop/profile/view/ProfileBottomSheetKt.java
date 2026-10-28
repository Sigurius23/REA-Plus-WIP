package com.whoop.profile.view;

import a01.C0084d;
import a41.C0373i;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2476a1;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import bz0.C3713c;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.C8527a;
import com.whoop.profile.C9691R;
import com.whoop.profile.presentation.ProfileViewState;
import dp0.C12253i;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.C25235a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/profile/presentation/ProfileViewState;", "viewState", "Lkotlin/Function1;", "Lkotlin/Function0;", "Ll83/a0;", "bodyContent", "ProfileBottomSheet", "(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;", "bottomSheetData", "ProfileBottomSheetContent", "(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Landroidx/compose/runtime/Composer;I)V", "ProfileBottomSheetContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileBottomSheetKt {
    public static final void ProfileBottomSheet(ProfileViewState viewState, Function3 bodyContent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(bodyContent, "bodyContent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1123805265);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(bodyContent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
            Object objM87133R = c28655q.m87133R();
            Object obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            ProfileViewState.MembershipData membershipData = viewState.getMetadata().getMembershipData();
            ProfileViewState.BottomSheet bottomSheet = membershipData != null ? membershipData.getBottomSheet() : null;
            if (bottomSheet != null) {
                c28655q.m87150e0(-12088454);
                C35666g c35666g = new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null);
                AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
                boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == obj) {
                    objM87133R2 = new C3196h(interfaceC2994c0, c15199y3M3460c, 3);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC35660d.m112871m(null, c35666g, aVar, null, (InterfaceC4339a) objM87133R2, null, null, AbstractC37817c.m121344e(2075673314, c28655q, new C2476a1(bottomSheet, 5)), false, null, null, null, false, null, AbstractC37817c.m121344e(357005990, c28655q, new C0084d(bodyContent, interfaceC2994c0, c15199y3M3460c, 10)), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16233);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-11472856);
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = new C8527a(7);
                    c28655q.m87172p0(objM87133R3);
                }
                bodyContent.invoke((InterfaceC4339a) objM87133R3, c28655q, Integer.valueOf((i14 & 112) | 6));
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(viewState, bodyContent, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileBottomSheet$lambda$0$0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new ProfileBottomSheetKt$ProfileBottomSheet$1$1$1(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileBottomSheet$lambda$1(ProfileViewState.BottomSheet bottomSheet, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            ProfileBottomSheetContent(bottomSheet, c28655q, AbstractC22403o.f87638a);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileBottomSheet$lambda$2(Function3 function3, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C3196h(interfaceC2994c0, c15199y3, 2);
                c28655q.m87172p0(objM87133R);
            }
            function3.invoke((InterfaceC4339a) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileBottomSheet$lambda$2$0$0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new ProfileBottomSheetKt$ProfileBottomSheet$3$1$1$1(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileBottomSheet$lambda$4(ProfileViewState profileViewState, Function3 function3, int i13, Composer composer, int i14) {
        ProfileBottomSheet(profileViewState, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProfileBottomSheetContent(ProfileViewState.BottomSheet bottomSheet, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-207489227);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(bottomSheet) : c28655q.m87157i(bottomSheet) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC22403o image = bottomSheet.getImage();
            C2314t c2314t = C2314t.f9131w;
            if (image == null) {
                c28655q.m87150e0(-853500379);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-853500378);
                float f13 = 4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a, 3), AbstractC30060g.m92103Y(c28655q, C9691R.string.profile_bottom_sheet_icon_content_description), AbstractC1102d.m3419p(12 * f13, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 24960, 104);
                c28655q = c28655q;
                AbstractC31061c.m95650z(f13, f13, c2314t, c28655q, false);
            }
            String title = bottomSheet.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i15).getH4();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C36775k c36775k = new C36775k(3);
            int i16 = C2886a.f11498d << 18;
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(title, null, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q2, 0, i16, 196090);
            float f14 = 4;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(2 * f14, c2314t));
            AbstractC30795n.m94707h(bottomSheet.getSubtitle(), null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB2(), null, c28655q2, 0, i16, 196090);
            c28655q = c28655q2;
            AbstractC18489d0.m53380u(6, f14, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(bottomSheet, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileBottomSheetContent$lambda$1(ProfileViewState.BottomSheet bottomSheet, int i13, Composer composer, int i14) {
        ProfileBottomSheetContent(bottomSheet, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    public static final void ProfileBottomSheetContentPreview(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(284794337);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new InterfaceC4351m() { // from class: com.whoop.profile.view.ProfileBottomSheetKt$ProfileBottomSheetContentPreview$$inlined$WhoopPreviewTheme$1
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
                    c28655q2.m87150e0(1530767334);
                    float f13 = 8;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC15673b0.m44010T(AbstractC1102d.m3409f(1.0f, C2314t.f9131w)), 2 * f13, 4 * f13);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
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
                    ProfileBottomSheetKt.ProfileBottomSheetContent(new ProfileViewState.BottomSheet(new AbstractC22403o.a(AbstractC16272a.f61906D0), "Special Feature", "This is a generic bottom sheet that can be used to display additional information about any profile feature."), c28655q2, AbstractC22403o.f87638a);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                }
            }), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 ProfileBottomSheetContentPreview$lambda$1(int i13, Composer composer, int i14) {
        ProfileBottomSheetContentPreview(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
