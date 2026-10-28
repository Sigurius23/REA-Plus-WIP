.class public final Lor2/g0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lor2/g0;->f(Landroidx/fragment/app/m0;Ltr2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "or2/g0$a",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "onDestroy",
        "Landroidx/lifecycle/v0;",
        "w",
        "Landroidx/lifecycle/v0;",
        "getObserver",
        "()Landroidx/lifecycle/v0;",
        "observer",
        "feature_release"
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
.field private final w:Landroidx/lifecycle/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/v0;"
        }
    .end annotation
.end field

.field final synthetic x:Landroidx/fragment/app/m0;


# direct methods
.method public constructor <init>(Ltr2/n;Landroidx/fragment/app/m0;)V
    .locals 1

    iput-object p2, p0, Lor2/g0$a;->x:Landroidx/fragment/app/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lor2/c0;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, Lor2/c0;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Lor2/g0$a;->w:Landroidx/lifecycle/v0;

    return-void
.end method

.method public static synthetic a(Ltr2/n;Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-static {p0, p1}, Lor2/g0$a;->b(Ltr2/n;Landroidx/lifecycle/g0;)V

    return-void
.end method

.method private static final b(Ltr2/n;Landroidx/lifecycle/g0;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    new-instance v0, Lor2/g0$a$a;

    invoke-direct {v0, p0}, Lor2/g0$a$a;-><init>(Ltr2/n;)V

    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lor2/g0$a;->x:Landroidx/fragment/app/m0;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getViewLifecycleOwnerLiveData()Landroidx/lifecycle/p0;

    move-result-object p1

    iget-object v0, p0, Lor2/g0$a;->w:Landroidx/lifecycle/v0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/p0;->observeForever(Landroidx/lifecycle/v0;)V

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lor2/g0$a;->x:Landroidx/fragment/app/m0;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getViewLifecycleOwnerLiveData()Landroidx/lifecycle/p0;

    move-result-object p1

    iget-object v0, p0, Lor2/g0$a;->w:Landroidx/lifecycle/v0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/p0;->removeObserver(Landroidx/lifecycle/v0;)V

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
