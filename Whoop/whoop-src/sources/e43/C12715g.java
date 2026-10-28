package e43;

import c93.InterfaceC4339a;
import java.util.List;
import java.util.Set;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e43.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C12715g {

    /* JADX INFO: renamed from: a */
    public final List f43503a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a f43504b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12716h f43505c;

    /* JADX INFO: renamed from: d */
    public final boolean f43506d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4339a f43507e;

    /* JADX INFO: renamed from: f */
    public final boolean f43508f;

    /* JADX INFO: renamed from: g */
    public final boolean f43509g;

    /* JADX INFO: renamed from: h */
    public final Set f43510h;

    /* JADX INFO: renamed from: i */
    public final Function1 f43511i;

    public C12715g(List pushDeviceGenerators, InterfaceC4339a requestPermissionOnAppLaunch, InterfaceC12716h notificationHandler, boolean z4, InterfaceC4339a requestPermissionOnDeviceRegistration, boolean z13, boolean z14, Set set, Function1 notificationUpdateTriggers) {
        AbstractC22676k.m65750j(pushDeviceGenerators, "pushDeviceGenerators");
        AbstractC22676k.m65750j(requestPermissionOnAppLaunch, "requestPermissionOnAppLaunch");
        AbstractC22676k.m65750j(notificationHandler, "notificationHandler");
        AbstractC22676k.m65750j(requestPermissionOnDeviceRegistration, "requestPermissionOnDeviceRegistration");
        AbstractC22676k.m65750j(notificationUpdateTriggers, "notificationUpdateTriggers");
        this.f43503a = pushDeviceGenerators;
        this.f43504b = requestPermissionOnAppLaunch;
        this.f43505c = notificationHandler;
        this.f43506d = z4;
        this.f43507e = requestPermissionOnDeviceRegistration;
        this.f43508f = z13;
        this.f43509g = z14;
        this.f43510h = set;
        this.f43511i = notificationUpdateTriggers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12715g)) {
            return false;
        }
        C12715g c12715g = (C12715g) obj;
        return AbstractC22676k.m65745e(this.f43503a, c12715g.f43503a) && AbstractC22676k.m65745e(this.f43504b, c12715g.f43504b) && AbstractC22676k.m65745e(this.f43505c, c12715g.f43505c) && this.f43506d == c12715g.f43506d && AbstractC22676k.m65745e(this.f43507e, c12715g.f43507e) && this.f43508f == c12715g.f43508f && this.f43509g == c12715g.f43509g && AbstractC22676k.m65745e(this.f43510h, c12715g.f43510h) && AbstractC22676k.m65745e(this.f43511i, c12715g.f43511i);
    }

    public final int hashCode() {
        return this.f43511i.hashCode() + AbstractC25012a.m73368a(this.f43510h, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC30802r.m94755d(AbstractC2875y.m8289b((this.f43505c.hashCode() + AbstractC30802r.m94755d(this.f43503a.hashCode() * 31, 31, this.f43504b)) * 31, 31, this.f43506d), 31, this.f43507e), 31, this.f43508f), 31, this.f43509g), 31);
    }

    public final String toString() {
        return "NotificationConfig(pushDeviceGenerators=" + this.f43503a + ", requestPermissionOnAppLaunch=" + this.f43504b + ", notificationHandler=" + this.f43505c + ", autoRegisterPushDevice=" + this.f43506d + ", requestPermissionOnDeviceRegistration=" + this.f43507e + ", hideRingingNotificationInForeground=" + this.f43508f + ", enableCallNotificationUpdates=" + this.f43509g + ", mediaNotificationCallTypes=" + this.f43510h + ", notificationUpdateTriggers=" + this.f43511i + ")";
    }
}
