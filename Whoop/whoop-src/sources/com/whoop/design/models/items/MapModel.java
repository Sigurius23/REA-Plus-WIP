package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36960g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!JF\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010!¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/items/MapModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "mapTitleDisplay", "", "Lcom/whoop/design/models/items/Coordinates;", "gpsCoordinates", "Lcom/whoop/design/models/items/GpsMetrics;", "gpsMetrics", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MapModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/MapModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMapTitleDisplay", "Ljava/util/List;", "getGpsCoordinates", "getGpsMetrics", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MapModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final List<Coordinates> gpsCoordinates;
    private final List<GpsMetrics> gpsMetrics;
    private final String mapTitleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MapModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MapModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MapModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36960g(11)), AbstractC30060g.m92087G(enumC23463i, new C36960g(12)), AbstractC30060g.m92087G(enumC23463i, new C36960g(13))};
    }

    public /* synthetic */ MapModel(int i13, String str, List list, List list2, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, MapModel$$serializer.INSTANCE.getDescriptor());
        }
        this.mapTitleDisplay = str;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.gpsCoordinates = c25271y;
        } else {
            this.gpsCoordinates = list;
        }
        if ((i13 & 4) == 0) {
            this.gpsMetrics = c25271y;
        } else {
            this.gpsMetrics = list2;
        }
        if ((i13 & 8) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Coordinates$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(GpsMetrics$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MapModel copy$default(MapModel mapModel, String str, List list, List list2, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = mapModel.mapTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            list = mapModel.gpsCoordinates;
        }
        if ((i13 & 4) != 0) {
            list2 = mapModel.gpsMetrics;
        }
        if ((i13 & 8) != 0) {
            c9598e = mapModel.destination;
        }
        return mapModel.copy(str, list, list2, c9598e);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MapModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.mapTitleDisplay);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.gpsCoordinates, c25271y)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.gpsCoordinates);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.gpsMetrics, c25271y)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.gpsMetrics);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMapTitleDisplay() {
        return this.mapTitleDisplay;
    }

    public final List<Coordinates> component2() {
        return this.gpsCoordinates;
    }

    public final List<GpsMetrics> component3() {
        return this.gpsMetrics;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final MapModel copy(String mapTitleDisplay, List<Coordinates> gpsCoordinates, List<GpsMetrics> gpsMetrics, C9598e destination) {
        AbstractC22676k.m65750j(mapTitleDisplay, "mapTitleDisplay");
        AbstractC22676k.m65750j(gpsCoordinates, "gpsCoordinates");
        AbstractC22676k.m65750j(gpsMetrics, "gpsMetrics");
        return new MapModel(mapTitleDisplay, gpsCoordinates, gpsMetrics, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapModel)) {
            return false;
        }
        MapModel mapModel = (MapModel) other;
        return AbstractC22676k.m65745e(this.mapTitleDisplay, mapModel.mapTitleDisplay) && AbstractC22676k.m65745e(this.gpsCoordinates, mapModel.gpsCoordinates) && AbstractC22676k.m65745e(this.gpsMetrics, mapModel.gpsMetrics) && AbstractC22676k.m65745e(this.destination, mapModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final List<Coordinates> getGpsCoordinates() {
        return this.gpsCoordinates;
    }

    public final List<GpsMetrics> getGpsMetrics() {
        return this.gpsMetrics;
    }

    public final String getMapTitleDisplay() {
        return this.mapTitleDisplay;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.mapTitleDisplay.hashCode() * 31, 31, this.gpsCoordinates), 31, this.gpsMetrics);
        C9598e c9598e = this.destination;
        return iM31983b + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        String str = this.mapTitleDisplay;
        List<Coordinates> list = this.gpsCoordinates;
        List<GpsMetrics> list2 = this.gpsMetrics;
        C9598e c9598e = this.destination;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("MapModel(mapTitleDisplay=", str, ", gpsCoordinates=", ", gpsMetrics=", list);
        sbM94766o.append(list2);
        sbM94766o.append(", destination=");
        sbM94766o.append(c9598e);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public MapModel(String mapTitleDisplay, List<Coordinates> gpsCoordinates, List<GpsMetrics> gpsMetrics, C9598e c9598e) {
        AbstractC22676k.m65750j(mapTitleDisplay, "mapTitleDisplay");
        AbstractC22676k.m65750j(gpsCoordinates, "gpsCoordinates");
        AbstractC22676k.m65750j(gpsMetrics, "gpsMetrics");
        this.mapTitleDisplay = mapTitleDisplay;
        this.gpsCoordinates = gpsCoordinates;
        this.gpsMetrics = gpsMetrics;
        this.destination = c9598e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MapModel(String str, List list, List list2, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(str, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, (i13 & 8) != 0 ? null : c9598e);
    }
}
