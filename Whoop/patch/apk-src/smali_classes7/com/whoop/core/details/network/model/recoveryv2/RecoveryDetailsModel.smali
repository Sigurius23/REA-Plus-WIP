.class public final Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;,
        Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0087\u0008\u0018\u0000 p2\u00020\u0001:\u0002qpB\u00b5\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0004\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0004\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0004\u0008 \u0010!B\u00d5\u0001\u0008\u0010\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0008\u0010%\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\u0008 \u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0016\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010*J\u0016\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010*J\u0012\u0010/\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0016\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010*J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00088\u0010*J\u0012\u00109\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010:J\u0010\u0010;\u001a\u00020\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\u0016\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010*J\u0012\u0010>\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010?J\u00d8\u0001\u0010@\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00042\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00042\u0010\u0008\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b2\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00042\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00c6\u0001\u00a2\u0006\u0004\u0008@\u0010AJ\u0010\u0010C\u001a\u00020BH\u00d6\u0001\u00a2\u0006\u0004\u0008C\u0010DJ\u0010\u0010E\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008E\u0010FJ\u001a\u0010H\u001a\u00020\u00192\u0008\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008H\u0010IJ\'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001\u00a2\u0006\u0004\u0008P\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010S\u001a\u0004\u0008T\u0010(R&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010U\u0012\u0004\u0008W\u0010X\u001a\u0004\u0008V\u0010*R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010Y\u001a\u0004\u0008Z\u0010,R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010U\u001a\u0004\u0008[\u0010*R&\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010U\u0012\u0004\u0008]\u0010X\u001a\u0004\u0008\\\u0010*R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010^\u0012\u0004\u0008`\u0010X\u001a\u0004\u0008_\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010a\u001a\u0004\u0008b\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010c\u001a\u0004\u0008d\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010e\u001a\u0004\u0008f\u00106R\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010U\u001a\u0004\u0008g\u0010*R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010U\u001a\u0004\u0008h\u0010*R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010i\u001a\u0004\u0008j\u0010:R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010k\u001a\u0004\u0008l\u0010<R\u001d\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010U\u001a\u0004\u0008m\u0010*R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010n\u001a\u0004\u0008o\u0010?\u00a8\u0006r"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;",
        "",
        "Lcom/whoop/core/details/network/model/TitleBarModel;",
        "titleBar",
        "",
        "Lcom/whoop/design/models/items/HorizontalStatModel;",
        "horizontalStat",
        "Lcom/whoop/design/models/items/KeyMetricCarouselModel;",
        "keyMetricCarousel",
        "Lcom/whoop/core/details/network/model/recoveryv2/SegmentedControlDisplayModel;",
        "segmentedControlDisplay",
        "Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;",
        "graphResponse",
        "Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "heartRateZoneContainer",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "integrationPromoCard",
        "Lcom/whoop/design/models/items/AchievementProgressCardModel;",
        "achievementProgressCard",
        "Lcom/whoop/design/models/items/MapModel;",
        "map",
        "Lcom/whoop/core/details/network/model/TagModel;",
        "tags",
        "Lcom/whoop/design/models/items/TagModel;",
        "tagsV2",
        "",
        "editable",
        "Lcom/whoop/core/details/network/model/DetailsEditComponent;",
        "detailsEditComponents",
        "tiles",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "whoopCoachVow",
        "<init>",
        "(Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/core/details/network/model/TitleBarModel;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/design/models/items/KeyMetricCarouselModel;",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "component7",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component8",
        "()Lcom/whoop/design/models/items/AchievementProgressCardModel;",
        "component9",
        "()Lcom/whoop/design/models/items/MapModel;",
        "component10",
        "component11",
        "component12",
        "()Ljava/lang/Boolean;",
        "component13",
        "()Lcom/whoop/core/details/network/model/DetailsEditComponent;",
        "component14",
        "component15",
        "()Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "copy",
        "(Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/core/details/network/model/TitleBarModel;",
        "getTitleBar",
        "Ljava/util/List;",
        "getHorizontalStat",
        "getHorizontalStat$annotations",
        "()V",
        "Lcom/whoop/design/models/items/KeyMetricCarouselModel;",
        "getKeyMetricCarousel",
        "getSegmentedControlDisplay",
        "getGraphResponse",
        "getGraphResponse$annotations",
        "Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "getHeartRateZoneContainer",
        "getHeartRateZoneContainer$annotations",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getIntegrationPromoCard",
        "Lcom/whoop/design/models/items/AchievementProgressCardModel;",
        "getAchievementProgressCard",
        "Lcom/whoop/design/models/items/MapModel;",
        "getMap",
        "getTags",
        "getTagsV2",
        "Ljava/lang/Boolean;",
        "getEditable",
        "Lcom/whoop/core/details/network/model/DetailsEditComponent;",
        "getDetailsEditComponents",
        "getTiles",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "getWhoopCoachVow",
        "Companion",
        "$serializer",
        "core-details_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$Companion;


