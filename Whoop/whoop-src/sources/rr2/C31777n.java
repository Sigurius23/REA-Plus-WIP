package rr2;

import io.sentry.InterfaceC20259b1;
import java.util.Map;
import kb1.C22325e;
import p715kotlin.jvm.functions.Function1;
import vo1.AbstractC36229d;

/* JADX INFO: renamed from: rr2.n */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31777n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131579w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Map f131580x;

    public /* synthetic */ C31777n(Map map, int i13) {
        this.f131579w = i13;
        this.f131580x = map;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f131579w) {
            case 0:
                return C31778o.m98670C(this.f131580x, (InterfaceC20259b1) obj);
            default:
                return AbstractC36229d.m115400T(this.f131580x, (C22325e) obj);
        }
    }
}
