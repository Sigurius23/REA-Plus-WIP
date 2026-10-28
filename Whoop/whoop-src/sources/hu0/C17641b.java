package hu0;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hu0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17641b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68397w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17642c f68398x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f68399y;

    public /* synthetic */ C17641b(C17642c c17642c, List list, int i13) {
        this.f68397w = i13;
        this.f68398x = c17642c;
        this.f68399y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f68397w) {
            case 0:
                return this.f68398x.m50266h(this.f68399y, (InterfaceC33687a) obj);
            default:
                return this.f68398x.m50267i(this.f68399y, (InterfaceC33687a) obj);
        }
    }
}
