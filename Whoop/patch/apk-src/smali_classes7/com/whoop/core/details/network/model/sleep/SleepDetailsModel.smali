.class public final Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;,
        Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u0000 i2\u00020\u0001:\u0002jiB\u007f\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cB\u009f\u0001\u0008\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008\u001b\u0010!J\u0016\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0011H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0016\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010#J\u0012\u00103\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u00a0\u0001\u00109\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00022\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u0010\u0010<\u001a\u00020;H\u00d6\u0001\u00a2\u0006\u0004\u0008<\u0010=J\u0010\u0010>\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\u0008>\u0010?J\u001a\u0010B\u001a\u00020A2\u0008\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ\'\u0010L\u001a\u00020I2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0001\u00a2\u0006\u0004\u0008J\u0010KR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010M\u001a\u0004\u0008N\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010O\u0012\u0004\u0008Q\u0010R\u001a\u0004\u0008P\u0010%R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010S\u001a\u0004\u0008T\u0010\'R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010U\u0012\u0004\u0008W\u0010R\u001a\u0004\u0008V\u0010)R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010X\u0012\u0004\u0008Z\u0010R\u001a\u0004\u0008Y\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010[\u001a\u0004\u0008\\\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010]\u001a\u0004\u0008^\u0010/R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010_\u0012\u0004\u0008a\u0010R\u001a\u0004\u0008`\u00101R\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010M\u001a\u0004\u0008b\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010c\u001a\u0004\u0008d\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010e\u001a\u0004\u0008f\u00106R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010g\u001a\u0004\u0008h\u00108\u00a8\u0006k"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;",
        "",
        "",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;",
        "sleepMetricBreakdowns",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "graphResponse",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;",
        "vowStrings",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;",
        "sleepDetailsLabelsModel",
        "Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "heartRateZoneContainer",
        "Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;",
        "missingHrData",
        "Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;",
        "activityDisplayType",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;",
        "sleepDetailsEditComponent",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;",
        "sleepDetailsMetricModals",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "whoopCoachVow",
        "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
        "additionalInfoText",
        "Lcom/whoop/core/details/network/model/MetaData;",
        "metadata",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Lcom/whoop/design/models/items/graph/GraphModel;",
        "component3",
        "()Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;",
        "component4",
        "()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;",
        "component5",
        "()Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "component6",
        "()Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;",
        "component7",
        "()Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;",
        "component8",
        "()Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;",
        "component9",
        "component10",
        "()Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "component11",
        "()Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
        "component12",
        "()Lcom/whoop/core/details/network/model/MetaData;",
        "copy",
        "(Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_details_release",
        "(Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/util/List;",
        "getSleepMetricBreakdowns",
        "Lcom/whoop/design/models/items/graph/GraphModel;",
        "getGraphResponse",
        "getGraphResponse$annotations",
        "()V",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;",
        "getVowStrings",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;",
        "getSleepDetailsLabelsModel",
        "getSleepDetailsLabelsModel$annotations",
        "Lcom/whoop/design/models/items/BarGraphContainerModel;",
        "getHeartRateZoneContainer",
        "getHeartRateZoneContainer$annotations",
        "Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;",
        "getMissingHrData",
        "Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;",
        "getActivityDisplayType",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;",
        "getSleepDetailsEditComponent",
        "getSleepDetailsEditComponent$annotations",
        "getSleepDetailsMetricModals",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "getWhoopCoachVow",
        "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
        "getAdditionalInfoText",
        "Lcom/whoop/core/details/network/model/MetaData;",
        "getMetadata",
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

.field public static final Companion:Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$Companion;


# instance fields
.field private final activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

.field private final additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

.field private final graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

.field private final heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

.field private final metadata:Lcom/whoop/core/details/network/model/MetaData;

.field private final missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

.field private final sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

.field private final sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

.field private final sleepDetailsMetricModals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;",
            ">;"
        }
    .end annotation
.end field

.field private final sleepMetricBreakdowns:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;",
            ">;"
        }
    .end annotation
.end field

.field private final vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

