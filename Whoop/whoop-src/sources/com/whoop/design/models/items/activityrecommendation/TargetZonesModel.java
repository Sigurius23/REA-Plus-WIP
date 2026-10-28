package com.whoop.design.models.items.activityrecommendation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wr1.C37572f;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 JD\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001dR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010 ¨\u00068"}, m65681d2 = {"Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;", "", "", "indicatorPosition", "", "targetZoneStyle", "targetZoneTitle", "", "Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;", "targetZones", "<init>", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Float;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Float;", "getIndicatorPosition", "getIndicatorPosition$annotations", "()V", "Ljava/lang/String;", "getTargetZoneStyle", "getTargetZoneStyle$annotations", "getTargetZoneTitle", "getTargetZoneTitle$annotations", "Ljava/util/List;", "getTargetZones", "getTargetZones$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TargetZonesModel {
    private final Float indicatorPosition;
    private final String targetZoneStyle;
    private final String targetZoneTitle;
    private final List<ZoneInfoModel> targetZones;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37572f(29))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TargetZonesModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TargetZonesModel(int i13, Float f13, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, TargetZonesModel$$serializer.INSTANCE.getDescriptor());
        }
        this.indicatorPosition = f13;
        this.targetZoneStyle = str;
        this.targetZoneTitle = str2;
        this.targetZones = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ZoneInfoModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TargetZonesModel copy$default(TargetZonesModel targetZonesModel, Float f13, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = targetZonesModel.indicatorPosition;
        }
        if ((i13 & 2) != 0) {
            str = targetZonesModel.targetZoneStyle;
        }
        if ((i13 & 4) != 0) {
            str2 = targetZonesModel.targetZoneTitle;
        }
        if ((i13 & 8) != 0) {
            list = targetZonesModel.targetZones;
        }
        return targetZonesModel.copy(f13, str, str2, list);
    }

    @InterfaceC37143h("indicator_position")
    public static /* synthetic */ void getIndicatorPosition$annotations() {
    }

    @InterfaceC37143h("target_zone_style")
    public static /* synthetic */ void getTargetZoneStyle$annotations() {
    }

    @InterfaceC37143h("target_zones_title")
    public static /* synthetic */ void getTargetZoneTitle$annotations() {
    }

    @InterfaceC37143h("target_zones")
    public static /* synthetic */ void getTargetZones$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(TargetZonesModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, FloatSerializer.INSTANCE, self.indicatorPosition);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.targetZoneStyle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.targetZoneTitle);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.targetZones);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getIndicatorPosition() {
        return this.indicatorPosition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTargetZoneStyle() {
        return this.targetZoneStyle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTargetZoneTitle() {
        return this.targetZoneTitle;
    }

    public final List<ZoneInfoModel> component4() {
        return this.targetZones;
    }

    public final TargetZonesModel copy(Float indicatorPosition, String targetZoneStyle, String targetZoneTitle, List<ZoneInfoModel> targetZones) {
        AbstractC22676k.m65750j(targetZones, "targetZones");
        return new TargetZonesModel(indicatorPosition, targetZoneStyle, targetZoneTitle, targetZones);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetZonesModel)) {
            return false;
        }
        TargetZonesModel targetZonesModel = (TargetZonesModel) other;
        return AbstractC22676k.m65745e(this.indicatorPosition, targetZonesModel.indicatorPosition) && AbstractC22676k.m65745e(this.targetZoneStyle, targetZonesModel.targetZoneStyle) && AbstractC22676k.m65745e(this.targetZoneTitle, targetZonesModel.targetZoneTitle) && AbstractC22676k.m65745e(this.targetZones, targetZonesModel.targetZones);
    }

    public final Float getIndicatorPosition() {
        return this.indicatorPosition;
    }

    public final String getTargetZoneStyle() {
        return this.targetZoneStyle;
    }

    public final String getTargetZoneTitle() {
        return this.targetZoneTitle;
    }

    public final List<ZoneInfoModel> getTargetZones() {
        return this.targetZones;
    }

    public int hashCode() {
        Float f13 = this.indicatorPosition;
        int iHashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        String str = this.targetZoneStyle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetZoneTitle;
        return this.targetZones.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        Float f13 = this.indicatorPosition;
        String str = this.targetZoneStyle;
        String str2 = this.targetZoneTitle;
        List<ZoneInfoModel> list = this.targetZones;
        StringBuilder sb4 = new StringBuilder("TargetZonesModel(indicatorPosition=");
        sb4.append(f13);
        sb4.append(", targetZoneStyle=");
        sb4.append(str);
        sb4.append(", targetZoneTitle=");
        return AbstractC30007c.m91840j(str2, ", targetZones=", ")", sb4, list);
    }

    public TargetZonesModel(Float f13, String str, String str2, List<ZoneInfoModel> targetZones) {
        AbstractC22676k.m65750j(targetZones, "targetZones");
        this.indicatorPosition = f13;
        this.targetZoneStyle = str;
        this.targetZoneTitle = str2;
        this.targetZones = targetZones;
    }
}
