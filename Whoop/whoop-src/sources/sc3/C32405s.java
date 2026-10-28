package sc3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import m83.AbstractC25265s;
import m83.C25271y;
import n83.C26459b;
import n83.C26460c;
import qc3.C30256l0;
import r12.C30856a;
import sb3.AbstractC32350a;
import tc3.C33699a;
import uc3.C34774l;
import uc3.C34777o;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sc3.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C32405s implements InterfaceC32400n {

    /* JADX INFO: renamed from: a */
    public final C32389c f134150a;

    /* JADX INFO: renamed from: b */
    public final Set f134151b;

    public C32405s(C32389c c32389c) {
        this.f134150a = c32389c;
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        AbstractC32398l.m100970c(c26460cM119000x, c32389c);
        C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c26460cM118988k.listIterator(0);
        while (true) {
            C26459b c26459b = (C26459b) listIterator;
            if (!c26459b.hasNext()) {
                break;
            }
            C30256l0 c30256l0Mo100965d = ((InterfaceC32396j) c26459b.next()).mo92509c().mo100965d();
            if (c30256l0Mo100965d != null) {
                arrayList.add(c30256l0Mo100965d);
            }
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        this.f134151b = setM74103I1;
        if (setM74103I1.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: a */
    public final C33699a mo100966a() {
        this.f134150a.f134131a.mo92507a();
        return new C33699a();
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: b */
    public final C34774l mo100967b() {
        return AbstractC32350a.m100696c(AbstractC37056f.m118959K(new C34774l(AbstractC37056f.m118958J(new C34777o(new C30856a(this, 21), "sign for " + this.f134151b)), C25271y.f99162w), this.f134150a.f134131a.mo92508b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32405s) {
            return this.f134150a.equals(((C32405s) obj).f134150a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f134150a.f134131a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.f134150a + ')';
    }
}
