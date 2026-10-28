package we1;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: we1.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37219c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f159144w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37220d f159145x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f159146y;

    public /* synthetic */ C37219c(C37220d c37220d, List list, int i13) {
        this.f159144w = i13;
        this.f159145x = c37220d;
        this.f159146y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f159144w) {
            case 0:
                return this.f159145x.m119284l(this.f159146y, (InterfaceC30057d) obj);
            default:
                return this.f159145x.m119281i(this.f159146y, (InterfaceC33687a) obj);
        }
    }
}
