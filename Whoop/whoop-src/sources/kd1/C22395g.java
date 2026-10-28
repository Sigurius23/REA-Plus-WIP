package kd1;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kd1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lkd1/g;", "T", "", "<init>", "()V", "component", "", "name", "type", "a", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkd1/h;", "Ljava/util/List;", "mutableDescriptions", "", "c", "()Ljava/util/List;", "descriptions", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22395g<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C22396h<T>> mutableDescriptions = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m64452b(C22395g c22395g, Object obj, String str, Object obj2, int i13, Object obj3) {
        if ((i13 & 4) != 0) {
            obj2 = null;
        }
        return c22395g.m64453a(obj, str, obj2);
    }

    /* JADX INFO: renamed from: a */
    public final T m64453a(T component, String name, Object type) {
        AbstractC22676k.m65750j(name, "name");
        this.mutableDescriptions.add(new C22396h<>(component, name, type));
        return component;
    }

    /* JADX INFO: renamed from: c */
    public final List<C22396h<T>> m64454c() {
        return AbstractC25265s.m74093D1(this.mutableDescriptions);
    }
}
