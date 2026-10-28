package p114eb;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: eb.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13001z0 extends AbstractC12958g1 {

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ int f44923r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13001z0(boolean z4, int i13) {
        super(z4);
        this.f44923r = i13;
    }

    /* JADX INFO: renamed from: g */
    public static float[] m36511g(String value) {
        AbstractC22676k.m65750j(value, "value");
        return new float[]{((Number) AbstractC12958g1.f44764i.mo36413d(value)).floatValue()};
    }

    /* JADX INFO: renamed from: h */
    public static int[] m36512h(String value) {
        AbstractC22676k.m65750j(value, "value");
        return new int[]{((Number) AbstractC12958g1.f44757b.mo36413d(value)).intValue()};
    }

    /* JADX INFO: renamed from: i */
    public static long[] m36513i(String value) {
        AbstractC22676k.m65750j(value, "value");
        return new long[]{((Number) AbstractC12958g1.f44761f.mo36413d(value)).longValue()};
    }

    /* JADX INFO: renamed from: j */
    public static boolean[] m36514j(String value) {
        AbstractC22676k.m65750j(value, "value");
        return new boolean[]{((Boolean) AbstractC12958g1.f44767l.mo36413d(value)).booleanValue()};
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: a */
    public final Object mo36411a(Bundle bundle, String str) {
        switch (this.f44923r) {
            case 0:
                return (boolean[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
            case 1:
                boolean[] zArr = (boolean[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
                if (zArr != null) {
                    return AbstractC25260n.m74051X0(zArr);
                }
                return null;
            case 2:
                return (float[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
            case 3:
                float[] fArr = (float[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
                if (fArr != null) {
                    return AbstractC25260n.m74044T0(fArr);
                }
                return null;
            case 4:
                return (int[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
            case 5:
                int[] iArr = (int[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
                if (iArr != null) {
                    return AbstractC25260n.m74045U0(iArr);
                }
                return null;
            case 6:
                return (long[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
            case 7:
                long[] jArr = (long[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
                if (jArr != null) {
                    return AbstractC25260n.m74047V0(jArr);
                }
                return null;
            case 8:
                return (String[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
            default:
                String[] strArr = (String[]) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
                if (strArr != null) {
                    return AbstractC25260n.m74049W0(strArr);
                }
                return null;
        }
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: b */
    public final String mo36412b() {
        switch (this.f44923r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: c */
    public final Object mo36433c(Object obj, String str) {
        switch (this.f44923r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return m36514j(str);
                }
                boolean[] zArrM36514j = m36514j(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrM36514j, 0, zArrCopyOf, length, 1);
                AbstractC22676k.m65747g(zArrCopyOf);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                C12940a1 c12940a1 = AbstractC12958g1.f44767l;
                return list != null ? AbstractC25265s.m74129g1(list, AbstractC37056f.m118958J(c12940a1.mo36413d(str))) : AbstractC37056f.m118958J(c12940a1.mo36413d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return m36511g(str);
                }
                float[] fArrM36511g = m36511g(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrM36511g, 0, fArrCopyOf, length2, 1);
                AbstractC22676k.m65747g(fArrCopyOf);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                C12940a1 c12940a2 = AbstractC12958g1.f44764i;
                return list2 != null ? AbstractC25265s.m74129g1(list2, AbstractC37056f.m118958J(c12940a2.mo36413d(str))) : AbstractC37056f.m118958J(c12940a2.mo36413d(str));
            case 4:
                int[] iArr = (int[]) obj;
                return iArr != null ? AbstractC25260n.m74031G0(iArr, m36512h(str)) : m36512h(str);
            case 5:
                List list3 = (List) obj;
                C12940a1 c12940a3 = AbstractC12958g1.f44757b;
                return list3 != null ? AbstractC25265s.m74129g1(list3, AbstractC37056f.m118958J(c12940a3.mo36413d(str))) : AbstractC37056f.m118958J(c12940a3.mo36413d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return m36513i(str);
                }
                long[] jArrM36513i = m36513i(str);
                int length3 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length3 + 1);
                System.arraycopy(jArrM36513i, 0, jArrCopyOf, length3, 1);
                AbstractC22676k.m65747g(jArrCopyOf);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                C12940a1 c12940a4 = AbstractC12958g1.f44761f;
                return list4 != null ? AbstractC25265s.m74129g1(list4, AbstractC37056f.m118958J(c12940a4.mo36413d(str))) : AbstractC37056f.m118958J(c12940a4.mo36413d(str));
            case 8:
                String[] strArr = (String[]) obj;
                return strArr != null ? (String[]) AbstractC25260n.m74032H0(strArr, new String[]{str}) : new String[]{str};
            default:
                List list5 = (List) obj;
                return list5 != null ? AbstractC25265s.m74129g1(list5, AbstractC37056f.m118958J(str)) : AbstractC37056f.m118958J(str);
        }
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: d */
    public final Object mo36413d(String value) {
        switch (this.f44923r) {
            case 0:
                return m36514j(value);
            case 1:
                AbstractC22676k.m65750j(value, "value");
                return AbstractC37056f.m118958J(AbstractC12958g1.f44767l.mo36413d(value));
            case 2:
                return m36511g(value);
            case 3:
                AbstractC22676k.m65750j(value, "value");
                return AbstractC37056f.m118958J(AbstractC12958g1.f44764i.mo36413d(value));
            case 4:
                return m36512h(value);
            case 5:
                AbstractC22676k.m65750j(value, "value");
                return AbstractC37056f.m118958J(AbstractC12958g1.f44757b.mo36413d(value));
            case 6:
                return m36513i(value);
            case 7:
                AbstractC22676k.m65750j(value, "value");
                return AbstractC37056f.m118958J(AbstractC12958g1.f44761f.mo36413d(value));
            case 8:
                AbstractC22676k.m65750j(value, "value");
                return new String[]{value};
            default:
                AbstractC22676k.m65750j(value, "value");
                return AbstractC37056f.m118958J(value);
        }
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: e */
    public final void mo36414e(Bundle bundle, String key, Object obj) {
        switch (this.f44923r) {
            case 0:
                AbstractC22676k.m65750j(key, "key");
                bundle.putBooleanArray(key, (boolean[]) obj);
                break;
            case 1:
                List list = (List) obj;
                AbstractC22676k.m65750j(key, "key");
                bundle.putBooleanArray(key, list != null ? AbstractC25265s.m74160y1(list) : null);
                break;
            case 2:
                AbstractC22676k.m65750j(key, "key");
                bundle.putFloatArray(key, (float[]) obj);
                break;
            case 3:
                List list2 = (List) obj;
                AbstractC22676k.m65750j(key, "key");
                bundle.putFloatArray(key, list2 != null ? AbstractC25265s.m74089B1(list2) : null);
                break;
            case 4:
                AbstractC22676k.m65750j(key, "key");
                bundle.putIntArray(key, (int[]) obj);
                break;
            case 5:
                List list3 = (List) obj;
                AbstractC22676k.m65750j(key, "key");
                bundle.putIntArray(key, list3 != null ? AbstractC25265s.m74091C1(list3) : null);
                break;
            case 6:
                AbstractC22676k.m65750j(key, "key");
                bundle.putLongArray(key, (long[]) obj);
                break;
            case 7:
                List list4 = (List) obj;
                AbstractC22676k.m65750j(key, "key");
                bundle.putLongArray(key, list4 != null ? AbstractC25265s.m74095E1(list4) : null);
                break;
            case 8:
                AbstractC22676k.m65750j(key, "key");
                bundle.putStringArray(key, (String[]) obj);
                break;
            default:
                List list5 = (List) obj;
                AbstractC22676k.m65750j(key, "key");
                bundle.putStringArray(key, list5 != null ? (String[]) list5.toArray(new String[0]) : null);
                break;
        }
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: f */
    public final boolean mo36422f(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        switch (this.f44923r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                Boolean[] boolArr2 = null;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i13 = 0; i13 < length; i13++) {
                        boolArr[i13] = Boolean.valueOf(zArr[i13]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    boolArr2 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        boolArr2[i14] = Boolean.valueOf(zArr2[i14]);
                    }
                }
                return AbstractC25260n.m74058b0(boolArr, boolArr2);
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return AbstractC25260n.m74058b0(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
            case 2:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i15 = 0; i15 < length3; i15++) {
                        fArr[i15] = Float.valueOf(fArr2[i15]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    for (int i16 = 0; i16 < length4; i16++) {
                        fArr4[i16] = Float.valueOf(fArr3[i16]);
                    }
                }
                return AbstractC25260n.m74058b0(fArr, fArr4);
            case 3:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return AbstractC25260n.m74058b0(list3 != null ? (Float[]) list3.toArray(new Float[0]) : null, list4 != null ? (Float[]) list4.toArray(new Float[0]) : null);
            case 4:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                Integer[] numArr2 = null;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i17 = 0; i17 < length5; i17++) {
                        numArr[i17] = Integer.valueOf(iArr[i17]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    numArr2 = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    for (int i18 = 0; i18 < length6; i18++) {
                        numArr2[i18] = Integer.valueOf(iArr2[i18]);
                    }
                }
                return AbstractC25260n.m74058b0(numArr, numArr2);
            case 5:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                return AbstractC25260n.m74058b0(list5 != null ? (Integer[]) list5.toArray(new Integer[0]) : null, list6 != null ? (Integer[]) list6.toArray(new Integer[0]) : null);
            case 6:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i19 = 0; i19 < length7; i19++) {
                        lArr[i19] = Long.valueOf(jArr[i19]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    lArr2 = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    for (int i24 = 0; i24 < length8; i24++) {
                        lArr2[i24] = Long.valueOf(jArr2[i24]);
                    }
                }
                return AbstractC25260n.m74058b0(lArr, lArr2);
            case 7:
                List list7 = (List) obj;
                List list8 = (List) obj2;
                return AbstractC25260n.m74058b0(list7 != null ? (Long[]) list7.toArray(new Long[0]) : null, list8 != null ? (Long[]) list8.toArray(new Long[0]) : null);
            case 8:
                return AbstractC25260n.m74058b0((String[]) obj, (String[]) obj2);
            default:
                List list9 = (List) obj;
                List list10 = (List) obj2;
                return AbstractC25260n.m74058b0(list9 != null ? (String[]) list9.toArray(new String[0]) : null, list10 != null ? (String[]) list10.toArray(new String[0]) : null);
        }
    }
}
