.class public final Lcom/whoop/core/details/network/model/ItemModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/core/details/network/model/ItemModel$$serializer;,
        Lcom/whoop/core/details/network/model/ItemModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 F2\u00020\u0001:\u0002GFB\u0085\u0001\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u009f\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u00a2\u0001\u0010&\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001\u00a2\u0006\u0004\u00085\u00106R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00108\u001a\u0004\u00089\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010:\u001a\u0004\u0008;\u0010\u001bR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00108\u001a\u0004\u0008<\u0010\u0019R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010:\u001a\u0004\u0008=\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008>\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010:\u001a\u0004\u0008?\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010:\u001a\u0004\u0008@\u0010\u001bR\u0017\u0010\u000c\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008A\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010:\u001a\u0004\u0008B\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010:\u001a\u0004\u0008C\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010:\u001a\u0004\u0008D\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010:\u001a\u0004\u0008E\u0010\u001b\u00a8\u0006H"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/ItemModel;",
        "",
        "",
        "",
        "achievementIcons",
        "endIcon",
        "Lcom/whoop/core/details/network/model/HeartRateTimelineModel;",
        "heartRateTimeline",
        "repsDisplay",
        "volumeDisplay",
        "volumeTitleDisplay",
        "subtitleDisplay",
        "titleDisplay",
        "tonnageDisplay",
        "intensityDisplay",
        "imageUrl",
        "exerciseId",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Ljava/lang/String;",
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
        "copy",
        "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/ItemModel;",
        "toString",
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
        "(Lcom/whoop/core/details/network/model/ItemModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/util/List;",
        "getAchievementIcons",
        "Ljava/lang/String;",
        "getEndIcon",
        "getHeartRateTimeline",
        "getRepsDisplay",
        "getVolumeDisplay",
        "getVolumeTitleDisplay",
        "getSubtitleDisplay",
        "getTitleDisplay",
        "getTonnageDisplay",
        "getIntensityDisplay",
        "getImageUrl",
        "getExerciseId",
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

.field public static final Companion:Lcom/whoop/core/details/network/model/ItemModel$Companion;


# instance fields
.field private final achievementIcons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final endIcon:Ljava/lang/String;

.field private final exerciseId:Ljava/lang/String;

.field private final heartRateTimeline:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/HeartRateTimelineModel;",
            ">;"
        }
    .end annotation
.end field

.field private final imageUrl:Ljava/lang/String;

.field private final intensityDisplay:Ljava/lang/String;

.field private final repsDisplay:Ljava/lang/String;

.field private final subtitleDisplay:Ljava/lang/String;

.field private final titleDisplay:Ljava/lang/String;

.field private final tonnageDisplay:Ljava/lang/String;

.field private final volumeDisplay:Ljava/lang/String;

