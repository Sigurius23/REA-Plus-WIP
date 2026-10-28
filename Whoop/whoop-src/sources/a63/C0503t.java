package a63;

import java.nio.charset.Charset;
import java.util.Comparator;
import l83.C23465k;
import q83.AbstractC30060g;
import u63.AbstractC34560a;

/* JADX INFO: renamed from: a63.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C0503t implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1691w;

    public /* synthetic */ C0503t(int i13) {
        this.f1691w = i13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1691w) {
            case 0:
                return AbstractC30060g.m92127q(AbstractC34560a.m109275c((Charset) obj), AbstractC34560a.m109275c((Charset) obj2));
            default:
                return AbstractC30060g.m92127q((Float) ((C23465k) obj2).f92938x, (Float) ((C23465k) obj).f92938x);
        }
    }
}
