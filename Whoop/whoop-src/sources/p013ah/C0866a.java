package p013ah;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ah.a */
/* JADX INFO: loaded from: classes6.dex */
public class C0866a extends AbstractC0868c {

    /* JADX INFO: renamed from: d */
    public final ArrayList f3158d;

    public C0866a() {
        super(6);
        this.f3158d = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m2112a(AbstractC0869d abstractC0869d) {
        this.f3158d.add(abstractC0869d);
    }

    @Override // p013ah.AbstractC0868c, p013ah.AbstractC0869d
    public final boolean equals(Object obj) {
        if (obj instanceof C0866a) {
            C0866a c0866a = (C0866a) obj;
            if (super.equals(obj) && this.f3158d.equals(c0866a.f3158d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p013ah.AbstractC0868c, p013ah.AbstractC0869d
    public final int hashCode() {
        return super.hashCode() ^ this.f3158d.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("[");
        if (this.f3160c) {
            sb4.append("_ ");
        }
        sb4.append(Arrays.toString(this.f3158d.toArray()).substring(1));
        return sb4.toString();
    }

    public C0866a(int i13) {
        super(6);
        this.f3158d = new ArrayList(i13);
    }
}
