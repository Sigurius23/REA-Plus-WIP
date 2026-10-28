package ko0;

import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import l83.C23465k;
import m83.AbstractC25247g0;
import n83.C26463f;
import or2.AbstractC28152c1;
import or2.AbstractC28219z;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ko0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lko0/a;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22643a implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: b */
    public static final int f89093b = C21147i0.f80230a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    public C22643a(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        C12997x0 c12997x0M36508a = AbstractC28152c1.m85188f(new C12995w0()).m36508a();
        if (!(navigationScreen instanceof AbstractC21155m0.m0)) {
            return navigationScreen instanceof AbstractC21155m0.l0 ? new InterfaceC21149j0.c(AbstractC31061c.m95630f(AbstractC28219z.m85447b("clinicianSchedulingConfirmation", AbstractC25247g0.m73989X(new C23465k("appointmentId", ((AbstractC21155m0.l0) navigationScreen).getAppointmentId()))), "toString(...)", this.navDeepLinkRequestHelper), c12997x0M36508a, null, 4, null) : InterfaceC21149j0.d.f80241a;
        }
        C26463f c26463f = new C26463f();
        AbstractC21155m0.m0 m0Var = (AbstractC21155m0.m0) navigationScreen;
        String appointmentType = m0Var.getAppointmentType();
        if (appointmentType != null) {
            if (AbstractC39414r.m125890i0(appointmentType)) {
                appointmentType = null;
            }
            if (appointmentType != null) {
            }
        }
        String intakeType = m0Var.getIntakeType();
        if (intakeType != null) {
            if (AbstractC39414r.m125890i0(intakeType)) {
                intakeType = null;
            }
            if (intakeType != null) {
            }
        }
        String appointmentId = m0Var.getAppointmentId();
        if (appointmentId != null) {
            String str = AbstractC39414r.m125890i0(appointmentId) ? null : appointmentId;
            if (str != null) {
                c26463f.put("appointmentId", str);
            }
        }
        return new InterfaceC21149j0.c(AbstractC31061c.m95630f(AbstractC28219z.m85447b("clinicianVideoSchedulingIntake", c26463f.m78380b()), "toString(...)", this.navDeepLinkRequestHelper), c12997x0M36508a, null, 4, null);
    }

    public /* synthetic */ C22643a(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
