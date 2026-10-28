package vm2;

import com.whoop.appconfiguration.TabConfiguration;
import j02.AbstractC21155m0;
import java.util.Collection;
import java.util.Iterator;
import ji0.InterfaceC21718f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vm2.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lvm2/m;", "", "Lji0/f;", "configSource", "Lvm2/a;", "tabResolver", "<init>", "(Lji0/f;Lvm2/a;)V", "Lj02/m0;", "current", "", "a", "(Lj02/m0;)Z", "Lji0/f;", "b", "Lvm2/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36168m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21718f configSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36156a tabResolver;

    public C36168m(InterfaceC21718f configSource, C36156a tabResolver) {
        AbstractC22676k.m65750j(configSource, "configSource");
        AbstractC22676k.m65750j(tabResolver, "tabResolver");
        this.configSource = configSource;
        this.tabResolver = tabResolver;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m115110a(AbstractC21155m0 current) {
        if (current == null) {
            return false;
        }
        Iterable iterable = (Iterable) this.configSource.mo61188d().getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC21155m0 abstractC21155m0M115012a = this.tabResolver.m115012a((TabConfiguration) it.next());
            if (abstractC21155m0M115012a != null && AbstractC36169n.m115112b(abstractC21155m0M115012a, current)) {
                return true;
            }
        }
        return false;
    }
}
