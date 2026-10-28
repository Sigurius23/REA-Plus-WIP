package p618xk;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: xk.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C38419j extends AbstractC38411b {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f164485E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38419j(AssetManager assetManager, String str, int i13) {
        super(0, str, assetManager);
        this.f164485E = i13;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: b */
    public final Class mo33598b() {
        switch (this.f164485E) {
            case 0:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p618xk.AbstractC38411b
    /* JADX INFO: renamed from: g */
    public final void mo123039g(Object obj) throws IOException {
        switch (this.f164485E) {
            case 0:
                ((ParcelFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // p618xk.AbstractC38411b
    /* JADX INFO: renamed from: i */
    public final Object mo123043i(AssetManager assetManager, String str) {
        switch (this.f164485E) {
            case 0:
                return assetManager.openFd(str).getParcelFileDescriptor();
            default:
                return assetManager.open(str);
        }
    }
}
