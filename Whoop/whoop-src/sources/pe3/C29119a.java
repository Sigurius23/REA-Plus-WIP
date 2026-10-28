package pe3;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: pe3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C29119a implements InterfaceC29121c {

    /* JADX INFO: renamed from: w */
    public final ParcelFileDescriptor f117884w;

    /* JADX INFO: renamed from: a */
    public ParcelFileDescriptor m88489a() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.f117884w;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e5) {
            throw new IOException(e5);
        }
    }

    @Override // pe3.InterfaceC29121c
    public FileChannel getChannel() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = this.f117884w;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
    }
}
