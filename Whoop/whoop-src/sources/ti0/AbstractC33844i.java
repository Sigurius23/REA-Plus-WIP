package ti0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ti0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, m65681d2 = {"Lti0/h;", "", "a", "(Lti0/h;)Z", "isEnabled", "b", "isRefreshing", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33844i {
    /* JADX INFO: renamed from: a */
    public static final boolean m107036a(InterfaceC33843h interfaceC33843h) {
        AbstractC22676k.m65750j(interfaceC33843h, "<this>");
        return interfaceC33843h instanceof InterfaceC33843h.c;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m107037b(InterfaceC33843h interfaceC33843h) {
        AbstractC22676k.m65750j(interfaceC33843h, "<this>");
        InterfaceC33843h.c cVar = interfaceC33843h instanceof InterfaceC33843h.c ? (InterfaceC33843h.c) interfaceC33843h : null;
        if (cVar != null) {
            return cVar.getIsRefreshing();
        }
        return false;
    }
}
