package y00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.Source$Status;
import com.stripe.android.model.Source$Usage;
import java.util.Map;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.m6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38899m6 implements InterfaceC36562b, Parcelable {
    public static final Parcelable.Creator<C38899m6> CREATOR = new C38943r5(12);

    /* JADX INFO: renamed from: E */
    public final String f167448E;

    /* JADX INFO: renamed from: F */
    public final Boolean f167449F;

    /* JADX INFO: renamed from: G */
    public final C38890l6 f167450G;

    /* JADX INFO: renamed from: H */
    public final Source$Status f167451H;

    /* JADX INFO: renamed from: I */
    public final Map f167452I;

    /* JADX INFO: renamed from: J */
    public final C39007y6 f167453J;

    /* JADX INFO: renamed from: K */
    public final String f167454K;

    /* JADX INFO: renamed from: L */
    public final String f167455L;

    /* JADX INFO: renamed from: M */
    public final Source$Usage f167456M;

    /* JADX INFO: renamed from: N */
    public final C38935q6 f167457N;

    /* JADX INFO: renamed from: O */
    public final String f167458O;

    /* JADX INFO: renamed from: w */
    public final String f167459w;

    /* JADX INFO: renamed from: x */
    public final Long f167460x;

    /* JADX INFO: renamed from: y */
    public final String f167461y;

    /* JADX INFO: renamed from: z */
    public final Long f167462z;

    public C38899m6(String str, Long l7, String str2, Long l12, String str3, Boolean bool, C38890l6 c38890l6, Source$Status source$Status, Map map, C39007y6 c39007y6, String type, String typeRaw, Source$Usage source$Usage, C38935q6 c38935q6, String str4) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(typeRaw, "typeRaw");
        this.f167459w = str;
        this.f167460x = l7;
        this.f167461y = str2;
        this.f167462z = l12;
        this.f167448E = str3;
        this.f167449F = bool;
        this.f167450G = c38890l6;
        this.f167451H = source$Status;
        this.f167452I = map;
        this.f167453J = c39007y6;
        this.f167454K = type;
        this.f167455L = typeRaw;
        this.f167456M = source$Usage;
        this.f167457N = c38935q6;
        this.f167458O = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38899m6)) {
            return false;
        }
        C38899m6 c38899m6 = (C38899m6) obj;
        return AbstractC22676k.m65745e(this.f167459w, c38899m6.f167459w) && AbstractC22676k.m65745e(this.f167460x, c38899m6.f167460x) && AbstractC22676k.m65745e(this.f167461y, c38899m6.f167461y) && AbstractC22676k.m65745e(this.f167462z, c38899m6.f167462z) && AbstractC22676k.m65745e(this.f167448E, c38899m6.f167448E) && AbstractC22676k.m65745e(this.f167449F, c38899m6.f167449F) && AbstractC22676k.m65745e(this.f167450G, c38899m6.f167450G) && this.f167451H == c38899m6.f167451H && AbstractC22676k.m65745e(this.f167452I, c38899m6.f167452I) && AbstractC22676k.m65745e(this.f167453J, c38899m6.f167453J) && AbstractC22676k.m65745e(this.f167454K, c38899m6.f167454K) && AbstractC22676k.m65745e(this.f167455L, c38899m6.f167455L) && this.f167456M == c38899m6.f167456M && AbstractC22676k.m65745e(this.f167457N, c38899m6.f167457N) && AbstractC22676k.m65745e(this.f167458O, c38899m6.f167458O);
    }

    public final int hashCode() {
        String str = this.f167459w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l7 = this.f167460x;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.f167461y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.f167462z;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.f167448E;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f167449F;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        C38890l6 c38890l6 = this.f167450G;
        int iHashCode7 = (iHashCode6 + (c38890l6 == null ? 0 : c38890l6.hashCode())) * 31;
        Source$Status source$Status = this.f167451H;
        int iHashCode8 = (iHashCode7 + (source$Status == null ? 0 : source$Status.hashCode())) * 31;
        Map map = this.f167452I;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        C39007y6 c39007y6 = this.f167453J;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode9 + (c39007y6 == null ? 0 : c39007y6.hashCode())) * 31, 31, this.f167454K), 31, this.f167455L);
        Source$Usage source$Usage = this.f167456M;
        int iHashCode10 = (iM30450d + (source$Usage == null ? 0 : source$Usage.hashCode())) * 31;
        C38935q6 c38935q6 = this.f167457N;
        int iHashCode11 = (iHashCode10 + (c38935q6 == null ? 0 : c38935q6.hashCode())) * 31;
        String str4 = this.f167458O;
        return iHashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Source(id=");
        sb4.append(this.f167459w);
        sb4.append(", amount=");
        sb4.append(this.f167460x);
        sb4.append(", clientSecret=");
        sb4.append(this.f167461y);
        sb4.append(", created=");
        sb4.append(this.f167462z);
        sb4.append(", currency=");
        AbstractC36095b.m114692t(this.f167449F, this.f167448E, ", isLiveMode=", ", owner=", sb4);
        sb4.append(this.f167450G);
        sb4.append(", status=");
        sb4.append(this.f167451H);
        sb4.append(", sourceTypeData=");
        sb4.append(this.f167452I);
        sb4.append(", sourceTypeModel=");
        sb4.append(this.f167453J);
        sb4.append(", type=");
        AbstractC11266d.m30444B(sb4, this.f167454K, ", typeRaw=", this.f167455L, ", usage=");
        sb4.append(this.f167456M);
        sb4.append(", sourceOrder=");
        sb4.append(this.f167457N);
        sb4.append(", statementDescriptor=");
        return AbstractC25012a.m73376i(this.f167458O, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167459w);
        Long l7 = this.f167460x;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeString(this.f167461y);
        Long l12 = this.f167462z;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.f167448E);
        Boolean bool = this.f167449F;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
        C38890l6 c38890l6 = this.f167450G;
        if (c38890l6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38890l6.writeToParcel(dest, i13);
        }
        Source$Status source$Status = this.f167451H;
        if (source$Status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(source$Status.name());
        }
        Map map = this.f167452I;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
        dest.writeParcelable(this.f167453J, i13);
        dest.writeString(this.f167454K);
        dest.writeString(this.f167455L);
        Source$Usage source$Usage = this.f167456M;
        if (source$Usage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(source$Usage.name());
        }
        C38935q6 c38935q6 = this.f167457N;
        if (c38935q6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38935q6.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167458O);
    }
}
