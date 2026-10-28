package com.whoop.integrations.view;

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
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.integrations.domain.IntegrationsApi;
import com.whoop.integrations.view.IntegrationsFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import eu.C13620k;
import fr1.AbstractC14713b;
import fr1.C14715d;
import fr1.InterfaceC14714c;
import g12.C15227e;
import ge3.AbstractC15751g;
import gr1.C16104k;
import gr1.C16108o;
import gr1.C16110q;
import gr1.InterfaceC16107n;
import ig0.C18468h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import jp1.C21851c;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p708hb2.C17098f;
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
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0016\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0016\u001a\u0004\b<\u0010=¨\u0006A²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/integrations/view/IntegrationsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "L", "()Ljava/lang/String;", "integrationId", "x", "O", "source", "Lgr1/o;", "y", "P", "()Lgr1/o;", "viewModel", "Lor2/y;", "z", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lbc3/c0;", "E", "K", "()Lbc3/c0;", "applicationScope", "Lg12/e;", "F", "N", "()Lg12/e;", "realOAuthFlowPerformer", "Lcom/whoop/integrations/domain/IntegrationsApi;", "G", "M", "()Lcom/whoop/integrations/domain/IntegrationsApi;", "integrationsApi", "", "H", "Z", "navigatedToDeeplink", "Lj02/o0;", "I", "getNavigator", "()Lj02/o0;", "navigator", "Lgr1/q;", "viewState", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class IntegrationsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h applicationScope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h realOAuthFlowPerformer;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h integrationsApi;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean navigatedToDeeplink;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h integrationId;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.view.IntegrationsFragment$onCreateView$1$2$1", m100430f = "IntegrationsFragment.kt", m100431l = {124}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8961a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26838w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14715d f26840y;

        /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C14715d f26841w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ IntegrationsFragment f26842x;

            public a(C14715d c14715d, IntegrationsFragment integrationsFragment) {
                this.f26841w = c14715d;
                this.f26842x = integrationsFragment;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC14714c interfaceC14714c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (interfaceC14714c instanceof InterfaceC14714c.d) {
                    this.f26841w.m42202k(((InterfaceC14714c.d) interfaceC14714c).m42181a(this.f26842x.m22255O()));
                } else {
                    this.f26841w.m42202k(interfaceC14714c);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8961a(C14715d c14715d, InterfaceC30057d<? super C8961a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26840y = c14715d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return IntegrationsFragment.this.new C8961a(this.f26840y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8961a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26838w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM45624u = IntegrationsFragment.this.m22256P().getNavigationState();
                a aVar = new a(this.f26840y, IntegrationsFragment.this);
                this.f26838w = 1;
                if (interfaceC13058lM45624u.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/integrations/view/IntegrationsFragment$b", "Lg/t;", "Ll83/a0;", "d", "()V", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8962b extends AbstractC14917t {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C14715d f26843d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ IntegrationsFragment f26844e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8962b(C14715d c14715d, IntegrationsFragment integrationsFragment) {
            super(true);
            this.f26843d = c14715d;
            this.f26844e = integrationsFragment;
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            this.f26843d.m42202k(new InterfaceC14714c.a(this.f26844e.m22255O()));
        }
    }

    /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$c */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/integrations/view/IntegrationsFragment$c", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8963c implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f26845a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f26846b;

        public C8963c(InterfaceC1585g0 interfaceC1585g0, InterfaceC1577e0 interfaceC1577e0) {
            this.f26845a = interfaceC1585g0;
            this.f26846b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f26845a.getLifecycle().mo4988d(this.f26846b);
        }
    }

    /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8964d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26847w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26848x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26849y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8964d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26847w = componentCallbacks;
            this.f26848x = interfaceC35951a;
            this.f26849y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f26847w;
            InterfaceC35951a interfaceC35951a = this.f26848x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26849y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8965e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26850w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26851x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26852y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8965e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26850w = componentCallbacks;
            this.f26851x = interfaceC35951a;
            this.f26852y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bc3.c0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC2994c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26850w;
            InterfaceC35951a interfaceC35951a = this.f26851x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26852y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8966f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26853w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26854x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26855y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8966f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26853w = componentCallbacks;
            this.f26854x = interfaceC35951a;
            this.f26855y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [g12.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C15227e invoke() {
            ComponentCallbacks componentCallbacks = this.f26853w;
            InterfaceC35951a interfaceC35951a = this.f26854x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26855y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15227e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8967g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26856w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26857x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26858y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8967g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26856w = componentCallbacks;
            this.f26857x = interfaceC35951a;
            this.f26858y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.integrations.domain.IntegrationsApi, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final IntegrationsApi invoke() {
            ComponentCallbacks componentCallbacks = this.f26856w;
            InterfaceC35951a interfaceC35951a = this.f26857x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26858y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(IntegrationsApi.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8968h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26859w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26860x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26861y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8968h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26859w = componentCallbacks;
            this.f26860x = interfaceC35951a;
            this.f26861y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26859w;
            InterfaceC35951a interfaceC35951a = this.f26860x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26861y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$i */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8969i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26862w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8969i(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26862w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26862w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.integrations.view.IntegrationsFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8970j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26863w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26864x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26865y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26866z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8970j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26863w = componentCallbacks;
            this.f26864x = interfaceC35951a;
            this.f26865y = interfaceC4339a;
            this.f26866z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, gr1.o] */
        @Override // c93.InterfaceC4339a
        public final C16108o invoke() {
            return AbstractC34132o.m107857B(this.f26863w, this.f26864x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16108o.class), this.f26865y, this.f26866z);
        }
    }

    public IntegrationsFragment() {
        final int i13 = 0;
        this.integrationId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jr1.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ IntegrationsFragment f84623x;

            {
                this.f84623x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return IntegrationsFragment.m22257Q(this.f84623x);
                    case 1:
                        return IntegrationsFragment.m22266Z(this.f84623x);
                    case 2:
                        return IntegrationsFragment.m22267a0(this.f84623x);
                    default:
                        return IntegrationsFragment.m22258R(this.f84623x);
                }
            }
        });
        final int i14 = 1;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: jr1.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ IntegrationsFragment f84623x;

            {
                this.f84623x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return IntegrationsFragment.m22257Q(this.f84623x);
                    case 1:
                        return IntegrationsFragment.m22266Z(this.f84623x);
                    case 2:
                        return IntegrationsFragment.m22267a0(this.f84623x);
                    default:
                        return IntegrationsFragment.m22258R(this.f84623x);
                }
            }
        });
        final int i15 = 2;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: jr1.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ IntegrationsFragment f84623x;

            {
                this.f84623x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return IntegrationsFragment.m22257Q(this.f84623x);
                    case 1:
                        return IntegrationsFragment.m22266Z(this.f84623x);
                    case 2:
                        return IntegrationsFragment.m22267a0(this.f84623x);
                    default:
                        return IntegrationsFragment.m22258R(this.f84623x);
                }
            }
        };
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8970j(this, null, new C8969i(this), interfaceC4339a));
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C8964d(this, null, null));
        this.applicationScope = AbstractC30060g.m92087G(enumC23463i, new C8965e(this, null, null));
        this.realOAuthFlowPerformer = AbstractC30060g.m92087G(enumC23463i, new C8966f(this, null, null));
        this.integrationsApi = AbstractC30060g.m92087G(enumC23463i, new C8967g(this, null, null));
        final int i16 = 3;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8968h(this, null, new InterfaceC4339a(this) { // from class: jr1.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ IntegrationsFragment f84623x;

            {
                this.f84623x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return IntegrationsFragment.m22257Q(this.f84623x);
                    case 1:
                        return IntegrationsFragment.m22266Z(this.f84623x);
                    case 2:
                        return IntegrationsFragment.m22267a0(this.f84623x);
                    default:
                        return IntegrationsFragment.m22258R(this.f84623x);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    private final InterfaceC2994c0 m22251K() {
        return (InterfaceC2994c0) this.applicationScope.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final String m22252L() {
        return (String) this.integrationId.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final IntegrationsApi m22253M() {
        return (IntegrationsApi) this.integrationsApi.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final C15227e m22254N() {
        return (C15227e) this.realOAuthFlowPerformer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final String m22255O() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final C16108o m22256P() {
        return (C16108o) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final String m22257Q(IntegrationsFragment integrationsFragment) {
        return integrationsFragment.requireArguments().getString("integrationId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C34911a m22258R(IntegrationsFragment integrationsFragment) {
        return AbstractC15751g.m44431K(integrationsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m22259S(final IntegrationsFragment integrationsFragment, Composer composer, int i13) {
        int i14 = 1;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object obj = (InterfaceC1585g0) c28655q.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(integrationsFragment.m22256P().getViewState(), new C16110q(new C16104k(null, i14, 0 == true ? 1 : 0), false, null, null, null, null, null, false, 254, null), null, c28655q, 0, 2);
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("IntegrationsNavHost", null, c28655q, 6, 2);
            Object objM87133R = c28655q.m87133R();
            Object obj2 = C28635l.f115821a;
            if (objM87133R == obj2) {
                AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(integrationsFragment);
                AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = integrationsFragment.requireActivity();
                AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                final int i15 = 0;
                Object c14715d = new C14715d(c12991u0M58963a, abstractC12939a0M16799z, integrationsFragment.getExternalLinkNavigator(), abstractActivityC1340r0RequireActivity, new Function1(integrationsFragment) { // from class: jr1.i

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ IntegrationsFragment f84625x;

                    {
                        this.f84625x = integrationsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i15) {
                            case 0:
                                return IntegrationsFragment.m22261U(this.f84625x, (InterfaceC16107n) obj3);
                            default:
                                return IntegrationsFragment.m22264X(this.f84625x, (InterfaceC16107n) obj3);
                        }
                    }
                }, integrationsFragment.m22251K(), integrationsFragment.m22254N(), integrationsFragment.getNavigator(), integrationsFragment.m22253M(), null, null, 1536, null);
                c28655q.m87172p0(c14715d);
                objM87133R = c14715d;
            }
            C14715d c14715d2 = (C14715d) objM87133R;
            boolean zM87157i = c28655q.m87157i(integrationsFragment) | c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(obj);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == obj2) {
                objM87133R2 = new C18468h(obj, integrationsFragment, interfaceC28601c1M87260n, 27);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87251e(obj, (Function1) objM87133R2, c28655q);
            C16108o c16108oM22256P = integrationsFragment.m22256P();
            boolean zM87157i2 = c28655q.m87157i(integrationsFragment) | c28655q.m87157i(c14715d2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == obj2) {
                objM87133R3 = integrationsFragment.new C8961a(c14715d2, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c16108oM22256P);
            C16110q c16110qM22260T = m22260T(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(integrationsFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == obj2) {
                final int i16 = 1;
                objM87133R4 = new Function1(integrationsFragment) { // from class: jr1.i

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ IntegrationsFragment f84625x;

                    {
                        this.f84625x = integrationsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i16) {
                            case 0:
                                return IntegrationsFragment.m22261U(this.f84625x, (InterfaceC16107n) obj3);
                            default:
                                return IntegrationsFragment.m22264X(this.f84625x, (InterfaceC16107n) obj3);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function1 = (Function1) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(c14715d2) | c28655q.m87157i(integrationsFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == obj2) {
                objM87133R5 = new C21851c(6, c14715d2, integrationsFragment);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC14713b.m42169h(c12991u0M58963a, c16110qM22260T, function1, (Function1) objM87133R5, c28655q, 0);
            C14923z onBackPressedDispatcher = integrationsFragment.requireActivity().getOnBackPressedDispatcher();
            InterfaceC1585g0 viewLifecycleOwner = integrationsFragment.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.m43015a(viewLifecycleOwner, new C8962b(c14715d2, integrationsFragment));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final C16110q m22260T(InterfaceC28670t2 interfaceC28670t2) {
        return (C16110q) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m22261U(IntegrationsFragment integrationsFragment, InterfaceC16107n it) {
        AbstractC22676k.m65750j(it, "it");
        integrationsFragment.m22256P().m45622A(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final InterfaceC28620h0 m22262V(InterfaceC1585g0 interfaceC1585g0, IntegrationsFragment integrationsFragment, InterfaceC28670t2 interfaceC28670t2, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C13620k c13620k = new C13620k(2, integrationsFragment, interfaceC28670t2);
        interfaceC1585g0.getLifecycle().mo4986a(c13620k);
        return new C8963c(interfaceC1585g0, c13620k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final void m22263W(IntegrationsFragment integrationsFragment, InterfaceC28670t2 interfaceC28670t2, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_CREATE) {
            String strM45623t = integrationsFragment.m22256P().getCurrentIntegrationId();
            if (strM45623t == null || strM45623t.length() == 0) {
                String strM22252L = integrationsFragment.m22252L();
                if (strM22252L == null || strM22252L.length() == 0 || integrationsFragment.navigatedToDeeplink) {
                    integrationsFragment.m22256P().m45622A(InterfaceC16107n.h.f61108a);
                } else {
                    integrationsFragment.navigatedToDeeplink = true;
                    C16108o c16108oM22256P = integrationsFragment.m22256P();
                    String strM22252L2 = integrationsFragment.m22252L();
                    AbstractC22676k.m65747g(strM22252L2);
                    c16108oM22256P.m45622A(new InterfaceC16107n.f(strM22252L2));
                }
            } else {
                integrationsFragment.m22256P().m45622A(new InterfaceC16107n.f(strM45623t));
            }
        }
        if (event == EnumC1632v.ON_RESUME) {
            String strM45623t2 = integrationsFragment.m22256P().getCurrentIntegrationId();
            if (!m22260T(interfaceC28670t2).getIsOAuthInFlight() || strM45623t2 == null || strM45623t2.length() == 0) {
                return;
            }
            integrationsFragment.m22256P().m45622A(new InterfaceC16107n.n(strM45623t2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m22264X(IntegrationsFragment integrationsFragment, InterfaceC16107n it) {
        AbstractC22676k.m65750j(it, "it");
        integrationsFragment.m22256P().m45622A(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m22265Y(C14715d c14715d, IntegrationsFragment integrationsFragment, InterfaceC14714c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC14714c.a) {
            c14715d.m42202k(((InterfaceC14714c.a) event).m42177a(integrationsFragment.m22255O()));
        } else {
            c14715d.m42202k(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final String m22266Z(IntegrationsFragment integrationsFragment) {
        return integrationsFragment.requireArguments().getString("source");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C34911a m22267a0(IntegrationsFragment integrationsFragment) {
        return AbstractC15751g.m44431K(integrationsFragment.m22255O());
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
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
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 22), true, -720084443));
    }
}
