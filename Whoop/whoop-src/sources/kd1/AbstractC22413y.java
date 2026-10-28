package kd1;

import a91.InterfaceC0587b;
import android.view.View;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.C19072b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import js2.C21930h;
import k71.C22241a0;
import l83.C23454a0;
import p184h5.AbstractC16901p0;
import p184h5.C16920v1;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28620h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: kd1.y */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0002\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Ll83/a0;", "e", "(Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Landroid/view/View;", "", "k", "(Landroid/view/View;)Ljava/lang/Object;", "windowKey", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22413y {

    /* JADX INFO: renamed from: kd1.y$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"kd1/y$a", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC0587b f87681a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f87682b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f87683c;

        public a(InterfaceC0587b interfaceC0587b, Object obj, Object obj2) {
            this.f87681a = interfaceC0587b;
            this.f87682b = obj;
            this.f87683c = obj2;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f87681a.mo1522b(this.f87682b, this.f87683c);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m64544e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(929802439);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            InterfaceC0587b interfaceC0587b = (InterfaceC0587b) c28655q.m87161k(AbstractC38073e.m121969q());
            Object objM64550k = m64550k((View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new Object();
                c28655q.m87172p0(objM87133R);
            }
            boolean zM87157i = c28655q.m87157i(interfaceC0587b) | c28655q.m87157i(objM64550k) | c28655q.m87157i(objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C21930h(interfaceC0587b, objM64550k, objM87133R, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87249c(interfaceC0587b, objM64550k, objM87133R, (Function1) objM87133R2, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC28620h0 m64545f(InterfaceC0587b interfaceC0587b, Object obj, Object obj2, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        interfaceC0587b.mo1521a(obj, obj2);
        return new a(interfaceC0587b, obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m64546g(int i13, Composer composer, int i14) {
        m64544e(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m64547h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(982928359);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
            boolean zMo1523c = ((InterfaceC0587b) c28655q.m87161k(AbstractC38073e.m121969q())).mo1523c(m64550k(view));
            boolean zM87157i = c28655q.m87157i(view) | c28655q.m87155h(zMo1523c);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C19072b(view, zMo1523c, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m64548i(View view, boolean z4) {
        C16920v1 c16920v1M47576g = AbstractC16901p0.m47576g(view);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (c16920v1M47576g == null) {
            return c23454a0;
        }
        c16920v1M47576g.m47613b(z4);
        c16920v1M47576g.m47612a(z4);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m64549j(int i13, Composer composer, int i14) {
        m64547h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final Object m64550k(View view) {
        AbstractC22676k.m65750j(view, "<this>");
        View rootView = view.getRootView();
        AbstractC22676k.m65749i(rootView, "getRootView(...)");
        return rootView;
    }
}
