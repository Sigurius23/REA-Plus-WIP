package com.whoop.amoeba.debug.view;

import ai0.AbstractC0906a;
import ai0.AbstractC0908c;
import ai0.C0907b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci0.AbstractC4729d;
import ci0.C4726a;
import com.whoop.amoeba.debug.view.AmoebaDebugFragment;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
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
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import zh0.AbstractC40638a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lai0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "C", "()Lai0/b;", "viewModel", "Lai0/c;", "viewState", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AmoebaDebugFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5977c(this, null, new C5976b(this), null));

    /* JADX INFO: renamed from: com.whoop.amoeba.debug.view.AmoebaDebugFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.amoeba.debug.view.AmoebaDebugFragment$onCreateView$1$1$1", m100430f = "AmoebaDebugFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5975a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23463w;

        public C5975a(InterfaceC30057d<? super C5975a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AmoebaDebugFragment.this.new C5975a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5975a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23463w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AmoebaDebugFragment.this.m17863C().m2237l(new AbstractC0906a.a());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.amoeba.debug.view.AmoebaDebugFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5976b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23465w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5976b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23465w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23465w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.amoeba.debug.view.AmoebaDebugFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5977c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23466w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23467x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23468y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23469z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5977c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23466w = componentCallbacks;
            this.f23467x = interfaceC35951a;
            this.f23468y = interfaceC4339a;
            this.f23469z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ai0.b, androidx.lifecycle.w1] */
        @Override // c93.InterfaceC4339a
        public final C0907b invoke() {
            return AbstractC34132o.m107857B(this.f23466w, this.f23467x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0907b.class), this.f23468y, this.f23469z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final C0907b m17863C() {
        return (C0907b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m17864D(final AmoebaDebugFragment amoebaDebugFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(amoebaDebugFragment.m17863C().getViewState(), AbstractC0908c.b.f3326a, null, c28655q, 48, 2);
        boolean zM87157i = c28655q.m87157i(amoebaDebugFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = amoebaDebugFragment.new C5975a(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        AbstractC0908c abstractC0908cM17865E = m17865E(interfaceC28601c1M87260n);
        boolean zM87157i2 = c28655q.m87157i(amoebaDebugFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            final int i14 = 0;
            objM87133R2 = new Function1(amoebaDebugFragment) { // from class: ci0.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AmoebaDebugFragment f19321x;

                {
                    this.f19321x = amoebaDebugFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            return AmoebaDebugFragment.m17866F(this.f19321x, (AbstractC0906a) obj);
                        default:
                            return AmoebaDebugFragment.m17867G(this.f19321x, (AbstractC40638a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function1 = (Function1) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(amoebaDebugFragment);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            final int i15 = 1;
            objM87133R3 = new Function1(amoebaDebugFragment) { // from class: ci0.b

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ AmoebaDebugFragment f19321x;

                {
                    this.f19321x = amoebaDebugFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            return AmoebaDebugFragment.m17866F(this.f19321x, (AbstractC0906a) obj);
                        default:
                            return AmoebaDebugFragment.m17867G(this.f19321x, (AbstractC40638a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC4729d.m14794l(abstractC0908cM17865E, function1, (Function1) objM87133R3, c28655q, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: E */
    private static final AbstractC0908c m17865E(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC0908c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m17866F(AmoebaDebugFragment amoebaDebugFragment, AbstractC0906a it) {
        AbstractC22676k.m65750j(it, "it");
        amoebaDebugFragment.m17863C().m2237l(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m17867G(AmoebaDebugFragment amoebaDebugFragment, AbstractC40638a it) {
        AbstractC22676k.m65750j(it, "it");
        if (!(it instanceof AbstractC40638a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC28163g0.m85259o(amoebaDebugFragment).m85343i();
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 0), true, -672988560));
    }
}
