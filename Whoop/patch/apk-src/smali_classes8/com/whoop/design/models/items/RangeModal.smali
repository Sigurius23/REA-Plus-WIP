.class public final Lcom/whoop/design/models/items/RangeModal;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/RangeModal$$serializer;,
        Lcom/whoop/design/models/items/RangeModal$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u0000 &2\u00020\u0001:\u0002\'&B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B+\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ\'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010#\u001a\u0004\u0008$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010#\u001a\u0004\u0008%\u0010\u0016\u00a8\u0006("
    }
    d2 = {
        "Lcom/whoop/design/models/items/RangeModal;",
        "",
        "",
        "lowerEndpoint",
        "upperEndpoint",
        "<init>",
        "(FF)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/RangeModal;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()F",
        "component2",
        "copy",
        "(FF)Lcom/whoop/design/models/items/RangeModal;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "F",
        "getLowerEndpoint",
        "getUpperEndpoint",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/RangeModal$Companion;


# instance fields
.field private final lowerEndpoint:F

.field private final upperEndpoint:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/RangeModal$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/RangeModal$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/RangeModal;->Companion:Lcom/whoop/design/models/items/RangeModal$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lcom/whoop/design/models/items/RangeModal;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    .line 4
    iput p2, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    return-void
.end method

.method public synthetic constructor <init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/whoop/design/models/items/RangeModal;-><init>(FF)V

    return-void
.end method

.method public synthetic constructor <init>(IFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x0

    if-nez p4, :cond_0

    iput v0, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    goto :goto_0

    :cond_0
    iput p2, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    :goto_0
    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    iput v0, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    return-void

    :cond_1
    iput p3, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/RangeModal;FFILjava/lang/Object;)Lcom/whoop/design/models/items/RangeModal;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/items/RangeModal;->copy(FF)Lcom/whoop/design/models/items/RangeModal;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/RangeModal;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    iget v1, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    iget p0, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    return v0
.end method

.method public final copy(FF)Lcom/whoop/design/models/items/RangeModal;
    .locals 1

    new-instance v0, Lcom/whoop/design/models/items/RangeModal;

    invoke-direct {v0, p1, p2}, Lcom/whoop/design/models/items/RangeModal;-><init>(FF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/RangeModal;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/RangeModal;

    iget v1, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    iget v3, p1, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    iget p1, p1, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLowerEndpoint()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    return v0
.end method

.method public final getUpperEndpoint()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/whoop/design/models/items/RangeModal;->lowerEndpoint:F

    iget v1, p0, Lcom/whoop/design/models/items/RangeModal;->upperEndpoint:F

    const-string v2, ", upperEndpoint="

    const-string v3, ")"

    const-string v4, "RangeModal(lowerEndpoint="

    invoke-static {v4, v0, v2, v1, v3}, Lr80/c;->n(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
