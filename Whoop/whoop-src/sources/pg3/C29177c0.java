package pg3;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: pg3.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C29177c0 extends AbstractC29184e1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f118148c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC29184e1 f118149d;

    public /* synthetic */ C29177c0(AbstractC29184e1 abstractC29184e1, int i13) {
        this.f118148c = i13;
        this.f118149d = abstractC29184e1;
    }

    @Override // pg3.AbstractC29184e1
    /* JADX INFO: renamed from: a */
    public final void mo88679a(C29212s0 c29212s0, Object obj) {
        switch (this.f118148c) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f118149d.mo88679a(c29212s0, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i13 = 0; i13 < length; i13++) {
                        this.f118149d.mo88679a(c29212s0, Array.get(obj, i13));
                    }
                    break;
                }
                break;
        }
    }
}
