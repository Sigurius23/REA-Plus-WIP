package com.whoop.changepassword.view.reset;

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
import bo0.AbstractC3503a;
import bo0.C3504b;
import bo0.C3505c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.changepassword.view.reset.PasswordResetFragment;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ej1.C13242h;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import o02.InterfaceC27353d;
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
import p706eo0.AbstractC13376g;
import p706eo0.AbstractC13378i;
import p706eo0.C13373d;
import p706eo0.C13377h;
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
import tn0.C33958b;
import tn0.InterfaceC33957a;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yn0.C39671c;
import yn0.InterfaceC39670b;
import z92.InterfaceC40205a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b-\u0010.¨\u00062²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/changepassword/view/reset/PasswordResetFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "L", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "onCreate", "(Landroid/os/Bundle;)V", "Leo0/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "I", "()Leo0/h;", "screenArgs", "Lbo0/b;", "x", "K", "()Lbo0/b;", "viewModel", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lz92/a;", "z", "J", "()Lz92/a;", "userInfoAccessor", "Lo02/d;", "E", "H", "()Lo02/d;", "navigationReducer", "Ltn0/b;", "F", "G", "()Ltn0/b;", "changePasswordAnalytics", "Lbo0/c;", "viewState", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PasswordResetFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h navigationReducer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h changePasswordAnalytics;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h screenArgs;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h userInfoAccessor;

    /* JADX INFO: renamed from: com.whoop.changepassword.view.reset.PasswordResetFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.view.reset.PasswordResetFragment$onCreateView$1$1$1", m100430f = "PasswordResetFragment.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6129a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f24356w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39671c f24358y;

        /* JADX INFO: renamed from: com.whoop.changepassword.view.reset.PasswordResetFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C39671c f24359w;

            public a(C39671c c39671c) {
                this.f24359w = c39671c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC39670b interfaceC39670b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objM126815a = this.f24359w.m126815a(interfaceC39670b, interfaceC30057d);
                return objM126815a == EnumC31071a.f128113w ? objM126815a : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6129a(C39671c c39671c, InterfaceC30057d<? super C6129a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f24358y = c39671c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return PasswordResetFragment.this.new C6129a(this.f24358y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6129a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24356w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM10339n = PasswordResetFragment.this.m18448K().getNavigationEvents();
                a aVar = new a(this.f24358y);
                this.f24356w = 1;
                if (interfaceC13058lM10339n.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.changepassword.view.reset.PasswordResetFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6130b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24360w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24361x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24362y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6130b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24360w = componentCallbacks;
            this.f24361x = interfaceC35951a;
            this.f24362y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24360w;
            InterfaceC35951a interfaceC35951a = this.f24361x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24362y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.changepassword.view.reset.PasswordResetFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6131c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24363w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24364x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24365y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6131c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24363w = componentCallbacks;
            this.f24364x = interfaceC35951a;
            this.f24365y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, z92.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC40205a invoke() {
            ComponentCallbacks componentCallbacks = this.f24363w;
            InterfaceC35951a interfaceC35951a = this.f24364x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24365y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40205a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.changepassword.view.reset.PasswordResetFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6132d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24366w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24367x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24368y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6132d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24366w = componentCallbacks;
            this.f24367x = interfaceC35951a;
            this.f24368y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f24366w;
            InterfaceC35951a interfaceC35951a = this.f24367x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24368y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.changepassword.view.reset.PasswordResetFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6133e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24369w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24370x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24371y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6133e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24369w = componentCallbacks;
            this.f24370x = interfaceC35951a;
            this.f24371y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tn0.b] */
        @Override // c93.InterfaceC4339a
        public final C33958b invoke() {
            ComponentCallbacks componentCallbacks = this.f24369w;
            InterfaceC35951a interfaceC35951a = this.f24370x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24371y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33958b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.changepassword.view.reset.PasswordResetFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6134f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24372w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6134f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f24372w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f24372w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.changepassword.view.reset.PasswordResetFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6135g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24373w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24374x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24375y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f24376z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6135g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f24373w = componentCallbacks;
            this.f24374x = interfaceC35951a;
            this.f24375y = interfaceC4339a;
            this.f24376z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, bo0.b] */
        @Override // c93.InterfaceC4339a
        public final C3504b invoke() {
            return AbstractC34132o.m107857B(this.f24373w, this.f24374x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3504b.class), this.f24375y, this.f24376z);
        }
    }

    public PasswordResetFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.screenArgs = AbstractC30060g.m92087G(enumC23463i, new C13373d(this, 0));
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C6135g(this, null, new C6134f(this), new C13373d(this, 1)));
        C13373d c13373d = new C13373d(this, 2);
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i2, new C6130b(this, null, c13373d));
        this.userInfoAccessor = AbstractC30060g.m92087G(enumC23463i2, new C6131c(this, null, null));
        this.navigationReducer = AbstractC30060g.m92087G(enumC23463i2, new C6132d(this, null, null));
        this.changePasswordAnalytics = AbstractC30060g.m92087G(enumC23463i2, new C6133e(this, null, null));
    }

    /* JADX INFO: renamed from: G */
    private final C33958b m18432G() {
        return (C33958b) this.changePasswordAnalytics.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final InterfaceC27353d m18433H() {
        return (InterfaceC27353d) this.navigationReducer.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C13377h m18434I() {
        return (C13377h) this.screenArgs.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final InterfaceC40205a m18435J() {
        return (InterfaceC40205a) this.userInfoAccessor.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final void m18436L() {
        getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m18437M(PasswordResetFragment passwordResetFragment) {
        return AbstractC15751g.m44431K(passwordResetFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m18438N(final PasswordResetFragment passwordResetFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(passwordResetFragment.m18448K().getViewState(), new C3505c(null, null, false, false, false, null, null, false, false, false, false, 2047, null), null, c28655q, 0, 2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C39671c c39671c = new C39671c(AbstractC5583n.m16799z(passwordResetFragment), passwordResetFragment.m18435J(), passwordResetFragment.getNavigator(), passwordResetFragment.m18433H(), null, 16, null);
                c28655q.m87172p0(c39671c);
                objM87133R = c39671c;
            }
            C39671c c39671c2 = (C39671c) objM87133R;
            C3504b c3504bM18448K = passwordResetFragment.m18448K();
            boolean zM87157i = c28655q.m87157i(passwordResetFragment) | c28655q.m87157i(c39671c2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = passwordResetFragment.new C6129a(c39671c2, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c3504bM18448K);
            boolean zM87157i2 = c28655q.m87157i(passwordResetFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C13373d(passwordResetFragment, 3);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
            C3505c c3505cM18439O = m18439O(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(passwordResetFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                final int i14 = 0;
                objM87133R4 = new Function1(passwordResetFragment) { // from class: eo0.e

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PasswordResetFragment f46789x;

                    {
                        this.f46789x = passwordResetFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return PasswordResetFragment.m18441Q(this.f46789x, (AbstractC3503a) obj);
                            default:
                                return PasswordResetFragment.m18443S(this.f46789x, (InterfaceC33957a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function1 = (Function1) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(passwordResetFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                objM87133R5 = new C13373d(passwordResetFragment, 4);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R5;
            boolean zM87157i5 = c28655q.m87157i(passwordResetFragment);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i5 || objM87133R6 == c28676v0) {
                final int i15 = 1;
                objM87133R6 = new Function1(passwordResetFragment) { // from class: eo0.e

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PasswordResetFragment f46789x;

                    {
                        this.f46789x = passwordResetFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return PasswordResetFragment.m18441Q(this.f46789x, (AbstractC3503a) obj);
                            default:
                                return PasswordResetFragment.m18443S(this.f46789x, (InterfaceC33957a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC13376g.m37691M(c3505cM18439O, function1, interfaceC4339a, (Function1) objM87133R6, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final C3505c m18439O(InterfaceC28670t2 interfaceC28670t2) {
        return (C3505c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m18440P(PasswordResetFragment passwordResetFragment) {
        passwordResetFragment.m18448K().m10340p(AbstractC3503a.a.f13904a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m18441Q(PasswordResetFragment passwordResetFragment, AbstractC3503a event) {
        AbstractC22676k.m65750j(event, "event");
        passwordResetFragment.m18448K().m10340p(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m18442R(PasswordResetFragment passwordResetFragment) {
        passwordResetFragment.m18448K().m10340p(AbstractC3503a.a.f13904a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m18443S(PasswordResetFragment passwordResetFragment, InterfaceC33957a it) {
        AbstractC22676k.m65750j(it, "it");
        passwordResetFragment.m18432G().m107407a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C13377h m18444T(PasswordResetFragment passwordResetFragment) {
        return AbstractC13378i.m37733a(passwordResetFragment.getArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C34911a m18445U(PasswordResetFragment passwordResetFragment) {
        return AbstractC15751g.m44431K(passwordResetFragment.m18434I());
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: K */
    public final C3504b m18448K() {
        return (C3504b) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m18436L();
        AbstractC28163g0.m85256l(this);
        m18448K().m10340p(AbstractC3503a.e.f13908a);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C13242h(this, 2), true, 2047901196));
    }
}
