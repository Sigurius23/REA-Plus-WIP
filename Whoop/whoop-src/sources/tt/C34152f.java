package tt;

import p073cq.C11040i;
import p533ut.C35227a;

/* JADX INFO: renamed from: tt.f */
/* JADX INFO: loaded from: classes.dex */
public final class C34152f implements InterfaceC34154h {

    /* JADX INFO: renamed from: a */
    public final C11040i f143152a;

    public C34152f(C11040i c11040i) {
        this.f143152a = c11040i;
    }

    @Override // tt.InterfaceC34154h
    /* JADX INFO: renamed from: a */
    public final boolean mo107929a(Exception exc) {
        return false;
    }

    @Override // tt.InterfaceC34154h
    /* JADX INFO: renamed from: b */
    public final boolean mo107930b(C35227a c35227a) {
        int i13 = c35227a.f149824b;
        if (i13 != 3 && i13 != 4 && i13 != 5) {
            return false;
        }
        this.f143152a.m29689d(c35227a.f149823a);
        return true;
    }
}
