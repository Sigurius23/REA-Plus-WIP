.class public final Lcom/whoop/stress/domain/model/StressTrendStat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/stress/domain/model/StressTrendStat$$serializer;,
        Lcom/whoop/stress/domain/model/StressTrendStat$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000278B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJH\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010)\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008*\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010)\u0012\u0004\u0008.\u0010,\u001a\u0004\u0008-\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010)\u0012\u0004\u00080\u0010,\u001a\u0004\u0008/\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u00101\u0012\u0004\u00083\u0010,\u001a\u0004\u00082\u0010\u001eR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010)\u0012\u0004\u00085\u0010,\u001a\u0004\u00084\u0010\u001a\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/stress/domain/model/StressTrendStat;",
        "",
        "",
        "statDisplay",
        "statChangeDisplay",
        "statTrend",
        "Lcom/whoop/stress/domain/model/StressTrendType;",
        "style",
        "statLabel",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stress_release",
        "(Lcom/whoop/stress/domain/model/StressTrendStat;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/stress/domain/model/StressTrendType;",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressTrendStat;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getStatDisplay",
        "getStatDisplay$annotations",
        "()V",
        "getStatChangeDisplay",
        "getStatChangeDisplay$annotations",
        "getStatTrend",
        "getStatTrend$annotations",
        "Lcom/whoop/stress/domain/model/StressTrendType;",
        "getStyle",
        "getStyle$annotations",
        "getStatLabel",
        "getStatLabel$annotations",
        "Companion",
        "$serializer",
        "a",
        "stress_release"
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

.field public static final Companion:Lcom/whoop/stress/domain/model/StressTrendStat$a;


# instance fields
.field private final statChangeDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stat_change_display"
    .end annotation
.end field

.field private final statDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stat_display"
    .end annotation
.end field

.field private final statLabel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stat_label_display"
    .end annotation
.end field

.field private final statTrend:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stat_trend"
    .end annotation
.end field

.field private final style:Lcom/whoop/stress/domain/model/StressTrendType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "style"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/stress/domain/model/StressTrendStat$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/stress/domain/model/StressTrendStat$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/stress/domain/model/StressTrendStat;->Companion:Lcom/whoop/stress/domain/model/StressTrendStat$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lih1/b;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lih1/b;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/stress/domain/model/StressTrendStat;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/stress/domain/model/StressTrendStat$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrendStat$$serializer;

    invoke-virtual {p7}, Lcom/whoop/stress/domain/model/StressTrendStat$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statChangeDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statTrend:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->style:Lcom/whoop/stress/domain/model/StressTrendType;

    iput-object p6, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statLabel:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;)V
    .locals 1

    const-string v0, "statDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statChangeDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statTrend:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->style:Lcom/whoop/stress/domain/model/StressTrendType;

    .line 7
    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statLabel:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/stress/domain/model/StressTrendType;->Companion:Lcom/whoop/stress/domain/model/StressTrendType$a;

    invoke-virtual {v0}, Lcom/whoop/stress/domain/model/StressTrendType$a;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/stress/domain/model/StressTrendStat;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/stress/domain/model/StressTrendStat;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/stress/domain/model/StressTrendStat;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/stress/domain/model/StressTrendStat;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statChangeDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statTrend:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->style:Lcom/whoop/stress/domain/model/StressTrendType;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statLabel:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/stress/domain/model/StressTrendStat;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressTrendStat;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getStatChangeDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "stat_change_display"
    .end annotation

    return-void
.end method

.method public static synthetic getStatDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "stat_display"
    .end annotation

    return-void
.end method

.method public static synthetic getStatLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "stat_label_display"
    .end annotation

    return-void
.end method

.method public static synthetic getStatTrend$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "stat_trend"
    .end annotation

    return-void
.end method

.method public static synthetic getStyle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "style"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stress_release(Lcom/whoop/stress/domain/model/StressTrendStat;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/stress/domain/model/StressTrendStat;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statChangeDisplay:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statTrend:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->style:Lcom/whoop/stress/domain/model/StressTrendType;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x4

    iget-object p0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statChangeDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statTrend:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/stress/domain/model/StressTrendType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->style:Lcom/whoop/stress/domain/model/StressTrendType;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;)Lcom/whoop/stress/domain/model/StressTrendStat;
    .locals 7

    const-string v0, "statDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/stress/domain/model/StressTrendStat;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/stress/domain/model/StressTrendStat;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/stress/domain/model/StressTrendType;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/stress/domain/model/StressTrendStat;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/stress/domain/model/StressTrendStat;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrendStat;->statDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statChangeDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrendStat;->statChangeDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statTrend:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrendStat;->statTrend:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->style:Lcom/whoop/stress/domain/model/StressTrendType;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressTrendStat;->style:Lcom/whoop/stress/domain/model/StressTrendType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statLabel:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/stress/domain/model/StressTrendStat;->statLabel:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getStatChangeDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statChangeDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatTrend()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statTrend:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/stress/domain/model/StressTrendType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->style:Lcom/whoop/stress/domain/model/StressTrendType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statChangeDisplay:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statTrend:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->style:Lcom/whoop/stress/domain/model/StressTrendType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statLabel:Ljava/lang/String;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statChangeDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statTrend:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->style:Lcom/whoop/stress/domain/model/StressTrendType;

    iget-object v4, p0, Lcom/whoop/stress/domain/model/StressTrendStat;->statLabel:Ljava/lang/String;

    const-string v5, ", statChangeDisplay="

    const-string v6, ", statTrend="

    const-string v7, "StressTrendStat(statDisplay="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", statLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v4, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
