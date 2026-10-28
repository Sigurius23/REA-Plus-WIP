package p674z8;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import live.hms.video.error.ErrorCodes;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: z8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40165a extends AbstractC40166b {

    /* JADX INFO: renamed from: E */
    public final AssetManager f173323E;

    /* JADX INFO: renamed from: F */
    public Uri f173324F;

    /* JADX INFO: renamed from: G */
    public InputStream f173325G;

    /* JADX INFO: renamed from: H */
    public long f173326H;

    /* JADX INFO: renamed from: I */
    public boolean f173327I;

    public C40165a(Context context) {
        super(false);
        this.f173323E = context.getAssets();
    }

    @Override // p674z8.InterfaceC40170f
    public final void close() {
        this.f173324F = null;
        try {
            try {
                InputStream inputStream = this.f173325G;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f173325G = null;
                if (this.f173327I) {
                    this.f173327I = false;
                    m128884b();
                }
            } catch (IOException e5) {
                throw new AssetDataSource$AssetDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
            }
        } catch (Throwable th3) {
            this.f173325G = null;
            if (this.f173327I) {
                this.f173327I = false;
                m128884b();
            }
            throw th3;
        }
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        return this.f173324F;
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g c40171g) throws AssetDataSource$AssetDataSourceException {
        try {
            Uri uri = c40171g.f173343a;
            long j7 = c40171g.f173347e;
            this.f173324F = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m128885d();
            InputStream inputStreamOpen = this.f173323E.open(path, 1);
            this.f173325G = inputStreamOpen;
            if (inputStreamOpen.skip(j7) < j7) {
                throw new AssetDataSource$AssetDataSourceException(2008, null);
            }
            long j13 = c40171g.f173348f;
            if (j13 != -1) {
                this.f173326H = j13;
            } else {
                long jAvailable = this.f173325G.available();
                this.f173326H = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f173326H = -1L;
                }
            }
            this.f173327I = true;
            m128886h(c40171g);
            return this.f173326H;
        } catch (AssetDataSource$AssetDataSourceException e5) {
            throw e5;
        } catch (IOException e13) {
            throw new AssetDataSource$AssetDataSourceException(e13 instanceof FileNotFoundException ? 2005 : ErrorCodes.InitAPIErrors.cServerErrors, e13);
        }
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws AssetDataSource$AssetDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j7 = this.f173326H;
        if (j7 != 0) {
            if (j7 != -1) {
                try {
                    i14 = (int) Math.min(j7, i14);
                } catch (IOException e5) {
                    throw new AssetDataSource$AssetDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
                }
            }
            InputStream inputStream = this.f173325G;
            int i15 = AbstractC38065t.f163031a;
            int i16 = inputStream.read(bArr, i13, i14);
            if (i16 != -1) {
                long j13 = this.f173326H;
                if (j13 != -1) {
                    this.f173326H = j13 - ((long) i16);
                }
                m128883a(i16);
                return i16;
            }
        }
        return -1;
    }
}
