.class final Lsw0/f$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsw0/f;->interact(Lec3/l;)Lec3/l;
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
        "Lsw0/e;",
        "currentState",
        "Lsw0/d;",
        "currentAction",
        "<anonymous>",
        "(Lsw0/e;Lsw0/d;)Lsw0/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.custombottomsheet.domain.CustomBottomSheetInteractor$interact$2"
    f = "CustomBottomSheetInteractor.kt"
    l = {
        0x24,
        0x26,
        0x2b,
        0x2e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lsw0/f;


# direct methods
.method public constructor <init>(Lsw0/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/f;",
            "Lq83/d<",
            "-",
            "Lsw0/f$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsw0/f$h;->z:Lsw0/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lsw0/e;Lsw0/d;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw0/e;",
            "Lsw0/d;",
            "Lq83/d<",
            "-",
            "Lsw0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lsw0/f$h;

    iget-object v1, p0, Lsw0/f$h;->z:Lsw0/f;

    invoke-direct {v0, v1, p3}, Lsw0/f$h;-><init>(Lsw0/f;Lq83/d;)V

    iput-object p1, v0, Lsw0/f$h;->x:Ljava/lang/Object;

    iput-object p2, v0, Lsw0/f$h;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lsw0/f$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lsw0/e;

    check-cast p2, Lsw0/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lsw0/f$h;->f(Lsw0/e;Lsw0/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lsw0/f$h;->x:Ljava/lang/Object;

    check-cast v0, Lsw0/e;

    iget-object v1, p0, Lsw0/f$h;->y:Ljava/lang/Object;

    check-cast v1, Lsw0/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lsw0/f$h;->w:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lsw0/d$f;

    const/4 v3, 0x0

    if-eqz p1, :cond_8

    check-cast v1, Lsw0/d$f;

    invoke-virtual {v1}, Lsw0/d$f;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lsw0/f$h;->z:Lsw0/f;

    iput-object v3, p0, Lsw0/f$h;->x:Ljava/lang/Object;

    iput-object v3, p0, Lsw0/f$h;->y:Ljava/lang/Object;

    iput v7, p0, Lsw0/f$h;->w:I

    invoke-static {p1, v3, p0, v7, v3}, Lsw0/f;->m(Lsw0/f;Ljava/util/List;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_0
    check-cast p1, Lsw0/e;

    return-object p1

    :cond_6
    iget-object p1, p0, Lsw0/f$h;->z:Lsw0/f;

    invoke-virtual {v1}, Lsw0/d$f;->a()Ljava/util/List;

    move-result-object v0

    iput-object v3, p0, Lsw0/f$h;->x:Ljava/lang/Object;

    iput-object v3, p0, Lsw0/f$h;->y:Ljava/lang/Object;

    iput v6, p0, Lsw0/f$h;->w:I

    invoke-static {p1, v0, p0}, Lsw0/f;->c(Lsw0/f;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    goto/16 :goto_4

    :cond_7
    :goto_1
    check-cast p1, Lsw0/e;

    return-object p1

    :cond_8
    instance-of p1, v1, Lsw0/d$c;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lsw0/f$h;->z:Lsw0/f;

    check-cast v1, Lsw0/d$c;

    invoke-virtual {v1}, Lsw0/d$c;->a()I

    move-result v1

    invoke-static {p1, v0, v1}, Lsw0/f;->f(Lsw0/f;Lsw0/e;I)Lsw0/e;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of p1, v1, Lsw0/d$a;

    if-eqz p1, :cond_a

    iget-object p1, p0, Lsw0/f$h;->z:Lsw0/f;

    check-cast v1, Lsw0/d$a;

    invoke-virtual {v1}, Lsw0/d$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lsw0/f;->g(Lsw0/f;Lsw0/e;Ljava/lang/String;)Lsw0/e;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of p1, v1, Lsw0/d$h;

    if-eqz p1, :cond_b

    iget-object p1, p0, Lsw0/f$h;->z:Lsw0/f;

    check-cast v1, Lsw0/d$h;

    invoke-virtual {v1}, Lsw0/d$h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lsw0/f;->i(Lsw0/f;Lsw0/e;Ljava/lang/String;)Lsw0/e;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of p1, v1, Lsw0/d$g;

    if-eqz p1, :cond_d

    iget-object p1, p0, Lsw0/f$h;->z:Lsw0/f;

    check-cast v1, Lsw0/d$g;

    invoke-virtual {v1}, Lsw0/d$g;->a()Z

    move-result v1

    iput-object v3, p0, Lsw0/f$h;->x:Ljava/lang/Object;

    iput-object v3, p0, Lsw0/f$h;->y:Ljava/lang/Object;

    iput v5, p0, Lsw0/f$h;->w:I

    invoke-static {p1, v0, v1, p0}, Lsw0/f;->h(Lsw0/f;Lsw0/e;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_c

    goto :goto_4

    :cond_c
    :goto_2
    check-cast p1, Lsw0/e;

    return-object p1

    :cond_d
    instance-of p1, v1, Lsw0/d$b;

    if-eqz p1, :cond_e

    goto :goto_3

    :cond_e
    instance-of p1, v1, Lsw0/d$d;

    if-eqz p1, :cond_f

    :goto_3
    return-object v0

    :cond_f
    instance-of p1, v1, Lsw0/d$e;

    if-eqz p1, :cond_11

    iget-object p1, p0, Lsw0/f$h;->z:Lsw0/f;

    check-cast v1, Lsw0/d$e;

    invoke-virtual {v1}, Lsw0/d$e;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v3, p0, Lsw0/f$h;->x:Ljava/lang/Object;

    iput-object v3, p0, Lsw0/f$h;->y:Ljava/lang/Object;

    iput v4, p0, Lsw0/f$h;->w:I

    invoke-static {p1, v0, v1, p0}, Lsw0/f;->j(Lsw0/f;Lsw0/e;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_10

    :goto_4
    return-object v2

    :cond_10
    :goto_5
    check-cast p1, Lsw0/e;

    return-object p1

    :cond_11
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
