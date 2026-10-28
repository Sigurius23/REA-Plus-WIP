package com.whoop.streaks.view;

import ad3.AbstractC0757c;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.streaks.view.StreaksFragment;
import ge3.AbstractC15751g;
import gv1.InterfaceC16239m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import oi2.AbstractC27950a;
import oi2.C27951b;
import or2.AbstractC28163g0;
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
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import si2.C32547a;
import si2.InterfaceC32548b;
import ti2.C33859f;
import ti2.C33860g;
import ti2.InterfaceC33858e;
import uf3.C34911a;
import uo1.C35141b;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vv1.C36532c;
import w20.C36727q;
import xi2.AbstractC38327e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$¨\u0006(²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/streaks/view/StreaksFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lti2/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "H", "()Lti2/f;", "viewModel", "Loi2/b;", "x", "F", "()Loi2/b;", "analyticsHelper", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lad3/c;", "z", "G", "()Lad3/c;", "interactionJson", "Lti2/g;", "viewState", "streaks_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StreaksFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10301f(this, null, new C10300e(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h interactionJson;

    /* JADX INFO: renamed from: com.whoop.streaks.view.StreaksFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.streaks.view.StreaksFragment$onCreateView$1$1$1", m100430f = "StreaksFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10296a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31256w;

        public C10296a(InterfaceC30057d<? super C10296a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreaksFragment.this.new C10296a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10296a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f31256w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            StreaksFragment.this.m26356H().m107067n(InterfaceC33858e.a.f141795a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.streaks.view.StreaksFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10297b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31258w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31259x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31260y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10297b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31258w = componentCallbacks;
            this.f31259x = interfaceC35951a;
            this.f31260y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oi2.b] */
        @Override // c93.InterfaceC4339a
        public final C27951b invoke() {
            ComponentCallbacks componentCallbacks = this.f31258w;
            InterfaceC35951a interfaceC35951a = this.f31259x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31260y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27951b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.streaks.view.StreaksFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10298c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31261w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31262x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31263y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10298c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31261w = componentCallbacks;
            this.f31262x = interfaceC35951a;
            this.f31263y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f31261w;
            InterfaceC35951a interfaceC35951a = this.f31262x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31263y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.streaks.view.StreaksFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10299d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31264w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31265x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31266y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10299d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31264w = componentCallbacks;
            this.f31265x = interfaceC35951a;
            this.f31266y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ad3.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final AbstractC0757c invoke() {
            ComponentCallbacks componentCallbacks = this.f31264w;
            InterfaceC35951a interfaceC35951a = this.f31265x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31266y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.streaks.view.StreaksFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10300e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31267w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10300e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31267w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31267w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.streaks.view.StreaksFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10301f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31268w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31269x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31270y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31271z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10301f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31268w = componentCallbacks;
            this.f31269x = interfaceC35951a;
            this.f31270y = interfaceC4339a;
            this.f31271z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ti2.f] */
        @Override // c93.InterfaceC4339a
        public final C33859f invoke() {
            return AbstractC34132o.m107857B(this.f31268w, this.f31269x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33859f.class), this.f31270y, this.f31271z);
        }
    }

    public StreaksFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10297b(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10298c(this, null, new C36532c(this, 13)));
        this.interactionJson = AbstractC30060g.m92087G(enumC23463i, new C10299d(this, new C35953c("STREAKS_INTERACTION_JSON"), null));
    }

    /* JADX INFO: renamed from: F */
    private final C27951b m26354F() {
        return (C27951b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final AbstractC0757c m26355G() {
        return (AbstractC0757c) this.interactionJson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final C33859f m26356H() {
        return (C33859f) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34911a m26357I(StreaksFragment streaksFragment) {
        return AbstractC15751g.m44431K(streaksFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m26358J(final StreaksFragment streaksFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(streaksFragment.m26356H().getViewState(), new C33860g(true, false, null, null, null, 30, null), null, c28655q, 0, 2);
        C32547a c32547a = new C32547a(streaksFragment.getNavigator(), AbstractC5583n.m16799z(streaksFragment));
        boolean zM87157i = c28655q.m87157i(streaksFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = streaksFragment.new C10296a(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        C33860g c33860gM26359K = m26359K(interfaceC28601c1M87260n);
        AbstractC0757c abstractC0757cM26355G = streaksFragment.m26355G();
        boolean zM87157i2 = c28655q.m87157i(streaksFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            final int i14 = 0;
            objM87133R2 = new Function1(streaksFragment) { // from class: wi2.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ StreaksFragment f159544x;

                {
                    this.f159544x = streaksFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            return StreaksFragment.m26360L(this.f159544x, (InterfaceC33858e) obj);
                        case 1:
                            return StreaksFragment.m26362N(this.f159544x, (AbstractC27950a) obj);
                        default:
                            return StreaksFragment.m26363O(this.f159544x, (InterfaceC16239m) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function1 = (Function1) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(c32547a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C35141b(c32547a, 19);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function2 = (Function1) objM87133R3;
        boolean zM87157i4 = c28655q.m87157i(streaksFragment);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i4 || objM87133R4 == c28676v0) {
            final int i15 = 1;
            objM87133R4 = new Function1(streaksFragment) { // from class: wi2.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ StreaksFragment f159544x;

                {
                    this.f159544x = streaksFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            return StreaksFragment.m26360L(this.f159544x, (InterfaceC33858e) obj);
                        case 1:
                            return StreaksFragment.m26362N(this.f159544x, (AbstractC27950a) obj);
                        default:
                            return StreaksFragment.m26363O(this.f159544x, (InterfaceC16239m) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R4);
        }
        Function1 function3 = (Function1) objM87133R4;
        boolean zM87157i5 = c28655q.m87157i(streaksFragment);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i5 || objM87133R5 == c28676v0) {
            final int i16 = 2;
            objM87133R5 = new Function1(streaksFragment) { // from class: wi2.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ StreaksFragment f159544x;

                {
                    this.f159544x = streaksFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            return StreaksFragment.m26360L(this.f159544x, (InterfaceC33858e) obj);
                        case 1:
                            return StreaksFragment.m26362N(this.f159544x, (AbstractC27950a) obj);
                        default:
                            return StreaksFragment.m26363O(this.f159544x, (InterfaceC16239m) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R5);
        }
        AbstractC38327e.m122847h(c33860gM26359K, abstractC0757cM26355G, function1, function2, function3, (Function1) objM87133R5, c28655q, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: K */
    private static final C33860g m26359K(InterfaceC28670t2 interfaceC28670t2) {
        return (C33860g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m26360L(StreaksFragment streaksFragment, InterfaceC33858e it) {
        AbstractC22676k.m65750j(it, "it");
        streaksFragment.m26356H().m107067n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m26361M(C32547a c32547a, InterfaceC32548b navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c32547a.m101579a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m26362N(StreaksFragment streaksFragment, AbstractC27950a it) {
        AbstractC22676k.m65750j(it, "it");
        streaksFragment.m26354F().m84388a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m26363O(StreaksFragment streaksFragment, InterfaceC16239m it) {
        AbstractC22676k.m65750j(it, "it");
        streaksFragment.m26356H().m107066l(it);
        return C23454a0.f92919a;
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
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 3), true, 928111395));
    }
}
