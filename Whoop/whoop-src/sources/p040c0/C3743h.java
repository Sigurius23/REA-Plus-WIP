package p040c0;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1581f0;
import androidx.lifecycle.InterfaceC1585g0;
import e63.C12776e;
import j93.AbstractC21478l0;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import l83.C23454a0;
import l83.C23465k;
import ne3.InterfaceC26620j;
import p027b3.C2427q0;
import p114eb.C12982q;
import p161g.C14923z;
import p179h.C16353k;
import p189hb.C17070f;
import p208i2.C17881e1;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p390p1.InterfaceC28670t2;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22665e0;

/* JADX INFO: renamed from: c0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3743h extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15311w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f15312x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f15313y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f15314z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3743h(Object obj, Object obj2, Object obj3, int i13) {
        super(1);
        this.f15311w = i13;
        this.f15312x = obj;
        this.f15313y = obj2;
        this.f15314z = obj3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws SocketTimeoutException {
        switch (this.f15311w) {
            case 0:
                return new C3740g((C39967p) this.f15312x, this.f15313y, (C3789x) this.f15314z, 0);
            case 1:
                InterfaceC17886g0 interfaceC17886g0 = (InterfaceC17886g0) obj;
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) this.f15313y;
                InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) this.f15312x;
                C17920x0 c17920x0 = (C17920x0) interfaceC17886g0;
                c17920x0.m51551a(interfaceC28670t3 != null ? ((Number) interfaceC28670t3.getValue()).floatValue() : 1.0f);
                c17920x0.m51560p(interfaceC28670t2 != null ? ((Number) interfaceC28670t2.getValue()).floatValue() : 1.0f);
                c17920x0.m51561r(interfaceC28670t2 != null ? ((Number) interfaceC28670t2.getValue()).floatValue() : 1.0f);
                InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) this.f15314z;
                c17920x0.m51565y(interfaceC28670t4 != null ? ((C17881e1) interfaceC28670t4.getValue()).f69568a : C17881e1.f69566b);
                return C23454a0.f92919a;
            case 2:
                C14923z c14923z = (C14923z) this.f15312x;
                InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) this.f15313y;
                C16353k c16353k = (C16353k) this.f15314z;
                c14923z.m43015a(interfaceC1585g0, c16353k);
                return new C2427q0(c16353k, 2);
            case 3:
                InterfaceC1585g0 interfaceC1585g1 = (InterfaceC1585g0) obj;
                C17070f c17070f = (C17070f) this.f15312x;
                ArrayList arrayList = c17070f.f65607g;
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) this.f15313y;
                boolean z4 = false;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (AbstractC22676k.m65745e(((C23465k) it.next()).f92937w, abstractComponentCallbacksC1320m0.getTag())) {
                            z4 = true;
                        }
                    }
                }
                if (interfaceC1585g1 != null && !z4) {
                    AbstractC1638x lifecycle = abstractComponentCallbacksC1320m0.getViewLifecycleOwner().getLifecycle();
                    if (lifecycle.getCurrentState().compareTo(EnumC1635w.f6327y) >= 0) {
                        lifecycle.mo4986a((InterfaceC1581f0) c17070f.f65609i.invoke((C12982q) this.f15314z));
                    }
                }
                return C23454a0.f92919a;
            default:
                ByteBuffer buffer = (ByteBuffer) obj;
                AbstractC22676k.m65750j(buffer, "buffer");
                try {
                    ((C22665e0) this.f15312x).f89334w = ((InterfaceC26620j) this.f15313y).read(buffer);
                    return C23454a0.f92919a;
                } catch (Throwable th3) {
                    C12776e c12776e = (C12776e) this.f15314z;
                    if (th3 instanceof SocketTimeoutException) {
                        throw AbstractC21478l0.m60429e(c12776e, th3);
                    }
                    throw th3;
                }
        }
    }
}
