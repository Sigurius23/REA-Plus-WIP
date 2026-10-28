package p303lg;

import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import yb3.C39412p;

/* JADX INFO: renamed from: lg.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24027f {

    /* JADX INFO: renamed from: a */
    public static final C39412p f94897a = new C39412p("#([0-9]+)");

    /* JADX INFO: renamed from: b */
    public static final C39412p f94898b = new C39412p("#x([0-9a-fA-F]+)");

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f94899c;

    static {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("lt", '<'), new C23465k("gt", '>'), new C23465k("amp", '&'), new C23465k("apos", '\''), new C23465k("quot", '\"'));
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM73990Y.size()));
        for (Map.Entry entry : mapM73990Y.entrySet()) {
            linkedHashMap.put(entry.getKey(), new char[]{((Character) entry.getValue()).charValue()});
        }
        f94899c = linkedHashMap;
    }
}
