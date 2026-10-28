package s83;

import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30058e;
import q83.InterfaceC30057d;
import q83.InterfaceC30059f;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: s83.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32269c extends AbstractC32267a {
    private final InterfaceC30063j _context;
    private transient InterfaceC30057d<Object> intercepted;

    public AbstractC32269c(InterfaceC30063j interfaceC30063j, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this._context = interfaceC30063j;
    }

    @Override // q83.InterfaceC30057d
    public InterfaceC30063j getContext() {
        InterfaceC30063j interfaceC30063j = this._context;
        AbstractC22676k.m65747g(interfaceC30063j);
        return interfaceC30063j;
    }

    public final InterfaceC30057d<Object> intercepted() {
        InterfaceC30057d interfaceC30057dInterceptContinuation = this.intercepted;
        if (interfaceC30057dInterceptContinuation == null) {
            InterfaceC30059f interfaceC30059f = (InterfaceC30059f) getContext().get(C30058e.f122675w);
            if (interfaceC30059f == null || (interfaceC30057dInterceptContinuation = interfaceC30059f.interceptContinuation(this)) == null) {
                interfaceC30057dInterceptContinuation = this;
            }
            this.intercepted = interfaceC30057dInterceptContinuation;
        }
        return interfaceC30057dInterceptContinuation;
    }

    @Override // s83.AbstractC32267a
    public void releaseIntercepted() {
        InterfaceC30057d<Object> interfaceC30057d = this.intercepted;
        if (interfaceC30057d != null && interfaceC30057d != this) {
            InterfaceC30061h interfaceC30061h = getContext().get(C30058e.f122675w);
            AbstractC22676k.m65747g(interfaceC30061h);
            ((InterfaceC30059f) interfaceC30061h).releaseInterceptedContinuation(interfaceC30057d);
        }
        this.intercepted = C32268b.f133570w;
    }

    public AbstractC32269c(InterfaceC30057d interfaceC30057d) {
        this(interfaceC30057d != null ? interfaceC30057d.getContext() : null, interfaceC30057d);
    }
}
