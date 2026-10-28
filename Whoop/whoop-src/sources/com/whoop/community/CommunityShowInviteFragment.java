package com.whoop.community;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.recyclerview.widget.RecyclerView;
import as2.AbstractC1953c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.squareup.wire.AbstractC5583n;
import com.whoop.community.presentation.p059ui.ParallaxHeaderBehavior;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import com.whoop.domain.model.teams.Team;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10460a;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13444b2;
import hj0.AbstractC17354m;
import in2.AbstractC18737i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.WeakHashMap;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nq0.C27055r;
import or2.AbstractC28163g0;
import or2.C28198s;
import p000.AbstractC11266d;
import p114eb.C12962i;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p217ib.AbstractC18317n;
import p399pb.InterfaceC29049f;
import p413q4.C29960e;
import p465rm.C31559p;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
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
import xl0.C38448b;
import xp0.AbstractC38499a0;
import xp0.AbstractC38505d0;
import xp0.C38526w;
import xp0.C38527x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0003R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0016X\u0096D¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R$\u0010;\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020807\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R+\u0010J\u001a\u00020B2\u0006\u0010C\u001a\u00020B8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010 \u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010 \u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010.R\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010LR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010L¨\u0006["}, m65681d2 = {"Lcom/whoop/community/CommunityShowInviteFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "L", "i0", "R", "Y", "c0", "a0", "Lrq0/f1;", "state", "X", "(Lrq0/f1;)V", "P", "Lrq0/e1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "W", "()Lrq0/e1;", "viewModel", "Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;", "x", "Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;", "scrollBehavior", "Lrq0/a1;", "y", "Lrq0/a1;", "listAdapter", "", "z", "Z", "teamLoaded", "", "E", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/p0;", "Lib/n;", "Lcom/whoop/domain/model/teams/TeamUser;", "F", "Landroidx/lifecycle/p0;", "observedDataSource", "Lxp0/x;", "G", "Leb/i;", "S", "()Lxp0/x;", "args", "Leq0/b2;", "<set-?>", "H", "Lcom/whoop/ui/b;", "T", "()Leq0/b2;", "h0", "(Leq0/b2;)V", "binding", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "I", "U", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lnq0/r;", "J", "V", "()Lnq0/r;", "navigationHelper", "K", "isInternationalizedTeamViews", "", "originalCloseButtonTopMargin", "M", "originalDeclineButtonBottomMargin", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CommunityShowInviteFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: N */
    static final /* synthetic */ InterfaceC21493z[] f24906N = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(CommunityShowInviteFragment.class, "binding", "getBinding()Lcom/whoop/community/databinding/FragmentTeamsShowInviteBinding;", 0))};

    /* JADX INFO: renamed from: O */
    public static final int f24907O = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private AbstractC1615p0 observedDataSource;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h navigationHelper;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final boolean isInternationalizedTeamViews;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private int originalCloseButtonTopMargin;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private int originalDeclineButtonBottomMargin;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ParallaxHeaderBehavior scrollBehavior;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private C31650a1 listAdapter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean teamLoaded;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6307g(this, null, new C6306f(this), null));

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String logTag = "CommunityShowInviteFragment";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38527x.class), new C6305e(this));

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: com.whoop.community.CommunityShowInviteFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityShowInviteFragment$acceptInvite$1", m100430f = "CommunityShowInviteFragment.kt", m100431l = {109, 116}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6301a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24921w;

        public C6301a(InterfaceC30057d<? super C6301a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CommunityShowInviteFragment.this.new C6301a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6301a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        
            if (r6 == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        
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
                int r1 = r5.f24921w
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                p505ts.AbstractC34132o.m107864I(r6)
                goto L84
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L50
            L1e:
                p505ts.AbstractC34132o.m107864I(r6)
                com.whoop.community.CommunityShowInviteFragment r6 = com.whoop.community.CommunityShowInviteFragment.this
                rq0.e1 r6 = com.whoop.community.CommunityShowInviteFragment.m19161N(r6)
                e50.c r6 = r6.m97950L()
                java.lang.Object r6 = r6.getValue()
                rq0.f1 r6 = (rq0.C31665f1) r6
                if (r6 == 0) goto L3e
                com.whoop.domain.model.teams.DrawerDisplayInvite r6 = r6.getInvite()
                if (r6 == 0) goto L3e
                java.lang.String r6 = r6.getInviteCode()
                goto L3f
            L3e:
                r6 = 0
            L3f:
                if (r6 == 0) goto L75
                com.whoop.community.CommunityShowInviteFragment r6 = com.whoop.community.CommunityShowInviteFragment.this
                rq0.e1 r6 = com.whoop.community.CommunityShowInviteFragment.m19161N(r6)
                r5.f24921w = r4
                java.lang.Object r6 = r6.m97957y(r5)
                if (r6 != r0) goto L50
                goto L83
            L50:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5e
                com.whoop.community.CommunityShowInviteFragment r6 = com.whoop.community.CommunityShowInviteFragment.this
                com.whoop.community.CommunityShowInviteFragment.m19162O(r6)
                goto La8
            L5e:
                com.whoop.community.CommunityShowInviteFragment r6 = com.whoop.community.CommunityShowInviteFragment.this
                android.content.Context r6 = r6.requireContext()
                int r0 = xp0.AbstractC38505d0.f165659e1
                in2.AbstractC18737i.m54478c(r6, r0)
                com.whoop.community.CommunityShowInviteFragment r6 = com.whoop.community.CommunityShowInviteFragment.this
                eq0.b2 r6 = com.whoop.community.CommunityShowInviteFragment.m19160M(r6)
                com.whoop.ui.pills.StrokedPillButton r6 = r6.f47136c
                r6.setVisibility(r2)
                goto La8
            L75:
                com.whoop.community.CommunityShowInviteFragment r6 = com.whoop.community.CommunityShowInviteFragment.this
                rq0.e1 r6 = com.whoop.community.CommunityShowInviteFragment.m19161N(r6)
                r5.f24921w = r3
                java.lang.Object r6 = r6.m97956w(r5)
                if (r6 != r0) goto L84
            L83:
                return r0
            L84:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L92
                com.whoop.community.CommunityShowInviteFragment r6 = com.whoop.community.CommunityShowInviteFragment.this
                com.whoop.community.CommunityShowInviteFragment.m19162O(r6)
                goto La8
            L92:
                com.whoop.community.CommunityShowInviteFragment r6 = com.whoop.community.CommunityShowInviteFragment.this
                android.content.Context r6 = r6.requireContext()
                int r0 = xp0.AbstractC38505d0.f165659e1
                in2.AbstractC18737i.m54478c(r6, r0)
                com.whoop.community.CommunityShowInviteFragment r6 = com.whoop.community.CommunityShowInviteFragment.this
                eq0.b2 r6 = com.whoop.community.CommunityShowInviteFragment.m19160M(r6)
                com.whoop.ui.pills.StrokedPillButton r6 = r6.f47136c
                r6.setVisibility(r2)
            La8:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.community.CommunityShowInviteFragment.C6301a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityShowInviteFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityShowInviteFragment$declineInvite$1", m100430f = "CommunityShowInviteFragment.kt", m100431l = {145}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6302b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24923w;

        public C6302b(InterfaceC30057d<? super C6302b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CommunityShowInviteFragment.this.new C6302b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6302b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0089  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            DrawerDisplayInvite drawerDisplayInviteM97969k;
            C31665f1 c31665f1;
            String communityName;
            DrawerDisplayInvite drawerDisplayInviteM97969k2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24923w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31665f1 c31665f2 = (C31665f1) CommunityShowInviteFragment.this.m19170W().m97950L().getValue();
                if (((c31665f2 == null || (drawerDisplayInviteM97969k = c31665f2.getInvite()) == null) ? null : drawerDisplayInviteM97969k.getInviteCode()) == null) {
                    C31662e1 c31662e1M19170W = CommunityShowInviteFragment.this.m19170W();
                    this.f24923w = 1;
                    obj = c31662e1M19170W.m97947G(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    Context contextRequireContext = CommunityShowInviteFragment.this.requireContext();
                    Resources resources = CommunityShowInviteFragment.this.getResources();
                    int i14 = AbstractC38505d0.f165663f1;
                    c31665f1 = (C31665f1) CommunityShowInviteFragment.this.m19170W().m97950L().getValue();
                    if (c31665f1 != null || (drawerDisplayInviteM97969k2 = c31665f1.getInvite()) == null || (communityName = drawerDisplayInviteM97969k2.getCommunityName()) == null) {
                        communityName = "";
                    }
                    String string = resources.getString(i14, communityName);
                    AbstractC22676k.m65749i(string, "getString(...)");
                    AbstractC18737i.m54479d(contextRequireContext, string);
                    Intent intent = new Intent();
                    C31665f1 c31665f3 = (C31665f1) CommunityShowInviteFragment.this.m19170W().m97950L().getValue();
                    intent.putExtra("teamResultFromInvite", c31665f3 != null ? c31665f3.getInvite() : null);
                    AbstractC5583n.m16799z(CommunityShowInviteFragment.this).m36410z();
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (((Boolean) obj).booleanValue()) {
                Context contextRequireContext2 = CommunityShowInviteFragment.this.requireContext();
                Resources resources2 = CommunityShowInviteFragment.this.getResources();
                int i15 = AbstractC38505d0.f165663f1;
                c31665f1 = (C31665f1) CommunityShowInviteFragment.this.m19170W().m97950L().getValue();
                if (c31665f1 != null) {
                    communityName = "";
                } else {
                    communityName = "";
                }
                String string2 = resources2.getString(i15, communityName);
                AbstractC22676k.m65749i(string2, "getString(...)");
                AbstractC18737i.m54479d(contextRequireContext2, string2);
                Intent intent2 = new Intent();
                C31665f1 c31665f4 = (C31665f1) CommunityShowInviteFragment.this.m19170W().m97950L().getValue();
                intent2.putExtra("teamResultFromInvite", c31665f4 != null ? c31665f4.getInvite() : null);
                AbstractC5583n.m16799z(CommunityShowInviteFragment.this).m36410z();
            } else {
                AbstractC18737i.m54478c(CommunityShowInviteFragment.this.requireContext(), AbstractC38505d0.f165667g1);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityShowInviteFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6303c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24925w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24926x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24927y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6303c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24925w = componentCallbacks;
            this.f24926x = interfaceC35951a;
            this.f24927y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f24925w;
            InterfaceC35951a interfaceC35951a = this.f24926x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24927y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityShowInviteFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6304d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24928w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24929x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24930y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6304d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24928w = componentCallbacks;
            this.f24929x = interfaceC35951a;
            this.f24930y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nq0.r] */
        @Override // c93.InterfaceC4339a
        public final C27055r invoke() {
            ComponentCallbacks componentCallbacks = this.f24928w;
            InterfaceC35951a interfaceC35951a = this.f24929x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24930y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27055r.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityShowInviteFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6305e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24931w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6305e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24931w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f24931w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f24931w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityShowInviteFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6306f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24932w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6306f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24932w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24932w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityShowInviteFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6307g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24933w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24934x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24935y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24936z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6307g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24933w = componentCallbacks;
            this.f24934x = interfaceC35951a;
            this.f24935y = interfaceC4339a;
            this.f24936z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.e1] */
        @Override // c93.InterfaceC4339a
        public final C31662e1 invoke() {
            return AbstractC34132o.m107857B(this.f24933w, this.f24934x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31662e1.class), this.f24935y, this.f24936z);
        }
    }

    public CommunityShowInviteFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.featureFlagRepository = AbstractC30060g.m92087G(enumC23463i, new C6303c(this, null, null));
        this.navigationHelper = AbstractC30060g.m92087G(enumC23463i, new C6304d(this, null, null));
        this.isInternationalizedTeamViews = m19168U().isFeatureEnabled(FeatureFlagRepositoryKt.INTERNATIONALIZED_TEAM_VIEWS);
    }

    /* JADX INFO: renamed from: L */
    private final void m19159L() {
        m19167T().f47136c.setVisibility(4);
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C6301a(null), 3);
    }

    /* JADX INFO: renamed from: P */
    private final void m19163P() {
        View root = m19167T().getRoot();
        C31559p c31559p = new C31559p(this, 18);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c31559p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C16905q1 m19164Q(CommunityShowInviteFragment communityShowInviteFragment, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C16899o1 c16899o1 = windowInsets.f64864a;
        C35643b c35643bMo47530g = c16899o1.mo47530g(1);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        C35643b c35643bMo47530g2 = c16899o1.mo47530g(2);
        AbstractC22676k.m65749i(c35643bMo47530g2, "getInsets(...)");
        ImageView showInviteToolbar = communityShowInviteFragment.m19167T().f47142i;
        AbstractC22676k.m65749i(showInviteToolbar, "showInviteToolbar");
        ViewGroup.LayoutParams layoutParams = showInviteToolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = c35643bMo47530g.f151450b + communityShowInviteFragment.originalCloseButtonTopMargin;
        showInviteToolbar.setLayoutParams(marginLayoutParams);
        StrokedPillButton declineButton = communityShowInviteFragment.m19167T().f47135b;
        AbstractC22676k.m65749i(declineButton, "declineButton");
        ViewGroup.LayoutParams layoutParams2 = declineButton.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = c35643bMo47530g2.f151452d + communityShowInviteFragment.originalDeclineButtonBottomMargin;
        declineButton.setLayoutParams(marginLayoutParams2);
        return windowInsets;
    }

    /* JADX INFO: renamed from: R */
    private final void m19165R() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C6302b(null), 3);
    }

    /* JADX INFO: renamed from: S */
    private final C38527x m19166S() {
        return (C38527x) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final AbstractC13444b2 m19167T() {
        return (AbstractC13444b2) this.binding.getValue(this, f24906N[0]);
    }

    /* JADX INFO: renamed from: U */
    private final FeatureFlagRepository m19168U() {
        return (FeatureFlagRepository) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final C27055r m19169V() {
        return (C27055r) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final C31662e1 m19170W() {
        return (C31662e1) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: X */
    private final void m19171X(C31665f1 state) {
        String iconUrl;
        Team teamMo97831b;
        String bannerUrl;
        if (!state.getBannerLoaded() && (teamMo97831b = state.getTeam()) != null && (bannerUrl = teamMo97831b.getBannerUrl()) != null) {
            ComponentCallbacks2C4960b.m15528d(getContext()).m75568g(this).m15549m(bannerUrl).m15537y(m19167T().f47140g.f47636b);
            m19170W().m97954Q(true);
        }
        Team teamMo97831b2 = state.getTeam();
        if (teamMo97831b2 == null || (iconUrl = teamMo97831b2.getIconUrl()) == null) {
            return;
        }
        ComponentCallbacks2C4960b.m15528d(getContext()).m75568g(this).m15549m(iconUrl).m15537y(m19167T().f47140g.f47635a);
    }

    /* JADX INFO: renamed from: Y */
    private final void m19172Y() {
        m19170W().m97950L().m35577c(this, new C38526w(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m19173Z(CommunityShowInviteFragment communityShowInviteFragment, C31665f1 state) {
        AbstractC22676k.m65750j(state, "state");
        communityShowInviteFragment.m19171X(state);
        AbstractC13444b2 abstractC13444b2M19167T = communityShowInviteFragment.m19167T();
        TextView textView = abstractC13444b2M19167T.f47140g.f47638d;
        Team teamMo97831b = state.getTeam();
        textView.setText(teamMo97831b != null ? teamMo97831b.getName() : null);
        if (!state.getIsConnected()) {
            abstractC13444b2M19167T.f47137d.setVisibility(0);
            abstractC13444b2M19167T.f47143j.setVisibility(8);
            abstractC13444b2M19167T.f47138e.setVisibility(0);
            abstractC13444b2M19167T.f47141h.setVisibility(8);
            abstractC13444b2M19167T.f47139f.setText(communityShowInviteFragment.getString(AbstractC38505d0.f165643a1));
        } else if (!communityShowInviteFragment.teamLoaded && state.getTeam() != null) {
            communityShowInviteFragment.m19176c0();
            communityShowInviteFragment.teamLoaded = true;
        } else if (state.getResultSize() == 0) {
            abstractC13444b2M19167T.f47141h.setVisibility(8);
            abstractC13444b2M19167T.f47137d.setVisibility(0);
            abstractC13444b2M19167T.f47138e.setVisibility(8);
            abstractC13444b2M19167T.f47143j.m26663f();
        } else if (state.getTeam() != null) {
            abstractC13444b2M19167T.f47141h.setVisibility(0);
            abstractC13444b2M19167T.f47137d.setVisibility(8);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private final void m19174a0() {
        AbstractC1615p0 abstractC1615p0 = this.observedDataSource;
        if (abstractC1615p0 != null) {
            abstractC1615p0.removeObservers(this);
        }
        AbstractC1615p0 abstractC1615p0M97948H = m19170W().getDataSource();
        this.observedDataSource = abstractC1615p0M97948H;
        if (abstractC1615p0M97948H != null) {
            abstractC1615p0M97948H.observe(this, new C10460a(this, 4));
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
    /* JADX INFO: renamed from: b0 */
    public static final void m19175b0(CommunityShowInviteFragment communityShowInviteFragment, AbstractC18317n abstractC18317n) {
        C31650a1 c31650a1 = communityShowInviteFragment.listAdapter;
        if (c31650a1 != null) {
            c31650a1.m52734c(abstractC18317n);
        } else {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c0 */
    private final void m19176c0() {
        m19167T().f47140g.f47635a.setImageDrawable(null);
        this.listAdapter = new C31650a1(null, m19170W(), this.isInternationalizedTeamViews);
        RecyclerView recyclerView = m19167T().f47141h;
        C31650a1 c31650a1 = this.listAdapter;
        if (c31650a1 == null) {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
        recyclerView.setAdapter(c31650a1);
        m19174a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m19177d0(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m19178e0(CommunityShowInviteFragment communityShowInviteFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityShowInviteFragment.m19159L();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m19179f0(CommunityShowInviteFragment communityShowInviteFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityShowInviteFragment.m19165R();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m19180g0(CommunityShowInviteFragment communityShowInviteFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(communityShowInviteFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h0 */
    private final void m19181h0(AbstractC13444b2 abstractC13444b2) {
        this.binding.setValue(this, f24906N[0], abstractC13444b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public final void m19182i0() {
        String communityName;
        DrawerDisplayInvite drawerDisplayInviteM97969k;
        Context contextRequireContext = requireContext();
        Resources resources = getResources();
        int i13 = AbstractC38505d0.f165655d1;
        C31665f1 c31665f1 = (C31665f1) m19170W().m97950L().getValue();
        if (c31665f1 == null || (drawerDisplayInviteM97969k = c31665f1.getInvite()) == null || (communityName = drawerDisplayInviteM97969k.getCommunityName()) == null) {
            communityName = "";
        }
        String string = resources.getString(i13, communityName);
        AbstractC22676k.m65749i(string, "getString(...)");
        AbstractC18737i.m54479d(contextRequireContext, string);
        if (m19169V().m81280a(AbstractC5583n.m16799z(this))) {
            C28198s c28198sM85259o = AbstractC28163g0.m85259o(this);
            AbstractC6332k.a aVarM19260a = AbstractC6332k.m19260a(1, "DAILY");
            C31665f1 c31665f2 = (C31665f1) m19170W().m97950L().getValue();
            Team teamMo97831b = c31665f2 != null ? c31665f2.getTeam() : null;
            AbstractC22676k.m65747g(teamMo97831b);
            AbstractC6332k.a aVarM19270k = aVarM19260a.m19270k(teamMo97831b);
            AbstractC22676k.m65749i(aVarM19270k, "setTeam(...)");
            c28198sM85259o.m85340f(aVarM19270k);
        }
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13444b2 abstractC13444b2M38173c = AbstractC13444b2.m38173c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13444b2M38173c, "inflate(...)");
        m19181h0(abstractC13444b2M38173c);
        AbstractC28163g0.m85256l(this);
        View root = m19167T().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        m19170W().m97954Q(false);
        this.teamLoaded = false;
        m19172Y();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewGroup.LayoutParams layoutParams = m19167T().f47142i.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        this.originalCloseButtonTopMargin = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = m19167T().f47135b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        this.originalDeclineButtonBottomMargin = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        m19163P();
        String strM123424c = m19166S().m123424c();
        if (strM123424c != null) {
            m19170W().m49139u(strM123424c);
        }
        AbstractC13444b2 abstractC13444b2M19167T = m19167T();
        RecyclerView recyclerView = abstractC13444b2M19167T.f47141h;
        AbstractC22676k.m65749i(recyclerView, "recyclerView");
        View root = abstractC13444b2M19167T.f47140g.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        int height = abstractC13444b2M19167T.f47140g.f47639e.getHeight();
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        this.scrollBehavior = new ParallaxHeaderBehavior(recyclerView, root, height, contextRequireContext, new C38448b(3));
        ViewGroup.LayoutParams layoutParams3 = abstractC13444b2M19167T.f47140g.getRoot().getLayoutParams();
        AbstractC22676k.m65748h(layoutParams3, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        C29960e c29960e = (C29960e) layoutParams3;
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
        StrokedPillButton joinButton = abstractC13444b2M19167T.f47136c;
        AbstractC22676k.m65749i(joinButton, "joinButton");
        AbstractC1953c.m5963a(joinButton, new C38526w(this, 1));
        StrokedPillButton declineButton = abstractC13444b2M19167T.f47135b;
        AbstractC22676k.m65749i(declineButton, "declineButton");
        AbstractC1953c.m5963a(declineButton, new C38526w(this, 2));
        ImageView showInviteToolbar = abstractC13444b2M19167T.f47142i;
        AbstractC22676k.m65749i(showInviteToolbar, "showInviteToolbar");
        AbstractC1953c.m5963a(showInviteToolbar, new C38526w(this, 3));
        DrawerDisplayInvite drawerDisplayInviteM123422a = m19166S().m123422a();
        if (drawerDisplayInviteM123422a != null) {
            m19170W().m97951M(drawerDisplayInviteM123422a);
        }
        DrawerDisplayInvite drawerDisplayInviteM123423b = m19166S().m123423b();
        if (drawerDisplayInviteM123423b != null) {
            m19170W().m97952N(drawerDisplayInviteM123423b);
        }
    }
}
