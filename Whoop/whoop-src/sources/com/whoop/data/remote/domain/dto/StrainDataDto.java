package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import vw0.C36541a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/StrainDataDto;", "", "Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;", "optimalStrain", "", "scaledStrain", "", "Lcom/whoop/data/remote/domain/dto/OptimalStrainMapping;", "optimalStrainMapping", "<init>", "(Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/StrainDataDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;", "component2", "()D", "component3", "()Ljava/util/List;", "copy", "(Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;DLjava/util/List;)Lcom/whoop/data/remote/domain/dto/StrainDataDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/data/remote/domain/dto/OptimalStrainDataDto;", "getOptimalStrain", "D", "getScaledStrain", "Ljava/util/List;", "getOptimalStrainMapping", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrainDataDto {

    @SerializedName("optimal_strain")
    private final OptimalStrainDataDto optimalStrain;

    @SerializedName("optimal_strain_mapping")
    private final List<OptimalStrainMapping> optimalStrainMapping;

    @SerializedName("scaled_strain")
    private final double scaledStrain;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36541a(12))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/StrainDataDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/StrainDataDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrainDataDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrainDataDto(int i13, OptimalStrainDataDto optimalStrainDataDto, double d3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, StrainDataDto$$serializer.INSTANCE.getDescriptor());
        }
        this.optimalStrain = optimalStrainDataDto;
        this.scaledStrain = d3;
        this.optimalStrainMapping = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(OptimalStrainMapping$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrainDataDto copy$default(StrainDataDto strainDataDto, OptimalStrainDataDto optimalStrainDataDto, double d3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            optimalStrainDataDto = strainDataDto.optimalStrain;
        }
        if ((i13 & 2) != 0) {
            d3 = strainDataDto.scaledStrain;
        }
        if ((i13 & 4) != 0) {
            list = strainDataDto.optimalStrainMapping;
        }
        return strainDataDto.copy(optimalStrainDataDto, d3, list);
    }

    public static final /* synthetic */ void write$Self$core_release(StrainDataDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, OptimalStrainDataDto$$serializer.INSTANCE, self.optimalStrain);
        output.encodeDoubleElement(serialDesc, 1, self.scaledStrain);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.optimalStrainMapping);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OptimalStrainDataDto getOptimalStrain() {
        return this.optimalStrain;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getScaledStrain() {
        return this.scaledStrain;
    }

    public final List<OptimalStrainMapping> component3() {
        return this.optimalStrainMapping;
    }

    public final StrainDataDto copy(OptimalStrainDataDto optimalStrain, double scaledStrain, List<OptimalStrainMapping> optimalStrainMapping) {
        return new StrainDataDto(optimalStrain, scaledStrain, optimalStrainMapping);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrainDataDto)) {
            return false;
        }
        StrainDataDto strainDataDto = (StrainDataDto) other;
        return AbstractC22676k.m65745e(this.optimalStrain, strainDataDto.optimalStrain) && Double.compare(this.scaledStrain, strainDataDto.scaledStrain) == 0 && AbstractC22676k.m65745e(this.optimalStrainMapping, strainDataDto.optimalStrainMapping);
    }

    public final OptimalStrainDataDto getOptimalStrain() {
        return this.optimalStrain;
    }

    public final List<OptimalStrainMapping> getOptimalStrainMapping() {
        return this.optimalStrainMapping;
    }

    public final double getScaledStrain() {
        return this.scaledStrain;
    }

    public int hashCode() {
        OptimalStrainDataDto optimalStrainDataDto = this.optimalStrain;
        int iM48499a = AbstractC17176i.m48499a((optimalStrainDataDto == null ? 0 : optimalStrainDataDto.hashCode()) * 31, 31, this.scaledStrain);
        List<OptimalStrainMapping> list = this.optimalStrainMapping;
        return iM48499a + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "StrainDataDto(optimalStrain=" + this.optimalStrain + ", scaledStrain=" + this.scaledStrain + ", optimalStrainMapping=" + this.optimalStrainMapping + ")";
    }

    public StrainDataDto(OptimalStrainDataDto optimalStrainDataDto, double d3, List<OptimalStrainMapping> list) {
        this.optimalStrain = optimalStrainDataDto;
        this.scaledStrain = d3;
        this.optimalStrainMapping = list;
    }
}
