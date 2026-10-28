package nq0;

import c41.C4140w1;
import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.domain.model.teams.MemberStory;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamInviteDto;
import h51.C16934f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qv1.C30656g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: nq0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J²\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b.\u0010+R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b/\u0010'R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b,\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b4\u0010;R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, m65681d2 = {"Lnq0/j;", "", "", "isConnected", "", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "pendingInvites", "Lcom/whoop/domain/model/teams/Team;", "userTeams", "Lcom/whoop/domain/model/teams/FeatureTeam;", "featureTeams", "Lcom/whoop/domain/model/teams/MemberStory;", "memberStories", "pendingInvitesLoaded", "userTeamsLoaded", "featureTeamsLoaded", "memberStoriesLoaded", "amaMemberStory", "Lh51/f;", "educationCarousel", "Lqv1/g;", "rafCommunityScreen", "Lc41/w1;", "familyPlanEntry", "<init>", "(ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZZLcom/whoop/domain/model/teams/MemberStory;Lh51/f;Lqv1/g;Lc41/w1;)V", "a", "(ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZZLcom/whoop/domain/model/teams/MemberStory;Lh51/f;Lqv1/g;Lc41/w1;)Lnq0/j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "m", "()Z", "b", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "c", "k", "d", "e", "f", "i", "g", "l", "j", "Lcom/whoop/domain/model/teams/MemberStory;", "getAmaMemberStory", "()Lcom/whoop/domain/model/teams/MemberStory;", "Lh51/f;", "()Lh51/f;", "Lqv1/g;", "()Lqv1/g;", "Lc41/w1;", "getFamilyPlanEntry", "()Lc41/w1;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27047j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isConnected;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<TeamInviteDto> pendingInvites;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<Team> userTeams;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<FeatureTeam> featureTeams;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<MemberStory> memberStories;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean pendingInvitesLoaded;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean userTeamsLoaded;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean featureTeamsLoaded;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean memberStoriesLoaded;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final MemberStory amaMemberStory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C16934f educationCarousel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C30656g rafCommunityScreen;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C4140w1 familyPlanEntry;

    public C27047j(boolean z4, List<TeamInviteDto> pendingInvites, List<Team> userTeams, List<FeatureTeam> featureTeams, List<MemberStory> memberStories, boolean z13, boolean z14, boolean z15, boolean z16, MemberStory memberStory, C16934f c16934f, C30656g c30656g, C4140w1 c4140w1) {
        AbstractC22676k.m65750j(pendingInvites, "pendingInvites");
        AbstractC22676k.m65750j(userTeams, "userTeams");
        AbstractC22676k.m65750j(featureTeams, "featureTeams");
        AbstractC22676k.m65750j(memberStories, "memberStories");
        this.isConnected = z4;
        this.pendingInvites = pendingInvites;
        this.userTeams = userTeams;
        this.featureTeams = featureTeams;
        this.memberStories = memberStories;
        this.pendingInvitesLoaded = z13;
        this.userTeamsLoaded = z14;
        this.featureTeamsLoaded = z15;
        this.memberStoriesLoaded = z16;
        this.amaMemberStory = memberStory;
        this.educationCarousel = c16934f;
        this.rafCommunityScreen = c30656g;
        this.familyPlanEntry = c4140w1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C27047j m81253b(C27047j c27047j, boolean z4, List list, List list2, List list3, List list4, boolean z13, boolean z14, boolean z15, boolean z16, MemberStory memberStory, C16934f c16934f, C30656g c30656g, C4140w1 c4140w1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c27047j.isConnected;
        }
        return c27047j.m81254a(z4, (i13 & 2) != 0 ? c27047j.pendingInvites : list, (i13 & 4) != 0 ? c27047j.userTeams : list2, (i13 & 8) != 0 ? c27047j.featureTeams : list3, (i13 & 16) != 0 ? c27047j.memberStories : list4, (i13 & 32) != 0 ? c27047j.pendingInvitesLoaded : z13, (i13 & 64) != 0 ? c27047j.userTeamsLoaded : z14, (i13 & 128) != 0 ? c27047j.featureTeamsLoaded : z15, (i13 & 256) != 0 ? c27047j.memberStoriesLoaded : z16, (i13 & 512) != 0 ? c27047j.amaMemberStory : memberStory, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c27047j.educationCarousel : c16934f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c27047j.rafCommunityScreen : c30656g, (i13 & 4096) != 0 ? c27047j.familyPlanEntry : c4140w1);
    }

    /* JADX INFO: renamed from: a */
    public final C27047j m81254a(boolean isConnected, List<TeamInviteDto> pendingInvites, List<Team> userTeams, List<FeatureTeam> featureTeams, List<MemberStory> memberStories, boolean pendingInvitesLoaded, boolean userTeamsLoaded, boolean featureTeamsLoaded, boolean memberStoriesLoaded, MemberStory amaMemberStory, C16934f educationCarousel, C30656g rafCommunityScreen, C4140w1 familyPlanEntry) {
        AbstractC22676k.m65750j(pendingInvites, "pendingInvites");
        AbstractC22676k.m65750j(userTeams, "userTeams");
        AbstractC22676k.m65750j(featureTeams, "featureTeams");
        AbstractC22676k.m65750j(memberStories, "memberStories");
        return new C27047j(isConnected, pendingInvites, userTeams, featureTeams, memberStories, pendingInvitesLoaded, userTeamsLoaded, featureTeamsLoaded, memberStoriesLoaded, amaMemberStory, educationCarousel, rafCommunityScreen, familyPlanEntry);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C16934f getEducationCarousel() {
        return this.educationCarousel;
    }

    /* JADX INFO: renamed from: d */
    public final List<FeatureTeam> m81256d() {
        return this.featureTeams;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getFeatureTeamsLoaded() {
        return this.featureTeamsLoaded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27047j)) {
            return false;
        }
        C27047j c27047j = (C27047j) other;
        return this.isConnected == c27047j.isConnected && AbstractC22676k.m65745e(this.pendingInvites, c27047j.pendingInvites) && AbstractC22676k.m65745e(this.userTeams, c27047j.userTeams) && AbstractC22676k.m65745e(this.featureTeams, c27047j.featureTeams) && AbstractC22676k.m65745e(this.memberStories, c27047j.memberStories) && this.pendingInvitesLoaded == c27047j.pendingInvitesLoaded && this.userTeamsLoaded == c27047j.userTeamsLoaded && this.featureTeamsLoaded == c27047j.featureTeamsLoaded && this.memberStoriesLoaded == c27047j.memberStoriesLoaded && AbstractC22676k.m65745e(this.amaMemberStory, c27047j.amaMemberStory) && AbstractC22676k.m65745e(this.educationCarousel, c27047j.educationCarousel) && AbstractC22676k.m65745e(this.rafCommunityScreen, c27047j.rafCommunityScreen) && AbstractC22676k.m65745e(this.familyPlanEntry, c27047j.familyPlanEntry);
    }

    /* JADX INFO: renamed from: f */
    public final List<MemberStory> m81258f() {
        return this.memberStories;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getMemberStoriesLoaded() {
        return this.memberStoriesLoaded;
    }

    /* JADX INFO: renamed from: h */
    public final List<TeamInviteDto> m81260h() {
        return this.pendingInvites;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(Boolean.hashCode(this.isConnected) * 31, 31, this.pendingInvites), 31, this.userTeams), 31, this.featureTeams), 31, this.memberStories), 31, this.pendingInvitesLoaded), 31, this.userTeamsLoaded), 31, this.featureTeamsLoaded), 31, this.memberStoriesLoaded);
        MemberStory memberStory = this.amaMemberStory;
        int iHashCode = (iM8289b + (memberStory == null ? 0 : memberStory.hashCode())) * 31;
        C16934f c16934f = this.educationCarousel;
        int iHashCode2 = (iHashCode + (c16934f == null ? 0 : c16934f.hashCode())) * 31;
        C30656g c30656g = this.rafCommunityScreen;
        int iHashCode3 = (iHashCode2 + (c30656g == null ? 0 : c30656g.hashCode())) * 31;
        C4140w1 c4140w1 = this.familyPlanEntry;
        return iHashCode3 + (c4140w1 != null ? c4140w1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getPendingInvitesLoaded() {
        return this.pendingInvitesLoaded;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C30656g getRafCommunityScreen() {
        return this.rafCommunityScreen;
    }

    /* JADX INFO: renamed from: k */
    public final List<Team> m81263k() {
        return this.userTeams;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getUserTeamsLoaded() {
        return this.userTeamsLoaded;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public String toString() {
        boolean z4 = this.isConnected;
        List<TeamInviteDto> list = this.pendingInvites;
        List<Team> list2 = this.userTeams;
        List<FeatureTeam> list3 = this.featureTeams;
        List<MemberStory> list4 = this.memberStories;
        boolean z13 = this.pendingInvitesLoaded;
        boolean z14 = this.userTeamsLoaded;
        boolean z15 = this.featureTeamsLoaded;
        boolean z16 = this.memberStoriesLoaded;
        MemberStory memberStory = this.amaMemberStory;
        C16934f c16934f = this.educationCarousel;
        C30656g c30656g = this.rafCommunityScreen;
        C4140w1 c4140w1 = this.familyPlanEntry;
        StringBuilder sb4 = new StringBuilder("CommunityLandingViewState(isConnected=");
        sb4.append(z4);
        sb4.append(", pendingInvites=");
        sb4.append(list);
        sb4.append(", userTeams=");
        AbstractC21702c.m61148s(sb4, list2, ", featureTeams=", list3, ", memberStories=");
        AbstractC26725a.m79512p(", pendingInvitesLoaded=", ", userTeamsLoaded=", sb4, list4, z13);
        AbstractC38963t7.m124392v(sb4, z14, ", featureTeamsLoaded=", z15, ", memberStoriesLoaded=");
        sb4.append(z16);
        sb4.append(", amaMemberStory=");
        sb4.append(memberStory);
        sb4.append(", educationCarousel=");
        sb4.append(c16934f);
        sb4.append(", rafCommunityScreen=");
        sb4.append(c30656g);
        sb4.append(", familyPlanEntry=");
        sb4.append(c4140w1);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C27047j(boolean z4, List list, List list2, List list3, List list4, boolean z13, boolean z14, boolean z15, boolean z16, MemberStory memberStory, C16934f c16934f, C30656g c30656g, C4140w1 c4140w1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        z4 = (i13 & 1) != 0 ? false : z4;
        int i14 = i13 & 2;
        List list5 = C25271y.f99162w;
        this(z4, i14 != 0 ? list5 : list, (i13 & 4) != 0 ? list5 : list2, (i13 & 8) != 0 ? list5 : list3, (i13 & 16) == 0 ? list4 : list5, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? false : z14, (i13 & 128) != 0 ? false : z15, (i13 & 256) == 0 ? z16 : false, (i13 & 512) != 0 ? null : memberStory, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c16934f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c30656g, (i13 & 4096) != 0 ? null : c4140w1);
    }
}
