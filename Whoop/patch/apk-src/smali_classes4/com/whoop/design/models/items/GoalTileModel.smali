.class public final Lcom/whoop/design/models/items/GoalTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/GoalTileModel$$serializer;,
        Lcom/whoop/design/models/items/GoalTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u0000 T2\u00020\u0001:\u0002UTBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u0083\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0015\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0084\u0001\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010,J\u0010\u00100\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010!J\u001a\u00104\u001a\u0002032\u0008\u00102\u001a\u0004\u0018\u000101H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105J\'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001\u00a2\u0006\u0004\u0008<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010?\u001a\u0004\u0008@\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010A\u001a\u0004\u0008B\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010?\u001a\u0004\u0008C\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010D\u001a\u0004\u0008E\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010?\u001a\u0004\u0008F\u0010\u001cR\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010G\u001a\u0004\u0008H\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010I\u0012\u0004\u0008K\u0010L\u001a\u0004\u0008J\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010M\u001a\u0004\u0008N\u0010(R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010O\u0012\u0004\u0008Q\u0010L\u001a\u0004\u0008P\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010R\u001a\u0004\u0008S\u0010,\u00a8\u0006V"
    }
    d2 = {
        "Lcom/whoop/design/models/items/GoalTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "titleDisplay",
        "Lcom/whoop/design/models/items/CheckmarkStyle;",
        "checkmarkStyle",
        "progressDisplay",
        "",
        "goalDays",
        "imageUrl",
        "",
        "Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;",
        "days",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/design/models/items/BottomSheetInfoModel;",
        "bottomInfoSheet",
        "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "circularProgressIndicator",
        "",
        "id",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()Lcom/whoop/design/models/items/CheckmarkStyle;",
        "component3",
        "component4",
        "()I",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "()Lcom/whoop/navigation/e;",
        "component8",
        "()Lcom/whoop/design/models/items/BottomSheetInfoModel;",
        "component9",
        "()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "component10",
        "()Ljava/lang/String;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;)Lcom/whoop/design/models/items/GoalTileModel;",
        "toString",
        "hashCode",
        "",
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
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/GoalTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getTitleDisplay",
        "Lcom/whoop/design/models/items/CheckmarkStyle;",
        "getCheckmarkStyle",
        "getProgressDisplay",
        "I",
        "getGoalDays",
        "getImageUrl",
        "Ljava/util/List;",
        "getDays",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestination$annotations",
        "()V",
        "Lcom/whoop/design/models/items/BottomSheetInfoModel;",
        "getBottomInfoSheet",
        "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "getCircularProgressIndicator",
        "getCircularProgressIndicator$annotations",
        "Ljava/lang/String;",
        "getId",
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

.field public static final Companion:Lcom/whoop/design/models/items/GoalTileModel$Companion;


# instance fields
.field private final bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

.field private final checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

.field private final circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

.field private final days:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;",
            ">;"
        }
    .end annotation
.end field

.field private final destination:Lcom/whoop/navigation/e;

.field private final goalDays:I

.field private final id:Ljava/lang/String;

.field private final imageUrl:Lcom/whoop/design/util/TextResource;

.field private final progressDisplay:Lcom/whoop/design/util/TextResource;

