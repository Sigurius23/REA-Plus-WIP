.class public final Lcom/whoop/streaks/domain/models/StreaksResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/streaks/domain/models/StreaksResponse$$serializer;,
        Lcom/whoop/streaks/domain/models/StreaksResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 Q2\u00020\u0001:\u0002RQBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u008f\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u0016\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0092\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00103\u001a\u0002022\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00083\u00104J\'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001\u00a2\u0006\u0004\u0008;\u0010<R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010>\u001a\u0004\u0008?\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010@\u001a\u0004\u0008A\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010@\u001a\u0004\u0008B\u0010\u001eR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010C\u001a\u0004\u0008D\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010E\u001a\u0004\u0008F\u0010#R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010>\u001a\u0004\u0008G\u0010\u001cR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010>\u001a\u0004\u0008H\u0010\u001cR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010@\u0012\u0004\u0008J\u0010K\u001a\u0004\u0008I\u0010\u001eR \u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010L\u001a\u0004\u0008M\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010@\u001a\u0004\u0008N\u0010\u001eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010O\u001a\u0004\u0008P\u0010+\u00a8\u0006S"
    }
    d2 = {
        "Lcom/whoop/streaks/domain/models/StreaksResponse;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "lottieUrl",
        "imageUrl",
        "Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "celebrationMedia",
        "Lcom/whoop/design/models/TitleSubTitleModel;",
        "titleSubtitle",
        "streakValue",
        "streakSubtitle",
        "streakState",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "headerIcon",
        "Lcom/whoop/navigation/e;",
        "headerIconDestination",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "component5",
        "()Lcom/whoop/design/models/TitleSubTitleModel;",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Ljava/util/List;",
        "component10",
        "component11",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/streaks/domain/models/StreaksResponse;",
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
        "write$Self$streaks_release",
        "(Lcom/whoop/streaks/domain/models/StreaksResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "Ljava/lang/String;",
        "getLottieUrl",
        "getImageUrl",
        "Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
        "getCelebrationMedia",
        "Lcom/whoop/design/models/TitleSubTitleModel;",
        "getTitleSubtitle",
        "getStreakValue",
        "getStreakSubtitle",
        "getStreakState",
        "getStreakState$annotations",
        "()V",
        "Ljava/util/List;",
        "getItems",
        "getHeaderIcon",
        "Lcom/whoop/navigation/e;",
        "getHeaderIconDestination",
        "Companion",
        "$serializer",
        "streaks_release"
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

.field public static final Companion:Lcom/whoop/streaks/domain/models/StreaksResponse$Companion;


# instance fields
.field private final celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "celebration_media"
    .end annotation
.end field

.field private final headerIcon:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "header_icon"
    .end annotation
.end field

.field private final headerIconDestination:Lcom/whoop/navigation/e;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "header_icon_destination"
    .end annotation
.end field

.field private final imageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "image_url"
    .end annotation
.end field

.field private final items:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final lottieUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "lottie_url"
    .end annotation
.end field

.field private final streakState:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "today_streak_state"
    .end annotation
.end field

.field private final streakSubtitle:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "streak_subtitle"
    .end annotation
.end field

.field private final streakValue:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "streak_value"
    .end annotation
.end field

.field private final title:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field

.field private final titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title_subtitle"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/streaks/domain/models/StreaksResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/streaks/domain/models/StreaksResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/streaks/domain/models/StreaksResponse;->Companion:Lcom/whoop/streaks/domain/models/StreaksResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/streaks/domain/models/StreaksResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lri2/a;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lri2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lri2/a;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Lri2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0xb

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    aput-object v1, v5, v4

    aput-object v1, v5, v6

    const/4 v4, 0x3

    aput-object v1, v5, v4

    const/4 v4, 0x4

    aput-object v1, v5, v4

    const/4 v4, 0x5

    aput-object v1, v5, v4

    const/4 v4, 0x6

    aput-object v1, v5, v4

    const/4 v4, 0x7

    aput-object v1, v5, v4

    aput-object v3, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    const/16 v0, 0xa

    aput-object v2, v5, v0

    sput-object v5, Lcom/whoop/streaks/domain/models/StreaksResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p13, p1, 0x7a7

    const/16 v0, 0x7a7

    if-eq v0, p13, :cond_0

    .line 1
    sget-object p13, Lcom/whoop/streaks/domain/models/StreaksResponse$$serializer;->INSTANCE:Lcom/whoop/streaks/domain/models/StreaksResponse$$serializer;

    invoke-virtual {p13}, Lcom/whoop/streaks/domain/models/StreaksResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p13

    invoke-static {p1, v0, p13}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->title:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->lottieUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->imageUrl:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    :goto_0
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    goto :goto_1

    :cond_2
    iput-object p6, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    :goto_1
    iput-object p7, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakValue:Lcom/whoop/design/util/TextResource;

    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    :goto_2
    iput-object p9, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakState:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->items:Ljava/util/List;

    iput-object p11, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIcon:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIconDestination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
            "Lcom/whoop/design/models/TitleSubTitleModel;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streakValue"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streakState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->title:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->lottieUrl:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->imageUrl:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakValue:Lcom/whoop/design/util/TextResource;

    .line 9
    iput-object p7, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    .line 10
    iput-object p8, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakState:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->items:Ljava/util/List;

    .line 12
    iput-object p10, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIcon:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIconDestination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x8

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p12, p12, 0x40

    if-eqz p12, :cond_2

    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/streaks/domain/models/StreaksResponse;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/streaks/domain/models/StreaksResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/streaks/domain/models/StreaksResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/streaks/domain/models/StreaksResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/streaks/domain/models/StreaksResponse;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/streaks/domain/models/StreaksResponse;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->title:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->lottieUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->imageUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakValue:Lcom/whoop/design/util/TextResource;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakState:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->items:Ljava/util/List;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIcon:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIconDestination:Lcom/whoop/navigation/e;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/streaks/domain/models/StreaksResponse;->copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/streaks/domain/models/StreaksResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getStreakState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "today_streak_state"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$streaks_release(Lcom/whoop/streaks/domain/models/StreaksResponse;Lzc3/c;Lyc3/g;)V
    .locals 6

    sget-object v0, Lcom/whoop/streaks/domain/models/StreaksResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->lottieUrl:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    if-eqz v4, :cond_1

    :goto_0
    sget-object v4, Lcom/whoop/design/models/celebration/CelebrationMediaModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/CelebrationMediaModel$$serializer;

    iget-object v5, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    invoke-interface {p1, p2, v3, v4, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v3, 0x4

    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    if-eqz v4, :cond_3

    :goto_1
    sget-object v4, Lcom/whoop/design/models/TitleSubTitleModel$$serializer;->INSTANCE:Lcom/whoop/design/models/TitleSubTitleModel$$serializer;

    iget-object v5, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    invoke-interface {p1, p2, v3, v4, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v3, 0x5

    iget-object v4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakValue:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    if-eqz v4, :cond_5

    :goto_2
    iget-object v4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x7

    iget-object v3, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakState:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    aget-object v3, v0, v1

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    iget-object v3, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIconDestination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIconDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->lottieUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/celebration/CelebrationMediaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/TitleSubTitleModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakValue:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakState:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/streaks/domain/models/StreaksResponse;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/celebration/CelebrationMediaModel;",
            "Lcom/whoop/design/models/TitleSubTitleModel;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")",
            "Lcom/whoop/streaks/domain/models/StreaksResponse;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streakValue"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streakState"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/streaks/domain/models/StreaksResponse;

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/whoop/streaks/domain/models/StreaksResponse;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/celebration/CelebrationMediaModel;Lcom/whoop/design/models/TitleSubTitleModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/streaks/domain/models/StreaksResponse;

    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->lottieUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->lottieUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    iget-object v3, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    iget-object v3, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakValue:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakValue:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakState:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIconDestination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIconDestination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCelebrationMedia()Lcom/whoop/design/models/celebration/CelebrationMediaModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    return-object v0
.end method

.method public final getHeaderIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaderIconDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIconDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getLottieUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->lottieUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getStreakState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakState:Ljava/lang/String;

    return-object v0
.end method

.method public final getStreakSubtitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getStreakValue()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakValue:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTitleSubtitle()Lcom/whoop/design/models/TitleSubTitleModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->lottieUrl:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->imageUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/celebration/CelebrationMediaModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/TitleSubTitleModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakValue:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakState:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIcon:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIconDestination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->title:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->lottieUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->imageUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->celebrationMedia:Lcom/whoop/design/models/celebration/CelebrationMediaModel;

    iget-object v4, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->titleSubtitle:Lcom/whoop/design/models/TitleSubTitleModel;

    iget-object v5, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakValue:Lcom/whoop/design/util/TextResource;

    iget-object v6, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakSubtitle:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->streakState:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->items:Ljava/util/List;

    iget-object v9, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIcon:Ljava/lang/String;

    iget-object v10, p0, Lcom/whoop/streaks/domain/models/StreaksResponse;->headerIconDestination:Lcom/whoop/navigation/e;

    const-string v11, ", lottieUrl="

    const-string v12, ", imageUrl="

    const-string v13, "StreaksResponse(title="

    invoke-static {v13, v0, v11, v1, v12}, Lq63/c;->o(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", celebrationMedia="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", titleSubtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", streakValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", streakSubtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", streakState="

    const-string v2, ", items="

    invoke-static {v0, v6, v1, v7, v2}, Lq63/c;->z(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", headerIcon="

    const-string v2, ", headerIconDestination="

    invoke-static {v1, v9, v2, v0, v8}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ")"

    invoke-static {v0, v10, v1}, Lte0/d;->o(Ljava/lang/StringBuilder;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
