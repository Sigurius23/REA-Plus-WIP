package js2;

import a01.EnumC0093m;
import androidx.health.platform.client.proto.C1533u;
import b72.C2787e;
import com.whoop.stories.OnboardingStoriesDebugFragment;
import j93.InterfaceC21493z;
import kk1.AbstractC22546g;
import l72.AbstractC23402i;
import l83.C23454a0;
import ld0.EnumC23849h;
import lf0.AbstractC23917f2;
import lf0.AbstractC23970t;
import lw1.AbstractC24770f;
import m01.AbstractC24876d;
import m80.AbstractC25224f;
import mf0.AbstractC25506e;
import no0.AbstractC26951i;
import no0.AbstractC26958l0;
import no0.AbstractC26962n0;
import nw0.AbstractC27200g;
import o72.AbstractC27647h;
import ox0.AbstractC28449c;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p181h2.C16617b;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p724or1.Function2;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: js2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C21927e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84689w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f84690x;

    public /* synthetic */ C21927e(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f84689w = i13;
        this.f84690x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84689w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC28601c1 interfaceC28601c1 = this.f84690x;
        switch (i13) {
            case 0:
                return AbstractC21928f.m62429B(interfaceC28601c1, obj);
            case 1:
                return AbstractC22546g.m65244l0(interfaceC28601c1, ((Boolean) obj).booleanValue());
            case 2:
                InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj;
                if (!AbstractC39414r.m125890i0((CharSequence) interfaceC28601c1.getValue())) {
                    String str = (String) interfaceC28601c1.getValue();
                    InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                    ((C18030l) interfaceC18044z).m51772e(AbstractC18039u.f70029K, str);
                }
                return c23454a0;
            case 3:
                interfaceC28601c1.setValue((InterfaceC39147y) obj);
                return c23454a0;
            case 4:
                return AbstractC23402i.m67761B(interfaceC28601c1, (String) obj);
            case 5:
                return AbstractC23402i.m67764E(interfaceC28601c1, (String) obj);
            case 6:
                return AbstractC23970t.m70688y(interfaceC28601c1, ((Boolean) obj).booleanValue());
            case 7:
                return AbstractC23917f2.m70344x(interfaceC28601c1, obj);
            case 8:
                return AbstractC23917f2.m70310B(interfaceC28601c1, (EnumC0093m) obj);
            case 9:
                return AbstractC23917f2.m70311C(interfaceC28601c1, (EnumC23849h) obj);
            case 10:
                return OnboardingStoriesDebugFragment.m26128Q(interfaceC28601c1, (String) obj);
            case 11:
                return AbstractC24770f.m72566n(interfaceC28601c1, (String) obj);
            case 12:
                return AbstractC24876d.m72946w(interfaceC28601c1, (C16617b) obj);
            case 13:
                return AbstractC25224f.m73929q(interfaceC28601c1, (String) obj);
            case 14:
                return AbstractC25506e.m74934Y(interfaceC28601c1, (String) obj);
            case 15:
                InterfaceC15250v it = (InterfaceC15250v) obj;
                AbstractC22676k.m65750j(it, "it");
                interfaceC28601c1.setValue(Boolean.valueOf(((EnumC15251w) it).m43354b()));
                return c23454a0;
            case 16:
                InterfaceC15250v it3 = (InterfaceC15250v) obj;
                AbstractC22676k.m65750j(it3, "it");
                interfaceC28601c1.setValue(Boolean.valueOf(((EnumC15251w) it3).m43354b()));
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC15250v it4 = (InterfaceC15250v) obj;
                AbstractC22676k.m65750j(it4, "it");
                interfaceC28601c1.setValue(Boolean.valueOf(((EnumC15251w) it4).m43354b()));
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC26951i.m80533n(interfaceC28601c1, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC26958l0.m80590E0(interfaceC28601c1, obj);
            case 20:
                return AbstractC26958l0.m80658m0(interfaceC28601c1, (C39180l) obj);
            case 21:
                return AbstractC26962n0.m80717s(interfaceC28601c1, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC27200g.m81795T(interfaceC28601c1, ((Boolean) obj).booleanValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC27647h.m83515Z(interfaceC28601c1, (String) obj);
            case 24:
                return AbstractC27647h.m83521c0(interfaceC28601c1, (String) obj);
            case 25:
                return AbstractC27647h.m83514Y(interfaceC28601c1, (C2787e) obj);
            case 26:
                return AbstractC27647h.m83519b0(interfaceC28601c1, (C2787e) obj);
            case 27:
                return Function2.m85152j(interfaceC28601c1, (String) obj);
            case 28:
                return Function2.m85153k(interfaceC28601c1, ((Boolean) obj).booleanValue());
            default:
                return AbstractC28449c.m86232o(interfaceC28601c1, (String) obj);
        }
    }
}
