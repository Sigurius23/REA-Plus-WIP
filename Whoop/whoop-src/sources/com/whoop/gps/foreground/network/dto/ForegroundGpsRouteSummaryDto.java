package com.whoop.gps.foreground.network.dto;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import df2.C12000a;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b+\u0010\u001a¨\u0006/"}, m65681d2 = {"Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto;", "", "", "name", "", "", "Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRoutePointDto;", "values", "during", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$gps_tracking_release", "(Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/util/Map;", "getValues", "getDuring", "Companion", "$serializer", "a", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ForegroundGpsRouteSummaryDto {
    private final String during;
    private final String name;
    private final Map<Long, ForegroundGpsRoutePointDto> values;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12000a(9)), null};

    /* JADX INFO: renamed from: com.whoop.gps.foreground.network.dto.ForegroundGpsRouteSummaryDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/gps/foreground/network/dto/ForegroundGpsRouteSummaryDto;", "serializer", "()Lwc3/c;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ForegroundGpsRouteSummaryDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ForegroundGpsRouteSummaryDto(int i13, String str, Map map, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i13 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 6, ForegroundGpsRouteSummaryDto$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.name = "gps";
        } else {
            this.name = str;
        }
        this.values = map;
        this.during = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(LongSerializer.INSTANCE, ForegroundGpsRoutePointDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ForegroundGpsRouteSummaryDto copy$default(ForegroundGpsRouteSummaryDto foregroundGpsRouteSummaryDto, String str, Map map, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = foregroundGpsRouteSummaryDto.name;
        }
        if ((i13 & 2) != 0) {
            map = foregroundGpsRouteSummaryDto.values;
        }
        if ((i13 & 4) != 0) {
            str2 = foregroundGpsRouteSummaryDto.during;
        }
        return foregroundGpsRouteSummaryDto.copy(str, map, str2);
    }

    public static final /* synthetic */ void write$Self$gps_tracking_release(ForegroundGpsRouteSummaryDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.name, "gps")) {
            output.encodeStringElement(serialDesc, 0, self.name);
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.values);
        output.encodeStringElement(serialDesc, 2, self.during);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<Long, ForegroundGpsRoutePointDto> component2() {
        return this.values;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    public final ForegroundGpsRouteSummaryDto copy(String name, Map<Long, ForegroundGpsRoutePointDto> values, String during) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(values, "values");
        AbstractC22676k.m65750j(during, "during");
        return new ForegroundGpsRouteSummaryDto(name, values, during);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForegroundGpsRouteSummaryDto)) {
            return false;
        }
        ForegroundGpsRouteSummaryDto foregroundGpsRouteSummaryDto = (ForegroundGpsRouteSummaryDto) other;
        return AbstractC22676k.m65745e(this.name, foregroundGpsRouteSummaryDto.name) && AbstractC22676k.m65745e(this.values, foregroundGpsRouteSummaryDto.values) && AbstractC22676k.m65745e(this.during, foregroundGpsRouteSummaryDto.during);
    }

    public final String getDuring() {
        return this.during;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<Long, ForegroundGpsRoutePointDto> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.during.hashCode() + AbstractC3855a.m11821e(this.values, this.name.hashCode() * 31, 31);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.during, ")", AbstractC36095b.m114686n("ForegroundGpsRouteSummaryDto(name=", this.name, ", values=", ", during=", this.values));
    }

    public ForegroundGpsRouteSummaryDto(String name, Map<Long, ForegroundGpsRoutePointDto> values, String during) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(values, "values");
        AbstractC22676k.m65750j(during, "during");
        this.name = name;
        this.values = values;
        this.during = during;
    }

    public /* synthetic */ ForegroundGpsRouteSummaryDto(String str, Map map, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "gps" : str, map, str2);
    }
}
