package com.whoop.integrations.domain.models.p061v2;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.MarkdownTextModel$$serializer;
import com.whoop.integrations.domain.models.IntegrationsLearnMoreButtonModel;
import com.whoop.integrations.domain.models.IntegrationsLearnMoreButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ej1.C13228a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0080\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u0019R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\bA\u0010?\u001a\u0004\b@\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\bB\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010!R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010E\u0012\u0004\bG\u0010?\u001a\u0004\bF\u0010#R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010%¨\u0006L"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;", "", "", "id", "reportingKey", "backgroundImageUrl", "iconUrl", "title", "description", "providerId", "Lcom/whoop/design/models/MarkdownTextModel;", "descriptionFootnote", "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;", "learnMoreButton", "", "Lcom/whoop/integrations/domain/models/v2/IntegrationsConnectionSectionRowModel;", "connectionSections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/models/MarkdownTextModel;", "component9", "()Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;", "component10", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;Ljava/util/List;)Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$integrations_release", "(Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getReportingKey", "getBackgroundImageUrl", "getIconUrl", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "getProviderId", "Lcom/whoop/design/models/MarkdownTextModel;", "getDescriptionFootnote", "Lcom/whoop/integrations/domain/models/IntegrationsLearnMoreButtonModel;", "getLearnMoreButton", "getLearnMoreButton$annotations", "Ljava/util/List;", "getConnectionSections", "Companion", "$serializer", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IntegrationsDetailsV2ComponentsModel {
    private final String backgroundImageUrl;
    private final List<IntegrationsConnectionSectionRowModel> connectionSections;

    @SerializedName("description_display")
    private final String description;
    private final MarkdownTextModel descriptionFootnote;
    private final String iconUrl;
    private final String id;

    @SerializedName("learn_more")
    private final IntegrationsLearnMoreButtonModel learnMoreButton;
    private final String providerId;
    private final String reportingKey;

    @SerializedName("title_display")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13228a(20))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;", "serializer", "()Lwc3/c;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IntegrationsDetailsV2ComponentsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IntegrationsDetailsV2ComponentsModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, MarkdownTextModel markdownTextModel, IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, IntegrationsDetailsV2ComponentsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.reportingKey = str2;
        this.backgroundImageUrl = str3;
        this.iconUrl = str4;
        this.title = str5;
        this.description = str6;
        this.providerId = str7;
        this.descriptionFootnote = markdownTextModel;
        this.learnMoreButton = integrationsLearnMoreButtonModel;
        this.connectionSections = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(IntegrationsConnectionSectionRowModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntegrationsDetailsV2ComponentsModel copy$default(IntegrationsDetailsV2ComponentsModel integrationsDetailsV2ComponentsModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, MarkdownTextModel markdownTextModel, IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = integrationsDetailsV2ComponentsModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = integrationsDetailsV2ComponentsModel.reportingKey;
        }
        if ((i13 & 4) != 0) {
            str3 = integrationsDetailsV2ComponentsModel.backgroundImageUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = integrationsDetailsV2ComponentsModel.iconUrl;
        }
        if ((i13 & 16) != 0) {
            str5 = integrationsDetailsV2ComponentsModel.title;
        }
        if ((i13 & 32) != 0) {
            str6 = integrationsDetailsV2ComponentsModel.description;
        }
        if ((i13 & 64) != 0) {
            str7 = integrationsDetailsV2ComponentsModel.providerId;
        }
        if ((i13 & 128) != 0) {
            markdownTextModel = integrationsDetailsV2ComponentsModel.descriptionFootnote;
        }
        if ((i13 & 256) != 0) {
            integrationsLearnMoreButtonModel = integrationsDetailsV2ComponentsModel.learnMoreButton;
        }
        if ((i13 & 512) != 0) {
            list = integrationsDetailsV2ComponentsModel.connectionSections;
        }
        IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel2 = integrationsLearnMoreButtonModel;
        List list2 = list;
        String str8 = str7;
        MarkdownTextModel markdownTextModel2 = markdownTextModel;
        String str9 = str5;
        String str10 = str6;
        return integrationsDetailsV2ComponentsModel.copy(str, str2, str3, str4, str9, str10, str8, markdownTextModel2, integrationsLearnMoreButtonModel2, list2);
    }

    @InterfaceC37143h("description_display")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("learn_more")
    public static /* synthetic */ void getLearnMoreButton$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$integrations_release(IntegrationsDetailsV2ComponentsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.reportingKey);
        output.encodeStringElement(serialDesc, 2, self.backgroundImageUrl);
        output.encodeStringElement(serialDesc, 3, self.iconUrl);
        output.encodeStringElement(serialDesc, 4, self.title);
        output.encodeStringElement(serialDesc, 5, self.description);
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.providerId);
        output.encodeNullableSerializableElement(serialDesc, 7, MarkdownTextModel$$serializer.INSTANCE, self.descriptionFootnote);
        output.encodeNullableSerializableElement(serialDesc, 8, IntegrationsLearnMoreButtonModel$$serializer.INSTANCE, self.learnMoreButton);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.connectionSections);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<IntegrationsConnectionSectionRowModel> component10() {
        return this.connectionSections;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReportingKey() {
        return this.reportingKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final MarkdownTextModel getDescriptionFootnote() {
        return this.descriptionFootnote;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final IntegrationsLearnMoreButtonModel getLearnMoreButton() {
        return this.learnMoreButton;
    }

    public final IntegrationsDetailsV2ComponentsModel copy(String id4, String reportingKey, String backgroundImageUrl, String iconUrl, String title, String description, String providerId, MarkdownTextModel descriptionFootnote, IntegrationsLearnMoreButtonModel learnMoreButton, List<IntegrationsConnectionSectionRowModel> connectionSections) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(reportingKey, "reportingKey");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(connectionSections, "connectionSections");
        return new IntegrationsDetailsV2ComponentsModel(id4, reportingKey, backgroundImageUrl, iconUrl, title, description, providerId, descriptionFootnote, learnMoreButton, connectionSections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegrationsDetailsV2ComponentsModel)) {
            return false;
        }
        IntegrationsDetailsV2ComponentsModel integrationsDetailsV2ComponentsModel = (IntegrationsDetailsV2ComponentsModel) other;
        return AbstractC22676k.m65745e(this.id, integrationsDetailsV2ComponentsModel.id) && AbstractC22676k.m65745e(this.reportingKey, integrationsDetailsV2ComponentsModel.reportingKey) && AbstractC22676k.m65745e(this.backgroundImageUrl, integrationsDetailsV2ComponentsModel.backgroundImageUrl) && AbstractC22676k.m65745e(this.iconUrl, integrationsDetailsV2ComponentsModel.iconUrl) && AbstractC22676k.m65745e(this.title, integrationsDetailsV2ComponentsModel.title) && AbstractC22676k.m65745e(this.description, integrationsDetailsV2ComponentsModel.description) && AbstractC22676k.m65745e(this.providerId, integrationsDetailsV2ComponentsModel.providerId) && AbstractC22676k.m65745e(this.descriptionFootnote, integrationsDetailsV2ComponentsModel.descriptionFootnote) && AbstractC22676k.m65745e(this.learnMoreButton, integrationsDetailsV2ComponentsModel.learnMoreButton) && AbstractC22676k.m65745e(this.connectionSections, integrationsDetailsV2ComponentsModel.connectionSections);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final List<IntegrationsConnectionSectionRowModel> getConnectionSections() {
        return this.connectionSections;
    }

    public final String getDescription() {
        return this.description;
    }

    public final MarkdownTextModel getDescriptionFootnote() {
        return this.descriptionFootnote;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final IntegrationsLearnMoreButtonModel getLearnMoreButton() {
        return this.learnMoreButton;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public final String getReportingKey() {
        return this.reportingKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.reportingKey), 31, this.backgroundImageUrl), 31, this.iconUrl), 31, this.title), 31, this.description);
        String str = this.providerId;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        MarkdownTextModel markdownTextModel = this.descriptionFootnote;
        int iHashCode2 = (iHashCode + (markdownTextModel == null ? 0 : markdownTextModel.hashCode())) * 31;
        IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel = this.learnMoreButton;
        return this.connectionSections.hashCode() + ((iHashCode2 + (integrationsLearnMoreButtonModel != null ? integrationsLearnMoreButtonModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.reportingKey;
        String str3 = this.backgroundImageUrl;
        String str4 = this.iconUrl;
        String str5 = this.title;
        String str6 = this.description;
        String str7 = this.providerId;
        MarkdownTextModel markdownTextModel = this.descriptionFootnote;
        IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel = this.learnMoreButton;
        List<IntegrationsConnectionSectionRowModel> list = this.connectionSections;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("IntegrationsDetailsV2ComponentsModel(id=", str, ", reportingKey=", str2, ", backgroundImageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", iconUrl=", str4, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", description=", str6, ", providerId=");
        sbM32001t.append(str7);
        sbM32001t.append(", descriptionFootnote=");
        sbM32001t.append(markdownTextModel);
        sbM32001t.append(", learnMoreButton=");
        sbM32001t.append(integrationsLearnMoreButtonModel);
        sbM32001t.append(", connectionSections=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public IntegrationsDetailsV2ComponentsModel(String id4, String reportingKey, String backgroundImageUrl, String iconUrl, String title, String description, String str, MarkdownTextModel markdownTextModel, IntegrationsLearnMoreButtonModel integrationsLearnMoreButtonModel, List<IntegrationsConnectionSectionRowModel> connectionSections) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(reportingKey, "reportingKey");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(connectionSections, "connectionSections");
        this.id = id4;
        this.reportingKey = reportingKey;
        this.backgroundImageUrl = backgroundImageUrl;
        this.iconUrl = iconUrl;
        this.title = title;
        this.description = description;
        this.providerId = str;
        this.descriptionFootnote = markdownTextModel;
        this.learnMoreButton = integrationsLearnMoreButtonModel;
        this.connectionSections = connectionSections;
    }
}
