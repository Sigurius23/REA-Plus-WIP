.class public final Lr03/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0003R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lr03/a;",
        "Lof3/a;",
        "<init>",
        "()V",
        "Lic/a0;",
        "a",
        "()Lic/a0;",
        "Lic/e;",
        "b",
        "()Lic/e;",
        "Lic/k0;",
        "c",
        "()Lic/k0;",
        "Ll83/a0;",
        "d",
        "e",
        "Ltr2/n;",
        "w",
        "Ltr2/n;",
        "log",
        "Lic/p0;",
        "x",
        "Lic/p0;",
        "workManagerInstance",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Ltr2/n;

.field private final x:Lic/p0;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "ConsolePacketUploadScheduler"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lr03/a;->w:Ltr2/n;

    new-instance v0, Lvf3/c;

    const-string v1, "workManagerInstance"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v1

    iget-object v1, v1, Lnf3/a;->a:Lwf3/a;

    iget-object v1, v1, Lwf3/a;->d:Lxf3/c;

    const-class v2, Lic/p0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lic/p0;

    iput-object v0, p0, Lr03/a;->x:Lic/p0;

    return-void
.end method

.method private final a()Lic/a0;
    .locals 5

    new-instance v0, Lic/z;

    const-class v1, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;

    invoke-direct {v0, v1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    invoke-direct {p0}, Lr03/a;->b()Lic/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    sget-object v1, Lic/a;->x:Lic/a;

    const-wide/16 v2, 0x2710

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, v4}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/a0;

    return-object v0
.end method

.method private final b()Lic/e;
    .locals 13

    new-instance v0, Lrc/e;

    sget-object v0, Lic/x;->w:Lic/x;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v3, Lic/x;->x:Lic/x;

    new-instance v2, Lrc/e;

    const/4 v1, 0x0

    invoke-direct {v2, v1}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v12

    new-instance v1, Lic/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, -0x1

    move-wide v10, v8

    invoke-direct/range {v1 .. v12}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    return-object v1
.end method

.method private final c()Lic/k0;
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v1, Lic/j0;

    const-class v2, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;

    const-wide/32 v3, 0xdbba0

    invoke-direct {v1, v2, v3, v4, v0}, Lic/j0;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0}, Lr03/a;->b()Lic/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v1

    check-cast v1, Lic/j0;

    sget-object v2, Lic/a;->x:Lic/a;

    const-wide/16 v3, 0x2710

    invoke-virtual {v1, v2, v3, v4, v0}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/k0;

    return-object v0
.end method


# virtual methods
.method public final d()V
    .locals 4

    invoke-direct {p0}, Lr03/a;->a()Lic/a0;

    move-result-object v0

    iget-object v1, p0, Lr03/a;->x:Lic/p0;

    const-string v2, "ONE_TIME_CONSOLE_PACKET_UPLOAD"

    sget-object v3, Lic/l;->y:Lic/l;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    iget-object v0, p0, Lr03/a;->w:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Enqueued one time work request"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public final e()V
    .locals 4

    invoke-direct {p0}, Lr03/a;->c()Lic/k0;

    move-result-object v0

    iget-object v1, p0, Lr03/a;->x:Lic/p0;

    const-string v2, "PERIODIC_CONSOLE_PACKET_UPLOAD"

    sget-object v3, Lic/k;->w:Lic/k;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    iget-object v0, p0, Lr03/a;->w:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Enqueued PeriodicWorkRequest to upload console event packets from strap"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method
