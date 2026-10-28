package io.sentry;

import io.sentry.util.C20584f;
import java.util.Objects;
import p211i5.C18090c;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.h7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20353h7 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: x */
    public static final C20353h7 f76386x = new C20353h7("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* JADX INFO: renamed from: w */
    public final C20584f f76387w;

    public C20353h7(String str) {
        Objects.requireNonNull(str, "value is required");
        this.f76387w = new C20584f(new C20344g7(str, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20353h7.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f76387w.m56714a()).equals(((C20353h7) obj).f76387w.m56714a());
    }

    public final int hashCode() {
        return ((String) this.f76387w.m56714a()).hashCode();
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) {
        ((C37199o) interfaceC20401k3).m119222b0((String) this.f76387w.m56714a());
    }

    public final String toString() {
        return (String) this.f76387w.m56714a();
    }

    public C20353h7() {
        this.f76387w = new C20584f(new C18090c(14));
    }
}
