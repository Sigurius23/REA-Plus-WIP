package com.whoop.design.models.items.graph.plot;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJJ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "", "id", "title", "subtitle", "", "hideWhileScrubbing", "skipScrubbing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "Ljava/lang/Boolean;", "getHideWhileScrubbing", "getSkipScrubbing", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CalibratingPlotModel extends GraphPlot {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean hideWhileScrubbing;
    private final String id;
    private final Boolean skipScrubbing;
    private final String subtitle;
    private final String title;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/CalibratingPlotModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CalibratingPlotModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CalibratingPlotModel() {
        this((String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CalibratingPlotModel copy$default(CalibratingPlotModel calibratingPlotModel, String str, String str2, String str3, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = calibratingPlotModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = calibratingPlotModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = calibratingPlotModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            bool = calibratingPlotModel.hideWhileScrubbing;
        }
        if ((i13 & 16) != 0) {
            bool2 = calibratingPlotModel.skipScrubbing;
        }
        Boolean bool3 = bool2;
        String str4 = str3;
        return calibratingPlotModel.copy(str, str2, str4, bool, bool3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CalibratingPlotModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "calibration")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.getHideWhileScrubbing(), Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.getHideWhileScrubbing());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.getSkipScrubbing() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.getSkipScrubbing());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    public final CalibratingPlotModel copy(String id4, String title, String subtitle, Boolean hideWhileScrubbing, Boolean skipScrubbing) {
        AbstractC22676k.m65750j(id4, "id");
        return new CalibratingPlotModel(id4, title, subtitle, hideWhileScrubbing, skipScrubbing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalibratingPlotModel)) {
            return false;
        }
        CalibratingPlotModel calibratingPlotModel = (CalibratingPlotModel) other;
        return AbstractC22676k.m65745e(this.id, calibratingPlotModel.id) && AbstractC22676k.m65745e(this.title, calibratingPlotModel.title) && AbstractC22676k.m65745e(this.subtitle, calibratingPlotModel.subtitle) && AbstractC22676k.m65745e(this.hideWhileScrubbing, calibratingPlotModel.hideWhileScrubbing) && AbstractC22676k.m65745e(this.skipScrubbing, calibratingPlotModel.skipScrubbing);
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    public final String getId() {
        return this.id;
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hideWhileScrubbing;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.skipScrubbing;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        Boolean bool = this.hideWhileScrubbing;
        Boolean bool2 = this.skipScrubbing;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CalibratingPlotModel(id=", str, ", title=", str2, ", subtitle=");
        AbstractC36095b.m114692t(bool, str3, ", hideWhileScrubbing=", ", skipScrubbing=", sbM32001t);
        return AbstractC11478a.m30858j(sbM32001t, bool2, ")");
    }

    public /* synthetic */ CalibratingPlotModel(int i13, String str, String str2, String str3, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.id = (i13 & 1) == 0 ? "calibration" : str;
        if ((i13 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i13 & 8) == 0) {
            this.hideWhileScrubbing = Boolean.FALSE;
        } else {
            this.hideWhileScrubbing = bool;
        }
        if ((i13 & 16) == 0) {
            this.skipScrubbing = null;
        } else {
            this.skipScrubbing = bool2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalibratingPlotModel(String id4, String str, String str2, Boolean bool, Boolean bool2) {
        super(null);
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.title = str;
        this.subtitle = str2;
        this.hideWhileScrubbing = bool;
        this.skipScrubbing = bool2;
    }

    public /* synthetic */ CalibratingPlotModel(String str, String str2, String str3, Boolean bool, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "calibration" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? Boolean.FALSE : bool, (i13 & 16) != 0 ? null : bool2);
    }
}
