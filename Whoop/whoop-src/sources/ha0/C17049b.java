package ha0;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ha0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17049b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65549w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17050c f65550x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f65551y;

    public /* synthetic */ C17049b(C17050c c17050c, List list, int i13) {
        this.f65549w = i13;
        this.f65550x = c17050c;
        this.f65551y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f65549w) {
            case 0:
                return this.f65550x.m48138o(this.f65551y, (InterfaceC30057d) obj);
            default:
                return this.f65550x.m48137n(this.f65551y, (InterfaceC33687a) obj);
        }
    }
}
