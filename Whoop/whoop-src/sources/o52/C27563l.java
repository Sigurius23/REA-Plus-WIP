package o52;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1633v0;
import bl2.C3374c;
import c93.InterfaceC4339a;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.realtime.presentation.RealTimeRecordActivity;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import jf3.C21647a;
import jo.ViewOnClickListenerC21821j;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import m52.AbstractC25085e;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import mh3.AbstractC25568e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import p92.C29019h;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import xg3.InterfaceC38293t;
import zg3.C40634a;

/* JADX INFO: renamed from: o52.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R+\u0010/\u001a\u00020'2\u0006\u0010(\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00062"}, m65681d2 = {"Lo52/l;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "P", "L", "K", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onDestroy", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lo52/n;", "x", "Ll83/h;", "J", "()Lo52/n;", "viewModel", "Lxg3/t;", "y", "Lxg3/t;", "subscription", "Lm52/e;", "<set-?>", "z", "Lcom/whoop/ui/b;", "I", "()Lm52/e;", "O", "(Lm52/e;)V", "binding", "E", "a", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27563l extends AbstractC17354m {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "RealTimeHeartRateFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(this, null, new c(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private InterfaceC38293t subscription = AbstractC25568e.f100262a;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: F */
    static final /* synthetic */ InterfaceC21493z[] f110958F = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C27563l.class, "binding", "getBinding()Lcom/whoop/realtime/databinding/FragmentRealTimeHeartrateBinding;", 0))};

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: G */
    public static final int f110959G = 8;

    /* JADX INFO: renamed from: o52.l$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lo52/l$a;", "", "<init>", "()V", "Lo52/l;", "a", "()Lo52/l;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C27563l m83182a() {
            return new C27563l();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: o52.l$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f110964w;

        public b(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f110964w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f110964w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f110964w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o52.l$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f110965w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f110965w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f110965w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f110965w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: o52.l$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f110966w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f110967x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f110968y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f110969z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f110966w = abstractComponentCallbacksC1320m0;
            this.f110967x = interfaceC35951a;
            this.f110968y = interfaceC4339a;
            this.f110969z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, o52.n] */
        @Override // c93.InterfaceC4339a
        public final C27567n invoke() {
            return AbstractC37056f.m118952D(this.f110966w, this.f110967x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27567n.class), this.f110968y, this.f110969z);
        }
    }

    /* JADX INFO: renamed from: I */
    private final AbstractC25085e m83172I() {
        return (AbstractC25085e) this.binding.getValue(this, f110958F[0]);
    }

    /* JADX INFO: renamed from: J */
    private final C27567n m83173J() {
        return (C27567n) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final void m83174K() {
        AbstractActivityC1340r0 activity = getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.realtime.presentation.RealTimeRecordActivity");
        ((RealTimeRecordActivity) activity).m23839N0();
    }

    /* JADX INFO: renamed from: L */
    private final void m83175L() {
        m83173J().getViewStateHeartRateLiveData().observe(getViewLifecycleOwner(), new b(new C27561k(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m83176M(C27563l c27563l, C27571p c27571p) {
        C29019h readyToLoadGraph = c27571p.getReadyToLoadGraph();
        if (readyToLoadGraph != null) {
            c27563l.m83172I().f98311f.m27466b(AbstractC25265s.m74092D0(readyToLoadGraph.m88231E()));
        } else {
            c27563l.getLog().mo85222m("RealTimeStrainController is null!", new AbstractC30556a.a[0]);
        }
        if (c27571p.getAverageHr() != 0) {
            c27563l.m83172I().f98309d.setValueText(String.valueOf(c27571p.getAverageHr()));
        }
        c27563l.m83172I().f98313h.setValueText(AbstractC10538f.m27183h(c27571p.getStrainStats()));
        c27563l.m83172I().f98310e.setValueText(String.valueOf(c27571p.getCalorieStats()));
        if (c27571p.getHeartRateZoneState() != null) {
            c27563l.m83172I().f98312g.m27438w(c27571p.getHeartRateZoneState().getHeartRateZoneText(), c27571p.getHeartRateZoneState().getHeartRateZoneColor());
        } else {
            c27563l.m83172I().f98312g.setZone(c27571p.getHeartRateZone());
        }
        c27563l.m83172I().f98311f.m27465a(c27571p.getHeartRate());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final void m83177N(C27563l c27563l, View view) {
        c27563l.m83174K();
    }

    /* JADX INFO: renamed from: O */
    private final void m83178O(AbstractC25085e abstractC25085e) {
        this.binding.setValue(this, f110958F[0], abstractC25085e);
    }

    /* JADX INFO: renamed from: P */
    private final void m83179P() {
        AbstractActivityC1340r0 activity = getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.realtime.presentation.RealTimeRecordActivity");
        InterfaceC38293t interfaceC38293tM122661K = ((RealTimeRecordActivity) activity).m23840Q0().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27561k(this, 1), 9));
        AbstractC22676k.m65749i(interfaceC38293tM122661K, "subscribe(...)");
        this.subscription = interfaceC38293tM122661K;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m83180Q(C27563l c27563l, C29019h c29019h) {
        C27567n c27567nM83173J = c27563l.m83173J();
        AbstractC22676k.m65747g(c29019h);
        c27567nM83173J.m83244H0(c29019h);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m83181R(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC25085e abstractC25085eM73582c = AbstractC25085e.m73582c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC25085eM73582c, "inflate(...)");
        m83178O(abstractC25085eM73582c);
        m83172I().getRoot().setTag(1);
        View root = m83172I().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroy() {
        super.onDestroy();
        if (this.subscription.mo14749a()) {
            return;
        }
        this.subscription.mo14750b();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getEventDispatcher().m129034f0("Activity Recording", AbstractC25247g0.m73989X(new C23465k("Label", "Heart Rate")));
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        m83175L();
        m83179P();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m83172I().f98312g.m27430i();
        m83172I().f98314i.setOnClickListener(new ViewOnClickListenerC21821j(this, 7));
    }
}
