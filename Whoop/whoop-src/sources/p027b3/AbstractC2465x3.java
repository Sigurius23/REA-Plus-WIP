package p027b3;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.AndroidComposeView;
import bc3.AbstractC3006f0;
import com.whoop.android.R;
import dc3.C11923h;
import java.util.Collection;
import m83.AbstractC25265s;
import p005a3.C0227m1;
import p005a3.C0244q2;
import p007a6.C0458v;
import p390p1.AbstractC28667t;
import p390p1.C28679w;
import p602x1.C37816b;
import p668z1.AbstractC39963l;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: b3.x3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2465x3 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f9615a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final C2460w3 m7444a(AbstractC2346a abstractC2346a, AbstractC28667t abstractC28667t, C37816b c37816b) {
        AndroidComposeView androidComposeView;
        C2460w3 c2460w3;
        Object[] objArr = 0;
        if (AbstractC2369e2.f9350a.compareAndSet(false, true)) {
            C11923h c11923hM92111d = AbstractC30060g.m92111d(1, 6, null);
            AbstractC3006f0.m8732z(AbstractC3006f0.m8708b((InterfaceC30063j) C2353b1.f9294K.getValue()), null, null, new C0458v((Object) c11923hM92111d, (InterfaceC30057d) (objArr == true ? 1 : 0), 3), 3);
            C0227m1 c0227m1 = new C0227m1(c11923hM92111d, 5);
            synchronized (AbstractC39963l.f172462c) {
                AbstractC39963l.f172468i = AbstractC25265s.m74128f1(c0227m1, (Collection) AbstractC39963l.f172468i);
            }
            AbstractC39963l.m128161a();
        }
        if (abstractC2346a.getChildCount() > 0) {
            View childAt = abstractC2346a.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(abstractC2346a.getContext(), abstractC28667t.mo87099j());
                abstractC2346a.addView(androidComposeView.getView(), f9615a);
            }
            Object tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
            c2460w3 = tag instanceof C2460w3 ? (C2460w3) tag : null;
            if (c2460w3 == null) {
                c2460w3 = new C2460w3(androidComposeView, new C28679w(abstractC28667t, new C0244q2(androidComposeView.getRoot())));
                androidComposeView.getView().setTag(R.id.wrapped_composition_tag, c2460w3);
            }
            c2460w3.m7440a(c37816b);
            if (!AbstractC22676k.m65745e(androidComposeView.getCoroutineContext(), abstractC28667t.mo87099j())) {
                androidComposeView.setCoroutineContext(abstractC28667t.mo87099j());
            }
            return c2460w3;
        }
        abstractC2346a.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractC2346a.getContext(), abstractC28667t.mo87099j());
            abstractC2346a.addView(androidComposeView.getView(), f9615a);
        }
        Object tag2 = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof C2460w3) {
        }
        if (c2460w3 == null) {
            c2460w3 = new C2460w3(androidComposeView, new C28679w(abstractC28667t, new C0244q2(androidComposeView.getRoot())));
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, c2460w3);
        }
        c2460w3.m7440a(c37816b);
        if (!AbstractC22676k.m65745e(androidComposeView.getCoroutineContext(), abstractC28667t.mo87099j())) {
            androidComposeView.setCoroutineContext(abstractC28667t.mo87099j());
        }
        return c2460w3;
    }
}
