package p040c0;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p005a3.C0227m1;
import p026b2.C2312r;
import p026b2.C2314t;
import p077d0.C11421z1;
import p077d0.InterfaceC11403t1;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.AbstractC37817c;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3749j extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C39967p f15326E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4352n f15327F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11421z1 f15328w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f15329x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f15330y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3789x f15331z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3749j(C11421z1 c11421z1, Object obj, Function1 function1, C3789x c3789x, C39967p c39967p, InterfaceC4352n interfaceC4352n) {
        super(2);
        this.f15328w = c11421z1;
        this.f15329x = obj;
        this.f15330y = function1;
        this.f15331z = c3789x;
        this.f15326E = c39967p;
        this.f15327F = interfaceC4352n;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            Function1 function1 = this.f15330y;
            C3789x c3789x = this.f15331z;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = (C3756l0) function1.invoke(c3789x);
                c28655q.m87172p0(objM87133R);
            }
            C3756l0 c3756l0 = (C3756l0) objM87133R;
            C11421z1 c11421z1 = this.f15328w;
            InterfaceC11403t1 interfaceC11403t1M30664f = c11421z1.m30664f();
            C28633k1 c28633k1 = c11421z1.f36633d;
            Object objMo11595b = interfaceC11403t1M30664f.mo11595b();
            Object obj3 = this.f15329x;
            boolean zM87155h = c28655q.m87155h(AbstractC22676k.m65745e(objMo11595b, obj3));
            Object objM87133R2 = c28655q.m87133R();
            if (zM87155h || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC22676k.m65745e(c11421z1.m30664f().mo11595b(), obj3) ? AbstractC3736e1.f15289a : ((C3756l0) function1.invoke(c3789x)).f15350b;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC3736e1 abstractC3736e1 = (AbstractC3736e1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C3773r(AbstractC22676k.m65745e(obj3, c28633k1.getValue()));
                c28655q.m87172p0(objM87133R3);
            }
            C3773r c3773r = (C3773r) objM87133R3;
            AbstractC3730c1 abstractC3730c1 = c3756l0.f15349a;
            boolean zM87157i = c28655q.m87157i(c3756l0);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                objM87133R4 = new C3737f(c3756l0, 0);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifierM3498b = AbstractC1131a.m3498b(C2314t.f9131w, (Function3) objM87133R4);
            c3773r.f15401w.setValue(Boolean.valueOf(AbstractC22676k.m65745e(obj3, c28633k1.getValue())));
            Modifier modifierMo3471e = modifierM3498b.mo3471e(c3773r);
            boolean zM87157i2 = c28655q.m87157i(obj3);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i2 || objM87133R5 == c28676v0) {
                objM87133R5 = new C0227m1(obj3, 7);
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function2 = (Function1) objM87133R5;
            boolean zM87153g = c28655q.m87153g(abstractC3736e1);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87153g || objM87133R6 == c28676v0) {
                objM87133R6 = new C2312r(abstractC3736e1, 3);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC1090b.m3346a(this.f15328w, function2, modifierMo3471e, abstractC3730c1, abstractC3736e1, (InterfaceC4351m) objM87133R6, AbstractC37817c.m121344e(-143346359, c28655q, new C3746i(this.f15326E, obj3, c3789x, this.f15327F)), c28655q, 12582912);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
