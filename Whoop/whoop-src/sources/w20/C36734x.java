package w20;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13078q1;
import ec3.C13096w1;
import p077d0.C11387o2;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s40.C32139c0;
import sz.C33151q;
import x30.C37884e0;
import y00.EnumC38853i;

/* JADX INFO: renamed from: w20.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C36734x extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w */
    public final C13045h2 f157233w;

    /* JADX INFO: renamed from: x */
    public final C13096w1 f157234x;

    /* JADX INFO: renamed from: y */
    public final C13078q1 f157235y;

    public C36734x(C36708a c36708a) {
        EnumC38853i enumC38853i = c36708a.f157186b;
        new C37884e0((C11387o2) null, AbstractC3269g.m9493Z(enumC38853i), 5);
        this.f157233w = AbstractC13091v.m36593c(new C36735y(c36708a.f157185a, c36708a.f157187c, new C36736z("", enumC38853i), true));
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.f157234x = c13096w1M36592b;
        this.f157235y = AbstractC13091v.m36597g(c13096w1M36592b);
    }

    /* JADX INFO: renamed from: g */
    public final void m117841g(InterfaceC36733w action) {
        Object value;
        C36735y c36735y;
        C36736z c36736z;
        AbstractC22676k.m65750j(action, "action");
        boolean z4 = action instanceof C36731u;
        InterfaceC30057d interfaceC30057d = null;
        C13045h2 c13045h2 = this.f157233w;
        if (z4) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C32139c0(this, ((C36735y) c13045h2.getValue()).f157238c.f157240a, interfaceC30057d, 20), 3);
            return;
        }
        if (action instanceof C36730t) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C33151q(this, interfaceC30057d, 10), 3);
            return;
        }
        if (!(action instanceof C36732v)) {
            throw new NoWhenBranchMatchedException();
        }
        String cvc = ((C36732v) action).f157232a;
        do {
            value = c13045h2.getValue();
            c36735y = (C36735y) value;
            c36736z = c36735y.f157238c;
            AbstractC22676k.m65750j(cvc, "cvc");
            int length = cvc.length();
            EnumC38853i enumC38853i = c36736z.f157241b;
            if (length <= enumC38853i.m124353b()) {
                c36736z = new C36736z(cvc, enumC38853i);
            }
        } while (!c13045h2.m36569i(value, C36735y.m117842a(c36735y, c36736z, false, 11)));
    }
}
