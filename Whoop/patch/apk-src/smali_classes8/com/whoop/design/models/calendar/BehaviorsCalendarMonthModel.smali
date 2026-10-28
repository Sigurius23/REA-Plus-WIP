.class public final Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel$$serializer;,
        Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B;\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bBM\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJD\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010*\u001a\u0004\u0008+\u0010\u001cR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010,\u001a\u0004\u0008-\u0010\u001eR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010,\u001a\u0004\u0008.\u0010\u001e\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;",
        "",
        "",
        "month",
        "",
        "yesCount",
        "",
        "dayHeaders",
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel;",
        "weeks",
        "<init>",
        "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "copy",
        "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getMonth",
        "I",
        "getYesCount",
        "Ljava/util/List;",
        "getDayHeaders",
        "getWeeks",
        "Companion",
        "$serializer",
        "design-models_release"
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

.field public static final Companion:Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel$Companion;


# instance fields
.field private final dayHeaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final month:Ljava/lang/String;

.field private final weeks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel;",
            ">;"
        }
    .end annotation
.end field

.field private final yesCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->Companion:Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Ls51/p;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Ls51/p;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Ls51/p;

    const/16 v4, 0xd

    invoke-direct {v3, v4}, Ls51/p;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x4

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v1, 0x2

    aput-object v2, v3, v1

    const/4 v1, 0x3

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    if-nez p6, :cond_0

    .line 3
    const-string p2, ""

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput p2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    goto :goto_0

    :cond_1
    iput p3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    :goto_0
    and-int/lit8 p2, p1, 0x4

    sget-object p3, Lm83/y;->w:Lm83/y;

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "month"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayHeaders"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weeks"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    .line 7
    iput p2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    .line 8
    iput-object p3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    .line 9
    iput-object p4, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 10
    const-string p1, ""

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 11
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V

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

    sget-object v1, Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel$$serializer;->INSTANCE:Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;Ljava/lang/String;ILjava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->copy(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    const-string v3, ""

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    if-eqz v2, :cond_3

    :goto_1
    iget v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel;",
            ">;)",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;"
        }
    .end annotation

    const-string v0, "month"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayHeaders"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weeks"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;-><init>(Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;

    iget-object v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    iget v3, p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDayHeaders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    return-object v0
.end method

.method public final getMonth()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeeks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    return-object v0
.end method

.method public final getYesCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->month:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->yesCount:I

    iget-object v2, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->dayHeaders:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->weeks:Ljava/util/List;

    const-string v4, ", yesCount="

    const-string v5, ", dayHeaders="

    const-string v6, "BehaviorsCalendarMonthModel(month="

    invoke-static {v1, v6, v0, v4, v5}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", weeks="

    const-string v4, ")"

    invoke-static {v0, v2, v1, v3, v4}, Lq63/c;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
