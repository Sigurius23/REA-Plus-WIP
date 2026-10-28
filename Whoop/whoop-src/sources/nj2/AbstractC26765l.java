package nj2;

import androidx.profileinstaller.ProfileVerifier;
import ca2.EnumC4363c;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.StepperComponentModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.graph.StressGraphingCardModel;
import com.whoop.design.models.items.graph.stress.StressState;
import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.stress.domain.model.MetaData;
import com.whoop.stress.domain.model.OnboardingDismissDialog;
import com.whoop.stress.domain.model.PendingActivityDialogue;
import com.whoop.stress.domain.model.StressDateSelector;
import com.whoop.stress.domain.model.StressTrend;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: nj2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lnj2/l;", "", "<init>", "()V", "d", "a", "b", "c", "e", "Lnj2/l$a;", "Lnj2/l$b;", "Lnj2/l$c;", "Lnj2/l$d;", "Lnj2/l$e;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26765l {

    /* JADX INFO: renamed from: nj2.l$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lnj2/l$a;", "Lnj2/l;", "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "stressGraphingCardModel", "<init>", "(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC26765l {

        /* JADX INFO: renamed from: b */
        public static final int f106537b = StressGraphingCardModel.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final StressGraphingCardModel stressGraphingCardModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StressGraphingCardModel stressGraphingCardModel) {
            super(null);
            AbstractC22676k.m65750j(stressGraphingCardModel, "stressGraphingCardModel");
            this.stressGraphingCardModel = stressGraphingCardModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StressGraphingCardModel getStressGraphingCardModel() {
            return this.stressGraphingCardModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.stressGraphingCardModel, ((a) other).stressGraphingCardModel);
        }

        public int hashCode() {
            return this.stressGraphingCardModel.hashCode();
        }

        public String toString() {
            return "CoachingLandingGraphSuccess(stressGraphingCardModel=" + this.stressGraphingCardModel + ")";
        }
    }

    /* JADX INFO: renamed from: nj2.l$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnj2/l$b;", "Lnj2/l;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC26765l {

        /* JADX INFO: renamed from: a */
        public static final b f106539a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nj2.l$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnj2/l$c;", "Lnj2/l;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC26765l {

        /* JADX INFO: renamed from: a */
        public static final c f106540a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nj2.l$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnj2/l$d;", "Lnj2/l;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC26765l {

        /* JADX INFO: renamed from: a */
        public static final d f106541a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC26765l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC26765l() {
    }

    /* JADX INFO: renamed from: nj2.l$e */
    @Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u0001B±\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/JÈ\u0002\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010;\u001a\u0004\b<\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u00103R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bF\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b[\u0010YR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bC\u0010W\u001a\u0004\bO\u0010YR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bX\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b_\u0010H\u001a\u0004\b`\u0010JR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010;\u001a\u0004\bA\u00103R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\ba\u0010dR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\b_\u0010gR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b[\u0010T\u001a\u0004\bb\u0010VR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b`\u0010h\u001a\u0004\bE\u0010iR\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u0010H\u001a\u0004\bj\u0010JR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b]\u0010;\u001a\u0004\bS\u00103R\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\bU\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b?\u0010n\u001a\u0004\bG\u0010oR\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bK\u0010JR\u0019\u0010'\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bl\u0010T\u001a\u0004\bp\u0010VR\u001f\u0010)\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bq\u0010sR\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\bQ\u0010t\u001a\u0004\be\u0010uR\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\bp\u0010v\u001a\u0004\bZ\u0010w¨\u0006x"}, m65681d2 = {"Lnj2/l$e;", "Lnj2/l;", "", "title", "Lcom/whoop/design/models/items/graph/stress/StressState;", "stressState", "Lnj2/c;", "meterContent", "lastUpdated", "", "showStressEducation", "Lnj2/z;", "stressVow", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "whoopCoachVowModel", "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "stressGraphingCardModel", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "onboardingCarouselModel", "sessionsCarouselModel", "educationCarouselModel", "Lcom/whoop/educationModels/FeatureEducationDto;", "stressEducation", "showOnboardingEducation", "calibrationText", "Lcom/whoop/stress/domain/model/PendingActivityDialogue;", "pendingActivityDialogue", "Lcom/whoop/stress/domain/model/OnboardingDismissDialog;", "onboardingDismissDialogue", "previousStressGraphState", "Lca2/c;", "connectivityTile", "isShowConnectivityWindowEnabled", "lastSyncTimestamp", "Lcom/whoop/stress/domain/model/StressTrend;", "trend", "Lcom/whoop/stress/domain/model/StressDateSelector;", "dateSelector", "dateSelectorLoading", "zoomedOutGraphState", "", "trendList", "Lcom/whoop/design/models/items/StepperComponentModel;", "progressStepper", "Lcom/whoop/stress/domain/model/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Lnj2/c;Ljava/lang/String;ZLnj2/z;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/educationModels/FeatureEducationDto;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lca2/c;ZLjava/lang/String;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;ZLcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Lnj2/c;Ljava/lang/String;ZLnj2/z;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/educationModels/FeatureEducationDto;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lca2/c;ZLjava/lang/String;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;ZLcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;)Lnj2/l$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "b", "Lcom/whoop/design/models/items/graph/stress/StressState;", "v", "()Lcom/whoop/design/models/items/graph/stress/StressState;", "c", "Lnj2/c;", "k", "()Lnj2/c;", "d", "i", "e", "Z", "s", "()Z", "f", "Lnj2/z;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Lnj2/z;", "g", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "z", "()Lcom/whoop/design/models/items/WhoopCoachVowModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "u", "()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "l", "()Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "j", "q", "Lcom/whoop/educationModels/FeatureEducationDto;", "t", "()Lcom/whoop/educationModels/FeatureEducationDto;", "m", "r", "n", "o", "Lcom/whoop/stress/domain/model/PendingActivityDialogue;", "()Lcom/whoop/stress/domain/model/PendingActivityDialogue;", "p", "Lcom/whoop/stress/domain/model/OnboardingDismissDialog;", "()Lcom/whoop/stress/domain/model/OnboardingDismissDialog;", "Lca2/c;", "()Lca2/c;", "B", "Lcom/whoop/stress/domain/model/StressTrend;", "x", "()Lcom/whoop/stress/domain/model/StressTrend;", "Lcom/whoop/stress/domain/model/StressDateSelector;", "()Lcom/whoop/stress/domain/model/StressDateSelector;", "A", "y", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/whoop/design/models/items/StepperComponentModel;", "()Lcom/whoop/design/models/items/StepperComponentModel;", "Lcom/whoop/stress/domain/model/MetaData;", "()Lcom/whoop/stress/domain/model/MetaData;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC26765l {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private final MetaData metadata;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final StressState stressState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C26756c meterContent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String lastUpdated;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean showStressEducation;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C26779z stressVow;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final WhoopCoachVowModel whoopCoachVowModel;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final StressGraphingCardModel stressGraphingCardModel;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final ArticleTileCarouselModel onboardingCarouselModel;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final ArticleTileCarouselModel sessionsCarouselModel;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final ArticleTileCarouselModel educationCarouselModel;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final FeatureEducationDto stressEducation;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final boolean showOnboardingEducation;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final String calibrationText;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final PendingActivityDialogue pendingActivityDialogue;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final OnboardingDismissDialog onboardingDismissDialogue;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final StressGraphingCardModel previousStressGraphState;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final EnumC4363c connectivityTile;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final boolean isShowConnectivityWindowEnabled;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final String lastSyncTimestamp;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final StressTrend trend;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final StressDateSelector dateSelector;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final boolean dateSelectorLoading;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final StressGraphingCardModel zoomedOutGraphState;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final List<StressTrend> trendList;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final StepperComponentModel progressStepper;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String title, StressState stressState, C26756c meterContent, String lastUpdated, boolean z4, C26779z c26779z, WhoopCoachVowModel whoopCoachVowModel, StressGraphingCardModel stressGraphingCardModel, ArticleTileCarouselModel articleTileCarouselModel, ArticleTileCarouselModel articleTileCarouselModel2, ArticleTileCarouselModel articleTileCarouselModel3, FeatureEducationDto stressEducation, boolean z13, String str, PendingActivityDialogue pendingActivityDialogue, OnboardingDismissDialog onboardingDismissDialog, StressGraphingCardModel stressGraphingCardModel2, EnumC4363c enumC4363c, boolean z14, String str2, StressTrend stressTrend, StressDateSelector stressDateSelector, boolean z15, StressGraphingCardModel stressGraphingCardModel3, List<StressTrend> list, StepperComponentModel stepperComponentModel, MetaData metaData) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(stressState, "stressState");
            AbstractC22676k.m65750j(meterContent, "meterContent");
            AbstractC22676k.m65750j(lastUpdated, "lastUpdated");
            AbstractC22676k.m65750j(stressEducation, "stressEducation");
            this.title = title;
            this.stressState = stressState;
            this.meterContent = meterContent;
            this.lastUpdated = lastUpdated;
            this.showStressEducation = z4;
            this.stressVow = c26779z;
            this.whoopCoachVowModel = whoopCoachVowModel;
            this.stressGraphingCardModel = stressGraphingCardModel;
            this.onboardingCarouselModel = articleTileCarouselModel;
            this.sessionsCarouselModel = articleTileCarouselModel2;
            this.educationCarouselModel = articleTileCarouselModel3;
            this.stressEducation = stressEducation;
            this.showOnboardingEducation = z13;
            this.calibrationText = str;
            this.pendingActivityDialogue = pendingActivityDialogue;
            this.onboardingDismissDialogue = onboardingDismissDialog;
            this.previousStressGraphState = stressGraphingCardModel2;
            this.connectivityTile = enumC4363c;
            this.isShowConnectivityWindowEnabled = z14;
            this.lastSyncTimestamp = str2;
            this.trend = stressTrend;
            this.dateSelector = stressDateSelector;
            this.dateSelectorLoading = z15;
            this.zoomedOutGraphState = stressGraphingCardModel3;
            this.trendList = list;
            this.progressStepper = stepperComponentModel;
            this.metadata = metaData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ e m79692b(e eVar, String str, StressState stressState, C26756c c26756c, String str2, boolean z4, C26779z c26779z, WhoopCoachVowModel whoopCoachVowModel, StressGraphingCardModel stressGraphingCardModel, ArticleTileCarouselModel articleTileCarouselModel, ArticleTileCarouselModel articleTileCarouselModel2, ArticleTileCarouselModel articleTileCarouselModel3, FeatureEducationDto featureEducationDto, boolean z13, String str3, PendingActivityDialogue pendingActivityDialogue, OnboardingDismissDialog onboardingDismissDialog, StressGraphingCardModel stressGraphingCardModel2, EnumC4363c enumC4363c, boolean z14, String str4, StressTrend stressTrend, StressDateSelector stressDateSelector, boolean z15, StressGraphingCardModel stressGraphingCardModel3, List list, StepperComponentModel stepperComponentModel, MetaData metaData, int i13, Object obj) {
            MetaData metaData2;
            StepperComponentModel stepperComponentModel2;
            String str5 = (i13 & 1) != 0 ? eVar.title : str;
            StressState stressState2 = (i13 & 2) != 0 ? eVar.stressState : stressState;
            C26756c c26756c2 = (i13 & 4) != 0 ? eVar.meterContent : c26756c;
            String str6 = (i13 & 8) != 0 ? eVar.lastUpdated : str2;
            boolean z16 = (i13 & 16) != 0 ? eVar.showStressEducation : z4;
            C26779z c26779z2 = (i13 & 32) != 0 ? eVar.stressVow : c26779z;
            WhoopCoachVowModel whoopCoachVowModel2 = (i13 & 64) != 0 ? eVar.whoopCoachVowModel : whoopCoachVowModel;
            StressGraphingCardModel stressGraphingCardModel4 = (i13 & 128) != 0 ? eVar.stressGraphingCardModel : stressGraphingCardModel;
            ArticleTileCarouselModel articleTileCarouselModel4 = (i13 & 256) != 0 ? eVar.onboardingCarouselModel : articleTileCarouselModel;
            ArticleTileCarouselModel articleTileCarouselModel5 = (i13 & 512) != 0 ? eVar.sessionsCarouselModel : articleTileCarouselModel2;
            ArticleTileCarouselModel articleTileCarouselModel6 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? eVar.educationCarouselModel : articleTileCarouselModel3;
            FeatureEducationDto featureEducationDto2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? eVar.stressEducation : featureEducationDto;
            boolean z17 = (i13 & 4096) != 0 ? eVar.showOnboardingEducation : z13;
            String str7 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? eVar.calibrationText : str3;
            String str8 = str5;
            PendingActivityDialogue pendingActivityDialogue2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? eVar.pendingActivityDialogue : pendingActivityDialogue;
            OnboardingDismissDialog onboardingDismissDialog2 = (i13 & 32768) != 0 ? eVar.onboardingDismissDialogue : onboardingDismissDialog;
            StressGraphingCardModel stressGraphingCardModel5 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? eVar.previousStressGraphState : stressGraphingCardModel2;
            EnumC4363c enumC4363c2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? eVar.connectivityTile : enumC4363c;
            boolean z18 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? eVar.isShowConnectivityWindowEnabled : z14;
            String str9 = (i13 & 524288) != 0 ? eVar.lastSyncTimestamp : str4;
            StressTrend stressTrend2 = (i13 & 1048576) != 0 ? eVar.trend : stressTrend;
            StressDateSelector stressDateSelector2 = (i13 & 2097152) != 0 ? eVar.dateSelector : stressDateSelector;
            boolean z19 = (i13 & 4194304) != 0 ? eVar.dateSelectorLoading : z15;
            StressGraphingCardModel stressGraphingCardModel6 = (i13 & 8388608) != 0 ? eVar.zoomedOutGraphState : stressGraphingCardModel3;
            List list2 = (i13 & 16777216) != 0 ? eVar.trendList : list;
            StepperComponentModel stepperComponentModel3 = (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? eVar.progressStepper : stepperComponentModel;
            if ((i13 & 67108864) != 0) {
                stepperComponentModel2 = stepperComponentModel3;
                metaData2 = eVar.metadata;
            } else {
                metaData2 = metaData;
                stepperComponentModel2 = stepperComponentModel3;
            }
            return eVar.m79695a(str8, stressState2, c26756c2, str6, z16, c26779z2, whoopCoachVowModel2, stressGraphingCardModel4, articleTileCarouselModel4, articleTileCarouselModel5, articleTileCarouselModel6, featureEducationDto2, z17, str7, pendingActivityDialogue2, onboardingDismissDialog2, stressGraphingCardModel5, enumC4363c2, z18, str9, stressTrend2, stressDateSelector2, z19, stressGraphingCardModel6, list2, stepperComponentModel2, metaData2);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final StressGraphingCardModel getZoomedOutGraphState() {
            return this.zoomedOutGraphState;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getIsShowConnectivityWindowEnabled() {
            return this.isShowConnectivityWindowEnabled;
        }

        /* JADX INFO: renamed from: a */
        public final e m79695a(String title, StressState stressState, C26756c meterContent, String lastUpdated, boolean showStressEducation, C26779z stressVow, WhoopCoachVowModel whoopCoachVowModel, StressGraphingCardModel stressGraphingCardModel, ArticleTileCarouselModel onboardingCarouselModel, ArticleTileCarouselModel sessionsCarouselModel, ArticleTileCarouselModel educationCarouselModel, FeatureEducationDto stressEducation, boolean showOnboardingEducation, String calibrationText, PendingActivityDialogue pendingActivityDialogue, OnboardingDismissDialog onboardingDismissDialogue, StressGraphingCardModel previousStressGraphState, EnumC4363c connectivityTile, boolean isShowConnectivityWindowEnabled, String lastSyncTimestamp, StressTrend trend, StressDateSelector dateSelector, boolean dateSelectorLoading, StressGraphingCardModel zoomedOutGraphState, List<StressTrend> trendList, StepperComponentModel progressStepper, MetaData metadata) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(stressState, "stressState");
            AbstractC22676k.m65750j(meterContent, "meterContent");
            AbstractC22676k.m65750j(lastUpdated, "lastUpdated");
            AbstractC22676k.m65750j(stressEducation, "stressEducation");
            return new e(title, stressState, meterContent, lastUpdated, showStressEducation, stressVow, whoopCoachVowModel, stressGraphingCardModel, onboardingCarouselModel, sessionsCarouselModel, educationCarouselModel, stressEducation, showOnboardingEducation, calibrationText, pendingActivityDialogue, onboardingDismissDialogue, previousStressGraphState, connectivityTile, isShowConnectivityWindowEnabled, lastSyncTimestamp, trend, dateSelector, dateSelectorLoading, zoomedOutGraphState, trendList, progressStepper, metadata);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCalibrationText() {
            return this.calibrationText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC4363c getConnectivityTile() {
            return this.connectivityTile;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final StressDateSelector getDateSelector() {
            return this.dateSelector;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.title, eVar.title) && this.stressState == eVar.stressState && AbstractC22676k.m65745e(this.meterContent, eVar.meterContent) && AbstractC22676k.m65745e(this.lastUpdated, eVar.lastUpdated) && this.showStressEducation == eVar.showStressEducation && AbstractC22676k.m65745e(this.stressVow, eVar.stressVow) && AbstractC22676k.m65745e(this.whoopCoachVowModel, eVar.whoopCoachVowModel) && AbstractC22676k.m65745e(this.stressGraphingCardModel, eVar.stressGraphingCardModel) && AbstractC22676k.m65745e(this.onboardingCarouselModel, eVar.onboardingCarouselModel) && AbstractC22676k.m65745e(this.sessionsCarouselModel, eVar.sessionsCarouselModel) && AbstractC22676k.m65745e(this.educationCarouselModel, eVar.educationCarouselModel) && AbstractC22676k.m65745e(this.stressEducation, eVar.stressEducation) && this.showOnboardingEducation == eVar.showOnboardingEducation && AbstractC22676k.m65745e(this.calibrationText, eVar.calibrationText) && AbstractC22676k.m65745e(this.pendingActivityDialogue, eVar.pendingActivityDialogue) && AbstractC22676k.m65745e(this.onboardingDismissDialogue, eVar.onboardingDismissDialogue) && AbstractC22676k.m65745e(this.previousStressGraphState, eVar.previousStressGraphState) && this.connectivityTile == eVar.connectivityTile && this.isShowConnectivityWindowEnabled == eVar.isShowConnectivityWindowEnabled && AbstractC22676k.m65745e(this.lastSyncTimestamp, eVar.lastSyncTimestamp) && AbstractC22676k.m65745e(this.trend, eVar.trend) && AbstractC22676k.m65745e(this.dateSelector, eVar.dateSelector) && this.dateSelectorLoading == eVar.dateSelectorLoading && AbstractC22676k.m65745e(this.zoomedOutGraphState, eVar.zoomedOutGraphState) && AbstractC22676k.m65745e(this.trendList, eVar.trendList) && AbstractC22676k.m65745e(this.progressStepper, eVar.progressStepper) && AbstractC22676k.m65745e(this.metadata, eVar.metadata);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getDateSelectorLoading() {
            return this.dateSelectorLoading;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ArticleTileCarouselModel getEducationCarouselModel() {
            return this.educationCarouselModel;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getLastSyncTimestamp() {
            return this.lastSyncTimestamp;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d((this.meterContent.hashCode() + ((this.stressState.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31, 31, this.lastUpdated), 31, this.showStressEducation);
            C26779z c26779z = this.stressVow;
            int iHashCode = (iM8289b + (c26779z == null ? 0 : c26779z.hashCode())) * 31;
            WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVowModel;
            int iHashCode2 = (iHashCode + (whoopCoachVowModel == null ? 0 : whoopCoachVowModel.hashCode())) * 31;
            StressGraphingCardModel stressGraphingCardModel = this.stressGraphingCardModel;
            int iHashCode3 = (iHashCode2 + (stressGraphingCardModel == null ? 0 : stressGraphingCardModel.hashCode())) * 31;
            ArticleTileCarouselModel articleTileCarouselModel = this.onboardingCarouselModel;
            int iHashCode4 = (iHashCode3 + (articleTileCarouselModel == null ? 0 : articleTileCarouselModel.hashCode())) * 31;
            ArticleTileCarouselModel articleTileCarouselModel2 = this.sessionsCarouselModel;
            int iHashCode5 = (iHashCode4 + (articleTileCarouselModel2 == null ? 0 : articleTileCarouselModel2.hashCode())) * 31;
            ArticleTileCarouselModel articleTileCarouselModel3 = this.educationCarouselModel;
            int iM8289b2 = AbstractC2875y.m8289b((this.stressEducation.hashCode() + ((iHashCode5 + (articleTileCarouselModel3 == null ? 0 : articleTileCarouselModel3.hashCode())) * 31)) * 31, 31, this.showOnboardingEducation);
            String str = this.calibrationText;
            int iHashCode6 = (iM8289b2 + (str == null ? 0 : str.hashCode())) * 31;
            PendingActivityDialogue pendingActivityDialogue = this.pendingActivityDialogue;
            int iHashCode7 = (iHashCode6 + (pendingActivityDialogue == null ? 0 : pendingActivityDialogue.hashCode())) * 31;
            OnboardingDismissDialog onboardingDismissDialog = this.onboardingDismissDialogue;
            int iHashCode8 = (iHashCode7 + (onboardingDismissDialog == null ? 0 : onboardingDismissDialog.hashCode())) * 31;
            StressGraphingCardModel stressGraphingCardModel2 = this.previousStressGraphState;
            int iHashCode9 = (iHashCode8 + (stressGraphingCardModel2 == null ? 0 : stressGraphingCardModel2.hashCode())) * 31;
            EnumC4363c enumC4363c = this.connectivityTile;
            int iM8289b3 = AbstractC2875y.m8289b((iHashCode9 + (enumC4363c == null ? 0 : enumC4363c.hashCode())) * 31, 31, this.isShowConnectivityWindowEnabled);
            String str2 = this.lastSyncTimestamp;
            int iHashCode10 = (iM8289b3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            StressTrend stressTrend = this.trend;
            int iHashCode11 = (iHashCode10 + (stressTrend == null ? 0 : stressTrend.hashCode())) * 31;
            StressDateSelector stressDateSelector = this.dateSelector;
            int iM8289b4 = AbstractC2875y.m8289b((iHashCode11 + (stressDateSelector == null ? 0 : stressDateSelector.hashCode())) * 31, 31, this.dateSelectorLoading);
            StressGraphingCardModel stressGraphingCardModel3 = this.zoomedOutGraphState;
            int iHashCode12 = (iM8289b4 + (stressGraphingCardModel3 == null ? 0 : stressGraphingCardModel3.hashCode())) * 31;
            List<StressTrend> list = this.trendList;
            int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
            StepperComponentModel stepperComponentModel = this.progressStepper;
            int iHashCode14 = (iHashCode13 + (stepperComponentModel == null ? 0 : stepperComponentModel.hashCode())) * 31;
            MetaData metaData = this.metadata;
            return iHashCode14 + (metaData != null ? metaData.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getLastUpdated() {
            return this.lastUpdated;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final MetaData getMetadata() {
            return this.metadata;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final C26756c getMeterContent() {
            return this.meterContent;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final ArticleTileCarouselModel getOnboardingCarouselModel() {
            return this.onboardingCarouselModel;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final OnboardingDismissDialog getOnboardingDismissDialogue() {
            return this.onboardingDismissDialogue;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final PendingActivityDialogue getPendingActivityDialogue() {
            return this.pendingActivityDialogue;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final StressGraphingCardModel getPreviousStressGraphState() {
            return this.previousStressGraphState;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final StepperComponentModel getProgressStepper() {
            return this.progressStepper;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final ArticleTileCarouselModel getSessionsCarouselModel() {
            return this.sessionsCarouselModel;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getShowOnboardingEducation() {
            return this.showOnboardingEducation;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getShowStressEducation() {
            return this.showStressEducation;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final FeatureEducationDto getStressEducation() {
            return this.stressEducation;
        }

        public String toString() {
            String str = this.title;
            StressState stressState = this.stressState;
            C26756c c26756c = this.meterContent;
            String str2 = this.lastUpdated;
            boolean z4 = this.showStressEducation;
            C26779z c26779z = this.stressVow;
            WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVowModel;
            StressGraphingCardModel stressGraphingCardModel = this.stressGraphingCardModel;
            ArticleTileCarouselModel articleTileCarouselModel = this.onboardingCarouselModel;
            ArticleTileCarouselModel articleTileCarouselModel2 = this.sessionsCarouselModel;
            ArticleTileCarouselModel articleTileCarouselModel3 = this.educationCarouselModel;
            FeatureEducationDto featureEducationDto = this.stressEducation;
            boolean z13 = this.showOnboardingEducation;
            String str3 = this.calibrationText;
            PendingActivityDialogue pendingActivityDialogue = this.pendingActivityDialogue;
            OnboardingDismissDialog onboardingDismissDialog = this.onboardingDismissDialogue;
            StressGraphingCardModel stressGraphingCardModel2 = this.previousStressGraphState;
            EnumC4363c enumC4363c = this.connectivityTile;
            boolean z14 = this.isShowConnectivityWindowEnabled;
            String str4 = this.lastSyncTimestamp;
            StressTrend stressTrend = this.trend;
            StressDateSelector stressDateSelector = this.dateSelector;
            boolean z15 = this.dateSelectorLoading;
            StressGraphingCardModel stressGraphingCardModel3 = this.zoomedOutGraphState;
            List<StressTrend> list = this.trendList;
            StepperComponentModel stepperComponentModel = this.progressStepper;
            MetaData metaData = this.metadata;
            StringBuilder sb4 = new StringBuilder("Success(title=");
            sb4.append(str);
            sb4.append(", stressState=");
            sb4.append(stressState);
            sb4.append(", meterContent=");
            sb4.append(c26756c);
            sb4.append(", lastUpdated=");
            sb4.append(str2);
            sb4.append(", showStressEducation=");
            sb4.append(z4);
            sb4.append(", stressVow=");
            sb4.append(c26779z);
            sb4.append(", whoopCoachVowModel=");
            sb4.append(whoopCoachVowModel);
            sb4.append(", stressGraphingCardModel=");
            sb4.append(stressGraphingCardModel);
            sb4.append(", onboardingCarouselModel=");
            sb4.append(articleTileCarouselModel);
            sb4.append(", sessionsCarouselModel=");
            sb4.append(articleTileCarouselModel2);
            sb4.append(", educationCarouselModel=");
            sb4.append(articleTileCarouselModel3);
            sb4.append(", stressEducation=");
            sb4.append(featureEducationDto);
            sb4.append(", showOnboardingEducation=");
            AbstractC38963t7.m124391u(sb4, z13, ", calibrationText=", str3, ", pendingActivityDialogue=");
            sb4.append(pendingActivityDialogue);
            sb4.append(", onboardingDismissDialogue=");
            sb4.append(onboardingDismissDialog);
            sb4.append(", previousStressGraphState=");
            sb4.append(stressGraphingCardModel2);
            sb4.append(", connectivityTile=");
            sb4.append(enumC4363c);
            sb4.append(", isShowConnectivityWindowEnabled=");
            AbstractC38963t7.m124391u(sb4, z14, ", lastSyncTimestamp=", str4, ", trend=");
            sb4.append(stressTrend);
            sb4.append(", dateSelector=");
            sb4.append(stressDateSelector);
            sb4.append(", dateSelectorLoading=");
            sb4.append(z15);
            sb4.append(", zoomedOutGraphState=");
            sb4.append(stressGraphingCardModel3);
            sb4.append(", trendList=");
            sb4.append(list);
            sb4.append(", progressStepper=");
            sb4.append(stepperComponentModel);
            sb4.append(", metadata=");
            sb4.append(metaData);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final StressGraphingCardModel getStressGraphingCardModel() {
            return this.stressGraphingCardModel;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final StressState getStressState() {
            return this.stressState;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final C26779z getStressVow() {
            return this.stressVow;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final StressTrend getTrend() {
            return this.trend;
        }

        /* JADX INFO: renamed from: y */
        public final List<StressTrend> m79718y() {
            return this.trendList;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final WhoopCoachVowModel getWhoopCoachVowModel() {
            return this.whoopCoachVowModel;
        }

        public /* synthetic */ e(String str, StressState stressState, C26756c c26756c, String str2, boolean z4, C26779z c26779z, WhoopCoachVowModel whoopCoachVowModel, StressGraphingCardModel stressGraphingCardModel, ArticleTileCarouselModel articleTileCarouselModel, ArticleTileCarouselModel articleTileCarouselModel2, ArticleTileCarouselModel articleTileCarouselModel3, FeatureEducationDto featureEducationDto, boolean z13, String str3, PendingActivityDialogue pendingActivityDialogue, OnboardingDismissDialog onboardingDismissDialog, StressGraphingCardModel stressGraphingCardModel2, EnumC4363c enumC4363c, boolean z14, String str4, StressTrend stressTrend, StressDateSelector stressDateSelector, boolean z15, StressGraphingCardModel stressGraphingCardModel3, List list, StepperComponentModel stepperComponentModel, MetaData metaData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, stressState, c26756c, str2, z4, (i13 & 32) != 0 ? null : c26779z, (i13 & 64) != 0 ? null : whoopCoachVowModel, (i13 & 128) != 0 ? null : stressGraphingCardModel, (i13 & 256) != 0 ? null : articleTileCarouselModel, (i13 & 512) != 0 ? null : articleTileCarouselModel2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : articleTileCarouselModel3, featureEducationDto, z13, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str3, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : pendingActivityDialogue, (32768 & i13) != 0 ? null : onboardingDismissDialog, (65536 & i13) != 0 ? null : stressGraphingCardModel2, (131072 & i13) != 0 ? null : enumC4363c, (262144 & i13) != 0 ? false : z14, (524288 & i13) != 0 ? null : str4, (1048576 & i13) != 0 ? null : stressTrend, (2097152 & i13) != 0 ? null : stressDateSelector, (4194304 & i13) != 0 ? false : z15, (8388608 & i13) != 0 ? null : stressGraphingCardModel3, (16777216 & i13) != 0 ? null : list, (33554432 & i13) != 0 ? null : stepperComponentModel, (i13 & 67108864) != 0 ? null : metaData);
        }
    }
}
