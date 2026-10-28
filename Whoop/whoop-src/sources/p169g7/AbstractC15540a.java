package p169g7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;

/* JADX INFO: renamed from: g7.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15540a {

    /* JADX INFO: renamed from: a */
    public static final Object f58269a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f58270b;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("UNKNOWN", 0), new C23465k("CHEST_STRAP", 7), new C23465k("FITNESS_BAND", 6), new C23465k("HEAD_MOUNTED", 5), new C23465k("PHONE", 2), new C23465k("RING", 4), new C23465k("SCALE", 3), new C23465k("SMART_DISPLAY", 8), new C23465k("WATCH", 1));
        f58269a = mapM73990Y;
        Set<Map.Entry> setEntrySet = mapM73990Y.entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
        f58270b = linkedHashMap;
    }
}
