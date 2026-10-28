package io0;

import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: io0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio0/a;", "", "Lfi0/a;", "analytics", "Ltr2/n;", "logger", "<init>", "(Lfi0/a;Ltr2/n;)V", "", "appointmentType", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/whoop/analytics/AnalyticEventModel;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "c", "(Ljava/lang/String;)V", "Lfi0/a;", "Ltr2/n;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20713a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C20713a(InterfaceC14515a analytics, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(logger, "logger");
        this.analytics = analytics;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    private final String m56902a(String appointmentType) {
        if (AbstractC22676k.m65745e(appointmentType, "ON_DEMAND")) {
            return "on_demand";
        }
        if (AbstractC22676k.m65745e(appointmentType, "SCHEDULED_AHEAD")) {
            return "scheduled";
        }
        String lowerCase = appointmentType.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: b */
    public final void m56903b(AnalyticEventModel event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC14516b.m41429a(this.analytics, event);
    }

    /* JADX INFO: renamed from: c */
    public final void m56904c(String appointmentType) {
        AbstractC22676k.m65750j(appointmentType, "appointmentType");
        String strM56902a = m56902a(appointmentType);
        this.logger.mo85216g(AbstractC31061c.m95640p("trackCompletedSchedulingIntake: appointmentType=", appointmentType, " label=", strM56902a), new AbstractC30556a.a[0]);
        this.analytics.mo41424f("", "scheduling_intake", strM56902a, "Clinician Consultation");
    }

    public /* synthetic */ C20713a(InterfaceC14515a interfaceC14515a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC14515a, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ClinicianInTheLoopAnalyticsHelper") : interfaceC34116n);
    }
}
