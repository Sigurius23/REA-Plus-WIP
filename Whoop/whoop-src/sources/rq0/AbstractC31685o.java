package rq0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1633v0;
import c93.InterfaceC4339a;
import com.whoop.community.presentation.teams.TeamCreateActivity;
import ge3.AbstractC15751g;
import hj0.AbstractC17348g;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pf.C29124b;
import q80.C30036h;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rq0.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010+\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&¨\u0006,"}, m65681d2 = {"Lrq0/o;", "Lhj0/g;", "<init>", "()V", "Lrq0/z;", "state", "Ll83/a0;", "N", "(Lrq0/z;)V", "", "G", "()Ljava/lang/String;", "H", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "", "enabled", "P", "(Z)V", "O", "Q", "()Lrq0/z;", "Lrq0/y;", "F", "Ll83/h;", "L", "()Lrq0/y;", "viewModel", "", "K", "()I", "titleRes", "J", "nextButtonRes", "I", "layoutRes", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31685o extends AbstractC17348g {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: rq0.o$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f131201w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f131201w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f131201w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f131201w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: rq0.o$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f131202w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f131202w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f131202w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f131202w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: rq0.o$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f131203w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f131204x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f131205y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f131206z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f131203w = abstractComponentCallbacksC1320m0;
            this.f131204x = interfaceC35951a;
            this.f131205y = interfaceC4339a;
            this.f131206z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rq0.y] */
        @Override // c93.InterfaceC4339a
        public final C31705y invoke() {
            return AbstractC37056f.m118952D(this.f131203w, this.f131204x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31705y.class), this.f131205y, this.f131206z);
        }
    }

    public AbstractC31685o() {
        C30036h c30036h = new C30036h(this, 17);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(this, null, new b(this), c30036h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m98183M(AbstractC31685o abstractC31685o, C31707z c31707z) {
        AbstractC22676k.m65747g(c31707z);
        abstractC31685o.mo19488N(c31707z);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C34911a m98184R(AbstractC31685o abstractC31685o) {
        return AbstractC15751g.m44431K(abstractC31685o.requireContext());
    }

    /* JADX INFO: renamed from: G */
    public abstract String mo19483G();

    /* JADX INFO: renamed from: H */
    public abstract String mo19484H();

    /* JADX INFO: renamed from: I */
    public abstract int getLayoutRes();

    /* JADX INFO: renamed from: J */
    public abstract int getNextButtonRes();

    /* JADX INFO: renamed from: K */
    public abstract int getTitleRes();

    /* JADX INFO: renamed from: L */
    public final C31705y m98185L() {
        return (C31705y) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo19488N(C31707z state);

    /* JADX INFO: renamed from: O */
    public void mo19489O() {
    }

    /* JADX INFO: renamed from: P */
    public final void m98186P(boolean enabled) {
        AbstractActivityC1340r0 activity = getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamCreateActivity");
        ((TeamCreateActivity) activity).m19441N(enabled);
    }

    /* JADX INFO: renamed from: Q */
    public final C31707z m98187Q() {
        return (C31707z) m98185L().getViewStateLiveData().getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return inflater.inflate(getLayoutRes(), container, false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        m98185L().getViewStateLiveData().observe(getViewLifecycleOwner(), new a(new C29124b(this, 29)));
    }
}
