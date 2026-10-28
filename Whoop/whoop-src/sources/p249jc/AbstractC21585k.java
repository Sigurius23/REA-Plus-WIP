package p249jc;

import androidx.work.impl.WorkDatabase;
import com.whoop.data.local.room.dao.wipeable.C6518e;
import ge3.AbstractC15751g;
import java.util.Iterator;
import java.util.List;
import p218ic.C18348b;
import p218ic.C18389w;
import p218ic.C18391y;
import p420qc.C30207q;
import p420qc.C30211u;
import pl0.C29343a;

/* JADX INFO: renamed from: jc.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21585k {

    /* JADX INFO: renamed from: a */
    public static final String f82777a = C18389w.m52887f("Schedulers");

    /* JADX INFO: renamed from: a */
    public static void m60631a(C30211u c30211u, C18391y c18391y, List list) {
        if (list.size() > 0) {
            c18391y.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c30211u.m92436g(jCurrentTimeMillis, ((C30207q) it.next()).f123634a);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m60632b(C18348b c18348b, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C30211u c30211uMo5521h = workDatabase.mo5521h();
        workDatabase.beginTransaction();
        try {
            List list2 = (List) AbstractC15751g.m44432L(c30211uMo5521h.f123665a, true, false, new C29343a(26));
            m60631a(c30211uMo5521h, c18348b.f71449d, list2);
            List list3 = (List) AbstractC15751g.m44432L(c30211uMo5521h.f123665a, true, false, new C6518e(c18348b.f71456k, 6));
            m60631a(c30211uMo5521h, c18348b.f71449d, list3);
            list3.addAll(list2);
            List list4 = (List) AbstractC15751g.m44432L(c30211uMo5521h.f123665a, true, false, new C29343a(28));
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (list3.size() > 0) {
                C30207q[] c30207qArr = (C30207q[]) list3.toArray(new C30207q[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC21581i interfaceC21581i = (InterfaceC21581i) it.next();
                    if (interfaceC21581i.mo60624c()) {
                        interfaceC21581i.mo60625e(c30207qArr);
                    }
                }
            }
            if (list4.size() > 0) {
                C30207q[] c30207qArr2 = (C30207q[]) list4.toArray(new C30207q[list4.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    InterfaceC21581i interfaceC21581i2 = (InterfaceC21581i) it3.next();
                    if (!interfaceC21581i2.mo60624c()) {
                        interfaceC21581i2.mo60625e(c30207qArr2);
                    }
                }
            }
        } catch (Throwable th3) {
            workDatabase.endTransaction();
            throw th3;
        }
    }
}
