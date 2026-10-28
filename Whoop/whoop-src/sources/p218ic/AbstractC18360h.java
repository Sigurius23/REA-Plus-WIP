package p218ic;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ic.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18360h {

    /* JADX INFO: renamed from: a */
    public static final String f71486a;

    static {
        String strM52887f = C18389w.m52887f("Data");
        AbstractC22676k.m65749i(strM52887f, "tagWithPrefix(...)");
        f71486a = strM52887f;
    }

    /* JADX INFO: renamed from: a */
    public static final Boolean[] m52862a(boolean[] zArr) {
        int length = zArr.length;
        Boolean[] boolArr = new Boolean[length];
        for (int i13 = 0; i13 < length; i13++) {
            boolArr[i13] = Boolean.valueOf(zArr[i13]);
        }
        return boolArr;
    }

    /* JADX INFO: renamed from: b */
    public static final Byte[] m52863b(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            bArr2[i13] = Byte.valueOf(bArr[i13]);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static final Double[] m52864c(double[] dArr) {
        int length = dArr.length;
        Double[] dArr2 = new Double[length];
        for (int i13 = 0; i13 < length; i13++) {
            dArr2[i13] = Double.valueOf(dArr[i13]);
        }
        return dArr2;
    }

    /* JADX INFO: renamed from: d */
    public static final Float[] m52865d(float[] fArr) {
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        for (int i13 = 0; i13 < length; i13++) {
            fArr2[i13] = Float.valueOf(fArr[i13]);
        }
        return fArr2;
    }

    /* JADX INFO: renamed from: e */
    public static final Integer[] m52866e(int[] iArr) {
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i13 = 0; i13 < length; i13++) {
            numArr[i13] = Integer.valueOf(iArr[i13]);
        }
        return numArr;
    }

    /* JADX INFO: renamed from: f */
    public static final Long[] m52867f(long[] jArr) {
        int length = jArr.length;
        Long[] lArr = new Long[length];
        for (int i13 = 0; i13 < length; i13++) {
            lArr[i13] = Long.valueOf(jArr[i13]);
        }
        return lArr;
    }
}
