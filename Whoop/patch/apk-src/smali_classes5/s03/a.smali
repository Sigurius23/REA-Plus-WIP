.class public final Ls03/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;
.implements Lbc3/c0;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "LogNotTimber"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\'\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Ls03/a;",
        "Lof3/a;",
        "Lbc3/c0;",
        "<init>",
        "()V",
        "Lic/e;",
        "a",
        "()Lic/e;",
        "Lic/k0;",
        "d",
        "()Lic/k0;",
        "Lic/a0;",
        "c",
        "()Lic/a0;",
        "Lic/g;",
        "b",
        "()Lic/g;",
        "Ll83/a0;",
        "f",
        "e",
        "",
        "w",
        "Ljava/lang/String;",
        "tag",
        "Ljava/util/UUID;",
        "x",
        "Ljava/util/UUID;",
        "periodicWorkId",
        "Lic/p0;",
        "y",
        "Lic/p0;",
        "workManagerInstance",
        "Lbc3/u;",
        "z",
        "Lbc3/u;",
        "job",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
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
.field private final w:Ljava/lang/String;

.field private x:Ljava/util/UUID;

.field private final y:Lic/p0;

.field private final z:Lbc3/u;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "LogEventUploadScheduler"

    iput-object v0, p0, Ls03/a;->w:Ljava/lang/String;

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

    iput-object v0, p0, Ls03/a;->y:Lic/p0;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    iput-object v0, p0, Ls03/a;->z:Lbc3/u;

    return-void
.end method

.method private final a()Lic/e;
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

.method private final b()Lic/g;
    .locals 3

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "FORCE_UPLOAD_ALL_LOGS"

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lic/g;

    invoke-direct {v1, v0}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {v1}, Lpf/c;->X(Lic/g;)[B

    return-object v1
.end method

.method private final c()Lic/a0;
    .locals 5

    new-instance v0, Lic/z;

    const-class v1, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker;

    invoke-direct {v0, v1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    invoke-direct {p0}, Ls03/a;->b()Lic/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-direct {p0}, Ls03/a;->a()Lic/e;

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

.method private final d()Lic/k0;
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v1, Lic/j0;

    const-class v2, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker;

    const-wide/32 v3, 0xdbba0

    invoke-direct {v1, v2, v3, v4, v0}, Lic/j0;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0}, Ls03/a;->a()Lic/e;

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
.method public final e()V
    .locals 4

    invoke-direct {p0}, Ls03/a;->c()Lic/a0;

    move-result-object v0

    iget-object v1, p0, Ls03/a;->y:Lic/p0;

    const-string v2, "ONE_TIME_CONNECTED_UPLOAD_LOGS"

    sget-object v3, Lic/l;->y:Lic/l;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    iget-object v0, p0, Ls03/a;->w:Ljava/lang/String;

    const-string v1, "Enqueued one time work request"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final f()V
    .locals 4

    invoke-direct {p0}, Ls03/a;->d()Lic/k0;

    move-result-object v0

    iget-object v1, v0, Lic/r0;->a:Ljava/util/UUID;

    iput-object v1, p0, Ls03/a;->x:Ljava/util/UUID;

    iget-object v1, p0, Ls03/a;->y:Lic/p0;

    const-string v2, "PERIODIC_CONNECTED_UPLOAD_LOGS"

    sget-object v3, Lic/k;->w:Lic/k;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    iget-object v0, p0, Ls03/a;->w:Ljava/lang/String;

    const-string v1, "Enqueued periodic work of uploading logs over wifi or cellular"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 2

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    iget-object v1, p0, Ls03/a;->z:Lbc3/u;

    invoke-virtual {v0, v1}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method
