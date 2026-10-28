package gb1;

import java.util.List;
import p208i2.AbstractC17911t;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gb1.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15685m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58876w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f58877x;

    public /* synthetic */ C15685m(Object obj, int i13) {
        this.f58876w = i13;
        this.f58877x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58876w) {
            case 0:
                return AbstractC15686n.m44131g((InterfaceC28601c1) this.f58877x, (InterfaceC39147y) obj);
            case 1:
                return AbstractC15673b0.m44063t((AbstractC17911t) this.f58877x, (InterfaceC22129c) obj);
            case 2:
                return AbstractC15673b0.m44023Z0((List) this.f58877x, (InterfaceC22131e) obj);
            default:
                return AbstractC15675c0.m44097g((InterfaceC28670t2) this.f58877x, (InterfaceC22131e) obj);
        }
    }
}
