.class public final Lhx0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lhx0/d;",
        "",
        "Lic/p0;",
        "workManager",
        "<init>",
        "(Lic/p0;)V",
        "Lic/k0;",
        "b",
        "()Lic/k0;",
        "Lic/a0;",
        "a",
        "()Lic/a0;",
        "Ll83/a0;",
        "d",
        "()V",
        "c",
        "Lic/p0;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "Lic/e;",
        "Lic/e;",
        "constraints",
        "data-sync-service_release"
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
.field private final a:Lic/p0;

.field private final b:Ltr2/n;

.field private final c:Lic/e;


# direct methods
.method public constructor <init>(Lic/p0;)V
    .locals 12

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhx0/d;->a:Lic/p0;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "RawDataUploadScheduler"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lhx0/d;->b:Ltr2/n;

    new-instance p1, Lrc/e;

    sget-object p1, Lic/x;->w:Lic/x;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v2, Lic/x;->x:Lic/x;

    new-instance v1, Lrc/e;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v11

    new-instance v0, Lic/e;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, -0x1

    move-wide v9, v7

    invoke-direct/range {v0 .. v11}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    iput-object v0, p0, Lhx0/d;->c:Lic/e;

    return-void
.end method

.method private final a()Lic/a0;
    .locals 5

    new-instance v0, Lic/z;

    const-class v1, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;

    invoke-direct {v0, v1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    iget-object v1, p0, Lhx0/d;->c:Lic/e;

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

.method private final b()Lic/k0;
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v1, Lic/j0;

    const-class v2, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;

    const-wide/32 v3, 0xdbba0

    invoke-direct {v1, v2, v3, v4, v0}, Lic/j0;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    iget-object v2, p0, Lhx0/d;->c:Lic/e;

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
.method public final c()V
    .locals 4

    invoke-direct {p0}, Lhx0/d;->a()Lic/a0;

    move-result-object v0

    iget-object v1, p0, Lhx0/d;->a:Lic/p0;

    const-string v2, "ONE_TIME_RAW_DATA_UPLOAD"

    sget-object v3, Lic/l;->w:Lic/l;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    iget-object v0, p0, Lhx0/d;->b:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Scheduled one time raw data upload"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public final d()V
    .locals 4

    invoke-direct {p0}, Lhx0/d;->b()Lic/k0;

    move-result-object v0

    iget-object v1, p0, Lhx0/d;->a:Lic/p0;

    const-string v2, "PERIODIC_RAW_DATA_UPLOAD"

    sget-object v3, Lic/k;->w:Lic/k;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    iget-object v0, p0, Lhx0/d;->b:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Scheduled periodic raw data upload"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
