.class public final Liy1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liy1/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Liy1/a;",
        "Liy1/c;",
        "",
        "writers",
        "<init>",
        "(Ljava/util/Set;)V",
        "Ljy1/a;",
        "metric",
        "Ll83/a0;",
        "a",
        "(Ljy1/a;Lq83/d;)Ljava/lang/Object;",
        "b",
        "(Ljy1/a;)V",
        "Ljava/util/Set;",
        "metrics_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Liy1/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Liy1/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "writers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liy1/a;->a:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a(Ljy1/a;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljy1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Liy1/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Liy1/a$a;

    iget v1, v0, Liy1/a$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Liy1/a$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Liy1/a$a;

    invoke-direct {v0, p0, p2}, Liy1/a$a;-><init>(Liy1/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Liy1/a$a;->H:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Liy1/a$a;->J:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Liy1/a$a;->F:I

    iget-object v2, v0, Liy1/a$a;->E:Ljava/lang/Object;

    check-cast v2, Liy1/c;

    iget-object v2, v0, Liy1/a$a;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v5, v0, Liy1/a$a;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v5, v0, Liy1/a$a;->w:Ljava/lang/Object;

    check-cast v5, Ljy1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, p1

    move-object p1, v5

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Liy1/a;->a:Ljava/util/Set;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v2, p2

    move p2, v3

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Liy1/c;

    iput-object p1, v0, Liy1/a$a;->w:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v0, Liy1/a$a;->x:Ljava/lang/Object;

    iput-object v2, v0, Liy1/a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Liy1/a$a;->z:Ljava/lang/Object;

    iput-object v6, v0, Liy1/a$a;->E:Ljava/lang/Object;

    iput p2, v0, Liy1/a$a;->F:I

    iput v3, v0, Liy1/a$a;->G:I

    iput v4, v0, Liy1/a$a;->J:I

    invoke-interface {v5, p1, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public b(Ljy1/a;)V
    .locals 2

    const-string v0, "metric"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Liy1/a;->a:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liy1/c;

    invoke-interface {v1, p1}, Liy1/c;->b(Ljy1/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method
