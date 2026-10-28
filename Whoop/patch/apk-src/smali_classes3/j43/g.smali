.class public final Lj43/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ll83/p;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lj43/g;->a:I

    packed-switch p1, :pswitch_data_0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const-string p1, "ServiceIntentBuilder"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lj43/g;->b:Ll83/p;

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string p1, "CallServiceLifecycleManager"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lj43/g;->b:Ll83/p;

    return-void

    .line 8
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const-string p1, "ServiceNotificationRetriever"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lj43/g;->b:Ll83/p;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lj43/g;->a:I

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lal0/f;

    const/4 v1, 0x6

    invoke-direct {v0, p0, p1, v1}, Lal0/f;-><init>(Ljava/lang/Object;Landroid/content/Context;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lj43/g;->b:Ll83/p;

    return-void
.end method

.method public static f(Lm40/i;Lb9/b;Lm40/h;)Z
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/BufferedOutputStream;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lb9/b;->r(I)Ljava/io/OutputStream;

    move-result-object v2

    const/16 v3, 0x2000

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v2, p0, Lm40/i;->a:Lm40/h;

    invoke-interface {v2}, Lm40/h;->getValue()Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance v3, Ljava/io/OutputStreamWriter;

    const/4 v4, 0x1

    invoke-virtual {p1, v4}, Lb9/b;->r(I)Ljava/io/OutputStream;

    move-result-object p1

    sget-object v5, Llu/f;->b:Ljava/nio/charset/Charset;

    invoke-direct {v3, p1, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v3, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v3}, Llu/f;->a(Ljava/io/Closeable;)V

    sget-object p1, Lm40/f;->x:Lm40/f;

    if-ne p2, p1, :cond_0

    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_0

    :cond_0
    sget-object p1, Lm40/f;->y:Lm40/f;

    if-ne p2, p1, :cond_1

    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_0

    :cond_1
    sget-object p1, Lm40/f;->z:Lm40/f;

    if-ne p2, p1, :cond_5

    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    :goto_0
    iget-object p0, p0, Lm40/i;->b:Landroid/graphics/Bitmap;

    sget-object p2, Lm40/c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p2, p2, v0

    const/16 v0, 0x50

    if-eq p2, v4, :cond_4

    const/4 v2, 0x2

    if-eq p2, v2, :cond_3

    const/4 v2, 0x3

    if-ne p2, v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected compress format: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const/16 v0, 0x64

    :cond_4
    :goto_1
    invoke-virtual {p0, p1, v0, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    return p0

    :catchall_0
    move-exception p0

    move-object v0, v1

    goto :goto_3

    :cond_5
    :try_start_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-interface {p2}, Lm40/h;->getValue()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Unexpected image type: "

    invoke-static {p2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_1
    move-exception p0

    move-object v0, v3

    goto :goto_2

    :catchall_2
    move-exception p0

    :goto_2
    invoke-static {v0}, Llu/f;->a(Ljava/io/Closeable;)V

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_3
    move-exception p0

    :goto_3
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    :cond_6
    throw p0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lj43/i;)Landroid/content/Intent;
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lj43/i;->b:Ljava/lang/String;

    iget-object v1, p2, Lj43/i;->d:Lj43/c;

    iget-object v1, v1, Lj43/c;->d:Ljava/lang/Class;

    iget-object v2, p0, Lj43/g;->b:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb23/k;

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->z:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[buildStartIntent], Resolved service class: "

    invoke-static {v1, v3}, Ld;->m(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v2, v4, v5, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "io.getstream.video.android.intent-extra.call_cid"

    iget-object v1, p2, Lj43/i;->a:Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {v2, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result p1

    const-string v1, "io.getstream.video.android.core.notifications.internal.service.CallService.call_trigger"

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p1, "outgoing_call"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v2

    :sswitch_1
    const-string p1, "ongoing_call"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v2

    :sswitch_2
    const-string p1, "remove_call"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {v2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v2

    :sswitch_3
    const-string p1, "incoming_call"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "io.getstream.video.android.intent-extra.call_displayname"

    iget-object p2, p2, Lj43/i;->c:Ljava/lang/String;

    invoke-virtual {v2, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object v2

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unknown "

    const-string v1, ", must be one of: incoming_call, outgoing_call, ongoing_call"

    invoke-static {p2, v0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x310b9d29 -> :sswitch_3
        -0x118712c7 -> :sswitch_2
        -0x11069f5e -> :sswitch_1
        0x54f4351 -> :sswitch_0
    .end sparse-switch
.end method

.method public b(Landroid/content/Context;Lj43/j;)Landroid/content/Intent;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "context"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Lj43/j;->a:Lt23/c0;

    iget-object v4, v0, Lj43/g;->b:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb23/k;

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->y:Lb23/g;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    const/4 v9, 0x0

    if-eqz v6, :cond_0

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    const-string v6, "[buildStopIntent]"

    invoke-interface {v5, v7, v8, v6, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v2, v2, Lj43/j;->b:Lj43/c;

    iget-object v2, v2, Lj43/c;->d:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Lj43/g;->d(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_5

    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb23/k;

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v7, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/content/ComponentName;->getShortClassName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v9

    :goto_0
    if-eqz v3, :cond_2

    iget-object v6, v3, Lt23/c0;->v:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v6, v9

    :goto_1
    const-string v8, "[buildStopIntent], class:"

    const-string v10, ", call_id: "

    invoke-static {v8, v2, v10, v6}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v4, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    if-eqz v3, :cond_4

    new-instance v10, Lio/getstream/video/android/model/StreamCallId;

    iget-object v11, v3, Lt23/c0;->b:Ljava/lang/String;

    iget-object v12, v3, Lt23/c0;->c:Ljava/lang/String;

    iget-object v13, v3, Lt23/c0;->v:Ljava/lang/String;

    const/16 v15, 0x8

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lio/getstream/video/android/model/StreamCallId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "io.getstream.video.android.intent-extra.call_cid"

    invoke-virtual {v5, v1, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_4
    const-string v1, "io.getstream.video.android.core.stop_service"

    const/4 v2, 0x1

    invoke-virtual {v5, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v1

    return-object v1

    :cond_5
    return-object v9
.end method

.method public c()Lb23/k;
    .locals 1

    iget v0, p0, Lj43/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj43/g;->b:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lj43/g;->b:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Landroid/content/Context;Ljava/lang/Class;)Z
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serviceClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    :try_start_0
    const-string v1, "activity"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type android.app.ActivityManager"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/ActivityManager;

    const v1, 0x7fffffff

    invoke-virtual {p1, v1}, Landroid/app/ActivityManager;->getRunningServices(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager$RunningServiceInfo;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v1, Landroid/app/ActivityManager$RunningServiceInfo;->service:Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lj43/g;->b:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "[isServiceRunning], Service is running: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v1, v3, p1, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj43/g;->b:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "[isServiceRunning], Service is NOT running: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v1, v3, p1, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    const/4 p1, 0x0

    return p1

    :goto_0
    sget-object p2, Lb23/i;->a:Lb23/i;

    sget-object p2, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    const-string v2, "SafeCall"

    invoke-interface {p2, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Exception occurred: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v1, v2, v3, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return v0
.end method

.method public e(Ljava/lang/String;Lm40/i;)V
    .locals 7

    const-string v0, "ERROR on: image put on disk cache "

    const-string v1, "key"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    iget-object v5, p0, Lj43/g;->b:Ll83/p;

    invoke-virtual {v5}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llu/c;

    if-eqz v5, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Llu/c;->k(Ljava/lang/String;)Laj/a;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_0
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Laj/a;->close()V

    goto :goto_4

    :goto_2
    throw p1

    :goto_3
    const-string v5, "stripe_image_disk_cache"

    const-string v6, "error reading from cache"

    invoke-static {v5, v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move v5, v4

    :cond_2
    :goto_4
    if-eqz v5, :cond_3

    goto/16 :goto_7

    :cond_3
    :try_start_1
    iget-object p1, p0, Lj43/g;->b:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llu/c;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v1}, Llu/c;->i(Ljava/lang/String;)Lb9/b;

    move-result-object v3

    :cond_4
    if-nez v3, :cond_5

    goto/16 :goto_7

    :cond_5
    iget-object p1, p2, Lm40/i;->a:Lm40/h;

    invoke-static {p2, v3, p1}, Lj43/g;->f(Lm40/i;Lb9/b;Lm40/h;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lj43/g;->b:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llu/c;

    if-eqz p1, :cond_7

    monitor-enter p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object p2, p1, Llu/c;->I:Ljava/io/BufferedWriter;

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Llu/c;->p0()V

    iget-object p2, p1, Llu/c;->I:Ljava/io/BufferedWriter;

    invoke-virtual {p2}, Ljava/io/Writer;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_6

    :catchall_1
    move-exception p2

    goto :goto_5

    :cond_6
    :try_start_4
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "cache is closed"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :goto_5
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw p2

    :cond_7
    :goto_6
    iget-object p1, v3, Lb9/b;->E:Ljava/lang/Object;

    check-cast p1, Llu/c;

    iget-boolean p2, v3, Lb9/b;->x:Z

    if-eqz p2, :cond_8

    invoke-static {p1, v3, v4}, Llu/c;->b(Llu/c;Lb9/b;Z)V

    iget-object p2, v3, Lb9/b;->y:Ljava/lang/Object;

    check-cast p2, Llu/b;

    iget-object p2, p2, Llu/b;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Llu/c;->b0(Ljava/lang/String;)V

    goto :goto_7

    :cond_8
    invoke-static {p1, v3, v2}, Llu/c;->b(Llu/c;Lb9/b;Z)V

    goto :goto_7

    :cond_9
    invoke-virtual {v3}, Lb9/b;->a()V

    const-string p1, "stripe_image_disk_cache"

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_7

    :catch_1
    const-string p1, "stripe_image_disk_cache"

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "ERROR on: image put on disk cache "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v3, :cond_a

    :try_start_6
    invoke-virtual {v3}, Lb9/b;->a()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_a
    :goto_7
    return-void
.end method
