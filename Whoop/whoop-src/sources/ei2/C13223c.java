package ei2;

import e81.C12824e;
import fi0.InterfaceC14515a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ji2.C21724c;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ei2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lei2/c;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lei2/b;", "stravaAnalyticEvent", "Ll83/a0;", "b", "(Lei2/b;)V", "a", "Lfi0/a;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13223c {

    /* JADX INFO: renamed from: c */
    public static final int f45813c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C13223c(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final CharSequence m37121c(C21724c it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getActivityNameInternal();
    }

    /* JADX INFO: renamed from: b */
    public final void m37122b(InterfaceC13222b stravaAnalyticEvent) {
        EnumC13221a enumC13221a;
        String strM74110N0;
        AbstractC22676k.m65750j(stravaAnalyticEvent, "stravaAnalyticEvent");
        if (stravaAnalyticEvent instanceof InterfaceC13222b.a) {
            InterfaceC14515a.m41418i(this.analytics, "Integrations", "Connect", null, "Strava", null, null, 52, null);
            return;
        }
        if (stravaAnalyticEvent instanceof InterfaceC13222b.i) {
            InterfaceC14515a.m41418i(this.analytics, "Integrations", "Enable auto-share", null, "Strava", null, null, 52, null);
            return;
        }
        if (stravaAnalyticEvent instanceof InterfaceC13222b.e) {
            InterfaceC14515a.m41418i(this.analytics, "Integrations", "Select Activities to auto-share", null, "Strava", null, null, 52, null);
            return;
        }
        if (stravaAnalyticEvent instanceof InterfaceC13222b.g) {
            InterfaceC14515a.m41418i(this.analytics, "Integrations", "Disable auto-share", null, "Strava", null, null, 52, null);
            return;
        }
        if (stravaAnalyticEvent instanceof InterfaceC13222b.h) {
            InterfaceC14515a.m41418i(this.analytics, "Integrations", "Enable auto-import", null, "Strava", null, null, 52, null);
            return;
        }
        if (stravaAnalyticEvent instanceof InterfaceC13222b.f) {
            InterfaceC14515a.m41418i(this.analytics, "Integrations", "Disable auto-import", null, "Strava", null, null, 52, null);
            return;
        }
        if (stravaAnalyticEvent instanceof InterfaceC13222b.b) {
            InterfaceC14515a.m41418i(this.analytics, "Integrations", "Disconnect", null, "Strava", null, null, 52, null);
            return;
        }
        if (stravaAnalyticEvent instanceof InterfaceC13222b.c) {
            InterfaceC14515a.m41418i(this.analytics, "Integrations", "Disconnect Confirmed", null, "Strava", null, null, 52, null);
            return;
        }
        if (!(stravaAnalyticEvent instanceof InterfaceC13222b.d)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC13222b.d dVar = (InterfaceC13222b.d) stravaAnalyticEvent;
        List<C21724c> listM37119a = dVar.m37119a();
        boolean z4 = false;
        if ((listM37119a instanceof Collection) && listM37119a.isEmpty()) {
            enumC13221a = EnumC13221a.ALL_SELECTED;
            break;
        }
        Iterator<T> it = listM37119a.iterator();
        while (true) {
            if (!it.hasNext()) {
                enumC13221a = EnumC13221a.ALL_SELECTED;
                break;
            }
            if (!((C21724c) it.next()).getSelected()) {
                List<C21724c> listM37119a2 = dVar.m37119a();
                if (!(listM37119a2 instanceof Collection) || !listM37119a2.isEmpty()) {
                    Iterator<T> it3 = listM37119a2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((C21724c) it3.next()).getSelected()) {
                                enumC13221a = EnumC13221a.SOME_SELECTED;
                                z4 = true;
                                break;
                            }
                        } else {
                            enumC13221a = EnumC13221a.NONE_SELECTED;
                            break;
                        }
                    }
                } else {
                    enumC13221a = EnumC13221a.NONE_SELECTED;
                    break;
                }
            }
        }
        if (z4) {
            List<C21724c> listM37119a3 = dVar.m37119a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM37119a3) {
                if (((C21724c) obj).getSelected()) {
                    arrayList.add(obj);
                }
            }
            strM74110N0 = AbstractC25265s.m74110N0(arrayList, ",", null, null, new C12824e(27), 30);
        } else {
            strM74110N0 = null;
        }
        this.analytics.mo41428k("Integrations", "Save Selected Activities", enumC13221a.getLabel(), "Strava", AbstractC31061c.m95645u("activities_selected", strM74110N0));
    }
}
