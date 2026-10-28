package qu0;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qu0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C30623b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125907w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30624c f125908x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f125909y;

    public /* synthetic */ C30623b(C30624c c30624c, List list, int i13) {
        this.f125907w = i13;
        this.f125908x = c30624c;
        this.f125909y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f125907w) {
            case 0:
                return this.f125908x.m94018j(this.f125909y, (InterfaceC33687a) obj);
            default:
                return this.f125908x.m94016h(this.f125909y, (InterfaceC33687a) obj);
        }
    }
}
