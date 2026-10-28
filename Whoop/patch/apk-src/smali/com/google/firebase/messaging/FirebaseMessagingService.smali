.class public Lcom/google/firebase/messaging/FirebaseMessagingService;
.super Lzt/h;
.source "SourceFile"


# static fields
.field private static final G:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private F:Lso/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/ArrayDeque;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    sput-object v0, Lcom/google/firebase/messaging/FirebaseMessagingService;->G:Ljava/util/Queue;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lzt/h;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    invoke-static {}, Lzt/q;->u()Lzt/q;

    move-result-object p1

    iget-object p1, p1, Lzt/q;->E:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    return-object p1
.end method

.method public d(Landroid/content/Intent;)V
    .locals 8

    const-string v0, "FirebaseMessaging"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.android.c2dm.intent.RECEIVE"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "com.google.firebase.messaging.NEW_TOKEN"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "token"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->j(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown intent action: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    :goto_0
    const-string v1, "google.message_id"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    sget-object v3, Lcom/google/firebase/messaging/FirebaseMessagingService;->G:Ljava/util/Queue;

    invoke-interface {v3, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v0, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_f

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Received duplicate message: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_4

    :cond_4
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v6

    const/16 v7, 0xa

    if-lt v6, v7, :cond_5

    invoke-interface {v3}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    :cond_5
    invoke-interface {v3, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    :goto_1
    const-string v2, "message_type"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_6

    const-string v2, "gcm"

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v6, -0x1

    sparse-switch v3, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v3, "send_event"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_2

    :cond_7
    move v6, v5

    goto :goto_2

    :sswitch_1
    const-string v3, "send_error"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_2

    :cond_8
    const/4 v6, 0x2

    goto :goto_2

    :sswitch_2
    const-string v3, "gcm"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_2

    :cond_9
    const/4 v6, 0x1

    goto :goto_2

    :sswitch_3
    const-string v3, "deleted_messages"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_2

    :cond_a
    move v6, v4

    :goto_2
    packed-switch v6, :pswitch_data_0

    const-string v3, "Received message with unknown type: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/messaging/FirebaseMessagingService;->i(Ljava/lang/String;)V

    goto/16 :goto_4

    :pswitch_1
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    const-string v0, "message_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_b
    new-instance v2, Lcom/google/firebase/messaging/SendException;

    const-string v3, "error"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/firebase/messaging/SendException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/google/firebase/messaging/FirebaseMessagingService;->k(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_4

    :pswitch_2
    invoke-static {p1}, Lva3/l;->o(Landroid/content/Intent;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_c

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_c
    const-string v2, "androidx.content.wakelockid"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    invoke-static {v0}, Lzd3/x;->n(Landroid/os/Bundle;)Z

    move-result v2

    if-eqz v2, :cond_e

    new-instance v2, Lzd3/x;

    invoke-direct {v2, v0}, Lzd3/x;-><init>(Landroid/os/Bundle;)V

    new-instance v3, Lap/b;

    const-string v6, "Firebase-Messaging-Network-Io"

    invoke-direct {v3, v6}, Lap/b;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    new-instance v6, Lzt/g;

    invoke-direct {v6, p0, v2, v3}, Lzt/g;-><init>(Lcom/google/firebase/messaging/FirebaseMessagingService;Lzd3/x;Ljava/util/concurrent/ExecutorService;)V

    :try_start_0
    invoke-virtual {v6}, Lzt/g;->a()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_d

    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    goto :goto_4

    :cond_d
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    invoke-static {p1}, Lva3/l;->q(Landroid/content/Intent;)Z

    move-result v2

    if-eqz v2, :cond_e

    const-string v2, "_nf"

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-static {v3, v2}, Lva3/l;->p(Landroid/os/Bundle;Ljava/lang/String;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    throw p1

    :cond_e
    :goto_3
    new-instance v2, Lzt/p;

    invoke-direct {v2, v0}, Lzt/p;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p0, v2}, Lcom/google/firebase/messaging/FirebaseMessagingService;->h(Lzt/p;)V

    goto :goto_4

    :pswitch_3
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;->g()V

    :cond_f
    :goto_4
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->F:Lso/b;

    if-nez v0, :cond_10

    new-instance v0, Lso/b;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lso/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->F:Lso/b;

    :cond_10
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessagingService;->F:Lso/b;

    new-instance v2, Lso/a;

    invoke-direct {v2, p1}, Lso/a;-><init>(Landroid/content/Intent;)V

    iget-object p1, v0, Lso/b;->c:Lce3/a0;

    invoke-virtual {p1}, Lce3/a0;->b()I

    move-result p1

    const v3, 0xdedfaa0

    if-lt p1, v3, :cond_12

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2}, Lso/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lso/a;->f()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_11

    const-string v2, "google.product_id"

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_11
    iget-object v0, v0, Lso/b;->b:Landroid/content/Context;

    invoke-static {v0}, Lso/o;->b(Landroid/content/Context;)Lso/o;

    move-result-object v0

    new-instance v1, Lso/n;

    monitor-enter v0

    :try_start_1
    iget v2, v0, Lso/o;->a:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lso/o;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    invoke-direct {v1, v2, v5, p1, v4}, Lso/n;-><init>(IILandroid/os/Bundle;I)V

    invoke-virtual {v0, v1}, Lso/o;->c(Lso/n;)Lcq/u;

    return-void

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_12
    new-instance p1, Ljava/io/IOException;

    const-string v0, "SERVICE_NOT_AVAILABLE"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->c(Ljava/lang/Exception;)Lcq/u;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7aedf14e -> :sswitch_3
        0x18f11 -> :sswitch_2
        0x308f3e91 -> :sswitch_1
        0x3090df23 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public h(Lzt/p;)V
    .locals 0

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method
