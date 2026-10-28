package rg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg2.C29168c;

/* JADX INFO: renamed from: rg2.r */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lrg2/r;", "", "<init>", "()V", "Lpg2/c;", "domain", "Lrg2/s;", "a", "(Lpg2/c;)Lrg2/s;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31406r {
    /* JADX INFO: renamed from: a */
    public final C31407s m96719a(C29168c domain) {
        AbstractC22676k.m65750j(domain, "domain");
        List<String> listM88633d = domain.m88633d();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM88633d.iterator();
        while (it.hasNext()) {
            C31398j c31398jM96704a = AbstractC31400l.m96704a((String) it.next(), domain.m88636g(), domain.m88632c());
            if (c31398jM96704a != null) {
                arrayList.add(c31398jM96704a);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(AbstractC31399k.m96703a((C31398j) it3.next(), domain.getSelectedInternalName()));
        }
        C31409u c31409uM96657a = AbstractC31389a.m96657a(domain.getSelectedInternalName(), arrayList, domain.m88632c());
        return new C31407s(arrayList2, c31409uM96657a.getSelectedActivityLabel(), c31409uM96657a.getShowGpsToggle());
    }
}
