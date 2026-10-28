package com.whoop.p069ui.teams;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.RecyclerView;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.community.presentation.p059ui.ParallaxHeaderBehavior;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import com.whoop.domain.model.teams.Team;
import com.whoop.p069ui.C10460a;
import com.whoop.p069ui.teams.TeamsShowInviteActivity;
import eq0.AbstractC13486k;
import hb1.C17085h;
import hj0.AbstractActivityC17347f;
import hj0.C17358q;
import in2.AbstractC18737i;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.InterfaceC28172j0;
import p217ib.AbstractC18317n;
import p399pb.InterfaceC29049f;
import p413q4.C29960e;
import p505ts.AbstractC34132o;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rq0.C31650a1;
import rq0.C31662e1;
import rq0.C31665f1;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u00100R\u001b\u00104\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b,\u00103R\u0014\u00105\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u00067"}, m65681d2 = {"Lcom/whoop/ui/teams/TeamsShowInviteActivity;", "Lhj0/f;", "<init>", "()V", "Ll83/a0;", "I", "a0", "M", "Z", "R", "Y", "T", "Lrq0/f1;", "state", "Q", "(Lrq0/f1;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Lrq0/e1;", "Ll83/h;", "P", "()Lrq0/e1;", "viewModel", "Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;", "J", "Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;", "scrollBehavior", "Lor2/j0;", "K", "O", "()Lor2/j0;", "idleIndicator", "Lrq0/a1;", "L", "Lrq0/a1;", "listAdapter", "", "teamLoaded", "Landroidx/lifecycle/p0;", "Lib/n;", "Lcom/whoop/domain/model/teams/TeamUser;", "N", "Landroidx/lifecycle/p0;", "observedDataSource", "Leq0/k;", "Leq0/k;", "activityTeamsShowInviteBinding", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "isInternationalizedTeamViews", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TeamsShowInviteActivity extends AbstractActivityC17347f {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: S */
    public static final int f32253S = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10617g(this, null, new C10616f(this), null));

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private ParallaxHeaderBehavior scrollBehavior;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h idleIndicator;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private C31650a1 listAdapter;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean teamLoaded;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private AbstractC1615p0 observedDataSource;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private AbstractC13486k activityTeamsShowInviteBinding;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final boolean isInternationalizedTeamViews;

    /* JADX INFO: renamed from: com.whoop.ui.teams.TeamsShowInviteActivity$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/ui/teams/TeamsShowInviteActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;", "invite", "Lhj0/q;", "a", "(Landroid/content/Context;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Lhj0/q;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C17358q m27393a(Context context, DrawerDisplayInvite invite) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(invite, "invite");
            C17358q c17358q = new C17358q(context, (Class<?>) TeamsShowInviteActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("invitePojoCode", invite);
            c17358q.m49157p(bundle);
            return c17358q;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.teams.TeamsShowInviteActivity$b */
    @InterfaceC32271e(m100429c = "com.whoop.ui.teams.TeamsShowInviteActivity$acceptInvite$1$1", m100430f = "TeamsShowInviteActivity.kt", m100431l = {114, 121}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10612b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32263w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC13486k f32265y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10612b(AbstractC13486k abstractC13486k, InterfaceC30057d<? super C10612b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32265y = abstractC13486k;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TeamsShowInviteActivity.this.new C10612b(this.f32265y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10612b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        
            if (r6 == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
        
            if (r6 == r0) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f32263w
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                p505ts.AbstractC34132o.m107864I(r6)
                goto L7b
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L19:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L4f
            L1d:
                p505ts.AbstractC34132o.m107864I(r6)
                com.whoop.ui.teams.TeamsShowInviteActivity r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.this
                rq0.e1 r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.m27376K(r6)
                e50.c r6 = r6.m97950L()
                java.lang.Object r6 = r6.getValue()
                rq0.f1 r6 = (rq0.C31665f1) r6
                if (r6 == 0) goto L3d
                com.whoop.domain.model.teams.DrawerDisplayInvite r6 = r6.getInvite()
                if (r6 == 0) goto L3d
                java.lang.String r6 = r6.getInviteCode()
                goto L3e
            L3d:
                r6 = 0
            L3e:
                if (r6 == 0) goto L6c
                com.whoop.ui.teams.TeamsShowInviteActivity r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.this
                rq0.e1 r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.m27376K(r6)
                r5.f32263w = r4
                java.lang.Object r6 = r6.m97957y(r5)
                if (r6 != r0) goto L4f
                goto L7a
            L4f:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5d
                com.whoop.ui.teams.TeamsShowInviteActivity r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.this
                com.whoop.p069ui.teams.TeamsShowInviteActivity.m27377L(r6)
                goto L97
            L5d:
                com.whoop.ui.teams.TeamsShowInviteActivity r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.this
                int r0 = xp0.AbstractC38505d0.f165659e1
                in2.AbstractC18737i.m54478c(r6, r0)
                eq0.k r6 = r5.f32265y
                com.whoop.ui.pills.StrokedPillButton r6 = r6.f47399c
                r6.setVisibility(r2)
                goto L97
            L6c:
                com.whoop.ui.teams.TeamsShowInviteActivity r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.this
                rq0.e1 r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.m27376K(r6)
                r5.f32263w = r3
                java.lang.Object r6 = r6.m97956w(r5)
                if (r6 != r0) goto L7b
            L7a:
                return r0
            L7b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L89
                com.whoop.ui.teams.TeamsShowInviteActivity r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.this
                com.whoop.p069ui.teams.TeamsShowInviteActivity.m27377L(r6)
                goto L97
            L89:
                com.whoop.ui.teams.TeamsShowInviteActivity r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.this
                int r0 = xp0.AbstractC38505d0.f165659e1
                in2.AbstractC18737i.m54478c(r6, r0)
                eq0.k r6 = r5.f32265y
                com.whoop.ui.pills.StrokedPillButton r6 = r6.f47399c
                r6.setVisibility(r2)
            L97:
                com.whoop.ui.teams.TeamsShowInviteActivity r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.this
                or2.j0 r6 = com.whoop.p069ui.teams.TeamsShowInviteActivity.m27375J(r6)
                r6.mo85209b()
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.p069ui.teams.TeamsShowInviteActivity.C10612b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.teams.TeamsShowInviteActivity$c */
    @InterfaceC32271e(m100429c = "com.whoop.ui.teams.TeamsShowInviteActivity$declineInvite$1", m100430f = "TeamsShowInviteActivity.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10613c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32266w;

        public C10613c(InterfaceC30057d<? super C10613c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TeamsShowInviteActivity.this.new C10613c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10613c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:28:0x007f  */
        /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            DrawerDisplayInvite drawerDisplayInviteM97969k;
            C31665f1 c31665f1;
            String communityName;
            DrawerDisplayInvite drawerDisplayInviteM97969k2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32266w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31665f1 c31665f2 = (C31665f1) TeamsShowInviteActivity.this.m27381P().m97950L().getValue();
                if (((c31665f2 == null || (drawerDisplayInviteM97969k = c31665f2.getInvite()) == null) ? null : drawerDisplayInviteM97969k.getInviteCode()) == null) {
                    C31662e1 c31662e1M27381P = TeamsShowInviteActivity.this.m27381P();
                    this.f32266w = 1;
                    obj = c31662e1M27381P.m97947G(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    TeamsShowInviteActivity teamsShowInviteActivity = TeamsShowInviteActivity.this;
                    Resources resources = teamsShowInviteActivity.getResources();
                    int i14 = AbstractC38505d0.f165663f1;
                    c31665f1 = (C31665f1) TeamsShowInviteActivity.this.m27381P().m97950L().getValue();
                    if (c31665f1 != null || (drawerDisplayInviteM97969k2 = c31665f1.getInvite()) == null || (communityName = drawerDisplayInviteM97969k2.getCommunityName()) == null) {
                        communityName = "";
                    }
                    String string = resources.getString(i14, communityName);
                    AbstractC22676k.m65749i(string, "getString(...)");
                    AbstractC18737i.m54479d(teamsShowInviteActivity, string);
                    Intent intent = new Intent();
                    C31665f1 c31665f3 = (C31665f1) TeamsShowInviteActivity.this.m27381P().m97950L().getValue();
                    intent.putExtra("teamResultFromInvite", c31665f3 != null ? c31665f3.getInvite() : null);
                    TeamsShowInviteActivity.this.setResult(0, intent);
                    TeamsShowInviteActivity.this.finish();
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (((Boolean) obj).booleanValue()) {
                TeamsShowInviteActivity teamsShowInviteActivity2 = TeamsShowInviteActivity.this;
                Resources resources2 = teamsShowInviteActivity2.getResources();
                int i15 = AbstractC38505d0.f165663f1;
                c31665f1 = (C31665f1) TeamsShowInviteActivity.this.m27381P().m97950L().getValue();
                if (c31665f1 != null) {
                    communityName = "";
                } else {
                    communityName = "";
                }
                String string2 = resources2.getString(i15, communityName);
                AbstractC22676k.m65749i(string2, "getString(...)");
                AbstractC18737i.m54479d(teamsShowInviteActivity2, string2);
                Intent intent2 = new Intent();
                C31665f1 c31665f4 = (C31665f1) TeamsShowInviteActivity.this.m27381P().m97950L().getValue();
                intent2.putExtra("teamResultFromInvite", c31665f4 != null ? c31665f4.getInvite() : null);
                TeamsShowInviteActivity.this.setResult(0, intent2);
                TeamsShowInviteActivity.this.finish();
            } else {
                AbstractC18737i.m54478c(TeamsShowInviteActivity.this, AbstractC38505d0.f165667g1);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.teams.TeamsShowInviteActivity$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10614d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32268w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32269x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32270y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10614d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32268w = componentCallbacks;
            this.f32269x = interfaceC35951a;
            this.f32270y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.j0] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC28172j0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32268w;
            InterfaceC35951a interfaceC35951a = this.f32269x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32270y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC28172j0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.teams.TeamsShowInviteActivity$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10615e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32271w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32272x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32273y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10615e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32271w = componentCallbacks;
            this.f32272x = interfaceC35951a;
            this.f32273y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f32271w;
            InterfaceC35951a interfaceC35951a = this.f32272x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32273y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.teams.TeamsShowInviteActivity$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10616f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32274w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10616f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32274w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32274w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.teams.TeamsShowInviteActivity$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10617g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32275w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32276x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32277y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32278z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10617g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32275w = componentCallbacks;
            this.f32276x = interfaceC35951a;
            this.f32277y = interfaceC4339a;
            this.f32278z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.e1] */
        @Override // c93.InterfaceC4339a
        public final C31662e1 invoke() {
            return AbstractC34132o.m107857B(this.f32275w, this.f32276x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31662e1.class), this.f32277y, this.f32278z);
        }
    }

    public TeamsShowInviteActivity() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.idleIndicator = AbstractC30060g.m92087G(enumC23463i, new C10614d(this, null, null));
        this.featureFlagRepository = AbstractC30060g.m92087G(enumC23463i, new C10615e(this, null, null));
        this.isInternationalizedTeamViews = m27379N().isFeatureEnabled(FeatureFlagRepositoryKt.INTERNATIONALIZED_TEAM_VIEWS);
    }

    /* JADX INFO: renamed from: I */
    private final void m27374I() {
        AbstractC13486k abstractC13486k = this.activityTeamsShowInviteBinding;
        if (abstractC13486k == null) {
            AbstractC22676k.m65757q("activityTeamsShowInviteBinding");
            throw null;
        }
        m27380O().mo85208a();
        abstractC13486k.f47399c.setVisibility(4);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5019i(getLifecycle()), null, null, new C10612b(abstractC13486k, null), 3);
    }

    /* JADX INFO: renamed from: M */
    private final void m27378M() {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5019i(getLifecycle()), null, null, new C10613c(null), 3);
    }

    /* JADX INFO: renamed from: N */
    private final FeatureFlagRepository m27379N() {
        return (FeatureFlagRepository) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final InterfaceC28172j0 m27380O() {
        return (InterfaceC28172j0) this.idleIndicator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final C31662e1 m27381P() {
        return (C31662e1) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private final void m27382Q(C31665f1 state) {
        String iconUrl;
        Team teamMo97831b;
        String bannerUrl;
        if (!state.getBannerLoaded() && (teamMo97831b = state.getTeam()) != null && (bannerUrl = teamMo97831b.getBannerUrl()) != null) {
            C4964f c4964fM15549m = ComponentCallbacks2C4960b.m15528d(this).m75569h(this).m15549m(bannerUrl);
            AbstractC13486k abstractC13486k = this.activityTeamsShowInviteBinding;
            if (abstractC13486k == null) {
                AbstractC22676k.m65757q("activityTeamsShowInviteBinding");
                throw null;
            }
            c4964fM15549m.m15537y(abstractC13486k.f47404h.f47636b);
            m27381P().m97954Q(true);
        }
        Team teamMo97831b2 = state.getTeam();
        if (teamMo97831b2 == null || (iconUrl = teamMo97831b2.getIconUrl()) == null) {
            return;
        }
        C4964f c4964fM15549m2 = ComponentCallbacks2C4960b.m15528d(this).m75569h(this).m15549m(iconUrl);
        AbstractC13486k abstractC13486k2 = this.activityTeamsShowInviteBinding;
        if (abstractC13486k2 != null) {
            c4964fM15549m2.m15537y(abstractC13486k2.f47404h.f47635a);
        } else {
            AbstractC22676k.m65757q("activityTeamsShowInviteBinding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: R */
    private final void m27383R() {
        m27381P().m97950L().m35577c(this, new C17095c(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m27384S(TeamsShowInviteActivity teamsShowInviteActivity, C31665f1 state) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC13486k abstractC13486k = teamsShowInviteActivity.activityTeamsShowInviteBinding;
        if (abstractC13486k == null) {
            AbstractC22676k.m65757q("activityTeamsShowInviteBinding");
            throw null;
        }
        teamsShowInviteActivity.m27382Q(state);
        TextView textView = abstractC13486k.f47404h.f47638d;
        Team teamMo97831b = state.getTeam();
        textView.setText(teamMo97831b != null ? teamMo97831b.getName() : null);
        if (!state.getIsConnected()) {
            abstractC13486k.f47401e.setVisibility(0);
            abstractC13486k.f47406j.setVisibility(8);
            abstractC13486k.f47402f.setVisibility(0);
            abstractC13486k.f47405i.setVisibility(8);
            abstractC13486k.f47403g.setText(teamsShowInviteActivity.getString(AbstractC38505d0.f165643a1));
        } else if (!teamsShowInviteActivity.teamLoaded && state.getTeam() != null) {
            teamsShowInviteActivity.m27390Y();
            teamsShowInviteActivity.teamLoaded = true;
        } else if (state.getResultSize() == 0) {
            abstractC13486k.f47405i.setVisibility(8);
            abstractC13486k.f47401e.setVisibility(0);
            abstractC13486k.f47402f.setVisibility(8);
            abstractC13486k.f47406j.m26663f();
        } else if (state.getTeam() != null) {
            abstractC13486k.f47405i.setVisibility(0);
            abstractC13486k.f47401e.setVisibility(8);
            teamsShowInviteActivity.m27391Z();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private final void m27385T() {
        AbstractC1615p0 abstractC1615p0 = this.observedDataSource;
        if (abstractC1615p0 != null) {
            abstractC1615p0.removeObservers(this);
        }
        AbstractC1615p0 abstractC1615p0M97948H = m27381P().getDataSource();
        this.observedDataSource = abstractC1615p0M97948H;
        if (abstractC1615p0M97948H != null) {
            abstractC1615p0M97948H.observe(this, new C10460a(this, 2));
        }
        C31650a1 c31650a1 = this.listAdapter;
        if (c31650a1 != null) {
            c31650a1.notifyDataSetChanged();
        } else {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final void m27386U(TeamsShowInviteActivity teamsShowInviteActivity, AbstractC18317n abstractC18317n) {
        C31650a1 c31650a1 = teamsShowInviteActivity.listAdapter;
        if (c31650a1 != null) {
            c31650a1.m52734c(abstractC18317n);
        } else {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m27387V(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final void m27388W(TeamsShowInviteActivity teamsShowInviteActivity, View view) {
        teamsShowInviteActivity.m27374I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m27389X(TeamsShowInviteActivity teamsShowInviteActivity, View view) {
        teamsShowInviteActivity.m27378M();
    }

    /* JADX INFO: renamed from: Y */
    private final void m27390Y() {
        this.listAdapter = new C31650a1(null, m27381P(), this.isInternationalizedTeamViews);
        AbstractC13486k abstractC13486k = this.activityTeamsShowInviteBinding;
        if (abstractC13486k == null) {
            AbstractC22676k.m65757q("activityTeamsShowInviteBinding");
            throw null;
        }
        abstractC13486k.f47404h.f47635a.setImageDrawable(null);
        AbstractC13486k abstractC13486k2 = this.activityTeamsShowInviteBinding;
        if (abstractC13486k2 == null) {
            AbstractC22676k.m65757q("activityTeamsShowInviteBinding");
            throw null;
        }
        RecyclerView recyclerView = abstractC13486k2.f47405i;
        C31650a1 c31650a1 = this.listAdapter;
        if (c31650a1 == null) {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
        recyclerView.setAdapter(c31650a1);
        m27385T();
    }

    /* JADX INFO: renamed from: Z */
    private final void m27391Z() {
        AbstractC13486k abstractC13486k = this.activityTeamsShowInviteBinding;
        if (abstractC13486k == null) {
            AbstractC22676k.m65757q("activityTeamsShowInviteBinding");
            throw null;
        }
        AbstractC1740u1 layoutManager = abstractC13486k.f47405i.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
        ParallaxHeaderBehavior parallaxHeaderBehavior = this.scrollBehavior;
        if (parallaxHeaderBehavior == null) {
            AbstractC22676k.m65757q("scrollBehavior");
            throw null;
        }
        AbstractC13486k abstractC13486k2 = this.activityTeamsShowInviteBinding;
        if (abstractC13486k2 == null) {
            AbstractC22676k.m65757q("activityTeamsShowInviteBinding");
            throw null;
        }
        View root = abstractC13486k2.f47404h.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        parallaxHeaderBehavior.m19532I(root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public final void m27392a0() {
        String communityName;
        DrawerDisplayInvite drawerDisplayInviteM97969k;
        Resources resources = getResources();
        int i13 = AbstractC38505d0.f165655d1;
        C31665f1 c31665f1 = (C31665f1) m27381P().m97950L().getValue();
        if (c31665f1 == null || (drawerDisplayInviteM97969k = c31665f1.getInvite()) == null || (communityName = drawerDisplayInviteM97969k.getCommunityName()) == null) {
            communityName = "";
        }
        String string = resources.getString(i13, communityName);
        AbstractC22676k.m65749i(string, "getString(...)");
        AbstractC18737i.m54479d(this, string);
        Intent intent = new Intent();
        C31665f1 c31665f2 = (C31665f1) m27381P().m97950L().getValue();
        intent.putExtra("teamResultFromInvite", c31665f2 != null ? c31665f2.getTeam() : null);
        setResult(-1, intent);
        finish();
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC1168a0 abstractC1168a0M3733d = AbstractC1177g.m3733d(this, AbstractC38501b0.f165519h);
        AbstractC22676k.m65749i(abstractC1168a0M3733d, "setContentView(...)");
        this.activityTeamsShowInviteBinding = (AbstractC13486k) abstractC1168a0M3733d;
        setTitle(AbstractC38505d0.f165651c1);
        m49105z();
        AbstractC13486k abstractC13486k = this.activityTeamsShowInviteBinding;
        if (abstractC13486k == null) {
            AbstractC22676k.m65757q("activityTeamsShowInviteBinding");
            throw null;
        }
        RecyclerView recyclerView = abstractC13486k.f47405i;
        AbstractC22676k.m65749i(recyclerView, "recyclerView");
        View root = abstractC13486k.f47404h.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        int height = abstractC13486k.f47404h.f47639e.getHeight();
        Context context = abstractC13486k.getRoot().getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.scrollBehavior = new ParallaxHeaderBehavior(recyclerView, root, height, context, new C17085h(16));
        ViewGroup.LayoutParams layoutParams = abstractC13486k.f47404h.getRoot().getLayoutParams();
        C29960e c29960e = layoutParams instanceof C29960e ? (C29960e) layoutParams : null;
        if (c29960e != null) {
            ParallaxHeaderBehavior parallaxHeaderBehavior = this.scrollBehavior;
            if (parallaxHeaderBehavior == null) {
                AbstractC22676k.m65757q("scrollBehavior");
                throw null;
            }
            c29960e.m91654b(parallaxHeaderBehavior);
            int i13 = AbstractC38499a0.f165188T5;
            c29960e.f122375l = null;
            c29960e.f122374k = null;
            c29960e.f122369f = i13;
            c29960e.f122367d = 3;
            c29960e.f122366c = 3;
        }
        final int i14 = 0;
        abstractC13486k.f47399c.setOnClickListener(new View.OnClickListener(this) { // from class: hn2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TeamsShowInviteActivity f67755x;

            {
                this.f67755x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        TeamsShowInviteActivity.m27388W(this.f67755x, view);
                        break;
                    default:
                        TeamsShowInviteActivity.m27389X(this.f67755x, view);
                        break;
                }
            }
        });
        final int i15 = 1;
        abstractC13486k.f47398b.setOnClickListener(new View.OnClickListener(this) { // from class: hn2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TeamsShowInviteActivity f67755x;

            {
                this.f67755x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        TeamsShowInviteActivity.m27388W(this.f67755x, view);
                        break;
                    default:
                        TeamsShowInviteActivity.m27389X(this.f67755x, view);
                        break;
                }
            }
        });
        DrawerDisplayInvite drawerDisplayInvite = (DrawerDisplayInvite) getIntent().getParcelableExtra("invitePojo");
        if (drawerDisplayInvite != null) {
            m27381P().m97951M(drawerDisplayInvite);
        }
        DrawerDisplayInvite drawerDisplayInvite2 = (DrawerDisplayInvite) getIntent().getParcelableExtra("invitePojoCode");
        if (drawerDisplayInvite2 != null) {
            m27381P().m97952N(drawerDisplayInvite2);
        }
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStart() {
        super.onStart();
        m27381P().m97954Q(false);
        this.teamLoaded = false;
        m27391Z();
        m27383R();
    }
}
