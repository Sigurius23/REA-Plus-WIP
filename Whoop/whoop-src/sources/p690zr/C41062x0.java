package p690zr;

import java.util.AbstractMap;
import java.util.Objects;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: zr.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41062x0 extends AbstractC41023g0 {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C41064y0 f177071y;

    public C41062x0(C41064y0 c41064y0) {
        this.f177071y = c41064y0;
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: g */
    public final boolean mo133226g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        C41064y0 c41064y0 = this.f177071y;
        AbstractC31484o.m96957i(i13, c41064y0.f177076F);
        Object[] objArr = c41064y0.f177075E;
        int i14 = i13 * 2;
        Object obj = objArr[i14];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i14 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f177071y.f177076F;
    }
}
