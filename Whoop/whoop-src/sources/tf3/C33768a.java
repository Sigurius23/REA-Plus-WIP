package tf3;

import java.util.HashMap;
import java.util.HashSet;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import rf3.AbstractC31363b;

/* JADX INFO: renamed from: tf3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C33768a {

    /* JADX INFO: renamed from: a */
    public final HashSet f141343a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final HashMap f141344b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashSet f141345c = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashSet m106773a() {
        return this.f141343a;
    }

    /* JADX INFO: renamed from: b */
    public final void m106774b(String mapping, AbstractC31363b factory, boolean z4) {
        AbstractC22676k.m65750j(mapping, "mapping");
        AbstractC22676k.m65750j(factory, "factory");
        HashMap map = this.f141344b;
        if (z4 || !map.containsKey(mapping)) {
            map.put(mapping, factory);
        } else {
            AbstractC21598x.m60680g0(factory, mapping);
            throw null;
        }
    }
}
