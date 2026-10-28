.class public final synthetic Li5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lme3/b;
.implements Lbh3/g;
.implements Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;
.implements Lio/sentry/y1;
.implements Lio/sentry/util/e;
.implements Lio/sentry/util/network/d;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Li5/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/okhttp/d;)V
    .locals 0

    .line 2
    const/16 p1, 0x1d

    iput p1, p0, Li5/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/util/LinkedHashMap;
    .locals 1

    check-cast p1, Lud3/o0;

    const-string v0, "req"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lud3/o0;->c:Lud3/d0;

    invoke-static {p1}, Lio/sentry/okhttp/d;->c(Lud3/d0;)Ljava/util/LinkedHashMap;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Li92/s;->l(Ljava/lang/Throwable;)Ljava/lang/Exception;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Li5/c;->w:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/16 v1, 0x80

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    invoke-static {p1}, Lio/sentry/android/core/j0;->a(Landroid/content/Context;)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    return-object p1

    :pswitch_1
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v1, v0, Landroid/content/pm/ApplicationInfo;->labelRes:I

    if-nez v1, :cond_1

    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_2
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :pswitch_3
    invoke-static {p1}, Lio/sentry/android/core/j0;->b(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public j()Ljava/lang/Object;
    .locals 13

    iget v0, p0, Li5/c;->w:I

    sparse-switch v0, :sswitch_data_0

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {}, Lio/sentry/clientreport/d;->values()[Lio/sentry/clientreport/d;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    invoke-static {}, Lio/sentry/m;->values()[Lio/sentry/m;

    move-result-object v6

    array-length v7, v6

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_0

    aget-object v9, v6, v8

    new-instance v10, Lio/sentry/clientreport/c;

    invoke-virtual {v5}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9}, Lio/sentry/m;->getCategory()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v10, v11, v9}, Lio/sentry/clientreport/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v11, 0x0

    invoke-direct {v9, v11, v12}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    invoke-virtual {v0, v10, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :sswitch_0
    new-instance v0, Ljava/util/Timer;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Z)V

    return-object v0

    :sswitch_1
    new-instance v0, Landroidx/core/app/FrameMetricsAggregator;

    invoke-direct {v0}, Landroidx/core/app/FrameMetricsAggregator;-><init>()V

    return-object v0

    :sswitch_2
    invoke-static {}, Lio/sentry/util/k;->a()Lio/sentry/util/j;

    move-result-object v0

    const/16 v1, 0x8

    new-array v2, v1, [B

    invoke-virtual {v0, v2}, Lio/sentry/util/j;->b([B)V

    const/4 v0, 0x6

    aget-byte v3, v2, v0

    and-int/lit8 v3, v3, 0xf

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    or-int/lit8 v3, v3, 0x40

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    const-wide/16 v3, 0x0

    const/4 v0, 0x0

    :goto_2
    if-ge v0, v1, :cond_2

    shl-long/2addr v3, v1

    aget-byte v5, v2, v0

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    or-long/2addr v3, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    new-array v0, v0, [C

    invoke-static {v0, v3, v4}, Lio/sentry/util/n;->a([CJ)V

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    return-object v1

    :sswitch_3
    new-instance v0, Lio/sentry/q4;

    invoke-direct {v0}, Lio/sentry/q4;-><init>()V

    return-object v0

    :sswitch_4
    invoke-static {}, Lio/sentry/q6;->empty()Lio/sentry/q6;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_4
        0xd -> :sswitch_3
        0xe -> :sswitch_2
        0xf -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public log(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Li92/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onPushNotificationReceived(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/ChatClient;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
