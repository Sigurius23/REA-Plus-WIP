package hu1;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hu1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C17648e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68422w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17651h f68423x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f68424y;

    public /* synthetic */ C17648e(C17651h c17651h, List list, int i13) {
        this.f68422w = i13;
        this.f68423x = c17651h;
        this.f68424y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f68422w) {
            case 0:
                return this.f68423x.m50287j(this.f68424y, (InterfaceC33687a) obj);
            default:
                return this.f68423x.m50285h(this.f68424y, (InterfaceC33687a) obj);
        }
    }
}
