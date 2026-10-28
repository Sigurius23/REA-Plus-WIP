.class public Landroidx/credentials/playservices/HiddenActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0017\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroidx/credentials/playservices/HiddenActivity;",
        "Landroid/app/Activity;",
        "<init>",
        "()V",
        "credentials-play-services-auth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic y:I


# instance fields
.field public w:Landroid/os/ResultReceiver;

.field public x:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "FAILURE_RESPONSE"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "EXCEPTION_TYPE"

    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "EXCEPTION_MESSAGE"

    invoke-virtual {v0, p2, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const p2, 0x7fffffff

    invoke-virtual {p1, p2, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "FAILURE_RESPONSE"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "ACTIVITY_REQUEST_CODE"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "RESULT_DATA"

    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object p1, p0, Landroidx/credentials/playservices/HiddenActivity;->w:Landroid/os/ResultReceiver;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    :cond_0
    iput-boolean v2, p0, Landroidx/credentials/playservices/HiddenActivity;->x:Z

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "TYPE"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v5, "RESULT_RECEIVER"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/os/ResultReceiver;

    iput-object v4, v0, Landroidx/credentials/playservices/HiddenActivity;->w:Landroid/os/ResultReceiver;

    if-nez v4, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    if-eqz v1, :cond_1

    const-string v4, "androidx.credentials.playservices.AWAITING_RESULT"

    invoke-virtual {v1, v4, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Landroidx/credentials/playservices/HiddenActivity;->x:Z

    :cond_1
    iget-boolean v1, v0, Landroidx/credentials/playservices/HiddenActivity;->x:Z

    if-eqz v1, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string v1, "HiddenActivity"

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v7, "ACTIVITY_REQUEST_CODE"

    const-string v8, "REQUEST_TYPE"

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v2, "SIGN_IN_INTENT"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lpo/g;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v7, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    if-eqz v2, :cond_4

    new-instance v4, Lip/c;

    new-instance v5, Lpo/m;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-direct {v4, v0, v5}, Lip/c;-><init>(Landroidx/credentials/playservices/HiddenActivity;Lpo/m;)V

    iget-object v7, v2, Lpo/g;->w:Ljava/lang/String;

    invoke-static {v7}, Luo/w;->f(Ljava/lang/Object;)V

    iget-object v10, v2, Lpo/g;->z:Ljava/lang/String;

    iget-object v8, v2, Lpo/g;->x:Ljava/lang/String;

    iget-boolean v11, v2, Lpo/g;->E:Z

    iget v12, v2, Lpo/g;->F:I

    new-instance v6, Lpo/g;

    iget-object v9, v4, Lip/c;->a:Ljava/lang/String;

    invoke-direct/range {v6 .. v12}, Lpo/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v2

    sget-object v5, Lip/f;->c:Lcom/google/android/gms/common/c;

    filled-new-array {v5}, [Lcom/google/android/gms/common/c;

    move-result-object v5

    iput-object v5, v2, Le73/b;->c:Ljava/lang/Object;

    new-instance v5, Lhm/d;

    const/16 v7, 0x10

    invoke-direct {v5, v4, v6, v7}, Lhm/d;-><init>(Lcom/google/android/gms/common/api/h;Lvo/a;I)V

    iput-object v5, v2, Le73/b;->e:Ljava/lang/Object;

    const/16 v5, 0x613

    iput v5, v2, Le73/b;->d:I

    invoke-virtual {v2}, Le73/b;->g()Lto/j0;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v4, Lp5/e;

    const/4 v5, 0x3

    invoke-direct {v4, v0, v3, v5}, Lp5/e;-><init>(Ljava/lang/Object;II)V

    new-instance v3, Lmm/d;

    const/16 v5, 0x11

    invoke-direct {v3, v4, v5}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Lp5/d;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v4}, Lp5/d;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object v5

    :cond_4
    if-nez v5, :cond_b

    const-string v2, "During get sign-in intent, params is null, nothing to launch for get sign-in intent"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :sswitch_1
    const-string v4, "CREATE_PASSWORD"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lpo/h;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    invoke-virtual {v4, v7, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    if-eqz v3, :cond_6

    new-instance v5, Lip/c;

    new-instance v6, Lpo/l;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-direct {v5, v0, v6}, Lip/c;-><init>(Landroidx/credentials/playservices/HiddenActivity;Lpo/l;)V

    iget-object v6, v3, Lpo/h;->w:Lpo/k;

    iget v3, v3, Lpo/h;->y:I

    new-instance v7, Lpo/h;

    iget-object v8, v5, Lip/c;->a:Ljava/lang/String;

    invoke-direct {v7, v6, v8, v3}, Lpo/h;-><init>(Lpo/k;Ljava/lang/String;I)V

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v3

    sget-object v6, Lip/f;->b:Lcom/google/android/gms/common/c;

    filled-new-array {v6}, [Lcom/google/android/gms/common/c;

    move-result-object v6

    iput-object v6, v3, Le73/b;->c:Ljava/lang/Object;

    new-instance v6, Lhm/d;

    const/16 v8, 0xd

    invoke-direct {v6, v5, v7, v8}, Lhm/d;-><init>(Lcom/google/android/gms/common/api/h;Lvo/a;I)V

    iput-object v6, v3, Le73/b;->e:Ljava/lang/Object;

    iput-boolean v2, v3, Le73/b;->b:Z

    const/16 v2, 0x600

    iput v2, v3, Le73/b;->d:I

    invoke-virtual {v3}, Le73/b;->g()Lto/j0;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Lp5/e;

    const/4 v5, 0x1

    invoke-direct {v3, v0, v4, v5}, Lp5/e;-><init>(Ljava/lang/Object;II)V

    new-instance v4, Lmm/d;

    const/16 v5, 0x10

    invoke-direct {v4, v3, v5}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v4}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Lp5/d;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Lp5/d;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object v5

    :cond_6
    if-nez v5, :cond_b

    const-string v2, "During save password, params is null, nothing to launch for create password"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :sswitch_2
    const-string v2, "CREATE_PUBLIC_KEY_CREDENTIAL"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_1

    :cond_7
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lgp/r;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v7, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    if-eqz v2, :cond_8

    new-instance v4, Lfp/a;

    new-instance v5, Ljc/b;

    const/16 v6, 0x18

    invoke-direct {v5, v6}, Ljc/b;-><init>(I)V

    sget-object v6, Lfp/a;->a:Lcom/google/android/gms/common/api/f;

    invoke-direct {v4, v0, v6, v5}, Lcom/google/android/gms/common/api/h;-><init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/f;Ljc/b;)V

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v5

    new-instance v6, Le10/k0;

    invoke-direct {v6, v4, v2}, Le10/k0;-><init>(Lfp/a;Lgp/r;)V

    iput-object v6, v5, Le73/b;->e:Ljava/lang/Object;

    const/16 v2, 0x151f

    iput v2, v5, Le73/b;->d:I

    invoke-virtual {v5}, Le73/b;->g()Lto/j0;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v4, Lp5/e;

    const/4 v5, 0x2

    invoke-direct {v4, v0, v3, v5}, Lp5/e;-><init>(Ljava/lang/Object;II)V

    new-instance v3, Lmm/d;

    const/16 v5, 0xf

    invoke-direct {v3, v4, v5}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Lp5/d;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Lp5/d;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object v5

    :cond_8
    if-nez v5, :cond_b

    const-string v2, "During create public key credential, request is null, so nothing to launch for public key credentials"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :sswitch_3
    const-string v4, "BEGIN_SIGN_IN"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_1

    :cond_9
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Lpo/e;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    invoke-virtual {v4, v7, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    if-eqz v3, :cond_a

    new-instance v5, Lip/c;

    new-instance v6, Lpo/m;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-direct {v5, v0, v6}, Lip/c;-><init>(Landroidx/credentials/playservices/HiddenActivity;Lpo/m;)V

    new-instance v7, Lpo/a;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Lpo/a;-><init>(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;Z)V

    iget-object v6, v3, Lpo/e;->x:Lpo/a;

    invoke-static {v6}, Luo/w;->f(Ljava/lang/Object;)V

    iget-object v7, v3, Lpo/e;->w:Lpo/d;

    invoke-static {v7}, Luo/w;->f(Ljava/lang/Object;)V

    iget-object v8, v3, Lpo/e;->F:Lpo/c;

    invoke-static {v8}, Luo/w;->f(Ljava/lang/Object;)V

    iget-object v9, v3, Lpo/e;->G:Lpo/b;

    invoke-static {v9}, Luo/w;->f(Ljava/lang/Object;)V

    iget-boolean v10, v3, Lpo/e;->z:Z

    iget v11, v3, Lpo/e;->E:I

    iget-boolean v3, v3, Lpo/e;->H:Z

    new-instance v15, Lpo/e;

    iget-object v12, v5, Lip/c;->a:Ljava/lang/String;

    move/from16 v23, v3

    move-object/from16 v17, v6

    move-object/from16 v16, v7

    move-object/from16 v21, v8

    move-object/from16 v22, v9

    move/from16 v19, v10

    move/from16 v20, v11

    move-object/from16 v18, v12

    invoke-direct/range {v15 .. v23}, Lpo/e;-><init>(Lpo/d;Lpo/a;Ljava/lang/String;ZILpo/c;Lpo/b;Z)V

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object v3

    new-instance v6, Lcom/google/android/gms/common/c;

    const-string v7, "auth_api_credentials_begin_sign_in"

    const-wide/16 v8, 0x8

    invoke-direct {v6, v7, v8, v9}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    filled-new-array {v6}, [Lcom/google/android/gms/common/c;

    move-result-object v6

    iput-object v6, v3, Le73/b;->c:Ljava/lang/Object;

    new-instance v6, Lhm/d;

    const/16 v7, 0xf

    invoke-direct {v6, v5, v15, v7}, Lhm/d;-><init>(Lcom/google/android/gms/common/api/h;Lvo/a;I)V

    iput-object v6, v3, Le73/b;->e:Ljava/lang/Object;

    iput-boolean v2, v3, Le73/b;->b:Z

    const/16 v2, 0x611

    iput v2, v3, Le73/b;->d:I

    invoke-virtual {v3}, Le73/b;->g()Lto/j0;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/google/android/gms/common/api/h;->doRead(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Lp5/e;

    const/4 v5, 0x0

    invoke-direct {v3, v0, v4, v5}, Lp5/e;-><init>(Ljava/lang/Object;II)V

    new-instance v4, Lmm/d;

    const/16 v5, 0x12

    invoke-direct {v4, v3, v5}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v4}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Lp5/d;

    const/4 v4, 0x3

    invoke-direct {v3, v0, v4}, Lp5/d;-><init>(Landroidx/credentials/playservices/HiddenActivity;I)V

    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object v5

    :cond_a
    if-nez v5, :cond_b

    const-string v2, "During begin sign in, params is null, nothing to launch for begin sign in"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_b
    :goto_0
    return-void

    :cond_c
    :goto_1
    const-string v2, "Activity handed an unsupported type"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1a4a0ecf -> :sswitch_3
        0xed33ea -> :sswitch_2
        0x4a4e227e -> :sswitch_1
        0x760d02f4 -> :sswitch_0
    .end sparse-switch
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidx.credentials.playservices.AWAITING_RESULT"

    iget-boolean v1, p0, Landroidx/credentials/playservices/HiddenActivity;->x:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method
