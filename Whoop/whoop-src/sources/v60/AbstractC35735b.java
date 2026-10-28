package v60;

import i51.C18112i;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k81.C22295e;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import v01.C35509k;

/* JADX INFO: renamed from: v60.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m65681d2 = {"Lm91/u;", "e", "(Lm91/u;)Lm91/u;", "Ljb1/a;", "a", "Ljb1/a;", "itemReducer", "achievements_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35735b {

    /* JADX INFO: renamed from: a */
    private static final C21535a f151987a = AbstractC21537c.m60554d(new C35509k(16));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m113198d(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC25312u m113199e(InterfaceC25312u interfaceC25312u) {
        if (interfaceC25312u instanceof C18112i) {
            return C18112i.m51978b((C18112i) interfaceC25312u, null, null, null, null, null, true, 31, null);
        }
        if (!(interfaceC25312u instanceof C22295e)) {
            return interfaceC25312u;
        }
        C22295e c22295e = (C22295e) interfaceC25312u;
        List<C25306o> listM64062f = c22295e.m64062f();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM64062f, 10));
        for (C25306o c25306o : listM64062f) {
            arrayList.add(C25306o.m74314b(c25306o, m113199e(c25306o.getState()), null, 2, null));
        }
        return C22295e.m64058b(c22295e, null, null, null, arrayList, 0.0f, 0.0f, 0.0f, null, false, 503, null);
    }
}
