package od1;

import ec3.InterfaceC13058l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: od1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Action", "Result", "Lec3/l;", "Lod1/g;", "interactor", "a", "(Lec3/l;Lod1/g;)Lec3/l;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27845h {
    /* JADX INFO: renamed from: a */
    public static final <Action, Result> InterfaceC13058l m83945a(InterfaceC13058l interfaceC13058l, InterfaceC27844g<Action, Result> interactor) {
        AbstractC22676k.m65750j(interfaceC13058l, "<this>");
        AbstractC22676k.m65750j(interactor, "interactor");
        return interactor.interact(interfaceC13058l);
    }
}
