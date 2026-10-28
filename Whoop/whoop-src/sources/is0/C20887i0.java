package is0;

import c93.InterfaceC4339a;
import com.whoop.navigation.models.GenericInteraction;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28690z0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: is0.i0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20887i0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78604w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f78605x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f78606y;

    public /* synthetic */ C20887i0(int i13, Object obj, Object obj2) {
        this.f78604w = i13;
        this.f78605x = obj;
        this.f78606y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f78604w) {
            case 0:
                return Boolean.valueOf(AbstractC20889j0.a.m57811i((InterfaceC28690z0) this.f78605x, (InterfaceC28690z0) this.f78606y));
            case 1:
                return AbstractC20900p.m57864s((Function1) this.f78605x, (C20874c) this.f78606y);
            case 2:
                return AbstractC20920z.m58017n((Function1) this.f78605x, (GenericInteraction) this.f78606y);
            case 3:
                return AbstractC20889j0.m57778k0((InterfaceC28601c1) this.f78605x, (Function1) this.f78606y);
            default:
                return Boolean.valueOf(AbstractC20889j0.m57749S((C20895m0) this.f78605x, (InterfaceC28601c1) this.f78606y));
        }
    }
}
