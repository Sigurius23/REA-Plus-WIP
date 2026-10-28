package ha0;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ha0.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17053f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65568w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17054g f65569x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f65570y;

    public /* synthetic */ C17053f(C17054g c17054g, List list, int i13) {
        this.f65568w = i13;
        this.f65569x = c17054g;
        this.f65570y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f65568w) {
            case 0:
                return this.f65569x.m48161o(this.f65570y, (InterfaceC30057d) obj);
            default:
                return this.f65569x.m48160n(this.f65570y, (InterfaceC33687a) obj);
        }
    }
}
