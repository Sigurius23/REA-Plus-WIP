package ko0;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import j02.InterfaceC21159o0;
import l83.C23465k;
import lo0.InterfaceC24615z;
import m83.AbstractC25247g0;
import or2.AbstractC28219z;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ko0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lko0/e;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "<init>", "(Lj02/o0;Leb/a0;)V", "Llo0/z$f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Llo0/z$f;)V", "Lcom/whoop/navigation/e;", "navAction", "b", "(Lcom/whoop/navigation/e;)V", "Llo0/z$g;", "c", "(Llo0/z$g;)V", "Lj02/o0;", "Leb/a0;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22647e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    public C22647e(InterfaceC21159o0 navigator, AbstractC12939a0 navController) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        this.navigator = navigator;
        this.navController = navController;
    }

    /* JADX INFO: renamed from: a */
    private final void m65602a(InterfaceC24615z.f event) {
        String usState = event.getUsState();
        if (usState == null) {
            usState = "";
        }
        this.navController.m36402q(AbstractC28219z.m85447b("clinicianVideoSchedulingForm", AbstractC25247g0.m73990Y(new C23465k("usState", usState), new C23465k("intakeResponses", event.getIntakeResponsesJson()), new C23465k("rescheduleAppointmentId", event.getRescheduleAppointmentId()))));
    }

    /* JADX INFO: renamed from: b */
    private final void m65603b(C9598e navAction) {
        this.navController.m36410z();
        this.navigator.mo59392a(navAction);
    }

    /* JADX INFO: renamed from: c */
    public final void m65604c(InterfaceC24615z.g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC24615z.a) {
            m65603b(((InterfaceC24615z.a) event).getNavAction());
        } else if (event instanceof InterfaceC24615z.f) {
            m65602a((InterfaceC24615z.f) event);
        } else {
            if (!(event instanceof InterfaceC24615z.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
        }
    }
}
