package sc3;

import java.util.ArrayList;
import java.util.Iterator;
import m83.C25271y;
import n83.C26460c;
import tc3.C33699a;
import uc3.C34774l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sc3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C32388b implements InterfaceC32400n {

    /* JADX INFO: renamed from: a */
    public final C32392f f134129a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f134130b;

    public C32388b(C32392f c32392f, ArrayList arrayList) {
        this.f134129a = c32392f;
        this.f134130b = arrayList;
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: a */
    public final C33699a mo100966a() {
        return this.f134129a.mo100966a();
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: b */
    public final C34774l mo100967b() {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add(this.f134129a.mo100967b());
        Iterator it = this.f134130b.iterator();
        while (it.hasNext()) {
            c26460cM119000x.add(((InterfaceC32397k) it.next()).mo100967b());
        }
        return new C34774l(C25271y.f99162w, AbstractC37056f.m118988k(c26460cM119000x));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C32388b)) {
            return false;
        }
        C32388b c32388b = (C32388b) obj;
        return this.f134129a.equals(c32388b.f134129a) && this.f134130b.equals(c32388b.f134130b);
    }

    public final int hashCode() {
        return this.f134130b.hashCode() + (this.f134129a.f134136a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.f134130b + ')';
    }
}
