package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.C20412l5;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C20499t implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public HashMap f76790E;

    /* JADX INFO: renamed from: w */
    public String f76791w;

    /* JADX INFO: renamed from: x */
    public String f76792x;

    /* JADX INFO: renamed from: y */
    public CopyOnWriteArraySet f76793y;

    /* JADX INFO: renamed from: z */
    public CopyOnWriteArraySet f76794z;

    public C20499t(String str, String str2) {
        this.f76791w = str;
        this.f76792x = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m56665a() {
        return this.f76791w;
    }

    /* JADX INFO: renamed from: b */
    public final String m56666b() {
        return this.f76792x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20499t.class == obj.getClass()) {
            C20499t c20499t = (C20499t) obj;
            if (this.f76791w.equals(c20499t.f76791w) && this.f76792x.equals(c20499t.f76792x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76791w, this.f76792x});
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        c37199o.m119207K("name");
        c37199o.m119222b0(this.f76791w);
        c37199o.m119207K("version");
        c37199o.m119222b0(this.f76792x);
        CopyOnWriteArraySet copyOnWriteArraySet = this.f76793y;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = C20412l5.m56626d().f76493b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f76794z;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = C20412l5.m56626d().f76492a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            c37199o.m119207K("packages");
            c37199o.m119219Y(interfaceC20602v0, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            c37199o.m119207K("integrations");
            c37199o.m119219Y(interfaceC20602v0, copyOnWriteArraySet2);
        }
        HashMap map = this.f76790E;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76790E, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
