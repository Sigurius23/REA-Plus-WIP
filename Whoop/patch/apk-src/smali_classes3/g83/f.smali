.class public final Lg83/f;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"


# instance fields
.field public final w:Ljava/util/ArrayList;

.field public volatile x:Z

.field public volatile y:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "capacityHint"

    const/16 v2, 0x10

    invoke-static {v2, v1}, Lr73/a;->b(ILjava/lang/String;)V

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lg83/f;->w:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Lg83/e;)V
    .locals 9

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_4

    :cond_0
    iget-object v0, p0, Lg83/f;->w:Ljava/util/ArrayList;

    iget-object v1, p1, Lg83/e;->w:Ll73/d;

    iget-object v2, p1, Lg83/e;->y:Ljava/lang/Integer;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_0
    move v4, v3

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, p1, Lg83/e;->y:Ljava/lang/Integer;

    goto :goto_0

    :cond_2
    :goto_1
    iget-boolean v5, p1, Lg83/e;->z:Z

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    iput-object v6, p1, Lg83/e;->y:Ljava/lang/Integer;

    return-void

    :cond_3
    iget v5, p0, Lg83/f;->y:I

    :goto_2
    if-eq v5, v2, :cond_7

    iget-boolean v7, p1, Lg83/e;->z:Z

    if-eqz v7, :cond_4

    iput-object v6, p1, Lg83/e;->y:Ljava/lang/Integer;

    return-void

    :cond_4
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    iget-boolean v8, p0, Lg83/f;->x:Z

    if-eqz v8, :cond_6

    add-int/lit8 v8, v2, 0x1

    if-ne v8, v5, :cond_6

    iget v5, p0, Lg83/f;->y:I

    if-ne v8, v5, :cond_6

    sget-object v0, Lb83/h;->w:Lb83/h;

    if-ne v7, v0, :cond_5

    invoke-interface {v1}, Ll73/d;->onComplete()V

    goto :goto_3

    :cond_5
    check-cast v7, Lb83/f;

    iget-object v0, v7, Lb83/f;->w:Ljava/lang/Throwable;

    invoke-interface {v1, v0}, Ll73/d;->onError(Ljava/lang/Throwable;)V

    :goto_3
    iput-object v6, p1, Lg83/e;->y:Ljava/lang/Integer;

    iput-boolean v3, p1, Lg83/e;->z:Z

    return-void

    :cond_6
    invoke-interface {v1, v7}, Ll73/d;->onNext(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    iget v5, p0, Lg83/f;->y:I

    if-eq v2, v5, :cond_8

    goto :goto_1

    :cond_8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, p1, Lg83/e;->y:Ljava/lang/Integer;

    neg-int v4, v4

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_2

    :goto_4
    return-void
.end method
