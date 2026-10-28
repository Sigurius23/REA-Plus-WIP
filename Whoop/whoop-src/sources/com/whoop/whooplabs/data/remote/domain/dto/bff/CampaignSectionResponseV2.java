package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JF\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001bR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010 ¨\u00068"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;", "", "", "title", "subtitle", "", "Lcom/whoop/design/models/DesignSystemModel;", "campaignResponse", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;", "emptyState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Ljava/util/List;", "getCampaignResponse", "getCampaignResponse$annotations", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionEmptyStateResponse;", "getEmptyState", "getEmptyState$annotations", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CampaignSectionResponseV2 {
    private final List<DesignSystemModel> campaignResponse;
    private final CampaignSectionEmptyStateResponse emptyState;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12293a(26)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignSectionResponseV2;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CampaignSectionResponseV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CampaignSectionResponseV2(int i13, String str, String str2, List list, CampaignSectionEmptyStateResponse campaignSectionEmptyStateResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i13 & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 5, CampaignSectionResponseV2$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        this.campaignResponse = list;
        if ((i13 & 8) == 0) {
            this.emptyState = null;
        } else {
            this.emptyState = campaignSectionEmptyStateResponse;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignSectionResponseV2 copy$default(CampaignSectionResponseV2 campaignSectionResponseV2, String str, String str2, List list, CampaignSectionEmptyStateResponse campaignSectionEmptyStateResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = campaignSectionResponseV2.title;
        }
        if ((i13 & 2) != 0) {
            str2 = campaignSectionResponseV2.subtitle;
        }
        if ((i13 & 4) != 0) {
            list = campaignSectionResponseV2.campaignResponse;
        }
        if ((i13 & 8) != 0) {
            campaignSectionEmptyStateResponse = campaignSectionResponseV2.emptyState;
        }
        return campaignSectionResponseV2.copy(str, str2, list, campaignSectionEmptyStateResponse);
    }

    @InterfaceC37143h("campaigns")
    public static /* synthetic */ void getCampaignResponse$annotations() {
    }

    @InterfaceC37143h("empty_state")
    public static /* synthetic */ void getEmptyState$annotations() {
    }

    @InterfaceC37143h("subtitle_display")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CampaignSectionResponseV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.campaignResponse);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.emptyState == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, CampaignSectionEmptyStateResponse$$serializer.INSTANCE, self.emptyState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<DesignSystemModel> component3() {
        return this.campaignResponse;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CampaignSectionEmptyStateResponse getEmptyState() {
        return this.emptyState;
    }

    public final CampaignSectionResponseV2 copy(String title, String subtitle, List<? extends DesignSystemModel> campaignResponse, CampaignSectionEmptyStateResponse emptyState) {
        return new CampaignSectionResponseV2(title, subtitle, campaignResponse, emptyState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignSectionResponseV2)) {
            return false;
        }
        CampaignSectionResponseV2 campaignSectionResponseV2 = (CampaignSectionResponseV2) other;
        return AbstractC22676k.m65745e(this.title, campaignSectionResponseV2.title) && AbstractC22676k.m65745e(this.subtitle, campaignSectionResponseV2.subtitle) && AbstractC22676k.m65745e(this.campaignResponse, campaignSectionResponseV2.campaignResponse) && AbstractC22676k.m65745e(this.emptyState, campaignSectionResponseV2.emptyState);
    }

    public final List<DesignSystemModel> getCampaignResponse() {
        return this.campaignResponse;
    }

    public final CampaignSectionEmptyStateResponse getEmptyState() {
        return this.emptyState;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DesignSystemModel> list = this.campaignResponse;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CampaignSectionEmptyStateResponse campaignSectionEmptyStateResponse = this.emptyState;
        return iHashCode3 + (campaignSectionEmptyStateResponse != null ? campaignSectionEmptyStateResponse.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        List<DesignSystemModel> list = this.campaignResponse;
        CampaignSectionEmptyStateResponse campaignSectionEmptyStateResponse = this.emptyState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CampaignSectionResponseV2(title=", str, ", subtitle=", str2, ", campaignResponse=");
        sbM32001t.append(list);
        sbM32001t.append(", emptyState=");
        sbM32001t.append(campaignSectionEmptyStateResponse);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CampaignSectionResponseV2(String str, String str2, List<? extends DesignSystemModel> list, CampaignSectionEmptyStateResponse campaignSectionEmptyStateResponse) {
        this.title = str;
        this.subtitle = str2;
        this.campaignResponse = list;
        this.emptyState = campaignSectionEmptyStateResponse;
    }

    public /* synthetic */ CampaignSectionResponseV2(String str, String str2, List list, CampaignSectionEmptyStateResponse campaignSectionEmptyStateResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, list, (i13 & 8) != 0 ? null : campaignSectionEmptyStateResponse);
    }
}
