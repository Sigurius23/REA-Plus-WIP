package r70;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.activation.domain.models.steps.PlanOption;
import com.whoop.activation.domain.models.steps.PrivacyConsentModel;
import com.whoop.activation.domain.models.steps.RafHowItWorksInstructionModel;
import com.whoop.activation.domain.models.steps.RafHowItWorksModel;
import com.whoop.activation.domain.models.steps.ReferAFriendCodesModel;
import com.whoop.activation.domain.models.steps.StateSelectionStepModel;
import com.whoop.activation.domain.models.steps.TrialOfferCheckoutModel;
import com.whoop.activation.domain.models.steps.TrialPlanOption;
import com.whoop.activation.domain.models.steps.TrialPlanPickerModel;
import com.whoop.activation.domain.models.steps.UniversalPaymentMethodStepModel;
import com.whoop.activation.domain.models.steps.UpcycleJoinTodayModel;
import com.whoop.activation.domain.models.steps.UpcyclePlanPickerModel;
import com.whoop.activation.domain.models.steps.WelcomeTransitionStepModel;
import com.whoop.design.atomic.organism.horizontalscrollcontainer.HorizontalScrollBehavior;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.StateBindingDeserializerKt;
import p459rf.C31353x;
import r71.AbstractC31052b;
import r90.AbstractC31101h;
import rb1.AbstractC31191a;

/* JADX INFO: renamed from: r70.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C31050b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128033w;

    public /* synthetic */ C31050b(int i13) {
        this.f128033w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f128033w) {
            case 0:
                return PlanOption._childSerializers$_anonymous_$0();
            case 1:
                return PrivacyConsentModel._childSerializers$_anonymous_();
            case 2:
                return PrivacyConsentModel._childSerializers$_anonymous_$0();
            case 3:
                return PrivacyConsentModel._childSerializers$_anonymous_$1();
            case 4:
                return RafHowItWorksInstructionModel._childSerializers$_anonymous_();
            case 5:
                return RafHowItWorksModel._childSerializers$_anonymous_();
            case 6:
                return ReferAFriendCodesModel._childSerializers$_anonymous_();
            case 7:
                return ReferAFriendCodesModel._childSerializers$_anonymous_$0();
            case 8:
                return StateSelectionStepModel._childSerializers$_anonymous_();
            case 9:
                return TrialOfferCheckoutModel._childSerializers$_anonymous_();
            case 10:
                return TrialPlanOption._childSerializers$_anonymous_();
            case 11:
                return TrialPlanOption._childSerializers$_anonymous_$0();
            case 12:
                return TrialPlanPickerModel._childSerializers$_anonymous_();
            case 13:
                return TrialPlanPickerModel._childSerializers$_anonymous_$0();
            case 14:
                return UniversalPaymentMethodStepModel._childSerializers$_anonymous_();
            case 15:
                return UniversalPaymentMethodStepModel._childSerializers$_anonymous_$0();
            case 16:
                return UpcycleJoinTodayModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return UpcyclePlanPickerModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return UpcyclePlanPickerModel._childSerializers$_anonymous_$0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return WelcomeTransitionStepModel._childSerializers$_anonymous_();
            case 20:
                return HorizontalScrollBehavior._init_$_anonymous_();
            case 21:
                return Boolean.valueOf(AbstractC31052b.m95592s());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC31052b.m95593t();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC31101h.m95831l();
            case 24:
                return AbstractC31101h.m95832m();
            case 25:
                return AbstractC31101h.m95838s();
            case 26:
                return AggregateBinding._childSerializers$_anonymous_();
            case 27:
                return StateBindingDeserializerKt.stateBindingJson_delegate$lambda$0();
            case 28:
                return AbstractC31191a.m96131f();
            default:
                int i13 = C31353x.f128998c;
                return "request cancelled";
        }
    }
}
