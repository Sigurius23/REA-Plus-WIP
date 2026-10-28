package vx1;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: vx1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lvx1/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Ll83/a0;", "d", "()V", "", "value", "a", "(Ljava/lang/String;)V", "b", "Lvx1/a;", NotificationCompat.CATEGORY_EVENT, "c", "(Lvx1/a;)V", "Lfi0/a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36559b {

    /* JADX INFO: renamed from: c */
    public static final int f156540c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C36559b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m117276a(String value) {
        this.analytics.mo41422d("returns", "click", "cta", "Returns", value, AbstractC31061c.m95645u("screen_name", "return_label"));
    }

    /* JADX INFO: renamed from: b */
    private final void m117277b() {
        this.analytics.mo41422d("returns", "click", "link", "Returns", "return_policy", AbstractC31061c.m95645u("screen_name", "return_label"));
    }

    /* JADX INFO: renamed from: d */
    private final void m117278d() {
        InterfaceC14515a.m41418i(this.analytics, "returns", ProfileAnalyticsKt.VIEW, null, "Returns", null, AbstractC31061c.m95645u("screen_name", "return_label"), 20, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m117279c(AbstractC36558a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC36558a.c) {
            m117278d();
        } else if (event instanceof AbstractC36558a.a) {
            m117276a(((AbstractC36558a.a) event).getValue());
        } else {
            if (!(event instanceof AbstractC36558a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m117277b();
        }
    }
}
