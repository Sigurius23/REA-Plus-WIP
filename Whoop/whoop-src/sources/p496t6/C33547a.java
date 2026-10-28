package p496t6;

import c93.InterfaceC4351m;
import p335n6.InterfaceC26397n;
import p545v6.C35725n;
import p545v6.C35733v;

/* JADX INFO: renamed from: t6.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C33547a implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public static final C33547a f140014x = new C33547a(0);

    /* JADX INFO: renamed from: y */
    public static final C33547a f140015y = new C33547a(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140016w;

    public /* synthetic */ C33547a(int i13) {
        this.f140016w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f140016w) {
            case 0:
                InterfaceC26397n interfaceC26397n = (InterfaceC26397n) obj2;
                return interfaceC26397n instanceof C35733v ? interfaceC26397n : obj;
            default:
                InterfaceC26397n interfaceC26397n2 = (InterfaceC26397n) obj2;
                return interfaceC26397n2 instanceof C35725n ? interfaceC26397n2 : obj;
        }
    }
}
