.class final Ly42/h$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly42/h;->o1(Lxj0/b;ZLq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lzj0/h;",
        "it",
        "",
        "<anonymous>",
        "(Lzj0/h;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.ble.PuffinImpl$sendCommandToPuffin$4"
    f = "PuffinImpl.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lxj0/b;


# direct methods
.method public constructor <init>(Lxj0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxj0/b;",
            "Lq83/d<",
            "-",
            "Ly42/h$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly42/h$f;->y:Lxj0/b;

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

    new-instance v0, Ly42/h$f;

    iget-object v1, p0, Ly42/h$f;->y:Lxj0/b;

    invoke-direct {v0, v1, p2}, Ly42/h$f;-><init>(Lxj0/b;Lq83/d;)V

    iput-object p1, v0, Ly42/h$f;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lzj0/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzj0/h;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ly42/h$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ly42/h$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ly42/h$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzj0/h;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ly42/h$f;->f(Lzj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ly42/h$f;->x:Ljava/lang/Object;

    check-cast v0, Lzj0/h;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ly42/h$f;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lzj0/h;->U()Llt0/l;

    move-result-object p1

    iget-object v1, p0, Ly42/h$f;->y:Lxj0/b;

    sget-object v2, Lst0/v;->PUFFIN:Lst0/v;

    invoke-virtual {v1, v2}, Lxj0/b;->s(Lst0/v;)Llt0/a;

    move-result-object v1

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, Lzj0/h;->T()B

    move-result p1

    iget-object v0, p0, Ly42/h$f;->y:Lxj0/b;

    invoke-virtual {v0}, Lxj0/b;->N()B

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
