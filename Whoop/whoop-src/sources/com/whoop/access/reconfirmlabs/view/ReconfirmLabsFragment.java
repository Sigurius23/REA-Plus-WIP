package com.whoop.access.reconfirmlabs.view;

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
import com.whoop.access.reconfirmlabs.view.ReconfirmLabsFragment;
import e60.C12756a;
import ej1.C13242h;
import f60.C14137b;
import f60.InterfaceC14136a;
import ge3.AbstractC15751g;
import h60.AbstractC16979h;
import h60.C16973b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import java.util.List;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import os1.C28314b;
import p236j.C21062a;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "getSource", "()Ljava/lang/String;", "source", "x", "I", "nextScreen", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lf60/b;", "z", "J", "()Lf60/b;", "viewModel", "Los1/b;", "E", "Los1/b;", "filePicker", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ReconfirmLabsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C28314b filePicker;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h source = AbstractC30060g.m92088H(new C16973b(this, 0));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h nextScreen = AbstractC30060g.m92088H(new C16973b(this, 1));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C5727a(this, null, new C16973b(this, 2)));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5729c(this, null, new C5728b(this), null));

    /* JADX INFO: renamed from: com.whoop.access.reconfirmlabs.view.ReconfirmLabsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5727a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22647w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22648x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22649y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5727a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22647w = componentCallbacks;
            this.f22648x = interfaceC35951a;
            this.f22649y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22647w;
            InterfaceC35951a interfaceC35951a = this.f22648x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22649y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.access.reconfirmlabs.view.ReconfirmLabsFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5728b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22650w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5728b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22650w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22650w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.access.reconfirmlabs.view.ReconfirmLabsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5729c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22651w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22652x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22653y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22654z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5729c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22651w = componentCallbacks;
            this.f22652x = interfaceC35951a;
            this.f22653y = interfaceC4339a;
            this.f22654z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, f60.b] */
        @Override // c93.InterfaceC4339a
        public final C14137b invoke() {
            return AbstractC34132o.m107857B(this.f22651w, this.f22652x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14137b.class), this.f22653y, this.f22654z);
        }
    }

    public ReconfirmLabsFragment() {
        final int i13 = 0;
        Function1 function1 = new Function1(this) { // from class: h60.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ReconfirmLabsFragment f65139x;

            {
                this.f65139x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return ReconfirmLabsFragment.m16977G(this.f65139x, (C21062a) obj);
                    default:
                        return ReconfirmLabsFragment.m16978H(this.f65139x, (List) obj);
                }
            }
        };
        final int i14 = 1;
        this.filePicker = new C28314b(this, function1, new Function1(this) { // from class: h60.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ReconfirmLabsFragment f65139x;

            {
                this.f65139x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return ReconfirmLabsFragment.m16977G(this.f65139x, (C21062a) obj);
                    default:
                        return ReconfirmLabsFragment.m16978H(this.f65139x, (List) obj);
                }
            }
        }, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m16977G(ReconfirmLabsFragment reconfirmLabsFragment, C21062a result) {
        AbstractC22676k.m65750j(result, "result");
        reconfirmLabsFragment.m16980J().m40243n(new InterfaceC14136a.b(result));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m16978H(ReconfirmLabsFragment reconfirmLabsFragment, List uris) {
        AbstractC22676k.m65750j(uris, "uris");
        reconfirmLabsFragment.m16980J().m40243n(new InterfaceC14136a.d(uris));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private final String m16979I() {
        return (String) this.nextScreen.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final C14137b m16980J() {
        return (C14137b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C34911a m16981K(ReconfirmLabsFragment reconfirmLabsFragment) {
        return AbstractC15751g.m44431K(reconfirmLabsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final String m16982L(ReconfirmLabsFragment reconfirmLabsFragment) {
        Bundle arguments = reconfirmLabsFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("nextScreen");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m16983M(ReconfirmLabsFragment reconfirmLabsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C12756a(AbstractC5583n.m16799z(reconfirmLabsFragment), reconfirmLabsFragment.getNavigator());
                c28655q.m87172p0(objM87133R);
            }
            C12756a c12756a = (C12756a) objM87133R;
            C14137b c14137bM16980J = reconfirmLabsFragment.m16980J();
            String strM16979I = reconfirmLabsFragment.m16979I();
            boolean zM87157i = c28655q.m87157i(reconfirmLabsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C16973b(reconfirmLabsFragment, 3);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(reconfirmLabsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C16973b(reconfirmLabsFragment, 4);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC16979h.m47791e(c12756a, c14137bM16980J, strM16979I, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m16984N(ReconfirmLabsFragment reconfirmLabsFragment) {
        reconfirmLabsFragment.filePicker.m85776e();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m16985O(ReconfirmLabsFragment reconfirmLabsFragment) {
        reconfirmLabsFragment.filePicker.m85777f();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final String m16986P(ReconfirmLabsFragment reconfirmLabsFragment) {
        return reconfirmLabsFragment.requireArguments().getString("source");
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C13242h(this, 27), true, 1239718829));
    }
}
