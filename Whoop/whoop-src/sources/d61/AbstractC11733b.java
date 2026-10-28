package d61;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d61.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ld61/a;", "", "a", "(Ld61/a;)Z", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11733b {
    /* JADX INFO: renamed from: a */
    public static final boolean m31361a(InterfaceC11732a interfaceC11732a) {
        AbstractC22676k.m65750j(interfaceC11732a, "<this>");
        if (interfaceC11732a instanceof InterfaceC11732a.c) {
            return !((InterfaceC11732a.c) interfaceC11732a).mo31360b().isEmpty();
        }
        if (interfaceC11732a instanceof InterfaceC11732a.a) {
            return !((InterfaceC11732a.a) interfaceC11732a).mo31360b().isEmpty();
        }
        if (interfaceC11732a.equals(InterfaceC11732a.b.f37977a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
