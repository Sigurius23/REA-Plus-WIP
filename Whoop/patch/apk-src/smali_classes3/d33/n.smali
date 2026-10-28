.class public final Ld33/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final synthetic w:Ld33/h1;


# direct methods
.method public constructor <init>(Ld33/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld33/n;->w:Ld33/h1;

    return-void
.end method


# virtual methods
.method public final onPause(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    iget-object p1, p0, Ld33/n;->w:Ld33/h1;

    iget-object p1, p1, Ld33/h1;->n:Ll53/m;

    const-string v0, "onBackground"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onResume(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    iget-object p1, p0, Ld33/n;->w:Ld33/h1;

    iget-object p1, p1, Ld33/h1;->n:Ll53/m;

    const-string v0, "onForeground"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
