.class public final Lcom/whoop/trends/data/model/MeasurementContent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/MeasurementContent$$serializer;,
        Lcom/whoop/trends/data/model/MeasurementContent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 =2\u00020\u0001:\u0002>=BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eB_\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'JZ\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u00100\u001a\u00020/2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u00080\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00102\u001a\u0004\u00083\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00085\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00086\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00107\u001a\u0004\u00088\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00102\u001a\u0004\u00089\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00102\u001a\u0004\u0008:\u0010\u001eR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010;\u001a\u0004\u0008<\u0010\'\u00a8\u0006?"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/MeasurementContent;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "Lgz0/m0;",
        "icon",
        "iconUrl",
        "",
        "measurementValue",
        "unit",
        "subtitle",
        "Lcom/whoop/trends/data/model/TrendMenuSheet;",
        "menuSheet",
        "<init>",
        "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/MeasurementContent;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lgz0/m0;",
        "component3",
        "component4",
        "()D",
        "component5",
        "component6",
        "component7",
        "()Lcom/whoop/trends/data/model/TrendMenuSheet;",
        "copy",
        "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;)Lcom/whoop/trends/data/model/MeasurementContent;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lgz0/m0;",
        "getIcon",
        "getIconUrl",
        "D",
        "getMeasurementValue",
        "getUnit",
        "getSubtitle",
        "Lcom/whoop/trends/data/model/TrendMenuSheet;",
        "getMenuSheet",
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

.field public static final Companion:Lcom/whoop/trends/data/model/MeasurementContent$Companion;


# instance fields
.field private final icon:Lgz0/m0;

.field private final iconUrl:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final measurementValue:D

.field private final menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

.field private final subtitle:Ljava/lang/String;

.field private final unit:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/trends/data/model/MeasurementContent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/MeasurementContent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/MeasurementContent;->Companion:Lcom/whoop/trends/data/model/MeasurementContent$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trends/data/model/MeasurementContent;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lwi0/d;

    const/16 v3, 0x15

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

    sput-object v2, Lcom/whoop/trends/data/model/MeasurementContent;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/trends/data/model/MeasurementContent$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MeasurementContent$$serializer;

    invoke-virtual {p10}, Lcom/whoop/trends/data/model/MeasurementContent$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/MeasurementContent;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/trends/data/model/MeasurementContent;->icon:Lgz0/m0;

    iput-object p4, p0, Lcom/whoop/trends/data/model/MeasurementContent;->iconUrl:Ljava/lang/String;

    iput-wide p5, p0, Lcom/whoop/trends/data/model/MeasurementContent;->measurementValue:D

    iput-object p7, p0, Lcom/whoop/trends/data/model/MeasurementContent;->unit:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/trends/data/model/MeasurementContent;->subtitle:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/trends/data/model/MeasurementContent;->menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/MeasurementContent;->icon:Lgz0/m0;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/MeasurementContent;->iconUrl:Ljava/lang/String;

    .line 6
    iput-wide p4, p0, Lcom/whoop/trends/data/model/MeasurementContent;->measurementValue:D

    .line 7
    iput-object p6, p0, Lcom/whoop/trends/data/model/MeasurementContent;->unit:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/whoop/trends/data/model/MeasurementContent;->subtitle:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/whoop/trends/data/model/MeasurementContent;->menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

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

    invoke-static {}, Lcom/whoop/trends/data/model/MeasurementContent;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/trends/data/model/MeasurementContent;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/MeasurementContent;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;ILjava/lang/Object;)Lcom/whoop/trends/data/model/MeasurementContent;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/trends/data/model/MeasurementContent;->icon:Lgz0/m0;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/trends/data/model/MeasurementContent;->iconUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-wide p4, p0, Lcom/whoop/trends/data/model/MeasurementContent;->measurementValue:D

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p6, p0, Lcom/whoop/trends/data/model/MeasurementContent;->unit:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p7, p0, Lcom/whoop/trends/data/model/MeasurementContent;->subtitle:Ljava/lang/String;

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    iget-object p8, p0, Lcom/whoop/trends/data/model/MeasurementContent;->menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    :cond_6
    move-object p9, p7

    move-object p10, p8

    move-object p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/trends/data/model/MeasurementContent;->copy(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;)Lcom/whoop/trends/data/model/MeasurementContent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/MeasurementContent;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/trends/data/model/MeasurementContent;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementContent;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementContent;->icon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->iconUrl:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->measurementValue:D

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->unit:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/trends/data/model/TrendMenuSheet$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendMenuSheet$$serializer;

    iget-object p0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->measurementValue:D

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/trends/data/model/TrendMenuSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;)Lcom/whoop/trends/data/model/MeasurementContent;
    .locals 10

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unit"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/MeasurementContent;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/trends/data/model/MeasurementContent;-><init>(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendMenuSheet;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/MeasurementContent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/MeasurementContent;

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementContent;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->icon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementContent;->icon:Lgz0/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementContent;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/trends/data/model/MeasurementContent;->measurementValue:D

    iget-wide v5, p1, Lcom/whoop/trends/data/model/MeasurementContent;->measurementValue:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->unit:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementContent;->unit:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/MeasurementContent;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    iget-object p1, p1, Lcom/whoop/trends/data/model/MeasurementContent;->menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMeasurementValue()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->measurementValue:D

    return-wide v0
.end method

.method public final getMenuSheet()Lcom/whoop/trends/data/model/TrendMenuSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnit()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->unit:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementContent;->icon:Lgz0/m0;

    invoke-static {v2, v0, v1}, Lhc3/i;->b(Lgz0/m0;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementContent;->iconUrl:Ljava/lang/String;

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

    iget-wide v4, p0, Lcom/whoop/trends/data/model/MeasurementContent;->measurementValue:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementContent;->unit:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementContent;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/TrendMenuSheet;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/trends/data/model/MeasurementContent;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/trends/data/model/MeasurementContent;->icon:Lgz0/m0;

    iget-object v2, p0, Lcom/whoop/trends/data/model/MeasurementContent;->iconUrl:Ljava/lang/String;

    iget-wide v3, p0, Lcom/whoop/trends/data/model/MeasurementContent;->measurementValue:D

    iget-object v5, p0, Lcom/whoop/trends/data/model/MeasurementContent;->unit:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/trends/data/model/MeasurementContent;->subtitle:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/trends/data/model/MeasurementContent;->menuSheet:Lcom/whoop/trends/data/model/TrendMenuSheet;

    const-string v8, ", icon="

    const-string v9, ", iconUrl="

    const-string v10, "MeasurementContent(id="

    invoke-static {v10, v0, v8, v1, v9}, Ljh3/c;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", measurementValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", unit="

    const-string v2, ", subtitle="

    invoke-static {v0, v1, v5, v2, v6}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", menuSheet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
