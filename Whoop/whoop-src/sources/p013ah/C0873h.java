package p013ah;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: ah.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C0873h extends AbstractC0868c {

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f3165d;

    /* JADX INFO: renamed from: e */
    public final LinkedList f3166e;

    public C0873h() {
        super(7);
        this.f3166e = new LinkedList();
        this.f3165d = new LinkedHashMap();
    }

    @Override // p013ah.AbstractC0868c, p013ah.AbstractC0869d
    public final boolean equals(Object obj) {
        if (obj instanceof C0873h) {
            C0873h c0873h = (C0873h) obj;
            if (super.equals(obj) && this.f3165d.equals(c0873h.f3165d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p013ah.AbstractC0868c, p013ah.AbstractC0869d
    public final int hashCode() {
        return super.hashCode() ^ this.f3165d.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        if (this.f3160c) {
            sb4.append("{_ ");
        } else {
            sb4.append("{ ");
        }
        for (AbstractC0869d abstractC0869d : this.f3166e) {
            sb4.append(abstractC0869d);
            sb4.append(": ");
            sb4.append(this.f3165d.get(abstractC0869d));
            sb4.append(", ");
        }
        if (sb4.toString().endsWith(", ")) {
            sb4.setLength(sb4.length() - 2);
        }
        sb4.append(" }");
        return sb4.toString();
    }

    public C0873h(int i13) {
        super(7);
        this.f3166e = new LinkedList();
        this.f3165d = new LinkedHashMap(i13);
    }
}
