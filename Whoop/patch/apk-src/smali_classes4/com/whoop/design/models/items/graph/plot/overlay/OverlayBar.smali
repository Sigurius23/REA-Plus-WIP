.class public final Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar$$serializer;,
        Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 32\u00020\u0001:\u000243B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBG\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JD\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010!J\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00080\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00082\u0010!\u00a8\u00065"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;",
        "",
        "",
        "positionX",
        "width",
        "height",
        "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;",
        "style",
        "",
        "accessibilityLabel",
        "<init>",
        "(FFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IFFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()F",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;",
        "component5",
        "()Ljava/lang/String;",
        "copy",
        "(FFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "F",
        "getPositionX",
        "getWidth",
        "getHeight",
        "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;",
        "getStyle",
        "Ljava/lang/String;",
        "getAccessibilityLabel",
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

.field public static final Companion:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar$Companion;


# instance fields
.field private final accessibilityLabel:Ljava/lang/String;

.field private final height:F

.field private final positionX:F

.field private final style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

.field private final width:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->Companion:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lma1/a;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lma1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>(FFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->positionX:F

    .line 3
    iput p2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->width:F

    .line 4
    iput p3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->height:F

    .line 5
    iput-object p4, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    .line 6
    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->accessibilityLabel:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IFFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 7
    sget-object p7, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar$$serializer;

    invoke-virtual {p7}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->positionX:F

    iput p3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->width:F

    iput p4, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->height:F

    iput-object p5, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    iput-object p6, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->accessibilityLabel:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.plot.overlay.OverlayBarStyle"

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;->values()[Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;FFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->positionX:F

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->width:F

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->height:F

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->accessibilityLabel:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->copy(FFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->positionX:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->width:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->height:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->accessibilityLabel:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->positionX:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->width:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->height:F

    return v0
.end method

.method public final component4()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->accessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(FFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;
    .locals 7

    const-string v0, "style"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;-><init>(FFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;

    iget v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->positionX:F

    iget v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->positionX:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->width:F

    iget v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->width:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->height:F

    iget v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->height:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->accessibilityLabel:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->accessibilityLabel:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAccessibilityLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->accessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->height:F

    return v0
.end method

.method public final getPositionX()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->positionX:F

    return v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    return-object v0
.end method

.method public final getWidth()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->width:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->positionX:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->width:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->height:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->accessibilityLabel:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->positionX:F

    iget v1, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->width:F

    iget v2, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->height:F

    iget-object v3, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->style:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;

    iget-object v4, p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;->accessibilityLabel:Ljava/lang/String;

    const-string v5, ", width="

    const-string v6, ", height="

    const-string v7, "OverlayBar(positionX="

    invoke-static {v7, v0, v5, v1, v6}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", accessibilityLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v4, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
