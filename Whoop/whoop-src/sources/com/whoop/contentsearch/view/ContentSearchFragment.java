package com.whoop.contentsearch.view;

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
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lv0.AbstractC24758a;
import lv0.C24759b;
import or2.AbstractC28163g0;
import p114eb.C12991u0;
import p390p1.C28635l;
import p390p1.C28655q;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import pv0.C29576c;
import pv0.InterfaceC29575b;
import q80.C30036h;
import q83.AbstractC30060g;
import r12.C30856a;
import rq0.C31703x;
import sv0.AbstractC33033b;
import sv0.C33032a;
import sv0.C33034c;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lcom/whoop/contentsearch/view/ContentSearchFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lpv0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Lpv0/c;", "viewModel", "Lfi0/a;", "x", "C", "()Lfi0/a;", "analytics", "", "y", "D", "()Ljava/lang/String;", "entryPoint", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ContentSearchFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C6441c(this, null, new C6440b(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analytics = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C6439a(this, null, null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h entryPoint = AbstractC30060g.m92088H(new C30036h(this, 19));

    /* JADX INFO: renamed from: com.whoop.contentsearch.view.ContentSearchFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6439a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25242w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25243x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25244y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6439a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25242w = componentCallbacks;
            this.f25243x = interfaceC35951a;
            this.f25244y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            ComponentCallbacks componentCallbacks = this.f25242w;
            InterfaceC35951a interfaceC35951a = this.f25243x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25244y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.contentsearch.view.ContentSearchFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6440b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25245w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6440b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25245w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25245w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.contentsearch.view.ContentSearchFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6441c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25246w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25247x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25248y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25249z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6441c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25246w = componentCallbacks;
            this.f25247x = interfaceC35951a;
            this.f25248y = interfaceC4339a;
            this.f25249z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, pv0.c] */
        @Override // c93.InterfaceC4339a
        public final C29576c invoke() {
            return AbstractC34132o.m107857B(this.f25246w, this.f25247x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29576c.class), this.f25248y, this.f25249z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final String m19652B(ContentSearchFragment contentSearchFragment) {
        return contentSearchFragment.requireArguments().getString("entryPoint");
    }

    /* JADX INFO: renamed from: C */
    private final InterfaceC14515a m19653C() {
        return (InterfaceC14515a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final String m19654D() {
        return (String) this.entryPoint.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C29576c m19655E() {
        return (C29576c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m19656F(ContentSearchFragment contentSearchFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("ContentSearchNavHost", null, c28655q, 6, 2);
            C24759b c24759b = new C24759b(contentSearchFragment.m19653C());
            C33032a c33032a = new C33032a(contentSearchFragment.m19655E(), new C33034c(AbstractC5583n.m16799z(contentSearchFragment), c12991u0M58963a), c24759b);
            contentSearchFragment.m19655E().m90671p(new InterfaceC29575b.b(null, 1, null));
            c24759b.m72499a(new AbstractC24758a.f(String.valueOf(contentSearchFragment.m19654D()), null, null, 6, null));
            C29576c c29576cM19655E = contentSearchFragment.m19655E();
            boolean zM87157i = c28655q.m87157i(c33032a);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C31703x(c33032a, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33033b.m104304e(c29576cM19655E, c12991u0M58963a, c24759b, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m19657G(C33032a c33032a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        c33032a.m104299a(it);
        return C23454a0.f92919a;
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
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 11), true, -845111969));
    }
}
