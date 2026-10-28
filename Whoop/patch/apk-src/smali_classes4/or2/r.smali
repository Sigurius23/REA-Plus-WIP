.class public final Lor2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lor2/r;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "Lrr2/c;",
        "crashReporter",
        "Lbc3/c0;",
        "applicationScope",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagRepository;Lrr2/c;Lbc3/c0;)V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "w",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "x",
        "Lrr2/c;",
        "y",
        "Lbc3/c0;",
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
.field private final w:Lcom/whoop/data/repositories/FeatureFlagRepository;

.field private final x:Lrr2/c;

.field private final y:Lbc3/c0;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagRepository;Lrr2/c;Lbc3/c0;)V
    .locals 1

    const-string v0, "featureFlagRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/r;->w:Lcom/whoop/data/repositories/FeatureFlagRepository;

    iput-object p2, p0, Lor2/r;->x:Lrr2/c;

    iput-object p3, p0, Lor2/r;->y:Lbc3/c0;

    return-void
.end method

.method public static final synthetic a(Lor2/r;)Lrr2/c;
    .locals 0

    iget-object p0, p0, Lor2/r;->x:Lrr2/c;

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lor2/r;->w:Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-interface {p1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->getFeatureFlagsFlow()Lec3/t1;

    move-result-object p1

    new-instance v0, Lor2/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lor2/r$a;-><init>(Lor2/r;Lq83/d;)V

    new-instance v1, Lec3/j1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object p1, p0, Lor2/r;->y:Lbc3/c0;

    invoke-static {v1, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method
