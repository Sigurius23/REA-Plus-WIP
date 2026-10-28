.class public final Lx42/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lx42/c;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Ly42/j;",
        "puffinManager",
        "Lgt0/e;",
        "firmwareUpdateApi",
        "Lbc3/c0;",
        "scope",
        "Lic/p0;",
        "workManager",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ly42/j;Lgt0/e;Lbc3/c0;Lic/p0;Ltr2/n;)V",
        "Ly42/a;",
        "puffin",
        "Ll83/a0;",
        "c",
        "(Ly42/a;)V",
        "b",
        "()V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "w",
        "Ly42/j;",
        "x",
        "Lgt0/e;",
        "y",
        "Lbc3/c0;",
        "z",
        "Lic/p0;",
        "E",
        "Ltr2/n;",
        "puffin_release"
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
.field private final E:Ltr2/n;

.field private final w:Ly42/j;

.field private final x:Lgt0/e;

.field private final y:Lbc3/c0;

.field private final z:Lic/p0;


# direct methods
.method public constructor <init>(Ly42/j;Lgt0/e;Lbc3/c0;Lic/p0;Ltr2/n;)V
    .locals 1

    const-string v0, "puffinManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareUpdateApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx42/c;->w:Ly42/j;

    iput-object p2, p0, Lx42/c;->x:Lgt0/e;

    iput-object p3, p0, Lx42/c;->y:Lbc3/c0;

    iput-object p4, p0, Lx42/c;->z:Lic/p0;

    iput-object p5, p0, Lx42/c;->E:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lx42/c;Ly42/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx42/c;->c(Ly42/a;)V

    return-void
.end method

.method private final b()V
    .locals 3

    iget-object v0, p0, Lx42/c;->E:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Cancelling Puffin periodic firmware update check worker"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lx42/c;->z:Lic/p0;

    const-string v1, "PuffinPeriodicFwUpdateCheckWorker"

    invoke-virtual {v0, v1}, Lic/p0;->b(Ljava/lang/String;)Lic/f0;

    return-void
.end method

.method private final c(Ly42/a;)V
    .locals 4

    iget-object v0, p0, Lx42/c;->E:Ltr2/n;

    invoke-interface {p1}, Ly42/a;->O()Lc52/d;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Triggering firmware update for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lx42/c;->x:Lgt0/e;

    new-instance v1, Lgt0/g$e;

    invoke-static {p1}, Ly42/f;->a(Ly42/a;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    invoke-direct {v1, p1}, Lgt0/g$e;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    invoke-interface {v0, v1}, Lgt0/e;->b(Lgt0/g;)Lec3/l;

    return-void
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lx42/c;->b()V

    iget-object p1, p0, Lx42/c;->w:Ly42/j;

    invoke-virtual {p1}, Ly42/j;->e()Lec3/t1;

    move-result-object p1

    new-instance v0, Lx42/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lx42/c$a;-><init>(Lx42/c;Lq83/d;)V

    new-instance v1, Lec3/j1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object p1, p0, Lx42/c;->y:Lbc3/c0;

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
