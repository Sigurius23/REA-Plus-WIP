package com.whoop.sage.view;

import a72.AbstractC0524a;
import a72.C0525b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.mapbox.common.HttpHeaders;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.sage.view.SageFragment;
import f72.AbstractC14227b;
import f72.C14229d;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m72.AbstractC25206e;
import m72.C25207f;
import mw1.C25985a;
import no0.C26944e0;
import o72.AbstractC27645f;
import or2.AbstractC28163g0;
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
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0006R\u001d\u0010#\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u0006R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010,R\u001b\u00101\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b/\u00100¨\u00062"}, m65681d2 = {"Lcom/whoop/sage/view/SageFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "I", "()Ljava/lang/String;", "K", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lzr2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "H", "()Lzr2/a;", "dateAndTimeProvider", "x", "G", HttpHeaders.DATE, "y", "J", "source", "Lm72/f;", "z", "L", "()Lm72/f;", "viewModel", "Lj02/o0;", "E", "getNavigator", "()Lj02/o0;", "navigator", "La72/b;", "F", "()La72/b;", "analyticsHelper", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SageFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h date;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: com.whoop.sage.view.SageFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9955a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29410w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29411x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29412y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9955a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29410w = componentCallbacks;
            this.f29411x = interfaceC35951a;
            this.f29412y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f29410w;
            InterfaceC35951a interfaceC35951a = this.f29411x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29412y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sage.view.SageFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9956b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29413w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29414x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29415y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9956b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29413w = componentCallbacks;
            this.f29414x = interfaceC35951a;
            this.f29415y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f29413w;
            InterfaceC35951a interfaceC35951a = this.f29414x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29415y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sage.view.SageFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9957c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29416w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29417x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29418y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9957c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29416w = componentCallbacks;
            this.f29417x = interfaceC35951a;
            this.f29418y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [a72.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C0525b invoke() {
            ComponentCallbacks componentCallbacks = this.f29416w;
            InterfaceC35951a interfaceC35951a = this.f29417x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29418y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0525b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sage.view.SageFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9958d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29419w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9958d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f29419w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f29419w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sage.view.SageFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9959e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29420w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29421x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29422y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f29423z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9959e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f29420w = componentCallbacks;
            this.f29421x = interfaceC35951a;
            this.f29422y = interfaceC4339a;
            this.f29423z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, m72.f] */
        @Override // c93.InterfaceC4339a
        public final C25207f invoke() {
            return AbstractC34132o.m107857B(this.f29420w, this.f29421x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25207f.class), this.f29422y, this.f29423z);
        }
    }

    public SageFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i, new C9955a(this, null, null));
        final int i13 = 0;
        this.date = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: o72.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SageFragment f111231x;

            {
                this.f111231x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return SageFragment.m24435E(this.f111231x);
                    case 1:
                        return SageFragment.m24447Q(this.f111231x);
                    default:
                        return SageFragment.m24443M(this.f111231x);
                }
            }
        });
        final int i14 = 1;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: o72.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SageFragment f111231x;

            {
                this.f111231x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return SageFragment.m24435E(this.f111231x);
                    case 1:
                        return SageFragment.m24447Q(this.f111231x);
                    default:
                        return SageFragment.m24443M(this.f111231x);
                }
            }
        });
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9959e(this, null, new C9958d(this), null));
        final int i15 = 2;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C9956b(this, null, new InterfaceC4339a(this) { // from class: o72.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SageFragment f111231x;

            {
                this.f111231x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return SageFragment.m24435E(this.f111231x);
                    case 1:
                        return SageFragment.m24447Q(this.f111231x);
                    default:
                        return SageFragment.m24443M(this.f111231x);
                }
            }
        }));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C9957c(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final String m24435E(SageFragment sageFragment) {
        return sageFragment.m24439I();
    }

    /* JADX INFO: renamed from: F */
    private final C0525b m24436F() {
        return (C0525b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final String m24437G() {
        return (String) this.date.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final InterfaceC41070a m24438H() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final String m24439I() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(HttpHeaders.DATE) : null;
        if (string != null && string.length() != 0) {
            return string;
        }
        String string2 = m24438H().mo133365d().toString("yyyy-MM-dd");
        AbstractC22676k.m65749i(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: renamed from: J */
    private final String m24440J() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final String m24441K() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("source") : null;
        if (string == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: L */
    private final C25207f m24442L() {
        return (C25207f) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m24443M(SageFragment sageFragment) {
        return AbstractC15751g.m44431K(sageFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m24444N(SageFragment sageFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C14229d c14229d = new C14229d(AbstractC5583n.m16799z(sageFragment), sageFragment.getNavigator(), null, 4, null);
                c28655q.m87172p0(c14229d);
                objM87133R = c14229d;
            }
            C14229d c14229d2 = (C14229d) objM87133R;
            C25207f c25207fM24442L = sageFragment.m24442L();
            String strM24440J = sageFragment.m24440J();
            boolean zM87157i = c28655q.m87157i(c14229d2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C26944e0(c14229d2, 13);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(sageFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C26944e0(sageFragment, 14);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27645f.m83484p(c25207fM24442L, function1, (Function1) objM87133R3, strM24440J, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m24445O(C14229d c14229d, AbstractC14227b navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c14229d.m40698b(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m24446P(SageFragment sageFragment, AbstractC0524a it) {
        AbstractC22676k.m65750j(it, "it");
        sageFragment.m24436F().m1289B(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final String m24447Q(SageFragment sageFragment) {
        return sageFragment.m24441K();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m24442L().m73818o(new AbstractC25206e.c(m24437G()));
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 27), true, 315431768));
    }
}
