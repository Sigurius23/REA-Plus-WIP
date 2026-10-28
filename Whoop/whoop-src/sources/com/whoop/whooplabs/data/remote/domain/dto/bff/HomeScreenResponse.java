package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import java.lang.annotation.Annotation;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!Jn\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00104\u0012\u0004\b9\u00107\u001a\u0004\b8\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b;\u00107\u001a\u0004\b:\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010\u0017R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\b@\u00107\u001a\u0004\b?\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010A\u0012\u0004\bC\u00107\u001a\u0004\bB\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\bE\u00107\u001a\u0004\bD\u0010\u0017R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010F\u0012\u0004\bH\u00107\u001a\u0004\bG\u0010!¨\u0006K"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;", "", "", "pageTitleDisplay", "pageHeaderTitle", "pageHeaderBody", "pageBackgroundImageUrl", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;", "campaignSections", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeImpactSectionResponse;", "impactSection", "footerText", "Lcom/whoop/design/models/DesignSystemModel;", "footer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeImpactSectionResponse;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeImpactSectionResponse;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeImpactSectionResponse;", "component7", "component8", "()Lcom/whoop/design/models/DesignSystemModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeImpactSectionResponse;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getPageTitleDisplay", "getPageTitleDisplay$annotations", "()V", "getPageHeaderTitle", "getPageHeaderTitle$annotations", "getPageHeaderBody", "getPageHeaderBody$annotations", "getPageBackgroundImageUrl", "getPageBackgroundImageUrl$annotations", "Ljava/util/List;", "getCampaignSections", "getCampaignSections$annotations", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeImpactSectionResponse;", "getImpactSection", "getImpactSection$annotations", "getFooterText", "getFooterText$annotations", "Lcom/whoop/design/models/DesignSystemModel;", "getFooter", "getFooter$annotations", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HomeScreenResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<CampaignSectionResponseV2> campaignSections;
    private final DesignSystemModel footer;
    private final String footerText;
    private final HomeImpactSectionResponse impactSection;
    private final String pageBackgroundImageUrl;
    private final String pageHeaderBody;
    private final String pageHeaderTitle;
    private final String pageTitleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/HomeScreenResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HomeScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12430a(5)), null, null, AbstractC30060g.m92087G(enumC23463i, new C12430a(6))};
    }

    public /* synthetic */ HomeScreenResponse(int i13, String str, String str2, String str3, String str4, List list, HomeImpactSectionResponse homeImpactSectionResponse, String str5, DesignSystemModel designSystemModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, HomeScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.pageTitleDisplay = str;
        this.pageHeaderTitle = str2;
        this.pageHeaderBody = str3;
        this.pageBackgroundImageUrl = str4;
        this.campaignSections = list;
        this.impactSection = homeImpactSectionResponse;
        this.footerText = str5;
        this.footer = designSystemModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CampaignSectionResponseV2$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeScreenResponse copy$default(HomeScreenResponse homeScreenResponse, String str, String str2, String str3, String str4, List list, HomeImpactSectionResponse homeImpactSectionResponse, String str5, DesignSystemModel designSystemModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = homeScreenResponse.pageTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = homeScreenResponse.pageHeaderTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = homeScreenResponse.pageHeaderBody;
        }
        if ((i13 & 8) != 0) {
            str4 = homeScreenResponse.pageBackgroundImageUrl;
        }
        if ((i13 & 16) != 0) {
            list = homeScreenResponse.campaignSections;
        }
        if ((i13 & 32) != 0) {
            homeImpactSectionResponse = homeScreenResponse.impactSection;
        }
        if ((i13 & 64) != 0) {
            str5 = homeScreenResponse.footerText;
        }
        if ((i13 & 128) != 0) {
            designSystemModel = homeScreenResponse.footer;
        }
        String str6 = str5;
        DesignSystemModel designSystemModel2 = designSystemModel;
        List list2 = list;
        HomeImpactSectionResponse homeImpactSectionResponse2 = homeImpactSectionResponse;
        return homeScreenResponse.copy(str, str2, str3, str4, list2, homeImpactSectionResponse2, str6, designSystemModel2);
    }

    @InterfaceC37143h("campaign_sections")
    public static /* synthetic */ void getCampaignSections$annotations() {
    }

    @InterfaceC37143h("footer_carousel")
    public static /* synthetic */ void getFooter$annotations() {
    }

    @InterfaceC37143h("footer_text_display")
    public static /* synthetic */ void getFooterText$annotations() {
    }

    @InterfaceC37143h("impact_section")
    public static /* synthetic */ void getImpactSection$annotations() {
    }

    @InterfaceC37143h("page_background_image_url")
    public static /* synthetic */ void getPageBackgroundImageUrl$annotations() {
    }

    @InterfaceC37143h("page_header_body")
    public static /* synthetic */ void getPageHeaderBody$annotations() {
    }

    @InterfaceC37143h("page_header_title")
    public static /* synthetic */ void getPageHeaderTitle$annotations() {
    }

    @InterfaceC37143h("page_title_display")
    public static /* synthetic */ void getPageTitleDisplay$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(HomeScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.pageTitleDisplay);
        output.encodeStringElement(serialDesc, 1, self.pageHeaderTitle);
        output.encodeStringElement(serialDesc, 2, self.pageHeaderBody);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.pageBackgroundImageUrl);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.campaignSections);
        output.encodeNullableSerializableElement(serialDesc, 5, HomeImpactSectionResponse$$serializer.INSTANCE, self.impactSection);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.footerText);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.footer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPageTitleDisplay() {
        return this.pageTitleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPageHeaderTitle() {
        return this.pageHeaderTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPageHeaderBody() {
        return this.pageHeaderBody;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPageBackgroundImageUrl() {
        return this.pageBackgroundImageUrl;
    }

    public final List<CampaignSectionResponseV2> component5() {
        return this.campaignSections;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HomeImpactSectionResponse getImpactSection() {
        return this.impactSection;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DesignSystemModel getFooter() {
        return this.footer;
    }

    public final HomeScreenResponse copy(String pageTitleDisplay, String pageHeaderTitle, String pageHeaderBody, String pageBackgroundImageUrl, List<CampaignSectionResponseV2> campaignSections, HomeImpactSectionResponse impactSection, String footerText, DesignSystemModel footer) {
        AbstractC22676k.m65750j(pageTitleDisplay, "pageTitleDisplay");
        AbstractC22676k.m65750j(pageHeaderTitle, "pageHeaderTitle");
        AbstractC22676k.m65750j(pageHeaderBody, "pageHeaderBody");
        AbstractC22676k.m65750j(campaignSections, "campaignSections");
        return new HomeScreenResponse(pageTitleDisplay, pageHeaderTitle, pageHeaderBody, pageBackgroundImageUrl, campaignSections, impactSection, footerText, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeScreenResponse)) {
            return false;
        }
        HomeScreenResponse homeScreenResponse = (HomeScreenResponse) other;
        return AbstractC22676k.m65745e(this.pageTitleDisplay, homeScreenResponse.pageTitleDisplay) && AbstractC22676k.m65745e(this.pageHeaderTitle, homeScreenResponse.pageHeaderTitle) && AbstractC22676k.m65745e(this.pageHeaderBody, homeScreenResponse.pageHeaderBody) && AbstractC22676k.m65745e(this.pageBackgroundImageUrl, homeScreenResponse.pageBackgroundImageUrl) && AbstractC22676k.m65745e(this.campaignSections, homeScreenResponse.campaignSections) && AbstractC22676k.m65745e(this.impactSection, homeScreenResponse.impactSection) && AbstractC22676k.m65745e(this.footerText, homeScreenResponse.footerText) && AbstractC22676k.m65745e(this.footer, homeScreenResponse.footer);
    }

    public final List<CampaignSectionResponseV2> getCampaignSections() {
        return this.campaignSections;
    }

    public final DesignSystemModel getFooter() {
        return this.footer;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final HomeImpactSectionResponse getImpactSection() {
        return this.impactSection;
    }

    public final String getPageBackgroundImageUrl() {
        return this.pageBackgroundImageUrl;
    }

    public final String getPageHeaderBody() {
        return this.pageHeaderBody;
    }

    public final String getPageHeaderTitle() {
        return this.pageHeaderTitle;
    }

    public final String getPageTitleDisplay() {
        return this.pageTitleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.pageTitleDisplay.hashCode() * 31, 31, this.pageHeaderTitle), 31, this.pageHeaderBody);
        String str = this.pageBackgroundImageUrl;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.campaignSections);
        HomeImpactSectionResponse homeImpactSectionResponse = this.impactSection;
        int iHashCode = (iM31983b + (homeImpactSectionResponse == null ? 0 : homeImpactSectionResponse.hashCode())) * 31;
        String str2 = this.footerText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.footer;
        return iHashCode2 + (designSystemModel != null ? designSystemModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.pageTitleDisplay;
        String str2 = this.pageHeaderTitle;
        String str3 = this.pageHeaderBody;
        String str4 = this.pageBackgroundImageUrl;
        List<CampaignSectionResponseV2> list = this.campaignSections;
        HomeImpactSectionResponse homeImpactSectionResponse = this.impactSection;
        String str5 = this.footerText;
        DesignSystemModel designSystemModel = this.footer;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HomeScreenResponse(pageTitleDisplay=", str, ", pageHeaderTitle=", str2, ", pageHeaderBody=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", pageBackgroundImageUrl=", str4, ", campaignSections=");
        sbM32001t.append(list);
        sbM32001t.append(", impactSection=");
        sbM32001t.append(homeImpactSectionResponse);
        sbM32001t.append(", footerText=");
        sbM32001t.append(str5);
        sbM32001t.append(", footer=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HomeScreenResponse(String pageTitleDisplay, String pageHeaderTitle, String pageHeaderBody, String str, List<CampaignSectionResponseV2> campaignSections, HomeImpactSectionResponse homeImpactSectionResponse, String str2, DesignSystemModel designSystemModel) {
        AbstractC22676k.m65750j(pageTitleDisplay, "pageTitleDisplay");
        AbstractC22676k.m65750j(pageHeaderTitle, "pageHeaderTitle");
        AbstractC22676k.m65750j(pageHeaderBody, "pageHeaderBody");
        AbstractC22676k.m65750j(campaignSections, "campaignSections");
        this.pageTitleDisplay = pageTitleDisplay;
        this.pageHeaderTitle = pageHeaderTitle;
        this.pageHeaderBody = pageHeaderBody;
        this.pageBackgroundImageUrl = str;
        this.campaignSections = campaignSections;
        this.impactSection = homeImpactSectionResponse;
        this.footerText = str2;
        this.footer = designSystemModel;
    }
}
