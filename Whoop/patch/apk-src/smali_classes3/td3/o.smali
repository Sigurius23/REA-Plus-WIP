.class public final Ltd3/o;
.super Ltd3/i;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ltd3/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ltd3/o;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Ltd3/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltd3/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ltd3/i;->a(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Ltd3/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltd3/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ltd3/i;->b(I)V

    :cond_0
    return-void
.end method

.method public final c(ILtd3/m;)V
    .locals 1

    iget-object v0, p0, Ltd3/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltd3/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ltd3/i;->c(ILtd3/m;)V

    :cond_0
    return-void
.end method
