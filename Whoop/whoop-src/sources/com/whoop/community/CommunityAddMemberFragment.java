package com.whoop.community;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.recyclerview.widget.RecyclerView;
import as2.AbstractC1953c;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cn2.C4852a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.domain.model.teams.Team;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10460a;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.p069ui.views.TooltipView;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eq0.AbstractC13493l1;
import ge3.AbstractC15751g;
import hj0.AbstractC17354m;
import in2.AbstractC18737i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import io.getstream.chat.android.p226ui.utils.DialogInterfaceOnClickListenerC19904c;
import j93.InterfaceC21493z;
import jf3.C21647a;
import kn2.ViewOnTouchListenerC22603e;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p114eb.AbstractC12939a0;
import p114eb.C12962i;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p217ib.AbstractC18317n;
import p314m.C24844i;
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
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rq0.C31672i;
import rq0.C31677k;
import rq0.C31679l;
import rq0.ViewOnFocusChangeListenerC31661e0;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32417h;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vq0.AbstractC36281e;
import vu1.AbstractC36518i;
import w20.C36727q;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;
import xp0.C38500b;
import xp0.C38502c;
import xp0.C38504d;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010\u001eJ\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0003J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000eH\u0002¢\u0006\u0004\b,\u0010\u0003J3\u00100\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020\u000e0-2\u0014\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010.\u0012\u0004\u0012\u00020\u000e0-H\u0002¢\u0006\u0004\b0\u00101R\u001a\u00106\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\u00020(8\u0014X\u0094D¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010IR+\u0010S\u001a\u00020K2\u0006\u0010L\u001a\u00020K8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R¨\u0006T"}, m65681d2 = {"Lcom/whoop/community/CommunityAddMemberFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onDestroy", "a0", "l0", "", "vis", "r0", "(I)V", "q0", "p0", "", "message", "u0", "(Ljava/lang/String;)V", "x0", "subject", "body", "w0", "(Ljava/lang/String;Ljava/lang/String;)V", "text", "y0", "U", "t0", "", "focusVisible", "s0", "(Z)V", "n0", "Lkotlin/Function1;", "Landroid/text/Editable;", "f", "V", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lrq0/k;", "x", "Ll83/h;", "Z", "()Lrq0/k;", "viewModel", "Lrq0/i;", "y", "Lrq0/i;", "listAdapter", "Lxp0/d;", "z", "Leb/i;", "X", "()Lxp0/d;", "args", "E", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Leq0/l1;", "<set-?>", "F", "Lcom/whoop/ui/b;", "Y", "()Leq0/l1;", "o0", "(Leq0/l1;)V", "binding", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CommunityAddMemberFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: G */
    static final /* synthetic */ InterfaceC21493z[] f24728G = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(CommunityAddMemberFragment.class, "binding", "getBinding()Lcom/whoop/community/databinding/FragmentTeamAddmembersBinding;", 0))};

    /* JADX INFO: renamed from: H */
    public static final int f24729H = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C10462b binding;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "CommunityAddMemberFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private C31672i listAdapter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C12962i args;

    /* JADX INFO: renamed from: com.whoop.community.CommunityAddMemberFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.community.CommunityAddMemberFragment$debouncer$1$1", m100430f = "CommunityAddMemberFragment.kt", m100431l = {231}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6254a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24736w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f24737x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Editable f24738y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6254a(Function1 function1, Editable editable, InterfaceC30057d<? super C6254a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24737x = function1;
            this.f24738y = editable;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C6254a(this.f24737x, this.f24738y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6254a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24736w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f24736w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f24737x.invoke(this.f24738y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityAddMemberFragment$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/community/CommunityAddMemberFragment$b", "Lvq0/e;", "Landroid/text/Editable;", "s", "Ll83/a0;", "afterTextChanged", "(Landroid/text/Editable;)V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6255b extends AbstractC36281e {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f24739w;

        public C6255b(Function1 function1) {
            this.f24739w = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s13) {
            this.f24739w.invoke(s13);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityAddMemberFragment$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/community/CommunityAddMemberFragment$c", "Lg/t;", "Ll83/a0;", "d", "()V", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6256c extends AbstractC14917t {
        public C6256c() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            CommunityAddMemberFragment.this.m18827n0();
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityAddMemberFragment$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6257d implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f24741w;

        public C6257d(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f24741w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f24741w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24741w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityAddMemberFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6258e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f24742w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6258e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f24742w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f24742w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f24742w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityAddMemberFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6259f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24743w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6259f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24743w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24743w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.CommunityAddMemberFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6260g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24744w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24745x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24746y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24747z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6260g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24744w = componentCallbacks;
            this.f24745x = interfaceC35951a;
            this.f24746y = interfaceC4339a;
            this.f24747z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.k] */
        @Override // c93.InterfaceC4339a
        public final C31677k invoke() {
            return AbstractC34132o.m107857B(this.f24744w, this.f24745x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31677k.class), this.f24746y, this.f24747z);
        }
    }

    public CommunityAddMemberFragment() {
        C38500b c38500b = new C38500b(this, 1);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6260g(this, null, new C6259f(this), c38500b));
        this.args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38504d.class), new C6258e(this));
        this.binding = AbstractC10463c.m26726c(this, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C34911a m18791A0(CommunityAddMemberFragment communityAddMemberFragment) {
        return AbstractC15751g.m44431K(communityAddMemberFragment.requireContext());
    }

    /* JADX INFO: renamed from: U */
    private final void m18808U() {
        m18838y0("");
        m18812Y().f47440n.setText("");
        m18812Y().f47440n.clearFocus();
    }

    /* JADX INFO: renamed from: V */
    private final Function1 m18809V(Function1 f13) {
        return new C37082e1(new C22669g0(), this, f13, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m18810W(C22669g0 c22669g0, CommunityAddMemberFragment communityAddMemberFragment, Function1 function1, Editable editable) {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c22669g0.f89336w;
        if (interfaceC3027k1 == null || interfaceC3027k1.isCompleted()) {
            c22669g0.f89336w = AbstractC3006f0.m8732z(AbstractC1613o1.m5019i(communityAddMemberFragment.getViewLifecycleOwner().getLifecycle()), null, null, new C6254a(function1, editable, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    private final C38504d m18811X() {
        return (C38504d) this.args.getValue();
    }

    /* JADX INFO: renamed from: Y */
    private final AbstractC13493l1 m18812Y() {
        return (AbstractC13493l1) this.binding.getValue(this, f24728G[0]);
    }

    /* JADX INFO: renamed from: Z */
    private final C31677k m18813Z() {
        return (C31677k) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    private final void m18814a0() {
        AbstractC13493l1 abstractC13493l1M18812Y = m18812Y();
        abstractC13493l1M18812Y.f47440n.setOnFocusChangeListener(new ViewOnFocusChangeListenerC31661e0(this, 6));
        abstractC13493l1M18812Y.f47440n.addTextChangedListener(new C6255b(m18809V(new C38502c(this, 0))));
        ImageView searchClearIcon = abstractC13493l1M18812Y.f47434h;
        AbstractC22676k.m65749i(searchClearIcon, "searchClearIcon");
        AbstractC1953c.m5963a(searchClearIcon, new C38502c(this, 1));
        ImageView shareHelp = abstractC13493l1M18812Y.f47447u;
        AbstractC22676k.m65749i(shareHelp, "shareHelp");
        AbstractC1953c.m5963a(shareHelp, new C38502c(this, 2));
        StrokedPillButton inviteButton = abstractC13493l1M18812Y.f47430d;
        AbstractC22676k.m65749i(inviteButton, "inviteButton");
        AbstractC1953c.m5963a(inviteButton, new C38502c(this, 3));
        FrameLayout shareCodeLayout = abstractC13493l1M18812Y.f47445s;
        AbstractC22676k.m65749i(shareCodeLayout, "shareCodeLayout");
        AbstractC1953c.m5963a(shareCodeLayout, new C38502c(this, 4));
        abstractC13493l1M18812Y.f47431e.setOnTouchListener(new ViewOnTouchListenerC22603e(this, 2));
        m18812Y().f47428b.m26687n(new C38502c(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m18815b0(CommunityAddMemberFragment communityAddMemberFragment, View view, boolean z4) {
        communityAddMemberFragment.m18832s0(!z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m18816c0(CommunityAddMemberFragment communityAddMemberFragment, Editable editable) {
        communityAddMemberFragment.m18838y0(String.valueOf(editable));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m18817d0(CommunityAddMemberFragment communityAddMemberFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityAddMemberFragment.m18808U();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m18818e0(CommunityAddMemberFragment communityAddMemberFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityAddMemberFragment.m18833t0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m18819f0(CommunityAddMemberFragment communityAddMemberFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityAddMemberFragment.m18813Z().m98153d0(new C36727q(communityAddMemberFragment, 12), new C38500b(communityAddMemberFragment, 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m18820g0(CommunityAddMemberFragment communityAddMemberFragment, String subj, String body) {
        AbstractC22676k.m65750j(subj, "subj");
        AbstractC22676k.m65750j(body, "body");
        communityAddMemberFragment.m18836w0(subj, body);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m18821h0(CommunityAddMemberFragment communityAddMemberFragment) {
        String string = communityAddMemberFragment.getString(AbstractC38505d0.f165710r0);
        AbstractC22676k.m65749i(string, "getString(...)");
        communityAddMemberFragment.m18834u0(string);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m18822i0(CommunityAddMemberFragment communityAddMemberFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityAddMemberFragment.m18837x0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final boolean m18823j0(CommunityAddMemberFragment communityAddMemberFragment, View view, MotionEvent motionEvent) {
        Object systemService = communityAddMemberFragment.requireContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        view.performClick();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m18824k0(CommunityAddMemberFragment communityAddMemberFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        communityAddMemberFragment.m18827n0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l0 */
    private final void m18825l0() {
        m18813Z().m98147R().observe(this, new C6257d(new C38502c(this, 6)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m18826m0(CommunityAddMemberFragment communityAddMemberFragment, C31679l c31679l) {
        boolean z4 = c31679l.getSearchText().length() < 2;
        boolean z13 = c31679l.getResultSize() < 1;
        AbstractC32417h.m101189T(communityAddMemberFragment.m18812Y().f47431e, (z4 || z13) ? false : true);
        communityAddMemberFragment.m18829p0(z4 ? 0 : 8);
        communityAddMemberFragment.m18832s0(z4);
        communityAddMemberFragment.m18812Y().f47429c.setText(c31679l.getReferralRewardMessage());
        communityAddMemberFragment.m18830q0((z4 || !z13) ? 8 : 0);
        communityAddMemberFragment.m18831r0((z4 || z13) ? 0 : 8);
        String strM98177k = c31679l.getToastMessage();
        if (strM98177k != null) {
            AbstractC18737i.m54477b(communityAddMemberFragment, strM98177k);
            communityAddMemberFragment.m18813Z().m98145N();
        }
        FrameLayout frameLayout = communityAddMemberFragment.m18812Y().f47445s;
        String strM98175i = c31679l.getShareCode();
        AbstractC32417h.m101189T(frameLayout, strM98175i != null ? !AbstractC39414r.m125890i0(strM98175i) : false);
        String strM98175i2 = c31679l.getShareCode();
        if (strM98175i2 != null) {
            communityAddMemberFragment.m18812Y().f47444r.setText(strM98175i2);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public final void m18827n0() {
        C31679l c31679l = (C31679l) m18813Z().m98147R().getValue();
        Team teamM98176j = c31679l != null ? c31679l.getTeam() : null;
        if (teamM98176j == null) {
            AbstractC5583n.m16799z(this).m36410z();
            return;
        }
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(this);
        AbstractC6309a.a aVarM19196k = AbstractC6309a.m19185a(1, "DAILY").m19196k(teamM98176j);
        AbstractC22676k.m65749i(aVarM19196k, "setTeam(...)");
        abstractC12939a0M16799z.m36407v(aVarM19196k);
    }

    /* JADX INFO: renamed from: o0 */
    private final void m18828o0(AbstractC13493l1 abstractC13493l1) {
        this.binding.setValue(this, f24728G[0], abstractC13493l1);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m18829p0(int vis) {
        AbstractC13493l1 abstractC13493l1M18812Y = m18812Y();
        abstractC13493l1M18812Y.f47435i.setVisibility(vis);
        abstractC13493l1M18812Y.f47438l.setVisibility(vis);
        abstractC13493l1M18812Y.f47437k.setVisibility(vis);
        abstractC13493l1M18812Y.f47436j.setVisibility(vis);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m18830q0(int vis) {
        AbstractC13493l1 abstractC13493l1M18812Y = m18812Y();
        abstractC13493l1M18812Y.f47443q.setVisibility(vis);
        abstractC13493l1M18812Y.f47441o.setVisibility(vis);
        abstractC13493l1M18812Y.f47442p.setVisibility(vis);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m18831r0(int vis) {
        AbstractC13493l1 abstractC13493l1M18812Y = m18812Y();
        abstractC13493l1M18812Y.f47432f.setVisibility(vis);
        abstractC13493l1M18812Y.f47433g.setVisibility(vis);
        abstractC13493l1M18812Y.f47429c.setVisibility(vis);
        abstractC13493l1M18812Y.f47430d.setVisibility(vis);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m18832s0(boolean focusVisible) {
        AbstractC32417h.m101189T(m18812Y().f47439m, focusVisible);
        AbstractC32417h.m101189T(m18812Y().f47434h, !focusVisible);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m18833t0() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        int i13 = AbstractC38501b0.f165479C0;
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        AbstractC22676k.m65748h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewInflate = layoutInflaterFrom.inflate(i13, (ViewGroup) parent, false);
        AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type com.whoop.ui.views.TooltipView");
        ((TooltipView) viewInflate).m27474g(m18812Y().f47447u, C4852a.m15490a(requireContext(), 200), 400L);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m18834u0(String message) {
        C24844i c24844i = new C24844i(requireContext(), AbstractC36518i.f156128b);
        c24844i.f97324a.f97261f = message;
        c24844i.setPositiveButton(AbstractC38505d0.f165626V, new DialogInterfaceOnClickListenerC19904c(5)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m18835v0(DialogInterface dialogInterface, int i13) {
    }

    /* JADX INFO: renamed from: w0 */
    private final void m18836w0(String subject, String body) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse("mailto:"));
        intent.setType(MimeType.MIME_TYPE_TXT);
        intent.putExtra("android.intent.extra.SUBJECT", subject);
        intent.putExtra("android.intent.extra.TEXT", body);
        startActivity(Intent.createChooser(intent, getResources().getString(AbstractC38505d0.f165585H0)));
    }

    /* JADX INFO: renamed from: x0 */
    private final void m18837x0() {
        Team teamM98176j;
        String string = getResources().getString(AbstractC38505d0.f165588I0);
        AbstractC22676k.m65749i(string, "getString(...)");
        Resources resources = getResources();
        int i13 = AbstractC38505d0.f165582G0;
        C31679l c31679l = (C31679l) m18813Z().m98147R().getValue();
        String name = (c31679l == null || (teamM98176j = c31679l.getTeam()) == null) ? null : teamM98176j.getName();
        C31679l c31679l2 = (C31679l) m18813Z().m98147R().getValue();
        String string2 = resources.getString(i13, name, c31679l2 != null ? c31679l2.getShareCode() : null);
        AbstractC22676k.m65749i(string2, "getString(...)");
        m18836w0(string, string2);
    }

    /* JADX INFO: renamed from: y0 */
    private final void m18838y0(String text) {
        C31679l c31679l = (C31679l) m18813Z().m98147R().getValue();
        if (AbstractC22676k.m65745e(c31679l != null ? c31679l.getSearchText() : null, text)) {
            return;
        }
        AbstractC1615p0 abstractC1615p0M98146O = m18813Z().getDataSource();
        if (abstractC1615p0M98146O != null) {
            abstractC1615p0M98146O.removeObservers(this);
        }
        m18813Z().m98156h0(text);
        AbstractC1615p0 abstractC1615p0M98146O2 = m18813Z().getDataSource();
        if (abstractC1615p0M98146O2 != null) {
            abstractC1615p0M98146O2.observe(getViewLifecycleOwner(), new C10460a(this, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m18839z0(CommunityAddMemberFragment communityAddMemberFragment, AbstractC18317n abstractC18317n) {
        C31672i c31672i = communityAddMemberFragment.listAdapter;
        if (c31672i != null) {
            c31672i.m52734c(abstractC18317n);
        } else {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
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
        AbstractC13493l1 abstractC13493l1M38210c = AbstractC13493l1.m38210c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC13493l1M38210c, "inflate(...)");
        C14923z onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.m43015a(viewLifecycleOwner, new C6256c());
        m18828o0(abstractC13493l1M38210c);
        View root = m18812Y().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroy() {
        super.onDestroy();
        m18813Z().m98152b0();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        m18825l0();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C31677k c31677kM18813Z = m18813Z();
        Team teamM123400a = m18811X().m123400a();
        AbstractC22676k.m65749i(teamM123400a, "getTeam(...)");
        c31677kM18813Z.m98150Y(teamM123400a);
        m18814a0();
        this.listAdapter = new C31672i(m18813Z());
        RecyclerView recyclerView = m18812Y().f47431e;
        C31672i c31672i = this.listAdapter;
        if (c31672i == null) {
            AbstractC22676k.m65757q("listAdapter");
            throw null;
        }
        recyclerView.setAdapter(c31672i);
        m18838y0("");
    }
}
