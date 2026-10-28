.class public final Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBO\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u000b\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JJ\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010 J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u0010 R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00081\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u00082\u0010\u001eR \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u00103\u001a\u0004\u00084\u0010$\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;",
        "",
        "",
        "textDisplay",
        "",
        "currentStep",
        "totalSteps",
        "style",
        "",
        "Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto;",
        "textDisplayOptions",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;IILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;",
        "toCurrentProgressSteps",
        "()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "component5",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;",
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
        "getStyle",
        "Ljava/util/List;",
        "getTextDisplayOptions",
        "Companion",
        "$serializer",
        "core_release"
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

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto$Companion;


# instance fields
.field private final currentStep:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "current_step"
    .end annotation
.end field

.field private final style:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "style"
    .end annotation
.end field

.field private final textDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "text_display"
    .end annotation
.end field

.field private final textDisplayOptions:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "text_display_options"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto;",
            ">;"
        }
    .end annotation
.end field

.field private final totalSteps:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_steps"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->Companion:Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lvw0/a;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lvw0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v1, 0x4

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto$$serializer;

    invoke-virtual {p7}, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    iput p4, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto;",
            ">;)V"
        }
    .end annotation

    const-string v0, "textDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textDisplayOptions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    .line 5
    iput p3, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->copy(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto;",
            ">;)",
            "Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;"
        }
    .end annotation

    const-string v0, "textDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textDisplayOptions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    iget v3, p1, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCurrentStep()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    return v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextDisplayOptions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    return-object v0
.end method

.method public final getTotalSteps()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;
    .locals 7

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    iget v3, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/data/remote/domain/dto/JournalResponseDtoKt;->access$convertToCircularProgressStyleEnum(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto;

    invoke-virtual {v6}, Lcom/whoop/data/remote/domain/dto/TextDisplayOptionDto;->toTextDisplayOption()Lcom/whoop/data/remote/domain/response/journal/TextDisplayOption;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    new-instance v0, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    invoke-direct/range {v0 .. v5}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;-><init>(Ljava/lang/String;IILcom/whoop/data/remote/domain/dto/CircularProgressStyle;Ljava/util/List;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplay:Ljava/lang/String;

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->currentStep:I

    iget v2, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->totalSteps:I

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->style:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/CurrentProgressStepsDto;->textDisplayOptions:Ljava/util/List;

    const-string v5, ", currentStep="

    const-string v6, ", totalSteps="

    const-string v7, "CurrentProgressStepsDto(textDisplay="

    invoke-static {v1, v7, v0, v5, v6}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", style="

    const-string v5, ", textDisplayOptions="

    invoke-static {v2, v1, v3, v5, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
