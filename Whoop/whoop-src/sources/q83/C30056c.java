package q83;

import c93.InterfaceC4351m;
import java.io.Serializable;
import p319m4.AbstractC25012a;
import p389p0.C28557w0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q83.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C30056c implements InterfaceC30063j, Serializable {

    /* JADX INFO: renamed from: w */
    public final InterfaceC30063j f122673w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC30061h f122674x;

    public C30056c(InterfaceC30061h element, InterfaceC30063j left) {
        AbstractC22676k.m65750j(left, "left");
        AbstractC22676k.m65750j(element, "element");
        this.f122673w = left;
        this.f122674x = element;
    }

    public final boolean equals(Object obj) {
        boolean zM65745e;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C30056c) {
            C30056c c30056c = (C30056c) obj;
            int i13 = 2;
            C30056c c30056c2 = c30056c;
            int i14 = 2;
            while (true) {
                InterfaceC30063j interfaceC30063j = c30056c2.f122673w;
                c30056c2 = interfaceC30063j instanceof C30056c ? (C30056c) interfaceC30063j : null;
                if (c30056c2 == null) {
                    break;
                }
                i14++;
            }
            C30056c c30056c3 = this;
            while (true) {
                InterfaceC30063j interfaceC30063j2 = c30056c3.f122673w;
                c30056c3 = interfaceC30063j2 instanceof C30056c ? (C30056c) interfaceC30063j2 : null;
                if (c30056c3 == null) {
                    break;
                }
                i13++;
            }
            if (i14 == i13) {
                C30056c c30056c4 = this;
                while (true) {
                    InterfaceC30061h interfaceC30061h = c30056c4.f122674x;
                    if (!AbstractC22676k.m65745e(c30056c.get(interfaceC30061h.getKey()), interfaceC30061h)) {
                        zM65745e = false;
                        break;
                    }
                    InterfaceC30063j interfaceC30063j3 = c30056c4.f122673w;
                    if (!(interfaceC30063j3 instanceof C30056c)) {
                        AbstractC22676k.m65748h(interfaceC30063j3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC30061h interfaceC30061h2 = (InterfaceC30061h) interfaceC30063j3;
                        zM65745e = AbstractC22676k.m65745e(c30056c.get(interfaceC30061h2.getKey()), interfaceC30061h2);
                        break;
                    }
                    c30056c4 = (C30056c) interfaceC30063j3;
                }
                if (zM65745e) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(this.f122673w.fold(obj, interfaceC4351m), this.f122674x);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        C30056c c30056c = this;
        while (true) {
            InterfaceC30061h interfaceC30061h = c30056c.f122674x.get(key);
            if (interfaceC30061h != null) {
                return interfaceC30061h;
            }
            InterfaceC30063j interfaceC30063j = c30056c.f122673w;
            if (!(interfaceC30063j instanceof C30056c)) {
                return interfaceC30063j.get(key);
            }
            c30056c = (C30056c) interfaceC30063j;
        }
    }

    public final int hashCode() {
        return this.f122674x.hashCode() + this.f122673w.hashCode();
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        InterfaceC30061h interfaceC30061h = this.f122674x;
        InterfaceC30061h interfaceC30061h2 = interfaceC30061h.get(key);
        InterfaceC30063j interfaceC30063j = this.f122673w;
        if (interfaceC30061h2 != null) {
            return interfaceC30063j;
        }
        InterfaceC30063j interfaceC30063jMinusKey = interfaceC30063j.minusKey(key);
        if (interfaceC30063jMinusKey == interfaceC30063j) {
            return this;
        }
        return interfaceC30063jMinusKey == C30064k.f122676w ? interfaceC30061h : new C30056c(interfaceC30061h, interfaceC30063jMinusKey);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        return context == C30064k.f122676w ? this : (InterfaceC30063j) context.fold(this, new C28557w0(24));
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("["), (String) fold("", new C28557w0(23)), ']');
    }
}
