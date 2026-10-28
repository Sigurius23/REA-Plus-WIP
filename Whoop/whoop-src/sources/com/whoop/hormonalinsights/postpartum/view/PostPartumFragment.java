package com.whoop.hormonalinsights.postpartum.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumScreenType;
import com.whoop.hormonalinsights.postpartum.view.PostPartumFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hj0.AbstractC17357p;
import hp1.AbstractC17546f;
import hp1.AbstractC17548h;
import hp1.C17547g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import jp1.AbstractC21863o;
import jp1.C21857i;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.media.tracks.HMSTrackSource;
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
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import yn1.AbstractC39672a;
import yn1.C39673b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$¨\u0006(²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lhp1/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "H", "()Lhp1/g;", "viewModel", "Lyn1/b;", "x", "E", "()Lyn1/b;", "analyticsHelper", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", "y", "G", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", HMSTrackSource.SCREEN, "", "z", "F", "()Ljava/lang/String;", "id", "Lhp1/h;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PostPartumFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8936c(this, null, new C8935b(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C8934a(this, null, null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h screen = AbstractC30060g.m92088H(new C21857i(this, 0));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h id = AbstractC30060g.m92088H(new C21857i(this, 1));

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.postpartum.view.PostPartumFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8934a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26732w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26733x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26734y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8934a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26732w = componentCallbacks;
            this.f26733x = interfaceC35951a;
            this.f26734y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yn1.b] */
        @Override // c93.InterfaceC4339a
        public final C39673b invoke() {
            ComponentCallbacks componentCallbacks = this.f26732w;
            InterfaceC35951a interfaceC35951a = this.f26733x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26734y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39673b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.postpartum.view.PostPartumFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8935b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26735w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8935b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26735w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26735w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.postpartum.view.PostPartumFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8936c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26736w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26737x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26738y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26739z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8936c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26736w = componentCallbacks;
            this.f26737x = interfaceC35951a;
            this.f26738y = interfaceC4339a;
            this.f26739z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, hp1.g] */
        @Override // c93.InterfaceC4339a
        public final C17547g invoke() {
            return AbstractC34132o.m107857B(this.f26736w, this.f26737x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17547g.class), this.f26738y, this.f26739z);
        }
    }

    /* JADX INFO: renamed from: E */
    private final C39673b m22104E() {
        return (C39673b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final String m22105F() {
        return (String) this.id.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final PostPartumScreenType m22106G() {
        return (PostPartumScreenType) this.screen.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final C17547g m22107H() {
        return (C17547g) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final String m22108I(PostPartumFragment postPartumFragment) {
        String string = postPartumFragment.requireArguments().getString("id");
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m22109J(final PostPartumFragment postPartumFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(postPartumFragment.m22107H().getViewState(), AbstractC17548h.d.f67920a, null, c28655q, 48, 2);
            AbstractC28163g0.m85256l(postPartumFragment);
            AbstractC17548h abstractC17548hM22110K = m22110K(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(postPartumFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new Function1(postPartumFragment) { // from class: jp1.j

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PostPartumFragment f84432x;

                    {
                        this.f84432x = postPartumFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return PostPartumFragment.m22111L(this.f84432x, (AbstractC39672a) obj);
                            default:
                                return PostPartumFragment.m22112M(this.f84432x, (AbstractC17546f) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(postPartumFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 1;
                objM87133R2 = new Function1(postPartumFragment) { // from class: jp1.j

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ PostPartumFragment f84432x;

                    {
                        this.f84432x = postPartumFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return PostPartumFragment.m22111L(this.f84432x, (AbstractC39672a) obj);
                            default:
                                return PostPartumFragment.m22112M(this.f84432x, (AbstractC17546f) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(postPartumFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C21857i(postPartumFragment, 2);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC21863o.m61936i(abstractC17548hM22110K, function1, function2, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final AbstractC17548h m22110K(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC17548h) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m22111L(PostPartumFragment postPartumFragment, AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        postPartumFragment.m22104E().m126872M(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m22112M(PostPartumFragment postPartumFragment, AbstractC17546f event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17546f.b) {
            AbstractC28163g0.m85259o(postPartumFragment).m85343i();
        } else if (!(event instanceof AbstractC17546f.a) || postPartumFragment.m22106G() == PostPartumScreenType.ALL) {
            postPartumFragment.m22107H().m49910o(event);
        } else {
            AbstractC28163g0.m85259o(postPartumFragment).m85343i();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m22113N(PostPartumFragment postPartumFragment) {
        AbstractC28163g0.m85259o(postPartumFragment).m85343i();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002c A[RETURN] */
    /* JADX INFO: renamed from: O */
    public static final PostPartumScreenType m22114O(PostPartumFragment postPartumFragment) {
        String string = postPartumFragment.requireArguments().getString(HMSTrackSource.SCREEN);
        if (string == null) {
            string = "";
        }
        PostPartumScreenType postPartumScreenType = PostPartumScreenType.ALL;
        for (PostPartumScreenType postPartumScreenType2 : PostPartumScreenType.values()) {
            if (AbstractC22676k.m65745e(postPartumScreenType2.name(), string)) {
                if (postPartumScreenType2 == null) {
                    return postPartumScreenType;
                }
                return postPartumScreenType2;
            }
        }
        postPartumScreenType2 = null;
        if (postPartumScreenType2 == null) {
            return postPartumScreenType;
        }
        return postPartumScreenType2;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 20), true, -754201110));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
        m22107H().m49910o(new AbstractC17546f.d(m22106G(), m22105F()));
    }
}
