package wb3;

import j93.C21462d0;
import j93.EnumC21464e0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21463e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25267u;
import m83.C25272z;
import ob3.InterfaceC27798h;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import sc3.AbstractC32398l;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: wb3.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C37061k {

    /* JADX INFO: renamed from: b */
    public static final C37061k f158560b = new C37061k(C25272z.f99163w);

    /* JADX INFO: renamed from: a */
    public final Map f158561a;

    public C37061k(Map map) {
        this.f158561a = map;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX INFO: renamed from: a */
    public final C21462d0 m119005a(InterfaceC21456a0 type) {
        AbstractC37051a abstractC37051aMo118949j;
        AbstractC37051a abstractC37051aMo118946g;
        AbstractC22676k.m65750j(type, "type");
        boolean z4 = type instanceof AbstractC37051a;
        AbstractC37051a abstractC37051a = z4 ? (AbstractC37051a) type : null;
        AbstractC37051a abstractC37051aMo118946g2 = abstractC37051a != null ? abstractC37051a.mo118946g() : null;
        AbstractC37051a abstractC37051a2 = z4 ? (AbstractC37051a) type : null;
        AbstractC37051a abstractC37051aMo118949j2 = abstractC37051a2 != null ? abstractC37051a2.mo118949j() : null;
        if (abstractC37051aMo118946g2 != null && abstractC37051aMo118949j2 != null) {
            C21462d0 c21462d0M119005a = m119005a(abstractC37051aMo118946g2);
            InterfaceC21456a0 interfaceC21456a0 = c21462d0M119005a.f82425b;
            AbstractC37051a abstractC37051a3 = interfaceC21456a0 instanceof AbstractC37051a ? (AbstractC37051a) interfaceC21456a0 : null;
            if (abstractC37051a3 != null && (abstractC37051aMo118946g = abstractC37051a3.mo118946g()) != null) {
                c21462d0M119005a = new C21462d0(c21462d0M119005a.f82424a, abstractC37051aMo118946g);
            }
            C21462d0 c21462d0M119005a2 = m119005a(abstractC37051aMo118949j2);
            InterfaceC21456a0 interfaceC21456a1 = c21462d0M119005a2.f82425b;
            AbstractC37051a abstractC37051a4 = interfaceC21456a1 instanceof AbstractC37051a ? (AbstractC37051a) interfaceC21456a1 : null;
            if (abstractC37051a4 != null && (abstractC37051aMo118949j = abstractC37051a4.mo118949j()) != null) {
                c21462d0M119005a2 = new C21462d0(c21462d0M119005a2.f82424a, abstractC37051aMo118949j);
            }
            EnumC21464e0 enumC21464e0 = c21462d0M119005a.f82424a;
            InterfaceC21456a0 interfaceC21456a2 = c21462d0M119005a.f82425b;
            AbstractC22676k.m65747g(interfaceC21456a2);
            InterfaceC21456a0 interfaceC21456a3 = c21462d0M119005a2.f82425b;
            AbstractC22676k.m65747g(interfaceC21456a3);
            return new C21462d0(enumC21464e0, AbstractC32398l.m100973f(interfaceC21456a2, interfaceC21456a3));
        }
        InterfaceC21463e classifier = type.getClassifier();
        if (classifier == null) {
            C21462d0 c21462d0 = C21462d0.f82423c;
            return AbstractC37978j.m121626I(type);
        }
        C21462d0 c21462d1 = (C21462d0) this.f158561a.get(classifier);
        if (c21462d1 == null) {
            C21462d0 c21462d2 = C21462d0.f82423c;
            if (!type.getArguments().isEmpty()) {
                List arguments = type.getArguments();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arguments, 10));
                Iterator it = arguments.iterator();
                while (it.hasNext()) {
                    InterfaceC21456a0 interfaceC21456a4 = ((C21462d0) it.next()).f82425b;
                    arrayList.add(interfaceC21456a4 != null ? m119005a(interfaceC21456a4) : C21462d0.f82423c);
                }
                boolean zIsMarkedNullable = type.isMarkedNullable();
                List annotations = type.getAnnotations();
                AbstractC37051a abstractC37051a5 = z4 ? (AbstractC37051a) type : null;
                type = AbstractC21598x.m60641A(classifier, arrayList, zIsMarkedNullable, annotations, abstractC37051a5 != null ? abstractC37051a5.mo118941b() : null);
            }
            return AbstractC37978j.m121626I(type);
        }
        EnumC21464e0 enumC21464e1 = c21462d1.f82424a;
        InterfaceC21456a0 interfaceC21456a5 = c21462d1.f82425b;
        if (interfaceC21456a5 == null) {
            return c21462d1;
        }
        InterfaceC27798h interfaceC27798h = (InterfaceC27798h) interfaceC21456a5;
        boolean z13 = false;
        AbstractC37051a abstractC37051aMo118948i = ((AbstractC37051a) interfaceC27798h).mo118948i(type.isMarkedNullable() || interfaceC21456a5.isMarkedNullable());
        AbstractC37051a abstractC37051a6 = z4 ? (AbstractC37051a) type : null;
        if (abstractC37051a6 == null || !abstractC37051a6.mo118942c()) {
            AbstractC37051a abstractC37051a7 = interfaceC27798h instanceof AbstractC37051a ? (AbstractC37051a) interfaceC27798h : null;
            if (abstractC37051a7 != null && abstractC37051a7.mo118942c() && !type.isMarkedNullable()) {
                z13 = true;
            }
        } else {
            z13 = true;
        }
        return new C21462d0(enumC21464e1, abstractC37051aMo118948i.mo118947h(z13));
    }
}
