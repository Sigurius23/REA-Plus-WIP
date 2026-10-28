package p127ev;

import android.os.Parcel;
import android.os.Parcelable;
import d13.AbstractC11478a;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p108e4.AbstractC12682p;
import p126eq.C13433b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ev.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C13663d extends AbstractC13664e {
    public static final Parcelable.Creator<C13663d> CREATOR = new C13433b(2);

    /* JADX INFO: renamed from: E */
    public final String f48423E;

    /* JADX INFO: renamed from: F */
    public final List f48424F;

    /* JADX INFO: renamed from: G */
    public final List f48425G;

    /* JADX INFO: renamed from: H */
    public final boolean f48426H;

    /* JADX INFO: renamed from: I */
    public final boolean f48427I;

    /* JADX INFO: renamed from: J */
    public final int f48428J;

    /* JADX INFO: renamed from: K */
    public final float f48429K;

    /* JADX INFO: renamed from: L */
    public final String f48430L;

    /* JADX INFO: renamed from: M */
    public final String f48431M;

    /* JADX INFO: renamed from: N */
    public final String f48432N;

    /* JADX INFO: renamed from: O */
    public final int f48433O;

    /* JADX INFO: renamed from: P */
    public final String f48434P;

    /* JADX INFO: renamed from: Q */
    public final float f48435Q;

    /* JADX INFO: renamed from: R */
    public final String f48436R;

    /* JADX INFO: renamed from: S */
    public final List f48437S;

    /* JADX INFO: renamed from: T */
    public final List f48438T;

    /* JADX INFO: renamed from: U */
    public final int f48439U;

    /* JADX INFO: renamed from: V */
    public final String f48440V;

    /* JADX INFO: renamed from: W */
    public final String f48441W;

    /* JADX INFO: renamed from: w */
    public final String f48442w;

    /* JADX INFO: renamed from: x */
    public final List f48443x;

    /* JADX INFO: renamed from: y */
    public final float f48444y;

    /* JADX INFO: renamed from: z */
    public final List f48445z;

    public C13663d(String modelUri, List list, float f13, List list2, String str, List list3, List list4, boolean z4, boolean z13, int i13, float f14, String str2, String str3, String str4, int i14, String str5, float f15, String str6, List materialOverrides, List nodeOverrides, int i15, String modelColorUseTheme, String str7) {
        AbstractC22676k.m65750j(modelUri, "modelUri");
        AbstractC18489d0.m53382w(i13, "modelScaleMode");
        AbstractC22676k.m65750j(materialOverrides, "materialOverrides");
        AbstractC22676k.m65750j(nodeOverrides, "nodeOverrides");
        AbstractC18489d0.m53382w(i15, "modelElevationReference");
        AbstractC22676k.m65750j(modelColorUseTheme, "modelColorUseTheme");
        this.f48442w = modelUri;
        this.f48443x = list;
        this.f48444y = f13;
        this.f48445z = list2;
        this.f48423E = str;
        this.f48424F = list3;
        this.f48425G = list4;
        this.f48426H = z4;
        this.f48427I = z13;
        this.f48428J = i13;
        this.f48429K = f14;
        this.f48430L = str2;
        this.f48431M = str3;
        this.f48432N = str4;
        this.f48433O = i14;
        this.f48434P = str5;
        this.f48435Q = f15;
        this.f48436R = str6;
        this.f48437S = materialOverrides;
        this.f48438T = nodeOverrides;
        this.f48439U = i15;
        this.f48440V = modelColorUseTheme;
        this.f48441W = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13663d)) {
            return false;
        }
        C13663d c13663d = (C13663d) obj;
        return AbstractC22676k.m65745e(this.f48442w, c13663d.f48442w) && this.f48443x.equals(c13663d.f48443x) && Float.compare(this.f48444y, c13663d.f48444y) == 0 && this.f48445z.equals(c13663d.f48445z) && AbstractC22676k.m65745e(this.f48423E, c13663d.f48423E) && this.f48424F.equals(c13663d.f48424F) && this.f48425G.equals(c13663d.f48425G) && this.f48426H == c13663d.f48426H && this.f48427I == c13663d.f48427I && this.f48428J == c13663d.f48428J && Float.compare(this.f48429K, c13663d.f48429K) == 0 && AbstractC22676k.m65745e(this.f48430L, c13663d.f48430L) && AbstractC22676k.m65745e(this.f48431M, c13663d.f48431M) && AbstractC22676k.m65745e(this.f48432N, c13663d.f48432N) && this.f48433O == c13663d.f48433O && AbstractC22676k.m65745e(this.f48434P, c13663d.f48434P) && Float.compare(this.f48435Q, c13663d.f48435Q) == 0 && AbstractC22676k.m65745e(this.f48436R, c13663d.f48436R) && AbstractC22676k.m65745e(this.f48437S, c13663d.f48437S) && AbstractC22676k.m65745e(this.f48438T, c13663d.f48438T) && this.f48439U == c13663d.f48439U && AbstractC22676k.m65745e(this.f48440V, c13663d.f48440V) && AbstractC22676k.m65745e(this.f48441W, c13663d.f48441W);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30447a(this.f48444y, AbstractC11895b.m31983b(this.f48442w.hashCode() * 31, 31, this.f48443x), 31), 31, this.f48445z);
        String str = this.f48423E;
        int iM31983b2 = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM31983b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f48424F), 31, this.f48425G);
        boolean z4 = this.f48426H;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int i13 = (iM31983b2 + r10) * 31;
        boolean z13 = this.f48427I;
        int iM30447a = AbstractC11266d.m30447a(this.f48429K, (AbstractC12682p.m35485e(this.f48428J) + ((i13 + (z13 ? 1 : z13)) * 31)) * 31, 31);
        String str2 = this.f48430L;
        int iHashCode = (iM30447a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48431M;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f48432N;
        int iM30448b = AbstractC11266d.m30448b(this.f48433O, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.f48434P;
        int iM30447a2 = AbstractC11266d.m30447a(this.f48435Q, (iM30448b + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.f48436R;
        int iM30450d = AbstractC11266d.m30450d((AbstractC12682p.m35485e(this.f48439U) + AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM30447a2 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f48437S), 31, this.f48438T)) * 31, 31, this.f48440V);
        String str7 = this.f48441W;
        return iM30450d + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb4 = new StringBuilder("LocationPuck3D(modelUri=");
        sb4.append(this.f48442w);
        sb4.append(", position=");
        sb4.append(this.f48443x);
        sb4.append(", modelOpacity=");
        sb4.append(this.f48444y);
        sb4.append(", modelScale=");
        sb4.append(this.f48445z);
        sb4.append(", modelScaleExpression=");
        sb4.append(this.f48423E);
        sb4.append(", modelTranslation=");
        sb4.append(this.f48424F);
        sb4.append(", modelRotation=");
        sb4.append(this.f48425G);
        sb4.append(", modelCastShadows=");
        sb4.append(this.f48426H);
        sb4.append(", modelReceiveShadows=");
        sb4.append(this.f48427I);
        sb4.append(", modelScaleMode=");
        int i13 = this.f48428J;
        if (i13 != 1) {
            str = i13 != 2 ? "null" : "VIEWPORT";
        } else {
            str = "MAP";
        }
        sb4.append(str);
        sb4.append(", modelEmissiveStrength=");
        sb4.append(this.f48429K);
        sb4.append(", modelEmissiveStrengthExpression=");
        sb4.append(this.f48430L);
        sb4.append(", modelOpacityExpression=");
        sb4.append(this.f48431M);
        sb4.append(", modelRotationExpression=");
        sb4.append(this.f48432N);
        sb4.append(", modelColor=");
        sb4.append(this.f48433O);
        sb4.append(", modelColorExpression=");
        sb4.append(this.f48434P);
        sb4.append(", modelColorMixIntensity=");
        sb4.append(this.f48435Q);
        sb4.append(", modelColorMixIntensityExpression=");
        sb4.append(this.f48436R);
        sb4.append(", materialOverrides=");
        sb4.append(this.f48437S);
        sb4.append(", nodeOverrides=");
        sb4.append(this.f48438T);
        sb4.append(", modelElevationReference=");
        int i14 = this.f48439U;
        if (i14 != 1) {
            str2 = i14 != 2 ? "null" : "GROUND";
        } else {
            str2 = "SEA";
        }
        sb4.append(str2);
        sb4.append(", modelColorUseTheme=");
        sb4.append(this.f48440V);
        sb4.append(", modelColorUseThemeExpression=");
        return AbstractC25012a.m73377j(sb4, this.f48441W, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        String str;
        String str2;
        AbstractC22676k.m65750j(out, "out");
        out.writeString(this.f48442w);
        Iterator itM30863o = AbstractC11478a.m30863o(this.f48443x, out);
        while (itM30863o.hasNext()) {
            out.writeFloat(((Number) itM30863o.next()).floatValue());
        }
        out.writeFloat(this.f48444y);
        Iterator itM30863o2 = AbstractC11478a.m30863o(this.f48445z, out);
        while (itM30863o2.hasNext()) {
            out.writeFloat(((Number) itM30863o2.next()).floatValue());
        }
        out.writeString(this.f48423E);
        Iterator itM30863o3 = AbstractC11478a.m30863o(this.f48424F, out);
        while (itM30863o3.hasNext()) {
            out.writeFloat(((Number) itM30863o3.next()).floatValue());
        }
        Iterator itM30863o4 = AbstractC11478a.m30863o(this.f48425G, out);
        while (itM30863o4.hasNext()) {
            out.writeFloat(((Number) itM30863o4.next()).floatValue());
        }
        out.writeInt(this.f48426H ? 1 : 0);
        out.writeInt(this.f48427I ? 1 : 0);
        int i14 = this.f48428J;
        if (i14 == 1) {
            str = "MAP";
        } else {
            if (i14 != 2) {
                throw null;
            }
            str = "VIEWPORT";
        }
        out.writeString(str);
        out.writeFloat(this.f48429K);
        out.writeString(this.f48430L);
        out.writeString(this.f48431M);
        out.writeString(this.f48432N);
        out.writeInt(this.f48433O);
        out.writeString(this.f48434P);
        out.writeFloat(this.f48435Q);
        out.writeString(this.f48436R);
        out.writeStringList(this.f48437S);
        out.writeStringList(this.f48438T);
        int i15 = this.f48439U;
        if (i15 == 1) {
            str2 = "SEA";
        } else {
            if (i15 != 2) {
                throw null;
            }
            str2 = "GROUND";
        }
        out.writeString(str2);
        out.writeString(this.f48440V);
        out.writeString(this.f48441W);
    }
}
