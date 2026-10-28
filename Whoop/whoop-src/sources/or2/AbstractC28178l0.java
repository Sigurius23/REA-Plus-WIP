package or2;

import java.io.Closeable;
import java.io.IOException;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.l0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC28178l0 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f113895a = InterfaceC34116n.m107846d("IoUtils");

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m85295a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e5) {
                    f113895a.mo85230v("failed to close " + closeable, e5, new AbstractC30556a.a[0]);
                }
            }
        }
    }
}
