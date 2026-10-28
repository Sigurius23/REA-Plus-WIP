package com.whoop.aiinsights;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dp0.InterfaceC12251g;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import j93.InterfaceC21467g;
import jf3.C21647a;
import jp1.C21859k;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import oe2.C27878c;
import or2.AbstractC28163g0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import pf.AbstractC29125c;
import pf.C29124b;
import ph0.AbstractC29236d;
import ph0.C29233a;
import ph0.C29234b;
import q83.AbstractC30060g;
import qh0.AbstractC30364a;
import qh0.C30365b;
import uf3.C34911a;
import uh0.AbstractC34963a;
import uh0.C34964b;
import vf3.InterfaceC35951a;
import vh0.AbstractC36042c;
import vh0.C36041b;
import vh0.InterfaceC36040a;
import xh0.AbstractC38307c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J!\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b2\u00103¨\u00067²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/aiinsights/AiInsightsFragment;", "Landroidx/fragment/app/y;", "<init>", "()V", "Landroid/os/Bundle;", "Lph0/b;", "J", "(Landroid/os/Bundle;)Lph0/b;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "I", "()Lph0/b;", "aiInsightsScreenArgs", "Lvh0/b;", "x", "N", "()Lvh0/b;", "viewModel", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Ldp0/g;", "z", "L", "()Ldp0/g;", "globalCoachManager", "Lqh0/b;", "E", "K", "()Lqh0/b;", "analytics", "Lm91/p;", "F", "M", "()Lm91/p;", "itemViewFactory", "Lvh0/c;", "viewState", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AiInsightsFragment extends DialogInterfaceOnCancelListenerC1361y {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h itemViewFactory;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h aiInsightsScreenArgs;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h globalCoachManager;

    /* JADX INFO: renamed from: com.whoop.aiinsights.AiInsightsFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C5964a extends C22672i implements Function1 {
        public C5964a(Object obj) {
            super(1, 0, C36041b.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/aiinsights/presentation/AiInsightsViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m17856a(InterfaceC36040a p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C36041b) this.receiver).m114406l(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m17856a((InterfaceC36040a) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.aiinsights.AiInsightsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5965b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23445w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23446x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23447y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5965b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23445w = componentCallbacks;
            this.f23446x = interfaceC35951a;
            this.f23447y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23445w;
            InterfaceC35951a interfaceC35951a = this.f23446x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23447y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.aiinsights.AiInsightsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5966c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23448w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23449x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23450y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5966c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23448w = componentCallbacks;
            this.f23449x = interfaceC35951a;
            this.f23450y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [dp0.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC12251g invoke() {
            ComponentCallbacks componentCallbacks = this.f23448w;
            InterfaceC35951a interfaceC35951a = this.f23449x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23450y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12251g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.aiinsights.AiInsightsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5967d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23451w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23452x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23453y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5967d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23451w = componentCallbacks;
            this.f23452x = interfaceC35951a;
            this.f23453y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qh0.b] */
        @Override // c93.InterfaceC4339a
        public final C30365b invoke() {
            ComponentCallbacks componentCallbacks = this.f23451w;
            InterfaceC35951a interfaceC35951a = this.f23452x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23453y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30365b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.aiinsights.AiInsightsFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5968e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23454w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23455x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23456y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5968e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23454w = componentCallbacks;
            this.f23455x = interfaceC35951a;
            this.f23456y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m91.p] */
        @Override // c93.InterfaceC4339a
        public final C25307p invoke() {
            ComponentCallbacks componentCallbacks = this.f23454w;
            InterfaceC35951a interfaceC35951a = this.f23455x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23456y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25307p.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.aiinsights.AiInsightsFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5969f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23457w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5969f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23457w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23457w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.aiinsights.AiInsightsFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5970g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23458w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23459x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23460y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23461z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5970g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23458w = componentCallbacks;
            this.f23459x = interfaceC35951a;
            this.f23460y = interfaceC4339a;
            this.f23461z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, vh0.b] */
        @Override // c93.InterfaceC4339a
        public final C36041b invoke() {
            return AbstractC34132o.m107857B(this.f23458w, this.f23459x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36041b.class), this.f23460y, this.f23461z);
        }
    }

    public AiInsightsFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.aiInsightsScreenArgs = AbstractC30060g.m92087G(enumC23463i, new C29233a(this, 0));
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C5970g(this, null, new C5969f(this), new C29233a(this, 1)));
        C29233a c29233a = new C29233a(this, 2);
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i2, new C5965b(this, null, c29233a));
        this.globalCoachManager = AbstractC30060g.m92087G(enumC23463i2, new C5966c(this, null, null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i2, new C5967d(this, null, null));
        this.itemViewFactory = AbstractC30060g.m92087G(enumC23463i2, new C5968e(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C29234b m17840H(AiInsightsFragment aiInsightsFragment) {
        return aiInsightsFragment.m17842J(aiInsightsFragment.getArguments());
    }

    /* JADX INFO: renamed from: I */
    private final C29234b m17841I() {
        return (C29234b) this.aiInsightsScreenArgs.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final C29234b m17842J(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String str = "";
        if (bundle == null || (string = bundle.getString("sourceId")) == null) {
            string = "";
        }
        if (bundle == null || (string2 = bundle.getString("sourceContextType")) == null) {
            string2 = "ACTIVITY_RECOMMENDATION";
        }
        if (bundle != null && (string3 = bundle.getString("activityType")) != null) {
            str = string3;
        }
        return new C29234b(string, string2, str);
    }

    /* JADX INFO: renamed from: K */
    private final C30365b m17843K() {
        return (C30365b) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final InterfaceC12251g m17844L() {
        return (InterfaceC12251g) this.globalCoachManager.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final C25307p m17845M() {
        return (C25307p) this.itemViewFactory.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final C36041b m17846N() {
        return (C36041b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C34911a m17847O(AiInsightsFragment aiInsightsFragment) {
        return AbstractC15751g.m44431K(aiInsightsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m17848P(AiInsightsFragment aiInsightsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("AiInsightsNavHost", null, c28655q, 6, 2);
            InterfaceC21159o0 navigator = aiInsightsFragment.getNavigator();
            InterfaceC12251g interfaceC12251gM17844L = aiInsightsFragment.m17844L();
            boolean zM87157i = c28655q.m87157i(aiInsightsFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C29233a(aiInsightsFragment, 3);
                c28655q.m87172p0(objM87133R);
            }
            C34964b c34964b = new C34964b(c12991u0M58963a, navigator, interfaceC12251gM17844L, (InterfaceC4339a) objM87133R);
            aiInsightsFragment.m17843K().m92836a(new AbstractC30364a.c(aiInsightsFragment.m17841I().getActivityType()));
            AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(aiInsightsFragment.m17845M()), AbstractC37817c.m121344e(1332465320, c28655q, new C21859k(aiInsightsFragment, c34964b, AbstractC28683x.m87260n(aiInsightsFragment.m17846N().getViewState(), AbstractC36042c.e.f153776a, null, c28655q, 48, 2), 15)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m17849Q(AiInsightsFragment aiInsightsFragment) {
        AbstractC28163g0.m85259o(aiInsightsFragment).m85343i();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private static final AbstractC36042c m17850R(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC36042c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m17851S(AiInsightsFragment aiInsightsFragment, C34964b c34964b, InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC36042c abstractC36042cM17850R = m17850R(interfaceC28670t2);
            C36041b c36041bM17846N = aiInsightsFragment.m17846N();
            boolean zM87157i = c28655q.m87157i(c36041bM17846N);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C5964a(c36041bM17846N);
                c28655q.m87172p0(objM87133R);
            }
            C30365b c30365bM17843K = aiInsightsFragment.m17843K();
            Function1 function1 = (Function1) ((InterfaceC21467g) objM87133R);
            boolean zM87157i2 = c28655q.m87157i(c34964b);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C29124b(c34964b, 3);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(aiInsightsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C29233a(aiInsightsFragment, 4);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC38307c.m122725r(abstractC36042cM17850R, c30365bM17843K, function1, function2, false, (InterfaceC4339a) objM87133R3, c28655q, 0, 16);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m17852T(C34964b c34964b, AbstractC34963a it) {
        AbstractC22676k.m65750j(it, "it");
        c34964b.m110428c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m17853U(AiInsightsFragment aiInsightsFragment) {
        AbstractC28163g0.m85259o(aiInsightsFragment).m85343i();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C34911a m17854V(AiInsightsFragment aiInsightsFragment) {
        return AbstractC15751g.m44431K(aiInsightsFragment.m17841I());
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, AbstractC29236d.f118317a);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 15), true, 1240251240));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(1792);
        window.setLayout(-1, -1);
        window.setGravity(80);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m17846N().m114406l(new InterfaceC36040a.b(m17841I().getSourceContextType(), m17841I().getSourceId()));
    }
}
