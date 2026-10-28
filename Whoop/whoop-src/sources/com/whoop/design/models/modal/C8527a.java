package com.whoop.design.models.modal;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.domain.model.LeadersDto;
import com.whoop.domain.model.RouteSummaryDto;
import com.whoop.domain.model.UserNotificationSettingsDto;
import com.whoop.membership.returns.domain.models.Instruction;
import com.whoop.membership.returns.domain.models.ReturnResponse;
import com.whoop.profile.view.ProfileScreenKt;
import com.whoop.profile.view.memberlevels.MemberLevelsFragment;
import com.whoop.weeklyplan.customizeplan.domain.api.BottomButton;
import com.whoop.weeklyplan.customizeplan.domain.api.BottomButtonV2;
import com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.SavePresetPlan;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContentV2;
import l83.C23454a0;

/* JADX INFO: renamed from: com.whoop.design.models.modal.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C8527a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25842w;

    public /* synthetic */ C8527a(int i13) {
        this.f25842w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f25842w) {
            case 0:
                return UnknownModal._init_$_anonymous_();
            case 1:
                return LeadersDto._childSerializers$_anonymous_();
            case 2:
                return RouteSummaryDto._childSerializers$_anonymous_();
            case 3:
                return UserNotificationSettingsDto._childSerializers$_anonymous_();
            case 4:
                return Instruction._childSerializers$_anonymous_();
            case 5:
                return ReturnResponse._childSerializers$_anonymous_();
            case 6:
                return ReturnResponse._childSerializers$_anonymous_$0();
            case 7:
                return C23454a0.f92919a;
            case 8:
                return C23454a0.f92919a;
            case 9:
                return C23454a0.f92919a;
            case 10:
                return ProfileScreenKt.ProfileScreen$lambda$4$0();
            case 11:
                return C23454a0.f92919a;
            case 12:
                return C23454a0.f92919a;
            case 13:
                return C23454a0.f92919a;
            case 14:
                return C23454a0.f92919a;
            case 15:
                return C23454a0.f92919a;
            case 16:
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return MemberLevelsFragment.adapter_delegate$lambda$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return BottomButton._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return BottomButtonV2._childSerializers$_anonymous_();
            case 20:
                return ConfirmTarget._init_$_anonymous_();
            case 21:
                return ConfirmTarget.ConfirmActivityTarget._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ConfirmTarget.ConfirmBehaviorTarget._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ConfirmTarget.ConfirmMetricTarget._childSerializers$_anonymous_();
            case 24:
                return SavePresetPlan._childSerializers$_anonymous_();
            case 25:
                return SavePresetPlan._childSerializers$_anonymous_$0();
            case 26:
                return SavePresetPlan._childSerializers$_anonymous_$1();
            case 27:
                return SavePresetPlan._childSerializers$_anonymous_$2();
            case 28:
                return SliderContent._childSerializers$_anonymous_();
            default:
                return SliderContentV2._childSerializers$_anonymous_();
        }
    }
}
