package w41;

import com.google.android.gms.maps.model.LatLngBounds;
import eu.C13612g;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: w41.l */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36812l implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157488w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f157489x;

    public /* synthetic */ C36812l(Object obj, int i13) {
        this.f157488w = i13;
        this.f157489x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f157488w) {
            case 0:
                return AbstractC36811k.c.m118017j((InterfaceC28601c1) this.f157489x, ((Boolean) obj).booleanValue());
            case 1:
                return AbstractC36811k.c.m118018k((InterfaceC28601c1) this.f157489x, ((Boolean) obj).booleanValue());
            case 2:
                return AbstractC36811k.c.m118019l((InterfaceC28601c1) this.f157489x, (LatLngBounds) obj);
            case 3:
                return AbstractC36811k.m118005s((InterfaceC28601c1) this.f157489x, ((Boolean) obj).booleanValue());
            case 4:
                return AbstractC36811k.m118006t((InterfaceC28601c1) this.f157489x, ((Boolean) obj).booleanValue());
            case 5:
                return AbstractC36811k.m118007u((InterfaceC28601c1) this.f157489x, (LatLngBounds) obj);
            case 6:
                return AbstractC36811k.m118008v((InterfaceC28601c1) this.f157489x, (LatLngBounds) obj);
            default:
                return AbstractC36800a.m117927g((C36823w) this.f157489x, (C13612g) obj);
        }
    }
}
