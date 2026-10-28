.class final Lvn0/d$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvn0/d;->n(Ljava/lang/String;Ljava/lang/String;Lvn0/c;Lq83/d;)Ljava/lang/Object;
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
        "Lvn0/c;",
        "<anonymous>",
        "(Lbc3/c0;)Lvn0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.changepassword.domain.ChangePasswordInteractor$submitChangePassword$2"
    f = "ChangePasswordInteractor.kt"
    l = {
        0xb7,
        0xbf
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lvn0/d;

.field final synthetic z:Lvn0/c;


# direct methods
.method public constructor <init>(Lvn0/d;Lvn0/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvn0/d;",
            "Lvn0/c;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lvn0/d$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvn0/d$g;->y:Lvn0/d;

    iput-object p2, p0, Lvn0/d$g;->z:Lvn0/c;

    iput-object p3, p0, Lvn0/d$g;->E:Ljava/lang/String;

    iput-object p4, p0, Lvn0/d$g;->F:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lvn0/d$g;

    iget-object v1, p0, Lvn0/d$g;->y:Lvn0/d;

    iget-object v2, p0, Lvn0/d$g;->z:Lvn0/c;

    iget-object v3, p0, Lvn0/d$g;->E:Ljava/lang/String;

    iget-object v4, p0, Lvn0/d$g;->F:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lvn0/d$g;-><init>(Lvn0/d;Lvn0/c;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

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
            "Lvn0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvn0/d$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvn0/d$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvn0/d$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvn0/d$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvn0/d$g;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lvn0/d$g;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

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

    iget-object p1, p0, Lvn0/d$g;->y:Lvn0/d;

    invoke-static {p1}, Lvn0/d;->e(Lvn0/d;)Ly92/a;

    move-result-object p1

    iput v4, p0, Lvn0/d$g;->x:I

    invoke-virtual {p1, p0}, Ly92/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/AuthMaterial;

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object p1, v1

    :goto_1
    if-nez p1, :cond_5

    iget-object p1, p0, Lvn0/d$g;->y:Lvn0/d;

    invoke-static {p1}, Lvn0/d;->d(Lvn0/d;)Lor2/e;

    move-result-object p1

    new-instance v0, Lor2/d$a;

    invoke-direct {v0, v3}, Lor2/d$a;-><init>(Z)V

    invoke-virtual {p1, v0}, Lor2/e;->c(Lor2/d;)V

    new-instance p1, Lu02/a$b$b;

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const-string v1, ""

    invoke-direct {p1, v0, v1, v3}, Lu02/a$b$b;-><init>(Ljava/lang/Exception;Ljava/lang/String;Z)V

    iget-object v0, p0, Lvn0/d$g;->y:Lvn0/d;

    iget-object v1, p0, Lvn0/d$g;->z:Lvn0/c;

    invoke-static {v0, p1, v1}, Lvn0/d;->i(Lvn0/d;Lu02/a$b;Lvn0/c;)Lvn0/c;

    move-result-object p1

    return-object p1

    :cond_5
    iget-object v5, p0, Lvn0/d$g;->y:Lvn0/d;

    invoke-static {v5}, Lvn0/d;->f(Lvn0/d;)Ldj0/b;

    move-result-object v5

    iget-object v6, p0, Lvn0/d$g;->E:Ljava/lang/String;

    iget-object v7, p0, Lvn0/d$g;->F:Ljava/lang/String;

    iput-object v1, p0, Lvn0/d$g;->w:Ljava/lang/Object;

    iput v2, p0, Lvn0/d$g;->x:I

    invoke-virtual {v5, p1, v6, v7, p0}, Ldj0/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    :goto_3
    check-cast p1, Ldj0/e;

    iget-object v0, p0, Lvn0/d$g;->y:Lvn0/d;

    invoke-static {v0, p1}, Lvn0/d;->c(Lvn0/d;Ldj0/e;)Lu02/a;

    move-result-object p1

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_7

    iget-object p1, p0, Lvn0/d$g;->y:Lvn0/d;

    invoke-static {p1}, Lvn0/d;->d(Lvn0/d;)Lor2/e;

    move-result-object p1

    new-instance v0, Lor2/d$a;

    invoke-direct {v0, v4}, Lor2/d$a;-><init>(Z)V

    invoke-virtual {p1, v0}, Lor2/e;->c(Lor2/d;)V

    iget-object p1, p0, Lvn0/d$g;->z:Lvn0/c;

    invoke-virtual {p1}, Lvn0/c;->q()Lvn0/c;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of v0, p1, Lu02/a$b;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lvn0/d$g;->y:Lvn0/d;

    invoke-static {v0}, Lvn0/d;->d(Lvn0/d;)Lor2/e;

    move-result-object v0

    new-instance v1, Lor2/d$a;

    invoke-direct {v1, v3}, Lor2/d$a;-><init>(Z)V

    invoke-virtual {v0, v1}, Lor2/e;->c(Lor2/d;)V

    iget-object v0, p0, Lvn0/d$g;->y:Lvn0/d;

    check-cast p1, Lu02/a$b;

    iget-object v1, p0, Lvn0/d$g;->z:Lvn0/c;

    invoke-static {v0, p1, v1}, Lvn0/d;->i(Lvn0/d;Lu02/a$b;Lvn0/c;)Lvn0/c;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
