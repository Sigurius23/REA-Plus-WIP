package a13;

import ad3.C0756b0;
import ad3.C0760d0;
import ad3.C0763f;
import ad3.C0777t;
import ad3.C0781x;
import androidx.health.platform.client.proto.C1533u;
import b52.C2742b;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bh2.C3253b;
import c03.AbstractC3813a;
import c93.InterfaceC4339a;
import com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow;
import com.whoop.data.remote.domain.response.AllowedLanguagesResponseDto;
import com.whoop.data.repositories.C6659f;
import com.whoop.weeklyplan.hometile.domain.api.PlanItem;
import com.whoop.weeklyplan.hometile.domain.api.ProgressPercentage;
import com.whoop.weeklyplan.hometile.domain.api.ProgressSteps;
import com.whoop.weeklyplan.hometile.domain.api.WeeklyPlanHometile;
import com.whoop.weeklyplan.hometile.domain.api.WeeklyPlanHometileResponse;
import dp0.AbstractC12252h;
import e61.AbstractC12765h;
import em1.C13326a0;
import hc3.AbstractC17182o;
import kc3.C22365e;
import p004a2.AbstractC0157f;
import p390p1.C28674u2;
import p668z1.C39973v;
import ud3.C34826l0;

/* JADX INFO: renamed from: a13.f */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0148f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f463w;

    public /* synthetic */ C0148f(int i13) {
        this.f463w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f463w) {
            case 0:
                C22365e c22365e = AbstractC3050q0.f12077a;
                return AbstractC3006f0.m8708b(AbstractC17182o.f65999a);
            case 1:
                C28674u2 c28674u2 = AbstractC0157f.f481a;
                return null;
            case 2:
                return C0760d0.f2766a.getDescriptor();
            case 3:
                return C0781x.f2815a.getDescriptor();
            case 4:
                return C0777t.f2812a.getDescriptor();
            case 5:
                return C0756b0.f2760a.getDescriptor();
            case 6:
                return C0763f.f2772a.getDescriptor();
            case 7:
                return Boolean.TRUE;
            case 8:
                return C2742b.m7759w();
            case 9:
                return C2742b.m7760x();
            case 10:
                return C2742b.m7761y();
            case 11:
                return C2742b.m7724A();
            case 12:
                return new C34826l0();
            case 13:
                return C3253b.m9471q();
            case 14:
                return AllowedLanguagesResponseDto._childSerializers$_anonymous_();
            case 15:
                return AbstractC3813a.m11680i();
            case 16:
                C39973v c39973v = new C39973v(new C6659f(2));
                c39973v.m128205e();
                return c39973v;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC12252h.m34152b();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return PlanItem._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ProgressPercentage._childSerializers$_anonymous_();
            case 20:
                return ProgressSteps._childSerializers$_anonymous_();
            case 21:
                return ProgressSteps._childSerializers$_anonymous_$0();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return WeeklyPlanHometile._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return WeeklyPlanHometileResponse._childSerializers$_anonymous_();
            case 24:
                return AbstractC12765h.m35734p();
            case 25:
                return AbstractC12765h.m35736r();
            case 26:
                return AbstractC12765h.m35737s();
            case 27:
                return AbstractC12765h.m35738t();
            case 28:
                return Boolean.valueOf(C13326a0.m37450r());
            default:
                return AiContextMetadataBottomRow._childSerializers$_anonymous_();
        }
    }
}
