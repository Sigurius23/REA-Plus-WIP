package p284ko;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import live.hms.video.error.ErrorCodes;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: ko.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C22608b extends AbstractC22616f {

    /* JADX INFO: renamed from: E */
    public final AssetManager f88946E;

    /* JADX INFO: renamed from: F */
    public Uri f88947F;

    /* JADX INFO: renamed from: G */
    public InputStream f88948G;

    /* JADX INFO: renamed from: H */
    public long f88949H;

    /* JADX INFO: renamed from: I */
    public boolean f88950I;

    public C22608b(Context context) {
        super(false);
        this.f88946E = context.getAssets();
    }

    @Override // p284ko.InterfaceC22628l
    public final void close() {
        this.f88947F = null;
        try {
            try {
                InputStream inputStream = this.f88948G;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f88948G = null;
                if (this.f88950I) {
                    this.f88950I = false;
                    m65558b();
                }
            } catch (IOException e5) {
                throw new AssetDataSource$AssetDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
            }
        } catch (Throwable th3) {
            this.f88948G = null;
            if (this.f88950I) {
                this.f88950I = false;
                m65558b();
            }
            throw th3;
        }
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        return this.f88947F;
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws AssetDataSource$AssetDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j7 = this.f88949H;
        if (j7 != 0) {
            if (j7 != -1) {
                try {
                    i14 = (int) Math.min(j7, i14);
                } catch (IOException e5) {
                    throw new AssetDataSource$AssetDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
                }
            }
            InputStream inputStream = this.f88948G;
            int i15 = AbstractC24567y.f95875a;
            int i16 = inputStream.read(bArr, i13, i14);
            if (i16 != -1) {
                long j13 = this.f88949H;
                if (j13 != -1) {
                    this.f88949H = j13 - ((long) i16);
                }
                m65557a(i16);
                return i16;
            }
        }
        return -1;
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) throws AssetDataSource$AssetDataSourceException {
        try {
            Uri uri = c22630n.f89019a;
            long j7 = c22630n.f89023e;
            this.f88947F = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m65559d();
            InputStream inputStreamOpen = this.f88946E.open(path, 1);
            this.f88948G = inputStreamOpen;
            if (inputStreamOpen.skip(j7) < j7) {
                throw new AssetDataSource$AssetDataSourceException(2008, null);
            }
            long j13 = c22630n.f89024f;
            if (j13 != -1) {
                this.f88949H = j13;
            } else {
                long jAvailable = this.f88948G.available();
                this.f88949H = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f88949H = -1L;
                }
            }
            this.f88950I = true;
            m65560h(c22630n);
            return this.f88949H;
        } catch (AssetDataSource$AssetDataSourceException e5) {
            throw e5;
        } catch (IOException e13) {
            throw new AssetDataSource$AssetDataSourceException(e13 instanceof FileNotFoundException ? 2005 : ErrorCodes.InitAPIErrors.cServerErrors, e13);
        }
    }
}
