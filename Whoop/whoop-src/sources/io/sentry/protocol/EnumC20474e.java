package io.sentry.protocol;

import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Locale;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.e */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20474e implements InterfaceC20348h2 {
    PORTRAIT,
    LANDSCAPE;

    @Override // io.sentry.InterfaceC20348h2
    public void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        ((C37199o) interfaceC20401k3).m119222b0(toString().toLowerCase(Locale.ROOT));
    }
}
