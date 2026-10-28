package com.whoop.design.models.items.graph.plot.scrubber;

import a71.EnumC0523d;
import c13.AbstractC3855a;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.models.items.graph.GraphLegendModel$$serializer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import s51.C32219p;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002VUB\u008f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0098\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001eJ\u0010\u00103\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bH\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bI\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bL\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010-R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u0010/¨\u0006W"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "", "", "primaryContextualDisplay", "", "value", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "unitDisplay", "secondaryContextualDisplay", "La71/d;", "scrubberStyle", "dataContext", "Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;", "phaseLabel", "Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;", "supplementalDataScrubberDetails", "Lcom/whoop/design/models/InfoCalloutTileModel;", "callout", "", "Lcom/whoop/design/models/items/graph/GraphLegendModel;", "graphLegends", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "()Lcom/whoop/design/util/TextResource;", "component4", "component5", "component6", "()La71/d;", "component7", "component8", "()Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;", "component9", "()Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;", "component10", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component11", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;La71/d;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;Lcom/whoop/design/models/InfoCalloutTileModel;Ljava/util/List;)Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getPrimaryContextualDisplay", "Ljava/lang/Double;", "getValue", "Lcom/whoop/design/util/TextResource;", "getValueDisplay", "getUnitDisplay", "getSecondaryContextualDisplay", "La71/d;", "getScrubberStyle", "getDataContext", "Lcom/whoop/design/models/items/graph/plot/scrubber/PhaseLabel;", "getPhaseLabel", "Lcom/whoop/design/models/items/graph/plot/scrubber/SupplementalDataScrubberDetails;", "getSupplementalDataScrubberDetails", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getCallout", "Ljava/util/List;", "getGraphLegends", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DataScrubberDetailsModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final InfoCalloutTileModel callout;
    private final String dataContext;
    private final List<GraphLegendModel> graphLegends;
    private final PhaseLabel phaseLabel;
    private final String primaryContextualDisplay;
    private final EnumC0523d scrubberStyle;
    private final String secondaryContextualDisplay;
    private final SupplementalDataScrubberDetails supplementalDataScrubberDetails;
    private final String unitDisplay;
    private final Double value;
    private final TextResource valueDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DataScrubberDetailsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C32219p(15)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C32219p(16))};
    }

    public DataScrubberDetailsModel() {
        this((String) null, (Double) null, (TextResource) null, (String) null, (String) null, (EnumC0523d) null, (String) null, (PhaseLabel) null, (SupplementalDataScrubberDetails) null, (InfoCalloutTileModel) null, (List) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.graph.plot.scrubber.ScrubberStyle", EnumC0523d.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(GraphLegendModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataScrubberDetailsModel copy$default(DataScrubberDetailsModel dataScrubberDetailsModel, String str, Double d3, TextResource textResource, String str2, String str3, EnumC0523d enumC0523d, String str4, PhaseLabel phaseLabel, SupplementalDataScrubberDetails supplementalDataScrubberDetails, InfoCalloutTileModel infoCalloutTileModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dataScrubberDetailsModel.primaryContextualDisplay;
        }
        if ((i13 & 2) != 0) {
            d3 = dataScrubberDetailsModel.value;
        }
        if ((i13 & 4) != 0) {
            textResource = dataScrubberDetailsModel.valueDisplay;
        }
        if ((i13 & 8) != 0) {
            str2 = dataScrubberDetailsModel.unitDisplay;
        }
        if ((i13 & 16) != 0) {
            str3 = dataScrubberDetailsModel.secondaryContextualDisplay;
        }
        if ((i13 & 32) != 0) {
            enumC0523d = dataScrubberDetailsModel.scrubberStyle;
        }
        if ((i13 & 64) != 0) {
            str4 = dataScrubberDetailsModel.dataContext;
        }
        if ((i13 & 128) != 0) {
            phaseLabel = dataScrubberDetailsModel.phaseLabel;
        }
        if ((i13 & 256) != 0) {
            supplementalDataScrubberDetails = dataScrubberDetailsModel.supplementalDataScrubberDetails;
        }
        if ((i13 & 512) != 0) {
            infoCalloutTileModel = dataScrubberDetailsModel.callout;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list = dataScrubberDetailsModel.graphLegends;
        }
        InfoCalloutTileModel infoCalloutTileModel2 = infoCalloutTileModel;
        List list2 = list;
        PhaseLabel phaseLabel2 = phaseLabel;
        SupplementalDataScrubberDetails supplementalDataScrubberDetails2 = supplementalDataScrubberDetails;
        EnumC0523d enumC0523d2 = enumC0523d;
        String str5 = str4;
        String str6 = str3;
        TextResource textResource2 = textResource;
        return dataScrubberDetailsModel.copy(str, d3, textResource2, str2, str6, enumC0523d2, str5, phaseLabel2, supplementalDataScrubberDetails2, infoCalloutTileModel2, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(DataScrubberDetailsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.primaryContextualDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.primaryContextualDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.value != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, DoubleSerializer.INSTANCE, self.value);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.valueDisplay, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.valueDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.unitDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.unitDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.secondaryContextualDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.secondaryContextualDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.scrubberStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.scrubberStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.dataContext != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.dataContext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.phaseLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, PhaseLabel$$serializer.INSTANCE, self.phaseLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.supplementalDataScrubberDetails != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, SupplementalDataScrubberDetails$$serializer.INSTANCE, self.supplementalDataScrubberDetails);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.callout != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, InfoCalloutTileModel$$serializer.INSTANCE, self.callout);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.graphLegends == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.graphLegends);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrimaryContextualDisplay() {
        return this.primaryContextualDisplay;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final List<GraphLegendModel> component11() {
        return this.graphLegends;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getValueDisplay() {
        return this.valueDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUnitDisplay() {
        return this.unitDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecondaryContextualDisplay() {
        return this.secondaryContextualDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC0523d getScrubberStyle() {
        return this.scrubberStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDataContext() {
        return this.dataContext;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PhaseLabel getPhaseLabel() {
        return this.phaseLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SupplementalDataScrubberDetails getSupplementalDataScrubberDetails() {
        return this.supplementalDataScrubberDetails;
    }

    public final DataScrubberDetailsModel copy(String primaryContextualDisplay, Double value, TextResource valueDisplay, String unitDisplay, String secondaryContextualDisplay, EnumC0523d scrubberStyle, String dataContext, PhaseLabel phaseLabel, SupplementalDataScrubberDetails supplementalDataScrubberDetails, InfoCalloutTileModel callout, List<GraphLegendModel> graphLegends) {
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        return new DataScrubberDetailsModel(primaryContextualDisplay, value, valueDisplay, unitDisplay, secondaryContextualDisplay, scrubberStyle, dataContext, phaseLabel, supplementalDataScrubberDetails, callout, graphLegends);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataScrubberDetailsModel)) {
            return false;
        }
        DataScrubberDetailsModel dataScrubberDetailsModel = (DataScrubberDetailsModel) other;
        return AbstractC22676k.m65745e(this.primaryContextualDisplay, dataScrubberDetailsModel.primaryContextualDisplay) && AbstractC22676k.m65745e(this.value, dataScrubberDetailsModel.value) && AbstractC22676k.m65745e(this.valueDisplay, dataScrubberDetailsModel.valueDisplay) && AbstractC22676k.m65745e(this.unitDisplay, dataScrubberDetailsModel.unitDisplay) && AbstractC22676k.m65745e(this.secondaryContextualDisplay, dataScrubberDetailsModel.secondaryContextualDisplay) && this.scrubberStyle == dataScrubberDetailsModel.scrubberStyle && AbstractC22676k.m65745e(this.dataContext, dataScrubberDetailsModel.dataContext) && AbstractC22676k.m65745e(this.phaseLabel, dataScrubberDetailsModel.phaseLabel) && AbstractC22676k.m65745e(this.supplementalDataScrubberDetails, dataScrubberDetailsModel.supplementalDataScrubberDetails) && AbstractC22676k.m65745e(this.callout, dataScrubberDetailsModel.callout) && AbstractC22676k.m65745e(this.graphLegends, dataScrubberDetailsModel.graphLegends);
    }

    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final String getDataContext() {
        return this.dataContext;
    }

    public final List<GraphLegendModel> getGraphLegends() {
        return this.graphLegends;
    }

    public final PhaseLabel getPhaseLabel() {
        return this.phaseLabel;
    }

    public final String getPrimaryContextualDisplay() {
        return this.primaryContextualDisplay;
    }

    public final EnumC0523d getScrubberStyle() {
        return this.scrubberStyle;
    }

    public final String getSecondaryContextualDisplay() {
        return this.secondaryContextualDisplay;
    }

    public final SupplementalDataScrubberDetails getSupplementalDataScrubberDetails() {
        return this.supplementalDataScrubberDetails;
    }

    public final String getUnitDisplay() {
        return this.unitDisplay;
    }

    public final Double getValue() {
        return this.value;
    }

    public final TextResource getValueDisplay() {
        return this.valueDisplay;
    }

    public int hashCode() {
        String str = this.primaryContextualDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d3 = this.value;
        int iM95625a = AbstractC31061c.m95625a((iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31, this.valueDisplay, 31);
        String str2 = this.unitDisplay;
        int iHashCode2 = (iM95625a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryContextualDisplay;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC0523d enumC0523d = this.scrubberStyle;
        int iHashCode4 = (iHashCode3 + (enumC0523d == null ? 0 : enumC0523d.hashCode())) * 31;
        String str4 = this.dataContext;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PhaseLabel phaseLabel = this.phaseLabel;
        int iHashCode6 = (iHashCode5 + (phaseLabel == null ? 0 : phaseLabel.hashCode())) * 31;
        SupplementalDataScrubberDetails supplementalDataScrubberDetails = this.supplementalDataScrubberDetails;
        int iHashCode7 = (iHashCode6 + (supplementalDataScrubberDetails == null ? 0 : supplementalDataScrubberDetails.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        int iHashCode8 = (iHashCode7 + (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode())) * 31;
        List<GraphLegendModel> list = this.graphLegends;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.primaryContextualDisplay;
        Double d3 = this.value;
        TextResource textResource = this.valueDisplay;
        String str2 = this.unitDisplay;
        String str3 = this.secondaryContextualDisplay;
        EnumC0523d enumC0523d = this.scrubberStyle;
        String str4 = this.dataContext;
        PhaseLabel phaseLabel = this.phaseLabel;
        SupplementalDataScrubberDetails supplementalDataScrubberDetails = this.supplementalDataScrubberDetails;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        List<GraphLegendModel> list = this.graphLegends;
        StringBuilder sb4 = new StringBuilder("DataScrubberDetailsModel(primaryContextualDisplay=");
        sb4.append(str);
        sb4.append(", value=");
        sb4.append(d3);
        sb4.append(", valueDisplay=");
        AbstractC30007c.m91856z(sb4, textResource, ", unitDisplay=", str2, ", secondaryContextualDisplay=");
        sb4.append(str3);
        sb4.append(", scrubberStyle=");
        sb4.append(enumC0523d);
        sb4.append(", dataContext=");
        sb4.append(str4);
        sb4.append(", phaseLabel=");
        sb4.append(phaseLabel);
        sb4.append(", supplementalDataScrubberDetails=");
        sb4.append(supplementalDataScrubberDetails);
        sb4.append(", callout=");
        sb4.append(infoCalloutTileModel);
        sb4.append(", graphLegends=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public /* synthetic */ DataScrubberDetailsModel(int i13, String str, Double d3, TextResource textResource, String str2, String str3, EnumC0523d enumC0523d, String str4, PhaseLabel phaseLabel, SupplementalDataScrubberDetails supplementalDataScrubberDetails, InfoCalloutTileModel infoCalloutTileModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.primaryContextualDisplay = null;
        } else {
            this.primaryContextualDisplay = str;
        }
        if ((i13 & 2) == 0) {
            this.value = null;
        } else {
            this.value = d3;
        }
        if ((i13 & 4) == 0) {
            this.valueDisplay = AbstractC8693b.m21267a();
        } else {
            this.valueDisplay = textResource;
        }
        if ((i13 & 8) == 0) {
            this.unitDisplay = null;
        } else {
            this.unitDisplay = str2;
        }
        if ((i13 & 16) == 0) {
            this.secondaryContextualDisplay = null;
        } else {
            this.secondaryContextualDisplay = str3;
        }
        if ((i13 & 32) == 0) {
            this.scrubberStyle = null;
        } else {
            this.scrubberStyle = enumC0523d;
        }
        if ((i13 & 64) == 0) {
            this.dataContext = null;
        } else {
            this.dataContext = str4;
        }
        if ((i13 & 128) == 0) {
            this.phaseLabel = null;
        } else {
            this.phaseLabel = phaseLabel;
        }
        if ((i13 & 256) == 0) {
            this.supplementalDataScrubberDetails = null;
        } else {
            this.supplementalDataScrubberDetails = supplementalDataScrubberDetails;
        }
        if ((i13 & 512) == 0) {
            this.callout = null;
        } else {
            this.callout = infoCalloutTileModel;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.graphLegends = null;
        } else {
            this.graphLegends = list;
        }
    }

    public DataScrubberDetailsModel(String str, Double d3, TextResource valueDisplay, String str2, String str3, EnumC0523d enumC0523d, String str4, PhaseLabel phaseLabel, SupplementalDataScrubberDetails supplementalDataScrubberDetails, InfoCalloutTileModel infoCalloutTileModel, List<GraphLegendModel> list) {
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        this.primaryContextualDisplay = str;
        this.value = d3;
        this.valueDisplay = valueDisplay;
        this.unitDisplay = str2;
        this.secondaryContextualDisplay = str3;
        this.scrubberStyle = enumC0523d;
        this.dataContext = str4;
        this.phaseLabel = phaseLabel;
        this.supplementalDataScrubberDetails = supplementalDataScrubberDetails;
        this.callout = infoCalloutTileModel;
        this.graphLegends = list;
    }

    public /* synthetic */ DataScrubberDetailsModel(String str, Double d3, TextResource textResource, String str2, String str3, EnumC0523d enumC0523d, String str4, PhaseLabel phaseLabel, SupplementalDataScrubberDetails supplementalDataScrubberDetails, InfoCalloutTileModel infoCalloutTileModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : d3, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : enumC0523d, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : phaseLabel, (i13 & 256) != 0 ? null : supplementalDataScrubberDetails, (i13 & 512) != 0 ? null : infoCalloutTileModel, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : list);
    }
}
