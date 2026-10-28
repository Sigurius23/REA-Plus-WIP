.class public abstract Ltp0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ll3/g;",
        "input",
        "a",
        "(Ll3/g;Landroidx/compose/runtime/Composer;I)Ll3/g;",
        "add-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ll3/g;Landroidx/compose/runtime/Composer;I)Ll3/g;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "**"

    const-string v3, "substring(...)"

    const-string v4, "\n"

    const-string v5, "input"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v1, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v5, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    new-instance v5, Ll3/d;

    invoke-direct {v5}, Ll3/d;-><init>()V

    new-instance v6, Ll3/b0;

    const/16 v8, 0x1fe

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-direct {v6, v9, v10, v8}, Ll3/b0;-><init>(ILw3/q;I)V

    invoke-virtual {v5, v6}, Ll3/d;->i(Ll3/b0;)I

    move-result v6

    :try_start_0
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x6

    invoke-static {v0, v8, v9}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v11, 0x0

    move v12, v11

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v14, v12, 0x1

    if-ltz v12, :cond_2

    check-cast v13, Ljava/lang/String;

    invoke-static {v13, v2, v11, v11, v9}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v15

    invoke-static {v13, v2, v11, v9}, Lyb3/r;->l0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    move-result v10

    const v9, 0xfffe

    const/4 v11, -0x1

    if-eq v15, v11, :cond_0

    if-eq v10, v11, :cond_0

    if-ge v15, v10, :cond_0

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v11

    invoke-virtual {v11}, Lb91/a;->d()Ll3/v0;

    move-result-object v11

    iget-object v11, v11, Ll3/v0;->a:Ll3/m0;

    move-object/from16 v17, v1

    move-object/from16 v16, v2

    invoke-virtual/range {v17 .. v17}, Ly81/i;->b1()J

    move-result-wide v1

    move-object/from16 v18, v7

    const/4 v7, 0x0

    invoke-static {v11, v1, v2, v7, v9}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v1

    invoke-virtual {v5, v1}, Ll3/d;->j(Ll3/m0;)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v13, v2, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    invoke-virtual/range {v18 .. v18}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    move-object v7, v3

    invoke-virtual/range {v17 .. v17}, Ly81/i;->y()J

    move-result-wide v2

    sget-object v11, Lp3/r;->I:Lp3/r;

    const v9, 0xfffa

    invoke-static {v1, v2, v3, v11, v9}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v1

    invoke-virtual {v5, v1}, Ll3/d;->j(Ll3/m0;)I

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v15, v15, 0x2

    :try_start_3
    invoke-virtual {v13, v15, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    invoke-virtual/range {v18 .. v18}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    invoke-virtual/range {v17 .. v17}, Ly81/i;->b1()J

    move-result-wide v2

    const v9, 0xfffe

    const/4 v11, 0x0

    invoke-static {v1, v2, v3, v11, v9}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v1

    invoke-virtual {v5, v1}, Ll3/d;->j(Ll3/m0;)I

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    add-int/lit8 v10, v10, 0x2

    :try_start_5
    invoke-virtual {v13, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    throw v0

    :catchall_2
    move-exception v0

    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    throw v0

    :catchall_3
    move-exception v0

    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    throw v0

    :cond_0
    move-object/from16 v17, v1

    move-object/from16 v16, v2

    move-object/from16 v18, v7

    move-object v7, v3

    invoke-virtual/range {v18 .. v18}, Lb91/d;->b()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    invoke-virtual/range {v17 .. v17}, Ly81/i;->b1()J

    move-result-wide v2

    const v9, 0xfffe

    const/4 v11, 0x0

    invoke-static {v1, v2, v3, v11, v9}, Ll3/m0;->a(Ll3/m0;JLp3/r;I)Ll3/m0;

    move-result-object v1

    invoke-virtual {v5, v1}, Ll3/d;->j(Ll3/m0;)I

    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    invoke-virtual {v5, v13}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    :goto_1
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v0, v1, v2}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-eq v12, v1, :cond_1

    invoke-virtual {v5, v4}, Ll3/d;->b(Ljava/lang/String;)V

    :cond_1
    move v9, v2

    move-object v3, v7

    move v12, v14

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v7, v18

    const/4 v10, 0x0

    const/4 v11, 0x0

    goto/16 :goto_0

    :catchall_4
    move-exception v0

    invoke-virtual {v5, v1}, Ll3/d;->f(I)V

    throw v0

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v11, 0x0

    throw v11
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :cond_3
    invoke-virtual {v5, v6}, Ll3/d;->f(I)V

    invoke-virtual {v5}, Ll3/d;->k()Ll3/g;

    move-result-object v0

    return-object v0

    :goto_2
    invoke-virtual {v5, v6}, Ll3/d;->f(I)V

    throw v0
.end method
