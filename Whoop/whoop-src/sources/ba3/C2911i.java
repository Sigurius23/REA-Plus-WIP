package ba3;

import ca3.C4384k;
import ca3.InterfaceC4385l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30120b1;
import sa3.C32334h;
import sa3.C32336j;
import sa3.InterfaceC32332f;

/* JADX INFO: renamed from: ba3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C2911i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC32332f f11694a;

    /* JADX INFO: renamed from: b */
    public final C32334h f11695b;

    /* JADX INFO: renamed from: c */
    public final C32336j f11696c;

    /* JADX INFO: renamed from: d */
    public final boolean f11697d;

    /* JADX INFO: renamed from: e */
    public final C2911i f11698e;

    /* JADX INFO: renamed from: f */
    public final List f11699f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f11700g;

    /* JADX INFO: renamed from: h */
    public final List f11701h;

    public C2911i(InterfaceC32332f strings, C32334h types, C32336j versionRequirements, boolean z4, C2911i c2911i, List contextExtensions) {
        AbstractC22676k.m65750j(strings, "strings");
        AbstractC22676k.m65750j(types, "types");
        AbstractC22676k.m65750j(versionRequirements, "versionRequirements");
        AbstractC22676k.m65750j(contextExtensions, "contextExtensions");
        this.f11694a = strings;
        this.f11695b = types;
        this.f11696c = versionRequirements;
        this.f11697d = z4;
        this.f11698e = c2911i;
        this.f11699f = contextExtensions;
        this.f11700g = new LinkedHashMap();
        InterfaceC4385l.f17711a.getClass();
        this.f11701h = C4384k.m13764a();
    }

    /* JADX INFO: renamed from: a */
    public final Integer m8499a(int i13) {
        Integer num = (Integer) this.f11700g.get(Integer.valueOf(i13));
        if (num != null) {
            return num;
        }
        C2911i c2911i = this.f11698e;
        if (c2911i != null) {
            return c2911i.m8499a(i13);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C2911i m8500b(List typeParameters) {
        AbstractC22676k.m65750j(typeParameters, "typeParameters");
        C2911i c2911i = new C2911i(this.f11694a, this.f11695b, this.f11696c, this.f11697d, this, this.f11699f);
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            C30120b1 c30120b1 = (C30120b1) it.next();
            c2911i.f11700g.put(Integer.valueOf(c30120b1.f123010E), Integer.valueOf(c30120b1.f123021z));
        }
        return c2911i;
    }

    public /* synthetic */ C2911i(InterfaceC32332f interfaceC32332f, C32334h c32334h, C32336j c32336j, boolean z4, List list, int i13) {
        this(interfaceC32332f, c32334h, c32336j, z4, (C2911i) null, (i13 & 32) != 0 ? C25271y.f99162w : list);
    }
}
