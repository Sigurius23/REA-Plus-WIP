package bg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: bg2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lbg2/d;", "Lbg2/e;", "a", "(Lbg2/d;)Lbg2/e;", "", "Lbg2/a;", "b", "(Lbg2/d;)Ljava/util/List;", "sms_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3233f {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC3232e m9355a(C3231d c3231d) {
        AbstractC22676k.m65750j(c3231d, "<this>");
        if (c3231d.getDestinationPhoneNumber().length() > 0 && c3231d.getPrefilledBody().length() > 0) {
            return new InterfaceC3232e.b(c3231d.getDestinationPhoneNumber(), c3231d.getPrefilledBody());
        }
        if (c3231d.getDestinationPhoneNumber().length() <= 0 || c3231d.getIsStartingTextingWhoop()) {
            return null;
        }
        return new InterfaceC3232e.a(m9356b(c3231d));
    }

    /* JADX INFO: renamed from: b */
    private static final List<C3228a> m9356b(C3231d c3231d) {
        Object next;
        List<C3228a> listM9340g = c3231d.m9340g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM9340g) {
            if (((C3228a) obj).getPhoneNumber().length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return AbstractC37056f.m118958J(new C3228a(c3231d.getDestinationPhoneNumber(), null, 2, null));
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C3228a) next).getPhoneNumber(), c3231d.getDestinationPhoneNumber()));
        C3228a c3228a = (C3228a) next;
        if (c3228a == null) {
            c3228a = new C3228a(c3231d.getDestinationPhoneNumber(), null, 2, null);
        }
        List listM118958J = AbstractC37056f.m118958J(c3228a);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!AbstractC22676k.m65745e(((C3228a) obj2).getPhoneNumber(), c3231d.getDestinationPhoneNumber())) {
                arrayList2.add(obj2);
            }
        }
        return AbstractC25265s.m74129g1(listM118958J, arrayList2);
    }
}
