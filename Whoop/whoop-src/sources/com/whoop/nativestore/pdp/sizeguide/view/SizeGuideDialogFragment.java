package com.whoop.nativestore.pdp.sizeguide.view;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.nativestore.pdp.sizeguide.view.SizeGuideDialogFragment;
import d02.C11444a;
import e02.C12507c;
import e02.C12511g;
import e02.InterfaceC12508d;
import e02.InterfaceC12510f;
import eg.C13161j;
import ej1.C13242h;
import f02.AbstractC13916b;
import g02.C14945a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mz1.AbstractC26040c;
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
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001f¨\u0006%²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/sizeguide/view/SizeGuideDialogFragment;", "Landroidx/fragment/app/y;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Ljava/lang/String;", "key", "Lg02/a;", "x", "H", "()Lg02/a;", "viewModel", "Ld02/a;", "y", "G", "()Ld02/a;", "navRouter", "z", "a", "Le02/g;", "viewState", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SizeGuideDialogFragment extends DialogInterfaceOnCancelListenerC1361y {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h key;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: E */
    public static final int f27418E = 8;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.sizeguide.view.SizeGuideDialogFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.sizeguide.view.SizeGuideDialogFragment$onCreateView$1$1$1", m100430f = "SizeGuideDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9200b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27423w;

        public C9200b(InterfaceC30057d<? super C9200b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SizeGuideDialogFragment.this.new C9200b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9200b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27423w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (SizeGuideDialogFragment.this.m22981F().length() > 0) {
                SizeGuideDialogFragment.this.m22983H().m43065n(new C12507c(SizeGuideDialogFragment.this.m22981F()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.sizeguide.view.SizeGuideDialogFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9201c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27425w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27426x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27427y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9201c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27425w = componentCallbacks;
            this.f27426x = interfaceC35951a;
            this.f27427y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [d02.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C11444a invoke() {
            ComponentCallbacks componentCallbacks = this.f27425w;
            InterfaceC35951a interfaceC35951a = this.f27426x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27427y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11444a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.sizeguide.view.SizeGuideDialogFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9202d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27428w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9202d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27428w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27428w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.sizeguide.view.SizeGuideDialogFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9203e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27429w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27430x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27431y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27432z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9203e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27429w = componentCallbacks;
            this.f27430x = interfaceC35951a;
            this.f27431y = interfaceC4339a;
            this.f27432z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, g02.a] */
        @Override // c93.InterfaceC4339a
        public final C14945a invoke() {
            return AbstractC34132o.m107857B(this.f27429w, this.f27430x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14945a.class), this.f27431y, this.f27432z);
        }
    }

    public SizeGuideDialogFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        final int i13 = 0;
        this.key = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: f02.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SizeGuideDialogFragment f49619x;

            {
                this.f49619x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return SizeGuideDialogFragment.m22984I(this.f49619x);
                    default:
                        return SizeGuideDialogFragment.m22985J(this.f49619x);
                }
            }
        });
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C9203e(this, null, new C9202d(this), null));
        final int i14 = 1;
        this.navRouter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9201c(this, null, new InterfaceC4339a(this) { // from class: f02.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SizeGuideDialogFragment f49619x;

            {
                this.f49619x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return SizeGuideDialogFragment.m22984I(this.f49619x);
                    default:
                        return SizeGuideDialogFragment.m22985J(this.f49619x);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final String m22981F() {
        return (String) this.key.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final C11444a m22982G() {
        return (C11444a) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final C14945a m22983H() {
        return (C14945a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final String m22984I(SizeGuideDialogFragment sizeGuideDialogFragment) {
        Bundle arguments = sizeGuideDialogFragment.getArguments();
        String string = arguments != null ? arguments.getString("key") : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C34911a m22985J(SizeGuideDialogFragment sizeGuideDialogFragment) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(sizeGuideDialogFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m22986K(SizeGuideDialogFragment sizeGuideDialogFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(sizeGuideDialogFragment.m22983H().getViewState(), new C12511g(true, false, null, 6, null), null, c28655q, 0, 2);
        boolean zM87157i = c28655q.m87157i(sizeGuideDialogFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = sizeGuideDialogFragment.new C9200b(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        C12511g c12511gM22987L = m22987L(interfaceC28601c1M87260n);
        String strM22981F = sizeGuideDialogFragment.m22981F();
        boolean zM87157i2 = c28655q.m87157i(sizeGuideDialogFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C13161j(sizeGuideDialogFragment, 4);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC13916b.m39652i(c12511gM22987L, strM22981F, (Function1) objM87133R2, null, c28655q, 0, 8);
        return c23454a0;
    }

    /* JADX INFO: renamed from: L */
    private static final C12511g m22987L(InterfaceC28670t2 interfaceC28670t2) {
        return (C12511g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m22988M(SizeGuideDialogFragment sizeGuideDialogFragment, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC12510f) {
            sizeGuideDialogFragment.m22983H().m43065n((InterfaceC12510f) event);
        } else if (event instanceof InterfaceC12508d) {
            sizeGuideDialogFragment.m22982G().m30717a((InterfaceC12508d) event);
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, AbstractC26040c.f103025a);
        AbstractC28163g0.m85256l(this);
        if (m22981F().length() == 0) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C13242h(this, 10), true, -88340625));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setLayout(-1, -1);
        window.setFlags(512, 512);
    }
}
