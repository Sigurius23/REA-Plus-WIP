package hc3;

import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30062i;

/* JADX INFO: renamed from: hc3.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17166a0 implements InterfaceC30062i {

    /* JADX INFO: renamed from: w */
    public final ThreadLocal f65955w;

    public C17166a0(ThreadLocal threadLocal) {
        this.f65955w = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17166a0) && AbstractC22676k.m65745e(this.f65955w, ((C17166a0) obj).f65955w);
    }

    public final int hashCode() {
        return this.f65955w.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f65955w + ')';
    }
}
