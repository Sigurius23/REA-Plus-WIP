package mp;

import java.util.Arrays;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: mp.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25752a1 extends AbstractC25755b1 {

    /* JADX INFO: renamed from: w */
    public final String f101464w;

    public C25752a1(String str) {
        this.f101464w = str;
    }

    @Override // mp.AbstractC25755b1
    /* JADX INFO: renamed from: a */
    public final int mo75988a() {
        return AbstractC25755b1.m76004d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC25755b1 abstractC25755b1 = (AbstractC25755b1) obj;
        int iMo75988a = abstractC25755b1.mo75988a();
        int iM76004d = AbstractC25755b1.m76004d((byte) 96);
        if (iM76004d != iMo75988a) {
            return iM76004d - abstractC25755b1.mo75988a();
        }
        String str = ((C25752a1) abstractC25755b1).f101464w;
        int length = str.length();
        String str2 = this.f101464w;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C25752a1.class == obj.getClass()) {
            return this.f101464w.equals(((C25752a1) obj).f101464w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC25755b1.m76004d((byte) 96)), this.f101464w});
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f101464w, "\"", new StringBuilder("\""));
    }
}
