package io.sentry.android.core.performance;

import android.os.Looper;
import io.sentry.AbstractC20576u4;
import io.sentry.EnumC20537s1;
import io.sentry.InterfaceC20408l1;
import io.sentry.android.core.internal.util.C20104e;

/* JADX INFO: renamed from: io.sentry.android.core.performance.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C20139b {

    /* JADX INFO: renamed from: a */
    public final String f75648a;

    /* JADX INFO: renamed from: b */
    public AbstractC20576u4 f75649b = null;

    /* JADX INFO: renamed from: c */
    public AbstractC20576u4 f75650c = null;

    /* JADX INFO: renamed from: d */
    public InterfaceC20408l1 f75651d = null;

    /* JADX INFO: renamed from: e */
    public InterfaceC20408l1 f75652e = null;

    public C20139b(String str) {
        this.f75648a = str;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC20408l1 m56040a(InterfaceC20408l1 interfaceC20408l1, String str, AbstractC20576u4 abstractC20576u4) {
        InterfaceC20408l1 interfaceC20408l1Mo56451d = interfaceC20408l1.mo56451d(str, abstractC20576u4, EnumC20537s1.SENTRY);
        interfaceC20408l1Mo56451d.mo56459o(Long.valueOf(C20104e.m55995d(Looper.getMainLooper().getThread())), "thread.id");
        interfaceC20408l1Mo56451d.mo56459o("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        interfaceC20408l1Mo56451d.mo56459o(bool, "ui.contributes_to_ttid");
        interfaceC20408l1Mo56451d.mo56459o(bool, "ui.contributes_to_ttfd");
        return interfaceC20408l1Mo56451d;
    }
}
