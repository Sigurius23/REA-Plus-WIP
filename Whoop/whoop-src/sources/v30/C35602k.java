package v30;

import android.content.Context;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.api.C4976g;
import com.mapbox.common.location.C5432a;
import e73.C12803b;
import l83.C23468n;
import p077d0.C11387o2;
import p096dq.AbstractC12277u;
import p096dq.C12265i;
import p096dq.C12272p;
import p096dq.C12276t;
import p465rm.C31559p;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31624i;
import sg2.C32451b;
import to.AbstractC33993q;

/* JADX INFO: renamed from: v30.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C35602k {
    /* JADX INFO: renamed from: a */
    public final void m112796a(Context context, Function1 function1, Function1 function2) {
        Object objM107888l;
        AbstractC22676k.m65750j(context, "context");
        try {
            C11387o2 c11387o2 = new C11387o2(2);
            c11387o2.m30623o(1);
            C12272p c12272p = new C12272p(context, null, AbstractC12277u.f41106a, new C12276t(c11387o2), C4976g.f20501c);
            C12265i c12265i = new C12265i();
            c12265i.f41072w = 1;
            C12803b c12803bM107465a = AbstractC33993q.m107465a();
            c12803bM107465a.f43827e = new C31624i(c12265i, 29);
            c12803bM107465a.f43825c = new C4986c[]{AbstractC12277u.f41108c};
            c12803bM107465a.f43824b = true;
            c12803bM107465a.f43826d = 23716;
            objM107888l = c12272p.doRead(c12803bM107465a.m35864g()).addOnSuccessListener(new C31559p(new C32451b(function2, 29), 14)).addOnFailureListener(new C5432a(function1, 9));
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            function1.invoke(thM68037a);
        }
    }
}
