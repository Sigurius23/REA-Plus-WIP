package j11;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.healthspan.domain.models.LockedContentViewState;
import gr1.C16094a;
import gr1.C16095b;
import gr1.C16102i;
import gr1.C16103j;
import hp1.AbstractC17548h;
import hs2.C17611e;
import i93.C18279e;
import ik1.AbstractC18611h;
import it1.InterfaceC20929c;
import iw1.InterfaceC20996b;
import j21.AbstractC21246e;
import j21.C21250i;
import j50.AbstractC21331c;
import j50.C21332d;
import j81.AbstractC21422f;
import j81.C21425i;
import jh0.C21693a;
import jh0.C21695c;
import jm1.AbstractC21792c;
import jm1.C21793d;
import jp1.AbstractC21863o;
import jp2.AbstractC21883n;
import jp2.C21884o;
import jr1.AbstractC21893a;
import jr1.AbstractC21896d;
import jr1.AbstractC21899g;
import js2.AbstractC21928f;
import jt1.AbstractC21938c;
import jv2.InterfaceC21972c;
import k00.InterfaceC22088a;
import kd0.C22383c;
import kd1.AbstractC22403o;
import kf0.AbstractC22431f;
import kh0.AbstractC22479f;
import kk1.AbstractC22546g;
import kk1.AbstractC22547h;
import kl2.AbstractC22576k;
import km1.AbstractC22585b;
import km1.C22588e;
import kr1.AbstractC22810c;
import kv2.AbstractC22846b;
import kw1.AbstractC22853d;
import ky2.AbstractC22896e;
import ky2.AbstractC22901j;
import ky2.InterfaceC22898g;
import l01.AbstractC23035g;
import l01.C23036h;
import l83.C23454a0;
import nl2.C26816c;
import org.joda.time.LocalDate;
import p390p1.InterfaceC28601c1;
import p713jm0.AbstractC21789d;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: j11.q */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21214q implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80911w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f80912x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f80913y;

    public /* synthetic */ C21214q(int i13, Object obj, Object obj2) {
        this.f80911w = i13;
        this.f80912x = obj;
        this.f80913y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f80911w) {
            case 0:
                return AbstractC21215r.m59513e((Function1) this.f80912x, (LocalDate) this.f80913y);
            case 1:
                return AbstractC21246e.m59573g((C21250i) this.f80913y, (Function1) this.f80912x);
            case 2:
                return AbstractC21331c.m59868h((C21332d) this.f80913y, (Function1) this.f80912x);
            case 3:
                return AbstractC21422f.m60272p((C21425i) this.f80913y, (Function1) this.f80912x);
            case 4:
                return C21693a.m61087d((Function1) this.f80912x, (C21695c) this.f80913y);
            case 5:
                return AbstractC21789d.m61644w((Function1) this.f80912x, (TabConfiguration) this.f80913y);
            case 6:
                return AbstractC21792c.m61658h((Function1) this.f80912x, (C21793d) this.f80913y);
            case 7:
                return AbstractC21863o.m61942o((Function1) this.f80912x, (AbstractC17548h) this.f80913y);
            case 8:
                return AbstractC21883n.m62056D((Function1) this.f80912x, (C21884o) this.f80913y);
            case 9:
                return AbstractC21893a.m62162f((Function1) this.f80912x, (C16102i) this.f80913y);
            case 10:
                return AbstractC21896d.m62190R((InterfaceC25312u) this.f80913y, (Function1) this.f80912x);
            case 11:
                return AbstractC21896d.m62183K((Function1) this.f80912x, (C16095b) this.f80913y);
            case 12:
                return AbstractC21899g.m62295u((Function1) this.f80912x, (C16103j) this.f80913y);
            case 13:
                return AbstractC21928f.m62459y((Context) this.f80912x, (InterfaceC28601c1) this.f80913y);
            case 14:
                return AbstractC21928f.m62428A((C17611e.c) this.f80913y, (Function1) this.f80912x);
            case 15:
                return AbstractC21938c.m62517u((Function1) this.f80912x, (InterfaceC20929c.b) this.f80913y);
            case 16:
                ((Function1) this.f80912x).invoke((InterfaceC22088a) this.f80913y);
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC22431f.m64631F((C22383c.g) this.f80913y, (Function1) this.f80912x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC22479f.m64937d((Function1) this.f80912x, (AbstractC22403o) this.f80913y);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Float.valueOf(AbstractC22546g.m65187A0(0.001f, (C18279e) this.f80912x, (InterfaceC28601c1) this.f80913y));
            case 20:
                return AbstractC22546g.m65224b0((Function1) this.f80912x, (AbstractC18611h.c) this.f80913y);
            case 21:
                return AbstractC22547h.m65278f((LockedContentViewState) this.f80913y, (Function1) this.f80912x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22576k.m65351N((C26816c.f) this.f80913y, (Function1) this.f80912x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC22585b.m65452k((Function1) this.f80912x, (C22588e) this.f80913y);
            case 24:
                return AbstractC22810c.m66056g((C16094a) this.f80913y, (Function1) this.f80912x);
            case 25:
                return AbstractC22846b.m66266q((InterfaceC21972c.a) this.f80913y, (Function1) this.f80912x);
            case 26:
                return AbstractC22853d.m66290C((InterfaceC20996b) this.f80913y, (Function1) this.f80912x);
            case 27:
                return AbstractC22896e.m66565j((Function1) this.f80912x, (InterfaceC22898g) this.f80913y);
            case 28:
                return AbstractC22901j.m66630e((Function1) this.f80912x, (InterfaceC22898g.f) this.f80913y);
            default:
                return AbstractC23035g.m66825k((Function1) this.f80912x, (C23036h) this.f80913y);
        }
    }

    public /* synthetic */ C21214q(Object obj, Function1 function1, int i13) {
        this.f80911w = i13;
        this.f80913y = obj;
        this.f80912x = function1;
    }
}
