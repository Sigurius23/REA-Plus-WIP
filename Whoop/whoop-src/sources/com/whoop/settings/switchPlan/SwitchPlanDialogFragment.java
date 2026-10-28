package com.whoop.settings.switchPlan;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.constants.FragmentResultKeys;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r12.C30856a;
import r83.EnumC31071a;
import rq0.C31703x;
import s51.C32209f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc0.C32355c;
import vf3.InterfaceC35951a;
import xc2.C38192c;
import xc2.InterfaceC38191b;
import xc2.InterfaceC38193d;
import yc2.AbstractC39436c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;", "Landroidx/fragment/app/y;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Ljava/lang/String;", "subscriptionType", "Lxc2/c;", "x", "F", "()Lxc2/c;", "viewModel", "Lxc2/d;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SwitchPlanDialogFragment extends DialogInterfaceOnCancelListenerC1361y {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h subscriptionType = AbstractC30060g.m92088H(new C32355c(this, 8));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10164c(this, null, new C10163b(this), null));

    /* JADX INFO: renamed from: com.whoop.settings.switchPlan.SwitchPlanDialogFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.switchPlan.SwitchPlanDialogFragment$onCreateView$1$1$1", m100430f = "SwitchPlanDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10162a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30737w;

        public C10162a(InterfaceC30057d<? super C10162a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SwitchPlanDialogFragment.this.new C10162a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10162a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f30737w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SwitchPlanDialogFragment.this.m25807F().m122322o(new InterfaceC38191b.a(SwitchPlanDialogFragment.this.m25800E()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.switchPlan.SwitchPlanDialogFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10163b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30739w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10163b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30739w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30739w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.switchPlan.SwitchPlanDialogFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10164c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30740w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30741x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30742y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30743z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10164c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30740w = componentCallbacks;
            this.f30741x = interfaceC35951a;
            this.f30742y = interfaceC4339a;
            this.f30743z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, xc2.c] */
        @Override // c93.InterfaceC4339a
        public final C38192c invoke() {
            return AbstractC34132o.m107857B(this.f30740w, this.f30741x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38192c.class), this.f30742y, this.f30743z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final String m25800E() {
        return (String) this.subscriptionType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m25801G(SwitchPlanDialogFragment switchPlanDialogFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(switchPlanDialogFragment.m25807F().getViewState(), InterfaceC38193d.c.f163559a, null, c28655q, 48, 2);
            String strM25800E = switchPlanDialogFragment.m25800E();
            boolean zM87157i = c28655q.m87157i(switchPlanDialogFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = switchPlanDialogFragment.new C10162a(null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, strM25800E);
            InterfaceC38193d interfaceC38193dM25802H = m25802H(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(switchPlanDialogFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C31703x(switchPlanDialogFragment, 19);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(switchPlanDialogFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C32209f(15, switchPlanDialogFragment, interfaceC28601c1M87260n);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC39436c.m125957G(interfaceC38193dM25802H, function1, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final InterfaceC38193d m25802H(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC38193d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m25803I(SwitchPlanDialogFragment switchPlanDialogFragment, InterfaceC38191b it) {
        AbstractC22676k.m65750j(it, "it");
        switchPlanDialogFragment.m25807F().m122322o(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m25804J(SwitchPlanDialogFragment switchPlanDialogFragment, InterfaceC28670t2 interfaceC28670t2) {
        switchPlanDialogFragment.dismiss();
        if (m25802H(interfaceC28670t2) instanceof InterfaceC38193d.d) {
            switchPlanDialogFragment.getParentFragmentManager().m4168f0(new Bundle(), FragmentResultKeys.SWITCH_PLAN_DIALOG_SUCCESS);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final String m25805K(SwitchPlanDialogFragment switchPlanDialogFragment) {
        String string = switchPlanDialogFragment.requireArguments().getString("subscriptionType");
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: F */
    public final C38192c m25807F() {
        return (C38192c) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 29), true, -212165691));
    }
}
