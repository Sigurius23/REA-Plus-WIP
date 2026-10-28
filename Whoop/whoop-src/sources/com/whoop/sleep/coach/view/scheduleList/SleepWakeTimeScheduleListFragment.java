package com.whoop.sleep.coach.view.scheduleList;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleListFragment;
import hj0.AbstractC17354m;
import if2.AbstractC18454a;
import if2.C18455b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kf2.AbstractC22445d;
import kf2.C22443b;
import kf2.C22444c;
import kk1.C22541b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lf2.AbstractC24018k;
import lf2.C24016i;
import mf2.AbstractC25515f;
import mf2.C25517h;
import nf2.AbstractC26668a;
import or2.C28216y;
import p000.AbstractC11266d;
import p114eb.C12962i;
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
import pf.AbstractC29125c;
import pf2.AbstractC29153c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import we2.AbstractC37232a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0014X\u0094D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006=²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u00020;8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "J", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "", "x", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Llf2/i;", "y", "Ll83/h;", "M", "()Llf2/i;", "viewModel", "Lmf2/h;", "z", "Leb/i;", "K", "()Lmf2/h;", "args", "Lkf2/c;", "E", "L", "()Lkf2/c;", "sleepScheduleListViewModel", "Lor2/y;", "F", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lif2/b;", "G", "Lif2/b;", "router", "Llf2/k;", "viewState", "Lkf2/d;", "sleepScheduleListViewState", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SleepWakeTimeScheduleListFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h sleepScheduleListViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C18455b router;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SleepWakeTimeScheduleListFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C12962i args;

    /* JADX INFO: renamed from: com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleListFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10210a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30871w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30872x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30873y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10210a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30871w = componentCallbacks;
            this.f30872x = interfaceC35951a;
            this.f30873y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f30871w;
            InterfaceC35951a interfaceC35951a = this.f30872x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30873y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleListFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10211b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f30874w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10211b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f30874w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f30874w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f30874w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleListFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10212c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30875w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10212c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30875w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30875w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleListFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10213d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30876w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30877x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30878y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30879z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10213d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30876w = componentCallbacks;
            this.f30877x = interfaceC35951a;
            this.f30878y = interfaceC4339a;
            this.f30879z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, lf2.i] */
        @Override // c93.InterfaceC4339a
        public final C24016i invoke() {
            return AbstractC34132o.m107857B(this.f30876w, this.f30877x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24016i.class), this.f30878y, this.f30879z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleListFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10214e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30880w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10214e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30880w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30880w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sleep.coach.view.scheduleList.SleepWakeTimeScheduleListFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10215f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30881w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30882x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30883y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30884z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10215f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30881w = componentCallbacks;
            this.f30882x = interfaceC35951a;
            this.f30883y = interfaceC4339a;
            this.f30884z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, kf2.c] */
        @Override // c93.InterfaceC4339a
        public final C22444c invoke() {
            return AbstractC34132o.m107857B(this.f30881w, this.f30882x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22444c.class), this.f30883y, this.f30884z);
        }
    }

    public SleepWakeTimeScheduleListFragment() {
        C10212c c10212c = new C10212c(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C10213d(this, null, c10212c, null));
        this.args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25517h.class), new C10211b(this));
        this.sleepScheduleListViewModel = AbstractC30060g.m92087G(enumC23463i, new C10215f(this, null, new C10214e(this), null));
        this.externalLinkNavigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10210a(this, null, null));
        this.router = new C18455b(this, getExternalLinkNavigator());
    }

    /* JADX INFO: renamed from: J */
    private final void m25949J() {
        m25952M().m70848F(AbstractC29153c.g.f118007a);
    }

    /* JADX INFO: renamed from: K */
    private final C25517h m25950K() {
        return (C25517h) this.args.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final C22444c m25951L() {
        return (C22444c) this.sleepScheduleListViewModel.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final C24016i m25952M() {
        return (C24016i) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m25953N(final SleepWakeTimeScheduleListFragment sleepWakeTimeScheduleListFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(sleepWakeTimeScheduleListFragment.m25952M().getViewState(), AbstractC24018k.a.f94861a, null, c28655q, 48, 2);
            AbstractC22445d abstractC22445dM25955P = m25955P(AbstractC28683x.m87260n(sleepWakeTimeScheduleListFragment.m25951L().getViewState(), new AbstractC22445d.e(new C22443b(false, null, false, false, null, null, null, false, null, false, false, null, 4095, null)), null, c28655q, 0, 2));
            AbstractC24018k abstractC24018kM25954O = m25954O(interfaceC28601c1M87260n);
            boolean zM75074a = sleepWakeTimeScheduleListFragment.m25950K().m75074a();
            boolean zM87157i = c28655q.m87157i(sleepWakeTimeScheduleListFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(sleepWakeTimeScheduleListFragment) { // from class: mf2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SleepWakeTimeScheduleListFragment f99921x;

                    {
                        this.f99921x = sleepWakeTimeScheduleListFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return SleepWakeTimeScheduleListFragment.m25956Q(this.f99921x, (AbstractC26668a) obj);
                            case 1:
                                return SleepWakeTimeScheduleListFragment.m25957R(this.f99921x, (AbstractC29153c) obj);
                            case 2:
                                return SleepWakeTimeScheduleListFragment.m25958S(this.f99921x, (AbstractC18454a) obj);
                            default:
                                return SleepWakeTimeScheduleListFragment.m25959T(this.f99921x, (AbstractC37232a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(sleepWakeTimeScheduleListFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 1;
                objM87133R2 = new Function1(sleepWakeTimeScheduleListFragment) { // from class: mf2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SleepWakeTimeScheduleListFragment f99921x;

                    {
                        this.f99921x = sleepWakeTimeScheduleListFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return SleepWakeTimeScheduleListFragment.m25956Q(this.f99921x, (AbstractC26668a) obj);
                            case 1:
                                return SleepWakeTimeScheduleListFragment.m25957R(this.f99921x, (AbstractC29153c) obj);
                            case 2:
                                return SleepWakeTimeScheduleListFragment.m25958S(this.f99921x, (AbstractC18454a) obj);
                            default:
                                return SleepWakeTimeScheduleListFragment.m25959T(this.f99921x, (AbstractC37232a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(sleepWakeTimeScheduleListFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i16 = 2;
                objM87133R3 = new Function1(sleepWakeTimeScheduleListFragment) { // from class: mf2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SleepWakeTimeScheduleListFragment f99921x;

                    {
                        this.f99921x = sleepWakeTimeScheduleListFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return SleepWakeTimeScheduleListFragment.m25956Q(this.f99921x, (AbstractC26668a) obj);
                            case 1:
                                return SleepWakeTimeScheduleListFragment.m25957R(this.f99921x, (AbstractC29153c) obj);
                            case 2:
                                return SleepWakeTimeScheduleListFragment.m25958S(this.f99921x, (AbstractC18454a) obj);
                            default:
                                return SleepWakeTimeScheduleListFragment.m25959T(this.f99921x, (AbstractC37232a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function3 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(sleepWakeTimeScheduleListFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i17 = 3;
                objM87133R4 = new Function1(sleepWakeTimeScheduleListFragment) { // from class: mf2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SleepWakeTimeScheduleListFragment f99921x;

                    {
                        this.f99921x = sleepWakeTimeScheduleListFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                return SleepWakeTimeScheduleListFragment.m25956Q(this.f99921x, (AbstractC26668a) obj);
                            case 1:
                                return SleepWakeTimeScheduleListFragment.m25957R(this.f99921x, (AbstractC29153c) obj);
                            case 2:
                                return SleepWakeTimeScheduleListFragment.m25958S(this.f99921x, (AbstractC18454a) obj);
                            default:
                                return SleepWakeTimeScheduleListFragment.m25959T(this.f99921x, (AbstractC37232a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC25515f.m75016D(abstractC22445dM25955P, abstractC24018kM25954O, zM75074a, null, function1, function2, function3, (Function1) objM87133R4, c28655q, 0, 8);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final AbstractC24018k m25954O(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC24018k) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: P */
    private static final AbstractC22445d m25955P(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC22445d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m25956Q(SleepWakeTimeScheduleListFragment sleepWakeTimeScheduleListFragment, AbstractC26668a it) {
        AbstractC22676k.m65750j(it, "it");
        sleepWakeTimeScheduleListFragment.m25951L().m64780D(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m25957R(SleepWakeTimeScheduleListFragment sleepWakeTimeScheduleListFragment, AbstractC29153c it) {
        AbstractC22676k.m65750j(it, "it");
        sleepWakeTimeScheduleListFragment.m25952M().m70848F(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m25958S(SleepWakeTimeScheduleListFragment sleepWakeTimeScheduleListFragment, AbstractC18454a it) {
        AbstractC22676k.m65750j(it, "it");
        sleepWakeTimeScheduleListFragment.router.m53199g(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m25959T(SleepWakeTimeScheduleListFragment sleepWakeTimeScheduleListFragment, AbstractC37232a it) {
        AbstractC22676k.m65750j(it, "it");
        sleepWakeTimeScheduleListFragment.m25951L().m64779C(it);
        return C23454a0.f92919a;
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C22541b(this, 28), true, -1377588898));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        m25951L().m64779C(AbstractC37232a.e.f159225a);
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m25950K().m75074a()) {
            m25949J();
        }
    }
}
