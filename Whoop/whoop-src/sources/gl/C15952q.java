package gl;

import al.C0960g;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p273k6.C22222g;
import p586wk.InterfaceC37326d;

/* JADX INFO: renamed from: gl.q */
/* JADX INFO: loaded from: classes.dex */
public final class C15952q implements InterfaceC37326d {
    @Override // p586wk.InterfaceC37326d
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo45006a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p586wk.InterfaceC37326d
    /* JADX INFO: renamed from: b */
    public final ImageHeaderParser$ImageType mo45007b(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p586wk.InterfaceC37326d
    /* JADX INFO: renamed from: c */
    public final int mo45008c(InputStream inputStream, C0960g c0960g) {
        int iM63691c = new C22222g(inputStream).m63691c();
        if (iM63691c == 0) {
            return -1;
        }
        return iM63691c;
    }
}
