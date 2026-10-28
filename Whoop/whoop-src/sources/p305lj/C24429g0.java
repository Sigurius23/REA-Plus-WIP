package p305lj;

import java.util.List;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lj.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C24429g0 {

    /* JADX INFO: renamed from: a */
    public final List f95318a;

    /* JADX INFO: renamed from: b */
    public final List f95319b;

    /* JADX INFO: renamed from: c */
    public final String f95320c;

    public C24429g0(List indexList, List textList, String str) {
        AbstractC22676k.m65750j(indexList, "indexList");
        AbstractC22676k.m65750j(textList, "textList");
        this.f95318a = indexList;
        this.f95319b = textList;
        this.f95320c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24429g0)) {
            return false;
        }
        C24429g0 c24429g0 = (C24429g0) obj;
        return AbstractC22676k.m65745e(this.f95318a, c24429g0.f95318a) && AbstractC22676k.m65745e(this.f95319b, c24429g0.f95319b) && AbstractC22676k.m65745e(this.f95320c, c24429g0.f95320c);
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.f95318a.hashCode() * 31, 31, this.f95319b);
        String str = this.f95320c;
        return iM31983b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SurveyResponseItems(indexList=");
        sb4.append(this.f95318a);
        sb4.append(", textList=");
        sb4.append(this.f95319b);
        sb4.append(", otherText=");
        return AbstractC25012a.m73377j(sb4, this.f95320c, ')');
    }
}
