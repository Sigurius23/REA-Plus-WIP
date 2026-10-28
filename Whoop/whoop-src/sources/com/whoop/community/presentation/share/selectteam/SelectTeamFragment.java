package com.whoop.community.presentation.share.selectteam;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.recyclerview.widget.RecyclerView;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.google.gson.Gson;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.Widget;
import com.whoop.domain.model.teams.share.SelectTeam;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13483j1;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import or2.AbstractC28163g0;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pq0.C29470e;
import pq0.C29471f;
import q83.AbstractC30060g;
import qo1.C30527b;
import qq0.C30545a;
import qq0.C30546b;
import qq0.C30548d;
import qq0.C30549e;
import r80.AbstractC31061c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import xp0.AbstractC38505d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R+\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\bB\u0010C¨\u0006E"}, m65681d2 = {"Lcom/whoop/community/presentation/share/selectteam/SelectTeamFragment;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "Q", "J", "U", "", "emptyState", "P", "(Z)V", "a0", "Z", "Lcom/whoop/domain/model/teams/share/SelectTeam;", "selectTeam", "W", "(Lcom/whoop/domain/model/teams/share/SelectTeam;)V", "Lcom/whoop/domain/model/teams/Team;", "team", "T", "(Lcom/whoop/domain/model/teams/Team;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Leq0/j1;", "<set-?>", "x", "Lcom/whoop/ui/b;", "K", "()Leq0/j1;", "Y", "(Leq0/j1;)V", "fragmentSelectTeamBinding", "Lqq0/d;", "y", "Ll83/h;", "N", "()Lqq0/d;", "selectTeamViewModel", "Lpq0/f;", "z", "L", "()Lpq0/f;", "globalShareDialogViewModel", "Lqq0/a;", "E", "Lqq0/a;", "selectTeamAdapter", "Lcom/google/gson/Gson;", "F", "M", "()Lcom/google/gson/Gson;", "gson", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SelectTeamFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: G */
    static final /* synthetic */ InterfaceC21493z[] f25018G = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(SelectTeamFragment.class, "fragmentSelectTeamBinding", "getFragmentSelectTeamBinding()Lcom/whoop/community/databinding/FragmentSelectTeamBinding;", 0))};

    /* JADX INFO: renamed from: H */
    public static final int f25019H = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C30545a selectTeamAdapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h gson;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SelectTeamFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C10462b fragmentSelectTeamBinding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h selectTeamViewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h globalShareDialogViewModel;

    /* JADX INFO: renamed from: com.whoop.community.presentation.share.selectteam.SelectTeamFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6352a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f25026w;

        public C6352a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f25026w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f25026w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25026w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.share.selectteam.SelectTeamFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6353b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f25027w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6353b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f25027w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f25027w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f25027w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.share.selectteam.SelectTeamFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6354c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f25028w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25029x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25030y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25031z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6354c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25028w = abstractComponentCallbacksC1320m0;
            this.f25029x = interfaceC35951a;
            this.f25030y = interfaceC4339a;
            this.f25031z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, pq0.f] */
        @Override // c93.InterfaceC4339a
        public final C29471f invoke() {
            return AbstractC37056f.m118952D(this.f25028w, this.f25029x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29471f.class), this.f25030y, this.f25031z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.share.selectteam.SelectTeamFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6355d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25032w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6355d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25032w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25032w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.share.selectteam.SelectTeamFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6356e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25033w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25034x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25035y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25036z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6356e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25033w = componentCallbacks;
            this.f25034x = interfaceC35951a;
            this.f25035y = interfaceC4339a;
            this.f25036z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, qq0.d] */
        @Override // c93.InterfaceC4339a
        public final C30548d invoke() {
            return AbstractC34132o.m107857B(this.f25033w, this.f25034x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30548d.class), this.f25035y, this.f25036z);
        }
    }

    public SelectTeamFragment() {
        C6355d c6355d = new C6355d(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.selectTeamViewModel = AbstractC30060g.m92087G(enumC23463i, new C6356e(this, null, c6355d, null));
        this.globalShareDialogViewModel = AbstractC30060g.m92087G(enumC23463i, new C6354c(this, null, new C6353b(this), null));
        this.selectTeamAdapter = new C30545a(new C30546b(this, 3));
        this.gson = AbstractC30060g.m92088H(new C30527b(15));
    }

    /* JADX INFO: renamed from: J */
    private final void m19393J() {
        m19409Z();
        m19397N().m93646C();
    }

    /* JADX INFO: renamed from: K */
    private final AbstractC13483j1 m19394K() {
        return (AbstractC13483j1) this.fragmentSelectTeamBinding.getValue(this, f25018G[0]);
    }

    /* JADX INFO: renamed from: L */
    private final C29471f m19395L() {
        return (C29471f) this.globalShareDialogViewModel.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final Gson m19396M() {
        return (Gson) this.gson.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final C30548d m19397N() {
        return (C30548d) this.selectTeamViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final Gson m19398O() {
        return new Gson();
    }

    /* JADX INFO: renamed from: P */
    private final void m19399P(boolean emptyState) {
        AbstractC13483j1 abstractC13483j1M19394K = m19394K();
        View root = abstractC13483j1M19394K.f47384b.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(emptyState ? 0 : 8);
        TextView selectTeamLabel = abstractC13483j1M19394K.f47385c;
        AbstractC22676k.m65749i(selectTeamLabel, "selectTeamLabel");
        selectTeamLabel.setVisibility(!emptyState ? 0 : 8);
        RecyclerView selectTeamRecyclerview = abstractC13483j1M19394K.f47386d;
        AbstractC22676k.m65749i(selectTeamRecyclerview, "selectTeamRecyclerview");
        selectTeamRecyclerview.setVisibility(emptyState ? 8 : 0);
    }

    /* JADX INFO: renamed from: Q */
    private final void m19400Q() {
        m19394K().f47386d.setAdapter(this.selectTeamAdapter);
        StrokedPillButton selectTeamDiscoverTeams = m19394K().f47384b.f47414a;
        AbstractC22676k.m65749i(selectTeamDiscoverTeams, "selectTeamDiscoverTeams");
        AbstractC1953c.m5963a(selectTeamDiscoverTeams, new C30546b(this, 1));
        ImageView selectTeamBack = m19394K().f47383a;
        AbstractC22676k.m65749i(selectTeamBack, "selectTeamBack");
        AbstractC1953c.m5963a(selectTeamBack, new C30546b(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m19401R(SelectTeamFragment selectTeamFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0RequireParentFragment = selectTeamFragment.requireParentFragment();
        AbstractC22676k.m65748h(abstractComponentCallbacksC1320m0RequireParentFragment, "null cannot be cast to non-null type com.whoop.community.presentation.share.GlobalShareDialogFragment");
        ((C29470e) abstractComponentCallbacksC1320m0RequireParentFragment).dismiss();
        selectTeamFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(selectTeamFragment.getString(AbstractC38505d0.f165596L))));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m19402S(SelectTeamFragment selectTeamFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        selectTeamFragment.requireActivity().getOnBackPressedDispatcher().m43018d();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private final void m19403T(Team team) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0RequireParentFragment = requireParentFragment();
        AbstractC22676k.m65748h(abstractComponentCallbacksC1320m0RequireParentFragment, "null cannot be cast to non-null type com.whoop.community.presentation.share.GlobalShareDialogFragment");
        ((C29470e) abstractComponentCallbacksC1320m0RequireParentFragment).dismiss();
        String json = m19396M().toJson(team);
        Widget widgetM89988F = m19395L().getSelectedWidget();
        AbstractC28163g0.m85259o(this).m85338d(Uri.parse(AbstractC31061c.m95640p("android-app://com.whoop/communityFragment?pillarType=1&timePeriod=DAILY&widgetUrl=", widgetM89988F != null ? widgetM89988F.getImageUrl() : null, "&teamString=", json)));
    }

    /* JADX INFO: renamed from: U */
    private final void m19404U() {
        observe(m19397N().getSelectTeamViewStateLiveData(), new C6352a(new C30546b(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m19405V(SelectTeamFragment selectTeamFragment, C30549e it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.getTeam() != null) {
            selectTeamFragment.m19403T(it.getTeam());
        } else {
            selectTeamFragment.m19399P(it.getEmptyState());
            if (!it.m93650b().isEmpty()) {
                selectTeamFragment.selectTeamAdapter.m93637c(it.m93650b());
            }
            selectTeamFragment.m19410a0();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private final void m19406W(SelectTeam selectTeam) {
        getEventDispatcher().m129039j0("Press", "Share Data - Choose Team", AbstractC25247g0.m73989X(new C23465k("CommunityId", Integer.valueOf(selectTeam.getCommunityId()))));
        m19397N().m93647D(selectTeam.getCommunityId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m19407X(SelectTeamFragment selectTeamFragment, SelectTeam selectTeam) {
        AbstractC22676k.m65750j(selectTeam, "selectTeam");
        selectTeamFragment.m19406W(selectTeam);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y */
    private final void m19408Y(AbstractC13483j1 abstractC13483j1) {
        this.fragmentSelectTeamBinding.setValue(this, f25018G[0], abstractC13483j1);
    }

    /* JADX INFO: renamed from: Z */
    private final void m19409Z() {
        ThrobberView throbberView = m19394K().f47387e;
        throbberView.m26663f();
        throbberView.setVisibility(0);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m19410a0() {
        ThrobberView throbberView = m19394K().f47387e;
        throbberView.m26664g();
        throbberView.setVisibility(8);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13483j1 abstractC13483j1M38204c = AbstractC13483j1.m38204c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13483j1M38204c, "inflate(...)");
        m19408Y(abstractC13483j1M38204c);
        View root = m19394K().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m19400Q();
        m19404U();
        m19393J();
    }
}
