package sy2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import ty2.AbstractC34268a;

/* JADX INFO: renamed from: sy2.l */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33109l implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138107w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f138108x;

    public /* synthetic */ C33109l(Object obj, int i13) {
        this.f138107w = i13;
        this.f138108x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f138107w) {
            case 0:
                return AbstractC33110m.m104934i((AbstractC34268a.a.d) this.f138108x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC33113p.m104970x((AbstractC34268a.a.f) this.f138108x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC33114q.m104977e((Function1) this.f138108x, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
        }
    }
}
