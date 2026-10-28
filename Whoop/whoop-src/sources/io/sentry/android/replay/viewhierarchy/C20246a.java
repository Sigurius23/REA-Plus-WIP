package io.sentry.android.replay.viewhierarchy;

import c93.InterfaceC4339a;
import java.lang.reflect.Method;
import p005a3.C0230n0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20246a extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public static final C20246a f76053w = new C20246a(0);

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        try {
            Method declaredMethod = C0230n0.class.getDeclaredMethod("getCollapsedSemantics$ui_release", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}
