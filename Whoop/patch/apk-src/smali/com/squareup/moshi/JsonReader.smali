.class public abstract Lcom/squareup/moshi/JsonReader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public E:Z

.field public F:Z

.field public w:I

.field public x:[I

.field public y:[Ljava/lang/String;

.field public z:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    .line 2
    new-array v1, v0, [I

    iput-object v1, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    .line 3
    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    .line 4
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/squareup/moshi/JsonReader;->z:[I

    return-void
.end method

.method public constructor <init>(Lcom/squareup/moshi/JsonReader;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iget v0, p1, Lcom/squareup/moshi/JsonReader;->w:I

    iput v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    .line 7
    iget-object v0, p1, Lcom/squareup/moshi/JsonReader;->x:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    .line 8
    iget-object v0, p1, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    .line 9
    iget-object v0, p1, Lcom/squareup/moshi/JsonReader;->z:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Lcom/squareup/moshi/JsonReader;->z:[I

    .line 10
    iget-boolean v0, p1, Lcom/squareup/moshi/JsonReader;->E:Z

    iput-boolean v0, p0, Lcom/squareup/moshi/JsonReader;->E:Z

    .line 11
    iget-boolean p1, p1, Lcom/squareup/moshi/JsonReader;->F:Z

    iput-boolean p1, p0, Lcom/squareup/moshi/JsonReader;->F:Z

    return-void
.end method


# virtual methods
.method public final J()Ljava/lang/Object;
    .locals 6

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->i()V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected a value but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->k()Lqx/w;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->nextDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :cond_3
    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, Lqx/h0;

    invoke-direct {v0}, Lqx/h0;-><init>()V

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->beginObject()V

    :goto_0
    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->J()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lqx/h0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_0

    :cond_5
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    const-string v4, "Map key \'"

    const-string v5, "\' has multiple values at path "

    invoke-static {v4, v1, v5}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " and "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->endObject()V

    return-object v0

    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->beginArray()V

    :goto_1
    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->J()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->endArray()V

    return-object v0
.end method

.method public abstract T(Lqx/v;)I
.end method

.method public abstract a0(Lqx/v;)I
.end method

.method public final b()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    iget-object v1, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    iget-object v2, p0, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    iget-object v3, p0, Lcom/squareup/moshi/JsonReader;->z:[I

    invoke-static {v0, v1, v3, v2}, Luf/c0;->T(I[I[I[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract b0()V
.end method

.method public abstract beginArray()V
.end method

.method public abstract beginObject()V
.end method

.method public abstract endArray()V
.end method

.method public abstract endObject()V
.end method

.method public abstract h()Z
.end method

.method public abstract hasNext()Z
.end method

.method public abstract i()V
.end method

.method public abstract k()Lqx/w;
.end method

.method public abstract m()Lcom/squareup/moshi/JsonReader;
.end method

.method public abstract nextDouble()D
.end method

.method public abstract nextInt()I
.end method

.method public abstract nextLong()J
.end method

.method public abstract nextName()Ljava/lang/String;
.end method

.method public abstract nextString()Ljava/lang/String;
.end method

.method public final o0(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lcom/squareup/moshi/JsonEncodingException;

    const-string v1, " at path "

    invoke-static {p1, v1}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/squareup/moshi/JsonEncodingException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;
    .locals 3

    const-string v0, "Expected "

    if-nez p1, :cond_0

    new-instance p1, Lcom/squareup/moshi/JsonDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " but was null at path "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v1, Lcom/squareup/moshi/JsonDataException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " but was "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", a "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", at path "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public abstract s()V
.end method

.method public abstract skipValue()V
.end method

.method public final x(I)V
    .locals 3

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    iget-object v1, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    array-length v2, v1

    if-ne v0, v2, :cond_1

    const/16 v2, 0x100

    if-eq v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->z:[I

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lcom/squareup/moshi/JsonReader;->z:[I

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/squareup/moshi/JsonDataException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Nesting too deep at "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    iget v1, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/squareup/moshi/JsonReader;->w:I

    aput p1, v0, v1

    return-void
.end method
