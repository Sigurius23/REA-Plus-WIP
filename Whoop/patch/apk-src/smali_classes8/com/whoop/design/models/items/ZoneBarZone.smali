.class public final Lcom/whoop/design/models/items/ZoneBarZone;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ZoneBarZone$$serializer;,
        Lcom/whoop/design/models/items/ZoneBarZone$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\t\u0010\nBA\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ<\u0010 \u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010)\u001a\u0004\u0008/\u0010\u001a\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ZoneBarZone;",
        "",
        "",
        "title",
        "",
        "weight",
        "Ly81/f;",
        "color",
        "label",
        "<init>",
        "(Ljava/lang/String;DLy81/f;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;DLy81/f;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/ZoneBarZone;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()D",
        "component3",
        "()Ly81/f;",
        "component4",
        "copy",
        "(Ljava/lang/String;DLy81/f;Ljava/lang/String;)Lcom/whoop/design/models/items/ZoneBarZone;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "D",
        "getWeight",
        "Ly81/f;",
        "getColor",
        "getLabel",
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

.field public static final Companion:Lcom/whoop/design/models/items/ZoneBarZone$Companion;


# instance fields
.field private final color:Ly81/f;

.field private final label:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final weight:D


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/ZoneBarZone$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ZoneBarZone$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ZoneBarZone;->Companion:Lcom/whoop/design/models/items/ZoneBarZone$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/l;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lw91/l;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v0, v2, v3

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/ZoneBarZone;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;DLy81/f;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/design/models/items/ZoneBarZone$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ZoneBarZone$$serializer;

    invoke-virtual {p7}, Lcom/whoop/design/models/items/ZoneBarZone$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/ZoneBarZone;->title:Ljava/lang/String;

    iput-wide p3, p0, Lcom/whoop/design/models/items/ZoneBarZone;->weight:D

    iput-object p5, p0, Lcom/whoop/design/models/items/ZoneBarZone;->color:Ly81/f;

    iput-object p6, p0, Lcom/whoop/design/models/items/ZoneBarZone;->label:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DLy81/f;Ljava/lang/String;)V
    .locals 1

    const-string v0, "color"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/ZoneBarZone;->title:Ljava/lang/String;

    .line 4
    iput-wide p2, p0, Lcom/whoop/design/models/items/ZoneBarZone;->weight:D

    .line 5
    iput-object p4, p0, Lcom/whoop/design/models/items/ZoneBarZone;->color:Ly81/f;

    .line 6
    iput-object p5, p0, Lcom/whoop/design/models/items/ZoneBarZone;->label:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ZoneBarZone;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ZoneBarZone;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ZoneBarZone;Ljava/lang/String;DLy81/f;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/ZoneBarZone;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ZoneBarZone;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-wide p2, p0, Lcom/whoop/design/models/items/ZoneBarZone;->weight:D

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p4, p0, Lcom/whoop/design/models/items/ZoneBarZone;->color:Ly81/f;

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-object p5, p0, Lcom/whoop/design/models/items/ZoneBarZone;->label:Ljava/lang/String;

    :cond_3
    move-object p6, p4

    move-object p7, p5

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/ZoneBarZone;->copy(Ljava/lang/String;DLy81/f;Ljava/lang/String;)Lcom/whoop/design/models/items/ZoneBarZone;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ZoneBarZone;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/ZoneBarZone;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ZoneBarZone;->title:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-wide v3, p0, Lcom/whoop/design/models/items/ZoneBarZone;->weight:D

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/4 v2, 0x2

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ZoneBarZone;->color:Ly81/f;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object p0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->weight:D

    return-wide v0
.end method

.method public final component3()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->color:Ly81/f;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;DLy81/f;Ljava/lang/String;)Lcom/whoop/design/models/items/ZoneBarZone;
    .locals 7

    const-string v0, "color"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ZoneBarZone;

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/items/ZoneBarZone;-><init>(Ljava/lang/String;DLy81/f;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ZoneBarZone;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ZoneBarZone;

    iget-object v1, p0, Lcom/whoop/design/models/items/ZoneBarZone;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ZoneBarZone;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/models/items/ZoneBarZone;->weight:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/ZoneBarZone;->weight:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ZoneBarZone;->color:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/ZoneBarZone;->color:Ly81/f;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ZoneBarZone;->label:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/ZoneBarZone;->label:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->color:Ly81/f;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeight()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->weight:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->title:Ljava/lang/String;

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

    iget-wide v3, p0, Lcom/whoop/design/models/items/ZoneBarZone;->weight:D

    invoke-static {v0, v2, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/ZoneBarZone;->color:Ly81/f;

    invoke-static {v3, v0, v2}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ZoneBarZone;->label:Ljava/lang/String;

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
    .locals 7

    iget-object v0, p0, Lcom/whoop/design/models/items/ZoneBarZone;->title:Ljava/lang/String;

    iget-wide v1, p0, Lcom/whoop/design/models/items/ZoneBarZone;->weight:D

    iget-object v3, p0, Lcom/whoop/design/models/items/ZoneBarZone;->color:Ly81/f;

    iget-object v4, p0, Lcom/whoop/design/models/items/ZoneBarZone;->label:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ZoneBarZone(title="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", weight="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", color="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", label="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
