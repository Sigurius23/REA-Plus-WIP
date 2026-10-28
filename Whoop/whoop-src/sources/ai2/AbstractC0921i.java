package ai2;

import hk0.AbstractC17369d;
import lt0.C24725b;
import lt0.InterfaceC24729f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ai2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Llt0/f;", "Llt0/b;", "a", "(Llt0/f;)Llt0/b;", "Lhk0/d;", "b", "(Llt0/f;)Lhk0/d;", "strap-history-sync_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0921i {
    /* JADX INFO: renamed from: a */
    public static final C24725b m2268a(InterfaceC24729f interfaceC24729f) {
        AbstractC22676k.m65750j(interfaceC24729f, "<this>");
        C24725b c24725b = interfaceC24729f instanceof C24725b ? (C24725b) interfaceC24729f : null;
        if (c24725b != null) {
            return c24725b;
        }
        throw new IllegalStateException(("Expected a Rev1 data packet, got " + interfaceC24729f.getClass().getSimpleName() + " with format revision " + interfaceC24729f.mo49181g()).toString());
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC17369d m2269b(InterfaceC24729f interfaceC24729f) {
        AbstractC22676k.m65750j(interfaceC24729f, "<this>");
        AbstractC17369d abstractC17369d = interfaceC24729f instanceof AbstractC17369d ? (AbstractC17369d) interfaceC24729f : null;
        if (abstractC17369d != null) {
            return abstractC17369d;
        }
        throw new IllegalStateException(("Expected a Rev2 data packet, got " + interfaceC24729f.getClass().getSimpleName() + " with format revision " + interfaceC24729f.mo49181g()).toString());
    }
}
