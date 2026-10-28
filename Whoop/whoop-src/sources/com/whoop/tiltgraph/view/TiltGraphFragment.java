package com.whoop.tiltgraph.view;

import ak2.AbstractC0952a;
import ak2.C0953b;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2626t2;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bk2.AbstractC3357d;
import bk2.AbstractC3360g;
import bk2.C3358e;
import bk2.InterfaceC3355b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.tiltgraph.view.TiltGraphFragment;
import dh0.C12040a;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import fn2.InterfaceC14654n;
import ge3.AbstractC15751g;
import hj0.C17345d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p704dk2.AbstractC12121h;
import p704dk2.C12119f;
import p715kotlin.KotlinNothingValueException;
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
import uj2.AbstractC35038a;
import uj2.C35039b;
import uj2.EnumC35040c;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00069²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/tiltgraph/view/TiltGraphFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "P", "W", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onDetach", "Lbk2/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "N", "()Lbk2/e;", "viewModel", "Lfn2/n;", "x", "M", "()Lfn2/n;", "tiltOrientationPolicy", "Luj2/b;", "y", "L", "()Luj2/b;", "tiltAnalyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "J", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lhj0/d;", "E", "I", "()Lhj0/d;", "appLifecycle", "Lak2/b;", "F", "K", "()Lak2/b;", "navigationRouter", "", "G", "Z", "comingFromBackground", "Lbk2/g;", "viewState", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TiltGraphFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h appLifecycle;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h navigationRouter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean comingFromBackground;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10382i(this, null, new C10381h(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h tiltOrientationPolicy;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h tiltAnalyticsHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.view.TiltGraphFragment$observePortraitRotationExit$1", m100430f = "TiltGraphFragment.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10374a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31341w;

        /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$a$a */
        @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.view.TiltGraphFragment$observePortraitRotationExit$1$1", m100430f = "TiltGraphFragment.kt", m100431l = {110, 112}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            Object f31343w;

            /* JADX INFO: renamed from: x */
            int f31344x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ TiltGraphFragment f31345y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TiltGraphFragment tiltGraphFragment, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f31345y = tiltGraphFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final C34911a m26497h(TiltGraphFragment tiltGraphFragment) {
                return AbstractC15751g.m44431K(tiltGraphFragment.requireContext());
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f31345y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
            
                if (r1.mo41844a(r8) == r0) goto L18;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r8.f31344x
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    l83.a0 r5 = l83.C23454a0.f92919a
                    if (r1 == 0) goto L27
                    if (r1 == r4) goto L1f
                    if (r1 != r3) goto L17
                    java.lang.Object r0 = r8.f31343w
                    fn2.d r0 = (fn2.InterfaceC14644d) r0
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L63
                L17:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1f:
                    java.lang.Object r1 = r8.f31343w
                    fn2.d r1 = (fn2.InterfaceC14644d) r1
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L4f
                L27:
                    p505ts.AbstractC34132o.m107864I(r9)
                    com.whoop.tiltgraph.view.TiltGraphFragment r9 = r8.f31345y
                    com.whoop.tiltgraph.view.a r1 = new com.whoop.tiltgraph.view.a
                    r1.<init>()
                    xf3.c r9 = pf.AbstractC29125c.m88492A(r9)
                    java.lang.Class<fn2.d> r6 = fn2.InterfaceC14644d.class
                    kotlin.jvm.internal.i0 r7 = p715kotlin.jvm.internal.AbstractC22671h0.f89337a
                    j93.d r6 = r7.getOrCreateKotlinClass(r6)
                    java.lang.Object r9 = r9.m122602a(r1, r6, r2)
                    r1 = r9
                    fn2.d r1 = (fn2.InterfaceC14644d) r1
                    r8.f31343w = r1
                    r8.f31344x = r4
                    java.lang.Object r9 = r1.mo41845b(r8)
                    if (r9 != r0) goto L4f
                    goto L62
                L4f:
                    com.whoop.tiltgraph.view.TiltGraphFragment r9 = r8.f31345y
                    boolean r9 = r9.isAdded()
                    if (r9 != 0) goto L58
                    goto L6b
                L58:
                    r8.f31343w = r2
                    r8.f31344x = r3
                    java.lang.Object r9 = r1.mo41844a(r8)
                    if (r9 != r0) goto L63
                L62:
                    return r0
                L63:
                    com.whoop.tiltgraph.view.TiltGraphFragment r9 = r8.f31345y
                    boolean r9 = r9.isAdded()
                    if (r9 != 0) goto L6c
                L6b:
                    return r5
                L6c:
                    com.whoop.tiltgraph.view.TiltGraphFragment r9 = r8.f31345y
                    uj2.b r9 = com.whoop.tiltgraph.view.TiltGraphFragment.m26477G(r9)
                    uj2.a$e r0 = new uj2.a$e
                    uj2.c r1 = uj2.EnumC35040c.TILT
                    r0.<init>(r1)
                    r9.m110763j(r0)
                    com.whoop.tiltgraph.view.TiltGraphFragment r9 = r8.f31345y
                    ak2.b r9 = com.whoop.tiltgraph.view.TiltGraphFragment.m26476F(r9)
                    ak2.a$a r0 = ak2.AbstractC0952a.a.f3533a
                    r9.m2411a(r0)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whoop.tiltgraph.view.TiltGraphFragment.C10374a.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C10374a(InterfaceC30057d<? super C10374a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TiltGraphFragment.this.new C10374a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10374a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31341w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC1585g0 viewLifecycleOwner = TiltGraphFragment.this.getViewLifecycleOwner();
                AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                EnumC1635w enumC1635w = EnumC1635w.f6323E;
                a aVar = new a(TiltGraphFragment.this, null);
                this.f31341w = 1;
                if (AbstractC1613o1.m5023m(viewLifecycleOwner, enumC1635w, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.view.TiltGraphFragment$registerAppBackgroundListener$1", m100430f = "TiltGraphFragment.kt", m100431l = {127}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10375b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31346w;

        /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ TiltGraphFragment f31348w;

            public a(TiltGraphFragment tiltGraphFragment) {
                this.f31348w = tiltGraphFragment;
            }

            /* JADX INFO: renamed from: b */
            public final Object m26498b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (!z4) {
                    this.f31348w.comingFromBackground = true;
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m26498b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        public C10375b(InterfaceC30057d<? super C10375b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TiltGraphFragment.this.new C10375b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10375b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31346w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2M49091d = TiltGraphFragment.this.m26479I().getAppForegroundFlow();
                a aVar = new a(TiltGraphFragment.this);
                this.f31346w = 1;
                if (interfaceC13037f2M49091d.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10376c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31349w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31350x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31351y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10376c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31349w = componentCallbacks;
            this.f31350x = interfaceC35951a;
            this.f31351y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fn2.n, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14654n invoke() {
            ComponentCallbacks componentCallbacks = this.f31349w;
            InterfaceC35951a interfaceC35951a = this.f31350x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31351y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14654n.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10377d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31352w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31353x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31354y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10377d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31352w = componentCallbacks;
            this.f31353x = interfaceC35951a;
            this.f31354y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, uj2.b] */
        @Override // c93.InterfaceC4339a
        public final C35039b invoke() {
            ComponentCallbacks componentCallbacks = this.f31352w;
            InterfaceC35951a interfaceC35951a = this.f31353x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31354y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35039b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10378e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31355w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31356x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31357y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10378e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31355w = componentCallbacks;
            this.f31356x = interfaceC35951a;
            this.f31357y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f31355w;
            InterfaceC35951a interfaceC35951a = this.f31356x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31357y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10379f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31358w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31359x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31360y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10379f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31358w = componentCallbacks;
            this.f31359x = interfaceC35951a;
            this.f31360y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hj0.d, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17345d invoke() {
            ComponentCallbacks componentCallbacks = this.f31358w;
            InterfaceC35951a interfaceC35951a = this.f31359x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31360y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17345d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10380g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31361w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31362x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31363y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10380g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31361w = componentCallbacks;
            this.f31362x = interfaceC35951a;
            this.f31363y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ak2.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C0953b invoke() {
            ComponentCallbacks componentCallbacks = this.f31361w;
            InterfaceC35951a interfaceC35951a = this.f31362x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31363y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0953b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10381h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31364w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10381h(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31364w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31364w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.tiltgraph.view.TiltGraphFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10382i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31365w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31366x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31367y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31368z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10382i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31365w = componentCallbacks;
            this.f31366x = interfaceC35951a;
            this.f31367y = interfaceC4339a;
            this.f31368z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, bk2.e] */
        @Override // c93.InterfaceC4339a
        public final C3358e invoke() {
            return AbstractC34132o.m107857B(this.f31365w, this.f31366x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3358e.class), this.f31367y, this.f31368z);
        }
    }

    public TiltGraphFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.tiltOrientationPolicy = AbstractC30060g.m92087G(enumC23463i, new C10376c(this, null, null));
        this.tiltAnalyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10377d(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10378e(this, null, null));
        this.appLifecycle = AbstractC30060g.m92087G(enumC23463i, new C10379f(this, null, null));
        this.navigationRouter = AbstractC30060g.m92087G(enumC23463i, new C10380g(this, null, new C12119f(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final C17345d m26479I() {
        return (C17345d) this.appLifecycle.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final FeatureFlagChecker m26480J() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final C0953b m26481K() {
        return (C0953b) this.navigationRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final C35039b m26482L() {
        return (C35039b) this.tiltAnalyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final InterfaceC14654n m26483M() {
        return (InterfaceC14654n) this.tiltOrientationPolicy.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final C3358e m26484N() {
        return (C3358e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C34911a m26485O(TiltGraphFragment tiltGraphFragment) {
        return AbstractC15751g.m44431K(tiltGraphFragment);
    }

    /* JADX INFO: renamed from: P */
    private final void m26486P() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C10374a(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m26487Q(final TiltGraphFragment tiltGraphFragment, boolean z4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC3360g abstractC3360gM26488R = m26488R(AbstractC28683x.m87260n(tiltGraphFragment.m26484N().getViewState(), AbstractC3360g.b.f13097a, null, c28655q, 48, 2));
            boolean zM87157i = c28655q.m87157i(tiltGraphFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C12119f(tiltGraphFragment, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(tiltGraphFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1(tiltGraphFragment) { // from class: dk2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ TiltGraphFragment f40344x;

                    {
                        this.f40344x = tiltGraphFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return TiltGraphFragment.m26490T(this.f40344x, (InterfaceC3355b) obj);
                            default:
                                return TiltGraphFragment.m26491U(this.f40344x, (AbstractC35038a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(tiltGraphFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1(tiltGraphFragment) { // from class: dk2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ TiltGraphFragment f40344x;

                    {
                        this.f40344x = tiltGraphFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return TiltGraphFragment.m26490T(this.f40344x, (InterfaceC3355b) obj);
                            default:
                                return TiltGraphFragment.m26491U(this.f40344x, (AbstractC35038a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C12040a(15);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC12121h.m33518i(abstractC3360gM26488R, z4, interfaceC4339a, function1, function2, (Function1) objM87133R4, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private static final AbstractC3360g m26488R(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC3360g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m26489S(TiltGraphFragment tiltGraphFragment) {
        tiltGraphFragment.m26482L().m110763j(new AbstractC35038a.e(EnumC35040c.BUTTON));
        tiltGraphFragment.m26481K().m2411a(AbstractC0952a.a.f3533a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m26490T(TiltGraphFragment tiltGraphFragment, InterfaceC3355b it) {
        AbstractC22676k.m65750j(it, "it");
        tiltGraphFragment.m26484N().m9700p(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m26491U(TiltGraphFragment tiltGraphFragment, AbstractC35038a it) {
        AbstractC22676k.m65750j(it, "it");
        tiltGraphFragment.m26482L().m110763j(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m26492V(AbstractC0952a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private final void m26493W() {
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(abstractActivityC1340r0RequireActivity), null, null, new C10375b(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        LocalDate localDateNow;
        String string;
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(HttpHeaders.DATE)) == null) {
            localDateNow = LocalDate.now();
        } else {
            try {
                localDateNow = LocalDate.parse(string);
            } catch (DateTimeParseException unused) {
                localDateNow = LocalDate.now();
            }
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
        }
        C3358e c3358eM26484N = m26484N();
        AbstractC22676k.m65747g(localDateNow);
        Bundle arguments2 = getArguments();
        c3358eM26484N.m9700p(new AbstractC3357d.a(localDateNow, arguments2 != null ? arguments2.getString("source") : null, true));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        InterfaceC14654n interfaceC14654nM26483M = m26483M();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        interfaceC14654nM26483M.mo41838b(abstractActivityC1340r0RequireActivity);
        InterfaceC14654n interfaceC14654nM26483M2 = m26483M();
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        if (interfaceC14654nM26483M2.mo41837a(contextRequireContext)) {
            m26486P();
        }
        if (m26480J().isFeatureEnabled("dismiss-tilt-graph-when-backgrounded")) {
            m26493W();
        }
        InterfaceC14654n interfaceC14654nM26483M3 = m26483M();
        Context contextRequireContext2 = requireContext();
        AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
        return AbstractC22387b0.m64387c(this, new C37816b(new C2626t2(this, interfaceC14654nM26483M3.mo41840d(contextRequireContext2), 2), true, -767329273));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onDetach() {
        super.onDetach();
        InterfaceC14654n interfaceC14654nM26483M = m26483M();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        interfaceC14654nM26483M.mo41839c(abstractActivityC1340r0RequireActivity);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        if (this.comingFromBackground && m26480J().isFeatureEnabled("dismiss-tilt-graph-when-backgrounded")) {
            m26481K().m2411a(AbstractC0952a.a.f3533a);
        }
    }
}
