package g50;

import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import ec3.AbstractC13091v;
import ec3.InterfaceC13075p1;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g50.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lg50/c;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lcom/whoop/analytics/AnalyticEventModel;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "Lg50/b;", "b", "(Lg50/b;)V", "Lfi0/a;", "Lec3/p1;", "Lg50/a;", "Lec3/p1;", "_analyticsContext", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15490c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 _analyticsContext;

    /* JADX INFO: renamed from: g50.c$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58149a;

        static {
            int[] iArr = new int[EnumC15489b.values().length];
            try {
                iArr[EnumC15489b.OmronConnectStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15489b.OmronConnectSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC15489b.OmronConnectFailure.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58149a = iArr;
        }
    }

    public C15490c(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
        this._analyticsContext = AbstractC13091v.m36593c(new C15488a(null, null, 3, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m43685a(AnalyticEventModel event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC14516b.m41429a(this.analytics, event);
    }

    /* JADX INFO: renamed from: b */
    public final void m43686b(EnumC15489b event) {
        String str;
        AbstractC22676k.m65750j(event, "event");
        int i13 = a.f58149a[event.ordinal()];
        if (i13 == 1) {
            str = "connect_start";
        } else if (i13 == 2) {
            str = "connect_success";
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "connect_failure";
        }
        m43685a(new AnalyticEventModel("Omron", "Omron", (String) null, str, (String) null, (String) null, (Map) null, 116, (DefaultConstructorMarker) null));
    }
}
