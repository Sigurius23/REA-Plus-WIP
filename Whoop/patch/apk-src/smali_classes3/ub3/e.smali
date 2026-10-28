.class public final Lub3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public w:Z

.field public final x:I

.field public final synthetic y:Lub3/f;


# direct methods
.method public constructor <init>(Lub3/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lub3/e;->y:Lub3/f;

    invoke-static {p1}, Lub3/f;->c(Lub3/f;)I

    move-result p1

    iput p1, p0, Lub3/e;->x:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lub3/e;->y:Lub3/f;

    invoke-static {v0}, Lub3/f;->d(Lub3/f;)I

    move-result v1

    iget v2, p0, Lub3/e;->x:I

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/util/ConcurrentModificationException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ModCount: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lub3/f;->e(Lub3/f;)I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "; expected: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final hasNext()Z
    .locals 1

    iget-boolean v0, p0, Lub3/e;->w:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lub3/e;->w:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lub3/e;->w:Z

    invoke-virtual {p0}, Lub3/e;->a()V

    iget-object v0, p0, Lub3/e;->y:Lub3/f;

    iget-object v0, v0, Lub3/f;->x:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    invoke-virtual {p0}, Lub3/e;->a()V

    iget-object v0, p0, Lub3/e;->y:Lub3/f;

    invoke-virtual {v0}, Lub3/f;->clear()V

    return-void
.end method
