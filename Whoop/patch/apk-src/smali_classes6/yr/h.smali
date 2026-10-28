.class public final Lyr/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public E:I

.field public F:I

.field public final synthetic G:Lty/c;

.field public w:I

.field public x:Ljava/lang/String;

.field public final y:Ljava/lang/CharSequence;

.field public final z:Lyr/a;


# direct methods
.method public constructor <init>(Lty/c;Lab/h0;Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyr/h;->G:Lty/c;

    const/4 p1, 0x2

    iput p1, p0, Lyr/h;->w:I

    const/4 p1, 0x0

    iput p1, p0, Lyr/h;->E:I

    iget-object p1, p2, Lab/h0;->y:Ljava/lang/Object;

    check-cast p1, Lyr/a;

    iput-object p1, p0, Lyr/h;->z:Lyr/a;

    iget p1, p2, Lab/h0;->x:I

    iput p1, p0, Lyr/h;->F:I

    iput-object p3, p0, Lyr/h;->y:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 9

    iget v0, p0, Lyr/h;->w:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_c

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_b

    const/4 v3, 0x2

    if-eq v0, v3, :cond_a

    iput v1, p0, Lyr/h;->w:I

    iget v0, p0, Lyr/h;->E:I

    :cond_0
    :goto_0
    iget v1, p0, Lyr/h;->E:I

    const/4 v3, -0x1

    const/4 v4, 0x3

    if-eq v1, v3, :cond_9

    iget-object v5, p0, Lyr/h;->G:Lty/c;

    iget-object v5, v5, Lty/c;->x:Ljava/lang/Object;

    check-cast v5, Lyr/b;

    iget-object v6, p0, Lyr/h;->y:Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    invoke-static {v1, v7}, Lrj/o;->k(II)V

    :goto_1
    if-ge v1, v7, :cond_2

    invoke-interface {v6, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-virtual {v5, v8}, Lyr/b;->a(C)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_2
    if-ne v1, v3, :cond_3

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v3, p0, Lyr/h;->E:I

    goto :goto_3

    :cond_3
    add-int/lit8 v5, v1, 0x1

    iput v5, p0, Lyr/h;->E:I

    :goto_3
    iget v5, p0, Lyr/h;->E:I

    if-ne v5, v0, :cond_4

    add-int/lit8 v5, v5, 0x1

    iput v5, p0, Lyr/h;->E:I

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le v5, v1, :cond_0

    iput v3, p0, Lyr/h;->E:I

    goto :goto_0

    :cond_4
    :goto_4
    iget-object v5, p0, Lyr/h;->z:Lyr/a;

    if-ge v0, v1, :cond_5

    invoke-interface {v6, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-virtual {v5, v7}, Lyr/a;->a(C)Z

    move-result v7

    if-eqz v7, :cond_5

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    if-le v1, v0, :cond_6

    add-int/lit8 v7, v1, -0x1

    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-virtual {v5, v7}, Lyr/a;->a(C)Z

    move-result v7

    if-eqz v7, :cond_6

    add-int/lit8 v1, v1, -0x1

    goto :goto_5

    :cond_6
    iget v7, p0, Lyr/h;->F:I

    if-ne v7, v2, :cond_7

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v3, p0, Lyr/h;->E:I

    :goto_6
    if-le v1, v0, :cond_8

    add-int/lit8 v3, v1, -0x1

    invoke-interface {v6, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {v5, v3}, Lyr/a;->a(C)Z

    move-result v3

    if-eqz v3, :cond_8

    add-int/lit8 v1, v1, -0x1

    goto :goto_6

    :cond_7
    sub-int/2addr v7, v2

    iput v7, p0, Lyr/h;->F:I

    :cond_8
    invoke-interface {v6, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_9
    iput v4, p0, Lyr/h;->w:I

    const/4 v0, 0x0

    :goto_7
    iput-object v0, p0, Lyr/h;->x:Ljava/lang/String;

    iget v0, p0, Lyr/h;->w:I

    if-eq v0, v4, :cond_a

    iput v2, p0, Lyr/h;->w:I

    return v2

    :cond_a
    const/4 v0, 0x0

    return v0

    :cond_b
    return v2

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lyr/h;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lyr/h;->w:I

    iget-object v0, p0, Lyr/h;->x:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lyr/h;->x:Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
