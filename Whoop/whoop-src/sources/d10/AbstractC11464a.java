package d10;

import java.util.LinkedHashMap;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d10.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11464a {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f36802a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public static C11465b m30761a(String key) {
        AbstractC22676k.m65750j(key, "key");
        LinkedHashMap linkedHashMap = f36802a;
        C11465b c11465b = (C11465b) linkedHashMap.get(key);
        return c11465b == null ? (C11465b) AbstractC25265s.m74098G0(linkedHashMap.values()) : c11465b;
    }
}
