package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.p018ui.node.Owner;
import hg3.AbstractC17269i;
import io.sentry.C20040a;
import io.sentry.C20321e5;
import io.sentry.C20337g0;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20258b0;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.internal.gestures.AbstractC20093i;
import io.sentry.android.core.internal.util.C20106g;
import io.sentry.compose.C20300a;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.C20485j0;
import io.sentry.protocol.C20487k0;
import io.sentry.util.thread.InterfaceC20598a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p005a3.C0230n0;
import p222ij.RunnableC18585k;
import p249jc.AbstractC21598x;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class ViewHierarchyEventProcessor implements InterfaceC20258b0 {

    /* JADX INFO: renamed from: w */
    public final SentryAndroidOptions f75302w;

    /* JADX INFO: renamed from: x */
    public final C20106g f75303x;

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75302w = sentryAndroidOptions;
        this.f75303x = new C20106g(2000L, 3);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            AbstractC21598x.m60683i("ViewHierarchy");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m55913a(View view, C20487k0 c20487k0, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComposeViewHierarchyExporter composeViewHierarchyExporter = (ComposeViewHierarchyExporter) it.next();
                composeViewHierarchyExporter.getClass();
                if (view instanceof Owner) {
                    if (composeViewHierarchyExporter.f76205b == null) {
                        C20535s c20535sM56711a = composeViewHierarchyExporter.f76206c.m56711a();
                        try {
                            if (composeViewHierarchyExporter.f76205b == null) {
                                composeViewHierarchyExporter.f76205b = new C20300a(composeViewHierarchyExporter.f76204a);
                            }
                            AbstractC21598x.m60698r(c20535sM56711a, null);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC21598x.m60698r(c20535sM56711a, th3);
                                throw th4;
                            }
                        }
                    }
                    C0230n0 root = ((Owner) view).getRoot();
                    C20300a c20300a = composeViewHierarchyExporter.f76205b;
                    AbstractC22676k.m65747g(c20300a);
                    ComposeViewHierarchyExporter.m56301a(c20300a, c20487k0, root);
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt != null) {
                    C20487k0 c20487k0M55914c = m55914c(childAt);
                    arrayList.add(c20487k0M55914c);
                    m55913a(childAt, c20487k0M55914c, list);
                }
            }
            c20487k0.f76714K = arrayList;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C20487k0 m55914c(View view) {
        C20487k0 c20487k0 = new C20487k0();
        c20487k0.f76717x = AbstractC34132o.m107893v(view);
        try {
            c20487k0.f76718y = AbstractC20093i.m55972b(view);
        } catch (Throwable unused) {
        }
        c20487k0.f76710G = Double.valueOf(view.getX());
        c20487k0.f76711H = Double.valueOf(view.getY());
        c20487k0.f76708E = Double.valueOf(view.getWidth());
        c20487k0.f76709F = Double.valueOf(view.getHeight());
        c20487k0.f76713J = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            c20487k0.f76712I = "visible";
        } else if (visibility == 4) {
            c20487k0.f76712I = "invisible";
        } else if (visibility == 8) {
            c20487k0.f76712I = "gone";
        }
        return c20487k0;
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: h */
    public final C20321e5 mo55901h(C20321e5 c20321e5, C20337g0 c20337g0) {
        if (c20321e5.m56483g()) {
            SentryAndroidOptions sentryAndroidOptions = this.f75302w;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return c20321e5;
            }
            if (!AbstractC17269i.m48877X(c20337g0)) {
                boolean zM56000a = this.f75303x.m56000a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!zM56000a) {
                    WeakReference weakReference = (WeakReference) C20121k0.f75590b.f75591a;
                    C20485j0 c20485j0 = null;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    List<ComposeViewHierarchyExporter> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    InterfaceC20598a threadChecker = sentryAndroidOptions.getThreadChecker();
                    InterfaceC20602v0 logger = sentryAndroidOptions.getLogger();
                    if (activity == null) {
                        logger.mo16066m(EnumC20436n5.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.mo16066m(EnumC20436n5.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.mo16066m(EnumC20436n5.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.mo55996a()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        C20485j0 c20485j1 = new C20485j0("android_view_system", arrayList);
                                        C20487k0 c20487k0M55914c = m55914c(viewPeekDecorView);
                                        arrayList.add(c20487k0M55914c);
                                        m55913a(viewPeekDecorView, c20487k0M55914c, viewHierarchyExporters);
                                        c20485j0 = c20485j1;
                                    } else {
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        AtomicReference atomicReference = new AtomicReference(null);
                                        activity.runOnUiThread(new RunnableC18585k(atomicReference, viewPeekDecorView, viewHierarchyExporters, countDownLatch, logger));
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            c20485j0 = (C20485j0) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th3) {
                                    logger.mo16060j(EnumC20436n5.ERROR, "Failed to process view hierarchy.", th3);
                                }
                            }
                        }
                    }
                    if (c20485j0 != null) {
                        c20337g0.f76352e = C20040a.m55882c(c20485j0);
                    }
                }
            }
        }
        return c20321e5;
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: i */
    public final C20473d0 mo55902i(C20473d0 c20473d0, C20337g0 c20337g0) {
        return c20473d0;
    }
}
