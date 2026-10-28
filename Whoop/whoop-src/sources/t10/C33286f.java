package t10;

import d30.C11530f0;
import ec3.C13045h2;
import l83.C23454a0;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import q20.AbstractC29840y;
import s10.C32064f;

/* JADX INFO: renamed from: t10.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C33286f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138827w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11530f0 f138828x;

    public /* synthetic */ C33286f(C11530f0 c11530f0, int i13) {
        this.f138827w = i13;
        this.f138828x = c11530f0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        switch (this.f138827w) {
            case 0:
                InterfaceC41211c interfaceC41211c = (InterfaceC41211c) obj;
                C13045h2 c13045h2 = ((C33285e) this.f138828x.f37155h).f138824f;
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C33290j.m105602a((C33290j) value, null, false, null, false, interfaceC41211c, null, 95)));
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C13045h2 c13045h3 = ((C33285e) this.f138828x.f37155h).f138824f;
                do {
                    value2 = c13045h3.getValue();
                } while (!c13045h3.m36569i(value2, C33290j.m105602a((C33290j) value2, null, zBooleanValue, null, false, null, null, 125)));
                break;
            default:
                ((C32064f) this.f138828x.f37152e).m99630a((AbstractC29840y) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
