package com.whoop.whooplabs.data.remote.domain.dto.bff;

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
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u009c\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00109\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00109\u0012\u0004\b@\u0010<\u001a\u0004\b?\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00109\u0012\u0004\bB\u0010<\u001a\u0004\bA\u0010\u001bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010 R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\bF\u0010<\u001a\u0004\bE\u0010\u001bR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bG\u0010 R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\bI\u0010<\u001a\u0004\bH\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bJ\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\bK\u0010\u001b¨\u0006N"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;", "", "", "campaignId", "", "toolbarTitle", "title", "headerSubtitle", "headerIcon", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ContentBlockResponse;", "contentBlocks", "description", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;", "documents", "alertTitle", "alertDisplay", "documentDisplay", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "component11", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getCampaignId", "Ljava/lang/String;", "getToolbarTitle", "getToolbarTitle$annotations", "()V", "getTitle", "getTitle$annotations", "getHeaderSubtitle", "getHeaderSubtitle$annotations", "getHeaderIcon", "getHeaderIcon$annotations", "Ljava/util/List;", "getContentBlocks", "getDescription", "getDescription$annotations", "getDocuments", "getAlertTitle", "getAlertTitle$annotations", "getAlertDisplay", "getDocumentDisplay", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CampaignExtendedDetailsResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final String alertDisplay;
    private final String alertTitle;
    private final int campaignId;
    private final List<ContentBlockResponse> contentBlocks;
    private final String description;
    private final String documentDisplay;
    private final List<LegalDocumentResponse> documents;
    private final String headerIcon;
    private final String headerSubtitle;
    private final String title;
    private final String toolbarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CampaignExtendedDetailsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12293a(18)), null, AbstractC30060g.m92087G(enumC23463i, new C12293a(19)), null, null, null};
    }

    public /* synthetic */ CampaignExtendedDetailsResponse(int i13, int i14, String str, String str2, String str3, String str4, List list, String str5, List list2, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, CampaignExtendedDetailsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.campaignId = i14;
        this.toolbarTitle = str;
        this.title = str2;
        this.headerSubtitle = str3;
        this.headerIcon = str4;
        this.contentBlocks = list;
        this.description = str5;
        this.documents = list2;
        this.alertTitle = str6;
        this.alertDisplay = str7;
        this.documentDisplay = str8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ContentBlockResponse$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(LegalDocumentResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignExtendedDetailsResponse copy$default(CampaignExtendedDetailsResponse campaignExtendedDetailsResponse, int i13, String str, String str2, String str3, String str4, List list, String str5, List list2, String str6, String str7, String str8, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = campaignExtendedDetailsResponse.campaignId;
        }
        if ((i14 & 2) != 0) {
            str = campaignExtendedDetailsResponse.toolbarTitle;
        }
        if ((i14 & 4) != 0) {
            str2 = campaignExtendedDetailsResponse.title;
        }
        if ((i14 & 8) != 0) {
            str3 = campaignExtendedDetailsResponse.headerSubtitle;
        }
        if ((i14 & 16) != 0) {
            str4 = campaignExtendedDetailsResponse.headerIcon;
        }
        if ((i14 & 32) != 0) {
            list = campaignExtendedDetailsResponse.contentBlocks;
        }
        if ((i14 & 64) != 0) {
            str5 = campaignExtendedDetailsResponse.description;
        }
        if ((i14 & 128) != 0) {
            list2 = campaignExtendedDetailsResponse.documents;
        }
        if ((i14 & 256) != 0) {
            str6 = campaignExtendedDetailsResponse.alertTitle;
        }
        if ((i14 & 512) != 0) {
            str7 = campaignExtendedDetailsResponse.alertDisplay;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str8 = campaignExtendedDetailsResponse.documentDisplay;
        }
        String str9 = str7;
        String str10 = str8;
        List list3 = list2;
        String str11 = str6;
        List list4 = list;
        String str12 = str5;
        String str13 = str4;
        String str14 = str2;
        return campaignExtendedDetailsResponse.copy(i13, str, str14, str3, str13, list4, str12, list3, str11, str9, str10);
    }

    @InterfaceC37143h("alert_title_display")
    public static /* synthetic */ void getAlertTitle$annotations() {
    }

    @InterfaceC37143h("description_display")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("icon")
    public static /* synthetic */ void getHeaderIcon$annotations() {
    }

    @InterfaceC37143h("subtitle_display")
    public static /* synthetic */ void getHeaderSubtitle$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("page_title_display")
    public static /* synthetic */ void getToolbarTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CampaignExtendedDetailsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.campaignId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.toolbarTitle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.headerSubtitle);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.headerIcon);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.contentBlocks);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.documents);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.alertTitle);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.alertDisplay);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.documentDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAlertDisplay() {
        return this.alertDisplay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDocumentDisplay() {
        return this.documentDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeaderIcon() {
        return this.headerIcon;
    }

    public final List<ContentBlockResponse> component6() {
        return this.contentBlocks;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<LegalDocumentResponse> component8() {
        return this.documents;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAlertTitle() {
        return this.alertTitle;
    }

    public final CampaignExtendedDetailsResponse copy(int campaignId, String toolbarTitle, String title, String headerSubtitle, String headerIcon, List<ContentBlockResponse> contentBlocks, String description, List<LegalDocumentResponse> documents, String alertTitle, String alertDisplay, String documentDisplay) {
        AbstractC22676k.m65750j(contentBlocks, "contentBlocks");
        return new CampaignExtendedDetailsResponse(campaignId, toolbarTitle, title, headerSubtitle, headerIcon, contentBlocks, description, documents, alertTitle, alertDisplay, documentDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignExtendedDetailsResponse)) {
            return false;
        }
        CampaignExtendedDetailsResponse campaignExtendedDetailsResponse = (CampaignExtendedDetailsResponse) other;
        return this.campaignId == campaignExtendedDetailsResponse.campaignId && AbstractC22676k.m65745e(this.toolbarTitle, campaignExtendedDetailsResponse.toolbarTitle) && AbstractC22676k.m65745e(this.title, campaignExtendedDetailsResponse.title) && AbstractC22676k.m65745e(this.headerSubtitle, campaignExtendedDetailsResponse.headerSubtitle) && AbstractC22676k.m65745e(this.headerIcon, campaignExtendedDetailsResponse.headerIcon) && AbstractC22676k.m65745e(this.contentBlocks, campaignExtendedDetailsResponse.contentBlocks) && AbstractC22676k.m65745e(this.description, campaignExtendedDetailsResponse.description) && AbstractC22676k.m65745e(this.documents, campaignExtendedDetailsResponse.documents) && AbstractC22676k.m65745e(this.alertTitle, campaignExtendedDetailsResponse.alertTitle) && AbstractC22676k.m65745e(this.alertDisplay, campaignExtendedDetailsResponse.alertDisplay) && AbstractC22676k.m65745e(this.documentDisplay, campaignExtendedDetailsResponse.documentDisplay);
    }

    public final String getAlertDisplay() {
        return this.alertDisplay;
    }

    public final String getAlertTitle() {
        return this.alertTitle;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final List<ContentBlockResponse> getContentBlocks() {
        return this.contentBlocks;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDocumentDisplay() {
        return this.documentDisplay;
    }

    public final List<LegalDocumentResponse> getDocuments() {
        return this.documents;
    }

    public final String getHeaderIcon() {
        return this.headerIcon;
    }

    public final String getHeaderSubtitle() {
        return this.headerSubtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.campaignId) * 31;
        String str = this.toolbarTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.headerSubtitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.headerIcon;
        int iM31983b = AbstractC11895b.m31983b((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.contentBlocks);
        String str5 = this.description;
        int iHashCode5 = (iM31983b + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<LegalDocumentResponse> list = this.documents;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.alertTitle;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.alertDisplay;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.documentDisplay;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.campaignId;
        String str = this.toolbarTitle;
        String str2 = this.title;
        String str3 = this.headerSubtitle;
        String str4 = this.headerIcon;
        List<ContentBlockResponse> list = this.contentBlocks;
        String str5 = this.description;
        List<LegalDocumentResponse> list2 = this.documents;
        String str6 = this.alertTitle;
        String str7 = this.alertDisplay;
        String str8 = this.documentDisplay;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "CampaignExtendedDetailsResponse(campaignId=", ", toolbarTitle=", str, ", title=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", headerSubtitle=", str3, ", headerIcon=");
        AbstractC36095b.m114694v(str4, ", contentBlocks=", ", description=", sbM53373n, list);
        AbstractC36095b.m114694v(str5, ", documents=", ", alertTitle=", sbM53373n, list2);
        AbstractC11266d.m30444B(sbM53373n, str6, ", alertDisplay=", str7, ", documentDisplay=");
        return AbstractC25012a.m73376i(str8, ")", sbM53373n);
    }

    public CampaignExtendedDetailsResponse(int i13, String str, String str2, String str3, String str4, List<ContentBlockResponse> contentBlocks, String str5, List<LegalDocumentResponse> list, String str6, String str7, String str8) {
        AbstractC22676k.m65750j(contentBlocks, "contentBlocks");
        this.campaignId = i13;
        this.toolbarTitle = str;
        this.title = str2;
        this.headerSubtitle = str3;
        this.headerIcon = str4;
        this.contentBlocks = contentBlocks;
        this.description = str5;
        this.documents = list;
        this.alertTitle = str6;
        this.alertDisplay = str7;
        this.documentDisplay = str8;
    }
}
