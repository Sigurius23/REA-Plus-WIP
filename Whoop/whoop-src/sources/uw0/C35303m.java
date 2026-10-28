package uw0;

import java.util.List;
import p164g2.InterfaceC15237i;
import p181h2.C16617b;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: uw0.m */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35303m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150357w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f150358x;

    public /* synthetic */ C35303m(Object obj, int i13) {
        this.f150357w = i13;
        this.f150358x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f150357w) {
            case 0:
                return AbstractC35302l.c.m112043b((InterfaceC15237i) this.f150358x, (C16617b) obj);
            case 1:
                return AbstractC35302l.i.m112049b((InterfaceC15237i) this.f150358x, (C16617b) obj);
            default:
                return AbstractC35296f.m111998u((List) this.f150358x, (InterfaceC26064q) obj);
        }
    }
}
