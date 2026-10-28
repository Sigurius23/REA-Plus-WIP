package gl;

import al.C0960g;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import e10.C12554k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p000.AbstractC11266d;
import p586wk.InterfaceC37326d;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: gl.j */
/* JADX INFO: loaded from: classes.dex */
public final class C15945j implements InterfaceC37326d {

    /* JADX INFO: renamed from: a */
    public static final byte[] f60352a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    public static final int[] f60353b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: d */
    public static ImageHeaderParser$ImageType m45003d(InterfaceC15944i interfaceC15944i) {
        try {
            int iMo35230c = interfaceC15944i.mo35230c();
            if (iMo35230c == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo35234h = (iMo35230c << 8) | interfaceC15944i.mo35234h();
            if (iMo35234h == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo35234h2 = (iMo35234h << 8) | interfaceC15944i.mo35234h();
            if (iMo35234h2 == -1991225785) {
                interfaceC15944i.skip(21L);
                try {
                    return interfaceC15944i.mo35234h() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo35234h2 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            interfaceC15944i.skip(4L);
            if (((interfaceC15944i.mo35230c() << 16) | interfaceC15944i.mo35230c()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo35230c2 = (interfaceC15944i.mo35230c() << 16) | interfaceC15944i.mo35230c();
            if ((iMo35230c2 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i13 = iMo35230c2 & 255;
            if (i13 == 88) {
                interfaceC15944i.skip(4L);
                return (interfaceC15944i.mo35234h() & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (i13 != 76) {
                return ImageHeaderParser$ImageType.WEBP;
            }
            interfaceC15944i.skip(4L);
            return (interfaceC15944i.mo35234h() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m45004e(C12554k0 c12554k0) throws IOException {
        short sMo35234h;
        int iMo35230c;
        long j7;
        long jSkip;
        do {
            short sMo35234h2 = c12554k0.mo35234h();
            if (sMo35234h2 == 255) {
                sMo35234h = c12554k0.mo35234h();
                if (sMo35234h != 218) {
                    if (sMo35234h != 217) {
                        iMo35230c = c12554k0.mo35230c() - 2;
                        if (sMo35234h == 225) {
                            return iMo35230c;
                        }
                        j7 = iMo35230c;
                        jSkip = c12554k0.skip(j7);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo35234h2));
                return -1;
            }
            return -1;
        } while (jSkip == j7);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbM30465s = AbstractC11266d.m30465s(sMo35234h, iMo35230c, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
            sbM30465s.append(jSkip);
            Log.d("DfltImageHeaderParser", sbM30465s.toString());
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static int m45005f(C12554k0 c12554k0, byte[] bArr, int i13) throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteOrder byteOrder;
        int iM35221J = c12554k0.m35221J(i13, bArr);
        if (iM35221J == i13) {
            byte[] bArr2 = f60352a;
            boolean z4 = bArr != null && i13 > bArr2.length;
            if (z4) {
                for (int i14 = 0; i14 < bArr2.length; i14++) {
                    if (bArr[i14] != bArr2[i14]) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4) {
                C15943h c15943h = new C15943h(bArr, i13);
                short sM44999b = c15943h.m44999b(6);
                if (sM44999b != 18761) {
                    if (sM44999b != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sM44999b));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                c15943h.m45002g(byteOrder);
                int iM45000d = c15943h.m45000d(10);
                short sM44999b2 = c15943h.m44999b(iM45000d + 6);
                for (int i15 = 0; i15 < sM44999b2; i15++) {
                    int i16 = (i15 * 12) + iM45000d + 8;
                    short sM44999b3 = c15943h.m44999b(i16);
                    if (sM44999b3 == 274) {
                        short sM44999b4 = c15943h.m44999b(i16 + 2);
                        if (sM44999b4 >= 1 && sM44999b4 <= 12) {
                            int iM45000d2 = c15943h.m45000d(i16 + 4);
                            if (iM45000d2 >= 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sbM30465s = AbstractC11266d.m30465s(i15, sM44999b3, "Got tagIndex=", " tagType=", " formatCode=");
                                    sbM30465s.append((int) sM44999b4);
                                    sbM30465s.append(" componentCount=");
                                    sbM30465s.append(iM45000d2);
                                    Log.d("DfltImageHeaderParser", sbM30465s.toString());
                                }
                                int i17 = iM45000d2 + f60353b[sM44999b4];
                                if (i17 <= 4) {
                                    int i18 = i16 + 8;
                                    if (i18 >= 0 && i18 <= c15943h.m45001f()) {
                                        if (i17 >= 0 && i17 + i18 <= c15943h.m45001f()) {
                                            return c15943h.m44999b(i18);
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sM44999b3));
                                        }
                                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i18 + " tagType=" + ((int) sM44999b3));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sM44999b4));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sM44999b4));
                        }
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i13 + ", actually read: " + iM35221J);
            return -1;
        }
        return -1;
    }

    @Override // p586wk.InterfaceC37326d
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo45006a(ByteBuffer byteBuffer) {
        AbstractC29125c.m88539p(byteBuffer, "Argument must not be null");
        return m45003d(new C15943h(byteBuffer, 0));
    }

    @Override // p586wk.InterfaceC37326d
    /* JADX INFO: renamed from: b */
    public final ImageHeaderParser$ImageType mo45007b(InputStream inputStream) {
        return m45003d(new C12554k0(inputStream, 25));
    }

    @Override // p586wk.InterfaceC37326d
    /* JADX INFO: renamed from: c */
    public final int mo45008c(InputStream inputStream, C0960g c0960g) throws IOException {
        C12554k0 c12554k0 = new C12554k0(inputStream, 25);
        AbstractC29125c.m88539p(c0960g, "Argument must not be null");
        try {
            int iMo35230c = c12554k0.mo35230c();
            if ((iMo35230c & 65496) == 65496 || iMo35230c == 19789 || iMo35230c == 18761) {
                int iM45004e = m45004e(c12554k0);
                if (iM45004e != -1) {
                    byte[] bArr = (byte[]) c0960g.m2444c(iM45004e, byte[].class);
                    try {
                        return m45005f(c12554k0, bArr, iM45004e);
                    } finally {
                        c0960g.m2448g(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo35230c);
                return -1;
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
        }
        return -1;
    }
}
