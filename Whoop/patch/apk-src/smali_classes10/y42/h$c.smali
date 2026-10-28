.class final Ly42/h$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly42/h;->n1()V
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
    c = "com.whoop.puffin.ble.PuffinImpl$registerCharsForNotificationAndExchangeHelloPacket$1"
    f = "PuffinImpl.kt"
    l = {
        0x192,
        0x152
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Ly42/h;


# direct methods
.method public constructor <init>(Ly42/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/h;",
            "Lq83/d<",
            "-",
            "Ly42/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly42/h$c;->z:Ly42/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Ly42/h$c;

    iget-object v0, p0, Ly42/h$c;->z:Ly42/h;

    invoke-direct {p1, v0, p2}, Ly42/h$c;-><init>(Ly42/h;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ly42/h$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ly42/h$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ly42/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ly42/h$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ly42/h$c;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ly42/h$c;->w:Ljava/lang/Object;

    check-cast v0, Lbk0/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ly42/h$c;->w:Ljava/lang/Object;

    check-cast v1, Lbc3/i0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    invoke-static {p1}, Ly42/h;->f0(Ly42/h;)Ltr2/n;

    move-result-object p1

    const-string v1, "Puffin Connection Step: 4 Sending Get Hello Command Packet Request Starting..."

    new-array v6, v4, [Lqr2/a$a;

    invoke-interface {p1, v1, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    invoke-static {p1}, Ly42/h;->a0(Ly42/h;)Ly42/e;

    move-result-object p1

    sget-object v1, Lc52/a$f;->a:Lc52/a$f;

    invoke-virtual {p1, v1}, Ly42/e;->e(Lc52/a;)V

    :try_start_1
    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    new-instance v1, La52/a;

    invoke-direct {v1}, La52/a;-><init>()V

    sget-object v6, Lsj2/a$a;->a:Lsj2/a$a;

    invoke-virtual {p1, v1, v6}, Ly42/h;->a(Lvk0/a;Lsj2/a;)Lbc3/i0;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iput-object v5, p0, Ly42/h$c;->w:Ljava/lang/Object;

    iput v4, p0, Ly42/h$c;->x:I

    iput v3, p0, Ly42/h$c;->y:I

    invoke-interface {p1, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto/16 :goto_4

    :cond_3
    :goto_0
    check-cast p1, Lvk0/e;

    instance-of v1, p1, Lvk0/e$a;

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    instance-of v1, p1, Lvk0/e$b;

    if-eqz v1, :cond_5

    move-object v1, p1

    check-cast v1, Lvk0/e$b;

    invoke-virtual {v1}, Lvk0/e$b;->a()Lzj0/h;

    move-result-object v1

    instance-of v1, v1, Lbk0/a;

    if-eqz v1, :cond_6

    check-cast p1, Lvk0/e$b;

    invoke-virtual {p1}, Lvk0/e$b;->a()Lzj0/h;

    move-result-object p1

    goto :goto_2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :try_start_3
    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->o(Lq83/j;)V

    :cond_6
    :goto_1
    move-object p1, v5

    :goto_2
    instance-of v1, p1, Lbk0/a;

    if-eqz v1, :cond_7

    check-cast p1, Lbk0/a;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    invoke-static {p1}, Ly42/h;->f0(Ly42/h;)Ltr2/n;

    move-result-object p1

    new-array v1, v4, [Lqr2/a$a;

    const-string v3, "Puffin Connection Step: 4 Failed to send hello response packet"

    invoke-interface {p1, v3, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    new-instance v1, Lus0/d$d;

    sget-object v6, Lst0/v;->PUFFIN:Lst0/v;

    sget-object v7, Lus0/d$b;->FAIL:Lus0/d$b;

    invoke-direct {v1, v6, v7, v3}, Lus0/d$d;-><init>(Lst0/v;Lus0/d$b;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ly42/h;->g1(Ly42/h;Lus0/d;)V

    :cond_7
    move-object p1, v5

    :goto_3
    if-nez p1, :cond_8

    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    invoke-static {p1}, Ly42/h;->a0(Ly42/h;)Ly42/e;

    move-result-object p1

    new-instance v0, Lc52/a$e;

    const-string v1, "Puffin Connection Step: 4 Failed hello exchange"

    invoke-direct {v0, v1}, Lc52/a$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ly42/e;->e(Lc52/a;)V

    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    new-instance v0, Lus0/d$d;

    sget-object v2, Lst0/v;->PUFFIN:Lst0/v;

    sget-object v3, Lus0/d$b;->FAIL:Lus0/d$b;

    invoke-direct {v0, v2, v3, v1}, Lus0/d$d;-><init>(Lst0/v;Lus0/d$b;Ljava/lang/String;)V

    invoke-static {p1, v0}, Ly42/h;->g1(Ly42/h;Lus0/d;)V

    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    invoke-virtual {p1}, Ly42/h;->i1()V

    goto/16 :goto_6

    :cond_8
    iget-object v1, p0, Ly42/h$c;->z:Ly42/h;

    invoke-static {v1}, Ly42/h;->f0(Ly42/h;)Ltr2/n;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Puffin Connection Step: Success hello exchange "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v1, v3, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Ly42/h$c;->z:Ly42/h;

    invoke-static {v1}, Ly42/h;->T0(Ly42/h;)Lec3/p1;

    move-result-object v1

    invoke-virtual {p1}, Lbk0/a;->X()Lws0/a;

    move-result-object v3

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v1, p0, Ly42/h$c;->z:Ly42/h;

    invoke-static {v1}, Ly42/h;->c0(Ly42/h;)La6/g;

    move-result-object v1

    sget-object v3, Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;->INSTANCE:Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;

    invoke-virtual {v3}, Lcom/whoop/strapMetadata/util/DataStorePreferenceKeys;->getPREF_AUXILIARY_DEVICE_ID()Lf6/d;

    move-result-object v3

    invoke-virtual {p1}, Lbk0/a;->a0()Ljava/lang/String;

    move-result-object v4

    iput-object p1, p0, Ly42/h$c;->w:Ljava/lang/Object;

    iput v2, p0, Ly42/h$c;->y:I

    invoke-static {v1, v3, v4, p0}, Lkh2/a;->c(La6/g;Lf6/d;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_9

    :goto_4
    return-object v0

    :cond_9
    move-object v0, p1

    :goto_5
    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    invoke-static {p1}, Ly42/h;->R0(Ly42/h;)Lec3/p1;

    move-result-object p1

    new-instance v6, Lc52/d;

    invoke-virtual {v0}, Lbk0/a;->Z()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lbk0/a;->a0()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lbk0/a;->d()Loh2/b;

    move-result-object v9

    invoke-virtual {v0}, Lbk0/a;->Y()Lpt0/a;

    move-result-object v10

    iget-object v0, p0, Ly42/h$c;->z:Ly42/h;

    invoke-static {v0}, Ly42/h;->j0(Ly42/h;)Ljava/lang/String;

    move-result-object v11

    invoke-direct/range {v6 .. v11}, Lc52/d;-><init>(Ljava/lang/String;Ljava/lang/String;Loh2/b;Lpt0/a;Ljava/lang/String;)V

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v5, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    new-instance v0, Lus0/d$d;

    sget-object v1, Lst0/v;->PUFFIN:Lst0/v;

    sget-object v2, Lus0/d$b;->SUCCESS:Lus0/d$b;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lus0/d$d;-><init>(Lst0/v;Lus0/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v0}, Ly42/h;->g1(Ly42/h;Lus0/d;)V

    iget-object p1, p0, Ly42/h$c;->z:Ly42/h;

    invoke-static {p1}, Ly42/h;->a0(Ly42/h;)Ly42/e;

    move-result-object p1

    sget-object v0, Lc52/a$g;->a:Lc52/a$g;

    invoke-virtual {p1, v0}, Ly42/e;->e(Lc52/a;)V

    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
