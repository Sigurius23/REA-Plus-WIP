.class public final Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$$serializer;,
        Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008&\u0008\u0087\u0008\u0018\u0000 `2\u00020\u0001:\u0002a`B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u00a5\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001cJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u00b2\u0001\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010\u001cJ\u0010\u00101\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u00020\u00042\u0008\u00104\u001a\u0004\u0018\u000103H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106J\'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008=\u0010>R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010@\u0012\u0004\u0008B\u0010C\u001a\u0004\u0008A\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010D\u0012\u0004\u0008E\u0010C\u001a\u0004\u0008\u0005\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010@\u0012\u0004\u0008G\u0010C\u001a\u0004\u0008F\u0010\u001cR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010@\u0012\u0004\u0008I\u0010C\u001a\u0004\u0008H\u0010\u001cR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010@\u0012\u0004\u0008K\u0010C\u001a\u0004\u0008J\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010@\u0012\u0004\u0008M\u0010C\u001a\u0004\u0008L\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010@\u0012\u0004\u0008O\u0010C\u001a\u0004\u0008N\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010@\u0012\u0004\u0008Q\u0010C\u001a\u0004\u0008P\u0010\u001cR\"\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010@\u0012\u0004\u0008S\u0010C\u001a\u0004\u0008R\u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010@\u0012\u0004\u0008U\u0010C\u001a\u0004\u0008T\u0010\u001cR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010@\u0012\u0004\u0008W\u0010C\u001a\u0004\u0008V\u0010\u001cR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010X\u0012\u0004\u0008Z\u0010C\u001a\u0004\u0008Y\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010[\u001a\u0004\u0008\\\u0010+R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010]\u0012\u0004\u0008_\u0010C\u001a\u0004\u0008^\u0010-\u00a8\u0006b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "",
        "isSelected",
        "iconUrl",
        "activityTitle",
        "activityStrain",
        "activityDuration",
        "activityDurationUnit",
        "activityDurationLabel",
        "intensityStyle",
        "intensityTitle",
        "intensitySubtitle",
        "Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;",
        "targetZones",
        "content",
        "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;",
        "buttonViewState",
        "<init>",
        "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Z",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "()Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;",
        "component13",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "component14",
        "()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;",
        "copy",
        "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getId$annotations",
        "()V",
        "Z",
        "isSelected$annotations",
        "getIconUrl",
        "getIconUrl$annotations",
        "getActivityTitle",
        "getActivityTitle$annotations",
        "getActivityStrain",
        "getActivityStrain$annotations",
        "getActivityDuration",
        "getActivityDuration$annotations",
        "getActivityDurationUnit",
        "getActivityDurationUnit$annotations",
        "getActivityDurationLabel",
        "getActivityDurationLabel$annotations",
        "getIntensityStyle",
        "getIntensityStyle$annotations",
        "getIntensityTitle",
        "getIntensityTitle$annotations",
        "getIntensitySubtitle",
        "getIntensitySubtitle$annotations",
        "Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;",
        "getTargetZones",
        "getTargetZones$annotations",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "getContent",
        "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;",
        "getButtonViewState",
        "getButtonViewState$annotations",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$Companion;


# instance fields
.field private final activityDuration:Ljava/lang/String;

.field private final activityDurationLabel:Ljava/lang/String;

.field private final activityDurationUnit:Ljava/lang/String;

.field private final activityStrain:Ljava/lang/String;

.field private final activityTitle:Ljava/lang/String;

.field private final buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

.field private final content:Lcom/whoop/design/models/DesignSystemModel;

.field private final iconUrl:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final intensityStyle:Ljava/lang/String;

.field private final intensitySubtitle:Ljava/lang/String;

.field private final intensityTitle:Ljava/lang/String;

.field private final isSelected:Z

