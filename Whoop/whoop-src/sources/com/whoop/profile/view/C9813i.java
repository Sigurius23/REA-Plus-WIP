package com.whoop.profile.view;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.membership.view.upcycle.AbstractC9145b;
import com.whoop.profile.view.edit.EditProfileContentKt;
import com.whoop.profile.view.edit.avatar.AvatarEditBottomSheetContentKt;
import d62.AbstractC11741g;
import db0.AbstractC11887c;
import dc0.AbstractC11903e;
import do0.AbstractC12230d;
import eg2.AbstractC13176i;
import eg2.AbstractC13177j;
import ej1.AbstractC13252o;
import p705ea2.AbstractC12911i0;
import p706eo0.AbstractC13376g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.profile.view.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9813i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28563w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f28564x;

    public /* synthetic */ C9813i(Function1 function1, int i13) {
        this.f28563w = i13;
        this.f28564x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f28563w) {
            case 0:
                return ProfileScreenKt.ProfileToolbar$lambda$1$0$4$0(this.f28564x);
            case 1:
                return EditProfileContentKt.EditProfileMainContent$lambda$2$0(this.f28564x);
            case 2:
                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$14$0(this.f28564x);
            case 3:
                return p703ct1.Function1.m30064y(this.f28564x);
            case 4:
                return p703ct1.Function1.m30065z(this.f28564x);
            case 5:
                return p703ct1.Function1.m30051l(this.f28564x);
            case 6:
                return AbstractC9145b.m22883p(this.f28564x);
            case 7:
                return AbstractC9145b.m22880m(this.f28564x);
            case 8:
                return AbstractC11741g.m31429z(this.f28564x);
            case 9:
                return AbstractC11887c.m31874I(this.f28564x);
            case 10:
                return AbstractC11887c.m31885T(this.f28564x);
            case 11:
                return AbstractC11903e.m32039t(this.f28564x);
            case 12:
                return AbstractC12230d.m34011r(this.f28564x);
            case 13:
                return AbstractC12230d.m34014u(this.f28564x);
            case 14:
                return AbstractC12911i0.m36319k(this.f28564x);
            case 15:
                return AbstractC12911i0.m36320l(this.f28564x);
            case 16:
                return AbstractC12911i0.m36321m(this.f28564x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC13176i.m36944B(this.f28564x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13176i.m36963U(this.f28564x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC13176i.m36950H(this.f28564x);
            case 20:
                return AbstractC13177j.m37003K(this.f28564x);
            case 21:
                return AbstractC13177j.m37010R(this.f28564x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC13177j.m36995C(this.f28564x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC13252o.m37247j(this.f28564x);
            case 24:
                return AbstractC13376g.m37700V(this.f28564x);
            case 25:
                return AbstractC13376g.m37701W(this.f28564x);
            case 26:
                return AbstractC13376g.m37682D(this.f28564x);
            case 27:
                return AbstractC13376g.m37702X(this.f28564x);
            case 28:
                return AbstractC13376g.m37696R(this.f28564x);
            default:
                return AbstractC13376g.m37697S(this.f28564x);
        }
    }
}
