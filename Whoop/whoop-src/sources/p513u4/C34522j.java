package p513u4;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: u4.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C34522j {

    /* JADX INFO: renamed from: a */
    public final Resources f145115a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f145116b;

    public C34522j(Resources resources, Resources.Theme theme) {
        this.f145115a = resources;
        this.f145116b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34522j.class == obj.getClass()) {
            C34522j c34522j = (C34522j) obj;
            if (this.f145115a.equals(c34522j.f145115a) && Objects.equals(this.f145116b, c34522j.f145116b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f145115a, this.f145116b);
    }
}
