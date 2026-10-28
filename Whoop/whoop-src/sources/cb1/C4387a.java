package cb1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.archv2.model.template.BackBehavior;
import com.whoop.archv2.model.template.BackgroundModel;
import com.whoop.archv2.model.template.FillMode;
import com.whoop.archv2.model.template.FlowStep;
import com.whoop.archv2.model.template.FlowStepTransition;
import com.whoop.archv2.model.template.FlowTemplate;
import com.whoop.archv2.model.template.HorizontalAlignment;
import com.whoop.archv2.model.template.ListTemplate;
import com.whoop.archv2.model.template.MetaData;
import com.whoop.archv2.model.template.NavigationTemplate;
import com.whoop.archv2.model.template.PaginatedListResponse;
import com.whoop.design.models.items.secondaryactionbutton.SecondaryActionButtonModel;
import com.whoop.sleep.coach.data.network.model.sleepSchedule.AlarmScheduleListDto;
import com.whoop.sleep.coach.data.network.model.sleepSchedule.SleepScheduleDto;
import p702ch0.AbstractC4609c0;
import p702ch0.AbstractC4610c1;
import p702ch0.AbstractC4646q0;
import p702ch0.Function1;

/* JADX INFO: renamed from: cb1.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4387a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17727w;

    public /* synthetic */ C4387a(int i13) {
        this.f17727w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f17727w) {
            case 0:
                return SecondaryActionButtonModel._childSerializers$_anonymous_();
            case 1:
                return AlarmScheduleListDto._childSerializers$_anonymous_();
            case 2:
                return AlarmScheduleListDto._childSerializers$_anonymous_$0();
            case 3:
                return AlarmScheduleListDto._childSerializers$_anonymous_$1();
            case 4:
                return SleepScheduleDto._childSerializers$_anonymous_();
            case 5:
                return null;
            case 6:
                return AbstractC4609c0.m14292J();
            case 7:
                return Function1.m14393B();
            case 8:
                return Function1.m14417Z();
            case 9:
                return AbstractC4646q0.m14597l();
            case 10:
                return AbstractC4610c1.m14335F();
            case 11:
                return BackBehavior._init_$_anonymous_();
            case 12:
                return BackgroundModel._childSerializers$_anonymous_();
            case 13:
                return FillMode._init_$_anonymous_();
            case 14:
                return FlowStep._childSerializers$_anonymous_();
            case 15:
                return FlowStep._childSerializers$_anonymous_$0();
            case 16:
                return FlowStep._childSerializers$_anonymous_$1();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return FlowStep._childSerializers$_anonymous_$2();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return FlowStep._childSerializers$_anonymous_$3();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return FlowStep._childSerializers$_anonymous_$4();
            case 20:
                return FlowStepTransition._init_$_anonymous_();
            case 21:
                return FlowTemplate._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return FlowTemplate._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return FlowTemplate._childSerializers$_anonymous_$1();
            case 24:
                return HorizontalAlignment._init_$_anonymous_();
            case 25:
                return ListTemplate._childSerializers$_anonymous_();
            case 26:
                return ListTemplate._childSerializers$_anonymous_$0();
            case 27:
                return MetaData._childSerializers$_anonymous_();
            case 28:
                return NavigationTemplate._childSerializers$_anonymous_();
            default:
                return PaginatedListResponse._childSerializers$_anonymous_();
        }
    }
}
