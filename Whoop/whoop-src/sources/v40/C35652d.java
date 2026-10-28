package v40;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.hcaptcha.config.HCaptchaTheme;
import com.whoop.access.omronauth.domain.models.OmronAuthModel;
import com.whoop.design.atomic.organism.expandablecontent.ExpandableContentHeaderPosition;
import com.whoop.design.atomic.organism.expandablecontent.ExpandableContentLayout;
import com.whoop.design.models.colortheme.ColorBackgroundModel;
import com.whoop.design.models.colortheme.ColorBackgroundType;
import com.whoop.design.models.colortheme.ColorValueModel;
import com.whoop.design.models.items.hrzonesrow.HrZonesRowModel;
import j93.InterfaceC21461d;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;
import v41.AbstractC35660d;
import v41.AbstractC35661d0;
import v41.AbstractC35662e;
import v41.AbstractC35667g0;
import v41.AbstractC35687q0;
import v71.AbstractC35763d;
import v90.AbstractC35822n;
import v90.AbstractC35829u;
import v90.C35819k;
import v90.C35827s;
import vb2.C35871a;
import vc3.C35888g;
import vc3.C35893l;
import vc3.C35894m;
import wc3.C37142g;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: v40.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C35652d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151471w;

    public /* synthetic */ C35652d(int i13) {
        this.f151471w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f151471w) {
            case 0:
                return HCaptchaTheme._init_$_anonymous_();
            case 1:
                return AbstractC35660d.m112872n();
            case 2:
                return AbstractC35660d.m112873o();
            case 3:
                return AbstractC35662e.m112944h();
            case 4:
                return AbstractC35662e.m112945i();
            case 5:
                return AbstractC35662e.m112946j();
            case 6:
                return AbstractC35661d0.m112889E();
            case 7:
                return AbstractC35667g0.m112969k();
            case 8:
                return AbstractC35687q0.m113103m();
            case 9:
                return AbstractC35687q0.m113104n();
            case 10:
                return OmronAuthModel._childSerializers$_anonymous_();
            case 11:
                return ExpandableContentHeaderPosition._init_$_anonymous_();
            case 12:
                return ExpandableContentLayout._init_$_anonymous_();
            case 13:
                return AbstractC35763d.m113315e();
            case 14:
                return C35819k.m113601b();
            case 15:
                return AbstractC35822n.m113622h();
            case 16:
                return C35827s.m113687b();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC35829u.m113709g();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ColorBackgroundModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ColorBackgroundModel._childSerializers$_anonymous_$0();
            case 20:
                return ColorBackgroundType._init_$_anonymous_();
            case 21:
                return ColorValueModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return HrZonesRowModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return HrZonesRowModel.HrZone._childSerializers$_anonymous_();
            case 24:
                return C35871a.m113901l();
            case 25:
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                return new C37142g("kotlinx.datetime.DateTimeUnit.DateBased", c22673i0.getOrCreateKotlinClass(DateTimeUnit.DateBased.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(DateTimeUnit.DayBased.class), c22673i0.getOrCreateKotlinClass(DateTimeUnit.MonthBased.class)}, new InterfaceC37138c[]{C35888g.f152813a, C35893l.f152823a});
            case 26:
                C22673i0 c22673i1 = AbstractC22671h0.f89337a;
                return new C37142g("kotlinx.datetime.DateTimeUnit", c22673i1.getOrCreateKotlinClass(DateTimeUnit.class), new InterfaceC21461d[]{c22673i1.getOrCreateKotlinClass(DateTimeUnit.DayBased.class), c22673i1.getOrCreateKotlinClass(DateTimeUnit.MonthBased.class), c22673i1.getOrCreateKotlinClass(DateTimeUnit.TimeBased.class)}, new InterfaceC37138c[]{C35888g.f152813a, C35893l.f152823a, C35894m.f152825a});
            case 27:
                InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
                if (AbstractC39414r.m125890i0("kotlinx.datetime.DayBased")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                C39437a c39437a = new C39437a("kotlinx.datetime.DayBased");
                c39437a.m125993a("days", IntSerializer.INSTANCE.getDescriptor(), false);
                return new C39444h("kotlinx.datetime.DayBased", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
            case 28:
                InterfaceC39443g[] interfaceC39443gArr2 = new InterfaceC39443g[0];
                if (AbstractC39414r.m125890i0("kotlinx.datetime.MonthBased")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                C39437a c39437a2 = new C39437a("kotlinx.datetime.MonthBased");
                c39437a2.m125993a("months", IntSerializer.INSTANCE.getDescriptor(), false);
                return new C39444h("kotlinx.datetime.MonthBased", C39448l.f169713a, c39437a2.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr2), c39437a2);
            default:
                InterfaceC39443g[] interfaceC39443gArr3 = new InterfaceC39443g[0];
                if (AbstractC39414r.m125890i0("kotlinx.datetime.TimeBased")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                C39437a c39437a3 = new C39437a("kotlinx.datetime.TimeBased");
                c39437a3.m125993a("nanoseconds", LongSerializer.INSTANCE.getDescriptor(), false);
                return new C39444h("kotlinx.datetime.TimeBased", C39448l.f169713a, c39437a3.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr3), c39437a3);
        }
    }
}
