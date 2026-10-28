.class final Ln31/b$d$a;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln31/b$d;->invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/h;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lu2/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lu2/b;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.molecule.searcharchmini.SearchArchMiniKt$clearFocusOnScroll$1$1"
    f = "SearchArchMini.kt"
    l = {
        0xb8,
        0xbb
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:F

.field final synthetic G:Lg2/i;

.field x:Ljava/lang/Object;

.field y:J

.field z:I


# direct methods
.method public constructor <init>(FLg2/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lg2/i;",
            "Lq83/d<",
            "-",
            "Ln31/b$d$a;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Ln31/b$d$a;->F:F

    iput-object p2, p0, Ln31/b$d$a;->G:Lg2/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln31/b$d$a;

    iget v1, p0, Ln31/b$d$a;->F:F

    iget-object v2, p0, Ln31/b$d$a;->G:Lg2/i;

    invoke-direct {v0, v1, v2, p2}, Ln31/b$d$a;-><init>(FLg2/i;Lq83/d;)V

    iput-object p1, v0, Ln31/b$d$a;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lu2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ln31/b$d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ln31/b$d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ln31/b$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ln31/b$d$a;->f(Lu2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Ln31/b$d$a;->E:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ln31/b$d$a;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v3, :cond_0

    iget-wide v5, p0, Ln31/b$d$a;->y:J

    iget-object v2, p0, Ln31/b$d$a;->x:Ljava/lang/Object;

    check-cast v2, Lu2/r;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lu2/l;->w:Lu2/l;

    iput-object v0, p0, Ln31/b$d$a;->E:Ljava/lang/Object;

    iput v5, p0, Ln31/b$d$a;->z:I

    invoke-static {v0, v4, p1, p0}, Lh0/o3;->b(Lu2/b;ZLu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lu2/r;

    const-wide/16 v5, 0x0

    move-object v2, p1

    :goto_1
    sget-object p1, Lu2/l;->w:Lu2/l;

    iput-object v0, p0, Ln31/b$d$a;->E:Ljava/lang/Object;

    iput-object v2, p0, Ln31/b$d$a;->x:Ljava/lang/Object;

    iput-wide v5, p0, Ln31/b$d$a;->y:J

    iput v3, p0, Ln31/b$d$a;->z:I

    check-cast v0, Lu2/g0;

    invoke-virtual {v0, p1, p0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_2
    return-object v1

    :cond_4
    :goto_3
    check-cast p1, Lu2/k;

    iget-object v7, p1, Lu2/k;->a:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lu2/r;

    iget-wide v9, v9, Lu2/r;->a:J

    iget-wide v11, v2, Lu2/r;->a:J

    invoke-static {v9, v10, v11, v12}, Lu2/q;->a(JJ)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_4

    :cond_6
    const/4 v8, 0x0

    :goto_4
    check-cast v8, Lu2/r;

    if-eqz v8, :cond_a

    invoke-static {v8, v4}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Lh2/b;->h(JJ)J

    move-result-wide v5

    invoke-static {v5, v6}, Lh2/b;->d(J)F

    move-result v7

    iget v8, p0, Ln31/b$d$a;->F:F

    cmpl-float v7, v7, v8

    if-lez v7, :cond_7

    iget-object p1, p0, Ln31/b$d$a;->G:Lg2/i;

    invoke-static {p1}, Lg2/i;->a(Lg2/i;)V

    goto :goto_5

    :cond_7
    iget-object p1, p1, Lu2/k;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    instance-of v7, p1, Ljava/util/Collection;

    if-eqz v7, :cond_8

    move-object v7, p1

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu2/r;

    iget-boolean v7, v7, Lu2/r;->d:Z

    if-eqz v7, :cond_9

    goto :goto_1

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
