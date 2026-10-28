.class public final Ldq0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B5\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Ldq0/d;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lkotlin/Function0;",
        "Ldq0/b;",
        "streamClientProvider",
        "Ltr2/n;",
        "logger",
        "Lod1/a0;",
        "userSessionManager",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lc93/a;Ltr2/n;Lod1/a0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "w",
        "Lc93/a;",
        "x",
        "Ltr2/n;",
        "y",
        "Lod1/a0;",
        "z",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "E",
        "Lbc3/c0;",
        "community_release"
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
.field private final E:Lbc3/c0;

.field private final w:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final x:Ltr2/n;

.field private final y:Lod1/a0;

.field private final z:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lc93/a;Ltr2/n;Lod1/a0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Ltr2/n;",
            "Lod1/a0;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "streamClientProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq0/d;->w:Lc93/a;

    iput-object p2, p0, Ldq0/d;->x:Ltr2/n;

    iput-object p3, p0, Ldq0/d;->y:Lod1/a0;

    iput-object p4, p0, Ldq0/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p5, p0, Ldq0/d;->E:Lbc3/c0;

    return-void
.end method

.method public static final synthetic a(Ldq0/d;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Ldq0/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic b(Ldq0/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ldq0/d;->x:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic c(Ldq0/d;)Lc93/a;
    .locals 0

    iget-object p0, p0, Ldq0/d;->w:Lc93/a;

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ldq0/d;->y:Lod1/a0;

    invoke-interface {p1}, Lod1/a0;->b()Lec3/t1;

    move-result-object p1

    new-instance v0, Ldq0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldq0/d$a;-><init>(Ldq0/d;Lq83/d;)V

    new-instance v1, Lec3/j1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object p1, p0, Ldq0/d;->E:Lbc3/c0;

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
