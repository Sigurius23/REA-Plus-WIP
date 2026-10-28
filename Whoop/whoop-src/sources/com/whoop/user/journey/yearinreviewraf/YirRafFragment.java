package com.whoop.user.journey.yearinreviewraf;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.IOException;
import jf3.C21647a;
import kc2.AbstractC22355e;
import kc2.C22358h;
import kc2.C22359i;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mw1.C25985a;
import no0.C26944e0;
import nr0.C27072e;
import nr2.AbstractC27079a;
import or2.AbstractC28163g0;
import org.xmlpull.v1.XmlPullParserException;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u001b\u0010\u0018\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b²\u0006\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "shareMessage", "Ll83/a0;", "G", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "Lkc2/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lkc2/h;", "viewModel", "Lkc2/i;", "viewState", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class YirRafFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10694b(this, null, new C10693a(this), null));

    /* JADX INFO: renamed from: com.whoop.user.journey.yearinreviewraf.YirRafFragment$a */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10693a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32620w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10693a(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32620w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32620w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.user.journey.yearinreviewraf.YirRafFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10694b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32621w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32622x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32623y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32624z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10694b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32621w = componentCallbacks;
            this.f32622x = interfaceC35951a;
            this.f32623y = interfaceC4339a;
            this.f32624z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, kc2.h] */
        @Override // c93.InterfaceC4339a
        public final C22358h invoke() {
            return AbstractC34132o.m107857B(this.f32621w, this.f32622x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22358h.class), this.f32623y, this.f32624z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m27801C(YirRafFragment yirRafFragment, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22359i c22359iM27802D = m27802D(AbstractC28683x.m87260n(yirRafFragment.m27808B().getViewState(), null, null, c28655q, 48, 2));
            boolean zM87157i = c28655q.m87157i(yirRafFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C27072e(yirRafFragment, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(yirRafFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C26944e0(yirRafFragment, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27079a.m81447e(c22359iM27802D, interfaceC4339a, (Function1) objM87133R2, c28655q, C22359i.f87285e, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final C22359i m27802D(InterfaceC28670t2 interfaceC28670t2) {
        return (C22359i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m27803E(YirRafFragment yirRafFragment) {
        AbstractC28163g0.m85259o(yirRafFragment).m85343i();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m27804F(YirRafFragment yirRafFragment, String message) {
        AbstractC22676k.m65750j(message, "message");
        yirRafFragment.m27805G(message);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private final void m27805G(String shareMessage) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", shareMessage);
        intent.setType(MimeType.MIME_TYPE_TXT);
        AbstractC32122c.startActivity(requireActivity(), Intent.createChooser(intent, requireActivity().getString(AbstractC12922s.f44583R)), null);
    }

    /* JADX INFO: renamed from: B */
    public final C22358h m27808B() {
        return (C22358h) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 16), true, 1228835775));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        m27808B().m64270p(new AbstractC22355e.a("YearInReview"));
        getActivity();
    }
}
