.class public final Lcom/whoop/design/models/items/ImpactBarSegmentModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ImpactBarSegmentModel$$serializer;,
        Lcom/whoop/design/models/items/ImpactBarSegmentModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B-\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBC\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J>\u0010\"\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00100\u001a\u0004\u00081\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00102\u001a\u0004\u00083\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00104\u001a\u0004\u00085\u0010!\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "horizontalPosition",
        "Lcom/whoop/design/util/TextResource;",
        "markerTextDisplay",
        "Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;",
        "segmentMarker",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "impactStyle",
        "<init>",
        "(Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/Double;",
        "component2",
        "()Lcom/whoop/design/util/TextResource;",
        "component3",
        "()Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;",
        "component4",
        "()Lcom/whoop/design/models/items/ImpactStyle;",
        "copy",
        "(Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;)Lcom/whoop/design/models/items/ImpactBarSegmentModel;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Double;",
        "getHorizontalPosition",
        "Lcom/whoop/design/util/TextResource;",
        "getMarkerTextDisplay",
        "Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;",
        "getSegmentMarker",
        "Lcom/whoop/design/models/items/ImpactStyle;",
        "getImpactStyle",
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

.field public static final Companion:Lcom/whoop/design/models/items/ImpactBarSegmentModel$Companion;


# instance fields
.field private final horizontalPosition:Ljava/lang/Double;

.field private final impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

.field private final markerTextDisplay:Lcom/whoop/design/util/TextResource;

.field private final segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/ImpactBarSegmentModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ImpactBarSegmentModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->Companion:Lcom/whoop/design/models/items/ImpactBarSegmentModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/f;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lw91/f;-><init>(I)V

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

    sput-object v2, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/design/models/items/ImpactBarSegmentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactBarSegmentModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/design/models/items/ImpactBarSegmentModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->horizontalPosition:Ljava/lang/Double;

    iput-object p3, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->markerTextDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;

    iput-object p5, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;)V
    .locals 1

    const-string v0, "impactStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->horizontalPosition:Ljava/lang/Double;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->markerTextDisplay:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.ImpactStyle"

    invoke-static {}, Lcom/whoop/design/models/items/ImpactStyle;->values()[Lcom/whoop/design/models/items/ImpactStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ImpactBarSegmentModel;Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;ILjava/lang/Object;)Lcom/whoop/design/models/items/ImpactBarSegmentModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->horizontalPosition:Ljava/lang/Double;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->markerTextDisplay:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->copy(Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;)Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ImpactBarSegmentModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->horizontalPosition:Ljava/lang/Double;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->markerTextDisplay:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->horizontalPosition:Ljava/lang/Double;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->markerTextDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/ImpactStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    return-object v0
.end method

.method public final copy(Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;)Lcom/whoop/design/models/items/ImpactBarSegmentModel;
    .locals 1

    const-string v0, "impactStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/ImpactBarSegmentModel;-><init>(Ljava/lang/Double;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;Lcom/whoop/design/models/items/ImpactStyle;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ImpactBarSegmentModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->horizontalPosition:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->horizontalPosition:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->markerTextDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->markerTextDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;

    iget-object v3, p1, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    iget-object p1, p1, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHorizontalPosition()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->horizontalPosition:Ljava/lang/Double;

    return-object v0
.end method

.method public final getImpactStyle()Lcom/whoop/design/models/items/ImpactStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    return-object v0
.end method

.method public final getMarkerTextDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->markerTextDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSegmentMarker()Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->horizontalPosition:Ljava/lang/Double;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->markerTextDisplay:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->horizontalPosition:Ljava/lang/Double;

    iget-object v1, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->markerTextDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->segmentMarker:Lcom/whoop/design/models/items/ImpactBarSegmentTypicalMarker;

    iget-object v3, p0, Lcom/whoop/design/models/items/ImpactBarSegmentModel;->impactStyle:Lcom/whoop/design/models/items/ImpactStyle;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ImpactBarSegmentModel(horizontalPosition="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", markerTextDisplay="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", segmentMarker="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", impactStyle="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
