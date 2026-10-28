.class public final Lfi/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfi/p;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final w:Landroidx/lifecycle/x;

.field public final x:Lbc3/k1;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Lbc3/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfi/m;->w:Landroidx/lifecycle/x;

    iput-object p2, p0, Lfi/m;->x:Lbc3/k1;

    return-void
.end method


# virtual methods
.method public final b(Lrh/s;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfi/m;->w:Landroidx/lifecycle/x;

    invoke-static {v0, p1}, Lce/w;->r(Landroidx/lifecycle/x;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final complete()V
    .locals 1

    iget-object v0, p0, Lfi/m;->w:Landroidx/lifecycle/x;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    return-void
.end method

.method public final onDestroy(Landroidx/lifecycle/g0;)V
    .locals 1

    iget-object p1, p0, Lfi/m;->x:Lbc3/k1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final start()V
    .locals 1

    iget-object v0, p0, Lfi/m;->w:Landroidx/lifecycle/x;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method
