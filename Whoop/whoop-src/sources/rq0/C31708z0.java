package rq0;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.recyclerview.widget.AbstractC1740u1;
import androidx.recyclerview.widget.RecyclerView;
import c93.InterfaceC4339a;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.squareup.wire.AbstractC5583n;
import com.whoop.community.AbstractC6311c;
import com.whoop.community.presentation.p059ui.ParallaxHeaderBehavior;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.teams.Team;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.ScoreContext;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e50.C12724c;
import eq0.AbstractC13560z1;
import hj0.AbstractC17354m;
import il.C18615a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.Map;
import java.util.WeakHashMap;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p114eb.AbstractC12939a0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p217ib.AbstractC18317n;
import p413q4.AbstractC29957b;
import p413q4.C29960e;
import p465rm.C31559p;
import p543v4.C35643b;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import rm2.C31604d;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import xp0.AbstractC38499a0;
import xp0.AbstractC38505d0;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: rq0.z0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00109\u001a\u0002048\u0016X\u0096D¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\"\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010,R\u001a\u0010G\u001a\u00020*8\u0014X\u0094D¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\bE\u0010FR+\u0010P\u001a\u00020H2\u0006\u0010I\u001a\u00020H8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006R"}, m65681d2 = {"Lrq0/z0;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "W", "Q", "U", "S", "Lrq0/i1;", "state", "P", "(Lrq0/i1;)V", "I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "Lcom/whoop/domain/model/teams/Team;", "team", "O", "(Lcom/whoop/domain/model/teams/Team;)V", "N", "Lrq0/h1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "M", "()Lrq0/h1;", "viewModel", "Lrq0/a1;", "x", "Lrq0/a1;", "listAdapter", "", "y", "Z", "teamLoaded", "Landroidx/lifecycle/p0;", "Lib/n;", "Lcom/whoop/domain/model/teams/TeamUser;", "z", "Landroidx/lifecycle/p0;", "observedDataSource", "", "E", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lz82/b;", "F", "Lz82/b;", "analyticsManager", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "G", "L", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "H", "isInternationalizedTeamViews", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Leq0/z1;", "<set-?>", "J", "Lcom/whoop/ui/b;", "K", "()Leq0/z1;", "X", "(Leq0/z1;)V", "binding", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31708z0 extends AbstractC17354m {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private C31650a1 listAdapter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean teamLoaded;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private AbstractC1615p0 observedDataSource;

    /* JADX INFO: renamed from: L */
    static final /* synthetic */ InterfaceC21493z[] f131321L = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C31708z0.class, "binding", "getBinding()Lcom/whoop/community/databinding/FragmentTeamsOverviewBinding;", 0))};

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: M */
    public static final int f131322M = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new e(this, null, new d(this), null));

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String logTag = "TeamsDescriptionFragment";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager = (InterfaceC40188b) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository = AbstractC30060g.m92087G(EnumC23463i.f92933w, new c(this, null, null));

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean isInternationalizedTeamViews = m98347L().isFeatureEnabled(FeatureFlagRepositoryKt.INTERNATIONALIZED_TEAM_VIEWS);

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: rq0.z0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrq0/z0$a;", "", "<init>", "()V", "Lrq0/z0;", "a", "()Lrq0/z0;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C31708z0 m98360a() {
            return new C31708z0();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: rq0.z0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f131333w;

        public b(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f131333w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f131333w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f131333w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: rq0.z0$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f131334w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f131335x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f131336y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f131334w = componentCallbacks;
            this.f131335x = interfaceC35951a;
            this.f131336y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f131334w;
            InterfaceC35951a interfaceC35951a = this.f131335x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f131336y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: rq0.z0$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f131337w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f131337w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f131337w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f131337w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: rq0.z0$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f131338w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f131339x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f131340y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f131341z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f131338w = abstractComponentCallbacksC1320m0;
            this.f131339x = interfaceC35951a;
            this.f131340y = interfaceC4339a;
            this.f131341z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.h1] */
        @Override // c93.InterfaceC4339a
        public final C31671h1 invoke() {
            return AbstractC37056f.m118952D(this.f131338w, this.f131339x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31671h1.class), this.f131340y, this.f131341z);
        }
    }

    /* JADX INFO: renamed from: I */
    private final void m98344I() {
        View root = m98346K().getRoot();
        C31559p c31559p = new C31559p(this, 5);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c31559p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C16905q1 m98345J(C31708z0 c31708z0, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C35643b c35643bMo47530g = windowInsets.f64864a.mo47530g(2);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        RecyclerView recyclerView = c31708z0.m98346K().f47811f;
        AbstractC22676k.m65749i(recyclerView, "recyclerView");
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), c35643bMo47530g.f151452d);
        return windowInsets;
    }

    /* JADX INFO: renamed from: K */
    private final AbstractC13560z1 m98346K() {
        return (AbstractC13560z1) this.binding.getValue(this, f131321L[0]);
    }

    /* JADX INFO: renamed from: L */
    private final FeatureFlagRepository m98347L() {
        return (FeatureFlagRepository) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final C31671h1 m98348M() {
        return (C31671h1) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: P */
    private final void m98349P(C31674i1 state) {
        String iconUrl;
        Context context;
        Team team;
        String bannerUrl;
        Context context2;
        Map<ScoreContext, Boolean> mapM98097e = state.m98097e();
        ScoreContext scoreContext = ScoreContext.OVERVIEW;
        boolean zM65745e = AbstractC22676k.m65745e(mapM98097e.get(scoreContext), Boolean.FALSE);
        C40786k c40786k = C40786k.f175891b;
        if (zM65745e && (team = state.getTeam()) != null && (bannerUrl = team.getBannerUrl()) != null && (context2 = getContext()) != null) {
            C4964f c4964fM15549m = ComponentCallbacks2C4960b.m15528d(context2).m75567f(context2).m15549m(bannerUrl);
            c4964fM15549m.f20320X = C18615a.m53885b(200);
            ((C4964f) c4964fM15549m.m89314d(c40786k)).m15537y(m98346K().f47810e.f47636b);
            m98348M().m98049z0(scoreContext, true);
        }
        Team team2 = state.getTeam();
        if (team2 == null || (iconUrl = team2.getIconUrl()) == null || (context = getContext()) == null) {
            return;
        }
        ((C4964f) ComponentCallbacks2C4960b.m15528d(context).m75567f(context).m15549m(iconUrl).m89314d(c40786k)).m15537y(m98346K().f47810e.f47635a);
    }

    /* JADX INFO: renamed from: Q */
    private final void m98350Q() {
        C12724c<C31674i1> c12724cM98039j0 = m98348M().m98039j0();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        c12724cM98039j0.m35577c(viewLifecycleOwner, new C31706y0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m98351R(C31708z0 c31708z0, C31674i1 state) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC13560z1 abstractC13560z1M98346K = c31708z0.m98346K();
        c31708z0.m98349P(state);
        TextView textView = c31708z0.m98346K().f47810e.f47638d;
        Team team = state.getTeam();
        String string = null;
        textView.setText(team != null ? team.getName() : null);
        Map<ScoreContext, Boolean> mapM98101i = state.m98101i();
        ScoreContext scoreContext = ScoreContext.OVERVIEW;
        if (AbstractC22676k.m65745e(mapM98101i.get(scoreContext), Boolean.TRUE)) {
            if (state.getTeam() != null) {
                c31708z0.m98354U();
            }
            c31708z0.m98348M().m98043o0(scoreContext);
        }
        if (!state.getIsConnected() || state.getRequestFail()) {
            abstractC13560z1M98346K.f47807b.setVisibility(0);
            abstractC13560z1M98346K.f47812g.setVisibility(8);
            abstractC13560z1M98346K.f47808c.setVisibility(0);
            abstractC13560z1M98346K.f47811f.setVisibility(8);
            TextView textView2 = abstractC13560z1M98346K.f47809d;
            Context context = c31708z0.getContext();
            if (context != null) {
                string = context.getString(!state.getIsConnected() ? AbstractC38505d0.f165643a1 : AbstractC38505d0.f165647b1);
            }
            textView2.setText(string);
        } else if (!c31708z0.teamLoaded && state.getTeam() != null) {
            c31708z0.m98354U();
            c31708z0.teamLoaded = true;
        } else if (c31708z0.m98348M().mo97830c(scoreContext) == 0) {
            abstractC13560z1M98346K.f47811f.setVisibility(8);
            abstractC13560z1M98346K.f47807b.setVisibility(0);
            abstractC13560z1M98346K.f47808c.setVisibility(8);
            abstractC13560z1M98346K.f47812g.m26663f();
        } else if (state.getTeam() != null) {
            abstractC13560z1M98346K.f47811f.setVisibility(0);
            abstractC13560z1M98346K.f47807b.setVisibility(8);
            c31708z0.m98356W();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private final void m98352S() {
        AbstractC1615p0 abstractC1615p0 = this.observedDataSource;
        if (abstractC1615p0 != null) {
            abstractC1615p0.removeObservers(this);
        }
        AbstractC1615p0 abstractC1615p0M98028U = m98348M().getOverviewDataSource();
        this.observedDataSource = abstractC1615p0M98028U;
        if (abstractC1615p0M98028U != null) {
            abstractC1615p0M98028U.observe(this, new b(new C31706y0(this, 1)));
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
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m98353T(C31708z0 c31708z0, AbstractC18317n abstractC18317n) {
        C31650a1 c31650a1 = c31708z0.listAdapter;
        if (c31650a1 != null) {
            c31650a1.m52734c(abstractC18317n);
            return C23454a0.f92919a;
        }
        AbstractC22676k.m65757q("listAdapter");
        throw null;
    }

    /* JADX INFO: renamed from: U */
    private final void m98354U() {
        this.listAdapter = new C31650a1(this, m98348M(), this.isInternationalizedTeamViews);
        RecyclerView recyclerView = m98346K().f47811f;
        C31650a1 c31650a1 = this.listAdapter;
        if (c31650a1 == null) {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
        recyclerView.setAdapter(c31650a1);
        m98352S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m98355V(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private final void m98356W() {
        AbstractC1740u1 layoutManager = m98346K().f47811f.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
        ViewGroup.LayoutParams layoutParams = m98346K().f47810e.getRoot().getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        AbstractC29957b abstractC29957b = ((C29960e) layoutParams).f122364a;
        AbstractC22676k.m65748h(abstractC29957b, "null cannot be cast to non-null type com.whoop.community.presentation.ui.ParallaxHeaderBehavior");
        View root = m98346K().f47810e.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ((ParallaxHeaderBehavior) abstractC29957b).m19532I(root);
    }

    /* JADX INFO: renamed from: X */
    private final void m98357X(AbstractC13560z1 abstractC13560z1) {
        this.binding.setValue(this, f131321L[0], abstractC13560z1);
    }

    /* JADX INFO: renamed from: N */
    public final void m98358N(Team team) {
        AbstractC22676k.m65750j(team, "team");
        this.analyticsManager.mo41424f("Teams", "Add Members", "Team - Manage", "Description");
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(this);
        AbstractC6311c.a aVarM19197a = AbstractC6311c.m19197a(team);
        AbstractC22676k.m65749i(aVarM19197a, "actionCommunityFragmentT…ityAddMemberFragment(...)");
        abstractC12939a0M16799z.m36407v(aVarM19197a);
    }

    /* JADX INFO: renamed from: O */
    public final void m98359O(Team team) {
        AbstractC22676k.m65750j(team, "team");
        this.analyticsManager.mo41424f("Reviewing Data", "Edit", "Team Overview", "Team Overview");
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(this);
        AbstractC6311c.b bVarM19198b = AbstractC6311c.m19198b(team.getId());
        AbstractC22676k.m65749i(bVarM19198b, "actionCommunityFragmentT…tyManageTeamFragment(...)");
        abstractC12939a0M16799z.m36407v(bVarM19198b);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13560z1 abstractC13560z1M38272c = AbstractC13560z1.m38272c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13560z1M38272c, "inflate(...)");
        m98357X(abstractC13560z1M38272c);
        AbstractC28163g0.m85256l(this);
        return m98346K().getRoot();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        m98348M().m98049z0(ScoreContext.OVERVIEW, false);
        this.teamLoaded = false;
        m98356W();
        m98350Q();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m98344I();
        ViewGroup.LayoutParams layoutParams = m98346K().f47810e.getRoot().getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        C29960e c29960e = (C29960e) layoutParams;
        RecyclerView recyclerView = m98346K().f47811f;
        AbstractC22676k.m65749i(recyclerView, "recyclerView");
        View root = m98346K().f47810e.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        int height = m98346K().f47810e.f47639e.getHeight();
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        c29960e.m91654b(new ParallaxHeaderBehavior(recyclerView, root, height, contextRequireContext, new C31604d(8)));
        int i13 = AbstractC38499a0.f165188T5;
        c29960e.f122375l = null;
        c29960e.f122374k = null;
        c29960e.f122369f = i13;
        c29960e.f122367d = 3;
        c29960e.f122366c = 3;
        m98346K().f47810e.getRoot().requestLayout();
    }
}
