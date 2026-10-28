package p618xk;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xk.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C38410a extends AbstractC38411b {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f164470E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38410a(ContentResolver contentResolver, Uri uri, int i13) {
        super(1, uri, contentResolver);
        this.f164470E = i13;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: b */
    public final Class mo33598b() {
        switch (this.f164470E) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p618xk.AbstractC38411b
    /* JADX INFO: renamed from: g */
    public final void mo123039g(Object obj) throws IOException {
        switch (this.f164470E) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // p618xk.AbstractC38411b
    /* JADX INFO: renamed from: h */
    public final Object mo123040h(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        switch (this.f164470E) {
            case 0:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor;
                }
                throw new FileNotFoundException(AbstractC31061c.m95637m(uri, "FileDescriptor is null for: "));
            default:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor2 != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException(AbstractC31061c.m95637m(uri, "FileDescriptor is null for: "));
        }
    }
}
