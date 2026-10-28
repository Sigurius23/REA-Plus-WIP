package p094dn;

import android.util.Log;
import ed3.C13117a;
import java.nio.ByteBuffer;
import java.util.UUID;
import p010a9.AbstractC0576a;
import p345nn.AbstractC26858i;
import p345nn.C26850a;
import p345nn.C26854e;
import p345nn.C26862m;
import p588wm.InterfaceC37368j;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: dn.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12191k {

    /* JADX INFO: renamed from: a */
    public static final String[] f40681a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* JADX INFO: renamed from: b */
    public static final int[] f40682b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: a */
    public static byte[] m33807a(UUID uuid, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: b */
    public static C26854e m33808b(int i13, C13117a c13117a) {
        int iM36699i = c13117a.m36699i();
        if (c13117a.m36699i() == 1684108385) {
            c13117a.m36690L(8);
            String strM36709s = c13117a.m36709s(iM36699i - 16);
            return new C26854e("und", strM36709s, strM36709s);
        }
        String strValueOf = String.valueOf(AbstractC0576a.m1492c(i13));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static C26850a m33809c(C13117a c13117a) {
        String str;
        int iM36699i = c13117a.m36699i();
        if (c13117a.m36699i() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM36699i2 = c13117a.m36699i() & 16777215;
        if (iM36699i2 == 13) {
            str = "image/jpeg";
        } else {
            str = iM36699i2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            AbstractC30007c.m91850t(41, iM36699i2, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        c13117a.m36690L(4);
        int i13 = iM36699i - 16;
        byte[] bArr = new byte[i13];
        c13117a.m36697g(bArr, 0, i13);
        return new C26850a(str, null, 3, bArr);
    }

    /* JADX INFO: renamed from: d */
    public static C26862m m33810d(int i13, C13117a c13117a, String str) {
        int iM36699i = c13117a.m36699i();
        if (c13117a.m36699i() == 1684108385 && iM36699i >= 22) {
            c13117a.m36690L(10);
            int iM36682D = c13117a.m36682D();
            if (iM36682D > 0) {
                StringBuilder sb4 = new StringBuilder(11);
                sb4.append(iM36682D);
                String string = sb4.toString();
                int iM36682D2 = c13117a.m36682D();
                if (iM36682D2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb5 = new StringBuilder(strValueOf.length() + 12);
                    sb5.append(strValueOf);
                    sb5.append("/");
                    sb5.append(iM36682D2);
                    string = sb5.toString();
                }
                return new C26862m(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(AbstractC0576a.m1492c(i13));
        Log.w("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static C12194n m33811e(byte[] bArr) {
        C13117a c13117a = new C13117a(bArr, 1, (byte) 0);
        if (c13117a.f45383c >= 32) {
            c13117a.m36689K(0);
            if (c13117a.m36699i() == c13117a.m36692a() + 4 && c13117a.m36699i() == 1886614376) {
                int iM1494n = AbstractC0576a.m1494n(c13117a.m36699i());
                if (iM1494n > 1) {
                    AbstractC30007c.m91850t(37, iM1494n, "Unsupported pssh version: ", "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(c13117a.m36706p(), c13117a.m36706p());
                if (iM1494n == 1) {
                    c13117a.m36690L(c13117a.m36680B() * 16);
                }
                int iM36680B = c13117a.m36680B();
                if (iM36680B == c13117a.m36692a()) {
                    byte[] bArr2 = new byte[iM36680B];
                    c13117a.m36697g(bArr2, 0, iM36680B);
                    return new C12194n(uuid, iM1494n, bArr2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C26862m m33812f(int i13, C13117a c13117a, String str) {
        int iM36699i = c13117a.m36699i();
        if (c13117a.m36699i() == 1684108385) {
            c13117a.m36690L(8);
            return new C26862m(str, null, c13117a.m36709s(iM36699i - 16));
        }
        String strValueOf = String.valueOf(AbstractC0576a.m1492c(i13));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC26858i m33813g(int i13, String str, C13117a c13117a, boolean z4, boolean z13) {
        int iM33814h = m33814h(c13117a);
        if (z13) {
            iM33814h = Math.min(1, iM33814h);
        }
        if (iM33814h >= 0) {
            return z4 ? new C26862m(str, null, Integer.toString(iM33814h)) : new C26854e("und", str, Integer.toString(iM33814h));
        }
        String strValueOf = String.valueOf(AbstractC0576a.m1492c(i13));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static int m33814h(C13117a c13117a) {
        c13117a.m36690L(4);
        if (c13117a.m36699i() == 1684108385) {
            c13117a.m36690L(8);
            return c13117a.m36715y();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m33815i(InterfaceC37368j interfaceC37368j, boolean z4, boolean z13) {
        boolean z14;
        int i13;
        long length = interfaceC37368j.getLength();
        long j7 = -1;
        int i14 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j13 = 4096;
        if (i14 != 0 && length <= 4096) {
            j13 = length;
        }
        int i15 = (int) j13;
        C13117a c13117a = new C13117a(64);
        int i16 = 0;
        int i17 = 0;
        boolean z15 = false;
        while (true) {
            if (i17 < i15) {
                c13117a.m36686H(8);
                if (interfaceC37368j.mo3092c(c13117a.f45381a, i16, 8, true)) {
                    long jM36716z = c13117a.m36716z();
                    int iM36699i = c13117a.m36699i();
                    if (jM36716z == 1) {
                        interfaceC37368j.mo3103p(c13117a.f45381a, 8, 8);
                        c13117a.m36688J(16);
                        i13 = 16;
                        jM36716z = c13117a.m36706p();
                    } else {
                        if (jM36716z == 0) {
                            long length2 = interfaceC37368j.getLength();
                            if (length2 != j7) {
                                jM36716z = (length2 - interfaceC37368j.mo3095g()) + ((long) 8);
                            }
                        }
                        i13 = 8;
                    }
                    long j14 = i13;
                    if (jM36716z < j14) {
                        return false;
                    }
                    int i18 = i17 + i13;
                    if (iM36699i == 1836019574) {
                        i15 += (int) jM36716z;
                        if (i14 != 0 && i15 > length) {
                            i15 = (int) length;
                        }
                        i17 = i18;
                    } else {
                        if (iM36699i == 1836019558 || iM36699i == 1836475768) {
                            z14 = true;
                            return z15 && z4 == z14;
                        }
                        int i19 = i14;
                        if ((((long) i18) + jM36716z) - j14 < i15) {
                            int i24 = (int) (jM36716z - j14);
                            i17 = i18 + i24;
                            if (iM36699i == 1718909296) {
                                if (i24 < 8) {
                                    return false;
                                }
                                c13117a.m36686H(i24);
                                interfaceC37368j.mo3103p(c13117a.f45381a, 0, i24);
                                int i25 = i24 / 4;
                                for (int i26 = 0; i26 < i25; i26++) {
                                    if (i26 != 1) {
                                        int iM36699i2 = c13117a.m36699i();
                                        if ((iM36699i2 >>> 8) != 3368816 && (iM36699i2 != 1751476579 || !z13)) {
                                            int i27 = 0;
                                            while (true) {
                                                if (i27 >= 29) {
                                                    continue;
                                                } else if (f40682b[i27] != iM36699i2) {
                                                    i27++;
                                                }
                                            }
                                        }
                                        z15 = true;
                                        break;
                                    }
                                    c13117a.m36690L(4);
                                }
                                if (!z15) {
                                    return false;
                                }
                            } else if (i24 != 0) {
                                interfaceC37368j.mo3096i(i24);
                            }
                            i14 = i19;
                        }
                    }
                    j7 = -1;
                    i16 = 0;
                }
            }
            z14 = false;
            if (z15) {
                return false;
            }
        }
    }
}
