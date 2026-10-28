.class public final Lkj2/k$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/k;->s(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.interactor.StressMonitorInteractor$actionToDomainState$$inlined$flatMapLatest$1"
    f = "StressMonitorInteractor.kt"
    l = {
        0xc0,
        0xc1,
        0xc2,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkj2/k;


# direct methods
.method public constructor <init>(Lq83/d;Lkj2/k;)V
    .locals 0

    iput-object p2, p0, Lkj2/k$a;->z:Lkj2/k;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lkj2/j;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkj2/k$a;

    iget-object v1, p0, Lkj2/k$a;->z:Lkj2/k;

    invoke-direct {v0, p3, v1}, Lkj2/k$a;-><init>(Lq83/d;Lkj2/k;)V

    iput-object p1, v0, Lkj2/k$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkj2/k$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkj2/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkj2/k$a;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lkj2/k$a;->w:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lkj2/k$a;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lkj2/k$a;->G:Ljava/lang/Object;

    check-cast v1, Lkj2/j;

    iget-object v1, p0, Lkj2/k$a;->F:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lkj2/k$a;->E:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lkj2/k$a;->x:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    iget-object v1, p0, Lkj2/k$a;->G:Ljava/lang/Object;

    check-cast v1, Lkj2/j;

    iget-object v1, p0, Lkj2/k$a;->F:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lkj2/k$a;->E:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lkj2/k$a;->x:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    iget-object v1, p0, Lkj2/k$a;->G:Ljava/lang/Object;

    check-cast v1, Lkj2/j;

    iget-object v1, p0, Lkj2/k$a;->F:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lkj2/k$a;->E:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lkj2/k$a;->x:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkj2/k$a;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lkj2/k$a;->y:Ljava/lang/Object;

    check-cast p1, Lkj2/j;

    instance-of v7, p1, Lkj2/j$b;

    if-eqz v7, :cond_5

    iget-object v3, p0, Lkj2/k$a;->z:Lkj2/k;

    check-cast p1, Lkj2/j$b;

    invoke-virtual {p1}, Lkj2/j$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1, v6}, Lkj2/k;->n(Lkj2/k;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    goto/16 :goto_3

    :cond_5
    sget-object v7, Lkj2/j$a;->a:Lkj2/j$a;

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_7

    iget-object p1, p0, Lkj2/k$a;->z:Lkj2/k;

    iput-object v6, p0, Lkj2/k$a;->x:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->y:Ljava/lang/Object;

    iput-object v1, p0, Lkj2/k$a;->E:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->F:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->G:Ljava/lang/Object;

    iput v8, p0, Lkj2/k$a;->H:I

    iput v5, p0, Lkj2/k$a;->w:I

    invoke-static {p1, p0}, Lkj2/k;->a(Lkj2/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto/16 :goto_4

    :cond_6
    :goto_0
    new-instance v3, La6/u;

    const/4 v4, 0x1

    invoke-direct {v3, p1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    move-object p1, v3

    goto/16 :goto_3

    :cond_7
    sget-object v5, Lkj2/j$c;->a:Lkj2/j$c;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    iget-object p1, p0, Lkj2/k$a;->z:Lkj2/k;

    iput-object v6, p0, Lkj2/k$a;->x:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->y:Ljava/lang/Object;

    iput-object v1, p0, Lkj2/k$a;->E:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->F:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->G:Ljava/lang/Object;

    iput v8, p0, Lkj2/k$a;->H:I

    iput v4, p0, Lkj2/k$a;->w:I

    invoke-static {p1, p0}, Lkj2/k;->l(Lkj2/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto/16 :goto_4

    :cond_8
    :goto_1
    check-cast p1, Lnj2/l;

    new-instance v3, Lkj2/c$b;

    invoke-direct {v3, p1}, Lkj2/c$b;-><init>(Lnj2/l;)V

    new-instance p1, La6/u;

    const/4 v4, 0x1

    invoke-direct {p1, v3, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_3

    :cond_9
    instance-of v4, p1, Lkj2/j$f;

    if-eqz v4, :cond_b

    iget-object v4, p0, Lkj2/k$a;->z:Lkj2/k;

    check-cast p1, Lkj2/j$f;

    invoke-virtual {p1}, Lkj2/j$f;->a()Ljava/lang/String;

    move-result-object p1

    iput-object v6, p0, Lkj2/k$a;->x:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->y:Ljava/lang/Object;

    iput-object v1, p0, Lkj2/k$a;->E:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->F:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->G:Ljava/lang/Object;

    iput v8, p0, Lkj2/k$a;->H:I

    iput v3, p0, Lkj2/k$a;->w:I

    invoke-static {v4, p1, p0}, Lkj2/k;->o(Lkj2/k;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_4

    :cond_a
    :goto_2
    check-cast p1, Lec3/l;

    goto :goto_3

    :cond_b
    instance-of v3, p1, Lkj2/j$e;

    if-eqz v3, :cond_c

    iget-object v3, p0, Lkj2/k$a;->z:Lkj2/k;

    invoke-static {v3}, Lkj2/k;->b(Lkj2/k;)Lfj2/a;

    move-result-object v3

    check-cast p1, Lkj2/j$e;

    invoke-virtual {p1}, Lkj2/j$e;->a()Z

    move-result p1

    invoke-virtual {v3, p1}, Lfj2/a;->f(Z)V

    sget-object p1, Lec3/k;->w:Lec3/k;

    goto :goto_3

    :cond_c
    instance-of v3, p1, Lkj2/j$d;

    if-eqz v3, :cond_e

    iget-object v3, p0, Lkj2/k$a;->z:Lkj2/k;

    check-cast p1, Lkj2/j$d;

    invoke-virtual {p1}, Lkj2/j$d;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lkj2/j$d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, v4, p1}, Lkj2/k;->n(Lkj2/k;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p1

    new-instance v3, Lkj2/k$b;

    invoke-direct {v3, v6}, Lkj2/k$b;-><init>(Lq83/d;)V

    new-instance v4, Lec3/a0;

    invoke-direct {v4, v3, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    move-object p1, v4

    :goto_3
    iput-object v6, p0, Lkj2/k$a;->x:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->y:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->E:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->F:Ljava/lang/Object;

    iput-object v6, p0, Lkj2/k$a;->G:Ljava/lang/Object;

    iput v2, p0, Lkj2/k$a;->w:I

    invoke-static {v1, p1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_d

    :goto_4
    return-object v0

    :cond_d
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_e
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
