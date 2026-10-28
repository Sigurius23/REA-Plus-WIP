.class public final Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel$$serializer;,
        Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>=B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eB]\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0010\u0010%\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&JR\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010*\u001a\u00020)H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010.H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001eR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00086\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00087\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u00089\u0010#R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u0008:\u0010#R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008<\u0010&\u00a8\u0006?"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "Lcom/whoop/bot/models/conversation/SleepBoundModel;",
        "sleepBounds",
        "predictionTitle",
        "Lcom/whoop/design/models/items/HorizontalStatModel;",
        "hoursOfSleepStat",
        "consistencyStat",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "editButton",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/HorizontalStatModel;",
        "component5",
        "component6",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "Ljava/util/List;",
        "getSleepBounds",
        "getPredictionTitle",
        "Lcom/whoop/design/models/items/HorizontalStatModel;",
        "getHoursOfSleepStat",
        "getConsistencyStat",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getEditButton",
        "Companion",
        "$serializer",
        "bot_release"
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

.field public static final Companion:Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel$Companion;


# instance fields
.field private final consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

.field private final editButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

.field private final predictionTitle:Lcom/whoop/design/util/TextResource;

.field private final sleepBounds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/SleepBoundModel;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->Companion:Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ljl0/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ljl0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v0, v2, v4

    const/4 v0, 0x2

    aput-object v1, v2, v0

    aput-object v1, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->title:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->sleepBounds:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->predictionTitle:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    iput-object p6, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    iput-object p7, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->editButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/SleepBoundModel;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepBounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predictionTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hoursOfSleepStat"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consistencyStat"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editButton"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->title:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->sleepBounds:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->predictionTitle:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->editButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/bot/models/conversation/SleepBoundModel$$serializer;->INSTANCE:Lcom/whoop/bot/models/conversation/SleepBoundModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;ILjava/lang/Object;)Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->sleepBounds:Ljava/util/List;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->predictionTitle:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->editButton:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->copy(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->title:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->sleepBounds:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->predictionTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HorizontalStatModel$$serializer;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->editButton:Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/SleepBoundModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->sleepBounds:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->predictionTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/HorizontalStatModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/HorizontalStatModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->editButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/SleepBoundModel;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            "Lcom/whoop/design/models/items/HorizontalStatModel;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            ")",
            "Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepBounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predictionTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hoursOfSleepStat"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consistencyStat"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editButton"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/CardButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->sleepBounds:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->sleepBounds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->predictionTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->predictionTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    iget-object v3, p1, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->editButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object p1, p1, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->editButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getConsistencyStat()Lcom/whoop/design/models/items/HorizontalStatModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    return-object v0
.end method

.method public final getEditButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->editButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getHoursOfSleepStat()Lcom/whoop/design/models/items/HorizontalStatModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    return-object v0
.end method

.method public final getPredictionTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->predictionTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSleepBounds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/bot/models/conversation/SleepBoundModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->sleepBounds:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->sleepBounds:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->predictionTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/HorizontalStatModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/HorizontalStatModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->editButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->sleepBounds:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->predictionTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->hoursOfSleepStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    iget-object v4, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->consistencyStat:Lcom/whoop/design/models/items/HorizontalStatModel;

    iget-object v5, p0, Lcom/whoop/bot/models/conversation/BedtimeRecommendationTileModel;->editButton:Lcom/whoop/design/models/items/CardButtonModel;

    const-string v6, ", sleepBounds="

    const-string v7, ", predictionTitle="

    const-string v8, "BedtimeRecommendationTileModel(title="

    invoke-static {v0, v8, v6, v7, v1}, Lte0/d;->p(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hoursOfSleepStat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", consistencyStat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", editButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
