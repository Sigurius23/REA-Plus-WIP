.class public final Loz2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loz2/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Loz2/d;",
        "Loz2/c;",
        "Lic/p0;",
        "workManager",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Lic/p0;Landroid/content/Context;)V",
        "",
        "delayHours",
        "Ll83/a0;",
        "a",
        "(I)V",
        "delayInHours",
        "Lic/a0;",
        "b",
        "(I)Lic/a0;",
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

    iput-object p1, p0, Loz2/d;->a:Lic/p0;

    iput-object p2, p0, Loz2/d;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    iget-object v0, p0, Loz2/d;->a:Lic/p0;

    sget-object v1, Lic/l;->w:Lic/l;

    invoke-virtual {p0, p1}, Loz2/d;->b(I)Lic/a0;

    move-result-object p1

    const-string v2, "DWL_BTHR_UPLOAD"

    invoke-virtual {v0, v2, v1, p1}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    return-void
.end method

.method public final b(I)Lic/a0;
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

    new-instance v0, Lic/z;

    const-class v2, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;

    invoke-direct {v0, v2}, Lic/q0;-><init>(Ljava/lang/Class;)V

    int-to-long v2, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, p1}, Lic/q0;->g(JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-virtual {p1, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    sget-object v0, Lic/a;->w:Lic/a;

    const-wide/16 v1, 0x2710

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-virtual {p1}, Lic/q0;->b()Lic/r0;

    move-result-object p1

    check-cast p1, Lic/a0;

    return-object p1
.end method
