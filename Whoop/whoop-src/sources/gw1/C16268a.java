package gw1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.membership.extensions.domain.models.CtaAction;
import com.whoop.membership.extensions.domain.models.ExtensionsV2LandingOption;
import com.whoop.membership.extensions.domain.models.ExtensionsV2LandingResponse;
import com.whoop.membership.extensions.domain.models.NativeOrderDetails;
import com.whoop.membership.extensions.domain.models.NativeOrderResponse;
import com.whoop.membership.extensions.domain.models.OrderRequestBodyReactivations;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import com.whoop.membership.extensions.domain.models.ProgressContentType;
import com.whoop.membership.extensions.domain.models.ReactivationUpsellLandingResponse;
import com.whoop.membership.extensions.domain.models.ReactivationUpsellSegment;
import com.whoop.membership.extensions.domain.models.SectionItems;
import com.whoop.membership.management.domain.models.ManageMembershipScreenResponse;
import com.whoop.membership.management.domain.models.MembershipAdjustmentCheckoutScreenBody;
import com.whoop.membership.management.domain.models.MembershipAdjustmentCheckoutScreenResponse;
import com.whoop.membership.management.domain.models.MembershipManagementScreenResponse;
import com.whoop.membership.management.domain.models.ScreenSection;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudyDto;
import gy2.C16282a;
import gz0.AbstractC16306j;
import h00.AbstractC16495c0;
import l83.C23454a0;
import p180h0.AbstractC16486z0;
import p390p1.C28596b0;

/* JADX INFO: renamed from: gw1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16268a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61877w;

    public /* synthetic */ C16268a(int i13) {
        this.f61877w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f61877w) {
            case 0:
                return CtaAction._init_$_anonymous_();
            case 1:
                return ExtensionsV2LandingOption._childSerializers$_anonymous_();
            case 2:
                return ExtensionsV2LandingOption._childSerializers$_anonymous_$0();
            case 3:
                return ExtensionsV2LandingResponse._childSerializers$_anonymous_();
            case 4:
                return NativeOrderDetails._childSerializers$_anonymous_();
            case 5:
                return NativeOrderResponse._childSerializers$_anonymous_();
            case 6:
                return OrderRequestBodyReactivations._childSerializers$_anonymous_();
            case 7:
                return ProgressContent._childSerializers$_anonymous_();
            case 8:
                return ProgressContent._childSerializers$_anonymous_$0();
            case 9:
                return ProgressContentType._init_$_anonymous_();
            case 10:
                return ReactivationUpsellLandingResponse._childSerializers$_anonymous_();
            case 11:
                return ReactivationUpsellSegment._childSerializers$_anonymous_();
            case 12:
                return SectionItems._childSerializers$_anonymous_();
            case 13:
                return ManageMembershipScreenResponse._childSerializers$_anonymous_();
            case 14:
                return MembershipAdjustmentCheckoutScreenBody._childSerializers$_anonymous_();
            case 15:
                return MembershipAdjustmentCheckoutScreenResponse._childSerializers$_anonymous_();
            case 16:
                return MembershipManagementScreenResponse._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ScreenSection._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return WhoopLabsStudyDto._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return WhoopLabsStudyDto._childSerializers$_anonymous_$0();
            case 20:
                return WhoopLabsStudyDto._childSerializers$_anonymous_$1();
            case 21:
                return C16282a.m46105o();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC16306j.m46253E();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC16306j.m46282x();
            case 24:
                return AbstractC16306j.m46278t();
            case 25:
                return AbstractC16306j.m46250B();
            case 26:
                return GlowStyle._init_$_anonymous_();
            case 27:
                float f13 = AbstractC16486z0.f63358a;
                return C23454a0.f92919a;
            case 28:
                float f14 = AbstractC16486z0.f63358a;
                return Boolean.TRUE;
            default:
                C28596b0 c28596b0 = AbstractC16495c0.f63391a;
                return null;
        }
    }
}
