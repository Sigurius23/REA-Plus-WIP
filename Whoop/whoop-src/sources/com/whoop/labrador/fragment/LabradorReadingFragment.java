package com.whoop.labrador.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import ci0.C4726a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.labrador.fragment.LabradorReadingFragment;
import cu1.C11118c;
import du1.AbstractC12376b;
import du1.C12375a;
import ge3.AbstractC15751g;
import ht1.EnumC17628e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p114eb.AbstractC12939a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
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
import rt1.C31809g;
import rt1.InterfaceC31804b;
import ss1.C32948a;
import st1.AbstractC32991l;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lcom/whoop/labrador/fragment/LabradorReadingFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/content/Context;", "context", "Ll83/a0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "D", "()Ljava/lang/String;", "selectedWrist", "Lrt1/g;", "x", "E", "()Lrt1/g;", "viewModel", "Lss1/a;", "y", "C", "()Lss1/a;", "analytics", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LabradorReadingFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h selectedWrist;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: com.whoop.labrador.fragment.LabradorReadingFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9027a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27022w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27023x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27024y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9027a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27022w = componentCallbacks;
            this.f27023x = interfaceC35951a;
            this.f27024y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ss1.a] */
        @Override // c93.InterfaceC4339a
        public final C32948a invoke() {
            ComponentCallbacks componentCallbacks = this.f27022w;
            InterfaceC35951a interfaceC35951a = this.f27023x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27024y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32948a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.fragment.LabradorReadingFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9028b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27025w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9028b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27025w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27025w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.labrador.fragment.LabradorReadingFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9029c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27026w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27027x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27028y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27029z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9029c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27026w = componentCallbacks;
            this.f27027x = interfaceC35951a;
            this.f27028y = interfaceC4339a;
            this.f27029z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rt1.g] */
        @Override // c93.InterfaceC4339a
        public final C31809g invoke() {
            return AbstractC34132o.m107857B(this.f27026w, this.f27027x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31809g.class), this.f27028y, this.f27029z);
        }
    }

    public LabradorReadingFragment() {
        final int i13 = 0;
        this.selectedWrist = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: cu1.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LabradorReadingFragment f35340x;

            {
                this.f35340x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return LabradorReadingFragment.m22505H(this.f35340x);
                    default:
                        return LabradorReadingFragment.m22506I(this.f35340x);
                }
            }
        });
        final int i14 = 1;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: cu1.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LabradorReadingFragment f35340x;

            {
                this.f35340x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return LabradorReadingFragment.m22505H(this.f35340x);
                    default:
                        return LabradorReadingFragment.m22506I(this.f35340x);
                }
            }
        };
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9029c(this, null, new C9028b(this), interfaceC4339a));
        this.analytics = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9027a(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final C32948a m22500C() {
        return (C32948a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final String m22501D() {
        return (String) this.selectedWrist.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C31809g m22502E() {
        return (C31809g) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m22503F(LabradorReadingFragment labradorReadingFragment, Composer composer, int i13) {
        EnumC17628e enumC17628e;
        int i14 = 0;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC5583n.m16799z(labradorReadingFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C12375a(abstractC12939a0, labradorReadingFragment.m22500C());
                c28655q.m87172p0(objM87133R2);
            }
            C12375a c12375a = (C12375a) objM87133R2;
            C31809g c31809gM22502E = labradorReadingFragment.m22502E();
            boolean zM87157i = c28655q.m87157i(c12375a);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C11118c(c12375a, 1);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            String strM22501D = labradorReadingFragment.m22501D();
            if (strM22501D == null) {
                strM22501D = "RIGHT";
            }
            EnumC17628e enumC17628e2 = EnumC17628e.RIGHT;
            EnumC17628e[] enumC17628eArrValues = EnumC17628e.values();
            int length = enumC17628eArrValues.length;
            while (true) {
                if (i14 >= length) {
                    enumC17628e = null;
                    break;
                }
                enumC17628e = enumC17628eArrValues[i14];
                if (AbstractC22676k.m65745e(enumC17628e.name(), strM22501D)) {
                    break;
                }
                i14++;
            }
            AbstractC32991l.m104150B(c31809gM22502E, function1, enumC17628e == null ? enumC17628e2 : enumC17628e, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m22504G(C12375a c12375a, InterfaceC31804b.e navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent.equals(InterfaceC31804b.b.f131722a)) {
            c12375a.m34723a(AbstractC12376b.e.f41838a);
        } else if (navEvent.equals(InterfaceC31804b.g.f131726a)) {
            c12375a.m34723a(new AbstractC12376b.d(null, false, true, 3, null));
        } else if (navEvent.equals(InterfaceC31804b.f.f131725a)) {
            c12375a.m34723a(AbstractC12376b.c.f41834a);
        } else {
            if (!navEvent.equals(InterfaceC31804b.h.f131727a)) {
                throw new NoWhenBranchMatchedException();
            }
            c12375a.m34723a(AbstractC12376b.b.f41833a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final String m22505H(LabradorReadingFragment labradorReadingFragment) {
        Bundle arguments = labradorReadingFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("selectedWrist");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34911a m22506I(LabradorReadingFragment labradorReadingFragment) {
        return AbstractC15751g.m44431K(labradorReadingFragment.m22501D());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onAttach(Context context) {
        AbstractC22676k.m65750j(context, "context");
        super.onAttach(context);
        AbstractC28163g0.m85250f(this, InterfaceC34116n.INSTANCE.m107848a("LabradorReadingFragment"));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 11), true, -256880010));
    }
}
