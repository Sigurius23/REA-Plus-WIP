package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w70.C36870a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jn\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b=\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b>\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010*¨\u0006C"}, m65681d2 = {"Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleIcon", "title", "subtitle", "", "Lcom/whoop/design/models/items/ContributorSectionModel;", "contributorSections", "Lcom/whoop/design/models/items/SecondaryActionButtonModel;", "secondaryActionButton", "explanationTitle", "explanation", "Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionStyleModel;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryActionButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionStyleModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryActionButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionStyleModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/design/models/items/SecondaryActionButtonModel;", "component6", "component7", "component8", "()Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionStyleModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryActionButtonModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionStyleModel;)Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleIcon", "getTitle", "getSubtitle", "Ljava/util/List;", "getContributorSections", "Lcom/whoop/design/models/items/SecondaryActionButtonModel;", "getSecondaryActionButton", "getExplanationTitle", "getExplanation", "Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionStyleModel;", "getStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiWeeklyPlanSuggestionModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<ContributorSectionModel> contributorSections;
    private final String explanation;
    private final String explanationTitle;
    private final SecondaryActionButtonModel secondaryActionButton;
    private final AiWeeklyPlanSuggestionStyleModel style;
    private final String subtitle;
    private final String title;
    private final String titleIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiWeeklyPlanSuggestionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36870a(14)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36870a(15))};
    }

    public /* synthetic */ AiWeeklyPlanSuggestionModel(int i13, String str, String str2, String str3, List list, SecondaryActionButtonModel secondaryActionButtonModel, String str4, String str5, AiWeeklyPlanSuggestionStyleModel aiWeeklyPlanSuggestionStyleModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (254 != (i13 & 254)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 254, AiWeeklyPlanSuggestionModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.titleIcon = null;
        } else {
            this.titleIcon = str;
        }
        this.title = str2;
        this.subtitle = str3;
        this.contributorSections = list;
        this.secondaryActionButton = secondaryActionButtonModel;
        this.explanationTitle = str4;
        this.explanation = str5;
        this.style = aiWeeklyPlanSuggestionStyleModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ContributorSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return AiWeeklyPlanSuggestionStyleModel.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiWeeklyPlanSuggestionModel copy$default(AiWeeklyPlanSuggestionModel aiWeeklyPlanSuggestionModel, String str, String str2, String str3, List list, SecondaryActionButtonModel secondaryActionButtonModel, String str4, String str5, AiWeeklyPlanSuggestionStyleModel aiWeeklyPlanSuggestionStyleModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiWeeklyPlanSuggestionModel.titleIcon;
        }
        if ((i13 & 2) != 0) {
            str2 = aiWeeklyPlanSuggestionModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = aiWeeklyPlanSuggestionModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            list = aiWeeklyPlanSuggestionModel.contributorSections;
        }
        if ((i13 & 16) != 0) {
            secondaryActionButtonModel = aiWeeklyPlanSuggestionModel.secondaryActionButton;
        }
        if ((i13 & 32) != 0) {
            str4 = aiWeeklyPlanSuggestionModel.explanationTitle;
        }
        if ((i13 & 64) != 0) {
            str5 = aiWeeklyPlanSuggestionModel.explanation;
        }
        if ((i13 & 128) != 0) {
            aiWeeklyPlanSuggestionStyleModel = aiWeeklyPlanSuggestionModel.style;
        }
        String str6 = str5;
        AiWeeklyPlanSuggestionStyleModel aiWeeklyPlanSuggestionStyleModel2 = aiWeeklyPlanSuggestionStyleModel;
        SecondaryActionButtonModel secondaryActionButtonModel2 = secondaryActionButtonModel;
        String str7 = str4;
        return aiWeeklyPlanSuggestionModel.copy(str, str2, str3, list, secondaryActionButtonModel2, str7, str6, aiWeeklyPlanSuggestionStyleModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AiWeeklyPlanSuggestionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.titleIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.titleIcon);
        }
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.contributorSections);
        output.encodeSerializableElement(serialDesc, 4, SecondaryActionButtonModel$$serializer.INSTANCE, self.secondaryActionButton);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.explanationTitle);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.explanation);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<ContributorSectionModel> component4() {
        return this.contributorSections;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SecondaryActionButtonModel getSecondaryActionButton() {
        return this.secondaryActionButton;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExplanationTitle() {
        return this.explanationTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExplanation() {
        return this.explanation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AiWeeklyPlanSuggestionStyleModel getStyle() {
        return this.style;
    }

    public final AiWeeklyPlanSuggestionModel copy(String titleIcon, String title, String subtitle, List<ContributorSectionModel> contributorSections, SecondaryActionButtonModel secondaryActionButton, String explanationTitle, String explanation, AiWeeklyPlanSuggestionStyleModel style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(contributorSections, "contributorSections");
        AbstractC22676k.m65750j(secondaryActionButton, "secondaryActionButton");
        return new AiWeeklyPlanSuggestionModel(titleIcon, title, subtitle, contributorSections, secondaryActionButton, explanationTitle, explanation, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiWeeklyPlanSuggestionModel)) {
            return false;
        }
        AiWeeklyPlanSuggestionModel aiWeeklyPlanSuggestionModel = (AiWeeklyPlanSuggestionModel) other;
        return AbstractC22676k.m65745e(this.titleIcon, aiWeeklyPlanSuggestionModel.titleIcon) && AbstractC22676k.m65745e(this.title, aiWeeklyPlanSuggestionModel.title) && AbstractC22676k.m65745e(this.subtitle, aiWeeklyPlanSuggestionModel.subtitle) && AbstractC22676k.m65745e(this.contributorSections, aiWeeklyPlanSuggestionModel.contributorSections) && AbstractC22676k.m65745e(this.secondaryActionButton, aiWeeklyPlanSuggestionModel.secondaryActionButton) && AbstractC22676k.m65745e(this.explanationTitle, aiWeeklyPlanSuggestionModel.explanationTitle) && AbstractC22676k.m65745e(this.explanation, aiWeeklyPlanSuggestionModel.explanation) && this.style == aiWeeklyPlanSuggestionModel.style;
    }

    public final List<ContributorSectionModel> getContributorSections() {
        return this.contributorSections;
    }

    public final String getExplanation() {
        return this.explanation;
    }

    public final String getExplanationTitle() {
        return this.explanationTitle;
    }

    public final SecondaryActionButtonModel getSecondaryActionButton() {
        return this.secondaryActionButton;
    }

    public final AiWeeklyPlanSuggestionStyleModel getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleIcon() {
        return this.titleIcon;
    }

    public int hashCode() {
        String str = this.titleIcon;
        int iHashCode = (this.secondaryActionButton.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.subtitle), 31, this.contributorSections)) * 31;
        String str2 = this.explanationTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.explanation;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AiWeeklyPlanSuggestionStyleModel aiWeeklyPlanSuggestionStyleModel = this.style;
        return iHashCode3 + (aiWeeklyPlanSuggestionStyleModel != null ? aiWeeklyPlanSuggestionStyleModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.titleIcon;
        String str2 = this.title;
        String str3 = this.subtitle;
        List<ContributorSectionModel> list = this.contributorSections;
        SecondaryActionButtonModel secondaryActionButtonModel = this.secondaryActionButton;
        String str4 = this.explanationTitle;
        String str5 = this.explanation;
        AiWeeklyPlanSuggestionStyleModel aiWeeklyPlanSuggestionStyleModel = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiWeeklyPlanSuggestionModel(titleIcon=", str, ", title=", str2, ", subtitle=");
        AbstractC36095b.m114694v(str3, ", contributorSections=", ", secondaryActionButton=", sbM32001t, list);
        sbM32001t.append(secondaryActionButtonModel);
        sbM32001t.append(", explanationTitle=");
        sbM32001t.append(str4);
        sbM32001t.append(", explanation=");
        sbM32001t.append(str5);
        sbM32001t.append(", style=");
        sbM32001t.append(aiWeeklyPlanSuggestionStyleModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public AiWeeklyPlanSuggestionModel(String str, String title, String subtitle, List<ContributorSectionModel> contributorSections, SecondaryActionButtonModel secondaryActionButton, String str2, String str3, AiWeeklyPlanSuggestionStyleModel aiWeeklyPlanSuggestionStyleModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(contributorSections, "contributorSections");
        AbstractC22676k.m65750j(secondaryActionButton, "secondaryActionButton");
        this.titleIcon = str;
        this.title = title;
        this.subtitle = subtitle;
        this.contributorSections = contributorSections;
        this.secondaryActionButton = secondaryActionButton;
        this.explanationTitle = str2;
        this.explanation = str3;
        this.style = aiWeeklyPlanSuggestionStyleModel;
    }

    public /* synthetic */ AiWeeklyPlanSuggestionModel(String str, String str2, String str3, List list, SecondaryActionButtonModel secondaryActionButtonModel, String str4, String str5, AiWeeklyPlanSuggestionStyleModel aiWeeklyPlanSuggestionStyleModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, str3, list, secondaryActionButtonModel, str4, str5, aiWeeklyPlanSuggestionStyleModel);
    }
}
