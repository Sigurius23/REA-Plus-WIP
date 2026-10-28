package com.whoop.healthmonitor.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
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
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc2.C39434a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b2\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u00069"}, m65681d2 = {"Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "", "", "title", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "footer", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;", "analytics", "Lcom/whoop/healthmonitor/domain/models/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_monitor_release", "(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;", "component5", "()Lcom/whoop/healthmonitor/domain/models/MetaData;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;)Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "getFooter", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;", "getAnalytics", "Lcom/whoop/healthmonitor/domain/models/MetaData;", "getMetadata", "Companion", "$serializer", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ComposableHealthMonitorResponse {
    private final ComposableHealthMonitorAnalyticsModel analytics;
    private final String footer;
    private final List<DesignSystemModel> items;
    private final MetaData metadata;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C39434a(8)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "serializer", "()Lwc3/c;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ComposableHealthMonitorResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ComposableHealthMonitorResponse(int i13, String str, List list, String str2, ComposableHealthMonitorAnalyticsModel composableHealthMonitorAnalyticsModel, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ComposableHealthMonitorResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.items = list;
        this.footer = str2;
        this.analytics = composableHealthMonitorAnalyticsModel;
        this.metadata = metaData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComposableHealthMonitorResponse copy$default(ComposableHealthMonitorResponse composableHealthMonitorResponse, String str, List list, String str2, ComposableHealthMonitorAnalyticsModel composableHealthMonitorAnalyticsModel, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = composableHealthMonitorResponse.title;
        }
        if ((i13 & 2) != 0) {
            list = composableHealthMonitorResponse.items;
        }
        if ((i13 & 4) != 0) {
            str2 = composableHealthMonitorResponse.footer;
        }
        if ((i13 & 8) != 0) {
            composableHealthMonitorAnalyticsModel = composableHealthMonitorResponse.analytics;
        }
        if ((i13 & 16) != 0) {
            metaData = composableHealthMonitorResponse.metadata;
        }
        MetaData metaData2 = metaData;
        String str3 = str2;
        return composableHealthMonitorResponse.copy(str, list, str3, composableHealthMonitorAnalyticsModel, metaData2);
    }

    public static final /* synthetic */ void write$Self$health_monitor_release(ComposableHealthMonitorResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.footer);
        output.encodeSerializableElement(serialDesc, 3, ComposableHealthMonitorAnalyticsModel$$serializer.INSTANCE, self.analytics);
        output.encodeNullableSerializableElement(serialDesc, 4, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ComposableHealthMonitorAnalyticsModel getAnalytics() {
        return this.analytics;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final ComposableHealthMonitorResponse copy(String title, List<? extends DesignSystemModel> items, String footer, ComposableHealthMonitorAnalyticsModel analytics, MetaData metadata) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(analytics, "analytics");
        return new ComposableHealthMonitorResponse(title, items, footer, analytics, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposableHealthMonitorResponse)) {
            return false;
        }
        ComposableHealthMonitorResponse composableHealthMonitorResponse = (ComposableHealthMonitorResponse) other;
        return AbstractC22676k.m65745e(this.title, composableHealthMonitorResponse.title) && AbstractC22676k.m65745e(this.items, composableHealthMonitorResponse.items) && AbstractC22676k.m65745e(this.footer, composableHealthMonitorResponse.footer) && AbstractC22676k.m65745e(this.analytics, composableHealthMonitorResponse.analytics) && AbstractC22676k.m65745e(this.metadata, composableHealthMonitorResponse.metadata);
    }

    public final ComposableHealthMonitorAnalyticsModel getAnalytics() {
        return this.analytics;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.items);
        String str = this.footer;
        int iHashCode = (this.analytics.hashCode() + ((iM31983b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        MetaData metaData = this.metadata;
        return iHashCode + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<DesignSystemModel> list = this.items;
        String str2 = this.footer;
        ComposableHealthMonitorAnalyticsModel composableHealthMonitorAnalyticsModel = this.analytics;
        MetaData metaData = this.metadata;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ComposableHealthMonitorResponse(title=", str, ", items=", ", footer=", list);
        sbM94766o.append(str2);
        sbM94766o.append(", analytics=");
        sbM94766o.append(composableHealthMonitorAnalyticsModel);
        sbM94766o.append(", metadata=");
        sbM94766o.append(metaData);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposableHealthMonitorResponse(String title, List<? extends DesignSystemModel> items, String str, ComposableHealthMonitorAnalyticsModel analytics, MetaData metaData) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.title = title;
        this.items = items;
        this.footer = str;
        this.analytics = analytics;
        this.metadata = metaData;
    }
}
