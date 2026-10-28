package com.whoop.data.remote.domain.dto;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ@\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u001a¨\u00060"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;", "", "", "recovery", "", "lowerOptimalStrain", "optimalStrain", "upperOptimalStrain", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Double;", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getRecovery", "Ljava/lang/Double;", "getLowerOptimalStrain", "getOptimalStrain", "getUpperOptimalStrain", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OptimalStrainMapping {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("lower_optimal_strain")
    private final Double lowerOptimalStrain;

    @SerializedName("optimal_strain")
    private final Double optimalStrain;

    @SerializedName("recovery")
    private final Integer recovery;

    @SerializedName("upper_optimal_strain")
    private final Double upperOptimalStrain;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OptimalStrainMapping$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OptimalStrainMapping(int i13, Integer num, Double d3, Double d14, Double d15, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, OptimalStrainMapping$$serializer.INSTANCE.getDescriptor());
        }
        this.recovery = num;
        this.lowerOptimalStrain = d3;
        this.optimalStrain = d14;
        this.upperOptimalStrain = d15;
    }

    public static /* synthetic */ OptimalStrainMapping copy$default(OptimalStrainMapping optimalStrainMapping, Integer num, Double d3, Double d14, Double d15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = optimalStrainMapping.recovery;
        }
        if ((i13 & 2) != 0) {
            d3 = optimalStrainMapping.lowerOptimalStrain;
        }
        if ((i13 & 4) != 0) {
            d14 = optimalStrainMapping.optimalStrain;
        }
        if ((i13 & 8) != 0) {
            d15 = optimalStrainMapping.upperOptimalStrain;
        }
        return optimalStrainMapping.copy(num, d3, d14, d15);
    }

    public static final /* synthetic */ void write$Self$core_release(OptimalStrainMapping self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.recovery);
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, doubleSerializer, self.lowerOptimalStrain);
        output.encodeNullableSerializableElement(serialDesc, 2, doubleSerializer, self.optimalStrain);
        output.encodeNullableSerializableElement(serialDesc, 3, doubleSerializer, self.upperOptimalStrain);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getRecovery() {
        return this.recovery;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLowerOptimalStrain() {
        return this.lowerOptimalStrain;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getOptimalStrain() {
        return this.optimalStrain;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getUpperOptimalStrain() {
        return this.upperOptimalStrain;
    }

    public final OptimalStrainMapping copy(Integer recovery, Double lowerOptimalStrain, Double optimalStrain, Double upperOptimalStrain) {
        return new OptimalStrainMapping(recovery, lowerOptimalStrain, optimalStrain, upperOptimalStrain);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptimalStrainMapping)) {
            return false;
        }
        OptimalStrainMapping optimalStrainMapping = (OptimalStrainMapping) other;
        return AbstractC22676k.m65745e(this.recovery, optimalStrainMapping.recovery) && AbstractC22676k.m65745e(this.lowerOptimalStrain, optimalStrainMapping.lowerOptimalStrain) && AbstractC22676k.m65745e(this.optimalStrain, optimalStrainMapping.optimalStrain) && AbstractC22676k.m65745e(this.upperOptimalStrain, optimalStrainMapping.upperOptimalStrain);
    }

    public final Double getLowerOptimalStrain() {
        return this.lowerOptimalStrain;
    }

    public final Double getOptimalStrain() {
        return this.optimalStrain;
    }

    public final Integer getRecovery() {
        return this.recovery;
    }

    public final Double getUpperOptimalStrain() {
        return this.upperOptimalStrain;
    }

    public int hashCode() {
        Integer num = this.recovery;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d3 = this.lowerOptimalStrain;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.optimalStrain;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.upperOptimalStrain;
        return iHashCode3 + (d15 != null ? d15.hashCode() : 0);
    }

    public String toString() {
        return "OptimalStrainMapping(recovery=" + this.recovery + ", lowerOptimalStrain=" + this.lowerOptimalStrain + ", optimalStrain=" + this.optimalStrain + ", upperOptimalStrain=" + this.upperOptimalStrain + ")";
    }

    public OptimalStrainMapping(Integer num, Double d3, Double d14, Double d15) {
        this.recovery = num;
        this.lowerOptimalStrain = d3;
        this.optimalStrain = d14;
        this.upperOptimalStrain = d15;
    }
}
