.class public final Lr5/d;
.super Landroid/os/ResultReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcq/i;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lr5/d;->w:I

    .line 2
    iput-object p2, p0, Lr5/d;->x:Ljava/lang/Object;

    invoke-direct {p0, p1}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method

.method public synthetic constructor <init>(Lq5/b;Landroid/os/Handler;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr5/d;->w:I

    iput-object p1, p0, Lr5/d;->x:Ljava/lang/Object;

    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 21

    move-object/from16 v1, p0

    move/from16 v0, p1

    move-object/from16 v2, p2

    iget v3, v1, Lr5/d;->w:I

    const-string v4, "activity is cancelled by the user."

    const-string v5, " indicating not RESULT_OK"

    const-string v6, "activity with result code: "

    const/4 v7, -0x1

    const-string v8, "Returned request code "

    const-string v9, "ACTIVITY_REQUEST_CODE"

    const-string v10, "resultData"

    const/4 v11, 0x0

    iget-object v12, v1, Lr5/d;->x:Ljava/lang/Object;

    packed-switch v3, :pswitch_data_0

    check-cast v12, Lcq/i;

    invoke-virtual {v12, v11}, Lcq/i;->d(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Landroidx/room/v0;

    sget-object v15, Lq5/b;->a:Lq5/a;

    const/16 v19, 0x0

    const/16 v20, 0x13

    const/4 v14, 0x2

    const-class v16, Lq5/a;

    const-string v17, "createCredentialExceptionTypeToException"

    const-string v18, "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;"

    invoke-direct/range {v13 .. v20}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    check-cast v12, Ls5/a;

    iget-object v3, v12, Ls5/a;->f:Ljava/util/concurrent/Executor;

    if-eqz v3, :cond_5

    iget-object v10, v12, Ls5/a;->e:Lm5/g;

    if-eqz v10, :cond_4

    iget-object v11, v12, Ls5/a;->g:Landroid/os/CancellationSignal;

    invoke-static {v2, v13, v3, v10, v11}, Lq5/b;->c(Landroid/os/Bundle;Lc93/m;Ljava/util/concurrent/Executor;Lm5/g;Landroid/os/CancellationSignal;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    sget v3, Lq5/b;->c:I

    if-eq v2, v3, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " which does not match what was given "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "CreatePassword"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    new-instance v2, Lj43/a;

    const/16 v3, 0x9

    invoke-direct {v2, v12, v3}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    iget-object v3, v12, Ls5/a;->g:Landroid/os/CancellationSignal;

    if-eq v0, v7, :cond_3

    new-instance v7, Lkotlin/jvm/internal/g0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v8, Landroidx/credentials/exceptions/CreateCredentialUnknownException;

    invoke-static {v0, v6, v5}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v8, v5}, Landroidx/credentials/exceptions/CreateCredentialUnknownException;-><init>(Ljava/lang/String;)V

    iput-object v8, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v0, :cond_2

    new-instance v0, Landroidx/credentials/exceptions/CreateCredentialCancellationException;

    invoke-direct {v0, v4}, Landroidx/credentials/exceptions/CreateCredentialCancellationException;-><init>(Ljava/lang/String;)V

    iput-object v0, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_2
    new-instance v0, La3/z0;

    invoke-direct {v0, v2, v7}, La3/z0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/g0;)V

    sget v2, Lq5/b;->d:I

    sget v2, Ls5/a;->i:I

    invoke-static {v3, v0}, Lq5/b;->a(Landroid/os/CancellationSignal;Lc93/a;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lm5/c;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v2, v12, Ls5/a;->g:Landroid/os/CancellationSignal;

    new-instance v3, Lr5/c;

    const/4 v4, 0x4

    invoke-direct {v3, v4, v12, v0}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lq5/b;->a(Landroid/os/CancellationSignal;Lc93/a;)V

    :goto_0
    return-void

    :cond_4
    const-string v0, "callback"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v11

    :cond_5
    const-string v0, "executor"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v11

    :pswitch_1
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v13, Landroidx/room/v0;

    sget-object v15, Lq5/b;->a:Lq5/a;

    const/16 v19, 0x0

    const/16 v20, 0x12

    const/4 v14, 0x2

    const-class v16, Lq5/a;

    const-string v17, "getCredentialExceptionTypeToException"

    const-string v18, "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;"

    invoke-direct/range {v13 .. v20}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    check-cast v12, Lr5/e;

    invoke-virtual {v12}, Lr5/e;->f()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v12}, Lr5/e;->e()Lm5/g;

    move-result-object v10

    iget-object v11, v12, Lr5/e;->h:Landroid/os/CancellationSignal;

    invoke-static {v2, v13, v3, v10, v11}, Lq5/b;->c(Landroid/os/Bundle;Lc93/m;Ljava/util/concurrent/Executor;Lm5/g;Landroid/os/CancellationSignal;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_5

    :cond_6
    invoke-virtual {v2, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v9, "RESULT_DATA"

    invoke-virtual {v2, v9}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/content/Intent;

    sget v9, Lq5/b;->c:I

    if-eq v3, v9, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " which  does not match what was given "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "BeginSignIn"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_5

    :cond_7
    new-instance v3, Lj43/a;

    const/4 v8, 0x7

    invoke-direct {v3, v12, v8}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    iget-object v8, v12, Lr5/e;->h:Landroid/os/CancellationSignal;

    if-eq v0, v7, :cond_9

    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v7, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    invoke-static {v0, v6, v5}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v5}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/String;)V

    iput-object v7, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v0, :cond_8

    new-instance v0, Landroidx/credentials/exceptions/GetCredentialCancellationException;

    invoke-direct {v0, v4}, Landroidx/credentials/exceptions/GetCredentialCancellationException;-><init>(Ljava/lang/String;)V

    iput-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_8
    new-instance v0, La3/z0;

    const/16 v4, 0x19

    invoke-direct {v0, v4, v3, v2}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v0}, Lq5/b;->a(Landroid/os/CancellationSignal;Lc93/a;)V

    goto/16 :goto_5

    :cond_9
    :try_start_0
    iget-object v0, v12, Lr5/e;->e:Landroid/content/Context;

    new-instance v3, Lip/c;

    invoke-static {v0}, Luo/w;->f(Ljava/lang/Object;)V

    new-instance v4, Lpo/m;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-direct {v3, v0, v4}, Lip/c;-><init>(Landroid/content/Context;Lpo/m;)V

    invoke-virtual {v3, v2}, Lip/c;->c(Landroid/content/Intent;)Lpo/j;

    move-result-object v0

    invoke-virtual {v12, v0}, Lr5/e;->d(Lpo/j;)Lm5/o;

    move-result-object v0

    iget-object v2, v12, Lr5/e;->h:Landroid/os/CancellationSignal;

    new-instance v3, La3/z0;

    const/16 v4, 0x1b

    invoke-direct {v3, v4, v12, v0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lq5/b;->a(Landroid/os/CancellationSignal;Lc93/a;)V
    :try_end_0
    .catch Lcom/google/android/gms/common/api/ApiException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroidx/credentials/exceptions/GetCredentialException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_3

    :goto_1
    new-instance v2, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/String;)V

    iget-object v0, v12, Lr5/e;->h:Landroid/os/CancellationSignal;

    new-instance v3, Lr5/c;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v12, v2}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v3}, Lq5/b;->a(Landroid/os/CancellationSignal;Lc93/a;)V

    goto :goto_5

    :goto_2
    iget-object v2, v12, Lr5/e;->h:Landroid/os/CancellationSignal;

    new-instance v3, La3/z0;

    const/16 v4, 0x1d

    invoke-direct {v3, v4, v12, v0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lq5/b;->a(Landroid/os/CancellationSignal;Lc93/a;)V

    goto :goto_5

    :goto_3
    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Landroidx/credentials/exceptions/GetCredentialUnknownException;-><init>(Ljava/lang/String;)V

    iput-object v3, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v3, v0, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iget v3, v3, Lcom/google/android/gms/common/api/Status;->w:I

    const/16 v4, 0x10

    if-ne v3, v4, :cond_a

    new-instance v3, Landroidx/credentials/exceptions/GetCredentialCancellationException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Landroidx/credentials/exceptions/GetCredentialCancellationException;-><init>(Ljava/lang/String;)V

    iput-object v3, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_4

    :cond_a
    sget-object v4, Lq5/b;->b:Ljava/util/Set;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    new-instance v3, Landroidx/credentials/exceptions/GetCredentialInterruptedException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Landroidx/credentials/exceptions/GetCredentialInterruptedException;-><init>(Ljava/lang/String;)V

    iput-object v3, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_b
    :goto_4
    iget-object v0, v12, Lr5/e;->h:Landroid/os/CancellationSignal;

    new-instance v3, La3/z0;

    const/16 v4, 0x1c

    invoke-direct {v3, v4, v12, v2}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v3}, Lq5/b;->a(Landroid/os/CancellationSignal;Lc93/a;)V

    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
