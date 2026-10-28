package p370oj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.EndUser;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.NudgeType;
import com.amplitude.android.engagement.types.SimulationContext;
import java.util.List;
import l83.C23454a0;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: oj.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C27958e extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112753w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Nudge f112754x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f112755y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27958e(Nudge nudge, InterfaceC28601c1 interfaceC28601c1, int i13) {
        super(2);
        this.f112753w = i13;
        this.f112754x = nudge;
        this.f112755y = interfaceC28601c1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Nudge nudge;
        String strName;
        String str;
        String title;
        SimulationContext simulationContext;
        int currentStepIndex;
        int size;
        SimulationContext simulationContext2;
        String userId;
        SimulationContext simulationContext3;
        String screen;
        EndUser endUser;
        List<NudgeStep> steps;
        NudgeType type;
        switch (this.f112753w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        nudge = this.f112754x;
                        if (nudge != null || (type = nudge.getType()) == null) {
                            strName = null;
                        } else {
                            strName = type.name();
                        }
                        if (AbstractC22676k.m65745e(strName, "SURVEY")) {
                            str = "Survey";
                        } else {
                            str = "Guide";
                        }
                        if (nudge != null || (title = nudge.getTitle()) == null) {
                            title = "No nudge available";
                        }
                        AbstractC37978j.m121651l(str, title, composer, 0);
                        AbstractC37978j.m121649j(composer, 0);
                        StringBuilder sb4 = new StringBuilder();
                        InterfaceC28601c1 interfaceC28601c1 = this.f112755y;
                        simulationContext = (SimulationContext) interfaceC28601c1.getValue();
                        if (simulationContext != null) {
                            currentStepIndex = simulationContext.getCurrentStepIndex();
                        } else {
                            currentStepIndex = 0;
                        }
                        size = 1;
                        sb4.append(currentStepIndex + 1);
                        sb4.append('/');
                        if (nudge != null && (steps = nudge.getSteps()) != null) {
                            size = steps.size();
                        }
                        sb4.append(size);
                        AbstractC37978j.m121651l("Step", sb4.toString(), composer, 6);
                        AbstractC37978j.m121649j(composer, 0);
                        simulationContext2 = (SimulationContext) interfaceC28601c1.getValue();
                        if (simulationContext2 != null || (endUser = simulationContext2.getEndUser()) == null || (userId = endUser.getUserId()) == null) {
                            userId = "No user";
                        }
                        AbstractC37978j.m121651l("User", userId, composer, 6);
                        AbstractC37978j.m121649j(composer, 0);
                        simulationContext3 = (SimulationContext) interfaceC28601c1.getValue();
                        if (simulationContext3 != null || (screen = simulationContext3.getScreen()) == null) {
                            screen = "No screen detected";
                        }
                        AbstractC37978j.m121651l("Screen", screen, composer, 6);
                    }
                } else {
                    nudge = this.f112754x;
                    if (nudge != null) {
                        strName = null;
                    } else {
                        strName = null;
                    }
                    if (AbstractC22676k.m65745e(strName, "SURVEY")) {
                        str = "Survey";
                    } else {
                        str = "Guide";
                    }
                    if (nudge != null) {
                        title = "No nudge available";
                    } else {
                        title = "No nudge available";
                    }
                    AbstractC37978j.m121651l(str, title, composer, 0);
                    AbstractC37978j.m121649j(composer, 0);
                    StringBuilder sb5 = new StringBuilder();
                    InterfaceC28601c1 interfaceC28601c2 = this.f112755y;
                    simulationContext = (SimulationContext) interfaceC28601c2.getValue();
                    if (simulationContext != null) {
                        currentStepIndex = simulationContext.getCurrentStepIndex();
                    } else {
                        currentStepIndex = 0;
                    }
                    size = 1;
                    sb5.append(currentStepIndex + 1);
                    sb5.append('/');
                    if (nudge != null) {
                        size = steps.size();
                    }
                    sb5.append(size);
                    AbstractC37978j.m121651l("Step", sb5.toString(), composer, 6);
                    AbstractC37978j.m121649j(composer, 0);
                    simulationContext2 = (SimulationContext) interfaceC28601c2.getValue();
                    if (simulationContext2 != null) {
                        userId = "No user";
                    } else {
                        userId = "No user";
                    }
                    AbstractC37978j.m121651l("User", userId, composer, 6);
                    AbstractC37978j.m121649j(composer, 0);
                    simulationContext3 = (SimulationContext) interfaceC28601c2.getValue();
                    if (simulationContext3 != null) {
                        screen = "No screen detected";
                    } else {
                        screen = "No screen detected";
                    }
                    AbstractC37978j.m121651l("Screen", screen, composer, 6);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC37978j.m121650k(AbstractC37817c.m121341b(-81905385, composer2, new C27958e(this.f112754x, this.f112755y, 0)), composer2, 6);
                    }
                } else {
                    AbstractC37978j.m121650k(AbstractC37817c.m121341b(-81905385, composer2, new C27958e(this.f112754x, this.f112755y, 0)), composer2, 6);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
