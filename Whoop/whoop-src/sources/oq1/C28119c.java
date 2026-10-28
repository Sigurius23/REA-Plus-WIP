package oq1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.home.domain.models.CustomAnimationContainerViewState;
import g51.C15493c;
import hy0.EnumC17753i0;
import java.util.Map;
import lq1.C24663c;
import nh1.C26722c;
import np2.C27036c;
import og0.C27917c;
import ot2.AbstractC28344m;
import ow0.AbstractC28434d;
import ow0.C28431a;
import p040c0.InterfaceC3747i0;
import p114eb.C12982q;
import p180h0.EnumC16377d2;
import p181h2.C16617b;
import p206i0.AbstractC17833k;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p31.AbstractC28795f;
import p31.C28797h;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p409q0.AbstractC29701y;
import p490t0.C33252i;
import p507tx.AbstractC34235f;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p736sz0.AbstractC33195l;
import p736sz0.C33198m;
import ph1.AbstractC29243g;
import po2.C29404c;
import pp2.AbstractC29450n;
import pt2.AbstractC29540v;
import pu2.C29553a;
import qg0.AbstractC30342c;
import qg0.AbstractC30343d;
import qm1.AbstractC30483e;
import qu2.AbstractC30640h;
import r51.C30938f;
import rm1.AbstractC31599m;
import rq2.AbstractC31719d;
import rq2.C31713a;
import rt1.C31813k;
import rv2.InterfaceC31850h;
import rz0.AbstractC31926e;
import rz0.EnumC31927f;
import so2.AbstractC32849g;
import st1.AbstractC32993n;
import sv0.AbstractC33033b;
import sv2.AbstractC33042e;
import sx1.AbstractC33074j;
import t01.AbstractC33260f;
import t01.C33257c;
import t51.AbstractC33543b;
import t51.C33544c;
import td2.InterfaceC33718i;
import ud2.AbstractC34796e;
import uu2.AbstractC35261l;
import uu2.C35242b0;
import ux1.C35368b;
import ux1.C35370d;
import uz1.AbstractC35430h;
import v41.AbstractC35661d0;
import v51.AbstractC35703b;
import v51.C35704c;
import v81.AbstractC35798c;
import vo1.AbstractC36229d;
import z51.C40101l;

/* JADX INFO: renamed from: oq1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28119c implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f113756w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f113757x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f113758y;

    public /* synthetic */ C28119c(int i13, Object obj, Object obj2) {
        this.f113756w = i13;
        this.f113758y = obj;
        this.f113757x = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f113756w) {
            case 0:
                return AbstractC28120d.m85047q((C24663c) this.f113758y, (Function1) this.f113757x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return AbstractC28434d.m86162f((C28431a) this.f113758y, (Function1) this.f113757x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return AbstractC28795f.m87574v((C28797h) this.f113758y, (InterfaceC4339a) this.f113757x, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return AbstractC29243g.m88771f(null, (C26722c) this.f113758y, (Function1) this.f113757x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return AbstractC29450n.m89898l((C27036c.b) this.f113758y, (Function1) this.f113757x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return AbstractC29540v.m90450v0((AbstractC28344m.i) this.f113758y, (Function1) this.f113757x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                AbstractC29701y abstractC29701y = (AbstractC29701y) this.f113758y;
                EnumC39181m enumC39181m = (EnumC39181m) this.f113757x;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zM108210R = AbstractC34235f.m108210R(abstractC29701y, fFloatValue);
                char c3 = 0;
                if (abstractC29701y.m91163l().f121385e != EnumC16377d2.f62971w && enumC39181m != EnumC39181m.f168423w) {
                    zM108210R = !zM108210R;
                }
                int i13 = abstractC29701y.m91163l().f121382b;
                float fM108201G = i13 == 0 ? 0.0f : AbstractC34235f.m108201G(abstractC29701y) / i13;
                float f13 = fM108201G - ((int) fM108201G);
                if (Math.abs(fFloatValue) >= abstractC29701y.f121446q.mo743q0(AbstractC17833k.f69346a)) {
                    c3 = fFloatValue > 0.0f ? (char) 1 : (char) 2;
                }
                if (c3 == 0) {
                    fFloatValue2 = Math.abs(f13) > 0.5f ? fFloatValue3 : fFloatValue3;
                } else if (c3 != 1) {
                    if (c3 != 2) {
                        fFloatValue2 = 0.0f;
                    }
                }
                return Float.valueOf(fFloatValue2);
            case 7:
                return AbstractC30342c.m92708d(null, (C27917c) this.f113758y, (Function1) this.f113757x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                return AbstractC30343d.m92721l((C27917c.b) this.f113758y, (Function1) this.f113757x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return AbstractC30483e.m93302D((CustomAnimationContainerViewState) this.f113758y, (InterfaceC4351m) this.f113757x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 10:
                return AbstractC30640h.m94130h0((C29553a) this.f113758y, (Function1) this.f113757x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 11:
                return AbstractC31599m.m97524u((C40101l) this.f113758y, (Function1) this.f113757x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                return AbstractC31719d.m98425g((C31713a) this.f113758y, (InterfaceC28670t2) this.f113757x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                return AbstractC31926e.m99381p((EnumC31927f) this.f113758y, (C33252i) this.f113757x, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 14:
                return AbstractC32849g.m103110l((C29404c.a) this.f113758y, (Function1) this.f113757x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 15:
                return AbstractC32993n.m104210p((C31813k) this.f113758y, (Map) this.f113757x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 16:
                return AbstractC33033b.m104307h((Function1) this.f113757x, (InterfaceC28670t2) this.f113758y, (C12982q) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC33042e.m104552w0((InterfaceC31850h.b) this.f113758y, (Function1) this.f113757x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC33074j.m104741J((C35368b) this.f113758y, (InterfaceC4351m) this.f113757x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC33074j.m104735D((String) this.f113758y, (C35370d) this.f113757x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 20:
                return AbstractC33195l.m105196g((C33198m) this.f113758y, (Function1) this.f113757x, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 21:
                return AbstractC33260f.m105518l((C33257c) this.f113758y, (Function1) this.f113757x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC33543b.m105917f((C33544c) this.f113758y, (Function1) this.f113757x, (InterfaceC23004v) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC34796e.m109848r((InterfaceC33718i.b) this.f113758y, (Function1) this.f113757x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 24:
                return AbstractC35261l.m111789d0((C35242b0) this.f113758y, (Function1) this.f113757x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 25:
                return AbstractC35430h.m112455w((C30938f) this.f113758y, (InterfaceC28601c1) this.f113757x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 26:
                return AbstractC35661d0.m112901Q((InterfaceC28601c1) this.f113758y, (InterfaceC28601c1) this.f113757x, ((Float) obj).floatValue(), (C16617b) obj2, ((Float) obj3).floatValue());
            case 27:
                return AbstractC35703b.m113160o((C35704c) this.f113758y, (Function1) this.f113757x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 28:
                return AbstractC35798c.m113514r((EnumC17753i0) this.f113758y, (C15493c) this.f113757x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC36229d.m115394N((C15493c) this.f113758y, (Function1) this.f113757x, ((Integer) obj).intValue(), (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ C28119c(Function1 function1, InterfaceC28670t2 interfaceC28670t2) {
        this.f113756w = 16;
        this.f113757x = function1;
        this.f113758y = interfaceC28670t2;
    }
}
