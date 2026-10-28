package ih1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.home.view.HomeFragment;
import com.whoop.stress.domain.model.BreathType;
import com.whoop.stress.domain.model.HoldingFrame;
import com.whoop.stress.domain.model.MetaData;
import com.whoop.stress.domain.model.StressCalendar;
import com.whoop.stress.domain.model.StressCustomizationDrawer;
import com.whoop.stress.domain.model.StressCustomizationOptions;
import com.whoop.stress.domain.model.StressInstruction;
import com.whoop.stress.domain.model.StressIntervention;
import com.whoop.stress.domain.model.StressInterventionFrame;
import com.whoop.stress.domain.model.StressMonitorDto;
import com.whoop.stress.domain.model.StressTrend;
import com.whoop.stress.domain.model.StressTrendSegment;
import com.whoop.stress.domain.model.StressTrendStat;
import com.whoop.stress.domain.model.StressTrendStatKey;
import com.whoop.stress.domain.model.StressTrendType;
import ih2.AbstractC18527b;
import io.getstream.chat.android.client.ChatClient;
import l83.C23454a0;
import p710im1.AbstractC18669f0;
import p710im1.AbstractC18672h;

/* JADX INFO: renamed from: ih1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C18518b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72155w;

    public /* synthetic */ C18518b(int i13) {
        this.f72155w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f72155w) {
            case 0:
                return C18519c.m53638e();
            case 1:
                return AbstractC18524h.m53675p();
            case 2:
                return AbstractC18527b.m53709J();
            case 3:
                return BreathType._init_$_anonymous_();
            case 4:
                return HoldingFrame._childSerializers$_anonymous_();
            case 5:
                return MetaData._childSerializers$_anonymous_();
            case 6:
                return StressCalendar._childSerializers$_anonymous_();
            case 7:
                return StressCustomizationDrawer._childSerializers$_anonymous_();
            case 8:
                return StressCustomizationOptions._childSerializers$_anonymous_();
            case 9:
                return StressInstruction._childSerializers$_anonymous_();
            case 10:
                return StressIntervention._childSerializers$_anonymous_();
            case 11:
                return StressInterventionFrame._childSerializers$_anonymous_();
            case 12:
                return StressInterventionFrame._childSerializers$_anonymous_$0();
            case 13:
                return StressMonitorDto._childSerializers$_anonymous_();
            case 14:
                return StressMonitorDto._childSerializers$_anonymous_$0();
            case 15:
                return StressTrend._childSerializers$_anonymous_();
            case 16:
                return StressTrend._childSerializers$_anonymous_$0();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return StressTrend._childSerializers$_anonymous_$1();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return StressTrendSegment._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return StressTrendStat._childSerializers$_anonymous_();
            case 20:
                return StressTrendStatKey._init_$_anonymous_();
            case 21:
                return StressTrendType._init_$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC18672h.m54209h();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return HomeFragment.m21879z2();
            case 24:
                return HomeFragment.m21712A2();
            case 25:
                return HomeFragment.m21716B2();
            case 26:
                return AbstractC18669f0.m54195f();
            case 27:
                return AbstractC18669f0.m54196g();
            case 28:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                return C23454a0.f92919a;
            default:
                ChatClient.Companion companion2 = ChatClient.INSTANCE;
                return 295158983;
        }
    }
}
