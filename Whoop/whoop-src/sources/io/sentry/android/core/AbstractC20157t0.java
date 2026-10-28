package io.sentry.android.core;

import android.content.Context;
import io.sentry.C20535s;
import io.sentry.util.C20579a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: io.sentry.android.core.t0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20157t0 {

    /* JADX INFO: renamed from: a */
    public static String f75724a;

    /* JADX INFO: renamed from: b */
    public static final Charset f75725b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c */
    public static final C20579a f75726c = new C20579a();

    /* JADX INFO: renamed from: a */
    public static String m56061a(Context context) {
        C20535s c20535sM56711a = f75726c.m56711a();
        try {
            if (f75724a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean zExists = file.exists();
                    Charset charset = f75725b;
                    if (!zExists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String strM92131v = AbstractC30060g.m92131v();
                            fileOutputStream.write(strM92131v.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            f75724a = strM92131v;
                            c20535sM56711a.close();
                            return strM92131v;
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, charset);
                        randomAccessFile.close();
                        f75724a = str;
                    } catch (Throwable th5) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    throw new RuntimeException(th7);
                }
            }
            String str2 = f75724a;
            c20535sM56711a.close();
            return str2;
        } catch (Throwable th8) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th9) {
                th8.addSuppressed(th9);
            }
            throw th8;
        }
    }
}
