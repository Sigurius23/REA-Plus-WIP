package rq0;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.domain.model.teams.TeamUser;
import com.whoop.p069ui.ScoreContext;
import com.whoop.p069ui.pills.StrokedPillButton;
import de.hdodenhof.circleimageview.CircleImageView;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Arrays;
import p217ib.AbstractC18319p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu1.AbstractC36512c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: rq0.a1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u001d\"\u001fB#\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00192\n\u0010\u0017\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!¨\u0006#"}, m65681d2 = {"Lrq0/a1;", "Lib/p;", "Lcom/whoop/domain/model/teams/TeamUser;", "Lrq0/a1$d;", "Lrq0/z0;", "fragment", "Lrq0/a1$b;", "viewModel", "", "isInternationalizedTeamViews", "<init>", "(Lrq0/z0;Lrq0/a1$b;Z)V", "f", "()Z", "e", "", "g", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "i", "(Landroid/view/ViewGroup;I)Lrq0/a1$d;", "holder", "position", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lrq0/a1$d;I)V", "getItemCount", "c", "Lrq0/z0;", "d", "Lrq0/a1$b;", "Z", "b", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31650a1 extends AbstractC18319p {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31708z0 fragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final b viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isInternationalizedTeamViews;

    /* JADX INFO: renamed from: rq0.a1$a */
    @Metadata(m65680d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m65681d2 = {"rq0/a1$a", "Landroidx/recyclerview/widget/u;", "Lcom/whoop/domain/model/teams/TeamUser;", "oldItem", "newItem", "", "b", "(Lcom/whoop/domain/model/teams/TeamUser;Lcom/whoop/domain/model/teams/TeamUser;)Z", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC1738u {
        @Override // androidx.recyclerview.widget.AbstractC1738u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(TeamUser oldItem, TeamUser newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(TeamUser oldItem, TeamUser newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    /* JADX INFO: renamed from: rq0.a1$b */
    /* JADX INFO: loaded from: classes.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lrq0/a1$b;", "", "Lrq0/a1$c;", "state", "()Lrq0/a1$c;", "", "b", "()Z", "Lcom/whoop/ui/ScoreContext;", "scoreContext", "a", "(Lcom/whoop/ui/ScoreContext;)Z", "", "c", "(Lcom/whoop/ui/ScoreContext;)I", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo97828a(ScoreContext scoreContext);

        /* JADX INFO: renamed from: b */
        boolean mo97829b();

        /* JADX INFO: renamed from: c */
        int mo97830c(ScoreContext scoreContext);

        c state();
    }

    /* JADX INFO: renamed from: rq0.a1$c */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lrq0/a1$c;", "", "Lcom/whoop/domain/model/teams/Team;", "b", "()Lcom/whoop/domain/model/teams/Team;", "team", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface c {
        /* JADX INFO: renamed from: b */
        Team getTeam();
    }

    /* JADX INFO: renamed from: rq0.a1$d */
    @Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b3\b\u0086\u0004\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010!\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001f\u0010'\u001a\n \u0019*\u0004\u0018\u00010\"0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010,\u001a\n \u0019*\u0004\u0018\u00010(0(8\u0006¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010/\u001a\n \u0019*\u0004\u0018\u00010(0(8\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u001f\u00102\u001a\n \u0019*\u0004\u0018\u00010(0(8\u0006¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001f\u00105\u001a\n \u0019*\u0004\u0018\u00010(0(8\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u001f\u00108\u001a\n \u0019*\u0004\u0018\u00010(0(8\u0006¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010+R\u001f\u0010;\u001a\n \u0019*\u0004\u0018\u00010(0(8\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010+R\u001f\u0010A\u001a\n \u0019*\u0004\u0018\u00010<0<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010D\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\bB\u0010\u001b\u001a\u0004\bC\u0010\u001dR\u001f\u0010G\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\bE\u0010\u001b\u001a\u0004\bF\u0010\u001dR\u001f\u0010J\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\bH\u0010\u001b\u001a\u0004\bI\u0010\u001dR\u001f\u0010M\u001a\n \u0019*\u0004\u0018\u00010(0(8\u0006¢\u0006\f\n\u0004\bK\u0010)\u001a\u0004\bL\u0010+R\u001f\u0010P\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\bN\u0010\u001b\u001a\u0004\bO\u0010\u001dR\u001f\u0010S\u001a\n \u0019*\u0004\u0018\u00010\"0\"8\u0006¢\u0006\f\n\u0004\bQ\u0010$\u001a\u0004\bR\u0010&R\u001f\u0010V\u001a\n \u0019*\u0004\u0018\u00010(0(8\u0006¢\u0006\f\n\u0004\bT\u0010)\u001a\u0004\bU\u0010+R\u001f\u0010Y\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\bW\u0010\u001b\u001a\u0004\bX\u0010\u001dR\u001f\u0010\\\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\bZ\u0010\u001b\u001a\u0004\b[\u0010\u001dR\u001f\u0010_\u001a\n \u0019*\u0004\u0018\u00010(0(8\u0006¢\u0006\f\n\u0004\b]\u0010)\u001a\u0004\b^\u0010+R\u001f\u0010b\u001a\n \u0019*\u0004\u0018\u00010(0(8\u0006¢\u0006\f\n\u0004\b`\u0010)\u001a\u0004\ba\u0010+R\u001f\u0010e\u001a\n \u0019*\u0004\u0018\u00010<0<8\u0006¢\u0006\f\n\u0004\bc\u0010>\u001a\u0004\bd\u0010@R\u001f\u0010h\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\bf\u0010\u001b\u001a\u0004\bg\u0010\u001dR\u001f\u0010k\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\bi\u0010\u001b\u001a\u0004\bj\u0010\u001dR\u001f\u0010n\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0006¢\u0006\f\n\u0004\bl\u0010\u001b\u001a\u0004\bm\u0010\u001d¨\u0006o"}, m65681d2 = {"Lrq0/a1$d;", "Landroidx/recyclerview/widget/o2;", "Lrq0/z0;", "fragment", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "<init>", "(Lrq0/a1;Lrq0/z0;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "", "type", "Lrq0/a1$b;", "viewModel", "Lcom/whoop/domain/model/teams/TeamUser;", "member", "", "isAdmin", "isInvite", "Ll83/a0;", "e", "(ILrq0/a1$b;Lcom/whoop/domain/model/teams/TeamUser;ZZ)V", "a", "Lrq0/z0;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "getLabelTextV1", "()Landroid/widget/TextView;", "labelTextV1", "c", "getItemAboutV1", "itemAboutV1", "Lcom/whoop/ui/pills/StrokedPillButton;", "d", "Lcom/whoop/ui/pills/StrokedPillButton;", "getItemAboutAddButtonV1", "()Lcom/whoop/ui/pills/StrokedPillButton;", "itemAboutAddButtonV1", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "getItemSharingV1", "()Landroid/widget/LinearLayout;", "itemSharingV1", "f", "getItemSharingStrainV1", "itemSharingStrainV1", "g", "getItemSharingRecoveryV1", "itemSharingRecoveryV1", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getItemSharingSleepV1", "itemSharingSleepV1", "i", "getItemAddMembersV1", "itemAddMembersV1", "j", "getItemMemberV1", "itemMemberV1", "Lde/hdodenhof/circleimageview/CircleImageView;", "k", "Lde/hdodenhof/circleimageview/CircleImageView;", "getItemMemberImageV1", "()Lde/hdodenhof/circleimageview/CircleImageView;", "itemMemberImageV1", "l", "getItemMemberNameV1", "itemMemberNameV1", "m", "getItemMemberTextV1", "itemMemberTextV1", "n", "getItemMemberAdminV1", "itemMemberAdminV1", "o", "getItemLayoutAbout", "itemLayoutAbout", "p", "getItemAboutText", "itemAboutText", "q", "getItemAboutAddButton", "itemAboutAddButton", "r", "getItemLayoutSharing", "itemLayoutSharing", "s", "getItemSharingText", "itemSharingText", "t", "getItemMembersText", "itemMembersText", "u", "getItemAddMembersButton", "itemAddMembersButton", "v", "getItemMember", "itemMember", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "getItemMemberImage", "itemMemberImage", "x", "getItemMemberName", "itemMemberName", "y", "getItemMemberText", "itemMemberText", "z", "getItemMemberAdmin", "itemMemberAdmin", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class d extends AbstractC1717o2 {

        /* JADX INFO: renamed from: A */
        final /* synthetic */ C31650a1 f130816A;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C31708z0 fragment;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextView labelTextV1;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextView itemAboutV1;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final StrokedPillButton itemAboutAddButtonV1;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final LinearLayout itemSharingV1;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final LinearLayout itemSharingStrainV1;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final LinearLayout itemSharingRecoveryV1;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final LinearLayout itemSharingSleepV1;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final LinearLayout itemAddMembersV1;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final LinearLayout itemMemberV1;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final CircleImageView itemMemberImageV1;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final TextView itemMemberNameV1;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final TextView itemMemberTextV1;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final TextView itemMemberAdminV1;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final LinearLayout itemLayoutAbout;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final TextView itemAboutText;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final StrokedPillButton itemAboutAddButton;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final LinearLayout itemLayoutSharing;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final TextView itemSharingText;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final TextView itemMembersText;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final LinearLayout itemAddMembersButton;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final LinearLayout itemMember;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final CircleImageView itemMemberImage;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        private final TextView itemMemberName;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        private final TextView itemMemberText;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        private final TextView itemMemberAdmin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C31650a1 c31650a1, C31708z0 c31708z0, LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(c31650a1.isInternationalizedTeamViews ? AbstractC38501b0.f165528l0 : AbstractC38501b0.f165530m0, parent, false));
            AbstractC22676k.m65750j(inflater, "inflater");
            AbstractC22676k.m65750j(parent, "parent");
            this.f130816A = c31650a1;
            this.fragment = c31708z0;
            this.labelTextV1 = (TextView) this.itemView.findViewById(AbstractC38499a0.f165333k4);
            this.itemAboutV1 = (TextView) this.itemView.findViewById(AbstractC38499a0.f165431v3);
            this.itemAboutAddButtonV1 = (StrokedPillButton) this.itemView.findViewById(AbstractC38499a0.f165440w3);
            this.itemSharingV1 = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165116L3);
            this.itemSharingStrainV1 = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165143O3);
            this.itemSharingRecoveryV1 = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165125M3);
            this.itemSharingSleepV1 = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165134N3);
            this.itemAddMembersV1 = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165458y3);
            this.itemMemberV1 = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165053E3);
            this.itemMemberImageV1 = (CircleImageView) this.itemView.findViewById(AbstractC38499a0.f165071G3);
            this.itemMemberNameV1 = (TextView) this.itemView.findViewById(AbstractC38499a0.f165080H3);
            this.itemMemberTextV1 = (TextView) this.itemView.findViewById(AbstractC38499a0.f165089I3);
            this.itemMemberAdminV1 = (TextView) this.itemView.findViewById(AbstractC38499a0.f165062F3);
            this.itemLayoutAbout = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165035C3);
            this.itemAboutText = (TextView) this.itemView.findViewById(AbstractC38499a0.f165449x3);
            this.itemAboutAddButton = (StrokedPillButton) this.itemView.findViewById(AbstractC38499a0.f165440w3);
            this.itemLayoutSharing = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165044D3);
            this.itemSharingText = (TextView) this.itemView.findViewById(AbstractC38499a0.f165152P3);
            this.itemMembersText = (TextView) this.itemView.findViewById(AbstractC38499a0.f165098J3);
            this.itemAddMembersButton = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165467z3);
            this.itemMember = (LinearLayout) this.itemView.findViewById(AbstractC38499a0.f165053E3);
            this.itemMemberImage = (CircleImageView) this.itemView.findViewById(AbstractC38499a0.f165071G3);
            this.itemMemberName = (TextView) this.itemView.findViewById(AbstractC38499a0.f165080H3);
            this.itemMemberText = (TextView) this.itemView.findViewById(AbstractC38499a0.f165089I3);
            this.itemMemberAdmin = (TextView) this.itemView.findViewById(AbstractC38499a0.f165062F3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final void m97836f(c cVar, d dVar, View view) {
            C31708z0 c31708z0;
            Team teamMo97831b = ((C31674i1) cVar).getTeam();
            if (teamMo97831b == null || (c31708z0 = dVar.fragment) == null) {
                return;
            }
            c31708z0.m98359O(teamMo97831b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final void m97837g(c cVar, d dVar, View view) {
            C31708z0 c31708z0;
            Team teamMo97831b = ((C31674i1) cVar).getTeam();
            if (teamMo97831b == null || (c31708z0 = dVar.fragment) == null) {
                return;
            }
            c31708z0.m98359O(teamMo97831b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final void m97838h(c cVar, d dVar, View view) {
            C31708z0 c31708z0;
            Team teamMo97831b = cVar.getTeam();
            if (teamMo97831b == null || (c31708z0 = dVar.fragment) == null) {
                return;
            }
            c31708z0.m98358N(teamMo97831b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final void m97839i(c cVar, d dVar, View view) {
            C31708z0 c31708z0;
            Team teamMo97831b = cVar.getTeam();
            if (teamMo97831b == null || (c31708z0 = dVar.fragment) == null) {
                return;
            }
            c31708z0.m98358N(teamMo97831b);
        }

        /* JADX INFO: renamed from: e */
        public final void m97840e(int type, b viewModel, TeamUser member, boolean isAdmin, boolean isInvite) {
            String description;
            String description2;
            String string;
            AbstractC22676k.m65750j(viewModel, "viewModel");
            Resources resources = this.itemView.getContext().getResources();
            if (this.f130816A.isInternationalizedTeamViews) {
                this.itemLayoutAbout.setVisibility(8);
                this.itemAboutAddButton.setVisibility(8);
                this.itemLayoutSharing.setVisibility(8);
                this.itemMembersText.setVisibility(8);
                this.itemAddMembersButton.setVisibility(8);
                this.itemMember.setVisibility(8);
            } else {
                this.itemAboutV1.setVisibility(8);
                this.itemAboutAddButtonV1.setVisibility(8);
                this.itemSharingV1.setVisibility(8);
                this.itemMemberV1.setVisibility(8);
                this.itemAddMembersV1.setVisibility(8);
            }
            final c cVarState = viewModel.state();
            if (type == 0) {
                if (this.f130816A.isInternationalizedTeamViews) {
                    this.itemLayoutAbout.setVisibility(0);
                    Team teamMo97831b = cVarState.getTeam();
                    if (((teamMo97831b == null || (description2 = teamMo97831b.getDescription()) == null) ? 0 : description2.length()) > 0) {
                        this.itemAboutText.setVisibility(0);
                        this.itemAboutAddButton.setVisibility(8);
                        TextView textView = this.itemAboutText;
                        Team teamMo97831b2 = cVarState.getTeam();
                        textView.setText(teamMo97831b2 != null ? teamMo97831b2.getDescription() : null);
                        return;
                    }
                    if ((cVarState instanceof C31674i1) && viewModel.mo97829b()) {
                        this.itemAboutText.setVisibility(8);
                        this.itemAboutAddButton.setVisibility(0);
                        final int i13 = 0;
                        this.itemAboutAddButton.setOnClickListener(new View.OnClickListener() { // from class: rq0.b1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i13) {
                                    case 0:
                                        C31650a1.d.m97836f(cVarState, this, view);
                                        break;
                                    case 1:
                                        C31650a1.d.m97837g(cVarState, this, view);
                                        break;
                                    case 2:
                                        C31650a1.d.m97838h(cVarState, this, view);
                                        break;
                                    default:
                                        C31650a1.d.m97839i(cVarState, this, view);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                this.labelTextV1.setText(resources.getString(AbstractC38505d0.f165693n));
                ViewGroup.LayoutParams layoutParams = this.labelTextV1.getLayoutParams();
                AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                Team teamMo97831b3 = cVarState.getTeam();
                if (((teamMo97831b3 == null || (description = teamMo97831b3.getDescription()) == null) ? 0 : description.length()) > 0) {
                    this.itemAboutV1.setVisibility(0);
                    this.itemAboutAddButton.setVisibility(8);
                    TextView textView2 = this.itemAboutV1;
                    Team teamMo97831b4 = cVarState.getTeam();
                    textView2.setText(teamMo97831b4 != null ? teamMo97831b4.getDescription() : null);
                    layoutParams2.gravity = 8388659;
                } else if ((cVarState instanceof C31674i1) && viewModel.mo97829b()) {
                    this.itemAboutV1.setVisibility(8);
                    this.itemAboutAddButtonV1.setVisibility(0);
                    final int i14 = 1;
                    this.itemAboutAddButtonV1.setOnClickListener(new View.OnClickListener() { // from class: rq0.b1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    C31650a1.d.m97836f(cVarState, this, view);
                                    break;
                                case 1:
                                    C31650a1.d.m97837g(cVarState, this, view);
                                    break;
                                case 2:
                                    C31650a1.d.m97838h(cVarState, this, view);
                                    break;
                                default:
                                    C31650a1.d.m97839i(cVarState, this, view);
                                    break;
                            }
                        }
                    });
                    layoutParams2.gravity = 8388627;
                }
                this.labelTextV1.setLayoutParams(layoutParams2);
                return;
            }
            if (type == 1) {
                if (!this.f130816A.isInternationalizedTeamViews) {
                    this.labelTextV1.setText(resources.getString(AbstractC38505d0.f165572D));
                    this.itemSharingV1.setVisibility(0);
                    this.itemSharingStrainV1.setVisibility(viewModel.mo97828a(ScoreContext.STRAIN) ? 0 : 8);
                    this.itemSharingRecoveryV1.setVisibility(viewModel.mo97828a(ScoreContext.RECOVERY) ? 0 : 8);
                    this.itemSharingSleepV1.setVisibility(viewModel.mo97828a(ScoreContext.SLEEP) ? 0 : 8);
                    return;
                }
                this.itemLayoutSharing.setVisibility(0);
                ArrayList arrayList = new ArrayList();
                if (viewModel.mo97828a(ScoreContext.STRAIN)) {
                    arrayList.add(Integer.valueOf(AbstractC38505d0.f165732y0));
                }
                if (viewModel.mo97828a(ScoreContext.RECOVERY)) {
                    arrayList.add(Integer.valueOf(AbstractC38505d0.f165702p0));
                }
                if (viewModel.mo97828a(ScoreContext.SLEEP)) {
                    arrayList.add(Integer.valueOf(AbstractC38505d0.f165723v0));
                }
                TextView textView3 = this.itemSharingText;
                int size = arrayList.size();
                if (size == 0) {
                    string = resources.getString(AbstractC38505d0.f165617S);
                } else if (size != 1) {
                    string = size != 2 ? resources.getString(AbstractC38505d0.f165730x1, resources.getString(((Number) arrayList.get(0)).intValue()), resources.getString(((Number) arrayList.get(1)).intValue()), resources.getString(((Number) arrayList.get(2)).intValue())) : resources.getString(AbstractC38505d0.f165724v1, resources.getString(((Number) arrayList.get(0)).intValue()), resources.getString(((Number) arrayList.get(1)).intValue()));
                } else {
                    string = resources.getString(((Number) arrayList.get(0)).intValue());
                }
                textView3.setText(string);
                return;
            }
            if (type != 3) {
                if (this.f130816A.isInternationalizedTeamViews) {
                    if (member != null) {
                        this.itemMember.setVisibility(0);
                        this.itemMemberName.setText(member.getFullName());
                        this.itemMemberText.setText("@" + member.getUserName());
                        this.itemMemberAdmin.setVisibility(isAdmin ? 0 : 8);
                        ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(member.getAvatarUrl()).m89319j(AbstractC36512c.f156071n)).m15537y(this.itemMemberImage);
                        return;
                    }
                    return;
                }
                if (member != null) {
                    this.labelTextV1.setText("");
                    this.itemMemberV1.setVisibility(0);
                    this.itemMemberNameV1.setText(member.getFullName());
                    this.itemMemberTextV1.setText("@" + member.getUserName());
                    this.itemMemberAdminV1.setVisibility(isAdmin ? 0 : 8);
                    ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(member.getAvatarUrl()).m89319j(AbstractC36512c.f156071n)).m15537y(this.itemMemberImageV1);
                    return;
                }
                return;
            }
            if (this.f130816A.isInternationalizedTeamViews) {
                this.itemMembersText.setVisibility(0);
                TextView textView4 = this.itemMembersText;
                String string2 = resources.getString(AbstractC38505d0.f165727w1);
                AbstractC22676k.m65749i(string2, "getString(...)");
                textView4.setText(String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(viewModel.mo97830c(ScoreContext.OVERVIEW))}, 1)));
                if (member == null && !isInvite) {
                    LinearLayout linearLayout = this.itemAddMembersButton;
                    Team teamMo97831b5 = cVarState.getTeam();
                    linearLayout.setVisibility((teamMo97831b5 != null ? teamMo97831b5.getTeamType() : null) == TeamType.COMMUNITY ? 0 : 8);
                    final int i15 = 2;
                    this.itemAddMembersButton.setOnClickListener(new View.OnClickListener() { // from class: rq0.b1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    C31650a1.d.m97836f(cVarState, this, view);
                                    break;
                                case 1:
                                    C31650a1.d.m97837g(cVarState, this, view);
                                    break;
                                case 2:
                                    C31650a1.d.m97838h(cVarState, this, view);
                                    break;
                                default:
                                    C31650a1.d.m97839i(cVarState, this, view);
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (member != null) {
                    this.itemMember.setVisibility(0);
                    this.itemMemberName.setText(member.getFullName());
                    this.itemMemberText.setText("@" + member.getUserName());
                    this.itemMemberAdmin.setVisibility(isAdmin ? 0 : 8);
                    ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(member.getAvatarUrl()).m89319j(AbstractC36512c.f156071n)).m15537y(this.itemMemberImage);
                    return;
                }
                return;
            }
            TextView textView5 = this.labelTextV1;
            String string3 = resources.getString(AbstractC38505d0.f165727w1);
            AbstractC22676k.m65749i(string3, "getString(...)");
            textView5.setText(String.format(string3, Arrays.copyOf(new Object[]{String.valueOf(viewModel.mo97830c(ScoreContext.OVERVIEW))}, 1)));
            if (member == null && !isInvite) {
                LinearLayout linearLayout2 = this.itemAddMembersV1;
                Team teamMo97831b6 = cVarState.getTeam();
                linearLayout2.setVisibility((teamMo97831b6 != null ? teamMo97831b6.getTeamType() : null) == TeamType.COMMUNITY ? 0 : 8);
                final int i16 = 3;
                this.itemAddMembersV1.setOnClickListener(new View.OnClickListener() { // from class: rq0.b1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                C31650a1.d.m97836f(cVarState, this, view);
                                break;
                            case 1:
                                C31650a1.d.m97837g(cVarState, this, view);
                                break;
                            case 2:
                                C31650a1.d.m97838h(cVarState, this, view);
                                break;
                            default:
                                C31650a1.d.m97839i(cVarState, this, view);
                                break;
                        }
                    }
                });
                return;
            }
            this.itemAddMembersV1.setVisibility(8);
            if (member != null) {
                this.itemMemberV1.setVisibility(0);
                this.itemMemberNameV1.setText(member.getFullName());
                this.itemMemberTextV1.setText("@" + member.getUserName());
                this.itemMemberAdminV1.setVisibility(isAdmin ? 0 : 8);
                ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(member.getAvatarUrl()).m89319j(AbstractC36512c.f156071n)).m15537y(this.itemMemberImageV1);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31650a1(C31708z0 c31708z0, b viewModel, boolean z4) {
        super(new a());
        AbstractC22676k.m65750j(viewModel, "viewModel");
        this.fragment = c31708z0;
        this.viewModel = viewModel;
        this.isInternationalizedTeamViews = z4;
    }

    /* JADX INFO: renamed from: e */
    private final boolean m97821e() {
        if (m97822f()) {
            return true;
        }
        Team teamMo97831b = this.viewModel.state().getTeam();
        return (teamMo97831b != null ? teamMo97831b.getTeamType() : null) == TeamType.ELITE;
    }

    /* JADX INFO: renamed from: f */
    private final boolean m97822f() {
        return this.viewModel instanceof C31662e1;
    }

    /* JADX INFO: renamed from: g */
    private final int m97823g() {
        return m97821e() ? 2 : 3;
    }

    @Override // p217ib.AbstractC18319p, androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getDisplayCount() {
        int itemCount = super.getDisplayCount();
        if (itemCount == 0) {
            return 0;
        }
        return itemCount + m97823g();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(d holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        if (position == 0) {
            holder.m97840e(0, this.viewModel, null, false, m97822f());
            return;
        }
        if (position == 1) {
            holder.m97840e(1, this.viewModel, null, false, m97822f());
            return;
        }
        if (position == 2) {
            holder.m97840e(3, this.viewModel, m97821e() ? (TeamUser) getItem(position - m97823g()) : null, m97821e(), m97822f());
        } else if (position != 3) {
            holder.m97840e(2, this.viewModel, (TeamUser) getItem(position - m97823g()), false, m97822f());
        } else {
            holder.m97840e(2, this.viewModel, (TeamUser) getItem(position - m97823g()), !m97821e(), m97822f());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        C31708z0 c31708z0 = this.fragment;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        AbstractC22676k.m65749i(layoutInflaterFrom, "from(...)");
        return new d(this, c31708z0, layoutInflaterFrom, parent);
    }
}
