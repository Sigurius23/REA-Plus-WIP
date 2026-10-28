package a62;

import androidx.core.app.NotificationCompat;
import b62.InterfaceC2760a;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w52.C36843a;

/* JADX INFO: renamed from: a62.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"La62/a;", "", "Lw52/a;", "analytics", "<init>", "(Lw52/a;)V", "Lb62/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "c", "(Lb62/a;)V", "Lb62/a$c;", "a", "(Lb62/a$c;)Lb62/a;", "actionEvent", "b", "(Lb62/a;)Lb62/a;", "Lw52/a;", "recovery-impacts-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0474a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C36843a analytics;

    public C0474a(C36843a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC2760a m1193a(InterfaceC2760a.c event) {
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof C9598e) {
            return new InterfaceC2760a.b((C9598e) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final void m1194c(InterfaceC2760a event) {
        if (event instanceof InterfaceC2760a.a) {
            this.analytics.m118136a((InterfaceC2760a.a) event);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2760a m1195b(InterfaceC2760a actionEvent) {
        AbstractC22676k.m65750j(actionEvent, "actionEvent");
        m1194c(actionEvent);
        return actionEvent instanceof InterfaceC2760a.c ? m1193a((InterfaceC2760a.c) actionEvent) : actionEvent;
    }
}
