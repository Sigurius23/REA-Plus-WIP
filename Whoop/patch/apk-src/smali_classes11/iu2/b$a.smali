.class final Liu2/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liu2/b;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.data.WeightliftingRepository$cleanupWorkout$1"
    f = "WeightliftingRepository.kt"
    l = {
        0x68,
        0x6b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Liu2/b;


# direct methods
.method public constructor <init>(Liu2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liu2/b;",
            "Lq83/d<",
            "-",
            "Liu2/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liu2/b$a;->y:Liu2/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Liu2/b$a;

    iget-object v1, p0, Liu2/b$a;->y:Liu2/b;

    invoke-direct {v0, v1, p2}, Liu2/b$a;-><init>(Liu2/b;Lq83/d;)V

    iput-object p1, v0, Liu2/b$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Liu2/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liu2/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liu2/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liu2/b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Liu2/b$a;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Liu2/b$a;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

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

    iget-object p1, p0, Liu2/b$a;->y:Liu2/b;

    invoke-static {p1}, Liu2/b;->i(Liu2/b;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    if-eqz p1, :cond_3

    iput-object v0, p0, Liu2/b$a;->x:Ljava/lang/Object;

    iput v4, p0, Liu2/b$a;->w:I

    invoke-interface {p1, p0}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Liu2/b$a;->y:Liu2/b;

    invoke-static {p1}, Liu2/b;->k(Liu2/b;)Liu2/a;

    move-result-object p1

    invoke-virtual {p1}, Liu2/a;->m()Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    const/4 v2, 0x0

    if-eqz p1, :cond_4

    invoke-interface {p1, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_4
    iget-object p1, p0, Liu2/b$a;->y:Liu2/b;

    invoke-static {p1}, Liu2/b;->p(Liu2/b;)V

    new-instance p1, Liu2/b$a$a;

    iget-object v5, p0, Liu2/b$a;->y:Liu2/b;

    invoke-direct {p1, v5, v2}, Liu2/b$a$a;-><init>(Liu2/b;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {v0, v2, p1, v5}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p1

    new-instance v6, Liu2/b$a$b;

    iget-object v7, p0, Liu2/b$a;->y:Liu2/b;

    invoke-direct {v6, v7, v2}, Liu2/b$a$b;-><init>(Liu2/b;Lq83/d;)V

    invoke-static {v0, v2, v6, v5}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v6

    new-instance v7, Liu2/b$a$c;

    iget-object v8, p0, Liu2/b$a;->y:Liu2/b;

    invoke-direct {v7, v8, v2}, Liu2/b$a$c;-><init>(Liu2/b;Lq83/d;)V

    invoke-static {v0, v2, v7, v5}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    new-array v5, v5, [Lbc3/i0;

    const/4 v7, 0x0

    aput-object p1, v5, v7

    aput-object v6, v5, v4

    aput-object v0, v5, v3

    iput-object v2, p0, Liu2/b$a;->x:Ljava/lang/Object;

    iput v3, p0, Liu2/b$a;->w:I

    invoke-static {v5, p0}, Lbc3/f0;->g([Lbc3/i0;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_1
    return-object v1

    :cond_5
    :goto_2
    iget-object p1, p0, Liu2/b$a;->y:Liu2/b;

    invoke-static {p1}, Liu2/b;->c(Liu2/b;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
