package com.whoop.trends.data.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wi0.C37312d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JZ\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b:\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'¨\u0006?"}, m65681d2 = {"Lcom/whoop/trends/data/model/MeasurementContent;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lgz0/m0;", "icon", "iconUrl", "", "measurementValue", "unit", "subtitle", "Lcom/whoop/trends/data/model/TrendMenuSheet;", "menuSheet", "<init>", "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/MeasurementContent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lgz0/m0;", "component3", "component4", "()D", "component5", "component6", "component7", "()Lcom/whoop/trends/data/model/TrendMenuSheet;", "copy", "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;)Lcom/whoop/trends/data/model/MeasurementContent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lgz0/m0;", "getIcon", "getIconUrl", "D", "getMeasurementValue", "getUnit", "getSubtitle", "Lcom/whoop/trends/data/model/TrendMenuSheet;", "getMenuSheet", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MeasurementContent implements DesignSystemModel {
    private final EnumC16313m0 icon;
    private final String iconUrl;
    private final String id;
    private final double measurementValue;
    private final TrendMenuSheet menuSheet;
    private final String subtitle;
    private final String unit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37312d(21)), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/MeasurementContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/MeasurementContent;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MeasurementContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MeasurementContent(int i13, String str, EnumC16313m0 enumC16313m0, String str2, double d3, String str3, String str4, TrendMenuSheet trendMenuSheet, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, MeasurementContent$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.icon = enumC16313m0;
        this.iconUrl = str2;
        this.measurementValue = d3;
        this.unit = str3;
        this.subtitle = str4;
        this.menuSheet = trendMenuSheet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ MeasurementContent copy$default(MeasurementContent measurementContent, String str, EnumC16313m0 enumC16313m0, String str2, double d3, String str3, String str4, TrendMenuSheet trendMenuSheet, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = measurementContent.id;
        }
        if ((i13 & 2) != 0) {
            enumC16313m0 = measurementContent.icon;
        }
        if ((i13 & 4) != 0) {
            str2 = measurementContent.iconUrl;
        }
        if ((i13 & 8) != 0) {
            d3 = measurementContent.measurementValue;
        }
        if ((i13 & 16) != 0) {
            str3 = measurementContent.unit;
        }
        if ((i13 & 32) != 0) {
            str4 = measurementContent.subtitle;
        }
        if ((i13 & 64) != 0) {
            trendMenuSheet = measurementContent.menuSheet;
        }
        TrendMenuSheet trendMenuSheet2 = trendMenuSheet;
        String str5 = str3;
        double d14 = d3;
        String str6 = str2;
        return measurementContent.copy(str, enumC16313m0, str6, d14, str5, str4, trendMenuSheet2);
    }

    public static final /* synthetic */ void write$Self$trends_release(MeasurementContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.icon);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.iconUrl);
        output.encodeDoubleElement(serialDesc, 3, self.measurementValue);
        output.encodeStringElement(serialDesc, 4, self.unit);
        output.encodeStringElement(serialDesc, 5, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 6, TrendMenuSheet$$serializer.INSTANCE, self.menuSheet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMeasurementValue() {
        return this.measurementValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TrendMenuSheet getMenuSheet() {
        return this.menuSheet;
    }

    public final MeasurementContent copy(String id4, EnumC16313m0 icon, String iconUrl, double measurementValue, String unit, String subtitle, TrendMenuSheet menuSheet) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new MeasurementContent(id4, icon, iconUrl, measurementValue, unit, subtitle, menuSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasurementContent)) {
            return false;
        }
        MeasurementContent measurementContent = (MeasurementContent) other;
        return AbstractC22676k.m65745e(this.id, measurementContent.id) && this.icon == measurementContent.icon && AbstractC22676k.m65745e(this.iconUrl, measurementContent.iconUrl) && Double.compare(this.measurementValue, measurementContent.measurementValue) == 0 && AbstractC22676k.m65745e(this.unit, measurementContent.unit) && AbstractC22676k.m65745e(this.subtitle, measurementContent.subtitle) && AbstractC22676k.m65745e(this.menuSheet, measurementContent.menuSheet);
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final double getMeasurementValue() {
        return this.measurementValue;
    }

    public final TrendMenuSheet getMenuSheet() {
        return this.menuSheet;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.icon, this.id.hashCode() * 31, 31);
        String str = this.iconUrl;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC17176i.m48499a((iM48500b + (str == null ? 0 : str.hashCode())) * 31, 31, this.measurementValue), 31, this.unit), 31, this.subtitle);
        TrendMenuSheet trendMenuSheet = this.menuSheet;
        return iM30450d + (trendMenuSheet != null ? trendMenuSheet.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        EnumC16313m0 enumC16313m0 = this.icon;
        String str2 = this.iconUrl;
        double d3 = this.measurementValue;
        String str3 = this.unit;
        String str4 = this.subtitle;
        TrendMenuSheet trendMenuSheet = this.menuSheet;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("MeasurementContent(id=", str, ", icon=", enumC16313m0, ", iconUrl=");
        sbM61141l.append(str2);
        sbM61141l.append(", measurementValue=");
        sbM61141l.append(d3);
        AbstractC11266d.m30444B(sbM61141l, ", unit=", str3, ", subtitle=", str4);
        sbM61141l.append(", menuSheet=");
        sbM61141l.append(trendMenuSheet);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }

    public MeasurementContent(String id4, EnumC16313m0 icon, String str, double d3, String unit, String subtitle, TrendMenuSheet trendMenuSheet) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.id = id4;
        this.icon = icon;
        this.iconUrl = str;
        this.measurementValue = d3;
        this.unit = unit;
        this.subtitle = subtitle;
        this.menuSheet = trendMenuSheet;
    }
}
