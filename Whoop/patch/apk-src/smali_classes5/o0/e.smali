.class public final Lo0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/o;


# instance fields
.field public final a:Lo0/y;


# direct methods
.method public constructor <init>(Lo0/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/e;->a:Lo0/y;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lo0/e;->a:Lo0/y;

    invoke-virtual {v1}, Lo0/y;->g()Lo0/o;

    move-result-object v2

    iget-object v2, v2, Lo0/o;->m:Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    return v3

    :cond_0
    invoke-virtual {v1}, Lo0/y;->g()Lo0/o;

    move-result-object v2

    iget-object v4, v2, Lo0/o;->q:Lh0/d2;

    sget-object v5, Lh0/d2;->w:Lh0/d2;

    const/16 v6, 0x20

    const-wide v7, 0xffffffffL

    if-ne v4, v5, :cond_1

    invoke-virtual {v2}, Lo0/o;->e()J

    move-result-wide v9

    and-long/2addr v9, v7

    :goto_0
    long-to-int v2, v9

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lo0/o;->e()J

    move-result-wide v9

    shr-long/2addr v9, v6

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lo0/y;->g()Lo0/o;

    move-result-object v1

    iget-object v4, v1, Lo0/o;->q:Lh0/d2;

    const/4 v9, 0x1

    if-ne v4, v5, :cond_2

    move v4, v9

    goto :goto_2

    :cond_2
    move v4, v3

    :goto_2
    iget-object v5, v1, Lo0/o;->m:Ljava/lang/Object;

    move v10, v3

    move v11, v10

    move v12, v11

    :goto_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v13

    if-ge v10, v13, :cond_6

    invoke-static {v4, v1, v10}, Luf/c0;->q0(ZLo0/o;I)I

    move-result v13

    const/4 v14, -0x1

    if-ne v13, v14, :cond_3

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_3
    move v14, v3

    :goto_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v15

    if-ge v10, v15, :cond_5

    invoke-static {v4, v1, v10}, Luf/c0;->q0(ZLo0/o;I)I

    move-result v15

    if-ne v15, v13, :cond_5

    if-eqz v4, :cond_4

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lo0/p;

    move/from16 v16, v4

    iget-wide v3, v15, Lo0/p;->s:J

    and-long/2addr v3, v7

    :goto_5
    long-to-int v3, v3

    goto :goto_6

    :cond_4
    move/from16 v16, v4

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo0/p;

    iget-wide v3, v3, Lo0/p;->s:J

    shr-long/2addr v3, v6

    goto :goto_5

    :goto_6
    invoke-static {v14, v3}, Ljava/lang/Math;->max(II)I

    move-result v14

    add-int/lit8 v10, v10, 0x1

    move/from16 v4, v16

    const/4 v3, 0x0

    goto :goto_4

    :cond_5
    move/from16 v16, v4

    add-int/2addr v11, v14

    add-int/lit8 v12, v12, 0x1

    move/from16 v4, v16

    const/4 v3, 0x0

    goto :goto_3

    :cond_6
    div-int/2addr v11, v12

    iget v1, v1, Lo0/o;->s:I

    add-int/2addr v11, v1

    if-nez v11, :cond_7

    goto :goto_7

    :cond_7
    div-int/2addr v2, v11

    if-ge v2, v9, :cond_8

    :goto_7
    return v9

    :cond_8
    return v2
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lo0/e;->a:Lo0/y;

    invoke-virtual {v0}, Lo0/y;->g()Lo0/o;

    move-result-object v0

    iget-object v0, v0, Lo0/o;->m:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lo0/e;->a:Lo0/y;

    iget-object v0, v0, Lo0/y;->d:Lc33/c;

    iget-object v0, v0, Lc33/c;->c:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lo0/e;->a:Lo0/y;

    invoke-virtual {v0}, Lo0/y;->g()Lo0/o;

    move-result-object v0

    iget-object v0, v0, Lo0/o;->m:Ljava/lang/Object;

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/p;

    iget v0, v0, Lo0/p;->a:I

    return v0
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Lo0/e;->a:Lo0/y;

    invoke-virtual {v0}, Lo0/y;->g()Lo0/o;

    move-result-object v0

    iget v0, v0, Lo0/o;->p:I

    return v0
.end method
