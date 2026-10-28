.class public final Ly2/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/v1;


# instance fields
.field public w:Ly3/m;

.field public x:F

.field public y:F

.field public final synthetic z:Ly2/n0;


# direct methods
.method public constructor <init>(Ly2/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/h0;->z:Ly2/n0;

    sget-object p1, Ly3/m;->x:Ly3/m;

    iput-object p1, p0, Ly2/h0;->w:Ly3/m;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 3

    iget-object v0, p0, Ly2/h0;->z:Ly2/n0;

    iget-object v1, v0, Ly2/n0;->w:La3/n0;

    invoke-virtual {v1}, La3/n0;->v()La3/h0;

    move-result-object v1

    sget-object v2, La3/h0;->z:La3/h0;

    if-eq v1, v2, :cond_1

    iget-object v0, v0, Ly2/n0;->w:La3/n0;

    invoke-virtual {v0}, La3/n0;->v()La3/h0;

    move-result-object v0

    sget-object v1, La3/h0;->x:La3/h0;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getDensity()F
    .locals 1

    iget v0, p0, Ly2/h0;->x:F

    return v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, Ly2/h0;->w:Ly3/m;

    return-object v0
.end method

.method public final m0()F
    .locals 1

    iget v0, p0, Ly2/h0;->y:F

    return v0
.end method

.method public final s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;
    .locals 10

    iget-object v0, p0, Ly2/h0;->z:Ly2/n0;

    invoke-virtual {v0}, Ly2/n0;->d()V

    iget-object v1, v0, Ly2/n0;->w:La3/n0;

    invoke-virtual {v1}, La3/n0;->v()La3/h0;

    move-result-object v2

    sget-object v3, La3/h0;->w:La3/h0;

    if-eq v2, v3, :cond_1

    sget-object v4, La3/h0;->y:La3/h0;

    if-eq v2, v4, :cond_1

    sget-object v4, La3/h0;->x:La3/h0;

    if-eq v2, v4, :cond_1

    sget-object v4, La3/h0;->z:La3/h0;

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    const-string v4, "subcompose can only be used inside the measure or layout blocks"

    invoke-static {v4}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v4, v0, Ly2/n0;->G:La0/v0;

    invoke-virtual {v4, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v5, :cond_5

    iget-object v5, v0, Ly2/n0;->J:La0/v0;

    invoke-virtual {v5, p1}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La3/n0;

    if-eqz v5, :cond_3

    iget v8, v0, Ly2/n0;->O:I

    if-lez v8, :cond_2

    goto :goto_1

    :cond_2
    const-string v8, "Check failed."

    invoke-static {v8}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_1
    iget v8, v0, Ly2/n0;->O:I

    add-int/lit8 v8, v8, -0x1

    iput v8, v0, Ly2/n0;->O:I

    goto :goto_2

    :cond_3
    invoke-virtual {v0, p1}, Ly2/n0;->j(Ljava/lang/Object;)La3/n0;

    move-result-object v5

    if-nez v5, :cond_4

    iget v5, v0, Ly2/n0;->z:I

    new-instance v8, La3/n0;

    const/4 v9, 0x2

    invoke-direct {v8, v9}, La3/n0;-><init>(I)V

    iput-boolean v7, v1, La3/n0;->P:Z

    invoke-virtual {v1, v5, v8}, La3/n0;->O(ILa3/n0;)V

    iput-boolean v6, v1, La3/n0;->P:Z

    move-object v5, v8

    :cond_4
    :goto_2
    invoke-virtual {v4, p1, v5}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    check-cast v5, La3/n0;

    invoke-virtual {v1}, La3/n0;->r()Ljava/util/List;

    move-result-object v4

    iget v8, v0, Ly2/n0;->z:I

    invoke-static {v8, v4}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v5, :cond_7

    invoke-virtual {v1}, La3/n0;->r()Ljava/util/List;

    move-result-object v4

    check-cast v4, Lr1/b;

    iget-object v4, v4, Lr1/b;->w:Lr1/c;

    invoke-virtual {v4, v5}, Lr1/c;->j(Ljava/lang/Object;)I

    move-result v4

    iget v8, v0, Ly2/n0;->z:I

    if-lt v4, v8, :cond_6

    goto :goto_3

    :cond_6
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Key \""

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lx2/a;->a(Ljava/lang/String;)V

    :goto_3
    iget v8, v0, Ly2/n0;->z:I

    if-eq v8, v4, :cond_7

    iput-boolean v7, v1, La3/n0;->P:Z

    invoke-virtual {v1, v4, v8, v7}, La3/n0;->i0(III)V

    iput-boolean v6, v1, La3/n0;->P:Z

    :cond_7
    iget v1, v0, Ly2/n0;->z:I

    add-int/2addr v1, v7

    iput v1, v0, Ly2/n0;->z:I

    invoke-virtual {v0, v5, p1, v6, p2}, Ly2/n0;->i(La3/n0;Ljava/lang/Object;ZLc93/m;)V

    if-eq v2, v3, :cond_9

    sget-object p1, La3/h0;->y:La3/h0;

    if-ne v2, p1, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v5}, La3/n0;->o()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_9
    :goto_4
    invoke-virtual {v5}, La3/n0;->p()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final x0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ly2/s0;
    .locals 9

    const/high16 v0, -0x1000000

    and-int v1, p1, v0

    if-nez v1, :cond_0

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Size("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    new-instance v1, Ly2/g0;

    iget-object v7, p0, Ly2/h0;->z:Ly2/n0;

    move-object v6, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Ly2/g0;-><init>(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Ly2/h0;Ly2/n0;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method
