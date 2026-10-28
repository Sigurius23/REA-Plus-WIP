package g40;

import java.util.List;

/* JADX INFO: renamed from: g40.v3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15436v3 extends AbstractC15441w3 {

    /* JADX INFO: renamed from: b */
    public final boolean f58020b;

    public C15436v3(InterfaceC15361h1 interfaceC15361h1, boolean z4) {
        super(interfaceC15361h1);
        this.f58020b = z4;
    }

    @Override // g40.InterfaceC15421s3
    /* JADX INFO: renamed from: a */
    public final boolean mo43599a() {
        return false;
    }

    @Override // g40.InterfaceC15421s3
    /* JADX INFO: renamed from: b */
    public final boolean mo43600b(boolean z4, boolean z13) {
        return true;
    }

    @Override // g40.AbstractC15441w3, g40.InterfaceC15421s3
    /* JADX INFO: renamed from: c */
    public final boolean mo43601c() {
        return this.f58020b;
    }

    public /* synthetic */ C15436v3(int i13, int i14, List list) {
        this(i13, (i14 & 2) != 0 ? null : list, (i14 & 4) == 0);
    }

    public C15436v3(int i13, List list, boolean z4) {
        super(new C15349f1(i13, list));
        this.f58020b = z4;
    }
}
