package jb3;

import androidx.lifecycle.C1591h2;
import e93.AbstractC12889b;
import j93.InterfaceC21493z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kb3.C22336e;
import kb3.C22340i;
import kb3.C22342k;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import pf.AbstractC29125c;
import qa3.C30122c0;
import qa3.C30146k0;
import qa3.C30175y0;
import r80.AbstractC31061c;
import va3.C35850h;
import wa3.AbstractC36984b;
import wa3.C36994g;
import wa3.InterfaceC37019v;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: jb3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C21556p {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ InterfaceC21493z[] f82661j;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f82662a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f82663b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f82664c;

    /* JADX INFO: renamed from: d */
    public final C22336e f82665d;

    /* JADX INFO: renamed from: e */
    public final C22336e f82666e;

    /* JADX INFO: renamed from: f */
    public final C1591h2 f82667f;

    /* JADX INFO: renamed from: g */
    public final C22340i f82668g;

    /* JADX INFO: renamed from: h */
    public final C22340i f82669h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC21557q f82670i;

    static {
        C22693x c22693x = new C22693x(C21556p.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f82661j = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(C21556p.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0, c22673i0)};
    }

    public C21556p(AbstractC21557q abstractC21557q, List functionList, List propertyList, List typeAliasList) {
        AbstractC22676k.m65750j(functionList, "functionList");
        AbstractC22676k.m65750j(propertyList, "propertyList");
        AbstractC22676k.m65750j(typeAliasList, "typeAliasList");
        this.f82670i = abstractC21557q;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : functionList) {
            C35850h c35850hM36240F = AbstractC12889b.m36240F(abstractC21557q.f82672b.f65761b, ((C30122c0) ((InterfaceC37019v) obj)).f123037F);
            Object arrayList = linkedHashMap.get(c35850hM36240F);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c35850hM36240F, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f82662a = m60583c(linkedHashMap);
        AbstractC21557q abstractC21557q2 = this.f82670i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : propertyList) {
            C35850h c35850hM36240F2 = AbstractC12889b.m36240F(abstractC21557q2.f82672b.f65761b, ((C30146k0) ((InterfaceC37019v) obj2)).f123305F);
            Object arrayList2 = linkedHashMap2.get(c35850hM36240F2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(c35850hM36240F2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f82663b = m60583c(linkedHashMap2);
        this.f82670i.f82672b.f65760a.f65737c.getClass();
        AbstractC21557q abstractC21557q3 = this.f82670i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : typeAliasList) {
            C35850h c35850hM36240F3 = AbstractC12889b.m36240F(abstractC21557q3.f82672b.f65761b, ((C30175y0) ((InterfaceC37019v) obj3)).f123525E);
            Object arrayList3 = linkedHashMap3.get(c35850hM36240F3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(c35850hM36240F3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f82664c = m60583c(linkedHashMap3);
        this.f82665d = this.f82670i.f82672b.f65760a.f65735a.m64223b(new C21553m(this, 0));
        this.f82666e = this.f82670i.f82672b.f65760a.f65735a.m64223b(new C21553m(this, 1));
        this.f82667f = this.f82670i.f82672b.f65760a.f65735a.m64224c(new C21553m(this, 2));
        AbstractC21557q abstractC21557q4 = this.f82670i;
        C22342k c22342k = abstractC21557q4.f82672b.f65760a.f65735a;
        C21554n c21554n = new C21554n(this, abstractC21557q4, 0);
        c22342k.getClass();
        this.f82668g = new C22340i(c22342k, c21554n);
        AbstractC21557q abstractC21557q5 = this.f82670i;
        C22342k c22342k2 = abstractC21557q5.f82672b.f65760a.f65735a;
        C21554n c21554n2 = new C21554n(this, abstractC21557q5, 1);
        c22342k2.getClass();
        this.f82669h = new C22340i(c22342k2, c21554n2);
    }

    /* JADX INFO: renamed from: c */
    public static LinkedHashMap m60583c(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractC36984b> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (AbstractC36984b abstractC36984b : iterable) {
                int iMo92262d = abstractC36984b.mo92262d();
                int iM118781f = C36994g.m118781f(iMo92262d) + iMo92262d;
                if (iM118781f > 4096) {
                    iM118781f = 4096;
                }
                C36994g c36994gM118784j = C36994g.m118784j(byteArrayOutputStream, iM118781f);
                c36994gM118784j.m118797v(iMo92262d);
                abstractC36984b.mo92264f(c36994gM118784j);
                c36994gM118784j.m118785i();
                arrayList.add(C23454a0.f92919a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: a */
    public final Collection m60584a(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return !((Set) AbstractC29125c.m88494C(this.f82668g, f82661j[0])).contains(name) ? C25271y.f99162w : (Collection) this.f82665d.invoke(name);
    }

    /* JADX INFO: renamed from: b */
    public final Collection m60585b(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        return !((Set) AbstractC29125c.m88494C(this.f82669h, f82661j[1])).contains(name) ? C25271y.f99162w : (Collection) this.f82666e.invoke(name);
    }
}
