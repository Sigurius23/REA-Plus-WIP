.class final Lsc2/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsc2/d;->L(Ljava/lang/String;)V
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
    c = "com.whoop.settings.strap.EditDeviceNameViewModel$onSaveButtonClicked$1"
    f = "EditDeviceNameViewModel.kt"
    l = {
        0x32,
        0x34
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lsc2/d;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lsc2/d;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsc2/d;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lsc2/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsc2/d$a;->y:Lsc2/d;

    iput-object p2, p0, Lsc2/d$a;->z:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lsc2/d$a;

    iget-object v0, p0, Lsc2/d$a;->y:Lsc2/d;

    iget-object v1, p0, Lsc2/d$a;->z:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lsc2/d$a;-><init>(Lsc2/d;Ljava/lang/String;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lsc2/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsc2/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsc2/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsc2/d$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsc2/d$a;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lsc2/d$a;->w:Ljava/lang/Object;

    check-cast v0, Lzj0/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsc2/d$a;->y:Lsc2/d;

    invoke-static {p1}, Lsc2/d;->w(Lsc2/d;)Lz82/e;

    move-result-object p1

    invoke-virtual {p1}, Lz82/e;->e()V

    iget-object p1, p0, Lsc2/d$a;->y:Lsc2/d;

    invoke-static {p1}, Lsc2/d;->z(Lsc2/d;)Ljk0/d;

    move-result-object v6

    if-eqz v6, :cond_4

    iget-object v7, p0, Lsc2/d$a;->z:Ljava/lang/String;

    iput v5, p0, Lsc2/d$a;->x:I

    const-wide/16 v8, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v6 .. v12}, Ljk0/d;->Q(Ljk0/d;Ljava/lang/String;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v9, v10

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lzj0/h;

    goto :goto_1

    :cond_4
    move-object v9, p0

    move-object p1, v2

    :goto_1
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lzj0/h;->W()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object p1, v9, Lsc2/d$a;->y:Lsc2/d;

    invoke-static {p1}, Lsc2/d;->z(Lsc2/d;)Ljk0/d;

    move-result-object v6

    if-eqz v6, :cond_6

    iput-object v2, v9, Lsc2/d$a;->w:Ljava/lang/Object;

    iput v3, v9, Lsc2/d$a;->x:I

    const-wide/16 v7, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Ljk0/d;->s0(Ljk0/d;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    check-cast p1, Lzj0/h;

    :cond_6
    iget-object p1, v9, Lsc2/d$a;->y:Lsc2/d;

    invoke-static {p1}, Lsc2/d;->w(Lsc2/d;)Lz82/e;

    move-result-object p1

    invoke-virtual {p1, v5}, Lz82/e;->d(Z)V

    iget-object p1, v9, Lsc2/d$a;->y:Lsc2/d;

    invoke-virtual {p1}, Lsc2/d;->C()Landroidx/lifecycle/p0;

    move-result-object v0

    iget-object v1, v9, Lsc2/d$a;->z:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lsc2/d;->A(Lsc2/d;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    iget-object p1, v9, Lsc2/d$a;->y:Lsc2/d;

    invoke-virtual {p1}, Lsc2/d;->B()Lor2/s0;

    move-result-object p1

    iget-object v0, v9, Lsc2/d$a;->z:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lor2/s0;->e(Ljava/lang/Object;)V

    iget-object p1, v9, Lsc2/d$a;->y:Lsc2/d;

    invoke-static {p1}, Lsc2/d;->y(Lsc2/d;)Ltr2/n;

    move-result-object p1

    iget-object v0, v9, Lsc2/d$a;->z:Ljava/lang/String;

    const-string v1, "Success renamed the strap to "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_4

    :cond_7
    iget-object v0, v9, Lsc2/d$a;->y:Lsc2/d;

    invoke-static {v0}, Lsc2/d;->w(Lsc2/d;)Lz82/e;

    move-result-object v0

    invoke-virtual {v0, v4}, Lz82/e;->d(Z)V

    iget-object v0, v9, Lsc2/d$a;->y:Lsc2/d;

    invoke-static {v0}, Lsc2/d;->y(Lsc2/d;)Ltr2/n;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Something went wrong. Response: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_4
    iget-object p1, v9, Lsc2/d$a;->y:Lsc2/d;

    invoke-virtual {p1}, Lsc2/d;->F()Landroidx/lifecycle/p0;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0, v1}, Lsc2/d;->A(Lsc2/d;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
