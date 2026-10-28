.class public final Lq0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/o;


# instance fields
.field public final a:Lq0/y;

.field public final b:I


# direct methods
.method public constructor <init>(Lq0/y;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/f;->a:Lq0/y;

    iput p2, p0, Lq0/f;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 3

    iget-object v0, p0, Lq0/f;->a:Lq0/y;

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v1

    iget-object v1, v1, Lq0/q;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v1

    invoke-static {v1}, Lds/p;->I(Lq0/q;)I

    move-result v1

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v2

    iget v2, v2, Lq0/q;->b:I

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v0

    iget v0, v0, Lq0/q;->c:I

    add-int/2addr v2, v0

    const/4 v0, 0x1

    if-nez v2, :cond_1

    return v0

    :cond_1
    div-int/2addr v1, v2

    if-ge v1, v0, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lq0/f;->a:Lq0/y;

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v0

    iget-object v0, v0, Lq0/q;->a:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, Lq0/f;->a:Lq0/y;

    iget v0, v0, Lq0/y;->e:I

    iget v1, p0, Lq0/f;->b:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 3

    iget-object v0, p0, Lq0/f;->a:Lq0/y;

    invoke-virtual {v0}, Lq0/y;->m()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0}, Lq0/y;->l()Lq0/q;

    move-result-object v0

    iget-object v0, v0, Lq0/q;->a:Ljava/util/List;

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/d;

    iget v0, v0, Lq0/d;->a:I

    iget v2, p0, Lq0/f;->b:I

    add-int/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Lq0/f;->a:Lq0/y;

    invoke-virtual {v0}, Lq0/y;->m()I

    move-result v0

    return v0
.end method
