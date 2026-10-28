.class public final Lu1/q;
.super Lu1/p;
.source "SourceFile"


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lu1/p;->y:I

    add-int/lit8 v1, v0, 0x2

    iput v1, p0, Lu1/p;->y:I

    new-instance v1, Lu1/a;

    iget-object v2, p0, Lu1/p;->w:[Ljava/lang/Object;

    aget-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    aget-object v0, v2, v0

    invoke-direct {v1, v3, v0}, Lu1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
