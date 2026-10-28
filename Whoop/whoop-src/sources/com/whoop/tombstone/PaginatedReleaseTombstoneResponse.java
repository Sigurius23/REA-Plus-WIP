package com.whoop.tombstone;

import c13.AbstractC3855a;
import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0018J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/tombstone/PaginatedReleaseTombstoneResponse;", "", "", "totalCount", MapboxMap.QFE_OFFSET, "", "Lcom/whoop/tombstone/ReleaseTombstoneResponse;", "records", "<init>", "(IILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$tombstone_release", "(Lcom/whoop/tombstone/PaginatedReleaseTombstoneResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "copy", "(IILjava/util/List;)Lcom/whoop/tombstone/PaginatedReleaseTombstoneResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTotalCount", "getOffset", "Ljava/util/List;", "getRecords", "Companion", "$serializer", "a", "tombstone_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaginatedReleaseTombstoneResponse {
    private final int offset;
    private final List<ReleaseTombstoneResponse> records;
    private final int totalCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15620a(27))};

    /* JADX INFO: renamed from: com.whoop.tombstone.PaginatedReleaseTombstoneResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/tombstone/PaginatedReleaseTombstoneResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/tombstone/PaginatedReleaseTombstoneResponse;", "serializer", "()Lwc3/c;", "tombstone_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaginatedReleaseTombstoneResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PaginatedReleaseTombstoneResponse() {
        this(0, 0, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ReleaseTombstoneResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaginatedReleaseTombstoneResponse copy$default(PaginatedReleaseTombstoneResponse paginatedReleaseTombstoneResponse, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = paginatedReleaseTombstoneResponse.totalCount;
        }
        if ((i15 & 2) != 0) {
            i14 = paginatedReleaseTombstoneResponse.offset;
        }
        if ((i15 & 4) != 0) {
            list = paginatedReleaseTombstoneResponse.records;
        }
        return paginatedReleaseTombstoneResponse.copy(i13, i14, list);
    }

    public static final /* synthetic */ void write$Self$tombstone_release(PaginatedReleaseTombstoneResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.totalCount != 0) {
            output.encodeIntElement(serialDesc, 0, self.totalCount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.offset != 0) {
            output.encodeIntElement(serialDesc, 1, self.offset);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.records, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.records);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    public final List<ReleaseTombstoneResponse> component3() {
        return this.records;
    }

    public final PaginatedReleaseTombstoneResponse copy(int totalCount, int offset, List<ReleaseTombstoneResponse> records) {
        AbstractC22676k.m65750j(records, "records");
        return new PaginatedReleaseTombstoneResponse(totalCount, offset, records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginatedReleaseTombstoneResponse)) {
            return false;
        }
        PaginatedReleaseTombstoneResponse paginatedReleaseTombstoneResponse = (PaginatedReleaseTombstoneResponse) other;
        return this.totalCount == paginatedReleaseTombstoneResponse.totalCount && this.offset == paginatedReleaseTombstoneResponse.offset && AbstractC22676k.m65745e(this.records, paginatedReleaseTombstoneResponse.records);
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<ReleaseTombstoneResponse> getRecords() {
        return this.records;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return this.records.hashCode() + AbstractC11266d.m30448b(this.offset, Integer.hashCode(this.totalCount) * 31, 31);
    }

    public String toString() {
        int i13 = this.totalCount;
        int i14 = this.offset;
        return AbstractC3855a.m11829m(AbstractC11266d.m30465s(i13, i14, "PaginatedReleaseTombstoneResponse(totalCount=", ", offset=", ", records="), this.records, ")");
    }

    public /* synthetic */ PaginatedReleaseTombstoneResponse(int i13, int i14, int i15, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.totalCount = 0;
        } else {
            this.totalCount = i14;
        }
        if ((i13 & 2) == 0) {
            this.offset = 0;
        } else {
            this.offset = i15;
        }
        if ((i13 & 4) == 0) {
            this.records = C25271y.f99162w;
        } else {
            this.records = list;
        }
    }

    public PaginatedReleaseTombstoneResponse(int i13, int i14, List<ReleaseTombstoneResponse> records) {
        AbstractC22676k.m65750j(records, "records");
        this.totalCount = i13;
        this.offset = i14;
        this.records = records;
    }

    public /* synthetic */ PaginatedReleaseTombstoneResponse(int i13, int i14, List list, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? C25271y.f99162w : list);
    }
}
