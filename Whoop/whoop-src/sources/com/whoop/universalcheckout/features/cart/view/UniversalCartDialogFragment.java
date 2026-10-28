package com.whoop.universalcheckout.features.cart.view;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.universalcheckout.features.cart.domain.AbstractC10659b;
import com.whoop.universalcheckout.features.cart.domain.CartAddIntent;
import do2.C12235a;
import do2.C12236b;
import ej1.C13242h;
import eo2.AbstractC13393m;
import eo2.C13381a;
import eo2.C13386f;
import eo2.C13387g;
import eo2.InterfaceC13383c;
import fd3.C14408a;
import ge3.AbstractC15751g;
import go2.C16018a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ln2.AbstractC24541a;
import ln2.AbstractC24542b;
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
import yb3.AbstractC39414r;
import zn2.C40907a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001d\u0010\"\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0017\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0017\u001a\u0004\b4\u00105¨\u0006;²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/cart/view/UniversalCartDialogFragment;", "Landroidx/fragment/app/y;", "<init>", "()V", "", NotificationCompat.CATEGORY_EVENT, "", "subtotal", "Ll83/a0;", "V", "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "R", "()Ljava/lang/String;", "cartId", "x", "T", "sku", "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "y", "P", "()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;", "addIntent", "Leo2/f;", "z", "U", "()Leo2/f;", "viewModel", "Ldo2/b;", "E", "S", "()Ldo2/b;", "navRouter", "Ldo2/a;", "F", "O", "()Ldo2/a;", "actionRouter", "Lzn2/a;", "G", "Q", "()Lzn2/a;", "analyticsHelper", "H", "a", "Leo2/g;", "viewState", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UniversalCartDialogFragment extends DialogInterfaceOnCancelListenerC1361y {

    /* JADX INFO: renamed from: I */
    public static final int f32542I = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h cartId = AbstractC30060g.m92088H(new C16018a(this, 0));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h sku = AbstractC30060g.m92088H(new C16018a(this, 1));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h addIntent = AbstractC30060g.m92088H(new C16018a(this, 2));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10681i(this, null, new C10680h(this), null));

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$onCreateView$1$1$1", m100430f = "UniversalCartDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10674b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32550w;

        public C10674b(InterfaceC30057d<? super C10674b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return UniversalCartDialogFragment.this.new C10674b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10674b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13383c.h bVar;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32550w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            CartAddIntent cartAddIntentM27667P = UniversalCartDialogFragment.this.m27667P();
            String strM27671T = UniversalCartDialogFragment.this.m27671T();
            if (cartAddIntentM27667P != null) {
                bVar = new InterfaceC13383c.a(cartAddIntentM27667P, UniversalCartDialogFragment.this.m27669R());
            } else {
                bVar = strM27671T != null ? new InterfaceC13383c.b(strM27671T, UniversalCartDialogFragment.this.m27669R()) : new InterfaceC13383c.e(UniversalCartDialogFragment.this.m27669R());
            }
            UniversalCartDialogFragment.this.m27672U().m37788n(bVar);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$onCreateView$1$2$1", m100430f = "UniversalCartDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10675c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32552w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13381a f32553x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ UniversalCartDialogFragment f32554y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10675c(C13381a c13381a, UniversalCartDialogFragment universalCartDialogFragment, InterfaceC30057d<? super C10675c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32553x = c13381a;
            this.f32554y = universalCartDialogFragment;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10675c(this.f32553x, this.f32554y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10675c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32552w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f32553x != null) {
                this.f32554y.m27668Q().m132598f(this.f32553x.getAnalyticsSubtotalValue());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$d */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$onCreateView$1$3$1", m100430f = "UniversalCartDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10676d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32555w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f32556x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f32557y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10676d(Context context, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super C10676d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32556x = context;
            this.f32557y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10676d(this.f32556x, this.f32557y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10676d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32555w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (UniversalCartDialogFragment.m27676Y(this.f32557y).getErrorKind() == AbstractC10659b.a.EnumC41432a.Mutation) {
                Context context = this.f32556x;
                Toast.makeText(context, context.getString(AbstractC24541a.f95770b), 0).show();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10677e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32558w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32559x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32560y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10677e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32558w = componentCallbacks;
            this.f32559x = interfaceC35951a;
            this.f32560y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [do2.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C12236b invoke() {
            ComponentCallbacks componentCallbacks = this.f32558w;
            InterfaceC35951a interfaceC35951a = this.f32559x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32560y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12236b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10678f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32561w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32562x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32563y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10678f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32561w = componentCallbacks;
            this.f32562x = interfaceC35951a;
            this.f32563y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [do2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C12235a invoke() {
            ComponentCallbacks componentCallbacks = this.f32561w;
            InterfaceC35951a interfaceC35951a = this.f32562x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32563y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12235a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10679g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32564w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32565x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32566y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10679g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32564w = componentCallbacks;
            this.f32565x = interfaceC35951a;
            this.f32566y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zn2.a] */
        @Override // c93.InterfaceC4339a
        public final C40907a invoke() {
            ComponentCallbacks componentCallbacks = this.f32564w;
            InterfaceC35951a interfaceC35951a = this.f32565x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32566y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40907a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10680h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32567w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10680h(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32567w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32567w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10681i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32568w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32569x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32570y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32571z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10681i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32568w = componentCallbacks;
            this.f32569x = interfaceC35951a;
            this.f32570y = interfaceC4339a;
            this.f32571z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, eo2.f] */
        @Override // c93.InterfaceC4339a
        public final C13386f invoke() {
            return AbstractC34132o.m107857B(this.f32568w, this.f32569x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13386f.class), this.f32570y, this.f32571z);
        }
    }

    public UniversalCartDialogFragment() {
        C16018a c16018a = new C16018a(this, 3);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C10677e(this, null, c16018a));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C10678f(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10679g(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final CartAddIntent m27664M(UniversalCartDialogFragment universalCartDialogFragment) {
        CartAddIntent.Companion companion = CartAddIntent.INSTANCE;
        Bundle arguments = universalCartDialogFragment.getArguments();
        return CartAddIntent.Companion.m27605c(companion, arguments != null ? arguments.getString("addIntent") : null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final String m27665N(UniversalCartDialogFragment universalCartDialogFragment) {
        String string;
        Bundle arguments = universalCartDialogFragment.getArguments();
        if (arguments == null || (string = arguments.getString("cartId")) == null || AbstractC39414r.m125890i0(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: O */
    private final C12235a m27666O() {
        return (C12235a) this.actionRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final CartAddIntent m27667P() {
        return (CartAddIntent) this.addIntent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final C40907a m27668Q() {
        return (C40907a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final String m27669R() {
        return (String) this.cartId.getValue();
    }

    /* JADX INFO: renamed from: S */
    private final C12236b m27670S() {
        return (C12236b) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final String m27671T() {
        return (String) this.sku.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final C13386f m27672U() {
        return (C13386f) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final void m27673V(Object event, String subtotal) {
        InterfaceC13383c interfaceC13383cM34026a = m27666O().m34026a(event);
        if (interfaceC13383cM34026a instanceof InterfaceC13383c.h) {
            InterfaceC13383c.h hVar = (InterfaceC13383c.h) interfaceC13383cM34026a;
            m27668Q().m132595a(hVar, subtotal);
            m27672U().m37788n(hVar);
        } else if (interfaceC13383cM34026a instanceof InterfaceC13383c.d) {
            m27670S().m34027a((InterfaceC13383c.d) interfaceC13383cM34026a, subtotal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C34911a m27674W(UniversalCartDialogFragment universalCartDialogFragment) {
        return AbstractC15751g.m44431K(universalCartDialogFragment.requireActivity(), AbstractC5583n.m16799z(universalCartDialogFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m27675X(UniversalCartDialogFragment universalCartDialogFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(universalCartDialogFragment.m27672U().getViewState(), new C13387g(true, false, null, false, null, null, 62, null), null, c28655q, 0, 2);
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        C13381a c13381aM37789a = m27676Y(interfaceC28601c1M87260n).getData();
        boolean zM87157i = c28655q.m87157i(universalCartDialogFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = universalCartDialogFragment.new C10674b(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        Boolean boolValueOf = Boolean.valueOf(c13381aM37789a != null);
        boolean zM87157i2 = c28655q.m87157i(c13381aM37789a) | c28655q.m87157i(universalCartDialogFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C10675c(c13381aM37789a, universalCartDialogFragment, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
        AbstractC10659b.a.EnumC41432a enumC41432aM37790b = m27676Y(interfaceC28601c1M87260n).getErrorKind();
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(context);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g || objM87133R3 == c28676v0) {
            objM87133R3 = new C10676d(context, interfaceC28601c1M87260n, null);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, enumC41432aM37790b);
        C13387g c13387gM27676Y = m27676Y(interfaceC28601c1M87260n);
        boolean zM87157i3 = c28655q.m87157i(universalCartDialogFragment);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i3 || objM87133R4 == c28676v0) {
            objM87133R4 = new C16018a(universalCartDialogFragment, 4);
            c28655q.m87172p0(objM87133R4);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
        boolean zM87157i4 = c28655q.m87157i(universalCartDialogFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i4 || objM87133R5 == c28676v0) {
            objM87133R5 = new C14408a(22, universalCartDialogFragment, interfaceC28601c1M87260n);
            c28655q.m87172p0(objM87133R5);
        }
        AbstractC13393m.m37810o(c13387gM27676Y, interfaceC4339a, (Function1) objM87133R5, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C13387g m27676Y(InterfaceC28670t2 interfaceC28670t2) {
        return (C13387g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m27677Z(UniversalCartDialogFragment universalCartDialogFragment) {
        AbstractC5583n.m16799z(universalCartDialogFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m27678a0(UniversalCartDialogFragment universalCartDialogFragment, InterfaceC28670t2 interfaceC28670t2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        C13381a c13381aM37789a = m27676Y(interfaceC28670t2).getData();
        universalCartDialogFragment.m27673V(event, c13381aM37789a != null ? c13381aM37789a.getAnalyticsSubtotalValue() : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final String m27679b0(UniversalCartDialogFragment universalCartDialogFragment) {
        String string;
        Bundle arguments = universalCartDialogFragment.getArguments();
        if (arguments == null || (string = arguments.getString("sku")) == null || AbstractC39414r.m125890i0(string)) {
            return null;
        }
        return string;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, AbstractC24542b.f95796b);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C13242h(this, 20), true, -1834184128));
    }
}
