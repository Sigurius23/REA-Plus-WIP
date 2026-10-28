.class public final Lcom/whoop/design/models/modal/FullScreenContentModal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/modal/Modal;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/modal/FullScreenContentModal$$serializer;,
        Lcom/whoop/design/models/modal/FullScreenContentModal$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002LKB?\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eB\u007f\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\r\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0011H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010&JP\u0010.\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010&J\u0010\u00101\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u00010!H\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00107\u001a\u0004\u00088\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00109\u001a\u0004\u0008:\u0010(R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008<\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010=\u001a\u0004\u0008>\u0010,R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00107\u001a\u0004\u0008?\u0010&R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010@\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`E\u00a2\u0006\u000c\u0008F\u0012\u0008\u0008G\u0012\u0004\u0008\t0H8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010@\u001a\u0004\u0008I\u0010B\"\u0004\u0008J\u0010D\u00a8\u0006M"
    }
    d2 = {
        "Lcom/whoop/design/models/modal/FullScreenContentModal;",
        "Lcom/whoop/design/models/modal/Modal;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "navigationBar",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "Lcom/whoop/design/models/items/FooterModel;",
        "footer",
        "backgroundImageUrl",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;)V",
        "",
        "seen0",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/modal/FullScreenContentModal;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/modal/FullScreenContentModal;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/NavigationBarModel;",
        "component3",
        "()Ljava/util/List;",
        "component4",
        "()Lcom/whoop/design/models/items/FooterModel;",
        "component5",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;)Lcom/whoop/design/models/modal/FullScreenContentModal;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "getNavigationBar",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/design/models/items/FooterModel;",
        "getFooter",
        "getBackgroundImageUrl",
        "Ljava/util/Map;",
        "getBindings",
        "()Ljava/util/Map;",
        "setBindings",
        "(Ljava/util/Map;)V",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "getAggregateBindings",
        "setAggregateBindings",
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

.field public static final Companion:Lcom/whoop/design/models/modal/FullScreenContentModal$Companion;


# instance fields
.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private final backgroundImageUrl:Ljava/lang/String;

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final footer:Lcom/whoop/design/models/items/FooterModel;

.field private final id:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/modal/FullScreenContentModal$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/modal/FullScreenContentModal$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/modal/FullScreenContentModal;->Companion:Lcom/whoop/design/models/modal/FullScreenContentModal$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/modal/FullScreenContentModal;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/design/models/calendar/archmini/a;

    const/16 v3, 0x16

    invoke-direct {v2, v3}, Lcom/whoop/design/models/calendar/archmini/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lcom/whoop/design/models/calendar/archmini/a;

    const/16 v4, 0x17

    invoke-direct {v3, v4}, Lcom/whoop/design/models/calendar/archmini/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v2, v3, v4

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v2, 0x4

    aput-object v1, v3, v2

    const/4 v2, 0x5

    aput-object v0, v3, v2

    const/4 v0, 0x6

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/modal/FullScreenContentModal;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x1b

    const/16 v0, 0x1b

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/design/models/modal/FullScreenContentModal$$serializer;->INSTANCE:Lcom/whoop/design/models/modal/FullScreenContentModal$$serializer;

    invoke-virtual {p9}, Lcom/whoop/design/models/modal/FullScreenContentModal$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    :goto_0
    iput-object p5, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->footer:Lcom/whoop/design/models/items/FooterModel;

    iput-object p6, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->backgroundImageUrl:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->bindings:Ljava/util/Map;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->bindings:Ljava/util/Map;

    :goto_1
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_3
    iput-object p8, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/NavigationBarModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/items/FooterModel;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->id:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    .line 7
    iput-object p3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    .line 8
    iput-object p4, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->footer:Lcom/whoop/design/models/items/FooterModel;

    .line 9
    iput-object p5, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->backgroundImageUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    .line 10
    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/modal/FullScreenContentModal;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/modal/FullScreenContentModal;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/FullScreenContentModal;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/modal/FullScreenContentModal;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/modal/FullScreenContentModal;Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/modal/FullScreenContentModal;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->footer:Lcom/whoop/design/models/items/FooterModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->backgroundImageUrl:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/design/models/modal/FullScreenContentModal;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;)Lcom/whoop/design/models/modal/FullScreenContentModal;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/modal/FullScreenContentModal;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/modal/FullScreenContentModal;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->id:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/items/NavigationBarModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NavigationBarModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    const/4 v4, 0x1

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    sget-object v4, Lm83/y;->w:Lm83/y;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    sget-object v2, Lcom/whoop/design/models/items/FooterModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FooterModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->footer:Lcom/whoop/design/models/items/FooterModel;

    const/4 v4, 0x3

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->backgroundImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/FullScreenContentModal;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/FullScreenContentModal;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/FullScreenContentModal;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/FullScreenContentModal;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/modal/FullScreenContentModal;->bind(Ljava/util/Map;)Lcom/whoop/design/models/modal/FullScreenContentModal;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/modal/FullScreenContentModal;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/modal/FullScreenContentModal;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/design/models/modal/FullScreenContentModal;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/modal/FullScreenContentModal;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/modal/FullScreenContentModalStateBindingKt;->generatedBind(Lcom/whoop/design/models/modal/FullScreenContentModal;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/modal/FullScreenContentModal;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/FooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->footer:Lcom/whoop/design/models/items/FooterModel;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;)Lcom/whoop/design/models/modal/FullScreenContentModal;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/NavigationBarModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/items/FooterModel;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/design/models/modal/FullScreenContentModal;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/modal/FullScreenContentModal;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/design/models/modal/FullScreenContentModal;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/NavigationBarModel;Ljava/util/List;Lcom/whoop/design/models/items/FooterModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/modal/FullScreenContentModal;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/modal/FullScreenContentModal;

    iget-object v1, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/modal/FullScreenContentModal;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v3, p1, Lcom/whoop/design/models/modal/FullScreenContentModal;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->footer:Lcom/whoop/design/models/items/FooterModel;

    iget-object v3, p1, Lcom/whoop/design/models/modal/FullScreenContentModal;->footer:Lcom/whoop/design/models/items/FooterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->backgroundImageUrl:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/modal/FullScreenContentModal;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/design/models/items/FooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->footer:Lcom/whoop/design/models/items/FooterModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getNavigationBar()Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->id:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/design/models/items/NavigationBarModel;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->footer:Lcom/whoop/design/models/items/FooterModel;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/design/models/items/FooterModel;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->backgroundImageUrl:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->navigationBar:Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v2, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->items:Ljava/util/List;

    iget-object v3, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->footer:Lcom/whoop/design/models/items/FooterModel;

    iget-object v4, p0, Lcom/whoop/design/models/modal/FullScreenContentModal;->backgroundImageUrl:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "FullScreenContentModal(id="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationBar="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", footer="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundImageUrl="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
