package tt;

import p073cq.C11040i;
import p533ut.C35227a;

/* JADX INFO: renamed from: tt.e */
/* JADX INFO: loaded from: classes.dex */
public final class C34151e implements InterfaceC34154h {

    /* JADX INFO: renamed from: a */
    public final C34155i f143150a;

    /* JADX INFO: renamed from: b */
    public final C11040i f143151b;

    public C34151e(C34155i c34155i, C11040i c11040i) {
        this.f143150a = c34155i;
        this.f143151b = c11040i;
    }

    @Override // tt.InterfaceC34154h
    /* JADX INFO: renamed from: a */
    public final boolean mo107929a(Exception exc) {
        this.f143151b.m29688c(exc);
        return true;
    }

    @Override // tt.InterfaceC34154h
    /* JADX INFO: renamed from: b */
    public final boolean mo107930b(C35227a c35227a) {
        if (c35227a.f149824b != 4 || this.f143150a.m107932a(c35227a)) {
            return false;
        }
        String str = c35227a.f149825c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f143151b.m29687b(new C34147a(str, c35227a.f149827e, c35227a.f149828f));
        return true;
    }
}
