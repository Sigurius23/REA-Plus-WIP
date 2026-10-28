.class public final Lo0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/s0;


# instance fields
.field public final synthetic a:Lo0/y;


# direct methods
.method public constructor <init>(Lo0/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/b0;->a:Lo0/y;

    return-void
.end method


# virtual methods
.method public final a(ILg1/j5;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lo0/y;->w:Lp0/n0;

    iget-object v0, p0, Lo0/b0;->a:Lo0/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lkd/f;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lkd/f;-><init>(Lo0/y;ILq83/d;)V

    sget-object p1, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {v0, p1, v1, p2}, Lo0/y;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method

.method public final b()I
    .locals 2

    iget-object v0, p0, Lo0/b0;->a:Lo0/y;

    invoke-virtual {v0}, Lo0/y;->g()Lo0/o;

    move-result-object v1

    iget v1, v1, Lo0/o;->n:I

    neg-int v1, v1

    invoke-virtual {v0}, Lo0/y;->g()Lo0/o;

    move-result-object v0

    iget v0, v0, Lo0/o;->r:I

    add-int/2addr v1, v0

    return v1
.end method

.method public final c()F
    .locals 3

    iget-object v0, p0, Lo0/b0;->a:Lo0/y;

    iget-object v1, v0, Lo0/y;->d:Lc33/c;

    iget-object v1, v1, Lc33/c;->c:Ljava/lang/Object;

    check-cast v1, Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    iget-object v2, v0, Lo0/y;->d:Lc33/c;

    iget-object v2, v2, Lc33/c;->b:Ljava/lang/Object;

    check-cast v2, Lp1/h1;

    invoke-virtual {v2}, Lp1/h1;->x()I

    move-result v2

    invoke-virtual {v0}, Lo0/y;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    mul-int/lit16 v1, v1, 0x1f4

    add-int/2addr v1, v2

    int-to-float v0, v1

    const/16 v1, 0x64

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0

    :cond_0
    mul-int/lit16 v1, v1, 0x1f4

    add-int/2addr v1, v2

    int-to-float v0, v1

    return v0
.end method

.method public final d()Li3/b;
    .locals 2

    new-instance v0, Li3/b;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Li3/b;-><init>(II)V

    return-object v0
.end method

.method public final e()I
    .locals 4

    iget-object v0, p0, Lo0/b0;->a:Lo0/y;

    invoke-virtual {v0}, Lo0/y;->g()Lo0/o;

    move-result-object v1

    iget-object v1, v1, Lo0/o;->q:Lh0/d2;

    sget-object v2, Lh0/d2;->w:Lh0/d2;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lo0/y;->g()Lo0/o;

    move-result-object v0

    invoke-virtual {v0}, Lo0/o;->e()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    :goto_0
    long-to-int v0, v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lo0/y;->g()Lo0/o;

    move-result-object v0

    invoke-virtual {v0}, Lo0/o;->e()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    goto :goto_0
.end method

.method public final f()F
    .locals 2

    iget-object v0, p0, Lo0/b0;->a:Lo0/y;

    iget-object v1, v0, Lo0/y;->d:Lc33/c;

    iget-object v1, v1, Lc33/c;->c:Ljava/lang/Object;

    check-cast v1, Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    iget-object v0, v0, Lo0/y;->d:Lc33/c;

    iget-object v0, v0, Lc33/c;->b:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    mul-int/lit16 v1, v1, 0x1f4

    add-int/2addr v1, v0

    int-to-float v0, v1

    return v0
.end method
