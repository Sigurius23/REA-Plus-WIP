package hx0;

import androidx.room.AbstractC1772c1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34844u0;
import yb3.C39412p;

/* JADX INFO: renamed from: hx0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"", "Ljava/nio/ByteBuffer;", "", "maxChunkSize", "Ltr2/n;", "logger", "Lud3/v0;", "a", "(Ljava/util/List;ILtr2/n;)Ljava/util/List;", "data-sync-service_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17705a {
    /* JADX INFO: renamed from: a */
    public static final List<AbstractC34846v0> m50682a(List<? extends ByteBuffer> list, int i13, InterfaceC34116n logger) throws IOException {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(logger, "logger");
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            int iLimit = 0;
            for (ByteBuffer byteBuffer : list) {
                if (iLimit >= i13) {
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C34844u0 c34844u0 = AbstractC34846v0.Companion;
                    AbstractC22676k.m65747g(byteArray);
                    C39412p c39412p = C34818h0.f146589e;
                    C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J(DfuBaseService.MIME_TYPE_OCTET_STREAM);
                    int length = byteArray.length;
                    c34844u0.getClass();
                    arrayList.add(C34844u0.m109926c(c34818h0M5373J, byteArray, 0, length));
                    byteArrayOutputStream.close();
                    gZIPOutputStream.close();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                        byteArrayOutputStream = byteArrayOutputStream2;
                        iLimit = 0;
                    } catch (IOException e5) {
                        e = e5;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        logger.mo85230v("Caught an exception when trying to gzip raw data into request bodies", e, new AbstractC30556a.a[0]);
                        byteArrayOutputStream.close();
                        gZIPOutputStream.close();
                        return arrayList;
                    }
                }
                gZIPOutputStream.write(byteBuffer.array());
                iLimit += byteBuffer.limit();
            }
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            C34844u0 c34844u1 = AbstractC34846v0.Companion;
            AbstractC22676k.m65747g(byteArray2);
            C39412p c39412p2 = C34818h0.f146589e;
            C34818h0 c34818h0M5373J2 = AbstractC1772c1.m5373J(DfuBaseService.MIME_TYPE_OCTET_STREAM);
            int length2 = byteArray2.length;
            c34844u1.getClass();
            arrayList.add(C34844u0.m109926c(c34818h0M5373J2, byteArray2, 0, length2));
            return arrayList;
        } catch (IOException e13) {
            e = e13;
        }
    }
}
