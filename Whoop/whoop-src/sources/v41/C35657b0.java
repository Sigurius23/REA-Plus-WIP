package v41;

import a81.InterfaceC0569t;
import androidx.health.platform.client.proto.C1533u;
import java.util.List;
import jb1.C21536b;
import kd0.InterfaceC22381a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v80.C35793a;
import ve0.AbstractC35927e;
import vi0.AbstractC36056a;
import vl0.AbstractC36101d;
import vo1.AbstractC36229d;
import vo1.AbstractC36232g;
import vo1.AbstractC36243r;
import vs2.AbstractC36479e;
import vv2.AbstractC36539e;
import w01.AbstractC36682g;
import w20.C36732v;
import w51.C36839e;
import w71.AbstractC36886h0;
import w71.AbstractC36897p;
import w71.AbstractC36900s;
import w71.C36893l;
import w71.C36894m;
import wo1.C37444e;
import wo1.C37452i;

/* JADX INFO: renamed from: v41.b0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C35657b0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151514w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f151515x;

    public /* synthetic */ C35657b0(Function1 function1, int i13) {
        this.f151514w = i13;
        this.f151515x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f151514w) {
            case 0:
                return AbstractC35661d0.m112891G(this.f151515x, ((Float) obj).floatValue());
            case 1:
                return C35793a.m113448d(this.f151515x, obj);
            case 2:
                return AbstractC35927e.m114111J(this.f151515x, (InterfaceC22381a) obj);
            case 3:
                return AbstractC36056a.m114480f(this.f151515x, (InterfaceC0569t) obj);
            case 4:
                return AbstractC36101d.m114707E(this.f151515x, obj);
            case 5:
                return AbstractC36229d.m115395O(this.f151515x, obj);
            case 6:
                return AbstractC36232g.m115436J(this.f151515x, (List) obj);
            case 7:
                return AbstractC36243r.m115509S(this.f151515x, obj);
            case 8:
                return AbstractC36243r.m115511U(this.f151515x, obj);
            case 9:
                return AbstractC36479e.m116839A(this.f151515x, obj);
            case 10:
                return AbstractC36479e.m116850L(this.f151515x, obj);
            case 11:
                return AbstractC36539e.m117104N(this.f151515x, obj);
            case 12:
                return AbstractC36539e.m117099I(this.f151515x, obj);
            case 13:
                return p742vw1.Function1.m117150j(this.f151515x, (C21536b) obj);
            case 14:
                return AbstractC36682g.m117752x(this.f151515x, obj);
            case 15:
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                this.f151515x.invoke(it);
                return C23454a0.f92919a;
            case 16:
                String it3 = (String) obj;
                AbstractC22676k.m65750j(it3, "it");
                this.f151515x.invoke(new C36732v(it3));
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C36839e.m118098d(this.f151515x, obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C36893l.m118419j0(this.f151515x, ((Integer) obj).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C36893l.m118431p0(this.f151515x, ((Long) obj).longValue());
            case 20:
                return C36893l.m118397X(this.f151515x, (Boolean) obj);
            case 21:
                return C36893l.m118437s0(this.f151515x, ((Boolean) obj).booleanValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C36893l.m118413g0(this.f151515x, ((Integer) obj).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C36893l.m118407d0(this.f151515x, ((Integer) obj).intValue());
            case 24:
                return C36894m.m118450d(this.f151515x, obj);
            case 25:
                return AbstractC36897p.m118463d(this.f151515x, ((Integer) obj).intValue());
            case 26:
                return AbstractC36900s.m118476k(this.f151515x, ((Integer) obj).intValue());
            case 27:
                return AbstractC36886h0.m118357f(this.f151515x, ((Boolean) obj).booleanValue());
            case 28:
                return C37444e.m119885d(this.f151515x, obj);
            default:
                return C37452i.m119947f(this.f151515x, obj);
        }
    }
}
