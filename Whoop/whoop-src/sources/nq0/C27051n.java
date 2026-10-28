package nq0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1717o2;
import as2.AbstractC1953c;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import com.whoop.domain.model.teams.CommunityDto;
import com.whoop.domain.model.teams.CommunityMemberDto;
import com.whoop.domain.model.teams.TeamInviteDto;
import de.hdodenhof.circleimageview.CircleImageView;
import l83.C23454a0;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import vu1.AbstractC36512c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: nq0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lnq0/n;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "", "isFloating", "<init>", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)V", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "teamInviteDto", "Lkotlin/Function1;", "Ll83/a0;", "onClick", "b", "(Lcom/whoop/domain/model/teams/TeamInviteDto;Lkotlin/jvm/functions/Function1;)V", "Lde/hdodenhof/circleimageview/CircleImageView;", "a", "Lde/hdodenhof/circleimageview/CircleImageView;", "teamIcon", "sendUserIcon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "inviteMessage", "d", "teamName", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parentLayout", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "seenBadge", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27051n extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CircleImageView teamIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CircleImageView sendUserIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextView inviteMessage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextView teamName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ConstraintLayout parentLayout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ImageView seenBadge;

    public /* synthetic */ C27051n(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutInflater, viewGroup, (i13 & 4) != 0 ? false : z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m81269c(Function1 function1, TeamInviteDto teamInviteDto, View it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(teamInviteDto);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final void m81270b(TeamInviteDto teamInviteDto, Function1 onClick) {
        AbstractC22676k.m65750j(teamInviteDto, "teamInviteDto");
        AbstractC22676k.m65750j(onClick, "onClick");
        ComponentCallbacks2C4966h componentCallbacks2C4966hM15529e = ComponentCallbacks2C4960b.m15529e(this.itemView.getContext());
        CommunityDto community = teamInviteDto.getCommunity();
        C4964f c4964fM15549m = componentCallbacks2C4966hM15529e.m15549m(community != null ? community.getAvatar() : null);
        C40786k c40786k = C40786k.f175891b;
        ((C4964f) ((C4964f) c4964fM15549m.m89314d(c40786k)).m89319j(AbstractC36512c.f156071n)).m15537y(this.teamIcon);
        ComponentCallbacks2C4966h componentCallbacks2C4966hM15529e2 = ComponentCallbacks2C4960b.m15529e(this.itemView.getContext());
        CommunityMemberDto sender = teamInviteDto.getSender();
        ((C4964f) ((C4964f) componentCallbacks2C4966hM15529e2.m15549m(sender != null ? sender.getAvatarUrl() : null).m89314d(c40786k)).m89319j(AbstractC36512c.f156071n)).m15537y(this.sendUserIcon);
        TextView textView = this.teamName;
        CommunityDto community2 = teamInviteDto.getCommunity();
        textView.setText(community2 != null ? community2.getName() : null);
        TextView textView2 = this.inviteMessage;
        Context context = textView2.getContext();
        int i13 = AbstractC38505d0.f165654d0;
        CommunityMemberDto sender2 = teamInviteDto.getSender();
        textView2.setText(context.getString(i13, sender2 != null ? sender2.getName() : null));
        if (teamInviteDto.getShowBadge()) {
            this.seenBadge.setVisibility(0);
        } else {
            this.seenBadge.setVisibility(8);
        }
        AbstractC1953c.m5963a(this.parentLayout, new C27050m(0, onClick, teamInviteDto));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27051n(LayoutInflater inflater, ViewGroup parent, boolean z4) {
        super(inflater.inflate(AbstractC38501b0.f165545u, parent, z4));
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC22676k.m65750j(parent, "parent");
        View viewFindViewById = this.itemView.findViewById(AbstractC38499a0.f165357n1);
        AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
        this.teamIcon = (CircleImageView) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(AbstractC38499a0.f165375p1);
        AbstractC22676k.m65749i(viewFindViewById2, "findViewById(...)");
        this.sendUserIcon = (CircleImageView) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(AbstractC38499a0.f165330k1);
        AbstractC22676k.m65749i(viewFindViewById3, "findViewById(...)");
        this.inviteMessage = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(AbstractC38499a0.f165366o1);
        AbstractC22676k.m65749i(viewFindViewById4, "findViewById(...)");
        this.teamName = (TextView) viewFindViewById4;
        View viewFindViewById5 = this.itemView.findViewById(AbstractC38499a0.f165167R0);
        AbstractC22676k.m65749i(viewFindViewById5, "findViewById(...)");
        this.parentLayout = (ConstraintLayout) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(AbstractC38499a0.f165348m1);
        AbstractC22676k.m65749i(viewFindViewById6, "findViewById(...)");
        this.seenBadge = (ImageView) viewFindViewById6;
    }
}
