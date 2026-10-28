.class final Lx82/i$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx82/i;->q(B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.StrapBatteryMonitor$checkNotification$1"
    f = "StrapBatteryMonitor.kt"
    l = {
        0x139
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lx82/i;

.field final synthetic y:B


# direct methods
.method public constructor <init>(Lx82/i;BLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx82/i;",
            "B",
            "Lq83/d<",
            "-",
            "Lx82/i$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx82/i$b;->x:Lx82/i;

    iput-byte p2, p0, Lx82/i$b;->y:B

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lx82/i$b;

    iget-object v0, p0, Lx82/i$b;->x:Lx82/i;

    iget-byte v1, p0, Lx82/i$b;->y:B

    invoke-direct {p1, v0, v1, p2}, Lx82/i$b;-><init>(Lx82/i;BLq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lx82/i$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx82/i$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx82/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx82/i$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx82/i$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx82/i$b;->x:Lx82/i;

    invoke-static {p1}, Lx82/i;->j(Lx82/i;)Lb12/b;

    move-result-object p1

    iget-byte v1, p0, Lx82/i$b;->y:B

    iput v2, p0, Lx82/i$b;->w:I

    invoke-interface {p1, v1, p0}, Lb12/b;->a(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lb12/d;

    iget-object v0, p0, Lx82/i$b;->x:Lx82/i;

    invoke-static {v0}, Lx82/i;->k(Lx82/i;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "lowBatteryNotification"

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lb12/d;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v0, p0, Lx82/i$b;->x:Lx82/i;

    invoke-static {v0}, Lx82/i;->k(Lx82/i;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lb12/d;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v0, p0, Lx82/i$b;->x:Lx82/i;

    invoke-static {v0}, Lx82/i;->k(Lx82/i;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v3, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v3}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {p1}, Lb12/d;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v3

    invoke-virtual {p1}, Lb12/d;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    iget-object v0, p0, Lx82/i$b;->x:Lx82/i;

    invoke-static {v0}, Lx82/i;->i(Lx82/i;)Lz82/i;

    move-result-object v0

    iget-byte v3, p0, Lx82/i$b;->y:B

    invoke-virtual {p1}, Lb12/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lz82/i;->a(BLjava/lang/String;)V

    iget-object p1, p0, Lx82/i$b;->x:Lx82/i;

    invoke-static {p1}, Lx82/i;->n(Lx82/i;)Landroid/app/NotificationManager;

    move-result-object p1

    iget-object v0, p0, Lx82/i$b;->x:Lx82/i;

    invoke-static {v0}, Lx82/i;->m(Lx82/i;)I

    move-result v0

    iget-object v3, p0, Lx82/i$b;->x:Lx82/i;

    invoke-static {v3}, Lx82/i;->k(Lx82/i;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method
