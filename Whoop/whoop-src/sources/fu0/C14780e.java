package fu0;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fu0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C14780e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54802w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14781f f54803x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f54804y;

    public /* synthetic */ C14780e(C14781f c14781f, List list, int i13) {
        this.f54802w = i13;
        this.f54803x = c14781f;
        this.f54804y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f54802w) {
            case 0:
                return this.f54803x.m42412k(this.f54804y, (InterfaceC33687a) obj);
            default:
                return this.f54803x.m42410i(this.f54804y, (InterfaceC33687a) obj);
        }
    }
}
