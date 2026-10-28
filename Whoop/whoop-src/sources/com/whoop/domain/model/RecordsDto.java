package com.whoop.domain.model;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 0*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u000210B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJG\u0010\u0018\u001a\u00020\u0015\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b-\u0010\u001dR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010 ¨\u00062"}, m65681d2 = {"Lcom/whoop/domain/model/RecordsDto;", "F", "", "", MapboxMap.QFE_OFFSET, "totalCount", "", "records", "<init>", "(IILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Lwc3/c;", "typeSerial0", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/model/RecordsDto;Lzc3/c;Lyc3/g;Lwc3/c;)V", "write$Self", "Lcom/whoop/domain/model/Records;", "toRecords", "()Lcom/whoop/domain/model/Records;", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "copy", "(IILjava/util/List;)Lcom/whoop/domain/model/RecordsDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOffset", "getTotalCount", "Ljava/util/List;", "getRecords", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecordsDto<F> {
    private static final InterfaceC39443g $cachedDescriptor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName(MapboxMap.QFE_OFFSET)
    private final int offset;

    @SerializedName("records")
    private final List<F> records;

    @SerializedName("total_count")
    private final int totalCount;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/domain/model/RecordsDto$Companion;", "", "<init>", "()V", "F", "Lwc3/c;", "typeSerial0", "Lcom/whoop/domain/model/RecordsDto;", "serializer", "(Lwc3/c;)Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <F> InterfaceC37138c serializer(InterfaceC37138c typeSerial0) {
            AbstractC22676k.m65750j(typeSerial0, "typeSerial0");
            return new RecordsDto$$serializer(typeSerial0);
        }

        private Companion() {
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.whoop.domain.model.RecordsDto", null, 3);
        pluginGeneratedSerialDescriptor.addElement(MapboxMap.QFE_OFFSET, false);
        pluginGeneratedSerialDescriptor.addElement("totalCount", false);
        pluginGeneratedSerialDescriptor.addElement("records", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ RecordsDto(int i13, int i14, int i15, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, $cachedDescriptor);
        }
        this.offset = i14;
        this.totalCount = i15;
        this.records = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecordsDto copy$default(RecordsDto recordsDto, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = recordsDto.offset;
        }
        if ((i15 & 2) != 0) {
            i14 = recordsDto.totalCount;
        }
        if ((i15 & 4) != 0) {
            list = recordsDto.records;
        }
        return recordsDto.copy(i13, i14, list);
    }

    public static final /* synthetic */ void write$Self$core_release(RecordsDto self, InterfaceC40540c output, InterfaceC39443g serialDesc, InterfaceC37138c typeSerial0) {
        output.encodeIntElement(serialDesc, 0, self.offset);
        output.encodeIntElement(serialDesc, 1, self.totalCount);
        output.encodeSerializableElement(serialDesc, 2, new ArrayListSerializer(typeSerial0), self.records);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final List<F> component3() {
        return this.records;
    }

    public final RecordsDto<F> copy(int offset, int totalCount, List<? extends F> records) {
        AbstractC22676k.m65750j(records, "records");
        return new RecordsDto<>(offset, totalCount, records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordsDto)) {
            return false;
        }
        RecordsDto recordsDto = (RecordsDto) other;
        return this.offset == recordsDto.offset && this.totalCount == recordsDto.totalCount && AbstractC22676k.m65745e(this.records, recordsDto.records);
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<F> getRecords() {
        return this.records;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return this.records.hashCode() + AbstractC11266d.m30448b(this.totalCount, Integer.hashCode(this.offset) * 31, 31);
    }

    public final Records<F> toRecords() {
        int i13 = this.offset;
        int i14 = this.totalCount;
        List<F> list = this.records;
        AbstractC22676k.m65747g(list);
        return new Records<>(i13, i14, list);
    }

    public String toString() {
        int i13 = this.offset;
        int i14 = this.totalCount;
        return AbstractC3855a.m11829m(AbstractC11266d.m30465s(i13, i14, "RecordsDto(offset=", ", totalCount=", ", records="), this.records, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecordsDto(int i13, int i14, List<? extends F> records) {
        AbstractC22676k.m65750j(records, "records");
        this.offset = i13;
        this.totalCount = i14;
        this.records = records;
    }
}
