package m83;

import i93.C18284j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import l83.C23465k;
import l83.C23473s;
import l83.C23475u;
import l83.C23477w;
import l83.C23480z;
import p031b9.AbstractC2875y;
import p035bp.AbstractC3511b;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;
import wb3.AbstractC37056f;
import xb3.C38169d;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: m83.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25260n extends AbstractC34132o {
    /* JADX INFO: renamed from: A0 */
    public static final void m74025A0(Object[] objArr, StringBuilder sb4, CharSequence charSequence, CharSequence prefix, CharSequence postfix, CharSequence charSequence2, Function1 function1) {
        AbstractC22676k.m65750j(objArr, "<this>");
        AbstractC22676k.m65750j(prefix, "prefix");
        AbstractC22676k.m65750j(postfix, "postfix");
        sb4.append(prefix);
        int i13 = 0;
        for (Object obj : objArr) {
            i13++;
            if (i13 > 1) {
                sb4.append(charSequence);
            }
            AbstractC35854l.m113828h(sb4, obj, function1);
        }
        sb4.append(postfix);
    }

    /* JADX INFO: renamed from: C0 */
    public static String m74027C0(byte[] bArr, String str, Function1 function1, int i13) {
        String str2 = (i13 & 2) != 0 ? "" : "[";
        String str3 = (i13 & 4) == 0 ? "]" : "";
        if ((i13 & 32) != 0) {
            function1 = null;
        }
        AbstractC22676k.m65750j(bArr, "<this>");
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) str2);
        int i14 = 0;
        for (byte b : bArr) {
            i14++;
            if (i14 > 1) {
                sb4.append((CharSequence) str);
            }
            if (function1 != null) {
                sb4.append((CharSequence) function1.invoke(Byte.valueOf(b)));
            } else {
                sb4.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb4.append((CharSequence) str3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: D0 */
    public static String m74028D0(Object[] objArr, String str, String str2, String str3, Function1 function1, int i13) {
        if ((i13 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i13 & 2) != 0 ? "" : str2;
        String str6 = (i13 & 4) != 0 ? "" : str3;
        if ((i13 & 32) != 0) {
            function1 = null;
        }
        AbstractC22676k.m65750j(objArr, "<this>");
        StringBuilder sb4 = new StringBuilder();
        m74025A0(objArr, sb4, str4, str5, str6, "...", function1);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: E0 */
    public static Object m74029E0(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: F0 */
    public static byte[] m74030F0(byte[] bArr, byte[] elements) {
        AbstractC22676k.m65750j(bArr, "<this>");
        AbstractC22676k.m65750j(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        AbstractC22676k.m65747g(bArrCopyOf);
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: G0 */
    public static int[] m74031G0(int[] iArr, int[] elements) {
        AbstractC22676k.m65750j(iArr, "<this>");
        AbstractC22676k.m65750j(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        AbstractC22676k.m65747g(iArrCopyOf);
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: H0 */
    public static Object[] m74032H0(Object[] objArr, Object[] elements) {
        AbstractC22676k.m65750j(objArr, "<this>");
        AbstractC22676k.m65750j(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, objArrCopyOf, length, length2);
        AbstractC22676k.m65747g(objArrCopyOf);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: I0 */
    public static void m74033I0(Object[] objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw new IllegalArgumentException("null element found in " + objArr + '.');
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static void m74034J0(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        int length = (objArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int length2 = objArr.length - 1;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            Object obj = objArr[i13];
            objArr[i13] = objArr[length2];
            objArr[length2] = obj;
            length2--;
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static byte[] m74035K0(byte[] bArr) {
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length - 1;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                bArr2[length - i13] = bArr[i13];
                if (i13 == length) {
                    break;
                }
                i13++;
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: L0 */
    public static char m74036L0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX INFO: renamed from: M0 */
    public static Object m74037M0(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX INFO: renamed from: N0 */
    public static byte[] m74038N0(byte[] bArr, C18284j indices) {
        AbstractC22676k.m65750j(bArr, "<this>");
        AbstractC22676k.m65750j(indices, "indices");
        return indices.isEmpty() ? new byte[0] : m74070k0(bArr, indices.f71133w, indices.f71134x + 1);
    }

    /* JADX INFO: renamed from: O0 */
    public static void m74039O0(Object[] objArr, Comparator comparator) {
        AbstractC22676k.m65750j(objArr, "<this>");
        AbstractC22676k.m65750j(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static void m74040P0(Object[] objArr, Comparator comparator, int i13, int i14) {
        AbstractC22676k.m65750j(objArr, "<this>");
        AbstractC22676k.m65750j(comparator, "comparator");
        Arrays.sort(objArr, i13, i14, comparator);
    }

    /* JADX INFO: renamed from: Q0 */
    public static List m74041Q0(Object[] objArr, Comparator comparator) {
        AbstractC22676k.m65750j(objArr, "<this>");
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            AbstractC22676k.m65749i(objArr, "copyOf(...)");
            m74039O0(objArr, comparator);
        }
        return m74048W(objArr);
    }

    /* JADX INFO: renamed from: R0 */
    public static List m74042R0(int i13, Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested element count ", " is less than zero.").toString());
        }
        if (i13 == 0) {
            return C25271y.f99162w;
        }
        if (i13 >= objArr.length) {
            return m74049W0(objArr);
        }
        if (i13 == 1) {
            return AbstractC37056f.m118958J(objArr[0]);
        }
        ArrayList arrayList = new ArrayList(i13);
        int i14 = 0;
        for (Object obj : objArr) {
            arrayList.add(obj);
            i14++;
            if (i14 == i13) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S0 */
    public static final void m74043S0(Object[] objArr, HashSet hashSet) {
        AbstractC22676k.m65750j(objArr, "<this>");
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static List m74044T0(float[] fArr) {
        AbstractC22676k.m65750j(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return C25271y.f99162w;
        }
        if (length == 1) {
            return AbstractC37056f.m118958J(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f13 : fArr) {
            arrayList.add(Float.valueOf(f13));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U0 */
    public static List m74045U0(int[] iArr) {
        AbstractC22676k.m65750j(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? m74053Y0(iArr) : AbstractC37056f.m118958J(Integer.valueOf(iArr[0]));
        }
        return C25271y.f99162w;
    }

    /* JADX INFO: renamed from: V */
    public static Iterable m74046V(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        return objArr.length == 0 ? C25271y.f99162w : new C25263q(objArr, 0);
    }

    /* JADX INFO: renamed from: V0 */
    public static List m74047V0(long[] jArr) {
        AbstractC22676k.m65750j(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return C25271y.f99162w;
        }
        if (length == 1) {
            return AbstractC37056f.m118958J(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: W */
    public static List m74048W(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC22676k.m65749i(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX INFO: renamed from: W0 */
    public static List m74049W0(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? m74055Z0(objArr) : AbstractC37056f.m118958J(objArr[0]);
        }
        return C25271y.f99162w;
    }

    /* JADX INFO: renamed from: X */
    public static InterfaceC38174i m74050X(Object[] objArr) {
        return objArr.length == 0 ? C38169d.f163464a : new C25264r(objArr, 0);
    }

    /* JADX INFO: renamed from: X0 */
    public static List m74051X0(boolean[] zArr) {
        AbstractC22676k.m65750j(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return C25271y.f99162w;
        }
        if (length == 1) {
            return AbstractC37056f.m118958J(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z4 : zArr) {
            arrayList.add(Boolean.valueOf(z4));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    /* JADX INFO: renamed from: Y */
    public static boolean m74052Y(char[] cArr, char c3) {
        int length = cArr.length;
        int i13 = 0;
        while (i13 < length) {
            if (c3 == cArr[i13]) {
                if (i13 >= 0) {
                    return true;
                }
                return false;
            }
            i13++;
        }
        i13 = -1;
        if (i13 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: Y0 */
    public static ArrayList m74053Y0(int[] iArr) {
        AbstractC22676k.m65750j(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i13 : iArr) {
            arrayList.add(Integer.valueOf(i13));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0017 A[RETURN] */
    /* JADX INFO: renamed from: Z */
    public static boolean m74054Z(int[] iArr, int i13) {
        AbstractC22676k.m65750j(iArr, "<this>");
        int length = iArr.length;
        int i14 = 0;
        while (i14 < length) {
            if (i13 == iArr[i14]) {
                if (i14 >= 0) {
                    return true;
                }
                return false;
            }
            i14++;
        }
        i14 = -1;
        if (i14 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: Z0 */
    public static ArrayList m74055Z0(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        return new ArrayList(new C25256l(objArr, false));
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m74056a0(Object[] objArr, Object obj) {
        AbstractC22676k.m65750j(objArr, "<this>");
        return m74085z0(objArr, obj) >= 0;
    }

    /* JADX INFO: renamed from: a1 */
    public static Set m74057a1(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return C25235a0.f99113w;
        }
        if (length == 1) {
            return AbstractC12350b.m34570S(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC25247g0.m73988W(iArr.length));
        for (int i13 : iArr) {
            linkedHashSet.add(Integer.valueOf(i13));
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m74058b0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i13 = 0; i13 < length; i13++) {
                Object obj = objArr[i13];
                Object obj2 = objArr2[i13];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!m74058b0((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof C23473s) && (obj2 instanceof C23473s)) {
                            if (!AbstractC3511b.m10384m(((C23473s) obj).f92951w, ((C23473s) obj2).f92951w)) {
                            }
                        } else if ((obj instanceof C23480z) && (obj2 instanceof C23480z)) {
                            if (!AbstractC3511b.m10382k(((C23480z) obj).f92958w, ((C23480z) obj2).f92958w)) {
                            }
                        } else if ((obj instanceof C23475u) && (obj2 instanceof C23475u)) {
                            if (!AbstractC3511b.m10383l(((C23475u) obj).f92953w, ((C23475u) obj2).f92953w)) {
                            }
                        } else if ((obj instanceof C23477w) && (obj2 instanceof C23477w)) {
                            if (!AbstractC3511b.m10385n(((C23477w) obj).f92955w, ((C23477w) obj2).f92955w)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b1 */
    public static Set m74059b1(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C25235a0.f99113w;
        }
        if (length == 1) {
            return AbstractC12350b.m34570S(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC25247g0.m73988W(objArr.length));
        m74043S0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m74060c0(int i13, int i14, int i15, byte[] bArr, byte[] destination) {
        AbstractC22676k.m65750j(bArr, "<this>");
        AbstractC22676k.m65750j(destination, "destination");
        System.arraycopy(bArr, i14, destination, i13, i15 - i14);
    }

    /* JADX INFO: renamed from: c1 */
    public static Double[] m74061c1(double[] dArr) {
        AbstractC22676k.m65750j(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            dArr2[i13] = Double.valueOf(dArr[i13]);
        }
        return dArr2;
    }

    /* JADX INFO: renamed from: d0 */
    public static void m74062d0(int i13, int i14, int i15, Object[] objArr, Object[] destination) {
        AbstractC22676k.m65750j(objArr, "<this>");
        AbstractC22676k.m65750j(destination, "destination");
        System.arraycopy(objArr, i14, destination, i13, i15 - i14);
    }

    /* JADX INFO: renamed from: d1 */
    public static ArrayList m74063d1(Object[] objArr, Object[] other) {
        AbstractC22676k.m65750j(objArr, "<this>");
        AbstractC22676k.m65750j(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i13 = 0; i13 < iMin; i13++) {
            arrayList.add(new C23465k(objArr[i13], other[i13]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m74064e0(int i13, int i14, int[] iArr, int[] destination, int i15) {
        AbstractC22676k.m65750j(iArr, "<this>");
        AbstractC22676k.m65750j(destination, "destination");
        System.arraycopy(iArr, i14, destination, i13, i15 - i14);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m74065f0(char[] cArr, char[] cArr2, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(cArr, "<this>");
        System.arraycopy(cArr, i14, cArr2, i13, i15 - i14);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m74066g0(long[] jArr, long[] destination, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(jArr, "<this>");
        AbstractC22676k.m65750j(destination, "destination");
        System.arraycopy(jArr, i14, destination, i13, i15 - i14);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m74067h0(int i13, int i14, int i15, byte[] bArr, byte[] bArr2) {
        int i16 = (i15 & 2) != 0 ? 0 : 1;
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = bArr.length;
        }
        m74060c0(i16, i13, i14, bArr, bArr2);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m74068i0(int i13, int i14, int i15, Object[] objArr, Object[] objArr2) {
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = objArr.length;
        }
        m74062d0(0, i13, i14, objArr, objArr2);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m74069j0(int i13, int i14, int[] iArr, int[] iArr2, int i15) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = iArr.length;
        }
        m74064e0(i13, 0, iArr, iArr2, i14);
    }

    /* JADX INFO: renamed from: k0 */
    public static byte[] m74070k0(byte[] bArr, int i13, int i14) {
        AbstractC22676k.m65750j(bArr, "<this>");
        AbstractC34132o.m107886j(i14, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
        AbstractC22676k.m65749i(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: l0 */
    public static long[] m74071l0(long[] jArr, int i13) {
        AbstractC34132o.m107886j(i13, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, 0, i13);
        AbstractC22676k.m65749i(jArrCopyOfRange, "copyOfRange(...)");
        return jArrCopyOfRange;
    }

    /* JADX INFO: renamed from: m0 */
    public static Object[] m74072m0(int i13, int i14, Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        AbstractC34132o.m107886j(i14, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i13, i14);
        AbstractC22676k.m65749i(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: n0 */
    public static void m74073n0(int i13, int i14, Object obj, Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        Arrays.fill(objArr, i13, i14, obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m74074o0(int[] iArr, int i13) {
        int length = iArr.length;
        AbstractC22676k.m65750j(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i13);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m74075p0(long[] jArr, long j7) {
        int length = jArr.length;
        AbstractC22676k.m65750j(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j7);
    }

    /* JADX INFO: renamed from: r0 */
    public static List m74077r0(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s0 */
    public static Object m74078s0(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: t0 */
    public static Object m74079t0(Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX INFO: renamed from: u0 */
    public static C18284j m74080u0(int[] iArr) {
        return new C18284j(0, iArr.length - 1, 1);
    }

    /* JADX INFO: renamed from: v0 */
    public static int m74081v0(long[] jArr) {
        AbstractC22676k.m65750j(jArr, "<this>");
        return jArr.length - 1;
    }

    /* JADX INFO: renamed from: w0 */
    public static Byte m74082w0(int i13, byte[] bArr) {
        AbstractC22676k.m65750j(bArr, "<this>");
        if (i13 < 0 || i13 >= bArr.length) {
            return null;
        }
        return Byte.valueOf(bArr[i13]);
    }

    /* JADX INFO: renamed from: x0 */
    public static Integer m74083x0(int[] iArr, int i13) {
        AbstractC22676k.m65750j(iArr, "<this>");
        if (i13 < 0 || i13 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i13]);
    }

    /* JADX INFO: renamed from: y0 */
    public static Object m74084y0(int i13, Object[] objArr) {
        AbstractC22676k.m65750j(objArr, "<this>");
        if (i13 < 0 || i13 >= objArr.length) {
            return null;
        }
        return objArr[i13];
    }

    /* JADX INFO: renamed from: z0 */
    public static int m74085z0(Object[] objArr, Object obj) {
        AbstractC22676k.m65750j(objArr, "<this>");
        int i13 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i13 < length) {
                if (objArr[i13] == null) {
                    return i13;
                }
                i13++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i13 < length2) {
            if (obj.equals(objArr[i13])) {
                return i13;
            }
            i13++;
        }
        return -1;
    }
}
