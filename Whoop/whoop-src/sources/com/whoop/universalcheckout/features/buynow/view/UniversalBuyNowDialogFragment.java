package com.whoop.universalcheckout.features.buynow.view;

import android.content.ComponentCallbacks;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qn2.C30522a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sn2.C32782h;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vn2.C36216a;
import vn2.C36217b;
import w20.C36727q;
import wn2.C37430h;
import wn2.InterfaceC37427e;
import wn2.InterfaceC37431i;
import wr0.C37550r;
import x30.C37900j1;
import yb3.AbstractC39414r;
import yn2.AbstractC39675b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010 \u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010 \u001a\u0004\b>\u0010?¨\u0006C²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/buynow/view/UniversalBuyNowDialogFragment;", "Landroidx/fragment/app/y;", "<init>", "()V", "Landroid/view/View;", "Ll83/a0;", "Y", "(Landroid/view/View;)V", "", NotificationCompat.CATEGORY_EVENT, "Lwn2/i;", "viewState", "R", "(Ljava/lang/Object;Lwn2/i;)V", "Landroid/os/Bundle;", "Lsn2/h;", "b0", "(Landroid/os/Bundle;)Lsn2/h;", "", "key", "T", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "O", "()Lsn2/h;", "selection", "x", "P", "()Ljava/lang/String;", "storeDomain", "Lwn2/h;", "y", "Q", "()Lwn2/h;", "viewModel", "Lvn2/b;", "z", "N", "()Lvn2/b;", "navRouter", "Lvn2/a;", "E", "K", "()Lvn2/a;", "actionRouter", "Lqn2/a;", "F", "L", "()Lqn2/a;", "analyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "G", "M", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "H", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UniversalBuyNowDialogFragment extends DialogInterfaceOnCancelListenerC1361y {

    /* JADX INFO: renamed from: I */
    public static final int f32407I = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h selection;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h storeDomain;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$onCreateView$1$1$1", m100430f = "UniversalBuyNowDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10645b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32415w;

        public C10645b(InterfaceC30057d<? super C10645b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return UniversalBuyNowDialogFragment.this.new C10645b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10645b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32415w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            UniversalBuyNowDialogFragment.this.m27589Q().m119827n(InterfaceC37427e.g.f160185a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$onCreateView$1$2$1", m100430f = "UniversalBuyNowDialogFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10646c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32417w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC37431i f32418x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ UniversalBuyNowDialogFragment f32419y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ View f32420z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10646c(InterfaceC37431i interfaceC37431i, UniversalBuyNowDialogFragment universalBuyNowDialogFragment, View view, InterfaceC30057d<? super C10646c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32418x = interfaceC37431i;
            this.f32419y = universalBuyNowDialogFragment;
            this.f32420z = view;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10646c(this.f32418x, this.f32419y, this.f32420z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10646c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32417w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f32418x instanceof InterfaceC37431i.c) {
                this.f32419y.m27597Y(this.f32420z);
                this.f32419y.m27584L().m93541c((InterfaceC37431i.c) this.f32418x);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$d */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$onCreateView$1$3$1", m100430f = "UniversalBuyNowDialogFragment.kt", m100431l = {157, 83, 166}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10647d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f32421E;

        /* JADX INFO: renamed from: F */
        int f32422F;

        /* JADX INFO: renamed from: G */
        boolean f32423G;

        /* JADX INFO: renamed from: H */
        int f32424H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC37431i f32425I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ UniversalBuyNowDialogFragment f32426J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ View f32427K;

        /* JADX INFO: renamed from: w */
        Object f32428w;

        /* JADX INFO: renamed from: x */
        Object f32429x;

        /* JADX INFO: renamed from: y */
        Object f32430y;

        /* JADX INFO: renamed from: z */
        Object f32431z;

        /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ UniversalBuyNowDialogFragment f32432w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC37431i f32433x;

            public a(UniversalBuyNowDialogFragment universalBuyNowDialogFragment, InterfaceC37431i interfaceC37431i) {
                this.f32432w = universalBuyNowDialogFragment;
                this.f32433x = interfaceC37431i;
            }

            @Override // c93.InterfaceC4339a
            public final C23454a0 invoke() {
                this.f32432w.m27590R(new InterfaceC37427e.e(((InterfaceC37431i.a) this.f32433x).getCheckoutDestination()), this.f32433x);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$d$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ UniversalBuyNowDialogFragment f32434w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC37431i f32435x;

            public b(UniversalBuyNowDialogFragment universalBuyNowDialogFragment, InterfaceC37431i interfaceC37431i) {
                this.f32434w = universalBuyNowDialogFragment;
                this.f32435x = interfaceC37431i;
            }

            @Override // c93.InterfaceC4339a
            public final C23454a0 invoke() {
                this.f32434w.m27590R(new InterfaceC37427e.h(((InterfaceC37431i.e) this.f32435x).getCartId()), this.f32435x);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10647d(InterfaceC37431i interfaceC37431i, UniversalBuyNowDialogFragment universalBuyNowDialogFragment, View view, InterfaceC30057d<? super C10647d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32425I = interfaceC37431i;
            this.f32426J = universalBuyNowDialogFragment;
            this.f32427K = view;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10647d(this.f32425I, this.f32426J, this.f32427K, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10647d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e2 A[PHI: r12
          0x00e2: PHI (r12v4 com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$d) = 
          (r12v2 com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$d)
          (r12v5 com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$d)
         binds: [B:30:0x00df, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:34:0x0104  */
        /* JADX WARN: Code duplicated, block: B:36:0x010c  */
        /* JADX WARN: Code duplicated, block: B:38:0x0116  */
        /* JADX WARN: Code duplicated, block: B:39:0x0126  */
        /* JADX WARN: Code duplicated, block: B:41:0x012c  */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0145, code lost:
        
            if (androidx.lifecycle.AbstractC1613o1.m5026p(r7, r8, r9, r10, r11, r12) == r0) goto L43;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 331
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment.C10647d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10648e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32436w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32437x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32438y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10648e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32436w = componentCallbacks;
            this.f32437x = interfaceC35951a;
            this.f32438y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vn2.b] */
        @Override // c93.InterfaceC4339a
        public final C36217b invoke() {
            ComponentCallbacks componentCallbacks = this.f32436w;
            InterfaceC35951a interfaceC35951a = this.f32437x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32438y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36217b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10649f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32439w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32440x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32441y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10649f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32439w = componentCallbacks;
            this.f32440x = interfaceC35951a;
            this.f32441y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vn2.a] */
        @Override // c93.InterfaceC4339a
        public final C36216a invoke() {
            ComponentCallbacks componentCallbacks = this.f32439w;
            InterfaceC35951a interfaceC35951a = this.f32440x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32441y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36216a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10650g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32442w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32443x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32444y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10650g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32442w = componentCallbacks;
            this.f32443x = interfaceC35951a;
            this.f32444y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qn2.a] */
        @Override // c93.InterfaceC4339a
        public final C30522a invoke() {
            ComponentCallbacks componentCallbacks = this.f32442w;
            InterfaceC35951a interfaceC35951a = this.f32443x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32444y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30522a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10651h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32445w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32446x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32447y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10651h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32445w = componentCallbacks;
            this.f32446x = interfaceC35951a;
            this.f32447y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f32445w;
            InterfaceC35951a interfaceC35951a = this.f32446x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32447y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$i */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10652i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32448w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10652i(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32448w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32448w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10653j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32449w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32450x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32451y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32452z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10653j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32449w = componentCallbacks;
            this.f32450x = interfaceC35951a;
            this.f32451y = interfaceC4339a;
            this.f32452z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, wn2.h] */
        @Override // c93.InterfaceC4339a
        public final C37430h invoke() {
            return AbstractC34132o.m107857B(this.f32449w, this.f32450x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37430h.class), this.f32451y, this.f32452z);
        }
    }

    public UniversalBuyNowDialogFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        final int i13 = 0;
        this.selection = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: yn2.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UniversalBuyNowDialogFragment f170792x;

            {
                this.f170792x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return UniversalBuyNowDialogFragment.m27598Z(this.f170792x);
                    case 1:
                        return UniversalBuyNowDialogFragment.m27599a0(this.f170792x);
                    case 2:
                        return UniversalBuyNowDialogFragment.m27601c0(this.f170792x);
                    default:
                        return UniversalBuyNowDialogFragment.m27591S(this.f170792x);
                }
            }
        });
        final int i14 = 1;
        this.storeDomain = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: yn2.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UniversalBuyNowDialogFragment f170792x;

            {
                this.f170792x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return UniversalBuyNowDialogFragment.m27598Z(this.f170792x);
                    case 1:
                        return UniversalBuyNowDialogFragment.m27599a0(this.f170792x);
                    case 2:
                        return UniversalBuyNowDialogFragment.m27601c0(this.f170792x);
                    default:
                        return UniversalBuyNowDialogFragment.m27591S(this.f170792x);
                }
            }
        });
        final int i15 = 2;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C10653j(this, null, new C10652i(this), new InterfaceC4339a(this) { // from class: yn2.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UniversalBuyNowDialogFragment f170792x;

            {
                this.f170792x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return UniversalBuyNowDialogFragment.m27598Z(this.f170792x);
                    case 1:
                        return UniversalBuyNowDialogFragment.m27599a0(this.f170792x);
                    case 2:
                        return UniversalBuyNowDialogFragment.m27601c0(this.f170792x);
                    default:
                        return UniversalBuyNowDialogFragment.m27591S(this.f170792x);
                }
            }
        }));
        final int i16 = 3;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: yn2.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ UniversalBuyNowDialogFragment f170792x;

            {
                this.f170792x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return UniversalBuyNowDialogFragment.m27598Z(this.f170792x);
                    case 1:
                        return UniversalBuyNowDialogFragment.m27599a0(this.f170792x);
                    case 2:
                        return UniversalBuyNowDialogFragment.m27601c0(this.f170792x);
                    default:
                        return UniversalBuyNowDialogFragment.m27591S(this.f170792x);
                }
            }
        };
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i2, new C10648e(this, null, interfaceC4339a));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i2, new C10649f(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i2, new C10650g(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i2, new C10651h(this, null, null));
    }

    /* JADX INFO: renamed from: K */
    private final C36216a m27583K() {
        return (C36216a) this.actionRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final C30522a m27584L() {
        return (C30522a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final FeatureFlagChecker m27585M() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final C36217b m27586N() {
        return (C36217b) this.navRouter.getValue();
    }

    /* JADX INFO: renamed from: O */
    private final C32782h m27587O() {
        return (C32782h) this.selection.getValue();
    }

    /* JADX INFO: renamed from: P */
    private final String m27588P() {
        return (String) this.storeDomain.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final C37430h m27589Q() {
        return (C37430h) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final void m27590R(Object event, InterfaceC37431i viewState) {
        InterfaceC37431i.c cVar = viewState instanceof InterfaceC37431i.c ? (InterfaceC37431i.c) viewState : null;
        InterfaceC37427e interfaceC37427eM115281a = m27583K().m115281a(event, cVar != null ? cVar.getPaymentMethodId() : null);
        if (interfaceC37427eM115281a != null) {
            m27584L().m93540b(interfaceC37427eM115281a, cVar);
        }
        if (interfaceC37427eM115281a instanceof InterfaceC37427e.i) {
            m27589Q().m119827n((InterfaceC37427e.i) interfaceC37427eM115281a);
            return;
        }
        if (!(interfaceC37427eM115281a instanceof InterfaceC37427e.d)) {
            if (interfaceC37427eM115281a != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (m27586N().m115285c((InterfaceC37427e.d) interfaceC37427eM115281a)) {
            m27589Q().m119827n(InterfaceC37427e.b.f160178a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C34911a m27591S(UniversalBuyNowDialogFragment universalBuyNowDialogFragment) {
        return AbstractC15751g.m44431K(universalBuyNowDialogFragment.requireActivity(), AbstractC5583n.m16799z(universalBuyNowDialogFragment));
    }

    /* JADX INFO: renamed from: T */
    private final String m27592T(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null || AbstractC39414r.m125890i0(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m27593U(UniversalBuyNowDialogFragment universalBuyNowDialogFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(universalBuyNowDialogFragment.m27589Q().getViewState(), InterfaceC37431i.d.f160237a, null, c28655q, 48, 2);
        View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
        InterfaceC37431i interfaceC37431iM27594V = m27594V(interfaceC28601c1M87260n);
        boolean zM87157i = c28655q.m87157i(universalBuyNowDialogFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = universalBuyNowDialogFragment.new C10645b(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        Boolean boolValueOf = Boolean.valueOf(interfaceC37431iM27594V instanceof InterfaceC37431i.c);
        boolean zM87157i2 = c28655q.m87157i(interfaceC37431iM27594V) | c28655q.m87157i(universalBuyNowDialogFragment) | c28655q.m87157i(view);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C10646c(interfaceC37431iM27594V, universalBuyNowDialogFragment, view, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
        boolean zM87157i3 = c28655q.m87157i(interfaceC37431iM27594V) | c28655q.m87157i(universalBuyNowDialogFragment) | c28655q.m87157i(view);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C10647d(interfaceC37431iM27594V, universalBuyNowDialogFragment, view, null);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, interfaceC37431iM27594V);
        boolean zM87157i4 = c28655q.m87157i(universalBuyNowDialogFragment) | c28655q.m87157i(interfaceC37431iM27594V);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i4 || objM87133R4 == c28676v0) {
            objM87133R4 = new C37550r(29, universalBuyNowDialogFragment, interfaceC37431iM27594V);
            c28655q.m87172p0(objM87133R4);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
        boolean zM87157i5 = c28655q.m87157i(universalBuyNowDialogFragment) | c28655q.m87157i(interfaceC37431iM27594V);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i5 || objM87133R5 == c28676v0) {
            objM87133R5 = new C37900j1(14, universalBuyNowDialogFragment, interfaceC37431iM27594V);
            c28655q.m87172p0(objM87133R5);
        }
        AbstractC39675b.m126889m(interfaceC37431iM27594V, interfaceC4339a, (Function1) objM87133R5, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: V */
    private static final InterfaceC37431i m27594V(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC37431i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m27595W(UniversalBuyNowDialogFragment universalBuyNowDialogFragment, InterfaceC37431i interfaceC37431i) {
        universalBuyNowDialogFragment.m27590R(InterfaceC37427e.a.f160177a, interfaceC37431i);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m27596X(UniversalBuyNowDialogFragment universalBuyNowDialogFragment, InterfaceC37431i interfaceC37431i, Object event) {
        AbstractC22676k.m65750j(event, "event");
        universalBuyNowDialogFragment.m27590R(event, interfaceC37431i);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m27597Y(View view) {
        if (m27585M().isFeatureEnabled("commerce-success-haptics-android")) {
            view.performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 16 : 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C32782h m27598Z(UniversalBuyNowDialogFragment universalBuyNowDialogFragment) {
        return universalBuyNowDialogFragment.m27600b0(universalBuyNowDialogFragment.getArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final String m27599a0(UniversalBuyNowDialogFragment universalBuyNowDialogFragment) {
        Bundle arguments = universalBuyNowDialogFragment.getArguments();
        String string = arguments != null ? arguments.getString("storeDomain") : null;
        return string == null ? "" : string;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX INFO: renamed from: b0 */
    private final C32782h m27600b0(Bundle bundle) {
        ArrayList arrayList;
        if (bundle == null) {
            return new C32782h(null, null, null, null, null, null, null, null, 255, null);
        }
        String strM27592T = m27592T(bundle, "sku");
        String strM27592T2 = m27592T(bundle, "packSku");
        String strM27592T3 = m27592T(bundle, "childItemSkus");
        if (strM27592T3 != null) {
            List listM125906y0 = AbstractC39414r.m125906y0(strM27592T3, new String[]{","}, 6);
            arrayList = new ArrayList();
            for (Object obj : listM125906y0) {
                if (!AbstractC39414r.m125890i0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        return new C32782h(strM27592T, strM27592T2, arrayList, m27592T(bundle, "wywSku"), m27592T(bundle, "bandSku"), m27592T(bundle, "claspSku"), m27592T(bundle, "hookSku"), m27592T(bundle, "fastLinkSku"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C34911a m27601c0(UniversalBuyNowDialogFragment universalBuyNowDialogFragment) {
        return AbstractC15751g.m44431K(universalBuyNowDialogFragment.m27587O(), universalBuyNowDialogFragment.m27588P());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, AbstractC24542b.f95795a);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 18), true, 604298864));
    }
}
