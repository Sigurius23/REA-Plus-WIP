package com.whoop.onboarding.overlay.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p292l1.C23091f0;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000221B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010 ¨\u00063"}, m65681d2 = {"Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "", "", "featureId", "", "featureName", "featureEducationName", "", "Lcom/whoop/onboarding/overlay/model/OnboardingStep;", "steps", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$onboarding_story_release", "(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getFeatureId", "Ljava/lang/String;", "getFeatureName", "getFeatureEducationName", "Ljava/util/List;", "getSteps", "Companion", "$serializer", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeatureOnboardingOverlayModel {
    private final String featureEducationName;
    private final long featureId;
    private final String featureName;
    private final List<OnboardingStep> steps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C23091f0(17))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "serializer", "()Lwc3/c;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeatureOnboardingOverlayModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FeatureOnboardingOverlayModel() {
        this(0L, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(OnboardingStep$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureOnboardingOverlayModel copy$default(FeatureOnboardingOverlayModel featureOnboardingOverlayModel, long j7, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = featureOnboardingOverlayModel.featureId;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            str = featureOnboardingOverlayModel.featureName;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            str2 = featureOnboardingOverlayModel.featureEducationName;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            list = featureOnboardingOverlayModel.steps;
        }
        return featureOnboardingOverlayModel.copy(j13, str3, str4, list);
    }

    public static final /* synthetic */ void write$Self$onboarding_story_release(FeatureOnboardingOverlayModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.featureId != 0) {
            output.encodeLongElement(serialDesc, 0, self.featureId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.featureName, "")) {
            output.encodeStringElement(serialDesc, 1, self.featureName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.featureEducationName, "")) {
            output.encodeStringElement(serialDesc, 2, self.featureEducationName);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.steps, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.steps);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getFeatureId() {
        return this.featureId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeatureName() {
        return this.featureName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFeatureEducationName() {
        return this.featureEducationName;
    }

    public final List<OnboardingStep> component4() {
        return this.steps;
    }

    public final FeatureOnboardingOverlayModel copy(long featureId, String featureName, String featureEducationName, List<OnboardingStep> steps) {
        AbstractC22676k.m65750j(featureName, "featureName");
        AbstractC22676k.m65750j(featureEducationName, "featureEducationName");
        AbstractC22676k.m65750j(steps, "steps");
        return new FeatureOnboardingOverlayModel(featureId, featureName, featureEducationName, steps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureOnboardingOverlayModel)) {
            return false;
        }
        FeatureOnboardingOverlayModel featureOnboardingOverlayModel = (FeatureOnboardingOverlayModel) other;
        return this.featureId == featureOnboardingOverlayModel.featureId && AbstractC22676k.m65745e(this.featureName, featureOnboardingOverlayModel.featureName) && AbstractC22676k.m65745e(this.featureEducationName, featureOnboardingOverlayModel.featureEducationName) && AbstractC22676k.m65745e(this.steps, featureOnboardingOverlayModel.steps);
    }

    public final String getFeatureEducationName() {
        return this.featureEducationName;
    }

    public final long getFeatureId() {
        return this.featureId;
    }

    public final String getFeatureName() {
        return this.featureName;
    }

    public final List<OnboardingStep> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return this.steps.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(Long.hashCode(this.featureId) * 31, 31, this.featureName), 31, this.featureEducationName);
    }

    public String toString() {
        long j7 = this.featureId;
        String str = this.featureName;
        String str2 = this.featureEducationName;
        List<OnboardingStep> list = this.steps;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("FeatureOnboardingOverlayModel(featureId=", ", featureName=", j7, str);
        sbM114685m.append(", featureEducationName=");
        sbM114685m.append(str2);
        sbM114685m.append(", steps=");
        sbM114685m.append(list);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    public /* synthetic */ FeatureOnboardingOverlayModel(int i13, long j7, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.featureId = (i13 & 1) == 0 ? 0L : j7;
        if ((i13 & 2) == 0) {
            this.featureName = "";
        } else {
            this.featureName = str;
        }
        if ((i13 & 4) == 0) {
            this.featureEducationName = "";
        } else {
            this.featureEducationName = str2;
        }
        if ((i13 & 8) == 0) {
            this.steps = C25271y.f99162w;
        } else {
            this.steps = list;
        }
    }

    public FeatureOnboardingOverlayModel(long j7, String featureName, String featureEducationName, List<OnboardingStep> steps) {
        AbstractC22676k.m65750j(featureName, "featureName");
        AbstractC22676k.m65750j(featureEducationName, "featureEducationName");
        AbstractC22676k.m65750j(steps, "steps");
        this.featureId = j7;
        this.featureName = featureName;
        this.featureEducationName = featureEducationName;
        this.steps = steps;
    }

    public /* synthetic */ FeatureOnboardingOverlayModel(long j7, String str, String str2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j7, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? C25271y.f99162w : list);
    }
}
