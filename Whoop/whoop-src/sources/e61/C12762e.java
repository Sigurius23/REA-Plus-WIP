package e61;

import c93.InterfaceC4339a;
import h01.AbstractC16539f;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import k01.AbstractC22092d;
import m83.C25271y;
import ny0.AbstractC27242b1;
import ny0.AbstractC27249e;
import ny0.AbstractC27282u;
import p31.AbstractC28803n;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import vy0.AbstractC36578h0;
import x83.AbstractC38093j;

/* JADX INFO: renamed from: e61.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12762e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43650w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f43651x;

    public /* synthetic */ C12762e(InterfaceC4339a interfaceC4339a, int i13) {
        this.f43650w = i13;
        this.f43651x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f43650w) {
            case 0:
                return AbstractC12765h.m35744z(this.f43651x);
            case 1:
                return AbstractC12765h.m35742x(this.f43651x);
            case 2:
                return AbstractC12765h.m35743y(this.f43651x);
            case 3:
                File file = (File) this.f43651x.invoke();
                if (AbstractC38093j.m122039m(file).equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    AbstractC22676k.m65749i(absoluteFile, "getAbsoluteFile(...)");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 4:
                return AbstractC16539f.m46730i(this.f43651x);
            case 5:
                return AbstractC22092d.m63169D(this.f43651x);
            case 6:
                return AbstractC27249e.m82123f(this.f43651x);
            case 7:
                return AbstractC27282u.m82294j(this.f43651x);
            case 8:
                return AbstractC27242b1.m82094f(this.f43651x);
            case 9:
                return AbstractC28803n.m87599H(this.f43651x);
            case 10:
                return AbstractC33199m0.m105218J(this.f43651x);
            case 11:
                return AbstractC33199m0.m105219K(this.f43651x);
            case 12:
                try {
                    return (List) this.f43651x.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C25271y.f99162w;
                }
            default:
                return AbstractC36578h0.m117332J(this.f43651x);
        }
    }
}
