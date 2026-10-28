package com.whoop.domain.model.teams.share;

import c13.AbstractC3855a;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/domain/model/teams/share/TeamResponse;", "", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "records", "", "Lcom/whoop/domain/model/teams/share/SelectTeam;", "<init>", "(IILjava/util/List;)V", "getOffset", "()I", "getLimit", "getRecords", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TeamResponse {
    private final int limit;
    private final int offset;
    private final List<SelectTeam> records;

    public TeamResponse(int i13, int i14, List<SelectTeam> records) {
        AbstractC22676k.m65750j(records, "records");
        this.offset = i13;
        this.limit = i14;
        this.records = records;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamResponse copy$default(TeamResponse teamResponse, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = teamResponse.offset;
        }
        if ((i15 & 2) != 0) {
            i14 = teamResponse.limit;
        }
        if ((i15 & 4) != 0) {
            list = teamResponse.records;
        }
        return teamResponse.copy(i13, i14, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final List<SelectTeam> component3() {
        return this.records;
    }

    public final TeamResponse copy(int offset, int limit, List<SelectTeam> records) {
        AbstractC22676k.m65750j(records, "records");
        return new TeamResponse(offset, limit, records);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamResponse)) {
            return false;
        }
        TeamResponse teamResponse = (TeamResponse) other;
        return this.offset == teamResponse.offset && this.limit == teamResponse.limit && AbstractC22676k.m65745e(this.records, teamResponse.records);
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<SelectTeam> getRecords() {
        return this.records;
    }

    public int hashCode() {
        return this.records.hashCode() + AbstractC11266d.m30448b(this.limit, Integer.hashCode(this.offset) * 31, 31);
    }

    public String toString() {
        int i13 = this.offset;
        int i14 = this.limit;
        return AbstractC3855a.m11829m(AbstractC11266d.m30465s(i13, i14, "TeamResponse(offset=", ", limit=", ", records="), this.records, ")");
    }
}
