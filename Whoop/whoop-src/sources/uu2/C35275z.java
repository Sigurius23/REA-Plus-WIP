package uu2;

import com.whoop.weightlifting.data.dto.ExerciseDetailsModel;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu2.C36522c;
import vu2.InterfaceC36521b;

/* JADX INFO: renamed from: uu2.z */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Luu2/z;", "", "<init>", "()V", "Lvu2/c;", "domainState", "Luu2/y;", "a", "(Lvu2/c;)Luu2/y;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35275z {
    /* JADX INFO: renamed from: a */
    public final C35274y m111933a(C36522c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        InterfaceC36521b fullScreenModal = domainState.getFullScreenModal();
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC36521b.b.f156240a)) {
            return new C35274y(C35258j0.INSTANCE.m111746c(), null, false, false, false, 28, null);
        }
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC36521b.a.f156239a)) {
            return new C35274y(C35258j0.m111734g(C35258j0.INSTANCE.m111748e(), null, null, null, InterfaceC35243c.c.f149936a, null, null, null, false, 247, null), null, false, false, false, 28, null);
        }
        if (AbstractC22676k.m65745e(fullScreenModal, InterfaceC36521b.c.f156241a)) {
            return new C35274y(C35258j0.m111734g(C35258j0.INSTANCE.m111747d(), null, null, null, InterfaceC35243c.c.f149936a, null, null, null, false, 247, null), null, false, false, false, 28, null);
        }
        if (fullScreenModal != null) {
            throw new NoWhenBranchMatchedException();
        }
        ExerciseDetailsModel exerciseDetails = domainState.getExerciseDetails();
        if (exerciseDetails == null) {
            return new C35274y(C35258j0.m111734g(C35258j0.INSTANCE.m111748e(), null, null, null, InterfaceC35243c.c.f149936a, null, null, null, false, 247, null), null, false, false, false, 28, null);
        }
        C35262m analyticsContext = domainState.getAnalyticsContext();
        if (analyticsContext == null) {
            throw new IllegalArgumentException("analyticsContext required when exercise details are loaded");
        }
        C35264o c35264oM111857f = AbstractC35267r.m111857f(exerciseDetails, analyticsContext);
        Boolean deleteCustomExerciseSucceeded = domainState.getDeleteCustomExerciseSucceeded();
        Boolean bool = Boolean.TRUE;
        return new C35274y(null, c35264oM111857f, AbstractC22676k.m65745e(deleteCustomExerciseSucceeded, bool), AbstractC22676k.m65745e(domainState.getDeleteCustomExerciseSucceeded(), Boolean.FALSE), AbstractC22676k.m65745e(domainState.getOneRepMaxUpdateSucceeded(), bool));
    }
}
