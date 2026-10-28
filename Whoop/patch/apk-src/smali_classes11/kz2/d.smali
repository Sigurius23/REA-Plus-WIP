.class public abstract Lkz2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Liz0/m;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)Liz0/m;",
        "whooplabs_release"
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
.method public static final a(Landroidx/compose/runtime/Composer;I)Liz0/m;
    .locals 38

    move-object/from16 v0, p0

    sget-object v1, Liz0/l;->a:Liz0/l;

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v4

    invoke-virtual {v4}, Lb91/a;->d()Ll3/v0;

    move-result-object v4

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v10

    const/4 v7, 0x1

    int-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v22, v7, v8

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    new-instance v15, Liz0/a;

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->N()Lb91/a;

    move-result-object v9

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->N()Lb91/a;

    move-result-object v12

    invoke-virtual {v12}, Lb91/a;->d()Ll3/v0;

    move-result-object v23

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v24

    const/16 v36, 0x0

    const v37, 0xfffffe

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    invoke-static/range {v23 .. v37}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x2

    invoke-static {v9, v12, v13, v14, v13}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v9

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->O()Lb91/a;

    move-result-object v12

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->O()Lb91/a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/a;->d()Ll3/v0;

    move-result-object v23

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->y()J

    move-result-wide v24

    move-object/from16 p1, v1

    invoke-static/range {v23 .. v37}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v1

    invoke-static {v12, v1, v13, v14, v13}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v1

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->P()Lb91/a;

    move-result-object v12

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->P()Lb91/a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/a;->d()Ll3/v0;

    move-result-object v23

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->y()J

    move-result-wide v24

    move-object/from16 v16, v4

    invoke-static/range {v23 .. v37}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v4

    invoke-static {v12, v4, v13, v14, v13}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v4

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->Q()Lb91/a;

    move-result-object v12

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lb91/d;->Q()Lb91/a;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lb91/a;->d()Ll3/v0;

    move-result-object v23

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v24

    invoke-static/range {v23 .. v37}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v2

    invoke-static {v12, v2, v13, v14, v13}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v2

    invoke-direct {v15, v9, v1, v4, v2}, Liz0/a;-><init>(Lb91/a;Lb91/a;Lb91/a;Lb91/a;)V

    sget v1, Liz0/a;->e:I

    shl-int/lit8 v24, v1, 0x18

    sget v1, Liz0/l;->b:I

    shl-int/lit8 v1, v1, 0xf

    or-int/lit16 v1, v1, 0x6000

    const/16 v26, 0x3ed8

    move-wide v3, v5

    move-wide v5, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v2, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v23, v0

    move/from16 v25, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v26}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v0

    return-object v0
.end method
