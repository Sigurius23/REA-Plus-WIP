package lu1;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import mc1.EnumC25417b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qu1.InterfaceC30627c;

/* JADX INFO: renamed from: lu1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Llu1/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lmc1/b;", "selectedHrZone", "", "a", "(Lmc1/b;)Ljava/lang/String;", "Lqu1/c$a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lqu1/c$a;)V", "Lfi0/a;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24748a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: lu1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f96781a;

        static {
            int[] iArr = new int[EnumC25417b.values().length];
            try {
                iArr[EnumC25417b.AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25417b.LIGHT_SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25417b.SWS_SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25417b.REM_SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f96781a = iArr;
        }
    }

    public C24748a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final String m72469a(EnumC25417b selectedHrZone) {
        int i13 = a.f96781a[selectedHrZone.ordinal()];
        if (i13 == 1) {
            return "AWAKE";
        }
        if (i13 == 2) {
            return "LIGHT";
        }
        if (i13 != 3) {
            return i13 != 4 ? selectedHrZone.name() : "REM";
        }
        return "SWS (DEEP)";
    }

    /* JADX INFO: renamed from: b */
    public final void m72470b(InterfaceC30627c.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC30627c.f) {
            AbstractC24749b.m72473c(this.analytics, ((InterfaceC30627c.f) event).getError());
            return;
        }
        if (event instanceof InterfaceC30627c.g) {
            AbstractC24749b.m72472b(this.analytics, ((InterfaceC30627c.g) event).getComponentId());
        } else if (event instanceof InterfaceC30627c.i) {
            AbstractC24749b.m72471a(this.analytics, m72469a(((InterfaceC30627c.i) event).getHrZoneType()));
        } else {
            if (!(event instanceof InterfaceC30627c.h)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC24749b.m72474d(this.analytics, ((InterfaceC30627c.h) event).getComponentId());
        }
    }
}
