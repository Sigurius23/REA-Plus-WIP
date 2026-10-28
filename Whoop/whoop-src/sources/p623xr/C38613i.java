package p623xr;

import java.util.Objects;
import p460rg.AbstractC31375j;

/* JADX INFO: renamed from: xr.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C38613i extends AbstractC38611g {

    /* JADX INFO: renamed from: z */
    public static final C38613i f166119z = new C38613i(new Object[0]);

    /* JADX INFO: renamed from: y */
    public final transient Object[] f166120y;

    public C38613i(Object[] objArr) {
        this.f166120y = objArr;
    }

    @Override // p623xr.AbstractC38611g, p623xr.AbstractC38608d
    /* JADX INFO: renamed from: a */
    public final int mo123806a(Object[] objArr) {
        System.arraycopy(this.f166120y, 0, objArr, 0, 0);
        return 0;
    }

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: c */
    public final int mo123807c() {
        return 0;
    }

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: d */
    public final int mo123808d() {
        return 0;
    }

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: e */
    public final Object[] mo123809e() {
        return this.f166120y;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC31375j.m96486b(i13, 0);
        Object obj = this.f166120y[i13];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
