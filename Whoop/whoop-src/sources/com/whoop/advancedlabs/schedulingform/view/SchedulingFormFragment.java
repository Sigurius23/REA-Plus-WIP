package com.whoop.advancedlabs.schedulingform.view;

import ad0.AbstractC0747a;
import ad0.AbstractC0749c;
import ad0.C0748b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import be0.AbstractC3165a;
import be0.C3166b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd0.AbstractC4436b;
import ce0.AbstractC4487b;
import ce0.AbstractC4489d;
import ce0.C4488c;
import com.squareup.wire.AbstractC5583n;
import com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment;
import com.whoop.data.repositories.FeatureFlagChecker;
import eg.C13161j;
import fe0.AbstractC14415e;
import fe0.C14412b;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd0.InterfaceC22381a;
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
import ya0.C39355a;
import zc0.AbstractC40262a;
import zc0.C40263b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010,R\u001d\u00102\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u00101R\u001d\u00105\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0016\u001a\u0004\b4\u00101R\u001d\u00108\u001a\u0004\u0018\u00010.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0016\u001a\u0004\b7\u00101R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0016\u001a\u0004\b;\u0010<¨\u0006A²\u0006\f\u0010?\u001a\u00020>8\nX\u008a\u0084\u0002²\u0006\f\u0010?\u001a\u00020@8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroidx/compose/ui/platform/ComposeView;", "f0", "()Landroidx/compose/ui/platform/ComposeView;", "Z", "Lce0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "W", "()Lce0/c;", "viewModel", "Lad0/b;", "x", "U", "()Lad0/b;", "mobileViewModel", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lya0/a;", "z", "Q", "()Lya0/a;", "analyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "T", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "F", "S", "()Ljava/lang/String;", "episodeId", "G", "R", "biomarkerTestId", "H", "V", "testType", "", "I", "X", "()Z", "isMobilePhlebotomyEnabled", "Lad0/c;", "viewState", "Lce0/d;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SchedulingFormFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h episodeId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h biomarkerTestId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h testType;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h isMobilePhlebotomyEnabled;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h mobileViewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$legacySchedulingComposeView$1$1$1", m100430f = "SchedulingFormFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5862a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23093w;

        public C5862a(InterfaceC30057d<? super C5862a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SchedulingFormFragment.this.new C5862a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5862a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23093w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SchedulingFormFragment.this.m17554W().m14040l(new AbstractC4487b.d(SchedulingFormFragment.this.m17550S(), SchedulingFormFragment.this.m17549R(), SchedulingFormFragment.this.m17553V()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$mobileSchedulingComposeView$1$1$1", m100430f = "SchedulingFormFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5863b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23095w;

        public C5863b(InterfaceC30057d<? super C5863b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SchedulingFormFragment.this.new C5863b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5863b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23095w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SchedulingFormFragment.this.m17552U().m1820l(new AbstractC0747a.a(SchedulingFormFragment.this.m17553V()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5864c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23097w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23098x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23099y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5864c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23097w = componentCallbacks;
            this.f23098x = interfaceC35951a;
            this.f23099y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23097w;
            InterfaceC35951a interfaceC35951a = this.f23098x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23099y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5865d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23100w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23101x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5865d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23100w = componentCallbacks;
            this.f23101x = interfaceC35951a;
            this.f23102y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f23100w;
            InterfaceC35951a interfaceC35951a = this.f23101x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23102y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5866e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23103w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23104x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23105y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5866e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23103w = componentCallbacks;
            this.f23104x = interfaceC35951a;
            this.f23105y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f23103w;
            InterfaceC35951a interfaceC35951a = this.f23104x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23105y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5867f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23106w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5867f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23106w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23106w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5868g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23107w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23108x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23109y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23110z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5868g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23107w = componentCallbacks;
            this.f23108x = interfaceC35951a;
            this.f23109y = interfaceC4339a;
            this.f23110z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ce0.c] */
        @Override // c93.InterfaceC4339a
        public final C4488c invoke() {
            return AbstractC34132o.m107857B(this.f23107w, this.f23108x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4488c.class), this.f23109y, this.f23110z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5869h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23111w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5869h(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23111w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23111w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5870i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23112w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23113x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23114y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23115z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5870i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23112w = componentCallbacks;
            this.f23113x = interfaceC35951a;
            this.f23114y = interfaceC4339a;
            this.f23115z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ad0.b, androidx.lifecycle.w1] */
        @Override // c93.InterfaceC4339a
        public final C0748b invoke() {
            return AbstractC34132o.m107857B(this.f23112w, this.f23113x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0748b.class), this.f23114y, this.f23115z);
        }
    }

    public SchedulingFormFragment() {
        C5867f c5867f = new C5867f(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C5868g(this, null, c5867f, null));
        this.mobileViewModel = AbstractC30060g.m92087G(enumC23463i, new C5870i(this, null, new C5869h(this), null));
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: fe0.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SchedulingFormFragment f52574x;

            {
                this.f52574x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return SchedulingFormFragment.m17567j0(this.f52574x);
                    case 1:
                        return SchedulingFormFragment.m17547P(this.f52574x);
                    case 2:
                        return SchedulingFormFragment.m17546O(this.f52574x);
                    case 3:
                        return SchedulingFormFragment.m17568k0(this.f52574x);
                    default:
                        return Boolean.valueOf(SchedulingFormFragment.m17556Y(this.f52574x));
                }
            }
        };
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i2, new C5864c(this, null, interfaceC4339a));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i2, new C5865d(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i2, new C5866e(this, null, null));
        final int i14 = 1;
        this.episodeId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: fe0.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SchedulingFormFragment f52574x;

            {
                this.f52574x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return SchedulingFormFragment.m17567j0(this.f52574x);
                    case 1:
                        return SchedulingFormFragment.m17547P(this.f52574x);
                    case 2:
                        return SchedulingFormFragment.m17546O(this.f52574x);
                    case 3:
                        return SchedulingFormFragment.m17568k0(this.f52574x);
                    default:
                        return Boolean.valueOf(SchedulingFormFragment.m17556Y(this.f52574x));
                }
            }
        });
        final int i15 = 2;
        this.biomarkerTestId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: fe0.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SchedulingFormFragment f52574x;

            {
                this.f52574x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return SchedulingFormFragment.m17567j0(this.f52574x);
                    case 1:
                        return SchedulingFormFragment.m17547P(this.f52574x);
                    case 2:
                        return SchedulingFormFragment.m17546O(this.f52574x);
                    case 3:
                        return SchedulingFormFragment.m17568k0(this.f52574x);
                    default:
                        return Boolean.valueOf(SchedulingFormFragment.m17556Y(this.f52574x));
                }
            }
        });
        final int i16 = 3;
        this.testType = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: fe0.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SchedulingFormFragment f52574x;

            {
                this.f52574x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return SchedulingFormFragment.m17567j0(this.f52574x);
                    case 1:
                        return SchedulingFormFragment.m17547P(this.f52574x);
                    case 2:
                        return SchedulingFormFragment.m17546O(this.f52574x);
                    case 3:
                        return SchedulingFormFragment.m17568k0(this.f52574x);
                    default:
                        return Boolean.valueOf(SchedulingFormFragment.m17556Y(this.f52574x));
                }
            }
        });
        final int i17 = 4;
        this.isMobilePhlebotomyEnabled = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: fe0.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SchedulingFormFragment f52574x;

            {
                this.f52574x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return SchedulingFormFragment.m17567j0(this.f52574x);
                    case 1:
                        return SchedulingFormFragment.m17547P(this.f52574x);
                    case 2:
                        return SchedulingFormFragment.m17546O(this.f52574x);
                    case 3:
                        return SchedulingFormFragment.m17568k0(this.f52574x);
                    default:
                        return Boolean.valueOf(SchedulingFormFragment.m17556Y(this.f52574x));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final String m17546O(SchedulingFormFragment schedulingFormFragment) {
        Bundle arguments = schedulingFormFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("biomarker_test_id");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final String m17547P(SchedulingFormFragment schedulingFormFragment) {
        Bundle arguments = schedulingFormFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("episode_id");
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    private final C39355a m17548Q() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final String m17549R() {
        return (String) this.biomarkerTestId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final String m17550S() {
        return (String) this.episodeId.getValue();
    }

    /* JADX INFO: renamed from: T */
    private final FeatureFlagChecker m17551T() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final C0748b m17552U() {
        return (C0748b) this.mobileViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public final String m17553V() {
        return (String) this.testType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final C4488c m17554W() {
        return (C4488c) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: X */
    private final boolean m17555X() {
        return ((Boolean) this.isMobilePhlebotomyEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final boolean m17556Y(SchedulingFormFragment schedulingFormFragment) {
        return schedulingFormFragment.m17551T().isFeatureEnabled("test-mobile-phlebotomy-scheduling");
    }

    /* JADX INFO: renamed from: Z */
    private final ComposeView m17557Z() {
        return AbstractC22387b0.m64387c(this, new C37816b(new C14412b(this, 1), true, -1500101613));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m17558a0(final SchedulingFormFragment schedulingFormFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C3166b(AbstractC5583n.m16799z(schedulingFormFragment), schedulingFormFragment.getNavigator());
                c28655q.m87172p0(objM87133R);
            }
            C3166b c3166b = (C3166b) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(schedulingFormFragment.m17554W().getViewState(), AbstractC4489d.b.f18069b, null, c28655q, 48, 2);
            C4488c c4488cM17554W = schedulingFormFragment.m17554W();
            boolean zM87157i = c28655q.m87157i(schedulingFormFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = schedulingFormFragment.new C5862a(null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c4488cM17554W);
            AbstractC4489d abstractC4489dM17559b0 = m17559b0(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(c3166b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C13161j(c3166b, 6);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(schedulingFormFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                final int i14 = 1;
                objM87133R4 = new Function1(schedulingFormFragment) { // from class: fe0.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SchedulingFormFragment f52572x;

                    {
                        this.f52572x = schedulingFormFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return SchedulingFormFragment.m17562e0(this.f52572x, (AbstractC4487b) obj);
                            default:
                                return SchedulingFormFragment.m17561d0(this.f52572x, (InterfaceC22381a.c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function2 = (Function1) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(schedulingFormFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                final int i15 = 0;
                objM87133R5 = new Function1(schedulingFormFragment) { // from class: fe0.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SchedulingFormFragment f52572x;

                    {
                        this.f52572x = schedulingFormFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return SchedulingFormFragment.m17562e0(this.f52572x, (AbstractC4487b) obj);
                            default:
                                return SchedulingFormFragment.m17561d0(this.f52572x, (InterfaceC22381a.c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC14415e.m41077R(abstractC4489dM17559b0, function1, function2, (Function1) objM87133R5, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b0 */
    private static final AbstractC4489d m17559b0(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC4489d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m17560c0(C3166b c3166b, AbstractC3165a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c3166b.m9064a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m17561d0(SchedulingFormFragment schedulingFormFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        schedulingFormFragment.m17548Q().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m17562e0(SchedulingFormFragment schedulingFormFragment, AbstractC4487b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        schedulingFormFragment.m17554W().m14040l(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f0 */
    private final ComposeView m17563f0() {
        return AbstractC22387b0.m64387c(this, new C37816b(new C14412b(this, 0), true, -1068458022));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m17564g0(SchedulingFormFragment schedulingFormFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40263b(AbstractC5583n.m16799z(schedulingFormFragment));
                c28655q.m87172p0(objM87133R);
            }
            C40263b c40263b = (C40263b) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(schedulingFormFragment.m17552U().getViewState(), AbstractC0749c.b.f2735b, null, c28655q, 48, 2);
            C0748b c0748bM17552U = schedulingFormFragment.m17552U();
            boolean zM87157i = c28655q.m87157i(schedulingFormFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = schedulingFormFragment.new C5863b(null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c0748bM17552U);
            AbstractC0749c abstractC0749cM17565h0 = m17565h0(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(c40263b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C13161j(c40263b, 5);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC4436b.m13881i(abstractC0749cM17565h0, (Function1) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private static final AbstractC0749c m17565h0(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC0749c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m17566i0(C40263b c40263b, AbstractC40262a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c40263b.m129303a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C34911a m17567j0(SchedulingFormFragment schedulingFormFragment) {
        return AbstractC15751g.m44431K(schedulingFormFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final String m17568k0(SchedulingFormFragment schedulingFormFragment) {
        Bundle arguments = schedulingFormFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("test_type");
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return m17555X() ? m17563f0() : m17557Z();
    }
}
