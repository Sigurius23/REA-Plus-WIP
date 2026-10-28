package p491t1;

import java.util.Collection;
import java.util.List;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: t1.b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C33271b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138724w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Collection f138725x;

    public /* synthetic */ C33271b(int i13, Collection collection) {
        this.f138724w = i13;
        this.f138725x = collection;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zContains;
        switch (this.f138724w) {
            case 0:
                zContains = this.f138725x.contains(obj);
                break;
            case 1:
                zContains = this.f138725x.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.f138725x);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
