.class final Lrv1/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrv1/a;->u(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.membership.data.repositories.MembershipRepository$fetchMembershipInfo$2"
    f = "MembershipRepository.kt"
    l = {
        0x7f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lrv1/a;


# direct methods
.method public constructor <init>(Lrv1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrv1/a;",
            "Lq83/d<",
            "-",
            "Lrv1/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrv1/a$c;->y:Lrv1/a;

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

    new-instance v0, Lrv1/a$c;

    iget-object v1, p0, Lrv1/a$c;->y:Lrv1/a;

    invoke-direct {v0, v1, p2}, Lrv1/a$c;-><init>(Lrv1/a;Lq83/d;)V

    iput-object p1, v0, Lrv1/a$c;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lrv1/a$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrv1/a$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrv1/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrv1/a$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lrv1/a$c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lrv1/a$c;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lrv1/a$c;->y:Lrv1/a;

    invoke-static {p1}, Lrv1/a;->p(Lrv1/a;)Z

    move-result p1

    const/4 v2, 0x3

    const/4 v4, 0x0

    if-eqz p1, :cond_2

    new-instance p1, Lrv1/a$c$a;

    iget-object v5, p0, Lrv1/a$c;->y:Lrv1/a;

    invoke-direct {p1, v5, v4}, Lrv1/a$c$a;-><init>(Lrv1/a;Lq83/d;)V

    invoke-static {v0, v4, v4, p1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    iget-object p1, p0, Lrv1/a$c;->y:Lrv1/a;

    invoke-static {p1}, Lrv1/a;->f(Lrv1/a;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lrv1/a$c$b;

    iget-object v5, p0, Lrv1/a$c;->y:Lrv1/a;

    invoke-direct {p1, v5, v4}, Lrv1/a$c$b;-><init>(Lrv1/a;Lq83/d;)V

    invoke-static {v0, v4, v4, p1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_3
    iget-object p1, p0, Lrv1/a$c;->y:Lrv1/a;

    invoke-static {p1}, Lrv1/a;->o(Lrv1/a;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lrv1/a$c;->y:Lrv1/a;

    invoke-static {p1}, Lrv1/a;->p(Lrv1/a;)Z

    move-result v0

    xor-int/2addr v0, v3

    iget-object v2, p0, Lrv1/a$c;->y:Lrv1/a;

    invoke-static {v2}, Lrv1/a;->f(Lrv1/a;)Z

    move-result v2

    xor-int/2addr v2, v3

    iput-object v4, p0, Lrv1/a$c;->x:Ljava/lang/Object;

    iput v3, p0, Lrv1/a$c;->w:I

    invoke-static {p1, v0, v2, p0}, Lrv1/a;->e(Lrv1/a;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
