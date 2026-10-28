.class public final Lcom/whoop/design/models/items/AnimatedSequenceModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/AnimatedSequenceModel$$serializer;,
        Lcom/whoop/design/models/items/AnimatedSequenceModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 :2\u00020\u0001:\u0002;:BE\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBS\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JN\u0010%\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010(\u001a\u00020\'H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010,H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00082\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00103\u001a\u0004\u00084\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00086\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u00087\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u00089\u0010$\u00a8\u0006<"
    }
    d2 = {
        "Lcom/whoop/design/models/items/AnimatedSequenceModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "Lcom/whoop/design/models/items/AnimatedSequenceStepModel;",
        "steps",
        "Lcom/whoop/design/models/celebration/AnimationModeModel;",
        "repeatMode",
        "",
        "height",
        "width",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "onCompleteInteraction",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/AnimatedSequenceModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/util/List;",
        "component2",
        "()Lcom/whoop/design/models/celebration/AnimationModeModel;",
        "component3",
        "()Ljava/lang/Float;",
        "component4",
        "component5",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "copy",
        "(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/AnimatedSequenceModel;",
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
        "Ljava/util/List;",
        "getSteps",
        "Lcom/whoop/design/models/celebration/AnimationModeModel;",
        "getRepeatMode",
        "Ljava/lang/Float;",
        "getHeight",
        "getWidth",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getOnCompleteInteraction",
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

.field public static final Companion:Lcom/whoop/design/models/items/AnimatedSequenceModel$Companion;


# instance fields
.field private final height:Ljava/lang/Float;

.field private final onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

.field private final steps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/AnimatedSequenceStepModel;",
            ">;"
        }
    .end annotation
.end field

.field private final width:Ljava/lang/Float;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/AnimatedSequenceModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/AnimatedSequenceModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->Companion:Lcom/whoop/design/models/items/AnimatedSequenceModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw70/a;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lw70/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lw70/a;

    const/16 v4, 0x13

    invoke-direct {v3, v4}, Lw70/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v0, v3, v2

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v1, v3, v0

    const/4 v0, 0x4

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/AnimatedSequenceModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/design/models/items/AnimatedSequenceModel;-><init>(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    if-nez p7, :cond_0

    .line 3
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    sget-object p2, Lcom/whoop/design/models/celebration/AnimationModeModel;->PLAY_ONCE:Lcom/whoop/design/models/celebration/AnimationModeModel;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/AnimatedSequenceStepModel;",
            ">;",
            "Lcom/whoop/design/models/celebration/AnimationModeModel;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")V"
        }
    .end annotation

    const-string v0, "steps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repeatMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    .line 9
    iput-object p2, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    .line 10
    iput-object p3, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    .line 11
    iput-object p4, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    .line 12
    iput-object p5, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 13
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 14
    sget-object p2, Lcom/whoop/design/models/celebration/AnimationModeModel;->PLAY_ONCE:Lcom/whoop/design/models/celebration/AnimationModeModel;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p7, v0

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_4
    move-object p7, p5

    move-object p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 15
    :goto_0
    invoke-direct/range {p2 .. p7}, Lcom/whoop/design/models/items/AnimatedSequenceModel;-><init>(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/AnimatedSequenceStepModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AnimatedSequenceStepModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/celebration/AnimationModeModel;->Companion:Lcom/whoop/design/models/celebration/AnimationModeModel$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/AnimationModeModel$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/AnimatedSequenceModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/AnimatedSequenceModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/AnimatedSequenceModel;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Lcom/whoop/design/models/items/AnimatedSequenceModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/items/AnimatedSequenceModel;->copy(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/AnimatedSequenceModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/AnimatedSequenceModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    sget-object v3, Lcom/whoop/design/models/celebration/AnimationModeModel;->PLAY_ONCE:Lcom/whoop/design/models/celebration/AnimationModeModel;

    if-eq v2, v3, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_9

    :goto_4
    sget-object v1, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/AnimatedSequenceStepModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/celebration/AnimationModeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    return-object v0
.end method

.method public final component3()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    return-object v0
.end method

.method public final component4()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    return-object v0
.end method

.method public final component5()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/AnimatedSequenceModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/AnimatedSequenceStepModel;",
            ">;",
            "Lcom/whoop/design/models/celebration/AnimationModeModel;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")",
            "Lcom/whoop/design/models/items/AnimatedSequenceModel;"
        }
    .end annotation

    const-string v0, "steps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repeatMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/AnimatedSequenceModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/items/AnimatedSequenceModel;-><init>(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/AnimatedSequenceModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/AnimatedSequenceModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getHeight()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    return-object v0
.end method

.method public final getOnCompleteInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getRepeatMode()Lcom/whoop/design/models/celebration/AnimationModeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    return-object v0
.end method

.method public final getSteps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/AnimatedSequenceStepModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    return-object v0
.end method

.method public final getWidth()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->steps:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->repeatMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    iget-object v2, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->height:Ljava/lang/Float;

    iget-object v3, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->width:Ljava/lang/Float;

    iget-object v4, p0, Lcom/whoop/design/models/items/AnimatedSequenceModel;->onCompleteInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "AnimatedSequenceModel(steps="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", repeatMode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", width="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onCompleteInteraction="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lnh3/a;->j(Ljava/lang/StringBuilder;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
