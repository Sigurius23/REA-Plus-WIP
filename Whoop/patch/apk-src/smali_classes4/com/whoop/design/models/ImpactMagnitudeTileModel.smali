.class public final Lcom/whoop/design/models/ImpactMagnitudeTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/ImpactMagnitudeTileModel$$serializer;,
        Lcom/whoop/design/models/ImpactMagnitudeTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u0000 ,2\u00020\u0001:\u0002-,B)\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tB?\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J8\u0010\u001d\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010\u0019R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\'\u001a\u0004\u0008+\u0010\u0019\u00a8\u0006."
    }
    d2 = {
        "Lcom/whoop/design/models/ImpactMagnitudeTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "magnitudeHeaderDisplay",
        "",
        "Lcom/whoop/design/models/MagnitudeDetailCardModel;",
        "magnitudeCards",
        "magnitudeCalloutDisplay",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/ImpactMagnitudeTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/design/models/ImpactMagnitudeTileModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getMagnitudeHeaderDisplay",
        "Ljava/util/List;",
        "getMagnitudeCards",
        "getMagnitudeCalloutDisplay",
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

.field public static final Companion:Lcom/whoop/design/models/ImpactMagnitudeTileModel$Companion;


# instance fields
.field private final magnitudeCalloutDisplay:Ljava/lang/String;

.field private final magnitudeCards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/MagnitudeDetailCardModel;",
            ">;"
        }
    .end annotation
.end field

.field private final magnitudeHeaderDisplay:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/ImpactMagnitudeTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/ImpactMagnitudeTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->Companion:Lcom/whoop/design/models/ImpactMagnitudeTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/design/models/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lcom/whoop/design/models/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-array v2, v3, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p5, :cond_0

    .line 1
    sget-object p5, Lcom/whoop/design/models/ImpactMagnitudeTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/ImpactMagnitudeTileModel$$serializer;

    invoke-virtual {p5}, Lcom/whoop/design/models/ImpactMagnitudeTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeHeaderDisplay:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCards:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCalloutDisplay:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/MagnitudeDetailCardModel;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "magnitudeCards"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeHeaderDisplay:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCards:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCalloutDisplay:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/MagnitudeDetailCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/MagnitudeDetailCardModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/ImpactMagnitudeTileModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/ImpactMagnitudeTileModel;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeHeaderDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCards:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCalloutDisplay:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/design/models/ImpactMagnitudeTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/ImpactMagnitudeTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeHeaderDisplay:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCards:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-object p0, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCalloutDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeHeaderDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/MagnitudeDetailCardModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCards:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCalloutDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/design/models/ImpactMagnitudeTileModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/MagnitudeDetailCardModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/design/models/ImpactMagnitudeTileModel;"
        }
    .end annotation

    const-string v0, "magnitudeCards"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/design/models/ImpactMagnitudeTileModel;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/ImpactMagnitudeTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/ImpactMagnitudeTileModel;

    iget-object v1, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeHeaderDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeHeaderDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCards:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCards:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCalloutDisplay:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCalloutDisplay:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMagnitudeCalloutDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCalloutDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getMagnitudeCards()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/MagnitudeDetailCardModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCards:Ljava/util/List;

    return-object v0
.end method

.method public final getMagnitudeHeaderDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeHeaderDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeHeaderDisplay:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCards:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCalloutDisplay:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeHeaderDisplay:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCards:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/ImpactMagnitudeTileModel;->magnitudeCalloutDisplay:Ljava/lang/String;

    const-string v3, ", magnitudeCards="

    const-string v4, ", magnitudeCalloutDisplay="

    const-string v5, "ImpactMagnitudeTileModel(magnitudeHeaderDisplay="

    invoke-static {v5, v0, v3, v4, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
