.class public final Lmh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final w:Landroidx/lifecycle/x;

.field public final x:Lbc3/k1;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;Lbc3/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmh/a;->w:Landroidx/lifecycle/x;

    iput-object p2, p0, Lmh/a;->x:Lbc3/k1;

    return-void
.end method


# virtual methods
.method public final onDestroy(Landroidx/lifecycle/g0;)V
    .locals 1

    iget-object p1, p0, Lmh/a;->x:Lbc3/k1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
