package sc3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n83.C26459b;
import n83.C26460c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29718h0;
import rq0.C31703x;
import sb3.AbstractC32350a;
import tc3.C33699a;
import uc3.C34774l;
import uc3.C34778p;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sc3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C32402p implements InterfaceC32400n {

    /* JADX INFO: renamed from: a */
    public final String f134145a;

    /* JADX INFO: renamed from: b */
    public final C32392f f134146b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f134147c;

    public C32402p(String str, C32392f c32392f) {
        this.f134145a = str;
        this.f134146b = c32392f;
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        AbstractC32398l.m100970c(c26460cM119000x, c32392f);
        C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c26460cM118988k, 10));
        ListIterator listIterator = c26460cM118988k.listIterator(0);
        while (true) {
            C26459b c26459b = (C26459b) listIterator;
            if (!c26459b.hasNext()) {
                break;
            } else {
                arrayList.add(((InterfaceC32396j) c26459b.next()).mo92509c());
            }
        }
        List<AbstractC32387a> listM74159y0 = AbstractC25265s.m74159y0(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74159y0, 10));
        for (AbstractC32387a field : listM74159y0) {
            AbstractC22676k.m65750j(field, "field");
            Object objMo100963b = field.mo100963b();
            if (objMo100963b == null) {
                throw new IllegalArgumentException(("The field '" + field.mo100964c() + "' does not define a default value").toString());
            }
            arrayList2.add(new C32401o(field.mo100962a(), objMo100963b));
        }
        this.f134147c = arrayList2;
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: a */
    public final C33699a mo100966a() {
        C33699a c33699aMo100966a = this.f134146b.mo100966a();
        ArrayList<C32401o> arrayList = this.f134147c;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (C32401o c32401o : arrayList) {
            arrayList2.add(new C32391e(c32401o.f134144b, new C29718h0(1, c32401o.f134143a, C32404r.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, 10)));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        C32406t c32406t = C32406t.f134152a;
        InterfaceC32403q c32393g = zIsEmpty ? c32406t : arrayList2.size() == 1 ? (InterfaceC32403q) AbstractC25265s.m74142p1(arrayList2) : new C32393g(arrayList2);
        if (c32393g instanceof C32406t) {
            return new C33699a();
        }
        AbstractC37056f.m118959K(new C23465k(new C29718h0(1, c32393g, InterfaceC32403q.class, "test", "test(Ljava/lang/Object;)Z", 0, 11), new C33699a()), new C23465k(new C29718h0(1, c32406t, C32406t.class, "test", "test(Ljava/lang/Object;)Z", 0, 12), c33699aMo100966a));
        return new C33699a();
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: b */
    public final C34774l mo100967b() {
        C34774l c34774lMo100967b = this.f134146b.mo100967b();
        C34774l c34774lMo100967b2 = new C32394h(this.f134145a).mo100967b();
        boolean zIsEmpty = this.f134147c.isEmpty();
        C25271y c25271y = C25271y.f99162w;
        return new C34774l(c25271y, AbstractC37056f.m118959K(c34774lMo100967b, AbstractC32350a.m100696c(AbstractC37056f.m118959K(c34774lMo100967b2, new C34774l(zIsEmpty ? c25271y : AbstractC37056f.m118958J(new C34778p(new C31703x(this, 11))), c25271y)))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C32402p)) {
            return false;
        }
        C32402p c32402p = (C32402p) obj;
        return this.f134145a.equals(c32402p.f134145a) && this.f134146b.equals(c32402p.f134146b);
    }

    public final int hashCode() {
        return this.f134146b.f134136a.hashCode() + (this.f134145a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.f134145a + ", " + this.f134146b + ')';
    }
}
