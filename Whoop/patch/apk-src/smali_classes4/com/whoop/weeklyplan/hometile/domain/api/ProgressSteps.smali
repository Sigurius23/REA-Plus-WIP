.class public final Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps$$serializer;,
        Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBO\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0016\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JH\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u0008/\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u00080\u0010\u001eR\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00082\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00103\u001a\u0004\u00084\u0010#\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;",
        "",
        "",
        "textDisplay",
        "",
        "currentStep",
        "totalSteps",
        "",
        "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;",
        "textDisplayOptions",
        "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;",
        "style",
        "<init>",
        "(Ljava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;",
        "copy",
        "(Ljava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTextDisplay",
        "I",
        "getCurrentStep",
        "getTotalSteps",
        "Ljava/util/List;",
        "getTextDisplayOptions",
        "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;",
        "getStyle",
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

.field public static final Companion:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps$Companion;


# instance fields
.field private final currentStep:I

.field private final style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

.field private final textDisplay:Ljava/lang/String;

.field private final textDisplayOptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;",
            ">;"
        }
    .end annotation
.end field

.field private final totalSteps:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->Companion:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, La13/f;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, La13/f;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, La13/f;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, La13/f;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v1, 0x3

    aput-object v2, v3, v1

    const/4 v1, 0x4

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps$$serializer;

    invoke-virtual {p7}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplay:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->currentStep:I

    iput p4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->totalSteps:I

    iput-object p5, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplayOptions:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;",
            ">;",
            "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;",
            ")V"
        }
    .end annotation

    const-string v0, "textDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textDisplayOptions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplay:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->currentStep:I

    .line 5
    iput p3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->totalSteps:I

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplayOptions:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.weeklyplan.hometile.domain.api.TextDisplayStyle"

    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;->values()[Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;Ljava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;ILjava/lang/Object;)Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->currentStep:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->totalSteps:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplayOptions:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->copy(Ljava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->currentStep:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->totalSteps:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplayOptions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->currentStep:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->totalSteps:I

    return v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplayOptions:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;",
            ">;",
            "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;",
            ")",
            "Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;"
        }
    .end annotation

    const-string v0, "textDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textDisplayOptions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;-><init>(Ljava/lang/String;IILjava/util/List;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->currentStep:I

    iget v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->currentStep:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->totalSteps:I

    iget v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->totalSteps:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplayOptions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplayOptions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    iget-object p1, p1, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCurrentStep()I
    .locals 1

    iget v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->currentStep:I

    return v0
.end method

.method public final getStyle()Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    return-object v0
.end method

.method public final getTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextDisplayOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplayOptions:Ljava/util/List;

    return-object v0
.end method

.method public final getTotalSteps()I
    .locals 1

    iget v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->totalSteps:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->currentStep:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->totalSteps:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplayOptions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplay:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->currentStep:I

    iget v2, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->totalSteps:I

    iget-object v3, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->textDisplayOptions:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->style:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    const-string v5, ", currentStep="

    const-string v6, ", totalSteps="

    const-string v7, "ProgressSteps(textDisplay="

    invoke-static {v1, v7, v0, v5, v6}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", textDisplayOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
