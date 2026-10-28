package io.sentry.compose.viewhierarchy;

import androidx.compose.p018ui.node.C1134a;
import io.sentry.InterfaceC20602v0;
import io.sentry.compose.C20300a;
import io.sentry.protocol.C20487k0;
import io.sentry.util.C20579a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005a3.C0230n0;
import p181h2.C16618c;
import p446r1.C30849c;
import p635y2.AbstractC39125q1;
import p635y2.C39148y0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;", "Lio/sentry/v0;", "logger", "<init>", "(Lio/sentry/v0;)V", "sentry-compose_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ComposeViewHierarchyExporter {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20602v0 f76204a;

    /* JADX INFO: renamed from: b */
    public volatile C20300a f76205b;

    /* JADX INFO: renamed from: c */
    public final C20579a f76206c;

    public ComposeViewHierarchyExporter(InterfaceC20602v0 logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.f76204a = logger;
        this.f76206c = new C20579a();
    }

    /* JADX INFO: renamed from: a */
    public static void m56301a(C20300a c20300a, C20487k0 c20487k0, C0230n0 c0230n0) {
        if (c0230n0.m606Y()) {
            C20487k0 c20487k1 = new C20487k0();
            Iterator it = c0230n0.m583D().iterator();
            while (it.hasNext()) {
                String strM56300a = c20300a.m56300a(((C39148y0) it.next()).m124666a());
                if (strM56300a != null) {
                    c20487k1.f76719z = strM56300a;
                }
            }
            C16618c c16618cM124659e = AbstractC39125q1.m124659e((C1134a) c0230n0.f783e0.f740d);
            float f13 = c16618cM124659e.f63939a;
            c20487k1.f76710G = Double.valueOf(f13);
            float f14 = c16618cM124659e.f63940b;
            c20487k1.f76711H = Double.valueOf(f14);
            c20487k1.f76709F = Double.valueOf(c16618cM124659e.f63942d - f14);
            c20487k1.f76708E = Double.valueOf(c16618cM124659e.f63941c - f13);
            String str = c20487k1.f76719z;
            if (str == null) {
                str = "@Composable";
            }
            c20487k1.f76717x = str;
            if (c20487k0.f76714K == null) {
                c20487k0.f76714K = new ArrayList();
            }
            List list = c20487k0.f76714K;
            AbstractC22676k.m65747g(list);
            list.add(c20487k1);
            C30849c c30849cM594L = c0230n0.m594L();
            int i13 = c30849cM594L.f127229y;
            for (int i14 = 0; i14 < i13; i14++) {
                m56301a(c20300a, c20487k1, (C0230n0) c30849cM594L.f127227w[i14]);
            }
        }
    }
}
