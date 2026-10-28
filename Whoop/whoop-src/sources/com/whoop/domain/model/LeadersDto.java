package com.whoop.domain.model;

import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.MapboxMap;
import com.whoop.design.models.modal.C8527a;
import com.whoop.p069ui.teams.LeadersEntryDto;
import com.whoop.p069ui.teams.LeadersEntryDto$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010Bm\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010)Jp\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b.\u0010$J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010$R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b:\u0010$R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b?\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/domain/model/LeadersDto;", "", "", "name", "", "average", "lastUpdatedAt", "", MapboxMap.QFE_OFFSET, "totalCount", "", "Lcom/whoop/ui/teams/LeadersEntryDto;", "records", "totalNonCompliant", "totalCompliant", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;IILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/String;IILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/LeadersDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "component4", "()I", "component5", "component6", "()Ljava/util/List;", "component7", "()Ljava/lang/Integer;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;IILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/whoop/domain/model/LeadersDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/lang/Double;", "getAverage", "getLastUpdatedAt", "I", "getOffset", "getTotalCount", "Ljava/util/List;", "getRecords", "Ljava/lang/Integer;", "getTotalNonCompliant", "getTotalCompliant", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LeadersDto {

    @SerializedName("average")
    private final Double average;

    @SerializedName("last_updated_at")
    private final String lastUpdatedAt;

    @SerializedName("name")
    private final String name;

    @SerializedName(MapboxMap.QFE_OFFSET)
    private final int offset;

    @SerializedName("records")
    private final List<LeadersEntryDto> records;

    @SerializedName("total_compliant")
    private final Integer totalCompliant;

    @SerializedName("total_count")
    private final int totalCount;

    @SerializedName("total_non_compliant")
    private final Integer totalNonCompliant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C8527a(1)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/model/LeadersDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/model/LeadersDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LeadersDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LeadersDto(int i13, String str, Double d3, String str2, int i14, int i15, List list, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (57 != (i13 & 57)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 57, LeadersDto$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        if ((i13 & 2) == 0) {
            this.average = null;
        } else {
            this.average = d3;
        }
        if ((i13 & 4) == 0) {
            this.lastUpdatedAt = null;
        } else {
            this.lastUpdatedAt = str2;
        }
        this.offset = i14;
        this.totalCount = i15;
        this.records = list;
        if ((i13 & 64) == 0) {
            this.totalNonCompliant = null;
        } else {
            this.totalNonCompliant = num;
        }
        if ((i13 & 128) == 0) {
            this.totalCompliant = null;
        } else {
            this.totalCompliant = num2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LeadersEntryDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeadersDto copy$default(LeadersDto leadersDto, String str, Double d3, String str2, int i13, int i14, List list, Integer num, Integer num2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = leadersDto.name;
        }
        if ((i15 & 2) != 0) {
            d3 = leadersDto.average;
        }
        if ((i15 & 4) != 0) {
            str2 = leadersDto.lastUpdatedAt;
        }
        if ((i15 & 8) != 0) {
            i13 = leadersDto.offset;
        }
        if ((i15 & 16) != 0) {
            i14 = leadersDto.totalCount;
        }
        if ((i15 & 32) != 0) {
            list = leadersDto.records;
        }
        if ((i15 & 64) != 0) {
            num = leadersDto.totalNonCompliant;
        }
        if ((i15 & 128) != 0) {
            num2 = leadersDto.totalCompliant;
        }
        Integer num3 = num;
        Integer num4 = num2;
        int i16 = i14;
        List list2 = list;
        return leadersDto.copy(str, d3, str2, i13, i16, list2, num3, num4);
    }

    public static final /* synthetic */ void write$Self$core_release(LeadersDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.average != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, DoubleSerializer.INSTANCE, self.average);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.lastUpdatedAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.lastUpdatedAt);
        }
        output.encodeIntElement(serialDesc, 3, self.offset);
        output.encodeIntElement(serialDesc, 4, self.totalCount);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.records);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.totalNonCompliant != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.totalNonCompliant);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.totalCompliant == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, IntSerializer.INSTANCE, self.totalCompliant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getAverage() {
        return this.average;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final List<LeadersEntryDto> component6() {
        return this.records;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getTotalNonCompliant() {
        return this.totalNonCompliant;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTotalCompliant() {
        return this.totalCompliant;
    }

    public final LeadersDto copy(String name, Double average, String lastUpdatedAt, int offset, int totalCount, List<LeadersEntryDto> records, Integer totalNonCompliant, Integer totalCompliant) {
        AbstractC22676k.m65750j(records, "records");
        return new LeadersDto(name, average, lastUpdatedAt, offset, totalCount, records, totalNonCompliant, totalCompliant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadersDto)) {
            return false;
        }
        LeadersDto leadersDto = (LeadersDto) other;
        return AbstractC22676k.m65745e(this.name, leadersDto.name) && AbstractC22676k.m65745e(this.average, leadersDto.average) && AbstractC22676k.m65745e(this.lastUpdatedAt, leadersDto.lastUpdatedAt) && this.offset == leadersDto.offset && this.totalCount == leadersDto.totalCount && AbstractC22676k.m65745e(this.records, leadersDto.records) && AbstractC22676k.m65745e(this.totalNonCompliant, leadersDto.totalNonCompliant) && AbstractC22676k.m65745e(this.totalCompliant, leadersDto.totalCompliant);
    }

    public final Double getAverage() {
        return this.average;
    }

    public final String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<LeadersEntryDto> getRecords() {
        return this.records;
    }

    public final Integer getTotalCompliant() {
        return this.totalCompliant;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final Integer getTotalNonCompliant() {
        return this.totalNonCompliant;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d3 = this.average;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str2 = this.lastUpdatedAt;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.totalCount, AbstractC11266d.m30448b(this.offset, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.records);
        Integer num = this.totalNonCompliant;
        int iHashCode3 = (iM31983b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCompliant;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        Double d3 = this.average;
        String str2 = this.lastUpdatedAt;
        int i13 = this.offset;
        int i14 = this.totalCount;
        List<LeadersEntryDto> list = this.records;
        Integer num = this.totalNonCompliant;
        Integer num2 = this.totalCompliant;
        StringBuilder sb4 = new StringBuilder("LeadersDto(name=");
        sb4.append(str);
        sb4.append(", average=");
        sb4.append(d3);
        sb4.append(", lastUpdatedAt=");
        AbstractC11266d.m30470x(i13, str2, ", offset=", ", totalCount=", sb4);
        sb4.append(i14);
        sb4.append(", records=");
        sb4.append(list);
        sb4.append(", totalNonCompliant=");
        sb4.append(num);
        sb4.append(", totalCompliant=");
        sb4.append(num2);
        sb4.append(")");
        return sb4.toString();
    }

    public LeadersDto(String str, Double d3, String str2, int i13, int i14, List<LeadersEntryDto> records, Integer num, Integer num2) {
        AbstractC22676k.m65750j(records, "records");
        this.name = str;
        this.average = d3;
        this.lastUpdatedAt = str2;
        this.offset = i13;
        this.totalCount = i14;
        this.records = records;
        this.totalNonCompliant = num;
        this.totalCompliant = num2;
    }

    public /* synthetic */ LeadersDto(String str, Double d3, String str2, int i13, int i14, List list, Integer num, Integer num2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i15 & 2) != 0 ? null : d3, (i15 & 4) != 0 ? null : str2, i13, i14, list, (i15 & 64) != 0 ? null : num, (i15 & 128) != 0 ? null : num2);
    }
}
