package ti0;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.archv2.model.template.BackBehavior;
import com.whoop.archv2.model.template.BackgroundModel;
import com.whoop.archv2.model.template.FlowStepTransition;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ti0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b.\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b*\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b0\u00107\u001a\u0004\b1\u00108R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b,\u00109\u001a\u0004\b$\u0010:¨\u0006;"}, m65681d2 = {"Lti0/d;", "Lti0/m;", "Lti0/a;", "activeStep", "", "activeStepKey", "Lcom/whoop/archv2/model/template/BackBehavior;", "backBehavior", "Lcom/whoop/archv2/model/template/FlowStepTransition;", "stepTransition", "currentStepListKey", "", "stackSize", "Lcom/whoop/design/models/ProgressButtonModel;", "progressButton", "", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvents", "Lcom/whoop/navigation/models/GenericInteraction;", "onStartInteraction", "Lcom/whoop/archv2/model/template/BackgroundModel;", "activeStepBackground", "<init>", "(Lti0/a;Ljava/lang/String;Lcom/whoop/archv2/model/template/BackBehavior;Lcom/whoop/archv2/model/template/FlowStepTransition;Ljava/lang/String;ILcom/whoop/design/models/ProgressButtonModel;Ljava/util/Map;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/model/template/BackgroundModel;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lti0/a;", "()Lti0/a;", "b", "Ljava/lang/String;", "c", "Lcom/whoop/archv2/model/template/BackBehavior;", "e", "()Lcom/whoop/archv2/model/template/BackBehavior;", "d", "Lcom/whoop/archv2/model/template/FlowStepTransition;", "j", "()Lcom/whoop/archv2/model/template/FlowStepTransition;", "f", "I", "i", "g", "Lcom/whoop/design/models/ProgressButtonModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/models/ProgressButtonModel;", "Ljava/util/Map;", "()Ljava/util/Map;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lcom/whoop/archv2/model/template/BackgroundModel;", "()Lcom/whoop/archv2/model/template/BackgroundModel;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33839d implements InterfaceC33848m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C33836a activeStep;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String activeStepKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final BackBehavior backBehavior;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FlowStepTransition stepTransition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String currentStepListKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int stackSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ProgressButtonModel progressButton;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Map<String, AnalyticEventModel> analyticEvents;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final GenericInteraction onStartInteraction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final BackgroundModel activeStepBackground;

    public C33839d(C33836a c33836a, String str, BackBehavior backBehavior, FlowStepTransition flowStepTransition, String str2, int i13, ProgressButtonModel progressButtonModel, Map<String, AnalyticEventModel> map, GenericInteraction genericInteraction, BackgroundModel backgroundModel) {
        this.activeStep = c33836a;
        this.activeStepKey = str;
        this.backBehavior = backBehavior;
        this.stepTransition = flowStepTransition;
        this.currentStepListKey = str2;
        this.stackSize = i13;
        this.progressButton = progressButtonModel;
        this.analyticEvents = map;
        this.onStartInteraction = genericInteraction;
        this.activeStepBackground = backgroundModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C33836a getActiveStep() {
        return this.activeStep;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BackgroundModel getActiveStepBackground() {
        return this.activeStepBackground;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActiveStepKey() {
        return this.activeStepKey;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, AnalyticEventModel> m107012d() {
        return this.analyticEvents;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BackBehavior getBackBehavior() {
        return this.backBehavior;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33839d)) {
            return false;
        }
        C33839d c33839d = (C33839d) other;
        return AbstractC22676k.m65745e(this.activeStep, c33839d.activeStep) && AbstractC22676k.m65745e(this.activeStepKey, c33839d.activeStepKey) && this.backBehavior == c33839d.backBehavior && this.stepTransition == c33839d.stepTransition && AbstractC22676k.m65745e(this.currentStepListKey, c33839d.currentStepListKey) && this.stackSize == c33839d.stackSize && AbstractC22676k.m65745e(this.progressButton, c33839d.progressButton) && AbstractC22676k.m65745e(this.analyticEvents, c33839d.analyticEvents) && AbstractC22676k.m65745e(this.onStartInteraction, c33839d.onStartInteraction) && AbstractC22676k.m65745e(this.activeStepBackground, c33839d.activeStepBackground);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCurrentStepListKey() {
        return this.currentStepListKey;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final GenericInteraction getOnStartInteraction() {
        return this.onStartInteraction;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ProgressButtonModel getProgressButton() {
        return this.progressButton;
    }

    public int hashCode() {
        C33836a c33836a = this.activeStep;
        int iHashCode = (c33836a == null ? 0 : c33836a.hashCode()) * 31;
        String str = this.activeStepKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BackBehavior backBehavior = this.backBehavior;
        int iHashCode3 = (iHashCode2 + (backBehavior == null ? 0 : backBehavior.hashCode())) * 31;
        FlowStepTransition flowStepTransition = this.stepTransition;
        int iHashCode4 = (iHashCode3 + (flowStepTransition == null ? 0 : flowStepTransition.hashCode())) * 31;
        String str2 = this.currentStepListKey;
        int iM30448b = AbstractC11266d.m30448b(this.stackSize, (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ProgressButtonModel progressButtonModel = this.progressButton;
        int iHashCode5 = (iM30448b + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        Map<String, AnalyticEventModel> map = this.analyticEvents;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        GenericInteraction genericInteraction = this.onStartInteraction;
        int iHashCode7 = (iHashCode6 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        BackgroundModel backgroundModel = this.activeStepBackground;
        return iHashCode7 + (backgroundModel != null ? backgroundModel.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getStackSize() {
        return this.stackSize;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final FlowStepTransition getStepTransition() {
        return this.stepTransition;
    }

    public String toString() {
        C33836a c33836a = this.activeStep;
        String str = this.activeStepKey;
        BackBehavior backBehavior = this.backBehavior;
        FlowStepTransition flowStepTransition = this.stepTransition;
        String str2 = this.currentStepListKey;
        int i13 = this.stackSize;
        ProgressButtonModel progressButtonModel = this.progressButton;
        Map<String, AnalyticEventModel> map = this.analyticEvents;
        GenericInteraction genericInteraction = this.onStartInteraction;
        BackgroundModel backgroundModel = this.activeStepBackground;
        StringBuilder sb4 = new StringBuilder("FlowContentState(activeStep=");
        sb4.append(c33836a);
        sb4.append(", activeStepKey=");
        sb4.append(str);
        sb4.append(", backBehavior=");
        sb4.append(backBehavior);
        sb4.append(", stepTransition=");
        sb4.append(flowStepTransition);
        sb4.append(", currentStepListKey=");
        AbstractC11266d.m30470x(i13, str2, ", stackSize=", ", progressButton=", sb4);
        sb4.append(progressButtonModel);
        sb4.append(", analyticEvents=");
        sb4.append(map);
        sb4.append(", onStartInteraction=");
        sb4.append(genericInteraction);
        sb4.append(", activeStepBackground=");
        sb4.append(backgroundModel);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C33839d(C33836a c33836a, String str, BackBehavior backBehavior, FlowStepTransition flowStepTransition, String str2, int i13, ProgressButtonModel progressButtonModel, Map map, GenericInteraction genericInteraction, BackgroundModel backgroundModel, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : c33836a, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : backBehavior, (i14 & 8) != 0 ? null : flowStepTransition, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? 0 : i13, (i14 & 64) != 0 ? null : progressButtonModel, (i14 & 128) != 0 ? null : map, (i14 & 256) != 0 ? null : genericInteraction, (i14 & 512) != 0 ? null : backgroundModel);
    }
}
