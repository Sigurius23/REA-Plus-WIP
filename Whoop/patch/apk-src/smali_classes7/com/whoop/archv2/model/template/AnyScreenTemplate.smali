.class public final Lcom/whoop/archv2/model/template/AnyScreenTemplate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/archv2/model/template/AnyScreenTemplate$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u00018Bl\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008\u0012+\u0008\u0002\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008j\u0004\u0018\u0001`\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\t0\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0008H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ3\u0010\u001f\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008j\u0004\u0018\u0001`\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\t0\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJw\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082+\u0008\u0002\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008j\u0004\u0018\u0001`\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\t0\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010-\u001a\u0004\u0008.\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00080\u0010\u001cR0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00088\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u00101\u001a\u0004\u00082\u0010\u001e\"\u0004\u00083\u00104RE\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0008j\u0004\u0018\u0001`\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\t0\u000f8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u00101\u001a\u0004\u00085\u0010\u001e\"\u0004\u00086\u00104\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/archv2/model/template/ScreenTemplate;",
        "template",
        "Lcom/whoop/cache/api/prefetch/PrefetchList;",
        "prefetchList",
        "Lcom/whoop/design/models/modal/LifecycleInteractions;",
        "lifecycleInteractions",
        "",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
        "component1",
        "()Lcom/whoop/archv2/model/template/ScreenTemplate;",
        "component2",
        "()Lcom/whoop/cache/api/prefetch/PrefetchList;",
        "component3",
        "()Lcom/whoop/design/models/modal/LifecycleInteractions;",
        "component4",
        "()Ljava/util/Map;",
        "component5",
        "copy",
        "(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/archv2/model/template/ScreenTemplate;",
        "getTemplate",
        "Lcom/whoop/cache/api/prefetch/PrefetchList;",
        "getPrefetchList",
        "Lcom/whoop/design/models/modal/LifecycleInteractions;",
        "getLifecycleInteractions",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "a",
        "arch-v2_release"
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
    with = Lmi0/a;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/archv2/model/template/AnyScreenTemplate$a;


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

.field private final lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

.field private final prefetchList:Lcom/whoop/cache/api/prefetch/PrefetchList;

.field private final template:Lcom/whoop/archv2/model/template/ScreenTemplate;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/archv2/model/template/AnyScreenTemplate$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/archv2/model/template/AnyScreenTemplate$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->Companion:Lcom/whoop/archv2/model/template/AnyScreenTemplate$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/model/template/ScreenTemplate;",
            "Lcom/whoop/cache/api/prefetch/PrefetchList;",
            "Lcom/whoop/design/models/modal/LifecycleInteractions;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    const-string v0, "template"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->template:Lcom/whoop/archv2/model/template/ScreenTemplate;

    .line 3
    iput-object p2, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->prefetchList:Lcom/whoop/cache/api/prefetch/PrefetchList;

    .line 4
    iput-object p3, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    .line 5
    iput-object p4, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->bindings:Ljava/util/Map;

    .line 6
    iput-object p5, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;-><init>(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->template:Lcom/whoop/archv2/model/template/ScreenTemplate;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->prefetchList:Lcom/whoop/cache/api/prefetch/PrefetchList;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->bindings:Ljava/util/Map;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->aggregateBindings:Ljava/util/Map;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->copy(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/archv2/model/template/AnyScreenTemplate;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcj0/a;->a(Lcom/whoop/archv2/model/template/AnyScreenTemplate;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->bind(Ljava/util/Map;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Lcom/whoop/archv2/model/template/ScreenTemplate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->template:Lcom/whoop/archv2/model/template/ScreenTemplate;

    return-object v0
.end method

.method public final component2()Lcom/whoop/cache/api/prefetch/PrefetchList;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->prefetchList:Lcom/whoop/cache/api/prefetch/PrefetchList;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/modal/LifecycleInteractions;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/AnyScreenTemplate;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/archv2/model/template/ScreenTemplate;",
            "Lcom/whoop/cache/api/prefetch/PrefetchList;",
            "Lcom/whoop/design/models/modal/LifecycleInteractions;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/archv2/model/template/AnyScreenTemplate;"
        }
    .end annotation

    const-string v0, "template"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/archv2/model/template/AnyScreenTemplate;-><init>(Lcom/whoop/archv2/model/template/ScreenTemplate;Lcom/whoop/cache/api/prefetch/PrefetchList;Lcom/whoop/design/models/modal/LifecycleInteractions;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;

    iget-object v1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->template:Lcom/whoop/archv2/model/template/ScreenTemplate;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->template:Lcom/whoop/archv2/model/template/ScreenTemplate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->prefetchList:Lcom/whoop/cache/api/prefetch/PrefetchList;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->prefetchList:Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    return-object v0
.end method

.method public final getPrefetchList()Lcom/whoop/cache/api/prefetch/PrefetchList;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->prefetchList:Lcom/whoop/cache/api/prefetch/PrefetchList;

    return-object v0
.end method

.method public final getTemplate()Lcom/whoop/archv2/model/template/ScreenTemplate;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->template:Lcom/whoop/archv2/model/template/ScreenTemplate;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->template:Lcom/whoop/archv2/model/template/ScreenTemplate;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->prefetchList:Lcom/whoop/cache/api/prefetch/PrefetchList;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/cache/api/prefetch/PrefetchList;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/design/models/modal/LifecycleInteractions;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->bindings:Ljava/util/Map;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

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

    iput-object p1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->template:Lcom/whoop/archv2/model/template/ScreenTemplate;

    iget-object v1, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->prefetchList:Lcom/whoop/cache/api/prefetch/PrefetchList;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->lifecycleInteractions:Lcom/whoop/design/models/modal/LifecycleInteractions;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->bindings:Ljava/util/Map;

    iget-object v4, p0, Lcom/whoop/archv2/model/template/AnyScreenTemplate;->aggregateBindings:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "AnyScreenTemplate(template="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", prefetchList="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lifecycleInteractions="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bindings="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aggregateBindings="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
