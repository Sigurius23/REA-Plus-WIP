package s51;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.educationModels.PodcastPlayer;
import com.whoop.realtime.service.RealTimeActivityService;
import com.whoop.settings.switchPlan.SwitchPlanDialogFragment;
import i20.C17990z0;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23462h;
import ld1.AbstractC23864c;
import ng2.C26684c;
import p027b3.C2368e1;
import p027b3.InterfaceC2355b3;
import p294l3.AbstractC23284v;
import p294l3.C23250e;
import p294l3.C23254g;
import p294l3.C23280t;
import p294l3.C23282u;
import p294l3.C23283u0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p510u0.C34352r1;
import p510u0.C34368x0;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p736sz0.C33201n;
import p736sz0.C33210q;
import p739ui0.AbstractC35012n;
import p92.C29016e;
import q20.AbstractC29840y;
import q20.C29810c;
import q20.C29834s;
import ri0.C31446e;
import rt1.C31805c;
import rt1.C31806d;
import rt1.InterfaceC31810h;
import rv2.C31845c;
import s20.C32077a;
import se1.AbstractC32421a;
import sg2.AbstractC32471v;
import st1.AbstractC32991l;
import st1.AbstractC32993n;
import sv2.AbstractC33042e;
import sx1.AbstractC33074j;
import t20.C33333n;
import t20.C33341v;
import t21.AbstractC33349g;
import t21.C33346d;
import td2.InterfaceC33718i;
import tu2.AbstractC34197b;
import tx0.AbstractC34241d;
import tx0.C34244g;
import ty1.AbstractC34264i;
import ty1.C34266k;
import tz0.AbstractC34277b;
import tz0.C34278c;
import u11.AbstractC34443i;
import u70.C34565e;
import u70.C34566f;
import u80.AbstractC34633c;
import u80.C34631a;
import uc3.C34768f;
import ud2.AbstractC34796e;
import ug2.AbstractC34951d;
import ux1.C35370d;
import wg2.C37265a;
import y00.EnumC38922p2;

