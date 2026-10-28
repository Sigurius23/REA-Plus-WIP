.class public final Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$$serializer;,
        Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ<\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010)\u001a\u0004\u0008/\u0010\u001a\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;",
        "",
        "",
        "title",
        "Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;",
        "circularProgressIndicator",
        "Lcom/whoop/navigation/e;",
        "destination",
        "id",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;",
        "component3",
        "()Lcom/whoop/navigation/e;",
        "component4",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;",
        "getCircularProgressIndicator",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "getId",
        "Companion",
        "$serializer",
        "weekly-plan_release"
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

.field public static final Companion:Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$Companion;


# instance fields
.field private final circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

.field private final destination:Lcom/whoop/navigation/e;

.field private final id:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->Companion:Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, La13/f;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, La13/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$$serializer;

    invoke-virtual {p6}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    iput-object p4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->destination:Lcom/whoop/navigation/e;

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    return-void

    :cond_1
    iput-object p5, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "circularProgressIndicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->destination:Lcom/whoop/navigation/e;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;)V

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

    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->destination:Lcom/whoop/navigation/e;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->copy(Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    return-object v0
.end method

.method public final component3()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "circularProgressIndicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->destination:Lcom/whoop/navigation/e;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->circularProgressIndicator:Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->id:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PlanItem(title="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", circularProgressIndicator="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", destination="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
