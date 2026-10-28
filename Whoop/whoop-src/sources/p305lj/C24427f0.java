package p305lj;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lj.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C24427f0 {

    /* JADX INFO: renamed from: a */
    public final int f95315a;

    /* JADX INFO: renamed from: b */
    public final String f95316b;

    /* JADX INFO: renamed from: c */
    public final String f95317c;

    public C24427f0(int i13, String text, String str) {
        AbstractC22676k.m65750j(text, "text");
        this.f95315a = i13;
        this.f95316b = text;
        this.f95317c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24427f0)) {
            return false;
        }
        C24427f0 c24427f0 = (C24427f0) obj;
        return this.f95315a == c24427f0.f95315a && AbstractC22676k.m65745e(this.f95316b, c24427f0.f95316b) && AbstractC22676k.m65745e(this.f95317c, c24427f0.f95317c);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Integer.hashCode(this.f95315a) * 31, 31, this.f95316b);
        String str = this.f95317c;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SurveyResponseItem(index=");
        sb4.append(this.f95315a);
        sb4.append(", text=");
        sb4.append(this.f95316b);
        sb4.append(", otherText=");
        return AbstractC25012a.m73377j(sb4, this.f95317c, ')');
    }
}
