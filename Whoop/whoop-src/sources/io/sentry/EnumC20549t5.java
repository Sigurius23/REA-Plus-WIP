package io.sentry;

import java.io.IOException;
import java.util.Locale;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.t5 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC20549t5 implements InterfaceC20348h2 {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    EnumC20549t5(int i13) {
        this.severityNumber = i13;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.InterfaceC20348h2
    public void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        ((C37199o) interfaceC20401k3).m119222b0(name().toLowerCase(Locale.ROOT));
    }
}
