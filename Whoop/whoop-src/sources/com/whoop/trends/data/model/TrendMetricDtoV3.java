package com.whoop.trends.data.model;

import bm2.EnumC3477u0;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ul2.EnumC35069b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wl2.C37358a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\\\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010\u0017R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010\u001bR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010?\u0012\u0004\bA\u00104\u001a\u0004\b@\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\bC\u00104\u001a\u0004\bB\u0010\u0017¨\u0006F"}, m65681d2 = {"Lcom/whoop/trends/data/model/TrendMetricDtoV3;", "", "Lcom/whoop/trends/data/model/MetricsTrendKey;", "metricsTrendKey", "", "metricName", "metricValue", "metricUnits", "Lbm2/u0;", "trendDirection", "Lul2/b;", "trendStyle", "trendText", "<init>", "(Lcom/whoop/trends/data/model/MetricsTrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbm2/u0;Lul2/b;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/trends/data/model/MetricsTrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbm2/u0;Lul2/b;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/trends/data/model/MetricsTrendKey;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lbm2/u0;", "component6", "()Lul2/b;", "component7", "copy", "(Lcom/whoop/trends/data/model/MetricsTrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbm2/u0;Lul2/b;Ljava/lang/String;)Lcom/whoop/trends/data/model/TrendMetricDtoV3;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/TrendMetricDtoV3;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/trends/data/model/MetricsTrendKey;", "getMetricsTrendKey", "getMetricsTrendKey$annotations", "()V", "Ljava/lang/String;", "getMetricName", "getMetricName$annotations", "getMetricValue", "getMetricValue$annotations", "getMetricUnits", "getMetricUnits$annotations", "Lbm2/u0;", "getTrendDirection", "getTrendDirection$annotations", "Lul2/b;", "getTrendStyle", "getTrendStyle$annotations", "getTrendText", "getTrendText$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrendMetricDtoV3 {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("metric_name_display")
    private final String metricName;

    @SerializedName("metric_units_display")
    private final String metricUnits;

    @SerializedName("metric_value_display")
    private final String metricValue;

    @SerializedName("trend_key")
    private final MetricsTrendKey metricsTrendKey;

    @SerializedName("trend_direction")
    private final EnumC3477u0 trendDirection;

    @SerializedName("trend_style")
    private final EnumC35069b trendStyle;

    @SerializedName("trend_text_display")
    private final String trendText;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/TrendMetricDtoV3$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/TrendMetricDtoV3;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrendMetricDtoV3$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C37358a(10)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C37358a(11)), AbstractC30060g.m92087G(enumC23463i, new C37358a(12)), null};
    }

    public /* synthetic */ TrendMetricDtoV3(int i13, MetricsTrendKey metricsTrendKey, String str, String str2, String str3, EnumC3477u0 enumC3477u0, EnumC35069b enumC35069b, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (126 != (i13 & 126)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 126, TrendMetricDtoV3$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.metricsTrendKey = MetricsTrendKey.NONE;
        } else {
            this.metricsTrendKey = metricsTrendKey;
        }
        this.metricName = str;
        this.metricValue = str2;
        this.metricUnits = str3;
        this.trendDirection = enumC3477u0;
        this.trendStyle = enumC35069b;
        this.trendText = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return MetricsTrendKey.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.trends.view.component.TrendDirection", EnumC3477u0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.trends.data.TrendStyle", EnumC35069b.values());
    }

    public static /* synthetic */ TrendMetricDtoV3 copy$default(TrendMetricDtoV3 trendMetricDtoV3, MetricsTrendKey metricsTrendKey, String str, String str2, String str3, EnumC3477u0 enumC3477u0, EnumC35069b enumC35069b, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            metricsTrendKey = trendMetricDtoV3.metricsTrendKey;
        }
        if ((i13 & 2) != 0) {
            str = trendMetricDtoV3.metricName;
        }
        if ((i13 & 4) != 0) {
            str2 = trendMetricDtoV3.metricValue;
        }
        if ((i13 & 8) != 0) {
            str3 = trendMetricDtoV3.metricUnits;
        }
        if ((i13 & 16) != 0) {
            enumC3477u0 = trendMetricDtoV3.trendDirection;
        }
        if ((i13 & 32) != 0) {
            enumC35069b = trendMetricDtoV3.trendStyle;
        }
        if ((i13 & 64) != 0) {
            str4 = trendMetricDtoV3.trendText;
        }
        EnumC35069b enumC35069b2 = enumC35069b;
        String str5 = str4;
        EnumC3477u0 enumC3477u1 = enumC3477u0;
        String str6 = str2;
        return trendMetricDtoV3.copy(metricsTrendKey, str, str6, str3, enumC3477u1, enumC35069b2, str5);
    }

    @InterfaceC37143h("metric_name_display")
    public static /* synthetic */ void getMetricName$annotations() {
    }

    @InterfaceC37143h("metric_units_display")
    public static /* synthetic */ void getMetricUnits$annotations() {
    }

    @InterfaceC37143h("metric_value_display")
    public static /* synthetic */ void getMetricValue$annotations() {
    }

    @InterfaceC37143h("trend_key")
    public static /* synthetic */ void getMetricsTrendKey$annotations() {
    }

    @InterfaceC37143h("trend_direction")
    public static /* synthetic */ void getTrendDirection$annotations() {
    }

    @InterfaceC37143h("trend_style")
    public static /* synthetic */ void getTrendStyle$annotations() {
    }

    @InterfaceC37143h("trend_text_display")
    public static /* synthetic */ void getTrendText$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(TrendMetricDtoV3 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.metricsTrendKey != MetricsTrendKey.NONE) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.metricsTrendKey);
        }
        output.encodeStringElement(serialDesc, 1, self.metricName);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.metricValue);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.metricUnits);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.trendDirection);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.trendStyle);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.trendText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MetricsTrendKey getMetricsTrendKey() {
        return this.metricsTrendKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMetricName() {
        return this.metricName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMetricValue() {
        return this.metricValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMetricUnits() {
        return this.metricUnits;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC3477u0 getTrendDirection() {
        return this.trendDirection;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC35069b getTrendStyle() {
        return this.trendStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrendText() {
        return this.trendText;
    }

    public final TrendMetricDtoV3 copy(MetricsTrendKey metricsTrendKey, String metricName, String metricValue, String metricUnits, EnumC3477u0 trendDirection, EnumC35069b trendStyle, String trendText) {
        AbstractC22676k.m65750j(metricsTrendKey, "metricsTrendKey");
        AbstractC22676k.m65750j(metricName, "metricName");
        AbstractC22676k.m65750j(trendDirection, "trendDirection");
        AbstractC22676k.m65750j(trendStyle, "trendStyle");
        return new TrendMetricDtoV3(metricsTrendKey, metricName, metricValue, metricUnits, trendDirection, trendStyle, trendText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendMetricDtoV3)) {
            return false;
        }
        TrendMetricDtoV3 trendMetricDtoV3 = (TrendMetricDtoV3) other;
        return this.metricsTrendKey == trendMetricDtoV3.metricsTrendKey && AbstractC22676k.m65745e(this.metricName, trendMetricDtoV3.metricName) && AbstractC22676k.m65745e(this.metricValue, trendMetricDtoV3.metricValue) && AbstractC22676k.m65745e(this.metricUnits, trendMetricDtoV3.metricUnits) && this.trendDirection == trendMetricDtoV3.trendDirection && this.trendStyle == trendMetricDtoV3.trendStyle && AbstractC22676k.m65745e(this.trendText, trendMetricDtoV3.trendText);
    }

    public final String getMetricName() {
        return this.metricName;
    }

    public final String getMetricUnits() {
        return this.metricUnits;
    }

    public final String getMetricValue() {
        return this.metricValue;
    }

    public final MetricsTrendKey getMetricsTrendKey() {
        return this.metricsTrendKey;
    }

    public final EnumC3477u0 getTrendDirection() {
        return this.trendDirection;
    }

    public final EnumC35069b getTrendStyle() {
        return this.trendStyle;
    }

    public final String getTrendText() {
        return this.trendText;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.metricsTrendKey.hashCode() * 31, 31, this.metricName);
        String str = this.metricValue;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metricUnits;
        int iHashCode2 = (this.trendStyle.hashCode() + ((this.trendDirection.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.trendText;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        MetricsTrendKey metricsTrendKey = this.metricsTrendKey;
        String str = this.metricName;
        String str2 = this.metricValue;
        String str3 = this.metricUnits;
        EnumC3477u0 enumC3477u0 = this.trendDirection;
        EnumC35069b enumC35069b = this.trendStyle;
        String str4 = this.trendText;
        StringBuilder sb4 = new StringBuilder("TrendMetricDtoV3(metricsTrendKey=");
        sb4.append(metricsTrendKey);
        sb4.append(", metricName=");
        sb4.append(str);
        sb4.append(", metricValue=");
        AbstractC11266d.m30444B(sb4, str2, ", metricUnits=", str3, ", trendDirection=");
        sb4.append(enumC3477u0);
        sb4.append(", trendStyle=");
        sb4.append(enumC35069b);
        sb4.append(", trendText=");
        return AbstractC25012a.m73376i(str4, ")", sb4);
    }

    public TrendMetricDtoV3(MetricsTrendKey metricsTrendKey, String metricName, String str, String str2, EnumC3477u0 trendDirection, EnumC35069b trendStyle, String str3) {
        AbstractC22676k.m65750j(metricsTrendKey, "metricsTrendKey");
        AbstractC22676k.m65750j(metricName, "metricName");
        AbstractC22676k.m65750j(trendDirection, "trendDirection");
        AbstractC22676k.m65750j(trendStyle, "trendStyle");
        this.metricsTrendKey = metricsTrendKey;
        this.metricName = metricName;
        this.metricValue = str;
        this.metricUnits = str2;
        this.trendDirection = trendDirection;
        this.trendStyle = trendStyle;
        this.trendText = str3;
    }

    public /* synthetic */ TrendMetricDtoV3(MetricsTrendKey metricsTrendKey, String str, String str2, String str3, EnumC3477u0 enumC3477u0, EnumC35069b enumC35069b, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? MetricsTrendKey.NONE : metricsTrendKey, str, str2, str3, enumC3477u0, enumC35069b, str4);
    }
}
