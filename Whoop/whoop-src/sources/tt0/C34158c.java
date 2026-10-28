package tt0;

import com.mapbox.maps.MapboxMap;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import uk0.C35048b;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: tt0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 ¨\u0006\""}, m65681d2 = {"Ltt0/c;", "", "<init>", "()V", "Ljava/util/zip/CRC32;", "crc", "Ljava/nio/ByteBuffer;", "buffer", "Ll83/a0;", "e", "(Ljava/util/zip/CRC32;Ljava/nio/ByteBuffer;)V", "data", "", MapboxMap.QFE_OFFSET, "length", "d", "(Ljava/nio/ByteBuffer;II)Ljava/lang/Integer;", "", "b", "([BII)I", "", "c", "(Ljava/nio/ByteBuffer;)J", "", "a", "(Ljava/nio/ByteBuffer;J)Z", "Ltr2/n;", "Ltr2/n;", "logger", "[B", "TABLE_CRC_8", "", "[I", "TABLE_CRC_16", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34158c {

    /* JADX INFO: renamed from: a */
    public static final C34158c f143182a = new C34158c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("CrcUtils");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final byte[] TABLE_CRC_8 = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, -32, -25, -18, -23, -4, -5, -14, -11, -40, -33, -42, -47, -60, -61, -54, -51, -112, -105, -98, -103, -116, -117, -126, -123, -88, -81, -90, -95, -76, -77, -70, -67, -57, -64, -55, -50, -37, -36, -43, -46, -1, -8, -15, -10, -29, -28, -19, -22, -73, -80, -71, -66, -85, -84, -91, -94, -113, -120, -127, -122, -109, -108, -99, -102, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, -119, -114, -121, -128, -107, -110, -101, -100, -79, -74, -65, -72, -83, -86, -93, -92, -7, -2, -9, -16, -27, -30, -21, -20, -63, -58, -49, -56, -35, -38, -45, -44, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, -82, -87, -96, -89, -78, -75, -68, -69, -106, -111, -104, -97, -118, -115, -124, -125, -34, -39, -48, -41, -62, -59, -52, -53, -26, -31, -24, -17, -6, -3, -12, -13};

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int[] TABLE_CRC_16 = {0, 49345, 49537, 320, 49921, 960, 640, 49729, 50689, 1728, 1920, 51009, 1280, 50625, 50305, 1088, 52225, 3264, 3456, 52545, 3840, 53185, 52865, 3648, 2560, 51905, 52097, 2880, 51457, 2496, 2176, 51265, 55297, 6336, 6528, 55617, 6912, 56257, 55937, 6720, 7680, 57025, 57217, 8000, 56577, 7616, 7296, 56385, 5120, 54465, 54657, 5440, 55041, 6080, 5760, 54849, 53761, 4800, 4992, 54081, 4352, 53697, 53377, 4160, 61441, 12480, 12672, 61761, 13056, 62401, 62081, 12864, 13824, 63169, 63361, 14144, 62721, 13760, 13440, 62529, 15360, 64705, 64897, 15680, 65281, 16320, 16000, 65089, 64001, 15040, 15232, 64321, 14592, 63937, 63617, 14400, 10240, 59585, 59777, 10560, 60161, 11200, 10880, 59969, 60929, 11968, 12160, 61249, 11520, 60865, 60545, 11328, 58369, 9408, 9600, 58689, 9984, 59329, 59009, 9792, 8704, 58049, 58241, 9024, 57601, 8640, 8320, 57409, 40961, 24768, 24960, 41281, 25344, 41921, 41601, 25152, 26112, 42689, 42881, 26432, 42241, 26048, 25728, 42049, 27648, 44225, 44417, 27968, 44801, 28608, 28288, 44609, 43521, 27328, 27520, 43841, 26880, 43457, 43137, 26688, 30720, 47297, 47489, 31040, 47873, 31680, 31360, 47681, 48641, 32448, 32640, 48961, 32000, 48577, 48257, 31808, 46081, 29888, 30080, 46401, 30464, 47041, 46721, 30272, 29184, 45761, 45953, 29504, 45313, 29120, 28800, 45121, 20480, 37057, 37249, 20800, 37633, 21440, 21120, 37441, 38401, 22208, 22400, 38721, 21760, 38337, 38017, 21568, 39937, 23744, 23936, 40257, 24320, 40897, 40577, 24128, 23040, 39617, 39809, 23360, 39169, 22976, 22656, 38977, 34817, 18624, 18816, 35137, 19200, 35777, 35457, 19008, 19968, 36545, 36737, 20288, 36097, 19904, 19584, 35905, 17408, 33985, 34177, 17728, 34561, 18368, 18048, 34369, 33281, 17088, 17280, 33601, 16640, 33217, 32897, 16448};

    private C34158c() {
    }

    /* JADX INFO: renamed from: e */
    private final void m107937e(CRC32 crc, ByteBuffer buffer) {
        int iPosition = buffer.position();
        int iLimit = buffer.limit() - iPosition;
        if (iLimit <= 0) {
            return;
        }
        if (buffer.hasArray()) {
            crc.update(buffer.array(), buffer.arrayOffset() + iPosition, iLimit);
            return;
        }
        byte[] bArr = new byte[iLimit];
        buffer.get(bArr);
        crc.update(bArr, 0, iLimit);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m107938a(ByteBuffer data, long crc) {
        AbstractC22676k.m65750j(data, "data");
        long jM107940c = m107940c(data);
        if (jM107940c == crc) {
            return true;
        }
        InterfaceC34116n interfaceC34116n = logger;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(jM107940c, "CRC32 computed ", " but expected ");
        sbM125596b.append(crc);
        interfaceC34116n.mo85226q(sbM125596b.toString(), new AbstractC30556a.a[0]);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final int m107939b(byte[] data, int offset, int length) {
        AbstractC22676k.m65750j(data, "data");
        int i13 = length + offset;
        int i14 = 65535;
        while (offset < i13) {
            i14 = TABLE_CRC_16[(i14 ^ (data[offset] & 255)) & 255] ^ (i14 >> 8);
            offset++;
        }
        return C35048b.f148538a.m110786e((short) i14);
    }

    /* JADX INFO: renamed from: c */
    public final long m107940c(ByteBuffer data) {
        AbstractC22676k.m65750j(data, "data");
        CRC32 crc32 = new CRC32();
        m107937e(crc32, data);
        return crc32.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final Integer m107941d(ByteBuffer data, int offset, int length) {
        if (data == null || length == 0 || data.limit() - offset < length) {
            return null;
        }
        byte b = 0;
        for (int i13 = 0; i13 < length; i13++) {
            b = TABLE_CRC_8[C35048b.m110782b((byte) (b ^ data.get(offset + i13)))];
        }
        return Integer.valueOf(b);
    }
}
