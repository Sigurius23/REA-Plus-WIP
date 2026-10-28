.class public final Lcg3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final w:Ljava/lang/CharSequence;

.field public final x:Lcg3/a;

.field public y:I

.field public z:Ldg3/a;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Lcg3/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcg3/b;->y:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcg3/b;->z:Ldg3/a;

    iput-object p1, p0, Lcg3/b;->w:Ljava/lang/CharSequence;

    iput-object p2, p0, Lcg3/b;->x:Lcg3/a;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lcg3/b;->y:I

    iget-object v1, p0, Lcg3/b;->w:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lcg3/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcg3/b;->z:Ldg3/a;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcg3/b;->x:Lcg3/a;

    invoke-virtual {v0}, Lcg3/a;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcg3/a;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcg3/a;->x:Ldg3/a;

    iput-object v1, v0, Lcg3/a;->x:Ldg3/a;

    iput-object v2, p0, Lcg3/b;->z:Ldg3/a;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, Lcg3/b;->w:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    new-instance v1, Lc9/k;

    iget v2, p0, Lcg3/b;->y:I

    const/4 v3, 0x1

    invoke-direct {v1, v2, v0, v3}, Lc9/k;-><init>(III)V

    iput v0, p0, Lcg3/b;->y:I

    return-object v1

    :cond_2
    :goto_0
    iget v0, p0, Lcg3/b;->y:I

    iget-object v2, p0, Lcg3/b;->z:Ldg3/a;

    iget v3, v2, Ldg3/a;->x:I

    if-ge v0, v3, :cond_3

    new-instance v1, Lc9/k;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v3, v2}, Lc9/k;-><init>(III)V

    iput v3, p0, Lcg3/b;->y:I

    return-object v1

    :cond_3
    iget v0, v2, Ldg3/a;->y:I

    iput v0, p0, Lcg3/b;->y:I

    iput-object v1, p0, Lcg3/b;->z:Ldg3/a;

    return-object v2

    :cond_4
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