.field private final targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->Companion:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lwr1/f;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Lwr1/f;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0xe

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v2, v3, v0

    const/16 v0, 0xd

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x2fff

    const/16 v1, 0x2fff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->id:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected:Z

    iput-object p4, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->iconUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityTitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityStrain:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDuration:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationUnit:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationLabel:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityStyle:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityTitle:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensitySubtitle:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    and-int/lit16 p1, p1, 0x1000

    if-nez p1, :cond_1

    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 p1, p15

    goto :goto_1

    :cond_1
    move-object/from16 p1, p14

    goto :goto_0

    :goto_1
    iput-object p1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->id:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->iconUrl:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityTitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityStrain:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDuration:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationUnit:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationLabel:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityStyle:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityTitle:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensitySubtitle:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    .line 15
    iput-object p13, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    .line 16
    iput-object p14, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p15

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v14, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v15, p14

    goto :goto_1

    :cond_0
    move-object/from16 v14, p13

    goto :goto_0

    .line 17
    :goto_1
    invoke-direct/range {v1 .. v15}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected:Z

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->iconUrl:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityTitle:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityStrain:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDuration:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationUnit:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationLabel:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityStyle:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityTitle:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-object v11, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensitySubtitle:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move-object/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->copy(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getActivityDuration$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_duration"
    .end annotation

    return-void
.end method

.method public static synthetic getActivityDurationLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_duration_label"
    .end annotation

    return-void
.end method

.method public static synthetic getActivityDurationUnit$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_duration_unit"
    .end annotation

    return-void
.end method

.method public static synthetic getActivityStrain$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_strain"
    .end annotation

    return-void
.end method

.method public static synthetic getActivityTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "activity_title"
    .end annotation

    return-void
.end method

.method public static synthetic getButtonViewState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "button_view_state"
    .end annotation

    return-void
.end method

.method public static synthetic getIconUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "icon_url"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getIntensityStyle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "intensity_style"
    .end annotation

    return-void
.end method

.method public static synthetic getIntensitySubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "intensity_subtitle"
    .end annotation

    return-void
.end method

.method public static synthetic getIntensityTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "intensity_title"
    .end annotation

    return-void
.end method

.method public static synthetic getTargetZones$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "target_zones"
    .end annotation

    return-void
.end method

.method public static synthetic isSelected$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "is_selected"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->iconUrl:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityStrain:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDuration:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationUnit:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensitySubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    const/16 v3, 0xb

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    const/16 v1, 0xd

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensitySubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    return-object v0
.end method

.method public final component13()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final component14()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityStrain:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDuration:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationUnit:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;
    .locals 16

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityTitle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityStrain:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityStrain:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDuration:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDuration:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationUnit:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationUnit:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensitySubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensitySubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getActivityDuration()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDuration:Ljava/lang/String;

    return-object v0
.end method

.method public final getActivityDurationLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getActivityDurationUnit()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationUnit:Ljava/lang/String;

    return-object v0
.end method

.method public final getActivityStrain()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityStrain:Ljava/lang/String;

    return-object v0
.end method

.method public final getActivityTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getButtonViewState()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    return-object v0
.end method

.method public final getContent()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntensityStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntensitySubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensitySubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntensityTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTargetZones()Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->iconUrl:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityStrain:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDuration:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationUnit:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationLabel:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityStyle:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityTitle:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensitySubtitle:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    if-nez v1, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    return v0
.end method

.method public final isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->id:Ljava/lang/String;

    iget-boolean v2, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected:Z

    iget-object v3, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->iconUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityTitle:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityStrain:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDuration:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationUnit:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->activityDurationLabel:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityStyle:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensityTitle:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->intensitySubtitle:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->targetZones:Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    iget-object v13, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->content:Lcom/whoop/design/models/DesignSystemModel;

    iget-object v14, v0, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->buttonViewState:Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    const-string v15, ", isSelected="

    const-string v0, ", iconUrl="

    move-object/from16 v16, v14

    const-string v14, "ActivityRecommendationTileModel(id="

    invoke-static {v14, v1, v15, v0, v2}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityTitle="

    const-string v2, ", activityStrain="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", activityDuration="

    const-string v2, ", activityDurationUnit="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", activityDurationLabel="

    const-string v2, ", intensityStyle="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", intensityTitle="

    const-string v2, ", intensitySubtitle="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", targetZones="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", content="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
