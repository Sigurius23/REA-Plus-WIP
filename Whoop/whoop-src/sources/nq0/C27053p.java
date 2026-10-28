package nq0;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.domain.model.teams.TeamUser;
import com.whoop.service.network.model.UserState;
import p000.AbstractC11266d;
import p217ib.AbstractC18319p;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rq0.C31673i0;
import se.AbstractC32417h;
import vu1.AbstractC36512c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: nq0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006&"}, m65681d2 = {"Lnq0/p;", "Lib/p;", "Lcom/whoop/domain/model/teams/TeamUser;", "Lnq0/p$b;", "Landroid/app/Activity;", "activity", "Lrq0/i0;", "viewModel", "", "isTransfer", "Lkotlin/Function1;", "Ll83/a0;", "onRemove", "onTransfer", "<init>", "(Landroid/app/Activity;Lrq0/i0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "(Landroid/view/ViewGroup;I)Lnq0/p$b;", "holder", "position", "d", "(Lnq0/p$b;I)V", "c", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Lrq0/i0;", "getViewModel", "()Lrq0/i0;", "Z", "f", "Lkotlin/jvm/functions/Function1;", "g", "b", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27053p extends AbstractC18319p {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C31673i0 viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isTransfer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1 onRemove;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function1 onTransfer;

    /* JADX INFO: renamed from: nq0.p$a */
    @Metadata(m65680d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m65681d2 = {"nq0/p$a", "Landroidx/recyclerview/widget/u;", "Lcom/whoop/domain/model/teams/TeamUser;", "oldItem", "newItem", "", "b", "(Lcom/whoop/domain/model/teams/TeamUser;Lcom/whoop/domain/model/teams/TeamUser;)Z", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
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

    /* JADX INFO: renamed from: nq0.p$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JO\u0010\u0010\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lnq0/p$b;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/whoop/domain/model/teams/TeamUser;", UserState.Sources.USER, "", "isTransfer", "Landroid/app/Activity;", "activity", "Lkotlin/Function1;", "Ll83/a0;", "onRemove", "onTransfer", "c", "(Lcom/whoop/domain/model/teams/TeamUser;ZLandroid/app/Activity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC1717o2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View itemView) {
            super(itemView);
            AbstractC22676k.m65750j(itemView, "itemView");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final void m81277d(Function1 function1, TeamUser teamUser, View view) {
            function1.invoke(teamUser);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final void m81278e(Function1 function1, TeamUser teamUser, View view) {
            function1.invoke(teamUser);
        }

        /* JADX INFO: renamed from: c */
        public final void m81279c(final TeamUser user, boolean isTransfer, Activity activity, final Function1 onRemove, final Function1 onTransfer) {
            AbstractC22676k.m65750j(activity, "activity");
            AbstractC22676k.m65750j(onRemove, "onRemove");
            AbstractC22676k.m65750j(onTransfer, "onTransfer");
            if (user != null) {
                ((TextView) this.itemView.findViewById(AbstractC38499a0.f165107K3)).setText(user.getFullName());
                ((TextView) this.itemView.findViewById(AbstractC38499a0.f165017A3)).setText(AbstractC11266d.m30461o("@", user.getUserName()));
                ImageView imageView = (ImageView) this.itemView.findViewById(AbstractC38499a0.f165212W5);
                ImageView imageView2 = (ImageView) this.itemView.findViewById(AbstractC38499a0.f165426u7);
                AbstractC32417h.m101189T(imageView, !isTransfer);
                AbstractC32417h.m101189T(imageView2, isTransfer);
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: nq0.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                C27053p.b.m81277d(onRemove, user, view);
                                break;
                            default:
                                C27053p.b.m81278e(onRemove, user, view);
                                break;
                        }
                    }
                });
                final int i14 = 1;
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: nq0.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                C27053p.b.m81277d(onTransfer, user, view);
                                break;
                            default:
                                C27053p.b.m81278e(onTransfer, user, view);
                                break;
                        }
                    }
                });
                View viewFindViewById = this.itemView.findViewById(AbstractC38499a0.f165026B3);
                AbstractC22676k.m65748h(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView3 = (ImageView) viewFindViewById;
                imageView3.setImageDrawable(AbstractC32122c.getDrawable(this.itemView.getContext(), AbstractC36512c.f156071n));
                String avatarUrl = user.getAvatarUrl();
                if (avatarUrl != null) {
                    ((C4964f) ComponentCallbacks2C4960b.m15528d(activity).m75566e(activity).m15549m(avatarUrl).m89319j(AbstractC36512c.f156071n)).m15537y(imageView3);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27053p(Activity activity, C31673i0 viewModel, boolean z4, Function1 onRemove, Function1 onTransfer) {
        super(new a());
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(onRemove, "onRemove");
        AbstractC22676k.m65750j(onTransfer, "onTransfer");
        this.activity = activity;
        this.viewModel = viewModel;
        this.isTransfer = z4;
        this.onRemove = onRemove;
        this.onTransfer = onTransfer;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m81279c((TeamUser) getItem(position), this.isTransfer, this.activity, this.onRemove, this.onTransfer);
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
