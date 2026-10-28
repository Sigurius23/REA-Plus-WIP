package com.whoop.homecustomization.domain.models;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fBw\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010'Jl\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b9\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b:\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b;\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010'R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b>\u0010'¨\u0006A"}, m65681d2 = {"Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "", "Lcom/whoop/design/util/TextResource;", "gaugeHeader", "description", "", "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;", "gaugeMetrics", "bottomSheetMetrics", "pinnedMetricsHeader", "unpinnedMetricsHeader", "Lcom/whoop/homecustomization/domain/models/MetricsSection;", "pinnedMetricsSection", "unpinnedMetricsSection", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_customization_release", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "()Lcom/whoop/homecustomization/domain/models/MetricsSection;", "component8", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/homecustomization/domain/models/MetricsSection;Lcom/whoop/homecustomization/domain/models/MetricsSection;)Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getGaugeHeader", "getDescription", "Ljava/util/List;", "getGaugeMetrics", "getBottomSheetMetrics", "getPinnedMetricsHeader", "getUnpinnedMetricsHeader", "Lcom/whoop/homecustomization/domain/models/MetricsSection;", "getPinnedMetricsSection", "getUnpinnedMetricsSection", "Companion", "$serializer", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomizeOverviewResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<CustomizableMetricModel> bottomSheetMetrics;
    private final TextResource description;
    private final TextResource gaugeHeader;
    private final List<CustomizableMetricModel> gaugeMetrics;
    private final TextResource pinnedMetricsHeader;
    private final MetricsSection pinnedMetricsSection;
    private final TextResource unpinnedMetricsHeader;
    private final MetricsSection unpinnedMetricsSection;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "serializer", "()Lwc3/c;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomizeOverviewResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C15999a(3)), AbstractC30060g.m92087G(enumC23463i, new C15999a(4)), null, null, null, null};
    }

    public /* synthetic */ CustomizeOverviewResponse(int i13, TextResource textResource, TextResource textResource2, List list, List list2, TextResource textResource3, TextResource textResource4, MetricsSection metricsSection, MetricsSection metricsSection2, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, CustomizeOverviewResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.gaugeHeader = textResource;
        this.description = textResource2;
        this.gaugeMetrics = list;
        this.bottomSheetMetrics = list2;
        this.pinnedMetricsHeader = textResource3;
        this.unpinnedMetricsHeader = textResource4;
        this.pinnedMetricsSection = metricsSection;
        this.unpinnedMetricsSection = metricsSection2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CustomizableMetricModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(CustomizableMetricModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomizeOverviewResponse copy$default(CustomizeOverviewResponse customizeOverviewResponse, TextResource textResource, TextResource textResource2, List list, List list2, TextResource textResource3, TextResource textResource4, MetricsSection metricsSection, MetricsSection metricsSection2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = customizeOverviewResponse.gaugeHeader;
        }
        if ((i13 & 2) != 0) {
            textResource2 = customizeOverviewResponse.description;
        }
        if ((i13 & 4) != 0) {
            list = customizeOverviewResponse.gaugeMetrics;
        }
        if ((i13 & 8) != 0) {
            list2 = customizeOverviewResponse.bottomSheetMetrics;
        }
        if ((i13 & 16) != 0) {
            textResource3 = customizeOverviewResponse.pinnedMetricsHeader;
        }
        if ((i13 & 32) != 0) {
            textResource4 = customizeOverviewResponse.unpinnedMetricsHeader;
        }
        if ((i13 & 64) != 0) {
            metricsSection = customizeOverviewResponse.pinnedMetricsSection;
        }
        if ((i13 & 128) != 0) {
            metricsSection2 = customizeOverviewResponse.unpinnedMetricsSection;
        }
        MetricsSection metricsSection3 = metricsSection;
        MetricsSection metricsSection4 = metricsSection2;
        TextResource textResource5 = textResource3;
        TextResource textResource6 = textResource4;
        return customizeOverviewResponse.copy(textResource, textResource2, list, list2, textResource5, textResource6, metricsSection3, metricsSection4);
    }

    public static final /* synthetic */ void write$Self$home_customization_release(CustomizeOverviewResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.gaugeHeader);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.description);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.gaugeMetrics);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.bottomSheetMetrics);
        output.encodeSerializableElement(serialDesc, 4, c25452a, self.pinnedMetricsHeader);
        output.encodeSerializableElement(serialDesc, 5, c25452a, self.unpinnedMetricsHeader);
        MetricsSection$$serializer metricsSection$$serializer = MetricsSection$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 6, metricsSection$$serializer, self.pinnedMetricsSection);
        output.encodeSerializableElement(serialDesc, 7, metricsSection$$serializer, self.unpinnedMetricsSection);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getGaugeHeader() {
        return this.gaugeHeader;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    public final List<CustomizableMetricModel> component3() {
        return this.gaugeMetrics;
    }

    public final List<CustomizableMetricModel> component4() {
        return this.bottomSheetMetrics;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getPinnedMetricsHeader() {
        return this.pinnedMetricsHeader;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextResource getUnpinnedMetricsHeader() {
        return this.unpinnedMetricsHeader;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MetricsSection getPinnedMetricsSection() {
        return this.pinnedMetricsSection;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final MetricsSection getUnpinnedMetricsSection() {
        return this.unpinnedMetricsSection;
    }

    public final CustomizeOverviewResponse copy(TextResource gaugeHeader, TextResource description, List<CustomizableMetricModel> gaugeMetrics, List<CustomizableMetricModel> bottomSheetMetrics, TextResource pinnedMetricsHeader, TextResource unpinnedMetricsHeader, MetricsSection pinnedMetricsSection, MetricsSection unpinnedMetricsSection) {
        AbstractC22676k.m65750j(gaugeHeader, "gaugeHeader");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(gaugeMetrics, "gaugeMetrics");
        AbstractC22676k.m65750j(bottomSheetMetrics, "bottomSheetMetrics");
        AbstractC22676k.m65750j(pinnedMetricsHeader, "pinnedMetricsHeader");
        AbstractC22676k.m65750j(unpinnedMetricsHeader, "unpinnedMetricsHeader");
        AbstractC22676k.m65750j(pinnedMetricsSection, "pinnedMetricsSection");
        AbstractC22676k.m65750j(unpinnedMetricsSection, "unpinnedMetricsSection");
        return new CustomizeOverviewResponse(gaugeHeader, description, gaugeMetrics, bottomSheetMetrics, pinnedMetricsHeader, unpinnedMetricsHeader, pinnedMetricsSection, unpinnedMetricsSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomizeOverviewResponse)) {
            return false;
        }
        CustomizeOverviewResponse customizeOverviewResponse = (CustomizeOverviewResponse) other;
        return AbstractC22676k.m65745e(this.gaugeHeader, customizeOverviewResponse.gaugeHeader) && AbstractC22676k.m65745e(this.description, customizeOverviewResponse.description) && AbstractC22676k.m65745e(this.gaugeMetrics, customizeOverviewResponse.gaugeMetrics) && AbstractC22676k.m65745e(this.bottomSheetMetrics, customizeOverviewResponse.bottomSheetMetrics) && AbstractC22676k.m65745e(this.pinnedMetricsHeader, customizeOverviewResponse.pinnedMetricsHeader) && AbstractC22676k.m65745e(this.unpinnedMetricsHeader, customizeOverviewResponse.unpinnedMetricsHeader) && AbstractC22676k.m65745e(this.pinnedMetricsSection, customizeOverviewResponse.pinnedMetricsSection) && AbstractC22676k.m65745e(this.unpinnedMetricsSection, customizeOverviewResponse.unpinnedMetricsSection);
    }

    public final List<CustomizableMetricModel> getBottomSheetMetrics() {
        return this.bottomSheetMetrics;
    }

    public final TextResource getDescription() {
        return this.description;
    }

    public final TextResource getGaugeHeader() {
        return this.gaugeHeader;
    }

    public final List<CustomizableMetricModel> getGaugeMetrics() {
        return this.gaugeMetrics;
    }

    public final TextResource getPinnedMetricsHeader() {
        return this.pinnedMetricsHeader;
    }

    public final MetricsSection getPinnedMetricsSection() {
        return this.pinnedMetricsSection;
    }

    public final TextResource getUnpinnedMetricsHeader() {
        return this.unpinnedMetricsHeader;
    }

    public final MetricsSection getUnpinnedMetricsSection() {
        return this.unpinnedMetricsSection;
    }

    public int hashCode() {
        return this.unpinnedMetricsSection.hashCode() + ((this.pinnedMetricsSection.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC31061c.m95625a(this.gaugeHeader.hashCode() * 31, this.description, 31), 31, this.gaugeMetrics), 31, this.bottomSheetMetrics), this.pinnedMetricsHeader, 31), this.unpinnedMetricsHeader, 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.gaugeHeader;
        TextResource textResource2 = this.description;
        List<CustomizableMetricModel> list = this.gaugeMetrics;
        List<CustomizableMetricModel> list2 = this.bottomSheetMetrics;
        TextResource textResource3 = this.pinnedMetricsHeader;
        TextResource textResource4 = this.unpinnedMetricsHeader;
        MetricsSection metricsSection = this.pinnedMetricsSection;
        MetricsSection metricsSection2 = this.unpinnedMetricsSection;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CustomizeOverviewResponse(gaugeHeader=", textResource, ", description=", textResource2, ", gaugeMetrics=");
        AbstractC21702c.m61148s(sbM106658q, list, ", bottomSheetMetrics=", list2, ", pinnedMetricsHeader=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", unpinnedMetricsHeader=", textResource4, ", pinnedMetricsSection=");
        sbM106658q.append(metricsSection);
        sbM106658q.append(", unpinnedMetricsSection=");
        sbM106658q.append(metricsSection2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public CustomizeOverviewResponse(TextResource gaugeHeader, TextResource description, List<CustomizableMetricModel> gaugeMetrics, List<CustomizableMetricModel> bottomSheetMetrics, TextResource pinnedMetricsHeader, TextResource unpinnedMetricsHeader, MetricsSection pinnedMetricsSection, MetricsSection unpinnedMetricsSection) {
        AbstractC22676k.m65750j(gaugeHeader, "gaugeHeader");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(gaugeMetrics, "gaugeMetrics");
        AbstractC22676k.m65750j(bottomSheetMetrics, "bottomSheetMetrics");
        AbstractC22676k.m65750j(pinnedMetricsHeader, "pinnedMetricsHeader");
        AbstractC22676k.m65750j(unpinnedMetricsHeader, "unpinnedMetricsHeader");
        AbstractC22676k.m65750j(pinnedMetricsSection, "pinnedMetricsSection");
        AbstractC22676k.m65750j(unpinnedMetricsSection, "unpinnedMetricsSection");
        this.gaugeHeader = gaugeHeader;
        this.description = description;
        this.gaugeMetrics = gaugeMetrics;
        this.bottomSheetMetrics = bottomSheetMetrics;
        this.pinnedMetricsHeader = pinnedMetricsHeader;
        this.unpinnedMetricsHeader = unpinnedMetricsHeader;
        this.pinnedMetricsSection = pinnedMetricsSection;
        this.unpinnedMetricsSection = unpinnedMetricsSection;
    }
}
