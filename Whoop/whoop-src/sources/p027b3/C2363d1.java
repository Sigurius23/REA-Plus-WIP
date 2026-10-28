package p027b3;

import android.view.Choreographer;
import androidx.room.C1774d;
import bc3.C3033m;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import l83.C23454a0;
import p117eh.C13184a;
import p390p1.C28637l1;
import p390p1.InterfaceC28680w0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: b3.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2363d1 implements InterfaceC28680w0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9327w;

    /* JADX INFO: renamed from: x */
    public final Object f9328x;

    /* JADX INFO: renamed from: y */
    public final Object f9329y;

    public C2363d1(Choreographer choreographer, C2353b1 c2353b1) {
        this.f9327w = 0;
        this.f9328x = choreographer;
        this.f9329y = c2353b1;
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        switch (this.f9327w) {
            case 0:
                break;
        }
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        switch (this.f9327w) {
            case 0:
                break;
        }
        return AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // p390p1.InterfaceC28680w0
    /* JADX INFO: renamed from: k */
    public final Object mo7286k(Function1 function1, InterfaceC30057d interfaceC30057d) {
        C28637l1 c28637l1;
        boolean z4;
        Object objM8773r;
        int i13 = 2;
        switch (this.f9327w) {
            case 0:
                C2353b1 c2353b1 = (C2353b1) this.f9329y;
                C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
                c3033m.m8774s();
                ChoreographerFrameCallbackC2358c1 choreographerFrameCallbackC2358c1 = new ChoreographerFrameCallbackC2358c1(c3033m, this, function1);
                if (AbstractC22676k.m65745e(c2353b1.f9302w, (Choreographer) this.f9328x)) {
                    synchronized (c2353b1.f9304y) {
                        c2353b1.f9296E.add(choreographerFrameCallbackC2358c1);
                        if (!c2353b1.f9299H) {
                            c2353b1.f9299H = true;
                            c2353b1.f9302w.postFrameCallback(c2353b1.f9300I);
                        }
                        break;
                    }
                    c3033m.m8776u(new C2442t0(i13, c2353b1, choreographerFrameCallbackC2358c1));
                } else {
                    ((Choreographer) this.f9328x).postFrameCallback(choreographerFrameCallbackC2358c1);
                    c3033m.m8776u(new C2442t0(3, this, choreographerFrameCallbackC2358c1));
                }
                Object objM8773r2 = c3033m.m8773r();
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                return objM8773r2;
            default:
                if (interfaceC30057d instanceof C28637l1) {
                    c28637l1 = (C28637l1) interfaceC30057d;
                    int i14 = c28637l1.f115828z;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c28637l1.f115828z = i14 - Integer.MIN_VALUE;
                    } else {
                        c28637l1 = new C28637l1(this, interfaceC30057d);
                    }
                } else {
                    c28637l1 = new C28637l1(this, interfaceC30057d);
                }
                Object obj = c28637l1.f115826x;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = c28637l1.f115828z;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13184a c13184a = (C13184a) this.f9329y;
                    c28637l1.f115825w = function1;
                    c28637l1.f115828z = 1;
                    synchronized (c13184a.f45697b) {
                        z4 = c13184a.f45696a;
                    }
                    if (z4) {
                        objM8773r = C23454a0.f92919a;
                    } else {
                        C3033m c3033m2 = new C3033m(1, AbstractC15751g.m44424D(c28637l1));
                        c3033m2.m8774s();
                        synchronized (c13184a.f45697b) {
                            ((ArrayList) c13184a.f45698c).add(c3033m2);
                        }
                        c3033m2.m8776u(new C1774d(7, c13184a, c3033m2));
                        objM8773r = c3033m2.m8773r();
                        if (objM8773r != enumC31071a2) {
                            objM8773r = C23454a0.f92919a;
                        }
                    }
                    if (objM8773r != enumC31071a2) {
                    }
                    return enumC31071a2;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                function1 = c28637l1.f115825w;
                AbstractC34132o.m107864I(obj);
                InterfaceC28680w0 interfaceC28680w0 = (InterfaceC28680w0) this.f9328x;
                c28637l1.f115825w = null;
                c28637l1.f115828z = 2;
                Object objMo7286k = interfaceC28680w0.mo7286k(function1, c28637l1);
                if (objMo7286k != enumC31071a2) {
                    return objMo7286k;
                }
                return enumC31071a2;
        }
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        switch (this.f9327w) {
            case 0:
                break;
        }
        return AbstractC12889b.m36251Q(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        switch (this.f9327w) {
            case 0:
                break;
        }
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }

    public C2363d1(InterfaceC28680w0 interfaceC28680w0) {
        this.f9327w = 1;
        this.f9328x = interfaceC28680w0;
        this.f9329y = new C13184a(2);
    }
}
