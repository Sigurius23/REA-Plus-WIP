package com.whoop.community.presentation.teams;

import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3061u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamUser;
import com.whoop.service.network.model.UserState;
import eq0.AbstractC13476i;
import hc3.AbstractC17182o;
import hj0.AbstractActivityC17347f;
import io.getstream.chat.android.p226ui.utils.DialogInterfaceOnClickListenerC19904c;
import jf3.C21647a;
import kc3.C22365e;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p132f0.C13819r;
import p217ib.AbstractC18317n;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import rq0.C31658d0;
import rq0.C31667g0;
import rq0.C31673i0;
import rq0.C31676j0;
import rq0.DialogInterfaceOnClickListenerC31664f0;
import rq0.ViewOnFocusChangeListenerC31661e0;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32417h;
import vf3.InterfaceC35951a;
import vq0.AbstractC36281e;
import vu1.AbstractC36518i;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J;\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00050\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001c\u0010\u0004J\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\nJ\u0015\u0010\u001e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\nR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;", "Lhj0/f;", "Lbc3/c0;", "<init>", "()V", "Ll83/a0;", "U", "Lcom/whoop/domain/model/teams/TeamUser;", UserState.Sources.USER, "R", "(Lcom/whoop/domain/model/teams/TeamUser;)V", "S", "", "text", "g0", "(Ljava/lang/String;)V", "Y", "", "delayMs", "Lkotlin/Function1;", "Landroid/text/Editable;", "f", "P", "(JLkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "a0", "d0", "", "I", "Z", "isTransfer", "Lrq0/i0;", "J", "Ll83/h;", "T", "()Lrq0/i0;", "viewModel", "Lrq0/g0;", "K", "Lrq0/g0;", "listAdapter", "Lbc3/u;", "L", "Lbc3/u;", "job", "Leq0/i;", "M", "Leq0/i;", "binding", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "N", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TeamRemoveMembersActivity extends AbstractActivityC17347f implements InterfaceC2994c0 {

    /* JADX INFO: renamed from: O */
    public static final int f25066O = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isTransfer;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private C31667g0 listAdapter;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private AbstractC13476i binding;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6373g(this, null, new C6372f(this), null));

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC3061u job = AbstractC3006f0.m8710d();

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamRemoveMembersActivity$b */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamRemoveMembersActivity$debouncer$1$1", m100430f = "TeamRemoveMembersActivity.kt", m100431l = {187}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6368b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25072w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ long f25073x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f25074y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Editable f25075z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6368b(long j7, Function1 function1, Editable editable, InterfaceC30057d<? super C6368b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25073x = j7;
            this.f25074y = function1;
            this.f25075z = editable;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C6368b(this.f25073x, this.f25074y, this.f25075z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6368b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25072w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long j7 = this.f25073x;
                this.f25072w = 1;
                if (AbstractC3034m0.m8782b(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f25074y.invoke(this.f25075z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamRemoveMembersActivity$c */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamRemoveMembersActivity$doRemoveMember$1", m100430f = "TeamRemoveMembersActivity.kt", m100431l = {118}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6369c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25076w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TeamUser f25078y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6369c(TeamUser teamUser, InterfaceC30057d<? super C6369c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25078y = teamUser;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TeamRemoveMembersActivity.this.new C6369c(this.f25078y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6369c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25076w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31673i0 c31673i0M19459T = TeamRemoveMembersActivity.this.m19459T();
                int id4 = this.f25078y.getId();
                this.f25076w = 1;
                obj = c31673i0M19459T.m98077r(id4, this);
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
                TeamRemoveMembersActivity teamRemoveMembersActivity = TeamRemoveMembersActivity.this;
                Toast.makeText(teamRemoveMembersActivity, teamRemoveMembersActivity.getResources().getString(AbstractC38505d0.f165695n1, this.f25078y.getFullName()), 1).show();
                TeamRemoveMembersActivity.this.m19464Y();
            } else {
                TeamRemoveMembersActivity teamRemoveMembersActivity2 = TeamRemoveMembersActivity.this;
                Toast.makeText(teamRemoveMembersActivity2, teamRemoveMembersActivity2.getResources().getString(AbstractC38505d0.f165699o1), 1).show();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamRemoveMembersActivity$d */
    @InterfaceC32271e(m100429c = "com.whoop.community.presentation.teams.TeamRemoveMembersActivity$doTransferOwnership$1", m100430f = "TeamRemoveMembersActivity.kt", m100431l = {137}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6370d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25079w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TeamUser f25081y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6370d(TeamUser teamUser, InterfaceC30057d<? super C6370d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25081y = teamUser;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TeamRemoveMembersActivity.this.new C6370d(this.f25081y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6370d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25079w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31673i0 c31673i0M19459T = TeamRemoveMembersActivity.this.m19459T();
                int id4 = this.f25081y.getId();
                this.f25079w = 1;
                obj = c31673i0M19459T.m98079v(id4, this);
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
                TeamRemoveMembersActivity teamRemoveMembersActivity = TeamRemoveMembersActivity.this;
                Toast.makeText(teamRemoveMembersActivity, teamRemoveMembersActivity.getResources().getString(AbstractC38505d0.f165703p1, this.f25081y.getFullName()), 1).show();
                TeamRemoveMembersActivity.this.setResult(809);
                TeamRemoveMembersActivity.this.finish();
            } else {
                TeamRemoveMembersActivity teamRemoveMembersActivity2 = TeamRemoveMembersActivity.this;
                Toast.makeText(teamRemoveMembersActivity2, teamRemoveMembersActivity2.getResources().getString(AbstractC38505d0.f165707q1), 1).show();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamRemoveMembersActivity$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/community/presentation/teams/TeamRemoveMembersActivity$e", "Lvq0/e;", "Landroid/text/Editable;", "s", "Ll83/a0;", "afterTextChanged", "(Landroid/text/Editable;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6371e extends AbstractC36281e {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f25082w;

        public C6371e(Function1 function1) {
            this.f25082w = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s13) {
            this.f25082w.invoke(s13);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamRemoveMembersActivity$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6372f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25083w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6372f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25083w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25083w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.presentation.teams.TeamRemoveMembersActivity$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6373g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25084w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25085x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25086y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25087z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6373g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25084w = componentCallbacks;
            this.f25085x = interfaceC35951a;
            this.f25086y = interfaceC4339a;
            this.f25087z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.i0] */
        @Override // c93.InterfaceC4339a
        public final C31673i0 invoke() {
            return AbstractC34132o.m107857B(this.f25084w, this.f25085x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31673i0.class), this.f25086y, this.f25087z);
        }
    }

    /* JADX INFO: renamed from: P */
    private final Function1 m19455P(long delayMs, Function1 f13) {
        return new C13819r(new C22669g0(), this, delayMs, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m19456Q(C22669g0 c22669g0, TeamRemoveMembersActivity teamRemoveMembersActivity, long j7, Function1 function1, Editable editable) {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c22669g0.f89336w;
        if (interfaceC3027k1 == null || interfaceC3027k1.isCompleted()) {
            c22669g0.f89336w = AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(teamRemoveMembersActivity.getCoroutineContext()), null, null, new C6368b(j7, function1, editable, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private final void m19457R(TeamUser user) {
        AbstractC3006f0.m8732z(this, null, null, new C6369c(user, null), 3);
    }

    /* JADX INFO: renamed from: S */
    private final void m19458S(TeamUser user) {
        AbstractC3006f0.m8732z(this, null, null, new C6370d(user, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final C31673i0 m19459T() {
        return (C31673i0) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: U */
    private final void m19460U() {
        m19459T().m98074o().m35577c(this, new C31658d0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m19461V(TeamRemoveMembersActivity teamRemoveMembersActivity, C31676j0 state) {
        AbstractC22676k.m65750j(state, "state");
        if (state.getLoading()) {
            AbstractC13476i abstractC13476i = teamRemoveMembersActivity.binding;
            if (abstractC13476i == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC13476i.f47338b.setVisibility(8);
            AbstractC13476i abstractC13476i2 = teamRemoveMembersActivity.binding;
            if (abstractC13476i2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC13476i2.f47337a.setVisibility(0);
            AbstractC13476i abstractC13476i3 = teamRemoveMembersActivity.binding;
            if (abstractC13476i3 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC13476i3.f47341e.m26663f();
        } else {
            AbstractC13476i abstractC13476i4 = teamRemoveMembersActivity.binding;
            if (abstractC13476i4 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC13476i4.f47338b.setVisibility(0);
            AbstractC13476i abstractC13476i5 = teamRemoveMembersActivity.binding;
            if (abstractC13476i5 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC13476i5.f47337a.setVisibility(8);
            AbstractC13476i abstractC13476i6 = teamRemoveMembersActivity.binding;
            if (abstractC13476i6 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC13476i6.f47341e.m26664g();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final void m19462W(TeamRemoveMembersActivity teamRemoveMembersActivity, View view, boolean z4) {
        AbstractC13476i abstractC13476i = teamRemoveMembersActivity.binding;
        if (abstractC13476i != null) {
            AbstractC32417h.m101189T(abstractC13476i.f47339c, !z4);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m19463X(TeamRemoveMembersActivity teamRemoveMembersActivity, Editable editable) {
        teamRemoveMembersActivity.m19470g0(String.valueOf(editable));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m19464Y() {
        AbstractC1615p0 abstractC1615p0M98073l = m19459T().getDataSource();
        if (abstractC1615p0M98073l != null) {
            abstractC1615p0M98073l.removeObservers(this);
        }
        m19459T().m98076q();
        AbstractC1615p0 abstractC1615p0M98073l2 = m19459T().getDataSource();
        if (abstractC1615p0M98073l2 != null) {
            abstractC1615p0M98073l2.observe(this, new C6380g(new C31658d0(this, 3)));
        }
        C31667g0 c31667g0 = this.listAdapter;
        if (c31667g0 != null) {
            c31667g0.notifyDataSetChanged();
        } else {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m19465Z(TeamRemoveMembersActivity teamRemoveMembersActivity, AbstractC18317n abstractC18317n) {
        C31667g0 c31667g0 = teamRemoveMembersActivity.listAdapter;
        if (c31667g0 != null) {
            c31667g0.m52734c(abstractC18317n);
            return C23454a0.f92919a;
        }
        AbstractC22676k.m65757q("listAdapter");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m19466b0(TeamRemoveMembersActivity teamRemoveMembersActivity, TeamUser teamUser, DialogInterface dialogInterface, int i13) {
        teamRemoveMembersActivity.m19457R(teamUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final void m19467c0(DialogInterface dialogInterface, int i13) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m19468e0(TeamRemoveMembersActivity teamRemoveMembersActivity, TeamUser teamUser, DialogInterface dialogInterface, int i13) {
        teamRemoveMembersActivity.m19458S(teamUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m19469f0(DialogInterface dialogInterface, int i13) {
    }

    /* JADX INFO: renamed from: g0 */
    private final void m19470g0(String text) {
        AbstractC1615p0 abstractC1615p0M98073l = m19459T().getDataSource();
        if (abstractC1615p0M98073l != null) {
            abstractC1615p0M98073l.removeObservers(this);
        }
        m19459T().m98081y(text);
        AbstractC1615p0 abstractC1615p0M98073l2 = m19459T().getDataSource();
        if (abstractC1615p0M98073l2 != null) {
            abstractC1615p0M98073l2.observe(this, new C6380g(new C31658d0(this, 2)));
        }
        C31667g0 c31667g0 = this.listAdapter;
        if (c31667g0 != null) {
            c31667g0.notifyDataSetChanged();
        } else {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m19471h0(TeamRemoveMembersActivity teamRemoveMembersActivity, AbstractC18317n abstractC18317n) {
        C31667g0 c31667g0 = teamRemoveMembersActivity.listAdapter;
        if (c31667g0 != null) {
            c31667g0.m52734c(abstractC18317n);
            return C23454a0.f92919a;
        }
        AbstractC22676k.m65757q("listAdapter");
        throw null;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m19472a0(TeamUser user) {
        AbstractC22676k.m65750j(user, "user");
        new AlertDialog.Builder(this, AbstractC36518i.f156128b).setTitle(AbstractC38505d0.f165600M0).setMessage(getResources().getString(AbstractC38505d0.f165597L0, user.getFullName())).setPositiveButton(AbstractC38505d0.f165713s, new DialogInterfaceOnClickListenerC31664f0(this, user, 0)).setNegativeButton(AbstractC38505d0.f165709r, new DialogInterfaceOnClickListenerC19904c(3)).create().show();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m19473d0(TeamUser user) {
        AbstractC22676k.m65750j(user, "user");
        new AlertDialog.Builder(this, AbstractC36518i.f156128b).setTitle(AbstractC38505d0.f165606O0).setMessage(getResources().getString(AbstractC38505d0.f165603N0, user.getFullName())).setPositiveButton(AbstractC38505d0.f165713s, new DialogInterfaceOnClickListenerC31664f0(this, user, 1)).setNegativeButton(AbstractC38505d0.f165709r, new DialogInterfaceOnClickListenerC19904c(4)).create().show();
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC17182o.f65999a.plus(this.job);
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC1168a0 abstractC1168a0M3733d = AbstractC1177g.m3733d(this, AbstractC38501b0.f165517g);
        AbstractC22676k.m65749i(abstractC1168a0M3733d, "setContentView(...)");
        this.binding = (AbstractC13476i) abstractC1168a0M3733d;
        boolean booleanExtra = getIntent().getBooleanExtra("isTransfer", false);
        this.isTransfer = booleanExtra;
        setTitle(booleanExtra ? AbstractC38505d0.f165680j2 : AbstractC38505d0.f165676i2);
        m49105z();
        Team team = (Team) getIntent().getParcelableExtra("teamid");
        if (team != null) {
            m19459T().m98075p(team);
        }
        AbstractC13476i abstractC13476i = this.binding;
        if (abstractC13476i == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC13476i.f47340d.setOnFocusChangeListener(new ViewOnFocusChangeListenerC31661e0(this, 0));
        Function1 function1M19455P = m19455P(500L, new C31658d0(this, 1));
        AbstractC13476i abstractC13476i2 = this.binding;
        if (abstractC13476i2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC13476i2.f47340d.addTextChangedListener(new C6371e(function1M19455P));
        C31667g0 c31667g0 = new C31667g0(this, m19459T(), this.isTransfer);
        this.listAdapter = c31667g0;
        AbstractC13476i abstractC13476i3 = this.binding;
        if (abstractC13476i3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC13476i3.f47338b.setAdapter(c31667g0);
        m19470g0("");
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStart() {
        super.onStart();
        m19460U();
    }
}
