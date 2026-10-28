package td3;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: td3.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C33732l {

    /* JADX INFO: renamed from: a */
    public final int f141084a;

    /* JADX INFO: renamed from: b */
    public final List f141085b;

    /* JADX INFO: renamed from: c */
    public final SparseArray f141086c;

    /* JADX INFO: renamed from: d */
    public final Map f141087d;

    /* JADX INFO: renamed from: e */
    public final int f141088e;

    /* JADX INFO: renamed from: f */
    public final String f141089f;

    /* JADX INFO: renamed from: g */
    public final byte[] f141090g;

    public C33732l(ArrayList arrayList, SparseArray sparseArray, HashMap map, int i13, int i14, String str, byte[] bArr) {
        this.f141085b = arrayList;
        this.f141086c = sparseArray;
        this.f141087d = map;
        this.f141089f = str;
        this.f141084a = i13;
        this.f141088e = i14;
        this.f141090g = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8 A[Catch: Exception -> 0x00cb, TryCatch #0 {Exception -> 0x00cb, blocks: (B:6:0x000f, B:8:0x0012, B:11:0x001e, B:17:0x0034, B:45:0x00c0, B:19:0x003a, B:20:0x003e, B:22:0x004d, B:23:0x0052, B:25:0x005a, B:26:0x005f, B:28:0x0066, B:29:0x006b, B:30:0x006f, B:32:0x0079, B:34:0x0090, B:35:0x0095, B:41:0x00a3, B:43:0x00b8, B:44:0x00bd, B:46:0x00c5), top: B:50:0x000f }] */
    /* JADX INFO: renamed from: a */
    public static C33732l m106616a(byte[] bArr) {
        ArrayList arrayList = null;
        if (bArr == null) {
            return null;
        }
        String str = null;
        int i13 = -1;
        byte b = -2147483648;
        int i14 = 0;
        SparseArray sparseArray = null;
        HashMap map = null;
        while (i14 < bArr.length) {
            try {
                int i15 = i14 + 1;
                int i16 = bArr[i14] & 255;
                if (i16 == 0) {
                    return new C33732l(arrayList, sparseArray, map, i13, b, str, bArr);
                }
                int i17 = i16 - 1;
                int i18 = i14 + 2;
                int i19 = bArr[i15] & 255;
                int i24 = 2;
                if (i19 == 22) {
                    if (i19 == 32) {
                        i24 = 4;
                    } else if (i19 == 33) {
                        i24 = 16;
                    }
                    byte[] bArr2 = new byte[i24];
                    System.arraycopy(bArr, i18, bArr2, 0, i24);
                    ParcelUuid parcelUuidM106612a = AbstractC33727g.m106612a(bArr2);
                    int i25 = i17 - i24;
                    byte[] bArr3 = new byte[i25];
                    System.arraycopy(bArr, i18 + i24, bArr3, 0, i25);
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(parcelUuidM106612a, bArr3);
                } else if (i19 == 255) {
                    int i26 = ((bArr[i14 + 3] & 255) << 8) + (bArr[i18] & 255);
                    int i27 = i16 - 3;
                    byte[] bArr4 = new byte[i27];
                    System.arraycopy(bArr, i14 + 4, bArr4, 0, i27);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray();
                    }
                    sparseArray.put(i26, bArr4);
                } else if (i19 != 32 && i19 != 33) {
                    switch (i19) {
                        case 1:
                            i13 = bArr[i18] & 255;
                            break;
                        case 2:
                        case 3:
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            m106617b(bArr, i18, i17, 2, arrayList);
                            break;
                        case 4:
                        case 5:
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            m106617b(bArr, i18, i17, 4, arrayList);
                            break;
                        case 6:
                        case 7:
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            m106617b(bArr, i18, i17, 16, arrayList);
                            break;
                        case 8:
                        case 9:
                            byte[] bArr5 = new byte[i17];
                            System.arraycopy(bArr, i18, bArr5, 0, i17);
                            str = new String(bArr5);
                            break;
                        case 10:
                            b = bArr[i18];
                            break;
                    }
                } else {
                    if (i19 == 32) {
                        i24 = 4;
                    } else if (i19 == 33) {
                        i24 = 16;
                    }
                    byte[] bArr6 = new byte[i24];
                    System.arraycopy(bArr, i18, bArr6, 0, i24);
                    ParcelUuid parcelUuidM106612a2 = AbstractC33727g.m106612a(bArr6);
                    int i28 = i17 - i24;
                    byte[] bArr7 = new byte[i28];
                    System.arraycopy(bArr, i18 + i24, bArr7, 0, i28);
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(parcelUuidM106612a2, bArr7);
                }
                i14 = i18 + i17;
            } catch (Exception unused) {
                Log.e("ScanRecord", "unable to parse scan record: " + Arrays.toString(bArr));
                return new C33732l(null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        return new C33732l(arrayList, sparseArray, map, i13, b, str, bArr);
    }

    /* JADX INFO: renamed from: b */
    public static void m106617b(byte[] bArr, int i13, int i14, int i15, ArrayList arrayList) {
        while (i14 > 0) {
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i13, bArr2, 0, i15);
            arrayList.add(AbstractC33727g.m106612a(bArr2));
            i14 -= i15;
            i13 += i15;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33732l.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f141090g, ((C33732l) obj).f141090g);
    }

    public final String toString() {
        String string;
        StringBuilder sb4 = new StringBuilder("ScanRecord [advertiseFlags=");
        sb4.append(this.f141084a);
        sb4.append(", serviceUuids=");
        sb4.append(this.f141085b);
        sb4.append(", manufacturerSpecificData=");
        String string2 = "{}";
        SparseArray sparseArray = this.f141086c;
        if (sparseArray == null) {
            string = "null";
        } else if (sparseArray.size() == 0) {
            string = "{}";
        } else {
            StringBuilder sb5 = new StringBuilder("{");
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                sb5.append(sparseArray.keyAt(i13));
                sb5.append("=");
                sb5.append(Arrays.toString((byte[]) sparseArray.valueAt(i13)));
            }
            sb5.append('}');
            string = sb5.toString();
        }
        sb4.append(string);
        sb4.append(", serviceData=");
        Map map = this.f141087d;
        if (map == null) {
            string2 = "null";
        } else if (!map.isEmpty()) {
            StringBuilder sb6 = new StringBuilder("{");
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Object key = ((Map.Entry) it.next()).getKey();
                sb6.append(key);
                sb6.append("=");
                sb6.append(Arrays.toString((byte[]) map.get(key)));
                if (it.hasNext()) {
                    sb6.append(", ");
                }
            }
            sb6.append('}');
            string2 = sb6.toString();
        }
        sb4.append(string2);
        sb4.append(", txPowerLevel=");
        sb4.append(this.f141088e);
        sb4.append(", deviceName=");
        return AbstractC25012a.m73376i(this.f141089f, "]", sb4);
    }
}
