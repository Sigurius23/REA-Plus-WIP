package mu0;

import java.util.List;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mu0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25950b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102501w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25953e f102502x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f102503y;

    public /* synthetic */ C25950b(C25953e c25953e, List list, int i13) {
        this.f102501w = i13;
        this.f102502x = c25953e;
        this.f102503y = list;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f102501w) {
            case 0:
                return this.f102502x.m76808G(this.f102503y, (InterfaceC33687a) obj);
            default:
                return this.f102502x.m76823y(this.f102503y, (InterfaceC33687a) obj);
        }
    }
}
