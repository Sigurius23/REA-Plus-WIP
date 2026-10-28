.class public final Lcg3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic E:La33/d;

.field public final w:Ljava/lang/CharSequence;

.field public x:Ldg3/a;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(La33/d;Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcg3/a;->E:La33/d;

    const/4 p1, 0x0

    iput-object p1, p0, Lcg3/a;->x:Ldg3/a;

    const/4 p1, 0x0

    iput p1, p0, Lcg3/a;->y:I

    iput p1, p0, Lcg3/a;->z:I

    iput-object p2, p0, Lcg3/a;->w:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 6

    iget-object v0, p0, Lcg3/a;->x:Ldg3/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcg3/a;->w:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    :goto_0
    iget v3, p0, Lcg3/a;->y:I

    if-ge v3, v2, :cond_6

    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x3a

    iget-object v5, p0, Lcg3/a;->E:La33/d;

    if-eq v3, v4, :cond_3

    const/16 v4, 0x40

    if-eq v3, v4, :cond_2

    const/16 v4, 0x77

    if-eq v3, v4, :cond_1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    iget-object v3, v5, La33/d;->y:Ljava/lang/Object;

    check-cast v3, Lkr/e;

    goto :goto_1

    :cond_2
    iget-object v3, v5, La33/d;->z:Ljava/lang/Object;

    check-cast v3, Lkr/e;

    goto :goto_1

    :cond_3
    iget-object v3, v5, La33/d;->x:Ljava/lang/Object;

    check-cast v3, Lu00/e;

    :goto_1
    if-eqz v3, :cond_5

    iget v4, p0, Lcg3/a;->y:I

    iget v5, p0, Lcg3/a;->z:I

    invoke-interface {v3, v0, v4, v5}, Ldg3/b;->l(Ljava/lang/CharSequence;II)Ldg3/a;

    move-result-object v3

    if-eqz v3, :cond_4

    iput-object v3, p0, Lcg3/a;->x:Ldg3/a;

    iget v0, v3, Ldg3/a;->y:I

    iput v0, p0, Lcg3/a;->y:I

    iput v0, p0, Lcg3/a;->z:I

    goto :goto_2

    :cond_4
    iget v3, p0, Lcg3/a;->y:I

    add-int/2addr v3, v1

    iput v3, p0, Lcg3/a;->y:I

    goto :goto_0

    :cond_5
    iget v3, p0, Lcg3/a;->y:I

    add-int/2addr v3, v1

    iput v3, p0, Lcg3/a;->y:I

    goto :goto_0

    :cond_6
    :goto_2
    iget-object v0, p0, Lcg3/a;->x:Ldg3/a;

    if-eqz v0, :cond_7

    return v1

    :cond_7
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lcg3/a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcg3/a;->x:Ldg3/a;

    const/4 v1, 0x0

    iput-object v1, p0, Lcg3/a;->x:Ldg3/a;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
