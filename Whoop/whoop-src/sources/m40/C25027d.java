package m40;

import android.graphics.Bitmap;
import android.util.LruCache;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m40.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C25027d extends LruCache {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f98041a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25027d(int i13, int i14) {
        super(i13);
        this.f98041a = i14;
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.f98041a) {
            case 0:
                String key = (String) obj;
                C25032i image = (C25032i) obj2;
                AbstractC22676k.m65750j(key, "key");
                AbstractC22676k.m65750j(image, "image");
                return image.f98053b.getByteCount() / DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            default:
                String key2 = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                AbstractC22676k.m65750j(key2, "key");
                AbstractC22676k.m65750j(bitmap, "bitmap");
                return bitmap.getByteCount() / DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
    }
}
