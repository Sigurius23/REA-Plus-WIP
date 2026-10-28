.class public final Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u00020/B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ8\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010&\u001a\u00020\u00062\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010(\u001a\u0004\u0008)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010*\u001a\u0004\u0008+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010,\u001a\u0004\u0008-\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u0008.\u0010\u001e\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
        "",
        "",
        "label",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;",
        "labelStyle",
        "",
        "renderedBelow",
        "showBackgroundGradient",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZ)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;",
        "component3",
        "()Z",
        "component4",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZ)Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getLabel",
        "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;",
        "getLabelStyle",
        "Z",
        "getRenderedBelow",
        "getShowBackgroundGradient",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$Companion;


# instance fields
.field private final label:Ljava/lang/String;

.field private final labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

.field private final renderedBelow:Z

.field private final showBackgroundGradient:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->Companion:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lma1/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lma1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x4

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v0, v2, v4

    const/4 v0, 0x2

    aput-object v1, v2, v0

    aput-object v1, v2, v3

    sput-object v2, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$$serializer;

    invoke-virtual {p6}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->label:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    iput-boolean p4, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->renderedBelow:Z

    iput-boolean p5, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->showBackgroundGradient:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZ)V
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->label:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->renderedBelow:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->showBackgroundGradient:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.GraphPlotLabelStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;->values()[Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->label:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->renderedBelow:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->showBackgroundGradient:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZ)Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x2

    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->renderedBelow:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v0, 0x3

    iget-boolean p0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->showBackgroundGradient:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->renderedBelow:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->showBackgroundGradient:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZ)Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;
    .locals 1

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->renderedBelow:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->renderedBelow:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->showBackgroundGradient:Z

    iget-boolean p1, p1, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->showBackgroundGradient:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabelStyle()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    return-object v0
.end method

.method public final getRenderedBelow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->renderedBelow:Z

    return v0
.end method

.method public final getShowBackgroundGradient()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->showBackgroundGradient:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->label:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->renderedBelow:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->showBackgroundGradient:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->label:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->labelStyle:Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    iget-boolean v2, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->renderedBelow:Z

    iget-boolean v3, p0, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->showBackgroundGradient:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "GraphPlotLabelModel(label="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", labelStyle="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", renderedBelow="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", showBackgroundGradient="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
