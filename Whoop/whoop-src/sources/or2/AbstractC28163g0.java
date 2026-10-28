package or2;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1614p;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1633v0;
import com.squareup.wire.AbstractC5583n;
import hj0.C17359r;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import m83.C25271y;
import p114eb.AbstractC12939a0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p249jc.AbstractC21598x;
import p298l8.AbstractC23420c;
import p543v4.C35643b;
import p692zt.C41113q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.g0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0014\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001aM\u0010!\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Landroidx/fragment/app/m0;", "Lor2/s;", "o", "(Landroidx/fragment/app/m0;)Lor2/s;", "Ll83/a0;", "l", "(Landroidx/fragment/app/m0;)V", "Landroidx/lifecycle/v0;", "Landroidx/lifecycle/g0;", "m", "(Landroidx/fragment/app/m0;)Landroidx/lifecycle/v0;", "Lor2/q1;", "p", "(Landroidx/fragment/app/m0;)Lor2/q1;", "", "statusColor", "navColor", "j", "(Landroidx/fragment/app/m0;II)V", "previousSystemBarColors", "q", "(Landroidx/fragment/app/m0;Lor2/q1;)V", "Ltr2/n;", "logger", "f", "(Landroidx/fragment/app/m0;Ltr2/n;)V", "Landroid/view/View;", "rootView", "", "topPaddingViews", "bottomPaddingViews", "additionalTopPadding", "additionalBottomPadding", "g", "(Landroidx/fragment/app/m0;Landroid/view/View;Ljava/util/List;Ljava/util/List;II)V", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28163g0 {

    /* JADX INFO: renamed from: or2.g0$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"or2/g0$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "onDestroy", "Landroidx/lifecycle/v0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroidx/lifecycle/v0;", "getObserver", "()Landroidx/lifecycle/v0;", "observer", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final InterfaceC1633v0 observer;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f113879x;

        /* JADX INFO: renamed from: or2.g0$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"or2/g0$a$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "onDestroy", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42143a implements DefaultLifecycleObserver {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC34116n f113880w;

            public C42143a(InterfaceC34116n interfaceC34116n) {
                this.f113880w = interfaceC34116n;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                this.f113880w.mo85219j("onViewCreated", new AbstractC30556a.a[0]);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                this.f113880w.mo85219j("onDestroyView", new AbstractC30556a.a[0]);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
                super.onPause(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
                super.onResume(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
                super.onStart(interfaceC1585g0);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
                super.onStop(interfaceC1585g0);
            }
        }

        public a(InterfaceC34116n interfaceC34116n, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            this.f113879x = abstractComponentCallbacksC1320m0;
            this.observer = new C28151c0(interfaceC34116n, 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m85263b(InterfaceC34116n interfaceC34116n, InterfaceC1585g0 interfaceC1585g0) {
            if (interfaceC1585g0 == null) {
                return;
            }
            interfaceC1585g0.getLifecycle().mo4986a(new C42143a(interfaceC34116n));
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            this.f113879x.getViewLifecycleOwnerLiveData().observeForever(this.observer);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            this.f113879x.getViewLifecycleOwnerLiveData().removeObserver(this.observer);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
            super.onPause(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
            super.onResume(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
            super.onStart(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
            super.onStop(interfaceC1585g0);
        }
    }

    /* JADX INFO: renamed from: or2.g0$b */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"or2/g0$b", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "onDestroy", "Landroidx/lifecycle/v0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroidx/lifecycle/v0;", "getObserver", "()Landroidx/lifecycle/v0;", "observer", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final InterfaceC1633v0 observer;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f113882x;

        public b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            this.f113882x = abstractComponentCallbacksC1320m0;
            this.observer = AbstractC28163g0.m85257m(abstractComponentCallbacksC1320m0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            this.f113882x.getViewLifecycleOwnerLiveData().observeForever(this.observer);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            this.f113882x.getViewLifecycleOwnerLiveData().removeObserver(this.observer);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
            super.onPause(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
            super.onResume(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
            super.onStart(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
            super.onStop(interfaceC1585g0);
        }
    }

    /* JADX INFO: renamed from: or2.g0$c */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"or2/g0$c", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onStart", "(Landroidx/lifecycle/g0;)V", "onStop", "Lor2/q1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lor2/q1;", "getPreviousSystemBarColors", "()Lor2/q1;", "setPreviousSystemBarColors", "(Lor2/q1;)V", "previousSystemBarColors", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C28194q1 previousSystemBarColors;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f113884x;

        public c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            this.f113884x = abstractComponentCallbacksC1320m0;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
            super.onCreate(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
            super.onDestroy(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
            super.onPause(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
            super.onResume(interfaceC1585g0);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            this.previousSystemBarColors = AbstractC28163g0.m85260p(this.f113884x);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(InterfaceC1585g0 owner) {
            AbstractC22676k.m65750j(owner, "owner");
            C28194q1 c28194q1 = this.previousSystemBarColors;
            if (c28194q1 != null) {
                AbstractC28163g0.m85261q(this.f113884x, c28194q1);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m85250f(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        AbstractC22676k.m65750j(logger, "logger");
        abstractComponentCallbacksC1320m0.getLifecycle().mo4986a(new C17359r(logger));
        abstractComponentCallbacksC1320m0.getLifecycle().mo4986a(new a(logger, abstractComponentCallbacksC1320m0));
    }

    /* JADX INFO: renamed from: g */
    public static final void m85251g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, View rootView, final List<? extends View> topPaddingViews, final List<? extends View> bottomPaddingViews, final int i13, final int i14) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        AbstractC22676k.m65750j(rootView, "rootView");
        AbstractC22676k.m65750j(topPaddingViews, "topPaddingViews");
        AbstractC22676k.m65750j(bottomPaddingViews, "bottomPaddingViews");
        InterfaceC16915u interfaceC16915u = new InterfaceC16915u() { // from class: or2.f0
            @Override // p184h5.InterfaceC16915u
            /* JADX INFO: renamed from: o */
            public final C16905q1 mo1682o(View view, C16905q1 c16905q1) {
                return AbstractC28163g0.m85253i(topPaddingViews, bottomPaddingViews, i13, i14, view, c16905q1);
            }
        };
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(rootView, interfaceC16915u);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m85252h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, View view, List list, List list2, int i13, int i14, int i15, Object obj) {
        int i16 = i15 & 2;
        C25271y c25271y = C25271y.f99162w;
        if (i16 != 0) {
            list = c25271y;
        }
        if ((i15 & 4) != 0) {
            list2 = c25271y;
        }
        if ((i15 & 8) != 0) {
            i13 = 0;
        }
        if ((i15 & 16) != 0) {
            i14 = 0;
        }
        m85251g(abstractComponentCallbacksC1320m0, view, list, list2, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C16905q1 m85253i(List list, List list2, int i13, int i14, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C16899o1 c16899o1 = windowInsets.f64864a;
        C35643b c35643bMo47530g = c16899o1.mo47530g(1);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        C35643b c35643bMo47530g2 = c16899o1.mo47530g(2);
        AbstractC22676k.m65749i(c35643bMo47530g2, "getInsets(...)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            view2.setPadding(view2.getPaddingLeft(), c35643bMo47530g.f151450b + i13, view2.getPaddingRight(), view2.getPaddingBottom());
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            View view3 = (View) it3.next();
            view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), c35643bMo47530g2.f151452d + i14);
        }
        return C16905q1.f64863b;
    }

    /* JADX INFO: renamed from: j */
    public static final void m85254j(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13, int i14) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        Window window = abstractComponentCallbacksC1320m0.requireActivity().getWindow();
        window.setStatusBarColor(i13);
        window.setNavigationBarColor(i14);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m85255k(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        m85254j(abstractComponentCallbacksC1320m0, i13, i14);
    }

    /* JADX INFO: renamed from: l */
    public static final void m85256l(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        abstractComponentCallbacksC1320m0.getLifecycle().mo4986a(new b(abstractComponentCallbacksC1320m0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final InterfaceC1633v0 m85257m(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        return new C1614p(abstractComponentCallbacksC1320m0, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m85258n(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC1585g0 interfaceC1585g0) {
        if (interfaceC1585g0 == null) {
            return;
        }
        interfaceC1585g0.getLifecycle().mo4986a(new c(abstractComponentCallbacksC1320m0));
    }

    /* JADX INFO: renamed from: o */
    public static final C28198s m85259o(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        AbstractC22676k.m65750j(abstractComponentCallbacksC1320m0, "<this>");
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(abstractComponentCallbacksC1320m0);
        C1579e2 store = abstractComponentCallbacksC1320m0.getViewModelStore();
        InterfaceC1563a2 factory = abstractComponentCallbacksC1320m0.getDefaultViewModelProviderFactory();
        AbstractC23420c defaultCreationExtras = abstractComponentCallbacksC1320m0.getDefaultViewModelCreationExtras();
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(factory, "factory");
        AbstractC22676k.m65750j(defaultCreationExtras, "defaultCreationExtras");
        C41113q c41113q = new C41113q(store, factory, defaultCreationExtras);
        InterfaceC21461d modelClass = AbstractC21598x.m60666V(C28201t.class);
        AbstractC22676k.m65750j(modelClass, "modelClass");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName != null) {
            return new C28198s(abstractC12939a0M16799z, (C28201t) c41113q.m133475w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C28194q1 m85260p(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        Window window = abstractComponentCallbacksC1320m0.requireActivity().getWindow();
        AbstractC29125c.m88513V(window, false);
        C28194q1 c28194q1 = new C28194q1(window.getStatusBarColor(), window.getNavigationBarColor());
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        return c28194q1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m85261q(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, C28194q1 c28194q1) {
        Window window = abstractComponentCallbacksC1320m0.requireActivity().getWindow();
        AbstractC29125c.m88513V(window, true);
        window.setStatusBarColor(c28194q1.getStatusBarColor());
        window.setNavigationBarColor(c28194q1.getNavBarColor());
    }
}
