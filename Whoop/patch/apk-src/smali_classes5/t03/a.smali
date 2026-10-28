.class public final Lt03/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lt03/a;",
        "Lbc3/c0;",
        "Lic/p0;",
        "workManager",
        "Lin2/d;",
        "dispatcherFactory",
        "Lup0/a;",
        "workManagerUtil",
        "<init>",
        "(Lic/p0;Lin2/d;Lup0/a;)V",
        "Lic/e;",
        "c",
        "()Lic/e;",
        "Lic/k0;",
        "d",
        "()Lic/k0;",
        "Ll83/a0;",
        "e",
        "()V",
        "w",
        "Lic/p0;",
        "x",
        "Lin2/d;",
        "y",
        "Lup0/a;",
        "",
        "z",
        "J",
        "repeatIntervalMinutes",
        "Lbc3/u;",
        "E",
        "Lbc3/u;",
        "job",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
        "app_prodStandardRelease"
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
.field private final E:Lbc3/u;

.field private final w:Lic/p0;

.field private final x:Lin2/d;

.field private final y:Lup0/a;

.field private final z:J


# direct methods
.method public constructor <init>(Lic/p0;Lin2/d;Lup0/a;)V
    .locals 1

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManagerUtil"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt03/a;->w:Lic/p0;

    iput-object p2, p0, Lt03/a;->x:Lin2/d;

    iput-object p3, p0, Lt03/a;->y:Lup0/a;

    const-wide/16 p1, 0x1e

    iput-wide p1, p0, Lt03/a;->z:J

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    iput-object p1, p0, Lt03/a;->E:Lbc3/u;

    return-void
.end method

.method public static final synthetic a(Lt03/a;)Lic/k0;
    .locals 0

    invoke-direct {p0}, Lt03/a;->d()Lic/k0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lt03/a;)Lic/p0;
    .locals 0

    iget-object p0, p0, Lt03/a;->w:Lic/p0;

    return-object p0
.end method

.method private final c()Lic/e;
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

.method private final d()Lic/k0;
    .locals 5

    iget-wide v0, p0, Lt03/a;->z:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    new-instance v3, Lic/j0;

    const-class v4, Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker;

    invoke-direct {v3, v4, v0, v1, v2}, Lic/j0;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0}, Lt03/a;->c()Lic/e;

    move-result-object v0

    invoke-virtual {v3, v0}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    sget-object v1, Lic/a;->x:Lic/a;

    const-wide/16 v2, 0x2710

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, v4}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/k0;

    return-object v0
.end method


# virtual methods
.method public final e()V
    .locals 3

    new-instance v0, Lt03/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt03/a$a;-><init>(Lt03/a;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p0, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 2

    iget-object v0, p0, Lt03/a;->x:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    iget-object v1, p0, Lt03/a;->E:Lbc3/u;

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    return-object v0
.end method
