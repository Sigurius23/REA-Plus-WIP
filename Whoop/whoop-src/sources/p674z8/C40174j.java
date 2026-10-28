package p674z8;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import live.hms.video.error.ErrorCodes;
import p088dc.AbstractC11895b;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: z8.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C40174j extends AbstractC40166b {

    /* JADX INFO: renamed from: E */
    public RandomAccessFile f173373E;

    /* JADX INFO: renamed from: F */
    public Uri f173374F;

    /* JADX INFO: renamed from: G */
    public long f173375G;

    /* JADX INFO: renamed from: H */
    public boolean f173376H;

    @Override // p674z8.InterfaceC40170f
    public final void close() {
        this.f173374F = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f173373E;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f173373E = null;
                if (this.f173376H) {
                    this.f173376H = false;
                    m128884b();
                }
            } catch (IOException e5) {
                throw new FileDataSource$FileDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
            }
        } catch (Throwable th3) {
            this.f173373E = null;
            if (this.f173376H) {
                this.f173376H = false;
                m128884b();
            }
            throw th3;
        }
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        return this.f173374F;
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g c40171g) throws FileDataSource$FileDataSourceException {
        Uri uri = c40171g.f173343a;
        long j7 = c40171g.f173347e;
        this.f173374F = uri;
        m128885d();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f173373E = randomAccessFile;
            try {
                randomAccessFile.seek(j7);
                long length = c40171g.f173348f;
                if (length == -1) {
                    length = this.f173373E.length() - j7;
                }
                this.f173375G = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.f173376H = true;
                m128886h(c40171g);
                return this.f173375G;
            } catch (IOException e5) {
                throw new FileDataSource$FileDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
            }
        } catch (FileNotFoundException e13) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(((e13.getCause() instanceof ErrnoException) && ((ErrnoException) e13.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e13);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM32001t.append(fragment);
            throw new FileDataSource$FileDataSourceException(e13, sbM32001t.toString(), MessageListItemViewType.CUSTOM_ATTACHMENTS);
        } catch (SecurityException e14) {
            throw new FileDataSource$FileDataSourceException(2006, e14);
        } catch (RuntimeException e15) {
            throw new FileDataSource$FileDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e15);
        }
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws FileDataSource$FileDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j7 = this.f173375G;
        if (j7 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f173373E;
            int i15 = AbstractC38065t.f163031a;
            int i16 = randomAccessFile.read(bArr, i13, (int) Math.min(j7, i14));
            if (i16 > 0) {
                this.f173375G -= (long) i16;
                m128883a(i16);
            }
            return i16;
        } catch (IOException e5) {
            throw new FileDataSource$FileDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
        }
    }
}
