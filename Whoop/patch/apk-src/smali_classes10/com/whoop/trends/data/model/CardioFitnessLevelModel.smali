.class public final Lcom/whoop/trends/data/model/CardioFitnessLevelModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;,
        Lcom/whoop/trends/data/model/CardioFitnessLevelModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 D2\u00020\u0001:\u0002EDBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eBa\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJX\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001\u00a2\u0006\u0004\u0008.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u00101\u0012\u0004\u00083\u00104\u001a\u0004\u00082\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00105\u0012\u0004\u00087\u00104\u001a\u0004\u00086\u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00108\u0012\u0004\u0008:\u00104\u001a\u0004\u00089\u0010\u0019R \u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00101\u0012\u0004\u0008<\u00104\u001a\u0004\u0008;\u0010\u0015R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00101\u0012\u0004\u0008>\u00104\u001a\u0004\u0008=\u0010\u0015R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u00101\u0012\u0004\u0008@\u00104\u001a\u0004\u0008?\u0010\u0015R\"\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010A\u0012\u0004\u0008C\u00104\u001a\u0004\u0008B\u0010\u001e\u00a8\u0006F"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;",
        "",
        "",
        "title",
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/trends/data/model/MeterModel;",
        "meter",
        "subtitle",
        "subtitleSuffix",
        "description",
        "Lcom/whoop/trends/data/model/ModalModel;",
        "modal",
        "<init>",
        "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lgz0/m0;",
        "component3",
        "()Lcom/whoop/trends/data/model/MeterModel;",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/trends/data/model/ModalModel;",
        "copy",
        "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;)Lcom/whoop/trends/data/model/CardioFitnessLevelModel;",
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
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "Lgz0/m0;",
        "getIcon",
        "getIcon$annotations",
        "Lcom/whoop/trends/data/model/MeterModel;",
        "getMeter",
        "getMeter$annotations",
        "getSubtitle",
        "getSubtitle$annotations",
        "getSubtitleSuffix",
        "getSubtitleSuffix$annotations",
        "getDescription",
        "getDescription$annotations",
        "Lcom/whoop/trends/data/model/ModalModel;",
        "getModal",
        "getModal$annotations",
        "Companion",
        "$serializer",
        "trends_release"
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

.field public static final Companion:Lcom/whoop/trends/data/model/CardioFitnessLevelModel$Companion;


# instance fields
.field private final description:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description"
    .end annotation
.end field

.field private final icon:Lgz0/m0;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "icon"
    .end annotation
.end field

.field private final meter:Lcom/whoop/trends/data/model/MeterModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "meter"
    .end annotation
.end field

.field private final modal:Lcom/whoop/trends/data/model/ModalModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "modal"
    .end annotation
.end field

.field private final subtitle:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle"
    .end annotation
.end field

.field private final subtitleSuffix:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtitle_suffix"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/CardioFitnessLevelModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->Companion:Lcom/whoop/trends/data/model/CardioFitnessLevelModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lwi0/d;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lwi0/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    const/4 v0, 0x5

    aput-object v1, v2, v0

    const/4 v0, 0x6

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;

    invoke-virtual {p9}, Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->icon:Lgz0/m0;

    iput-object p4, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->meter:Lcom/whoop/trends/data/model/MeterModel;

    iput-object p5, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitle:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitleSuffix:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->description:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->modal:Lcom/whoop/trends/data/model/ModalModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleSuffix"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->icon:Lgz0/m0;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->meter:Lcom/whoop/trends/data/model/MeterModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitle:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitleSuffix:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->description:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->modal:Lcom/whoop/trends/data/model/ModalModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;ILjava/lang/Object;)Lcom/whoop/trends/data/model/CardioFitnessLevelModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->icon:Lgz0/m0;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->meter:Lcom/whoop/trends/data/model/MeterModel;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitleSuffix:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->description:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->modal:Lcom/whoop/trends/data/model/ModalModel;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->copy(Ljava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;)Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDescription$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "description"
    .end annotation

    return-void
.end method

.method public static synthetic getIcon$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "icon"
    .end annotation

    return-void
.end method

.method public static synthetic getMeter$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "meter"
    .end annotation

    return-void
.end method

.method public static synthetic getModal$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "modal"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "subtitle"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitleSuffix$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "subtitle_suffix"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->icon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/trends/data/model/MeterModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MeterModel$$serializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->meter:Lcom/whoop/trends/data/model/MeterModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitleSuffix:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/trends/data/model/ModalModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ModalModel$$serializer;

    iget-object p0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->modal:Lcom/whoop/trends/data/model/ModalModel;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final component3()Lcom/whoop/trends/data/model/MeterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->meter:Lcom/whoop/trends/data/model/MeterModel;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitleSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/trends/data/model/ModalModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->modal:Lcom/whoop/trends/data/model/ModalModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;)Lcom/whoop/trends/data/model/CardioFitnessLevelModel;
    .locals 9

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleSuffix"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->icon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->icon:Lgz0/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->meter:Lcom/whoop/trends/data/model/MeterModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->meter:Lcom/whoop/trends/data/model/MeterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitleSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitleSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->modal:Lcom/whoop/trends/data/model/ModalModel;

    iget-object p1, p1, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->modal:Lcom/whoop/trends/data/model/ModalModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final getMeter()Lcom/whoop/trends/data/model/MeterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->meter:Lcom/whoop/trends/data/model/MeterModel;

    return-object v0
.end method

.method public final getModal()Lcom/whoop/trends/data/model/ModalModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->modal:Lcom/whoop/trends/data/model/ModalModel;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitleSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitleSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->icon:Lgz0/m0;

    invoke-static {v2, v0, v1}, Lhc3/i;->b(Lgz0/m0;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->meter:Lcom/whoop/trends/data/model/MeterModel;

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/MeterModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitle:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitleSuffix:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->description:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->modal:Lcom/whoop/trends/data/model/ModalModel;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ModalModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->icon:Lgz0/m0;

    iget-object v2, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->meter:Lcom/whoop/trends/data/model/MeterModel;

    iget-object v3, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->subtitleSuffix:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->description:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->modal:Lcom/whoop/trends/data/model/ModalModel;

    const-string v7, ", icon="

    const-string v8, ", meter="

    const-string v9, "CardioFitnessLevelModel(title="

    invoke-static {v9, v0, v7, v1, v8}, Ljh3/c;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitleSuffix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    const-string v2, ", modal="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
