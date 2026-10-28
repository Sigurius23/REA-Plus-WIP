package gg3;

import java.util.Objects;

/* JADX INFO: renamed from: gg3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C15829b {

    /* JADX INFO: renamed from: a */
    public final String f59811a;

    /* JADX INFO: renamed from: b */
    public final Object f59812b;

    public C15829b(String str, Object obj) {
        this.f59811a = str;
        this.f59812b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15829b.class == obj.getClass()) {
            C15829b c15829b = (C15829b) obj;
            if (Objects.equals(this.f59811a, c15829b.f59811a) && Objects.equals(this.f59812b, c15829b.f59812b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f59811a, this.f59812b);
    }

    public final String toString() {
        return String.valueOf(this.f59811a) + "=\"" + String.valueOf(this.f59812b) + "\"";
    }
}
