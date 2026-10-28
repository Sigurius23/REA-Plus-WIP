.class public final Llz/h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Llz/i;

.field public final synthetic F:Z

.field public final synthetic w:I

.field public x:Z

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Llz/i;ZLq83/d;I)V
    .locals 0

    iput p4, p0, Llz/h;->w:I

    iput-object p1, p0, Llz/h;->E:Llz/i;

    iput-boolean p2, p0, Llz/h;->F:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, Llz/h;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Llz/h;

    iget-boolean v1, p0, Llz/h;->F:Z

    const/4 v2, 0x1

    iget-object v3, p0, Llz/h;->E:Llz/i;

    invoke-direct {v0, v3, v1, p2, v2}, Llz/h;-><init>(Llz/i;ZLq83/d;I)V

    iput-object p1, v0, Llz/h;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Llz/h;

    iget-boolean v1, p0, Llz/h;->F:Z

    const/4 v2, 0x0

    iget-object v3, p0, Llz/h;->E:Llz/i;

    invoke-direct {v0, v3, v1, p2, v2}, Llz/h;-><init>(Llz/i;ZLq83/d;I)V

    iput-object p1, v0, Llz/h;->z:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llz/h;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Llz/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llz/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llz/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Llz/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llz/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llz/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Llz/h;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llz/h;->y:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Llz/h;->E:Llz/i;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v6, :cond_2

    if-eq v1, v5, :cond_0

    if-ne v1, v4, :cond_1

    :cond_0
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean v1, p0, Llz/h;->x:Z

    iget-object v7, p0, Llz/h;->z:Ljava/lang/Object;

    check-cast v7, Llz/i;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llz/h;->z:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-boolean v1, p0, Llz/h;->F:Z

    :try_start_2
    iget-object p1, v3, Llz/i;->x:Lxl/a;

    iget-object v7, v3, Llz/i;->z:Lkz/d;

    invoke-virtual {v7}, Lkz/d;->b()Ljz/f;

    move-result-object v7

    iput-object v3, p0, Llz/h;->z:Ljava/lang/Object;

    iput-boolean v1, p0, Llz/h;->x:Z

    iput v6, p0, Llz/h;->y:I

    invoke-virtual {p1, v7, p0}, Lxl/a;->t(Ljz/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_4

    :cond_4
    move-object v7, v3

    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object v8

    const/4 v9, 0x0

    if-nez v8, :cond_5

    if-eqz v1, :cond_5

    iget-object p1, v7, Llz/i;->E:Lec3/w1;

    new-instance v1, Llz/d;

    sget-object v4, Lkz/e;->w:Lkz/e;

    invoke-direct {v1, v4}, Llz/d;-><init>(Lkz/h;)V

    iput-object v9, p0, Llz/h;->z:Ljava/lang/Object;

    iput v5, p0, Llz/h;->y:I

    invoke-virtual {p1, v1, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_5
    iget-object v1, v7, Llz/i;->E:Lec3/w1;

    new-instance v5, Llz/d;

    new-instance v7, Lkz/f;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getParsedToken()Ly00/g8;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-direct {v7, p1, v8, v6}, Lkz/f;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ly00/g8;I)V

    invoke-direct {v5, v7}, Llz/d;-><init>(Lkz/h;)V

    iput-object v9, p0, Llz/h;->z:Ljava/lang/Object;

    iput v4, p0, Llz/h;->y:I

    invoke-virtual {v1, v5, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    move-object p1, v2

    goto :goto_3

    :cond_7
    const-string p1, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_8

    const-string v0, "Failed to complete session for token flow"

    invoke-virtual {v3, v0, p1}, Llz/i;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    move-object v0, v2

    :goto_4
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llz/h;->y:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Llz/h;->E:Llz/i;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_c

    if-eq v1, v6, :cond_b

    if-eq v1, v5, :cond_9

    if-ne v1, v4, :cond_a

    :cond_9
    :try_start_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto/16 :goto_6

    :catchall_1
    move-exception p1

    goto/16 :goto_7

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    iget-boolean v1, p0, Llz/h;->x:Z

    iget-object v6, p0, Llz/h;->z:Ljava/lang/Object;

    check-cast v6, Llz/i;

    :try_start_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_5

    :cond_c
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llz/h;->z:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-boolean v1, p0, Llz/h;->F:Z

    :try_start_5
    iget-object p1, v3, Llz/i;->x:Lxl/a;

    iget-object v7, v3, Llz/i;->z:Lkz/d;

    invoke-virtual {v7}, Lkz/d;->b()Ljz/f;

    move-result-object v7

    iput-object v3, p0, Llz/h;->z:Ljava/lang/Object;

    iput-boolean v1, p0, Llz/h;->x:Z

    iput v6, p0, Llz/h;->y:I

    invoke-virtual {p1, v7, p0}, Lxl/a;->t(Ljz/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_d

    goto :goto_9

    :cond_d
    move-object v6, v3

    :goto_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object v7

    const/4 v8, 0x0

    if-nez v7, :cond_e

    if-eqz v1, :cond_e

    iget-object p1, v6, Llz/i;->E:Lec3/w1;

    new-instance v1, Llz/d;

    sget-object v4, Lkz/e;->w:Lkz/e;

    invoke-direct {v1, v4}, Llz/d;-><init>(Lkz/h;)V

    iput-object v8, p0, Llz/h;->z:Ljava/lang/Object;

    iput v5, p0, Llz/h;->y:I

    invoke-virtual {p1, v1, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_f

    goto :goto_9

    :cond_e
    iget-object v1, v6, Llz/i;->E:Lec3/w1;

    new-instance v5, Llz/d;

    new-instance v6, Lkz/f;

    const/4 v7, 0x5

    invoke-direct {v6, p1, v8, v7}, Lkz/f;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ly00/g8;I)V

    invoke-direct {v5, v6}, Llz/d;-><init>(Lkz/h;)V

    iput-object v8, p0, Llz/h;->z:Ljava/lang/Object;

    iput v4, p0, Llz/h;->y:I

    invoke-virtual {v1, v5, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-ne p1, v0, :cond_f

    goto :goto_9

    :cond_f
    :goto_6
    move-object p1, v2

    goto :goto_8

    :goto_7
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_8
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_10

    const-string v0, "Failed to complete session for data flow"

    invoke-virtual {v3, v0, p1}, Llz/i;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    move-object v0, v2

    :goto_9
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
