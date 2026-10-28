package dv2;

import com.whoop.weightlifting.StrengthTrainerDestination;
import cv2.InterfaceC11150c;
import cv2.InterfaceC11154g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dv2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ldv2/c;", "", "<init>", "()V", "Lcv2/g;", "domainState", "Ldv2/b$k;", "a", "(Lcv2/g;)Ldv2/b$k;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12392c {
    /* JADX INFO: renamed from: a */
    public final InterfaceC12391b.k m34801a(InterfaceC11154g domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        boolean z4 = domainState instanceof InterfaceC11154g.a;
        if (z4) {
            InterfaceC11154g.a aVar = (InterfaceC11154g.a) domainState;
            if ((aVar.getExerciseSelectionState() instanceof InterfaceC11150c.b) && !aVar.m30175i().isEmpty()) {
                return new InterfaceC12391b.h(((InterfaceC11150c.b) aVar.getExerciseSelectionState()).getIndexOfFirstNewGroup(), aVar.getInLinkWorkoutFlow() ? StrengthTrainerDestination.C10744g.f32784a : StrengthTrainerDestination.C10747j.f32796a);
            }
        }
        if (!z4) {
            return null;
        }
        InterfaceC11154g.a aVar2 = (InterfaceC11154g.a) domainState;
        if (!aVar2.getIsLinkingCustomExercise() || aVar2.getExerciseIdToLink() == null) {
            return null;
        }
        return new InterfaceC12391b.m(aVar2.getExerciseIdToLink());
    }
}
