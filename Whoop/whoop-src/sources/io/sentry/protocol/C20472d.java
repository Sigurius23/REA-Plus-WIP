package io.sentry.protocol;

import ih0.AbstractC18489d0;
import io.sentry.C20513q6;
import io.sentry.InterfaceC20348h2;
import io.sentry.InterfaceC20401k3;
import io.sentry.InterfaceC20602v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.protocol.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C20472d implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: w */
    public C20498s f76631w;

    /* JADX INFO: renamed from: x */
    public List f76632x;

    /* JADX INFO: renamed from: y */
    public HashMap f76633y;

    /* JADX INFO: renamed from: a */
    public static C20472d m56654a(C20472d c20472d, C20513q6 c20513q6) {
        ArrayList arrayList = new ArrayList();
        if (c20513q6.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(c20513q6.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : c20513q6.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (c20472d == null) {
            c20472d = new C20472d();
        }
        List list = c20472d.f76632x;
        if (list == null) {
            c20472d.f76632x = new ArrayList(arrayList);
            return c20472d;
        }
        list.addAll(arrayList);
        return c20472d;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        if (this.f76631w != null) {
            c37199o.m119207K("sdk_info");
            c37199o.m119219Y(interfaceC20602v0, this.f76631w);
        }
        if (this.f76632x != null) {
            c37199o.m119207K("images");
            c37199o.m119219Y(interfaceC20602v0, this.f76632x);
        }
        HashMap map = this.f76633y;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC18489d0.m53385z(this.f76633y, str, c37199o, str, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
