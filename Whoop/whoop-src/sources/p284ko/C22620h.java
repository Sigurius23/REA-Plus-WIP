package p284ko;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import live.hms.video.error.ErrorCodes;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: ko.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C22620h extends AbstractC22616f {

    /* JADX INFO: renamed from: E */
    public final ContentResolver f88981E;

    /* JADX INFO: renamed from: F */
    public Uri f88982F;

    /* JADX INFO: renamed from: G */
    public AssetFileDescriptor f88983G;

    /* JADX INFO: renamed from: H */
    public FileInputStream f88984H;

    /* JADX INFO: renamed from: I */
    public long f88985I;

    /* JADX INFO: renamed from: J */
    public boolean f88986J;

    public C22620h(Context context) {
        super(false);
        this.f88981E = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p284ko.InterfaceC22628l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f88982F = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f88984H     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f88984H = r0
            android.content.res.AssetFileDescriptor r3 = r5.f88983G     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f88983G = r0
            boolean r0 = r5.f88986J
            if (r0 == 0) goto L2b
            r5.f88986J = r2
            r5.m65558b()
        L2b:
            return
        L2c:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f88983G = r0
            boolean r0 = r5.f88986J
            if (r0 == 0) goto L3d
            r5.f88986J = r2
            r5.m65558b()
        L3d:
            throw r1
        L3e:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f88984H = r0
            android.content.res.AssetFileDescriptor r4 = r5.f88983G     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f88983G = r0
            boolean r0 = r5.f88986J
            if (r0 == 0) goto L5d
            r5.f88986J = r2
            r5.m65558b()
        L5d:
            throw r3
        L5e:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f88983G = r0
            boolean r0 = r5.f88986J
            if (r0 == 0) goto L6f
            r5.f88986J = r2
            r5.m65558b()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p284ko.C22620h.close():void");
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        return this.f88982F;
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws ContentDataSource$ContentDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j7 = this.f88985I;
        if (j7 != 0) {
            if (j7 != -1) {
                try {
                    i14 = (int) Math.min(j7, i14);
                } catch (IOException e5) {
                    throw new ContentDataSource$ContentDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
                }
            }
            FileInputStream fileInputStream = this.f88984H;
            int i15 = AbstractC24567y.f95875a;
            int i16 = fileInputStream.read(bArr, i13, i14);
            if (i16 != -1) {
                long j13 = this.f88985I;
                if (j13 != -1) {
                    this.f88985I = j13 - ((long) i16);
                }
                m65557a(i16);
                return i16;
            }
        }
        return -1;
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) throws ContentDataSource$ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        int i13 = ErrorCodes.InitAPIErrors.cServerErrors;
        try {
            Uri uri = c22630n.f89019a;
            long j7 = c22630n.f89024f;
            long j13 = c22630n.f89023e;
            this.f88982F = uri;
            m65559d();
            boolean zEquals = "content".equals(c22630n.f89019a.getScheme());
            ContentResolver contentResolver = this.f88981E;
            if (zEquals) {
                Bundle bundle = new Bundle();
                if (AbstractC24567y.f95875a >= 31) {
                    AbstractC22618g.m65562a(bundle);
                }
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.f88983G = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb4 = new StringBuilder(strValueOf.length() + 36);
                sb4.append("Could not open file descriptor for: ");
                sb4.append(strValueOf);
                throw new ContentDataSource$ContentDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, new IOException(sb4.toString()));
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f88984H = fileInputStream;
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
                    this.f88985I = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f88985I = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSource$ContentDataSourceException(2008, null);
                    }
                }
            } else {
                long j14 = length - jSkip;
                this.f88985I = j14;
                if (j14 < 0) {
                    throw new ContentDataSource$ContentDataSourceException(2008, null);
                }
            }
            if (j7 != -1) {
                long j15 = this.f88985I;
                this.f88985I = j15 == -1 ? j7 : Math.min(j15, j7);
            }
            this.f88986J = true;
            m65560h(c22630n);
            return j7 != -1 ? j7 : this.f88985I;
        } catch (ContentDataSource$ContentDataSourceException e5) {
            throw e5;
        } catch (IOException e13) {
            if (e13 instanceof FileNotFoundException) {
                i13 = 2005;
            }
            throw new ContentDataSource$ContentDataSourceException(i13, e13);
        }
    }
}
