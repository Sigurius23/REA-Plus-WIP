package p90;

import a81.InterfaceC0569t;
import androidx.health.platform.client.proto.C1533u;
import lj2.AbstractC24475a;
import ny2.AbstractC27299a;
import p164g2.InterfaceC15250v;
import p715kotlin.jvm.functions.Function1;
import p733ry2.AbstractC31916e;
import pj2.AbstractC29304c;
import pj2.AbstractC29310i;
import pj2.AbstractC29318q;
import pp1.AbstractC29436i;
import pz0.AbstractC29641d;
import q01.AbstractC29745a;
import q71.AbstractC30013d;
import q71.C30010a;
import qj2.AbstractC30436a;
import qj2.AbstractC30437b;
import qv1.AbstractC30650a;
import r41.AbstractC30924h;
import r90.AbstractC31096c;
import r90.AbstractC31099f;
import re1.AbstractC31323j;
import s32.AbstractC32111c;
import s32.AbstractC32114f;
import s41.AbstractC32195c;
import sc0.AbstractC32359g;
import sc0.AbstractC32360h;

/* JADX INFO: renamed from: p90.h */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C29000h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117317w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f117318x;

    public /* synthetic */ C29000h(Function1 function1, int i13) {
        this.f117317w = i13;
        this.f117318x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f117317w) {
            case 0:
                return AbstractC29001i.m88087k(this.f117318x, obj);
            case 1:
                return AbstractC29304c.m88956f(this.f117318x, ((Integer) obj).intValue());
            case 2:
                return AbstractC29310i.m89071u0(this.f117318x, obj);
            case 3:
                return AbstractC29310i.m89019Z0(this.f117318x, (AbstractC24475a.h) obj);
            case 4:
                return AbstractC29310i.m88999P0(this.f117318x, obj);
            case 5:
                return AbstractC29310i.m89025b1(this.f117318x, obj);
            case 6:
                return AbstractC29310i.m89028c1(this.f117318x, obj);
            case 7:
                return AbstractC29310i.m89031d1(this.f117318x, obj);
            case 8:
                return AbstractC29318q.m89116N(this.f117318x, obj);
            case 9:
                return AbstractC29318q.m89134b0(this.f117318x, obj);
            case 10:
                return AbstractC29436i.m89711B0(this.f117318x, obj);
            case 11:
                return AbstractC29641d.m91045g(this.f117318x, ((Boolean) obj).booleanValue());
            case 12:
                return AbstractC29745a.m91190e(this.f117318x, (String) obj);
            case 13:
                return AbstractC29745a.m91191f(this.f117318x, (String) obj);
            case 14:
                return C30010a.m91859d(this.f117318x, obj);
            case 15:
                return AbstractC30013d.m91880k(this.f117318x, obj);
            case 16:
                return AbstractC30436a.m93094w(this.f117318x, (AbstractC24475a.h) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC30437b.m93108m(this.f117318x, ((Integer) obj).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC30650a.m94214d(this.f117318x, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC30924h.m95064E(this.f117318x, (InterfaceC15250v) obj);
            case 20:
                return AbstractC31096c.m95762k(this.f117318x, ((Boolean) obj).booleanValue());
            case 21:
                return AbstractC31099f.m95791n(this.f117318x, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC31323j.m96344R(this.f117318x, ((Integer) obj).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC31916e.m99306F(this.f117318x, (AbstractC27299a) obj);
            case 24:
                return AbstractC32111c.m99949r(this.f117318x, obj);
            case 25:
                return AbstractC32114f.m99971t(this.f117318x, obj);
            case 26:
                return AbstractC32195c.m100134e(this.f117318x, (String) obj);
            case 27:
                return AbstractC32195c.m100135f(this.f117318x, (String) obj);
            case 28:
                return AbstractC32359g.m100754m(this.f117318x, obj);
            default:
                return AbstractC32360h.m100772k(this.f117318x, (InterfaceC0569t) obj);
        }
    }
}
