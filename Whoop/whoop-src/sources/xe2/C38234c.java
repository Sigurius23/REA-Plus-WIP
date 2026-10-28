package xe2;

import af2.C0820j;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: xe2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lxe2/c;", "", "<init>", "()V", "Laf2/j;", "domainObject", "e", "(Laf2/j;)Laf2/j;", "f", "Ll83/a0;", "d", "", "c", "()Z", "a", "b", "()Laf2/j;", "", "Ljava/util/List;", "stackElements", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38234c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C0820j> stackElements = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m122510a() {
        this.stackElements.clear();
    }

    /* JADX INFO: renamed from: b */
    public final C0820j m122511b() {
        return (C0820j) AbstractC25265s.m74112P0(this.stackElements);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m122512c() {
        return this.stackElements.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final void m122513d() {
        if (this.stackElements.isEmpty()) {
            return;
        }
        List<C0820j> list = this.stackElements;
        list.remove(AbstractC37056f.m118951C(list));
    }

    /* JADX INFO: renamed from: e */
    public final C0820j m122514e(C0820j domainObject) {
        AbstractC22676k.m65750j(domainObject, "domainObject");
        this.stackElements.add(domainObject);
        return domainObject;
    }

    /* JADX INFO: renamed from: f */
    public final C0820j m122515f(C0820j domainObject) {
        AbstractC22676k.m65750j(domainObject, "domainObject");
        if (this.stackElements.isEmpty()) {
            throw new IllegalStateException("replacing domain object on the empty stack list");
        }
        List<C0820j> list = this.stackElements;
        list.set(AbstractC37056f.m118951C(list), domainObject);
        return (C0820j) AbstractC25265s.m74112P0(this.stackElements);
    }
}
