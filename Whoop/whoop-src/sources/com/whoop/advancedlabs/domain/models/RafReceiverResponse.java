package com.whoop.advancedlabs.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
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
import tb0.C33690a;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\rHÆ\u0003¢\u0006\u0004\b \u0010!Jv\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0017R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b=\u0010\u0017R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010!¨\u0006D"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;", "", "", "analyticsName", "analyticsActionName", "analyticsCategory", "imageUrl", "title", "subtitle", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "ctaText", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getAnalyticsName", "getAnalyticsActionName", "getAnalyticsCategory", "getImageUrl", "getTitle", "getSubtitle", "Ljava/util/List;", "getItems", "getCtaText", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RafReceiverResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsActionName;
    private final String analyticsCategory;
    private final String analyticsName;
    private final String ctaText;
    private final C9598e destination;
    private final String imageUrl;
    private final List<DesignSystemModel> items;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RafReceiverResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C33690a(18)), null, AbstractC30060g.m92087G(enumC23463i, new C33690a(19))};
    }

    public /* synthetic */ RafReceiverResponse(int i13, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, RafReceiverResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.analyticsName = str;
        this.analyticsActionName = str2;
        this.analyticsCategory = str3;
        this.imageUrl = str4;
        this.title = str5;
        this.subtitle = str6;
        this.items = list;
        this.ctaText = str7;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RafReceiverResponse copy$default(RafReceiverResponse rafReceiverResponse, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = rafReceiverResponse.analyticsName;
        }
        if ((i13 & 2) != 0) {
            str2 = rafReceiverResponse.analyticsActionName;
        }
        if ((i13 & 4) != 0) {
            str3 = rafReceiverResponse.analyticsCategory;
        }
        if ((i13 & 8) != 0) {
            str4 = rafReceiverResponse.imageUrl;
        }
        if ((i13 & 16) != 0) {
            str5 = rafReceiverResponse.title;
        }
        if ((i13 & 32) != 0) {
            str6 = rafReceiverResponse.subtitle;
        }
        if ((i13 & 64) != 0) {
            list = rafReceiverResponse.items;
        }
        if ((i13 & 128) != 0) {
            str7 = rafReceiverResponse.ctaText;
        }
        if ((i13 & 256) != 0) {
            c9598e = rafReceiverResponse.destination;
        }
        String str8 = str7;
        C9598e c9598e2 = c9598e;
        String str9 = str6;
        List list2 = list;
        String str10 = str5;
        String str11 = str3;
        return rafReceiverResponse.copy(str, str2, str11, str4, str10, str9, list2, str8, c9598e2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(RafReceiverResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.analyticsName);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.analyticsActionName);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.analyticsCategory);
        output.encodeStringElement(serialDesc, 3, self.imageUrl);
        output.encodeStringElement(serialDesc, 4, self.title);
        output.encodeStringElement(serialDesc, 5, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.items);
        output.encodeStringElement(serialDesc, 7, self.ctaText);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAnalyticsActionName() {
        return this.analyticsActionName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAnalyticsCategory() {
        return this.analyticsCategory;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<DesignSystemModel> component7() {
        return this.items;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final RafReceiverResponse copy(String analyticsName, String analyticsActionName, String analyticsCategory, String imageUrl, String title, String subtitle, List<? extends DesignSystemModel> items, String ctaText, C9598e destination) {
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(destination, "destination");
        return new RafReceiverResponse(analyticsName, analyticsActionName, analyticsCategory, imageUrl, title, subtitle, items, ctaText, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RafReceiverResponse)) {
            return false;
        }
        RafReceiverResponse rafReceiverResponse = (RafReceiverResponse) other;
        return AbstractC22676k.m65745e(this.analyticsName, rafReceiverResponse.analyticsName) && AbstractC22676k.m65745e(this.analyticsActionName, rafReceiverResponse.analyticsActionName) && AbstractC22676k.m65745e(this.analyticsCategory, rafReceiverResponse.analyticsCategory) && AbstractC22676k.m65745e(this.imageUrl, rafReceiverResponse.imageUrl) && AbstractC22676k.m65745e(this.title, rafReceiverResponse.title) && AbstractC22676k.m65745e(this.subtitle, rafReceiverResponse.subtitle) && AbstractC22676k.m65745e(this.items, rafReceiverResponse.items) && AbstractC22676k.m65745e(this.ctaText, rafReceiverResponse.ctaText) && AbstractC22676k.m65745e(this.destination, rafReceiverResponse.destination);
    }

    public final String getAnalyticsActionName() {
        return this.analyticsActionName;
    }

    public final String getAnalyticsCategory() {
        return this.analyticsCategory;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.analyticsName.hashCode() * 31;
        String str = this.analyticsActionName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticsCategory;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.imageUrl), 31, this.title), 31, this.subtitle);
        List<DesignSystemModel> list = this.items;
        return this.destination.hashCode() + AbstractC11266d.m30450d((iM30450d + (list != null ? list.hashCode() : 0)) * 31, 31, this.ctaText);
    }

    public String toString() {
        String str = this.analyticsName;
        String str2 = this.analyticsActionName;
        String str3 = this.analyticsCategory;
        String str4 = this.imageUrl;
        String str5 = this.title;
        String str6 = this.subtitle;
        List<DesignSystemModel> list = this.items;
        String str7 = this.ctaText;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RafReceiverResponse(analyticsName=", str, ", analyticsActionName=", str2, ", analyticsCategory=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", imageUrl=", str4, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", subtitle=", str6, ", items=");
        AbstractC17176i.m48511m(", ctaText=", str7, ", destination=", sbM32001t, list);
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RafReceiverResponse(String analyticsName, String str, String str2, String imageUrl, String title, String subtitle, List<? extends DesignSystemModel> list, String ctaText, C9598e destination) {
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(destination, "destination");
        this.analyticsName = analyticsName;
        this.analyticsActionName = str;
        this.analyticsCategory = str2;
        this.imageUrl = imageUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.items = list;
        this.ctaText = ctaText;
        this.destination = destination;
    }
}
