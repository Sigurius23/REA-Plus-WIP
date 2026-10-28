package p510u0;

import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u0.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34342o0 implements InterfaceC34345p0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2464x2 f144267a;

    /* JADX INFO: renamed from: b */
    public C34348q0 f144268b;

    /* JADX INFO: renamed from: c */
    public InterfaceC15237i f144269c;

    public C34342o0(InterfaceC2464x2 interfaceC2464x2) {
        this.f144267a = interfaceC2464x2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m108645a(int i13) {
        InterfaceC2464x2 interfaceC2464x2;
        if (i13 == 6) {
            InterfaceC15237i interfaceC15237i = this.f144269c;
            if (interfaceC15237i != null) {
                ((C15240l) interfaceC15237i).m43345h(1);
                return true;
            }
            AbstractC22676k.m65757q("focusManager");
            throw null;
        }
        if (i13 != 5) {
            if (i13 != 7 || (interfaceC2464x2 = this.f144267a) == null) {
                return false;
            }
            ((C2463x1) interfaceC2464x2).m7442a();
            return true;
        }
        InterfaceC15237i interfaceC15237i2 = this.f144269c;
        if (interfaceC15237i2 != null) {
            ((C15240l) interfaceC15237i2).m43345h(2);
            return true;
        }
        AbstractC22676k.m65757q("focusManager");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final C34348q0 m108646b() {
        C34348q0 c34348q0 = this.f144268b;
        if (c34348q0 != null) {
            return c34348q0;
        }
        AbstractC22676k.m65757q("keyboardActions");
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m108647c(int i13) {
        Function1 function1;
        if (i13 == 7) {
            function1 = m108646b().f144288a;
        } else if (i13 == 2) {
            function1 = m108646b().f144289b;
        } else if (i13 == 6) {
            function1 = m108646b().f144290c;
        } else if (i13 == 5) {
            function1 = m108646b().f144291d;
        } else if (i13 == 3) {
            function1 = m108646b().f144292e;
        } else if (i13 == 4) {
            function1 = m108646b().f144293f;
        } else {
            if (i13 != 1 && i13 != 0) {
                throw new IllegalStateException("invalid ImeAction");
            }
            function1 = null;
        }
        if (function1 == null) {
            return m108645a(i13);
        }
        function1.invoke(this);
        return true;
    }
}
