package lb3;

import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import rb3.AbstractC31193a;
import rb3.AbstractC31196d;
import rb3.C31195c;
import rb3.C31203k;
import rb3.C31209q;

/* JADX INFO: renamed from: lb3.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23784k0 extends AbstractC31196d {

    /* JADX INFO: renamed from: x */
    public static final C37199o f94165x = new C37199o(26, false);

    /* JADX INFO: renamed from: y */
    public static final C23784k0 f94166y = new C23784k0(C25271y.f99162w);

    public C23784k0(List list) {
        this.f128521w = C31203k.f128540w;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23774g c23774g = (C23774g) it.next();
            c23774g.getClass();
            InterfaceC21461d tClass = C23774g.m69864b();
            AbstractC22676k.m65750j(tClass, "tClass");
            String qualifiedName = tClass.getQualifiedName();
            AbstractC22676k.m65747g(qualifiedName);
            int iM119206I = f94165x.m119206I(qualifiedName);
            int iMo96145a = this.f128521w.mo96145a();
            if (iMo96145a != 0) {
                if (iMo96145a == 1) {
                    AbstractC31193a abstractC31193a = this.f128521w;
                    try {
                        AbstractC22676k.m65748h(abstractC31193a, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                        C31209q c31209q = (C31209q) abstractC31193a;
                        if (c31209q.m96153d() == iM119206I) {
                            this.f128521w = new C31209q(c23774g, iM119206I);
                        } else {
                            C31195c c31195c = new C31195c();
                            c31195c.mo96146c(c31209q.m96153d(), c31209q.m96154e());
                            this.f128521w = c31195c;
                        }
                    } catch (ClassCastException e5) {
                        throw new IllegalStateException(AbstractC31196d.m96147a(abstractC31193a, 1, "OneElementArrayMap"), e5);
                    }
                }
                this.f128521w.mo96146c(iM119206I, c23774g);
            } else {
                AbstractC31193a abstractC31193a2 = this.f128521w;
                if (!(abstractC31193a2 instanceof C31203k)) {
                    throw new IllegalStateException(AbstractC31196d.m96147a(abstractC31193a2, 0, "EmptyArrayMap"));
                }
                this.f128521w = new C31209q(c23774g, iM119206I);
            }
        }
    }
}
