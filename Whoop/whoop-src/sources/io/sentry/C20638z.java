package io.sentry;

import com.google.crypto.tink.internal.C5101l0;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import no.nordicsemi.android.dfu.DfuBaseService;

/* JADX INFO: renamed from: io.sentry.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C20638z implements InterfaceC20536s0 {

    /* JADX INFO: renamed from: b */
    public static final Charset f77196b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final InterfaceC20390j1 f77197a;

    public C20638z(InterfaceC20390j1 interfaceC20390j1) {
        this.f77197a = interfaceC20390j1;
    }

    @Override // io.sentry.InterfaceC20536s0
    /* JADX INFO: renamed from: a */
    public final C5101l0 mo56667a(BufferedInputStream bufferedInputStream) throws IOException {
        InterfaceC20390j1 interfaceC20390j1 = this.f77197a;
        Charset charset = f77196b;
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i13 = 0;
        int i14 = -1;
        while (true) {
            try {
                int i15 = bufferedInputStream.read(bArr);
                if (i15 <= 0) {
                    break;
                }
                for (int i16 = 0; i14 == -1 && i16 < i15; i16++) {
                    if (bArr[i16] == 10) {
                        i14 = i13 + i16;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i15);
                i13 += i15;
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i14 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        StringReader stringReader = new StringReader(new String(byteArray, 0, i14, charset));
        try {
            C20619w4 c20619w4 = (C20619w4) interfaceC20390j1.mo56239e(stringReader, C20619w4.class);
            stringReader.close();
            if (c20619w4 == null) {
                throw new IllegalArgumentException("Envelope header is null.");
            }
            int i17 = i14 + 1;
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i18 = i17;
                while (true) {
                    if (i18 >= byteArray.length) {
                        i18 = -1;
                        break;
                    }
                    if (byteArray[i18] == 10) {
                        break;
                    }
                    i18++;
                }
                if (i18 == -1) {
                    throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                }
                StringReader stringReader2 = new StringReader(new String(byteArray, i17, i18 - i17, charset));
                try {
                    C20312d5 c20312d5 = (C20312d5) interfaceC20390j1.mo56239e(stringReader2, C20312d5.class);
                    stringReader2.close();
                    if (c20312d5 == null || c20312d5.m56447a() <= 0) {
                        throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
                    }
                    int iM56447a = c20312d5.m56447a() + i18;
                    int i19 = iM56447a + 1;
                    if (i19 > byteArray.length) {
                        throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i19 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                    }
                    arrayList.add(new C20275c5(c20312d5, Arrays.copyOfRange(byteArray, i18 + 1, i19)));
                    if (i19 == byteArray.length) {
                        break;
                    }
                    i17 = iM56447a + 2;
                    if (i17 == byteArray.length) {
                        if (byteArray[i19] == 10) {
                            break;
                        }
                        throw new IllegalArgumentException("Envelope has invalid data following an item.");
                    }
                } catch (Throwable th5) {
                    try {
                        stringReader2.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            }
            C5101l0 c5101l0 = new C5101l0(c20619w4, arrayList);
            byteArrayOutputStream.close();
            return c5101l0;
        } catch (Throwable th7) {
            try {
                stringReader.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }
}
