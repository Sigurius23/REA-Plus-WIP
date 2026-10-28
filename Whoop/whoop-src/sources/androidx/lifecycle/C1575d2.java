package androidx.lifecycle;

import io.sentry.hints.C20363j;
import p298l8.AbstractC23420c;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1575d2 {

    /* JADX INFO: renamed from: b */
    public static final C20363j f6204b = new C20363j(9);

    /* JADX INFO: renamed from: a */
    public final Object f6205a;

    public C1575d2(C1579e2 store, InterfaceC1563a2 factory, AbstractC23420c defaultCreationExtras) {
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(factory, "factory");
        AbstractC22676k.m65750j(defaultCreationExtras, "defaultCreationExtras");
        this.f6205a = new C41113q(store, factory, defaultCreationExtras);
    }

    public C1575d2(ProcessLifecycleOwner processLifecycleOwner) {
        this.f6205a = processLifecycleOwner;
    }
}
