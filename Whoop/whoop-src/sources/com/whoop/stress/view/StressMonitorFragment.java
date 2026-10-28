package com.whoop.stress.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import e93.AbstractC12889b;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc0.C14359c;
import fj2.C14543a;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import jj2.AbstractC21741a;
import jp2.C21881l;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lj2.AbstractC24475a;
import lj2.C24477c;
import nj2.AbstractC26768o;
import nj2.C26769p;
import nq0.C27050m;
import oe2.C27878c;
import of2.C27900d;
import or2.AbstractC28163g0;
import or2.C28216y;
import ox0.C28448b;
import p000.AbstractC11266d;
import p040c0.InterfaceC3764o;
import p114eb.AbstractC12939a0;
import p114eb.C12962i;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
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
import pf.C29124b;
import pj2.AbstractC29304c;
import pj2.AbstractC29310i;
import pj2.C29305d;
import pj2.C29306e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rj2.C31489a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u92.C34660d;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wm0.C37378a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0014X\u0094D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b\u001d\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010#\u001a\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010\u0017¨\u0006G²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/stress/view/StressMonitorFragment;", "Lhj0/m;", "<init>", "()V", "Lnj2/p;", "viewState", "Ll83/a0;", "O", "(Lnj2/p;Landroidx/compose/runtime/Composer;I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "", "x", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lrj2/a;", "y", "Ll83/h;", "d0", "()Lrj2/a;", "viewModel", "Lor2/y;", "z", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lfj2/a;", "E", "()Lfj2/a;", "analyticsManager", "Lwm0/a;", "F", "b0", "()Lwm0/a;", "scopeCoordinator", "Lu92/d;", "G", "c0", "()Lu92/d;", "sharedPref", "Lj02/o0;", "H", "getNavigator", "()Lj02/o0;", "navigator", "Lpj2/e;", "I", "Leb/i;", "a0", "()Lpj2/e;", "args", "J", "selectedDate", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StressMonitorFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h scopeCoordinator;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h sharedPref;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C12962i args;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private String selectedDate;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "StressMonitorFragment";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10367j(this, null, new C10366i(this), null));

    /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.stress.view.StressMonitorFragment$StressMonitorNavHost$1$1", m100430f = "StressMonitorFragment.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10358a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31284w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C24477c f31286y;

        /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C24477c f31287w;

            public a(C24477c c24477c) {
                this.f31287w = c24477c;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC26768o abstractC26768o, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f31287w.m71247c(abstractC26768o);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10358a(C24477c c24477c, InterfaceC30057d<? super C10358a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f31286y = c24477c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StressMonitorFragment.this.new C10358a(this.f31286y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10358a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31284w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM96994o = StressMonitorFragment.this.m26428d0().getNavigationEvent();
                a aVar = new a(this.f31286y);
                this.f31284w = 1;
                if (interfaceC13058lM96994o.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.stress.view.StressMonitorFragment$StressMonitorNavHost$2$1$2$2$1$1", m100430f = "StressMonitorFragment.kt", m100431l = {120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10359b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31288w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12991u0 f31290y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10359b(C12991u0 c12991u0, InterfaceC30057d<? super C10359b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f31290y = c12991u0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StressMonitorFragment.this.new C10359b(this.f31290y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10359b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31288w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C37378a c37378aM26426b0 = StressMonitorFragment.this.m26426b0();
                this.f31288w = 1;
                if (C37378a.m119655c(c37378aM26426b0, null, this, 1, null) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f31290y.m36410z();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10360c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31291w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31292x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31293y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10360c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31291w = componentCallbacks;
            this.f31292x = interfaceC35951a;
            this.f31293y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f31291w;
            InterfaceC35951a interfaceC35951a = this.f31292x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31293y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10361d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31294w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31295x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31296y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10361d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31294w = componentCallbacks;
            this.f31295x = interfaceC35951a;
            this.f31296y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fj2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14543a invoke() {
            ComponentCallbacks componentCallbacks = this.f31294w;
            InterfaceC35951a interfaceC35951a = this.f31295x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31296y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14543a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10362e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31297w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31298x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31299y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10362e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31297w = componentCallbacks;
            this.f31298x = interfaceC35951a;
            this.f31299y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wm0.a] */
        @Override // c93.InterfaceC4339a
        public final C37378a invoke() {
            ComponentCallbacks componentCallbacks = this.f31297w;
            InterfaceC35951a interfaceC35951a = this.f31298x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31299y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37378a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10363f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31300w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31301x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31302y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10363f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31300w = componentCallbacks;
            this.f31301x = interfaceC35951a;
            this.f31302y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, u92.d] */
        @Override // c93.InterfaceC4339a
        public final C34660d invoke() {
            ComponentCallbacks componentCallbacks = this.f31300w;
            InterfaceC35951a interfaceC35951a = this.f31301x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31302y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10364g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31303w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31304x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31305y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10364g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31303w = componentCallbacks;
            this.f31304x = interfaceC35951a;
            this.f31305y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f31303w;
            InterfaceC35951a interfaceC35951a = this.f31304x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31305y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10365h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f31306w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10365h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f31306w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f31306w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f31306w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$i */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10366i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31307w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10366i(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31307w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31307w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressMonitorFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10367j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31308w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31309x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31310y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31311z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10367j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31308w = componentCallbacks;
            this.f31309x = interfaceC35951a;
            this.f31310y = interfaceC4339a;
            this.f31311z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rj2.a] */
        @Override // c93.InterfaceC4339a
        public final C31489a invoke() {
            return AbstractC34132o.m107857B(this.f31308w, this.f31309x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31489a.class), this.f31310y, this.f31311z);
        }
    }

    public StressMonitorFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C10360c(this, null, null));
        this.analyticsManager = AbstractC30060g.m92087G(enumC23463i, new C10361d(this, null, null));
        this.scopeCoordinator = AbstractC30060g.m92087G(enumC23463i, new C10362e(this, null, null));
        this.sharedPref = AbstractC30060g.m92087G(enumC23463i, new C10363f(this, new C35953c("mainPrefs"), null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10364g(this, null, new C29305d(this, 0)));
        this.args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29306e.class), new C10365h(this));
    }

    /* JADX INFO: renamed from: O */
    private final void m26413O(C26769p c26769p, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        StressMonitorFragment stressMonitorFragment;
        C12991u0 c12991u0;
        Object c21881l;
        C26769p c26769p2 = c26769p;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1419644122);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(c26769p2) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(this) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("StressMonitorNavHost", null, c28655q2, 6, 2);
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(this);
            InterfaceC21159o0 navigator = getNavigator();
            C31489a c31489aM26428d0 = m26428d0();
            C28216y externalLinkNavigator = getExternalLinkNavigator();
            C14543a c14543aM26424Z = m26424Z();
            C34660d c34660dM26427c0 = m26427c0();
            String strM88961b = m26425a0().m88961b();
            AbstractC22676k.m65749i(strM88961b, "getSource(...)");
            C24477c c24477c = new C24477c(this, abstractC12939a0M16799z, c12991u0M58963a, navigator, null, c31489aM26428d0, externalLinkNavigator, c14543aM26424Z, c34660dM26427c0, strM88961b, m26425a0().m88960a(), 16, null);
            boolean zM87157i = c28655q2.m87157i(this) | c28655q2.m87157i(c24477c);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C10358a(c24477c, null);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            c26769p2 = c26769p;
            boolean zM87157i2 = c28655q2.m87157i(c26769p2) | c28655q2.m87157i(this) | c28655q2.m87157i(c24477c) | c28655q2.m87157i(c12991u0M58963a);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                c12991u0 = c12991u0M58963a;
                c21881l = new C21881l(c26769p2, this, c24477c, c12991u0, 21);
                stressMonitorFragment = this;
                c28655q2.m87172p0(c21881l);
            } else {
                c12991u0 = c12991u0M58963a;
                c21881l = objM87133R2;
                stressMonitorFragment = this;
            }
            c28655q = c28655q2;
            AbstractC17269i.m48886d(c12991u0, "HOME", null, null, null, null, null, null, null, (Function1) c21881l, c28655q, 0, 1020);
        } else {
            c28655q = c28655q2;
            stressMonitorFragment = this;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(stressMonitorFragment, c26769p2, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m26414P(C26769p c26769p, StressMonitorFragment stressMonitorFragment, C24477c c24477c, C12991u0 c12991u0, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36290t(NavHost, "HOME", null, null, null, null, null, new C37816b(new C14359c(c26769p, stressMonitorFragment, c24477c, 4), true, -898667817), 254);
        AbstractC12889b.m36290t(NavHost, "EDUCATION", null, null, null, null, null, new C37816b(new C14359c(c26769p, stressMonitorFragment, c12991u0, 5), true, 573704704), 254);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m26415Q(C26769p c26769p, StressMonitorFragment stressMonitorFragment, C24477c c24477c, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(stressMonitorFragment) | c28655q.m87157i(c24477c);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C27050m(24, stressMonitorFragment, c24477c);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(stressMonitorFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C29305d(stressMonitorFragment, 1);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC29310i.m89039g0(c26769p, function1, (InterfaceC4339a) objM87133R2, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m26416R(StressMonitorFragment stressMonitorFragment, C24477c c24477c, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC24475a.d) {
            stressMonitorFragment.selectedDate = ((AbstractC24475a.d) event).getDateSelected();
        }
        c24477c.m71247c(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m26417S(StressMonitorFragment stressMonitorFragment) {
        stressMonitorFragment.m26428d0().m96996u(new AbstractC21741a.f(true));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m26418T(C26769p c26769p, StressMonitorFragment stressMonitorFragment, C12991u0 c12991u0, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(stressMonitorFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C29124b(stressMonitorFragment, 4);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(stressMonitorFragment) | c28655q.m87157i(c12991u0);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C28448b(19, stressMonitorFragment, c12991u0);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC29304c.m88955e(c26769p, function1, (InterfaceC4339a) objM87133R2, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m26419U(StressMonitorFragment stressMonitorFragment, int i13) {
        stressMonitorFragment.m26424Z().m41537d(String.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m26420V(StressMonitorFragment stressMonitorFragment, C12991u0 c12991u0) {
        InterfaceC1585g0 viewLifecycleOwner = stressMonitorFragment.getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, stressMonitorFragment.new C10359b(c12991u0, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m26421W(StressMonitorFragment stressMonitorFragment, C26769p c26769p, int i13, Composer composer, int i14) {
        stressMonitorFragment.m26413O(c26769p, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    private final C14543a m26424Z() {
        return (C14543a) this.analyticsManager.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    private final C29306e m26425a0() {
        return (C29306e) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public final C37378a m26426b0() {
        return (C37378a) this.scopeCoordinator.getValue();
    }

    /* JADX INFO: renamed from: c0 */
    private final C34660d m26427c0() {
        return (C34660d) this.sharedPref.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public final C31489a m26428d0() {
        return (C31489a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C34911a m26429e0(StressMonitorFragment stressMonitorFragment) {
        return AbstractC15751g.m44431K(stressMonitorFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m26430f0(StressMonitorFragment stressMonitorFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            stressMonitorFragment.m26413O(m26431g0(AbstractC28683x.m87260n(stressMonitorFragment.m26428d0().getViewState(), new C26769p(true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194302, null), null, c28655q, 0, 2)), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g0 */
    private static final C26769p m26431g0(InterfaceC28670t2 interfaceC28670t2) {
        return (C26769p) interfaceC28670t2.getValue();
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        String strM88962c = m26425a0().m88962c();
        if (strM88962c != null) {
            m26428d0().m96996u(new AbstractC21741a.g(strM88962c));
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 16), true, 2095911434));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        String strM88960a = this.selectedDate;
        if (strM88960a == null) {
            strM88960a = m26425a0().m88960a();
        }
        if (strM88960a != null) {
            C31489a c31489aM26428d0 = m26428d0();
            String strM88961b = m26425a0().m88961b();
            AbstractC22676k.m65749i(strM88961b, "getSource(...)");
            c31489aM26428d0.m96996u(new AbstractC21741a.e(strM88961b, strM88960a));
            return;
        }
        C31489a c31489aM26428d1 = m26428d0();
        String strM88961b2 = m26425a0().m88961b();
        AbstractC22676k.m65749i(strM88961b2, "getSource(...)");
        c31489aM26428d1.m96996u(new AbstractC21741a.c(strM88961b2));
    }
}
