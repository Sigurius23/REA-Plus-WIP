package p389p0;

import l83.C23454a0;
import p077d0.C11344e;
import p293l2.C23226c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p0.s */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C28548s implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115496w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23226c f115497x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28550t f115498y;

    public /* synthetic */ C28548s(C23226c c23226c, C28550t c28550t, int i13) {
        this.f115496w = i13;
        this.f115497x = c23226c;
        this.f115498y = c28550t;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C11344e c11344e = (C11344e) obj;
        switch (this.f115496w) {
            case 0:
                this.f115497x.m67212e(((Number) c11344e.m30549e()).floatValue());
                this.f115498y.f115503c.invoke();
                break;
            default:
                this.f115497x.m67212e(((Number) c11344e.m30549e()).floatValue());
                this.f115498y.f115503c.invoke();
                break;
        }
        return C23454a0.f92919a;
    }
}
