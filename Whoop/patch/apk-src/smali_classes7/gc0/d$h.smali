.class final Lgc0/d$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc0/d;->interact(Lec3/l;)Lec3/l;
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
        "Lgc0/c;",
        "previousState",
        "Lgc0/d$a;",
        "internalAction",
        "<anonymous>",
        "(Lgc0/c;Lgc0/d$a;)Lgc0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$interact$2"
    f = "HormonalContextInteractor.kt"
    l = {
        0x4f,
        0x51
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lgc0/d;

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgc0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc0/d;",
            "Lq83/d<",
            "-",
            "Lgc0/d$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgc0/d$h;->E:Lgc0/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lgc0/c;Lgc0/d$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc0/c;",
            "Lgc0/d$a;",
            "Lq83/d<",
            "-",
            "Lgc0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lgc0/d$h;

    iget-object v1, p0, Lgc0/d$h;->E:Lgc0/d;

    invoke-direct {v0, v1, p3}, Lgc0/d$h;-><init>(Lgc0/d;Lq83/d;)V

    iput-object p1, v0, Lgc0/d$h;->y:Ljava/lang/Object;

    iput-object p2, v0, Lgc0/d$h;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lgc0/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgc0/c;

    check-cast p2, Lgc0/d$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lgc0/d$h;->f(Lgc0/c;Lgc0/d$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lgc0/d$h;->y:Ljava/lang/Object;

    check-cast v0, Lgc0/c;

    iget-object v1, p0, Lgc0/d$h;->z:Ljava/lang/Object;

    check-cast v1, Lgc0/d$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lgc0/d$h;->x:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, p0, Lgc0/d$h;->w:Ljava/lang/Object;

    check-cast v0, Lgc0/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lgc0/d$h;->w:Ljava/lang/Object;

    check-cast v0, Lgc0/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lgc0/d$a$a;

    if-eqz p1, :cond_5

    check-cast v1, Lgc0/d$a$a;

    invoke-virtual {v1}, Lgc0/d$a$a;->a()Lgc0/c;

    move-result-object p1

    instance-of v1, p1, Lgc0/c$f;

    if-eqz v1, :cond_4

    instance-of v1, v0, Lgc0/c$f;

    if-eqz v1, :cond_3

    move-object v2, p1

    check-cast v2, Lgc0/c$f;

    check-cast v0, Lgc0/c$f;

    invoke-virtual {v0}, Lgc0/c$f;->c()Lgc0/e;

    move-result-object v4

    invoke-virtual {v0}, Lgc0/c$f;->e()Lgc0/b;

    move-result-object v5

    const/16 v7, 0x9

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lgc0/c$f;->b(Lgc0/c$f;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;Lgc0/e;Lgc0/b;ZILjava/lang/Object;)Lgc0/c$f;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p1, Lgc0/c$f;

    :cond_4
    return-object p1

    :cond_5
    instance-of p1, v1, Lgc0/d$a$b;

    if-eqz p1, :cond_c

    check-cast v1, Lgc0/d$a$b;

    invoke-virtual {v1}, Lgc0/d$a$b;->a()Lgc0/a;

    move-result-object p1

    instance-of v1, p1, Lgc0/a$b;

    const/4 v3, 0x0

    if-eqz v1, :cond_7

    iget-object v1, p0, Lgc0/d$h;->E:Lgc0/d;

    check-cast p1, Lgc0/a$b;

    iput-object v3, p0, Lgc0/d$h;->y:Ljava/lang/Object;

    iput-object v3, p0, Lgc0/d$h;->z:Ljava/lang/Object;

    iput-object v3, p0, Lgc0/d$h;->w:Ljava/lang/Object;

    iput v5, p0, Lgc0/d$h;->x:I

    invoke-static {v1, p1, v0, p0}, Lgc0/d;->f(Lgc0/d;Lgc0/a$b;Lgc0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    goto :goto_1

    :cond_6
    :goto_0
    check-cast p1, Lgc0/c;

    return-object p1

    :cond_7
    instance-of v1, p1, Lgc0/a$a;

    if-eqz v1, :cond_8

    iget-object p1, p0, Lgc0/d$h;->E:Lgc0/d;

    invoke-static {p1, v0}, Lgc0/d;->e(Lgc0/d;Lgc0/c;)Lgc0/c;

    move-result-object p1

    return-object p1

    :cond_8
    sget-object v1, Lgc0/a$e;->a:Lgc0/a$e;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object p1, p0, Lgc0/d$h;->E:Lgc0/d;

    iput-object v3, p0, Lgc0/d$h;->y:Ljava/lang/Object;

    iput-object v3, p0, Lgc0/d$h;->z:Ljava/lang/Object;

    iput-object v3, p0, Lgc0/d$h;->w:Ljava/lang/Object;

    iput v4, p0, Lgc0/d$h;->x:I

    invoke-static {p1, v0, p0}, Lgc0/d;->j(Lgc0/d;Lgc0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_9

    :goto_1
    return-object v2

    :cond_9
    :goto_2
    check-cast p1, Lgc0/c;

    return-object p1

    :cond_a
    sget-object v1, Lgc0/a$f;->a:Lgc0/a$f;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object p1, p0, Lgc0/d$h;->E:Lgc0/d;

    invoke-static {p1, v0}, Lgc0/d;->k(Lgc0/d;Lgc0/c;)Lgc0/c;

    move-result-object p1

    return-object p1

    :cond_b
    sget-object v1, Lgc0/a$d;->a:Lgc0/a$d;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_c
    return-object v0
.end method
