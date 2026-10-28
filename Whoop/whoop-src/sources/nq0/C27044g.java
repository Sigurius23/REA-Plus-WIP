package nq0;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1717o2;
import as2.AbstractC1953c;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamType;
import de.hdodenhof.circleimageview.CircleImageView;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import l83.C23454a0;
import lq0.C24656d;
import p031b9.AbstractC2875y;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu1.AbstractC36512c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;
import xp0.AbstractC38529z;

/* JADX INFO: renamed from: nq0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0007\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010&\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#¨\u0006."}, m65681d2 = {"Lnq0/g;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "", "isFloating", "<init>", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V", "", "rank", "Landroid/content/Context;", "context", "", "e", "(ILandroid/content/Context;)Ljava/lang/String;", "memberCount", "d", "(I)Ljava/lang/String;", "Lcom/whoop/domain/model/teams/Team;", "team", "Lkotlin/Function1;", "Ll83/a0;", "onClick", "b", "(Lcom/whoop/domain/model/teams/Team;Lkotlin/jvm/functions/Function1;)V", "a", "Z", "()Z", "Lde/hdodenhof/circleimageview/CircleImageView;", "Lde/hdodenhof/circleimageview/CircleImageView;", "teamIcon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "teamName", "userRank", "teamMemberCount", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentLayout", "g", "unreadCount", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27044g extends AbstractC1717o2 {

    /* JADX INFO: renamed from: i */
    public static final int f107973i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isFloating;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CircleImageView teamIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextView teamName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextView userRank;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextView teamMemberCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ConstraintLayout parentLayout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextView unreadCount;

    public /* synthetic */ C27044g(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutInflater, viewGroup, (i13 & 4) != 0 ? false : z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m81165c(Function1 function1, Team team, View it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(team);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private final String m81166d(int memberCount) {
        return Math.abs(memberCount / 1000) > 1 ? AbstractC2875y.m8299l(new DecimalFormat("###.#", new DecimalFormatSymbols(Locale.US)).format(((double) memberCount) / ((double) 1000)), "k") : String.valueOf(memberCount);
    }

    /* JADX INFO: renamed from: e */
    private final String m81167e(int rank, Context context) {
        int i13 = rank % 100;
        if (11 <= i13 && i13 < 14) {
            String string = context.getString(AbstractC38505d0.f165642a0);
            AbstractC22676k.m65747g(string);
            return string;
        }
        int i14 = rank % 10;
        if (i14 == 1) {
            String string2 = context.getString(AbstractC38505d0.f165638Z);
            AbstractC22676k.m65749i(string2, "getString(...)");
            return string2;
        }
        if (i14 == 2) {
            String string3 = context.getString(AbstractC38505d0.f165632X);
            AbstractC22676k.m65749i(string3, "getString(...)");
            return string3;
        }
        if (i14 != 3) {
            String string4 = context.getString(AbstractC38505d0.f165642a0);
            AbstractC22676k.m65749i(string4, "getString(...)");
            return string4;
        }
        String string5 = context.getString(AbstractC38505d0.f165635Y);
        AbstractC22676k.m65749i(string5, "getString(...)");
        return string5;
    }

    /* JADX INFO: renamed from: b */
    public final void m81168b(Team team, Function1 onClick) {
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(onClick, "onClick");
        ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(team.getIconUrl()).m89314d(C40786k.f175891b)).m89319j(AbstractC36512c.f156071n)).m15537y(this.teamIcon);
        this.teamName.setText(team.getName());
        this.teamMemberCount.setText(this.parentLayout.getContext().getString(AbstractC38505d0.f165718t1, m81166d(team.getMemberCount())));
        TextView textView = this.userRank;
        int rank = team.getRank();
        int rank2 = team.getRank();
        Context context = this.userRank.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        textView.setText(rank + m81167e(rank2, context));
        SpannableString spannableString = new SpannableString(this.userRank.getText());
        spannableString.setSpan(new RelativeSizeSpan(0.7f), this.userRank.getText().length() + (-2), this.userRank.getText().length(), 33);
        this.userRank.setText(spannableString);
        int i13 = 8;
        if (team.getRank() == 0) {
            this.userRank.setVisibility(8);
            this.teamMemberCount.setVisibility(8);
        }
        TextView textView2 = this.unreadCount;
        textView2.setText(String.valueOf(team.getUnreadCount()));
        textView2.setBackground(team.getUnreadCount() > 9 ? this.itemView.getResources().getDrawable(AbstractC38529z.f165812e, null) : this.itemView.getResources().getDrawable(AbstractC38529z.f165813f, null));
        if (team.getUnreadCount() > 0 && team.getChatEnabled() && team.getChatChannel() != null && team.getTeamType() == TeamType.COMMUNITY) {
            i13 = 0;
        }
        textView2.setVisibility(i13);
        AbstractC1953c.m5963a(this.parentLayout, new C24656d(29, onClick, team));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27044g(LayoutInflater inflater, ViewGroup parent, boolean z4) {
        super(inflater.inflate(AbstractC38501b0.f165543t, parent, false));
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC22676k.m65750j(parent, "parent");
        this.isFloating = z4;
        View viewFindViewById = this.itemView.findViewById(AbstractC38499a0.f165240a1);
        AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
        this.teamIcon = (CircleImageView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(AbstractC38499a0.f165258c1);
        AbstractC22676k.m65749i(viewFindViewById2, "findViewById(...)");
        this.teamName = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(AbstractC38499a0.f165276e1);
        AbstractC22676k.m65749i(viewFindViewById3, "findViewById(...)");
        this.userRank = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(AbstractC38499a0.f165231Z0);
        AbstractC22676k.m65749i(viewFindViewById4, "findViewById(...)");
        this.teamMemberCount = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(AbstractC38499a0.f165249b1);
        AbstractC22676k.m65749i(viewFindViewById5, "findViewById(...)");
        this.parentLayout = (ConstraintLayout) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(AbstractC38499a0.f165048D7);
        AbstractC22676k.m65749i(viewFindViewById6, "findViewById(...)");
        this.unreadCount = (TextView) viewFindViewById6;
    }
}
