.class public abstract Ld/h1;
.super Ld/b1;
.source "SourceFile"


# instance fields
.field public a:[Ld/q;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Ld/s;->d:[Ld/q;

    iput-object v0, p0, Ld/h1;->a:[Ld/q;

    return-void
.end method

.method public constructor <init>(Ld/b1;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 6
    new-array v0, v0, [Ld/q;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Ld/h1;->a:[Ld/q;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "\'element\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ld/s;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Ld/s;->f()[Ld/q;

    move-result-object p1

    iput-object p1, p0, Ld/h1;->a:[Ld/q;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "\'elementVector\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static m(Ljava/lang/Object;)Ld/h1;
    .locals 3

    if-eqz p0, :cond_5

    instance-of v0, p0, Ld/h1;

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p0, Ld/q;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ld/q;

    invoke-interface {v0}, Ld/q;->d()Ld/b1;

    move-result-object v0

    instance-of v1, v0, Ld/h1;

    if-eqz v1, :cond_4

    check-cast v0, Ld/h1;

    return-object v0

    :cond_1
    instance-of v0, p0, [B

    if-eqz v0, :cond_4

    :try_start_0
    check-cast p0, [B

    new-instance v0, Ld/g0;

    invoke-direct {v0, p0}, Ld/g0;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v0}, Ld/g0;->i()Ld/b1;

    move-result-object p0

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v0, :cond_3

    :try_start_2
    const-class v0, Ld/h1;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast p0, Ld/h1;

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "unexpected object: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :cond_3
    :try_start_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Extra data detected in stream"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_0
    :try_start_4
    new-instance p0, Ljava/io/IOException;

    const-string v0, "cannot recognise object in stream"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    move-exception p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "failed to construct sequence from byte[]: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v1}, Lc13/a;->h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "unknown object in getInstance: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_0
    check-cast p0, Ld/h1;

    return-object p0
.end method


# virtual methods
.method public final g(Ld/b1;)Z
    .locals 5

    instance-of v0, p1, Ld/h1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    check-cast p1, Ld/h1;

    invoke-virtual {p0}, Ld/h1;->o()I

    move-result v0

    invoke-virtual {p1}, Ld/h1;->o()I

    move-result v2

    if-eq v2, v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_3

    iget-object v3, p0, Ld/h1;->a:[Ld/q;

    aget-object v3, v3, v2

    invoke-interface {v3}, Ld/q;->d()Ld/b1;

    move-result-object v3

    iget-object v4, p1, Ld/h1;->a:[Ld/q;

    aget-object v4, v4, v2

    invoke-interface {v4}, Ld/q;->d()Ld/b1;

    move-result-object v4

    if-eq v3, v4, :cond_2

    invoke-virtual {v3, v4}, Ld/b1;->g(Ld/b1;)Z

    move-result v3

    if-nez v3, :cond_2

    :goto_1
    return v1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    array-length v0, v0

    add-int/lit8 v1, v0, 0x1

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    mul-int/lit16 v1, v1, 0x101

    iget-object v2, p0, Ld/h1;->a:[Ld/q;

    aget-object v2, v2, v0

    invoke-interface {v2}, Ld/q;->d()Ld/b1;

    move-result-object v2

    invoke-virtual {v2}, Ld/b1;->hashCode()I

    move-result v2

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public j()Ld/b1;
    .locals 3

    new-instance v0, Ld/x;

    iget-object v1, p0, Ld/h1;->a:[Ld/q;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld/x;-><init>([Ld/q;I)V

    const/4 v1, -0x1

    iput v1, v0, Ld/x;->c:I

    return-object v0
.end method

.method public k()Ld/b1;
    .locals 3

    new-instance v0, Ld/x;

    iget-object v1, p0, Ld/h1;->a:[Ld/q;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ld/x;-><init>([Ld/q;I)V

    const/4 v1, -0x1

    iput v1, v0, Ld/x;->c:I

    return-object v0
.end method

.method public l(I)Ld/q;
    .locals 1

    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final n()[Ld/g;
    .locals 6

    invoke-virtual {p0}, Ld/h1;->o()I

    move-result v0

    new-array v1, v0, [Ld/g;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    iget-object v3, p0, Ld/h1;->a:[Ld/q;

    aget-object v3, v3, v2

    if-eqz v3, :cond_2

    instance-of v4, v3, Ld/g;

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v3}, Ld/q;->d()Ld/b1;

    move-result-object v4

    instance-of v5, v4, Ld/g;

    if-eqz v5, :cond_1

    check-cast v4, Ld/g;

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "illegal object in getInstance: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    move-object v4, v3

    check-cast v4, Ld/g;

    :goto_2
    aput-object v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public o()I
    .locals 1

    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    array-length v0, v0

    return v0
.end method

.method public abstract p()Ld/g;
.end method

.method public abstract q()Ld/x0;
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Ld/h1;->o()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "[]"

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v2, "["

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Ld/h1;->a:[Ld/q;

    aget-object v3, v3, v2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v0, :cond_1

    const/16 v0, 0x5d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v3, ", "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0
.end method
