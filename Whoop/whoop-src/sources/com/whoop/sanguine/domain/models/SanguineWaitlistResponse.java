package com.whoop.sanguine.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
import ty1.C34260e;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u0006:"}, m65681d2 = {"Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;", "", "", "headerText", "headerImageUrl", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;", "footer", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;", "analytics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sanguine_release", "(Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;", "component5", "()Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;)Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeaderText", "getHeaderImageUrl", "Ljava/util/List;", "getItems", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistFooter;", "getFooter", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistAnalyticsInfo;", "getAnalytics", "Companion", "$serializer", "a", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SanguineWaitlistResponse {
    private final SanguineWaitlistAnalyticsInfo analytics;
    private final SanguineWaitlistFooter footer;
    private final String headerImageUrl;
    private final String headerText;
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34260e(11)), null, null};

    /* JADX INFO: renamed from: com.whoop.sanguine.domain.models.SanguineWaitlistResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistResponse;", "serializer", "()Lwc3/c;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SanguineWaitlistResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SanguineWaitlistResponse(int i13, String str, String str2, List list, SanguineWaitlistFooter sanguineWaitlistFooter, SanguineWaitlistAnalyticsInfo sanguineWaitlistAnalyticsInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SanguineWaitlistResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.headerText = str;
        this.headerImageUrl = str2;
        this.items = list;
        this.footer = sanguineWaitlistFooter;
        if ((i13 & 16) == 0) {
            this.analytics = null;
        } else {
            this.analytics = sanguineWaitlistAnalyticsInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SanguineWaitlistResponse copy$default(SanguineWaitlistResponse sanguineWaitlistResponse, String str, String str2, List list, SanguineWaitlistFooter sanguineWaitlistFooter, SanguineWaitlistAnalyticsInfo sanguineWaitlistAnalyticsInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sanguineWaitlistResponse.headerText;
        }
        if ((i13 & 2) != 0) {
            str2 = sanguineWaitlistResponse.headerImageUrl;
        }
        if ((i13 & 4) != 0) {
            list = sanguineWaitlistResponse.items;
        }
        if ((i13 & 8) != 0) {
            sanguineWaitlistFooter = sanguineWaitlistResponse.footer;
        }
        if ((i13 & 16) != 0) {
            sanguineWaitlistAnalyticsInfo = sanguineWaitlistResponse.analytics;
        }
        SanguineWaitlistAnalyticsInfo sanguineWaitlistAnalyticsInfo2 = sanguineWaitlistAnalyticsInfo;
        List list2 = list;
        return sanguineWaitlistResponse.copy(str, str2, list2, sanguineWaitlistFooter, sanguineWaitlistAnalyticsInfo2);
    }

    public static final /* synthetic */ void write$Self$sanguine_release(SanguineWaitlistResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.headerText);
        output.encodeStringElement(serialDesc, 1, self.headerImageUrl);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 3, SanguineWaitlistFooter$$serializer.INSTANCE, self.footer);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.analytics == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, SanguineWaitlistAnalyticsInfo$$serializer.INSTANCE, self.analytics);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SanguineWaitlistFooter getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SanguineWaitlistAnalyticsInfo getAnalytics() {
        return this.analytics;
    }

    public final SanguineWaitlistResponse copy(String headerText, String headerImageUrl, List<? extends DesignSystemModel> items, SanguineWaitlistFooter footer, SanguineWaitlistAnalyticsInfo analytics) {
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(headerImageUrl, "headerImageUrl");
        AbstractC22676k.m65750j(items, "items");
        return new SanguineWaitlistResponse(headerText, headerImageUrl, items, footer, analytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SanguineWaitlistResponse)) {
            return false;
        }
        SanguineWaitlistResponse sanguineWaitlistResponse = (SanguineWaitlistResponse) other;
        return AbstractC22676k.m65745e(this.headerText, sanguineWaitlistResponse.headerText) && AbstractC22676k.m65745e(this.headerImageUrl, sanguineWaitlistResponse.headerImageUrl) && AbstractC22676k.m65745e(this.items, sanguineWaitlistResponse.items) && AbstractC22676k.m65745e(this.footer, sanguineWaitlistResponse.footer) && AbstractC22676k.m65745e(this.analytics, sanguineWaitlistResponse.analytics);
    }

    public final SanguineWaitlistAnalyticsInfo getAnalytics() {
        return this.analytics;
    }

    public final SanguineWaitlistFooter getFooter() {
        return this.footer;
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.headerText.hashCode() * 31, 31, this.headerImageUrl), 31, this.items);
        SanguineWaitlistFooter sanguineWaitlistFooter = this.footer;
        int iHashCode = (iM31983b + (sanguineWaitlistFooter == null ? 0 : sanguineWaitlistFooter.hashCode())) * 31;
        SanguineWaitlistAnalyticsInfo sanguineWaitlistAnalyticsInfo = this.analytics;
        return iHashCode + (sanguineWaitlistAnalyticsInfo != null ? sanguineWaitlistAnalyticsInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.headerText;
        String str2 = this.headerImageUrl;
        List<DesignSystemModel> list = this.items;
        SanguineWaitlistFooter sanguineWaitlistFooter = this.footer;
        SanguineWaitlistAnalyticsInfo sanguineWaitlistAnalyticsInfo = this.analytics;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SanguineWaitlistResponse(headerText=", str, ", headerImageUrl=", str2, ", items=");
        sbM32001t.append(list);
        sbM32001t.append(", footer=");
        sbM32001t.append(sanguineWaitlistFooter);
        sbM32001t.append(", analytics=");
        sbM32001t.append(sanguineWaitlistAnalyticsInfo);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SanguineWaitlistResponse(String headerText, String headerImageUrl, List<? extends DesignSystemModel> items, SanguineWaitlistFooter sanguineWaitlistFooter, SanguineWaitlistAnalyticsInfo sanguineWaitlistAnalyticsInfo) {
        AbstractC22676k.m65750j(headerText, "headerText");
        AbstractC22676k.m65750j(headerImageUrl, "headerImageUrl");
        AbstractC22676k.m65750j(items, "items");
        this.headerText = headerText;
        this.headerImageUrl = headerImageUrl;
        this.items = items;
        this.footer = sanguineWaitlistFooter;
        this.analytics = sanguineWaitlistAnalyticsInfo;
    }

    public /* synthetic */ SanguineWaitlistResponse(String str, String str2, List list, SanguineWaitlistFooter sanguineWaitlistFooter, SanguineWaitlistAnalyticsInfo sanguineWaitlistAnalyticsInfo, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, sanguineWaitlistFooter, (i13 & 16) != 0 ? null : sanguineWaitlistAnalyticsInfo);
    }
}
