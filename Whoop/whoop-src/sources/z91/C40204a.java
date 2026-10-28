package z91;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.behaviordetails.ImpactDetailCardModel;
import com.whoop.design.models.items.behaviordetails.ImpactMagnitudeQuestionsModel;
import com.whoop.design.models.items.behaviordetails.MagnitudeQuestionGroup;
import com.whoop.design.models.items.behaviordetails.MagnitudeQuestionItem;
import com.whoop.design.models.items.recommendationtile.RecommendationTileButtonModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileGroupModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileLayoutStyle;
import com.whoop.design.models.items.recommendationtile.RecommendationTileModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileStatus;
import p748zc1.AbstractC40292c5;
import p748zc1.AbstractC40359i6;
import p748zc1.AbstractC40380k5;
import p748zc1.AbstractC40407n;
import p748zc1.AbstractC40423o5;
import p748zc1.AbstractC40532z4;

/* JADX INFO: renamed from: z91.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40204a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f173570w;

    public /* synthetic */ C40204a(int i13) {
        this.f173570w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f173570w) {
            case 0:
                return ImpactDetailCardModel._childSerializers$_anonymous_();
            case 1:
                return ImpactMagnitudeQuestionsModel._childSerializers$_anonymous_();
            case 2:
                return MagnitudeQuestionGroup._childSerializers$_anonymous_();
            case 3:
                return MagnitudeQuestionItem._childSerializers$_anonymous_();
            case 4:
                return RecommendationTileButtonModel._childSerializers$_anonymous_();
            case 5:
                return RecommendationTileButtonModel._childSerializers$_anonymous_$0();
            case 6:
                return RecommendationTileButtonModel._childSerializers$_anonymous_$1();
            case 7:
                return RecommendationTileGroupModel._childSerializers$_anonymous_();
            case 8:
                return RecommendationTileGroupModel._childSerializers$_anonymous_$0();
            case 9:
                return RecommendationTileGroupModel._childSerializers$_anonymous_$1();
            case 10:
                return RecommendationTileLayoutStyle._init_$_anonymous_();
            case 11:
                return RecommendationTileModel._childSerializers$_anonymous_();
            case 12:
                return RecommendationTileModel._childSerializers$_anonymous_$0();
            case 13:
                return RecommendationTileModel._childSerializers$_anonymous_$1();
            case 14:
                return RecommendationTileModel._childSerializers$_anonymous_$2();
            case 15:
                return RecommendationTileModel._childSerializers$_anonymous_$3();
            case 16:
                return RecommendationTileModel._childSerializers$_anonymous_$4();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return RecommendationTileStatus._init_$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40407n.m130406h();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40407n.m130407i();
            case 20:
                return AbstractC40532z4.m131312d();
            case 21:
                return AbstractC40292c5.m129459v();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40292c5.m129460w();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40380k5.m130186h();
            case 24:
                return AbstractC40423o5.m130550t();
            case 25:
                return AbstractC40423o5.m130547q();
            case 26:
                return AbstractC40423o5.m130552v();
            case 27:
                return AbstractC40423o5.m130554x();
            case 28:
                return AbstractC40359i6.m130014u();
            default:
                return AbstractC40359i6.m130015v();
        }
    }
}
