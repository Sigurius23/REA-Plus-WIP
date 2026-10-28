.class public final Llz/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Llz/i;

.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:I

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Llz/i;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Llz/a;->w:I

    .line 1
    iput-object p1, p0, Llz/a;->z:Ljava/lang/String;

    iput-object p2, p0, Llz/a;->E:Llz/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Llz/i;Ljava/lang/String;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Llz/a;->w:I

    .line 2
    iput-object p1, p0, Llz/a;->E:Llz/i;

    iput-object p2, p0, Llz/a;->z:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Llz/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Llz/a;

    iget-object v0, p0, Llz/a;->z:Ljava/lang/String;

    iget-object v1, p0, Llz/a;->E:Llz/i;

    invoke-direct {p1, v0, v1, p2}, Llz/a;-><init>(Ljava/lang/String;Llz/i;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance v0, Llz/a;

    iget-object v1, p0, Llz/a;->E:Llz/i;

    iget-object v2, p0, Llz/a;->z:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Llz/a;-><init>(Llz/i;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Llz/a;->x:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llz/a;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Llz/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llz/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llz/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Llz/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llz/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llz/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Llz/a;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llz/a;->y:I

    iget-object v2, p0, Llz/a;->E:Llz/i;

    iget-object v3, p0, Llz/a;->z:Ljava/lang/String;

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v0, p0, Llz/a;->x:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "uri"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v1, "payment_method"

    invoke-virtual {p1, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v5, 0x0

    invoke-static {v1, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    const-string v5, "decode(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v1, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v1, Lkz/p;

    const-string v5, "last4"

    invoke-virtual {p1, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "bank_name"

    invoke-virtual {p1, v7}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "incentive_eligible"

    invoke-virtual {p1, v8}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-direct {v1, v6, v5, v7, p1}, Lkz/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object p1, v1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    const-string p1, "Required value was null."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_1
    instance-of v1, p1, Ll83/m;

    if-nez v1, :cond_4

    move-object v1, p1

    check-cast v1, Lkz/p;

    iget-object v5, v2, Llz/i;->E:Lec3/w1;

    new-instance v6, Llz/d;

    new-instance v7, Lkz/f;

    const/4 v8, 0x0

    invoke-direct {v7, v1, v8, v8}, Lkz/f;-><init>(Lkz/p;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ly00/g8;)V

    invoke-direct {v6, v7}, Llz/d;-><init>(Lkz/h;)V

    iput-object p1, p0, Llz/a;->x:Ljava/lang/Object;

    iput v4, p0, Llz/a;->y:I

    invoke-virtual {v5, v6, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, p1

    :goto_2
    move-object p1, v0

    :cond_4
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    const-string v0, "Failed to parse instant debits result from url: "

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, p1}, Llz/i;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llz/a;->y:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, p0, Llz/a;->E:Llz/i;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_8

    if-eq v1, v5, :cond_7

    if-ne v1, v4, :cond_6

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_5

    :catchall_1
    move-exception p1

    goto/16 :goto_6

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    iget-object v1, p0, Llz/a;->x:Ljava/lang/Object;

    check-cast v1, Llz/i;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :cond_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llz/a;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object p1, p0, Llz/a;->z:Ljava/lang/String;

    :try_start_3
    iget-object v1, v3, Llz/i;->x:Lxl/a;

    iget-object v6, v3, Llz/i;->z:Lkz/d;

    invoke-virtual {v6}, Lkz/d;->b()Ljz/f;

    move-result-object v6

    iput-object v3, p0, Llz/a;->x:Ljava/lang/Object;

    iput v5, p0, Llz/a;->y:I

    invoke-virtual {v1, v6, p1, p0}, Lxl/a;->E(Ljz/f;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto/16 :goto_8

    :cond_9
    move-object v1, v3

    :goto_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;

    iget-object v5, v1, Llz/i;->z:Lkz/d;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;->getHostedAuthUrl()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lrz/a;->a(Lkz/d;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Llz/c;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;->getSuccessUrl()Ljava/lang/String;

    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const-string v8, "Required value was null."

    if-eqz v7, :cond_e

    :try_start_4
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;->getCancelUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_d

    if-eqz v5, :cond_c

    invoke-direct {v6, v7, p1, v5}, Llz/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v1, Llz/i;->G:Lec3/h2;

    :cond_a
    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Llz/c;

    invoke-virtual {p1, v5, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    iget-object p1, v1, Llz/i;->E:Lec3/w1;

    new-instance v1, Llz/e;

    iget-object v5, v6, Llz/c;->c:Ljava/lang/String;

    invoke-direct {v1, v5}, Llz/e;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x0

    iput-object v5, p0, Llz/a;->x:Ljava/lang/Object;

    iput v4, p0, Llz/a;->y:I

    invoke-virtual {p1, v1, p0}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    goto :goto_8

    :cond_b
    :goto_5
    move-object p1, v2

    goto :goto_7

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_6
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_7
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_f

    const-string v0, "Failed to synchronize session"

    invoke-virtual {v3, v0, p1}, Llz/i;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    move-object v0, v2

    :goto_8
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
