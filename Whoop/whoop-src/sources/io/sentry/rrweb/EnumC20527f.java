package io.sentry.rrweb;

import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.rrweb.f */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC20527f implements InterfaceC20348h2 {
    MouseUp,
    MouseDown,
    Click,
    ContextMenu,
    DblClick,
    Focus,
    Blur,
    TouchStart,
    TouchMove_Departed,
    TouchEnd,
    TouchCancel;

    @Override // io.sentry.InterfaceC20348h2
    public void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        ((C37199o) interfaceC20401k3).m119218X(ordinal());
    }
}
