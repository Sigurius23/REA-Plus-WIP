.class public final Lo92/v;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lo92/v;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Lwm0/a;",
        "scopeCoordinator",
        "Lus0/f;",
        "historySyncAnalytics",
        "<init>",
        "(Lo92/s;Lwm0/a;Lus0/f;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lwm0/a;",
        "J",
        "Lus0/f;",
        "",
        "K",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
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
.field private final I:Lwm0/a;

.field private final J:Lus0/f;

.field private final K:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lo92/s;Lwm0/a;Lus0/f;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "historySyncAnalytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lo92/v;->I:Lwm0/a;

    iput-object p3, p0, Lo92/v;->J:Lus0/f;

    const-string p1, "RecoveryProcessedRefresh"

    iput-object p1, p0, Lo92/v;->K:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lo92/v;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lo92/v;->I:Lwm0/a;

    return-object p0
.end method

.method public static final synthetic z(Lo92/v;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 5

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lo92/v;->J:Lus0/f;

    invoke-virtual {p2}, Lus0/f;->b()V

    const/4 p2, 0x3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v1

    new-instance v2, Lo92/v$a;

    invoke-direct {v2, p0, v0}, Lo92/v$a;-><init>(Lo92/v;Lq83/d;)V

    invoke-static {v1, v0, v0, v2, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v2

    const-string v3, "Recovery processed push failed with exception "

    invoke-static {v1, v3}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v2

    new-instance v3, Lo92/v$b;

    invoke-direct {v3, p1, p0, v0}, Lo92/v$b;-><init>(Lm92/f;Lo92/v;Lq83/d;)V

    invoke-static {v2, v0, v0, v3, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p0}, Lm92/b;->f()Lrr2/c;

    move-result-object p1

    const-string p2, "Recovery processed push failed"

    invoke-interface {p1, v1, p2}, Lrr2/c;->g(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/v;->K:Ljava/lang/String;

    return-object v0
.end method
