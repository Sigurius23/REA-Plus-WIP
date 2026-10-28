package p093dl;

import java.io.File;
import p586wk.C37330h;
import sl.C32578d;

/* JADX INFO: renamed from: dl.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12136d0 implements InterfaceC12155t {

    /* JADX INFO: renamed from: b */
    public static final C12136d0 f40366b = new C12136d0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40367a;

    public /* synthetic */ C12136d0(int i13) {
        this.f40367a = i13;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: a */
    public final boolean mo33590a(Object obj) {
        switch (this.f40367a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: b */
    public final C12154s mo33591b(Object obj, int i13, int i14, C37330h c37330h) {
        switch (this.f40367a) {
            case 0:
                return new C12154s(new C32578d(obj), new C12139f(obj, 1));
            default:
                File file = (File) obj;
                return new C12154s(new C32578d(file), new C12139f(file, 0));
        }
    }
}
