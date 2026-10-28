package com.whoop.data.remote.domain.dto.community.share;

import c13.AbstractC3855a;
import com.mapbox.maps.MapboxMap;
import com.whoop.domain.model.teams.share.SelectTeam;
import com.whoop.domain.model.teams.share.TeamResponse;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;", "", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "", "Lcom/whoop/data/remote/domain/dto/community/share/SelectTeamDto;", "records", "<init>", "(IILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/domain/model/teams/share/TeamResponse;", "toTeamResponse", "()Lcom/whoop/domain/model/teams/share/TeamResponse;", "component1", "()I", "component2", "component3", "()Ljava/util/List;", "copy", "(IILjava/util/List;)Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOffset", "getLimit", "Ljava/util/List;", "getRecords", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TeamResponseDto {
    private final int limit;
    private final int offset;
    private final List<SelectTeamDto> records;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37572f(9))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/community/share/TeamResponseDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TeamResponseDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TeamResponseDto(int i13, int i14, int i15, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, TeamResponseDto$$serializer.INSTANCE.getDescriptor());
        }
        this.offset = i14;
        this.limit = i15;
        this.records = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SelectTeamDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamResponseDto copy$default(TeamResponseDto teamResponseDto, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = teamResponseDto.offset;
        }
        if ((i15 & 2) != 0) {
            i14 = teamResponseDto.limit;
        }
        if ((i15 & 4) != 0) {
            list = teamResponseDto.records;
        }
        return teamResponseDto.copy(i13, i14, list);
    }

    public static final /* synthetic */ void write$Self$core_release(TeamResponseDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.offset);
        output.encodeIntElement(serialDesc, 1, self.limit);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.records);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final List<SelectTeamDto> component3() {
        return this.records;
    }

    public final TeamResponseDto copy(int offset, int limit, List<SelectTeamDto> records) {
        AbstractC22676k.m65750j(records, "records");
        return new TeamResponseDto(offset, limit, records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamResponseDto)) {
            return false;
        }
        TeamResponseDto teamResponseDto = (TeamResponseDto) other;
        return this.offset == teamResponseDto.offset && this.limit == teamResponseDto.limit && AbstractC22676k.m65745e(this.records, teamResponseDto.records);
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<SelectTeamDto> getRecords() {
        return this.records;
    }

    public int hashCode() {
        return this.records.hashCode() + AbstractC11266d.m30448b(this.limit, Integer.hashCode(this.offset) * 31, 31);
    }

    public String toString() {
        int i13 = this.offset;
        int i14 = this.limit;
        return AbstractC3855a.m11829m(AbstractC11266d.m30465s(i13, i14, "TeamResponseDto(offset=", ", limit=", ", records="), this.records, ")");
    }

    public final TeamResponse toTeamResponse() {
        int i13 = this.offset;
        int i14 = this.limit;
        List<SelectTeamDto> list = this.records;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SelectTeam.INSTANCE.fromDto((SelectTeamDto) it.next()));
        }
        return new TeamResponse(i13, i14, AbstractC25265s.m74093D1(arrayList));
    }

    public TeamResponseDto(int i13, int i14, List<SelectTeamDto> records) {
        AbstractC22676k.m65750j(records, "records");
        this.offset = i13;
        this.limit = i14;
        this.records = records;
    }
}
