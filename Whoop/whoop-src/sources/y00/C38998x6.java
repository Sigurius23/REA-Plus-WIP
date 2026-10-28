package y00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.Source$Usage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y00.x6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38998x6 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38998x6> CREATOR = new C38943r5(21);

    /* JADX INFO: renamed from: E */
    public final Source$Usage f167852E;

    /* JADX INFO: renamed from: F */
    public final C38971u6 f167853F;

    /* JADX INFO: renamed from: G */
    public final String f167854G;

    /* JADX INFO: renamed from: H */
    public final Map f167855H;

    /* JADX INFO: renamed from: I */
    public final C38980v6 f167856I;

    /* JADX INFO: renamed from: J */
    public final LinkedHashSet f167857J;

    /* JADX INFO: renamed from: w */
    public final String f167858w;

    /* JADX INFO: renamed from: x */
    public final Long f167859x;

    /* JADX INFO: renamed from: y */
    public final String f167860y;

    /* JADX INFO: renamed from: z */
    public final C38989w6 f167861z;

    public C38998x6(String typeRaw, Long l7, String str, C38989w6 c38989w6, Source$Usage source$Usage, C38971u6 c38971u6, String str2, LinkedHashMap linkedHashMap, C38980v6 apiParams, LinkedHashSet linkedHashSet) {
        AbstractC22676k.m65750j(typeRaw, "typeRaw");
        AbstractC22676k.m65750j(apiParams, "apiParams");
        this.f167858w = typeRaw;
        this.f167859x = l7;
        this.f167860y = str;
        this.f167861z = c38989w6;
        this.f167852E = source$Usage;
        this.f167853F = c38971u6;
        this.f167854G = str2;
        this.f167855H = linkedHashMap;
        this.f167856I = apiParams;
        this.f167857J = linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        String str = this.f167858w;
        Map mapM95645u = AbstractC31061c.m95645u("type", str);
        ?? r10 = this.f167856I.f167782w;
        boolean zIsEmpty = r10.isEmpty();
        ?? r14 = r10;
        if (zIsEmpty) {
            r14 = 0;
        }
        Map mapM114689q = r14 != 0 ? AbstractC36095b.m114689q(r14, str) : null;
        Map map = C25272z.f99163w;
        if (mapM114689q == null) {
            mapM114689q = map;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(mapM95645u, mapM114689q), map);
        Long l7 = this.f167859x;
        Map mapM73989X = l7 != null ? AbstractC25247g0.m73989X(new C23465k("amount", Long.valueOf(l7.longValue()))) : null;
        if (mapM73989X == null) {
            mapM73989X = map;
        }
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, mapM73989X);
        String str2 = this.f167860y;
        Map mapM95645u2 = str2 != null ? AbstractC31061c.m95645u("currency", str2) : null;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, mapM95645u2);
        C38971u6 c38971u6 = this.f167853F;
        Map mapM124385o = c38971u6 != null ? AbstractC38963t7.m124385o("source_order", c38971u6.mo124325c0()) : null;
        if (mapM124385o == null) {
            mapM124385o = map;
        }
        LinkedHashMap linkedHashMapM73995d3 = AbstractC25247g0.m73995d0(linkedHashMapM73995d2, mapM124385o);
        C38989w6 c38989w6 = this.f167861z;
        Map mapM124385o2 = c38989w6 != null ? AbstractC38963t7.m124385o("owner", c38989w6.mo124325c0()) : null;
        if (mapM124385o2 == null) {
            mapM124385o2 = map;
        }
        LinkedHashMap linkedHashMapM73995d4 = AbstractC25247g0.m73995d0(linkedHashMapM73995d3, mapM124385o2);
        Map map2 = this.f167855H;
        Map mapM124385o3 = map2 != null ? AbstractC38963t7.m124385o("metadata", map2) : null;
        if (mapM124385o3 == null) {
            mapM124385o3 = map;
        }
        LinkedHashMap linkedHashMapM73995d5 = AbstractC25247g0.m73995d0(linkedHashMapM73995d4, mapM124385o3);
        String str3 = this.f167854G;
        Map mapM95645u3 = str3 != null ? AbstractC31061c.m95645u("token", str3) : null;
        if (mapM95645u3 == null) {
            mapM95645u3 = map;
        }
        LinkedHashMap linkedHashMapM73995d6 = AbstractC25247g0.m73995d0(linkedHashMapM73995d5, mapM95645u3);
        Source$Usage source$Usage = this.f167852E;
        Map mapM95645u4 = source$Usage != null ? AbstractC31061c.m95645u("usage", source$Usage.f22225w) : null;
        if (mapM95645u4 != null) {
            map = mapM95645u4;
        }
        return AbstractC25247g0.m73995d0(linkedHashMapM73995d6, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38998x6)) {
            return false;
        }
        C38998x6 c38998x6 = (C38998x6) obj;
        return AbstractC22676k.m65745e(this.f167858w, c38998x6.f167858w) && AbstractC22676k.m65745e(this.f167859x, c38998x6.f167859x) && AbstractC22676k.m65745e(this.f167860y, c38998x6.f167860y) && AbstractC22676k.m65745e(this.f167861z, c38998x6.f167861z) && this.f167852E == c38998x6.f167852E && AbstractC22676k.m65745e(this.f167853F, c38998x6.f167853F) && AbstractC22676k.m65745e(this.f167854G, c38998x6.f167854G) && AbstractC22676k.m65745e(this.f167855H, c38998x6.f167855H) && AbstractC22676k.m65745e(this.f167856I, c38998x6.f167856I) && this.f167857J.equals(c38998x6.f167857J);
    }

    public final int hashCode() {
        int iHashCode = this.f167858w.hashCode() * 961;
        Long l7 = this.f167859x;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str = this.f167860y;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C38989w6 c38989w6 = this.f167861z;
        int iHashCode4 = (iHashCode3 + (c38989w6 == null ? 0 : c38989w6.hashCode())) * 31;
        Source$Usage source$Usage = this.f167852E;
        int iHashCode5 = (iHashCode4 + (source$Usage == null ? 0 : source$Usage.hashCode())) * 31;
        C38971u6 c38971u6 = this.f167853F;
        int iHashCode6 = (iHashCode5 + (c38971u6 == null ? 0 : c38971u6.hashCode())) * 31;
        String str2 = this.f167854G;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.f167855H;
        return this.f167857J.hashCode() + AbstractC33745d.m106644c((iHashCode7 + (map != null ? map.hashCode() : 0)) * 31, 31, this.f167856I.f167782w);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SourceParams(typeRaw=");
        sb4.append(this.f167858w);
        sb4.append(", typeData=null, amount=");
        sb4.append(this.f167859x);
        sb4.append(", currency=");
        sb4.append(this.f167860y);
        sb4.append(", owner=");
        sb4.append(this.f167861z);
        sb4.append(", usage=");
        sb4.append(this.f167852E);
        sb4.append(", sourceOrder=");
        sb4.append(this.f167853F);
        sb4.append(", token=");
        AbstractC36095b.m114695w(sb4, this.f167854G, ", metadata=", this.f167855H, ", apiParams=");
        sb4.append(this.f167856I);
        sb4.append(", attribution=");
        sb4.append(this.f167857J);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167858w);
        dest.writeParcelable(null, i13);
        Long l7 = this.f167859x;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeString(this.f167860y);
        C38989w6 c38989w6 = this.f167861z;
        if (c38989w6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38989w6.writeToParcel(dest, i13);
        }
        Source$Usage source$Usage = this.f167852E;
        if (source$Usage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(source$Usage.name());
        }
        C38971u6 c38971u6 = this.f167853F;
        if (c38971u6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38971u6.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167854G);
        Map map = this.f167855H;
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
        this.f167856I.writeToParcel(dest, i13);
        LinkedHashSet linkedHashSet = this.f167857J;
        dest.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
    }
}
