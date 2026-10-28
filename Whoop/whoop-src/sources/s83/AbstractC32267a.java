package s83;

import java.io.Serializable;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: s83.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32267a implements InterfaceC30057d, InterfaceC32270d, Serializable {
    private final InterfaceC30057d<Object> completion;

    public AbstractC32267a(InterfaceC30057d interfaceC30057d) {
        this.completion = interfaceC30057d;
    }

    public InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> completion) {
        AbstractC22676k.m65750j(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC32270d getCallerFrame() {
        InterfaceC30057d<Object> interfaceC30057d = this.completion;
        if (interfaceC30057d instanceof InterfaceC32270d) {
            return (InterfaceC32270d) interfaceC30057d;
        }
        return null;
    }

    public final InterfaceC30057d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return AbstractC32272f.m100434a(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        InterfaceC30057d<Object> interfaceC30057d = this;
        while (true) {
            AbstractC32267a abstractC32267a = (AbstractC32267a) interfaceC30057d;
            InterfaceC30057d<Object> interfaceC30057d2 = abstractC32267a.completion;
            AbstractC22676k.m65747g(interfaceC30057d2);
            try {
                obj = abstractC32267a.invokeSuspend(obj);
                if (obj == EnumC31071a.f128113w) {
                    return;
                }
            } catch (Throwable th3) {
                obj = AbstractC34132o.m107888l(th3);
            }
            abstractC32267a.releaseIntercepted();
            if (!(interfaceC30057d2 instanceof AbstractC32267a)) {
                interfaceC30057d2.resumeWith(obj);
                return;
            }
            interfaceC30057d = interfaceC30057d2;
        }
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb4.append(stackTraceElement);
        return sb4.toString();
    }

    public InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> completion) {
        AbstractC22676k.m65750j(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
