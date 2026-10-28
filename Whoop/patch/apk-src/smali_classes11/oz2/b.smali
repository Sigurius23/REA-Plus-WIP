.class public final Loz2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loz2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Loz2/b;",
        "Loz2/a;",
        "Lic/p0;",
        "workManager",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Lic/p0;Landroid/content/Context;)V",
        "Lic/k0;",
        "c",
        "()Lic/k0;",
        "Ll83/a0;",
        "a",
        "()V",
        "b",
        "Lic/p0;",
        "Landroid/content/Context;",
        "whooplabs_release"
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

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lic/p0;Landroid/content/Context;)V
    .locals 1

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loz2/b;->a:Lic/p0;

    iput-object p2, p0, Loz2/b;->b:Landroid/content/Context;

    return-void
.end method

.method private final c()Lic/k0;
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    new-instance v1, Lic/j0;

    const-class v2, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;

    invoke-direct {v1, v2}, Lic/j0;-><init>(Ljava/lang/Class;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v1, v2, v3, v0}, Lic/q0;->g(JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    const-string v1, "DWL_BTHR_PERIODIC_CHECK_TAG"

    iget-object v2, v0, Lic/q0;->c:Lqc/q;

    iput-object v1, v2, Lqc/q;->x:Ljava/lang/String;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/k0;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    invoke-direct {p0}, Loz2/b;->c()Lic/k0;

    move-result-object v0

    iget-object v1, p0, Loz2/b;->a:Lic/p0;

    const-string v2, "DWL_BTHR_PERIODIC_CHECK"

    sget-object v3, Lic/k;->x:Lic/k;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Loz2/b;->a:Lic/p0;

    const-string v1, "DWL_BTHR_PERIODIC_CHECK"

    invoke-virtual {v0, v1}, Lic/p0;->b(Ljava/lang/String;)Lic/f0;

    return-void
.end method
