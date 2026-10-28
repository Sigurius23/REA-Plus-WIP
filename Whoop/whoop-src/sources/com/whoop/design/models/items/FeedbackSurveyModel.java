package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.TitleSubTitleModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36957d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/design/models/items/FeedbackSurveyModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/design/models/TitleSubTitleModel;", "titleSubtitle", "", "Lcom/whoop/design/models/items/InteractiveTileModel;", "options", "Lcom/whoop/design/models/items/TextAreaModel;", "textArea", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/TitleSubTitleModel;Ljava/util/List;Lcom/whoop/design/models/items/TextAreaModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/TitleSubTitleModel;Ljava/util/List;Lcom/whoop/design/models/items/TextAreaModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/FeedbackSurveyModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/TitleSubTitleModel;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/design/models/items/TextAreaModel;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/TitleSubTitleModel;Ljava/util/List;Lcom/whoop/design/models/items/TextAreaModel;)Lcom/whoop/design/models/items/FeedbackSurveyModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/TitleSubTitleModel;", "getTitleSubtitle", "Ljava/util/List;", "getOptions", "Lcom/whoop/design/models/items/TextAreaModel;", "getTextArea", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeedbackSurveyModel implements DesignSystemModel {
    private final String id;
    private final List<InteractiveTileModel> options;
    private final TextAreaModel textArea;
    private final TitleSubTitleModel titleSubtitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36957d(15)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/FeedbackSurveyModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/FeedbackSurveyModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeedbackSurveyModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeedbackSurveyModel(int i13, String str, TitleSubTitleModel titleSubTitleModel, List list, TextAreaModel textAreaModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, FeedbackSurveyModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.titleSubtitle = titleSubTitleModel;
        this.options = list;
        this.textArea = textAreaModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(InteractiveTileModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackSurveyModel copy$default(FeedbackSurveyModel feedbackSurveyModel, String str, TitleSubTitleModel titleSubTitleModel, List list, TextAreaModel textAreaModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = feedbackSurveyModel.id;
        }
        if ((i13 & 2) != 0) {
            titleSubTitleModel = feedbackSurveyModel.titleSubtitle;
        }
        if ((i13 & 4) != 0) {
            list = feedbackSurveyModel.options;
        }
        if ((i13 & 8) != 0) {
            textAreaModel = feedbackSurveyModel.textArea;
        }
        return feedbackSurveyModel.copy(str, titleSubTitleModel, list, textAreaModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FeedbackSurveyModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        output.encodeSerializableElement(serialDesc, 1, TitleSubTitleModel$$serializer.INSTANCE, self.titleSubtitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.options);
        output.encodeNullableSerializableElement(serialDesc, 3, TextAreaModel$$serializer.INSTANCE, self.textArea);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TitleSubTitleModel getTitleSubtitle() {
        return this.titleSubtitle;
    }

    public final List<InteractiveTileModel> component3() {
        return this.options;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextAreaModel getTextArea() {
        return this.textArea;
    }

    public final FeedbackSurveyModel copy(String id4, TitleSubTitleModel titleSubtitle, List<InteractiveTileModel> options, TextAreaModel textArea) {
        AbstractC22676k.m65750j(titleSubtitle, "titleSubtitle");
        AbstractC22676k.m65750j(options, "options");
        return new FeedbackSurveyModel(id4, titleSubtitle, options, textArea);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackSurveyModel)) {
            return false;
        }
        FeedbackSurveyModel feedbackSurveyModel = (FeedbackSurveyModel) other;
        return AbstractC22676k.m65745e(this.id, feedbackSurveyModel.id) && AbstractC22676k.m65745e(this.titleSubtitle, feedbackSurveyModel.titleSubtitle) && AbstractC22676k.m65745e(this.options, feedbackSurveyModel.options) && AbstractC22676k.m65745e(this.textArea, feedbackSurveyModel.textArea);
    }

    public final String getId() {
        return this.id;
    }

    public final List<InteractiveTileModel> getOptions() {
        return this.options;
    }

    public final TextAreaModel getTextArea() {
        return this.textArea;
    }

    public final TitleSubTitleModel getTitleSubtitle() {
        return this.titleSubtitle;
    }

    public int hashCode() {
        String str = this.id;
        int iM31983b = AbstractC11895b.m31983b((this.titleSubtitle.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.options);
        TextAreaModel textAreaModel = this.textArea;
        return iM31983b + (textAreaModel != null ? textAreaModel.hashCode() : 0);
    }

    public String toString() {
        return "FeedbackSurveyModel(id=" + this.id + ", titleSubtitle=" + this.titleSubtitle + ", options=" + this.options + ", textArea=" + this.textArea + ")";
    }

    public FeedbackSurveyModel(String str, TitleSubTitleModel titleSubtitle, List<InteractiveTileModel> options, TextAreaModel textAreaModel) {
        AbstractC22676k.m65750j(titleSubtitle, "titleSubtitle");
        AbstractC22676k.m65750j(options, "options");
        this.id = str;
        this.titleSubtitle = titleSubtitle;
        this.options = options;
        this.textArea = textAreaModel;
    }
}
