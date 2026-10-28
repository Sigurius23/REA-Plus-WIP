package p027b3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2381h implements InterfaceC2376g {

    /* JADX INFO: renamed from: a */
    public final AccessibilityManager f9390a;

    public C2381h(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f9390a = (AccessibilityManager) systemService;
    }
}