# instance fields
.field private final achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

.field private final detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

.field private final editable:Ljava/lang/Boolean;

.field private final graphResponse:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

.field private final horizontalStat:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            ">;"
        }
    .end annotation
.end field

.field private final integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

.field private final keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

.field private final map:Lcom/whoop/design/models/items/MapModel;

.field private final segmentedControlDisplay:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/recoveryv2/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation
.end field

.field private final tags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/TagModel;",
            ">;"
        }
    .end annotation
.end field

.field private final tagsV2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;"
        }
    .end annotation
.end field

.field private final tiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

.field private final whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->Companion:Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lf1/z1;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Lf1/z1;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lf1/z1;

    const/16 v5, 0x1d

    invoke-direct {v4, v5}, Lf1/z1;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lfw0/a;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lfw0/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lfw0/a;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Lfw0/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lfw0/a;

    const/4 v10, 0x2

    invoke-direct {v9, v10}, Lfw0/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v11, Lfw0/a;

    const/4 v12, 0x3

    invoke-direct {v11, v12}, Lfw0/a;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    new-instance v13, Lfw0/a;

    const/4 v14, 0x4

    invoke-direct {v13, v14}, Lfw0/a;-><init>(I)V

    invoke-static {v2, v13}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v13, 0xf

    new-array v13, v13, [Ll83/h;

    aput-object v1, v13, v6

    aput-object v3, v13, v8

    aput-object v1, v13, v10

    aput-object v4, v13, v12

    aput-object v5, v13, v14

    const/4 v3, 0x5

    aput-object v1, v13, v3

    const/4 v3, 0x6

    aput-object v7, v13, v3

    const/4 v3, 0x7

    aput-object v1, v13, v3

    aput-object v1, v13, v0

    const/16 v0, 0x9

    aput-object v9, v13, v0

    const/16 v0, 0xa

    aput-object v11, v13, v0

    const/16 v0, 0xb

    aput-object v1, v13, v0

    const/16 v0, 0xc

    aput-object v1, v13, v0

    const/16 v0, 0xd

    aput-object v2, v13, v0

    const/16 v0, 0xe

    aput-object v1, v13, v0

    sput-object v13, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x7f3f

    const/16 v1, 0x7f3f

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    iput-object p3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->horizontalStat:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    iput-object p5, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->segmentedControlDisplay:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->graphResponse:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    and-int/lit8 p2, p1, 0x40

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_0

    :cond_1
    iput-object p8, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    :goto_0
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    goto :goto_1

    :cond_2
    iput-object p9, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    :goto_1
    iput-object p10, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    iput-object p11, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tags:Ljava/util/List;

    iput-object p12, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tagsV2:Ljava/util/List;

    iput-object p13, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->editable:Ljava/lang/Boolean;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tiles:Ljava/util/List;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/core/details/network/model/TitleBarModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            ">;",
            "Lcom/whoop/design/models/items/KeyMetricCarouselModel;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/recoveryv2/SegmentedControlDisplayModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;",
            ">;",
            "Lcom/whoop/design/models/items/BarGraphContainerModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/items/AchievementProgressCardModel;",
            "Lcom/whoop/design/models/items/MapModel;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/TagModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/core/details/network/model/DetailsEditComponent;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p13

    move-object/from16 v1, p14

    const-string v2, "titleBar"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "horizontalStat"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "keyMetricCarousel"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "segmentedControlDisplay"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "graphResponse"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "tags"

    invoke-static {p10, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "detailsEditComponents"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "tiles"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->horizontalStat:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->segmentedControlDisplay:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->graphResponse:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    .line 12
    iput-object p10, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tags:Ljava/util/List;

    .line 13
    iput-object p11, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tagsV2:Ljava/util/List;

    .line 14
    iput-object p12, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->editable:Ljava/lang/Boolean;

    .line 15
    iput-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    .line 16
    iput-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tiles:Ljava/util/List;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v10, v2

    goto :goto_0

    :cond_0
    move-object/from16 v10, p7

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    move-object v11, v2

    :goto_1
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v12, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v16, p13

    move-object/from16 v17, p14

    move-object/from16 v18, p15

    goto :goto_2

    :cond_1
    move-object/from16 v11, p8

    goto :goto_1

    .line 18
    :goto_2
    invoke-direct/range {v3 .. v18}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;-><init>(Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/core/details/network/model/recoveryv2/SegmentedControlDisplayModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/recoveryv2/SegmentedControlDisplayModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/core/details/network/model/TagModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TagModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$5()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->_childSerializers$_anonymous_$5()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;ILjava/lang/Object;)Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p16

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->horizontalStat:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->segmentedControlDisplay:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->graphResponse:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tags:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tagsV2:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->editable:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tiles:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    move-object/from16 p16, v1

    :goto_e
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_f

    :cond_e
    move-object/from16 p16, p15

    goto :goto_e

    :goto_f
    invoke-virtual/range {p1 .. p16}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->copy(Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getGraphResponse$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "graphs"
    .end annotation

    return-void
.end method

.method public static synthetic getHeartRateZoneContainer$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bar_graph_container"
    .end annotation

    return-void
.end method

.method public static synthetic getHorizontalStat$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "horizontal_stats"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/TitleBarModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->horizontalStat:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/KeyMetricCarouselModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->segmentedControlDisplay:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->graphResponse:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AchievementProgressCardModel$$serializer;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    sget-object v1, Lcom/whoop/design/models/items/MapModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MapModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    const/16 v3, 0x8

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tags:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tagsV2:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->editable:Ljava/lang/Boolean;

    const/16 v3, 0xb

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/DetailsEditComponent$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    const/16 v3, 0xc

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xd

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tiles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    iget-object p0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    const/16 v1, 0xe

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/core/details/network/model/TitleBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/TagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tags:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tagsV2:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->editable:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component13()Lcom/whoop/core/details/network/model/DetailsEditComponent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tiles:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->horizontalStat:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/KeyMetricCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/recoveryv2/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->segmentedControlDisplay:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->graphResponse:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/BarGraphContainerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/AchievementProgressCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/models/items/MapModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/core/details/network/model/TitleBarModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            ">;",
            "Lcom/whoop/design/models/items/KeyMetricCarouselModel;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/recoveryv2/SegmentedControlDisplayModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;",
            ">;",
            "Lcom/whoop/design/models/items/BarGraphContainerModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/items/AchievementProgressCardModel;",
            "Lcom/whoop/design/models/items/MapModel;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/TagModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/core/details/network/model/DetailsEditComponent;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            ")",
            "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;"
        }
    .end annotation

    const-string v0, "titleBar"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "horizontalStat"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyMetricCarousel"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentedControlDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphResponse"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailsEditComponents"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tiles"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v16, p15

    invoke-direct/range {v1 .. v16}, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;-><init>(Lcom/whoop/core/details/network/model/TitleBarModel;Ljava/util/List;Lcom/whoop/design/models/items/KeyMetricCarouselModel;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AchievementProgressCardModel;Lcom/whoop/design/models/items/MapModel;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->horizontalStat:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->horizontalStat:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->segmentedControlDisplay:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->segmentedControlDisplay:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->graphResponse:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->graphResponse:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tags:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tagsV2:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tagsV2:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->editable:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->editable:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tiles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tiles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iget-object p1, p1, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getAchievementProgressCard()Lcom/whoop/design/models/items/AchievementProgressCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    return-object v0
.end method

.method public final getDetailsEditComponents()Lcom/whoop/core/details/network/model/DetailsEditComponent;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    return-object v0
.end method

.method public final getEditable()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->editable:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getGraphResponse()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->graphResponse:Ljava/util/List;

    return-object v0
.end method

.method public final getHeartRateZoneContainer()Lcom/whoop/design/models/items/BarGraphContainerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    return-object v0
.end method

.method public final getHorizontalStat()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->horizontalStat:Ljava/util/List;

    return-object v0
.end method

.method public final getIntegrationPromoCard()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getKeyMetricCarousel()Lcom/whoop/design/models/items/KeyMetricCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    return-object v0
.end method

.method public final getMap()Lcom/whoop/design/models/items/MapModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    return-object v0
.end method

.method public final getSegmentedControlDisplay()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/recoveryv2/SegmentedControlDisplayModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->segmentedControlDisplay:Ljava/util/List;

    return-object v0
.end method

.method public final getTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/TagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tags:Ljava/util/List;

    return-object v0
.end method

.method public final getTagsV2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/TagModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tagsV2:Ljava/util/List;

    return-object v0
.end method

.method public final getTiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tiles:Ljava/util/List;

    return-object v0
.end method

.method public final getTitleBar()Lcom/whoop/core/details/network/model/TitleBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    return-object v0
.end method

.method public final getWhoopCoachVow()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/TitleBarModel;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->horizontalStat:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->segmentedControlDisplay:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->graphResponse:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/BarGraphContainerModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/AchievementProgressCardModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/MapModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tags:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tagsV2:Ljava/util/List;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->editable:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/DetailsEditComponent;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tiles:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/WhoopCoachVowModel;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->titleBar:Lcom/whoop/core/details/network/model/TitleBarModel;

    iget-object v2, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->horizontalStat:Ljava/util/List;

    iget-object v3, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->keyMetricCarousel:Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    iget-object v4, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->segmentedControlDisplay:Ljava/util/List;

    iget-object v5, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->graphResponse:Ljava/util/List;

    iget-object v6, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    iget-object v7, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->integrationPromoCard:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v8, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->achievementProgressCard:Lcom/whoop/design/models/items/AchievementProgressCardModel;

    iget-object v9, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->map:Lcom/whoop/design/models/items/MapModel;

    iget-object v10, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tags:Ljava/util/List;

    iget-object v11, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tagsV2:Ljava/util/List;

    iget-object v12, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->editable:Ljava/lang/Boolean;

    iget-object v13, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->detailsEditComponents:Lcom/whoop/core/details/network/model/DetailsEditComponent;

    iget-object v14, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->tiles:Ljava/util/List;

    iget-object v15, v0, Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v16, v15

    const-string v15, "RecoveryDetailsModel(titleBar="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalStat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", keyMetricCarousel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", segmentedControlDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graphResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", heartRateZoneContainer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", integrationPromoCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", achievementProgressCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", map="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tagsV2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", editable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", detailsEditComponents="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tiles="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", whoopCoachVow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
