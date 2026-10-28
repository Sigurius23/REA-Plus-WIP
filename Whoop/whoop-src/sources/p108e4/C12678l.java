package p108e4;

import android.os.Handler;
import android.os.Looper;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p028b4.RunnableC2690a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: e4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C12678l extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43355w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12679m f43356x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12678l(C12679m c12679m, int i13) {
        super(1);
        this.f43355w = i13;
        this.f43356x = c12679m;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f43355w) {
            case 0:
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj;
                if (AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper())) {
                    interfaceC4339a.invoke();
                } else {
                    C12679m c12679m = this.f43356x;
                    Handler handler = c12679m.f43360x;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        c12679m.f43360x = handler;
                    }
                    handler.post(new RunnableC2690a(interfaceC4339a, 6));
                }
                break;
            default:
                this.f43356x.f43362z = true;
                break;
        }
        return C23454a0.f92919a;
    }
}
