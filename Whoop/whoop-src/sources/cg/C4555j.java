package cg;

import bd3.C3130k;
import bg.AbstractC3210e;
import bg.C3208c;
import bg.C3217l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg.C33770b;
import vg.InterfaceC35957d;

/* JADX INFO: renamed from: cg.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4555j implements InterfaceC35957d {

    /* JADX INFO: renamed from: w */
    public C3217l f18354w = C3217l.f12583c;

    /* JADX INFO: renamed from: x */
    public AbstractC3210e f18355x = new C3208c("");

    /* JADX INFO: renamed from: y */
    public Integer f18356y = null;

    /* JADX INFO: renamed from: z */
    public final C3130k f18357z = new C3130k(0);

    /* JADX INFO: renamed from: E */
    public final C4552g f18351E = new C4552g();

    /* JADX INFO: renamed from: F */
    public final C37199o f18352F = new C37199o(0);

    /* JADX INFO: renamed from: G */
    public C33770b f18353G = null;

    /* JADX INFO: renamed from: b */
    public final C4560o m14239b() {
        C3217l c3217l = this.f18354w;
        AbstractC3210e abstractC3210e = this.f18355x;
        Integer num = this.f18356y;
        int iIntValue = num != null ? num.intValue() : c3217l.f12587b;
        C3130k c3130k = this.f18357z;
        c3130k.getClass();
        C4569x c4569x = new C4569x(AbstractC25265s.m74093D1((ArrayList) c3130k.f12277c), c3130k.f12276b);
        C4554i c4554iM14233b = this.f18351E.m14233b();
        C37199o c37199o = this.f18352F;
        c37199o.getClass();
        return new C4560o(c3217l, abstractC3210e, iIntValue, c4569x, c4554iM14233b, new C4570y((C33770b) c37199o.f159040w, (C33770b) c37199o.f159041x), this.f18353G);
    }

    @Override // vg.InterfaceC35957d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C4555j mo14238a() {
        C4555j c4555j = new C4555j();
        c4555j.f18354w = this.f18354w;
        c4555j.f18355x = this.f18355x;
        c4555j.f18356y = this.f18356y;
        C3130k c3130k = c4555j.f18357z;
        c3130k.getClass();
        C3130k other = this.f18357z;
        AbstractC22676k.m65750j(other, "other");
        ArrayList arrayList = (ArrayList) c3130k.f12277c;
        arrayList.clear();
        arrayList.addAll((ArrayList) other.f12277c);
        c3130k.f12276b = other.f12276b;
        C4552g c4552g = c4555j.f18351E;
        c4552g.getClass();
        C4552g other2 = this.f18351E;
        AbstractC22676k.m65750j(other2, "other");
        c4552g.clear();
        for (Map.Entry entry : other2.f18343w.entrySet()) {
            c4552g.put(entry.getKey(), (Object) AbstractC25265s.m74097F1((List) entry.getValue()));
        }
        c4552g.f18344x = other2.f18344x;
        C37199o c37199o = c4555j.f18352F;
        c37199o.getClass();
        C37199o other3 = this.f18352F;
        AbstractC22676k.m65750j(other3, "other");
        c37199o.f159040w = (C33770b) other3.f159040w;
        c37199o.f159041x = (C33770b) other3.f159041x;
        c4555j.f18353G = this.f18353G;
        return c4555j;
    }

    /* JADX INFO: renamed from: d */
    public final String m14241d() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f18355x);
        Integer num = this.f18356y;
        if (num != null) {
            int i13 = this.f18354w.f12587b;
            if (num == null || num.intValue() != i13) {
                sb4.append(':');
                sb4.append(this.f18356y);
            }
        }
        return sb4.toString();
    }
}
