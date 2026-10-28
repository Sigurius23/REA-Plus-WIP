package f22;

import c93.InterfaceC4351m;
import g22.C15284d;
import java.util.Map;

/* JADX INFO: renamed from: f22.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C14030b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50061w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15284d f50062x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f50063y;

    public /* synthetic */ C14030b(C15284d c15284d, String str, int i13) {
        this.f50061w = i13;
        this.f50062x = c15284d;
        this.f50063y = str;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        Map map = (Map) obj2;
        switch (this.f50061w) {
            case 0:
                return AbstractC14031c.m39951y(this.f50062x, this.f50063y, str, map);
            default:
                return AbstractC14031c.m39945s(this.f50062x, this.f50063y, str, map);
        }
    }
}
