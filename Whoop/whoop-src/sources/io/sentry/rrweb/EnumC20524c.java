package io.sentry.rrweb;

import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.rrweb.c */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20524c implements InterfaceC20348h2 {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    @Override // io.sentry.InterfaceC20348h2
    public void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        ((C37199o) interfaceC20401k3).m119218X(ordinal());
    }
}
