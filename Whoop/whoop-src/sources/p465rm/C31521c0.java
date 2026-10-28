package p465rm;

import in.C18715c;
import in.InterfaceC18714b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import mo.C25721b;
import p000.AbstractC11266d;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p556vm.C36135b;
import p556vm.C36136c;
import q63.AbstractC30007c;
import qa.C30097b;

/* JADX INFO: renamed from: rm.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31521c0 implements InterfaceC31529f {

    /* JADX INFO: renamed from: g0 */
    public static final C31521c0 f130068g0 = new C31521c0(new C31518b0());

    /* JADX INFO: renamed from: h0 */
    public static final C30097b f130069h0 = new C30097b(15);

    /* JADX INFO: renamed from: E */
    public final int f130070E;

    /* JADX INFO: renamed from: F */
    public final int f130071F;

    /* JADX INFO: renamed from: G */
    public final int f130072G;

    /* JADX INFO: renamed from: H */
    public final int f130073H;

    /* JADX INFO: renamed from: I */
    public final String f130074I;

    /* JADX INFO: renamed from: J */
    public final C18715c f130075J;

    /* JADX INFO: renamed from: K */
    public final String f130076K;

    /* JADX INFO: renamed from: L */
    public final String f130077L;

    /* JADX INFO: renamed from: M */
    public final int f130078M;

    /* JADX INFO: renamed from: N */
    public final List f130079N;

    /* JADX INFO: renamed from: O */
    public final C36136c f130080O;

    /* JADX INFO: renamed from: P */
    public final long f130081P;

    /* JADX INFO: renamed from: Q */
    public final int f130082Q;

    /* JADX INFO: renamed from: R */
    public final int f130083R;

    /* JADX INFO: renamed from: S */
    public final float f130084S;

    /* JADX INFO: renamed from: T */
    public final int f130085T;

    /* JADX INFO: renamed from: U */
    public final float f130086U;

    /* JADX INFO: renamed from: V */
    public final byte[] f130087V;

    /* JADX INFO: renamed from: W */
    public final int f130088W;

    /* JADX INFO: renamed from: X */
    public final C25721b f130089X;

    /* JADX INFO: renamed from: Y */
    public final int f130090Y;

    /* JADX INFO: renamed from: Z */
    public final int f130091Z;

    /* JADX INFO: renamed from: a0 */
    public final int f130092a0;

    /* JADX INFO: renamed from: b0 */
    public final int f130093b0;

    /* JADX INFO: renamed from: c0 */
    public final int f130094c0;

    /* JADX INFO: renamed from: d0 */
    public final int f130095d0;

    /* JADX INFO: renamed from: e0 */
    public final int f130096e0;

    /* JADX INFO: renamed from: f0 */
    public int f130097f0;

    /* JADX INFO: renamed from: w */
    public final String f130098w;

    /* JADX INFO: renamed from: x */
    public final String f130099x;

    /* JADX INFO: renamed from: y */
    public final String f130100y;

    /* JADX INFO: renamed from: z */
    public final int f130101z;

    public C31521c0(C31518b0 c31518b0) {
        this.f130098w = c31518b0.f130037a;
        this.f130099x = c31518b0.f130038b;
        this.f130100y = AbstractC24567y.m71663A(c31518b0.f130039c);
        this.f130101z = c31518b0.f130040d;
        this.f130070E = c31518b0.f130041e;
        int i13 = c31518b0.f130042f;
        this.f130071F = i13;
        int i14 = c31518b0.f130043g;
        this.f130072G = i14;
        this.f130073H = i14 != -1 ? i14 : i13;
        this.f130074I = c31518b0.f130044h;
        this.f130075J = c31518b0.f130045i;
        this.f130076K = c31518b0.f130046j;
        this.f130077L = c31518b0.f130047k;
        this.f130078M = c31518b0.f130048l;
        List list = c31518b0.f130049m;
        this.f130079N = list == null ? Collections.EMPTY_LIST : list;
        C36136c c36136c = c31518b0.f130050n;
        this.f130080O = c36136c;
        this.f130081P = c31518b0.f130051o;
        this.f130082Q = c31518b0.f130052p;
        this.f130083R = c31518b0.f130053q;
        this.f130084S = c31518b0.f130054r;
        int i15 = c31518b0.f130055s;
        this.f130085T = i15 == -1 ? 0 : i15;
        float f13 = c31518b0.f130056t;
        this.f130086U = f13 == -1.0f ? 1.0f : f13;
        this.f130087V = c31518b0.f130057u;
        this.f130088W = c31518b0.f130058v;
        this.f130089X = c31518b0.f130059w;
        this.f130090Y = c31518b0.f130060x;
        this.f130091Z = c31518b0.f130061y;
        this.f130092a0 = c31518b0.f130062z;
        int i16 = c31518b0.f130033A;
        this.f130093b0 = i16 == -1 ? 0 : i16;
        int i17 = c31518b0.f130034B;
        this.f130094c0 = i17 != -1 ? i17 : 0;
        this.f130095d0 = c31518b0.f130035C;
        int i18 = c31518b0.f130036D;
        if (i18 != 0 || c36136c == null) {
            this.f130096e0 = i18;
        } else {
            this.f130096e0 = 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C31518b0 m97113a() {
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130037a = this.f130098w;
        c31518b0.f130038b = this.f130099x;
        c31518b0.f130039c = this.f130100y;
        c31518b0.f130040d = this.f130101z;
        c31518b0.f130041e = this.f130070E;
        c31518b0.f130042f = this.f130071F;
        c31518b0.f130043g = this.f130072G;
        c31518b0.f130044h = this.f130074I;
        c31518b0.f130045i = this.f130075J;
        c31518b0.f130046j = this.f130076K;
        c31518b0.f130047k = this.f130077L;
        c31518b0.f130048l = this.f130078M;
        c31518b0.f130049m = this.f130079N;
        c31518b0.f130050n = this.f130080O;
        c31518b0.f130051o = this.f130081P;
        c31518b0.f130052p = this.f130082Q;
        c31518b0.f130053q = this.f130083R;
        c31518b0.f130054r = this.f130084S;
        c31518b0.f130055s = this.f130085T;
        c31518b0.f130056t = this.f130086U;
        c31518b0.f130057u = this.f130087V;
        c31518b0.f130058v = this.f130088W;
        c31518b0.f130059w = this.f130089X;
        c31518b0.f130060x = this.f130090Y;
        c31518b0.f130061y = this.f130091Z;
        c31518b0.f130062z = this.f130092a0;
        c31518b0.f130033A = this.f130093b0;
        c31518b0.f130034B = this.f130094c0;
        c31518b0.f130035C = this.f130095d0;
        c31518b0.f130036D = this.f130096e0;
        return c31518b0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m97114b(C31521c0 c31521c0) {
        List list = this.f130079N;
        if (list.size() != c31521c0.f130079N.size()) {
            return false;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!Arrays.equals((byte[]) list.get(i13), (byte[]) c31521c0.f130079N.get(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0052  */
    /* JADX INFO: renamed from: c */
    public final C31521c0 m97115c(C31521c0 c31521c0) {
        String str;
        String str2;
        int i13;
        int i14;
        if (this == c31521c0) {
            return this;
        }
        int iM71613g = AbstractC24555m.m71613g(this.f130077L);
        String str3 = c31521c0.f130098w;
        C18715c c18715c = c31521c0.f130075J;
        String str4 = c31521c0.f130099x;
        if (str4 == null) {
            str4 = this.f130099x;
        }
        if ((iM71613g != 3 && iM71613g != 1) || (str = c31521c0.f130100y) == null) {
            str = this.f130100y;
        }
        int i15 = this.f130071F;
        if (i15 == -1) {
            i15 = c31521c0.f130071F;
        }
        int i16 = this.f130072G;
        if (i16 == -1) {
            i16 = c31521c0.f130072G;
        }
        String str5 = this.f130074I;
        if (str5 == null) {
            String strM71683n = AbstractC24567y.m71683n(iM71613g, c31521c0.f130074I);
            if (AbstractC24567y.m71668F(strM71683n).length == 1) {
                str5 = strM71683n;
            }
        }
        int i17 = 0;
        C18715c c18715c2 = this.f130075J;
        if (c18715c2 != null) {
            if (c18715c == null) {
                c18715c = c18715c2;
            } else {
                InterfaceC18714b[] interfaceC18714bArr = c18715c.f73525w;
                if (interfaceC18714bArr.length == 0) {
                    c18715c = c18715c2;
                } else {
                    InterfaceC18714b[] interfaceC18714bArr2 = c18715c2.f73525w;
                    int i18 = AbstractC24567y.f95875a;
                    Object[] objArrCopyOf = Arrays.copyOf(interfaceC18714bArr2, interfaceC18714bArr2.length + interfaceC18714bArr.length);
                    System.arraycopy(interfaceC18714bArr, 0, objArrCopyOf, interfaceC18714bArr2.length, interfaceC18714bArr.length);
                    c18715c = new C18715c((InterfaceC18714b[]) objArrCopyOf);
                }
            }
        }
        float f13 = this.f130084S;
        if (f13 == -1.0f && iM71613g == 2) {
            f13 = c31521c0.f130084S;
        }
        int i19 = this.f130101z | c31521c0.f130101z;
        int i24 = this.f130070E | c31521c0.f130070E;
        C36136c c36136c = c31521c0.f130080O;
        ArrayList arrayList = new ArrayList();
        if (c36136c != null) {
            str2 = c36136c.f154641y;
            C36135b[] c36135bArr = c36136c.f154639w;
            int length = c36135bArr.length;
            while (i17 < length) {
                C36135b[] c36135bArr2 = c36135bArr;
                C36135b c36135b = c36135bArr2[i17];
                int i25 = i17;
                if (c36135b.f154634E != null) {
                    arrayList.add(c36135b);
                }
                i17 = i25 + 1;
                c36135bArr = c36135bArr2;
            }
        } else {
            str2 = null;
        }
        C36136c c36136c2 = this.f130080O;
        if (c36136c2 != null) {
            if (str2 == null) {
                str2 = c36136c2.f154641y;
            }
            int size = arrayList.size();
            C36135b[] c36135bArr3 = c36136c2.f154639w;
            int length2 = c36135bArr3.length;
            int i26 = 0;
            while (i26 < length2) {
                int i27 = i26;
                C36135b c36135b2 = c36135bArr3[i27];
                C36135b[] c36135bArr4 = c36135bArr3;
                if (c36135b2.f154634E != null) {
                    UUID uuid = c36135b2.f154636x;
                    i14 = length2;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= size) {
                            i13 = size;
                            arrayList.add(c36135b2);
                            break;
                        }
                        i13 = size;
                        if (((C36135b) arrayList.get(i28)).f154636x.equals(uuid)) {
                            break;
                        }
                        i28++;
                        size = i13;
                    }
                } else {
                    i13 = size;
                    i14 = length2;
                }
                i26 = i27 + 1;
                c36135bArr3 = c36135bArr4;
                length2 = i14;
                size = i13;
            }
        }
        C36136c c36136c3 = arrayList.isEmpty() ? null : new C36136c(str2, false, (C36135b[]) arrayList.toArray(new C36135b[0]));
        C31518b0 c31518b0M97113a = m97113a();
        c31518b0M97113a.f130037a = str3;
        c31518b0M97113a.f130038b = str4;
        c31518b0M97113a.f130039c = str;
        c31518b0M97113a.f130040d = i19;
        c31518b0M97113a.f130041e = i24;
        c31518b0M97113a.f130042f = i15;
        c31518b0M97113a.f130043g = i16;
        c31518b0M97113a.f130044h = str5;
        c31518b0M97113a.f130045i = c18715c;
        c31518b0M97113a.f130050n = c36136c3;
        c31518b0M97113a.f130054r = f13;
        return new C31521c0(c31518b0M97113a);
    }

    public final boolean equals(Object obj) {
        int i13;
        if (this == obj) {
            return true;
        }
        if (obj != null && C31521c0.class == obj.getClass()) {
            C31521c0 c31521c0 = (C31521c0) obj;
            int i14 = this.f130097f0;
            if ((i14 == 0 || (i13 = c31521c0.f130097f0) == 0 || i14 == i13) && this.f130101z == c31521c0.f130101z && this.f130070E == c31521c0.f130070E && this.f130071F == c31521c0.f130071F && this.f130072G == c31521c0.f130072G && this.f130078M == c31521c0.f130078M && this.f130081P == c31521c0.f130081P && this.f130082Q == c31521c0.f130082Q && this.f130083R == c31521c0.f130083R && this.f130085T == c31521c0.f130085T && this.f130088W == c31521c0.f130088W && this.f130090Y == c31521c0.f130090Y && this.f130091Z == c31521c0.f130091Z && this.f130092a0 == c31521c0.f130092a0 && this.f130093b0 == c31521c0.f130093b0 && this.f130094c0 == c31521c0.f130094c0 && this.f130095d0 == c31521c0.f130095d0 && this.f130096e0 == c31521c0.f130096e0 && Float.compare(this.f130084S, c31521c0.f130084S) == 0 && Float.compare(this.f130086U, c31521c0.f130086U) == 0 && AbstractC24567y.m71670a(this.f130098w, c31521c0.f130098w) && AbstractC24567y.m71670a(this.f130099x, c31521c0.f130099x) && AbstractC24567y.m71670a(this.f130074I, c31521c0.f130074I) && AbstractC24567y.m71670a(this.f130076K, c31521c0.f130076K) && AbstractC24567y.m71670a(this.f130077L, c31521c0.f130077L) && AbstractC24567y.m71670a(this.f130100y, c31521c0.f130100y) && Arrays.equals(this.f130087V, c31521c0.f130087V) && AbstractC24567y.m71670a(this.f130075J, c31521c0.f130075J) && AbstractC24567y.m71670a(this.f130089X, c31521c0.f130089X) && AbstractC24567y.m71670a(this.f130080O, c31521c0.f130080O) && m97114b(c31521c0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f130097f0 == 0) {
            String str = this.f130098w;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f130099x;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f130100y;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f130101z) * 31) + this.f130070E) * 31) + this.f130071F) * 31) + this.f130072G) * 31;
            String str4 = this.f130074I;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C18715c c18715c = this.f130075J;
            int iHashCode5 = (iHashCode4 + (c18715c == null ? 0 : Arrays.hashCode(c18715c.f73525w))) * 31;
            String str5 = this.f130076K;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f130077L;
            this.f130097f0 = ((((((((((((((((Float.floatToIntBits(this.f130086U) + ((((Float.floatToIntBits(this.f130084S) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f130078M) * 31) + ((int) this.f130081P)) * 31) + this.f130082Q) * 31) + this.f130083R) * 31)) * 31) + this.f130085T) * 31)) * 31) + this.f130088W) * 31) + this.f130090Y) * 31) + this.f130091Z) * 31) + this.f130092a0) * 31) + this.f130093b0) * 31) + this.f130094c0) * 31) + this.f130095d0) * 31) + this.f130096e0;
        }
        return this.f130097f0;
    }

    public final String toString() {
        String str = this.f130098w;
        int iM91832b = AbstractC30007c.m91832b(104, str);
        String str2 = this.f130099x;
        int iM91832b2 = AbstractC30007c.m91832b(iM91832b, str2);
        String str3 = this.f130076K;
        int iM91832b3 = AbstractC30007c.m91832b(iM91832b2, str3);
        String str4 = this.f130077L;
        int iM91832b4 = AbstractC30007c.m91832b(iM91832b3, str4);
        String str5 = this.f130074I;
        int iM91832b5 = AbstractC30007c.m91832b(iM91832b4, str5);
        String str6 = this.f130100y;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b5, str6));
        sb4.append("Format(");
        sb4.append(str);
        sb4.append(", ");
        sb4.append(str2);
        AbstractC11266d.m30444B(sb4, ", ", str3, ", ", str4);
        sb4.append(", ");
        sb4.append(str5);
        sb4.append(", ");
        sb4.append(this.f130073H);
        sb4.append(", ");
        sb4.append(str6);
        sb4.append(", [");
        sb4.append(this.f130082Q);
        sb4.append(", ");
        sb4.append(this.f130083R);
        sb4.append(", ");
        sb4.append(this.f130084S);
        sb4.append("], [");
        sb4.append(this.f130090Y);
        sb4.append(", ");
        sb4.append(this.f130091Z);
        sb4.append("])");
        return sb4.toString();
    }
}
