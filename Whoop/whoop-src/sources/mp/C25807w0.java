package mp;

import java.util.Arrays;

/* JADX INFO: renamed from: mp.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25807w0 extends AbstractC25755b1 {

    /* JADX INFO: renamed from: w */
    public final boolean f101550w;

    public C25807w0(boolean z4) {
        this.f101550w = z4;
    }

    @Override // mp.AbstractC25755b1
    /* JADX INFO: renamed from: a */
    public final int mo75988a() {
        return AbstractC25755b1.m76004d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC25755b1 abstractC25755b1 = (AbstractC25755b1) obj;
        int iMo75988a = abstractC25755b1.mo75988a();
        int iM76004d = AbstractC25755b1.m76004d((byte) -32);
        if (iM76004d != iMo75988a) {
            return iM76004d - abstractC25755b1.mo75988a();
        }
        return (true != this.f101550w ? 20 : 21) - (true != ((C25807w0) abstractC25755b1).f101550w ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C25807w0.class == obj.getClass() && this.f101550w == ((C25807w0) obj).f101550w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC25755b1.m76004d((byte) -32)), Boolean.valueOf(this.f101550w)});
    }

    public final String toString() {
        return Boolean.toString(this.f101550w);
    }
}
