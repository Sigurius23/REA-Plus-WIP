package p390p1;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28600c0 implements InterfaceC28682w2 {

    /* JADX INFO: renamed from: a */
    public final Function1 f115713a;

    public C28600c0(Function1 function1) {
        this.f115713a = function1;
    }

    @Override // p390p1.InterfaceC28682w2
    /* JADX INFO: renamed from: a */
    public final Object mo86979a(InterfaceC28653p1 interfaceC28653p1) {
        return this.f115713a.invoke(interfaceC28653p1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28600c0) && AbstractC22676k.m65745e(this.f115713a, ((C28600c0) obj).f115713a);
    }

    public final int hashCode() {
        return this.f115713a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f115713a + ')';
    }
}
