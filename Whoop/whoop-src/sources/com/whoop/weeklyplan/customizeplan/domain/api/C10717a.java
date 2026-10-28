package com.whoop.weeklyplan.customizeplan.domain.api;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.whoopaction.domain.models.ActionSequenceAction;
import com.whoop.whoopaction.domain.models.AuthAction;
import com.whoop.whoopaction.domain.models.AuthOperation;
import com.whoop.whoopaction.domain.models.CacheControlModel;
import com.whoop.whoopaction.domain.models.DismissModalAction;
import com.whoop.whoopaction.domain.models.LoadingTreatment;
import com.whoop.whoopaction.domain.models.PermissionParameters;
import com.whoop.whoopaction.domain.models.PermissionType;
import com.whoop.whoopaction.domain.models.PickMediaParameters;
import com.whoop.whoopaction.domain.models.RefreshScopeAction;
import com.whoop.whoopaction.domain.models.ReloadAction;
import com.whoop.whoopaction.domain.models.ReloadMode;
import com.whoop.whoopaction.domain.models.StateClearAction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import com.whoop.whoopaction.domain.models.UnknownAction;
import com.whoop.whoopaction.domain.models.UpdateAction;
import cp0.AbstractC10986p;

/* JADX INFO: renamed from: com.whoop.weeklyplan.customizeplan.domain.api.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C10717a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f32670w;

    public /* synthetic */ C10717a(int i13) {
        this.f32670w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f32670w) {
            case 0:
                return TargetGoalType._init_$_anonymous_();
            case 1:
                return ToggleContent._childSerializers$_anonymous_();
            case 2:
                return ToggleContent._childSerializers$_anonymous_$0();
            case 3:
                return ToggleContentV2._childSerializers$_anonymous_();
            case 4:
                return ToggleContentV2._childSerializers$_anonymous_$0();
            case 5:
                return WeeklyPlanCustomizationResponse._childSerializers$_anonymous_();
            case 6:
                return WeeklyPlanCustomizationResponseKotlinx._childSerializers$_anonymous_();
            case 7:
                return WeeklyPlanCustomizationScreenModel._childSerializers$_anonymous_();
            case 8:
                return WeeklyPlanCustomizationScreenModelV2._childSerializers$_anonymous_();
            case 9:
                return ActionSequenceAction._childSerializers$_anonymous_();
            case 10:
                return AuthAction._childSerializers$_anonymous_();
            case 11:
                return AuthAction._childSerializers$_anonymous_$0();
            case 12:
                return AuthOperation._init_$_anonymous_();
            case 13:
                return CacheControlModel._childSerializers$_anonymous_();
            case 14:
                return DismissModalAction._init_$_anonymous_();
            case 15:
                return LoadingTreatment._childSerializers$_anonymous_();
            case 16:
                return PermissionParameters._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return PermissionParameters._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return PermissionType._init_$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return PickMediaParameters._childSerializers$_anonymous_();
            case 20:
                return RefreshScopeAction._childSerializers$_anonymous_();
            case 21:
                return ReloadAction._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ReloadMode._init_$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return StateClearAction._childSerializers$_anonymous_();
            case 24:
                return StateUpdateAction._childSerializers$_anonymous_();
            case 25:
                return UnknownAction._init_$_anonymous_();
            case 26:
                return UpdateAction._childSerializers$_anonymous_();
            case 27:
                return UpdateAction._childSerializers$_anonymous_$0();
            case 28:
                return AbstractC10986p.m29330v();
            default:
                return AbstractC10986p.m29299G();
        }
    }
}
