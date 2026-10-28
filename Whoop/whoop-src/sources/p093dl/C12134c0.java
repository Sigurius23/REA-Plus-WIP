package p093dl;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: renamed from: dl.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12134c0 implements InterfaceC12156u {

    /* JADX INFO: renamed from: b */
    public static final C12134c0 f40362b = new C12134c0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40363a;

    public /* synthetic */ C12134c0(int i13) {
        this.f40363a = i13;
    }

    @Override // p093dl.InterfaceC12156u
    /* JADX INFO: renamed from: a */
    public final InterfaceC12155t mo33589a(C12161z c12161z) {
        switch (this.f40363a) {
            case 0:
                return C12136d0.f40366b;
            case 1:
                return new C12135d(new C12133c(0), 0);
            case 2:
                return new C12135d(new C12133c(1), 0);
            case 3:
                return new C12136d0(1);
            case 4:
                return new C12132b0(c12161z.m33621b(Uri.class, AssetFileDescriptor.class), 0);
            case 5:
                return new C12132b0(c12161z.m33621b(Uri.class, ParcelFileDescriptor.class), 0);
            case 6:
                return new C12132b0(c12161z.m33621b(Uri.class, InputStream.class), 0);
            default:
                return new C12142g0(c12161z.m33621b(C12144i.class, InputStream.class));
        }
    }
}
