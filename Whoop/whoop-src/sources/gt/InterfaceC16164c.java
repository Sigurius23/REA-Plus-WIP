package gt;

import java.util.Set;
import st.InterfaceC32956a;

/* JADX INFO: renamed from: gt.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC16164c {
    /* JADX INFO: renamed from: a */
    default Object mo1617a(Class cls) {
        return mo1624h(C16177p.m45715a(cls));
    }

    /* JADX INFO: renamed from: d */
    default Set mo1620d(C16177p c16177p) {
        return (Set) mo1625i(c16177p).get();
    }

    /* JADX INFO: renamed from: e */
    default InterfaceC32956a mo1621e(Class cls) {
        return mo1622f(C16177p.m45715a(cls));
    }

    /* JADX INFO: renamed from: f */
    InterfaceC32956a mo1622f(C16177p c16177p);

    /* JADX INFO: renamed from: h */
    default Object mo1624h(C16177p c16177p) {
        InterfaceC32956a interfaceC32956aMo1622f = mo1622f(c16177p);
        if (interfaceC32956aMo1622f == null) {
            return null;
        }
        return interfaceC32956aMo1622f.get();
    }

    /* JADX INFO: renamed from: i */
    InterfaceC32956a mo1625i(C16177p c16177p);
}
