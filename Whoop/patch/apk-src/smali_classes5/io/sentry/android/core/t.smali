.class public final Lio/sentry/android/core/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/k1;
.implements Lio/sentry/android/core/s0;
.implements Lio/sentry/v0;
.implements Lio/sentry/logger/b;
.implements Lio/sentry/metrics/b;


# static fields
.field public static final x:Lio/sentry/android/core/t;

.field public static final y:Lio/sentry/android/core/t;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/android/core/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/sentry/android/core/t;-><init>(I)V

    sput-object v0, Lio/sentry/android/core/t;->x:Lio/sentry/android/core/t;

    new-instance v0, Lio/sentry/android/core/t;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/sentry/android/core/t;-><init>(I)V

    sput-object v0, Lio/sentry/android/core/t;->y:Lio/sentry/android/core/t;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/android/core/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    return-void
.end method

.method public b(Lio/sentry/q6;Lcd3/g;)Lio/sentry/logger/a;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/android/core/l;

    invoke-direct {v0, p1, p2}, Lio/sentry/android/core/l;-><init>(Lio/sentry/q6;Lcd3/g;)V

    return-object v0
.end method

.method public b(Lio/sentry/q6;Lcd3/g;)Lio/sentry/metrics/a;
    .locals 1

    .line 2
    new-instance v0, Lio/sentry/android/core/o;

    .line 3
    invoke-direct {v0, p1, p2}, Lcom/google/crypto/tink/internal/k0;-><init>(Lio/sentry/q6;Lcd3/g;)V

    .line 4
    sget-object p1, Lio/sentry/android/core/e0;->E:Lio/sentry/android/core/e0;

    .line 5
    invoke-virtual {p1, v0}, Lio/sentry/android/core/e0;->b(Lio/sentry/android/core/b0;)V

    return-object v0
.end method

.method public c()V
    .locals 1

    const v0, 0xf001

    invoke-static {v0}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    return-void
.end method

.method public varargs i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lio/sentry/android/core/t;->w:I

    packed-switch v0, :pswitch_data_0

    array-length v0, p4

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p3, p2}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    invoke-static {p3, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p3, p2}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_0
    array-length v0, p4

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3, p2}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    invoke-static {p3, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p3, p2}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    iget v0, p0, Lio/sentry/android/core/t;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/sentry/android/core/k;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const-string v1, "Sentry"

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    invoke-static {v1, p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    invoke-static {v1, p2, p3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_1
    invoke-static {v1, p2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_2
    invoke-static {v1, p2, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_3
    invoke-static {v1, p2, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void

    :pswitch_0
    const-string p1, "Sentry"

    invoke-static {p1, p2, p3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public varargs m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 8

    iget v0, p0, Lio/sentry/android/core/t;->w:I

    packed-switch v0, :pswitch_data_0

    array-length v0, p3

    const/4 v1, 0x5

    const/4 v2, 0x7

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x4

    const-string v7, "Sentry"

    if-nez v0, :cond_3

    sget-object p3, Lio/sentry/android/core/k;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    if-eq p1, v5, :cond_1

    if-eq p1, v4, :cond_2

    if-eq p1, v6, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v6

    :cond_2
    :goto_0
    invoke-static {v1, v7, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_3
    sget-object v0, Lio/sentry/android/core/k;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v5, :cond_5

    if-eq p1, v4, :cond_6

    if-eq p1, v6, :cond_4

    move v1, v3

    goto :goto_1

    :cond_4
    move v1, v2

    goto :goto_1

    :cond_5
    move v1, v6

    :cond_6
    :goto_1
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v7, p1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void

    :pswitch_0
    array-length p1, p3

    const-string v0, "Sentry"

    const/4 v1, 0x7

    if-nez p1, :cond_7

    invoke-static {v1, v0, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_7
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v0, p1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public o(Lio/sentry/n5;)Z
    .locals 0

    iget p1, p0, Lio/sentry/android/core/t;->w:I

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x1

    return p1

    :pswitch_0
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
