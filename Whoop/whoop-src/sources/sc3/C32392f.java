package sc3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import sb3.AbstractC32350a;
import tc3.C33699a;
import uc3.C34774l;

/* JADX INFO: renamed from: sc3.f */
/* JADX INFO: loaded from: classes3.dex */
public class C32392f implements InterfaceC32397k {

    /* JADX INFO: renamed from: a */
    public final List f134136a;

    public C32392f(List formats) {
        AbstractC22676k.m65750j(formats, "formats");
        this.f134136a = formats;
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: a */
    public C33699a mo100966a() {
        List list = this.f134136a;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC32400n) it.next()).mo100966a());
        }
        return arrayList.size() == 1 ? (C33699a) AbstractC25265s.m74142p1(arrayList) : new C33699a();
    }

    @Override // sc3.InterfaceC32397k
    /* JADX INFO: renamed from: b */
    public C34774l mo100967b() {
        List list = this.f134136a;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC32400n) it.next()).mo100967b());
        }
        return AbstractC32350a.m100696c(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32392f) {
            return AbstractC22676k.m65745e(this.f134136a, ((C32392f) obj).f134136a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f134136a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("ConcatenatedFormatStructure("), AbstractC25265s.m74110N0(this.f134136a, ", ", null, null, null, 62), ')');
    }
}
