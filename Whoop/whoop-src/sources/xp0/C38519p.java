package xp0;

import android.content.Context;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.viewpager2.adapter.AbstractC1861i;
import aq0.C1906q;
import com.whoop.community.CommunityFragment;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.p069ui.ScoreContext;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rq0.C31696t0;
import rq0.C31708z0;

/* JADX INFO: renamed from: xp0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*R0\u00100\u001a\u001e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\n0+j\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\n`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R0\u00102\u001a\u001e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\n0+j\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\n`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R'\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001003j\b\u0012\u0004\u0012\u00020\u0010`48\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b(\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020,098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m65681d2 = {"Lxp0/p;", "Landroidx/viewpager2/adapter/i;", "Lcom/whoop/community/CommunityFragment;", "fragment", "Lcom/whoop/domain/model/teams/Team;", "team", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriod", "", "sortBy", "", "parentMessageId", "widgetUrl", "<init>", "(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;Lcom/whoop/community/domain/model/teams/TimePeriod;ILjava/lang/String;Ljava/lang/String;)V", "position", "Lhj0/m;", "c", "(I)Lhj0/m;", "Landroid/content/Context;", "context", "Ll83/a0;", "f", "(Landroid/content/Context;)V", "e", "(I)Ljava/lang/String;", "getItemCount", "()I", "Landroidx/fragment/app/m0;", "createFragment", "(I)Landroidx/fragment/app/m0;", "a", "Lcom/whoop/community/CommunityFragment;", "getFragment", "()Lcom/whoop/community/CommunityFragment;", "b", "Lcom/whoop/domain/model/teams/Team;", "getTeam", "()Lcom/whoop/domain/model/teams/Team;", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "d", "I", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lcom/whoop/ui/ScoreContext;", "Lkotlin/collections/HashMap;", "g", "Ljava/util/HashMap;", "titles", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "analyticsScreenNames", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "fragments", "", "j", "Ljava/util/List;", "allTabs", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38519p extends AbstractC1861i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CommunityFragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Team team;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TimePeriod timePeriod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int sortBy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String parentMessageId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String widgetUrl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final HashMap<ScoreContext, String> titles;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final HashMap<ScoreContext, String> analyticsScreenNames;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final ArrayList<AbstractC17354m> fragments;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<ScoreContext> allTabs;

    /* JADX INFO: renamed from: xp0.p$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f165786a;

        static {
            int[] iArr = new int[ScoreContext.values().length];
            try {
                iArr[ScoreContext.OVERVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScoreContext.CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScoreContext.STRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScoreContext.RECOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScoreContext.SLEEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f165786a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38519p(CommunityFragment fragment, Team team, TimePeriod timePeriod, int i13, String str, String str2) {
        super(fragment.getChildFragmentManager(), fragment.getLifecycle());
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(timePeriod, "timePeriod");
        this.fragment = fragment;
        this.team = team;
        this.timePeriod = timePeriod;
        this.sortBy = i13;
        this.parentMessageId = str;
        this.widgetUrl = str2;
        this.titles = new HashMap<>();
        this.analyticsScreenNames = new HashMap<>();
        this.fragments = new ArrayList<>();
        List<ScoreContext> enabledTabs = team.getEnabledTabs();
        ArrayList arrayList = new ArrayList();
        AbstractC25265s.m74087A1(enabledTabs, arrayList);
        if (team.getChatChannel() != null && team.getTeamType() != TeamType.ELITE && team.getChatEnabled()) {
            arrayList.add(1, ScoreContext.CHAT);
        }
        this.allTabs = arrayList;
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC17354m m123416c(int position) {
        int i13 = a.f165786a[this.allTabs.get(position).ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? C31696t0.INSTANCE.m98267b(this.allTabs.get(position), this.team.getTeamType(), this.timePeriod, this.sortBy) : C1906q.INSTANCE.m5837a(this.team, this.parentMessageId, this.widgetUrl);
        }
        return C31708z0.INSTANCE.m98360a();
    }

    @Override // androidx.viewpager2.adapter.AbstractC1861i
    public AbstractComponentCallbacksC1320m0 createFragment(int position) {
        AbstractC17354m abstractC17354mM123416c = m123416c(position);
        this.fragments.add(abstractC17354mM123416c);
        return abstractC17354mM123416c;
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList<AbstractC17354m> m123417d() {
        return this.fragments;
    }

    /* JADX INFO: renamed from: e */
    public final String m123418e(int position) {
        return this.titles.get(this.allTabs.get(position));
    }

    /* JADX INFO: renamed from: f */
    public final void m123419f(Context context) {
        String str;
        String string;
        AbstractC22676k.m65750j(context, "context");
        String string2 = context.getString(AbstractC38505d0.f165700o2);
        AbstractC22676k.m65749i(string2, "getString(...)");
        if (this.titles.isEmpty()) {
            for (ScoreContext scoreContext : this.allTabs) {
                HashMap<ScoreContext, String> map = this.titles;
                int i13 = a.f165786a[scoreContext.ordinal()];
                if (i13 == 1) {
                    string = string2;
                } else if (i13 == 2) {
                    string = context.getString(AbstractC38505d0.f165692m2);
                    AbstractC22676k.m65749i(string, "getString(...)");
                } else if (i13 == 3) {
                    string = context.getString(AbstractC38505d0.f165712r2);
                    AbstractC22676k.m65749i(string, "getString(...)");
                } else if (i13 == 4) {
                    string = context.getString(AbstractC38505d0.f165704p2);
                    AbstractC22676k.m65749i(string, "getString(...)");
                } else {
                    if (i13 != 5) {
                        throw new IllegalArgumentException();
                    }
                    string = context.getString(AbstractC38505d0.f165708q2);
                    AbstractC22676k.m65749i(string, "getString(...)");
                }
                map.put(scoreContext, string);
            }
        }
        if (this.analyticsScreenNames.isEmpty()) {
            for (ScoreContext scoreContext2 : this.allTabs) {
                HashMap<ScoreContext, String> map2 = this.analyticsScreenNames;
                int i14 = a.f165786a[scoreContext2.ordinal()];
                if (i14 == 1) {
                    str = "Description";
                } else if (i14 == 3) {
                    str = "Strain";
                } else if (i14 != 4) {
                    str = i14 != 5 ? "" : "Sleep";
                } else {
                    str = "Recovery";
                }
                map2.put(scoreContext2, str);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getPageCount() {
        return this.allTabs.size();
    }
}
