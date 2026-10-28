package vu2;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: vu2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lvu2/c;", "domainState", "Lvu2/f;", "internal", "c", "(Lvu2/c;Lvu2/f;)Lvu2/c;", "a", "Lvu2/c;", "initialDomainState", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36524e {

    /* JADX INFO: renamed from: a */
    private static final C36522c f156294a = new C36522c(InterfaceC36521b.b.f156240a, null, null, null, null, null, null, 126, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C36522c m117055c(C36522c c36522c, InterfaceC36525f interfaceC36525f) {
        if (interfaceC36525f instanceof InterfaceC36525f.e) {
            return new C36522c(InterfaceC36521b.b.f156240a, null, null, null, null, null, null, 126, null);
        }
        if (interfaceC36525f instanceof InterfaceC36525f.f) {
            InterfaceC36525f.f fVar = (InterfaceC36525f.f) interfaceC36525f;
            return new C36522c(null, fVar.getExerciseDetails(), fVar.getOpenEntryPoint(), fVar.getRequestedExerciseId(), fVar.getAnalyticsContext(), null, null);
        }
        if (interfaceC36525f instanceof InterfaceC36525f.c) {
            return new C36522c(InterfaceC36521b.a.f156239a, null, null, null, null, null, null, 126, null);
        }
        if (interfaceC36525f instanceof InterfaceC36525f.d) {
            return new C36522c(InterfaceC36521b.c.f156241a, null, null, null, null, null, null, 126, null);
        }
        if (interfaceC36525f instanceof InterfaceC36525f.b) {
            return C36522c.m117029b(c36522c, InterfaceC36521b.b.f156240a, null, null, null, null, null, null, 18, null);
        }
        if (interfaceC36525f instanceof InterfaceC36525f.a) {
            return C36522c.m117029b(c36522c, null, null, null, null, null, Boolean.valueOf(((InterfaceC36525f.a) interfaceC36525f).getSuccess()), null, 94, null);
        }
        if (interfaceC36525f instanceof InterfaceC36525f.h) {
            return C36522c.m117029b(c36522c, null, null, null, null, null, null, null, 63, null);
        }
        if (interfaceC36525f instanceof InterfaceC36525f.g) {
            return C36522c.m117029b(c36522c, null, null, null, null, null, null, Boolean.valueOf(((InterfaceC36525f.g) interfaceC36525f).getSuccess()), 63, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
