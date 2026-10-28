.class final Lqj0/g$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj0/g;->g(ZLq83/d;)Ljava/lang/Object;
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
        "Lqj0/c;",
        "<anonymous>",
        "(Lbc3/c0;)Lqj0/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ble.device.WhoopDeviceBle$connect$2"
    f = "WhoopDeviceBle.kt"
    l = {
        0x4c,
        0x4f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lqj0/g;

.field final synthetic F:Z

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqj0/g;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqj0/g;",
            "Z",
            "Lq83/d<",
            "-",
            "Lqj0/g$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj0/g$b;->E:Lqj0/g;

    iput-boolean p2, p0, Lqj0/g$b;->F:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lqj0/g$b;

    iget-object v1, p0, Lqj0/g$b;->E:Lqj0/g;

    iget-boolean v2, p0, Lqj0/g$b;->F:Z

    invoke-direct {v0, v1, v2, p2}, Lqj0/g$b;-><init>(Lqj0/g;ZLq83/d;)V

    iput-object p1, v0, Lqj0/g$b;->z:Ljava/lang/Object;

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
            "Lqj0/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lqj0/g$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lqj0/g$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lqj0/g$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lqj0/g$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lqj0/g$b;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lqj0/g$b;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lqj0/g$b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    iget-object v1, p0, Lqj0/g$b;->w:Ljava/lang/Object;

    check-cast v1, Lbc3/k1;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    iget-object v0, p0, Lqj0/g$b;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_0

    :catchall_1
    move-exception p1

    move-object v1, v0

    goto/16 :goto_4

    :catch_0
    move-exception p1

    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqj0/g$b;->E:Lqj0/g;

    invoke-static {p1}, Lqj0/g;->l(Lqj0/g;)Ltr2/n;

    move-result-object p1

    iget-object v2, p0, Lqj0/g$b;->E:Lqj0/g;

    invoke-static {v2}, Lqj0/g;->m(Lqj0/g;)Lnj0/f;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const-string v6, "connect: starting on "

    invoke-static {v6, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    new-array v7, v6, [Lqr2/a$a;

    invoke-interface {p1, v2, v7}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lqj0/g$b;->E:Lqj0/g;

    sget-object v2, Lmj0/b;->Linking:Lmj0/b;

    invoke-static {p1, v2}, Lqj0/g;->C(Lqj0/g;Lmj0/b;)V

    iget-object p1, p0, Lqj0/g$b;->E:Lqj0/g;

    invoke-static {p1, v6}, Lqj0/g;->A(Lqj0/g;Z)V

    iget-object p1, p0, Lqj0/g$b;->E:Lqj0/g;

    invoke-static {p1, v6}, Lqj0/g;->M(Lqj0/g;Z)V

    iget-object p1, p0, Lqj0/g$b;->E:Lqj0/g;

    invoke-static {p1, v6}, Lqj0/g;->O(Lqj0/g;Z)V

    iget-object p1, p0, Lqj0/g$b;->E:Lqj0/g;

    invoke-static {p1, v6}, Lqj0/g;->L(Lqj0/g;Z)V

    new-instance p1, Lqj0/g$b$b;

    iget-object v2, p0, Lqj0/g$b;->E:Lqj0/g;

    invoke-direct {p1, v2, v5}, Lqj0/g$b$b;-><init>(Lqj0/g;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v5, v5, p1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    :try_start_2
    iget-object v0, p0, Lqj0/g$b;->E:Lqj0/g;

    iget-boolean v2, p0, Lqj0/g$b;->F:Z

    iput-object v5, p0, Lqj0/g$b;->z:Ljava/lang/Object;

    iput-object p1, p0, Lqj0/g$b;->w:Ljava/lang/Object;

    iput v4, p0, Lqj0/g$b;->y:I

    invoke-static {v0, v2, p0}, Lqj0/g;->s(Lqj0/g;ZLq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    :goto_0
    :try_start_3
    check-cast p1, Lqj0/c;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-interface {v0, v5}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-object p1

    :catchall_2
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    goto :goto_4

    :catch_1
    move-exception v0

    :goto_1
    :try_start_4
    sget-object v2, Lbc3/y1;->w:Lbc3/y1;

    new-instance v4, Lqj0/g$b$a;

    iget-object v6, p0, Lqj0/g$b;->E:Lqj0/g;

    invoke-direct {v4, v6, v5}, Lqj0/g$b$a;-><init>(Lqj0/g;Lq83/d;)V

    iput-object v5, p0, Lqj0/g$b;->z:Ljava/lang/Object;

    iput-object p1, p0, Lqj0/g$b;->w:Ljava/lang/Object;

    iput-object v0, p0, Lqj0/g$b;->x:Ljava/lang/Object;

    iput v3, p0, Lqj0/g$b;->y:I

    invoke-static {v2, v4, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v2, v1, :cond_4

    :goto_2
    return-object v1

    :cond_4
    move-object v1, p1

    :goto_3
    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_4
    invoke-interface {v1, v5}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    throw p1
.end method
