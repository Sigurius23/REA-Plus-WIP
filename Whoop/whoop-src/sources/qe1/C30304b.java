package qe1;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import java.util.Locale;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: qe1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lqe1/b;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "Lqe1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lqe1/a;)V", "Lqe1/e;", "b", "(Lqe1/e;)V", "Lfi0/a;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30304b {

    /* JADX INFO: renamed from: b */
    private static final a f124012b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f124013c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: qe1.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"Lqe1/b$a;", "", "<init>", "()V", "", "COMMUNITY", "Ljava/lang/String;", "SCREEN_NAME", "VIEW_FAMILY_PLAN", "VIEW_RAF", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C30304b(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m92656a(InterfaceC30303a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC30303a.c) {
            InterfaceC30303a.c cVar = (InterfaceC30303a.c) event;
            InterfaceC14515a interfaceC14515a = this.baseAnalytics;
            String title = cVar.getTitle();
            Integer index = cVar.getIndex();
            interfaceC14515a.mo41422d(null, "Tap", title, "Education Tile", String.valueOf(index != null ? Integer.valueOf(index.intValue() + 1) : null), AbstractC25247g0.m73990Y(new C23465k("Source", "Community"), new C23465k("Type", cVar.getTag()), new C23465k("Native", "Yes")));
            return;
        }
        if (event instanceof InterfaceC30303a.d) {
            this.baseAnalytics.mo41422d(null, "Viewed Full Video", ((InterfaceC30303a.d) event).getTitle(), "Education Tile", "", AbstractC31061c.m95645u("Source", "Community"));
        } else if (event instanceof InterfaceC30303a.a) {
            this.baseAnalytics.mo41422d(null, "Close", ((InterfaceC30303a.a) event).getTitle(), "Education Tile", "", AbstractC25247g0.m73990Y(new C23465k("Source", "Community"), new C23465k("Type", "VIDEO")));
        } else {
            if (!event.equals(InterfaceC30303a.b.f124007a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.baseAnalytics.mo41422d(null, "View All", null, "Education Tile", null, AbstractC31061c.m95645u("Source", "Community"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m92657b(InterfaceC30307e event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(InterfaceC30307e.b.f124019a)) {
            InterfaceC14515a interfaceC14515a = this.baseAnalytics;
            String lowerCase = "Community".toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            interfaceC14515a.mo41422d(null, "Tap", null, "View Refer a Friend menu", null, AbstractC25247g0.m73989X(new C23465k("screen_name", lowerCase)));
            return;
        }
        if (!event.equals(InterfaceC30307e.a.f124018a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC14515a interfaceC14515a2 = this.baseAnalytics;
        String lowerCase2 = "Community".toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
        interfaceC14515a2.mo41422d(null, "Tap", null, "Community Tab Family Plan Entry", null, AbstractC25247g0.m73989X(new C23465k("screen_name", lowerCase2)));
    }
}
