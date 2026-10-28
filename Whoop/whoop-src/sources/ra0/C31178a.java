package ra0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.design.util.AbstractC8693b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import md0.AbstractC25448c;
import na0.AbstractC26507c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33205o0;
import p736sz0.C33211q0;
import qa0.AbstractC30111c;
import qa0.InterfaceC30109a;
import uv0.AbstractC35283c;

/* JADX INFO: renamed from: ra0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lra0/a;", "", "<init>", "()V", "Lna0/c;", "domainResult", "Lqa0/c;", "a", "(Lna0/c;)Lqa0/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31178a {
    /* JADX INFO: renamed from: a */
    public final AbstractC30111c m95908a(AbstractC26507c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC26507c.b) {
            return new AbstractC30111c.a(C33205o0.f138451a.m105288b(), null, null, 6, null);
        }
        if (domainResult instanceof AbstractC26507c.a) {
            return new AbstractC30111c.a(C33211q0.m105332d(C33205o0.f138451a.m105289c(), null, null, null, null, null, true, false, AbstractC8693b.m21277k(AbstractC35283c.f150167E), false, false, 863, null), InterfaceC30109a.f.f122861a, InterfaceC30109a.a.f122856a);
        }
        if (!(domainResult instanceof AbstractC26507c.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC26507c.c cVar = (AbstractC26507c.c) domainResult;
        String navigationTitle = cVar.getResponse().getNavigationBar().getNavigationTitle();
        List<AdvancedLabsSectionModel> sections = cVar.getResponse().getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC25448c.m74762z0().m60541h((AdvancedLabsSectionModel) it.next()));
        }
        return new AbstractC30111c.b(navigationTitle, arrayList, cVar.getResponse().getAnalytics(), cVar.getDisplayRefreshingSpinner());
    }
}
