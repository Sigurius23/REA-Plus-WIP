package com.whoop.design.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.util.TrendKey;
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
import v41.EnumC35673j0;
import v41.EnumC35677l0;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\\\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010\u0017R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010\u001bR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010?\u0012\u0004\bA\u00104\u001a\u0004\b@\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\bC\u00104\u001a\u0004\bB\u0010\u0017¨\u0006F"}, m65681d2 = {"Lcom/whoop/design/models/TrendMetricModel;", "", "Lcom/whoop/util/TrendKey;", "trendKey", "", "metricName", "metricValue", "metricUnits", "Lv41/j0;", "trendDirection", "Lv41/l0;", "trendStyle", "trendText", "<init>", "(Lcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/util/TrendKey;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lv41/j0;", "component6", "()Lv41/l0;", "component7", "copy", "(Lcom/whoop/util/TrendKey;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/j0;Lv41/l0;Ljava/lang/String;)Lcom/whoop/design/models/TrendMetricModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/TrendMetricModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/util/TrendKey;", "getTrendKey", "getTrendKey$annotations", "()V", "Ljava/lang/String;", "getMetricName", "getMetricName$annotations", "getMetricValue", "getMetricValue$annotations", "getMetricUnits", "getMetricUnits$annotations", "Lv41/j0;", "getTrendDirection", "getTrendDirection$annotations", "Lv41/l0;", "getTrendStyle", "getTrendStyle$annotations", "getTrendText", "getTrendText$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrendMetricModel {
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

    @SerializedName("trend_direction")
    private final EnumC35673j0 trendDirection;

    @SerializedName("trend_key")
    private final TrendKey trendKey;

    @SerializedName("trend_style")
    private final EnumC35677l0 trendStyle;

    @SerializedName("trend_text_display")
    private final String trendText;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/TrendMetricModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/TrendMetricModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrendMetricModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C6909a(26)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C6909a(27)), AbstractC30060g.m92087G(enumC23463i, new C6909a(28)), null};
    }

    public /* synthetic */ TrendMetricModel(int i13, TrendKey trendKey, String str, String str2, String str3, EnumC35673j0 enumC35673j0, EnumC35677l0 enumC35677l0, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, TrendMetricModel$$serializer.INSTANCE.getDescriptor());
        }
        this.trendKey = trendKey;
        this.metricName = str;
        this.metricValue = str2;
        this.metricUnits = str3;
        this.trendDirection = enumC35673j0;
        this.trendStyle = enumC35677l0;
        this.trendText = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return TrendKey.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.TrendDirection", EnumC35673j0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.TrendStyle", EnumC35677l0.values());
    }

    public static /* synthetic */ TrendMetricModel copy$default(TrendMetricModel trendMetricModel, TrendKey trendKey, String str, String str2, String str3, EnumC35673j0 enumC35673j0, EnumC35677l0 enumC35677l0, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            trendKey = trendMetricModel.trendKey;
        }
        if ((i13 & 2) != 0) {
            str = trendMetricModel.metricName;
        }
        if ((i13 & 4) != 0) {
            str2 = trendMetricModel.metricValue;
        }
        if ((i13 & 8) != 0) {
            str3 = trendMetricModel.metricUnits;
        }
        if ((i13 & 16) != 0) {
            enumC35673j0 = trendMetricModel.trendDirection;
        }
        if ((i13 & 32) != 0) {
            enumC35677l0 = trendMetricModel.trendStyle;
        }
        if ((i13 & 64) != 0) {
            str4 = trendMetricModel.trendText;
        }
        EnumC35677l0 enumC35677l1 = enumC35677l0;
        String str5 = str4;
        EnumC35673j0 enumC35673j1 = enumC35673j0;
        String str6 = str2;
        return trendMetricModel.copy(trendKey, str, str6, str3, enumC35673j1, enumC35677l1, str5);
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

    @InterfaceC37143h("trend_direction")
    public static /* synthetic */ void getTrendDirection$annotations() {
    }

    @InterfaceC37143h("trend_key")
    public static /* synthetic */ void getTrendKey$annotations() {
    }

    @InterfaceC37143h("trend_style")
    public static /* synthetic */ void getTrendStyle$annotations() {
    }

    @InterfaceC37143h("trend_text_display")
    public static /* synthetic */ void getTrendText$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(TrendMetricModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.trendKey);
        output.encodeStringElement(serialDesc, 1, self.metricName);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.metricValue);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.metricUnits);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.trendDirection);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.trendStyle);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.trendText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TrendKey getTrendKey() {
        return this.trendKey;
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
    public final EnumC35673j0 getTrendDirection() {
        return this.trendDirection;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC35677l0 getTrendStyle() {
        return this.trendStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTrendText() {
        return this.trendText;
    }

    public final TrendMetricModel copy(TrendKey trendKey, String metricName, String metricValue, String metricUnits, EnumC35673j0 trendDirection, EnumC35677l0 trendStyle, String trendText) {
        AbstractC22676k.m65750j(trendKey, "trendKey");
        AbstractC22676k.m65750j(metricName, "metricName");
        AbstractC22676k.m65750j(trendDirection, "trendDirection");
        AbstractC22676k.m65750j(trendStyle, "trendStyle");
        return new TrendMetricModel(trendKey, metricName, metricValue, metricUnits, trendDirection, trendStyle, trendText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendMetricModel)) {
            return false;
        }
        TrendMetricModel trendMetricModel = (TrendMetricModel) other;
        return this.trendKey == trendMetricModel.trendKey && AbstractC22676k.m65745e(this.metricName, trendMetricModel.metricName) && AbstractC22676k.m65745e(this.metricValue, trendMetricModel.metricValue) && AbstractC22676k.m65745e(this.metricUnits, trendMetricModel.metricUnits) && this.trendDirection == trendMetricModel.trendDirection && this.trendStyle == trendMetricModel.trendStyle && AbstractC22676k.m65745e(this.trendText, trendMetricModel.trendText);
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

    public final EnumC35673j0 getTrendDirection() {
        return this.trendDirection;
    }

    public final TrendKey getTrendKey() {
        return this.trendKey;
    }

    public final EnumC35677l0 getTrendStyle() {
        return this.trendStyle;
    }

    public final String getTrendText() {
        return this.trendText;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.trendKey.hashCode() * 31, 31, this.metricName);
        String str = this.metricValue;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metricUnits;
        int iHashCode2 = (this.trendStyle.hashCode() + ((this.trendDirection.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.trendText;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        TrendKey trendKey = this.trendKey;
        String str = this.metricName;
        String str2 = this.metricValue;
        String str3 = this.metricUnits;
        EnumC35673j0 enumC35673j0 = this.trendDirection;
        EnumC35677l0 enumC35677l0 = this.trendStyle;
        String str4 = this.trendText;
        StringBuilder sb4 = new StringBuilder("TrendMetricModel(trendKey=");
        sb4.append(trendKey);
        sb4.append(", metricName=");
        sb4.append(str);
        sb4.append(", metricValue=");
        AbstractC11266d.m30444B(sb4, str2, ", metricUnits=", str3, ", trendDirection=");
        sb4.append(enumC35673j0);
        sb4.append(", trendStyle=");
        sb4.append(enumC35677l0);
        sb4.append(", trendText=");
        return AbstractC25012a.m73376i(str4, ")", sb4);
    }

    public TrendMetricModel(TrendKey trendKey, String metricName, String str, String str2, EnumC35673j0 trendDirection, EnumC35677l0 trendStyle, String str3) {
        AbstractC22676k.m65750j(trendKey, "trendKey");
        AbstractC22676k.m65750j(metricName, "metricName");
        AbstractC22676k.m65750j(trendDirection, "trendDirection");
        AbstractC22676k.m65750j(trendStyle, "trendStyle");
        this.trendKey = trendKey;
        this.metricName = metricName;
        this.metricValue = str;
        this.metricUnits = str2;
        this.trendDirection = trendDirection;
        this.trendStyle = trendStyle;
        this.trendText = str3;
    }
}
