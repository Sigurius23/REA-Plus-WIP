package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import io.sentry.C20337g0;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20258b0;
import io.sentry.android.core.internal.util.C20106g;
import io.sentry.android.replay.viewhierarchy.AbstractC20252g;
import io.sentry.protocol.C20473d0;
import java.util.concurrent.atomic.AtomicBoolean;
import o73.C27648a;
import p006a4.AbstractC0354a;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class ScreenshotEventProcessor implements InterfaceC20258b0 {

    /* JADX INFO: renamed from: E */
    public final AtomicBoolean f75261E = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w */
    public final SentryAndroidOptions f75262w;

    /* JADX INFO: renamed from: x */
    public final C20121k0 f75263x;

    /* JADX INFO: renamed from: y */
    public final C20106g f75264y;

    /* JADX INFO: renamed from: z */
    public final boolean f75265z;

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C20121k0 c20121k0, boolean z4) {
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75262w = sentryAndroidOptions;
        this.f75263x = c20121k0;
        this.f75264y = new C20106g(2000L, 3);
        this.f75265z = z4;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            AbstractC21598x.m60683i("Screenshot");
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC20252g m55900a(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions = this.f75262w;
        try {
            View rootView = (activity.getWindow() == null || activity.getWindow().peekDecorView() == null || activity.getWindow().peekDecorView().getRootView() == null) ? null : activity.getWindow().peekDecorView().getRootView();
            if (rootView == null) {
                return null;
            }
            AbstractC20252g abstractC20252gM83550A = C27648a.m83550A(rootView, null, sentryAndroidOptions.getScreenshot());
            AbstractC0354a.m960G(rootView, abstractC20252gM83550A, sentryAndroidOptions.getScreenshot(), sentryAndroidOptions.getLogger(), null);
            return abstractC20252gM83550A;
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to build view hierarchy", th3);
            return null;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x012d */
    /* JADX WARN: Code duplicated, block: B:96:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.sentry.C20321e5 mo55901h(io.sentry.C20321e5 r14, io.sentry.C20337g0 r15) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ScreenshotEventProcessor.mo55901h(io.sentry.e5, io.sentry.g0):io.sentry.e5");
    }

    @Override // io.sentry.InterfaceC20258b0
    /* JADX INFO: renamed from: i */
    public final C20473d0 mo55902i(C20473d0 c20473d0, C20337g0 c20337g0) {
        return c20473d0;
    }
}
