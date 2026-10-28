.class public final Ltr2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Ltr2/b;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Ltr2/n;",
        "log",
        "<init>",
        "(Ltr2/n;)V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "onStart",
        "onStop",
        "w",
        "Ltr2/n;",
        "logging_release"
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
.field private final w:Ltr2/n;


# direct methods
.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "log"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltr2/b;->w:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 2
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "AppStateLogger"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Ltr2/b;-><init>(Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ltr2/b;->w:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Application onCreate"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

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

.method public onStart(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ltr2/b;->w:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Application onStart"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ltr2/b;->w:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Application onStop"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
