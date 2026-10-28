package zk2;

import androidx.compose.runtime.Composer;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: zk2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40840a implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176055w;

    public /* synthetic */ C40840a(int i13) {
        this.f176055w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f176055w) {
            case 0:
                return C40841b.m132353d((String) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return C40841b.m132354e((String) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC40850k.m132389f((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
