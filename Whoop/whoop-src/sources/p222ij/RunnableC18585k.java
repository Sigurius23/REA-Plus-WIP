package p222ij;

import android.view.View;
import com.amplitude.quickjs.wrapper.QuickJSContext;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.protocol.C20485j0;
import io.sentry.protocol.C20487k0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p028b4.C2696g;

/* JADX INFO: renamed from: ij.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC18585k implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f72594E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f72595F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72596w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AtomicReference f72597x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ CountDownLatch f72598y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f72599z;

    public /* synthetic */ RunnableC18585k(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, InterfaceC20602v0 interfaceC20602v0) {
        this.f72597x = atomicReference;
        this.f72599z = view;
        this.f72594E = list;
        this.f72598y = countDownLatch;
        this.f72595F = interfaceC20602v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f72596w) {
            case 0:
                AtomicReference atomicReference = this.f72597x;
                C2696g c2696g = (C2696g) this.f72594E;
                QuickJSContext quickJSContext = (QuickJSContext) this.f72595F;
                AtomicReference atomicReference2 = (AtomicReference) this.f72599z;
                CountDownLatch countDownLatch = this.f72598y;
                try {
                    try {
                        atomicReference.set(c2696g.invoke(quickJSContext));
                        break;
                    } catch (Exception e5) {
                        atomicReference2.set(e5);
                        break;
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            default:
                AtomicReference atomicReference3 = this.f72597x;
                View view = (View) this.f72599z;
                List list = (List) this.f72594E;
                CountDownLatch countDownLatch2 = this.f72598y;
                InterfaceC20602v0 interfaceC20602v0 = (InterfaceC20602v0) this.f72595F;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    C20485j0 c20485j0 = new C20485j0("android_view_system", arrayList);
                    C20487k0 c20487k0M55914c = ViewHierarchyEventProcessor.m55914c(view);
                    arrayList.add(c20487k0M55914c);
                    ViewHierarchyEventProcessor.m55913a(view, c20487k0M55914c, list);
                    atomicReference3.set(c20485j0);
                    countDownLatch2.countDown();
                    return;
                } catch (Throwable th3) {
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Failed to process view hierarchy.", th3);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC18585k(AtomicReference atomicReference, C2696g c2696g, QuickJSContext quickJSContext, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.f72597x = atomicReference;
        this.f72594E = c2696g;
        this.f72595F = quickJSContext;
        this.f72599z = atomicReference2;
        this.f72598y = countDownLatch;
    }
}
