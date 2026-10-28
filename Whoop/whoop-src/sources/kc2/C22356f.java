package kc2;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.whoop.navigation.C9598e;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mc2.AbstractC25426e;
import mc2.AbstractC25433l;
import mc2.C25427f;
import mc2.C25434m;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
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
import uf3.C34911a;
import vf3.InterfaceC35951a;
import za2.AbstractC40237m;
import za2.C40238n;

/* JADX INFO: renamed from: kc2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001b\u0010\u0014\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lkc2/f;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ll83/a0;", "onResume", "Lmc2/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "C", "()Lmc2/f;", "viewModel", "Lza2/n;", "x", "B", "()Lza2/n;", "navigator", "Lmc2/m;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22356f extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(this, null, new b(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new a(this, null, new C19683b(this, 15)));

    /* JADX INFO: renamed from: kc2.f$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f87220w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f87221x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f87222y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f87220w = componentCallbacks;
            this.f87221x = interfaceC35951a;
            this.f87222y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, za2.n] */
        @Override // c93.InterfaceC4339a
        public final C40238n invoke() {
            ComponentCallbacks componentCallbacks = this.f87220w;
            InterfaceC35951a interfaceC35951a = this.f87221x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f87222y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40238n.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: kc2.f$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f87223w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f87223w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f87223w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: kc2.f$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f87224w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f87225x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f87226y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f87227z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f87224w = componentCallbacks;
            this.f87225x = interfaceC35951a;
            this.f87226y = interfaceC4339a;
            this.f87227z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mc2.f] */
        @Override // c93.InterfaceC4339a
        public final C25427f invoke() {
            return AbstractC34132o.m107857B(this.f87224w, this.f87225x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25427f.class), this.f87226y, this.f87227z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C34911a m64254D(C22356f c22356f) {
        return AbstractC15751g.m44431K(c22356f.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m64255E(C22356f c22356f, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C25434m c25434mM64256F = m64256F(AbstractC28683x.m87260n(c22356f.m64261C().getViewState(), new C25434m(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), null, c28655q, 0, 2));
            boolean zM87157i = c28655q.m87157i(c22356f);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C19962a(c22356f, 13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25433l.m74661m(c25434mM64256F, (Function1) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final C25434m m64256F(InterfaceC28670t2 interfaceC28670t2) {
        return (C25434m) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m64257G(C22356f c22356f, C9598e action) {
        AbstractC22676k.m65750j(action, "action");
        c22356f.m64260B().m129228a(new AbstractC40237m.a(action));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public final C40238n m64260B() {
        return (C40238n) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final C25427f m64261C() {
        return (C25427f) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        m64261C().m74642p(AbstractC25426e.a.f99569a);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 28), true, 1800085897));
    }
}
