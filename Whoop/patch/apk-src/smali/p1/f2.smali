.class public final Lp1/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ld93/a;


# instance fields
.field public E:I

.field public final F:Ljava/lang/Object;

.field public G:Z

.field public H:I

.field public I:Ljava/util/ArrayList;

.field public J:Ljava/util/HashMap;

.field public K:La0/g0;

.field public w:[I

.field public x:I

.field public y:[Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [I

    iput-object v1, p0, Lp1/f2;->w:[I

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lp1/f2;->y:[Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lp1/f2;->F:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp1/f2;->I:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Lp1/a;)I
    .locals 1

    iget-boolean v0, p0, Lp1/f2;->G:Z

    if-eqz v0, :cond_0

    const-string v0, "Use active SlotWriter to determine anchor location instead"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Lp1/a;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Anchor refers to a group that was removed"

    invoke-static {v0}, Lp1/q1;->a(Ljava/lang/String;)V

    :cond_1
    iget p1, p1, Lp1/a;->a:I

    return p1
.end method

.method public final c()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lp1/f2;->J:Ljava/util/HashMap;

    return-void
.end method

.method public final d()Lp1/e2;
    .locals 2

    iget-boolean v0, p0, Lp1/f2;->G:Z

    if-nez v0, :cond_0

    iget v0, p0, Lp1/f2;->E:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lp1/f2;->E:I

    new-instance v0, Lp1/e2;

    invoke-direct {v0, p0}, Lp1/e2;-><init>(Lp1/f2;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read while a writer is pending"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Lp1/i2;
    .locals 2

    iget-boolean v0, p0, Lp1/f2;->G:Z

    if-eqz v0, :cond_0

    const-string v0, "Cannot start a writer when another writer is pending"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lp1/f2;->E:I

    if-gtz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "Cannot start a writer when a reader is pending"

    invoke-static {v0}, Lp1/r;->c(Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lp1/f2;->G:Z

    iget v1, p0, Lp1/f2;->H:I

    add-int/2addr v1, v0

    iput v1, p0, Lp1/f2;->H:I

    new-instance v0, Lp1/i2;

    invoke-direct {v0, p0}, Lp1/i2;-><init>(Lp1/f2;)V

    return-object v0
.end method

.method public final g(Lp1/a;)Z
    .locals 3

    invoke-virtual {p1}, Lp1/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp1/f2;->I:Ljava/util/ArrayList;

    iget v1, p1, Lp1/a;->a:I

    iget v2, p0, Lp1/f2;->x:I

    invoke-static {v0, v1, v2}, Lp1/h2;->e(Ljava/util/ArrayList;II)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v1, p0, Lp1/f2;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    new-instance v0, Lp1/m0;

    const/4 v1, 0x0

    iget v2, p0, Lp1/f2;->x:I

    invoke-direct {v0, p0, v1, v2}, Lp1/m0;-><init>(Lp1/f2;II)V

    return-object v0
.end method

.method public final j(I)Lp1/n0;
    .locals 4

    iget-object v0, p0, Lp1/f2;->J:Ljava/util/HashMap;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lp1/f2;->G:Z

    if-eqz v2, :cond_0

    const-string v2, "use active SlotWriter to crate an anchor for location instead"

    invoke-static {v2}, Lp1/r;->c(Ljava/lang/String;)V

    :cond_0
    if-ltz p1, :cond_1

    iget v2, p0, Lp1/f2;->x:I

    if-ge p1, v2, :cond_1

    iget-object v3, p0, Lp1/f2;->I:Ljava/util/ArrayList;

    invoke-static {v3, p1, v2}, Lp1/h2;->e(Ljava/util/ArrayList;II)I

    move-result p1

    if-ltz p1, :cond_1

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/a;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/n0;

    return-object p1

    :cond_2
    return-object v1
.end method
