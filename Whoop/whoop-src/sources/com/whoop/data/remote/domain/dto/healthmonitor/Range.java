package com.whoop.data.remote.domain.dto.healthmonitor;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u001b¨\u0006/"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;", "", "", "lower_bound_type", "", "lower_endpoint", "upper_bound_type", "upper_endpoint", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLower_bound_type", "Ljava/lang/Double;", "getLower_endpoint", "getUpper_bound_type", "getUpper_endpoint", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Range {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("lower_bound_type")
    private final String lower_bound_type;

    @SerializedName("lower_endpoint")
    private final Double lower_endpoint;

    @SerializedName("upper_bound_type")
    private final String upper_bound_type;

    @SerializedName("upper_endpoint")
    private final Double upper_endpoint;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/healthmonitor/Range$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/healthmonitor/Range;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Range$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Range(int i13, String str, Double d3, String str2, Double d14, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, Range$$serializer.INSTANCE.getDescriptor());
        }
        this.lower_bound_type = str;
        this.lower_endpoint = d3;
        this.upper_bound_type = str2;
        this.upper_endpoint = d14;
    }

    public static /* synthetic */ Range copy$default(Range range, String str, Double d3, String str2, Double d14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = range.lower_bound_type;
        }
        if ((i13 & 2) != 0) {
            d3 = range.lower_endpoint;
        }
        if ((i13 & 4) != 0) {
            str2 = range.upper_bound_type;
        }
        if ((i13 & 8) != 0) {
            d14 = range.upper_endpoint;
        }
        return range.copy(str, d3, str2, d14);
    }

    public static final /* synthetic */ void write$Self$core_release(Range self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.lower_bound_type);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, doubleSerializer, self.lower_endpoint);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.upper_bound_type);
        output.encodeNullableSerializableElement(serialDesc, 3, doubleSerializer, self.upper_endpoint);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLower_bound_type() {
        return this.lower_bound_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLower_endpoint() {
        return this.lower_endpoint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpper_bound_type() {
        return this.upper_bound_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getUpper_endpoint() {
        return this.upper_endpoint;
    }

    public final Range copy(String lower_bound_type, Double lower_endpoint, String upper_bound_type, Double upper_endpoint) {
        return new Range(lower_bound_type, lower_endpoint, upper_bound_type, upper_endpoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Range)) {
            return false;
        }
        Range range = (Range) other;
        return AbstractC22676k.m65745e(this.lower_bound_type, range.lower_bound_type) && AbstractC22676k.m65745e(this.lower_endpoint, range.lower_endpoint) && AbstractC22676k.m65745e(this.upper_bound_type, range.upper_bound_type) && AbstractC22676k.m65745e(this.upper_endpoint, range.upper_endpoint);
    }

    public final String getLower_bound_type() {
        return this.lower_bound_type;
    }

    public final Double getLower_endpoint() {
        return this.lower_endpoint;
    }

    public final String getUpper_bound_type() {
        return this.upper_bound_type;
    }

    public final Double getUpper_endpoint() {
        return this.upper_endpoint;
    }

    public int hashCode() {
        String str = this.lower_bound_type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d3 = this.lower_endpoint;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str2 = this.upper_bound_type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.upper_endpoint;
        return iHashCode3 + (d14 != null ? d14.hashCode() : 0);
    }

    public String toString() {
        return "Range(lower_bound_type=" + this.lower_bound_type + ", lower_endpoint=" + this.lower_endpoint + ", upper_bound_type=" + this.upper_bound_type + ", upper_endpoint=" + this.upper_endpoint + ")";
    }

    public Range(String str, Double d3, String str2, Double d14) {
        this.lower_bound_type = str;
        this.lower_endpoint = d3;
        this.upper_bound_type = str2;
        this.upper_endpoint = d14;
    }
}
