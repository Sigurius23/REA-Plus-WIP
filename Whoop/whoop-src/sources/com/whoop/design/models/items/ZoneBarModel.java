package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36965l;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001e¨\u00061"}, m65681d2 = {"Lcom/whoop/design/models/items/ZoneBarModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "", "Lcom/whoop/design/models/items/ZoneBarZone;", "zones", "", "indicatorPosition", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ZoneBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Double;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;)Lcom/whoop/design/models/items/ZoneBarModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getZones", "Ljava/lang/Double;", "getIndicatorPosition", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ZoneBarModel implements DesignSystemModel {
    private final Double indicatorPosition;
    private final String title;
    private final List<ZoneBarZone> zones;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36965l(9)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ZoneBarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ZoneBarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ZoneBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ZoneBarModel(int i13, String str, List list, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i13 & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 5, ZoneBarModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.zones = C25271y.f99162w;
        } else {
            this.zones = list;
        }
        this.indicatorPosition = d3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ZoneBarZone$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneBarModel copy$default(ZoneBarModel zoneBarModel, String str, List list, Double d3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = zoneBarModel.title;
        }
        if ((i13 & 2) != 0) {
            list = zoneBarModel.zones;
        }
        if ((i13 & 4) != 0) {
            d3 = zoneBarModel.indicatorPosition;
        }
        return zoneBarModel.copy(str, list, d3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ZoneBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.zones, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.zones);
        }
        output.encodeNullableSerializableElement(serialDesc, 2, DoubleSerializer.INSTANCE, self.indicatorPosition);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ZoneBarZone> component2() {
        return this.zones;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getIndicatorPosition() {
        return this.indicatorPosition;
    }

    public final ZoneBarModel copy(String title, List<ZoneBarZone> zones, Double indicatorPosition) {
        AbstractC22676k.m65750j(zones, "zones");
        return new ZoneBarModel(title, zones, indicatorPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZoneBarModel)) {
            return false;
        }
        ZoneBarModel zoneBarModel = (ZoneBarModel) other;
        return AbstractC22676k.m65745e(this.title, zoneBarModel.title) && AbstractC22676k.m65745e(this.zones, zoneBarModel.zones) && AbstractC22676k.m65745e(this.indicatorPosition, zoneBarModel.indicatorPosition);
    }

    public final Double getIndicatorPosition() {
        return this.indicatorPosition;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<ZoneBarZone> getZones() {
        return this.zones;
    }

    public int hashCode() {
        String str = this.title;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.zones);
        Double d3 = this.indicatorPosition;
        return iM31983b + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<ZoneBarZone> list = this.zones;
        Double d3 = this.indicatorPosition;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ZoneBarModel(title=", str, ", zones=", ", indicatorPosition=", list);
        sbM94766o.append(d3);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public ZoneBarModel(String str, List<ZoneBarZone> zones, Double d3) {
        AbstractC22676k.m65750j(zones, "zones");
        this.title = str;
        this.zones = zones;
        this.indicatorPosition = d3;
    }

    public /* synthetic */ ZoneBarModel(String str, List list, Double d3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, d3);
    }
}
