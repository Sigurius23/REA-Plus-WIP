.class public final Lcom/whoop/design/models/celebration/DynamicLottieModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/celebration/DynamicLottieModel$$serializer;,
        Lcom/whoop/design/models/celebration/DynamicLottieModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276BE\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBY\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JV\u0010%\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010+\u001a\u00020\u00072\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001dR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00080\u0010\u001fR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00101\u001a\u0004\u00082\u0010!R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010/\u001a\u0004\u00083\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u00085\u0010$\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/design/models/celebration/DynamicLottieModel;",
        "",
        "",
        "overlayUrl",
        "",
        "Lcom/whoop/design/models/celebration/SlotConfigModel;",
        "slots",
        "",
        "animated",
        "highlightGradient",
        "Lcom/whoop/design/models/celebration/AnimationModeModel;",
        "animationMode",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/celebration/DynamicLottieModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Ljava/lang/Boolean;",
        "component4",
        "component5",
        "()Lcom/whoop/design/models/celebration/AnimationModeModel;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;)Lcom/whoop/design/models/celebration/DynamicLottieModel;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getOverlayUrl",
        "Ljava/util/List;",
        "getSlots",
        "Ljava/lang/Boolean;",
        "getAnimated",
        "getHighlightGradient",
        "Lcom/whoop/design/models/celebration/AnimationModeModel;",
        "getAnimationMode",
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

.field public static final Companion:Lcom/whoop/design/models/celebration/DynamicLottieModel$Companion;


# instance fields
.field private final animated:Ljava/lang/Boolean;

.field private final animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

.field private final highlightGradient:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final overlayUrl:Ljava/lang/String;

.field private final slots:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/celebration/SlotConfigModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/celebration/DynamicLottieModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/celebration/DynamicLottieModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->Companion:Lcom/whoop/design/models/celebration/DynamicLottieModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lty1/e;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lty1/e;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lty1/e;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lty1/e;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lty1/e;

    const/16 v5, 0x17

    invoke-direct {v4, v5}, Lty1/e;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x5

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v2, v4, v5

    const/4 v2, 0x2

    aput-object v1, v4, v2

    const/4 v1, 0x3

    aput-object v3, v4, v1

    const/4 v1, 0x4

    aput-object v0, v4, v1

    sput-object v4, Lcom/whoop/design/models/celebration/DynamicLottieModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1d

    const/16 v0, 0x1d

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/design/models/celebration/DynamicLottieModel$$serializer;->INSTANCE:Lcom/whoop/design/models/celebration/DynamicLottieModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/design/models/celebration/DynamicLottieModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->overlayUrl:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    :goto_0
    iput-object p4, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animated:Ljava/lang/Boolean;

    iput-object p5, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->highlightGradient:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/celebration/SlotConfigModel;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/design/models/celebration/AnimationModeModel;",
            ")V"
        }
    .end annotation

    const-string v0, "slots"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->overlayUrl:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animated:Ljava/lang/Boolean;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->highlightGradient:Ljava/util/List;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_0

    .line 10
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/celebration/DynamicLottieModel;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;->INSTANCE:Lcom/whoop/design/models/celebration/SlotConfigModelSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/celebration/AnimationModeModel;->Companion:Lcom/whoop/design/models/celebration/AnimationModeModel$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/celebration/AnimationModeModel$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/celebration/DynamicLottieModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;ILjava/lang/Object;)Lcom/whoop/design/models/celebration/DynamicLottieModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->overlayUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animated:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->highlightGradient:Ljava/util/List;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/celebration/DynamicLottieModel;->copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;)Lcom/whoop/design/models/celebration/DynamicLottieModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/celebration/DynamicLottieModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->overlayUrl:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animated:Ljava/lang/Boolean;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->highlightGradient:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->overlayUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/celebration/SlotConfigModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animated:Ljava/lang/Boolean;

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

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->highlightGradient:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/celebration/AnimationModeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;)Lcom/whoop/design/models/celebration/DynamicLottieModel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/celebration/SlotConfigModel;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/whoop/design/models/celebration/AnimationModeModel;",
            ")",
            "Lcom/whoop/design/models/celebration/DynamicLottieModel;"
        }
    .end annotation

    const-string v0, "slots"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/celebration/DynamicLottieModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/celebration/DynamicLottieModel;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/celebration/DynamicLottieModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/celebration/DynamicLottieModel;

    iget-object v1, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->overlayUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/DynamicLottieModel;->overlayUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animated:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animated:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->highlightGradient:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/celebration/DynamicLottieModel;->highlightGradient:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    iget-object p1, p1, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAnimated()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animated:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getAnimationMode()Lcom/whoop/design/models/celebration/AnimationModeModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    return-object v0
.end method

.method public final getHighlightGradient()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->highlightGradient:Ljava/util/List;

    return-object v0
.end method

.method public final getOverlayUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->overlayUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getSlots()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/celebration/SlotConfigModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->overlayUrl:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animated:Ljava/lang/Boolean;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->highlightGradient:Ljava/util/List;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->overlayUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->slots:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animated:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->highlightGradient:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/design/models/celebration/DynamicLottieModel;->animationMode:Lcom/whoop/design/models/celebration/AnimationModeModel;

    const-string v5, ", slots="

    const-string v6, ", animated="

    const-string v7, "DynamicLottieModel(overlayUrl="

    invoke-static {v7, v0, v5, v6, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", highlightGradient="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", animationMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
