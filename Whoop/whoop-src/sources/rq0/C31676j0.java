package rq0;

import com.whoop.domain.model.teams.Team;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rq0.j0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, m65681d2 = {"Lrq0/j0;", "", "Lcom/whoop/domain/model/teams/Team;", "team", "", "searchText", "", "resultSize", "", "loading", "<init>", "(Lcom/whoop/domain/model/teams/Team;Ljava/lang/String;IZ)V", "a", "(Lcom/whoop/domain/model/teams/Team;Ljava/lang/String;IZ)Lrq0/j0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/domain/model/teams/Team;", "e", "()Lcom/whoop/domain/model/teams/Team;", "b", "Ljava/lang/String;", "d", "c", "I", "getResultSize", "Z", "()Z", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31676j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Team team;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String searchText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int resultSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean loading;

    public C31676j0(Team team, String searchText, int i13, boolean z4) {
        AbstractC22676k.m65750j(searchText, "searchText");
        this.team = team;
        this.searchText = searchText;
        this.resultSize = i13;
        this.loading = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C31676j0 m98118b(C31676j0 c31676j0, Team team, String str, int i13, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            team = c31676j0.team;
        }
        if ((i14 & 2) != 0) {
            str = c31676j0.searchText;
        }
        if ((i14 & 4) != 0) {
            i13 = c31676j0.resultSize;
        }
        if ((i14 & 8) != 0) {
            z4 = c31676j0.loading;
        }
        return c31676j0.m98119a(team, str, i13, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C31676j0 m98119a(Team team, String searchText, int resultSize, boolean loading) {
        AbstractC22676k.m65750j(searchText, "searchText");
        return new C31676j0(team, searchText, resultSize, loading);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31676j0)) {
            return false;
        }
        C31676j0 c31676j0 = (C31676j0) other;
        return AbstractC22676k.m65745e(this.team, c31676j0.team) && AbstractC22676k.m65745e(this.searchText, c31676j0.searchText) && this.resultSize == c31676j0.resultSize && this.loading == c31676j0.loading;
    }

    public int hashCode() {
        Team team = this.team;
        return Boolean.hashCode(this.loading) + AbstractC11266d.m30448b(this.resultSize, AbstractC11266d.m30450d((team == null ? 0 : team.hashCode()) * 31, 31, this.searchText), 31);
    }

    public String toString() {
        return "TeamRemoveMembersViewState(team=" + this.team + ", searchText=" + this.searchText + ", resultSize=" + this.resultSize + ", loading=" + this.loading + ")";
    }

    public /* synthetic */ C31676j0(Team team, String str, int i13, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : team, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? false : z4);
    }
}
