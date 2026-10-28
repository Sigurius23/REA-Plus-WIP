package or2;

import com.mapbox.maps.MapboxMap;
import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0003\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", MapboxMap.QFE_OFFSET, "numOfSamples", "Ljava/nio/ByteBuffer;", "byteBuffer", "Ltr2/n;", "logger", "", "a", "(IILjava/nio/ByteBuffer;Ltr2/n;)[S", "essentials_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28174k {
    /* JADX INFO: renamed from: a */
    public static final short[] m85286a(int i13, int i14, ByteBuffer byteBuffer, InterfaceC34116n interfaceC34116n) {
        AbstractC22676k.m65750j(byteBuffer, "byteBuffer");
        try {
            short[] sArr = new short[i14];
            byteBuffer.position(i13);
            byteBuffer.asShortBuffer().get(sArr);
            byteBuffer.rewind();
            return sArr;
        } catch (Exception e5) {
            if (interfaceC34116n != null) {
                interfaceC34116n.mo85230v("Caught an exception when trying to convert byte buffer to short array:", e5, new AbstractC30556a.a[0]);
            }
            return new short[0];
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ short[] m85287b(int i13, int i14, ByteBuffer byteBuffer, InterfaceC34116n interfaceC34116n, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            interfaceC34116n = null;
        }
        return m85286a(i13, i14, byteBuffer, interfaceC34116n);
    }
}
