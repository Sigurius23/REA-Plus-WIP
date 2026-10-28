package h00;

import a30.C0273a;
import ad3.C0764g;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.C1646z1;
import bc3.InterfaceC3027k1;
import com.stripe.android.shoppay.ShopPayActivity;
import d10.AbstractC11464a;
import e10.C12534a0;
import e10.C12579y;
import e10.C12580z;
import e10.InterfaceC12536b0;
import e10.InterfaceC12555l;
import e20.C12593a;
import f60.InterfaceC14136a;
import h02.AbstractC16568e;
import h21.AbstractC16779c;
import h30.C16805j;
import h31.AbstractC16827t;
import h41.AbstractC16850d;
import h51.AbstractC16932d;
import h51.AbstractC16933e;
import h60.AbstractC16976e;
import h60.AbstractC16978g;
import h60.AbstractC16979h;
import h71.AbstractC16990g;
import h71.C16995l;
import h81.AbstractC17012e;
import h90.AbstractC17024b;
import i30.AbstractC18045a;
import io.getstream.chat.android.client.internal.offline.plugin.factory.StreamOfflinePluginFactory;
import java.util.List;
import l10.C23218c;
import l83.C23454a0;
import m83.C25271y;
import o10.C27388a;
import p163g1.EnumC15209z3;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p298l8.AbstractC23420c;
import p499t9.C33623c0;
import p499t9.C33647p;
import p599wz.EnumC37721h0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25308q;
import p745y81.C39336i;
import q20.AbstractC29815e0;
import q20.C29813d0;
import s93.AbstractC32309k;
import uy.C35373a;
import v00.C35459c0;
import v00.C35482o;
import v00.C35484p;
import v03.C35516c;
import v03.C35518e;
import y00.C38915o4;

/* JADX INFO: renamed from: h00.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16513l0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63494w;

    public /* synthetic */ C16513l0(int i13) {
        this.f63494w = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        C35484p c35484p;
        C29813d0 c29813d0;
        int i13 = this.f63494w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        boolean z4 = true;
        z4 = true;
        z4 = true;
        z4 = true;
        Object[] objArr = 0;
        switch (i13) {
            case 0:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51812k("CompletedIcon", semantics);
                return c23454a0;
            case 1:
                return AbstractC16568e.m46943c((C25308q) obj);
            case 2:
                return StreamOfflinePluginFactory.m54674a((InterfaceC3027k1) obj);
            case 3:
                C0273a c0273a = (C0273a) obj;
                return (c0273a == null || (list = c0273a.f935w) == null) ? C25271y.f99162w : list;
            case 4:
                C35482o c35482o = (C35482o) obj;
                return Boolean.valueOf(c35482o != null ? c35482o.f151057z : false);
            case 5:
                C35459c0 c35459c0 = (C35459c0) obj;
                if (c35459c0 == null || (c35484p = c35459c0.f150973P) == null) {
                    return null;
                }
                return c35484p.f151058E;
            case 6:
                return c23454a0;
            case 7:
                AbstractC29815e0 abstractC29815e0 = (AbstractC29815e0) obj;
                if (abstractC29815e0 == null || (c29813d0 = abstractC29815e0.f121879a) == null) {
                    return null;
                }
                return c29813d0.f121871a;
            case 8:
                InterfaceC12536b0 it = (InterfaceC12536b0) obj;
                AbstractC22676k.m65750j(it, "it");
                if (!(it instanceof C12534a0) && !(it instanceof C12579y)) {
                    if (!(it instanceof C12580z)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC12555l interfaceC12555l = ((C12580z) it).f42951a;
                    if ((interfaceC12555l instanceof C23218c) || ((interfaceC12555l instanceof C27388a) && ((C27388a) interfaceC12555l).f110098y == EnumC37721h0.f161649w)) {
                        z4 = false;
                    }
                }
                return Boolean.valueOf(z4);
            case 9:
                AbstractC22676k.m65750j((C38915o4) obj, "it");
                return c23454a0;
            case 10:
                C35459c0 c35459c1 = (C35459c0) obj;
                if (c35459c1 != null) {
                    return c35459c1.f150973P;
                }
                return null;
            case 11:
                C35459c0 c35459c2 = (C35459c0) obj;
                return Boolean.valueOf(c35459c2 != null && c35459c2.f150974Q);
            case 12:
                return AbstractC16779c.m47311s(obj);
            case 13:
                AbstractC23420c initializer = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer, "$this$initializer");
                C1601k1 c1601k1M5015e = AbstractC1613o1.m5015e(initializer);
                Object objMo67910a = initializer.mo67910a(C1646z1.f6353d);
                AbstractC22676k.m65748h(objMo67910a, "null cannot be cast to non-null type android.app.Application");
                int i14 = ShopPayActivity.f22413E;
                C16805j c16805j = (C16805j) c1601k1M5015e.m5001b("shop_pay_args");
                if (c16805j == null) {
                    throw new IllegalArgumentException() { // from class: com.stripe.android.shoppay.ShopPayViewModel$NoArgsException
                    };
                }
                C33647p c33647p = new C33647p(7);
                C33623c0 c33623c0 = new C33623c0();
                C35516c.m112678b(new C35373a(c33623c0, z4 ? 1 : 0));
                C35516c.m112678b(new C12593a(c33647p, AbstractC18045a.f70067a, 5));
                C35518e.m112679a(c16805j);
                C35516c.m112678b(new C35373a(c33623c0, objArr == true ? 1 : 0));
                String str = c16805j.f64567E;
                AbstractC32309k.m100574c(str);
                AbstractC11464a.m30761a(str);
                throw new IllegalStateException("ShopPayHandlers not found");
            case 14:
                return AbstractC16827t.m47424f((C0764g) obj);
            case 15:
                AbstractC22676k.m65750j((EnumC15209z3) obj, "it");
                return Boolean.TRUE;
            case 16:
                return AbstractC16850d.m47474c((C39336i) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC16932d.m47653q(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC16932d.m47659w(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC16933e.m47673d((C39336i) obj);
            case 20:
                return AbstractC16933e.m47674e((C39336i) obj);
            case 21:
                return AbstractC16976e.m47747k((InterfaceC14136a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC16978g.m47778q((InterfaceC14136a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC16979h.m47796j((InterfaceC14136a) obj);
            case 24:
                return AbstractC16990g.m47834m((C16995l) obj);
            case 25:
                return AbstractC16990g.m47835n(obj);
            case 26:
                return AbstractC17012e.m47977e(obj);
            case 27:
                return AbstractC17024b.m48042z((Modifier) obj);
            case 28:
                return AbstractC17024b.m48010B((Modifier) obj);
            default:
                return AbstractC17024b.m48029m(obj);
        }
    }
}
