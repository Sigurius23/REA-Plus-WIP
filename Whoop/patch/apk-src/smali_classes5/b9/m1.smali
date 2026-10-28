.class public final Lb9/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lto/n;


# instance fields
.field public final synthetic w:I

.field public x:Z


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb9/m1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lx8/p;I)V
    .locals 0

    iput p4, p0, Lb9/m1;->w:I

    packed-switch p4, :pswitch_data_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance p4, Lu00/e;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p4, p1}, Lu00/e;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 5
    invoke-virtual {p3, p2, p1}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p4, Lkr/e;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p4, p1}, Lkr/e;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 8
    invoke-virtual {p3, p2, p1}, Lx8/p;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lx8/r;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ly8/n;Ly8/p;)V
    .locals 7

    const/16 v0, 0x8

    iput v0, p0, Lb9/m1;->w:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iget v0, p2, Ly8/p;->a:I

    iget-object p2, p2, Ly8/p;->b:Ljava/nio/ByteBuffer;

    const/4 v1, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x1

    if-eq v0, v1, :cond_1

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v4

    :goto_1
    invoke-static {v0}, Lva3/g;->d(Z)V

    const/4 v0, 0x4

    .line 11
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v1, v0, [B

    .line 12
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 13
    new-instance p2, Llo/s;

    const/4 v5, 0x5

    const/4 v6, 0x0

    .line 14
    invoke-direct {p2, v1, v0, v5, v6}, Llo/s;-><init>([BIIB)V

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-static {p1}, Ly8/n;->a(Z)V

    .line 16
    invoke-virtual {p2}, Llo/s;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 17
    iput-boolean v2, p0, Lb9/m1;->x:Z

    goto :goto_6

    :cond_2
    const/4 p1, 0x2

    .line 18
    invoke-virtual {p2, p1}, Llo/s;->i(I)I

    move-result v0

    .line 19
    invoke-virtual {p2}, Llo/s;->h()Z

    move-result v1

    const/4 v5, 0x0

    .line 20
    invoke-static {v5}, Ly8/n;->a(Z)V

    if-nez v1, :cond_3

    .line 21
    iput-boolean v4, p0, Lb9/m1;->x:Z

    goto :goto_6

    :cond_3
    if-eq v0, v3, :cond_5

    if-nez v0, :cond_4

    goto :goto_2

    .line 22
    :cond_4
    invoke-virtual {p2}, Llo/s;->h()Z

    move-result v1

    goto :goto_3

    :cond_5
    :goto_2
    move v1, v4

    .line 23
    :goto_3
    invoke-virtual {p2}, Llo/s;->s()V

    const/4 v5, 0x0

    xor-int/2addr v5, v4

    .line 24
    invoke-static {v5}, Ly8/n;->a(Z)V

    .line 25
    invoke-virtual {p2}, Llo/s;->h()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, 0x0

    xor-int/2addr v5, v4

    .line 26
    invoke-static {v5}, Ly8/n;->a(Z)V

    .line 27
    invoke-virtual {p2}, Llo/s;->s()V

    :cond_6
    const/4 v5, 0x0

    .line 28
    invoke-static {v5}, Ly8/n;->a(Z)V

    if-eq v0, v3, :cond_7

    .line 29
    invoke-virtual {p2}, Llo/s;->s()V

    :cond_7
    const/4 v5, 0x0

    .line 30
    invoke-virtual {p2, v5}, Llo/s;->t(I)V

    if-eq v0, p1, :cond_8

    if-eqz v0, :cond_8

    if-nez v1, :cond_8

    .line 31
    invoke-virtual {p2, v3}, Llo/s;->t(I)V

    :cond_8
    if-eq v0, v3, :cond_a

    if-nez v0, :cond_9

    goto :goto_4

    :cond_9
    const/16 p1, 0x8

    .line 32
    invoke-virtual {p2, p1}, Llo/s;->i(I)I

    move-result p1

    goto :goto_5

    :cond_a
    :goto_4
    const/16 p1, 0xff

    :goto_5
    if-eqz p1, :cond_b

    move v2, v4

    .line 33
    :cond_b
    iput-boolean v2, p0, Lb9/m1;->x:Z

    :goto_6
    return-void
.end method

.method public synthetic constructor <init>(ZI)V
    .locals 0

    .line 2
    iput p2, p0, Lb9/m1;->w:I

    iput-boolean p1, p0, Lb9/m1;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lb9/m1;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Lb9/m1;->x:Z

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    iget-object p1, p1, Lnp/i;->A:Lcd3/g;

    iget-object v1, p1, Lcd3/g;->E:Ljava/lang/Object;

    check-cast v1, Laj/c;

    iget-object v2, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v2, Lnp/i;

    invoke-virtual {v2}, Luo/c;->c()V

    invoke-virtual {v1}, Laj/c;->a0()Lnp/e;

    move-result-object v1

    invoke-virtual {v1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v2

    invoke-static {v2, v0}, Lnp/l;->a(Landroid/os/Parcel;Z)V

    const/16 v3, 0xc

    invoke-virtual {v1, v2, v3}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    iput-boolean v0, p1, Lcd3/g;->w:Z

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ly00/c8;Ly00/p;ZLkotlin/jvm/functions/Function1;)Le10/d;
    .locals 3

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ly00/l3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Ly00/f3;->c:Ljava/util/regex/Pattern;

    sget-object v0, Ly00/f3;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lux/c;

    move-object v2, p2

    check-cast v2, Ly00/l3;

    invoke-direct {v0, p1, v2, p3}, Lux/c;-><init>(Ljava/lang/String;Ly00/l3;Ly00/p;)V

    goto :goto_0

    :cond_0
    instance-of p3, p2, Ly00/g6;

    if-eqz p3, :cond_1

    sget-object p3, Ly00/d6;->c:Ljava/util/regex/Pattern;

    sget-object p3, Ly00/d6;->c:Ljava/util/regex/Pattern;

    invoke-virtual {p3, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/regex/Matcher;->matches()Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance v0, Lux/d;

    move-object p3, p2

    check-cast p3, Ly00/g6;

    invoke-direct {v0, p1, p3}, Lux/d;-><init>(Ljava/lang/String;Ly00/g6;)V

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    new-instance p3, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;

    invoke-direct {p3, p1, p2}, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;-><init>(Ljava/lang/String;Ly00/c8;)V

    const-string p1, "message"

    iget-object p2, p3, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidClientSecretException;->F:Ljava/lang/String;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Le10/b;

    iget-boolean p4, p0, Lb9/m1;->x:Z

    if-eqz p4, :cond_2

    const p2, 0x7f14101c

    invoke-static {p2}, Ls4/i;->h(I)Lzy/b;

    move-result-object p2

    goto :goto_1

    :cond_2
    invoke-static {p2}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p2

    :goto_1
    sget-object p4, Le10/t;->a:Le10/t;

    invoke-direct {p1, p3, p2, p4}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p1

    :cond_3
    invoke-interface {p5, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly00/s;

    new-instance p2, Ln10/d0;

    invoke-direct {p2, p1}, Ln10/d0;-><init>(Ly00/s;)V

    sget-object p1, Ln10/c0;->x:Ln10/c0;

    if-eqz p4, :cond_4

    move-object v1, p1

    :cond_4
    new-instance p1, Le10/c;

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3, v1}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    return-object p1
.end method

.method public declared-synchronized c()Z
    .locals 1

    iget v0, p0, Lb9/m1;->w:I

    monitor-enter p0

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-boolean v0, p0, Lb9/m1;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lb9/m1;->x:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    :goto_0
    return v0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :pswitch_0
    :try_start_3
    iget-boolean v0, p0, Lb9/m1;->x:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_1

    monitor-exit p0

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :try_start_4
    iput-boolean v0, p0, Lb9/m1;->x:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    :goto_1
    return v0

    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public d(Z)V
    .locals 1

    iget v0, p0, Lb9/m1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lb9/m1;->x:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lb9/m1;->x:Z

    :goto_0
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lb9/m1;->x:Z

    if-ne v0, p1, :cond_1

    goto :goto_1

    :cond_1
    iput-boolean p1, p0, Lb9/m1;->x:Z

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
