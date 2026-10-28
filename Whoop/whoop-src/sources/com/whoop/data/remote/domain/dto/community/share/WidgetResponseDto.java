package com.whoop.data.remote.domain.dto.community.share;

import com.mapbox.maps.MapboxMap;
import com.whoop.domain.model.teams.Widget;
import com.whoop.domain.model.teams.WidgetCollectionResponse;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wr1.C37572f;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J>\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u001a\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\"¨\u00065"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;", "", "", "hasData", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "", "Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;", "records", "<init>", "(ZIILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/domain/model/teams/WidgetCollectionResponse;", "toWidgetCollectionResponse", "()Lcom/whoop/domain/model/teams/WidgetCollectionResponse;", "component1", "()Z", "component2", "()I", "component3", "component4", "()Ljava/util/List;", "copy", "(ZIILjava/util/List;)Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasData", "I", "getOffset", "getLimit", "Ljava/util/List;", "getRecords", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WidgetResponseDto {
    private final boolean hasData;
    private final int limit;
    private final int offset;
    private final List<WidgetDto> records;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37572f(10))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/community/share/WidgetResponseDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WidgetResponseDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WidgetResponseDto(int i13, boolean z4, int i14, int i15, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, WidgetResponseDto$$serializer.INSTANCE.getDescriptor());
        }
        this.hasData = z4;
        this.offset = i14;
        this.limit = i15;
        this.records = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WidgetDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WidgetResponseDto copy$default(WidgetResponseDto widgetResponseDto, boolean z4, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z4 = widgetResponseDto.hasData;
        }
        if ((i15 & 2) != 0) {
            i13 = widgetResponseDto.offset;
        }
        if ((i15 & 4) != 0) {
            i14 = widgetResponseDto.limit;
        }
        if ((i15 & 8) != 0) {
            list = widgetResponseDto.records;
        }
        return widgetResponseDto.copy(z4, i13, i14, list);
    }

    public static final /* synthetic */ void write$Self$core_release(WidgetResponseDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.hasData);
        output.encodeIntElement(serialDesc, 1, self.offset);
        output.encodeIntElement(serialDesc, 2, self.limit);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.records);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final List<WidgetDto> component4() {
        return this.records;
    }

    public final WidgetResponseDto copy(boolean hasData, int offset, int limit, List<WidgetDto> records) {
        AbstractC22676k.m65750j(records, "records");
        return new WidgetResponseDto(hasData, offset, limit, records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetResponseDto)) {
            return false;
        }
        WidgetResponseDto widgetResponseDto = (WidgetResponseDto) other;
        return this.hasData == widgetResponseDto.hasData && this.offset == widgetResponseDto.offset && this.limit == widgetResponseDto.limit && AbstractC22676k.m65745e(this.records, widgetResponseDto.records);
    }

    public final boolean getHasData() {
        return this.hasData;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<WidgetDto> getRecords() {
        return this.records;
    }

    public int hashCode() {
        return this.records.hashCode() + AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30448b(this.offset, Boolean.hashCode(this.hasData) * 31, 31), 31);
    }

    public String toString() {
        return "WidgetResponseDto(hasData=" + this.hasData + ", offset=" + this.offset + ", limit=" + this.limit + ", records=" + this.records + ")";
    }

    public final WidgetCollectionResponse toWidgetCollectionResponse() {
        boolean z4 = this.hasData;
        int i13 = this.offset;
        int i14 = this.limit;
        List<WidgetDto> list = this.records;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Widget.INSTANCE.fromDto((WidgetDto) it.next()));
        }
        return new WidgetCollectionResponse(z4, i13, i14, AbstractC25265s.m74093D1(arrayList));
    }

    public WidgetResponseDto(boolean z4, int i13, int i14, List<WidgetDto> records) {
        AbstractC22676k.m65750j(records, "records");
        this.hasData = z4;
        this.offset = i13;
        this.limit = i14;
        this.records = records;
    }
}
