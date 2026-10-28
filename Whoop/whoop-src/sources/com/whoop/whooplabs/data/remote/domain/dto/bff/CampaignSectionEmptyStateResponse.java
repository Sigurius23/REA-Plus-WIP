package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006-"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;", "", "", "imageUrl", "titleDisplay", "bodyDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getImageUrl$annotations", "()V", "getTitleDisplay", "getTitleDisplay$annotations", "getBodyDisplay", "getBodyDisplay$annotations", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CampaignSectionEmptyStateResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String bodyDisplay;
    private final String imageUrl;
    private final String titleDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CampaignSectionEmptyStateResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CampaignSectionEmptyStateResponse(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, CampaignSectionEmptyStateResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.titleDisplay = str2;
        this.bodyDisplay = str3;
    }

    public static /* synthetic */ CampaignSectionEmptyStateResponse copy$default(CampaignSectionEmptyStateResponse campaignSectionEmptyStateResponse, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = campaignSectionEmptyStateResponse.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = campaignSectionEmptyStateResponse.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = campaignSectionEmptyStateResponse.bodyDisplay;
        }
        return campaignSectionEmptyStateResponse.copy(str, str2, str3);
    }

    @InterfaceC37143h("body_display")
    public static /* synthetic */ void getBodyDisplay$annotations() {
    }

    @InterfaceC37143h("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitleDisplay$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CampaignSectionEmptyStateResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.titleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.bodyDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBodyDisplay() {
        return this.bodyDisplay;
    }

    public final CampaignSectionEmptyStateResponse copy(String imageUrl, String titleDisplay, String bodyDisplay) {
        return new CampaignSectionEmptyStateResponse(imageUrl, titleDisplay, bodyDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignSectionEmptyStateResponse)) {
            return false;
        }
        CampaignSectionEmptyStateResponse campaignSectionEmptyStateResponse = (CampaignSectionEmptyStateResponse) other;
        return AbstractC22676k.m65745e(this.imageUrl, campaignSectionEmptyStateResponse.imageUrl) && AbstractC22676k.m65745e(this.titleDisplay, campaignSectionEmptyStateResponse.titleDisplay) && AbstractC22676k.m65745e(this.bodyDisplay, campaignSectionEmptyStateResponse.bodyDisplay);
    }

    public final String getBodyDisplay() {
        return this.bodyDisplay;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodyDisplay;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.bodyDisplay, ")", AbstractC11895b.m32001t("CampaignSectionEmptyStateResponse(imageUrl=", this.imageUrl, ", titleDisplay=", this.titleDisplay, ", bodyDisplay="));
    }

    public CampaignSectionEmptyStateResponse(String str, String str2, String str3) {
        this.imageUrl = str;
        this.titleDisplay = str2;
        this.bodyDisplay = str3;
    }
}
