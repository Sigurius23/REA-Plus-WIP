package p121el;

import ad3.C0783z;
import p093dl.C12144i;
import p093dl.C12152q;
import p093dl.C12153r;
import p093dl.C12154s;
import p093dl.InterfaceC12155t;
import p586wk.C37329g;
import p586wk.C37330h;
import p618xk.C38420k;

/* JADX INFO: renamed from: el.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C13307a implements InterfaceC12155t {

    /* JADX INFO: renamed from: b */
    public static final C37329g f46012b = C37329g.m119568a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a */
    public final C0783z f46013a;

    public C13307a(C0783z c0783z) {
        this.f46013a = c0783z;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo33590a(Object obj) {
        return true;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: b */
    public final C12154s mo33591b(Object obj, int i13, int i14, C37330h c37330h) {
        C12144i c12144i = (C12144i) obj;
        C0783z c0783z = this.f46013a;
        if (c0783z != null) {
            C12152q c12152q = (C12152q) c0783z.f2818x;
            C12153r c12153rM33615a = C12153r.m33615a(c12144i);
            Object objM107260a = c12152q.m107260a(c12153rM33615a);
            c12153rM33615a.m33616b();
            C12144i c12144i2 = (C12144i) objM107260a;
            if (c12144i2 == null) {
                c12152q.m107261d(C12153r.m33615a(c12144i), c12144i);
            } else {
                c12144i = c12144i2;
            }
        }
        return new C12154s(c12144i, new C38420k(c12144i, ((Integer) c37330h.m119569c(f46012b)).intValue()));
    }
}
