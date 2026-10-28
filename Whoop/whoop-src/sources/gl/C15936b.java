package gl;

import al.C0960g;
import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p586wk.C37329g;
import p586wk.C37330h;
import p586wk.InterfaceC37333k;
import p618xk.C38412c;
import p684zk.InterfaceC40801z;
import tl.AbstractC33908g;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: gl.b */
/* JADX INFO: loaded from: classes.dex */
public final class C15936b implements InterfaceC37333k {

    /* JADX INFO: renamed from: x */
    public static final C37329g f60335x = C37329g.m119568a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: y */
    public static final C37329g f60336y = new C37329g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C37329g.f159590e);

    /* JADX INFO: renamed from: w */
    public final C0960g f60337w;

    public C15936b(C0960g c0960g) {
        this.f60337w = c0960g;
    }

    @Override // p586wk.InterfaceC37325c
    /* JADX INFO: renamed from: c */
    public final boolean mo2345c(Object obj, File file, C37330h c37330h) throws Throwable {
        boolean z4;
        C0960g c0960g = this.f60337w;
        Bitmap bitmap = (Bitmap) ((InterfaceC40801z) obj).get();
        C37329g c37329g = f60336y;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c37330h.m119569c(c37329g);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        long jM107259b = AbstractC33908g.m107259b();
        int iIntValue = ((Integer) c37330h.m119569c(f60335x)).intValue();
        OutputStream c38412c = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        c38412c = new C38412c(fileOutputStream, c0960g);
                        bitmap.compress(compressFormat, iIntValue, c38412c);
                        c38412c.close();
                        try {
                            c38412c.close();
                        } catch (IOException unused) {
                        }
                        z4 = true;
                    } catch (IOException e5) {
                        e = e5;
                        c38412c = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (c38412c != null) {
                            try {
                                c38412c.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z4 = false;
                    } catch (Throwable th3) {
                        th = th3;
                        c38412c = fileOutputStream;
                        if (c38412c != null) {
                            try {
                                c38412c.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (IOException e13) {
                e = e13;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + AbstractC33913l.m107268c(bitmap) + " in " + AbstractC33908g.m107258a(jM107259b) + ", options format: " + c37330h.m119569c(c37329g) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z4;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // p586wk.InterfaceC37333k
    /* JADX INFO: renamed from: e */
    public final int mo44992e(C37330h c37330h) {
        return 2;
    }
}
