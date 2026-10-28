package rq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.community.presentation.teams.TeamRemoveMembersActivity;
import com.whoop.domain.model.teams.TeamUser;
import com.whoop.service.network.model.UserState;
import p217ib.AbstractC18319p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import vu1.AbstractC36512c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: rq0.g0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\t\u0010\u001f¨\u0006!"}, m65681d2 = {"Lrq0/g0;", "Lib/p;", "Lcom/whoop/domain/model/teams/TeamUser;", "Lrq0/g0$b;", "Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;", "activity", "Lrq0/i0;", "viewModel", "", "isTransfer", "<init>", "(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lrq0/i0;Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "(Landroid/view/ViewGroup;I)Lrq0/g0$b;", "holder", "position", "Ll83/a0;", "d", "(Lrq0/g0$b;I)V", "c", "Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;", "getActivity", "()Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;", "Lrq0/i0;", "getViewModel", "()Lrq0/i0;", "Z", "()Z", "b", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31667g0 extends AbstractC18319p {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TeamRemoveMembersActivity activity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C31673i0 viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isTransfer;

    /* JADX INFO: renamed from: rq0.g0$a */
    @Metadata(m65680d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m65681d2 = {"rq0/g0$a", "Landroidx/recyclerview/widget/u;", "Lcom/whoop/domain/model/teams/TeamUser;", "oldItem", "newItem", "", "b", "(Lcom/whoop/domain/model/teams/TeamUser;Lcom/whoop/domain/model/teams/TeamUser;)Z", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
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

    /* JADX INFO: renamed from: rq0.g0$b */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lrq0/g0$b;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/whoop/domain/model/teams/TeamUser;", UserState.Sources.USER, "", "isTransfer", "Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;", "activity", "", "position", "Ll83/a0;", "c", "(Lcom/whoop/domain/model/teams/TeamUser;ZLcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;I)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC1717o2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View itemView) {
            super(itemView);
            AbstractC22676k.m65750j(itemView, "itemView");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final void m97988d(TeamRemoveMembersActivity teamRemoveMembersActivity, TeamUser teamUser, View view) {
            teamRemoveMembersActivity.m19472a0(teamUser);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final void m97989e(TeamRemoveMembersActivity teamRemoveMembersActivity, TeamUser teamUser, View view) {
            teamRemoveMembersActivity.m19473d0(teamUser);
        }

        /* JADX INFO: renamed from: c */
        public final void m97990c(final TeamUser user, boolean isTransfer, final TeamRemoveMembersActivity activity, int position) {
            AbstractC22676k.m65750j(activity, "activity");
            if (user != null) {
                ((TextView) this.itemView.findViewById(AbstractC38499a0.f165107K3)).setText(user.getFullName());
                ((TextView) this.itemView.findViewById(AbstractC38499a0.f165017A3)).setText("@" + user.getUserName());
                ImageView imageView = (ImageView) this.itemView.findViewById(AbstractC38499a0.f165212W5);
                ImageView imageView2 = (ImageView) this.itemView.findViewById(AbstractC38499a0.f165426u7);
                AbstractC32417h.m101189T(imageView, !isTransfer);
                AbstractC32417h.m101189T(imageView2, isTransfer);
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: rq0.h0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                C31667g0.b.m97988d(activity, user, view);
                                break;
                            default:
                                C31667g0.b.m97989e(activity, user, view);
                                break;
                        }
                    }
                });
                final int i14 = 1;
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: rq0.h0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                C31667g0.b.m97988d(activity, user, view);
                                break;
                            default:
                                C31667g0.b.m97989e(activity, user, view);
                                break;
                        }
                    }
                });
                View viewFindViewById = this.itemView.findViewById(AbstractC38499a0.f165026B3);
                AbstractC22676k.m65748h(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView3 = (ImageView) viewFindViewById;
                imageView3.setImageDrawable(activity.getDrawable(AbstractC36512c.f156071n));
                String avatarUrl = user.getAvatarUrl();
                if (avatarUrl != null) {
                    ((C4964f) ComponentCallbacks2C4960b.m15528d(activity).m75569h(activity).m15549m(avatarUrl).m89319j(AbstractC36512c.f156071n)).m15537y(imageView3);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31667g0(TeamRemoveMembersActivity activity, C31673i0 viewModel, boolean z4) {
        super(new a());
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        this.activity = activity;
        this.viewModel = viewModel;
        this.isTransfer = z4;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m97990c((TeamUser) getItem(position), this.isTransfer, this.activity, position);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        View viewInflate = LayoutInflater.from(this.activity).inflate(AbstractC38501b0.f165508b0, parent, false);
        AbstractC22676k.m65747g(viewInflate);
        return new b(viewInflate);
    }
}
