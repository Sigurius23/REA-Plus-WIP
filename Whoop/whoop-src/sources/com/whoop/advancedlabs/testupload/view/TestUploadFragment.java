package com.whoop.advancedlabs.testupload.view;

import a80.C0539c;
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
import be1.C3169c;
import bf0.AbstractC3199k;
import bf0.C3192d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.advancedlabs.testupload.view.TestUploadFragment;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import java.util.List;
import jf3.C21647a;
import kd0.InterfaceC22381a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.C28205u0;
import os1.C28314b;
import p236j.C21062a;
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
import p736sz0.C33205o0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import ya0.C39355a;
import ye0.C39477a;
import ze0.AbstractC40584c;
import ze0.C40583b;
import ze0.InterfaceC40582a;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060²\u0006\f\u0010/\u001a\u00020.8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/testupload/view/TestUploadFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lze0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "L", "()Lze0/b;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lor2/u0;", "y", "K", "()Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "z", "J", "()Lzr2/a;", "dateAndTimeProvider", "Lya0/a;", "E", "I", "()Lya0/a;", "analyticsHelper", "Los1/b;", "F", "Los1/b;", "filePicker", "Lze0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TestUploadFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C28314b filePicker;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5901g(this, null, new C5900f(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h localizedDateTimeFormatter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testupload.view.TestUploadFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testupload.view.TestUploadFragment$onCreateView$1$1$1", m100430f = "TestUploadFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5895a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23186w;

        public C5895a(InterfaceC30057d<? super C5895a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TestUploadFragment.this.new C5895a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5895a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23186w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            TestUploadFragment.this.m17646L().m131590o(InterfaceC40582a.g.f174790a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testupload.view.TestUploadFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5896b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23188w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23189x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23190y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5896b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23188w = componentCallbacks;
            this.f23189x = interfaceC35951a;
            this.f23190y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23188w;
            InterfaceC35951a interfaceC35951a = this.f23189x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23190y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testupload.view.TestUploadFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5897c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23191w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23192x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23193y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5897c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23191w = componentCallbacks;
            this.f23192x = interfaceC35951a;
            this.f23193y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.u0] */
        @Override // c93.InterfaceC4339a
        public final C28205u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23191w;
            InterfaceC35951a interfaceC35951a = this.f23192x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23193y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testupload.view.TestUploadFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5898d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23194w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23195x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23196y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5898d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23194w = componentCallbacks;
            this.f23195x = interfaceC35951a;
            this.f23196y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f23194w;
            InterfaceC35951a interfaceC35951a = this.f23195x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23196y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testupload.view.TestUploadFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5899e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23197w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23198x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23199y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5899e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23197w = componentCallbacks;
            this.f23198x = interfaceC35951a;
            this.f23199y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f23197w;
            InterfaceC35951a interfaceC35951a = this.f23198x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23199y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testupload.view.TestUploadFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5900f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23200w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5900f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23200w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23200w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testupload.view.TestUploadFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5901g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23201w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23202x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23203y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23204z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5901g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23201w = componentCallbacks;
            this.f23202x = interfaceC35951a;
            this.f23203y = interfaceC4339a;
            this.f23204z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ze0.b] */
        @Override // c93.InterfaceC4339a
        public final C40583b invoke() {
            return AbstractC34132o.m107857B(this.f23201w, this.f23202x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40583b.class), this.f23203y, this.f23204z);
        }
    }

    public TestUploadFragment() {
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: bf0.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TestUploadFragment f12507x;

            {
                this.f12507x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return TestUploadFragment.m17648N(this.f12507x);
                    default:
                        return TestUploadFragment.m17647M(this.f12507x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5896b(this, null, interfaceC4339a));
        final int i14 = 1;
        this.localizedDateTimeFormatter = AbstractC30060g.m92087G(enumC23463i, new C5897c(this, null, new InterfaceC4339a(this) { // from class: bf0.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ TestUploadFragment f12507x;

            {
                this.f12507x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return TestUploadFragment.m17648N(this.f12507x);
                    default:
                        return TestUploadFragment.m17647M(this.f12507x);
                }
            }
        }));
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i, new C5898d(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5899e(this, null, null));
        this.filePicker = new C28314b(this, new C3192d(this, 0), new C3192d(this, 1), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m17641G(TestUploadFragment testUploadFragment, C21062a result) {
        AbstractC22676k.m65750j(result, "result");
        testUploadFragment.m17646L().m131590o(new InterfaceC40582a.d(result));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m17642H(TestUploadFragment testUploadFragment, List uris) {
        AbstractC22676k.m65750j(uris, "uris");
        testUploadFragment.m17646L().m131590o(new InterfaceC40582a.f(uris));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private final C39355a m17643I() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final InterfaceC41070a m17644J() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final C28205u0 m17645K() {
        return (C28205u0) this.localizedDateTimeFormatter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final C40583b m17646L() {
        return (C40583b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m17647M(TestUploadFragment testUploadFragment) {
        return AbstractC15751g.m44431K(testUploadFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C34911a m17648N(TestUploadFragment testUploadFragment) {
        return AbstractC15751g.m44431K(testUploadFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m17649O(TestUploadFragment testUploadFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C39477a(AbstractC5583n.m16799z(testUploadFragment), testUploadFragment.getNavigator());
                c28655q.m87172p0(objM87133R);
            }
            C39477a c39477a = (C39477a) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(testUploadFragment.m17646L().getViewState(), new AbstractC40584c.c(C33205o0.f138451a.m105288b(), null, null, 6, null), null, c28655q, 0, 2);
            C40583b c40583bM17646L = testUploadFragment.m17646L();
            boolean zM87157i = c28655q.m87157i(testUploadFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = testUploadFragment.new C5895a(null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c40583bM17646L);
            AbstractC40584c abstractC40584cM17650P = m17650P(interfaceC28601c1M87260n);
            InterfaceC41070a interfaceC41070aM17644J = testUploadFragment.m17644J();
            boolean zM85383l = testUploadFragment.m17645K().m85383l();
            boolean zM87157i2 = c28655q.m87157i(testUploadFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C3192d(testUploadFragment, 2);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(c39477a) | c28655q.m87157i(testUploadFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C3169c(1, c39477a, testUploadFragment);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC3199k.m9228t(abstractC40584cM17650P, interfaceC41070aM17644J, zM85383l, function1, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private static final AbstractC40584c m17650P(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC40584c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m17651Q(TestUploadFragment testUploadFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        testUploadFragment.m17643I().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m17652R(C39477a c39477a, TestUploadFragment testUploadFragment, InterfaceC40582a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC40582a.h) {
            c39477a.m126129a((InterfaceC40582a.h) event);
        } else if (event instanceof InterfaceC40582a.m) {
            testUploadFragment.m17646L().m131590o((InterfaceC40582a.m) event);
        } else if (event instanceof InterfaceC40582a.j) {
            testUploadFragment.filePicker.m85776e();
        } else {
            if (!(event instanceof InterfaceC40582a.k)) {
                throw new NoWhenBranchMatchedException();
            }
            testUploadFragment.filePicker.m85777f();
        }
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 15), true, 30318169));
    }
}
