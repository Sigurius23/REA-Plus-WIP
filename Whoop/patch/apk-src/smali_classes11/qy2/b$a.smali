.class final Lqy2/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqy2/b;->c(Lec3/l;)Lec3/l;
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
        "Lty2/a;",
        "previousViewState",
        "Loy2/b;",
        "currentDomainState",
        "<anonymous>",
        "(Lty2/a;Loy2/b;)Lty2/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.feature.campaignsteps.reducer.CampaignStepsViewStateReducer$reduce$1"
    f = "CampaignStepsViewStateReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lqy2/b;


# direct methods
.method public constructor <init>(Lqy2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqy2/b;",
            "Lq83/d<",
            "-",
            "Lqy2/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqy2/b$a;->z:Lqy2/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lty2/a;Loy2/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty2/a;",
            "Loy2/b;",
            "Lq83/d<",
            "-",
            "Lty2/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lqy2/b$a;

    iget-object v1, p0, Lqy2/b$a;->z:Lqy2/b;

    invoke-direct {v0, v1, p3}, Lqy2/b$a;-><init>(Lqy2/b;Lq83/d;)V

    iput-object p1, v0, Lqy2/b$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lqy2/b$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lqy2/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lty2/a;

    check-cast p2, Loy2/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lqy2/b$a;->f(Lty2/a;Loy2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lqy2/b$a;->x:Ljava/lang/Object;

    check-cast v0, Lty2/a;

    iget-object v1, p0, Lqy2/b$a;->y:Ljava/lang/Object;

    check-cast v1, Loy2/b;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lqy2/b$a;->w:I

    if-nez v2, :cond_13

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Loy2/b$q;->a:Loy2/b$q;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lty2/a$g;->a:Lty2/a$g;

    return-object p1

    :cond_0
    instance-of p1, v1, Loy2/b$i;

    if-eqz p1, :cond_1

    check-cast v1, Loy2/b$i;

    invoke-static {v1}, Lqy2/c;->h(Loy2/b$i;)Lty2/a$a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v1, Loy2/b$g;

    if-eqz p1, :cond_2

    check-cast v1, Loy2/b$g;

    invoke-static {v1}, Lqy2/c;->f(Loy2/b$g;)Lty2/a$a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v1, Loy2/b$m;

    if-eqz p1, :cond_3

    check-cast v1, Loy2/b$m;

    invoke-static {v1}, Lqy2/c;->j(Loy2/b$m;)Lty2/a$c;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v1, Loy2/b$t;

    if-eqz p1, :cond_4

    new-instance p1, Lty2/a$j;

    check-cast v1, Loy2/b$t;

    invoke-virtual {v1}, Loy2/b$t;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {p1, v0}, Lty2/a$j;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_4
    instance-of p1, v1, Loy2/b$r;

    if-eqz p1, :cond_5

    new-instance p1, Lty2/a$h;

    check-cast v1, Loy2/b$r;

    invoke-virtual {v1}, Loy2/b$r;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Loy2/b$r;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lty2/a$h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_5
    instance-of p1, v1, Loy2/b$s;

    if-eqz p1, :cond_6

    check-cast v1, Loy2/b$s;

    invoke-static {v1}, Lqy2/c;->l(Loy2/b$s;)Lty2/a$i;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v1, Loy2/b$o;

    if-eqz p1, :cond_7

    new-instance p1, Lty2/a$e;

    check-cast v1, Loy2/b$o;

    invoke-virtual {v1}, Loy2/b$o;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Loy2/b$o;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Loy2/b$o;->j()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Loy2/b$o;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {p1, v0, v2, v3, v1}, Lty2/a$e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_7
    instance-of p1, v1, Loy2/b$p;

    if-eqz p1, :cond_8

    new-instance p1, Lty2/a$f;

    check-cast v1, Loy2/b$p;

    invoke-virtual {v1}, Loy2/b$p;->j()I

    move-result v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    invoke-virtual {v1}, Loy2/b$p;->h()I

    move-result v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    invoke-virtual {v1}, Loy2/b$p;->i()I

    move-result v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {p1, v0, v2, v1}, Lty2/a$f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_8
    instance-of p1, v1, Loy2/b$k;

    if-eqz p1, :cond_9

    new-instance p1, Lty2/a$b;

    check-cast v1, Loy2/b$k;

    invoke-virtual {v1}, Loy2/b$k;->h()I

    move-result v0

    invoke-direct {p1, v0}, Lty2/a$b;-><init>(I)V

    return-object p1

    :cond_9
    sget-object p1, Loy2/b$l;->a:Loy2/b$l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    return-object v0

    :cond_a
    instance-of p1, v1, Loy2/b$c;

    if-eqz p1, :cond_b

    check-cast v1, Loy2/b$c;

    invoke-static {v1}, Lqy2/c;->c(Loy2/b$c;)Lty2/a$a;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of p1, v1, Loy2/b$a;

    if-eqz p1, :cond_c

    check-cast v1, Loy2/b$a;

    invoke-static {v1}, Lqy2/c;->a(Loy2/b$a;)Lty2/a$a;

    move-result-object p1

    return-object p1

    :cond_c
    instance-of p1, v1, Loy2/b$n;

    if-eqz p1, :cond_d

    check-cast v1, Loy2/b$n;

    invoke-static {v1}, Lqy2/c;->k(Loy2/b$n;)Lty2/a$d;

    move-result-object p1

    return-object p1

    :cond_d
    instance-of p1, v1, Loy2/b$e;

    if-eqz p1, :cond_e

    check-cast v1, Loy2/b$e;

    invoke-static {v1}, Lqy2/c;->e(Loy2/b$e;)Lty2/a$a;

    move-result-object p1

    return-object p1

    :cond_e
    instance-of p1, v1, Loy2/b$d;

    if-eqz p1, :cond_f

    check-cast v1, Loy2/b$d;

    invoke-static {v1}, Lqy2/c;->d(Loy2/b$d;)Lty2/a$a;

    move-result-object p1

    return-object p1

    :cond_f
    instance-of p1, v1, Loy2/b$h;

    if-eqz p1, :cond_10

    check-cast v1, Loy2/b$h;

    invoke-static {v1}, Lqy2/c;->g(Loy2/b$h;)Lty2/a$a;

    move-result-object p1

    return-object p1

    :cond_10
    instance-of p1, v1, Loy2/b$j;

    if-eqz p1, :cond_11

    check-cast v1, Loy2/b$j;

    invoke-static {v1}, Lqy2/c;->i(Loy2/b$j;)Lty2/a$a;

    move-result-object p1

    return-object p1

    :cond_11
    instance-of p1, v1, Loy2/b$b;

    if-eqz p1, :cond_12

    check-cast v1, Loy2/b$b;

    iget-object p1, p0, Lqy2/b$a;->z:Lqy2/b;

    invoke-virtual {p1}, Lqy2/b;->a()Lzr2/a;

    move-result-object p1

    iget-object v0, p0, Lqy2/b$a;->z:Lqy2/b;

    invoke-virtual {v0}, Lqy2/b;->b()Lor2/u0;

    move-result-object v0

    invoke-virtual {v0}, Lor2/u0;->l()Z

    move-result v0

    invoke-static {v1, p1, v0}, Lqy2/c;->b(Loy2/b$b;Lzr2/a;Z)Lty2/a$a;

    move-result-object p1

    return-object p1

    :cond_12
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
