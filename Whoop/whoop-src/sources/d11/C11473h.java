package d11;

import a30.C0314n1;
import a30.EnumC0293g1;
import ab0.AbstractC0706a;
import ac0.AbstractC0736a;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import bb0.AbstractC2922b;
import bc0.AbstractC2978a;
import com.whoop.whoopaction.domain.models.Action;
import d30.C11561s0;
import d42.AbstractC11700p;
import d62.AbstractC11737c;
import d62.AbstractC11741g;
import d80.AbstractC11769e;
import d80.AbstractC11772h;
import d90.AbstractC11811b;
import db0.AbstractC11887c;
import dc0.AbstractC11903e;
import h80.InterfaceC17002b;
import j80.InterfaceC21414b;
import kd0.InterfaceC22381a;
import l80.AbstractC23438o;
import mh.C25540h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r20.C30879q;
import r20.InterfaceC30881s;

/* JADX INFO: renamed from: d11.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11473h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36852w;

    public /* synthetic */ C11473h(int i13) {
        this.f36852w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z4;
        switch (this.f36852w) {
            case 0:
                return C11474i.m30806b((C25540h) obj);
            case 1:
                C0314n1 c0314n1 = (C0314n1) obj;
                if (c0314n1 != null) {
                    EnumC0293g1 enumC0293g1 = EnumC0293g1.f1026w;
                    if (c0314n1.m827b(enumC0293g1) == null && c0314n1.m826a(enumC0293g1) == null) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 2:
                InterfaceC30881s it = (InterfaceC30881s) obj;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(it instanceof C30879q);
            case 3:
                return ((C11561s0) obj).f37290f;
            case 4:
                return AbstractC11700p.m31257c0(((Boolean) obj).booleanValue());
            case 5:
                return AbstractC11700p.m31267h0((String) obj);
            case 6:
                return AbstractC11737c.m31383s(obj);
            case 7:
                return AbstractC11737c.m31374j(obj);
            case 8:
                return AbstractC11741g.m31428y(obj);
            case 9:
                return AbstractC11741g.m31425v(((Float) obj).floatValue());
            case 10:
                return AbstractC11769e.m31522n((InterfaceC21414b) obj);
            case 11:
                return AbstractC11769e.m31523o((AbstractC23438o) obj);
            case 12:
                return AbstractC11769e.m31534z((InterfaceC17002b) obj);
            case 13:
                return AbstractC11772h.m31552g((AbstractC23438o) obj);
            case 14:
                return AbstractC11772h.m31553h((InterfaceC17002b) obj);
            case 15:
                return AbstractC11811b.m31665d(obj);
            case 16:
                return AbstractC11887c.m31881P((AbstractC2922b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC11887c.m31915z((InterfaceC22381a.c) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC11887c.m31866A((AbstractC0706a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC11887c.m31871F((Modifier) obj);
            case 20:
                return AbstractC11887c.m31872G((Modifier) obj);
            case 21:
                return AbstractC11887c.m31873H((Modifier) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC11887c.m31882Q((Action) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC11887c.m31883R((InterfaceC22381a.c) obj);
            case 24:
                return AbstractC11887c.m31884S((AbstractC0706a) obj);
            case 25:
                return AbstractC11887c.m31912w((AbstractC2922b) obj);
            case 26:
                return AbstractC11887c.m31913x((Action) obj);
            case 27:
                return AbstractC11903e.m32036q((AbstractC0736a) obj);
            case 28:
                return AbstractC11903e.m32037r((InterfaceC22381a.c) obj);
            default:
                return AbstractC11903e.m32038s((AbstractC2978a) obj);
        }
    }
}