.field private final whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->Companion:Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lgp1/a;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lgp1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lgp1/a;

    const/16 v5, 0x17

    invoke-direct {v4, v5}, Lgp1/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lgp1/a;

    const/16 v6, 0x18

    invoke-direct {v5, v6}, Lgp1/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0xc

    new-array v5, v5, [Ll83/h;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    const/4 v3, 0x1

    aput-object v1, v5, v3

    const/4 v3, 0x2

    aput-object v1, v5, v3

    const/4 v3, 0x3

    aput-object v1, v5, v3

    const/4 v3, 0x4

    aput-object v1, v5, v3

    const/4 v3, 0x5

    aput-object v1, v5, v3

    const/4 v3, 0x6

    aput-object v4, v5, v3

    const/4 v3, 0x7

    aput-object v1, v5, v3

    aput-object v2, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    const/16 v0, 0xb

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xfff

    const/16 v0, 0xfff

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;

    invoke-virtual {p14}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepMetricBreakdowns:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    iput-object p4, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    iput-object p5, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    iput-object p6, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    iput-object p7, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    iput-object p8, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    iput-object p9, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    iput-object p10, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsMetricModals:Ljava/util/List;

    iput-object p11, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iput-object p12, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    iput-object p13, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;",
            "Lcom/whoop/design/models/items/BarGraphContainerModel;",
            "Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;",
            "Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;",
            ">;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
            "Lcom/whoop/core/details/network/model/MetaData;",
            ")V"
        }
    .end annotation

    const-string v0, "sleepMetricBreakdowns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vowStrings"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepDetailsLabelsModel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityDisplayType"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepDetailsEditComponent"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepDetailsMetricModals"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepMetricBreakdowns:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    .line 10
    iput-object p8, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsMetricModals:Ljava/util/List;

    .line 12
    iput-object p10, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    .line 13
    iput-object p11, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    .line 14
    iput-object p12, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;->Companion:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType$Companion;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;ILjava/lang/Object;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepMetricBreakdowns:Ljava/util/List;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsMetricModals:Ljava/util/List;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->copy(Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getGraphResponse$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "graph"
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

.method public static synthetic getSleepDetailsEditComponent$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sleep_details_edit_components"
    .end annotation

    return-void
.end method

.method public static synthetic getSleepDetailsLabelsModel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sleep_details_labels"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepMetricBreakdowns:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/graph/GraphModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/GraphModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BarGraphContainerModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel$$serializer;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsMetricModals:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    const/16 v2, 0x9

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    const/16 v2, 0xa

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/core/details/network/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/MetaData$$serializer;

    iget-object p0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    const/16 v1, 0xb

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepMetricBreakdowns:Ljava/util/List;

    return-object v0
.end method

.method public final component10()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/items/AdditionalInfoTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    return-object v0
.end method

.method public final component12()Lcom/whoop/core/details/network/model/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final component3()Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/BarGraphContainerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    return-object v0
.end method

.method public final component8()Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsMetricModals:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;)Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/GraphModel;",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;",
            "Lcom/whoop/design/models/items/BarGraphContainerModel;",
            "Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;",
            "Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;",
            ">;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
            "Lcom/whoop/core/details/network/model/MetaData;",
            ")",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;"
        }
    .end annotation

    const-string v0, "sleepMetricBreakdowns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "vowStrings"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepDetailsLabelsModel"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityDisplayType"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepDetailsEditComponent"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepDetailsMetricModals"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;-><init>(Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;Ljava/util/List;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/core/details/network/model/MetaData;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepMetricBreakdowns:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepMetricBreakdowns:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsMetricModals:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsMetricModals:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    iget-object p1, p1, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getActivityDisplayType()Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    return-object v0
.end method

.method public final getAdditionalInfoText()Lcom/whoop/design/models/items/AdditionalInfoTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    return-object v0
.end method

.method public final getGraphResponse()Lcom/whoop/design/models/items/graph/GraphModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    return-object v0
.end method

.method public final getHeartRateZoneContainer()Lcom/whoop/design/models/items/BarGraphContainerModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/core/details/network/model/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    return-object v0
.end method

.method public final getMissingHrData()Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    return-object v0
.end method

.method public final getSleepDetailsEditComponent()Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    return-object v0
.end method

.method public final getSleepDetailsLabelsModel()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    return-object v0
.end method

.method public final getSleepDetailsMetricModals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsMetricModalsModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsMetricModals:Ljava/util/List;

    return-object v0
.end method

.method public final getSleepMetricBreakdowns()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepMetricBreakdowns:Ljava/util/List;

    return-object v0
.end method

.method public final getVowStrings()Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    return-object v0
.end method

.method public final getWhoopCoachVow()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepMetricBreakdowns:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/GraphModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/BarGraphContainerModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsMetricModals:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/WhoopCoachVowModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/design/models/items/AdditionalInfoTextModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/MetaData;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepMetricBreakdowns:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->graphResponse:Lcom/whoop/design/models/items/graph/GraphModel;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->vowStrings:Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsLabelsModel:Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->heartRateZoneContainer:Lcom/whoop/design/models/items/BarGraphContainerModel;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->missingHrData:Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    iget-object v6, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->activityDisplayType:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    iget-object v7, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsEditComponent:Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    iget-object v8, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->sleepDetailsMetricModals:Ljava/util/List;

    iget-object v9, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iget-object v10, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    iget-object v11, p0, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->metadata:Lcom/whoop/core/details/network/model/MetaData;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "SleepDetailsModel(sleepMetricBreakdowns="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", graphResponse="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vowStrings="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sleepDetailsLabelsModel="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", heartRateZoneContainer="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", missingHrData="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", activityDisplayType="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sleepDetailsEditComponent="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sleepDetailsMetricModals="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", whoopCoachVow="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", additionalInfoText="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
