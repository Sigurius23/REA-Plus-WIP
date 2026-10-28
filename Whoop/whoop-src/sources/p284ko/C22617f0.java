package p284ko;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import live.hms.video.error.ErrorCodes;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: ko.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C22617f0 extends AbstractC22616f {

    /* JADX INFO: renamed from: E */
    public final Resources f88971E;

    /* JADX INFO: renamed from: F */
    public final String f88972F;

    /* JADX INFO: renamed from: G */
    public Uri f88973G;

    /* JADX INFO: renamed from: H */
    public AssetFileDescriptor f88974H;

    /* JADX INFO: renamed from: I */
    public FileInputStream f88975I;

    /* JADX INFO: renamed from: J */
    public long f88976J;

    /* JADX INFO: renamed from: K */
    public boolean f88977K;

    public C22617f0(Context context) {
        super(false);
        this.f88971E = context.getResources();
        this.f88972F = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i13) {
        StringBuilder sb4 = new StringBuilder(26);
        sb4.append("rawresource:///");
        sb4.append(i13);
        return Uri.parse(sb4.toString());
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
            r5.f88973G = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f88975I     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f88975I = r0
            android.content.res.AssetFileDescriptor r3 = r5.f88974H     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f88974H = r0
            boolean r0 = r5.f88977K
            if (r0 == 0) goto L2b
            r5.f88977K = r2
            r5.m65558b()
        L2b:
            return
        L2c:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r0, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f88974H = r0
            boolean r0 = r5.f88977K
            if (r0 == 0) goto L3d
            r5.f88977K = r2
            r5.m65558b()
        L3d:
            throw r1
        L3e:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r0, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f88975I = r0
            android.content.res.AssetFileDescriptor r4 = r5.f88974H     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f88974H = r0
            boolean r0 = r5.f88977K
            if (r0 == 0) goto L5d
            r5.f88977K = r2
            r5.m65558b()
        L5d:
            throw r3
        L5e:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r0, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f88974H = r0
            boolean r0 = r5.f88977K
            if (r0 == 0) goto L6f
            r5.f88977K = r2
            r5.m65558b()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p284ko.C22617f0.close():void");
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        return this.f88973G;
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws RawResourceDataSource$RawResourceDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j7 = this.f88976J;
        if (j7 != 0) {
            if (j7 != -1) {
                try {
                    i14 = (int) Math.min(j7, i14);
                } catch (IOException e5) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(e5, null, ErrorCodes.InitAPIErrors.cServerErrors);
                }
            }
            FileInputStream fileInputStream = this.f88975I;
            int i15 = AbstractC24567y.f95875a;
            int i16 = fileInputStream.read(bArr, i13, i14);
            if (i16 != -1) {
                long j13 = this.f88976J;
                if (j13 != -1) {
                    this.f88976J = j13 - ((long) i16);
                }
                m65557a(i16);
                return i16;
            }
            if (this.f88976J != -1) {
                throw new RawResourceDataSource$RawResourceDataSourceException(new EOFException(), "End of stream reached having not read sufficient data.", ErrorCodes.InitAPIErrors.cServerErrors);
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) throws RawResourceDataSource$RawResourceDataSourceException {
        int identifier;
        Uri uri = c22630n.f89019a;
        long j7 = c22630n.f89024f;
        long j13 = c22630n.f89023e;
        this.f88973G = uri;
        boolean zEquals = TextUtils.equals("rawresource", uri.getScheme());
        Resources resources = this.f88971E;
        if (zEquals) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, "Resource identifier must be an integer.", MessageListItemViewType.CUSTOM_ATTACHMENTS);
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, "URI must either use scheme rawresource or android.resource", MessageListItemViewType.CUSTOM_ATTACHMENTS);
            }
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            String strValueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":"));
            String strValueOf2 = String.valueOf(path);
            identifier = resources.getIdentifier(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), "raw", this.f88972F);
            if (identifier == 0) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, "Resource not found.", 2005);
            }
        }
        m65559d();
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            this.f88974H = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                String strValueOf3 = String.valueOf(uri);
                StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 24);
                sb4.append("Resource is compressed: ");
                sb4.append(strValueOf3);
                throw new RawResourceDataSource$RawResourceDataSourceException(null, sb4.toString(), ErrorCodes.InitAPIErrors.cServerErrors);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f88975I = fileInputStream;
            try {
                if (length != -1 && j13 > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j13) - startOffset;
                if (jSkip != j13) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f88976J = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f88976J = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j14 = length - jSkip;
                    this.f88976J = j14;
                    if (j14 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j7 != -1) {
                    long j15 = this.f88976J;
                    this.f88976J = j15 == -1 ? j7 : Math.min(j15, j7);
                }
                this.f88977K = true;
                m65560h(c22630n);
                return j7 != -1 ? j7 : this.f88976J;
            } catch (RawResourceDataSource$RawResourceDataSourceException e5) {
                throw e5;
            } catch (IOException e13) {
                throw new RawResourceDataSource$RawResourceDataSourceException(e13, null, ErrorCodes.InitAPIErrors.cServerErrors);
            }
        } catch (Resources.NotFoundException e14) {
            throw new RawResourceDataSource$RawResourceDataSourceException(e14, null, 2005);
        }
    }
}
