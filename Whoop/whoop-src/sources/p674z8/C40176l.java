package p674z8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import live.hms.video.error.ErrorCodes;
import p607x8.AbstractC38065t;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: z8.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C40176l extends AbstractC40166b {

    /* JADX INFO: renamed from: E */
    public final Context f173379E;

    /* JADX INFO: renamed from: F */
    public C40171g f173380F;

    /* JADX INFO: renamed from: G */
    public AssetFileDescriptor f173381G;

    /* JADX INFO: renamed from: H */
    public FileInputStream f173382H;

    /* JADX INFO: renamed from: I */
    public long f173383I;

    /* JADX INFO: renamed from: J */
    public boolean f173384J;

    public C40176l(Context context) {
        super(false);
        this.f173379E = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i13) {
        return Uri.parse("rawresource:///" + i13);
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
            r5.f173380F = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f173382H     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f173382H = r0
            android.content.res.AssetFileDescriptor r3 = r5.f173381G     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f173381G = r0
            boolean r0 = r5.f173384J
            if (r0 == 0) goto L2b
            r5.f173384J = r2
            r5.m128884b()
        L2b:
            return
        L2c:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r0, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f173381G = r0
            boolean r0 = r5.f173384J
            if (r0 == 0) goto L3d
            r5.f173384J = r2
            r5.m128884b()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r0, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f173382H = r0
            android.content.res.AssetFileDescriptor r4 = r5.f173381G     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f173381G = r0
            boolean r0 = r5.f173384J
            if (r0 == 0) goto L5d
            r5.f173384J = r2
            r5.m128884b()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r0, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f173381G = r0
            boolean r0 = r5.f173384J
            if (r0 == 0) goto L6f
            r5.f173384J = r2
            r5.m128884b()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p674z8.C40176l.close():void");
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        C40171g c40171g = this.f173380F;
        if (c40171g != null) {
            return c40171g.f173343a;
        }
        return null;
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g c40171g) throws RawResourceDataSource$RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        int i13;
        Resources resources;
        this.f173380F = c40171g;
        m128885d();
        Uri uri = c40171g.f173343a;
        long j7 = c40171g.f173348f;
        long j13 = c40171g.f173347e;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f173379E;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, "rawresource:// URI must have exactly one path element, found " + pathSegments.size(), ErrorCodes.InitAPIErrors.cServerErrors);
            }
            try {
                i13 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, "Resource identifier must be an integer.", MessageListItemViewType.CUSTOM_ATTACHMENTS);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, "Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", MessageListItemViewType.CUSTOM_ATTACHMENTS);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e5) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(e5, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, "Resource identifier must be an integer.", MessageListItemViewType.CUSTOM_ATTACHMENTS);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(AbstractC18489d0.m53370k(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, "Resource not found.", 2005);
                }
            }
            i13 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i13);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, AbstractC31061c.m95637m(uriNormalizeScheme, "Resource is compressed: "), ErrorCodes.InitAPIErrors.cServerErrors);
            }
            this.f173381G = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f173381G.getFileDescriptor());
            this.f173382H = fileInputStream;
            try {
                if (length != -1 && j13 > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.f173381G.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j13) - startOffset;
                if (jSkip != j13) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f173383I = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f173383I = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j14 = length - jSkip;
                    this.f173383I = j14;
                    if (j14 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j7 != -1) {
                    long j15 = this.f173383I;
                    this.f173383I = j15 == -1 ? j7 : Math.min(j15, j7);
                }
                this.f173384J = true;
                m128886h(c40171g);
                return j7 != -1 ? j7 : this.f173383I;
            } catch (RawResourceDataSource$RawResourceDataSourceException e13) {
                throw e13;
            } catch (IOException e14) {
                throw new RawResourceDataSource$RawResourceDataSourceException(e14, null, ErrorCodes.InitAPIErrors.cServerErrors);
            }
        } catch (Resources.NotFoundException e15) {
            throw new RawResourceDataSource$RawResourceDataSourceException(e15, null, 2005);
        }
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws RawResourceDataSource$RawResourceDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j7 = this.f173383I;
        if (j7 != 0) {
            if (j7 != -1) {
                try {
                    i14 = (int) Math.min(j7, i14);
                } catch (IOException e5) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(e5, null, ErrorCodes.InitAPIErrors.cServerErrors);
                }
            }
            FileInputStream fileInputStream = this.f173382H;
            int i15 = AbstractC38065t.f163031a;
            int i16 = fileInputStream.read(bArr, i13, i14);
            if (i16 != -1) {
                long j13 = this.f173383I;
                if (j13 != -1) {
                    this.f173383I = j13 - ((long) i16);
                }
                m128883a(i16);
                return i16;
            }
            if (this.f173383I != -1) {
                throw new RawResourceDataSource$RawResourceDataSourceException(new EOFException(), "End of stream reached having not read sufficient data.", ErrorCodes.InitAPIErrors.cServerErrors);
            }
        }
        return -1;
    }
}
