package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0017¨\u0006+"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;", "", "", "lowerOptimalStrain", "optimalStrain", "upperOptimalStrain", "<init>", "(DDD)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "component3", "copy", "(DDD)Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getLowerOptimalStrain", "getOptimalStrain", "getUpperOptimalStrain", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OptimalStrainDataDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("lower_optimal_strain")
    private final double lowerOptimalStrain;

    @SerializedName("optimal_strain")
    private final double optimalStrain;

    @SerializedName("upper_optimal_strain")
    private final double upperOptimalStrain;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OptimalStrainDataDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OptimalStrainDataDto(double d3, double d14, double d15) {
        this.lowerOptimalStrain = d3;
        this.optimalStrain = d14;
        this.upperOptimalStrain = d15;
    }

    public static /* synthetic */ OptimalStrainDataDto copy$default(OptimalStrainDataDto optimalStrainDataDto, double d3, double d14, double d15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = optimalStrainDataDto.lowerOptimalStrain;
        }
        double d16 = d3;
        if ((i13 & 2) != 0) {
            d14 = optimalStrainDataDto.optimalStrain;
        }
        double d17 = d14;
        if ((i13 & 4) != 0) {
            d15 = optimalStrainDataDto.upperOptimalStrain;
        }
        return optimalStrainDataDto.copy(d16, d17, d15);
    }

    public static final /* synthetic */ void write$Self$core_release(OptimalStrainDataDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.lowerOptimalStrain);
        output.encodeDoubleElement(serialDesc, 1, self.optimalStrain);
        output.encodeDoubleElement(serialDesc, 2, self.upperOptimalStrain);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLowerOptimalStrain() {
        return this.lowerOptimalStrain;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getOptimalStrain() {
        return this.optimalStrain;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getUpperOptimalStrain() {
        return this.upperOptimalStrain;
    }

    public final OptimalStrainDataDto copy(double lowerOptimalStrain, double optimalStrain, double upperOptimalStrain) {
        return new OptimalStrainDataDto(lowerOptimalStrain, optimalStrain, upperOptimalStrain);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptimalStrainDataDto)) {
            return false;
        }
        OptimalStrainDataDto optimalStrainDataDto = (OptimalStrainDataDto) other;
        return Double.compare(this.lowerOptimalStrain, optimalStrainDataDto.lowerOptimalStrain) == 0 && Double.compare(this.optimalStrain, optimalStrainDataDto.optimalStrain) == 0 && Double.compare(this.upperOptimalStrain, optimalStrainDataDto.upperOptimalStrain) == 0;
    }

    public final double getLowerOptimalStrain() {
        return this.lowerOptimalStrain;
    }

    public final double getOptimalStrain() {
        return this.optimalStrain;
    }

    public final double getUpperOptimalStrain() {
        return this.upperOptimalStrain;
    }

    public int hashCode() {
        return Double.hashCode(this.upperOptimalStrain) + AbstractC17176i.m48499a(Double.hashCode(this.lowerOptimalStrain) * 31, 31, this.optimalStrain);
    }

    public String toString() {
        double d3 = this.lowerOptimalStrain;
        double d14 = this.optimalStrain;
        double d15 = this.upperOptimalStrain;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("OptimalStrainDataDto(lowerOptimalStrain=", d3, ", optimalStrain=");
        sbM8306s.append(d14);
        sbM8306s.append(", upperOptimalStrain=");
        sbM8306s.append(d15);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }

    public /* synthetic */ OptimalStrainDataDto(int i13, double d3, double d14, double d15, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, OptimalStrainDataDto$$serializer.INSTANCE.getDescriptor());
        }
        this.lowerOptimalStrain = d3;
        this.optimalStrain = d14;
        this.upperOptimalStrain = d15;
    }
}
