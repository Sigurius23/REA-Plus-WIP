package eb1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.feature.galleri.models.HorizontalImagePagerModel;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.ConsentAction;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.ConsentType;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentRequest;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentResponse;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.AdvanceLabsUpdateTestsStickyModel;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.UpdateTestsDialogModel;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.UpdateTestsModels;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.UpdateTestsSectionModel;
import com.whoop.design.models.items.whooprow.WhoopRowItemModel;
import com.whoop.design.models.items.whooprow.WhoopRowModel;
import com.whoop.gifting.feature.gifted.domain.models.GiftedModels;
import com.whoop.gifting.feature.gifted.domain.models.GiftedSectionModel;
import com.whoop.gifting.feature.gifted.domain.models.GiftedStickyModel;
import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsOfUseRequest;
import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsOfUseResponse;
import com.whoop.shepherd.feature.terms.domain.models.SupportedRegionPicker;
import eg2.AbstractC13172e;
import eg2.AbstractC13176i;
import eg2.AbstractC13177j;

/* JADX INFO: renamed from: eb1.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C13005a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44960w;

    public /* synthetic */ C13005a(int i13) {
        this.f44960w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f44960w) {
            case 0:
                return WhoopRowItemModel._childSerializers$_anonymous_();
            case 1:
                return WhoopRowModel._childSerializers$_anonymous_();
            case 2:
                return WhoopRowModel._childSerializers$_anonymous_$0();
            case 3:
                return WhoopRowModel._childSerializers$_anonymous_$1();
            case 4:
                return WhoopRowModel._childSerializers$_anonymous_$2();
            case 5:
                return WhoopRowModel._childSerializers$_anonymous_$3();
            case 6:
                return WhoopRowModel._childSerializers$_anonymous_$4();
            case 7:
                return HorizontalImagePagerModel._childSerializers$_anonymous_();
            case 8:
                return ConsentAction._init_$_anonymous_();
            case 9:
                return ConsentType._init_$_anonymous_();
            case 10:
                return MultiConsentRequest._childSerializers$_anonymous_();
            case 11:
                return MultiConsentResponse._childSerializers$_anonymous_();
            case 12:
                return MultiConsentResponse._childSerializers$_anonymous_$0();
            case 13:
                return ShepherdTermsOfUseRequest._childSerializers$_anonymous_();
            case 14:
                return ShepherdTermsOfUseResponse._childSerializers$_anonymous_();
            case 15:
                return ShepherdTermsOfUseResponse._childSerializers$_anonymous_$0();
            case 16:
                return SupportedRegionPicker._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AdvanceLabsUpdateTestsStickyModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return UpdateTestsDialogModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return UpdateTestsModels._childSerializers$_anonymous_();
            case 20:
                return UpdateTestsModels._childSerializers$_anonymous_$0();
            case 21:
                return UpdateTestsSectionModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC13172e.m36936h();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC13172e.m36940l();
            case 24:
                return AbstractC13176i.m36947E();
            case 25:
                return AbstractC13177j.m37041x();
            case 26:
                return GiftedModels._childSerializers$_anonymous_();
            case 27:
                return GiftedModels._childSerializers$_anonymous_$0();
            case 28:
                return GiftedSectionModel._childSerializers$_anonymous_();
            default:
                return GiftedStickyModel._childSerializers$_anonymous_();
        }
    }
}
