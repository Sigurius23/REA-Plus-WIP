.class public final Lcom/whoop/design/models/items/TickLabelModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/TickLabelModel$$serializer;,
        Lcom/whoop/design/models/items/TickLabelModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u000265B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBS\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JP\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001cJ\u001a\u0010*\u001a\u00020\n2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u0008/\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u00080\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00082\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00101\u001a\u0004\u00083\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u0008\u000b\u0010$\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TickLabelModel;",
        "",
        "",
        "index",
        "",
        "label",
        "subLabel",
        "Lcom/whoop/design/models/items/TickMarkStyle;",
        "labelStyle",
        "subLabelStyle",
        "",
        "isBelow",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;Z)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/TickLabelModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/TickMarkStyle;",
        "component5",
        "component6",
        "()Z",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;Z)Lcom/whoop/design/models/items/TickLabelModel;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getIndex",
        "Ljava/lang/String;",
        "getLabel",
        "getSubLabel",
        "Lcom/whoop/design/models/items/TickMarkStyle;",
        "getLabelStyle",
        "getSubLabelStyle",
        "Z",
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

.field public static final Companion:Lcom/whoop/design/models/items/TickLabelModel$Companion;


# instance fields
.field private final index:I

.field private final isBelow:Z

.field private final label:Ljava/lang/String;

.field private final labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

.field private final subLabel:Ljava/lang/String;

.field private final subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/TickLabelModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/TickLabelModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/TickLabelModel;->Companion:Lcom/whoop/design/models/items/TickLabelModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/k;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lw91/k;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lw91/k;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Lw91/k;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x6

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v2, v3, v4

    const/4 v2, 0x4

    aput-object v0, v3, v2

    const/4 v0, 0x5

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/TickLabelModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/design/models/items/TickLabelModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TickLabelModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/design/models/items/TickLabelModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/design/models/items/TickLabelModel;->index:I

    iput-object p3, p0, Lcom/whoop/design/models/items/TickLabelModel;->label:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabel:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/TickLabelModel;->labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    iput-object p6, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    iput-boolean p7, p0, Lcom/whoop/design/models/items/TickLabelModel;->isBelow:Z

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;Z)V
    .locals 1

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/design/models/items/TickLabelModel;->index:I

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/TickLabelModel;->label:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabel:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/TickLabelModel;->labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    .line 8
    iput-boolean p6, p0, Lcom/whoop/design/models/items/TickLabelModel;->isBelow:Z

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.TickMarkStyle"

    invoke-static {}, Lcom/whoop/design/models/items/TickMarkStyle;->values()[Lcom/whoop/design/models/items/TickMarkStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.TickMarkStyle"

    invoke-static {}, Lcom/whoop/design/models/items/TickMarkStyle;->values()[Lcom/whoop/design/models/items/TickMarkStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/TickLabelModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/TickLabelModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/TickLabelModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/TickLabelModel;ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;ZILjava/lang/Object;)Lcom/whoop/design/models/items/TickLabelModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/whoop/design/models/items/TickLabelModel;->index:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/TickLabelModel;->label:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabel:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/TickLabelModel;->labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/whoop/design/models/items/TickLabelModel;->isBelow:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/design/models/items/TickLabelModel;->copy(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;Z)Lcom/whoop/design/models/items/TickLabelModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/TickLabelModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/TickLabelModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/design/models/items/TickLabelModel;->index:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/design/models/items/TickLabelModel;->label:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabel:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/TickLabelModel;->labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x5

    iget-boolean p0, p0, Lcom/whoop/design/models/items/TickLabelModel;->isBelow:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->index:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/TickMarkStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/TickMarkStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->isBelow:Z

    return v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;Z)Lcom/whoop/design/models/items/TickLabelModel;
    .locals 8

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelStyle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/TickLabelModel;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/design/models/items/TickLabelModel;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/TickLabelModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/TickLabelModel;

    iget v1, p0, Lcom/whoop/design/models/items/TickLabelModel;->index:I

    iget v3, p1, Lcom/whoop/design/models/items/TickLabelModel;->index:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/TickLabelModel;->label:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TickLabelModel;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/TickLabelModel;->subLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/TickLabelModel;->labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/TickLabelModel;->labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/TickLabelModel;->subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/design/models/items/TickLabelModel;->isBelow:Z

    iget-boolean p1, p1, Lcom/whoop/design/models/items/TickLabelModel;->isBelow:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getIndex()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->index:I

    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabelStyle()Lcom/whoop/design/models/items/TickMarkStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    return-object v0
.end method

.method public final getSubLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubLabelStyle()Lcom/whoop/design/models/items/TickMarkStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/TickLabelModel;->label:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabel:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/TickLabelModel;->labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->isBelow:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final isBelow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->isBelow:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lcom/whoop/design/models/items/TickLabelModel;->index:I

    iget-object v1, p0, Lcom/whoop/design/models/items/TickLabelModel;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabel:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/TickLabelModel;->labelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    iget-object v4, p0, Lcom/whoop/design/models/items/TickLabelModel;->subLabelStyle:Lcom/whoop/design/models/items/TickMarkStyle;

    iget-boolean v5, p0, Lcom/whoop/design/models/items/TickLabelModel;->isBelow:Z

    const-string v6, ", label="

    const-string v7, ", subLabel="

    const-string v8, "TickLabelModel(index="

    invoke-static {v0, v8, v6, v1, v7}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", labelStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subLabelStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isBelow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
