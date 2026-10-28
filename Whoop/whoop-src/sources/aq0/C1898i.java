package aq0;

import eg.C13161j;
import f53.C14117e;
import gh0.AbstractC15850e;
import java.util.function.Predicate;
import jt2.C21946h;
import jt2.C21947i;
import no1.C26993g;
import nq0.C27046i;
import ot2.C28340i;
import ot2.C28341j;
import ot2.C28342k;
import p000.C28503p;

/* JADX INFO: renamed from: aq0.i */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C1898i implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7454a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7455b;

    public /* synthetic */ C1898i(Object obj, int i13) {
        this.f7454a = i13;
        this.f7455b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f7454a) {
            case 0:
                return C1906q.m5677B1((C28503p) this.f7455b, obj);
            case 1:
                return ((String) this.f7455b).equals((String) obj);
            case 2:
                return AbstractC15850e.m44705A((C13161j) this.f7455b, obj);
            case 3:
                return C21947i.m62584k((C21946h) this.f7455b, obj);
            case 4:
                return C21947i.m62586m((C21946h) this.f7455b, obj);
            case 5:
                return C27046i.m81209j0((C26993g) this.f7455b, obj);
            case 6:
                return C28341j.m85928f((C28340i) this.f7455b, obj);
            case 7:
                return C28342k.m85937g((C28340i) this.f7455b, obj);
            default:
                return ((Boolean) ((C14117e) this.f7455b).invoke(obj)).booleanValue();
        }
    }
}
