package g40;

import androidx.health.platform.client.proto.C1533u;
import g41.AbstractC15460d;
import g51.AbstractC15492b;
import g80.AbstractC15561b;
import g90.AbstractC15600f;
import gb1.AbstractC15673b0;
import gd1.AbstractC15715b;
import ge.AbstractC15719d;
import ge0.AbstractC15727b;
import ge0.AbstractC15730e;
import gf1.AbstractC15788g;
import gf1.AbstractC15790i;
import gj0.C15914a;
import go1.AbstractC16017b;
import j93.InterfaceC21493z;
import java.util.Map;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.factories.MediaConstraintsFactory;
import p164g2.InterfaceC15241m;
import p208i2.InterfaceC17886g0;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p390p1.C28674u2;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25308q;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: g40.y1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15449y1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58038w;

    public /* synthetic */ C15449y1(int i13) {
        this.f58038w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f58038w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                C23465k c23465k = (C23465k) obj;
                AbstractC22676k.m65750j(c23465k, "<destruct>");
                Boolean bool = (Boolean) c23465k.f92938x;
                bool.booleanValue();
                return bool;
            case 1:
                return String.valueOf(((Boolean) obj).booleanValue());
            case 2:
                return new C23328a((String) obj, true);
            case 3:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                ((C18030l) semantics).m51772e(AbstractC18039u.f70041h, c23454a0);
                return c23454a0;
            case 4:
                AbstractC22676k.m65750j((InterfaceC18044z) obj, "$this$semantics");
                return c23454a0;
            case 5:
                String autofillType = (String) obj;
                AbstractC22676k.m65750j(autofillType, "autofillType");
                String msg = "LocalAutofillEventReporter " + autofillType + " event not reported";
                AbstractC22676k.m65750j(msg, "msg");
                return c23454a0;
            case 6:
                InterfaceC15241m focusProperties = (InterfaceC15241m) obj;
                AbstractC22676k.m65750j(focusProperties, "$this$focusProperties");
                focusProperties.mo534b(false);
                return c23454a0;
            case 7:
                C28674u2 c28674u2 = AbstractC15376j4.f57805a;
                return c23454a0;
            case 8:
                InterfaceC18044z clearAndSetSemantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
                return c23454a0;
            case 9:
                return AbstractC15460d.m43640u(obj);
            case 10:
                return AbstractC15460d.m43632m((InterfaceC17886g0) obj);
            case 11:
                return AbstractC15460d.m43633n((InterfaceC22129c) obj);
            case 12:
                return AbstractC15460d.m43636q((InterfaceC17886g0) obj);
            case 13:
                return AbstractC15460d.m43637r((InterfaceC22129c) obj);
            case 14:
                return AbstractC15492b.m43694e(obj);
            case 15:
                return AbstractC15561b.m43815b((C25308q) obj);
            case 16:
                return AbstractC15600f.m43907i(obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC15673b0.m44042i0((InterfaceC22131e) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC15673b0.m43982F((InterfaceC22131e) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC15673b0.m44074y0((InterfaceC22131e) obj);
            case 20:
                return AbstractC15673b0.m44022Z((InterfaceC22131e) obj);
            case 21:
                return AbstractC15715b.m44297b((C25308q) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC22676k.m65750j(entry, "entry");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (AbstractC39421y.m125921F((String) value, MediaConstraintsFactory.kValueTrue, true)) {
                    value = null;
                }
                return AbstractC15719d.m44301b("md", str, (String) value);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC15730e.m44325j((AbstractC15727b) obj);
            case 24:
                return AbstractC15788g.m44519o(obj);
            case 25:
                return AbstractC15788g.m44499E(obj);
            case 26:
                return AbstractC15790i.m44540j(obj);
            case 27:
                return AbstractC15790i.m44545o(obj);
            case 28:
                return C15914a.m44897p0((Map.Entry) obj);
            default:
                return AbstractC16017b.m45333g(((Boolean) obj).booleanValue());
        }
    }
}
