package com.whoop.strava.view;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ei2.C13223c;
import ei2.InterfaceC13222b;
import ii2.AbstractC18572a;
import ii2.AbstractC18573b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import jf3.C21647a;
import ji2.C21731j;
import ji2.C21733l;
import ji2.InterfaceC21730i;
import kd1.AbstractC22387b0;
import kk1.C22541b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lc0.C23821c;
import li2.C24101a;
import or2.AbstractC28163g0;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p114eb.C12999y0;
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
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010!\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010 R\u001d\u0010$\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010 R\u001d\u0010'\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010 R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u00100¨\u00064²\u0006\f\u00103\u001a\u0002028\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/strava/view/StravaFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "oAuthUri", "Ll83/a0;", "Q", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lji2/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "K", "()Lji2/j;", "viewModel", "x", "H", "()Ljava/lang/String;", "code", "y", "J", "state", "z", "I", "scope", "Lor2/y;", "E", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lei2/c;", "F", "G", "()Lei2/c;", "analyticsHelper", "Lji2/l;", "viewState", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StravaFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10294e(this, null, new C10293d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h code = AbstractC30060g.m92088H(new C24101a(this, 0));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h state = AbstractC30060g.m92088H(new C24101a(this, 1));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h scope = AbstractC30060g.m92088H(new C24101a(this, 2));

    /* JADX INFO: renamed from: com.whoop.strava.view.StravaFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.strava.view.StravaFragment$onCreateView$1$1$1", m100430f = "StravaFragment.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10290a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31236w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12991u0 f31238y;

        /* JADX INFO: renamed from: com.whoop.strava.view.StravaFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12991u0 f31239w;

            public a(C12991u0 c12991u0) {
                this.f31239w = c12991u0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: f */
            public static final C23454a0 m26343f(C12999y0 navigate) {
                AbstractC22676k.m65750j(navigate, "$this$navigate");
                navigate.f44915b = true;
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: g */
            public static final C23454a0 m26344g(C12999y0 navigate) {
                AbstractC22676k.m65750j(navigate, "$this$navigate");
                navigate.f44915b = true;
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC18573b abstractC18573b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (AbstractC22676k.m65745e(abstractC18573b, AbstractC18573b.c.f72561a)) {
                    AbstractC12939a0.m36374y(this.f31239w, "SETTINGS", null, 6);
                } else if (AbstractC22676k.m65745e(abstractC18573b, AbstractC18573b.d.f72562a)) {
                    final int i13 = 0;
                    this.f31239w.m36408w("SETTINGS", new Function1() { // from class: com.whoop.strava.view.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            C12999y0 c12999y0 = (C12999y0) obj;
                            switch (i13) {
                                case 0:
                                    return StravaFragment.C10290a.a.m26343f(c12999y0);
                                default:
                                    return StravaFragment.C10290a.a.m26344g(c12999y0);
                            }
                        }
                    });
                } else if (AbstractC22676k.m65745e(abstractC18573b, AbstractC18573b.b.f72560a)) {
                    final int i14 = 1;
                    this.f31239w.m36408w("SELECTED_ACTIVITIES", new Function1() { // from class: com.whoop.strava.view.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            C12999y0 c12999y0 = (C12999y0) obj;
                            switch (i14) {
                                case 0:
                                    return StravaFragment.C10290a.a.m26343f(c12999y0);
                                default:
                                    return StravaFragment.C10290a.a.m26344g(c12999y0);
                            }
                        }
                    });
                } else {
                    if (!AbstractC22676k.m65745e(abstractC18573b, AbstractC18573b.a.f72559a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f31239w.m36410z();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10290a(C12991u0 c12991u0, InterfaceC30057d<? super C10290a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f31238y = c12991u0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StravaFragment.this.new C10290a(this.f31238y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10290a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31236w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM61290l = StravaFragment.this.m26331K().getNavigationEvent();
                a aVar = new a(this.f31238y);
                this.f31236w = 1;
                if (interfaceC13058lM61290l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.strava.view.StravaFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10291b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31240w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31241x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31242y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10291b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31240w = componentCallbacks;
            this.f31241x = interfaceC35951a;
            this.f31242y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f31240w;
            InterfaceC35951a interfaceC35951a = this.f31241x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31242y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.strava.view.StravaFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10292c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31243w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31244x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31245y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10292c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31243w = componentCallbacks;
            this.f31244x = interfaceC35951a;
            this.f31245y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ei2.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C13223c invoke() {
            ComponentCallbacks componentCallbacks = this.f31243w;
            InterfaceC35951a interfaceC35951a = this.f31244x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31245y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13223c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.strava.view.StravaFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10293d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31246w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10293d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31246w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31246w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.strava.view.StravaFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10294e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31247w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31248x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31249y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31250z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10294e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31247w = componentCallbacks;
            this.f31248x = interfaceC35951a;
            this.f31249y = interfaceC4339a;
            this.f31250z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ji2.j] */
        @Override // c93.InterfaceC4339a
        public final C21731j invoke() {
            return AbstractC34132o.m107857B(this.f31247w, this.f31248x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21731j.class), this.f31249y, this.f31250z);
        }
    }

    public StravaFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C10291b(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10292c(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final String m26326F(StravaFragment stravaFragment) {
        return stravaFragment.requireArguments().getString("code");
    }

    /* JADX INFO: renamed from: G */
    private final C13223c m26327G() {
        return (C13223c) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final String m26328H() {
        return (String) this.code.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final String m26329I() {
        return (String) this.scope.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final String m26330J() {
        return (String) this.state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final C21731j m26331K() {
        return (C21731j) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m26332L(StravaFragment stravaFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("StravaNavHost", null, c28655q, 6, 2);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(stravaFragment.m26331K().getViewState(), new C21733l(true, false, null, null, null, null, null, 126, null), null, c28655q, 0, 2);
            boolean zM87157i = c28655q.m87157i(stravaFragment) | c28655q.m87157i(c12991u0M58963a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = stravaFragment.new C10290a(c12991u0M58963a, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, "stravaNavigation");
            C21733l c21733lM26333M = m26333M(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(stravaFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C23821c(stravaFragment, 3);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(stravaFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C24101a(stravaFragment, 3);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC18572a.m53791e(c12991u0M58963a, c21733lM26333M, function1, (InterfaceC4339a) objM87133R3, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final C21733l m26333M(InterfaceC28670t2 interfaceC28670t2) {
        return (C21733l) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m26334N(StravaFragment stravaFragment, InterfaceC21730i viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof InterfaceC21730i.a) {
            stravaFragment.m26327G().m37122b(InterfaceC13222b.a.f45803a);
            stravaFragment.m26337Q(((InterfaceC21730i.a) viewEvent).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String());
        } else if (viewEvent instanceof InterfaceC21730i.e) {
            C28216y externalLinkNavigator = stravaFragment.getExternalLinkNavigator();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = stravaFragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            C28216y.m85414y(externalLinkNavigator, abstractActivityC1340r0RequireActivity, ((InterfaceC21730i.e) viewEvent).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), false, 4, null);
        } else if (viewEvent instanceof InterfaceC21730i.j) {
            C28216y externalLinkNavigator2 = stravaFragment.getExternalLinkNavigator();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = stravaFragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity2, "requireActivity(...)");
            C28216y.m85414y(externalLinkNavigator2, abstractActivityC1340r0RequireActivity2, ((InterfaceC21730i.j) viewEvent).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String(), false, 4, null);
        } else if (viewEvent instanceof InterfaceC21730i.k) {
            stravaFragment.m26327G().m37122b(new InterfaceC13222b.d(((InterfaceC21730i.k) viewEvent).getUpdateSettingsData().m61305e()));
            stravaFragment.m26331K().m61291q(viewEvent);
        } else if (viewEvent instanceof InterfaceC21730i.m) {
            if (((InterfaceC21730i.m) viewEvent).getUpdateSettingsData().getShareToStrava()) {
                stravaFragment.m26327G().m37122b(InterfaceC13222b.i.f45811a);
            } else {
                stravaFragment.m26327G().m37122b(InterfaceC13222b.g.f45809a);
            }
            stravaFragment.m26331K().m61291q(viewEvent);
        } else if (viewEvent instanceof InterfaceC21730i.d) {
            if (((InterfaceC21730i.d) viewEvent).getUpdateSettingsData().getImportActivities()) {
                stravaFragment.m26327G().m37122b(InterfaceC13222b.h.f45810a);
            } else {
                stravaFragment.m26327G().m37122b(InterfaceC13222b.f.f45808a);
            }
            stravaFragment.m26331K().m61291q(viewEvent);
        } else {
            if (!(viewEvent instanceof InterfaceC21730i.f) && !(viewEvent instanceof InterfaceC21730i.o) && !(viewEvent instanceof InterfaceC21730i.c) && !(viewEvent instanceof InterfaceC21730i.l) && !(viewEvent instanceof InterfaceC21730i.g) && !(viewEvent instanceof InterfaceC21730i.h) && !(viewEvent instanceof InterfaceC21730i.i) && !(viewEvent instanceof InterfaceC21730i.b)) {
                throw new NoWhenBranchMatchedException();
            }
            stravaFragment.m26331K().m61291q(viewEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m26335O(StravaFragment stravaFragment) {
        AbstractC5583n.m16799z(stravaFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final String m26336P(StravaFragment stravaFragment) {
        return stravaFragment.requireArguments().getString("scope");
    }

    /* JADX INFO: renamed from: Q */
    private final void m26337Q(String oAuthUri) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(oAuthUri)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final String m26338R(StravaFragment stravaFragment) {
        return stravaFragment.requireArguments().getString("state");
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        m26331K().m61291q(new InterfaceC21730i.f(m26328H(), m26330J(), m26329I(), false, 8, null));
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C22541b(this, 20), true, 1594268873));
    }
}
