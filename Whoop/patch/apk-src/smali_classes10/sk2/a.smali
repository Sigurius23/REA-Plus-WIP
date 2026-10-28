.class public final Lsk2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsk2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0010B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lsk2/a;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lic/p0;",
        "workManager",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lod1/a0;",
        "userSessionManager",
        "Lbc3/c0;",
        "applicationScope",
        "<init>",
        "(Lic/p0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lod1/a0;Lbc3/c0;)V",
        "Lic/e;",
        "b",
        "()Lic/e;",
        "Lic/k0;",
        "a",
        "()Lic/k0;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "d",
        "()V",
        "c",
        "w",
        "Lic/p0;",
        "x",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "y",
        "Lod1/a0;",
        "z",
        "Lbc3/c0;",
        "E",
        "track-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final E:Lsk2/a$a;

.field public static final F:I


# instance fields
.field private final w:Lic/p0;

.field private final x:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final y:Lod1/a0;

.field private final z:Lbc3/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsk2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsk2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsk2/a;->E:Lsk2/a$a;

    const/16 v0, 0x8

    sput v0, Lsk2/a;->F:I

    return-void
.end method

.method public constructor <init>(Lic/p0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lod1/a0;Lbc3/c0;)V
    .locals 1

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsk2/a;->w:Lic/p0;

    iput-object p2, p0, Lsk2/a;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Lsk2/a;->y:Lod1/a0;

    iput-object p4, p0, Lsk2/a;->z:Lbc3/c0;

    return-void
.end method

.method private final a()Lic/k0;
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    new-instance v1, Lic/j0;

    const-class v2, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;

    const-wide/16 v3, 0x18

    invoke-direct {v1, v2, v3, v4, v0}, Lic/j0;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0}, Lsk2/a;->b()Lic/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    sget-object v1, Lic/a;->x:Lic/a;

    const-wide/16 v2, 0x2710

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, v4}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/j0;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/k0;

    return-object v0
.end method

.method private final b()Lic/e;
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


# virtual methods
.method public final c()V
    .locals 4

    iget-object v0, p0, Lsk2/a;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "start-activity-prefetch"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lic/z;

    const-class v1, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;

    invoke-direct {v0, v1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    invoke-direct {p0}, Lsk2/a;->b()Lic/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/a0;

    iget-object v1, p0, Lsk2/a;->w:Lic/p0;

    const-string v2, "ONE_TIME_TRACK_ACTIVITY_PREFETCH_WORK"

    sget-object v3, Lic/l;->x:Lic/l;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lsk2/a;->x:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "start-activity-prefetch"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lsk2/a;->w:Lic/p0;

    sget-object v1, Lic/k;->w:Lic/k;

    invoke-direct {p0}, Lsk2/a;->a()Lic/k0;

    move-result-object v2

    const-string v3, "PERIODIC_TRACK_ACTIVITY_PREFETCH_WORK"

    invoke-virtual {v0, v3, v1, v2}, Lic/p0;->d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;

    return-void
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lsk2/a;->y:Lod1/a0;

    invoke-interface {p1}, Lod1/a0;->i()Lec3/t1;

    move-result-object p1

    new-instance v0, Lsk2/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lsk2/a$b;-><init>(Lsk2/a;Lq83/d;)V

    new-instance v1, Lec3/j1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object p1, p0, Lsk2/a;->z:Lbc3/c0;

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
