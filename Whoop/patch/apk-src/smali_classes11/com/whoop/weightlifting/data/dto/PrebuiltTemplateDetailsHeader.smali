.class public final Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$$serializer;,
        Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bBI\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001bJ>\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010(\u001a\u00020\'2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010*\u0012\u0004\u0008,\u0010-\u001a\u0004\u0008+\u0010\u001bR&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010.\u0012\u0004\u00080\u0010-\u001a\u0004\u0008/\u0010\u001dR \u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00101\u0012\u0004\u00083\u0010-\u001a\u0004\u00082\u0010\u001fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010*\u0012\u0004\u00085\u0010-\u001a\u0004\u00084\u0010\u001b\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;",
        "",
        "",
        "backgroundImageUrl",
        "",
        "Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;",
        "titleMetricTiles",
        "Lcom/whoop/design/util/TextResource;",
        "workoutSubtitleDisplay",
        "workoutTitleDisplay",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Lcom/whoop/design/util/TextResource;",
        "component4",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getBackgroundImageUrl",
        "getBackgroundImageUrl$annotations",
        "()V",
        "Ljava/util/List;",
        "getTitleMetricTiles",
        "getTitleMetricTiles$annotations",
        "Lcom/whoop/design/util/TextResource;",
        "getWorkoutSubtitleDisplay",
        "getWorkoutSubtitleDisplay$annotations",
        "getWorkoutTitleDisplay",
        "getWorkoutTitleDisplay$annotations",
        "Companion",
        "$serializer",
        "weightlifting_release"
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

.field public static final Companion:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$Companion;


# instance fields
.field private final backgroundImageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "background_image_url"
    .end annotation
.end field

.field private final titleMetricTiles:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title_metric_tiles"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;",
            ">;"
        }
    .end annotation
.end field

.field private final workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "workout_subtitle_display"
    .end annotation
.end field

.field private final workoutTitleDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "workout_title_display"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->Companion:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lkt2/a;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lkt2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$$serializer;

    invoke-virtual {p6}, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->backgroundImageUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->titleMetricTiles:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutTitleDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "backgroundImageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleMetricTiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutSubtitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutTitleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->backgroundImageUrl:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->titleMetricTiles:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutTitleDisplay:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->backgroundImageUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->titleMetricTiles:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutTitleDisplay:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBackgroundImageUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "background_image_url"
    .end annotation

    return-void
.end method

.method public static synthetic getTitleMetricTiles$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title_metric_tiles"
    .end annotation

    return-void
.end method

.method public static synthetic getWorkoutSubtitleDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "workout_subtitle_display"
    .end annotation

    return-void
.end method

.method public static synthetic getWorkoutTitleDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "workout_title_display"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->backgroundImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->titleMetricTiles:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lmd1/a;->a:Lmd1/a;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object p0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->titleMetricTiles:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;"
        }
    .end annotation

    const-string v0, "backgroundImageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleMetricTiles"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutSubtitleDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutTitleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->titleMetricTiles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->titleMetricTiles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutTitleDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutTitleDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleMetricTiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->titleMetricTiles:Ljava/util/List;

    return-object v0
.end method

.method public final getWorkoutSubtitleDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getWorkoutTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->backgroundImageUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->titleMetricTiles:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutTitleDisplay:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->backgroundImageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->titleMetricTiles:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutSubtitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->workoutTitleDisplay:Ljava/lang/String;

    const-string v4, ", titleMetricTiles="

    const-string v5, ", workoutSubtitleDisplay="

    const-string v6, "PrebuiltTemplateDetailsHeader(backgroundImageUrl="

    invoke-static {v6, v0, v4, v5, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", workoutTitleDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
