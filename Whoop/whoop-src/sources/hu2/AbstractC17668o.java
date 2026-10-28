package hu2;

import fu2.InterfaceC14787b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hu2.o */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhu2/m;", "Lfu2/b$n;", "a", "(Lhu2/m;)Lfu2/b$n;", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17668o {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC14787b.n m50410a(InterfaceC17666m interfaceC17666m) {
        AbstractC22676k.m65750j(interfaceC17666m, "<this>");
        if (interfaceC17666m instanceof C17660g) {
            return new InterfaceC14787b.o(((C17660g) interfaceC17666m).getExerciseId());
        }
        if (interfaceC17666m instanceof C17659f) {
            C17659f c17659f = (C17659f) interfaceC17666m;
            return new InterfaceC14787b.d(c17659f.getGroupIndex(), c17659f.getExerciseIndex());
        }
        if (interfaceC17666m instanceof C17657d) {
            return new InterfaceC14787b.a(((C17657d) interfaceC17666m).getGroupIndex());
        }
        if (interfaceC17666m instanceof C17662i) {
            C17662i c17662i = (C17662i) interfaceC17666m;
            return new InterfaceC14787b.j(c17662i.getGroupIndex(), c17662i.getSetIndex());
        }
        if (interfaceC17666m instanceof C17664k) {
            C17664k c17664k = (C17664k) interfaceC17666m;
            return new InterfaceC14787b.p(c17664k.getGroupIndex(), c17664k.getExerciseIndex(), c17664k.getSetIndex(), c17664k.getNewRepsText());
        }
        if (interfaceC17666m instanceof C17665l) {
            C17665l c17665l = (C17665l) interfaceC17666m;
            return new InterfaceC14787b.q(c17665l.getGroupIndex(), c17665l.getExerciseIndex(), c17665l.getSetIndex(), c17665l.getNewTimeText(), false, 16, null);
        }
        if (interfaceC17666m instanceof C17667n) {
            C17667n c17667n = (C17667n) interfaceC17666m;
            return new InterfaceC14787b.r(c17667n.getGroupIndex(), c17667n.getExerciseIndex(), c17667n.getSetIndex(), c17667n.getNewWeightText());
        }
        if (interfaceC17666m instanceof C17663j) {
            C17663j c17663j = (C17663j) interfaceC17666m;
            return new InterfaceC14787b.k(c17663j.getFromIndex(), c17663j.getToIndex());
        }
        if (interfaceC17666m instanceof C17658e) {
            return InterfaceC14787b.c.f54848a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