.field private final titleDisplay:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/whoop/design/models/items/GoalTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/GoalTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/GoalTileModel;->Companion:Lcom/whoop/design/models/items/GoalTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/GoalTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/e;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Lw91/e;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/e;

    const/4 v6, 0x7

    invoke-direct {v5, v6}, Lw91/e;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw91/e;

    invoke-direct {v7, v0}, Lw91/e;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v8, Lw91/e;

    const/16 v9, 0x9

    invoke-direct {v8, v9}, Lw91/e;-><init>(I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v8, 0xa

    new-array v8, v8, [Ll83/h;

    const/4 v10, 0x0

    aput-object v1, v8, v10

    const/4 v10, 0x1

    aput-object v3, v8, v10

    const/4 v3, 0x2

    aput-object v1, v8, v3

    const/4 v3, 0x3

    aput-object v1, v8, v3

    const/4 v3, 0x4

    aput-object v1, v8, v3

    const/4 v3, 0x5

    aput-object v5, v8, v3

    aput-object v7, v8, v4

    aput-object v1, v8, v6

    aput-object v2, v8, v0

    aput-object v1, v8, v9

    sput-object v8, Lcom/whoop/design/models/items/GoalTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p12, p1, 0x2af

    const/16 v0, 0x2af

    if-eq v0, p12, :cond_0

    .line 1
    sget-object p12, Lcom/whoop/design/models/items/GoalTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/GoalTileModel$$serializer;

    invoke-virtual {p12}, Lcom/whoop/design/models/items/GoalTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/GoalTileModel;->titleDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/design/models/items/GoalTileModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    iput-object p4, p0, Lcom/whoop/design/models/items/GoalTileModel;->progressDisplay:Lcom/whoop/design/util/TextResource;

    iput p5, p0, Lcom/whoop/design/models/items/GoalTileModel;->goalDays:I

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    :goto_0
    iput-object p7, p0, Lcom/whoop/design/models/items/GoalTileModel;->days:Ljava/util/List;

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_1

    :cond_2
    iput-object p8, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    :goto_1
    iput-object p9, p0, Lcom/whoop/design/models/items/GoalTileModel;->bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    goto :goto_2

    :cond_3
    iput-object p10, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    :goto_2
    iput-object p11, p0, Lcom/whoop/design/models/items/GoalTileModel;->id:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/models/items/CheckmarkStyle;",
            "Lcom/whoop/design/util/TextResource;",
            "I",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;",
            ">;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/design/models/items/BottomSheetInfoModel;",
            "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkmarkStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "days"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/GoalTileModel;->titleDisplay:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/GoalTileModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/GoalTileModel;->progressDisplay:Lcom/whoop/design/util/TextResource;

    .line 6
    iput p4, p0, Lcom/whoop/design/models/items/GoalTileModel;->goalDays:I

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/GoalTileModel;->days:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/GoalTileModel;->bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/GoalTileModel;->id:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x10

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_1

    move-object p7, v0

    :cond_1
    and-int/lit16 p11, p11, 0x100

    if-eqz p11, :cond_2

    move-object p11, p10

    move-object p10, v0

    :goto_0
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p11, p10

    move-object p10, p9

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/whoop/design/models/items/GoalTileModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.CheckmarkStyle"

    invoke-static {}, Lcom/whoop/design/models/items/CheckmarkStyle;->values()[Lcom/whoop/design/models/items/CheckmarkStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/GoalTrackerIndicatorModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/GoalTrackerIndicatorModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    sget-object v2, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator$$serializer;

    invoke-static {v2}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lwc3/c;

    invoke-direct {v0, v1, v2, v3}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/GoalTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/GoalTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/GoalTileModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/GoalTileModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/GoalTileModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/GoalTileModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/GoalTileModel;->titleDisplay:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/GoalTileModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/GoalTileModel;->progressDisplay:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lcom/whoop/design/models/items/GoalTileModel;->goalDays:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/GoalTileModel;->days:Ljava/util/List;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/GoalTileModel;->bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/design/models/items/GoalTileModel;->id:Ljava/lang/String;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/design/models/items/GoalTileModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;)Lcom/whoop/design/models/items/GoalTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/GoalTileModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getCircularProgressIndicator$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/GoalTileModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/GoalTileModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->titleDisplay:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/GoalTileModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalTileModel;->progressDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget v3, p0, Lcom/whoop/design/models/items/GoalTileModel;->goalDays:I

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    if-eqz v3, :cond_1

    :goto_0
    iget-object v3, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalTileModel;->days:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    sget-object v1, Lcom/whoop/design/models/items/BottomSheetInfoModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/BottomSheetInfoModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/GoalTileModel;->id:Ljava/lang/String;

    const/16 v1, 0x9

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->titleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/CheckmarkStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->progressDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->goalDays:I

    return v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->days:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/BottomSheetInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    return-object v0
.end method

.method public final component9()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;)Lcom/whoop/design/models/items/GoalTileModel;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/models/items/CheckmarkStyle;",
            "Lcom/whoop/design/util/TextResource;",
            "I",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;",
            ">;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/design/models/items/BottomSheetInfoModel;",
            "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/design/models/items/GoalTileModel;"
        }
    .end annotation

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checkmarkStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "days"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/GoalTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/design/models/items/GoalTileModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/CheckmarkStyle;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/BottomSheetInfoModel;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/GoalTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/GoalTileModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->titleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalTileModel;->titleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalTileModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->progressDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalTileModel;->progressDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->goalDays:I

    iget v3, p1, Lcom/whoop/design/models/items/GoalTileModel;->goalDays:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->days:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalTileModel;->days:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalTileModel;->bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    iget-object v3, p1, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->id:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/GoalTileModel;->id:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getBottomInfoSheet()Lcom/whoop/design/models/items/BottomSheetInfoModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    return-object v0
.end method

.method public final getCheckmarkStyle()Lcom/whoop/design/models/items/CheckmarkStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    return-object v0
.end method

.method public final getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    return-object v0
.end method

.method public final getDays()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->days:Ljava/util/List;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getGoalDays()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->goalDays:I

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getProgressDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->progressDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTitleDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->titleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->titleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->progressDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v2, v0, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->goalDays:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->days:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->id:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/design/models/items/GoalTileModel;->titleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/design/models/items/GoalTileModel;->checkmarkStyle:Lcom/whoop/design/models/items/CheckmarkStyle;

    iget-object v2, p0, Lcom/whoop/design/models/items/GoalTileModel;->progressDisplay:Lcom/whoop/design/util/TextResource;

    iget v3, p0, Lcom/whoop/design/models/items/GoalTileModel;->goalDays:I

    iget-object v4, p0, Lcom/whoop/design/models/items/GoalTileModel;->imageUrl:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/design/models/items/GoalTileModel;->days:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/design/models/items/GoalTileModel;->destination:Lcom/whoop/navigation/e;

    iget-object v7, p0, Lcom/whoop/design/models/items/GoalTileModel;->bottomInfoSheet:Lcom/whoop/design/models/items/BottomSheetInfoModel;

    iget-object v8, p0, Lcom/whoop/design/models/items/GoalTileModel;->circularProgressIndicator:Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    iget-object v9, p0, Lcom/whoop/design/models/items/GoalTileModel;->id:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "GoalTileModel(titleDisplay="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", checkmarkStyle="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", progressDisplay="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", goalDays="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", imageUrl="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", days="

    const-string v1, ", destination="

    invoke-static {v4, v0, v1, v10, v5}, Ljh3/c;->n(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bottomInfoSheet="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", circularProgressIndicator="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
