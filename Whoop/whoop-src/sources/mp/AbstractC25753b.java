package mp;

import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhj;
import g73.C15553a;
import ih0.AbstractC18489d0;
import io.sentry.internal.debugmeta.C20378c;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: mp.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25753b {

    /* JADX INFO: renamed from: x */
    public static volatile C25750a f101466x;

    /* JADX INFO: renamed from: w */
    public static final Object f101465w = new Object();

    /* JADX INFO: renamed from: y */
    public static final C25752a1 f101467y = new C25752a1("id");

    /* JADX INFO: renamed from: z */
    public static final C25752a1 f101468z = new C25752a1("type");

    /* JADX INFO: renamed from: a */
    public static int m75989a(int i13, int i14) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i14 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i15 = i13 / i14;
        int i16 = i13 - (i14 * i15);
        if (i16 == 0) {
            return i15;
        }
        int i17 = ((i13 ^ i14) >> 31) | 1;
        switch (AbstractC25791o0.f101522a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i15;
            case 3:
                if (i17 >= 0) {
                    return i15;
                }
                break;
            case 4:
                break;
            case 5:
                if (i17 <= 0) {
                    return i15;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i16);
                int iAbs2 = iAbs - (Math.abs(i14) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i15;
                }
                if (iAbs2 <= 0) {
                    return i15;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i15 + i17;
    }

    /* JADX INFO: renamed from: b */
    public static int m75990b(AbstractC25792p abstractC25792p) {
        Iterator it = abstractC25792p.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: c */
    public static String m75991c(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM8300m;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            length = objArr.length;
            if (i14 >= length) {
                break;
            }
            Object obj = objArr[i14];
            if (obj == null) {
                strM8300m = "null";
            } else {
                try {
                    strM8300m = obj.toString();
                } catch (Exception e5) {
                    String strM53370k = AbstractC18489d0.m53370k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM53370k), (Throwable) e5);
                    strM8300m = AbstractC2875y.m8300m("<", strM53370k, " threw ", e5.getClass().getName(), ">");
                }
            }
            objArr[i14] = strM8300m;
            i14++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i15 = 0;
        while (true) {
            length2 = objArr.length;
            if (i13 >= length2 || (iIndexOf = str.indexOf("%s", i15)) == -1) {
                break;
            }
            sb4.append((CharSequence) str, i15, iIndexOf);
            sb4.append(objArr[i13]);
            i13++;
            i15 = iIndexOf + 2;
        }
        sb4.append((CharSequence) str, i15, str.length());
        if (i13 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i13]);
            for (int i16 = i13 + 1; i16 < objArr.length; i16++) {
                sb4.append(", ");
                sb4.append(objArr[i16]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m75992d(C25801t0 c25801t0) {
        StringBuilder sb4 = new StringBuilder(c25801t0.mo76042e());
        for (int i13 = 0; i13 < c25801t0.mo76042e(); i13++) {
            byte bMo76039a = c25801t0.mo76039a(i13);
            if (bMo76039a == 34) {
                sb4.append("\\\"");
            } else if (bMo76039a == 39) {
                sb4.append("\\'");
            } else if (bMo76039a != 92) {
                switch (bMo76039a) {
                    case 7:
                        sb4.append("\\a");
                        break;
                    case 8:
                        sb4.append("\\b");
                        break;
                    case 9:
                        sb4.append("\\t");
                        break;
                    case 10:
                        sb4.append("\\n");
                        break;
                    case 11:
                        sb4.append("\\v");
                        break;
                    case 12:
                        sb4.append("\\f");
                        break;
                    case 13:
                        sb4.append("\\r");
                        break;
                    default:
                        if (bMo76039a < 32 || bMo76039a > 126) {
                            sb4.append('\\');
                            sb4.append((char) (((bMo76039a >>> 6) & 3) + 48));
                            sb4.append((char) (((bMo76039a >>> 3) & 7) + 48));
                            sb4.append((char) ((bMo76039a & 7) + 48));
                        } else {
                            sb4.append((char) bMo76039a);
                        }
                        break;
                }
            } else {
                sb4.append("\\\\");
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: e */
    public static void m75993e(int i13, int i14) {
        String strM75991c;
        if (i13 < 0 || i13 >= i14) {
            if (i13 < 0) {
                strM75991c = m75991c("%s (%s) must not be negative", "index", Integer.valueOf(i13));
            } else {
                if (i14 < 0) {
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "negative size: "));
                }
                strM75991c = m75991c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i13), Integer.valueOf(i14));
            }
            throw new IndexOutOfBoundsException(strM75991c);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m75994f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC11895b.m31996o("null value in entry: ", obj.toString(), "=null"));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m75995g(StringBuilder sb4, Iterator it, C15553a c15553a) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb4.append(C15553a.m43793w(entry.getKey()));
            sb4.append(" : ");
            sb4.append(C15553a.m43793w(entry.getValue()));
            while (it.hasNext()) {
                sb4.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb4.append(C15553a.m43793w(entry2.getKey()));
                sb4.append(" : ");
                sb4.append(C15553a.m43793w(entry2.getValue()));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m75996h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m75997i(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = C25806w.f101547x;
            }
        } else {
            if (!(collection instanceof InterfaceC25760d0)) {
                return false;
            }
            objComparator = ((AbstractC25800t) ((InterfaceC25760d0) collection)).f101538z;
        }
        return comparator.equals(objComparator);
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m75998j(byte[]... bArr) {
        int i13 = 0;
        int length = 0;
        while (true) {
            if (i13 >= bArr.length) {
                break;
            }
            length += bArr[i13].length;
            i13++;
        }
        byte[] bArr2 = new byte[length];
        int i14 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i14, length2);
            i14 += length2;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC25755b1 m75999k(C25761d1 c25761d1) throws zzhj {
        try {
            C25758c1 c25758c1M76016k = c25761d1.m76016k();
            if (c25758c1M76016k == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                try {
                    byte b = c25758c1M76016k.f101472a;
                    byte b6 = c25758c1M76016k.f101473b;
                    int i13 = 0;
                    if (b == -128) {
                        long jM76013b = c25761d1.m76013b();
                        if (jM76013b > 1000) {
                            throw new zzhj("Parser being asked to read a large CBOR array");
                        }
                        m76000l(b6, jM76013b);
                        AbstractC25755b1[] abstractC25755b1Arr = new AbstractC25755b1[(int) jM76013b];
                        while (i13 < jM76013b) {
                            abstractC25755b1Arr[i13] = m75999k(c25761d1);
                            i13++;
                        }
                        return new C25805v0(AbstractC25788n.m76025m(abstractC25755b1Arr));
                    }
                    if (b != -96) {
                        if (b == -64) {
                            throw new zzhj("Tags are currently unsupported");
                        }
                        if (b == -32) {
                            return new C25807w0(c25761d1.m76017m());
                        }
                        if (b == 0 || b == 32) {
                            long jM76014h = c25761d1.m76014h();
                            m76000l(b6, jM76014h > 0 ? jM76014h : ~jM76014h);
                            return new C25811y0(jM76014h);
                        }
                        if (b == 64) {
                            c25761d1.m76010J((byte) 64);
                            byte[] bArrM76012a0 = c25761d1.m76012a0();
                            int length = bArrM76012a0.length;
                            m76000l(b6, length);
                            return new C25809x0(C25801t0.m76048l(length, bArrM76012a0));
                        }
                        if (b == 96) {
                            c25761d1.m76010J((byte) 96);
                            String str = new String(c25761d1.m76012a0(), StandardCharsets.UTF_8);
                            m76000l(b6, str.length());
                            return new C25752a1(str);
                        }
                        throw new zzhj("Unidentifiable major type: " + ((b >> 5) & 7));
                    }
                    long jM76015i = c25761d1.m76015i();
                    if (jM76015i > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR map");
                    }
                    m76000l(b6, jM76015i);
                    int i14 = (int) jM76015i;
                    C20378c[] c20378cArr = new C20378c[i14];
                    AbstractC25755b1 abstractC25755b1 = null;
                    int i15 = 0;
                    while (i15 < jM76015i) {
                        AbstractC25755b1 abstractC25755b1M75999k = m75999k(c25761d1);
                        if (abstractC25755b1 != null && abstractC25755b1M75999k.compareTo(abstractC25755b1) <= 0) {
                            throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + abstractC25755b1.toString() + "\nCurrent key: " + abstractC25755b1M75999k.toString());
                        }
                        c20378cArr[i15] = new C20378c(25, abstractC25755b1M75999k, m75999k(c25761d1));
                        i15++;
                        abstractC25755b1 = abstractC25755b1M75999k;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i13 < i14) {
                        C20378c c20378c = c20378cArr[i13];
                        if (treeMap.containsKey((AbstractC25755b1) c20378c.f76422x)) {
                            throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((AbstractC25755b1) c20378c.f76422x, (AbstractC25755b1) c20378c.f76423y);
                        i13++;
                    }
                    return new C25813z0(C25798s.m76033b(treeMap));
                } catch (IOException | RuntimeException e5) {
                    e = e5;
                    throw new zzhj(e);
                }
            } catch (RuntimeException e13) {
                e = e13;
                throw new zzhj(e);
            }
        } catch (IOException e14) {
            throw new zzhj(e14);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m76000l(byte b, long j7) throws zzhf {
        switch (b) {
            case 24:
                if (j7 < 24) {
                    throw new zzhf(AbstractC31061c.m95636l(j7, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j7 < 256) {
                    throw new zzhf(AbstractC31061c.m95636l(j7, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j7 < 65536) {
                    throw new zzhf(AbstractC31061c.m95636l(j7, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j7 < 4294967296L) {
                    throw new zzhf(AbstractC31061c.m95636l(j7, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m76001m(int i13, int i14, int i15) {
        String strM76002n;
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            if (i13 < 0 || i13 > i15) {
                strM76002n = m76002n(i13, i15, "start index");
            } else {
                strM76002n = (i14 < 0 || i14 > i15) ? m76002n(i14, i15, "end index") : m75991c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13));
            }
            throw new IndexOutOfBoundsException(strM76002n);
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m76002n(int i13, int i14, String str) {
        if (i13 < 0) {
            return m75991c("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return m75991c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "negative size: "));
    }
}