.field private final volumeTitleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/core/details/network/model/ItemModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/network/model/ItemModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/core/details/network/model/ItemModel;->Companion:Lcom/whoop/core/details/network/model/ItemModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/core/details/network/model/ItemModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lcom/whoop/core/details/network/model/a;

    const/16 v4, 0xd

    invoke-direct {v3, v4}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcom/whoop/core/details/network/model/a;

    const/16 v5, 0xe

    invoke-direct {v4, v5}, Lcom/whoop/core/details/network/model/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0xc

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object v1, v4, v3

    const/4 v3, 0x2

    aput-object v2, v4, v3

    const/4 v2, 0x3

    aput-object v1, v4, v2

    const/4 v2, 0x4

    aput-object v1, v4, v2

    const/4 v2, 0x5

    aput-object v1, v4, v2

    const/4 v2, 0x6

    aput-object v1, v4, v2

    const/4 v2, 0x7

    aput-object v1, v4, v2

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v1, v4, v0

    const/16 v0, 0xa

    aput-object v1, v4, v0

    const/16 v0, 0xb

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/core/details/network/model/ItemModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xffc

    const/16 v0, 0xffc

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/core/details/network/model/ItemModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/ItemModel$$serializer;

    invoke-virtual {p14}, Lcom/whoop/core/details/network/model/ItemModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p14, p1, 0x1

    if-nez p14, :cond_1

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    :cond_1
    iput-object p2, p0, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iput-object p3, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    :goto_0
    iput-object p4, p0, Lcom/whoop/core/details/network/model/ItemModel;->heartRateTimeline:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/core/details/network/model/ItemModel;->repsDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeDisplay:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeTitleDisplay:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/core/details/network/model/ItemModel;->subtitleDisplay:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/core/details/network/model/ItemModel;->titleDisplay:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/core/details/network/model/ItemModel;->tonnageDisplay:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/core/details/network/model/ItemModel;->intensityDisplay:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/core/details/network/model/ItemModel;->imageUrl:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/core/details/network/model/ItemModel;->exerciseId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/HeartRateTimelineModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "achievementIcons"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRateTimeline"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleDisplay"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tonnageDisplay"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    .line 6
    iput-object p2, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/core/details/network/model/ItemModel;->heartRateTimeline:Ljava/util/List;

    .line 8
    iput-object p4, p0, Lcom/whoop/core/details/network/model/ItemModel;->repsDisplay:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeDisplay:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeTitleDisplay:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/core/details/network/model/ItemModel;->subtitleDisplay:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lcom/whoop/core/details/network/model/ItemModel;->titleDisplay:Ljava/lang/String;

    .line 13
    iput-object p9, p0, Lcom/whoop/core/details/network/model/ItemModel;->tonnageDisplay:Ljava/lang/String;

    .line 14
    iput-object p10, p0, Lcom/whoop/core/details/network/model/ItemModel;->intensityDisplay:Ljava/lang/String;

    .line 15
    iput-object p11, p0, Lcom/whoop/core/details/network/model/ItemModel;->imageUrl:Ljava/lang/String;

    .line 16
    iput-object p12, p0, Lcom/whoop/core/details/network/model/ItemModel;->exerciseId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    .line 17
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    and-int/lit8 p13, p13, 0x2

    if-eqz p13, :cond_1

    const/4 p2, 0x0

    :cond_1
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

    .line 18
    invoke-direct/range {p2 .. p14}, Lcom/whoop/core/details/network/model/ItemModel;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/core/details/network/model/HeartRateTimelineModel$$serializer;->INSTANCE:Lcom/whoop/core/details/network/model/HeartRateTimelineModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/ItemModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/core/details/network/model/ItemModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/core/details/network/model/ItemModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/core/details/network/model/ItemModel;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/core/details/network/model/ItemModel;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/whoop/core/details/network/model/ItemModel;->heartRateTimeline:Ljava/util/List;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/core/details/network/model/ItemModel;->repsDisplay:Ljava/lang/String;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeDisplay:Ljava/lang/String;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeTitleDisplay:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/core/details/network/model/ItemModel;->subtitleDisplay:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/core/details/network/model/ItemModel;->titleDisplay:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/core/details/network/model/ItemModel;->tonnageDisplay:Ljava/lang/String;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/core/details/network/model/ItemModel;->intensityDisplay:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/core/details/network/model/ItemModel;->imageUrl:Ljava/lang/String;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/core/details/network/model/ItemModel;->exerciseId:Ljava/lang/String;

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

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/core/details/network/model/ItemModel;->copy(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/ItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_details_release(Lcom/whoop/core/details/network/model/ItemModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/core/details/network/model/ItemModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->heartRateTimeline:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->repsDisplay:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->subtitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->tonnageDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->intensityDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    iget-object p0, p0, Lcom/whoop/core/details/network/model/ItemModel;->exerciseId:Ljava/lang/String;

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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->intensityDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->exerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/HeartRateTimelineModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->heartRateTimeline:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->repsDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->tonnageDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/ItemModel;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/HeartRateTimelineModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/core/details/network/model/ItemModel;"
        }
    .end annotation

    const-string v0, "achievementIcons"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRateTimeline"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleDisplay"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tonnageDisplay"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/core/details/network/model/ItemModel;

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/core/details/network/model/ItemModel;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/core/details/network/model/ItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/core/details/network/model/ItemModel;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->heartRateTimeline:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->heartRateTimeline:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->repsDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->repsDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->volumeDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->volumeTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->subtitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->subtitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->tonnageDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->tonnageDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->intensityDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->intensityDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/core/details/network/model/ItemModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->exerciseId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/core/details/network/model/ItemModel;->exerciseId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAchievementIcons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    return-object v0
.end method

.method public final getEndIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getExerciseId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->exerciseId:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeartRateTimeline()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/core/details/network/model/HeartRateTimelineModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->heartRateTimeline:Ljava/util/List;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntensityDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->intensityDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getRepsDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->repsDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->subtitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTonnageDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->tonnageDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getVolumeDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getVolumeTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->heartRateTimeline:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->repsDisplay:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeDisplay:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeTitleDisplay:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->subtitleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->tonnageDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->intensityDisplay:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->imageUrl:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->exerciseId:Ljava/lang/String;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/core/details/network/model/ItemModel;->achievementIcons:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/core/details/network/model/ItemModel;->endIcon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/core/details/network/model/ItemModel;->heartRateTimeline:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/core/details/network/model/ItemModel;->repsDisplay:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeDisplay:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/core/details/network/model/ItemModel;->volumeTitleDisplay:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/core/details/network/model/ItemModel;->subtitleDisplay:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/core/details/network/model/ItemModel;->titleDisplay:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/core/details/network/model/ItemModel;->tonnageDisplay:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/core/details/network/model/ItemModel;->intensityDisplay:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/core/details/network/model/ItemModel;->imageUrl:Ljava/lang/String;

    iget-object v11, p0, Lcom/whoop/core/details/network/model/ItemModel;->exerciseId:Ljava/lang/String;

    const-string v12, ", endIcon="

    const-string v13, ", heartRateTimeline="

    const-string v14, "ItemModel(achievementIcons="

    invoke-static {v14, v12, v1, v13, v0}, Lnh3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", repsDisplay="

    const-string v12, ", volumeDisplay="

    invoke-static {v1, v3, v12, v0, v2}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", volumeTitleDisplay="

    const-string v2, ", subtitleDisplay="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", titleDisplay="

    const-string v2, ", tonnageDisplay="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", intensityDisplay="

    const-string v2, ", imageUrl="

    invoke-static {v0, v8, v1, v9, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", exerciseId="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
