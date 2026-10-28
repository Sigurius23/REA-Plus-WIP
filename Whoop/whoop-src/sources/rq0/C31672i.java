package rq0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import c93.InterfaceC4339a;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.community.presentation.p059ui.SimpleDial;
import com.whoop.domain.model.teams.TeamUser;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import l83.C23454a0;
import or2.C28212w1;
import p000.AbstractC11266d;
import p087db.C11845e;
import p087db.ViewOnClickListenerC11877u;
import p133f1.C13990x;
import p217ib.AbstractC18319p;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import se.AbstractC32417h;
import vu1.AbstractC36512c;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;
import xp0.AbstractC38529z;

/* JADX INFO: renamed from: rq0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Lrq0/i;", "Lib/p;", "Lcom/whoop/domain/model/teams/TeamUser;", "Lrq0/i$b;", "Lrq0/k;", "viewModel", "<init>", "(Lrq0/k;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroid/view/ViewGroup;I)Lrq0/i$b;", "holder", "position", "Ll83/a0;", "f", "(Lrq0/i$b;I)V", "c", "Lrq0/k;", "getViewModel", "()Lrq0/k;", "d", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "i", "(Ljava/lang/Integer;)V", "positionToAnimate", "b", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31672i extends AbstractC18319p {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31677k viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Integer positionToAnimate;

    /* JADX INFO: renamed from: rq0.i$a */
    @Metadata(m65680d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m65681d2 = {"rq0/i$a", "Landroidx/recyclerview/widget/u;", "Lcom/whoop/domain/model/teams/TeamUser;", "oldItem", "newItem", "", "b", "(Lcom/whoop/domain/model/teams/TeamUser;Lcom/whoop/domain/model/teams/TeamUser;)Z", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
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

    /* JADX INFO: renamed from: rq0.i$b */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0015\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u001f\u0010 *\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lrq0/i$b;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/whoop/community/presentation/ui/SimpleDial;", "dial", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/community/presentation/ui/SimpleDial;)V", "Lcom/whoop/domain/model/teams/TeamUser;", UserState.Sources.USER, "Lrq0/k;", "viewModel", "Lrq0/i;", "adapter", "", "position", "Lkotlin/Function0;", "onInteract", "d", "(Lcom/whoop/domain/model/teams/TeamUser;Lrq0/k;Lrq0/i;ILc93/a;)V", "Landroid/animation/ValueAnimator;", "a", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "setAnimator", "(Landroid/animation/ValueAnimator;)V", "animator", "g", "()I", "getUserId$delegate", "(Lrq0/i$b;)Ljava/lang/Object;", "userId", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC1717o2 {

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ InterfaceC21493z[] f131078b = {AbstractC22671h0.f89337a.property1(new C22693x(b.class, "userId", "getUserId()I", 0))};

        /* JADX INFO: renamed from: c */
        public static final int f131079c = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private ValueAnimator animator;

        /* JADX INFO: renamed from: rq0.i$b$a */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"rq0/i$b$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "p0", "Ll83/a0;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator p13) {
                AbstractC22676k.m65750j(p13, "p0");
                ((ImageView) b.this.itemView.findViewById(AbstractC38499a0.f165424u5)).setImageDrawable(AbstractC32122c.getDrawable(b.this.itemView.getContext(), AbstractC38529z.f165825r));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View itemView) {
            super(itemView);
            AbstractC22676k.m65750j(itemView, "itemView");
            C28212w1 c28212w1 = C28212w1.f113986w;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final void m98062e(C31672i c31672i, int i13, C31677k c31677k, TeamUser teamUser, InterfaceC4339a interfaceC4339a, View view) {
            c31672i.m98056i(Integer.valueOf(i13));
            c31677k.m98154e0(teamUser.getId(), teamUser.getFullName(), interfaceC4339a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final void m98063f(C31677k c31677k, TeamUser teamUser, b bVar, InterfaceC4339a interfaceC4339a, View view) {
            if (c31677k.m98157i0(teamUser.getId(), bVar.m98064g())) {
                c31677k.m98158j0(teamUser.getId(), teamUser.getFullName(), interfaceC4339a);
            }
        }

        /* JADX INFO: renamed from: g */
        private final int m98064g() {
            return C28212w1.f113986w.getValue(this, f131078b[0]).intValue();
        }

        /* JADX INFO: renamed from: h */
        private final void m98065h(SimpleDial dial) {
            ((ImageView) this.itemView.findViewById(AbstractC38499a0.f165424u5)).setImageDrawable(AbstractC32122c.getDrawable(this.itemView.getContext(), AbstractC38529z.f165826s));
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(5000L);
            valueAnimatorOfFloat.addUpdateListener(new C11845e(dial, 10));
            valueAnimatorOfFloat.addListener(new a());
            valueAnimatorOfFloat.start();
            this.animator = valueAnimatorOfFloat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final void m98066i(SimpleDial simpleDial, ValueAnimator it) {
            AbstractC22676k.m65750j(it, "it");
            Object animatedValue = it.getAnimatedValue();
            AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            simpleDial.setProgress(((Float) animatedValue).floatValue());
        }

        /* JADX INFO: renamed from: d */
        public final void m98067d(final TeamUser user, final C31677k viewModel, final C31672i adapter, final int position, final InterfaceC4339a onInteract) {
            String string;
            AbstractC22676k.m65750j(viewModel, "viewModel");
            AbstractC22676k.m65750j(adapter, "adapter");
            AbstractC22676k.m65750j(onInteract, "onInteract");
            if (user != null) {
                boolean zM98149U = viewModel.m98149U(user.getId());
                boolean zM98148S = viewModel.m98148S(user.getId());
                ((TextView) this.itemView.findViewById(AbstractC38499a0.f165107K3)).setText(user.getFullName());
                TextView textView = (TextView) this.itemView.findViewById(AbstractC38499a0.f165017A3);
                if (zM98149U) {
                    string = this.itemView.getContext().getString(AbstractC38505d0.f165612Q0);
                } else {
                    string = zM98148S ? this.itemView.getContext().getString(AbstractC38505d0.f165609P0) : AbstractC11266d.m30461o("@", user.getUserName());
                }
                textView.setText(string);
                AbstractC32417h.m101189T(this.itemView.findViewById(AbstractC38499a0.f165085I), (zM98149U || zM98148S) ? false : true);
                AbstractC32417h.m101189T(this.itemView.findViewById(AbstractC38499a0.f165442w5), zM98148S);
                View viewFindViewById = this.itemView.findViewById(AbstractC38499a0.f165026B3);
                AbstractC22676k.m65748h(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) viewFindViewById;
                imageView.setImageDrawable(AbstractC32122c.getDrawable(this.itemView.getContext(), AbstractC36512c.f156071n));
                String avatarUrl = user.getAvatarUrl();
                if (avatarUrl != null) {
                    ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(avatarUrl).m89319j(AbstractC36512c.f156071n)).m15537y(imageView);
                }
                Integer positionToAnimate = adapter.getPositionToAnimate();
                if (positionToAnimate != null && position == positionToAnimate.intValue()) {
                    View viewFindViewById2 = this.itemView.findViewById(AbstractC38499a0.f165433v5);
                    AbstractC22676k.m65749i(viewFindViewById2, "findViewById(...)");
                    m98065h((SimpleDial) viewFindViewById2);
                    adapter.m98056i(null);
                }
                ((ImageView) this.itemView.findViewById(AbstractC38499a0.f165085I)).setOnClickListener(new View.OnClickListener() { // from class: rq0.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C31672i.b.m98062e(adapter, position, viewModel, user, onInteract, view);
                    }
                });
                ((ImageView) this.itemView.findViewById(AbstractC38499a0.f165424u5)).setOnClickListener(new ViewOnClickListenerC11877u(viewModel, user, this, onInteract, 1));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31672i(C31677k viewModel) {
        super(new a());
        AbstractC22676k.m65750j(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m98052g(C31672i c31672i, int i13) {
        c31672i.notifyItemChanged(i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getPositionToAnimate() {
        return this.positionToAnimate;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m98067d((TeamUser) getItem(position), this.viewModel, this, position, new C13990x(this, position, 6));
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(AbstractC38501b0.f165503Y, parent, false);
        AbstractC22676k.m65747g(viewInflate);
        return new b(viewInflate);
    }

    /* JADX INFO: renamed from: i */
    public final void m98056i(Integer num) {
        this.positionToAnimate = num;
    }
}
