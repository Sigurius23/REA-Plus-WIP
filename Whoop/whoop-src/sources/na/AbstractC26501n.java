package na;

import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import p010a9.AbstractC0576a;
import p031b9.AbstractC2875y;
import p074cs.C11094a;
import p094dn.C12194n;
import p188ha.AbstractC17041j;
import p188ha.C17032a;
import p188ha.C17036e;
import p188ha.C17046o;
import p319m4.AbstractC25012a;
import p499t9.InterfaceC33635i0;
import p499t9.InterfaceC33646o;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.InterfaceC34583b0;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import p641y8.C39306a;
import p690zr.AbstractC41023g0;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: na.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26501n {

    /* JADX INFO: renamed from: a */
    public static final int[] f105310a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: a */
    public static byte[] m78553a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: b */
    public static C39306a m78554b(C34585c0 c34585c0, String str) {
        int i13 = 0;
        while (true) {
            InterfaceC34583b0[] interfaceC34583b0Arr = c34585c0.f145640a;
            if (i13 >= interfaceC34583b0Arr.length) {
                return null;
            }
            InterfaceC34583b0 interfaceC34583b0 = interfaceC34583b0Arr[i13];
            if (interfaceC34583b0 instanceof C39306a) {
                C39306a c39306a = (C39306a) interfaceC34583b0;
                if (c39306a.f169105a.equals(str)) {
                    return c39306a;
                }
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m78555c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((C26504q) it.next()).f105328a.f105317g.f145783n;
            if (AbstractC34587d0.m109381n(str2)) {
                return MimeType.MIME_TYPE_VIDEO_MP4;
            }
            if (AbstractC34587d0.m109378k(str2)) {
                z4 = true;
            } else if (AbstractC34587d0.m109379l(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z4) {
            return MimeType.MIME_TYPE_AUDIO_MP4;
        }
        return str != null ? str : "application/mp4";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m78556d(int i13, boolean z4) {
        if ((i13 >>> 8) == 3368816) {
            return true;
        }
        if (i13 == 1751476579 && z4) {
            return true;
        }
        for (int i14 = 0; i14 < 29; i14++) {
            if (f105310a[i14] == i13) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static C17036e m78557e(int i13, C38059n c38059n) {
        int iM121854g = c38059n.m121854g();
        if (c38059n.m121854g() == 1684108385) {
            c38059n.m121847G(8);
            String strM121863p = c38059n.m121863p(iM121854g - 16);
            return new C17036e("und", strM121863p, strM121863p);
        }
        AbstractC38046a.m121826u("MetadataUtil", "Failed to parse comment attribute: " + AbstractC0576a.m1493e(i13));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C17032a m78558f(C38059n c38059n) {
        String str;
        int iM121854g = c38059n.m121854g();
        if (c38059n.m121854g() != 1684108385) {
            AbstractC38046a.m121826u("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM121854g2 = c38059n.m121854g();
        byte[] bArr = AbstractC26490c.f105203a;
        int i13 = iM121854g2 & 16777215;
        if (i13 == 13) {
            str = "image/jpeg";
        } else {
            str = i13 == 14 ? "image/png" : null;
        }
        if (str == null) {
            AbstractC38963t7.m124388r(i13, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        c38059n.m121847G(4);
        int i14 = iM121854g - 16;
        byte[] bArr2 = new byte[i14];
        c38059n.m121852e(bArr2, 0, i14);
        return new C17032a(str, null, 3, bArr2);
    }

    /* JADX INFO: renamed from: g */
    public static C17046o m78559g(int i13, String str, C38059n c38059n) {
        int iM121854g = c38059n.m121854g();
        if (c38059n.m121854g() == 1684108385 && iM121854g >= 22) {
            c38059n.m121847G(10);
            int iM121873z = c38059n.m121873z();
            if (iM121873z > 0) {
                String strM8295h = AbstractC2875y.m8295h(iM121873z, "");
                int iM121873z2 = c38059n.m121873z();
                if (iM121873z2 > 0) {
                    strM8295h = AbstractC25012a.m73373f(iM121873z2, strM8295h, "/");
                }
                return new C17046o(str, null, AbstractC41023g0.m133256r(strM8295h));
            }
        }
        AbstractC38046a.m121826u("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC0576a.m1493e(i13));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static int m78560h(C38059n c38059n) {
        int iM121854g = c38059n.m121854g();
        if (c38059n.m121854g() == 1684108385) {
            c38059n.m121847G(8);
            int i13 = iM121854g - 16;
            if (i13 == 1) {
                return c38059n.m121867t();
            }
            if (i13 == 2) {
                return c38059n.m121873z();
            }
            if (i13 == 3) {
                return c38059n.m121870w();
            }
            if (i13 == 4 && (c38059n.f163017a[c38059n.f163018b] & 128) == 0) {
                return c38059n.m121871x();
            }
        }
        AbstractC38046a.m121826u("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC17041j m78561i(int i13, String str, C38059n c38059n, boolean z4, boolean z13) {
        int iM78560h = m78560h(c38059n);
        if (z13) {
            iM78560h = Math.min(1, iM78560h);
        }
        if (iM78560h >= 0) {
            return z4 ? new C17046o(str, null, AbstractC41023g0.m133256r(Integer.toString(iM78560h))) : new C17036e("und", str, Integer.toString(iM78560h));
        }
        AbstractC38046a.m121826u("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC0576a.m1493e(i13));
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static C12194n m78562j(byte[] bArr) {
        UUID[] uuidArr;
        C38059n c38059n = new C38059n(bArr);
        if (c38059n.f163019c < 32) {
            return null;
        }
        c38059n.m121846F(0);
        int iM121848a = c38059n.m121848a();
        int iM121854g = c38059n.m121854g();
        if (iM121854g != iM121848a) {
            AbstractC38046a.m121826u("PsshAtomUtil", "Advertised atom size (" + iM121854g + ") does not match buffer size: " + iM121848a);
            return null;
        }
        int iM121854g2 = c38059n.m121854g();
        if (iM121854g2 != 1886614376) {
            AbstractC38963t7.m124388r(iM121854g2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iM78536c = AbstractC26490c.m78536c(c38059n.m121854g());
        if (iM78536c > 1) {
            AbstractC38963t7.m124388r(iM78536c, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(c38059n.m121861n(), c38059n.m121861n());
        if (iM78536c == 1) {
            int iM121871x = c38059n.m121871x();
            uuidArr = new UUID[iM121871x];
            for (int i13 = 0; i13 < iM121871x; i13++) {
                uuidArr[i13] = new UUID(c38059n.m121861n(), c38059n.m121861n());
            }
        } else {
            uuidArr = null;
        }
        int iM121871x2 = c38059n.m121871x();
        int iM121848a2 = c38059n.m121848a();
        if (iM121871x2 == iM121848a2) {
            byte[] bArr2 = new byte[iM121871x2];
            c38059n.m121852e(bArr2, 0, iM121871x2);
            return new C12194n(uuid, iM78536c, bArr2, uuidArr);
        }
        AbstractC38046a.m121826u("PsshAtomUtil", "Atom data size (" + iM121871x2 + ") does not match the bytes left: " + iM121848a2);
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static C17046o m78563k(int i13, String str, C38059n c38059n) {
        int iM121854g = c38059n.m121854g();
        if (c38059n.m121854g() == 1684108385) {
            c38059n.m121847G(8);
            return new C17046o(str, null, AbstractC41023g0.m133256r(c38059n.m121863p(iM121854g - 16)));
        }
        AbstractC38046a.m121826u("MetadataUtil", "Failed to parse text attribute: " + AbstractC0576a.m1493e(i13));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:85:0x013d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0140  */
    /* JADX WARN: Code duplicated, block: B:89:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0146  */
    /* JADX WARN: Code duplicated, block: B:92:0x0149  */
    /* JADX WARN: Code duplicated, block: B:94:0x014c A[RETURN] */
    /* JADX INFO: renamed from: l */
    public static InterfaceC33635i0 m78564l(InterfaceC33646o interfaceC33646o, boolean z4, boolean z13) {
        InterfaceC33635i0 interfaceC33635i0;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        long length = interfaceC33646o.getLength();
        long j7 = -1;
        long j13 = 4096;
        if (length != -1 && length <= 4096) {
            j13 = length;
        }
        int i16 = (int) j13;
        C38059n c38059n = new C38059n(64);
        int i17 = 0;
        int i18 = 0;
        boolean z14 = false;
        while (true) {
            if (i18 < i16) {
                c38059n.m121843C(8);
                boolean z15 = true;
                if (interfaceC33646o.mo3092c(c38059n.f163017a, i17, 8, true)) {
                    long jM121869v = c38059n.m121869v();
                    int iM121854g = c38059n.m121854g();
                    if (jM121869v == 1) {
                        j7 = j7;
                        interfaceC33646o.mo3103p(c38059n.f163017a, 8, 8);
                        i14 = 16;
                        c38059n.m121845E(16);
                        jM121869v = c38059n.m121861n();
                        i18 = i18;
                    } else {
                        j7 = j7;
                        if (jM121869v == 0) {
                            long length2 = interfaceC33646o.getLength();
                            if (length2 != j7) {
                                jM121869v = (length2 - interfaceC33646o.mo3095g()) + ((long) 8);
                            }
                        }
                        i14 = 8;
                    }
                    long j14 = jM121869v;
                    long j15 = i14;
                    if (j14 < j15) {
                        return new C26496i();
                    }
                    int i19 = i18 + i14;
                    interfaceC33635i0 = null;
                    if (iM121854g == 1836019574) {
                        i16 += (int) j14;
                        if (length != -1 && i16 > length) {
                            i16 = (int) length;
                        }
                        i18 = i19;
                        i17 = 0;
                    } else if (iM121854g == 1836019558 || iM121854g == 1836475768) {
                        i13 = 1;
                    } else {
                        if (iM121854g == 1835295092) {
                            z14 = true;
                        }
                        long j16 = length;
                        if ((((long) i19) + j14) - j15 >= i16) {
                            i13 = 0;
                        } else {
                            int i24 = (int) (j14 - j15);
                            i18 = i19 + i24;
                            if (iM121854g != 1718909296) {
                                i15 = 0;
                                if (i24 != 0) {
                                    interfaceC33646o.mo3096i(i24);
                                }
                            } else {
                                if (i24 < 8) {
                                    return new C26496i();
                                }
                                c38059n.m121843C(i24);
                                i15 = 0;
                                interfaceC33646o.mo3103p(c38059n.f163017a, 0, i24);
                                if (m78556d(c38059n.m121854g(), z13)) {
                                    z14 = true;
                                }
                                c38059n.m121847G(4);
                                int iM121848a = c38059n.m121848a() / 4;
                                if (!z14 && iM121848a > 0) {
                                    iArr = new int[iM121848a];
                                    int i25 = 0;
                                    while (true) {
                                        if (i25 >= iM121848a) {
                                            z15 = z14;
                                            break;
                                        }
                                        int iM121854g2 = c38059n.m121854g();
                                        iArr[i25] = iM121854g2;
                                        if (m78556d(iM121854g2, z13)) {
                                            break;
                                        }
                                        i25++;
                                    }
                                } else {
                                    z15 = z14;
                                    iArr = null;
                                }
                                if (!z15) {
                                    C26496i c26496i = new C26496i();
                                    if (iArr == null) {
                                        int i26 = C11094a.f35190y;
                                        return c26496i;
                                    }
                                    int i27 = C11094a.f35190y;
                                    if (iArr.length == 0) {
                                        return c26496i;
                                    }
                                    new C11094a(Arrays.copyOf(iArr, iArr.length));
                                    return c26496i;
                                }
                                z14 = z15;
                            }
                            i17 = i15;
                            length = j16;
                        }
                    }
                }
                if (!z14) {
                    return C26496i.f105265c;
                }
                if (z4 != i13) {
                    return i13 != 0 ? C26496i.f105263a : C26496i.f105264b;
                }
                return interfaceC33635i0;
            }
            interfaceC33635i0 = null;
            i13 = i17;
            if (!z14) {
                return C26496i.f105265c;
            }
            if (z4 != i13) {
                if (i13 != 0) {
                }
            }
            return interfaceC33635i0;
        }
    }
}
