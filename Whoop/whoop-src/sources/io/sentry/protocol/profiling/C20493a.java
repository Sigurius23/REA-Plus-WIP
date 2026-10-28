package io.sentry.protocol.profiling;

import ih0.AbstractC18489d0;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.profiling.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20493a implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public ConcurrentHashMap f76755E;

    /* JADX INFO: renamed from: w */
    public List f76756w = new ArrayList();

    /* JADX INFO: renamed from: x */
    public List f76757x = new ArrayList();

    /* JADX INFO: renamed from: y */
    public List f76758y = new ArrayList();

    /* JADX INFO: renamed from: z */
    public Map f76759z = new HashMap();

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("samples");
        c37199o.m119219Y(interfaceC20602v0, this.f76756w);
        c37199o.m119207K("stacks");
        c37199o.m119219Y(interfaceC20602v0, this.f76757x);
        c37199o.m119207K("frames");
        c37199o.m119219Y(interfaceC20602v0, this.f76758y);
        c37199o.m119207K("thread_metadata");
        c37199o.m119219Y(interfaceC20602v0, this.f76759z);
        ConcurrentHashMap concurrentHashMap = this.f76755E;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76755E, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
