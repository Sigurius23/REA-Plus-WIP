package p478s3;

import java.util.Locale;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C32095a {

    /* JADX INFO: renamed from: a */
    public final Locale f133097a;

    public C32095a(Locale locale) {
        this.f133097a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C32095a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC22676k.m65745e(AbstractC32098d.m99843i(this.f133097a), AbstractC32098d.m99843i(((C32095a) obj).f133097a));
    }

    public final int hashCode() {
        return AbstractC32098d.m99843i(this.f133097a).hashCode();
    }

    public final String toString() {
        return AbstractC32098d.m99843i(this.f133097a);
    }
}
