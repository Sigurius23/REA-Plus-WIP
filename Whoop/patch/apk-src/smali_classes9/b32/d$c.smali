.class final Lb32/d$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb32/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lb32/c;",
        "state",
        "Lb32/b;",
        "action",
        "<anonymous>",
        "(Lb32/c;Lb32/b;)Lb32/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.payments.stripebottomsheettile.domain.StripeBottomSheetTileInteractor$interact$1"
    f = "StripeBottomSheetTileInteractor.kt"
    l = {
        0x35,
        0x3e,
        0x4a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lb32/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb32/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb32/d;",
            "Lq83/d<",
            "-",
            "Lb32/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lb32/d$c;->F:Lb32/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lb32/c;Lb32/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb32/c;",
            "Lb32/b;",
            "Lq83/d<",
            "-",
            "Lb32/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lb32/d$c;

    iget-object v1, p0, Lb32/d$c;->F:Lb32/d;

    invoke-direct {v0, v1, p3}, Lb32/d$c;-><init>(Lb32/d;Lq83/d;)V

    iput-object p1, v0, Lb32/d$c;->z:Ljava/lang/Object;

    iput-object p2, v0, Lb32/d$c;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lb32/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb32/c;

    check-cast p2, Lb32/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lb32/d$c;->f(Lb32/c;Lb32/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lb32/d$c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lb32/c;

    iget-object v0, p0, Lb32/d$c;->E:Ljava/lang/Object;

    check-cast v0, Lb32/b;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lb32/d$c;->y:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lb32/d$c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lb32/d$c;->w:Ljava/lang/Object;

    check-cast v0, Lb32/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lb32/b$d;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lb32/d$c;->F:Lb32/d;

    invoke-static {p1}, Lb32/d;->c(Lb32/d;)La32/a;

    move-result-object p1

    check-cast v0, Lb32/b$d;

    invoke-virtual {v0}, Lb32/b$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, La32/a;->f(Ljava/lang/String;)V

    iget-object p1, p0, Lb32/d$c;->F:Lb32/d;

    invoke-static {p1}, Lb32/d;->f(Lb32/d;)Liy1/c;

    move-result-object p1

    sget-object v2, La32/c;->a:La32/c;

    invoke-virtual {v0}, Lb32/b$d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, La32/c;->b(Ljava/lang/String;)Ljy1/a;

    move-result-object v0

    invoke-interface {p1, v0}, Liy1/c;->b(Ljy1/a;)V

    return-object v1

    :cond_4
    instance-of p1, v0, Lb32/b$f;

    if-eqz p1, :cond_5

    check-cast v0, Lb32/b$f;

    invoke-virtual {v0}, Lb32/b$f;->a()Lb32/a;

    move-result-object v3

    invoke-virtual {v0}, Lb32/b$f;->b()J

    move-result-wide v4

    move-wide v5, v4

    new-instance v4, Ljava/lang/Long;

    invoke-direct {v4, v5, v6}, Ljava/lang/Long;-><init>(J)V

    const/16 v8, 0x39

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lb32/c;->b(Lb32/c;Lb32/e;Lb32/a;Ljava/lang/Long;Lb32/a;Ljava/lang/String;Le32/a;ILjava/lang/Object;)Lb32/c;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Lb32/b$c;

    const/4 v2, 0x0

    if-eqz p1, :cond_7

    iget-object p1, p0, Lb32/d$c;->F:Lb32/d;

    check-cast v0, Lb32/b$c;

    invoke-virtual {v0}, Lb32/b$c;->a()Lh20/b4;

    move-result-object v3

    invoke-virtual {v0}, Lb32/b$c;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v2, p0, Lb32/d$c;->z:Ljava/lang/Object;

    iput-object v2, p0, Lb32/d$c;->E:Ljava/lang/Object;

    iput v5, p0, Lb32/d$c;->y:I

    invoke-static {p1, v1, v3, v0, p0}, Lb32/d;->g(Lb32/d;Lb32/c;Lh20/b4;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_6

    move-object v10, p0

    goto/16 :goto_2

    :cond_6
    :goto_0
    check-cast p1, Lb32/c;

    return-object p1

    :cond_7
    instance-of p1, v0, Lb32/b$a;

    if-eqz p1, :cond_8

    sget-object v2, Lb32/e$d;->a:Lb32/e$d;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lb32/c;->b(Lb32/c;Lb32/e;Lb32/a;Ljava/lang/Long;Lb32/a;Ljava/lang/String;Le32/a;ILjava/lang/Object;)Lb32/c;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, v0, Lb32/b$b;

    if-eqz p1, :cond_9

    sget-object v7, Le32/a$c;->a:Le32/a$c;

    sget-object v2, Lb32/e$e;->a:Lb32/e$e;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lb32/c;->b(Lb32/c;Lb32/e;Lb32/a;Ljava/lang/Long;Lb32/a;Ljava/lang/String;Le32/a;ILjava/lang/Object;)Lb32/c;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of p1, v0, Lb32/b$g;

    if-eqz p1, :cond_b

    move-object p1, v2

    move-object v2, v1

    iget-object v1, p0, Lb32/d$c;->F:Lb32/d;

    check-cast v0, Lb32/b$g;

    invoke-virtual {v0}, Lb32/b$g;->a()Ljava/lang/String;

    move-result-object v3

    move v5, v4

    invoke-virtual {v0}, Lb32/b$g;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lb32/b$g;->c()Ljava/lang/String;

    move-result-object v0

    iput-object p1, p0, Lb32/d$c;->z:Ljava/lang/Object;

    iput-object p1, p0, Lb32/d$c;->E:Ljava/lang/Object;

    iput v5, p0, Lb32/d$c;->y:I

    move-object v6, p0

    move-object v5, v0

    invoke-static/range {v1 .. v6}, Lb32/d;->h(Lb32/d;Lb32/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    move-object v10, v6

    if-ne p1, v7, :cond_a

    goto :goto_2

    :cond_a
    :goto_1
    check-cast p1, Lb32/c;

    return-object p1

    :cond_b
    move-object v10, p0

    move-object p1, v2

    instance-of v0, v0, Lb32/b$e;

    if-eqz v0, :cond_f

    invoke-virtual {v1}, Lb32/c;->d()Lb32/a;

    move-result-object v0

    invoke-virtual {v1}, Lb32/c;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_e

    if-nez v2, :cond_c

    goto :goto_4

    :cond_c
    iget-object v4, v10, Lb32/d$c;->F:Lb32/d;

    invoke-static {v4}, Lb32/d;->e(Lb32/d;)Ldc3/l;

    move-result-object v4

    new-instance v5, Lb32/b$g;

    invoke-virtual {v0}, Lb32/a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lb32/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v6, v0, v2}, Lb32/b$g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, v10, Lb32/d$c;->z:Ljava/lang/Object;

    iput-object p1, v10, Lb32/d$c;->E:Ljava/lang/Object;

    iput-object p1, v10, Lb32/d$c;->w:Ljava/lang/Object;

    iput-object p1, v10, Lb32/d$c;->x:Ljava/lang/Object;

    iput v3, v10, Lb32/d$c;->y:I

    invoke-interface {v4, v5, p0}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_d

    :goto_2
    return-object v7

    :cond_d
    :goto_3
    sget-object v2, Lb32/e$h;->a:Lb32/e$h;

    sget-object v7, Le32/a$b;->a:Le32/a$b;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lb32/c;->b(Lb32/c;Lb32/e;Lb32/a;Ljava/lang/Long;Lb32/a;Ljava/lang/String;Le32/a;ILjava/lang/Object;)Lb32/c;

    move-result-object p1

    return-object p1

    :cond_e
    :goto_4
    new-instance v2, Lb32/e$f;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "RetrySetDefault with no prior attempt"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, p1}, Lb32/e$f;-><init>(Ljava/lang/Throwable;)V

    sget-object v7, Le32/a$a;->a:Le32/a$a;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lb32/c;->b(Lb32/c;Lb32/e;Lb32/a;Ljava/lang/Long;Lb32/a;Ljava/lang/String;Le32/a;ILjava/lang/Object;)Lb32/c;

    move-result-object p1

    return-object p1

    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
