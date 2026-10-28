package p004a2;

import a40.AbstractC0357b;
import a40.AbstractC0359d;
import a40.AbstractC0361f;
import a40.C0362g;
import a40.C0363h;
import a40.C0364i;
import a61.AbstractC0471d;
import a80.C0538b;
import a81.AbstractC0564o;
import ad1.C0751b;
import al0.C0975j;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.access.programgoaltile.models.ProgramGoalTileModel;
import com.whoop.design.models.items.clinicalreportcard.ClinicalReportCardModel;
import com.whoop.design.models.items.recommendationtileheader.RecommendationTileHeaderModel;
import com.whoop.shepherd.feature.registration.domain.models.RegulatoryInformationResponse;
import com.whoop.shepherd.feature.registration.domain.models.ShepherdRegistrationResponse;
import p390p1.C28674u2;

/* JADX INFO: renamed from: a2.d */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0155d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f479w;

    public /* synthetic */ C0155d(int i13) {
        this.f479w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f479w) {
            case 0:
                C28674u2 c28674u2 = AbstractC0156e.f480a;
                return null;
            case 1:
                C28674u2 c28674u3 = AbstractC0357b.f1240a;
                return C0362g.f1243w;
            case 2:
                C28674u2 c28674u4 = AbstractC0359d.f1241a;
                return C0363h.f1244w;
            case 3:
                C28674u2 c28674u5 = AbstractC0361f.f1242a;
                return C0364i.f1245w;
            case 4:
                return ProgramGoalTileModel._childSerializers$_anonymous_();
            case 5:
                return AbstractC0471d.m1149D();
            case 6:
                return AbstractC0471d.m1151F();
            case 7:
                return C0538b.m1314e();
            case 8:
                return AbstractC0564o.m1395Q();
            case 9:
                return AbstractC0564o.m1400V();
            case 10:
                return ClinicalReportCardModel._childSerializers$_anonymous_();
            case 11:
                return RecommendationTileHeaderModel._childSerializers$_anonymous_();
            case 12:
                return RecommendationTileHeaderModel._childSerializers$_anonymous_$0();
            case 13:
                return RecommendationTileHeaderModel._childSerializers$_anonymous_$1();
            case 14:
                return RecommendationTileHeaderModel._childSerializers$_anonymous_$2();
            case 15:
                return RecommendationTileHeaderModel._childSerializers$_anonymous_$3();
            case 16:
                return RecommendationTileHeaderModel._childSerializers$_anonymous_$4();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C0751b.m1827f();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C0751b.m1828g();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return RegulatoryInformationResponse._childSerializers$_anonymous_();
            case 20:
                return ShepherdRegistrationResponse._childSerializers$_anonymous_();
            case 21:
                return C0975j.m2622o2();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C0975j.m2493I2();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C0975j.m2629q1();
            case 24:
                return C0975j.m2465B2();
            case 25:
                return C0975j.m2485G2();
            case 26:
                return C0975j.m2545V2();
            case 27:
                return C0975j.m2501K2();
            case 28:
                return C0975j.m2637s1();
            default:
                return C0975j.m2654w2();
        }
    }
}
