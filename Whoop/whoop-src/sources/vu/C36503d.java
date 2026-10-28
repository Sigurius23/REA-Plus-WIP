package vu;

import com.mapbox.bindgen.Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p048ce.AbstractC4482w;

/* JADX INFO: renamed from: vu.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C36503d extends Value {

    /* JADX INFO: renamed from: a */
    public Object f155940a;

    public C36503d(double d3) {
        super(d3);
        this.f155940a = Double.valueOf(d3);
    }

    public C36503d(long j7) {
        super(j7);
        this.f155940a = Long.valueOf(j7);
    }

    public C36503d(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4482w.m14004n0(it.next()));
        }
        super((List<Value>) arrayList);
        this.f155940a = list;
    }

    public C36503d(C36500a c36500a) {
        ArrayList arrayList = new ArrayList();
        String str = c36500a.f155938a;
        arrayList.add(new Value(str));
        ArrayList arrayList2 = c36500a.f155939b;
        arrayList.addAll(arrayList2);
        super((List<Value>) arrayList);
        if ("literal".equals(str)) {
            this.f155940a = ((C36503d) AbstractC25265s.m74112P0(arrayList2)).f155940a;
        }
    }
}
