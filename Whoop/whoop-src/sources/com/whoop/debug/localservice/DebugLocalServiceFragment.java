package com.whoop.debug.localservice;

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
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21467g;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import r12.C30856a;
import sc0.C32355c;
import sx0.AbstractC33059a;
import sx0.AbstractC33060b;
import sx0.C33061c;
import sx0.C33064f;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/debug/localservice/DebugLocalServiceFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lsx0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "A", "()Lsx0/c;", "viewModel", "Lsx0/f;", "viewState", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DebugLocalServiceFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6700c(this, null, new C6699b(this), null));

    /* JADX INFO: renamed from: com.whoop.debug.localservice.DebugLocalServiceFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6698a extends C22672i implements Function1 {
        public C6698a(Object obj) {
            super(1, 0, C33061c.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/debug/localservice/DebugLocalServiceViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m20078a(AbstractC33060b p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C33061c) this.receiver).m104703n(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20078a((AbstractC33060b) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.localservice.DebugLocalServiceFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6699b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25609w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6699b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25609w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25609w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.localservice.DebugLocalServiceFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6700c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25610w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25611x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25612y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25613z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6700c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25610w = componentCallbacks;
            this.f25611x = interfaceC35951a;
            this.f25612y = interfaceC4339a;
            this.f25613z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, sx0.c] */
        @Override // c93.InterfaceC4339a
        public final C33061c invoke() {
            return AbstractC34132o.m107857B(this.f25610w, this.f25611x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33061c.class), this.f25612y, this.f25613z);
        }
    }

    /* JADX INFO: renamed from: A */
    private final C33061c m20072A() {
        return (C33061c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m20073B(DebugLocalServiceFragment debugLocalServiceFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C33064f c33064fM20074C = m20074C(AbstractC28683x.m87261o(debugLocalServiceFragment.m20072A().getViewState(), c28655q, 0));
            C33061c c33061cM20072A = debugLocalServiceFragment.m20072A();
            boolean zM87157i = c28655q.m87157i(c33061cM20072A);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C6698a(c33061cM20072A);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) ((InterfaceC21467g) objM87133R);
            boolean zM87157i2 = c28655q.m87157i(debugLocalServiceFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C32355c(debugLocalServiceFragment, 3);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC33059a.m104681i(c33064fM20074C, function1, (InterfaceC4339a) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final C33064f m20074C(InterfaceC28670t2 interfaceC28670t2) {
        return (C33064f) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m20075D(DebugLocalServiceFragment debugLocalServiceFragment) {
        AbstractC5583n.m16799z(debugLocalServiceFragment).m36410z();
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 25), true, -1962195654));
    }
}
