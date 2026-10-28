.class public final Lm91/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0003\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J)\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0008\u0008\u0000\u0010\t*\u00020\u0008*\u0006\u0012\u0002\u0008\u00030\u0003H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ%\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\"\u0008\u0008\u0000\u0010\t*\u00020\u00082\u0006\u0010\u000c\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R.\u0010\u0005\u001a\u0016\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0003\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lm91/p;",
        "",
        "",
        "Lj93/d;",
        "Lm91/f;",
        "map",
        "<init>",
        "(Ljava/util/Map;)V",
        "Lm91/u;",
        "T",
        "a",
        "(Lj93/d;)Lm91/f;",
        "state",
        "c",
        "(Lm91/u;)Lm91/f;",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/Map;",
        "b",
        "()Ljava/util/Map;",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I = 0x8


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lm91/f<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lm91/f<",
            "*>;>;)V"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm91/p;->a:Ljava/util/Map;

    return-void
.end method

.method private final a(Lj93/d;)Lm91/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lm91/u;",
            ">(",
            "Lj93/d;",
            ")",
            "Lm91/f<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lm91/p;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm91/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lm91/f;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_5

    invoke-interface {p1}, Lj93/d;->getSupertypes()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj93/a0;

    invoke-interface {v0}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    instance-of v1, v0, Lj93/d;

    if-eqz v1, :cond_2

    check-cast v0, Lj93/d;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_3

    invoke-direct {p0, v0}, Lm91/p;->a(Lj93/d;)Lm91/f;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_1

    return-object v0

    :cond_4
    return-object v2

    :cond_5
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lm91/f<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lm91/p;->a:Ljava/util/Map;

    return-object v0
.end method

.method public final c(Lm91/u;)Lm91/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lm91/u;",
            ">(TT;)",
            "Lm91/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lm91/p;->a(Lj93/d;)Lm91/f;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No composer for item state type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lm91/p;

    return p1
.end method
