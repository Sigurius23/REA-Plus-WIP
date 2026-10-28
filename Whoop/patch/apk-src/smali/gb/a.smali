.class public final Lgb/a;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final w:Ljava/util/UUID;

.field public x:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k1;)V
    .locals 2

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    const-string v0, "SaveableStateHolder_BackStackEntryKey"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/UUID;

    if-nez v1, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iput-object v1, p0, Lgb/a;->w:Ljava/util/UUID;

    return-void
.end method


# virtual methods
.method public final onCleared()V
    .locals 4

    invoke-super {p0}, Landroidx/lifecycle/w1;->onCleared()V

    iget-object v0, p0, Lgb/a;->x:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    const-string v2, "saveableStateHolderRef"

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/c;

    if-eqz v0, :cond_0

    iget-object v3, p0, Lgb/a;->w:Ljava/util/UUID;

    invoke-interface {v0, v3}, Ly1/c;->a(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lgb/a;->x:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    return-void

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method
