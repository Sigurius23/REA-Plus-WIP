package p430qm;

import android.util.SparseArray;
import dm.EnumC12174d;
import java.util.HashMap;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: qm.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC30477a {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f125236a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public static final HashMap f125237b;

    static {
        HashMap map = new HashMap();
        f125237b = map;
        map.put(EnumC12174d.f40479w, 0);
        map.put(EnumC12174d.f40480x, 1);
        map.put(EnumC12174d.f40481y, 2);
        for (EnumC12174d enumC12174d : map.keySet()) {
            f125236a.append(((Integer) f125237b.get(enumC12174d)).intValue(), enumC12174d);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m93285a(EnumC12174d enumC12174d) {
        Integer num = (Integer) f125237b.get(enumC12174d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC12174d);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC12174d m93286b(int i13) {
        EnumC12174d enumC12174d = (EnumC12174d) f125236a.get(i13);
        if (enumC12174d != null) {
            return enumC12174d;
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unknown Priority for value "));
    }
}
