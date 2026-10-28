package p283kl;

import al.C0960g;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;
import p479s4.AbstractC32121b;
import p586wk.C37330h;
import p586wk.InterfaceC37332j;
import p684zk.InterfaceC40801z;

/* JADX INFO: renamed from: kl.i */
/* JADX INFO: loaded from: classes.dex */
public final class C22560i implements InterfaceC37332j {

    /* JADX INFO: renamed from: a */
    public final ArrayList f88755a;

    /* JADX INFO: renamed from: b */
    public final C22552a f88756b;

    /* JADX INFO: renamed from: c */
    public final C0960g f88757c;

    public C22560i(ArrayList arrayList, C22552a c22552a, C0960g c0960g) {
        this.f88755a = arrayList;
        this.f88756b = c22552a;
        this.f88757c = c0960g;
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: a */
    public final InterfaceC40801z mo44989a(Object obj, int i13, int i14, C37330h c37330h) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(DfuBaseService.ERROR_CONNECTION_MASK);
        try {
            byte[] bArr = new byte[DfuBaseService.ERROR_CONNECTION_MASK];
            while (true) {
                int i15 = inputStream.read(bArr);
                if (i15 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i15);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e5);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f88756b.mo44989a(ByteBuffer.wrap(byteArray), i13, i14, c37330h);
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: b */
    public final boolean mo44990b(Object obj, C37330h c37330h) {
        return !((Boolean) c37330h.m119569c(AbstractC22559h.f88754b)).booleanValue() && AbstractC32121b.m100008n(this.f88755a, (InputStream) obj, this.f88757c) == ImageHeaderParser$ImageType.GIF;
    }
}
