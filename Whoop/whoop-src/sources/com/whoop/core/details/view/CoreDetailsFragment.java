package com.whoop.core.details.view;

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
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import bw0.C3679b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.ActivityDetailType;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ew0.AbstractC13720a;
import ew0.C13721b;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import hw0.C17698c;
import hw0.InterfaceC17699d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import j93.InterfaceC21467g;
import java.util.Locale;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no0.C26944e0;
import nq0.C27050m;
import nr0.C27072e;
import o02.InterfaceC27353d;
import oe2.C27878c;
import or2.AbstractC28163g0;
import ow0.C28432b;
import p000.AbstractC11266d;
import p114eb.AbstractC12939a0;
import p114eb.C12962i;
import p161g.AbstractC14917t;
import p161g.C14923z;
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
import p715kotlin.jvm.internal.C22672i;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b+\u0010,R\u001b\u00101\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b/\u00100¨\u00064²\u0006\f\u00103\u001a\u0002028\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/core/details/view/CoreDetailsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lhw0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "G", "()Lhw0/c;", "viewModel", "Low0/b;", "x", "Leb/i;", "E", "()Low0/b;", "args", "Lbw0/b;", "y", "D", "()Lbw0/b;", "analyticsManager", "Lj02/o0;", "z", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "getBaseNavigationReducer", "()Lo02/d;", "baseNavigationReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "F", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lhw0/d;", "viewState", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CoreDetailsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h baseNavigationReducer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6469j(this, null, new C6468i(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28432b.class), new C6467h(this));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.view.CoreDetailsFragment$onCreateView$1$1$1", m100430f = "CoreDetailsFragment.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6460a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25326w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13721b f25328y;

        /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C13721b f25329w;

            public a(C13721b c13721b) {
                this.f25329w = c13721b;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC13720a abstractC13720a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f25329w.m38873a(abstractC13720a);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6460a(C13721b c13721b, InterfaceC30057d<? super C6460a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25328y = c13721b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CoreDetailsFragment.this.new C6460a(this.f25328y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C6460a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25326w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM50612n = CoreDetailsFragment.this.m19757G().getNavigationEvents();
                a aVar = new a(this.f25328y);
                this.f25326w = 1;
                if (interfaceC13058lM50612n.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6461b extends C22672i implements Function1 {
        public C6461b(Object obj) {
            super(1, 0, C3679b.class, obj, "sendAnalyticEvent", "sendAnalyticEvent(Lcom/whoop/analytics/AnalyticEventModel;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m19766a(AnalyticEventModel p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C3679b) this.receiver).m11413d(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m19766a((AnalyticEventModel) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/core/details/view/CoreDetailsFragment$c", "Lg/t;", "Ll83/a0;", "d", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6462c extends AbstractC14917t {
        public C6462c() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            CoreDetailsFragment.this.m19757G().m50613p(new InterfaceC6471b.b(false, 1, null));
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6463d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25331w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25332x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25333y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6463d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25331w = componentCallbacks;
            this.f25332x = interfaceC35951a;
            this.f25333y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bw0.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3679b invoke() {
            ComponentCallbacks componentCallbacks = this.f25331w;
            InterfaceC35951a interfaceC35951a = this.f25332x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25333y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3679b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6464e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25334w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25335x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25336y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6464e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25334w = componentCallbacks;
            this.f25335x = interfaceC35951a;
            this.f25336y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25334w;
            InterfaceC35951a interfaceC35951a = this.f25335x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25336y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6465f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25337w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25338x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25339y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6465f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25337w = componentCallbacks;
            this.f25338x = interfaceC35951a;
            this.f25339y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f25337w;
            InterfaceC35951a interfaceC35951a = this.f25338x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25339y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6466g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25340w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25341x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25342y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6466g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25340w = componentCallbacks;
            this.f25341x = interfaceC35951a;
            this.f25342y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f25340w;
            InterfaceC35951a interfaceC35951a = this.f25341x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25342y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6467h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f25343w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6467h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f25343w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f25343w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f25343w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$i */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6468i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25344w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6468i(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25344w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25344w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.view.CoreDetailsFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6469j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25345w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25346x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25347y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25348z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6469j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25345w = componentCallbacks;
            this.f25346x = interfaceC35951a;
            this.f25347y = interfaceC4339a;
            this.f25348z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, hw0.c] */
        @Override // c93.InterfaceC4339a
        public final C17698c invoke() {
            return AbstractC34132o.m107857B(this.f25345w, this.f25346x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17698c.class), this.f25347y, this.f25348z);
        }
    }

    public CoreDetailsFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsManager = AbstractC30060g.m92087G(enumC23463i, new C6463d(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C6464e(this, null, new C27072e(this, 18)));
        this.baseNavigationReducer = AbstractC30060g.m92087G(enumC23463i, new C6465f(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C6466g(this, null, null));
    }

    /* JADX INFO: renamed from: D */
    private final C3679b m19754D() {
        return (C3679b) this.analyticsManager.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C28432b m19755E() {
        return (C28432b) this.args.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final FeatureFlagChecker m19756F() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final C17698c m19757G() {
        return (C17698c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C34911a m19758H(CoreDetailsFragment coreDetailsFragment) {
        return AbstractC15751g.m44431K(coreDetailsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m19759I(CoreDetailsFragment coreDetailsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(coreDetailsFragment.m19757G().getViewState(), InterfaceC17699d.c.INSTANCE.m50647c(), null, c28655q, 0, 2);
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(coreDetailsFragment);
            InterfaceC21159o0 navigator = coreDetailsFragment.getNavigator();
            C3679b c3679bM19754D = coreDetailsFragment.m19754D();
            String strM86153a = coreDetailsFragment.m19755E().m86153a();
            AbstractC22676k.m65749i(strM86153a, "getActivityIdV2(...)");
            String strM86154b = coreDetailsFragment.m19755E().m86154b();
            AbstractC22676k.m65749i(strM86154b, "getActivityType(...)");
            String upperCase = strM86154b.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            C13721b c13721b = new C13721b(abstractC12939a0M16799z, navigator, c3679bM19754D, strM86153a, ActivityDetailType.valueOf(upperCase), coreDetailsFragment.m19756F());
            C17698c c17698cM19757G = coreDetailsFragment.m19757G();
            boolean zM87157i = c28655q.m87157i(coreDetailsFragment) | c28655q.m87157i(c13721b);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = coreDetailsFragment.new C6460a(c13721b, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c17698cM19757G);
            InterfaceC17699d interfaceC17699dM19760J = m19760J(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(coreDetailsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C26944e0(coreDetailsFragment, 18);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(coreDetailsFragment) | c28655q.m87157i(c13721b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C27050m(13, coreDetailsFragment, c13721b);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            C3679b c3679bM19754D2 = coreDetailsFragment.m19754D();
            boolean zM87157i4 = c28655q.m87157i(c3679bM19754D2);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C6461b(c3679bM19754D2);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC6470a.m19780N(interfaceC17699dM19760J, function1, function2, (Function1) ((InterfaceC21467g) objM87133R4), c28655q, 0, 0);
            C14923z onBackPressedDispatcher = coreDetailsFragment.requireActivity().getOnBackPressedDispatcher();
            InterfaceC1585g0 viewLifecycleOwner = coreDetailsFragment.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.m43015a(viewLifecycleOwner, coreDetailsFragment.new C6462c());
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final InterfaceC17699d m19760J(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC17699d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m19761K(CoreDetailsFragment coreDetailsFragment, InterfaceC6471b it) {
        AbstractC22676k.m65750j(it, "it");
        coreDetailsFragment.m19757G().m50613p(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m19762L(CoreDetailsFragment coreDetailsFragment, C13721b c13721b, AbstractC13720a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC13720a.e) {
            coreDetailsFragment.m19757G().m50613p(new InterfaceC6471b.n(((AbstractC13720a.e) event).getExerciseId()));
        } else {
            c13721b.m38873a(event);
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
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
        C17698c c17698cM19757G = m19757G();
        String strM86153a = m19755E().m86153a();
        AbstractC22676k.m65749i(strM86153a, "getActivityIdV2(...)");
        String strM86155c = m19755E().m86155c();
        AbstractC22676k.m65749i(strM86155c, "getEntryPoint(...)");
        String strM86154b = m19755E().m86154b();
        AbstractC22676k.m65749i(strM86154b, "getActivityType(...)");
        c17698cM19757G.m50613p(new InterfaceC6471b.i(strM86153a, strM86155c, strM86154b, m19755E().m86156d()));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 9), true, -1449219869));
    }
}
