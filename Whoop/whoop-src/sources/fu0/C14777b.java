package fu0;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fu0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C14777b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54793w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14778c f54794x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f54795y;

    public /* synthetic */ C14777b(C14778c c14778c, List list, int i13) {
        this.f54793w = i13;
        this.f54794x = c14778c;
        this.f54795y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f54793w) {
            case 0:
                return this.f54794x.m42398k(this.f54795y, (InterfaceC33687a) obj);
            default:
                return this.f54794x.m42396i(this.f54795y, (InterfaceC33687a) obj);
        }
    }
}
