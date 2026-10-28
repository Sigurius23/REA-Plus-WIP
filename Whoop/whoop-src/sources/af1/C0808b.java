package af1;

import androidx.core.app.NotificationCompat;
import ef1.InterfaceC13145a;
import fi0.InterfaceC14515a;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: af1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Laf1/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lef1/a$a$c;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "d", "(Lef1/a$a$c;)V", "Lef1/a$a$b;", "c", "(Lef1/a$a$b;)V", "Lef1/a$a$a;", "b", "(Lef1/a$a$a;)V", "Lef1/a$a;", "a", "(Lef1/a$a;)V", "Lfi0/a;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0808b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C0808b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m1963b(InterfaceC13145a.a.C41523a event) {
        InterfaceC14515a interfaceC14515a = this.analytics;
        String exerciseName = event.getExerciseName();
        if (AbstractC39414r.m125890i0(exerciseName)) {
            exerciseName = null;
        }
        interfaceC14515a.mo41428k("Exercise Details", "Change Time Period", exerciseName, "Workout Builder", AbstractC31061c.m95645u("Time Period", event.getTimePeriod()));
    }

    /* JADX INFO: renamed from: c */
    private final void m1964c(InterfaceC13145a.a.b event) {
        String str;
        if (AbstractC22676k.m65745e(event.getPressedDate(), event.getBackDate())) {
            str = "Press Previous Date";
        } else if (!AbstractC22676k.m65745e(event.getPressedDate(), event.getForwardDate())) {
            return;
        } else {
            str = "Press Next Date";
        }
        String str2 = str;
        InterfaceC14515a interfaceC14515a = this.analytics;
        String exerciseName = event.getExerciseName();
        if (AbstractC39414r.m125890i0(exerciseName)) {
            exerciseName = null;
        }
        String scrubValue = event.getScrubValue();
        interfaceC14515a.mo41422d("Exercise Details", str2, exerciseName, "Workout Builder", AbstractC39414r.m125890i0(scrubValue) ? null : scrubValue, AbstractC25247g0.m73990Y(new C23465k("Start Date", event.getStartDate()), new C23465k("End Date", event.getEndDate()), new C23465k("Time Period", event.getTimePeriod())));
    }

    /* JADX INFO: renamed from: d */
    private final void m1965d(InterfaceC13145a.a.c event) {
        InterfaceC14515a interfaceC14515a = this.analytics;
        String exerciseName = event.getExerciseName();
        if (AbstractC39414r.m125890i0(exerciseName)) {
            exerciseName = null;
        }
        String scrubValue = event.getScrubValue();
        interfaceC14515a.mo41422d("Exercise Details", "Scrub", exerciseName, "Workout Builder", AbstractC39414r.m125890i0(scrubValue) ? null : scrubValue, AbstractC25247g0.m73990Y(new C23465k("Time Period", event.getTimePeriod()), new C23465k("Exercise Type", event.getExerciseType())));
    }

    /* JADX INFO: renamed from: a */
    public final void m1966a(InterfaceC13145a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC13145a.a.c) {
            m1965d((InterfaceC13145a.a.c) event);
        } else if (event instanceof InterfaceC13145a.a.b) {
            m1964c((InterfaceC13145a.a.b) event);
        } else {
            if (!(event instanceof InterfaceC13145a.a.C41523a)) {
                throw new NoWhenBranchMatchedException();
            }
            m1963b((InterfaceC13145a.a.C41523a) event);
        }
    }
}
