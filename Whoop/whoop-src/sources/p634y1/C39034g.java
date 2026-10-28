package p634y1;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m83.C25272z;
import p002a0.AbstractC0015d1;
import p002a0.C0057v0;
import p474s.C31983m2;
import p715kotlin.jvm.functions.Function1;
import va3.AbstractC35846d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C39034g implements InterfaceC39033f {

    /* JADX INFO: renamed from: w */
    public final Function1 f168001w;

    /* JADX INFO: renamed from: x */
    public final C0057v0 f168002x;

    /* JADX INFO: renamed from: y */
    public C0057v0 f168003y;

    public C39034g(Map map, Function1 function1) {
        C0057v0 c0057v0;
        this.f168001w = function1;
        if (map == null || map.isEmpty()) {
            c0057v0 = null;
        } else {
            c0057v0 = new C0057v0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c0057v0.m135m(entry.getKey(), entry.getValue());
            }
        }
        this.f168002x = c0057v0;
    }

    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: b */
    public final InterfaceC39032e mo7445b(InterfaceC4339a interfaceC4339a, String str) {
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (!AbstractC35846d.m113784i(str.charAt(i13))) {
                C0057v0 c0057v0 = this.f168003y;
                if (c0057v0 == null) {
                    long[] jArr = AbstractC0015d1.f36a;
                    c0057v0 = new C0057v0();
                    this.f168003y = c0057v0;
                }
                Object objM129g = c0057v0.m129g(str);
                if (objM129g == null) {
                    objM129g = new ArrayList();
                    c0057v0.m135m(str, objM129g);
                }
                ((List) objM129g).add(interfaceC4339a);
                return new C31983m2(c0057v0, str, interfaceC4339a);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: d */
    public final boolean mo7446d(Object obj) {
        return ((Boolean) this.f168001w.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: e */
    public final Map mo7447e() {
        char c3;
        long j7;
        long j13;
        long j14;
        long[] jArr;
        int i13;
        long[] jArr2;
        int i14;
        C0057v0 c0057v0 = this.f168002x;
        if (c0057v0 == null && this.f168003y == null) {
            return C25272z.f99163w;
        }
        int i15 = 0;
        int i16 = c0057v0 != null ? c0057v0.f174e : 0;
        C0057v0 c0057v1 = this.f168003y;
        HashMap map = new HashMap(i16 + (c0057v1 != null ? c0057v1.f174e : 0));
        char c7 = 7;
        long j15 = -9187201950435737472L;
        int i17 = 8;
        if (c0057v0 != null) {
            Object[] objArr = c0057v0.f171b;
            Object[] objArr2 = c0057v0.f172c;
            long[] jArr3 = c0057v0.f170a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i18 = 0;
                j13 = 128;
                while (true) {
                    long j16 = jArr3[i18];
                    j14 = 255;
                    if ((((~j16) << c7) & j16 & j15) != j15) {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        int i24 = 0;
                        while (i24 < i19) {
                            if ((j16 & 255) < 128) {
                                int i25 = (i18 << 3) + i24;
                                map.put((String) objArr[i25], (List) objArr2[i25]);
                            }
                            j16 >>= 8;
                            i24++;
                            c7 = c7;
                            j15 = j15;
                        }
                        c3 = c7;
                        j7 = j15;
                        if (i19 != 8) {
                            break;
                        }
                    } else {
                        c3 = c7;
                        j7 = j15;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    c7 = c3;
                    j15 = j7;
                }
            } else {
                c3 = 7;
                j7 = -9187201950435737472L;
                j13 = 128;
                j14 = 255;
            }
        } else {
            c3 = 7;
            j7 = -9187201950435737472L;
            j13 = 128;
            j14 = 255;
        }
        C0057v0 c0057v2 = this.f168003y;
        if (c0057v2 != null) {
            Object[] objArr3 = c0057v2.f171b;
            Object[] objArr4 = c0057v2.f172c;
            long[] jArr4 = c0057v2.f170a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i26 = 0;
                while (true) {
                    long j17 = jArr4[i26];
                    if ((((~j17) << c3) & j17 & j7) != j7) {
                        int i27 = 8 - ((~(i26 - length2)) >>> 31);
                        int i28 = i15;
                        while (i28 < i27) {
                            if ((j17 & j14) < j13) {
                                int i29 = (i26 << 3) + i28;
                                Object obj = objArr3[i29];
                                List list = (List) objArr4[i29];
                                String str = (String) obj;
                                i14 = i17;
                                if (list.size() == 1) {
                                    Object objInvoke = ((InterfaceC4339a) list.get(i15)).invoke();
                                    if (objInvoke != null) {
                                        if (!mo7446d(objInvoke)) {
                                            throw new IllegalStateException(AbstractC39038k.m124455a(objInvoke).toString());
                                        }
                                        map.put(str, AbstractC37056f.m118980f(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i15 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((InterfaceC4339a) list.get(i15)).invoke();
                                        if (objInvoke2 != null && !mo7446d(objInvoke2)) {
                                            throw new IllegalStateException(AbstractC39038k.m124455a(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i15++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i14 = i17;
                            }
                            j17 >>= i14;
                            i28++;
                            i17 = i14;
                            jArr4 = jArr2;
                            i15 = 0;
                        }
                        jArr = jArr4;
                        i13 = i17;
                        if (i27 != i13) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i13 = i17;
                    }
                    if (i26 == length2) {
                        break;
                    }
                    i26++;
                    i17 = i13;
                    jArr4 = jArr;
                    i15 = 0;
                }
            }
        }
        return map;
    }

    @Override // p634y1.InterfaceC39033f
    /* JADX INFO: renamed from: f */
    public final Object mo7448f(String str) {
        C0057v0 c0057v0 = this.f168002x;
        List list = c0057v0 != null ? (List) c0057v0.m133k(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c0057v0 != null) {
            List listSubList = list.subList(1, list.size());
            int iM128f = c0057v0.m128f(str);
            if (iM128f < 0) {
                iM128f = ~iM128f;
            }
            Object[] objArr = c0057v0.f172c;
            Object obj = objArr[iM128f];
            c0057v0.f171b[iM128f] = str;
            objArr[iM128f] = listSubList;
        }
        return list.get(0);
    }
}
