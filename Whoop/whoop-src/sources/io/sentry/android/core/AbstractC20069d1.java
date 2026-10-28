package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.C20513q6;
import io.sentry.InterfaceC20545t1;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.C20579a;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.d1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20069d1 {

    /* JADX INFO: renamed from: a */
    public static final long f75385a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b */
    public static final C20579a f75386b = new C20579a();

    /* JADX INFO: renamed from: a */
    public static void m55940a(C20513q6 c20513q6, boolean z4, boolean z13) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC20545t1 interfaceC20545t1 : c20513q6.getIntegrations()) {
            if (z4 && (interfaceC20545t1 instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC20545t1);
            }
            if (z13 && (interfaceC20545t1 instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC20545t1);
            }
            if (interfaceC20545t1 instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(interfaceC20545t1);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i13 = 0; i13 < arrayList2.size() - 1; i13++) {
                c20513q6.getIntegrations().remove((InterfaceC20545t1) arrayList2.get(i13));
            }
        }
        if (arrayList.size() > 1) {
            for (int i14 = 0; i14 < arrayList.size() - 1; i14++) {
                c20513q6.getIntegrations().remove((InterfaceC20545t1) arrayList.get(i14));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i15 = 0; i15 < arrayList3.size() - 1; i15++) {
                c20513q6.getIntegrations().remove((InterfaceC20545t1) arrayList3.get(i15));
            }
        }
    }
}
