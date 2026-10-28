.class public final Lcom/whoop/home/domain/models/MciHomeTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/home/domain/models/MciHomeTileModel$$serializer;,
        Lcom/whoop/home/domain/models/MciHomeTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBM\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JD\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u00082\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u0010#\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/MciHomeTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "titleDisplay",
        "Lcom/whoop/navigation/e;",
        "destination",
        "destinationIcon",
        "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "dailyTickMarkPlot",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "logButton",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$home_release",
        "(Lcom/whoop/home/domain/models/MciHomeTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/navigation/e;",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "component5",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/home/domain/models/MciHomeTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitleDisplay",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getDestinationIcon",
        "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "getDailyTickMarkPlot",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getLogButton",
        "Companion",
        "$serializer",
        "home_release"
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

.field public static final Companion:Lcom/whoop/home/domain/models/MciHomeTileModel$Companion;


# instance fields
.field private final dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

.field private final destination:Lcom/whoop/navigation/e;

.field private final destinationIcon:Ljava/lang/String;

.field private final logButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final titleDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/home/domain/models/MciHomeTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/home/domain/models/MciHomeTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/home/domain/models/MciHomeTileModel;->Companion:Lcom/whoop/home/domain/models/MciHomeTileModel$Companion;

    sget v0, Lcom/whoop/design/models/items/CardButtonModel;->$stable:I

    sget v2, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->$stable:I

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/home/domain/models/MciHomeTileModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lyc2/a;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lyc2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

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

    sput-object v2, Lcom/whoop/home/domain/models/MciHomeTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/home/domain/models/MciHomeTileModel$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/MciHomeTileModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/home/domain/models/MciHomeTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->titleDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destination:Lcom/whoop/navigation/e;

    iput-object p4, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destinationIcon:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    iput-object p6, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;)V
    .locals 1

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destinationIcon"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dailyTickMarkPlot"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->titleDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destination:Lcom/whoop/navigation/e;

    .line 5
    iput-object p3, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destinationIcon:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/home/domain/models/MciHomeTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/home/domain/models/MciHomeTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/models/MciHomeTileModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;ILjava/lang/Object;)Lcom/whoop/home/domain/models/MciHomeTileModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->titleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destination:Lcom/whoop/navigation/e;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destinationIcon:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/home/domain/models/MciHomeTileModel;->copy(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/home/domain/models/MciHomeTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$home_release(Lcom/whoop/home/domain/models/MciHomeTileModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/home/domain/models/MciHomeTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destinationIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;

    iget-object v1, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destinationIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/home/domain/models/MciHomeTileModel;
    .locals 7

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destinationIcon"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dailyTickMarkPlot"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/home/domain/models/MciHomeTileModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/home/domain/models/MciHomeTileModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/models/MciHomeTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/models/MciHomeTileModel;

    iget-object v1, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/MciHomeTileModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/home/domain/models/MciHomeTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destinationIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/home/domain/models/MciHomeTileModel;->destinationIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    iget-object v3, p1, Lcom/whoop/home/domain/models/MciHomeTileModel;->dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object p1, p1, Lcom/whoop/home/domain/models/MciHomeTileModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getDailyTickMarkPlot()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getDestinationIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destinationIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLogButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->titleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v2, v0, v1}, Lvl/b;->a(Lcom/whoop/navigation/e;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destinationIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->titleDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destination:Lcom/whoop/navigation/e;

    iget-object v2, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->destinationIcon:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->dailyTickMarkPlot:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    iget-object v4, p0, Lcom/whoop/home/domain/models/MciHomeTileModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "MciHomeTileModel(titleDisplay="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", destination="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", destinationIcon="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dailyTickMarkPlot="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", logButton="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
