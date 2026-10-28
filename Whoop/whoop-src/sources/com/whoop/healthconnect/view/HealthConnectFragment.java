package com.whoop.healthconnect.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.health.connect.client.contracts.HealthPermissionsRequestContract;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cu2.C11138r;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hj1.C17364a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Set;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mj1.AbstractC25618a;
import mj1.C25619b;
import nj1.AbstractC26751a;
import nj1.AbstractC26753c;
import nj1.C26752b;
import or2.AbstractC28163g0;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p130ey.C13733a;
import p236j.AbstractC21065d;
import p267k.AbstractC22081b;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
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
import r12.C30856a;
import r83.EnumC31071a;
import rq0.C31703x;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg2.C32469t;
import sj1.AbstractC32563a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R.\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020& '*\n\u0012\u0004\u0012\u00020&\u0018\u00010%0%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006/²\u0006\f\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/healthconnect/view/HealthConnectFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lnj1/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "G", "()Lnj1/b;", "viewModel", "Lor2/y;", "x", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lhj1/a;", "y", "F", "()Lhj1/a;", "analyticsHelper", "Lj/d;", "", "", "kotlin.jvm.PlatformType", "z", "Lj/d;", "requestPermissions", "E", "a", "Lnj1/c;", "viewState", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HealthConnectFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: F */
    public static final int f26184F = 8;

    /* JADX INFO: renamed from: G */
    private static final AbstractC22081b f26185G = new HealthPermissionsRequestContract("com.google.android.apps.healthdata");

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8788g(this, null, new C8787f(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final AbstractC21065d requestPermissions;

    /* JADX INFO: renamed from: com.whoop.healthconnect.view.HealthConnectFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.view.HealthConnectFragment$onCreateView$1$2$1", m100430f = "HealthConnectFragment.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8783b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26190w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C25619b f26192y;

        /* JADX INFO: renamed from: com.whoop.healthconnect.view.HealthConnectFragment$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C25619b f26193w;

            public a(C25619b c25619b) {
                this.f26193w = c25619b;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC25618a abstractC25618a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f26193w.m75351a(abstractC25618a);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8783b(C25619b c25619b, InterfaceC30057d<? super C8783b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26192y = c25619b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HealthConnectFragment.this.new C8783b(this.f26192y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8783b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26190w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM79635p = HealthConnectFragment.this.m21553G().getNavigationEvents();
                a aVar = new a(this.f26192y);
                this.f26190w = 1;
                if (interfaceC13058lM79635p.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.healthconnect.view.HealthConnectFragment$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/healthconnect/view/HealthConnectFragment$c", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8784c implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f26194a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f26195b;

        public C8784c(InterfaceC1585g0 interfaceC1585g0, InterfaceC1577e0 interfaceC1577e0) {
            this.f26194a = interfaceC1585g0;
            this.f26195b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f26194a.getLifecycle().mo4988d(this.f26195b);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthconnect.view.HealthConnectFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8785d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26196w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26197x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26198y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8785d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26196w = componentCallbacks;
            this.f26197x = interfaceC35951a;
            this.f26198y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f26196w;
            InterfaceC35951a interfaceC35951a = this.f26197x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26198y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthconnect.view.HealthConnectFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8786e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26199w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26200x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26201y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8786e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26199w = componentCallbacks;
            this.f26200x = interfaceC35951a;
            this.f26201y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hj1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17364a invoke() {
            ComponentCallbacks componentCallbacks = this.f26199w;
            InterfaceC35951a interfaceC35951a = this.f26200x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26201y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17364a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthconnect.view.HealthConnectFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8787f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26202w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8787f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26202w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26202w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthconnect.view.HealthConnectFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8788g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26203w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26204x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26205y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26206z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8788g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26203w = componentCallbacks;
            this.f26204x = interfaceC35951a;
            this.f26205y = interfaceC4339a;
            this.f26206z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, nj1.b] */
        @Override // c93.InterfaceC4339a
        public final C26752b invoke() {
            return AbstractC34132o.m107857B(this.f26203w, this.f26204x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26752b.class), this.f26205y, this.f26206z);
        }
    }

    public HealthConnectFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C8785d(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8786e(this, null, null));
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(f26185G, new C13733a(1));
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.requestPermissions = abstractC21065dRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: F */
    private final C17364a m21552F() {
        return (C17364a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final C26752b m21553G() {
        return (C26752b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m21554H(HealthConnectFragment healthConnectFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(healthConnectFragment.m21553G().getViewState(), AbstractC26753c.c.f106473a, null, c28655q, 48, 2);
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(healthConnectFragment);
            C28216y externalLinkNavigator = healthConnectFragment.getExternalLinkNavigator();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = healthConnectFragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            C25619b c25619b = new C25619b(abstractC12939a0M16799z, externalLinkNavigator, abstractActivityC1340r0RequireActivity, healthConnectFragment.requestPermissions, healthConnectFragment.m21552F());
            boolean zM87157i = c28655q.m87157i(healthConnectFragment) | c28655q.m87157i(interfaceC1585g0);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C32469t(2, interfaceC1585g0, healthConnectFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R, c28655q);
            C26752b c26752bM21553G = healthConnectFragment.m21553G();
            boolean zM87157i2 = c28655q.m87157i(healthConnectFragment) | c28655q.m87157i(c25619b);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = healthConnectFragment.new C8783b(c25619b, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c26752bM21553G);
            AbstractC26753c abstractC26753cM21555I = m21555I(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(healthConnectFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C31703x(healthConnectFragment, 12);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(c25619b);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C31703x(c25619b, 13);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC32563a.m101594f(abstractC26753cM21555I, function1, (Function1) objM87133R4, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final AbstractC26753c m21555I(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC26753c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC28620h0 m21556J(InterfaceC1585g0 interfaceC1585g0, HealthConnectFragment healthConnectFragment, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C11138r c11138r = new C11138r(healthConnectFragment, 3);
        interfaceC1585g0.getLifecycle().mo4986a(c11138r);
        return new C8784c(interfaceC1585g0, c11138r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m21557K(HealthConnectFragment healthConnectFragment, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_RESUME) {
            healthConnectFragment.m21553G().m79636v(AbstractC26751a.a.f106395a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m21558L(HealthConnectFragment healthConnectFragment, AbstractC26751a it) {
        AbstractC22676k.m65750j(it, "it");
        healthConnectFragment.m21553G().m79636v(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m21559M(C25619b c25619b, AbstractC25618a it) {
        AbstractC22676k.m65750j(it, "it");
        c25619b.m75351a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final void m21560N(Set set) {
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 24), true, -1323796232));
    }
}
