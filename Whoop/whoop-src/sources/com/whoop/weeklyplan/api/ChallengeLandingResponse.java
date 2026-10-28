package com.whoop.weeklyplan.api;

import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.coacheverywherecommon.models.AiContextMetadata$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mq2.C25888a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J^\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010\u0016R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010;\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010\u001aR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010\u001cR&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010A\u0012\u0004\bC\u00106\u001a\u0004\bB\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bF\u00106\u001a\u0004\bE\u0010 ¨\u0006I"}, m65681d2 = {"Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;", "", "", "navigationTitle", "heroImageUrl", "januaryJumpstartImageUrl", "Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;", "headerSection", "Lcom/whoop/design/models/DesignSystemModel;", "customPlanCard", "", "items", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;", "component5", "()Lcom/whoop/design/models/DesignSystemModel;", "component6", "()Ljava/util/List;", "component7", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getNavigationTitle", "getNavigationTitle$annotations", "()V", "getHeroImageUrl", "getHeroImageUrl$annotations", "getJanuaryJumpstartImageUrl", "getJanuaryJumpstartImageUrl$annotations", "Lcom/whoop/weeklyplan/api/ChallengeLandingHeaderSection;", "getHeaderSection", "getHeaderSection$annotations", "Lcom/whoop/design/models/DesignSystemModel;", "getCustomPlanCard", "getCustomPlanCard$annotations", "Ljava/util/List;", "getItems", "getItems$annotations", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "getAiContextMetadata", "getAiContextMetadata$annotations", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChallengeLandingResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final AiContextMetadata aiContextMetadata;
    private final DesignSystemModel customPlanCard;
    private final ChallengeLandingHeaderSection headerSection;
    private final String heroImageUrl;
    private final List<DesignSystemModel> items;
    private final String januaryJumpstartImageUrl;
    private final String navigationTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/api/ChallengeLandingResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChallengeLandingResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C25888a(5)), AbstractC30060g.m92087G(enumC23463i, new C25888a(6)), AbstractC30060g.m92087G(enumC23463i, new C25888a(7))};
    }

    public /* synthetic */ ChallengeLandingResponse(int i13, String str, String str2, String str3, ChallengeLandingHeaderSection challengeLandingHeaderSection, DesignSystemModel designSystemModel, List list, AiContextMetadata aiContextMetadata, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ChallengeLandingResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.heroImageUrl = str2;
        this.januaryJumpstartImageUrl = str3;
        this.headerSection = challengeLandingHeaderSection;
        this.customPlanCard = designSystemModel;
        this.items = list;
        this.aiContextMetadata = aiContextMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(List.class), new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0])), new InterfaceC37138c[]{new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0])});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiContextMetadata.class), AbstractC38195a.m122336d(AiContextMetadata$$serializer.INSTANCE), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallengeLandingResponse copy$default(ChallengeLandingResponse challengeLandingResponse, String str, String str2, String str3, ChallengeLandingHeaderSection challengeLandingHeaderSection, DesignSystemModel designSystemModel, List list, AiContextMetadata aiContextMetadata, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = challengeLandingResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = challengeLandingResponse.heroImageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = challengeLandingResponse.januaryJumpstartImageUrl;
        }
        if ((i13 & 8) != 0) {
            challengeLandingHeaderSection = challengeLandingResponse.headerSection;
        }
        if ((i13 & 16) != 0) {
            designSystemModel = challengeLandingResponse.customPlanCard;
        }
        if ((i13 & 32) != 0) {
            list = challengeLandingResponse.items;
        }
        if ((i13 & 64) != 0) {
            aiContextMetadata = challengeLandingResponse.aiContextMetadata;
        }
        List list2 = list;
        AiContextMetadata aiContextMetadata2 = aiContextMetadata;
        DesignSystemModel designSystemModel2 = designSystemModel;
        String str4 = str3;
        return challengeLandingResponse.copy(str, str2, str4, challengeLandingHeaderSection, designSystemModel2, list2, aiContextMetadata2);
    }

    @InterfaceC37143h("ai_context_metadata")
    public static /* synthetic */ void getAiContextMetadata$annotations() {
    }

    @InterfaceC37143h("custom_plan_card")
    public static /* synthetic */ void getCustomPlanCard$annotations() {
    }

    @InterfaceC37143h("header_section")
    public static /* synthetic */ void getHeaderSection$annotations() {
    }

    @InterfaceC37143h("hero_image_url")
    public static /* synthetic */ void getHeroImageUrl$annotations() {
    }

    @InterfaceC37143h("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @InterfaceC37143h("january_jumpstart_image_url")
    public static /* synthetic */ void getJanuaryJumpstartImageUrl$annotations() {
    }

    @InterfaceC37143h("navigation_title")
    public static /* synthetic */ void getNavigationTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(ChallengeLandingResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeStringElement(serialDesc, 1, self.heroImageUrl);
        output.encodeStringElement(serialDesc, 2, self.januaryJumpstartImageUrl);
        output.encodeSerializableElement(serialDesc, 3, ChallengeLandingHeaderSection$$serializer.INSTANCE, self.headerSection);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.customPlanCard);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.aiContextMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeroImageUrl() {
        return this.heroImageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getJanuaryJumpstartImageUrl() {
        return this.januaryJumpstartImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChallengeLandingHeaderSection getHeaderSection() {
        return this.headerSection;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DesignSystemModel getCustomPlanCard() {
        return this.customPlanCard;
    }

    public final List<DesignSystemModel> component6() {
        return this.items;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AiContextMetadata getAiContextMetadata() {
        return this.aiContextMetadata;
    }

    public final ChallengeLandingResponse copy(String navigationTitle, String heroImageUrl, String januaryJumpstartImageUrl, ChallengeLandingHeaderSection headerSection, DesignSystemModel customPlanCard, List<? extends DesignSystemModel> items, AiContextMetadata aiContextMetadata) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(heroImageUrl, "heroImageUrl");
        AbstractC22676k.m65750j(januaryJumpstartImageUrl, "januaryJumpstartImageUrl");
        AbstractC22676k.m65750j(headerSection, "headerSection");
        AbstractC22676k.m65750j(customPlanCard, "customPlanCard");
        AbstractC22676k.m65750j(items, "items");
        return new ChallengeLandingResponse(navigationTitle, heroImageUrl, januaryJumpstartImageUrl, headerSection, customPlanCard, items, aiContextMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeLandingResponse)) {
            return false;
        }
        ChallengeLandingResponse challengeLandingResponse = (ChallengeLandingResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, challengeLandingResponse.navigationTitle) && AbstractC22676k.m65745e(this.heroImageUrl, challengeLandingResponse.heroImageUrl) && AbstractC22676k.m65745e(this.januaryJumpstartImageUrl, challengeLandingResponse.januaryJumpstartImageUrl) && AbstractC22676k.m65745e(this.headerSection, challengeLandingResponse.headerSection) && AbstractC22676k.m65745e(this.customPlanCard, challengeLandingResponse.customPlanCard) && AbstractC22676k.m65745e(this.items, challengeLandingResponse.items) && AbstractC22676k.m65745e(this.aiContextMetadata, challengeLandingResponse.aiContextMetadata);
    }

    public final AiContextMetadata getAiContextMetadata() {
        return this.aiContextMetadata;
    }

    public final DesignSystemModel getCustomPlanCard() {
        return this.customPlanCard;
    }

    public final ChallengeLandingHeaderSection getHeaderSection() {
        return this.headerSection;
    }

    public final String getHeroImageUrl() {
        return this.heroImageUrl;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getJanuaryJumpstartImageUrl() {
        return this.januaryJumpstartImageUrl;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.customPlanCard.hashCode() + ((this.headerSection.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationTitle.hashCode() * 31, 31, this.heroImageUrl), 31, this.januaryJumpstartImageUrl)) * 31)) * 31, 31, this.items);
        AiContextMetadata aiContextMetadata = this.aiContextMetadata;
        return iM31983b + (aiContextMetadata == null ? 0 : aiContextMetadata.hashCode());
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.heroImageUrl;
        String str3 = this.januaryJumpstartImageUrl;
        ChallengeLandingHeaderSection challengeLandingHeaderSection = this.headerSection;
        DesignSystemModel designSystemModel = this.customPlanCard;
        List<DesignSystemModel> list = this.items;
        AiContextMetadata aiContextMetadata = this.aiContextMetadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChallengeLandingResponse(navigationTitle=", str, ", heroImageUrl=", str2, ", januaryJumpstartImageUrl=");
        sbM32001t.append(str3);
        sbM32001t.append(", headerSection=");
        sbM32001t.append(challengeLandingHeaderSection);
        sbM32001t.append(", customPlanCard=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(", aiContextMetadata=");
        sbM32001t.append(aiContextMetadata);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChallengeLandingResponse(String navigationTitle, String heroImageUrl, String januaryJumpstartImageUrl, ChallengeLandingHeaderSection headerSection, DesignSystemModel customPlanCard, List<? extends DesignSystemModel> items, AiContextMetadata aiContextMetadata) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(heroImageUrl, "heroImageUrl");
        AbstractC22676k.m65750j(januaryJumpstartImageUrl, "januaryJumpstartImageUrl");
        AbstractC22676k.m65750j(headerSection, "headerSection");
        AbstractC22676k.m65750j(customPlanCard, "customPlanCard");
        AbstractC22676k.m65750j(items, "items");
        this.navigationTitle = navigationTitle;
        this.heroImageUrl = heroImageUrl;
        this.januaryJumpstartImageUrl = januaryJumpstartImageUrl;
        this.headerSection = headerSection;
        this.customPlanCard = customPlanCard;
        this.items = items;
        this.aiContextMetadata = aiContextMetadata;
    }
}
