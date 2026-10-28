package p284ko;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import live.hms.video.error.ErrorCodes;
import p088dc.AbstractC11895b;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: ko.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C22639w extends AbstractC22616f {

    /* JADX INFO: renamed from: E */
    public RandomAccessFile f89078E;

    /* JADX INFO: renamed from: F */
    public Uri f89079F;

    /* JADX INFO: renamed from: G */
    public long f89080G;

    /* JADX INFO: renamed from: H */
    public boolean f89081H;

    @Override // p284ko.InterfaceC22628l
    public final void close() {
        this.f89079F = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f89078E;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f89078E = null;
                if (this.f89081H) {
                    this.f89081H = false;
                    m65558b();
                }
            } catch (IOException e5) {
                throw new FileDataSource$FileDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
            }
        } catch (Throwable th3) {
            this.f89078E = null;
            if (this.f89081H) {
                this.f89081H = false;
                m65558b();
            }
            throw th3;
        }
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        return this.f89079F;
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws FileDataSource$FileDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        long j7 = this.f89080G;
        if (j7 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f89078E;
            int i15 = AbstractC24567y.f95875a;
            int i16 = randomAccessFile.read(bArr, i13, (int) Math.min(j7, i14));
            if (i16 > 0) {
                this.f89080G -= (long) i16;
                m65557a(i16);
            }
            return i16;
        } catch (IOException e5) {
            throw new FileDataSource$FileDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
        }
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) throws FileDataSource$FileDataSourceException {
        Uri uri = c22630n.f89019a;
        long j7 = c22630n.f89023e;
        this.f89079F = uri;
        m65559d();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f89078E = randomAccessFile;
            try {
                randomAccessFile.seek(j7);
                long length = c22630n.f89024f;
                if (length == -1) {
                    length = this.f89078E.length() - j7;
                }
                this.f89080G = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.f89081H = true;
                m65560h(c22630n);
                return this.f89080G;
            } catch (IOException e5) {
                throw new FileDataSource$FileDataSourceException(ErrorCodes.InitAPIErrors.cServerErrors, e5);
            }
        } catch (FileNotFoundException e13) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException((AbstractC24567y.f95875a < 21 || !AbstractC22638v.m65585b(e13.getCause())) ? 2005 : 2006, e13);
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
}
