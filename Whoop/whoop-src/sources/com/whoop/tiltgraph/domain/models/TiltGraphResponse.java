package com.whoop.tiltgraph.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.items.graph.ScrollableGraphPlaneModel;
import com.whoop.design.models.items.graph.ZoomToggleModel;
import com.whoop.design.models.items.graph.ZoomableGraphModel;
import com.whoop.design.models.items.graph.ZoomableGraphModel$$serializer;
import com.whoop.design.models.items.graph.ZoomableGraphZoomLevelModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JD\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001eR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010\u001eR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010!R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b;\u00100\u001a\u0004\b:\u0010#¨\u0006>"}, m65681d2 = {"Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;", "", "Lcom/whoop/design/models/items/graph/ZoomableGraphModel;", "graph", "", "lastUpdatedTimestamp", "title", "Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;", "datePicker", "Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;", "analyticsMetadata", "<init>", "(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/graph/ZoomableGraphModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$tilt_graph_release", "(Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/graph/ZoomableGraphModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;", "component5", "()Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;", "copy", "(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;)Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/graph/ZoomableGraphModel;", "getGraph", "getGraph$annotations", "()V", "Ljava/lang/String;", "getLastUpdatedTimestamp", "getLastUpdatedTimestamp$annotations", "getTitle", "getTitle$annotations", "Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;", "getDatePicker", "getDatePicker$annotations", "Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;", "getAnalyticsMetadata", "getAnalyticsMetadata$annotations", "Companion", "$serializer", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TiltGraphResponse {

    @SerializedName("analytics_metadata")
    private final TiltGraphAnalyticsMetadata analyticsMetadata;

    @SerializedName("date_picker")
    private final TiltGraphDatePickerModel datePicker;

    @SerializedName("graph")
    private final ZoomableGraphModel graph;

    @SerializedName("last_updated_timestamp")
    private final String lastUpdatedTimestamp;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ZoomableGraphModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;", "serializer", "()Lwc3/c;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TiltGraphResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TiltGraphResponse() {
        this((ZoomableGraphModel) null, (String) null, (String) null, (TiltGraphDatePickerModel) null, (TiltGraphAnalyticsMetadata) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TiltGraphResponse copy$default(TiltGraphResponse tiltGraphResponse, ZoomableGraphModel zoomableGraphModel, String str, String str2, TiltGraphDatePickerModel tiltGraphDatePickerModel, TiltGraphAnalyticsMetadata tiltGraphAnalyticsMetadata, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            zoomableGraphModel = tiltGraphResponse.graph;
        }
        if ((i13 & 2) != 0) {
            str = tiltGraphResponse.lastUpdatedTimestamp;
        }
        if ((i13 & 4) != 0) {
            str2 = tiltGraphResponse.title;
        }
        if ((i13 & 8) != 0) {
            tiltGraphDatePickerModel = tiltGraphResponse.datePicker;
        }
        if ((i13 & 16) != 0) {
            tiltGraphAnalyticsMetadata = tiltGraphResponse.analyticsMetadata;
        }
        TiltGraphAnalyticsMetadata tiltGraphAnalyticsMetadata2 = tiltGraphAnalyticsMetadata;
        String str3 = str2;
        return tiltGraphResponse.copy(zoomableGraphModel, str, str3, tiltGraphDatePickerModel, tiltGraphAnalyticsMetadata2);
    }

    @InterfaceC37143h("analytics_metadata")
    public static /* synthetic */ void getAnalyticsMetadata$annotations() {
    }

    @InterfaceC37143h("date_picker")
    public static /* synthetic */ void getDatePicker$annotations() {
    }

    @InterfaceC37143h("graph")
    public static /* synthetic */ void getGraph$annotations() {
    }

    @InterfaceC37143h("last_updated_timestamp")
    public static /* synthetic */ void getLastUpdatedTimestamp$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$tilt_graph_release(TiltGraphResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, ZoomableGraphModel$$serializer.INSTANCE, self.graph);
        } else {
            if (!AbstractC22676k.m65745e(self.graph, new ZoomableGraphModel((String) null, (ScrollableGraphPlaneModel) null, (List) null, 0.0d, (ZoomableGraphZoomLevelModel) null, (ZoomToggleModel) null, 63, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 0, ZoomableGraphModel$$serializer.INSTANCE, self.graph);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.lastUpdatedTimestamp, "")) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.lastUpdatedTimestamp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 2, self.title);
        }
        int i13 = 3;
        if (output.shouldEncodeElementDefault(serialDesc, 3)) {
            output.encodeSerializableElement(serialDesc, 3, TiltGraphDatePickerModel$$serializer.INSTANCE, self.datePicker);
        } else {
            if (!AbstractC22676k.m65745e(self.datePicker, new TiltGraphDatePickerModel((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 3, TiltGraphDatePickerModel$$serializer.INSTANCE, self.datePicker);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && AbstractC22676k.m65745e(self.analyticsMetadata, new TiltGraphAnalyticsMetadata((String) null, (String) (0 == true ? 1 : 0), i13, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, TiltGraphAnalyticsMetadata$$serializer.INSTANCE, self.analyticsMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ZoomableGraphModel getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TiltGraphDatePickerModel getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TiltGraphAnalyticsMetadata getAnalyticsMetadata() {
        return this.analyticsMetadata;
    }

    public final TiltGraphResponse copy(ZoomableGraphModel graph, String lastUpdatedTimestamp, String title, TiltGraphDatePickerModel datePicker, TiltGraphAnalyticsMetadata analyticsMetadata) {
        AbstractC22676k.m65750j(graph, "graph");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(datePicker, "datePicker");
        AbstractC22676k.m65750j(analyticsMetadata, "analyticsMetadata");
        return new TiltGraphResponse(graph, lastUpdatedTimestamp, title, datePicker, analyticsMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TiltGraphResponse)) {
            return false;
        }
        TiltGraphResponse tiltGraphResponse = (TiltGraphResponse) other;
        return AbstractC22676k.m65745e(this.graph, tiltGraphResponse.graph) && AbstractC22676k.m65745e(this.lastUpdatedTimestamp, tiltGraphResponse.lastUpdatedTimestamp) && AbstractC22676k.m65745e(this.title, tiltGraphResponse.title) && AbstractC22676k.m65745e(this.datePicker, tiltGraphResponse.datePicker) && AbstractC22676k.m65745e(this.analyticsMetadata, tiltGraphResponse.analyticsMetadata);
    }

    public final TiltGraphAnalyticsMetadata getAnalyticsMetadata() {
        return this.analyticsMetadata;
    }

    public final TiltGraphDatePickerModel getDatePicker() {
        return this.datePicker;
    }

    public final ZoomableGraphModel getGraph() {
        return this.graph;
    }

    public final String getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.graph.hashCode() * 31;
        String str = this.lastUpdatedTimestamp;
        return this.analyticsMetadata.hashCode() + ((this.datePicker.hashCode() + AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title)) * 31);
    }

    public String toString() {
        return "TiltGraphResponse(graph=" + this.graph + ", lastUpdatedTimestamp=" + this.lastUpdatedTimestamp + ", title=" + this.title + ", datePicker=" + this.datePicker + ", analyticsMetadata=" + this.analyticsMetadata + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ TiltGraphResponse(int i13, ZoomableGraphModel zoomableGraphModel, String str, String str2, TiltGraphDatePickerModel tiltGraphDatePickerModel, TiltGraphAnalyticsMetadata tiltGraphAnalyticsMetadata, SerializationConstructorMarker serializationConstructorMarker) {
        TiltGraphAnalyticsMetadata tiltGraphAnalyticsMetadata2;
        if ((i13 & 1) == 0) {
            this.graph = new ZoomableGraphModel((String) null, (ScrollableGraphPlaneModel) null, (List) null, 0.0d, (ZoomableGraphZoomLevelModel) null, (ZoomToggleModel) null, 63, (DefaultConstructorMarker) null);
        } else {
            this.graph = zoomableGraphModel;
        }
        if ((i13 & 2) == 0) {
            this.lastUpdatedTimestamp = "";
        } else {
            this.lastUpdatedTimestamp = str;
        }
        if ((i13 & 4) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i13 & 8) == 0) {
            this.datePicker = new TiltGraphDatePickerModel((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.datePicker = tiltGraphDatePickerModel;
        }
        if ((i13 & 16) == 0) {
            tiltGraphAnalyticsMetadata2 = new TiltGraphAnalyticsMetadata((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            tiltGraphAnalyticsMetadata2 = tiltGraphAnalyticsMetadata;
        }
        this.analyticsMetadata = tiltGraphAnalyticsMetadata2;
    }

    public TiltGraphResponse(ZoomableGraphModel graph, String str, String title, TiltGraphDatePickerModel datePicker, TiltGraphAnalyticsMetadata analyticsMetadata) {
        AbstractC22676k.m65750j(graph, "graph");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(datePicker, "datePicker");
        AbstractC22676k.m65750j(analyticsMetadata, "analyticsMetadata");
        this.graph = graph;
        this.lastUpdatedTimestamp = str;
        this.title = title;
        this.datePicker = datePicker;
        this.analyticsMetadata = analyticsMetadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ TiltGraphResponse(ZoomableGraphModel zoomableGraphModel, String str, String str2, TiltGraphDatePickerModel tiltGraphDatePickerModel, TiltGraphAnalyticsMetadata tiltGraphAnalyticsMetadata, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        TiltGraphAnalyticsMetadata tiltGraphAnalyticsMetadata2;
        if ((i13 & 1) != 0) {
            zoomableGraphModel = new ZoomableGraphModel((String) null, (ScrollableGraphPlaneModel) null, (List) null, 0.0d, (ZoomableGraphZoomLevelModel) null, (ZoomToggleModel) null, 63, (DefaultConstructorMarker) null);
        }
        str = (i13 & 2) != 0 ? "" : str;
        str2 = (i13 & 4) != 0 ? "" : str2;
        tiltGraphDatePickerModel = (i13 & 8) != 0 ? new TiltGraphDatePickerModel((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : tiltGraphDatePickerModel;
        if ((i13 & 16) != 0) {
            tiltGraphAnalyticsMetadata2 = new TiltGraphAnalyticsMetadata((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            tiltGraphAnalyticsMetadata2 = tiltGraphAnalyticsMetadata;
        }
        this(zoomableGraphModel, str, str2, tiltGraphDatePickerModel, tiltGraphAnalyticsMetadata2);
    }
}
