package p093dl;

import java.io.File;
import p554vk.C36073a;
import p586wk.C37330h;
import sl.C32578d;
import ud3.InterfaceC34819i;

/* JADX INFO: renamed from: dl.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C12135d implements InterfaceC12155t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40364a;

    /* JADX INFO: renamed from: b */
    public final Object f40365b;

    public /* synthetic */ C12135d(Object obj, int i13) {
        this.f40364a = i13;
        this.f40365b = obj;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: a */
    public final boolean mo33590a(Object obj) {
        switch (this.f40364a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            case 2:
                return true;
            default:
                return true;
        }
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: b */
    public final C12154s mo33591b(Object obj, int i13, int i14, C37330h c37330h) {
        switch (this.f40364a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C12154s(new C32578d(bArr), new C12150o(1, bArr, (C12133c) this.f40365b));
            case 1:
                return new C12154s(new C32578d(obj), new C12141g(0, obj.toString(), (C12137e) this.f40365b));
            case 2:
                File file = (File) obj;
                return new C12154s(new C32578d(file), new C12141g(1, file, (C12137e) this.f40365b));
            default:
                C12144i c12144i = (C12144i) obj;
                return new C12154s(c12144i, new C36073a((InterfaceC34819i) this.f40365b, c12144i));
        }
    }
}
