package y00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.C25235a0;
import m83.C25272z;
import n83.C26466i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p319m4.AbstractC25012a;
import p499t9.C33623c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: y00.d5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38809d5 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38809d5> CREATOR = new C38858i4(8);

    /* JADX INFO: renamed from: E */
    public final C38969u4 f167008E;

    /* JADX INFO: renamed from: F */
    public final C39005y4 f167009F;

    /* JADX INFO: renamed from: G */
    public final C38924p4 f167010G;

    /* JADX INFO: renamed from: H */
    public final C38933q4 f167011H;

    /* JADX INFO: renamed from: I */
    public final C38799c5 f167012I;

    /* JADX INFO: renamed from: J */
    public final C38996x4 f167013J;

    /* JADX INFO: renamed from: K */
    public final C38789b5 f167014K;

    /* JADX INFO: renamed from: L */
    public final C38987w4 f167015L;

    /* JADX INFO: renamed from: M */
    public final C38960t4 f167016M;

    /* JADX INFO: renamed from: N */
    public final C38779a5 f167017N;

    /* JADX INFO: renamed from: O */
    public final C39014z4 f167018O;

    /* JADX INFO: renamed from: P */
    public final C38977v3 f167019P;

    /* JADX INFO: renamed from: Q */
    public final EnumC38941r3 f167020Q;

    /* JADX INFO: renamed from: R */
    public final C38780a6 f167021R;

    /* JADX INFO: renamed from: S */
    public final Map f167022S;

    /* JADX INFO: renamed from: T */
    public final Set f167023T;

    /* JADX INFO: renamed from: U */
    public final C38901n f167024U;

    /* JADX INFO: renamed from: V */
    public final Map f167025V;

    /* JADX INFO: renamed from: w */
    public final String f167026w;

    /* JADX INFO: renamed from: x */
    public final boolean f167027x;

    /* JADX INFO: renamed from: y */
    public final C38951s4 f167028y;

    /* JADX INFO: renamed from: z */
    public final C38978v4 f167029z;

    public /* synthetic */ C38809d5(String str, boolean z4, C38977v3 c38977v3, EnumC38941r3 enumC38941r3, Set set, C38901n c38901n, Map map, int i13) {
        this(str, z4, null, null, null, null, null, null, null, null, null, null, null, null, null, (i13 & 32768) != 0 ? null : c38977v3, enumC38941r3, null, null, set, c38901n, map);
    }

    /* JADX INFO: renamed from: f */
    public static C38809d5 m124340f(C38809d5 c38809d5, C38780a6 c38780a6, C26466i c26466i, int i13) {
        String code = c38809d5.f167026w;
        boolean z4 = c38809d5.f167027x;
        C38951s4 c38951s4 = c38809d5.f167028y;
        C38978v4 c38978v4 = c38809d5.f167029z;
        C38969u4 c38969u4 = c38809d5.f167008E;
        C39005y4 c39005y4 = c38809d5.f167009F;
        C38924p4 c38924p4 = c38809d5.f167010G;
        C38933q4 c38933q4 = c38809d5.f167011H;
        C38799c5 c38799c5 = c38809d5.f167012I;
        C38996x4 c38996x4 = c38809d5.f167013J;
        C38789b5 c38789b5 = c38809d5.f167014K;
        C38987w4 c38987w4 = c38809d5.f167015L;
        C38960t4 c38960t4 = c38809d5.f167016M;
        C38779a5 c38779a5 = c38809d5.f167017N;
        C39014z4 c39014z4 = c38809d5.f167018O;
        C38977v3 c38977v3 = c38809d5.f167019P;
        EnumC38941r3 enumC38941r3 = c38809d5.f167020Q;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            c38780a6 = c38809d5.f167021R;
        }
        Map map = c38809d5.f167022S;
        Set productUsage = (i13 & 524288) != 0 ? c38809d5.f167023T : c26466i;
        C38901n c38901n = c38809d5.f167024U;
        Map map2 = c38809d5.f167025V;
        c38809d5.getClass();
        AbstractC22676k.m65750j(code, "code");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        return new C38809d5(code, z4, c38951s4, c38978v4, c38969u4, c39005y4, c38924p4, c38933q4, c38799c5, c38996x4, c38789b5, c38987w4, c38960t4, c38779a5, c39014z4, c38977v3, enumC38941r3, c38780a6, map, productUsage, c38901n, map2);
    }

    /* JADX INFO: renamed from: b */
    public final String m124341b() {
        Object obj = ((LinkedHashMap) mo124325c0()).get("card");
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("number") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str != null) {
            return AbstractC39414r.m125867M0(4, str);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C39014z4 c39014z4;
        Map mapMo124325c0;
        Map map = C25272z.f99163w;
        Map mapM73995d0 = this.f167025V;
        if (mapM73995d0 == null) {
            String str = this.f167026w;
            Map mapM95645u = AbstractC31061c.m95645u("type", str);
            C38977v3 c38977v3 = this.f167019P;
            Map mapM124385o = c38977v3 != null ? AbstractC38963t7.m124385o("billing_details", c38977v3.mo124325c0()) : null;
            if (mapM124385o == null) {
                mapM124385o = map;
            }
            LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(mapM95645u, mapM124385o);
            C33623c0 c33623c0 = EnumC38828f4.f167088G;
            if (AbstractC22676k.m65745e(str, "card")) {
                C38951s4 c38951s4 = this.f167028y;
                if (c38951s4 != null) {
                    mapMo124325c0 = c38951s4.mo124325c0();
                } else {
                    mapMo124325c0 = null;
                }
            } else if (AbstractC22676k.m65745e(str, "ideal")) {
                C38978v4 c38978v4 = this.f167029z;
                if (c38978v4 != null) {
                    mapMo124325c0 = c38978v4.mo124325c0();
                } else {
                    mapMo124325c0 = null;
                }
            } else if (AbstractC22676k.m65745e(str, "fpx")) {
                C38969u4 c38969u4 = this.f167008E;
                if (c38969u4 != null) {
                    mapMo124325c0 = c38969u4.mo124325c0();
                } else {
                    mapMo124325c0 = null;
                }
            } else if (AbstractC22676k.m65745e(str, "sepa_debit")) {
                C39005y4 c39005y4 = this.f167009F;
                if (c39005y4 != null) {
                    mapMo124325c0 = c39005y4.mo124325c0();
                } else {
                    mapMo124325c0 = null;
                }
            } else if (AbstractC22676k.m65745e(str, "au_becs_debit")) {
                C38924p4 c38924p4 = this.f167010G;
                if (c38924p4 != null) {
                    mapMo124325c0 = c38924p4.mo124325c0();
                } else {
                    mapMo124325c0 = null;
                }
            } else if (AbstractC22676k.m65745e(str, "bacs_debit")) {
                C38933q4 c38933q4 = this.f167011H;
                if (c38933q4 != null) {
                    mapMo124325c0 = c38933q4.mo124325c0();
                } else {
                    mapMo124325c0 = null;
                }
            } else if (AbstractC22676k.m65745e(str, "upi")) {
                C38799c5 c38799c5 = this.f167012I;
                if (c38799c5 != null) {
                    mapMo124325c0 = c38799c5.mo124325c0();
                } else {
                    mapMo124325c0 = null;
                }
            } else if (AbstractC22676k.m65745e(str, "netbanking")) {
                C38996x4 c38996x4 = this.f167013J;
                if (c38996x4 != null) {
                    mapMo124325c0 = c38996x4.mo124325c0();
                } else {
                    mapMo124325c0 = null;
                }
            } else if (AbstractC22676k.m65745e(str, "us_bank_account")) {
                C38789b5 c38789b5 = this.f167014K;
                if (c38789b5 != null) {
                    mapMo124325c0 = c38789b5.mo124325c0();
                } else {
                    mapMo124325c0 = null;
                }
            } else if (AbstractC22676k.m65745e(str, "link")) {
                C38987w4 c38987w4 = this.f167015L;
                if (c38987w4 != null) {
                    mapMo124325c0 = c38987w4.mo124325c0();
                } else {
                    mapMo124325c0 = null;
                }
            } else if (!AbstractC22676k.m65745e(str, "shop_pay") || (c39014z4 = this.f167018O) == null) {
                mapMo124325c0 = null;
            } else {
                mapMo124325c0 = c39014z4.mo124325c0();
            }
            if (mapMo124325c0 == null || mapMo124325c0.isEmpty()) {
                mapMo124325c0 = null;
            }
            Map mapM124385o2 = mapMo124325c0 != null ? AbstractC38963t7.m124385o(str, mapMo124325c0) : null;
            if (mapM124385o2 == null) {
                mapM124385o2 = map;
            }
            LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, mapM124385o2);
            Map map2 = this.f167022S;
            Map mapM124385o3 = map2 != null ? AbstractC38963t7.m124385o("metadata", map2) : null;
            if (mapM124385o3 == null) {
                mapM124385o3 = map;
            }
            mapM73995d0 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, mapM124385o3);
        }
        EnumC38941r3 enumC38941r3 = this.f167020Q;
        Map mapM95645u2 = enumC38941r3 != null ? AbstractC31061c.m95645u("allow_redisplay", enumC38941r3.f167636w) : null;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(mapM73995d0, mapM95645u2);
        C38780a6 c38780a6 = this.f167021R;
        Map mapM124385o4 = c38780a6 != null ? AbstractC38963t7.m124385o("radar_options", c38780a6.mo124325c0()) : null;
        if (mapM124385o4 == null) {
            mapM124385o4 = map;
        }
        LinkedHashMap linkedHashMapM73995d3 = AbstractC25247g0.m73995d0(linkedHashMapM73995d2, mapM124385o4);
        C38901n c38901n = this.f167024U;
        Map mapM124385o5 = c38901n != null ? AbstractC38963t7.m124385o("client_attribution_metadata", c38901n.mo124325c0()) : null;
        if (mapM124385o5 != null) {
            map = mapM124385o5;
        }
        return AbstractC25247g0.m73995d0(linkedHashMapM73995d3, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38809d5)) {
            return false;
        }
        C38809d5 c38809d5 = (C38809d5) obj;
        return AbstractC22676k.m65745e(this.f167026w, c38809d5.f167026w) && this.f167027x == c38809d5.f167027x && AbstractC22676k.m65745e(this.f167028y, c38809d5.f167028y) && AbstractC22676k.m65745e(this.f167029z, c38809d5.f167029z) && AbstractC22676k.m65745e(this.f167008E, c38809d5.f167008E) && AbstractC22676k.m65745e(this.f167009F, c38809d5.f167009F) && AbstractC22676k.m65745e(this.f167010G, c38809d5.f167010G) && AbstractC22676k.m65745e(this.f167011H, c38809d5.f167011H) && AbstractC22676k.m65745e(this.f167012I, c38809d5.f167012I) && AbstractC22676k.m65745e(this.f167013J, c38809d5.f167013J) && AbstractC22676k.m65745e(this.f167014K, c38809d5.f167014K) && AbstractC22676k.m65745e(this.f167015L, c38809d5.f167015L) && AbstractC22676k.m65745e(this.f167016M, c38809d5.f167016M) && AbstractC22676k.m65745e(this.f167017N, c38809d5.f167017N) && AbstractC22676k.m65745e(this.f167018O, c38809d5.f167018O) && AbstractC22676k.m65745e(this.f167019P, c38809d5.f167019P) && this.f167020Q == c38809d5.f167020Q && AbstractC22676k.m65745e(this.f167021R, c38809d5.f167021R) && AbstractC22676k.m65745e(this.f167022S, c38809d5.f167022S) && AbstractC22676k.m65745e(this.f167023T, c38809d5.f167023T) && AbstractC22676k.m65745e(this.f167024U, c38809d5.f167024U) && AbstractC22676k.m65745e(this.f167025V, c38809d5.f167025V);
    }

    /* JADX INFO: renamed from: h */
    public final Set m124342h() {
        Set set;
        C33623c0 c33623c0 = EnumC38828f4.f167088G;
        boolean zM65745e = AbstractC22676k.m65745e(this.f167026w, "card");
        Set set2 = this.f167023T;
        if (!zM65745e) {
            return set2;
        }
        C38951s4 c38951s4 = this.f167028y;
        if (c38951s4 == null || (set = c38951s4.f167659F) == null) {
            set = C25235a0.f99113w;
        }
        return AbstractC12350b.m34556E(set, set2);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.f167026w.hashCode() * 31, 31, this.f167027x);
        C38951s4 c38951s4 = this.f167028y;
        int iHashCode = (iM8289b + (c38951s4 == null ? 0 : c38951s4.hashCode())) * 31;
        C38978v4 c38978v4 = this.f167029z;
        int iHashCode2 = (iHashCode + (c38978v4 == null ? 0 : c38978v4.hashCode())) * 31;
        C38969u4 c38969u4 = this.f167008E;
        int iHashCode3 = (iHashCode2 + (c38969u4 == null ? 0 : c38969u4.hashCode())) * 31;
        C39005y4 c39005y4 = this.f167009F;
        int iHashCode4 = (iHashCode3 + (c39005y4 == null ? 0 : c39005y4.hashCode())) * 31;
        C38924p4 c38924p4 = this.f167010G;
        int iHashCode5 = (iHashCode4 + (c38924p4 == null ? 0 : c38924p4.hashCode())) * 31;
        C38933q4 c38933q4 = this.f167011H;
        int iHashCode6 = (iHashCode5 + (c38933q4 == null ? 0 : c38933q4.hashCode())) * 31;
        C38799c5 c38799c5 = this.f167012I;
        int iHashCode7 = (iHashCode6 + (c38799c5 == null ? 0 : c38799c5.hashCode())) * 31;
        C38996x4 c38996x4 = this.f167013J;
        int iHashCode8 = (iHashCode7 + (c38996x4 == null ? 0 : c38996x4.f167845w.hashCode())) * 31;
        C38789b5 c38789b5 = this.f167014K;
        int iHashCode9 = (iHashCode8 + (c38789b5 == null ? 0 : c38789b5.hashCode())) * 31;
        C38987w4 c38987w4 = this.f167015L;
        int iHashCode10 = (iHashCode9 + (c38987w4 == null ? 0 : c38987w4.hashCode())) * 31;
        C38960t4 c38960t4 = this.f167016M;
        int iHashCode11 = (iHashCode10 + (c38960t4 == null ? 0 : c38960t4.hashCode())) * 31;
        C38779a5 c38779a5 = this.f167017N;
        int iHashCode12 = (iHashCode11 + (c38779a5 == null ? 0 : c38779a5.hashCode())) * 31;
        C39014z4 c39014z4 = this.f167018O;
        int iHashCode13 = (iHashCode12 + (c39014z4 == null ? 0 : c39014z4.f167922w.hashCode())) * 31;
        C38977v3 c38977v3 = this.f167019P;
        int iHashCode14 = (iHashCode13 + (c38977v3 == null ? 0 : c38977v3.hashCode())) * 31;
        EnumC38941r3 enumC38941r3 = this.f167020Q;
        int iHashCode15 = (iHashCode14 + (enumC38941r3 == null ? 0 : enumC38941r3.hashCode())) * 31;
        C38780a6 c38780a6 = this.f167021R;
        int iHashCode16 = (iHashCode15 + (c38780a6 == null ? 0 : c38780a6.hashCode())) * 31;
        Map map = this.f167022S;
        int iM73368a = AbstractC25012a.m73368a(this.f167023T, (iHashCode16 + (map == null ? 0 : map.hashCode())) * 31, 31);
        C38901n c38901n = this.f167024U;
        int iHashCode17 = (iM73368a + (c38901n == null ? 0 : c38901n.hashCode())) * 31;
        Map map2 = this.f167025V;
        return iHashCode17 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM73379l = AbstractC25012a.m73379l("PaymentMethodCreateParams(code=", this.f167026w, ", requiresMandate=", ", card=", this.f167027x);
        sbM73379l.append(this.f167028y);
        sbM73379l.append(", ideal=");
        sbM73379l.append(this.f167029z);
        sbM73379l.append(", fpx=");
        sbM73379l.append(this.f167008E);
        sbM73379l.append(", sepaDebit=");
        sbM73379l.append(this.f167009F);
        sbM73379l.append(", auBecsDebit=");
        sbM73379l.append(this.f167010G);
        sbM73379l.append(", bacsDebit=");
        sbM73379l.append(this.f167011H);
        sbM73379l.append(", upi=");
        sbM73379l.append(this.f167012I);
        sbM73379l.append(", netbanking=");
        sbM73379l.append(this.f167013J);
        sbM73379l.append(", usBankAccount=");
        sbM73379l.append(this.f167014K);
        sbM73379l.append(", link=");
        sbM73379l.append(this.f167015L);
        sbM73379l.append(", cashAppPay=");
        sbM73379l.append(this.f167016M);
        sbM73379l.append(", swish=");
        sbM73379l.append(this.f167017N);
        sbM73379l.append(", shopPay=");
        sbM73379l.append(this.f167018O);
        sbM73379l.append(", billingDetails=");
        sbM73379l.append(this.f167019P);
        sbM73379l.append(", allowRedisplay=");
        sbM73379l.append(this.f167020Q);
        sbM73379l.append(", radarOptions=");
        sbM73379l.append(this.f167021R);
        sbM73379l.append(", metadata=");
        sbM73379l.append(this.f167022S);
        sbM73379l.append(", productUsage=");
        sbM73379l.append(this.f167023T);
        sbM73379l.append(", clientAttributionMetadata=");
        sbM73379l.append(this.f167024U);
        sbM73379l.append(", overrideParamMap=");
        sbM73379l.append(this.f167025V);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167026w);
        dest.writeInt(this.f167027x ? 1 : 0);
        C38951s4 c38951s4 = this.f167028y;
        if (c38951s4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38951s4.writeToParcel(dest, i13);
        }
        C38978v4 c38978v4 = this.f167029z;
        if (c38978v4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38978v4.writeToParcel(dest, i13);
        }
        C38969u4 c38969u4 = this.f167008E;
        if (c38969u4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38969u4.writeToParcel(dest, i13);
        }
        C39005y4 c39005y4 = this.f167009F;
        if (c39005y4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39005y4.writeToParcel(dest, i13);
        }
        C38924p4 c38924p4 = this.f167010G;
        if (c38924p4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38924p4.writeToParcel(dest, i13);
        }
        C38933q4 c38933q4 = this.f167011H;
        if (c38933q4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38933q4.writeToParcel(dest, i13);
        }
        C38799c5 c38799c5 = this.f167012I;
        if (c38799c5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38799c5.writeToParcel(dest, i13);
        }
        C38996x4 c38996x4 = this.f167013J;
        if (c38996x4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38996x4.writeToParcel(dest, i13);
        }
        C38789b5 c38789b5 = this.f167014K;
        if (c38789b5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38789b5.writeToParcel(dest, i13);
        }
        C38987w4 c38987w4 = this.f167015L;
        if (c38987w4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38987w4.writeToParcel(dest, i13);
        }
        C38960t4 c38960t4 = this.f167016M;
        if (c38960t4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38960t4.writeToParcel(dest, i13);
        }
        C38779a5 c38779a5 = this.f167017N;
        if (c38779a5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38779a5.writeToParcel(dest, i13);
        }
        C39014z4 c39014z4 = this.f167018O;
        if (c39014z4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39014z4.writeToParcel(dest, i13);
        }
        C38977v3 c38977v3 = this.f167019P;
        if (c38977v3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38977v3.writeToParcel(dest, i13);
        }
        EnumC38941r3 enumC38941r3 = this.f167020Q;
        if (enumC38941r3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            enumC38941r3.writeToParcel(dest, i13);
        }
        C38780a6 c38780a6 = this.f167021R;
        if (c38780a6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38780a6.writeToParcel(dest, i13);
        }
        Map map = this.f167022S;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        Set set = this.f167023T;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        C38901n c38901n = this.f167024U;
        if (c38901n == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38901n.writeToParcel(dest, i13);
        }
        Map map2 = this.f167025V;
        if (map2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            dest.writeString((String) entry2.getKey());
            dest.writeValue(entry2.getValue());
        }
    }

    public C38809d5(String code, boolean z4, C38951s4 c38951s4, C38978v4 c38978v4, C38969u4 c38969u4, C39005y4 c39005y4, C38924p4 c38924p4, C38933q4 c38933q4, C38799c5 c38799c5, C38996x4 c38996x4, C38789b5 c38789b5, C38987w4 c38987w4, C38960t4 c38960t4, C38779a5 c38779a5, C39014z4 c39014z4, C38977v3 c38977v3, EnumC38941r3 enumC38941r3, C38780a6 c38780a6, Map map, Set set, C38901n c38901n, Map map2) {
        AbstractC22676k.m65750j(code, "code");
        this.f167026w = code;
        this.f167027x = z4;
        this.f167028y = c38951s4;
        this.f167029z = c38978v4;
        this.f167008E = c38969u4;
        this.f167009F = c39005y4;
        this.f167010G = c38924p4;
        this.f167011H = c38933q4;
        this.f167012I = c38799c5;
        this.f167013J = c38996x4;
        this.f167014K = c38789b5;
        this.f167015L = c38987w4;
        this.f167016M = c38960t4;
        this.f167017N = c38779a5;
        this.f167018O = c39014z4;
        this.f167019P = c38977v3;
        this.f167020Q = enumC38941r3;
        this.f167021R = c38780a6;
        this.f167022S = map;
        this.f167023T = set;
        this.f167024U = c38901n;
        this.f167025V = map2;
    }

    public C38809d5(EnumC38828f4 enumC38828f4, C38951s4 c38951s4, C38789b5 c38789b5, C38987w4 c38987w4, C39014z4 c39014z4, C38977v3 c38977v3, EnumC38941r3 enumC38941r3, C38901n c38901n, int i13) {
        this(enumC38828f4.f167132w, enumC38828f4.f167134y, (i13 & 2) != 0 ? null : c38951s4, null, null, null, null, null, null, null, (i13 & 512) != 0 ? null : c38789b5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c38987w4, null, null, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c39014z4, c38977v3, (32768 & i13) != 0 ? null : enumC38941r3, null, null, C25235a0.f99113w, (i13 & 524288) != 0 ? null : c38901n, null);
    }

    public C38809d5(C38951s4 c38951s4, C38977v3 c38977v3, C38901n c38901n) {
        this(EnumC38828f4.f167090I, c38951s4, null, null, null, c38977v3, null, c38901n, 1392636);
    }
}
