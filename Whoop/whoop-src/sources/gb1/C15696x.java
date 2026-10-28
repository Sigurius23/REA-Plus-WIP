package gb1;

import l01.AbstractC23041m;
import p208i2.C17894k0;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gb1.x */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15696x implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58931w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f58932x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f58933y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f58934z;

    public /* synthetic */ C15696x(float f13, float f14, int i13, Object obj) {
        this.f58931w = i13;
        this.f58934z = obj;
        this.f58932x = f13;
        this.f58933y = f14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58931w) {
            case 0:
                return AbstractC15697y.m44174g((C17919x) this.f58934z, this.f58932x, this.f58933y, (InterfaceC22131e) obj);
            default:
                return AbstractC23041m.m66860W((C17894k0) this.f58934z, this.f58932x, this.f58933y, (InterfaceC22131e) obj);
        }
    }
}
