package gh;

import android.webkit.MimeTypeMap;
import java.io.File;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import p092dh.C12029p;
import p092dh.EnumC12020g;
import p249jc.C21567b;
import q83.InterfaceC30057d;
import x83.AbstractC38093j;

/* JADX INFO: renamed from: gh.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C15840i implements InterfaceC15839h {

    /* JADX INFO: renamed from: a */
    public final File f59828a;

    public C15840i(File file) {
        this.f59828a = file;
    }

    @Override // gh.InterfaceC15839h
    /* JADX INFO: renamed from: a */
    public final Object mo44670a(InterfaceC30057d interfaceC30057d) {
        String str = C26611e0.f105848x;
        File file = this.f59828a;
        return new C15845n(new C12029p(C21567b.m60607p(file), AbstractC26632p.f105900w, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(AbstractC38093j.m122039m(file)), EnumC12020g.f39763y);
    }
}
