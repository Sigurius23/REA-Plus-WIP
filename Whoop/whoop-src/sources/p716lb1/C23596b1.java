package p716lb1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb1.b1 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, m65681d2 = {"Llb1/b1;", "", "<init>", "()V", "Llb1/y0;", "mapper", "Ll83/a0;", "b", "(Llb1/y0;)V", "a", "()Llb1/y0;", "", "Ljava/util/List;", "registeredMappers", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23596b1 {

    /* JADX INFO: renamed from: a */
    public static final C23596b1 f93677a = new C23596b1();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final List<C23743y0> registeredMappers = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static final int f93679c = 8;

    private C23596b1() {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C23743y0 m68522a() {
        C23743y0 c23743y0M68574a;
        List<C23743y0> list = registeredMappers;
        c23743y0M68574a = AbstractC23603c1.m68574a();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            c23743y0M68574a = c23743y0M68574a.m69692c((C23743y0) it.next());
        }
        return c23743y0M68574a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m68523b(C23743y0 mapper) {
        AbstractC22676k.m65750j(mapper, "mapper");
        registeredMappers.add(mapper);
    }
}
