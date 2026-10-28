package xe3;

import df3.InterfaceC12001a;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: renamed from: xe3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C38254q implements InterfaceC12001a {

    /* JADX INFO: renamed from: a */
    public final char f164021a;

    /* JADX INFO: renamed from: b */
    public int f164022b = 0;

    /* JADX INFO: renamed from: c */
    public final LinkedList f164023c = new LinkedList();

    public C38254q(char c3) {
        this.f164021a = c3;
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: a */
    public final int mo33077a(C38241d c38241d, C38241d c38241d2) {
        int size = c38241d.f163952a.size();
        LinkedList<InterfaceC12001a> linkedList = this.f164023c;
        for (InterfaceC12001a interfaceC12001a : linkedList) {
            if (interfaceC12001a.mo33079c() <= size) {
                return interfaceC12001a.mo33077a(c38241d, c38241d2);
            }
        }
        interfaceC12001a = (InterfaceC12001a) linkedList.getFirst();
        return interfaceC12001a.mo33077a(c38241d, c38241d2);
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: b */
    public final char mo33078b() {
        return this.f164021a;
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: c */
    public final int mo33079c() {
        return this.f164022b;
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: d */
    public final char mo33080d() {
        return this.f164021a;
    }

    /* JADX INFO: renamed from: e */
    public final void m122592e(InterfaceC12001a interfaceC12001a) {
        int iMo33079c = interfaceC12001a.mo33079c();
        LinkedList linkedList = this.f164023c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            InterfaceC12001a interfaceC12001a2 = (InterfaceC12001a) listIterator.next();
            int iMo33079c2 = interfaceC12001a2.mo33079c();
            if (iMo33079c > iMo33079c2) {
                listIterator.previous();
                listIterator.add(interfaceC12001a);
                return;
            } else if (iMo33079c == iMo33079c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f164021a + "' and minimum length " + iMo33079c + "; conflicting processors: " + interfaceC12001a2 + ", " + interfaceC12001a);
            }
        }
        linkedList.add(interfaceC12001a);
        this.f164022b = iMo33079c;
    }
}
