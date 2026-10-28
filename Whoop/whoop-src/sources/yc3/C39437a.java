package yc3;

import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yc3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C39437a {

    /* JADX INFO: renamed from: a */
    public final String f169678a;

    /* JADX INFO: renamed from: b */
    public List f169679b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f169680c;

    /* JADX INFO: renamed from: d */
    public final HashSet f169681d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f169682e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f169683f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f169684g;

    public C39437a(String serialName) {
        AbstractC22676k.m65750j(serialName, "serialName");
        this.f169678a = serialName;
        this.f169679b = C25271y.f99162w;
        this.f169680c = new ArrayList();
        this.f169681d = new HashSet();
        this.f169682e = new ArrayList();
        this.f169683f = new ArrayList();
        this.f169684g = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m125993a(String elementName, InterfaceC39443g descriptor, boolean z4) {
        AbstractC22676k.m65750j(elementName, "elementName");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (!this.f169681d.add(elementName)) {
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Element with name '", elementName, "' is already registered in ");
            sbM53375p.append(this.f169678a);
            throw new IllegalArgumentException(sbM53375p.toString().toString());
        }
        this.f169680c.add(elementName);
        this.f169682e.add(descriptor);
        this.f169683f.add(C25271y.f99162w);
        this.f169684g.add(Boolean.valueOf(z4));
    }
}
