.class public final Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel$$serializer;,
        Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002/.B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008+\u0010\u001bR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u0008-\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "textDisplay",
        "",
        "currentStep",
        "totalSteps",
        "",
        "style",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;IILjava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$home_release",
        "(Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()I",
        "component3",
        "component4",
        "()Ljava/lang/String;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;IILjava/lang/String;)Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "getTextDisplay",
        "I",
        "getCurrentStep",
        "getTotalSteps",
        "Ljava/lang/String;",
        "getStyle",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel$Companion;


# instance fields
.field private final currentStep:I

.field private final style:Ljava/lang/String;

.field private final textDisplay:Lcom/whoop/design/util/TextResource;

.field private final totalSteps:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->Companion:Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel$$serializer;->INSTANCE:Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->textDisplay:Lcom/whoop/design/util/TextResource;

    iput p3, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->currentStep:I

    iput p4, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->totalSteps:I

    iput-object p5, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->style:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;IILjava/lang/String;)V
    .locals 1

    const-string v0, "textDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->textDisplay:Lcom/whoop/design/util/TextResource;

    .line 4
    iput p2, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->currentStep:I

    .line 5
    iput p3, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->totalSteps:I

    .line 6
    iput-object p4, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->style:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;Lcom/whoop/design/util/TextResource;IILjava/lang/String;ILjava/lang/Object;)Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->textDisplay:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->currentStep:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->totalSteps:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->style:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->copy(Lcom/whoop/design/util/TextResource;IILjava/lang/String;)Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$home_release(Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lmd1/a;->a:Lmd1/a;

    iget-object v1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->textDisplay:Lcom/whoop/design/util/TextResource;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget v1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->currentStep:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->totalSteps:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x3

    iget-object p0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->textDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->currentStep:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->totalSteps:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;IILjava/lang/String;)Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;
    .locals 1

    const-string v0, "textDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;-><init>(Lcom/whoop/design/util/TextResource;IILjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;

    iget-object v1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->textDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->textDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->currentStep:I

    iget v3, p1, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->currentStep:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->totalSteps:I

    iget v3, p1, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->totalSteps:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->style:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->style:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCurrentStep()I
    .locals 1

    iget v0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->currentStep:I

    return v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->textDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getTotalSteps()I
    .locals 1

    iget v0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->totalSteps:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->textDisplay:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->currentStep:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->totalSteps:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->style:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->textDisplay:Lcom/whoop/design/util/TextResource;

    iget v1, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->currentStep:I

    iget v2, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->totalSteps:I

    iget-object v3, p0, Lcom/whoop/home/domain/models/CurrentProgressStepsHomeModel;->style:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "CurrentProgressStepsHomeModel(textDisplay="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentStep="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", totalSteps="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", style="

    const-string v1, ")"

    invoke-static {v2, v0, v3, v1, v4}, Ly00/t7;->f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
