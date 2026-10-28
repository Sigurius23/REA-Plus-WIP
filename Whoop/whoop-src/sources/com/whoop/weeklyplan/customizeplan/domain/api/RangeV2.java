package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b/\u0010\u001b¨\u00062"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "", "", "min", "", "lowerBoundType", "max", "upperBoundType", "<init>", "(DLjava/lang/String;DLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLjava/lang/String;DLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(DLjava/lang/String;DLjava/lang/String;)Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getMin", "getMin$annotations", "()V", "Ljava/lang/String;", "getLowerBoundType", "getMax", "getMax$annotations", "getUpperBoundType", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RangeV2 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String lowerBoundType;
    private final double max;
    private final double min;
    private final String upperBoundType;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RangeV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RangeV2(double d3, String str, double d14, String str2) {
        this.min = d3;
        this.lowerBoundType = str;
        this.max = d14;
        this.upperBoundType = str2;
    }

    public static /* synthetic */ RangeV2 copy$default(RangeV2 rangeV2, double d3, String str, double d14, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = rangeV2.min;
        }
        double d15 = d3;
        if ((i13 & 2) != 0) {
            str = rangeV2.lowerBoundType;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            d14 = rangeV2.max;
        }
        double d16 = d14;
        if ((i13 & 8) != 0) {
            str2 = rangeV2.upperBoundType;
        }
        return rangeV2.copy(d15, str3, d16, str2);
    }

    @InterfaceC37143h("upper_endpoint")
    public static /* synthetic */ void getMax$annotations() {
    }

    @InterfaceC37143h("lower_endpoint")
    public static /* synthetic */ void getMin$annotations() {
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(RangeV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.min);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.lowerBoundType);
        output.encodeDoubleElement(serialDesc, 2, self.max);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.upperBoundType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLowerBoundType() {
        return this.lowerBoundType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUpperBoundType() {
        return this.upperBoundType;
    }

    public final RangeV2 copy(double min, String lowerBoundType, double max, String upperBoundType) {
        return new RangeV2(min, lowerBoundType, max, upperBoundType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeV2)) {
            return false;
        }
        RangeV2 rangeV2 = (RangeV2) other;
        return Double.compare(this.min, rangeV2.min) == 0 && AbstractC22676k.m65745e(this.lowerBoundType, rangeV2.lowerBoundType) && Double.compare(this.max, rangeV2.max) == 0 && AbstractC22676k.m65745e(this.upperBoundType, rangeV2.upperBoundType);
    }

    public final String getLowerBoundType() {
        return this.lowerBoundType;
    }

    public final double getMax() {
        return this.max;
    }

    public final double getMin() {
        return this.min;
    }

    public final String getUpperBoundType() {
        return this.upperBoundType;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.min) * 31;
        String str = this.lowerBoundType;
        int iM48499a = AbstractC17176i.m48499a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.max);
        String str2 = this.upperBoundType;
        return iM48499a + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        double d3 = this.min;
        String str = this.lowerBoundType;
        double d14 = this.max;
        String str2 = this.upperBoundType;
        StringBuilder sb4 = new StringBuilder("RangeV2(min=");
        sb4.append(d3);
        sb4.append(", lowerBoundType=");
        sb4.append(str);
        AbstractC31061c.m95622B(sb4, ", max=", d14, ", upperBoundType=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public /* synthetic */ RangeV2(int i13, double d3, String str, double d14, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, RangeV2$$serializer.INSTANCE.getDescriptor());
        }
        this.min = d3;
        this.lowerBoundType = str;
        this.max = d14;
        this.upperBoundType = str2;
    }
}
