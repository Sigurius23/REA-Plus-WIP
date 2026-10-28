package mc;

import android.content.Context;
import android.net.ConnectivityManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25260n;
import nc.C26559c;
import nc.C26561e;
import nc.C26562f;
import nc.InterfaceC26560d;
import p114eb.AbstractC12979o0;
import p364oc.C27815i;
import p647yf.AbstractC39506s;
import p647yf.C39505r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mc.h */
/* JADX INFO: loaded from: classes.dex */
public final class C25411h {

    /* JADX INFO: renamed from: a */
    public final List f99515a;

    public C25411h() {
        this.f99515a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public void m74598a() throws IOException {
        for (AbstractC39506s abstractC39506s : this.f99515a) {
            synchronized (abstractC39506s.f169924w) {
                C39505r c39505r = abstractC39506s.f169924w;
                if (!c39505r.f169923b) {
                    int i13 = c39505r.f169922a - 1;
                    c39505r.f169922a = i13;
                    if (i13 <= 0) {
                        c39505r.f169923b = true;
                        abstractC39506s.f169925x.close();
                    }
                }
            }
        }
    }

    public C25411h(C27815i trackers) {
        AbstractC22676k.m65750j(trackers, "trackers");
        C26559c c26559c = new C26559c(trackers.f112063b, 0);
        C26559c c26559c2 = new C26559c(trackers.f112064c);
        C26559c c26559c3 = new C26559c(trackers.f112066e, 4);
        AbstractC12979o0 abstractC12979o0 = trackers.f112065d;
        C26559c c26559c4 = new C26559c(abstractC12979o0, 2);
        C26559c c26559c5 = new C26559c(abstractC12979o0, 3);
        C26562f c26562f = new C26562f(abstractC12979o0);
        C26561e c26561e = new C26561e(abstractC12979o0);
        Context context = trackers.f112062a;
        String str = AbstractC25412i.f99516a;
        AbstractC22676k.m65750j(context, "context");
        Object systemService = context.getSystemService("connectivity");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f99515a = AbstractC25260n.m74077r0(new InterfaceC26560d[]{c26559c, c26559c2, c26559c3, c26559c4, c26559c5, c26562f, c26561e, new C25407d((ConnectivityManager) systemService)});
    }

    public C25411h(List list) {
        this.f99515a = list;
    }
}
