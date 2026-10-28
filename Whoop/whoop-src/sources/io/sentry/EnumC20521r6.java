package io.sentry;

import java.io.IOException;
import java.util.Locale;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.r6 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC20521r6 implements InterfaceC20348h2 {
    SESSION,
    BUFFER;

    @Override // io.sentry.InterfaceC20348h2
    public void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        ((C37199o) interfaceC20401k3).m119222b0(name().toLowerCase(Locale.ROOT));
    }
}
