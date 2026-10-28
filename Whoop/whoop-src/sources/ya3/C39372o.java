package ya3;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31111c;
import r93.InterfaceC31135k;
import ub3.C34754h;

/* JADX INFO: renamed from: ya3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C39372o implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169423w;

    /* JADX INFO: renamed from: x */
    public final Object f169424x;

    public /* synthetic */ C39372o(Object obj, int i13) {
        this.f169423w = i13;
        this.f169424x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f169423w) {
            case 0:
                C34754h c34754h = (C34754h) this.f169424x;
                AbstractC22676k.m65747g(obj);
                c34754h.add(obj);
                return C23454a0.f92919a;
            default:
                return Boolean.valueOf(((InterfaceC31111c) obj).mo60581g() == ((InterfaceC31135k) this.f169424x));
        }
    }
}
