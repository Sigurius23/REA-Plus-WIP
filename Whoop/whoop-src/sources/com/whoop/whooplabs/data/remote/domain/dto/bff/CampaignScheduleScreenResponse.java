package com.whoop.whooplabs.data.remote.domain.dto.bff;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
import ih0.AbstractC18489d0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u001dR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b6\u0010/\u001a\u0004\b5\u0010!¨\u00069"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;", "", "", "campaignId", "", "title", "pageTitle", "subtitle", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;", "sections", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCampaignId", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getPageTitle", "getPageTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Ljava/util/List;", "getSections", "getSections$annotations", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CampaignScheduleScreenResponse {
    private final int campaignId;
    private final String pageTitle;
    private final List<CampaignScheduleSection> sections;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12293a(22))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CampaignScheduleScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CampaignScheduleScreenResponse(int i13, int i14, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, CampaignScheduleScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.campaignId = i14;
        this.title = str;
        this.pageTitle = str2;
        this.subtitle = str3;
        this.sections = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CampaignScheduleSection$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignScheduleScreenResponse copy$default(CampaignScheduleScreenResponse campaignScheduleScreenResponse, int i13, String str, String str2, String str3, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = campaignScheduleScreenResponse.campaignId;
        }
        if ((i14 & 2) != 0) {
            str = campaignScheduleScreenResponse.title;
        }
        if ((i14 & 4) != 0) {
            str2 = campaignScheduleScreenResponse.pageTitle;
        }
        if ((i14 & 8) != 0) {
            str3 = campaignScheduleScreenResponse.subtitle;
        }
        if ((i14 & 16) != 0) {
            list = campaignScheduleScreenResponse.sections;
        }
        List list2 = list;
        String str4 = str2;
        return campaignScheduleScreenResponse.copy(i13, str, str4, str3, list2);
    }

    @InterfaceC37143h("page_title_display")
    public static /* synthetic */ void getPageTitle$annotations() {
    }

    @InterfaceC37143h("campaign_schedule_sections")
    public static /* synthetic */ void getSections$annotations() {
    }

    @InterfaceC37143h("subtitle_display")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CampaignScheduleScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.campaignId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.pageTitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.subtitle);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.sections);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<CampaignScheduleSection> component5() {
        return this.sections;
    }

    public final CampaignScheduleScreenResponse copy(int campaignId, String title, String pageTitle, String subtitle, List<CampaignScheduleSection> sections) {
        AbstractC22676k.m65750j(sections, "sections");
        return new CampaignScheduleScreenResponse(campaignId, title, pageTitle, subtitle, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignScheduleScreenResponse)) {
            return false;
        }
        CampaignScheduleScreenResponse campaignScheduleScreenResponse = (CampaignScheduleScreenResponse) other;
        return this.campaignId == campaignScheduleScreenResponse.campaignId && AbstractC22676k.m65745e(this.title, campaignScheduleScreenResponse.title) && AbstractC22676k.m65745e(this.pageTitle, campaignScheduleScreenResponse.pageTitle) && AbstractC22676k.m65745e(this.subtitle, campaignScheduleScreenResponse.subtitle) && AbstractC22676k.m65745e(this.sections, campaignScheduleScreenResponse.sections);
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final List<CampaignScheduleSection> getSections() {
        return this.sections;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.campaignId) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pageTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        return this.sections.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        int i13 = this.campaignId;
        String str = this.title;
        String str2 = this.pageTitle;
        String str3 = this.subtitle;
        List<CampaignScheduleSection> list = this.sections;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "CampaignScheduleScreenResponse(campaignId=", ", title=", str, ", pageTitle=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", subtitle=", str3, ", sections=");
        return AbstractC3855a.m11829m(sbM53373n, list, ")");
    }

    public CampaignScheduleScreenResponse(int i13, String str, String str2, String str3, List<CampaignScheduleSection> sections) {
        AbstractC22676k.m65750j(sections, "sections");
        this.campaignId = i13;
        this.title = str;
        this.pageTitle = str2;
        this.subtitle = str3;
        this.sections = sections;
    }
}
