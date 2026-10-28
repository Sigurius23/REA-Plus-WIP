package com.whoop.feedbacksurvey.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import u91.C34656a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;", "", "", "toolBarTitle", "", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionModel;", "sections", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyStickyModel;", "stickyButtons", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyStickyModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyStickyModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$feedback_survey_release", "(Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyStickyModel;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyStickyModel;)Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolBarTitle", "Ljava/util/List;", "getSections", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyStickyModel;", "getStickyButtons", "Companion", "$serializer", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeedbackSurveyModels {
    private final List<FeedbackSurveySectionModel> sections;
    private final FeedbackSurveyStickyModel stickyButtons;
    private final String toolBarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34656a(12)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;", "serializer", "()Lwc3/c;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeedbackSurveyModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeedbackSurveyModels(int i13, String str, List list, FeedbackSurveyStickyModel feedbackSurveyStickyModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, FeedbackSurveyModels$$serializer.INSTANCE.getDescriptor());
        }
        this.toolBarTitle = str;
        this.sections = list;
        this.stickyButtons = feedbackSurveyStickyModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(FeedbackSurveySectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackSurveyModels copy$default(FeedbackSurveyModels feedbackSurveyModels, String str, List list, FeedbackSurveyStickyModel feedbackSurveyStickyModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = feedbackSurveyModels.toolBarTitle;
        }
        if ((i13 & 2) != 0) {
            list = feedbackSurveyModels.sections;
        }
        if ((i13 & 4) != 0) {
            feedbackSurveyStickyModel = feedbackSurveyModels.stickyButtons;
        }
        return feedbackSurveyModels.copy(str, list, feedbackSurveyStickyModel);
    }

    public static final /* synthetic */ void write$Self$feedback_survey_release(FeedbackSurveyModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.toolBarTitle);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        output.encodeSerializableElement(serialDesc, 2, FeedbackSurveyStickyModel$$serializer.INSTANCE, self.stickyButtons);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    public final List<FeedbackSurveySectionModel> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FeedbackSurveyStickyModel getStickyButtons() {
        return this.stickyButtons;
    }

    public final FeedbackSurveyModels copy(String toolBarTitle, List<FeedbackSurveySectionModel> sections, FeedbackSurveyStickyModel stickyButtons) {
        AbstractC22676k.m65750j(toolBarTitle, "toolBarTitle");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(stickyButtons, "stickyButtons");
        return new FeedbackSurveyModels(toolBarTitle, sections, stickyButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackSurveyModels)) {
            return false;
        }
        FeedbackSurveyModels feedbackSurveyModels = (FeedbackSurveyModels) other;
        return AbstractC22676k.m65745e(this.toolBarTitle, feedbackSurveyModels.toolBarTitle) && AbstractC22676k.m65745e(this.sections, feedbackSurveyModels.sections) && AbstractC22676k.m65745e(this.stickyButtons, feedbackSurveyModels.stickyButtons);
    }

    public final List<FeedbackSurveySectionModel> getSections() {
        return this.sections;
    }

    public final FeedbackSurveyStickyModel getStickyButtons() {
        return this.stickyButtons;
    }

    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    public int hashCode() {
        return this.stickyButtons.hashCode() + AbstractC11895b.m31983b(this.toolBarTitle.hashCode() * 31, 31, this.sections);
    }

    public String toString() {
        String str = this.toolBarTitle;
        List<FeedbackSurveySectionModel> list = this.sections;
        FeedbackSurveyStickyModel feedbackSurveyStickyModel = this.stickyButtons;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("FeedbackSurveyModels(toolBarTitle=", str, ", sections=", ", stickyButtons=", list);
        sbM94766o.append(feedbackSurveyStickyModel);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public FeedbackSurveyModels(String toolBarTitle, List<FeedbackSurveySectionModel> sections, FeedbackSurveyStickyModel stickyButtons) {
        AbstractC22676k.m65750j(toolBarTitle, "toolBarTitle");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(stickyButtons, "stickyButtons");
        this.toolBarTitle = toolBarTitle;
        this.sections = sections;
        this.stickyButtons = stickyButtons;
    }
}
