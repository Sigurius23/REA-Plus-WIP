.class public final Ln0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/o;


# instance fields
.field public final a:Ln0/u;


# direct methods
.method public constructor <init>(Ln0/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/c;->a:Ln0/u;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 3

    iget-object v0, p0, Ln0/c;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    iget-object v1, v1, Ln0/n;->k:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    invoke-static {v1}, Lse/h;->G(Ln0/n;)I

    move-result v1

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    invoke-static {v0}, Lse/a;->k0(Ln0/n;)I

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    div-int/2addr v1, v0

    if-ge v1, v2, :cond_2

    :goto_0
    return v2

    :cond_2
    return v1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Ln0/c;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget-object v0, v0, Ln0/n;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, Ln0/c;->a:Ln0/u;

    iget-object v0, v0, Ln0/u;->e:Ll2/a;

    iget-object v0, v0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 2

    invoke-virtual {p0}, Ln0/c;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Ln0/c;->a:Ln0/u;

    invoke-virtual {v1}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    iget-object v1, v1, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {v1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/g;

    check-cast v1, Ln0/o;

    iget v1, v1, Ln0/o;->a:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Ln0/c;->a:Ln0/u;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget v0, v0, Ln0/n;->n:I

    return v0
.end method
