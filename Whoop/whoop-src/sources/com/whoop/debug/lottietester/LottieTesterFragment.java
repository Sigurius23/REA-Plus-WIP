package com.whoop.debug.lottietester;

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
import com.squareup.wire.AbstractC5583n;
import ec3.InterfaceC13037f2;
import gv1.AbstractC16241o;
import gv1.InterfaceC16239m;
import i51.AbstractC18111h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21467g;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p558vp.AbstractC36259c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import sc0.C32355c;
import tx0.AbstractC34241d;
import tx0.C34238a;
import tx0.C34243f;
import tx0.C34244g;
import tx0.InterfaceC34242e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/debug/lottietester/LottieTesterFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ltx0/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "A", "()Ltx0/f;", "viewModel", "Ltx0/g;", "viewState", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LottieTesterFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6704d(this, null, new C6703c(this), null));

    /* JADX INFO: renamed from: com.whoop.debug.lottietester.LottieTesterFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6701a extends C22672i implements Function1 {
        public C6701a(Object obj) {
            super(1, 0, C34243f.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/debug/lottietester/LottieTesterViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m20085a(InterfaceC34242e p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C34243f) this.receiver).m108280j(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20085a((InterfaceC34242e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.lottietester.LottieTesterFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6702b extends C22672i implements Function1 {
        public C6702b(Object obj) {
            super(1, 0, C34243f.class, obj, "sendOverrideViewEvent", "sendOverrideViewEvent(Lcom/whoop/lottietester/LottieTesterOverrideViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m20086a(InterfaceC16239m p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C34243f) this.receiver).m108279g(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20086a((InterfaceC16239m) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.lottietester.LottieTesterFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6703c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25615w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6703c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25615w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25615w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.lottietester.LottieTesterFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6704d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25616w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25617x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25618y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25619z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6704d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25616w = componentCallbacks;
            this.f25617x = interfaceC35951a;
            this.f25618y = interfaceC4339a;
            this.f25619z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, tx0.f] */
        @Override // c93.InterfaceC4339a
        public final C34243f invoke() {
            return AbstractC34132o.m107857B(this.f25616w, this.f25617x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34243f.class), this.f25618y, this.f25619z);
        }
    }

    /* JADX INFO: renamed from: A */
    private final C34243f m20079A() {
        return (C34243f) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m20080B(LottieTesterFragment lottieTesterFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC13037f2 viewState = lottieTesterFragment.m20079A().getViewState();
            C34244g c34244g = new C34244g(false, false, null, null, 15, null);
            int i14 = AbstractC16241o.f61698a | AbstractC18111h.f70326a;
            C34244g c34244gM20081C = m20081C(AbstractC36259c.m115714z(viewState, c34244g, c28655q, i14 << 3));
            C34243f c34243fM20079A = lottieTesterFragment.m20079A();
            boolean zM87157i = c28655q.m87157i(c34243fM20079A);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C6701a(c34243fM20079A);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) ((InterfaceC21467g) objM87133R);
            C34243f c34243fM20079A2 = lottieTesterFragment.m20079A();
            boolean zM87157i2 = c28655q.m87157i(c34243fM20079A2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C6702b(c34243fM20079A2);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) ((InterfaceC21467g) objM87133R2);
            boolean zM87157i3 = c28655q.m87157i(lottieTesterFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C32355c(lottieTesterFragment, 9);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC34241d.m108266o(c34244gM20081C, function1, function2, (InterfaceC4339a) objM87133R3, c28655q, i14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final C34244g m20081C(InterfaceC28670t2 interfaceC28670t2) {
        return (C34244g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m20082D(LottieTesterFragment lottieTesterFragment) {
        AbstractC5583n.m16799z(lottieTesterFragment).m36410z();
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 0), true, -944518502));
    }
}
