.class public final Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput$$serializer;,
        Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B+\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0005\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010!\u001a\u0004\u0008\"\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010!\u001a\u0004\u0008#\u0010\u0015\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;",
        "",
        "",
        "systolicMmhg",
        "diastolicMmhg",
        "<init>",
        "(II)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$sage_release",
        "(Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "copy",
        "(II)Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getSystolicMmhg",
        "getDiastolicMmhg",
        "Companion",
        "$serializer",
        "a",
        "sage_release"
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

.field public static final Companion:Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput$a;


# instance fields
.field private final diastolicMmhg:I

.field private final systolicMmhg:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->Companion:Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput$a;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->systolicMmhg:I

    .line 3
    iput p2, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->diastolicMmhg:I

    return-void
.end method

.method public synthetic constructor <init>(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 4
    sget-object p4, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput$$serializer;->INSTANCE:Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput$$serializer;

    invoke-virtual {p4}, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->systolicMmhg:I

    iput p3, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->diastolicMmhg:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;IIILjava/lang/Object;)Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->systolicMmhg:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->diastolicMmhg:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->copy(II)Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$sage_release(Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->systolicMmhg:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x1

    iget p0, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->diastolicMmhg:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->systolicMmhg:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->diastolicMmhg:I

    return v0
.end method

.method public final copy(II)Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;
    .locals 1

    new-instance v0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;

    invoke-direct {v0, p1, p2}, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;-><init>(II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;

    iget v1, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->systolicMmhg:I

    iget v3, p1, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->systolicMmhg:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->diastolicMmhg:I

    iget p1, p1, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->diastolicMmhg:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDiastolicMmhg()I
    .locals 1

    iget v0, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->diastolicMmhg:I

    return v0
.end method

.method public final getSystolicMmhg()I
    .locals 1

    iget v0, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->systolicMmhg:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->systolicMmhg:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->diastolicMmhg:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->systolicMmhg:I

    iget v1, p0, Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;->diastolicMmhg:I

    const-string v2, ", diastolicMmhg="

    const-string v3, ")"

    const-string v4, "ManualBloodPressureReadingInput(systolicMmhg="

    invoke-static {v0, v1, v4, v2, v3}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
