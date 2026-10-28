package com.whoop.core.details.network.model.recoveryv2;

import com.whoop.core.details.network.model.DetailsEditComponent;
import com.whoop.core.details.network.model.DetailsEditComponent$$serializer;
import com.whoop.core.details.network.model.TagModel;
import com.whoop.core.details.network.model.TagModel$$serializer;
import com.whoop.core.details.network.model.TitleBarModel;
import com.whoop.core.details.network.model.TitleBarModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AchievementProgressCardModel;
import com.whoop.design.models.items.AchievementProgressCardModel$$serializer;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.BarGraphContainerModel$$serializer;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.HorizontalStatModel$$serializer;
import com.whoop.design.models.items.KeyMetricCarouselModel;
import com.whoop.design.models.items.KeyMetricCarouselModel$$serializer;
import com.whoop.design.models.items.MapModel;
import com.whoop.design.models.items.MapModel$$serializer;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.WhoopCoachVowModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fw0.C14833a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p133f1.C13998z1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 p2\u00020\u0001:\u0002qpBµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!BÕ\u0001\b\u0010\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b \u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b-\u0010*J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003¢\u0006\u0004\b.\u0010*J\u0012\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004HÆ\u0003¢\u0006\u0004\b7\u0010*J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u0010*J\u0012\u00109\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004HÆ\u0003¢\u0006\u0004\b=\u0010*J\u0012\u0010>\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b>\u0010?JØ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\"HÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\u00192\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IJ'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010(R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010U\u0012\u0004\bW\u0010X\u001a\u0004\bV\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010Y\u001a\u0004\bZ\u0010,R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010U\u001a\u0004\b[\u0010*R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010U\u0012\u0004\b]\u0010X\u001a\u0004\b\\\u0010*R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010^\u0012\u0004\b`\u0010X\u001a\u0004\b_\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010a\u001a\u0004\bb\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010c\u001a\u0004\bd\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010e\u001a\u0004\bf\u00106R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010U\u001a\u0004\bg\u0010*R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bh\u0010*R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010i\u001a\u0004\bj\u0010:R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010k\u001a\u0004\bl\u0010<R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010U\u001a\u0004\bm\u0010*R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010n\u001a\u0004\bo\u0010?¨\u0006r"}, m65681d2 = {"Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "", "Lcom/whoop/core/details/network/model/TitleBarModel;", "titleBar", "", "Lcom/whoop/design/models/items/HorizontalStatModel;", "horizontalStat", "Lcom/whoop/design/models/items/KeyMetricCarouselModel;", "keyMetricCarousel", "Lcom/whoop/core/details/network/model/recoveryv2/SegmentedControlDisplayModel;", "segmentedControlDisplay", "Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;", "graphResponse", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "heartRateZoneContainer", "Lcom/whoop/design/models/DesignSystemModel;", "integrationPromoCard", "Lcom/whoop/design/models/items/AchievementProgressCardModel;", "achievementProgressCard", "Lcom/whoop/design/models/items/MapModel;", "map", "Lcom/whoop/core/details/network/model/TagModel;", "tags", "Lcom/whoop/design/models/items/TagModel;", "tagsV2", "", "editable", "Lcom/whoop/core/details/network/model/DetailsEditComponent;", "detailsEditComponents", "tiles", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "whoopCoachVow", "<init>", "(Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/core/details/network/model/TitleBarModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/KeyMetricCarouselModel;", "component4", "component5", "component6", "()Lcom/whoop/design/models/items/BarGraphContainerModel;", "component7", "()Lcom/whoop/design/models/DesignSystemModel;", "component8", "()Lcom/whoop/design/models/items/AchievementProgressCardModel;", "component9", "()Lcom/whoop/design/models/items/MapModel;", "component10", "component11", "component12", "()Ljava/lang/Boolean;", "component13", "()Lcom/whoop/core/details/network/model/DetailsEditComponent;", "component14", "component15", "()Lcom/whoop/design/models/items/WhoopCoachVowModel;", "copy", "(Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/core/details/network/model/TitleBarModel;", "getTitleBar", "Ljava/util/List;", "getHorizontalStat", "getHorizontalStat$annotations", "()V", "Lcom/whoop/design/models/items/KeyMetricCarouselModel;", "getKeyMetricCarousel", "getSegmentedControlDisplay", "getGraphResponse", "getGraphResponse$annotations", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "getHeartRateZoneContainer", "getHeartRateZoneContainer$annotations", "Lcom/whoop/design/models/DesignSystemModel;", "getIntegrationPromoCard", "Lcom/whoop/design/models/items/AchievementProgressCardModel;", "getAchievementProgressCard", "Lcom/whoop/design/models/items/MapModel;", "getMap", "getTags", "getTagsV2", "Ljava/lang/Boolean;", "getEditable", "Lcom/whoop/core/details/network/model/DetailsEditComponent;", "getDetailsEditComponents", "getTiles", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "getWhoopCoachVow", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecoveryDetailsModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final AchievementProgressCardModel achievementProgressCard;
    private final DetailsEditComponent detailsEditComponents;
    private final Boolean editable;
    private final List<GraphListItemModel> graphResponse;
    private final BarGraphContainerModel heartRateZoneContainer;
    private final List<HorizontalStatModel> horizontalStat;
    private final DesignSystemModel integrationPromoCard;
    private final KeyMetricCarouselModel keyMetricCarousel;
    private final MapModel map;
    private final List<SegmentedControlDisplayModel> segmentedControlDisplay;
    private final List<TagModel> tags;
    private final List<com.whoop.design.models.items.TagModel> tagsV2;
    private final List<DesignSystemModel> tiles;
    private final TitleBarModel titleBar;
    private final WhoopCoachVowModel whoopCoachVow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecoveryDetailsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C13998z1(28)), null, AbstractC30060g.m92087G(enumC23463i, new C13998z1(29)), AbstractC30060g.m92087G(enumC23463i, new C14833a(0)), null, AbstractC30060g.m92087G(enumC23463i, new C14833a(1)), null, null, AbstractC30060g.m92087G(enumC23463i, new C14833a(2)), AbstractC30060g.m92087G(enumC23463i, new C14833a(3)), null, null, AbstractC30060g.m92087G(enumC23463i, new C14833a(4)), null};
    }

    public /* synthetic */ RecoveryDetailsModel(int i13, TitleBarModel titleBarModel, List list, KeyMetricCarouselModel keyMetricCarouselModel, List list2, List list3, BarGraphContainerModel barGraphContainerModel, DesignSystemModel designSystemModel, AchievementProgressCardModel achievementProgressCardModel, MapModel mapModel, List list4, List list5, Boolean bool, DetailsEditComponent detailsEditComponent, List list6, WhoopCoachVowModel whoopCoachVowModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (32575 != (i13 & 32575)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 32575, RecoveryDetailsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleBar = titleBarModel;
        this.horizontalStat = list;
        this.keyMetricCarousel = keyMetricCarouselModel;
        this.segmentedControlDisplay = list2;
        this.graphResponse = list3;
        this.heartRateZoneContainer = barGraphContainerModel;
        if ((i13 & 64) == 0) {
            this.integrationPromoCard = null;
        } else {
            this.integrationPromoCard = designSystemModel;
        }
        if ((i13 & 128) == 0) {
            this.achievementProgressCard = null;
        } else {
            this.achievementProgressCard = achievementProgressCardModel;
        }
        this.map = mapModel;
        this.tags = list4;
        this.tagsV2 = list5;
        this.editable = bool;
        this.detailsEditComponents = detailsEditComponent;
        this.tiles = list6;
        this.whoopCoachVow = whoopCoachVowModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HorizontalStatModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(SegmentedControlDisplayModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(GraphListItemModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return new ArrayListSerializer(TagModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        return new ArrayListSerializer(com.whoop.design.models.items.TagModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$5() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    @InterfaceC37143h("graphs")
    public static /* synthetic */ void getGraphResponse$annotations() {
    }

    @InterfaceC37143h("bar_graph_container")
    public static /* synthetic */ void getHeartRateZoneContainer$annotations() {
    }

    @InterfaceC37143h("horizontal_stats")
    public static /* synthetic */ void getHorizontalStat$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_details_release(RecoveryDetailsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, TitleBarModel$$serializer.INSTANCE, self.titleBar);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.horizontalStat);
        output.encodeSerializableElement(serialDesc, 2, KeyMetricCarouselModel$$serializer.INSTANCE, self.keyMetricCarousel);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.segmentedControlDisplay);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.graphResponse);
        output.encodeNullableSerializableElement(serialDesc, 5, BarGraphContainerModel$$serializer.INSTANCE, self.heartRateZoneContainer);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.integrationPromoCard != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.integrationPromoCard);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.achievementProgressCard != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, AchievementProgressCardModel$$serializer.INSTANCE, self.achievementProgressCard);
        }
        output.encodeNullableSerializableElement(serialDesc, 8, MapModel$$serializer.INSTANCE, self.map);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.tags);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.tagsV2);
        output.encodeNullableSerializableElement(serialDesc, 11, BooleanSerializer.INSTANCE, self.editable);
        output.encodeSerializableElement(serialDesc, 12, DetailsEditComponent$$serializer.INSTANCE, self.detailsEditComponents);
        output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.tiles);
        output.encodeNullableSerializableElement(serialDesc, 14, WhoopCoachVowModel$$serializer.INSTANCE, self.whoopCoachVow);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TitleBarModel getTitleBar() {
        return this.titleBar;
    }

    public final List<TagModel> component10() {
        return this.tags;
    }

    public final List<com.whoop.design.models.items.TagModel> component11() {
        return this.tagsV2;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getEditable() {
        return this.editable;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final DetailsEditComponent getDetailsEditComponents() {
        return this.detailsEditComponents;
    }

    public final List<DesignSystemModel> component14() {
        return this.tiles;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    public final List<HorizontalStatModel> component2() {
        return this.horizontalStat;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final KeyMetricCarouselModel getKeyMetricCarousel() {
        return this.keyMetricCarousel;
    }

    public final List<SegmentedControlDisplayModel> component4() {
        return this.segmentedControlDisplay;
    }

    public final List<GraphListItemModel> component5() {
        return this.graphResponse;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BarGraphContainerModel getHeartRateZoneContainer() {
        return this.heartRateZoneContainer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DesignSystemModel getIntegrationPromoCard() {
        return this.integrationPromoCard;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AchievementProgressCardModel getAchievementProgressCard() {
        return this.achievementProgressCard;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MapModel getMap() {
        return this.map;
    }

    public final RecoveryDetailsModel copy(TitleBarModel titleBar, List<HorizontalStatModel> horizontalStat, KeyMetricCarouselModel keyMetricCarousel, List<SegmentedControlDisplayModel> segmentedControlDisplay, List<GraphListItemModel> graphResponse, BarGraphContainerModel heartRateZoneContainer, DesignSystemModel integrationPromoCard, AchievementProgressCardModel achievementProgressCard, MapModel map, List<TagModel> tags, List<com.whoop.design.models.items.TagModel> tagsV2, Boolean editable, DetailsEditComponent detailsEditComponents, List<? extends DesignSystemModel> tiles, WhoopCoachVowModel whoopCoachVow) {
        AbstractC22676k.m65750j(titleBar, "titleBar");
        AbstractC22676k.m65750j(horizontalStat, "horizontalStat");
        AbstractC22676k.m65750j(keyMetricCarousel, "keyMetricCarousel");
        AbstractC22676k.m65750j(segmentedControlDisplay, "segmentedControlDisplay");
        AbstractC22676k.m65750j(graphResponse, "graphResponse");
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(detailsEditComponents, "detailsEditComponents");
        AbstractC22676k.m65750j(tiles, "tiles");
        return new RecoveryDetailsModel(titleBar, horizontalStat, keyMetricCarousel, segmentedControlDisplay, graphResponse, heartRateZoneContainer, integrationPromoCard, achievementProgressCard, map, tags, tagsV2, editable, detailsEditComponents, tiles, whoopCoachVow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecoveryDetailsModel)) {
            return false;
        }
        RecoveryDetailsModel recoveryDetailsModel = (RecoveryDetailsModel) other;
        return AbstractC22676k.m65745e(this.titleBar, recoveryDetailsModel.titleBar) && AbstractC22676k.m65745e(this.horizontalStat, recoveryDetailsModel.horizontalStat) && AbstractC22676k.m65745e(this.keyMetricCarousel, recoveryDetailsModel.keyMetricCarousel) && AbstractC22676k.m65745e(this.segmentedControlDisplay, recoveryDetailsModel.segmentedControlDisplay) && AbstractC22676k.m65745e(this.graphResponse, recoveryDetailsModel.graphResponse) && AbstractC22676k.m65745e(this.heartRateZoneContainer, recoveryDetailsModel.heartRateZoneContainer) && AbstractC22676k.m65745e(this.integrationPromoCard, recoveryDetailsModel.integrationPromoCard) && AbstractC22676k.m65745e(this.achievementProgressCard, recoveryDetailsModel.achievementProgressCard) && AbstractC22676k.m65745e(this.map, recoveryDetailsModel.map) && AbstractC22676k.m65745e(this.tags, recoveryDetailsModel.tags) && AbstractC22676k.m65745e(this.tagsV2, recoveryDetailsModel.tagsV2) && AbstractC22676k.m65745e(this.editable, recoveryDetailsModel.editable) && AbstractC22676k.m65745e(this.detailsEditComponents, recoveryDetailsModel.detailsEditComponents) && AbstractC22676k.m65745e(this.tiles, recoveryDetailsModel.tiles) && AbstractC22676k.m65745e(this.whoopCoachVow, recoveryDetailsModel.whoopCoachVow);
    }

    public final AchievementProgressCardModel getAchievementProgressCard() {
        return this.achievementProgressCard;
    }

    public final DetailsEditComponent getDetailsEditComponents() {
        return this.detailsEditComponents;
    }

    public final Boolean getEditable() {
        return this.editable;
    }

    public final List<GraphListItemModel> getGraphResponse() {
        return this.graphResponse;
    }

    public final BarGraphContainerModel getHeartRateZoneContainer() {
        return this.heartRateZoneContainer;
    }

    public final List<HorizontalStatModel> getHorizontalStat() {
        return this.horizontalStat;
    }

    public final DesignSystemModel getIntegrationPromoCard() {
        return this.integrationPromoCard;
    }

    public final KeyMetricCarouselModel getKeyMetricCarousel() {
        return this.keyMetricCarousel;
    }

    public final MapModel getMap() {
        return this.map;
    }

    public final List<SegmentedControlDisplayModel> getSegmentedControlDisplay() {
        return this.segmentedControlDisplay;
    }

    public final List<TagModel> getTags() {
        return this.tags;
    }

    public final List<com.whoop.design.models.items.TagModel> getTagsV2() {
        return this.tagsV2;
    }

    public final List<DesignSystemModel> getTiles() {
        return this.tiles;
    }

    public final TitleBarModel getTitleBar() {
        return this.titleBar;
    }

    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.keyMetricCarousel.hashCode() + AbstractC11895b.m31983b(this.titleBar.hashCode() * 31, 31, this.horizontalStat)) * 31, 31, this.segmentedControlDisplay), 31, this.graphResponse);
        BarGraphContainerModel barGraphContainerModel = this.heartRateZoneContainer;
        int iHashCode = (iM31983b + (barGraphContainerModel == null ? 0 : barGraphContainerModel.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.integrationPromoCard;
        int iHashCode2 = (iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        AchievementProgressCardModel achievementProgressCardModel = this.achievementProgressCard;
        int iHashCode3 = (iHashCode2 + (achievementProgressCardModel == null ? 0 : achievementProgressCardModel.hashCode())) * 31;
        MapModel mapModel = this.map;
        int iM31983b2 = AbstractC11895b.m31983b((iHashCode3 + (mapModel == null ? 0 : mapModel.hashCode())) * 31, 31, this.tags);
        List<com.whoop.design.models.items.TagModel> list = this.tagsV2;
        int iHashCode4 = (iM31983b2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.editable;
        int iM31983b3 = AbstractC11895b.m31983b((this.detailsEditComponents.hashCode() + ((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31, 31, this.tiles);
        WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVow;
        return iM31983b3 + (whoopCoachVowModel != null ? whoopCoachVowModel.hashCode() : 0);
    }

    public String toString() {
        return "RecoveryDetailsModel(titleBar=" + this.titleBar + ", horizontalStat=" + this.horizontalStat + ", keyMetricCarousel=" + this.keyMetricCarousel + ", segmentedControlDisplay=" + this.segmentedControlDisplay + ", graphResponse=" + this.graphResponse + ", heartRateZoneContainer=" + this.heartRateZoneContainer + ", integrationPromoCard=" + this.integrationPromoCard + ", achievementProgressCard=" + this.achievementProgressCard + ", map=" + this.map + ", tags=" + this.tags + ", tagsV2=" + this.tagsV2 + ", editable=" + this.editable + ", detailsEditComponents=" + this.detailsEditComponents + ", tiles=" + this.tiles + ", whoopCoachVow=" + this.whoopCoachVow + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecoveryDetailsModel(TitleBarModel titleBar, List<HorizontalStatModel> horizontalStat, KeyMetricCarouselModel keyMetricCarousel, List<SegmentedControlDisplayModel> segmentedControlDisplay, List<GraphListItemModel> graphResponse, BarGraphContainerModel barGraphContainerModel, DesignSystemModel designSystemModel, AchievementProgressCardModel achievementProgressCardModel, MapModel mapModel, List<TagModel> tags, List<com.whoop.design.models.items.TagModel> list, Boolean bool, DetailsEditComponent detailsEditComponents, List<? extends DesignSystemModel> tiles, WhoopCoachVowModel whoopCoachVowModel) {
        AbstractC22676k.m65750j(titleBar, "titleBar");
        AbstractC22676k.m65750j(horizontalStat, "horizontalStat");
        AbstractC22676k.m65750j(keyMetricCarousel, "keyMetricCarousel");
        AbstractC22676k.m65750j(segmentedControlDisplay, "segmentedControlDisplay");
        AbstractC22676k.m65750j(graphResponse, "graphResponse");
        AbstractC22676k.m65750j(tags, "tags");
        AbstractC22676k.m65750j(detailsEditComponents, "detailsEditComponents");
        AbstractC22676k.m65750j(tiles, "tiles");
        this.titleBar = titleBar;
        this.horizontalStat = horizontalStat;
        this.keyMetricCarousel = keyMetricCarousel;
        this.segmentedControlDisplay = segmentedControlDisplay;
        this.graphResponse = graphResponse;
        this.heartRateZoneContainer = barGraphContainerModel;
        this.integrationPromoCard = designSystemModel;
        this.achievementProgressCard = achievementProgressCardModel;
        this.map = mapModel;
        this.tags = tags;
        this.tagsV2 = list;
        this.editable = bool;
        this.detailsEditComponents = detailsEditComponents;
        this.tiles = tiles;
        this.whoopCoachVow = whoopCoachVowModel;
    }

    public /* synthetic */ RecoveryDetailsModel(TitleBarModel titleBarModel, List list, KeyMetricCarouselModel keyMetricCarouselModel, List list2, List list3, BarGraphContainerModel barGraphContainerModel, DesignSystemModel designSystemModel, AchievementProgressCardModel achievementProgressCardModel, MapModel mapModel, List list4, List list5, Boolean bool, DetailsEditComponent detailsEditComponent, List list6, WhoopCoachVowModel whoopCoachVowModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(titleBarModel, list, keyMetricCarouselModel, list2, list3, barGraphContainerModel, (i13 & 64) != 0 ? null : designSystemModel, (i13 & 128) != 0 ? null : achievementProgressCardModel, mapModel, list4, list5, bool, detailsEditComponent, list6, whoopCoachVowModel);
    }
}
