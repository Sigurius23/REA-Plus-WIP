.class public final Lqx/b0;
.super Lqx/c0;
.source "SourceFile"


# instance fields
.field public J:[Ljava/lang/Object;

.field public K:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lqx/c0;-><init>()V

    const/16 v0, 0x20

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lqx/b0;->J:[Ljava/lang/Object;

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lqx/c0;->a0(I)V

    return-void
.end method


# virtual methods
.method public final F0(Ljava/lang/String;)Lqx/c0;
    .locals 2

    iget-boolean v0, p0, Lqx/c0;->H:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lqx/c0;->H:Z

    invoke-virtual {p0, p1}, Lqx/b0;->x(Ljava/lang/String;)Lqx/c0;

    return-object p0

    :cond_0
    invoke-virtual {p0, p1}, Lqx/b0;->R0(Ljava/io/Serializable;)V

    iget-object p1, p0, Lqx/c0;->z:[I

    iget v0, p0, Lqx/c0;->w:I

    add-int/lit8 v0, v0, -0x1

    aget v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p1, v0

    return-object p0
.end method

.method public final J()Lqx/c0;
    .locals 3

    iget-boolean v0, p0, Lqx/c0;->H:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lqx/b0;->R0(Ljava/io/Serializable;)V

    iget-object v0, p0, Lqx/c0;->z:[I

    iget v1, p0, Lqx/c0;->w:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "null cannot be used as a map key in JSON at path "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lqx/c0;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final M0(Z)Lqx/c0;
    .locals 2

    iget-boolean v0, p0, Lqx/c0;->H:Z

    if-nez v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqx/b0;->R0(Ljava/io/Serializable;)V

    iget-object p1, p0, Lqx/c0;->z:[I

    iget v0, p0, Lqx/c0;->w:I

    add-int/lit8 v0, v0, -0x1

    aget v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p1, v0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Boolean cannot be used as a map key in JSON at path "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lqx/c0;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final R0(Ljava/io/Serializable;)V
    .locals 4

    invoke-virtual {p0}, Lqx/c0;->T()I

    move-result v0

    iget v1, p0, Lqx/c0;->w:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 v3, 0x6

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lqx/c0;->x:[I

    sub-int/2addr v1, v2

    const/4 v2, 0x7

    aput v2, v0, v1

    iget-object v0, p0, Lqx/b0;->J:[Ljava/lang/Object;

    aput-object p1, v0, v1

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "JSON must have only one top-level value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v3, 0x3

    if-ne v0, v3, :cond_5

    iget-object v3, p0, Lqx/b0;->K:Ljava/lang/String;

    if-eqz v3, :cond_5

    if-nez p1, :cond_2

    iget-boolean v0, p0, Lqx/c0;->G:Z

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lqx/b0;->J:[Ljava/lang/Object;

    sub-int/2addr v1, v2

    aget-object v0, v0, v1

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    const/4 p1, 0x0

    iput-object p1, p0, Lqx/b0;->K:Ljava/lang/String;

    return-void

    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Map key \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lqx/b0;->K:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' has multiple values at path "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lqx/c0;->s()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " and "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    if-ne v0, v2, :cond_6

    iget-object v0, p0, Lqx/b0;->J:[Ljava/lang/Object;

    sub-int/2addr v1, v2

    aget-object v0, v0, v1

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_6
    const/16 p1, 0x9

    if-ne v0, p1, :cond_7

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Sink from valueSink() was not closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Nesting problem."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final S0()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lqx/c0;->w:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v2, p0, Lqx/c0;->x:[I

    sub-int/2addr v0, v1

    aget v0, v2, v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lqx/b0;->J:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lqx/c0;
    .locals 4

    iget-boolean v0, p0, Lqx/c0;->H:Z

    if-nez v0, :cond_1

    iget v0, p0, Lqx/c0;->w:I

    iget v1, p0, Lqx/c0;->I:I

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    iget-object v3, p0, Lqx/c0;->x:[I

    sub-int/2addr v0, v2

    aget v0, v3, v0

    if-ne v0, v2, :cond_0

    not-int v0, v1

    iput v0, p0, Lqx/c0;->I:I

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lqx/c0;->i()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lqx/b0;->R0(Ljava/io/Serializable;)V

    iget-object v1, p0, Lqx/b0;->J:[Ljava/lang/Object;

    iget v3, p0, Lqx/c0;->w:I

    aput-object v0, v1, v3

    iget-object v0, p0, Lqx/c0;->z:[I

    const/4 v1, 0x0

    aput v1, v0, v3

    invoke-virtual {p0, v2}, Lqx/c0;->a0(I)V

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Array cannot be used as a map key in JSON at path "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lqx/c0;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 3

    iget v0, p0, Lqx/c0;->w:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v2, p0, Lqx/c0;->x:[I

    sub-int/2addr v0, v1

    aget v0, v2, v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lqx/c0;->w:I

    return-void

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final flush()V
    .locals 2

    iget v0, p0, Lqx/c0;->w:I

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()Lqx/c0;
    .locals 4

    iget-boolean v0, p0, Lqx/c0;->H:Z

    if-nez v0, :cond_1

    iget v0, p0, Lqx/c0;->w:I

    iget v1, p0, Lqx/c0;->I:I

    const/4 v2, 0x3

    if-ne v0, v1, :cond_0

    iget-object v3, p0, Lqx/c0;->x:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v3, v0

    if-ne v0, v2, :cond_0

    not-int v0, v1

    iput v0, p0, Lqx/c0;->I:I

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lqx/c0;->i()V

    new-instance v0, Lqx/h0;

    invoke-direct {v0}, Lqx/h0;-><init>()V

    invoke-virtual {p0, v0}, Lqx/b0;->R0(Ljava/io/Serializable;)V

    iget-object v1, p0, Lqx/b0;->J:[Ljava/lang/Object;

    iget v3, p0, Lqx/c0;->w:I

    aput-object v0, v1, v3

    invoke-virtual {p0, v2}, Lqx/c0;->a0(I)V

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Object cannot be used as a map key in JSON at path "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lqx/c0;->s()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()Lqx/c0;
    .locals 5

    invoke-virtual {p0}, Lqx/c0;->T()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqx/c0;->w:I

    iget v2, p0, Lqx/c0;->I:I

    not-int v3, v2

    if-ne v0, v3, :cond_0

    not-int v0, v2

    iput v0, p0, Lqx/c0;->I:I

    return-object p0

    :cond_0
    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Lqx/c0;->w:I

    iget-object v3, p0, Lqx/b0;->J:[Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v4, v3, v2

    iget-object v2, p0, Lqx/c0;->z:[I

    add-int/lit8 v0, v0, -0x2

    aget v3, v2, v0

    add-int/2addr v3, v1

    aput v3, v2, v0

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m()Lqx/c0;
    .locals 4

    invoke-virtual {p0}, Lqx/c0;->T()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lqx/b0;->K:Ljava/lang/String;

    if-nez v0, :cond_1

    iget v0, p0, Lqx/c0;->w:I

    iget v1, p0, Lqx/c0;->I:I

    not-int v2, v1

    if-ne v0, v2, :cond_0

    not-int v0, v1

    iput v0, p0, Lqx/c0;->I:I

    return-object p0

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lqx/c0;->H:Z

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lqx/c0;->w:I

    iget-object v2, p0, Lqx/b0;->J:[Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v3, v2, v1

    iget-object v2, p0, Lqx/c0;->y:[Ljava/lang/String;

    aput-object v3, v2, v1

    iget-object v1, p0, Lqx/c0;->z:[I

    add-int/lit8 v0, v0, -0x2

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Dangling name: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lqx/b0;->K:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Nesting problem."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o0(D)Lqx/c0;
    .locals 3

    iget-boolean v0, p0, Lqx/c0;->F:Z

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    cmpl-double v0, p1, v0

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    cmpl-double v0, p1, v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Numeric values must be finite, but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lqx/c0;->H:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lqx/c0;->H:Z

    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqx/b0;->x(Ljava/lang/String;)Lqx/c0;

    return-object p0

    :cond_2
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqx/b0;->R0(Ljava/io/Serializable;)V

    iget-object p1, p0, Lqx/c0;->z:[I

    iget p2, p0, Lqx/c0;->w:I

    add-int/lit8 p2, p2, -0x1

    aget v0, p1, p2

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, p2

    return-object p0
.end method

.method public final p0(J)Lqx/c0;
    .locals 1

    iget-boolean v0, p0, Lqx/c0;->H:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lqx/c0;->H:Z

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqx/b0;->x(Ljava/lang/String;)Lqx/c0;

    return-object p0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqx/b0;->R0(Ljava/io/Serializable;)V

    iget-object p1, p0, Lqx/c0;->z:[I

    iget p2, p0, Lqx/c0;->w:I

    add-int/lit8 p2, p2, -0x1

    aget v0, p1, p2

    add-int/lit8 v0, v0, 0x1

    aput v0, p1, p2

    return-object p0
.end method

.method public final x(Ljava/lang/String;)Lqx/c0;
    .locals 2

    if-eqz p1, :cond_2

    iget v0, p0, Lqx/c0;->w:I

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lqx/c0;->T()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lqx/b0;->K:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lqx/c0;->H:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Lqx/b0;->K:Ljava/lang/String;

    iget-object v0, p0, Lqx/c0;->y:[Ljava/lang/String;

    iget v1, p0, Lqx/c0;->w:I

    add-int/lit8 v1, v1, -0x1

    aput-object p1, v0, v1

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Nesting problem."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "JsonWriter is closed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "name == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x0(Ljava/lang/Float;)Lqx/c0;
    .locals 2

    if-nez p1, :cond_2

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lqx/b0;->J()Lqx/c0;

    return-object p0

    :cond_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    iget-boolean p1, p0, Lqx/c0;->H:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lqx/c0;->H:Z

    invoke-virtual {v0}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqx/b0;->x(Ljava/lang/String;)Lqx/c0;

    return-object p0

    :cond_1
    invoke-virtual {p0, v0}, Lqx/b0;->R0(Ljava/io/Serializable;)V

    iget-object p1, p0, Lqx/c0;->z:[I

    iget v0, p0, Lqx/c0;->w:I

    add-int/lit8 v0, v0, -0x1

    aget v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, p1, v0

    return-object p0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lqx/b0;->o0(D)Lqx/c0;

    return-object p0
.end method
