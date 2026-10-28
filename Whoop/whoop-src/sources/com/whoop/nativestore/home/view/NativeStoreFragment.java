package com.whoop.nativestore.home.view;

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
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.nativestore.home.view.NativeStoreFragment;
import com.whoop.navigation.AbstractC9597d;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import org.xmlpull.v1.XmlPullParserException;
import p114eb.AbstractC12939a0;
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
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sz1.C33236a;
import sz1.C33238c;
import tr2.InterfaceC34116n;
import tx0.C34238a;
import tz1.AbstractC34289k;
import tz1.C34284f;
import tz1.InterfaceC34282d;
import uf3.C34911a;
import uo1.C35141b;
import uz1.AbstractC35428f;
import vf3.InterfaceC35951a;
import vz1.C36614a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00105\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020-068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107¨\u0006;²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/nativestore/home/view/NativeStoreFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Leb/a0;", "G", "()Leb/a0;", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lvz1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "K", "()Lvz1/a;", "viewModel", "Lsz1/c;", "x", "I", "()Lsz1/c;", "navRouter", "Lsz1/a;", "y", "H", "()Lsz1/a;", "actionRouter", "Ltr2/n;", "z", "Ltr2/n;", "logger", "", "E", "Z", "isReturnToShop", "", "F", "J", "()Ljava/lang/String;", "source", "Lp1/c1;", "Lp1/c1;", "isTabRootState", "Ltz1/f;", "viewState", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NativeStoreFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isReturnToShop;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC28601c1 isTabRootState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.nativestore.home.view.NativeStoreFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.view.NativeStoreFragment$onCreateView$1$1$1", m100430f = "NativeStoreFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9166a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27403w;

        public C9166a(InterfaceC30057d<? super C9166a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return NativeStoreFragment.this.new C9166a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9166a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27403w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC34282d.m mVarM108600a = AbstractC34289k.m108600a(NativeStoreFragment.this.isReturnToShop, NativeStoreFragment.this.m22938J());
            NativeStoreFragment.this.isReturnToShop = true;
            NativeStoreFragment.this.m22939K().m117623r(mVarM108600a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.home.view.NativeStoreFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9167b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27405w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27406x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27407y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9167b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27405w = componentCallbacks;
            this.f27406x = interfaceC35951a;
            this.f27407y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sz1.c] */
        @Override // c93.InterfaceC4339a
        public final C33238c invoke() {
            ComponentCallbacks componentCallbacks = this.f27405w;
            InterfaceC35951a interfaceC35951a = this.f27406x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27407y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33238c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.home.view.NativeStoreFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9168c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27408w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27409x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27410y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9168c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27408w = componentCallbacks;
            this.f27409x = interfaceC35951a;
            this.f27410y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sz1.a] */
        @Override // c93.InterfaceC4339a
        public final C33236a invoke() {
            ComponentCallbacks componentCallbacks = this.f27408w;
            InterfaceC35951a interfaceC35951a = this.f27409x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27410y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33236a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.home.view.NativeStoreFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9169d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27411w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9169d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27411w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27411w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.nativestore.home.view.NativeStoreFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9170e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27412w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27413x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27414y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27415z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9170e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27412w = componentCallbacks;
            this.f27413x = interfaceC35951a;
            this.f27414y = interfaceC4339a;
            this.f27415z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, vz1.a] */
        @Override // c93.InterfaceC4339a
        public final C36614a invoke() {
            return AbstractC34132o.m107857B(this.f27412w, this.f27413x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36614a.class), this.f27414y, this.f27415z);
        }
    }

    public NativeStoreFragment() {
        C9169d c9169d = new C9169d(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C9170e(this, null, c9169d, null));
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: uz1.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ NativeStoreFragment f150902x;

            {
                this.f150902x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return NativeStoreFragment.m22940L(this.f150902x);
                    default:
                        return NativeStoreFragment.m22944P(this.f150902x);
                }
            }
        };
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i2, new C9167b(this, null, interfaceC4339a));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i2, new C9168c(this, null, null));
        this.logger = InterfaceC34116n.INSTANCE.m107848a("NativeStoreFragment");
        final int i14 = 1;
        this.source = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: uz1.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ NativeStoreFragment f150902x;

            {
                this.f150902x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return NativeStoreFragment.m22940L(this.f150902x);
                    default:
                        return NativeStoreFragment.m22944P(this.f150902x);
                }
            }
        });
        this.isTabRootState = AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: G */
    private final AbstractC12939a0 m22935G() {
        try {
            return AbstractC5583n.m16799z(this);
        } catch (IllegalStateException e5) {
            this.logger.mo85211a("No NavController attached to NativeStoreFragment view yet; shop not treated as tab root", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: H */
    private final C33236a m22936H() {
        return (C33236a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C33238c m22937I() {
        return (C33238c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final String m22938J() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final C36614a m22939K() {
        return (C36614a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C34911a m22940L(NativeStoreFragment nativeStoreFragment) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(nativeStoreFragment), nativeStoreFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m22941M(NativeStoreFragment nativeStoreFragment, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(nativeStoreFragment.m22939K().getViewState(), new C34284f(true, false, null, null, false, 30, null), null, c28655q, 0, 2);
        boolean zM87157i = c28655q.m87157i(nativeStoreFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = nativeStoreFragment.new C9166a(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        C34284f c34284fM22942N = m22942N(interfaceC28601c1M87260n);
        boolean zBooleanValue = ((Boolean) nativeStoreFragment.isTabRootState.getValue()).booleanValue();
        boolean zM87157i2 = c28655q.m87157i(nativeStoreFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C35141b(nativeStoreFragment, 4);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC35428f.m112419g(c34284fM22942N, zBooleanValue, (Function1) objM87133R2, null, c28655q, 0, 8);
        return c23454a0;
    }

    /* JADX INFO: renamed from: N */
    private static final C34284f m22942N(InterfaceC28670t2 interfaceC28670t2) {
        return (C34284f) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m22943O(NativeStoreFragment nativeStoreFragment, Object event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC34282d interfaceC34282dM105438b = nativeStoreFragment.m22936H().m105438b(event, nativeStoreFragment.m22938J());
        if (interfaceC34282dM105438b instanceof InterfaceC34282d.m) {
            nativeStoreFragment.m22939K().m117623r((InterfaceC34282d.m) interfaceC34282dM105438b);
        } else if (interfaceC34282dM105438b instanceof InterfaceC34282d.i) {
            nativeStoreFragment.m22937I().m105439a((InterfaceC34282d.i) interfaceC34282dM105438b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final String m22944P(NativeStoreFragment nativeStoreFragment) {
        Bundle arguments = nativeStoreFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("source");
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.isReturnToShop = savedInstanceState != null ? savedInstanceState.getBoolean("is_return_to_shop", false) : false;
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onSaveInstanceState(Bundle outState) {
        AbstractC22676k.m65750j(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("is_return_to_shop", this.isReturnToShop);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
        InterfaceC28601c1 interfaceC28601c1 = this.isTabRootState;
        AbstractC12939a0 abstractC12939a0M22935G = m22935G();
        boolean z4 = false;
        if (abstractC12939a0M22935G != null && AbstractC9597d.m23119k(abstractC12939a0M22935G)) {
            z4 = true;
        }
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 16), true, 432794835));
    }
}
