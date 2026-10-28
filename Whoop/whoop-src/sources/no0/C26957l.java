package no0;

import androidx.health.platform.client.proto.C1533u;
import c31.EnumC3919c;
import com.whoop.core.details.view.AbstractC6470a;
import com.whoop.navigation.C9598e;
import java.util.List;
import no1.AbstractC26992f;
import nw0.AbstractC27208o;
import ny0.AbstractC27278s;
import ny0.AbstractC27289x0;
import o51.AbstractC27535a;
import o51.AbstractC27537c;
import o51.C27536b;
import o72.AbstractC27647h;
import o90.AbstractC27683a;
import ox2.AbstractC28459e;
import ox2.AbstractC28462h;
import p236j.C21062a;
import p62.AbstractC28948i;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: no0.l */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26957l implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107522w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f107523x;

    public /* synthetic */ C26957l(Function1 function1, int i13) {
        this.f107522w = i13;
        this.f107523x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107522w) {
            case 0:
                return C26959m.m80694d(this.f107523x, obj);
            case 1:
                return AbstractC26985z.m80914g(this.f107523x, obj);
            case 2:
                return AbstractC26985z.m80919l(this.f107523x, (EnumC3919c) obj);
            case 3:
                return AbstractC26933a0.m80413r(this.f107523x, (EnumC3919c) obj);
            case 4:
                return AbstractC26952i0.m80558k(this.f107523x, (List) obj);
            case 5:
                return AbstractC26952i0.m80563p(this.f107523x, (EnumC3919c) obj);
            case 6:
                return AbstractC26952i0.m80568u(this.f107523x, (String) obj);
            case 7:
                return AbstractC26962n0.m80724z(this.f107523x, (EnumC3919c) obj);
            case 8:
                return AbstractC26966p0.m80767x(this.f107523x, ((Boolean) obj).booleanValue());
            case 9:
                return AbstractC26966p0.m80760q(this.f107523x, (EnumC3919c) obj);
            case 10:
                return C26937b1.m80434d(this.f107523x, obj);
            case 11:
                return AbstractC26992f.m80962g(this.f107523x, obj);
            case 12:
                return AbstractC27208o.m81908T(this.f107523x, (C9598e) obj);
            case 13:
                return AbstractC27278s.m82283d(this.f107523x, ((Boolean) obj).booleanValue());
            case 14:
                return AbstractC27289x0.m82332d(this.f107523x, ((Boolean) obj).booleanValue());
            case 15:
                return C27536b.m83052d(this.f107523x, (AbstractC27535a) obj);
            case 16:
                return AbstractC27537c.m83071q(this.f107523x, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC27647h.m83496G(this.f107523x, (C9598e) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC27683a.m83682d(this.f107523x, (C21062a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC6470a.m19773G(this.f107523x, obj);
            case 20:
                return AbstractC6470a.m19775I(this.f107523x, ((Boolean) obj).booleanValue());
            case 21:
                return AbstractC6470a.m19776J(this.f107523x, (String) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC6470a.m19777K(this.f107523x, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC6470a.m19783Q(this.f107523x, (String) obj);
            case 24:
                return AbstractC6470a.m19767A(this.f107523x, ((Integer) obj).intValue());
            case 25:
                return AbstractC6470a.m19769C(this.f107523x, (String) obj);
            case 26:
                return AbstractC6470a.m19770D(this.f107523x, (C9598e) obj);
            case 27:
                return AbstractC28459e.m86283H(this.f107523x, (String) obj);
            case 28:
                return AbstractC28462h.m86320E(this.f107523x, (String) obj);
            default:
                return AbstractC28948i.m87906j(this.f107523x, obj);
        }
    }
}
