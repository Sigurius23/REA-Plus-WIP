package qq0;

import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.share.SelectTeam;
import ih0.AbstractC18489d0;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: qq0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lqq0/e;", "", "", "Lcom/whoop/domain/model/teams/share/SelectTeam;", "selectTeams", "Lcom/whoop/domain/model/teams/Team;", "team", "", "emptyState", "<init>", "(Ljava/util/List;Lcom/whoop/domain/model/teams/Team;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/whoop/domain/model/teams/Team;", "c", "()Lcom/whoop/domain/model/teams/Team;", "Z", "()Z", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30549e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<SelectTeam> selectTeams;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Team team;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean emptyState;

    public C30549e(List<SelectTeam> selectTeams, Team team, boolean z4) {
        AbstractC22676k.m65750j(selectTeams, "selectTeams");
        this.selectTeams = selectTeams;
        this.team = team;
        this.emptyState = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEmptyState() {
        return this.emptyState;
    }

    /* JADX INFO: renamed from: b */
    public final List<SelectTeam> m93650b() {
        return this.selectTeams;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30549e)) {
            return false;
        }
        C30549e c30549e = (C30549e) other;
        return AbstractC22676k.m65745e(this.selectTeams, c30549e.selectTeams) && AbstractC22676k.m65745e(this.team, c30549e.team) && this.emptyState == c30549e.emptyState;
    }

    public int hashCode() {
        int iHashCode = this.selectTeams.hashCode() * 31;
        Team team = this.team;
        return Boolean.hashCode(this.emptyState) + ((iHashCode + (team == null ? 0 : team.hashCode())) * 31);
    }

    public String toString() {
        List<SelectTeam> list = this.selectTeams;
        Team team = this.team;
        boolean z4 = this.emptyState;
        StringBuilder sb4 = new StringBuilder("SelectTeamViewState(selectTeams=");
        sb4.append(list);
        sb4.append(", team=");
        sb4.append(team);
        sb4.append(", emptyState=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C30549e(List list, Team team, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, team, (i13 & 4) != 0 ? false : z4);
    }
}
