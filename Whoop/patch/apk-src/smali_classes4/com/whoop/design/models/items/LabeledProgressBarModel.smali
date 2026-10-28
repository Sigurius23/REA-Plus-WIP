.class public final Lcom/whoop/design/models/items/LabeledProgressBarModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/LabeledProgressBarModel$$serializer;,
        Lcom/whoop/design/models/items/LabeledProgressBarModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B?\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBU\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#JT\u0010$\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010.\u001a\u0004\u00080\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u00081\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u00082\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00103\u001a\u0004\u00084\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00105\u001a\u0004\u00086\u0010#\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/design/models/items/LabeledProgressBarModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "leftLabel",
        "leftSublabel",
        "rightLabel",
        "rightSublabel",
        "",
        "progress",
        "Lcom/whoop/design/models/items/LabeledProgressBarStyle;",
        "style",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/LabeledProgressBarModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()F",
        "component6",
        "()Lcom/whoop/design/models/items/LabeledProgressBarStyle;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;)Lcom/whoop/design/models/items/LabeledProgressBarModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getLeftLabel",
        "getLeftSublabel",
        "getRightLabel",
        "getRightSublabel",
        "F",
        "getProgress",
        "Lcom/whoop/design/models/items/LabeledProgressBarStyle;",
        "getStyle",
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

.field public static final Companion:Lcom/whoop/design/models/items/LabeledProgressBarModel$Companion;


# instance fields
.field private final leftLabel:Ljava/lang/String;

.field private final leftSublabel:Ljava/lang/String;

.field private final progress:F

.field private final rightLabel:Ljava/lang/String;

.field private final rightSublabel:Ljava/lang/String;

.field private final style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/design/models/items/LabeledProgressBarModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/LabeledProgressBarModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->Companion:Lcom/whoop/design/models/items/LabeledProgressBarModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/g;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lw91/g;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x6

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v1, 0x5

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/design/models/items/LabeledProgressBarModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/design/models/items/LabeledProgressBarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/LabeledProgressBarModel$$serializer;

    invoke-virtual {p8}, Lcom/whoop/design/models/items/LabeledProgressBarModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftLabel:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftSublabel:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightLabel:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightSublabel:Ljava/lang/String;

    iput p6, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->progress:F

    iput-object p7, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftLabel:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftSublabel:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightLabel:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightSublabel:Ljava/lang/String;

    .line 7
    iput p5, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->progress:F

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/LabeledProgressBarStyle;->Companion:Lcom/whoop/design/models/items/LabeledProgressBarStyle$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/LabeledProgressBarStyle$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/LabeledProgressBarModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/LabeledProgressBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;ILjava/lang/Object;)Lcom/whoop/design/models/items/LabeledProgressBarModel;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftLabel:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftSublabel:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightLabel:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightSublabel:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->progress:F

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    :cond_5
    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/design/models/items/LabeledProgressBarModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;)Lcom/whoop/design/models/items/LabeledProgressBarModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/LabeledProgressBarModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftLabel:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftSublabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightSublabel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget v2, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->progress:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftSublabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightSublabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->progress:F

    return v0
.end method

.method public final component6()Lcom/whoop/design/models/items/LabeledProgressBarStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;)Lcom/whoop/design/models/items/LabeledProgressBarModel;
    .locals 8

    const-string v0, "style"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/LabeledProgressBarModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/design/models/items/LabeledProgressBarModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/whoop/design/models/items/LabeledProgressBarStyle;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/LabeledProgressBarModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/LabeledProgressBarModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftSublabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftSublabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightSublabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightSublabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->progress:F

    iget v3, p1, Lcom/whoop/design/models/items/LabeledProgressBarModel;->progress:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    iget-object p1, p1, Lcom/whoop/design/models/items/LabeledProgressBarModel;->style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getLeftLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeftSublabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftSublabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getProgress()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->progress:F

    return v0
.end method

.method public final getRightLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getRightSublabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightSublabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/LabeledProgressBarStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftLabel:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftSublabel:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightLabel:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightSublabel:Ljava/lang/String;

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget v1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->progress:F

    invoke-static {v1, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftLabel:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->leftSublabel:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightLabel:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->rightSublabel:Ljava/lang/String;

    iget v4, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->progress:F

    iget-object v5, p0, Lcom/whoop/design/models/items/LabeledProgressBarModel;->style:Lcom/whoop/design/models/items/LabeledProgressBarStyle;

    const-string v6, ", leftSublabel="

    const-string v7, ", rightLabel="

    const-string v8, "LabeledProgressBarModel(leftLabel="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rightSublabel="

    const-string v6, ", progress="

    invoke-static {v0, v2, v1, v3, v6}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
