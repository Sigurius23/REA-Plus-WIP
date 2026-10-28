package p093dl;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;
import p586wk.C37330h;

/* JADX INFO: renamed from: dl.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12132b0 implements InterfaceC12155t {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40359a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12155t f40360b;

    public /* synthetic */ C12132b0(InterfaceC12155t interfaceC12155t, int i13) {
        this.f40359a = i13;
        this.f40360b = interfaceC12155t;
    }

    @Override // p093dl.InterfaceC12155t
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo33590a(Object obj) {
        switch (this.f40359a) {
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
        Uri uriFromFile;
        switch (this.f40359a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                InterfaceC12155t interfaceC12155t = this.f40360b;
                if (interfaceC12155t.mo33590a(uriFromFile)) {
                    return interfaceC12155t.mo33591b(uriFromFile, i13, i14, c37330h);
                }
                return null;
            default:
                return this.f40360b.mo33591b(new C12144i((URL) obj), i13, i14, c37330h);
        }
    }
}