/* JADX INFO: renamed from: s51.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C32209f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133371w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f133372x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f133373y;

    public /* synthetic */ C32209f(int i13, Object obj, Object obj2) {
        this.f133371w = i13;
        this.f133373y = obj;
        this.f133372x = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C23254g c23254g;
        C17990z0 c17990z0;
        switch (this.f133371w) {
            case 0:
                return AbstractC32210g.m100196i((C32211h) this.f133373y, (Function1) this.f133372x);
            case 1:
                return AbstractC32210g.m100197j((Function1) this.f133372x, (C32208e) this.f133373y);
            case 2:
                return AbstractC32215l.m100231k((C32212i) this.f133373y, (Function1) this.f133372x);
            case 3:
                return ((RealTimeActivityService) this.f133373y).m24226l((C29016e) this.f133372x);
            case 4:
                return AbstractC32421a.m101228h((Function1) this.f133372x, (PodcastPlayer) this.f133373y);
            case 5:
                return AbstractC32471v.m101456x((C26684c) this.f133373y, (InterfaceC28601c1) this.f133372x);
            case 6:
                return AbstractC32991l.m104166R((InterfaceC31810h.b) this.f133373y, (Function1) this.f133372x);
            case 7:
                return AbstractC32991l.m104163O((Function1) this.f133372x, (C31806d) this.f133373y);
            case 8:
                return AbstractC32991l.m104160L((Function1) this.f133372x, (C31805c) this.f133373y);
            case 9:
                return Boolean.valueOf(AbstractC32993n.m104209o((Map) this.f133373y, (InterfaceC28601c1) this.f133372x));
            case 10:
                return AbstractC33042e.m104556y0((Function1) this.f133372x, (C31845c) this.f133373y);
            case 11:
                return AbstractC33074j.m104740I((InterfaceC4351m) this.f133373y, (C35370d) this.f133372x);
            case 12:
                return C33201n.m105256d((Function1) this.f133372x, (C33210q) this.f133373y);
            case 13:
                C33333n c33333n = (C33333n) this.f133373y;
                C32077a c32077a = (C32077a) this.f133372x;
                boolean z4 = c33333n.f139022a;
                C29810c c29810c = c33333n.f139023b;
                EnumC38922p2 enumC38922p2 = c33333n.f139024c;
                String str = c33333n.f139031j;
                boolean z13 = c33333n.f139026e;
                boolean z14 = c33333n.f139027f;
                boolean z15 = c33333n.f139028g;
                String str2 = c33333n.f139029h;
                String str3 = c33333n.f139030i;
                String str4 = c33333n.f139025d;
                AbstractC29840y abstractC29840y = c33333n.f139033l;
                return new C33341v(z4, c29810c, enumC38922p2, c32077a, z13, z14, z15, str2, str3, str4, abstractC29840y instanceof C29834s ? (C29834s) abstractC29840y : null, c33333n.f139032k, str, c33333n.f139043v, c33333n.f139042u, c33333n.f139044w, c33333n.f139045x, c33333n.f139046y, c33333n.f139047z, c33333n.f139021A);
            case 14:
                return AbstractC33349g.m105737N((C33346d) this.f133373y, (Function1) this.f133372x);
            case 15:
                return SwitchPlanDialogFragment.m25804J((SwitchPlanDialogFragment) this.f133373y, (InterfaceC28670t2) this.f133372x);
            case 16:
                return AbstractC34197b.m108091q((InterfaceC28670t2) this.f133373y, (InterfaceC23462h) this.f133372x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC34241d.m108267p((Function1) this.f133372x, (C34244g) this.f133373y);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC34264i.m108359e0((Function1) this.f133372x, (C34266k) this.f133373y);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC34277b.m108544g((Function1) this.f133372x, (C34278c) this.f133373y);
            case 20:
                C29891y c29891y = (C29891y) this.f133373y;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f133372x;
                if (!C23283u0.m67356b(c29891y.f122126b, ((C29891y) interfaceC28601c1.getValue()).f122126b) || !AbstractC22676k.m65745e(c29891y.f122127c, ((C29891y) interfaceC28601c1.getValue()).f122127c)) {
                    interfaceC28601c1.setValue(c29891y);
                }
                return C23454a0.f92919a;
            case 21:
                C34352r1 c34352r1 = (C34352r1) this.f133373y;
                C23254g c23254g2 = (C23254g) this.f133372x;
                if (c34352r1 == null) {
                    return c23254g2;
                }
                C39967p c39967p = c34352r1.f144303c;
                if (c39967p.isEmpty()) {
                    c23254g = c34352r1.f144302b;
                } else {
                    C34368x0 c34368x0 = new C34368x0(c34352r1.f144302b);
                    int size = c39967p.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((Function1) c39967p.get(i13)).invoke(c34368x0);
                    }
                    c23254g = c34368x0.f144421b;
                }
                c34352r1.f144302b = c23254g;
                return c23254g == null ? c23254g2 : c23254g;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C23250e c23250e = (C23250e) this.f133373y;
                InterfaceC2355b3 interfaceC2355b3 = (InterfaceC2355b3) this.f133372x;
                AbstractC23284v abstractC23284v = (AbstractC23284v) c23250e.f92125a;
                if (abstractC23284v instanceof C23282u) {
                    C17990z0 c17990z1 = ((C23282u) abstractC23284v).f92250c;
                    if (c17990z1 != null) {
                        c17990z1.m51594a(abstractC23284v);
                    } else {
                        try {
                            ((C2368e1) interfaceC2355b3).m7301a(((C23282u) abstractC23284v).f92248a);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((abstractC23284v instanceof C23280t) && (c17990z0 = ((C23280t) abstractC23284v).f92243c) != null) {
                    c17990z0.m51594a(abstractC23284v);
                }
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf(AbstractC34443i.m108849d0((View) this.f133373y, (InterfaceC28601c1) this.f133372x));
            case 24:
                return C34565e.m109293d((C34566f) this.f133373y, (Function1) this.f133372x);
            case 25:
                return AbstractC34633c.m109440j((Function1) this.f133372x, (C34631a) this.f133373y);
            case 26:
                return "Only found " + ((C22665e0) this.f133373y).f89334w + " digits in a row, but need to parse " + ((C34768f) this.f133372x).m109778b();
            case 27:
                return AbstractC34796e.m109850t((Function1) this.f133372x, (InterfaceC33718i.b) this.f133373y);
            case 28:
                return AbstractC34951d.m110416k((AbstractC23864c) this.f133373y, (C37265a) this.f133372x);
            default:
                return AbstractC35012n.m110565A((C31446e) this.f133373y, (Function1) this.f133372x);
        }
    }

    public /* synthetic */ C32209f(Function1 function1, Object obj, int i13) {
        this.f133371w = i13;
        this.f133372x = function1;
        this.f133373y = obj;
    }

    public /* synthetic */ C32209f(C34352r1 c34352r1, C23250e c23250e, InterfaceC2355b3 interfaceC2355b3) {
        this.f133371w = 22;
        this.f133373y = c23250e;
        this.f133372x = interfaceC2355b3;
    }
}
