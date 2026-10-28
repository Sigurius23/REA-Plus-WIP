package p674z8;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import live.hms.video.error.ErrorCodes;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: z8.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C40167c extends AbstractC40166b {

    /* JADX INFO: renamed from: E */
    public final ContentResolver f173332E;

    /* JADX INFO: renamed from: F */
    public Uri f173333F;

    /* JADX INFO: renamed from: G */
    public AssetFileDescriptor f173334G;

    /* JADX INFO: renamed from: H */
    public FileInputStream f173335H;

    /* JADX INFO: renamed from: I */
    public long f173336I;

    /* JADX INFO: renamed from: J */
    public boolean f173337J;

    public C40167c(Context context) {
        super(false);
        this.f173332E = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p674z8.InterfaceC40170f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f173333F = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f173335H     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f173335H = r0
            android.content.res.AssetFileDescriptor r3 = r5.f173334G     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f173334G = r0
            boolean r0 = r5.f173337J
            if (r0 == 0) goto L2b
            r5.f173337J = r2
            r5.m128884b()
        L2b:
            return
        L2c:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f173334G = r0
            boolean r0 = r5.f173337J
            if (r0 == 0) goto L3d
            r5.f173337J = r2
            r5.m128884b()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f173335H = r0
            android.content.res.AssetFileDescriptor r4 = r5.f173334G     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f173334G = r0
            boolean r0 = r5.f173337J
            if (r0 == 0) goto L5d
            r5.f173337J = r2
            r5.m128884b()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f173334G = r0
            boolean r0 = r5.f173337J
            if (r0 == 0) goto L6f
            r5.f173337J = r2
            r5.m128884b()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p674z8.C40167c.close():void");
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        return this.f173333F;
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g c40171g) throws ContentDataSource$ContentDataSourceException {
        int i13;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = c40171g.f173343a;
                long j7 = c40171g.f173348f;
                long j13 = c40171g.f173347e;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f173333F = uriNormalizeScheme;
                m128885d();
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f173332E;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f173334G = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: " + uriNormalizeScheme);
                    i13 = ErrorCodes.InitAPIErrors.cServerErrors;
                    try {
                        throw new ContentDataSource$ContentDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, iOException);
                    } catch (IOException e5) {
                        e = e5;
                        if (e instanceof FileNotFoundException) {
                            i13 = 2005;
                        }
                        throw new ContentDataSource$ContentDataSourceException(i13, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f173335H = fileInputStream;
                if (length != -1 && j13 > length) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j13) - startOffset;
                if (jSkip != j13) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f173336I = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f173336I = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSource$ContentDataSourceException(2008, null);
                        }
                    }
                } else {
                    long j14 = length - jSkip;
                    this.f173336I = j14;
                    if (j14 < 0) {
                        throw new ContentDataSource$ContentDataSourceException(2008, null);
                    }
                }
                if (j7 != -1) {
                    long j15 = this.f173336I;
                    this.f173336I = j15 == -1 ? j7 : Math.min(j15, j7);
                }
                this.f173337J = true;
                m128886h(c40171g);
                return j7 != -1 ? j7 : this.f173336I;
            } catch (IOException e13) {
                e = e13;
                i13 = ErrorCodes.InitAPIErrors.cServerErrors;
            }
        } catch (ContentDataSource$ContentDataSourceException e14) {
            throw e14;
        }
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws ContentDataSource$ContentDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j7 = this.f173336I;
        if (j7 != 0) {
            if (j7 != -1) {
                try {
                    i14 = (int) Math.min(j7, i14);
                } catch (IOException e5) {
                    throw new ContentDataSource$ContentDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
                }
            }
            FileInputStream fileInputStream = this.f173335H;
            int i15 = AbstractC38065t.f163031a;
            int i16 = fileInputStream.read(bArr, i13, i14);
            if (i16 != -1) {
                long j13 = this.f173336I;
                if (j13 != -1) {
                    this.f173336I = j13 - ((long) i16);
                }
                m128883a(i16);
                return i16;
            }
        }
        return -1;
    }
}
