package p121el;

import java.io.InputStream;
import p093dl.C12132b0;
import p093dl.C12144i;
import p093dl.C12161z;
import p093dl.InterfaceC12155t;
import p093dl.InterfaceC12156u;

/* JADX INFO: renamed from: el.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13308b implements InterfaceC12156u {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46014a;

    public /* synthetic */ C13308b(int i13) {
        this.f46014a = i13;
    }

    @Override // p093dl.InterfaceC12156u
    /* JADX INFO: renamed from: a */
    public final InterfaceC12155t mo33589a(C12161z c12161z) {
        switch (this.f46014a) {
            case 0:
                return new C13309c(c12161z.m33621b(C12144i.class, InputStream.class));
            default:
                return new C12132b0(c12161z.m33621b(C12144i.class, InputStream.class), 1);
        }
    }
}
