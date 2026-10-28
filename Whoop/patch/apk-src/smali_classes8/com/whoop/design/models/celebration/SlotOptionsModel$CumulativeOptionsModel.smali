.class public final Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;
.super Lcom/whoop/design/models/celebration/SlotOptionsModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/celebration/SlotOptionsModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CumulativeOptionsModel"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$$serializer;,
        Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nBE\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJB\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010#H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010(\u001a\u0004\u0008*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010+\u001a\u0004\u0008,\u0010\u001cR\u001f\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010-\u001a\u0004\u0008.\u0010\u001e\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;",
        "Lcom/whoop/design/models/celebration/SlotOptionsModel;",
        "",
        "max",
        "selected",
        "",
        "layerPattern",
        "",
        "baseLayers",
        "<init>",
        "(IILjava/lang/String;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IIILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Ljava/util/List;",
        "copy",
        "(IILjava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getMax",
        "getSelected",
        "Ljava/lang/String;",
        "getLayerPattern",
        "Ljava/util/List;",
        "getBaseLayers",
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

.field public static final Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$Companion;


# instance fields
.field private final baseLayers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final layerPattern:Ljava/lang/String;

.field private final max:I

.field private final selected:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->Companion:Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lty1/e;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lty1/e;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v1, 0x3

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0xf

    const/16 v1, 0xf

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0, p1, p6}, Lcom/whoop/design/models/celebration/SlotOptionsModel;-><init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V

    iput p2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->max:I

    iput p3, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->selected:I

    iput-object p4, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->layerPattern:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->baseLayers:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/whoop/design/models/celebration/SlotOptionsModel;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput p1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->max:I

    .line 4
    iput p2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->selected:I

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->layerPattern:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->baseLayers:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;IILjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->max:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->selected:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->layerPattern:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->baseLayers:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->copy(IILjava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    invoke-static {p0, p1, p2}, Lcom/whoop/design/models/celebration/SlotOptionsModel;->write$Self(Lcom/whoop/design/models/celebration/SlotOptionsModel;Lzc3/c;Lyc3/g;)V

    sget-object v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->max:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->selected:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->layerPattern:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->baseLayers:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->max:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->selected:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->layerPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->baseLayers:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IILjava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;-><init>(IILjava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;

    iget v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->max:I

    iget v3, p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->max:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->selected:I

    iget v3, p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->selected:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->layerPattern:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->layerPattern:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->baseLayers:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->baseLayers:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBaseLayers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->baseLayers:Ljava/util/List;

    return-object v0
.end method

.method public final getLayerPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->layerPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final getMax()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->max:I

    return v0
.end method

.method public final getSelected()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->selected:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->max:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->selected:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->layerPattern:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->baseLayers:Ljava/util/List;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->max:I

    iget v1, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->selected:I

    iget-object v2, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->layerPattern:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/SlotOptionsModel$CumulativeOptionsModel;->baseLayers:Ljava/util/List;

    const-string v4, ", selected="

    const-string v5, ", layerPattern="

    const-string v6, "CumulativeOptionsModel(max="

    invoke-static {v0, v1, v6, v4, v5}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", baseLayers="

    const-string v4, ")"

    invoke-static {v2, v1, v4, v0, v3}, Lq63/c;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
