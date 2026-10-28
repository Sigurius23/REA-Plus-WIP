package p043c4;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.ContentBlock;
import com.amplitude.android.engagement.types.ImageBlock;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.VideoBlock;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p097ds.AbstractC12314q;
import p292l1.AbstractC23149o4;
import p294l3.C23285v0;
import p328mj.C25607n;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p525uj.AbstractC35033k;
import p525uj.C35031i;
import p525uj.C35035m;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22680m;
import se.AbstractC32411b;
import se.AbstractC32417h;
import sj.C32561l;
import tj.AbstractC33863b;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: c4.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C3963i extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16151w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f16152x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f16153y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f16154z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3963i(ContentBlock contentBlock, Modifier modifier, int i13, int i14) {
        super(2);
        this.f16151w = i14;
        this.f16154z = contentBlock;
        this.f16153y = modifier;
        this.f16152x = i13;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16151w) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC32411b.m101108t((Modifier) this.f16153y, (InterfaceC4351m) this.f16154z, (Composer) obj, AbstractC28683x.m87244L(this.f16152x | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                Nudge nudge = (Nudge) this.f16153y;
                C25607n c25607n = (C25607n) this.f16154z;
                int iM87244L = AbstractC28683x.m87244L(9);
                AbstractC12314q.m34327g(nudge, this.f16152x, c25607n, (Composer) obj, iM87244L);
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC37978j.m121651l((String) this.f16153y, (String) this.f16154z, (Composer) obj, AbstractC28683x.m87244L(this.f16152x | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                AbstractC32411b.m101096h((ImageBlock) this.f16154z, (Modifier) this.f16153y, (Composer) obj, AbstractC28683x.m87244L(this.f16152x | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                AbstractC32417h.m101209r((VideoBlock) this.f16154z, (Modifier) this.f16153y, (Composer) obj, AbstractC28683x.m87244L(this.f16152x | 1));
                break;
            case 5:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C35031i c35031i = (C35031i) this.f16153y;
                if ((iIntValue & 11) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        C28655q c28655q2 = (C28655q) composer;
                        c28655q2.m87152f0(-412521741);
                        C35035m c35035m = (C35035m) c28655q2.m87161k(AbstractC35033k.f148295a);
                        c28655q2.m87173q(false);
                        C23285v0 c23285v0M110711a = c35035m.m110711a(Integer.valueOf(c35031i.f148286h), composer, 0);
                        AbstractC23149o4.m67127b((String) this.f16154z, null, c35031i.f148285g, 0L, null, 0L, null, 0L, 0, false, 1, 0, c23285v0M110711a, composer, this.f16152x & 14, 3072, 57338);
                    }
                } else {
                    C28655q c28655q3 = (C28655q) composer;
                    c28655q3.m87152f0(-412521741);
                    C35035m c35035m2 = (C35035m) c28655q3.m87161k(AbstractC35033k.f148295a);
                    c28655q3.m87173q(false);
                    C23285v0 c23285v0M110711a2 = c35035m2.m110711a(Integer.valueOf(c35031i.f148286h), composer, 0);
                    AbstractC23149o4.m67127b((String) this.f16154z, null, c35031i.f148285g, 0L, null, 0L, null, 0L, 0, false, 1, 0, c23285v0M110711a2, composer, this.f16152x & 14, 3072, 57338);
                }
                break;
            case 6:
                ((Number) obj2).intValue();
                ((C32561l) this.f16154z).m101582b((Modifier) this.f16153y, AbstractC28683x.m87244L(65), (Composer) obj, this.f16152x);
                break;
            default:
                ((Number) obj2).intValue();
                Nudge nudge2 = (Nudge) this.f16153y;
                C37816b c37816b = (C37816b) this.f16154z;
                int iM87244L2 = AbstractC28683x.m87244L(393);
                AbstractC33863b.m107084a(nudge2, this.f16152x, c37816b, (Composer) obj, iM87244L2);
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3963i(Nudge nudge, int i13, InterfaceC23459e interfaceC23459e, int i14, int i15) {
        super(2);
        this.f16151w = i15;
        this.f16153y = nudge;
        this.f16152x = i13;
        this.f16154z = interfaceC23459e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3963i(Object obj, Object obj2, int i13, int i14) {
        super(2);
        this.f16151w = i14;
        this.f16153y = obj;
        this.f16154z = obj2;
        this.f16152x = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3963i(C32561l c32561l, Modifier modifier, int i13, int i14) {
        super(2);
        this.f16151w = 6;
        this.f16154z = c32561l;
        this.f16153y = modifier;
        this.f16152x = i14;
    }
}
