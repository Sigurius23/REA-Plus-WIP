package ej1;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.coacheverywherecommon.models.CoachEntryData;
import com.whoop.communityreactions.domain.model.ReactionCommentModel;
import com.whoop.communityreactions.domain.model.ReactionsInputModel;
import com.whoop.communityreactions.domain.model.ReactionsResponse;
import com.whoop.integrations.domain.models.p061v2.IntegrationsConnectionSectionRowModel;
import com.whoop.integrations.domain.models.p061v2.IntegrationsDetailsV2ComponentsModel;
import ek2.AbstractC13304a;
import ek2.AbstractC13305b;
import ek2.AbstractC13306c;
import ep1.AbstractC13418m;
import ep1.AbstractC13424s;
import ep1.AbstractC13426u;
import ev1.C13683b;
import f01.AbstractC13907w;
import f02.AbstractC13916b;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p133f1.C13926b1;
import p706eo0.AbstractC13376g;

/* JADX INFO: renamed from: ej1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13228a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45841w;

    public /* synthetic */ C13228a(int i13) {
        this.f45841w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f45841w) {
            case 0:
                return C13230b.m37144h();
            case 1:
                return AbstractC13304a.m37372k();
            case 2:
                return AbstractC13305b.m37387h();
            case 3:
                return AbstractC13306c.m37400h();
            case 4:
                return AbstractC13306c.m37401i();
            case 5:
                return AbstractC13376g.m37693O();
            case 6:
                return AbstractC13376g.m37695Q();
            case 7:
                return AbstractC13376g.m37698T();
            case 8:
                return AbstractC13376g.m37699U();
            case 9:
                return AiContextMetadata._childSerializers$_anonymous_();
            case 10:
                return AiContextMetadata._childSerializers$_anonymous_$0();
            case 11:
                return CoachEntryData._childSerializers$_anonymous_();
            case 12:
                return CoachEntryData._childSerializers$_anonymous_$0();
            case 13:
                return CoachEntryData._childSerializers$_anonymous_$1();
            case 14:
                return AbstractC13418m.m38004r();
            case 15:
                return AbstractC13418m.m38005s();
            case 16:
                return AbstractC13424s.m38063f();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC13424s.m38064g();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13426u.m38087u();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return IntegrationsConnectionSectionRowModel._childSerializers$_anonymous_();
            case 20:
                return IntegrationsDetailsV2ComponentsModel._childSerializers$_anonymous_();
            case 21:
                return ReactionCommentModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ReactionsInputModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ReactionsResponse._childSerializers$_anonymous_();
            case 24:
                return ReactionsResponse._childSerializers$_anonymous_$0();
            case 25:
                return C13683b.m38607e();
            case 26:
                return AbstractC13907w.m39598g();
            case 27:
                return AbstractC13916b.m39654k();
            case 28:
                C22365e c22365e = AbstractC3050q0.f12077a;
                return ExecutorC22364d.f87316w;
            default:
                return new C13926b1(1L);
        }
    }
}
