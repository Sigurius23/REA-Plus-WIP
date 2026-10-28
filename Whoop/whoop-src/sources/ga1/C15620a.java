package ga1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.bottomnavigation.domain.models.BottomNavCoachConfig;
import com.whoop.design.models.items.graph.GraphLegendTheme;
import com.whoop.design.models.items.graph.GraphingCardTheme;
import com.whoop.design.models.items.graph.ZoomableGraphModel;
import com.whoop.healthspan.domain.models.ContributorsContainerResponse;
import com.whoop.healthspan.domain.models.HealthspanResponse;
import com.whoop.healthspan.domain.models.HealthspanVowModel;
import com.whoop.healthspan.domain.models.LabsImpactCardModel;
import com.whoop.healthspan.domain.models.LockedContent;
import com.whoop.healthspan.domain.models.MetaData;
import com.whoop.healthspan.domain.models.SingleContributorContainerContent;
import com.whoop.healthspan.domain.models.TileSectionModel;
import com.whoop.healthspan.domain.models.UnlockedContentResponse;
import com.whoop.share.model.ShareAsset;
import com.whoop.share.model.ShareResponse;
import com.whoop.share.model.ShareRouteMapModel;
import com.whoop.tombstone.PaginatedReleaseTombstoneResponse;
import com.whoop.trendsminiarch.domain.models.TrendsMiniArchModels;
import gb1.AbstractC15674c;
import gf1.AbstractC15783b;
import gh0.AbstractC15847b;
import live.hms.video.connection.stats.clientside.sampler.PublishAudioStatsSampler;
import live.hms.video.connection.stats.clientside.sampler.PublishVideoStatsSampler;
import live.hms.video.connection.stats.clientside.sampler.SubscribeAudioStatsSampler;
import live.hms.video.connection.stats.clientside.sampler.SubscribeVideoStatsSampler;

/* JADX INFO: renamed from: ga1.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15620a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58646w;

    public /* synthetic */ C15620a(int i13) {
        this.f58646w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f58646w) {
            case 0:
                return GraphLegendTheme._childSerializers$_anonymous_$1();
            case 1:
                return GraphingCardTheme._childSerializers$_anonymous_();
            case 2:
                return ZoomableGraphModel._childSerializers$_anonymous_();
            case 3:
                return Float.valueOf(AbstractC15674c.m44086j());
            case 4:
                return ShareAsset._childSerializers$_anonymous_();
            case 5:
                return ShareResponse._childSerializers$_anonymous_();
            case 6:
                return ShareResponse._childSerializers$_anonymous_$0();
            case 7:
                return ShareRouteMapModel._childSerializers$_anonymous_();
            case 8:
                return ShareRouteMapModel._childSerializers$_anonymous_$0();
            case 9:
                return PublishAudioStatsSampler.localAudioSamples_delegate$lambda$0();
            case 10:
                return PublishVideoStatsSampler.localVideoSamples_delegate$lambda$0();
            case 11:
                return SubscribeAudioStatsSampler.subscribeAudioStatsSample_delegate$lambda$0();
            case 12:
                return SubscribeVideoStatsSampler.subscribeVideoStatsSample_delegate$lambda$0();
            case 13:
                return AbstractC15783b.m44490b();
            case 14:
                return AbstractC15847b.m44692i();
            case 15:
                return ContributorsContainerResponse._childSerializers$_anonymous_();
            case 16:
                return HealthspanResponse._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return HealthspanVowModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return LabsImpactCardModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return LockedContent._childSerializers$_anonymous_();
            case 20:
                return MetaData._childSerializers$_anonymous_();
            case 21:
                return SingleContributorContainerContent._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SingleContributorContainerContent._childSerializers$_anonymous_$0();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return TileSectionModel._childSerializers$_anonymous_();
            case 24:
                return UnlockedContentResponse._childSerializers$_anonymous_();
            case 25:
                return UnlockedContentResponse._childSerializers$_anonymous_$0();
            case 26:
                return UnlockedContentResponse._childSerializers$_anonymous_$1();
            case 27:
                return PaginatedReleaseTombstoneResponse._childSerializers$_anonymous_();
            case 28:
                return BottomNavCoachConfig._childSerializers$_anonymous_();
            default:
                return TrendsMiniArchModels._childSerializers$_anonymous_();
        }
    }
}
