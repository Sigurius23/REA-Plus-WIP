package p707gt1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dt1.C12363a;
import fa0.C14294a;
import fc0.C14361e;
import ft1.InterfaceC14768a;
import go1.C16016a;
import j11.AbstractC21211n;
import l83.C23454a0;
import p133f1.C13989w1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rs1.AbstractC31794f;

/* JADX INFO: renamed from: gt1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ldt1/a;", "state", "Lkotlin/Function1;", "Lft1/a;", "Ll83/a0;", "onViewEvent", "e", "(Ldt1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16189c {
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m45757e(C12363a c12363a, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Function1 function5;
        int i16;
        boolean z13;
        Object objM87133R;
        boolean zM87157i;
        Object objM87133R2;
        Object objM87133R3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1570231969);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(c12363a) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C16016a(5);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                if (c12363a != null) {
                    c28655q2.m87150e0(2003363297);
                    TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC31794f.f131683t);
                    TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC31794f.f131681s);
                    TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC31794f.f131685u);
                    TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC31794f.f131649c);
                    i16 = i15 & 112;
                    if (i16 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C14294a(function4, 22);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    zM87157i = c28655q2.m87157i(c12363a) | (i16 == 32);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new C13989w1(15, function4, c12363a);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    int i18 = TextResource.C8688b.f25889c;
                    function5 = function4;
                    AbstractC21211n.m59497o(null, c8688bM21277k, c8688bM21277k2, c8688bM21277k3, false, null, null, null, null, c8688bM21277k4, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q2, (i18 << 3) | (i18 << 6) | (i18 << 9) | (i18 << 27), 0, 0, 247463409);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q2;
                    function5 = function4;
                    c28655q.m87150e0(2003893955);
                    c28655q.m87173q(false);
                }
                function3 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(c12363a, i13, function3, i14, 7);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C16016a(5);
                    c28655q2.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            if (c12363a != null) {
                c28655q2.m87150e0(2003363297);
                TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC31794f.f131683t);
                TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC31794f.f131681s);
                TextResource.C8688b c8688bM21277k7 = AbstractC8693b.m21277k(AbstractC31794f.f131685u);
                TextResource.C8688b c8688bM21277k8 = AbstractC8693b.m21277k(AbstractC31794f.f131649c);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C14294a(function4, 22);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C14294a(function4, 22);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                zM87157i = c28655q2.m87157i(c12363a) | (i16 == 32);
                objM87133R2 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R2 = new C13989w1(15, function4, c12363a);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C13989w1(15, function4, c12363a);
                    c28655q2.m87172p0(objM87133R2);
                }
                int i19 = TextResource.C8688b.f25889c;
                function5 = function4;
                AbstractC21211n.m59497o(null, c8688bM21277k5, c8688bM21277k6, c8688bM21277k7, false, null, null, null, null, c8688bM21277k8, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a2, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q2, (i19 << 3) | (i19 << 6) | (i19 << 9) | (i19 << 27), 0, 0, 247463409);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                function5 = function4;
                c28655q.m87150e0(2003893955);
                c28655q.m87173q(false);
            }
            function3 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(c12363a, i13, function3, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m45758f(InterfaceC14768a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m45759g(Function1 function1) {
        function1.invoke(InterfaceC14768a.c.f54676a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m45760h(Function1 function1, C12363a c12363a) {
        function1.invoke(new InterfaceC14768a.b(c12363a.getId(), c12363a.getTimestamp()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m45761i(C12363a c12363a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m45757e(c12363a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
