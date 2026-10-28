package com.whoop.deepdive.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import by0.C3691a;
import by0.C3693c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.squareup.wire.AbstractC5583n;
import com.whoop.deepdive.view.DeepDiveFragment;
import cy0.InterfaceC11182a;
import ey0.AbstractC13742i;
import ey0.C13743j;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lcom/whoop/deepdive/view/DeepDiveFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lby0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lby0/c;", "navRouter", "Lby0/a;", "x", "A", "()Lby0/a;", "actionRouter", "Ltr2/n;", "y", "Ltr2/n;", "logger", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DeepDiveFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.deepdive.view.DeepDiveFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6707a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25629w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25630x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25631y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6707a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25629w = componentCallbacks;
            this.f25630x = interfaceC35951a;
            this.f25631y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [by0.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3693c invoke() {
            ComponentCallbacks componentCallbacks = this.f25629w;
            InterfaceC35951a interfaceC35951a = this.f25630x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25631y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3693c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.deepdive.view.DeepDiveFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6708b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25632w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25633x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25634y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6708b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25632w = componentCallbacks;
            this.f25633x = interfaceC35951a;
            this.f25634y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [by0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3691a invoke() {
            ComponentCallbacks componentCallbacks = this.f25632w;
            InterfaceC35951a interfaceC35951a = this.f25633x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25634y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3691a.class), interfaceC35951a);
        }
    }

    public DeepDiveFragment() {
        C13743j c13743j = new C13743j(this, 1);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C6707a(this, null, c13743j));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C6708b(this, null, null));
        this.logger = InterfaceC34116n.INSTANCE.m107848a("DeepDiveFragment");
    }

    /* JADX INFO: renamed from: A */
    private final C3691a m20102A() {
        return (C3691a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C3693c m20103B() {
        return (C3693c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m20104C(DeepDiveFragment deepDiveFragment) {
        return AbstractC15751g.m44431K(deepDiveFragment.requireActivity(), AbstractC5583n.m16799z(deepDiveFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m20105D(DeepDiveFragment deepDiveFragment, Composer composer, int i13) {
        String strM85315e;
        String string;
        String string2;
        String string3;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Bundle arguments = deepDiveFragment.getArguments();
            if (arguments == null || (string3 = arguments.getString("pillar")) == null || (strM85315e = AbstractC28188o1.m85315e(string3)) == null) {
                strM85315e = "";
            }
            String str = strM85315e;
            Bundle arguments2 = deepDiveFragment.getArguments();
            String str2 = null;
            String strM85315e2 = (arguments2 == null || (string2 = arguments2.getString(HttpHeaders.DATE)) == null) ? null : AbstractC28188o1.m85315e(string2);
            Bundle arguments3 = deepDiveFragment.getArguments();
            String strM85315e3 = (arguments3 == null || (string = arguments3.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
            if (strM85315e3 != null && !AbstractC39414r.m125890i0(strM85315e3)) {
                str2 = strM85315e3;
            }
            if (str2 == null) {
                str2 = "push_notification";
            }
            AbstractC13742i.m39082x(str, strM85315e2, deepDiveFragment.m20103B(), deepDiveFragment.m20102A(), new InterfaceC11182a.i(str, str2), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85250f(this, this.logger);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new InterfaceC4351m() { // from class: ey0.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return DeepDiveFragment.m20105D(this.f48998w, (Composer) obj, iIntValue);
            }
        }, true, 1759808100));
    }
}
