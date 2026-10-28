.class public final Lu1/b;
.super Lu1/a;
.source "SourceFile"

# interfaces
.implements Ld93/d;


# instance fields
.field public final y:Lm83/t;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm83/t;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lu1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lu1/b;->y:Lm83/t;

    iput-object p3, p0, Lu1/b;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu1/b;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lu1/b;->z:Ljava/lang/Object;

    iput-object p1, p0, Lu1/b;->z:Ljava/lang/Object;

    iget-object v1, p0, Lu1/b;->y:Lm83/t;

    iget-object v1, v1, Lm83/t;->x:Ljava/lang/Object;

    check-cast v1, Lu1/f;

    iget-object v2, v1, Lu1/f;->z:Lu1/e;

    iget-object v3, p0, Lu1/a;->w:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lu1/e;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    return-object v0

    :cond_0
    iget-boolean v4, v1, Lu1/d;->y:Z

    if-eqz v4, :cond_3

    if-eqz v4, :cond_2

    iget-object v4, v1, Lu1/d;->w:[Lu1/p;

    iget v5, v1, Lu1/d;->x:I

    aget-object v4, v4, v5

    iget-object v5, v4, Lu1/p;->w:[Ljava/lang/Object;

    iget v4, v4, Lu1/p;->y:I

    aget-object v4, v5, v4

    invoke-virtual {v2, v3, p1}, Lu1/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_1
    move v3, p1

    :goto_0
    iget-object v5, v2, Lu1/e;->y:Lu1/o;

    invoke-virtual {v1, v3, v5, v4, p1}, Lu1/f;->c(ILu1/o;Ljava/lang/Object;I)V

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    :cond_3
    invoke-virtual {v2, v3, p1}, Lu1/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget p1, v2, Lu1/e;->E:I

    iput p1, v1, Lu1/f;->G:I

    return-object v0
.end method
