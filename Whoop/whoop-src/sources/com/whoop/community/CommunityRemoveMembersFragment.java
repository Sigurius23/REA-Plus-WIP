package com.whoop.community;

import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.recyclerview.widget.RecyclerView;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamUser;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import eq0.AbstractC13543v1;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.utils.DialogInterfaceOnClickListenerC19904c;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nq0.C27053p;
import or2.AbstractC28163g0;
import or2.C28198s;
import p000.AbstractC11266d;
import p114eb.C12962i;
import p217ib.AbstractC18317n;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p579wc.C37082e1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22686q;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rq0.C31673i0;
import rq0.C31676j0;
import rq0.ViewOnFocusChangeListenerC31661e0;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32417h;
import vf3.InterfaceC35951a;
import vq0.AbstractC36281e;
import vu1.AbstractC36518i;
import xp0.AbstractC38505d0;
import xp0.C38522s;
import xp0.C38524u;
import xp0.C38525v;
import xp0.DialogInterfaceOnClickListenerC38523t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0003J3\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u000e0!2\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u000e0!H\u0002¢\u0006\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R+\u0010C\u001a\u00020;2\u0006\u0010<\u001a\u00020;8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, m65681d2 = {"Lcom/whoop/community/CommunityRemoveMembersFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "b0", "e0", "Lcom/whoop/domain/model/teams/TeamUser;", UserState.Sources.USER, "m0", "(Lcom/whoop/domain/model/teams/TeamUser;)V", "q0", "h0", "W", "X", "", "text", "t0", "(Ljava/lang/String;)V", "k0", "Lkotlin/Function1;", "Landroid/text/Editable;", "f", "U", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lrq0/i0;", "x", "Ll83/h;", "a0", "()Lrq0/i0;", "viewModel", "Lnq0/p;", "y", "Lnq0/p;", "listAdapter", "Lxp0/v;", "z", "Leb/i;", "Y", "()Lxp0/v;", "args", "Leq0/v1;", "<set-?>", "E", "Lcom/whoop/ui/b;", "Z", "()Leq0/v1;", "p0", "(Leq0/v1;)V", "binding", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CommunityRemoveMembersFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: F */
    static final /* synthetic */ InterfaceC21493z[] f24883F = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(CommunityRemoveMembersFragment.class, "binding", "getBinding()Lcom/whoop/community/databinding/FragmentTeamRemoveMembersBinding;", 0))};

    /* JADX INFO: renamed from: G */
    public static final int f24884G = 8;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private C27053p listAdapter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "CommunityRemoveMembersFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6300g(this, null, new C6299f(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38525v.class), new C6298e(this));

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: com.whoop.community.CommunityRemoveMembersFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityRemoveMembersFragment$debouncer$1$1", m100430f = "CommunityRemoveMembersFragment.kt", m100431l = {190}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6294a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24890w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f24891x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Editable f24892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6294a(Function1 function1, Editable editable, InterfaceC30057d<? super C6294a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24891x = function1;
            this.f24892y = editable;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C6294a(this.f24891x, this.f24892y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6294a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24890w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f24890w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f24891x.invoke(this.f24892y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityRemoveMembersFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityRemoveMembersFragment$doRemoveMember$1", m100430f = "CommunityRemoveMembersFragment.kt", m100431l = {118}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6295b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24893w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TeamUser f24895y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6295b(TeamUser teamUser, InterfaceC30057d<? super C6295b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24895y = teamUser;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CommunityRemoveMembersFragment.this.new C6295b(this.f24895y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6295b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24893w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31673i0 c31673i0M19131a0 = CommunityRemoveMembersFragment.this.m19131a0();
                int id4 = this.f24895y.getId();
                this.f24893w = 1;
                obj = c31673i0M19131a0.m98077r(id4, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                Toast.makeText(CommunityRemoveMembersFragment.this.requireContext(), CommunityRemoveMembersFragment.this.getResources().getString(AbstractC38505d0.f165695n1, this.f24895y.getFullName()), 1).show();
                CommunityRemoveMembersFragment.this.m19141k0();
            } else {
                Toast.makeText(CommunityRemoveMembersFragment.this.requireContext(), CommunityRemoveMembersFragment.this.getResources().getString(AbstractC38505d0.f165699o1), 1).show();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityRemoveMembersFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityRemoveMembersFragment$doTransferOwnership$1", m100430f = "CommunityRemoveMembersFragment.kt", m100431l = {137}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6296c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24896w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TeamUser f24898y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6296c(TeamUser teamUser, InterfaceC30057d<? super C6296c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24898y = teamUser;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CommunityRemoveMembersFragment.this.new C6296c(this.f24898y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6296c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24896w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31673i0 c31673i0M19131a0 = CommunityRemoveMembersFragment.this.m19131a0();
                int id4 = this.f24898y.getId();
                this.f24896w = 1;
                obj = c31673i0M19131a0.m98079v(id4, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                Toast.makeText(CommunityRemoveMembersFragment.this.requireContext(), CommunityRemoveMembersFragment.this.getResources().getString(AbstractC38505d0.f165703p1, this.f24898y.getFullName()), 1).show();
                C28198s c28198sM85259o = AbstractC28163g0.m85259o(CommunityRemoveMembersFragment.this);
                AbstractC6331j.a aVarM19259k = AbstractC6331j.m19249a(1, "DAILY").m19259k(CommunityRemoveMembersFragment.this.m19129Y().m123421b());
                AbstractC22676k.m65749i(aVarM19259k, "setTeam(...)");
                c28198sM85259o.m85340f(aVarM19259k);
            } else {
                Toast.makeText(CommunityRemoveMembersFragment.this.requireContext(), CommunityRemoveMembersFragment.this.getResources().getString(AbstractC38505d0.f165707q1), 1).show();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityRemoveMembersFragment$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/community/CommunityRemoveMembersFragment$d", "Lvq0/e;", "Landroid/text/Editable;", "s", "Ll83/a0;", "afterTextChanged", "(Landroid/text/Editable;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6297d extends AbstractC36281e {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f24899w;

        public C6297d(Function1 function1) {
            this.f24899w = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s13) {
            this.f24899w.invoke(s13);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityRemoveMembersFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6298e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24900w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6298e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24900w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f24900w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f24900w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityRemoveMembersFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6299f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24901w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6299f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24901w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24901w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityRemoveMembersFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6300g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24902w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24903x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24904y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24905z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6300g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24902w = componentCallbacks;
            this.f24903x = interfaceC35951a;
            this.f24904y = interfaceC4339a;
            this.f24905z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.i0] */
        @Override // c93.InterfaceC4339a
        public final C31673i0 invoke() {
            return AbstractC34132o.m107857B(this.f24902w, this.f24903x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31673i0.class), this.f24904y, this.f24905z);
        }
    }

    /* JADX INFO: renamed from: U */
    private final Function1 m19125U(Function1 f13) {
        return new C37082e1(new C22669g0(), this, f13, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m19126V(C22669g0 c22669g0, CommunityRemoveMembersFragment communityRemoveMembersFragment, Function1 function1, Editable editable) {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c22669g0.f89336w;
        if (interfaceC3027k1 == null || interfaceC3027k1.isCompleted()) {
            InterfaceC1585g0 viewLifecycleOwner = communityRemoveMembersFragment.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            c22669g0.f89336w = AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C6294a(function1, editable, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private final void m19127W(TeamUser user) {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C6295b(user, null), 3);
    }

    /* JADX INFO: renamed from: X */
    private final void m19128X(TeamUser user) {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C6296c(user, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final C38525v m19129Y() {
        return (C38525v) this.args.getValue();
    }

    /* JADX INFO: renamed from: Z */
    private final AbstractC13543v1 m19130Z() {
        return (AbstractC13543v1) this.binding.getValue(this, f24883F[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public final C31673i0 m19131a0() {
        return (C31673i0) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: b0 */
    private final void m19132b0() {
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        this.listAdapter = new C27053p(abstractActivityC1340r0RequireActivity, m19131a0(), m19129Y().m123420a(), new C38522s(this, 2), new C38522s(this, 3));
        RecyclerView recyclerView = m19130Z().f47711b;
        C27053p c27053p = this.listAdapter;
        if (c27053p == null) {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
        recyclerView.setAdapter(c27053p);
        m19150t0("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m19133c0(CommunityRemoveMembersFragment communityRemoveMembersFragment, TeamUser it) {
        AbstractC22676k.m65750j(it, "it");
        communityRemoveMembersFragment.m19143m0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m19134d0(CommunityRemoveMembersFragment communityRemoveMembersFragment, TeamUser it) {
        AbstractC22676k.m65750j(it, "it");
        communityRemoveMembersFragment.m19147q0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e0 */
    private final void m19135e0() {
        m19130Z().f47715f.setOnFocusChangeListener(new ViewOnFocusChangeListenerC31661e0(this, 7));
        m19130Z().f47715f.addTextChangedListener(new C6297d(m19125U(new C38522s(this, 4))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m19136f0(CommunityRemoveMembersFragment communityRemoveMembersFragment, View view, boolean z4) {
        AbstractC32417h.m101189T(communityRemoveMembersFragment.m19130Z().f47714e, !z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m19137g0(CommunityRemoveMembersFragment communityRemoveMembersFragment, Editable editable) {
        communityRemoveMembersFragment.m19150t0(String.valueOf(editable));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h0 */
    private final void m19138h0() {
        m19131a0().m98074o().m35577c(this, new C38522s(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m19139i0(CommunityRemoveMembersFragment communityRemoveMembersFragment, C31676j0 state) {
        AbstractC22676k.m65750j(state, "state");
        if (state.getLoading()) {
            communityRemoveMembersFragment.m19130Z().f47711b.setVisibility(8);
            communityRemoveMembersFragment.m19130Z().f47710a.setVisibility(0);
            communityRemoveMembersFragment.m19130Z().f47716g.m26663f();
        } else {
            communityRemoveMembersFragment.m19130Z().f47711b.setVisibility(0);
            communityRemoveMembersFragment.m19130Z().f47710a.setVisibility(8);
            communityRemoveMembersFragment.m19130Z().f47716g.m26664g();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m19140j0(CommunityRemoveMembersFragment communityRemoveMembersFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(communityRemoveMembersFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final void m19141k0() {
        AbstractC1615p0 abstractC1615p0M98073l = m19131a0().getDataSource();
        if (abstractC1615p0M98073l != null) {
            abstractC1615p0M98073l.removeObservers(this);
        }
        m19131a0().m98076q();
        AbstractC1615p0 abstractC1615p0M98073l2 = m19131a0().getDataSource();
        if (abstractC1615p0M98073l2 != null) {
            abstractC1615p0M98073l2.observe(getViewLifecycleOwner(), new C38524u(this, 0));
        }
        C27053p c27053p = this.listAdapter;
        if (c27053p != null) {
            c27053p.notifyDataSetChanged();
        } else {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m19142l0(CommunityRemoveMembersFragment communityRemoveMembersFragment, AbstractC18317n abstractC18317n) {
        C27053p c27053p = communityRemoveMembersFragment.listAdapter;
        if (c27053p != null) {
            c27053p.m52734c(abstractC18317n);
        } else {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
    }

    /* JADX INFO: renamed from: m0 */
    private final void m19143m0(TeamUser user) {
        new AlertDialog.Builder(requireContext(), AbstractC36518i.f156128b).setTitle(AbstractC38505d0.f165600M0).setMessage(getResources().getString(AbstractC38505d0.f165597L0, user.getFullName())).setPositiveButton(AbstractC38505d0.f165713s, new DialogInterfaceOnClickListenerC38523t(this, user, 0)).setNegativeButton(AbstractC38505d0.f165709r, new DialogInterfaceOnClickListenerC19904c(8)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m19144n0(CommunityRemoveMembersFragment communityRemoveMembersFragment, TeamUser teamUser, DialogInterface dialogInterface, int i13) {
        communityRemoveMembersFragment.m19127W(teamUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m19145o0(DialogInterface dialogInterface, int i13) {
    }

    /* JADX INFO: renamed from: p0 */
    private final void m19146p0(AbstractC13543v1 abstractC13543v1) {
        this.binding.setValue(this, f24883F[0], abstractC13543v1);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m19147q0(TeamUser user) {
        new AlertDialog.Builder(requireContext(), AbstractC36518i.f156128b).setTitle(AbstractC38505d0.f165606O0).setMessage(getResources().getString(AbstractC38505d0.f165603N0, user.getFullName())).setPositiveButton(AbstractC38505d0.f165713s, new DialogInterfaceOnClickListenerC38523t(this, user, 1)).setNegativeButton(AbstractC38505d0.f165709r, new DialogInterfaceOnClickListenerC19904c(9)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m19148r0(CommunityRemoveMembersFragment communityRemoveMembersFragment, TeamUser teamUser, DialogInterface dialogInterface, int i13) {
        communityRemoveMembersFragment.m19128X(teamUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m19149s0(DialogInterface dialogInterface, int i13) {
    }

    /* JADX INFO: renamed from: t0 */
    private final void m19150t0(String text) {
        AbstractC1615p0 abstractC1615p0M98073l = m19131a0().getDataSource();
        if (abstractC1615p0M98073l != null) {
            abstractC1615p0M98073l.removeObservers(this);
        }
        m19131a0().m98081y(text);
        AbstractC1615p0 abstractC1615p0M98073l2 = m19131a0().getDataSource();
        if (abstractC1615p0M98073l2 != null) {
            abstractC1615p0M98073l2.observe(getViewLifecycleOwner(), new C38524u(this, 1));
        }
        C27053p c27053p = this.listAdapter;
        if (c27053p != null) {
            c27053p.notifyDataSetChanged();
        } else {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m19151u0(CommunityRemoveMembersFragment communityRemoveMembersFragment, AbstractC18317n abstractC18317n) {
        C27053p c27053p = communityRemoveMembersFragment.listAdapter;
        if (c27053p != null) {
            c27053p.m52734c(abstractC18317n);
        } else {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC13543v1 abstractC13543v1M38261c = AbstractC13543v1.m38261c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13543v1M38261c, "inflate(...)");
        m19146p0(abstractC13543v1M38261c);
        View root = m19130Z().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        m19138h0();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C38525v c38525vM19129Y = m19129Y();
        C31673i0 c31673i0M19131a0 = m19131a0();
        Team teamM123421b = c38525vM19129Y.m123421b();
        AbstractC22676k.m65749i(teamM123421b, "getTeamid(...)");
        c31673i0M19131a0.m98075p(teamM123421b);
        WhoopNewToolbar whoopNewToolbar = m19130Z().f47713d;
        if (c38525vM19129Y.m123420a()) {
            whoopNewToolbar.setToolbarTitle(AbstractC38505d0.f165680j2);
        } else {
            whoopNewToolbar.setToolbarTitle(AbstractC38505d0.f165672h2);
        }
        whoopNewToolbar.m26687n(new C38522s(this, 0));
        m19135e0();
        m19132b0();
    }
}
