package rq0;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import com.whoop.domain.model.teams.Team;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: rq0.f1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010,R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0011R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010,¨\u00066"}, m65681d2 = {"Lrq0/f1;", "Lrq0/a1$c;", "Landroid/os/Parcelable;", "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "invite", "Lcom/whoop/domain/model/teams/Team;", "team", "", "isConnected", "loading", "bannerLoaded", "", "resultSize", "refreshDataStore", "<init>", "(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;Lcom/whoop/domain/model/teams/Team;ZZZIZ)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "f", "(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;Lcom/whoop/domain/model/teams/Team;ZZZIZ)Lrq0/f1;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "k", "()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "x", "Lcom/whoop/domain/model/teams/Team;", "b", "()Lcom/whoop/domain/model/teams/Team;", "y", "Z", "()Z", "z", "getLoading", "E", "i", "F", "I", "s", "G", "getRefreshDataStore", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31665f1 implements C31650a1.c, Parcelable {
    public static final Parcelable.Creator<C31665f1> CREATOR = new a();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean bannerLoaded;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int resultSize;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final boolean refreshDataStore;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final DrawerDisplayInvite invite;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Team team;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final boolean isConnected;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final boolean loading;

    /* JADX INFO: renamed from: rq0.f1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Parcelable.Creator<C31665f1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C31665f1 createFromParcel(Parcel parcel) {
            int i13;
            boolean z4;
            AbstractC22676k.m65750j(parcel, "parcel");
            DrawerDisplayInvite drawerDisplayInvite = (DrawerDisplayInvite) parcel.readParcelable(C31665f1.class.getClassLoader());
            Team team = (Team) parcel.readParcelable(C31665f1.class.getClassLoader());
            boolean z13 = false;
            boolean z14 = true;
            if (parcel.readInt() != 0) {
                z13 = true;
            }
            if (parcel.readInt() == 0) {
                z14 = z13;
            }
            if (parcel.readInt() == 0) {
                z14 = z13;
            }
            int i14 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z4 = true;
                i13 = i14;
            } else {
                i13 = i14;
                z4 = false;
            }
            return new C31665f1(drawerDisplayInvite, team, z13, z14, z14, i13, z4);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C31665f1[] newArray(int i13) {
            return new C31665f1[i13];
        }
    }

    public C31665f1(DrawerDisplayInvite drawerDisplayInvite, Team team, boolean z4, boolean z13, boolean z14, int i13, boolean z15) {
        this.invite = drawerDisplayInvite;
        this.team = team;
        this.isConnected = z4;
        this.loading = z13;
        this.bannerLoaded = z14;
        this.resultSize = i13;
        this.refreshDataStore = z15;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C31665f1 m97966h(C31665f1 c31665f1, DrawerDisplayInvite drawerDisplayInvite, Team team, boolean z4, boolean z13, boolean z14, int i13, boolean z15, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            drawerDisplayInvite = c31665f1.invite;
        }
        if ((i14 & 2) != 0) {
            team = c31665f1.team;
        }
        if ((i14 & 4) != 0) {
            z4 = c31665f1.isConnected;
        }
        if ((i14 & 8) != 0) {
            z13 = c31665f1.loading;
        }
        if ((i14 & 16) != 0) {
            z14 = c31665f1.bannerLoaded;
        }
        if ((i14 & 32) != 0) {
            i13 = c31665f1.resultSize;
        }
        if ((i14 & 64) != 0) {
            z15 = c31665f1.refreshDataStore;
        }
        int i15 = i13;
        boolean z16 = z15;
        boolean z17 = z14;
        boolean z18 = z4;
        return c31665f1.m97967f(drawerDisplayInvite, team, z18, z13, z17, i15, z16);
    }

    @Override // rq0.C31650a1.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public Team getTeam() {
        return this.team;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31665f1)) {
            return false;
        }
        C31665f1 c31665f1 = (C31665f1) other;
        return AbstractC22676k.m65745e(this.invite, c31665f1.invite) && AbstractC22676k.m65745e(this.team, c31665f1.team) && this.isConnected == c31665f1.isConnected && this.loading == c31665f1.loading && this.bannerLoaded == c31665f1.bannerLoaded && this.resultSize == c31665f1.resultSize && this.refreshDataStore == c31665f1.refreshDataStore;
    }

    /* JADX INFO: renamed from: f */
    public final C31665f1 m97967f(DrawerDisplayInvite invite, Team team, boolean isConnected, boolean loading, boolean bannerLoaded, int resultSize, boolean refreshDataStore) {
        return new C31665f1(invite, team, isConnected, loading, bannerLoaded, resultSize, refreshDataStore);
    }

    public int hashCode() {
        DrawerDisplayInvite drawerDisplayInvite = this.invite;
        int iHashCode = (drawerDisplayInvite == null ? 0 : drawerDisplayInvite.hashCode()) * 31;
        Team team = this.team;
        return Boolean.hashCode(this.refreshDataStore) + AbstractC11266d.m30448b(this.resultSize, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (team != null ? team.hashCode() : 0)) * 31, 31, this.isConnected), 31, this.loading), 31, this.bannerLoaded), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getBannerLoaded() {
        return this.bannerLoaded;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final DrawerDisplayInvite getInvite() {
        return this.invite;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getResultSize() {
        return this.resultSize;
    }

    public String toString() {
        DrawerDisplayInvite drawerDisplayInvite = this.invite;
        Team team = this.team;
        boolean z4 = this.isConnected;
        boolean z13 = this.loading;
        boolean z14 = this.bannerLoaded;
        int i13 = this.resultSize;
        boolean z15 = this.refreshDataStore;
        StringBuilder sb4 = new StringBuilder("TeamsShowInviteViewState(invite=");
        sb4.append(drawerDisplayInvite);
        sb4.append(", team=");
        sb4.append(team);
        sb4.append(", isConnected=");
        AbstractC38963t7.m124392v(sb4, z4, ", loading=", z13, ", bannerLoaded=");
        AbstractC30802r.m94769r(i13, ", resultSize=", ", refreshDataStore=", sb4, z14);
        return AbstractC18489d0.m53372m(sb4, z15, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.invite, flags);
        dest.writeParcelable(this.team, flags);
        dest.writeInt(this.isConnected ? 1 : 0);
        dest.writeInt(this.loading ? 1 : 0);
        dest.writeInt(this.bannerLoaded ? 1 : 0);
        dest.writeInt(this.resultSize);
        dest.writeInt(this.refreshDataStore ? 1 : 0);
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public /* synthetic */ C31665f1(DrawerDisplayInvite drawerDisplayInvite, Team team, boolean z4, boolean z13, boolean z14, int i13, boolean z15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : drawerDisplayInvite, (i14 & 2) != 0 ? null : team, (i14 & 4) != 0 ? true : z4, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? 0 : i13, (i14 & 64) != 0 ? false : z15);
    }
}
