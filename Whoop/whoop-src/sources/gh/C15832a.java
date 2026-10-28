package gh;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import mh.C25545m;
import p425qh.AbstractC30358d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C15832a implements InterfaceC15838g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59816a;

    public /* synthetic */ C15832a(int i13) {
        this.f59816a = i13;
    }

    @Override // gh.InterfaceC15838g
    /* JADX INFO: renamed from: a */
    public final InterfaceC15839h mo44669a(Object obj, C25545m c25545m) {
        switch (this.f59816a) {
            case 0:
                Uri uri = (Uri) obj;
                if (AbstractC30358d.m92829c(uri)) {
                    return new C15833b(uri, c25545m, 0);
                }
                return null;
            case 1:
                return new C15834c((Bitmap) obj, c25545m, 0);
            case 2:
                return new C15834c((ByteBuffer) obj, c25545m, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (AbstractC22676k.m65745e(uri2.getScheme(), "content")) {
                    return new C15835d(uri2, c25545m);
                }
                return null;
            case 4:
                return new C15834c((Drawable) obj, c25545m, 2);
            case 5:
                return new C15840i((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (AbstractC22676k.m65745e(uri3.getScheme(), "android.resource")) {
                    return new C15833b(uri3, c25545m, 1);
                }
                return null;
        }
    }
}
