.class public abstract Lqx/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field public E:Ljava/lang/String;

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:I

.field public w:I

.field public x:[I

.field public y:[Ljava/lang/String;

.field public z:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lqx/c0;->w:I

    const/16 v0, 0x20

    new-array v1, v0, [I

    iput-object v1, p0, Lqx/c0;->x:[I

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lqx/c0;->y:[Ljava/lang/String;

    new-array v0, v0, [I

    iput-object v0, p0, Lqx/c0;->z:[I

    const/4 v0, -0x1

    iput v0, p0, Lqx/c0;->I:I

    return-void
.end method


# virtual methods
.method public abstract F0(Ljava/lang/String;)Lqx/c0;
.end method

.method public abstract J()Lqx/c0;
.end method

.method public abstract M0(Z)Lqx/c0;
.end method

.method public final T()I
    .locals 2

    iget v0, p0, Lqx/c0;->w:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lqx/c0;->x:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v1, v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a0(I)V
    .locals 3

    iget-object v0, p0, Lqx/c0;->x:[I

    iget v1, p0, Lqx/c0;->w:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lqx/c0;->w:I

    aput p1, v0, v1

    return-void
.end method

.method public abstract b()Lqx/c0;
.end method

.method public b0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lqx/c0;->E:Ljava/lang/String;

    return-void
.end method

.method public abstract h()Lqx/c0;
.end method

.method public final i()V
    .locals 3

    iget v0, p0, Lqx/c0;->w:I

    iget-object v1, p0, Lqx/c0;->x:[I

    array-length v2, v1

    if-eq v0, v2, :cond_0

    return-void

    :cond_0
    const/16 v2, 0x100

    if-eq v0, v2, :cond_2

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lqx/c0;->x:[I

    iget-object v0, p0, Lqx/c0;->y:[Ljava/lang/String;

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lqx/c0;->y:[Ljava/lang/String;

    iget-object v0, p0, Lqx/c0;->z:[I

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lqx/c0;->z:[I

    instance-of v0, p0, Lqx/b0;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lqx/b0;

    iget-object v1, v0, Lqx/b0;->J:[Ljava/lang/Object;

    array-length v2, v1

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lqx/b0;->J:[Ljava/lang/Object;

    :cond_1
    return-void

    :cond_2
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Nesting too deep at "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lqx/c0;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": circular reference?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract k()Lqx/c0;
.end method

.method public abstract m()Lqx/c0;
.end method

.method public abstract o0(D)Lqx/c0;
.end method

.method public abstract p0(J)Lqx/c0;
.end method

.method public final s()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lqx/c0;->w:I

    iget-object v1, p0, Lqx/c0;->x:[I

    iget-object v2, p0, Lqx/c0;->y:[Ljava/lang/String;

    iget-object v3, p0, Lqx/c0;->z:[I

    invoke-static {v0, v1, v3, v2}, Luf/c0;->T(I[I[I[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract x(Ljava/lang/String;)Lqx/c0;
.end method

.method public abstract x0(Ljava/lang/Float;)Lqx/c0;
.end method
