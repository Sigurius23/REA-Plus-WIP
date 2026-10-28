package l83;

import c93.InterfaceC4339a;
import java.io.Serializable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23456b0 implements InterfaceC23462h, Serializable {

    /* JADX INFO: renamed from: w */
    public InterfaceC4339a f92923w;

    /* JADX INFO: renamed from: x */
    public Object f92924x;

    @Override // l83.InterfaceC23462h
    /* JADX INFO: renamed from: b */
    public final boolean mo5046b() {
        return this.f92924x != C23478x.f92956a;
    }

    @Override // l83.InterfaceC23462h
    public final Object getValue() {
        if (this.f92924x == C23478x.f92956a) {
            InterfaceC4339a interfaceC4339a = this.f92923w;
            AbstractC22676k.m65747g(interfaceC4339a);
            this.f92924x = interfaceC4339a.invoke();
            this.f92923w = null;
        }
        return this.f92924x;
    }

    public final String toString() {
        return mo5046b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
