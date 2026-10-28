package go1;

import ad3.C0764g;
import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.weightlifting.data.domain.FilterItem;
import ep2.InterfaceC13429a;
import et1.InterfaceC13597a;
import ft1.InterfaceC14768a;
import gp2.AbstractC16070e;
import gp2.AbstractC16071f;
import gu0.C16210b;
import gu0.C16212d;
import gv2.C16245c;
import gz2.AbstractC16335b;
import j93.InterfaceC21493z;
import java.util.List;
import l83.C23454a0;
import mh.C25540h;
import p040c0.InterfaceC3770q;
import p180h0.AbstractC16460u;
import p180h0.AbstractC16486z0;
import p180h0.C16445r;
import p180h0.InterfaceC16450s;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p390p1.AbstractC28683x;
import p390p1.C28674u2;
import p390p1.InterfaceC28653p1;
import p707gt1.AbstractC16188b;
import p707gt1.AbstractC16189c;
import p707gt1.AbstractC16198l;
import p707gt1.AbstractC16200n;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r00.AbstractC30839a;
import y00.EnumC38853i;

/* JADX INFO: renamed from: go1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16016a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60613w;

    public /* synthetic */ C16016a(int i13) {
        this.f60613w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f60613w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return AbstractC16017b.m45334h(obj);
            case 1:
                return AbstractC16070e.m45399s(obj);
            case 2:
                return AbstractC16071f.m45415o((InterfaceC13429a) obj);
            case 3:
                return AbstractC16188b.m45745h((String) obj);
            case 4:
                return AbstractC16188b.m45748k((Throwable) obj);
            case 5:
                return AbstractC16189c.m45758f((InterfaceC14768a) obj);
            case 6:
                return AbstractC16198l.m45800q((InterfaceC14768a) obj);
            case 7:
                return AbstractC16198l.m45783F((List) obj);
            case 8:
                return AbstractC16198l.m45801r((InterfaceC13597a) obj);
            case 9:
                return AbstractC16198l.m45779B((String) obj);
            case 10:
                return AbstractC16200n.m45837s((InterfaceC14768a) obj);
            case 11:
                return AbstractC16200n.m45838t((InterfaceC13597a) obj);
            case 12:
                return AbstractC16200n.m45810A((String) obj);
            case 13:
                return AbstractC16200n.m45813D((List) obj);
            case 14:
                return C16210b.m45890c((C0764g) obj);
            case 15:
                return C16212d.m45899c((C0764g) obj);
            case 16:
                return C16245c.m46051m((FilterItem) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C16245c.m46052n((FilterItem) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                EnumC38853i brand = (EnumC38853i) obj;
                AbstractC22676k.m65750j(brand, "brand");
                return brand.f167260w;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC16335b.m46528e((C25540h) obj);
            case 20:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 21:
                C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
                InterfaceC28653p1 interfaceC28653p1 = (InterfaceC28653p1) obj;
                interfaceC28653p1.getClass();
                if (((Context) AbstractC28683x.m87236D(interfaceC28653p1, c28674u2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC16460u.f63242b;
                }
                InterfaceC16450s.f63207a.getClass();
                return C16445r.f63188c;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                float f13 = AbstractC16486z0.f63358a;
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Float) obj).getClass();
                return c23454a0;
            case 24:
                return Boolean.TRUE;
            case 25:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                ((C18030l) semantics).m51772e(AbstractC18039u.f70048o, c23454a0);
                return c23454a0;
            case 26:
                InterfaceC3770q NavHost = (InterfaceC3770q) obj;
                AbstractC22676k.m65750j(NavHost, "$this$NavHost");
                return AbstractC30839a.f127147a.f15352d;
            case 27:
                InterfaceC3770q NavHost2 = (InterfaceC3770q) obj;
                AbstractC22676k.m65750j(NavHost2, "$this$NavHost");
                return AbstractC30839a.f127147a.f15349a;
            case 28:
                InterfaceC3770q NavHost3 = (InterfaceC3770q) obj;
                AbstractC22676k.m65750j(NavHost3, "$this$NavHost");
                return AbstractC30839a.f127147a.f15350b;
            default:
                InterfaceC18044z semantics2 = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics2, "$this$semantics");
                AbstractC18041w.m51812k("CircularProgressIndicator", semantics2);
                return c23454a0;
        }
    }
}
