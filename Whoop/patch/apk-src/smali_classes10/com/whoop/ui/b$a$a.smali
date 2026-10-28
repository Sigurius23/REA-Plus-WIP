.class public final Lcom/whoop/ui/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/b$a;-><init>(Lcom/whoop/ui/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/ui/b$a$a",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onDestroy",
        "(Landroidx/lifecycle/g0;)V",
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
.field final synthetic w:Lcom/whoop/ui/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/whoop/ui/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/ui/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/b<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/b$a$a;->w:Lcom/whoop/ui/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge onCreate(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onCreate(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/ui/b$a$a;->w:Lcom/whoop/ui/b;

    invoke-static {p1}, Lcom/whoop/ui/b;->c(Lcom/whoop/ui/b;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/b$a$a;->w:Lcom/whoop/ui/b;

    invoke-static {v0}, Lcom/whoop/ui/b;->a(Lcom/whoop/ui/b;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p0, Lcom/whoop/ui/b$a$a;->w:Lcom/whoop/ui/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/whoop/ui/b;->d(Lcom/whoop/ui/b;Ljava/lang/Object;)V

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
