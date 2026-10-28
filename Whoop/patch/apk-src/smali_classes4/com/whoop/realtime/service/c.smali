.class public abstract Lcom/whoop/realtime/service/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/service/c$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    new-instance v0, Lcom/whoop/realtime/service/c$a;

    invoke-direct {v0, p0}, Lcom/whoop/realtime/service/c$a;-><init>(Landroid/content/Context;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/whoop/realtime/service/c$a;->r(Lcom/whoop/realtime/service/c$a;J)V

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-static {v0, p1, p2}, Lcom/whoop/realtime/service/c$a;->q(Lcom/whoop/realtime/service/c$a;J)V

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/realtime/service/c$a;->f()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public static b(Landroid/content/Context;)Landroid/content/IntentFilter;
    .locals 1

    new-instance p0, Landroid/content/IntentFilter;

    const-string v0, "com.whoop.realTimeActivityFinished"

    invoke-direct {p0, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public static c(Landroid/content/Context;ILp92/e;J)Ljava/lang/String;
    .locals 3

    new-instance v0, Lorg/joda/time/LocalDateTime;

    invoke-virtual {p2}, Lp92/e;->c()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lorg/joda/time/LocalDateTime;-><init>(J)V

    new-instance v1, Lorg/joda/time/LocalDateTime;

    invoke-direct {v1, p3, p4}, Lorg/joda/time/LocalDateTime;-><init>(J)V

    invoke-static {p1}, Lcom/whoop/realtime/service/c;->d(I)I

    move-result p1

    invoke-virtual {p2}, Lp92/e;->a()Llm2/b;

    move-result-object p2

    invoke-interface {p2, p0}, Llm2/b;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0}, Lcom/whoop/ui/f;->j(Lorg/joda/time/LocalDateTime;)Ljava/lang/String;

    move-result-object p3

    invoke-static {v1}, Lcom/whoop/ui/f;->j(Lorg/joda/time/LocalDateTime;)Ljava/lang/String;

    move-result-object p4

    filled-new-array {p2, p3, p4}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static d(I)I
    .locals 1

    const/16 v0, 0xb

    if-eq p0, v0, :cond_2

    const/16 v0, 0xc

    if-eq p0, v0, :cond_1

    const/16 v0, 0x190

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget p0, Lk52/f;->m:I

    return p0

    :cond_1
    sget p0, Lk52/f;->k:I

    return p0

    :cond_2
    sget p0, Lk52/f;->g:I

    return p0
.end method

.method public static e(Landroid/content/Context;I)Ljava/lang/String;
    .locals 0

    invoke-static {p1}, Lcom/whoop/realtime/service/c;->f(I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static f(I)I
    .locals 1

    const/16 v0, 0xb

    if-eq p0, v0, :cond_2

    const/16 v0, 0xc

    if-eq p0, v0, :cond_1

    const/16 v0, 0x190

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget p0, Lk52/f;->n:I

    return p0

    :cond_1
    sget p0, Lk52/f;->l:I

    return p0

    :cond_2
    sget p0, Lk52/f;->h:I

    return p0
.end method

.method public static g(Lod1/k;)I
    .locals 1

    invoke-virtual {p0}, Lod1/k;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p0}, Lod1/k;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p0, 0xb

    return p0

    :cond_1
    invoke-virtual {p0}, Lod1/k;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p0, 0xc

    return p0

    :cond_2
    invoke-virtual {p0}, Lod1/k;->a()Z

    move-result p0

    if-eqz p0, :cond_3

    const/16 p0, 0x190

    return p0

    :cond_3
    const/4 p0, 0x5

    return p0
.end method

.method public static h(Landroid/content/Context;Landroid/content/Intent;)Lcom/whoop/realtime/service/c$a;
    .locals 2

    new-instance v0, Lcom/whoop/realtime/service/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/realtime/service/c$a;-><init>(Landroid/content/Context;Landroid/content/Intent;I)V

    return-object v0
.end method
