package com.whoop.nativestore.pdp.view;

import a02.C0096a;
import a02.C0097b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import b02.C2197a;
import b02.C2201e;
import b02.InterfaceC2199c;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment;
import ej1.C13242h;
import ge3.AbstractC15751g;
import h02.AbstractC16570f;
import h02.C16574h;
import i02.C17847a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kd1.AbstractC22413y;
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
import wz1.C37781a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010(R\u001d\u0010,\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0012\u001a\u0004\b+\u0010(R\u001d\u0010/\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010(¨\u00062²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/view/ProductDescriptionPageFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Li02/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "P", "()Li02/a;", "viewModel", "La02/b;", "x", "L", "()La02/b;", "navRouter", "La02/a;", "y", "J", "()La02/a;", "actionRouter", "Lwz1/a;", "z", "K", "()Lwz1/a;", "analyticsHelper", "", "E", "N", "()Ljava/lang/String;", "slug", "F", "M", "sku", "G", "O", "source", "Lb02/e;", "viewState", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProductDescriptionPageFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h slug;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h sku;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment$onCreateView$1$1$1", m100430f = "ProductDescriptionPageFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9204a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27440w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2197a f27441x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ProductDescriptionPageFragment f27442y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9204a(C2197a c2197a, ProductDescriptionPageFragment productDescriptionPageFragment, InterfaceC30057d<? super C9204a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f27441x = c2197a;
            this.f27442y = productDescriptionPageFragment;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C9204a(this.f27441x, this.f27442y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9204a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27440w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f27441x == null) {
                this.f27442y.m23005P().m51325n(new InterfaceC2199c.g(this.f27442y.m23003N(), this.f27442y.m23002M(), this.f27442y.m23004O()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment$onCreateView$1$2$1", m100430f = "ProductDescriptionPageFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9205b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27443w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2197a f27444x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ProductDescriptionPageFragment f27445y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9205b(C2197a c2197a, ProductDescriptionPageFragment productDescriptionPageFragment, InterfaceC30057d<? super C9205b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f27444x = c2197a;
            this.f27445y = productDescriptionPageFragment;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C9205b(this.f27444x, this.f27445y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9205b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27443w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f27444x != null) {
                this.f27445y.m23000K().m121244i(this.f27444x.getProductName(), this.f27444x.getSelectedPrice(), this.f27445y.m23004O(), this.f27444x.m6948b());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9206c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27446w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27447x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27448y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9206c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27446w = componentCallbacks;
            this.f27447x = interfaceC35951a;
            this.f27448y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [a02.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C0097b invoke() {
            ComponentCallbacks componentCallbacks = this.f27446w;
            InterfaceC35951a interfaceC35951a = this.f27447x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27448y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0097b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9207d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27449w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27450x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27451y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9207d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27449w = componentCallbacks;
            this.f27450x = interfaceC35951a;
            this.f27451y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [a02.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C0096a invoke() {
            ComponentCallbacks componentCallbacks = this.f27449w;
            InterfaceC35951a interfaceC35951a = this.f27450x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27451y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0096a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9208e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27452w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27453x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27454y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9208e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27452w = componentCallbacks;
            this.f27453x = interfaceC35951a;
            this.f27454y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wz1.a] */
        @Override // c93.InterfaceC4339a
        public final C37781a invoke() {
            ComponentCallbacks componentCallbacks = this.f27452w;
            InterfaceC35951a interfaceC35951a = this.f27453x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27454y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37781a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9209f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27455w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9209f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27455w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27455w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.pdp.view.ProductDescriptionPageFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9210g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27456w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27457x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27458y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27459z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9210g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27456w = componentCallbacks;
            this.f27457x = interfaceC35951a;
            this.f27458y = interfaceC4339a;
            this.f27459z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, i02.a] */
        @Override // c93.InterfaceC4339a
        public final C17847a invoke() {
            return AbstractC34132o.m107857B(this.f27456w, this.f27457x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17847a.class), this.f27458y, this.f27459z);
        }
    }

    public ProductDescriptionPageFragment() {
        C9209f c9209f = new C9209f(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C9210g(this, null, c9209f, null));
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: h02.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ProductDescriptionPageFragment f63858x;

            {
                this.f63858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ProductDescriptionPageFragment.m23006Q(this.f63858x);
                    case 1:
                        return ProductDescriptionPageFragment.m23011V(this.f63858x);
                    case 2:
                        return ProductDescriptionPageFragment.m23010U(this.f63858x);
                    default:
                        return ProductDescriptionPageFragment.m23012W(this.f63858x);
                }
            }
        };
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i2, new C9206c(this, null, interfaceC4339a));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i2, new C9207d(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i2, new C9208e(this, null, null));
        final int i14 = 1;
        this.slug = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: h02.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ProductDescriptionPageFragment f63858x;

            {
                this.f63858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ProductDescriptionPageFragment.m23006Q(this.f63858x);
                    case 1:
                        return ProductDescriptionPageFragment.m23011V(this.f63858x);
                    case 2:
                        return ProductDescriptionPageFragment.m23010U(this.f63858x);
                    default:
                        return ProductDescriptionPageFragment.m23012W(this.f63858x);
                }
            }
        });
        final int i15 = 2;
        this.sku = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: h02.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ProductDescriptionPageFragment f63858x;

            {
                this.f63858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ProductDescriptionPageFragment.m23006Q(this.f63858x);
                    case 1:
                        return ProductDescriptionPageFragment.m23011V(this.f63858x);
                    case 2:
                        return ProductDescriptionPageFragment.m23010U(this.f63858x);
                    default:
                        return ProductDescriptionPageFragment.m23012W(this.f63858x);
                }
            }
        });
        final int i16 = 3;
        this.source = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: h02.t

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ProductDescriptionPageFragment f63858x;

            {
                this.f63858x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return ProductDescriptionPageFragment.m23006Q(this.f63858x);
                    case 1:
                        return ProductDescriptionPageFragment.m23011V(this.f63858x);
                    case 2:
                        return ProductDescriptionPageFragment.m23010U(this.f63858x);
                    default:
                        return ProductDescriptionPageFragment.m23012W(this.f63858x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: J */
    private final C0096a m22999J() {
        return (C0096a) this.actionRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final C37781a m23000K() {
        return (C37781a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final C0097b m23001L() {
        return (C0097b) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final String m23002M() {
        return (String) this.sku.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final String m23003N() {
        return (String) this.slug.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final String m23004O() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final C17847a m23005P() {
        return (C17847a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C34911a m23006Q(ProductDescriptionPageFragment productDescriptionPageFragment) {
        return AbstractC15751g.m44431K(productDescriptionPageFragment.requireActivity(), AbstractC5583n.m16799z(productDescriptionPageFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m23007R(ProductDescriptionPageFragment productDescriptionPageFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(productDescriptionPageFragment.m23005P().getViewState(), c28655q, 0);
        C2197a c2197aM7003d = m23008S(interfaceC28601c1M87261o).getData();
        if (c2197aM7003d != null) {
            c28655q.m87150e0(-1848875118);
            AbstractC22413y.m64544e(c28655q, 0);
        } else {
            c28655q.m87150e0(-1480528822);
        }
        c28655q.m87173q(false);
        boolean zM87157i = c28655q.m87157i(c2197aM7003d) | c28655q.m87157i(productDescriptionPageFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C9204a(c2197aM7003d, productDescriptionPageFragment, null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        String strM6951e = c2197aM7003d != null ? c2197aM7003d.getProductName() : null;
        boolean zM87157i2 = c28655q.m87157i(c2197aM7003d) | c28655q.m87157i(productDescriptionPageFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C9205b(c2197aM7003d, productDescriptionPageFragment, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, strM6951e);
        C2201e c2201eM23008S = m23008S(interfaceC28601c1M87261o);
        String strM23003N = productDescriptionPageFragment.m23003N();
        String strM23002M = productDescriptionPageFragment.m23002M();
        String strM23004O = productDescriptionPageFragment.m23004O();
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87261o) | c28655q.m87157i(productDescriptionPageFragment);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g || objM87133R3 == c28676v0) {
            objM87133R3 = new C16574h(1, productDescriptionPageFragment, interfaceC28601c1M87261o);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC16570f.m46950f(c2201eM23008S, strM23003N, strM23002M, strM23004O, (Function1) objM87133R3, null, c28655q, 0, 32);
        return c23454a0;
    }

    /* JADX INFO: renamed from: S */
    private static final C2201e m23008S(InterfaceC28670t2 interfaceC28670t2) {
        return (C2201e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m23009T(ProductDescriptionPageFragment productDescriptionPageFragment, InterfaceC28670t2 interfaceC28670t2, Object event) {
        C2197a c2197aM7003d;
        AbstractC22676k.m65750j(event, "event");
        if ((event instanceof InterfaceC2199c.h) && (c2197aM7003d = m23008S(interfaceC28670t2).getData()) != null) {
            productDescriptionPageFragment.m23000K().m121243h(((InterfaceC2199c.h) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), c2197aM7003d.getProductName(), c2197aM7003d.getSelectedPrice());
        }
        InterfaceC2199c interfaceC2199cM262c = productDescriptionPageFragment.m22999J().m262c(event);
        if (interfaceC2199cM262c instanceof InterfaceC2199c.m) {
            productDescriptionPageFragment.m23005P().m51325n((InterfaceC2199c.m) interfaceC2199cM262c);
        } else if (interfaceC2199cM262c instanceof InterfaceC2199c.i) {
            C0097b c0097bM23001L = productDescriptionPageFragment.m23001L();
            InterfaceC2199c.i iVar = (InterfaceC2199c.i) interfaceC2199cM262c;
            C2197a c2197aM7003d2 = m23008S(interfaceC28670t2).getData();
            String strM6951e = c2197aM7003d2 != null ? c2197aM7003d2.getProductName() : null;
            C2197a c2197aM7003d3 = m23008S(interfaceC28670t2).getData();
            c0097bM23001L.m265b(iVar, strM6951e, c2197aM7003d3 != null ? c2197aM7003d3.getSelectedPrice() : null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final String m23010U(ProductDescriptionPageFragment productDescriptionPageFragment) {
        Bundle arguments = productDescriptionPageFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("sku");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final String m23011V(ProductDescriptionPageFragment productDescriptionPageFragment) {
        Bundle arguments = productDescriptionPageFragment.getArguments();
        String string = arguments != null ? arguments.getString("slug") : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final String m23012W(ProductDescriptionPageFragment productDescriptionPageFragment) {
        Bundle arguments = productDescriptionPageFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("source");
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C13242h(this, 23), true, 1258409880));
    }
}
