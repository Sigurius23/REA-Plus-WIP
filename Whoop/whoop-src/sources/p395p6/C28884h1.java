package p395p6;

import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.recommendationtile.RecommendationTileGroupModel;
import jb1.C21536b;
import l83.C23454a0;
import mh.C25540h;
import nh1.InterfaceC26720a;
import oa2.InterfaceC27755c;
import p335n6.InterfaceC26397n;
import p545v6.C35725n;
import p545v6.C35733v;
import p71.AbstractC28956b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;
import p81.AbstractC28970b;
import p90.AbstractC28996d;
import p90.AbstractC29001i;
import p92.C29019h;
import pa2.AbstractC29037a;
import pc1.AbstractC29068b;
import pf.InterfaceC29129g;
import pg0.AbstractC29162b;
import ph1.AbstractC29241e;
import ph1.AbstractC29243g;
import ph1.AbstractC29245i;
import ph1.AbstractC29247k;
import pj2.AbstractC29304c;
import pj2.AbstractC29310i;
import pj2.AbstractC29318q;
import pl0.AbstractC29345c;
import q22.EnumC29858h;

/* JADX INFO: renamed from: p6.h1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C28884h1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116918w;

    public /* synthetic */ C28884h1(int i13) {
        this.f116918w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f116918w) {
            case 0:
                InterfaceC26397n interfaceC26397n = (InterfaceC26397n) obj;
                return Boolean.valueOf((interfaceC26397n instanceof C35733v) || (interfaceC26397n instanceof C35725n) || (interfaceC26397n instanceof C28921u));
            case 1:
                return Boolean.FALSE;
            case 2:
                return AbstractC28956b.m87930o((Modifier) obj);
            case 3:
                return AbstractC28956b.m87933r((Modifier) obj);
            case 4:
                return AbstractC28956b.m87934s((Modifier) obj);
            case 5:
                return AbstractC28970b.m87982e((Modifier) obj);
            case 6:
                return AbstractC28996d.m88066y((EnumC29858h) obj);
            case 7:
                return AbstractC28996d.m88036Y(obj);
            case 8:
                return AbstractC29001i.m88085i(obj);
            case 9:
                return C29019h.m88210g((Context) obj);
            case 10:
                return AbstractC29037a.m88278i((InterfaceC27755c) obj);
            case 11:
                return AbstractC29068b.m88361f((C23749z0) obj);
            case 12:
                return AbstractC29068b.m88362g((RecommendationTileGroupModel) obj);
            case 13:
                InterfaceC29129g engineConstructor = (InterfaceC29129g) obj;
                AbstractC22676k.m65750j(engineConstructor, "$this$engineConstructor");
                return C23454a0.f92919a;
            case 14:
                InterfaceC29129g engineConstructor2 = (InterfaceC29129g) obj;
                AbstractC22676k.m65750j(engineConstructor2, "$this$engineConstructor");
                return C23454a0.f92919a;
            case 15:
                return AbstractC29162b.m88606c((C21536b) obj);
            case 16:
                return AbstractC29241e.m88761l((InterfaceC26720a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC29243g.m88770e((InterfaceC26720a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC29245i.m88782J((InterfaceC26720a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29245i.m88802b0(obj);
            case 20:
                return AbstractC29245i.m88804c0((C25308q) obj);
            case 21:
                return AbstractC29245i.m88832y((C25308q) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC29247k.m88847k((InterfaceC26720a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC29304c.m88958h((C25540h) obj);
            case 24:
                return AbstractC29310i.m89013W0(obj);
            case 25:
                return AbstractC29318q.m89164q0(((Integer) obj).intValue());
            case 26:
                return AbstractC29318q.m89105H0(obj);
            case 27:
                return AbstractC29318q.m89172u0(((Integer) obj).intValue());
            case 28:
                return AbstractC29345c.m89393y((C21536b) obj);
            default:
                return AbstractC29345c.m89394z((C23749z0) obj);
        }
    }
}
