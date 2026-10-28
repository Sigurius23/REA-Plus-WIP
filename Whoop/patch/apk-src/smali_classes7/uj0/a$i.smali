.class final Luj0/a$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luj0/a;->e(Lmj0/e;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ble.manager.WhoopDeviceManagerImpl$pair$4"
    f = "WhoopDeviceManagerImpl.kt"
    l = {
        0x61,
        0x13a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field final synthetic G:Lbc3/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/i0;"
        }
    .end annotation
.end field

.field final synthetic H:Luj0/a;

.field final synthetic I:Ljava/lang/String;

.field final synthetic J:Lqj0/h;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbc3/i0;Luj0/a;Ljava/lang/String;Lqj0/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/i0;",
            "Luj0/a;",
            "Ljava/lang/String;",
            "Lqj0/h;",
            "Lq83/d<",
            "-",
            "Luj0/a$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Luj0/a$i;->G:Lbc3/i0;

    iput-object p2, p0, Luj0/a$i;->H:Luj0/a;

    iput-object p3, p0, Luj0/a$i;->I:Ljava/lang/String;

    iput-object p4, p0, Luj0/a$i;->J:Lqj0/h;

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

    new-instance v0, Luj0/a$i;

    iget-object v1, p0, Luj0/a$i;->G:Lbc3/i0;

    iget-object v2, p0, Luj0/a$i;->H:Luj0/a;

    iget-object v3, p0, Luj0/a$i;->I:Ljava/lang/String;

    iget-object v4, p0, Luj0/a$i;->J:Lqj0/h;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Luj0/a$i;-><init>(Lbc3/i0;Luj0/a;Ljava/lang/String;Lqj0/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Luj0/a$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Luj0/a$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Luj0/a$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Luj0/a$i;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Luj0/a$i;->F:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Luj0/a$i;->z:Ljava/lang/Object;

    check-cast v0, Lqj0/h;

    iget-object v1, p0, Luj0/a$i;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Luj0/a$i;->x:Ljava/lang/Object;

    check-cast v3, Luj0/a;

    iget-object v4, p0, Luj0/a$i;->w:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

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

    iget-object p1, p0, Luj0/a$i;->G:Lbc3/i0;

    iput v4, p0, Luj0/a$i;->F:I

    invoke-static {p1, p0}, Lbc3/f0;->j(Lbc3/k1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Luj0/a$i;->H:Luj0/a;

    invoke-static {p1}, Luj0/a;->j(Luj0/a;)Lmc3/a;

    move-result-object v4

    iget-object p1, p0, Luj0/a$i;->H:Luj0/a;

    iget-object v1, p0, Luj0/a$i;->I:Ljava/lang/String;

    iget-object v5, p0, Luj0/a$i;->J:Lqj0/h;

    iput-object v4, p0, Luj0/a$i;->w:Ljava/lang/Object;

    iput-object p1, p0, Luj0/a$i;->x:Ljava/lang/Object;

    iput-object v1, p0, Luj0/a$i;->y:Ljava/lang/Object;

    iput-object v5, p0, Luj0/a$i;->z:Ljava/lang/Object;

    iput v2, p0, Luj0/a$i;->E:I

    iput v3, p0, Luj0/a$i;->F:I

    invoke-interface {v4, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v3, p1

    move-object v0, v5

    :goto_2
    const/4 p1, 0x0

    :try_start_0
    invoke-static {v3}, Luj0/a;->i(Luj0/a;)Ljava/util/LinkedHashMap;

    move-result-object v5

    invoke-static {v1}, Lmj0/d;->a(Ljava/lang/String;)Lmj0/d;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    invoke-virtual {v0}, Lqj0/h;->e()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, v2}, Lqj0/h;->f(Z)V

    invoke-static {v3, v0}, Luj0/a;->o(Luj0/a;Lqj0/h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_5
    :goto_3
    invoke-interface {v4, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_4
    invoke-interface {v4, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method
