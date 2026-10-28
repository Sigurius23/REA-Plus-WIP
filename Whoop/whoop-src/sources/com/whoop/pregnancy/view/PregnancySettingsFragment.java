package com.whoop.pregnancy.view;

import a42.C0378a;
import a80.C0539c;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import be1.C3169c;
import c41.C4025f5;
import c42.C4166c;
import c42.C4167d;
import c42.C4168e;
import c42.C4169f;
import c42.C4170g;
import c42.C4171h;
import c42.C4172i;
import c42.C4173j;
import c42.C4174k;
import c42.C4175l;
import c42.C4176m;
import c42.C4177n;
import c42.C4180q;
import c42.C4181r;
import c42.C4182s;
import c42.EnumC4179p;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.pregnancy.view.PregnancySettingsFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d42.AbstractC11686b;
import d42.AbstractC11687c;
import d42.AbstractC11688d;
import d42.AbstractC11694j;
import d42.AbstractC11696l;
import d42.AbstractC11700p;
import e42.C12708a;
import e93.AbstractC12889b;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import java.io.IOException;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.C28216y;
import org.xmlpull.v1.XmlPullParserException;
import p000.C22931l;
import p000.C29656q;
import p000.C3718c;
import p003a1.C0103b;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
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
import v32.C35613a;
import vf3.InterfaceC35951a;
import y32.AbstractC39197a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010'\u001a\n #*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001e\u001a\u0004\b9\u0010:¨\u0006<²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/pregnancy/view/PregnancySettingsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Leb/u0;", "navController", "Lc42/r;", "viewState", "La42/a;", "navigationRouter", "h0", "(Leb/u0;Lc42/r;La42/a;Landroidx/compose/runtime/Composer;I)V", "Lc42/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "Q0", "()Lc42/p;", "startScreen", "", "kotlin.jvm.PlatformType", "x", "P0", "()Ljava/lang/String;", "source", "Le42/a;", "y", "R0", "()Le42/a;", "viewModel", "Lor2/y;", "z", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lv32/a;", "E", "O0", "()Lv32/a;", "pregnancyAnalytics", "Lj02/o0;", "F", "getNavigator", "()Lj02/o0;", "navigator", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PregnancySettingsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h pregnancyAnalytics;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h startScreen = AbstractC30060g.m92088H(new C4176m(this, 1));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h source = AbstractC30060g.m92088H(new C4176m(this, 3));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9683g(this, null, new C9682f(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.PregnancySettingsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.pregnancy.view.PregnancySettingsFragment$onCreateView$1$1$1", m100430f = "PregnancySettingsFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9677a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28290w;

        public C9677a(InterfaceC30057d<? super C9677a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return PregnancySettingsFragment.this.new C9677a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9677a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C1601k1 c1601k1M36480b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f28290w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12982q c12982qM36393h = AbstractC5583n.m16799z(PregnancySettingsFragment.this).m36393h();
            if ((c12982qM36393h == null || (c1601k1M36480b = c12982qM36393h.m36480b()) == null) ? false : AbstractC22676k.m65745e(c1601k1M36480b.m5001b("refreshSettings"), Boolean.TRUE)) {
                PregnancySettingsFragment.this.m23281R0().m35557p(AbstractC39197a.a.f168464a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.PregnancySettingsFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.pregnancy.view.PregnancySettingsFragment$onCreateView$1$2$1", m100430f = "PregnancySettingsFragment.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9678b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28292w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C0378a f28294y;

        /* JADX INFO: renamed from: com.whoop.pregnancy.view.PregnancySettingsFragment$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C0378a f28295w;

            public a(C0378a c0378a) {
                this.f28295w = c0378a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC9684a abstractC9684a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f28295w.m1048a(abstractC9684a);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9678b(C0378a c0378a, InterfaceC30057d<? super C9678b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f28294y = c0378a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return PregnancySettingsFragment.this.new C9678b(this.f28294y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9678b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28292w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM35556l = PregnancySettingsFragment.this.m23281R0().getNavigationEvent();
                a aVar = new a(this.f28294y);
                this.f28292w = 1;
                if (interfaceC13058lM35556l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.PregnancySettingsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9679c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28296w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28297x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28298y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9679c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28296w = componentCallbacks;
            this.f28297x = interfaceC35951a;
            this.f28298y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f28296w;
            InterfaceC35951a interfaceC35951a = this.f28297x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28298y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.PregnancySettingsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9680d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28299w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28300x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28301y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9680d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28299w = componentCallbacks;
            this.f28300x = interfaceC35951a;
            this.f28301y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, v32.a] */
        @Override // c93.InterfaceC4339a
        public final C35613a invoke() {
            ComponentCallbacks componentCallbacks = this.f28299w;
            InterfaceC35951a interfaceC35951a = this.f28300x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28301y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35613a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.PregnancySettingsFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9681e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28302w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28303x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28304y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9681e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28302w = componentCallbacks;
            this.f28303x = interfaceC35951a;
            this.f28304y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f28302w;
            InterfaceC35951a interfaceC35951a = this.f28303x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28304y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.PregnancySettingsFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9682f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28305w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9682f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f28305w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f28305w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.pregnancy.view.PregnancySettingsFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9683g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28306w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28307x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28308y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f28309z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9683g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f28306w = componentCallbacks;
            this.f28307x = interfaceC35951a;
            this.f28308y = interfaceC4339a;
            this.f28309z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, e42.a] */
        @Override // c93.InterfaceC4339a
        public final C12708a invoke() {
            return AbstractC34132o.m107857B(this.f28306w, this.f28307x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12708a.class), this.f28308y, this.f28309z);
        }
    }

    public PregnancySettingsFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C9679c(this, null, null));
        this.pregnancyAnalytics = AbstractC30060g.m92087G(enumC23463i, new C9680d(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C9681e(this, null, new C4176m(this, 5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m23247A0(C0378a c0378a) {
        c0378a.m1048a(new AbstractC9684a.c("ONBOARDING_DUE_DATE", false, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m23249B0(PregnancySettingsFragment pregnancySettingsFragment, C0378a c0378a) {
        pregnancySettingsFragment.m23275O0().m112827c();
        c0378a.m1048a(AbstractC9684a.a.f28310a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m23251C0(C4181r c4181r, PregnancySettingsFragment pregnancySettingsFragment, C0378a c0378a, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C4171h c4171hM13059f = c4181r.getOnboardingScreenViewState();
        if (c4171hM13059f == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-9322613);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-9322612);
            boolean zM13056c = c4181r.getDueDateLoading();
            boolean zM13063j = c4181r.getIsGeneralError();
            boolean zM13062i = c4181r.getIsDueDateUpdateError();
            C4167d c4167dM13046a = c4171hM13059f.getOnboardingDueDate();
            boolean zM87157i = c28655q2.m87157i(pregnancySettingsFragment);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C4175l(pregnancySettingsFragment, 0);
                c28655q2.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q2.m87157i(pregnancySettingsFragment) | c28655q2.m87157i(c0378a);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C4174k(pregnancySettingsFragment, c0378a, 2);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q2.m87157i(pregnancySettingsFragment);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4176m(pregnancySettingsFragment, 0);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
            boolean zM87157i4 = c28655q2.m87157i(pregnancySettingsFragment) | c28655q2.m87157i(c0378a);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C4174k(pregnancySettingsFragment, c0378a, 3);
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
            boolean zM87157i5 = c28655q2.m87157i(pregnancySettingsFragment) | c28655q2.m87157i(c4181r);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C4177n(pregnancySettingsFragment, c4181r, 0);
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC11694j.m31181C(zM13056c, zM13063j, zM13062i, c4167dM13046a, function1, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, (InterfaceC4339a) objM87133R5, c28655q2, TextResource.$stable << 9, 0);
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m23253D0(PregnancySettingsFragment pregnancySettingsFragment, String dueDate) {
        AbstractC22676k.m65750j(dueDate, "dueDate");
        pregnancySettingsFragment.m23281R0().m35557p(new AbstractC39197a.c(dueDate, true));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m23255E0(PregnancySettingsFragment pregnancySettingsFragment, C0378a c0378a) {
        pregnancySettingsFragment.m23275O0().m112827c();
        c0378a.m1048a(AbstractC9684a.a.f28310a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m23257F0(PregnancySettingsFragment pregnancySettingsFragment) {
        pregnancySettingsFragment.m23281R0().m35557p(AbstractC39197a.a.f168464a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m23259G0(PregnancySettingsFragment pregnancySettingsFragment, C0378a c0378a) {
        pregnancySettingsFragment.m23275O0().m112827c();
        c0378a.m1048a(new AbstractC9684a.f(false, null, 3, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m23261H0(PregnancySettingsFragment pregnancySettingsFragment, C4181r c4181r) {
        pregnancySettingsFragment.m23281R0().m35557p(new AbstractC39197a.c(c4181r.getPreviousDueDate(), true));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C23454a0 m23263I0(C4181r c4181r, C0378a c0378a, PregnancySettingsFragment pregnancySettingsFragment, C12982q it, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(it, "it");
        C4168e c4168eM13058e = c4181r.getOnboardingSavedViewState();
        C28655q c28655q = (C28655q) composer;
        if (c4168eM13058e == null) {
            c28655q.m87150e0(-1465751261);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1465751260);
            boolean zM87157i = c28655q.m87157i(c0378a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C4173j(c0378a, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
            boolean zM87157i2 = c28655q.m87157i(pregnancySettingsFragment) | c28655q.m87157i(c0378a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C4174k(pregnancySettingsFragment, c0378a, 1);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(c0378a);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4173j(c0378a, 2);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC11687c.m31170d(c4168eM13058e, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, TextResource.$stable);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m23265J0(C0378a c0378a) {
        c0378a.m1048a(AbstractC9684a.d.f28314a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m23267K0(PregnancySettingsFragment pregnancySettingsFragment, C0378a c0378a) {
        pregnancySettingsFragment.m23275O0().m112831g();
        c0378a.m1048a(new AbstractC9684a.e("android-app://com.whoop/onboardingStoriesFragmentRedesign/PREGNANCY_STORY_V2"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m23269L0(C0378a c0378a) {
        c0378a.m1048a(AbstractC9684a.d.f28314a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m23271M0(PregnancySettingsFragment pregnancySettingsFragment, C12991u0 c12991u0, C4181r c4181r, C0378a c0378a, int i13, Composer composer, int i14) {
        pregnancySettingsFragment.m23302h0(c12991u0, c4181r, c0378a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O0 */
    private final C35613a m23275O0() {
        return (C35613a) this.pregnancyAnalytics.getValue();
    }

    /* JADX INFO: renamed from: P0 */
    private final String m23277P0() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: renamed from: Q0 */
    private final EnumC4179p m23279Q0() {
        return (EnumC4179p) this.startScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public final C12708a m23281R0() {
        return (C12708a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C34911a m23283S0(PregnancySettingsFragment pregnancySettingsFragment) {
        return AbstractC15751g.m44431K(pregnancySettingsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C23454a0 m23285T0(PregnancySettingsFragment pregnancySettingsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("PregnancySettingsNavHost", null, c28655q, 6, 2);
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(pregnancySettingsFragment.m23281R0().getViewState(), new C4181r(false, true, false, false, null, null, null, null, null, 509, null), null, c28655q, 0, 2);
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = pregnancySettingsFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC5583n.m16799z(pregnancySettingsFragment);
            c28655q.m87172p0(objM87133R);
        }
        C0378a c0378a = new C0378a(abstractActivityC1340r0RequireActivity, (AbstractC12939a0) objM87133R, c12991u0M58963a, pregnancySettingsFragment.getNavigator(), pregnancySettingsFragment.getExternalLinkNavigator(), null, 32, null);
        boolean zM87157i = c28655q.m87157i(pregnancySettingsFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = pregnancySettingsFragment.new C9677a(null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
        boolean zM87157i2 = c28655q.m87157i(pregnancySettingsFragment) | c28655q.m87157i(c0378a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            objM87133R3 = pregnancySettingsFragment.new C9678b(c0378a, null);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, "pregnancySettingsNavigation");
        pregnancySettingsFragment.m23302h0(c12991u0M58963a, m23287U0(interfaceC28601c1M87260n), c0378a, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: U0 */
    private static final C4181r m23287U0(InterfaceC28670t2 interfaceC28670t2) {
        return (C4181r) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final String m23289V0(PregnancySettingsFragment pregnancySettingsFragment) {
        return pregnancySettingsFragment.requireArguments().getString("source", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002c A[RETURN] */
    /* JADX INFO: renamed from: W0 */
    public static final EnumC4179p m23291W0(PregnancySettingsFragment pregnancySettingsFragment) {
        String string = pregnancySettingsFragment.requireArguments().getString("pregnancyScreen");
        if (string == null) {
            string = "";
        }
        EnumC4179p enumC4179p = EnumC4179p.DEFAULT;
        for (EnumC4179p enumC4179p2 : EnumC4179p.values()) {
            if (AbstractC22676k.m65745e(enumC4179p2.name(), string)) {
                if (enumC4179p2 == null) {
                    return enumC4179p;
                }
                return enumC4179p2;
            }
        }
        enumC4179p2 = null;
        if (enumC4179p2 == null) {
            return enumC4179p;
        }
        return enumC4179p2;
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m23302h0(C12991u0 c12991u0, C4181r c4181r, C0378a c0378a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-591715197);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c12991u0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c4181r) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c0378a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(this) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            boolean zM87157i = c28655q.m87157i(c4181r) | c28655q.m87157i(c0378a) | c28655q.m87157i(this);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C29656q(c4181r, c0378a, this, 15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17269i.m48888e(c12991u0, "SETTINGS_HOME", null, (Function1) objM87133R, c28655q, i14 & 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4025f5(this, c12991u0, c4181r, c0378a, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m23303i0(C4181r c4181r, C0378a c0378a, PregnancySettingsFragment pregnancySettingsFragment, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "SETTINGS_HOME", null, new C37816b(new C4172i(c4181r, c0378a, pregnancySettingsFragment, 2), true, -1762552162), 6);
        AbstractC12889b.m36291u(NavHost, "SETTINGS_EXIT", null, new C37816b(new C4172i(c4181r, pregnancySettingsFragment, c0378a, 3), true, -1068441401), 6);
        AbstractC12889b.m36291u(NavHost, "SETTINGS_EDUCATION", null, new C37816b(new C22931l(11, c4181r, c0378a), true, 1270378982), 6);
        AbstractC12889b.m36291u(NavHost, "ONBOARDING_WELCOME", null, new C37816b(new C4172i(c4181r, c0378a, pregnancySettingsFragment, 4), true, -685767931), 6);
        AbstractC12889b.m36291u(NavHost, "ONBOARDING_DUE_DATE", null, new C37816b(new C4172i(c4181r, pregnancySettingsFragment, c0378a, 0), true, 1653052452), 6);
        AbstractC12889b.m36291u(NavHost, "ONBOARDING_SAVED", null, new C37816b(new C4172i(c4181r, c0378a, pregnancySettingsFragment, 1), true, -303094461), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m23304j0(C4181r c4181r, final C0378a c0378a, final PregnancySettingsFragment pregnancySettingsFragment, C12982q it, Composer composer, int i13) {
        C4182s c4182sM13051d;
        AbstractC22676k.m65750j(it, "it");
        C4180q c4180qM13061h = c4181r.getSettingsScreenViewState();
        final boolean zM13066b = (c4180qM13061h == null || (c4182sM13051d = c4180qM13061h.getPregnancyToggle()) == null) ? false : c4182sM13051d.getEnabled();
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c0378a) | c28655q.m87155h(zM13066b) | c28655q.m87157i(pregnancySettingsFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            final int i14 = 0;
            objM87133R = new InterfaceC4339a() { // from class: c42.o
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            return PregnancySettingsFragment.m23305k0(c0378a, zM13066b, pregnancySettingsFragment);
                        default:
                            return PregnancySettingsFragment.m23307m0(c0378a, zM13066b, pregnancySettingsFragment);
                    }
                }
            };
            c28655q.m87172p0(objM87133R);
        }
        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
        if (pregnancySettingsFragment.m23279Q0() == EnumC4179p.EDUCATION) {
            c28655q.m87150e0(2079058078);
            C4170g c4170gM13057d = c4181r.getEducationContent();
            boolean zM87157i2 = c28655q.m87157i(pregnancySettingsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C4176m(pregnancySettingsFragment, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC11688d.m31176c(c4170gM13057d, (InterfaceC4339a) objM87133R2, c28655q, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(2079345262);
            boolean zM87157i3 = c28655q.m87157i(c0378a) | c28655q.m87155h(zM13066b) | c28655q.m87157i(pregnancySettingsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new InterfaceC4339a() { // from class: c42.o
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return PregnancySettingsFragment.m23305k0(c0378a, zM13066b, pregnancySettingsFragment);
                            default:
                                return PregnancySettingsFragment.m23307m0(c0378a, zM13066b, pregnancySettingsFragment);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(c0378a) | c28655q.m87157i(pregnancySettingsFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C4174k(c0378a, pregnancySettingsFragment);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
            boolean zM87157i5 = c28655q.m87157i(pregnancySettingsFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C4175l(pregnancySettingsFragment, 1);
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function1 = (Function1) objM87133R5;
            boolean zM87157i6 = c28655q.m87157i(c0378a);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i6 || objM87133R6 == c28676v0) {
                objM87133R6 = new C0103b(c0378a, 26);
                c28655q.m87172p0(objM87133R6);
            }
            Function1 function2 = (Function1) objM87133R6;
            boolean zM87157i7 = c28655q.m87157i(pregnancySettingsFragment);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i7 || objM87133R7 == c28676v0) {
                objM87133R7 = new C4175l(pregnancySettingsFragment, 2);
                c28655q.m87172p0(objM87133R7);
            }
            Function1 function3 = (Function1) objM87133R7;
            boolean zM87157i8 = c28655q.m87157i(pregnancySettingsFragment);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i8 || objM87133R8 == c28676v0) {
                objM87133R8 = new C4176m(pregnancySettingsFragment, 4);
                c28655q.m87172p0(objM87133R8);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R8;
            boolean zM87157i9 = c28655q.m87157i(pregnancySettingsFragment) | c28655q.m87157i(c4181r);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87157i9 || objM87133R9 == c28676v0) {
                objM87133R9 = new C4177n(pregnancySettingsFragment, c4181r, 1);
                c28655q.m87172p0(objM87133R9);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R9;
            boolean zM87157i10 = c28655q.m87157i(c0378a) | c28655q.m87157i(pregnancySettingsFragment);
            Object objM87133R10 = c28655q.m87133R();
            if (zM87157i10 || objM87133R10 == c28676v0) {
                objM87133R10 = new C3169c(9, c0378a, pregnancySettingsFragment);
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC11700p.m31251Z(c4181r, interfaceC4339a, interfaceC4339a2, function1, function2, function3, interfaceC4339a3, interfaceC4339a4, (Function1) objM87133R10, c28655q, 0);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m23305k0(C0378a c0378a, boolean z4, PregnancySettingsFragment pregnancySettingsFragment) {
        String strM23277P0 = pregnancySettingsFragment.m23277P0();
        AbstractC22676k.m65749i(strM23277P0, "<get-source>(...)");
        c0378a.m1048a(new AbstractC9684a.f(z4, strM23277P0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m23306l0(PregnancySettingsFragment pregnancySettingsFragment) {
        AbstractC5583n.m16799z(pregnancySettingsFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m23307m0(C0378a c0378a, boolean z4, PregnancySettingsFragment pregnancySettingsFragment) {
        String strM23277P0 = pregnancySettingsFragment.m23277P0();
        AbstractC22676k.m65749i(strM23277P0, "<get-source>(...)");
        c0378a.m1048a(new AbstractC9684a.f(z4, strM23277P0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m23308n0(C0378a c0378a, PregnancySettingsFragment pregnancySettingsFragment) {
        c0378a.m1048a(new AbstractC9684a.c("SETTINGS_EDUCATION", false, 2, null));
        pregnancySettingsFragment.m23275O0().m112830f();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m23309o0(PregnancySettingsFragment pregnancySettingsFragment, boolean z4) {
        pregnancySettingsFragment.m23281R0().m35557p(new AbstractC39197a.b(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m23310p0(C0378a c0378a, String learnMoreUrl) {
        AbstractC22676k.m65750j(learnMoreUrl, "learnMoreUrl");
        c0378a.m1048a(new AbstractC9684a.b(learnMoreUrl));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m23311q0(PregnancySettingsFragment pregnancySettingsFragment, String selectedDueDate) {
        AbstractC22676k.m65750j(selectedDueDate, "selectedDueDate");
        pregnancySettingsFragment.m23281R0().m35557p(new AbstractC39197a.c(selectedDueDate, false));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m23312r0(PregnancySettingsFragment pregnancySettingsFragment) {
        pregnancySettingsFragment.m23281R0().m35557p(AbstractC39197a.a.f168464a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m23313s0(PregnancySettingsFragment pregnancySettingsFragment, C4181r c4181r) {
        pregnancySettingsFragment.m23281R0().m35557p(new AbstractC39197a.c(c4181r.getPreviousDueDate(), false));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m23314t0(C0378a c0378a, PregnancySettingsFragment pregnancySettingsFragment, C9598e it) {
        C1601k1 c1601k1M36480b;
        AbstractC22676k.m65750j(it, "it");
        c0378a.m1048a(it);
        C12982q c12982qM36398m = AbstractC5583n.m16799z(pregnancySettingsFragment).m36398m();
        if (c12982qM36398m != null && (c1601k1M36480b = c12982qM36398m.m36480b()) != null) {
            c1601k1M36480b.m5004e(Boolean.TRUE, "LAST_PAGE_PREVIOUS_PREGNANCY");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m23315u0(C4181r c4181r, PregnancySettingsFragment pregnancySettingsFragment, C0378a c0378a, C12982q it, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(it, "it");
        C4180q c4180qM13061h = c4181r.getSettingsScreenViewState();
        C28655q c28655q = (C28655q) composer;
        if (c4180qM13061h == null) {
            c28655q.m87150e0(64923061);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(64923062);
            C4166c c4166cM13050c = c4181r.getSettingsScreenViewState().getExitDialog();
            boolean zM87157i = c28655q.m87157i(pregnancySettingsFragment) | c28655q.m87157i(c0378a) | c28655q.m87157i(c4180qM13061h);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C3718c(pregnancySettingsFragment, c0378a, c4180qM13061h, 26);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c0378a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C4173j(c0378a, 3);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC11686b.m31163d(c4166cM13050c, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, TextResource.$stable);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m23316v0(PregnancySettingsFragment pregnancySettingsFragment, C0378a c0378a, C4180q c4180q) {
        pregnancySettingsFragment.m23275O0().m112828d();
        c0378a.m1048a(new AbstractC9684a.h(c4180q.getExitDialog().getCtaUrl()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m23317w0(C0378a c0378a) {
        c0378a.m1048a(AbstractC9684a.a.f28310a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m23318x0(C4181r c4181r, C0378a c0378a, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C4170g c4170gM13057d = c4181r.getEducationContent();
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c0378a);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new C4173j(c0378a, 4);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC11688d.m31176c(c4170gM13057d, (InterfaceC4339a) objM87133R, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m23320y0(C0378a c0378a) {
        c0378a.m1048a(AbstractC9684a.a.f28310a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m23322z0(C4181r c4181r, C0378a c0378a, PregnancySettingsFragment pregnancySettingsFragment, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C4171h c4171hM13059f = c4181r.getOnboardingScreenViewState();
        C28655q c28655q = (C28655q) composer;
        if (c4171hM13059f == null) {
            c28655q.m87150e0(1447068804);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1447068805);
            C4169f c4169fM13047b = c4171hM13059f.getOnboardingWelcome();
            boolean zM87157i = c28655q.m87157i(c0378a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C4173j(c0378a, 0);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(pregnancySettingsFragment) | c28655q.m87157i(c0378a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C4174k(pregnancySettingsFragment, c0378a, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC11696l.m31224l(c4169fM13047b, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, TextResource.$stable);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m23275O0().m112829e();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 27), true, 106956045));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        C1601k1 c1601k1M36480b;
        C1601k1 c1601k1M36480b2;
        super.onResume();
        C12982q c12982qM36393h = AbstractC5583n.m16799z(this).m36393h();
        if ((c12982qM36393h == null || (c1601k1M36480b2 = c12982qM36393h.m36480b()) == null) ? false : AbstractC22676k.m65745e(c1601k1M36480b2.m5001b("LAST_PAGE_PREVIOUS_PREGNANCY"), Boolean.TRUE)) {
            m23281R0().m35557p(AbstractC39197a.a.f168464a);
            C12982q c12982qM36393h2 = AbstractC5583n.m16799z(this).m36393h();
            if (c12982qM36393h2 == null || (c1601k1M36480b = c12982qM36393h2.m36480b()) == null) {
                return;
            }
            c1601k1M36480b.m5004e(Boolean.FALSE, "LAST_PAGE_PREVIOUS_PREGNANCY");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }
}
