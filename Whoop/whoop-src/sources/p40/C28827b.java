package p40;

import a81.InterfaceC0569t;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import java.util.ArrayList;
import java.util.Iterator;
import l83.C23454a0;
import m83.AbstractC25265s;
import p181h2.C16617b;
import p181h2.C16618c;
import p294l3.C23277r0;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import p736sz0.AbstractC33174e;
import pj2.AbstractC29310i;
import qu2.AbstractC30640h;
import qz0.AbstractC30792k;
import sg2.AbstractC32471v;
import tq1.AbstractC34082a;
import ue1.AbstractC34860c;
import v80.AbstractC35794b;
import vo1.AbstractC36243r;
import vo1.AbstractC36249x;
import vp1.AbstractC36272h;
import vt2.AbstractC36497f;
import w51.AbstractC36841g;
import w71.AbstractC36900s;
import wi0.AbstractC37313e;
import wo1.AbstractC37451h0;
import wq1.AbstractC37509c;
import xq2.AbstractC38550b0;

/* JADX INFO: renamed from: p40.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C28827b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116700w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f116701x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f116702y;

    public /* synthetic */ C28827b(Function1 function1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f116700w = i13;
        this.f116701x = function1;
        this.f116702y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        Object next;
        switch (this.f116700w) {
            case 0:
                long jM47185a = ((C16617b) obj).f63937a;
                InterfaceC28601c1 interfaceC28601c1 = this.f116702y;
                C23277r0 c23277r0 = (C23277r0) interfaceC28601c1.getValue();
                if (c23277r0 != null && (arrayList = c23277r0.f92232f) != null) {
                    Iterator it = AbstractC25265s.m74092D0(arrayList).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            C16618c c16618c = (C16618c) next;
                            if (C16617b.m47189e(jM47185a) <= C16617b.m47189e(c16618c.m47200f()) || C16617b.m47189e(jM47185a) >= C16617b.m47189e(c16618c.m47201g())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    C16618c c16618c2 = (C16618c) next;
                    if (c16618c2 != null) {
                        jM47185a = C16617b.m47185a(C16617b.m47189e(c16618c2.m47201g()) + 0.1f, 0.0f, c16618c2.m47201g(), 2);
                    }
                }
                C23277r0 c23277r1 = (C23277r0) interfaceC28601c1.getValue();
                if (c23277r1 != null) {
                    this.f116701x.invoke(Integer.valueOf(c23277r1.f92228b.m67377g(jM47185a) - 1));
                }
                return C23454a0.f92919a;
            case 1:
                return AbstractC29310i.m89051k0(this.f116701x, this.f116702y, obj);
            case 2:
                return AbstractC30640h.m94110a1(this.f116702y, this.f116701x, ((Float) obj).floatValue());
            case 3:
                return AbstractC30792k.m94681o(this.f116702y, this.f116701x, (C29891y) obj);
            case 4:
                return AbstractC32471v.m101416A(this.f116701x, this.f116702y, obj);
            case 5:
                return AbstractC33174e.m105104k(this.f116701x, this.f116702y, obj);
            case 6:
                return AbstractC33174e.m105105l(this.f116701x, this.f116702y, obj);
            case 7:
                C23277r0 c23277r2 = (C23277r0) obj;
                this.f116702y.setValue(c23277r2);
                this.f116701x.invoke(c23277r2);
                return C23454a0.f92919a;
            case 8:
                C16617b c16617b = (C16617b) obj;
                C23277r0 c23277r3 = (C23277r0) this.f116702y.getValue();
                if (c23277r3 != null) {
                    this.f116701x.invoke(Integer.valueOf(c23277r3.f92228b.m67377g(c16617b.f63937a)));
                }
                return C23454a0.f92919a;
            case 9:
                return AbstractC34860c.m109948d(this.f116701x, this.f116702y, (C28624i0) obj);
            case 10:
                return AbstractC35794b.m113474s(this.f116701x, this.f116702y, (String) obj);
            case 11:
                return AbstractC36243r.m115552r0(this.f116701x, this.f116702y, (DecodedGenericInteraction) obj);
            case 12:
                return AbstractC36249x.m115608F(this.f116701x, this.f116702y, (String) obj);
            case 13:
                return AbstractC36272h.m115844i1(this.f116701x, this.f116702y, (InterfaceC0569t) obj);
            case 14:
                return AbstractC36497f.m116960F(this.f116701x, this.f116702y, ((Boolean) obj).booleanValue());
            case 15:
                return AbstractC36841g.m118119m(this.f116701x, this.f116702y, ((Boolean) obj).booleanValue());
            case 16:
                return AbstractC36900s.m118479n(this.f116701x, this.f116702y, ((Integer) obj).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC37313e.m119528x(this.f116701x, this.f116702y, (String) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC37451h0.m119936n(this.f116701x, this.f116702y, (String) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC37509c.m120249v(this.f116701x, this.f116702y, (AbstractC34082a) obj);
            default:
                return AbstractC38550b0.m123528s(this.f116701x, this.f116702y, (C29891y) obj);
        }
    }

    public /* synthetic */ C28827b(InterfaceC28601c1 interfaceC28601c1, Function1 function1, int i13) {
        this.f116700w = i13;
        this.f116702y = interfaceC28601c1;
        this.f116701x = function1;
    }
}
