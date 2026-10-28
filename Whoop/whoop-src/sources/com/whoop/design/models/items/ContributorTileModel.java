package com.whoop.design.models.items;

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
import w91.C36955b;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JT\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006:"}, m65681d2 = {"Lcom/whoop/design/models/items/ContributorTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "Lcom/whoop/design/models/items/ContributorTileMetricModel;", "metrics", "Lcom/whoop/design/models/items/ContributorTileLegend;", "legend", "tileLegend", "Lcom/whoop/design/models/items/ContributorTileFooter;", "footer", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/ContributorTileFooter;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/ContributorTileFooter;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ContributorTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/whoop/design/models/DesignSystemModel;", "component5", "()Lcom/whoop/design/models/items/ContributorTileFooter;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/ContributorTileFooter;)Lcom/whoop/design/models/items/ContributorTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getMetrics", "getLegend", "Lcom/whoop/design/models/DesignSystemModel;", "getTileLegend", "Lcom/whoop/design/models/items/ContributorTileFooter;", "getFooter", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ContributorTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final ContributorTileFooter footer;
    private final String id;
    private final List<ContributorTileLegend> legend;
    private final List<ContributorTileMetricModel> metrics;
    private final DesignSystemModel tileLegend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ContributorTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ContributorTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ContributorTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36955b(18)), AbstractC30060g.m92087G(enumC23463i, new C36955b(19)), AbstractC30060g.m92087G(enumC23463i, new C36955b(20)), null};
    }

    public /* synthetic */ ContributorTileModel(int i13, String str, List list, List list2, DesignSystemModel designSystemModel, ContributorTileFooter contributorTileFooter, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ContributorTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.metrics = list;
        this.legend = list2;
        this.tileLegend = designSystemModel;
        this.footer = contributorTileFooter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ContributorTileMetricModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ContributorTileLegend$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContributorTileModel copy$default(ContributorTileModel contributorTileModel, String str, List list, List list2, DesignSystemModel designSystemModel, ContributorTileFooter contributorTileFooter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = contributorTileModel.id;
        }
        if ((i13 & 2) != 0) {
            list = contributorTileModel.metrics;
        }
        if ((i13 & 4) != 0) {
            list2 = contributorTileModel.legend;
        }
        if ((i13 & 8) != 0) {
            designSystemModel = contributorTileModel.tileLegend;
        }
        if ((i13 & 16) != 0) {
            contributorTileFooter = contributorTileModel.footer;
        }
        ContributorTileFooter contributorTileFooter2 = contributorTileFooter;
        List list3 = list2;
        return contributorTileModel.copy(str, list, list3, designSystemModel, contributorTileFooter2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ContributorTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.metrics);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.legend);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.tileLegend);
        output.encodeSerializableElement(serialDesc, 4, ContributorTileFooter$$serializer.INSTANCE, self.footer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<ContributorTileMetricModel> component2() {
        return this.metrics;
    }

    public final List<ContributorTileLegend> component3() {
        return this.legend;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DesignSystemModel getTileLegend() {
        return this.tileLegend;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ContributorTileFooter getFooter() {
        return this.footer;
    }

    public final ContributorTileModel copy(String id4, List<ContributorTileMetricModel> metrics, List<ContributorTileLegend> legend, DesignSystemModel tileLegend, ContributorTileFooter footer) {
        AbstractC22676k.m65750j(metrics, "metrics");
        AbstractC22676k.m65750j(footer, "footer");
        return new ContributorTileModel(id4, metrics, legend, tileLegend, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributorTileModel)) {
            return false;
        }
        ContributorTileModel contributorTileModel = (ContributorTileModel) other;
        return AbstractC22676k.m65745e(this.id, contributorTileModel.id) && AbstractC22676k.m65745e(this.metrics, contributorTileModel.metrics) && AbstractC22676k.m65745e(this.legend, contributorTileModel.legend) && AbstractC22676k.m65745e(this.tileLegend, contributorTileModel.tileLegend) && AbstractC22676k.m65745e(this.footer, contributorTileModel.footer);
    }

    public final ContributorTileFooter getFooter() {
        return this.footer;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ContributorTileLegend> getLegend() {
        return this.legend;
    }

    public final List<ContributorTileMetricModel> getMetrics() {
        return this.metrics;
    }

    public final DesignSystemModel getTileLegend() {
        return this.tileLegend;
    }

    public int hashCode() {
        String str = this.id;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.metrics);
        List<ContributorTileLegend> list = this.legend;
        int iHashCode = (iM31983b + (list == null ? 0 : list.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.tileLegend;
        return this.footer.hashCode() + ((iHashCode + (designSystemModel != null ? designSystemModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        List<ContributorTileMetricModel> list = this.metrics;
        List<ContributorTileLegend> list2 = this.legend;
        DesignSystemModel designSystemModel = this.tileLegend;
        ContributorTileFooter contributorTileFooter = this.footer;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ContributorTileModel(id=", str, ", metrics=", ", legend=", list);
        sbM94766o.append(list2);
        sbM94766o.append(", tileLegend=");
        sbM94766o.append(designSystemModel);
        sbM94766o.append(", footer=");
        sbM94766o.append(contributorTileFooter);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public ContributorTileModel(String str, List<ContributorTileMetricModel> metrics, List<ContributorTileLegend> list, DesignSystemModel designSystemModel, ContributorTileFooter footer) {
        AbstractC22676k.m65750j(metrics, "metrics");
        AbstractC22676k.m65750j(footer, "footer");
        this.id = str;
        this.metrics = metrics;
        this.legend = list;
        this.tileLegend = designSystemModel;
        this.footer = footer;
    }
}
