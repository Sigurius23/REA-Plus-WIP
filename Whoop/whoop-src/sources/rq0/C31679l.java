package rq0;

import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamInviteDto;
import com.whoop.domain.model.teams.TeamUser;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jh3.AbstractC21702c;
import n73.InterfaceC26443b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rq0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012$\b\u0002\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t`\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001dJ\u0098\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062$\b\u0002\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t`\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010$R3\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t`\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b/\u00107R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b8\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b9\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010\"¨\u0006;"}, m65681d2 = {"Lrq0/l;", "", "Lcom/whoop/domain/model/teams/Team;", "team", "", "searchText", "", "resultSize", "Ljava/util/HashMap;", "Lrq0/e;", "Lkotlin/collections/HashMap;", "onDeckInvites", "", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "pendingInvites", "Lcom/whoop/domain/model/teams/TeamUser;", QueryChannelRequest.KEY_MEMBERS, "referralRewardMessage", "shareCode", "toastMessage", "<init>", "(Lcom/whoop/domain/model/teams/Team;Ljava/lang/String;ILjava/util/HashMap;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toUserId", "toUserName", "Ln73/b;", "task", "l", "(ILjava/lang/String;Ln73/b;)Lrq0/l;", "m", "(I)Lrq0/l;", "n", "a", "(Lcom/whoop/domain/model/teams/Team;Ljava/lang/String;ILjava/util/HashMap;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrq0/l;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/domain/model/teams/Team;", "j", "()Lcom/whoop/domain/model/teams/Team;", "b", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "I", "g", "d", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "i", "k", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31679l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Team team;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String searchText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int resultSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final HashMap<Integer, C31660e> onDeckInvites;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<TeamInviteDto> pendingInvites;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<TeamUser> members;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String referralRewardMessage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String shareCode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String toastMessage;

    public C31679l(Team team, String searchText, int i13, HashMap<Integer, C31660e> onDeckInvites, List<TeamInviteDto> pendingInvites, List<TeamUser> members, String referralRewardMessage, String str, String str2) {
        AbstractC22676k.m65750j(searchText, "searchText");
        AbstractC22676k.m65750j(onDeckInvites, "onDeckInvites");
        AbstractC22676k.m65750j(pendingInvites, "pendingInvites");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(referralRewardMessage, "referralRewardMessage");
        this.team = team;
        this.searchText = searchText;
        this.resultSize = i13;
        this.onDeckInvites = onDeckInvites;
        this.pendingInvites = pendingInvites;
        this.members = members;
        this.referralRewardMessage = referralRewardMessage;
        this.shareCode = str;
        this.toastMessage = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C31679l m98167b(C31679l c31679l, Team team, String str, int i13, HashMap map, List list, List list2, String str2, String str3, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            team = c31679l.team;
        }
        if ((i14 & 2) != 0) {
            str = c31679l.searchText;
        }
        if ((i14 & 4) != 0) {
            i13 = c31679l.resultSize;
        }
        if ((i14 & 8) != 0) {
            map = c31679l.onDeckInvites;
        }
        if ((i14 & 16) != 0) {
            list = c31679l.pendingInvites;
        }
        if ((i14 & 32) != 0) {
            list2 = c31679l.members;
        }
        if ((i14 & 64) != 0) {
            str2 = c31679l.referralRewardMessage;
        }
        if ((i14 & 128) != 0) {
            str3 = c31679l.shareCode;
        }
        if ((i14 & 256) != 0) {
            str4 = c31679l.toastMessage;
        }
        String str5 = str3;
        String str6 = str4;
        List list3 = list2;
        String str7 = str2;
        List list4 = list;
        int i15 = i13;
        return c31679l.m98168a(team, str, i15, map, list4, list3, str7, str5, str6);
    }

    /* JADX INFO: renamed from: a */
    public final C31679l m98168a(Team team, String searchText, int resultSize, HashMap<Integer, C31660e> onDeckInvites, List<TeamInviteDto> pendingInvites, List<TeamUser> members, String referralRewardMessage, String shareCode, String toastMessage) {
        AbstractC22676k.m65750j(searchText, "searchText");
        AbstractC22676k.m65750j(onDeckInvites, "onDeckInvites");
        AbstractC22676k.m65750j(pendingInvites, "pendingInvites");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(referralRewardMessage, "referralRewardMessage");
        return new C31679l(team, searchText, resultSize, onDeckInvites, pendingInvites, members, referralRewardMessage, shareCode, toastMessage);
    }

    /* JADX INFO: renamed from: c */
    public final List<TeamUser> m98169c() {
        return this.members;
    }

    /* JADX INFO: renamed from: d */
    public final HashMap<Integer, C31660e> m98170d() {
        return this.onDeckInvites;
    }

    /* JADX INFO: renamed from: e */
    public final List<TeamInviteDto> m98171e() {
        return this.pendingInvites;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31679l)) {
            return false;
        }
        C31679l c31679l = (C31679l) other;
        return AbstractC22676k.m65745e(this.team, c31679l.team) && AbstractC22676k.m65745e(this.searchText, c31679l.searchText) && this.resultSize == c31679l.resultSize && AbstractC22676k.m65745e(this.onDeckInvites, c31679l.onDeckInvites) && AbstractC22676k.m65745e(this.pendingInvites, c31679l.pendingInvites) && AbstractC22676k.m65745e(this.members, c31679l.members) && AbstractC22676k.m65745e(this.referralRewardMessage, c31679l.referralRewardMessage) && AbstractC22676k.m65745e(this.shareCode, c31679l.shareCode) && AbstractC22676k.m65745e(this.toastMessage, c31679l.toastMessage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getReferralRewardMessage() {
        return this.referralRewardMessage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getResultSize() {
        return this.resultSize;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    public int hashCode() {
        Team team = this.team;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.onDeckInvites.hashCode() + AbstractC11266d.m30448b(this.resultSize, AbstractC11266d.m30450d((team == null ? 0 : team.hashCode()) * 31, 31, this.searchText), 31)) * 31, 31, this.pendingInvites), 31, this.members), 31, this.referralRewardMessage);
        String str = this.shareCode;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toastMessage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getToastMessage() {
        return this.toastMessage;
    }

    /* JADX INFO: renamed from: l */
    public final C31679l m98178l(int toUserId, String toUserName, InterfaceC26443b task) {
        AbstractC22676k.m65750j(toUserName, "toUserName");
        AbstractC22676k.m65750j(task, "task");
        this.onDeckInvites.put(Integer.valueOf(toUserId), new C31660e(toUserId, toUserName, task));
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final C31679l m98179m(int toUserId) {
        InterfaceC26443b interfaceC26443bM97935b;
        if (this.onDeckInvites.containsKey(Integer.valueOf(toUserId))) {
            C31660e c31660e = this.onDeckInvites.get(Integer.valueOf(toUserId));
            if (c31660e != null && (interfaceC26443bM97935b = c31660e.getTask()) != null) {
                interfaceC26443bM97935b.dispose();
            }
            this.onDeckInvites.remove(Integer.valueOf(toUserId));
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final C31679l m98180n(int toUserId) {
        if (this.onDeckInvites.containsKey(Integer.valueOf(toUserId))) {
            this.onDeckInvites.remove(Integer.valueOf(toUserId));
        }
        return this;
    }

    public String toString() {
        Team team = this.team;
        String str = this.searchText;
        int i13 = this.resultSize;
        HashMap<Integer, C31660e> map = this.onDeckInvites;
        List<TeamInviteDto> list = this.pendingInvites;
        List<TeamUser> list2 = this.members;
        String str2 = this.referralRewardMessage;
        String str3 = this.shareCode;
        String str4 = this.toastMessage;
        StringBuilder sb4 = new StringBuilder("TeamAddMembersViewState(team=");
        sb4.append(team);
        sb4.append(", searchText=");
        sb4.append(str);
        sb4.append(", resultSize=");
        sb4.append(i13);
        sb4.append(", onDeckInvites=");
        sb4.append(map);
        sb4.append(", pendingInvites=");
        AbstractC21702c.m61148s(sb4, list, ", members=", list2, ", referralRewardMessage=");
        AbstractC11266d.m30444B(sb4, str2, ", shareCode=", str3, ", toastMessage=");
        return AbstractC25012a.m73376i(str4, ")", sb4);
    }

    public /* synthetic */ C31679l(Team team, String str, int i13, HashMap map, List list, List list2, String str2, String str3, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : team, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? new HashMap() : map, (i14 & 16) != 0 ? new ArrayList() : list, (i14 & 32) != 0 ? new ArrayList() : list2, (i14 & 64) != 0 ? "" : str2, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : str4);
    }
}
