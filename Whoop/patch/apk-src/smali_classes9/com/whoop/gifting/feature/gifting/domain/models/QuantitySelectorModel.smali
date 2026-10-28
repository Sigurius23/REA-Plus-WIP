.class public final Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel$$serializer;,
        Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B9\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0007\u0010\rJ\'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ4\u0010\u001c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\u0008\u0010\"\u001a\u0004\u0018\u00010!H\u00d6\u0003\u00a2\u0006\u0004\u0008$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010&\u001a\u0004\u0008\'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010(\u001a\u0004\u0008)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010(\u001a\u0004\u0008*\u0010\u001a\u00a8\u0006-"
    }
    d2 = {
        "Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;",
        "numericStepper",
        "",
        "description",
        "id",
        "<init>",
        "(Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$gifting_release",
        "(Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "copy",
        "(Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;",
        "getNumericStepper",
        "Ljava/lang/String;",
        "getDescription",
        "getId",
        "Companion",
        "$serializer",
        "gifting_release"
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

.field public static final Companion:Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel$Companion;


# instance fields
.field private final description:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->Companion:Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel$$serializer;->INSTANCE:Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel$$serializer;

    invoke-virtual {p5}, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    iput-object p3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->description:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->id:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    .line 4
    iput-object p2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->description:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->id:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->description:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->id:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->copy(Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$gifting_release(Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel$$serializer;->INSTANCE:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel$$serializer;

    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->description:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object p0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;
    .locals 1

    new-instance v0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;-><init>(Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;

    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    iget-object v3, p1, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->id:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->id:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getNumericStepper()Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->description:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->id:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->numericStepper:Lcom/whoop/gifting/feature/gifting/domain/models/NumericStepperModel;

    iget-object v1, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->description:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/gifting/feature/gifting/domain/models/QuantitySelectorModel;->id:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "QuantitySelectorModel(numericStepper="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", description="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
