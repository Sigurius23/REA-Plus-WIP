package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
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
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJF\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u001aR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010\u001e¨\u00065"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;", "", "", "pageTitleDisplay", "pageHeaderTitle", "pageHeaderBody", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;", "campaignSections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageTitleDisplay", "getPageTitleDisplay$annotations", "()V", "getPageHeaderTitle", "getPageHeaderTitle$annotations", "getPageHeaderBody", "getPageHeaderBody$annotations", "Ljava/util/List;", "getCampaignSections", "getCampaignSections$annotations", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CompletedCampaignsScreenResponse {
    private final List<CampaignSectionResponseV2> campaignSections;
    private final String pageHeaderBody;
    private final String pageHeaderTitle;
    private final String pageTitleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(3))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CompletedCampaignsScreenResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CompletedCampaignsScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CompletedCampaignsScreenResponse(int i13, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CompletedCampaignsScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.pageTitleDisplay = str;
        this.pageHeaderTitle = str2;
        this.pageHeaderBody = str3;
        this.campaignSections = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CampaignSectionResponseV2$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedCampaignsScreenResponse copy$default(CompletedCampaignsScreenResponse completedCampaignsScreenResponse, String str, String str2, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = completedCampaignsScreenResponse.pageTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = completedCampaignsScreenResponse.pageHeaderTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = completedCampaignsScreenResponse.pageHeaderBody;
        }
        if ((i13 & 8) != 0) {
            list = completedCampaignsScreenResponse.campaignSections;
        }
        return completedCampaignsScreenResponse.copy(str, str2, str3, list);
    }

    @InterfaceC37143h("campaign_sections")
    public static /* synthetic */ void getCampaignSections$annotations() {
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

    public static final /* synthetic */ void write$Self$whooplabs_release(CompletedCampaignsScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.pageTitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.pageHeaderTitle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.pageHeaderBody);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.campaignSections);
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

    public final List<CampaignSectionResponseV2> component4() {
        return this.campaignSections;
    }

    public final CompletedCampaignsScreenResponse copy(String pageTitleDisplay, String pageHeaderTitle, String pageHeaderBody, List<CampaignSectionResponseV2> campaignSections) {
        return new CompletedCampaignsScreenResponse(pageTitleDisplay, pageHeaderTitle, pageHeaderBody, campaignSections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedCampaignsScreenResponse)) {
            return false;
        }
        CompletedCampaignsScreenResponse completedCampaignsScreenResponse = (CompletedCampaignsScreenResponse) other;
        return AbstractC22676k.m65745e(this.pageTitleDisplay, completedCampaignsScreenResponse.pageTitleDisplay) && AbstractC22676k.m65745e(this.pageHeaderTitle, completedCampaignsScreenResponse.pageHeaderTitle) && AbstractC22676k.m65745e(this.pageHeaderBody, completedCampaignsScreenResponse.pageHeaderBody) && AbstractC22676k.m65745e(this.campaignSections, completedCampaignsScreenResponse.campaignSections);
    }

    public final List<CampaignSectionResponseV2> getCampaignSections() {
        return this.campaignSections;
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
        String str = this.pageTitleDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pageHeaderTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pageHeaderBody;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<CampaignSectionResponseV2> list = this.campaignSections;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.pageTitleDisplay;
        String str2 = this.pageHeaderTitle;
        return AbstractC30007c.m91840j(this.pageHeaderBody, ", campaignSections=", ")", AbstractC11895b.m32001t("CompletedCampaignsScreenResponse(pageTitleDisplay=", str, ", pageHeaderTitle=", str2, ", pageHeaderBody="), this.campaignSections);
    }

    public CompletedCampaignsScreenResponse(String str, String str2, String str3, List<CampaignSectionResponseV2> list) {
        this.pageTitleDisplay = str;
        this.pageHeaderTitle = str2;
        this.pageHeaderBody = str3;
        this.campaignSections = list;
    }
}
