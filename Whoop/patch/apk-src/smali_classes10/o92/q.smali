.class public final Lo92/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp92/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lo92/q;",
        "Lp92/d;",
        "Lrr2/c;",
        "crashReporter",
        "Lz82/e;",
        "eventDispatcher",
        "Lcom/whoop/data/repositories/NotificationRepository;",
        "notificationRepository",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lrr2/c;Lz82/e;Lcom/whoop/data/repositories/NotificationRepository;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V",
        "",
        "strainGoal",
        "Landroid/content/Context;",
        "context",
        "Lp92/i;",
        "realTimeStreamController",
        "Ll83/a0;",
        "a",
        "(DLandroid/content/Context;Lp92/i;)V",
        "Lz82/e;",
        "Lo92/s;",
        "b",
        "Lo92/s;",
        "pushContext",
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
.field private final a:Lz82/e;

.field private final b:Lo92/s;


# direct methods
.method public constructor <init>(Lrr2/c;Lz82/e;Lcom/whoop/data/repositories/NotificationRepository;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V
    .locals 1

    const-string v0, "crashReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lo92/q;->a:Lz82/e;

    new-instance p2, Lo92/s;

    invoke-direct {p2, p1, p4, p3, p5}, Lo92/s;-><init>(Lrr2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/repositories/NotificationRepository;Lbc3/c0;)V

    iput-object p2, p0, Lo92/q;->b:Lo92/s;

    return-void
.end method


# virtual methods
.method public a(DLandroid/content/Context;Lp92/i;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "realTimeStreamController"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%.1f"

    invoke-static {v0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lm92/f;

    const-string v0, "optimalKey"

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p2, p1}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance p1, Lo92/p;

    iget-object v0, p0, Lo92/q;->b:Lo92/s;

    iget-object v1, p0, Lo92/q;->a:Lz82/e;

    invoke-direct {p1, v0, v1, p4}, Lo92/p;-><init>(Lo92/s;Lz82/e;Lp92/i;)V

    invoke-virtual {p1, p2, p3}, Lo92/p;->a(Lm92/f;Landroid/content/Context;)V

    return-void
.end method
