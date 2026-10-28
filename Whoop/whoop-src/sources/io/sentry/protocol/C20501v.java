package io.sentry.protocol;

import io.sentry.C20344g7;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import io.sentry.okhttp.C20450b;
import io.sentry.util.C20584f;
import java.io.IOException;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C20501v implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: x */
    public static final C20501v f76802x = new C20501v("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* JADX INFO: renamed from: w */
    public final C20584f f76803w;

    public C20501v() {
        this.f76803w = new C20584f(new C20450b(1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20501v.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f76803w.m56714a()).equals(((C20501v) obj).f76803w.m56714a());
    }

    public final int hashCode() {
        return ((String) this.f76803w.m56714a()).hashCode();
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        ((C37199o) interfaceC20401k3).m119222b0(toString());
    }

    public final String toString() {
        return (String) this.f76803w.m56714a();
    }

    public C20501v(String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() != 32 && str2.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
        }
        if (str2.length() == 36) {
            this.f76803w = new C20584f(new C20344g7(this, str2));
        } else {
            this.f76803w = new C20584f(new C20344g7(str2, 0));
        }
    }
}
