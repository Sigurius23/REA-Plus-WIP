package p184h5;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;
import p107e3.AbstractC12602c;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C16876h {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f64821a;

    public C16876h(DisplayCutout displayCutout) {
        this.f64821a = displayCutout;
    }

    /* JADX INFO: renamed from: a */
    public final C35643b m47505a() {
        return Build.VERSION.SDK_INT >= 30 ? C35643b.m112841c(AbstractC12602c.m35323e(this.f64821a)) : C35643b.f151448e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16876h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f64821a, ((C16876h) obj).f64821a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f64821a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f64821a + "}";
    }
}
