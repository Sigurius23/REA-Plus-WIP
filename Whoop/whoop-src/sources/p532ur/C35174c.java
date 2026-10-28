package p532ur;

import android.app.PendingIntent;
import ih0.AbstractC18489d0;

/* JADX INFO: renamed from: ur.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C35174c extends AbstractC35172a {

    /* JADX INFO: renamed from: w */
    public final PendingIntent f149280w;

    /* JADX INFO: renamed from: x */
    public final boolean f149281x;

    public C35174c(PendingIntent pendingIntent, boolean z4) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f149280w = pendingIntent;
        this.f149281x = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC35172a) {
            C35174c c35174c = (C35174c) ((AbstractC35172a) obj);
            if (this.f149280w.equals(c35174c.f149280w) && this.f149281x == c35174c.f149281x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f149280w.hashCode() ^ 1000003) * 1000003) ^ (true != this.f149281x ? 1237 : 1231);
    }

    public final String toString() {
        return AbstractC18489d0.m53372m(AbstractC18489d0.m53375p("ReviewInfo{pendingIntent=", this.f149280w.toString(), ", isNoOp="), this.f149281x, "}");
    }
}
