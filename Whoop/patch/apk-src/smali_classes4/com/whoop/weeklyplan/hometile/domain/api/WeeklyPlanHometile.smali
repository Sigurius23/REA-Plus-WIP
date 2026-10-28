.class public final Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile$$serializer;,
        Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 82\u00020\u0001:\u000298B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBS\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0016\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JJ\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010*H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00083\u0010 R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u00085\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u00087\u0010$\u00a8\u0006:"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "daysLeftDisplay",
        "Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;",
        "progressBar",
        "",
        "Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;",
        "items",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "cardButton",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;Ljava/util/List;Lcom/whoop/design/models/items/CardButtonModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;Ljava/util/List;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;Ljava/util/List;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getDaysLeftDisplay",
        "Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;",
        "getProgressBar",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getCardButton",
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

.field public static final Companion:Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile$Companion;


# instance fields
.field private final cardButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final daysLeftDisplay:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;",
            ">;"
        }
    .end annotation
.end field

.field private final progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->Companion:Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, La13/f;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, La13/f;-><init>(I)V

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

    sput-object v2, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;Ljava/util/List;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile$$serializer;

    invoke-virtual {p7}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->daysLeftDisplay:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    iput-object p5, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->items:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;Ljava/util/List;Lcom/whoop/design/models/items/CardButtonModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;",
            ">;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "daysLeftDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressBar"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->daysLeftDisplay:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->items:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;Ljava/util/List;Lcom/whoop/design/models/items/CardButtonModel;ILjava/lang/Object;)Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->daysLeftDisplay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->items:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;Ljava/util/List;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->daysLeftDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object p0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->daysLeftDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;Ljava/util/List;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;",
            ">;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            ")",
            "Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "daysLeftDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressBar"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;Ljava/util/List;Lcom/whoop/design/models/items/CardButtonModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->daysLeftDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->daysLeftDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object p1, p1, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCardButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getDaysLeftDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->daysLeftDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getProgressBar()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->daysLeftDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->items:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->daysLeftDisplay:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->progressBar:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->items:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    const-string v5, ", daysLeftDisplay="

    const-string v6, ", progressBar="

    const-string v7, "WeeklyPlanHometile(title="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
