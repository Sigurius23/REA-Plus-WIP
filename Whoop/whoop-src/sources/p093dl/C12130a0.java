package p093dl;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: renamed from: dl.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12130a0 implements InterfaceC12156u {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40354a;

    /* JADX INFO: renamed from: b */
    public final Resources f40355b;

    public /* synthetic */ C12130a0(Resources resources, int i13) {
        this.f40354a = i13;
        this.f40355b = resources;
    }

    @Override // p093dl.InterfaceC12156u
    /* JADX INFO: renamed from: a */
    public final InterfaceC12155t mo33589a(C12161z c12161z) {
        switch (this.f40354a) {
            case 0:
                return new C12131b(this.f40355b, c12161z.m33621b(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C12131b(this.f40355b, c12161z.m33621b(Uri.class, ParcelFileDescriptor.class));
            case 2:
                return new C12131b(this.f40355b, c12161z.m33621b(Uri.class, InputStream.class));
            default:
                return new C12131b(this.f40355b, C12136d0.f40366b);
        }
    }
}
