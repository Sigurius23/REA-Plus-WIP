package wq1;

import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: wq1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C37507a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160416w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37510d f160417x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f160418y;

    public /* synthetic */ C37507a(C37510d c37510d, Function1 function1, int i13) {
        this.f160416w = i13;
        this.f160417x = c37510d;
        this.f160418y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f160416w) {
            case 0:
                return AbstractC37509c.m120221F(this.f160417x, this.f160418y, (InterfaceC26064q) obj);
            default:
                return AbstractC37509c.m120226K(this.f160417x, this.f160418y, obj);
        }
    }
}
