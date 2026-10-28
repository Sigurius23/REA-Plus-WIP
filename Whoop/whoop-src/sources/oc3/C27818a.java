package oc3;

import bc3.C2986a0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineExceptionHandler;
import q83.AbstractC30054a;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: oc3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C27818a extends AbstractC30054a implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: w */
    public static final C27818a f112069w = new C27818a(C2986a0.f11990w);

    /* JADX INFO: renamed from: x */
    public static final Object f112070x = new Object();

    static {
        new ArrayList();
        new LinkedHashMap();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C27818a) || (obj instanceof C27819b);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(InterfaceC30063j interfaceC30063j, Throwable th3) {
        synchronized (f112070x) {
        }
    }
}
