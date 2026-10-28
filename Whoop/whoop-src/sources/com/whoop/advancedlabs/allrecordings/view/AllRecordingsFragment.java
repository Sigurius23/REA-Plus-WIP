package com.whoop.advancedlabs.allrecordings.view;

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
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ua0.AbstractC34718a;
import ua0.C34719b;
import va0.AbstractC35839a;
import va0.AbstractC35841c;
import va0.C35840b;
import vf3.InterfaceC35951a;
import w20.C36727q;
import x30.C37894h1;
import xa0.AbstractC38137b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/allrecordings/view/AllRecordingsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lva0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "C", "()Lva0/b;", "viewModel", "Lva0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AllRecordingsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5790c(this, null, new C5789b(this), null));

    /* JADX INFO: renamed from: com.whoop.advancedlabs.allrecordings.view.AllRecordingsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.allrecordings.view.AllRecordingsFragment$onCreateView$1$1$1", m100430f = "AllRecordingsFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5788a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22857w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f22859y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5788a(String str, InterfaceC30057d<? super C5788a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22859y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AllRecordingsFragment.this.new C5788a(this.f22859y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5788a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22857w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AllRecordingsFragment.this.m17268C().m113754n(new AbstractC35839a.a(this.f22859y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.allrecordings.view.AllRecordingsFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5789b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22860w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5789b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22860w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22860w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.allrecordings.view.AllRecordingsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5790c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22861w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22862x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22863y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22864z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5790c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22861w = componentCallbacks;
            this.f22862x = interfaceC35951a;
            this.f22863y = interfaceC4339a;
            this.f22864z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, va0.b] */
        @Override // c93.InterfaceC4339a
        public final C35840b invoke() {
            return AbstractC34132o.m107857B(this.f22861w, this.f22862x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35840b.class), this.f22863y, this.f22864z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final C35840b m17268C() {
        return (C35840b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m17269D(AllRecordingsFragment allRecordingsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C34719b(AbstractC5583n.m16799z(allRecordingsFragment));
                c28655q.m87172p0(objM87133R);
            }
            C34719b c34719b = (C34719b) objM87133R;
            Bundle arguments = allRecordingsFragment.getArguments();
            String string = arguments != null ? arguments.getString("biomarkerName") : null;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(allRecordingsFragment.m17268C().getViewState(), AbstractC35841c.b.f152601b, null, c28655q, 48, 2);
            C35840b c35840bM17268C = allRecordingsFragment.m17268C();
            boolean zM87157i = c28655q.m87157i(allRecordingsFragment) | c28655q.m87153g(string);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = allRecordingsFragment.new C5788a(string, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87254h(c35840bM17268C, string, (InterfaceC4351m) objM87133R2, c28655q);
            AbstractC35841c abstractC35841cM17270E = m17270E(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(c34719b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C37894h1(c34719b, 3);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(allRecordingsFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C37894h1(allRecordingsFragment, 4);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC38137b.m122148p(abstractC35841cM17270E, function1, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final AbstractC35841c m17270E(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC35841c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m17271F(C34719b c34719b, AbstractC34718a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c34719b.m109643a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m17272G(AllRecordingsFragment allRecordingsFragment, AbstractC35839a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        allRecordingsFragment.m17268C().m113754n(viewEvent);
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 8), true, -284856743));
    }
}
