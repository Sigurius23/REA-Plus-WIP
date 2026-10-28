package kg2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.bot.models.feedback.FeedbackReason;
import com.whoop.challengedetails.domain.models.ChallengeDetailsResponse;
import com.whoop.challengedetails.domain.models.ChallengeDetailsStyle;
import com.whoop.challengedetails.domain.models.JoinChallengeResponse;
import com.whoop.challengedetails.domain.models.JoinChallengeResponseStatus;
import com.whoop.startactivity.goals.StartActivityTargetsMiniArch;
import com.whoop.startactivity.goals.StartActivityTargetsMiniArchComponent;
import com.whoop.startactivity.goals.TargetsScoreType;
import com.whoop.weeklyplan.hubandspoke.domain.api.ActivitiesSection;
import com.whoop.weeklyplan.hubandspoke.domain.api.ActivitiesSectionKotlinx;
import com.whoop.weeklyplan.hubandspoke.domain.api.AssociatedBehaviorsActivities;
import com.whoop.weeklyplan.hubandspoke.domain.api.AssociatedBehaviorsActivitiesKotlinx;
import com.whoop.weeklyplan.hubandspoke.domain.api.BehaviorSection;
import com.whoop.weeklyplan.hubandspoke.domain.api.BehaviorSectionKotlinx;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponseKotlinx;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import ki0.C22501a;
import kk1.AbstractC22546g;
import kl2.AbstractC22576k;
import p118ei.C13216c;
import p327mi.C25569a;
import p327mi.C25570b;
import p583wh.C37296b;
import x43.AbstractC37978j;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: kg2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C22458d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87976w;

    public /* synthetic */ C22458d(int i13) {
        this.f87976w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f87976w) {
            case 0:
                return StartActivityTargetsMiniArch._childSerializers$_anonymous_$1();
            case 1:
                return StartActivityTargetsMiniArchComponent._init_$_anonymous_();
            case 2:
                return TargetsScoreType._init_$_anonymous_();
            case 3:
                try {
                    return AbstractC37978j.m121637V(AbstractC38176k.m122276E(AbstractC38176k.m122278n(Arrays.asList(new C25569a(), new C13216c()).iterator())));
                } catch (Throwable th3) {
                    throw new ServiceConfigurationError(th3.getMessage(), th3);
                }
            case 4:
                try {
                    return AbstractC37978j.m121637V(AbstractC38176k.m122276E(AbstractC38176k.m122278n(Arrays.asList(new C37296b(), new C25570b()).iterator())));
                } catch (Throwable th4) {
                    throw new ServiceConfigurationError(th4.getMessage(), th4);
                }
            case 5:
                return C22501a.m65002i();
            case 6:
                return AbstractC22546g.m65268x0();
            case 7:
                return AiFeedbackType._init_$_anonymous_();
            case 8:
                return AiMessageFeedback._childSerializers$_anonymous_();
            case 9:
                return FeedbackReason._init_$_anonymous_();
            case 10:
                return AbstractC22576k.m65390x();
            case 11:
                return ChallengeDetailsResponse._childSerializers$_anonymous_();
            case 12:
                return ChallengeDetailsResponse._childSerializers$_anonymous_$0();
            case 13:
                return ChallengeDetailsStyle._init_$_anonymous_();
            case 14:
                return JoinChallengeResponse._childSerializers$_anonymous_();
            case 15:
                return JoinChallengeResponseStatus._init_$_anonymous_();
            case 16:
                return ActivitiesSection._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ActivitiesSectionKotlinx._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AssociatedBehaviorsActivities._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AssociatedBehaviorsActivities._childSerializers$_anonymous_$0();
            case 20:
                return AssociatedBehaviorsActivities._childSerializers$_anonymous_$1();
            case 21:
                return AssociatedBehaviorsActivitiesKotlinx._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AssociatedBehaviorsActivitiesKotlinx._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AssociatedBehaviorsActivitiesKotlinx._childSerializers$_anonymous_$1();
            case 24:
                return BehaviorSection._childSerializers$_anonymous_();
            case 25:
                return BehaviorSectionKotlinx._childSerializers$_anonymous_();
            case 26:
                return HubAndSpokeResponse._childSerializers$_anonymous_();
            case 27:
                return HubAndSpokeResponse._childSerializers$_anonymous_$0();
            case 28:
                return HubAndSpokeResponseKotlinx._childSerializers$_anonymous_();
            default:
                return HubAndSpokeResponseKotlinx._childSerializers$_anonymous_$0();
        }
    }
}
