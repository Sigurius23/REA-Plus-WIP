package gb;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p028b4.C2696g;
import p043c4.C3974q;
import p098dt.AbstractC12350b;
import p114eb.C12982q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p634y1.C39031d;
import p634y1.InterfaceC39030c;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gb.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C15651l extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C15655p f58741E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C12982q f58742w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15656q f58743x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC39030c f58744y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C39967p f58745z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15651l(C12982q c12982q, C15656q c15656q, C39031d c39031d, C39967p c39967p, C15655p c15655p) {
        super(2);
        this.f58742w = c12982q;
        this.f58743x = c15656q;
        this.f58744y = c39031d;
        this.f58745z = c39967p;
        this.f58741E = c15655p;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        C12982q c12982q;
        C15656q c15656q;
        boolean zM87153g;
        Object objM87133R;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c28655q = (C28655q) composer;
                c12982q = this.f58742w;
                boolean zM87157i = c28655q.m87157i(c12982q);
                c15656q = this.f58743x;
                zM87153g = zM87157i | c28655q.m87153g(c15656q);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C2696g(this.f58745z, c12982q, c15656q, 4);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87251e(c12982q, (Function1) objM87133R, c28655q);
                AbstractC12350b.m34580b(c12982q, this.f58744y, AbstractC37817c.m121344e(-497631156, c28655q, new C3974q(1, this.f58741E, c12982q)), c28655q, 384);
            }
        } else {
            c28655q = (C28655q) composer;
            c12982q = this.f58742w;
            boolean zM87157i2 = c28655q.m87157i(c12982q);
            c15656q = this.f58743x;
            zM87153g = zM87157i2 | c28655q.m87153g(c15656q);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = new C2696g(this.f58745z, c12982q, c15656q, 4);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C2696g(this.f58745z, c12982q, c15656q, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87251e(c12982q, (Function1) objM87133R, c28655q);
            AbstractC12350b.m34580b(c12982q, this.f58744y, AbstractC37817c.m121344e(-497631156, c28655q, new C3974q(1, this.f58741E, c12982q)), c28655q, 384);
        }
        return C23454a0.f92919a;
    }
}
