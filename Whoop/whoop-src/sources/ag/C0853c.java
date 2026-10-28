package ag;

import d13.AbstractC11478a;
import p647yf.InterfaceC39492e;
import p715kotlin.jvm.functions.Function3;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ag.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C0853c implements InterfaceC0852b {

    /* JADX INFO: renamed from: a */
    public final Object f3054a;

    public C0853c(Function3 function3) {
        this.f3054a = function3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function3] */
    @Override // ag.InterfaceC0852b
    /* JADX INFO: renamed from: a */
    public final Object mo2062a(Object obj, InterfaceC39492e interfaceC39492e, AbstractC32269c abstractC32269c) {
        return this.f3054a.invoke(obj, interfaceC39492e, abstractC32269c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0853c) && this.f3054a.equals(((C0853c) obj).f3054a);
    }

    public final int hashCode() {
        return this.f3054a.hashCode();
    }

    public final String toString() {
        return AbstractC11478a.m30860l(new StringBuilder("MiddlewareLambda(fn="), this.f3054a, ')');
    }
}
