package vq0;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import e50.C12723b;
import java.io.File;
import java.io.InputStream;
import p273k6.C22222g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.C34117o;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vq0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lvq0/d;", "", "Ljava/io/File;", "filesDir", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/net/Uri;", "uri", "<init>", "(Ljava/io/File;Landroid/content/ContentResolver;Landroid/net/Uri;)V", "Landroid/graphics/Bitmap;", "a", "()Landroid/graphics/Bitmap;", "Ljava/io/File;", "getFilesDir", "()Ljava/io/File;", "b", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "c", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ltr2/o;", "d", "Ltr2/o;", "getLogger", "()Ltr2/o;", "logger", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36280d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final File filesDir;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ContentResolver contentResolver;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Uri uri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C34117o logger;

    public C36280d(File filesDir, ContentResolver contentResolver, Uri uri) {
        AbstractC22676k.m65750j(filesDir, "filesDir");
        AbstractC22676k.m65750j(contentResolver, "contentResolver");
        AbstractC22676k.m65750j(uri, "uri");
        this.filesDir = filesDir;
        this.contentResolver = contentResolver;
        this.uri = uri;
        InterfaceC34116n interfaceC34116nM35569d = C12723b.m35566a().m35569d();
        AbstractC22676k.m65749i(interfaceC34116nM35569d, "getLogger(...)");
        this.logger = new C34117o(interfaceC34116nM35569d, "PickedImageReceiver", null, 4, null);
    }

    @SuppressLint({"SetWorldWritable"})
    /* JADX INFO: renamed from: a */
    public final Bitmap m115968a() {
        float f13;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.contentResolver.openInputStream(this.uri));
        AbstractC22676k.m65749i(bitmapDecodeStream, "decodeStream(...)");
        InputStream inputStreamOpenInputStream = this.contentResolver.openInputStream(this.uri);
        AbstractC22676k.m65747g(inputStreamOpenInputStream);
        int iM63691c = new C22222g(inputStreamOpenInputStream).m63691c();
        if (iM63691c == 1) {
            return bitmapDecodeStream;
        }
        Matrix matrix = new Matrix();
        if (iM63691c == 3) {
            f13 = 180.0f;
        } else if (iM63691c != 6) {
            f13 = iM63691c != 8 ? 0.0f : 270.0f;
        } else {
            f13 = 90.0f;
        }
        matrix.postRotate(f13);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
        AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }
}
