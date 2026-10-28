package au0;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: au0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2051b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8160w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2055f f8161x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f8162y;

    public /* synthetic */ C2051b(C2055f c2055f, List list, int i13) {
        this.f8160w = i13;
        this.f8161x = c2055f;
        this.f8162y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8160w) {
            case 0:
                return this.f8161x.m6473t(this.f8162y, (InterfaceC33687a) obj);
            default:
                return this.f8161x.m6469p(this.f8162y, (InterfaceC33687a) obj);
        }
    }
}
