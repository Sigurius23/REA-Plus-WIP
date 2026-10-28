.class public final Lj52/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lj52/a;",
        "",
        "Lic/p0;",
        "workManager",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lic/p0;Ltr2/n;)V",
        "Ll83/a0;",
        "b",
        "()V",
        "Lic/k0;",
        "a",
        "()Lic/k0;",
        "Lic/p0;",
        "Ltr2/n;",
        "Lic/e;",
        "c",
        "Lic/e;",
        "constraints",
        "pulseInformationPacket_release"
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
.method public constructor <init>(Lic/p0;Ltr2/n;)V
    .locals 12

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj52/a;->a:Lic/p0;

    iput-object p2, p0, Lj52/a;->b:Ltr2/n;

    new-instance p1, Lrc/e;

    sget-object p1, Lic/x;->w:Lic/x;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v2, Lic/x;->x:Lic/x;

    new-instance v1, Lrc/e;

    const/4 p2, 0x0

    invoke-direct {v1, p2}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

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

    iput-object v0, p0, Lj52/a;->c:Lic/e;

    return-void
.end method


# virtual methods
.method public final a()Lic/k0;
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v1, Lic/j0;

    const-class v2, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;

    const-wide/32 v3, 0xdbba0

    invoke-direct {v1, v2, v3, v4, v0}, Lic/j0;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    iget-object v2, p0, Lj52/a;->c:Lic/e;

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

.method public final b()V
    .locals 4

    invoke-virtual {p0}, Lj52/a;->a()Lic/k0;

    move-result-object v0

    iget-object v1, p0, Lj52/a;->a:Lic/p0;

    const-string v2, "PERIODIC_PIP_UPLOAD"

    sget-object v3, Lic/k;->w:Lic/k;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    iget-object v0, p0, Lj52/a;->b:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Scheduled periodic pip upload"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
