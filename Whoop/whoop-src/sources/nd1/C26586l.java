package nd1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nd1.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lnd1/l;", "", "", "Lnd1/j;", "inputModules", "<init>", "(Ljava/util/List;)V", "module", "Ll83/a0;", "b", "(Lnd1/j;)V", "", "c", "(Lnd1/j;)Z", "a", "()Ljava/util/List;", "", "Ljava/util/Set;", "moduleSet", "", "Ljava/util/List;", "allModules", "di_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26586l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<Object> moduleSet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC26584j> allModules;

    public C26586l(List<? extends InterfaceC26584j> inputModules) {
        AbstractC22676k.m65750j(inputModules, "inputModules");
        this.moduleSet = new LinkedHashSet();
        this.allModules = new ArrayList();
        Iterator<T> it = inputModules.iterator();
        while (it.hasNext()) {
            m79058b((InterfaceC26584j) it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m79058b(InterfaceC26584j module) {
        if (m79059c(module)) {
            return;
        }
        this.moduleSet.add(module.getKey());
        Iterator<T> it = module.getDependencies().iterator();
        while (it.hasNext()) {
            m79058b((InterfaceC26584j) it.next());
        }
        this.allModules.add(module);
    }

    /* JADX INFO: renamed from: c */
    private final boolean m79059c(InterfaceC26584j module) {
        return this.moduleSet.contains(module.getKey());
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC26584j> m79060a() {
        return AbstractC25265s.m74093D1(this.allModules);
    }
}
