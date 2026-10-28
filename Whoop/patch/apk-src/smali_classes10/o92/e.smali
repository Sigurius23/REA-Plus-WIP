.class public final Lo92/e;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lo92/e;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Lwm0/a;",
        "scopeCoordinator",
        "<init>",
        "(Lo92/s;Lwm0/a;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lwm0/a;",
        "",
        "J",
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

.field private final J:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lo92/s;Lwm0/a;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lo92/e;->I:Lwm0/a;

    const-string p1, "CyclesRefreshSilentPushNotification"

    iput-object p1, p0, Lo92/e;->J:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lo92/e;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lo92/e;->I:Lwm0/a;

    return-object p0
.end method

.method public static final synthetic z(Lo92/e;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 6

    const-string v0, "Cycles refresh push received: payload - "

    const-string v1, "dataMap"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "data_payload"

    invoke-virtual {p1, v3}, Lm92/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-class v4, Ljava/util/Map;

    invoke-static {v3, v4}, Lor2/i0;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v4

    new-instance v5, Lo92/e$a;

    invoke-direct {v5, p0, v2}, Lo92/e$a;-><init>(Lo92/e;Lq83/d;)V

    invoke-static {v4, v2, v2, v5, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v4

    const-string v5, "sleep_activity"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v1, [Lqr2/a$a;

    invoke-interface {v4, v0, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object v3

    const-string v4, "Cycles silent push failed with exception "

    invoke-static {v0, v4}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v3, v4, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v1

    new-instance v3, Lo92/e$b;

    invoke-direct {v3, p1, p0, v2}, Lo92/e$b;-><init>(Lm92/f;Lo92/e;Lq83/d;)V

    invoke-static {v1, v2, v2, v3, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p0}, Lm92/b;->f()Lrr2/c;

    move-result-object p1

    const-string p2, "Cycles silent push failed"

    invoke-interface {p1, v0, p2}, Lrr2/c;->g(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/e;->J:Ljava/lang/String;

    return-object v0
.end method
