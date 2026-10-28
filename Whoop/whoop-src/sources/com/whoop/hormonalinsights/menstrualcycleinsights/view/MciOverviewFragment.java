package com.whoop.hormonalinsights.menstrualcycleinsights.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.C28216y;
import p088dc.AbstractC11895b;
import p114eb.C12991u0;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
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
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ro1.AbstractC31634f;
import ro1.AbstractC31635g;
import ro1.C31637i;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import so1.AbstractC32803a0;
import so1.AbstractC32807c0;
import so1.C32805b0;
import tx0.C34238a;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vo1.C36234i;
import yb3.AbstractC39414r;
import yn1.C39673b;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0003R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0006R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00105R\u001b\u00109\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b(\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010;¨\u0006?²\u0006\f\u0010>\u001a\u00020=8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/MciOverviewFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "H", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "Lzr2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "G", "()Lzr2/a;", "dateAndTimeProvider", "x", "F", HttpHeaders.DATE, "y", "Ljava/lang/String;", "preSelectedLogValue", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "I", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lor2/y;", "E", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lso1/b0;", "J", "()Lso1/b0;", "viewModel", "Lj02/o0;", "getNavigator", "()Lj02/o0;", "navigator", "Li2/x;", "Li2/x;", "statusColor", "Lyn1/b;", "()Lyn1/b;", "analyticsHelper", "", "Z", "hasResumed", "Lso1/c0;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MciOverviewFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private C17919x statusColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean hasResumed;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h date;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private String preSelectedLogValue;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment$onCreateView$1$2$1", m100430f = "MciOverviewFragment.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8913a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26658w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C31637i f26660y;

        /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C31637i f26661w;

            public a(C31637i c31637i) {
                this.f26661w = c31637i;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC31635g abstractC31635g, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f26661w.m97771a(abstractC31635g);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8913a(C31637i c31637i, InterfaceC30057d<? super C8913a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26660y = c31637i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MciOverviewFragment.this.new C8913a(this.f26660y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8913a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26658w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM102908n = MciOverviewFragment.this.m22019J().getNavigationEvents();
                a aVar = new a(this.f26660y);
                this.f26658w = 1;
                if (interfaceC13058lM102908n.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8914b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26662w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26663x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26664y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8914b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26662w = componentCallbacks;
            this.f26663x = interfaceC35951a;
            this.f26664y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f26662w;
            InterfaceC35951a interfaceC35951a = this.f26663x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26664y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8915c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26665w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26666x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26667y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8915c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26665w = componentCallbacks;
            this.f26666x = interfaceC35951a;
            this.f26667y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f26665w;
            InterfaceC35951a interfaceC35951a = this.f26666x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26667y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8916d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26668w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26669x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26670y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8916d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26668w = componentCallbacks;
            this.f26669x = interfaceC35951a;
            this.f26670y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f26668w;
            InterfaceC35951a interfaceC35951a = this.f26669x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26670y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8917e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26671w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26672x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26673y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8917e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26671w = componentCallbacks;
            this.f26672x = interfaceC35951a;
            this.f26673y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26671w;
            InterfaceC35951a interfaceC35951a = this.f26672x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26673y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8918f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26674w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26675x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26676y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8918f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26674w = componentCallbacks;
            this.f26675x = interfaceC35951a;
            this.f26676y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yn1.b] */
        @Override // c93.InterfaceC4339a
        public final C39673b invoke() {
            ComponentCallbacks componentCallbacks = this.f26674w;
            InterfaceC35951a interfaceC35951a = this.f26675x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26676y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39673b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment$g */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8919g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26677w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8919g(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26677w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26677w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8920h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26678w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26679x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26680y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26681z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8920h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26678w = componentCallbacks;
            this.f26679x = interfaceC35951a;
            this.f26680y = interfaceC4339a;
            this.f26681z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, so1.b0] */
        @Override // c93.InterfaceC4339a
        public final C32805b0 invoke() {
            return AbstractC34132o.m107857B(this.f26678w, this.f26679x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32805b0.class), this.f26680y, this.f26681z);
        }
    }

    public MciOverviewFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i, new C8914b(this, null, null));
        this.date = AbstractC30060g.m92088H(new C36234i(this, 0));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C8915c(this, null, null));
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C8916d(this, null, null));
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8920h(this, null, new C8919g(this), null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8917e(this, null, new C36234i(this, 1)));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8918f(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final String m22013D(MciOverviewFragment mciOverviewFragment) {
        return mciOverviewFragment.m22017H();
    }

    /* JADX INFO: renamed from: E */
    private final C39673b m22014E() {
        return (C39673b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final String m22015F() {
        return (String) this.date.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final InterfaceC41070a m22016G() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final String m22017H() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(HttpHeaders.DATE) : null;
        return (string == null || string.length() == 0) ? m22016G().mo133365d().toString("yyyy-MM-dd") : string;
    }

    /* JADX INFO: renamed from: I */
    private final FeatureFlagChecker m22018I() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final C32805b0 m22019J() {
        return (C32805b0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C34911a m22020K(MciOverviewFragment mciOverviewFragment) {
        return AbstractC15751g.m44431K(mciOverviewFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m22021L(MciOverviewFragment mciOverviewFragment, Composer composer, int i13) {
        C17919x c17919xM31989h;
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(mciOverviewFragment.m22019J().getViewState(), AbstractC32807c0.b.f136650b, null, c28655q, 48, 2);
            AbstractC32807c0 abstractC32807c0M22022M = m22022M(interfaceC28601c1M87260n);
            AbstractC32807c0.f fVar = abstractC32807c0M22022M instanceof AbstractC32807c0.f ? (AbstractC32807c0.f) abstractC32807c0M22022M : null;
            InterfaceC39332e interfaceC39332eM102929d = fVar != null ? fVar.getBackgroundColor() : null;
            if (interfaceC39332eM102929d == null) {
                c28655q.m87150e0(1758807567);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(-2021474254);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, interfaceC39332eM102929d.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            mciOverviewFragment.statusColor = c17919xM31989h;
            if (c17919xM31989h != null) {
                AbstractC28163g0.m85255k(mciOverviewFragment, AbstractC17918w0.m51506H(C17919x.m51541c(0.3f, c17919xM31989h.f69639a)), 0, 2, null);
            }
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("MciNavHost", null, c28655q, 6, 2);
            C31637i c31637i = new C31637i(mciOverviewFragment, mciOverviewFragment.getNavigator(), c12991u0M58963a, mciOverviewFragment.m22018I(), mciOverviewFragment.getExternalLinkNavigator());
            C32805b0 c32805b0M22019J = mciOverviewFragment.m22019J();
            boolean zM87157i = c28655q.m87157i(mciOverviewFragment) | c28655q.m87157i(c31637i);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = mciOverviewFragment.new C8913a(c31637i, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c32805b0M22019J);
            Bundle arguments = mciOverviewFragment.getArguments();
            String str = (arguments == null || (string = arguments.getString("analyticsSource")) == null || AbstractC39414r.m125890i0(string)) ? null : string;
            C32805b0 c32805b0M22019J2 = mciOverviewFragment.m22019J();
            AbstractC32807c0 abstractC32807c0M22022M2 = m22022M(interfaceC28601c1M87260n);
            String strM22015F = mciOverviewFragment.m22015F();
            String str2 = mciOverviewFragment.preSelectedLogValue;
            C39673b c39673bM22014E = mciOverviewFragment.m22014E();
            boolean zM87157i2 = c28655q.m87157i(mciOverviewFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C36234i(mciOverviewFragment, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC31634f.m97749l(c32805b0M22019J2, c31637i, c39673bM22014E, c12991u0M58963a, abstractC32807c0M22022M2, strM22015F, str2, str, (InterfaceC4339a) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final AbstractC32807c0 m22022M(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC32807c0) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m22023N(MciOverviewFragment mciOverviewFragment) {
        mciOverviewFragment.preSelectedLogValue = null;
        return C23454a0.f92919a;
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 23), true, -1007688993));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onPause() {
        super.onPause();
        AbstractC28163g0.m85255k(this, 0, 0, 2, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        if (this.hasResumed) {
            m22019J().m102909p(AbstractC32803a0.l.f136571a);
        } else {
            this.hasResumed = true;
        }
        C17919x c17919x = this.statusColor;
        if (c17919x != null) {
            AbstractC28163g0.m85255k(this, AbstractC17918w0.m51506H(C17919x.m51541c(0.3f, c17919x.f69639a)), 0, 2, null);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Bundle arguments;
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
        Bundle arguments2 = getArguments();
        this.preSelectedLogValue = arguments2 != null ? arguments2.getString("preSelectedLogValue") : null;
        C32805b0 c32805b0M22019J = m22019J();
        String strM22015F = m22015F();
        Bundle arguments3 = getArguments();
        c32805b0M22019J.m102909p(new AbstractC32803a0.e(strM22015F, arguments3 != null ? Boolean.valueOf(arguments3.getBoolean("doPollUponEntry")) : null));
        if (this.preSelectedLogValue == null || (arguments = getArguments()) == null) {
            return;
        }
        arguments.remove("preSelectedLogValue");
    }
}
