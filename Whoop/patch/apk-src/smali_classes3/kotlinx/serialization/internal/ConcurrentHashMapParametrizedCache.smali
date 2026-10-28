.class final Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/ParametrizedSerializerCache;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/ParametrizedSerializerCache<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00080\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ9\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00080\u000e2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R:\u0010\t\u001a(\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00080\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012R*\u0010\u0016\u001a\u0018\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00150\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;",
        "T",
        "Lkotlinx/serialization/internal/ParametrizedSerializerCache;",
        "Lkotlin/Function2;",
        "Lj93/d;",
        "",
        "",
        "Lj93/a0;",
        "Lwc3/c;",
        "compute",
        "<init>",
        "(Lc93/m;)V",
        "key",
        "types",
        "Ll83/n;",
        "get-gIAlu-s",
        "(Lj93/d;Ljava/util/List;)Ljava/lang/Object;",
        "get",
        "Lc93/m;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Ljava/lang/Class;",
        "Lkotlinx/serialization/internal/ParametrizedCacheEntry;",
        "cache",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "kotlinx-serialization-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final cache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Class<",
            "*>;",
            "Lkotlinx/serialization/internal/ParametrizedCacheEntry<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final compute:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "compute"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;->compute:Lc93/m;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method


# virtual methods
.method public get-gIAlu-s(Lj93/d;Ljava/util/List;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            "Ljava/util/List<",
            "+",
            "Lj93/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "types"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v2, Lkotlinx/serialization/internal/ParametrizedCacheEntry;

    invoke-direct {v2}, Lkotlinx/serialization/internal/ParametrizedCacheEntry;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    :cond_1
    :goto_0
    check-cast v2, Lkotlinx/serialization/internal/ParametrizedCacheEntry;

    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj93/a0;

    new-instance v4, Lkotlinx/serialization/internal/KTypeWrapper;

    invoke-direct {v4, v3}, Lkotlinx/serialization/internal/KTypeWrapper;-><init>(Lj93/a0;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v2}, Lkotlinx/serialization/internal/ParametrizedCacheEntry;->access$getSerializers$p(Lkotlinx/serialization/internal/ParametrizedCacheEntry;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    :try_start_0
    iget-object v2, p0, Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;->compute:Lc93/m;

    invoke-interface {v2, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwc3/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_2
    new-instance p2, Ll83/n;

    invoke-direct {p2, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1, p2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    move-object v2, p2

    goto :goto_3

    :cond_3
    move-object v2, p1

    :cond_4
    :goto_3
    check-cast v2, Ll83/n;

    iget-object p1, v2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method
