package q83;

import c93.InterfaceC4351m;
import java.io.Serializable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q83.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C30064k implements InterfaceC30063j, Serializable {

    /* JADX INFO: renamed from: w */
    public static final C30064k f122676w = new C30064k();

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return obj;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return this;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
