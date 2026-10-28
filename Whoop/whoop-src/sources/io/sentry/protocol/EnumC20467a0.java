package io.sentry.protocol;

import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Locale;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.a0 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20467a0 implements InterfaceC20348h2 {
    AUTO,
    ALL,
    ALL_BUT_FIRST,
    NONE;

    @Override // io.sentry.InterfaceC20348h2
    public void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        ((C37199o) interfaceC20401k3).m119222b0(toString().toLowerCase(Locale.ROOT));
    }
}
