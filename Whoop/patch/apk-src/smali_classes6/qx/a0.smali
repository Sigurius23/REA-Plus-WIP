.class public final Lqx/a0;
.super Lcom/squareup/moshi/JsonReader;
.source "SourceFile"


# static fields
.field public static final H:Ljava/lang/Object;


# instance fields
.field public G:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lqx/a0;->H:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 3

    invoke-direct {p0}, Lcom/squareup/moshi/JsonReader;-><init>()V

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    iget v1, p0, Lcom/squareup/moshi/JsonReader;->w:I

    const/4 v2, 0x7

    aput v2, v0, v1

    const/16 v0, 0x20

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lqx/a0;->G:[Ljava/lang/Object;

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/squareup/moshi/JsonReader;->w:I

    aput-object p1, v0, v1

    return-void
.end method


# virtual methods
.method public final F0()V
    .locals 5

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/squareup/moshi/JsonReader;->w:I

    iget-object v2, p0, Lqx/a0;->G:[Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v3, v2, v1

    iget-object v3, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    const/4 v4, 0x0

    aput v4, v3, v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/squareup/moshi/JsonReader;->z:[I

    add-int/lit8 v3, v0, -0x2

    aget v4, v1, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v1, v3

    add-int/lit8 v0, v0, -0x2

    aget-object v0, v2, v0

    instance-of v1, v0, Ljava/util/Iterator;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqx/a0;->x0(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lqx/a0;->G:[Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v2, v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    if-nez v0, :cond_2

    sget-object p1, Lqx/w;->I:Lqx/w;

    if-ne p2, p1, :cond_2

    return-object v1

    :cond_2
    sget-object p1, Lqx/a0;->H:Ljava/lang/Object;

    if-ne v0, p1, :cond_3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "JsonReader is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {p0, v0, p2}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1
.end method

.method public final T(Lqx/v;)I
    .locals 5

    const-class v0, Ljava/util/Map$Entry;

    sget-object v1, Lqx/w;->E:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_2

    check-cast v2, Ljava/lang/String;

    iget-object v1, p1, Lqx/v;->a:[Ljava/lang/String;

    array-length v1, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    iget-object v4, p1, Lqx/v;->a:[Ljava/lang/String;

    aget-object v4, v4, v3

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object p1, p0, Lqx/a0;->G:[Ljava/lang/Object;

    iget v1, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, p1, v1

    iget-object p1, p0, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v0, v0, -0x2

    aput-object v2, p1, v0

    return v3

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1

    :cond_2
    invoke-virtual {p0, v2, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object p1

    throw p1
.end method

.method public final a0(Lqx/v;)I
    .locals 5

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lqx/a0;->G:[Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v1, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    instance-of v1, v0, Ljava/lang/String;

    const/4 v2, -0x1

    if-nez v1, :cond_2

    sget-object p1, Lqx/a0;->H:Ljava/lang/Object;

    if-eq v0, p1, :cond_1

    return v2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "JsonReader is closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    check-cast v0, Ljava/lang/String;

    iget-object v1, p1, Lqx/v;->a:[Ljava/lang/String;

    array-length v1, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_4

    iget-object v4, p1, Lqx/v;->a:[Ljava/lang/String;

    aget-object v4, v4, v3

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Lqx/a0;->F0()V

    return v3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    return v2
.end method

.method public final b0()V
    .locals 4

    iget-boolean v0, p0, Lcom/squareup/moshi/JsonReader;->F:Z

    if-nez v0, :cond_0

    const-class v0, Ljava/util/Map$Entry;

    sget-object v1, Lqx/w;->E:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lqx/a0;->G:[Ljava/lang/Object;

    iget v2, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    iget v1, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v1, v1, -0x2

    const-string v2, "null"

    aput-object v2, v0, v1

    return-void

    :cond_0
    invoke-virtual {p0}, Lqx/a0;->k()Lqx/w;

    move-result-object v0

    invoke-virtual {p0}, Lqx/a0;->nextName()Ljava/lang/String;

    new-instance v1, Lcom/squareup/moshi/JsonDataException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot skip unexpected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " at "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final beginArray()V
    .locals 6

    const-class v0, Ljava/util/List;

    sget-object v1, Lqx/w;->w:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v1, Lqx/z;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lqx/w;->x:Lqx/w;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Lqx/z;-><init>(Lqx/w;[Ljava/lang/Object;I)V

    iget-object v0, p0, Lqx/a0;->G:[Ljava/lang/Object;

    iget v2, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v4, v2, -0x1

    aput-object v1, v0, v4

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    add-int/lit8 v4, v2, -0x1

    const/4 v5, 0x1

    aput v5, v0, v4

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->z:[I

    sub-int/2addr v2, v5

    aput v3, v0, v2

    invoke-virtual {v1}, Lqx/z;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lqx/z;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqx/a0;->x0(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final beginObject()V
    .locals 4

    const-class v0, Ljava/util/Map;

    sget-object v1, Lqx/w;->y:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    new-instance v1, Lqx/z;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {v2, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    sget-object v3, Lqx/w;->z:Lqx/w;

    invoke-direct {v1, v3, v0, v2}, Lqx/z;-><init>(Lqx/w;[Ljava/lang/Object;I)V

    iget-object v0, p0, Lqx/a0;->G:[Ljava/lang/Object;

    iget v2, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v3, v2, -0x1

    aput-object v1, v0, v3

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x3

    aput v3, v0, v2

    invoke-virtual {v1}, Lqx/z;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lqx/z;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqx/a0;->x0(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final close()V
    .locals 4

    iget-object v0, p0, Lqx/a0;->G:[Ljava/lang/Object;

    iget v1, p0, Lcom/squareup/moshi/JsonReader;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iget-object v0, p0, Lqx/a0;->G:[Ljava/lang/Object;

    sget-object v1, Lqx/a0;->H:Ljava/lang/Object;

    aput-object v1, v0, v3

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    const/16 v1, 0x8

    aput v1, v0, v3

    const/4 v0, 0x1

    iput v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    return-void
.end method

.method public final endArray()V
    .locals 3

    const-class v0, Lqx/z;

    sget-object v1, Lqx/w;->x:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqx/z;

    iget-object v2, v0, Lqx/z;->w:Lqx/w;

    if-ne v2, v1, :cond_0

    invoke-virtual {v0}, Lqx/z;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lqx/a0;->F0()V

    return-void

    :cond_0
    invoke-virtual {p0, v0, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0
.end method

.method public final endObject()V
    .locals 3

    const-class v0, Lqx/z;

    sget-object v1, Lqx/w;->z:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqx/z;

    iget-object v2, v0, Lqx/z;->w:Lqx/w;

    if-ne v2, v1, :cond_0

    invoke-virtual {v0}, Lqx/z;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    iget v1, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    aput-object v2, v0, v1

    invoke-virtual {p0}, Lqx/a0;->F0()V

    return-void

    :cond_0
    invoke-virtual {p0, v0, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0
.end method

.method public final h()Z
    .locals 2

    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Lqx/w;->H:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Lqx/a0;->F0()V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final hasNext()Z
    .locals 4

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, Lqx/a0;->G:[Ljava/lang/Object;

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    aget-object v0, v2, v0

    instance-of v2, v0, Ljava/util/Iterator;

    if-eqz v2, :cond_2

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    return v3
.end method

.method public final i()V
    .locals 2

    const-class v0, Ljava/lang/Void;

    sget-object v1, Lqx/w;->I:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    invoke-virtual {p0}, Lqx/a0;->F0()V

    return-void
.end method

.method public final k()Lqx/w;
    .locals 2

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    if-nez v0, :cond_0

    sget-object v0, Lqx/w;->J:Lqx/w;

    return-object v0

    :cond_0
    iget-object v1, p0, Lqx/a0;->G:[Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v1, v0

    instance-of v1, v0, Lqx/z;

    if-eqz v1, :cond_1

    check-cast v0, Lqx/z;

    iget-object v0, v0, Lqx/z;->w:Lqx/w;

    return-object v0

    :cond_1
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_2

    sget-object v0, Lqx/w;->w:Lqx/w;

    return-object v0

    :cond_2
    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_3

    sget-object v0, Lqx/w;->y:Lqx/w;

    return-object v0

    :cond_3
    instance-of v1, v0, Ljava/util/Map$Entry;

    if-eqz v1, :cond_4

    sget-object v0, Lqx/w;->E:Lqx/w;

    return-object v0

    :cond_4
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_5

    sget-object v0, Lqx/w;->F:Lqx/w;

    return-object v0

    :cond_5
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_6

    sget-object v0, Lqx/w;->H:Lqx/w;

    return-object v0

    :cond_6
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_7

    sget-object v0, Lqx/w;->G:Lqx/w;

    return-object v0

    :cond_7
    if-nez v0, :cond_8

    sget-object v0, Lqx/w;->I:Lqx/w;

    return-object v0

    :cond_8
    sget-object v1, Lqx/a0;->H:Ljava/lang/Object;

    if-ne v0, v1, :cond_9

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonReader is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    const-string v1, "a JSON value"

    invoke-virtual {p0, v0, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0
.end method

.method public final m()Lcom/squareup/moshi/JsonReader;
    .locals 7

    new-instance v0, Lqx/a0;

    invoke-direct {v0, p0}, Lcom/squareup/moshi/JsonReader;-><init>(Lcom/squareup/moshi/JsonReader;)V

    iget-object v1, p0, Lqx/a0;->G:[Ljava/lang/Object;

    invoke-virtual {v1}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Lqx/a0;->G:[Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    iget v2, v0, Lcom/squareup/moshi/JsonReader;->w:I

    if-ge v1, v2, :cond_1

    iget-object v2, v0, Lqx/a0;->G:[Ljava/lang/Object;

    aget-object v3, v2, v1

    instance-of v4, v3, Lqx/z;

    if-eqz v4, :cond_0

    check-cast v3, Lqx/z;

    new-instance v4, Lqx/z;

    iget-object v5, v3, Lqx/z;->w:Lqx/w;

    iget-object v6, v3, Lqx/z;->x:[Ljava/lang/Object;

    iget v3, v3, Lqx/z;->y:I

    invoke-direct {v4, v5, v6, v3}, Lqx/z;-><init>(Lqx/w;[Ljava/lang/Object;I)V

    aput-object v4, v2, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final nextDouble()D
    .locals 5

    const-class v0, Ljava/lang/Object;

    sget-object v1, Lqx/w;->G:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    goto :goto_0

    :cond_0
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_3

    :try_start_0
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-boolean v2, p0, Lcom/squareup/moshi/JsonReader;->E:Z

    if-nez v2, :cond_2

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v2, Lcom/squareup/moshi/JsonEncodingException;

    const-string v3, "JSON forbids NaN and infinities: "

    const-string v4, " at path "

    invoke-static {v3, v0, v1, v4}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lqx/a0;->F0()V

    return-wide v0

    :catch_0
    invoke-virtual {p0, v0, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_3
    invoke-virtual {p0, v0, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0
.end method

.method public final nextInt()I
    .locals 4

    const-class v0, Ljava/lang/Object;

    sget-object v1, Lqx/w;->G:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_1

    :try_start_0
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :try_start_1
    new-instance v2, Ljava/math/BigDecimal;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/math/BigDecimal;->intValueExact()I

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    invoke-virtual {p0}, Lqx/a0;->F0()V

    return v0

    :catch_1
    invoke-virtual {p0, v0, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-virtual {p0, v0, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0
.end method

.method public final nextLong()J
    .locals 4

    const-class v0, Ljava/lang/Object;

    sget-object v1, Lqx/w;->G:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_1

    :try_start_0
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :try_start_1
    new-instance v2, Ljava/math/BigDecimal;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    invoke-virtual {p0}, Lqx/a0;->F0()V

    return-wide v0

    :catch_1
    invoke-virtual {p0, v0, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-virtual {p0, v0, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0
.end method

.method public final nextName()Ljava/lang/String;
    .locals 4

    const-class v0, Ljava/util/Map$Entry;

    sget-object v1, Lqx/w;->E:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lqx/a0;->M0(Ljava/lang/Class;Lqx/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_0

    check-cast v2, Ljava/lang/String;

    iget-object v1, p0, Lqx/a0;->G:[Ljava/lang/Object;

    iget v3, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v3

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    iget v1, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v1, v1, -0x2

    aput-object v2, v0, v1

    return-object v2

    :cond_0
    invoke-virtual {p0, v2, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0
.end method

.method public final nextString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lqx/a0;->G:[Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v1, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lqx/a0;->F0()V

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_1
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lqx/a0;->F0()V

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    sget-object v1, Lqx/a0;->H:Ljava/lang/Object;

    if-ne v0, v1, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonReader is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    sget-object v1, Lqx/w;->F:Lqx/w;

    invoke-virtual {p0, v0, v1}, Lcom/squareup/moshi/JsonReader;->p0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/squareup/moshi/JsonDataException;

    move-result-object v0

    throw v0
.end method

.method public final s()V
    .locals 1

    invoke-virtual {p0}, Lqx/a0;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lqx/a0;->nextName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqx/a0;->x0(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final skipValue()V
    .locals 6

    iget-boolean v0, p0, Lcom/squareup/moshi/JsonReader;->F:Z

    if-nez v0, :cond_5

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iget-object v2, p0, Lcom/squareup/moshi/JsonReader;->y:[Ljava/lang/String;

    add-int/lit8 v3, v0, -0x2

    const-string v4, "null"

    aput-object v4, v2, v3

    :cond_0
    if-eqz v0, :cond_1

    iget-object v2, p0, Lqx/a0;->G:[Ljava/lang/Object;

    add-int/lit8 v3, v0, -0x1

    aget-object v2, v2, v3

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    instance-of v3, v2, Lqx/z;

    const-string v4, " at path "

    const-string v5, "Expected a value but was "

    if-nez v3, :cond_4

    instance-of v2, v2, Ljava/util/Map$Entry;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lqx/a0;->G:[Ljava/lang/Object;

    sub-int/2addr v0, v1

    aget-object v1, v2, v0

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v2, v0

    return-void

    :cond_2
    if-lez v0, :cond_3

    invoke-virtual {p0}, Lqx/a0;->F0()V

    return-void

    :cond_3
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lqx/a0;->k()Lqx/w;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lqx/a0;->k()Lqx/w;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Lcom/squareup/moshi/JsonDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot skip unexpected "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lqx/a0;->k()Lqx/w;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final x0(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lcom/squareup/moshi/JsonReader;->w:I

    iget-object v1, p0, Lqx/a0;->G:[Ljava/lang/Object;

    array-length v1, v1

    if-ne v0, v1, :cond_1

    const/16 v1, 0x100

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/squareup/moshi/JsonReader;->x:[I

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

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

    iget-object v0, p0, Lqx/a0;->G:[Ljava/lang/Object;

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lqx/a0;->G:[Ljava/lang/Object;

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

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lqx/a0;->G:[Ljava/lang/Object;

    iget v1, p0, Lcom/squareup/moshi/JsonReader;->w:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/squareup/moshi/JsonReader;->w:I

    aput-object p1, v0, v1

    return-void
.end method
