package com.whoop.membership.dunning;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import aw1.AbstractC2113a;
import aw1.C2114b;
import bc3.InterfaceC2994c0;
import bw1.AbstractC3684c;
import bw1.C3683b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.wire.AbstractC5583n;
import com.whoop.android.R;
import com.whoop.membership.dunning.DunningBottomSheetFragment;
import dw1.AbstractC12416d;
import dw1.AbstractC12418f;
import ge3.AbstractC15751g;
import gy0.AbstractC16278g;
import he1.DialogInterfaceOnShowListenerC17213b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p404pq.AbstractC29455c;
import p404pq.C29464l;
import p404pq.DialogC29463k;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
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
import tx0.C34238a;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vv1.C36530a;
import vv1.C36532c;
import wv1.AbstractC37650a;
import wv1.C37651b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&R \u0010.\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\u0003\u001a\u0004\b+\u0010,¨\u00061²\u0006\u000e\u00100\u001a\u0004\u0018\u00010/8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/membership/dunning/DunningBottomSheetFragment;", "Lpq/l;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "getTheme", "()I", "Lbw1/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "K", "()Lbw1/b;", "viewModel", "Law1/b;", "x", "J", "()Law1/b;", "navRouter", "Lwv1/b;", "y", "G", "()Lwv1/b;", "analyticsHelper", "Lvv1/a;", "z", "I", "()Lvv1/a;", "coordinator", "Lpq/c;", "E", "Lpq/c;", "H", "()Lpq/c;", "getBottomSheetBehaviorCallback$annotations", "bottomSheetBehaviorCallback", "Lbw1/c;", "viewState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DunningBottomSheetFragment extends C29464l {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final AbstractC29455c bottomSheetBehaviorCallback;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9081h(this, null, new C9080g(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h coordinator;

    /* JADX INFO: renamed from: com.whoop.membership.dunning.DunningBottomSheetFragment$a */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"com/whoop/membership/dunning/DunningBottomSheetFragment$a", "Lpq/c;", "Landroid/view/View;", "bottomSheet", "", "newState", "Ll83/a0;", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9074a extends AbstractC29455c {
        public C9074a() {
        }

        @Override // p404pq.AbstractC29455c
        /* JADX INFO: renamed from: b */
        public void mo5841b(View bottomSheet, float slideOffset) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p404pq.AbstractC29455c
        /* JADX INFO: renamed from: c */
        public void mo5842c(View bottomSheet, int newState) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
            if (newState == 5) {
                DunningBottomSheetFragment.this.m22621G().m121036a(new AbstractC37650a.b(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
                DunningBottomSheetFragment.this.m22622I().m117078q();
                DunningBottomSheetFragment.this.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.dunning.DunningBottomSheetFragment$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/membership/dunning/DunningBottomSheetFragment$b", "Lpq/k;", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DialogC9075b extends DialogC29463k {
        public DialogC9075b(Context context, int i13) {
            super(context, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final void m22632r(DunningBottomSheetFragment dunningBottomSheetFragment, DialogInterface dialogInterface) {
            AbstractC22676k.m65748h(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
            FrameLayout frameLayout = (FrameLayout) ((DialogC29463k) dialogInterface).findViewById(R.id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorM15688O = BottomSheetBehavior.m15688O(frameLayout);
                bottomSheetBehaviorM15688O.m15701W(3);
                bottomSheetBehaviorM15688O.f20782J = true;
                bottomSheetBehaviorM15688O.f20783K = true;
                bottomSheetBehaviorM15688O.m15690I(dunningBottomSheetFragment.getBottomSheetBehaviorCallback());
            }
        }

        @Override // p404pq.DialogC29463k, p314m.DialogC24833c0, p161g.DialogC14910m, android.app.Dialog
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setOnShowListener(new DialogInterfaceOnShowListenerC17213b(DunningBottomSheetFragment.this, 3));
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.dunning.DunningBottomSheetFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.membership.dunning.DunningBottomSheetFragment$onCreateView$1$1$1$1", m100430f = "DunningBottomSheetFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9076c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27163w;

        public C9076c(InterfaceC30057d<? super C9076c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DunningBottomSheetFragment.this.new C9076c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9076c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27163w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            DunningBottomSheetFragment.this.m22621G().m121036a(new AbstractC37650a.c(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.dunning.DunningBottomSheetFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9077d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27165w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27166x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27167y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9077d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27165w = componentCallbacks;
            this.f27166x = interfaceC35951a;
            this.f27167y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [aw1.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C2114b invoke() {
            ComponentCallbacks componentCallbacks = this.f27165w;
            InterfaceC35951a interfaceC35951a = this.f27166x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27167y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2114b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.dunning.DunningBottomSheetFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9078e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27168w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27169x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27170y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9078e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27168w = componentCallbacks;
            this.f27169x = interfaceC35951a;
            this.f27170y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wv1.b] */
        @Override // c93.InterfaceC4339a
        public final C37651b invoke() {
            ComponentCallbacks componentCallbacks = this.f27168w;
            InterfaceC35951a interfaceC35951a = this.f27169x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27170y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37651b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.dunning.DunningBottomSheetFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9079f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27171w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27172x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27173y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9079f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27171w = componentCallbacks;
            this.f27172x = interfaceC35951a;
            this.f27173y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vv1.a] */
        @Override // c93.InterfaceC4339a
        public final C36530a invoke() {
            ComponentCallbacks componentCallbacks = this.f27171w;
            InterfaceC35951a interfaceC35951a = this.f27172x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27173y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36530a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.dunning.DunningBottomSheetFragment$g */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9080g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27174w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9080g(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27174w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27174w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.dunning.DunningBottomSheetFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9081h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27175w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27176x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27177y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27178z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9081h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27175w = componentCallbacks;
            this.f27176x = interfaceC35951a;
            this.f27177y = interfaceC4339a;
            this.f27178z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, bw1.b] */
        @Override // c93.InterfaceC4339a
        public final C3683b invoke() {
            return AbstractC34132o.m107857B(this.f27175w, this.f27176x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3683b.class), this.f27177y, this.f27178z);
        }
    }

    public DunningBottomSheetFragment() {
        C36532c c36532c = new C36532c(this, 0);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C9077d(this, null, c36532c));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C9078e(this, null, null));
        this.coordinator = AbstractC30060g.m92087G(enumC23463i, new C9079f(this, null, null));
        this.bottomSheetBehaviorCallback = new C9074a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final C37651b m22621G() {
        return (C37651b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final C36530a m22622I() {
        return (C36530a) this.coordinator.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final C2114b m22623J() {
        return (C2114b) this.navRouter.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final C3683b m22624K() {
        return (C3683b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C34911a m22625L(DunningBottomSheetFragment dunningBottomSheetFragment) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(dunningBottomSheetFragment), dunningBottomSheetFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m22626M(final DunningBottomSheetFragment dunningBottomSheetFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        AbstractC3684c abstractC3684cM22627N = m22627N(AbstractC28683x.m87260n(dunningBottomSheetFragment.m22624K().getViewState(), null, null, c28655q, 48, 2));
        if (abstractC3684cM22627N == null) {
            c28655q.m87150e0(1446472893);
            c28655q.m87173q(false);
            return c23454a0;
        }
        c28655q.m87150e0(1446472894);
        boolean zM87157i = c28655q.m87157i(dunningBottomSheetFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = dunningBottomSheetFragment.new C9076c(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        if (abstractC3684cM22627N instanceof AbstractC3684c.b) {
            c28655q.m87150e0(1384201773);
            AbstractC3684c.b bVar = (AbstractC3684c.b) abstractC3684cM22627N;
            boolean zM87157i2 = c28655q.m87157i(dunningBottomSheetFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1(dunningBottomSheetFragment) { // from class: vv1.d

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ DunningBottomSheetFragment f156410x;

                    {
                        this.f156410x = dunningBottomSheetFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return DunningBottomSheetFragment.m22628O(this.f156410x, (AbstractC2113a) obj);
                            default:
                                return DunningBottomSheetFragment.m22629P(this.f156410x, (AbstractC2113a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC12418f.m34958j(bVar, (Function1) objM87133R2, c28655q, 0, 0);
            c28655q.m87173q(false);
        } else {
            if (!(abstractC3684cM22627N instanceof AbstractC3684c.a)) {
                throw AbstractC11895b.m32003v(-1063729930, c28655q, false);
            }
            c28655q.m87150e0(1384503155);
            AbstractC3684c.a aVar = (AbstractC3684c.a) abstractC3684cM22627N;
            boolean zM87157i3 = c28655q.m87157i(dunningBottomSheetFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1(dunningBottomSheetFragment) { // from class: vv1.d

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ DunningBottomSheetFragment f156410x;

                    {
                        this.f156410x = dunningBottomSheetFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return DunningBottomSheetFragment.m22628O(this.f156410x, (AbstractC2113a) obj);
                            default:
                                return DunningBottomSheetFragment.m22629P(this.f156410x, (AbstractC2113a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC12416d.m34937j(aVar, (Function1) objM87133R3, c28655q, 0, 0);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return c23454a0;
    }

    /* JADX INFO: renamed from: N */
    private static final AbstractC3684c m22627N(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC3684c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m22628O(DunningBottomSheetFragment dunningBottomSheetFragment, AbstractC2113a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        dunningBottomSheetFragment.m22623J().m6678a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m22629P(DunningBottomSheetFragment dunningBottomSheetFragment, AbstractC2113a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        dunningBottomSheetFragment.m22623J().m6678a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final AbstractC29455c getBottomSheetBehaviorCallback() {
        return this.bottomSheetBehaviorCallback;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public int getTheme() {
        return AbstractC16278g.f62406a;
    }

    @Override // p404pq.C29464l, p314m.C24835d0, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new DialogC9075b(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 27), true, -1890307974));
    }
}
