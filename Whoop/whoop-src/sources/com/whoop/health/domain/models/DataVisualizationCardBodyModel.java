package com.whoop.health.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CtaTileModel$$serializer;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactModel$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0002A@B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jd\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b=\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "heading", "title", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "Lcom/whoop/design/models/items/CtaTileModel;", "prefixCta", "suffixCta", "Lcom/whoop/health/domain/models/CardSupplementalInfo;", "cardSupplementalInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/ImpactModel;", "component4", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component5", "()Lcom/whoop/design/models/items/CtaTileModel;", "component6", "component7", "()Lcom/whoop/health/domain/models/CardSupplementalInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;)Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeading", "getTitle", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "Lcom/whoop/design/models/items/CtaTileModel;", "getPrefixCta", "getSuffixCta", "Lcom/whoop/health/domain/models/CardSupplementalInfo;", "getCardSupplementalInfo", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DataVisualizationCardBodyModel implements DesignSystemModel {
    private final CardSupplementalInfo cardSupplementalInfo;
    private final GraphModel graph;
    private final String heading;
    private final CtaTileModel prefixCta;
    private final CtaTileModel suffixCta;
    private final String title;
    private final ImpactModel trend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DataVisualizationCardBodyModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DataVisualizationCardBodyModel() {
        this((String) null, (String) null, (ImpactModel) null, (GraphModel) null, (CtaTileModel) null, (CtaTileModel) null, (CardSupplementalInfo) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DataVisualizationCardBodyModel copy$default(DataVisualizationCardBodyModel dataVisualizationCardBodyModel, String str, String str2, ImpactModel impactModel, GraphModel graphModel, CtaTileModel ctaTileModel, CtaTileModel ctaTileModel2, CardSupplementalInfo cardSupplementalInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dataVisualizationCardBodyModel.heading;
        }
        if ((i13 & 2) != 0) {
            str2 = dataVisualizationCardBodyModel.title;
        }
        if ((i13 & 4) != 0) {
            impactModel = dataVisualizationCardBodyModel.trend;
        }
        if ((i13 & 8) != 0) {
            graphModel = dataVisualizationCardBodyModel.graph;
        }
        if ((i13 & 16) != 0) {
            ctaTileModel = dataVisualizationCardBodyModel.prefixCta;
        }
        if ((i13 & 32) != 0) {
            ctaTileModel2 = dataVisualizationCardBodyModel.suffixCta;
        }
        if ((i13 & 64) != 0) {
            cardSupplementalInfo = dataVisualizationCardBodyModel.cardSupplementalInfo;
        }
        CtaTileModel ctaTileModel3 = ctaTileModel2;
        CardSupplementalInfo cardSupplementalInfo2 = cardSupplementalInfo;
        CtaTileModel ctaTileModel4 = ctaTileModel;
        ImpactModel impactModel2 = impactModel;
        return dataVisualizationCardBodyModel.copy(str, str2, impactModel2, graphModel, ctaTileModel4, ctaTileModel3, cardSupplementalInfo2);
    }

    public static final /* synthetic */ void write$Self$health_release(DataVisualizationCardBodyModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.heading, "")) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.heading);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.trend != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, ImpactModel$$serializer.INSTANCE, self.trend);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.graph != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, GraphModel$$serializer.INSTANCE, self.graph);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.prefixCta != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, CtaTileModel$$serializer.INSTANCE, self.prefixCta);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.suffixCta != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, CtaTileModel$$serializer.INSTANCE, self.suffixCta);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.cardSupplementalInfo == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, CardSupplementalInfo$$serializer.INSTANCE, self.cardSupplementalInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeading() {
        return this.heading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CtaTileModel getPrefixCta() {
        return this.prefixCta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CtaTileModel getSuffixCta() {
        return this.suffixCta;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CardSupplementalInfo getCardSupplementalInfo() {
        return this.cardSupplementalInfo;
    }

    public final DataVisualizationCardBodyModel copy(String heading, String title, ImpactModel trend, GraphModel graph, CtaTileModel prefixCta, CtaTileModel suffixCta, CardSupplementalInfo cardSupplementalInfo) {
        return new DataVisualizationCardBodyModel(heading, title, trend, graph, prefixCta, suffixCta, cardSupplementalInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataVisualizationCardBodyModel)) {
            return false;
        }
        DataVisualizationCardBodyModel dataVisualizationCardBodyModel = (DataVisualizationCardBodyModel) other;
        return AbstractC22676k.m65745e(this.heading, dataVisualizationCardBodyModel.heading) && AbstractC22676k.m65745e(this.title, dataVisualizationCardBodyModel.title) && AbstractC22676k.m65745e(this.trend, dataVisualizationCardBodyModel.trend) && AbstractC22676k.m65745e(this.graph, dataVisualizationCardBodyModel.graph) && AbstractC22676k.m65745e(this.prefixCta, dataVisualizationCardBodyModel.prefixCta) && AbstractC22676k.m65745e(this.suffixCta, dataVisualizationCardBodyModel.suffixCta) && AbstractC22676k.m65745e(this.cardSupplementalInfo, dataVisualizationCardBodyModel.cardSupplementalInfo);
    }

    public final CardSupplementalInfo getCardSupplementalInfo() {
        return this.cardSupplementalInfo;
    }

    public final GraphModel getGraph() {
        return this.graph;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final CtaTileModel getPrefixCta() {
        return this.prefixCta;
    }

    public final CtaTileModel getSuffixCta() {
        return this.suffixCta;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public int hashCode() {
        String str = this.heading;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImpactModel impactModel = this.trend;
        int iHashCode3 = (iHashCode2 + (impactModel == null ? 0 : impactModel.hashCode())) * 31;
        GraphModel graphModel = this.graph;
        int iHashCode4 = (iHashCode3 + (graphModel == null ? 0 : graphModel.hashCode())) * 31;
        CtaTileModel ctaTileModel = this.prefixCta;
        int iHashCode5 = (iHashCode4 + (ctaTileModel == null ? 0 : ctaTileModel.hashCode())) * 31;
        CtaTileModel ctaTileModel2 = this.suffixCta;
        int iHashCode6 = (iHashCode5 + (ctaTileModel2 == null ? 0 : ctaTileModel2.hashCode())) * 31;
        CardSupplementalInfo cardSupplementalInfo = this.cardSupplementalInfo;
        return iHashCode6 + (cardSupplementalInfo != null ? cardSupplementalInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.heading;
        String str2 = this.title;
        ImpactModel impactModel = this.trend;
        GraphModel graphModel = this.graph;
        CtaTileModel ctaTileModel = this.prefixCta;
        CtaTileModel ctaTileModel2 = this.suffixCta;
        CardSupplementalInfo cardSupplementalInfo = this.cardSupplementalInfo;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DataVisualizationCardBodyModel(heading=", str, ", title=", str2, ", trend=");
        sbM32001t.append(impactModel);
        sbM32001t.append(", graph=");
        sbM32001t.append(graphModel);
        sbM32001t.append(", prefixCta=");
        sbM32001t.append(ctaTileModel);
        sbM32001t.append(", suffixCta=");
        sbM32001t.append(ctaTileModel2);
        sbM32001t.append(", cardSupplementalInfo=");
        sbM32001t.append(cardSupplementalInfo);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ DataVisualizationCardBodyModel(int i13, String str, String str2, ImpactModel impactModel, GraphModel graphModel, CtaTileModel ctaTileModel, CtaTileModel ctaTileModel2, CardSupplementalInfo cardSupplementalInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.heading = "";
        } else {
            this.heading = str;
        }
        if ((i13 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.trend = null;
        } else {
            this.trend = impactModel;
        }
        if ((i13 & 8) == 0) {
            this.graph = null;
        } else {
            this.graph = graphModel;
        }
        if ((i13 & 16) == 0) {
            this.prefixCta = null;
        } else {
            this.prefixCta = ctaTileModel;
        }
        if ((i13 & 32) == 0) {
            this.suffixCta = null;
        } else {
            this.suffixCta = ctaTileModel2;
        }
        if ((i13 & 64) == 0) {
            this.cardSupplementalInfo = null;
        } else {
            this.cardSupplementalInfo = cardSupplementalInfo;
        }
    }

    public DataVisualizationCardBodyModel(String str, String str2, ImpactModel impactModel, GraphModel graphModel, CtaTileModel ctaTileModel, CtaTileModel ctaTileModel2, CardSupplementalInfo cardSupplementalInfo) {
        this.heading = str;
        this.title = str2;
        this.trend = impactModel;
        this.graph = graphModel;
        this.prefixCta = ctaTileModel;
        this.suffixCta = ctaTileModel2;
        this.cardSupplementalInfo = cardSupplementalInfo;
    }

    public /* synthetic */ DataVisualizationCardBodyModel(String str, String str2, ImpactModel impactModel, GraphModel graphModel, CtaTileModel ctaTileModel, CtaTileModel ctaTileModel2, CardSupplementalInfo cardSupplementalInfo, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : impactModel, (i13 & 8) != 0 ? null : graphModel, (i13 & 16) != 0 ? null : ctaTileModel, (i13 & 32) != 0 ? null : ctaTileModel2, (i13 & 64) != 0 ? null : cardSupplementalInfo);
    }
}
