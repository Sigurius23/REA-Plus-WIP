package com.whoop.labrador.fragment;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import bs1.C3603v;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci0.C4726a;
import ck1.C4780c;
import com.squareup.wire.AbstractC5583n;
import com.whoop.labrador.fragment.LabradorDetailsFragment;
import cu1.C11116a;
import et1.C13598b;
import et1.InterfaceC13597a;
import ft1.C14769b;
import ft1.InterfaceC14768a;
import ft1.InterfaceC14770c;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import java.io.File;
import java.util.List;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.C28176k1;
import p003a1.C0111j;
import p114eb.AbstractC12939a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p707gt1.AbstractC16198l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ss1.C32948a;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010&R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u001b\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u001b\u001a\u0004\b;\u0010<¨\u0006@²\u0006\f\u0010?\u001a\u00020>8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/labrador/fragment/LabradorDetailsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "filePath", "Ll83/a0;", "k0", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "Landroid/content/IntentSender;", "Q", "(Landroid/content/Context;)Landroid/content/IntentSender;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lft1/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "T", "()Lft1/b;", "viewModel", "x", "P", "()Ljava/lang/String;", "id", "", "y", "S", "()Z", "showSaveButton", "z", "V", "isNewReading", "Ltr2/n;", "E", "Ltr2/n;", "logger", "Lj02/o0;", "F", "getNavigator", "()Lj02/o0;", "navigator", "Lor2/k1;", "G", "R", "()Lor2/k1;", "shareUtil", "Lss1/a;", "H", "O", "()Lss1/a;", "analytics", "Lft1/c;", "viewState", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LabradorDetailsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h shareUtil;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9022f(this, null, new C9021e(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h id = AbstractC30060g.m92088H(new C11116a(this, 0));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h showSaveButton = AbstractC30060g.m92088H(new C11116a(this, 3));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h isNewReading = AbstractC30060g.m92088H(new C11116a(this, 4));

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("LabradorDetailsFragment");

    /* JADX INFO: renamed from: com.whoop.labrador.fragment.LabradorDetailsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.fragment.LabradorDetailsFragment$onCreateView$1$1$1", m100430f = "LabradorDetailsFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9017a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26988w;

        public C9017a(InterfaceC30057d<? super C9017a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return LabradorDetailsFragment.this.new C9017a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9017a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f26988w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            LabradorDetailsFragment.this.m22461T().m42345l(new InterfaceC14768a.d(LabradorDetailsFragment.this.m22457P()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.fragment.LabradorDetailsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9018b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26990w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26991x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26992y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9018b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26990w = componentCallbacks;
            this.f26991x = interfaceC35951a;
            this.f26992y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26990w;
            InterfaceC35951a interfaceC35951a = this.f26991x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26992y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.fragment.LabradorDetailsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9019c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26993w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26994x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26995y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9019c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26993w = componentCallbacks;
            this.f26994x = interfaceC35951a;
            this.f26995y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.k1] */
        @Override // c93.InterfaceC4339a
        public final C28176k1 invoke() {
            ComponentCallbacks componentCallbacks = this.f26993w;
            InterfaceC35951a interfaceC35951a = this.f26994x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26995y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28176k1.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.fragment.LabradorDetailsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9020d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26996w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26997x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26998y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9020d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26996w = componentCallbacks;
            this.f26997x = interfaceC35951a;
            this.f26998y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ss1.a] */
        @Override // c93.InterfaceC4339a
        public final C32948a invoke() {
            ComponentCallbacks componentCallbacks = this.f26996w;
            InterfaceC35951a interfaceC35951a = this.f26997x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26998y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32948a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.fragment.LabradorDetailsFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9021e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26999w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9021e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26999w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26999w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.fragment.LabradorDetailsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9022f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27000w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27001x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27002y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27003z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9022f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27000w = componentCallbacks;
            this.f27001x = interfaceC35951a;
            this.f27002y = interfaceC4339a;
            this.f27003z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ft1.b] */
        @Override // c93.InterfaceC4339a
        public final C14769b invoke() {
            return AbstractC34132o.m107857B(this.f27000w, this.f27001x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14769b.class), this.f27002y, this.f27003z);
        }
    }

    public LabradorDetailsFragment() {
        C11116a c11116a = new C11116a(this, 5);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C9018b(this, null, c11116a));
        this.shareUtil = AbstractC30060g.m92087G(enumC23463i, new C9019c(this, null, null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C9020d(this, null, null));
    }

    /* JADX INFO: renamed from: O */
    private final C32948a m22456O() {
        return (C32948a) this.analytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final String m22457P() {
        return (String) this.id.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private final IntentSender m22458Q(Context context) {
        IntentSender intentSender = PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) BroadcastReceiver.class), 201326592).getIntentSender();
        AbstractC22676k.m65749i(intentSender, "getIntentSender(...)");
        return intentSender;
    }

    /* JADX INFO: renamed from: R */
    private final C28176k1 m22459R() {
        return (C28176k1) this.shareUtil.getValue();
    }

    /* JADX INFO: renamed from: S */
    private final boolean m22460S() {
        return ((Boolean) this.showSaveButton.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final C14769b m22461T() {
        return (C14769b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final String m22462U(LabradorDetailsFragment labradorDetailsFragment) {
        String string;
        Bundle arguments = labradorDetailsFragment.getArguments();
        return (arguments == null || (string = arguments.getString("id")) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: V */
    private final boolean m22463V() {
        return ((Boolean) this.isNewReading.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final boolean m22464W(LabradorDetailsFragment labradorDetailsFragment) {
        Bundle arguments = labradorDetailsFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("isNewReading");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C34911a m22465X(LabradorDetailsFragment labradorDetailsFragment) {
        return AbstractC15751g.m44431K(labradorDetailsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m22466Y(final LabradorDetailsFragment labradorDetailsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC5583n.m16799z(labradorDetailsFragment);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C13598b(abstractC12939a0, labradorDetailsFragment.getNavigator(), labradorDetailsFragment.m22456O());
            c28655q.m87172p0(objM87133R2);
        }
        C13598b c13598b = (C13598b) objM87133R2;
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(labradorDetailsFragment.m22461T().getViewState(), InterfaceC14770c.h.f54744a, null, c28655q, 48, 2);
        boolean zM87157i = c28655q.m87157i(labradorDetailsFragment);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i || objM87133R3 == c28676v0) {
            objM87133R3 = labradorDetailsFragment.new C9017a(null);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c23454a0);
        InterfaceC14770c interfaceC14770cM22470c0 = m22470c0(interfaceC28601c1M87260n);
        boolean zM22460S = labradorDetailsFragment.m22460S();
        boolean zM22463V = labradorDetailsFragment.m22463V();
        boolean zM87157i2 = c28655q.m87157i(labradorDetailsFragment);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i2 || objM87133R4 == c28676v0) {
            final int i14 = 1;
            objM87133R4 = new Function1(labradorDetailsFragment) { // from class: cu1.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ LabradorDetailsFragment f35336x;

                {
                    this.f35336x = labradorDetailsFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            return LabradorDetailsFragment.m22469b0(this.f35336x, (List) obj);
                        case 1:
                            return LabradorDetailsFragment.m22471d0(this.f35336x, (InterfaceC14768a) obj);
                        default:
                            return LabradorDetailsFragment.m22475h0(this.f35336x, (String) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R4);
        }
        Function1 function1 = (Function1) objM87133R4;
        boolean zM87157i3 = c28655q.m87157i(c13598b);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i3 || objM87133R5 == c28676v0) {
            objM87133R5 = new C4780c(c13598b, 10);
            c28655q.m87172p0(objM87133R5);
        }
        Function1 function2 = (Function1) objM87133R5;
        boolean zM87157i4 = c28655q.m87157i(labradorDetailsFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
        Object objM87133R6 = c28655q.m87133R();
        if (zM87157i4 || objM87133R6 == c28676v0) {
            objM87133R6 = new C3603v(28, labradorDetailsFragment, interfaceC28601c1M87260n);
            c28655q.m87172p0(objM87133R6);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
        boolean zM87157i5 = c28655q.m87157i(labradorDetailsFragment);
        Object objM87133R7 = c28655q.m87133R();
        if (zM87157i5 || objM87133R7 == c28676v0) {
            objM87133R7 = new C11116a(labradorDetailsFragment, 6);
            c28655q.m87172p0(objM87133R7);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R7;
        boolean zM87157i6 = c28655q.m87157i(labradorDetailsFragment);
        Object objM87133R8 = c28655q.m87133R();
        if (zM87157i6 || objM87133R8 == c28676v0) {
            final int i15 = 2;
            objM87133R8 = new Function1(labradorDetailsFragment) { // from class: cu1.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ LabradorDetailsFragment f35336x;

                {
                    this.f35336x = labradorDetailsFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            return LabradorDetailsFragment.m22469b0(this.f35336x, (List) obj);
                        case 1:
                            return LabradorDetailsFragment.m22471d0(this.f35336x, (InterfaceC14768a) obj);
                        default:
                            return LabradorDetailsFragment.m22475h0(this.f35336x, (String) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R8);
        }
        Function1 function3 = (Function1) objM87133R8;
        boolean zM87157i7 = c28655q.m87157i(labradorDetailsFragment);
        Object objM87133R9 = c28655q.m87133R();
        if (zM87157i7 || objM87133R9 == c28676v0) {
            objM87133R9 = new C11116a(labradorDetailsFragment, 1);
            c28655q.m87172p0(objM87133R9);
        }
        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R9;
        boolean zM87157i8 = c28655q.m87157i(labradorDetailsFragment);
        Object objM87133R10 = c28655q.m87133R();
        if (zM87157i8 || objM87133R10 == c28676v0) {
            objM87133R10 = new C11116a(labradorDetailsFragment, 2);
            c28655q.m87172p0(objM87133R10);
        }
        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R10;
        boolean zM87157i9 = c28655q.m87157i(c13598b);
        Object objM87133R11 = c28655q.m87133R();
        if (zM87157i9 || objM87133R11 == c28676v0) {
            objM87133R11 = new C0111j(c13598b, 23);
            c28655q.m87172p0(objM87133R11);
        }
        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R11;
        boolean zM87157i10 = c28655q.m87157i(labradorDetailsFragment);
        Object objM87133R12 = c28655q.m87133R();
        if (zM87157i10 || objM87133R12 == c28676v0) {
            final int i16 = 0;
            objM87133R12 = new Function1(labradorDetailsFragment) { // from class: cu1.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ LabradorDetailsFragment f35336x;

                {
                    this.f35336x = labradorDetailsFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            return LabradorDetailsFragment.m22469b0(this.f35336x, (List) obj);
                        case 1:
                            return LabradorDetailsFragment.m22471d0(this.f35336x, (InterfaceC14768a) obj);
                        default:
                            return LabradorDetailsFragment.m22475h0(this.f35336x, (String) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R12);
        }
        AbstractC16198l.m45799p(interfaceC14770cM22470c0, zM22460S, zM22463V, function1, function2, interfaceC4339a, interfaceC4339a2, function3, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, (Function1) objM87133R12, c28655q, 0, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m22467Z(LabradorDetailsFragment labradorDetailsFragment) {
        AbstractC5583n.m16799z(labradorDetailsFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m22468a0(C13598b c13598b) {
        c13598b.m38422a(InterfaceC13597a.b.f48066a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m22469b0(LabradorDetailsFragment labradorDetailsFragment, List it) {
        AbstractC22676k.m65750j(it, "it");
        labradorDetailsFragment.m22456O().m104047v(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c0 */
    private static final InterfaceC14770c m22470c0(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC14770c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m22471d0(LabradorDetailsFragment labradorDetailsFragment, InterfaceC14768a it) {
        AbstractC22676k.m65750j(it, "it");
        labradorDetailsFragment.m22461T().m42345l(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m22472e0(C13598b c13598b, InterfaceC13597a it) {
        AbstractC22676k.m65750j(it, "it");
        c13598b.m38422a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m22473f0(LabradorDetailsFragment labradorDetailsFragment, InterfaceC28670t2 interfaceC28670t2) {
        if (!labradorDetailsFragment.m22463V()) {
            AbstractC5583n.m16799z(labradorDetailsFragment).m36410z();
        } else if (m22470c0(interfaceC28670t2) instanceof InterfaceC14770c.g) {
            labradorDetailsFragment.m22461T().m42345l(InterfaceC14768a.g.f54680a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m22474g0(LabradorDetailsFragment labradorDetailsFragment) {
        labradorDetailsFragment.m22461T().m42345l(new InterfaceC14768a.d(labradorDetailsFragment.m22457P()));
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m22475h0(LabradorDetailsFragment labradorDetailsFragment, String file) {
        AbstractC22676k.m65750j(file, "file");
        labradorDetailsFragment.m22478k0(file);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m22476i0(LabradorDetailsFragment labradorDetailsFragment) {
        labradorDetailsFragment.m22456O().m104030d();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final boolean m22477j0(LabradorDetailsFragment labradorDetailsFragment) {
        Bundle arguments = labradorDetailsFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("showSaveButton");
        }
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    private final void m22478k0(String filePath) {
        File file = new File(filePath);
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        IntentSender intentSenderM22458Q = m22458Q(abstractActivityC1340r0RequireActivity);
        C28176k1 c28176k1M22459R = m22459R();
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        c28176k1M22459R.m85290a(file, contextRequireContext, intentSenderM22458Q);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85250f(this, this.logger);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        m22456O().m104041o();
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 8), true, -1370292322));
    }
}
