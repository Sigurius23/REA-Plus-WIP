package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
import hc3.AbstractC17176i;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ^\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001dR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b6\u00101\u001a\u0004\b5\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b<\u0010\u001d¨\u0006?"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;", "", "", "title", "description", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponse;", "campaignSection", "footerText", "Lcom/whoop/design/models/DesignSystemModel;", "footer", "emptyStateText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/whoop/design/models/DesignSystemModel;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "Ljava/util/List;", "getCampaignSection", "getCampaignSection$annotations", "getFooterText", "getFooterText$annotations", "Lcom/whoop/design/models/DesignSystemModel;", "getFooter", "getFooter$annotations", "getEmptyStateText", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CampaignListScreenResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<CampaignSectionResponse> campaignSection;
    private final String description;
    private final String emptyStateText;
    private final DesignSystemModel footer;
    private final String footerText;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignListScreenResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CampaignListScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C12293a(20)), null, AbstractC30060g.m92087G(enumC23463i, new C12293a(21)), null};
    }

    public /* synthetic */ CampaignListScreenResponse(int i13, String str, String str2, List list, String str3, DesignSystemModel designSystemModel, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, CampaignListScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.campaignSection = list;
        this.footerText = str3;
        this.footer = designSystemModel;
        this.emptyStateText = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CampaignSectionResponse$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignListScreenResponse copy$default(CampaignListScreenResponse campaignListScreenResponse, String str, String str2, List list, String str3, DesignSystemModel designSystemModel, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = campaignListScreenResponse.title;
        }
        if ((i13 & 2) != 0) {
            str2 = campaignListScreenResponse.description;
        }
        if ((i13 & 4) != 0) {
            list = campaignListScreenResponse.campaignSection;
        }
        if ((i13 & 8) != 0) {
            str3 = campaignListScreenResponse.footerText;
        }
        if ((i13 & 16) != 0) {
            designSystemModel = campaignListScreenResponse.footer;
        }
        if ((i13 & 32) != 0) {
            str4 = campaignListScreenResponse.emptyStateText;
        }
        DesignSystemModel designSystemModel2 = designSystemModel;
        String str5 = str4;
        return campaignListScreenResponse.copy(str, str2, list, str3, designSystemModel2, str5);
    }

    @InterfaceC37143h("campaign_sections")
    public static /* synthetic */ void getCampaignSection$annotations() {
    }

    @InterfaceC37143h("page_description_display")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("footer_carousel")
    public static /* synthetic */ void getFooter$annotations() {
    }

    @InterfaceC37143h("footer_text_display")
    public static /* synthetic */ void getFooterText$annotations() {
    }

    @InterfaceC37143h("page_title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CampaignListScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.campaignSection);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.footerText);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.footer);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.emptyStateText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<CampaignSectionResponse> component3() {
        return this.campaignSection;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DesignSystemModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmptyStateText() {
        return this.emptyStateText;
    }

    public final CampaignListScreenResponse copy(String title, String description, List<CampaignSectionResponse> campaignSection, String footerText, DesignSystemModel footer, String emptyStateText) {
        return new CampaignListScreenResponse(title, description, campaignSection, footerText, footer, emptyStateText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignListScreenResponse)) {
            return false;
        }
        CampaignListScreenResponse campaignListScreenResponse = (CampaignListScreenResponse) other;
        return AbstractC22676k.m65745e(this.title, campaignListScreenResponse.title) && AbstractC22676k.m65745e(this.description, campaignListScreenResponse.description) && AbstractC22676k.m65745e(this.campaignSection, campaignListScreenResponse.campaignSection) && AbstractC22676k.m65745e(this.footerText, campaignListScreenResponse.footerText) && AbstractC22676k.m65745e(this.footer, campaignListScreenResponse.footer) && AbstractC22676k.m65745e(this.emptyStateText, campaignListScreenResponse.emptyStateText);
    }

    public final List<CampaignSectionResponse> getCampaignSection() {
        return this.campaignSection;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmptyStateText() {
        return this.emptyStateText;
    }

    public final DesignSystemModel getFooter() {
        return this.footer;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CampaignSectionResponse> list = this.campaignSection;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.footerText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.footer;
        int iHashCode5 = (iHashCode4 + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        String str4 = this.emptyStateText;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        List<CampaignSectionResponse> list = this.campaignSection;
        String str3 = this.footerText;
        DesignSystemModel designSystemModel = this.footer;
        String str4 = this.emptyStateText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CampaignListScreenResponse(title=", str, ", description=", str2, ", campaignSection=");
        AbstractC17176i.m48511m(", footerText=", str3, ", footer=", sbM32001t, list);
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", emptyStateText=");
        sbM32001t.append(str4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public CampaignListScreenResponse(String str, String str2, List<CampaignSectionResponse> list, String str3, DesignSystemModel designSystemModel, String str4) {
        this.title = str;
        this.description = str2;
        this.campaignSection = list;
        this.footerText = str3;
        this.footer = designSystemModel;
        this.emptyStateText = str4;
    }
}
