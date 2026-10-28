package io.getstream.android.video.generated.models;

import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JD\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m65681d2 = {"Lio/getstream/android/video/generated/models/MetricThreshold;", "", "level", "", "operator", "value", "", "valueUnit", "windowSeconds", "", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/Integer;)V", "getLevel", "()Ljava/lang/String;", "getOperator", "getValue", "()F", "getValueUnit", "getWindowSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/MetricThreshold;", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class MetricThreshold {
    private final String level;
    private final String operator;
    private final float value;
    private final String valueUnit;
    private final Integer windowSeconds;

    public MetricThreshold(@InterfaceC30731q(name = "level") String level, @InterfaceC30731q(name = "operator") String operator, @InterfaceC30731q(name = "value") float f13, @InterfaceC30731q(name = "value_unit") String str, @InterfaceC30731q(name = "window_seconds") Integer num) {
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(operator, "operator");
        this.level = level;
        this.operator = operator;
        this.value = f13;
        this.valueUnit = str;
        this.windowSeconds = num;
    }

    public static /* synthetic */ MetricThreshold copy$default(MetricThreshold metricThreshold, String str, String str2, float f13, String str3, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = metricThreshold.level;
        }
        if ((i13 & 2) != 0) {
            str2 = metricThreshold.operator;
        }
        if ((i13 & 4) != 0) {
            f13 = metricThreshold.value;
        }
        if ((i13 & 8) != 0) {
            str3 = metricThreshold.valueUnit;
        }
        if ((i13 & 16) != 0) {
            num = metricThreshold.windowSeconds;
        }
        Integer num2 = num;
        float f14 = f13;
        return metricThreshold.copy(str, str2, f14, str3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValueUnit() {
        return this.valueUnit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getWindowSeconds() {
        return this.windowSeconds;
    }

    public final MetricThreshold copy(@InterfaceC30731q(name = "level") String level, @InterfaceC30731q(name = "operator") String operator, @InterfaceC30731q(name = "value") float value, @InterfaceC30731q(name = "value_unit") String valueUnit, @InterfaceC30731q(name = "window_seconds") Integer windowSeconds) {
        AbstractC22676k.m65750j(level, "level");
        AbstractC22676k.m65750j(operator, "operator");
        return new MetricThreshold(level, operator, value, valueUnit, windowSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricThreshold)) {
            return false;
        }
        MetricThreshold metricThreshold = (MetricThreshold) other;
        return AbstractC22676k.m65745e(this.level, metricThreshold.level) && AbstractC22676k.m65745e(this.operator, metricThreshold.operator) && Float.compare(this.value, metricThreshold.value) == 0 && AbstractC22676k.m65745e(this.valueUnit, metricThreshold.valueUnit) && AbstractC22676k.m65745e(this.windowSeconds, metricThreshold.windowSeconds);
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getOperator() {
        return this.operator;
    }

    public final float getValue() {
        return this.value;
    }

    public final String getValueUnit() {
        return this.valueUnit;
    }

    public final Integer getWindowSeconds() {
        return this.windowSeconds;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.value, AbstractC11266d.m30450d(this.level.hashCode() * 31, 31, this.operator), 31);
        String str = this.valueUnit;
        int iHashCode = (iM30447a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.windowSeconds;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.level;
        String str2 = this.operator;
        float f13 = this.value;
        String str3 = this.valueUnit;
        Integer num = this.windowSeconds;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MetricThreshold(level=", str, ", operator=", str2, ", value=");
        sbM32001t.append(f13);
        sbM32001t.append(", valueUnit=");
        sbM32001t.append(str3);
        sbM32001t.append(", windowSeconds=");
        return AbstractC11478a.m30859k(sbM32001t, num, ")");
    }

    public /* synthetic */ MetricThreshold(String str, String str2, float f13, String str3, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, f13, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : num);
    }
}
