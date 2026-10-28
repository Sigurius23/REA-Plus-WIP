package ap2;

import androidx.core.app.NotificationCompat;
import ep2.InterfaceC13429a;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import s21.C32079b;
import s21.C32085h;

/* JADX INFO: renamed from: ap2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lap2/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lep2/a$k;", NotificationCompat.CATEGORY_EVENT, "", "source", "Ll83/a0;", "c", "(Lep2/a$k;Ljava/lang/String;)V", "Lep2/a$a;", "a", "(Lep2/a$a;Ljava/lang/String;)V", "Lfi0/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1882a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C1882a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5659b(C1882a c1882a, InterfaceC13429a.a aVar, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "";
        }
        c1882a.m5661a(aVar, str);
    }

    /* JADX INFO: renamed from: c */
    private final void m5660c(InterfaceC13429a.k event, String source) {
        InterfaceC25312u element = event.getElement();
        if (element instanceof C32085h) {
            InterfaceC14515a interfaceC14515a = this.analytics;
            C32085h c32085h = (C32085h) element;
            C32079b analytics = c32085h.getAnalytics();
            String label = analytics != null ? analytics.getLabel() : null;
            C32079b analytics2 = c32085h.getAnalytics();
            AbstractC1883b.m5663b(interfaceC14515a, label, analytics2 != null ? analytics2.getValue() : null, source);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5661a(InterfaceC13429a.a event, String source) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(source, "source");
        if (event instanceof InterfaceC13429a.o) {
            InterfaceC13429a.o oVar = (InterfaceC13429a.o) event;
            AbstractC1883b.m5664c(this.analytics, oVar.getSource(), oVar.m38146a(), oVar.getUpsellsShown());
        } else if (event instanceof InterfaceC13429a.f) {
            AbstractC1883b.m5662a(this.analytics, ((InterfaceC13429a.f) event).getSource());
        } else if (event instanceof InterfaceC13429a.k) {
            m5660c((InterfaceC13429a.k) event, source);
        }
    }
}
