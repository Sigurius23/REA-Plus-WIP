package jx2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.access.circumference.models.CircumferenceModel;
import com.whoop.referafriend.domain.models.BasicRafStyle;
import com.whoop.referafriend.domain.models.RafHowItWorksModel;
import com.whoop.referafriend.domain.models.RafHubCTA;
import com.whoop.referafriend.domain.models.RafHubType;
import com.whoop.referafriend.domain.models.TrialsTutorialModel;
import com.whoop.service.network.model.DefaultImages;
import com.whoop.service.network.model.PasswordRequirementsResponse;
import com.whoop.service.network.model.ReplacementStatus;
import com.whoop.service.network.model.RestoreBffModel;
import com.whoop.startactivity.goals.CollapsibleToggleContainerModel;
import com.whoop.startactivity.goals.StartActivityTargetsMiniArch;
import kc2.AbstractC22352b;
import kf0.AbstractC22431f;
import kf0.AbstractC22433h;
import p714k80.AbstractC22273b;
import p714k80.AbstractC22284m;
import p714k80.AbstractC22287p;
import p714k80.AbstractC22290s;

/* JADX INFO: renamed from: jx2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22038b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85471w;

    public /* synthetic */ C22038b(int i13) {
        this.f85471w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f85471w) {
            case 0:
                return AbstractC22042f.m63028I();
            case 1:
                return CircumferenceModel._childSerializers$_anonymous_();
            case 2:
                return CircumferenceModel._childSerializers$_anonymous_$0();
            case 3:
                return BasicRafStyle._init_$_anonymous_();
            case 4:
                return RafHowItWorksModel._childSerializers$_anonymous_();
            case 5:
                return RafHubCTA._childSerializers$_anonymous_();
            case 6:
                return RafHubType._init_$_anonymous_();
            case 7:
                return RafHubType.Basic._childSerializers$_anonymous_();
            case 8:
                return RafHubType.Trials._childSerializers$_anonymous_();
            case 9:
                return TrialsTutorialModel._childSerializers$_anonymous_();
            case 10:
                return AbstractC22273b.m64000d();
            case 11:
                return AbstractC22284m.m64017e();
            case 12:
                return AbstractC22287p.m64028e();
            case 13:
                return AbstractC22290s.m64040d();
            case 14:
                return DefaultImages._childSerializers$_anonymous_();
            case 15:
                return DefaultImages._childSerializers$_anonymous_$0();
            case 16:
                return PasswordRequirementsResponse._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ReplacementStatus._init_$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return RestoreBffModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return RestoreBffModel._childSerializers$_anonymous_$0();
            case 20:
                return AbstractC22352b.m64247e();
            case 21:
                return AbstractC22431f.m64678w();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22431f.m64647V();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC22433h.m64706s();
            case 24:
                return CollapsibleToggleContainerModel._childSerializers$_anonymous_();
            case 25:
                return CollapsibleToggleContainerModel._childSerializers$_anonymous_$0();
            case 26:
                return CollapsibleToggleContainerModel._childSerializers$_anonymous_$1();
            case 27:
                return CollapsibleToggleContainerModel.Badge._childSerializers$_anonymous_();
            case 28:
                return StartActivityTargetsMiniArch._childSerializers$_anonymous_();
            default:
                return StartActivityTargetsMiniArch._childSerializers$_anonymous_$0();
        }
    }
}
