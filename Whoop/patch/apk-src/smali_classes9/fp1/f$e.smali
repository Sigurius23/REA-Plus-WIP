.class final Lfp1/f$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfp1/f;->interact(Lec3/l;)Lec3/l;
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
        "Lfp1/e;",
        "previousState",
        "Lfp1/c;",
        "action",
        "<anonymous>",
        "(Lfp1/e;Lfp1/c;)Lfp1/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.postpartum.domain.PostPartumInteractor$interact$2"
    f = "PostPartumInteractor.kt"
    l = {
        0x21,
        0x22,
        0x27
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfp1/f;


# direct methods
.method public constructor <init>(Lfp1/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfp1/f;",
            "Lq83/d<",
            "-",
            "Lfp1/f$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfp1/f$e;->z:Lfp1/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lfp1/e;Lfp1/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfp1/e;",
            "Lfp1/c;",
            "Lq83/d<",
            "-",
            "Lfp1/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lfp1/f$e;

    iget-object v1, p0, Lfp1/f$e;->z:Lfp1/f;

    invoke-direct {v0, v1, p3}, Lfp1/f$e;-><init>(Lfp1/f;Lq83/d;)V

    iput-object p1, v0, Lfp1/f$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lfp1/f$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lfp1/f$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfp1/e;

    check-cast p2, Lfp1/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lfp1/f$e;->f(Lfp1/e;Lfp1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lfp1/f$e;->x:Ljava/lang/Object;

    check-cast v0, Lfp1/e;

    iget-object v1, p0, Lfp1/f$e;->y:Ljava/lang/Object;

    check-cast v1, Lfp1/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lfp1/f$e;->w:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lfp1/c$c;

    const/4 v3, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lfp1/f$e;->z:Lfp1/f;

    check-cast v1, Lfp1/c$c;

    iput-object v3, p0, Lfp1/f$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lfp1/f$e;->y:Ljava/lang/Object;

    iput v6, p0, Lfp1/f$e;->w:I

    invoke-static {p1, v1, p0}, Lfp1/f;->c(Lfp1/f;Lfp1/c$c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    check-cast p1, Lfp1/e;

    return-object p1

    :cond_5
    instance-of p1, v1, Lfp1/c$b;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lfp1/f$e;->z:Lfp1/f;

    check-cast v1, Lfp1/c$b;

    iput-object v3, p0, Lfp1/f$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lfp1/f$e;->y:Ljava/lang/Object;

    iput v5, p0, Lfp1/f$e;->w:I

    invoke-static {p1, v1, v0, p0}, Lfp1/f;->f(Lfp1/f;Lfp1/c$b;Lfp1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    check-cast p1, Lfp1/e;

    return-object p1

    :cond_7
    instance-of p1, v1, Lfp1/c$f;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lfp1/f$e;->z:Lfp1/f;

    check-cast v1, Lfp1/c$f;

    invoke-static {p1, v1, v0}, Lfp1/f;->j(Lfp1/f;Lfp1/c$f;Lfp1/e;)Lfp1/e;

    move-result-object p1

    return-object p1

    :cond_8
    sget-object p1, Lfp1/c$a;->a:Lfp1/c$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lfp1/f$e;->z:Lfp1/f;

    invoke-static {p1, v0}, Lfp1/f;->e(Lfp1/f;Lfp1/e;)Lfp1/e;

    move-result-object p1

    return-object p1

    :cond_9
    sget-object p1, Lfp1/c$g;->a:Lfp1/c$g;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lfp1/f$e;->z:Lfp1/f;

    invoke-static {p1, v0}, Lfp1/f;->k(Lfp1/f;Lfp1/e;)Lfp1/e;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of p1, v1, Lfp1/c$e;

    if-eqz p1, :cond_b

    iget-object p1, p0, Lfp1/f$e;->z:Lfp1/f;

    invoke-static {p1, v0}, Lfp1/f;->i(Lfp1/f;Lfp1/e;)Lfp1/e;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of p1, v1, Lfp1/c$d;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lfp1/f$e;->z:Lfp1/f;

    check-cast v1, Lfp1/c$d;

    iput-object v3, p0, Lfp1/f$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lfp1/f$e;->y:Ljava/lang/Object;

    iput v4, p0, Lfp1/f$e;->w:I

    invoke-static {p1, v1, v0, p0}, Lfp1/f;->h(Lfp1/f;Lfp1/c$d;Lfp1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_c

    :goto_2
    return-object v2

    :cond_c
    :goto_3
    check-cast p1, Lfp1/e;

    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
