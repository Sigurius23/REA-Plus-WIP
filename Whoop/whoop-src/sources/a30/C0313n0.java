package a30;

import h20.C16761x1;
import io.sentry.config.AbstractC20301a;
import my.C26027a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a30.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0313n0 {

    /* JADX INFO: renamed from: a */
    public final C16761x1 f1077a;

    /* JADX INFO: renamed from: b */
    public final C26027a f1078b;

    public C0313n0(C16761x1 configuration) {
        AbstractC22676k.m65750j(configuration, "configuration");
        this.f1077a = configuration;
        this.f1078b = AbstractC20301a.m56345m(configuration);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0313n0) && AbstractC22676k.m65745e(this.f1077a, ((C0313n0) obj).f1077a);
    }

    public final int hashCode() {
        return this.f1077a.hashCode();
    }

    public final String toString() {
        return "PaymentSheet(configuration=" + this.f1077a + ")";
    }
}
