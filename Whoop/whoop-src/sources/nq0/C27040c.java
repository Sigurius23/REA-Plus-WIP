package nq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.AbstractC1717o2;
import as2.AbstractC1953c;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.domain.model.teams.FeatureTeam;
import de.hdodenhof.circleimageview.CircleImageView;
import gl.C15946k;
import gl.C15953r;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.text.NumberFormat;
import java.util.Locale;
import l83.C23454a0;
import lq0.C24656d;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu1.AbstractC36512c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38503c0;

/* JADX INFO: renamed from: nq0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0014\u0010$\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010&\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!R\u0014\u0010(\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lnq0/c;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "", "isFloating", "<init>", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V", "", "memberCount", "", "d", "(I)Ljava/lang/String;", "Lcom/whoop/domain/model/teams/FeatureTeam;", "team", "Lkotlin/Function1;", "Ll83/a0;", "onClick", "b", "(Lcom/whoop/domain/model/teams/FeatureTeam;Lkotlin/jvm/functions/Function1;)V", "a", "Z", "()Z", "Lde/hdodenhof/circleimageview/CircleImageView;", "Lde/hdodenhof/circleimageview/CircleImageView;", "teamIcon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "teamName", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "teamBanner", "e", "teamMemberCount", "f", "featureTeamBanner", "g", "featureTeamBannerText", "Landroidx/cardview/widget/CardView;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Landroidx/cardview/widget/CardView;", "parentLayout", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27040c extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isFloating;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CircleImageView teamIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextView teamName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ImageView teamBanner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextView teamMemberCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ImageView featureTeamBanner;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextView featureTeamBannerText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final CardView parentLayout;

    public /* synthetic */ C27040c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutInflater, viewGroup, (i13 & 4) != 0 ? false : z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m81153c(Function1 function1, FeatureTeam featureTeam, View it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(featureTeam);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private final String m81154d(int memberCount) {
        String quantityString = this.parentLayout.getContext().getResources().getQuantityString(AbstractC38503c0.f165560b, memberCount, NumberFormat.getNumberInstance(Locale.US).format(Integer.valueOf(memberCount)));
        AbstractC22676k.m65749i(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    /* JADX INFO: renamed from: b */
    public final void m81155b(FeatureTeam team, Function1 onClick) {
        AbstractC22676k.m65750j(team, "team");
        AbstractC22676k.m65750j(onClick, "onClick");
        C4964f c4964f = (C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(team.getIconUrl()).m89322n(C15946k.f60354b, new C15953r(), true);
        C40786k c40786k = C40786k.f175891b;
        ((C4964f) ((C4964f) c4964f.m89314d(c40786k)).m89319j(AbstractC36512c.f156071n)).m15537y(this.teamIcon);
        ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(team.getBannerUrl()).m89314d(c40786k)).m89319j(AbstractC36512c.f156071n)).m15537y(this.teamBanner);
        this.teamName.setText(team.getName());
        this.teamMemberCount.setText(m81154d(team.getMemberCount()));
        AbstractC1953c.m5963a(this.parentLayout, new C24656d(28, onClick, team));
        this.featureTeamBanner.setVisibility(team.getShowBadge() ? 0 : 8);
        this.featureTeamBannerText.setVisibility(team.getShowBadge() ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27040c(LayoutInflater inflater, ViewGroup parent, boolean z4) {
        super(inflater.inflate(AbstractC38501b0.f165539r, parent, false));
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC22676k.m65750j(parent, "parent");
        this.isFloating = z4;
        View viewFindViewById = this.itemView.findViewById(AbstractC38499a0.f165122M0);
        AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
        this.teamIcon = (CircleImageView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(AbstractC38499a0.f165149P0);
        AbstractC22676k.m65749i(viewFindViewById2, "findViewById(...)");
        this.teamName = (TextView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(AbstractC38499a0.f165113L0);
        AbstractC22676k.m65749i(viewFindViewById3, "findViewById(...)");
        this.teamBanner = (ImageView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(AbstractC38499a0.f165140O0);
        AbstractC22676k.m65749i(viewFindViewById4, "findViewById(...)");
        this.teamMemberCount = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(AbstractC38499a0.f165439w2);
        AbstractC22676k.m65749i(viewFindViewById5, "findViewById(...)");
        this.featureTeamBanner = (ImageView) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(AbstractC38499a0.f165448x2);
        AbstractC22676k.m65749i(viewFindViewById6, "findViewById(...)");
        this.featureTeamBannerText = (TextView) viewFindViewById6;
        View viewFindViewById7 = this.itemView.findViewById(AbstractC38499a0.f165131N0);
        AbstractC22676k.m65749i(viewFindViewById7, "findViewById(...)");
        this.parentLayout = (CardView) viewFindViewById7;
    }
}
