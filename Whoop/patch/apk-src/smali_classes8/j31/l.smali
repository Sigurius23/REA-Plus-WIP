.class public abstract Lj31/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0008\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00002\u001c\u0008\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkotlin/Function2;",
        "Lj31/d;",
        "Ll83/a0;",
        "onMove",
        "Ln0/u;",
        "listState",
        "",
        "canDragOver",
        "",
        "onDragEnd",
        "Ly3/f;",
        "maxScrollPerFrame",
        "Lj31/b;",
        "dragCancelledAnimation",
        "Lj31/k;",
        "a",
        "(Lc93/m;Ln0/u;Lc93/m;Lc93/m;FLj31/b;Landroidx/compose/runtime/Composer;II)Lj31/k;",
        "design_release"
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
.method public static final a(Lc93/m;Ln0/u;Lc93/m;Lc93/m;FLj31/b;Landroidx/compose/runtime/Composer;II)Lj31/k;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Ln0/u;",
            "Lc93/m;",
            "Lc93/m;",
            "F",
            "Lj31/b;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Lj31/k;"
        }
    .end annotation

    move-object/from16 v0, p6

    const-string v1, "onMove"

    move-object/from16 v6, p0

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p8, 0x2

    const/4 v10, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x3

    invoke-static {v10, v10, v0, v1}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v1

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v1, p8, 0x4

    const/4 v11, 0x0

    if-eqz v1, :cond_1

    move-object v7, v11

    goto :goto_1

    :cond_1
    move-object/from16 v7, p2

    :goto_1
    and-int/lit8 v1, p8, 0x8

    if-eqz v1, :cond_2

    move-object v8, v11

    goto :goto_2

    :cond_2
    move-object/from16 v8, p3

    :goto_2
    and-int/lit8 v1, p8, 0x10

    if-eqz v1, :cond_3

    const/16 v1, 0x14

    int-to-float v1, v1

    goto :goto_3

    :cond_3
    move/from16 v1, p4

    :goto_3
    const/16 v12, 0x20

    and-int/lit8 v2, p8, 0x20

    const/4 v13, 0x1

    if-eqz v2, :cond_4

    new-instance v2, Lj31/o;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v13, v11}, Lj31/o;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object/from16 v9, p5

    :goto_4
    sget-object v2, Lb3/v1;->h:Lp1/u2;

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    invoke-interface {v2, v1}, Ly3/c;->q0(F)F

    move-result v5

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v1, v14, :cond_5

    invoke-static {v0}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v4, v1

    check-cast v4, Lbc3/c0;

    and-int/lit8 v1, p7, 0x70

    xor-int/lit8 v1, v1, 0x30

    if-le v1, v12, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_6
    and-int/lit8 v2, p7, 0x30

    if-ne v2, v12, :cond_8

    :cond_7
    move v2, v13

    goto :goto_5

    :cond_8
    move v2, v10

    :goto_5
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v2, :cond_9

    if-ne v15, v14, :cond_a

    :cond_9
    new-instance v2, Lj31/k;

    invoke-direct/range {v2 .. v9}, Lj31/k;-><init>(Ln0/u;Lbc3/c0;FLc93/m;Lc93/m;Lc93/m;Lj31/b;)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v15, v2

    :cond_a
    check-cast v15, Lj31/k;

    sget-object v2, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ly3/m;->x:Ly3/m;

    if-ne v2, v4, :cond_b

    move v2, v13

    goto :goto_6

    :cond_b
    move v2, v10

    :goto_6
    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_c

    if-ne v5, v14, :cond_d

    :cond_c
    new-instance v5, Lj31/l$a;

    invoke-direct {v5, v15, v11}, Lj31/l$a;-><init>(Lj31/k;Lq83/d;)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v5, Lc93/m;

    invoke-static {v0, v5, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-le v1, v12, :cond_e

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    and-int/lit8 v1, p7, 0x30

    if-ne v1, v12, :cond_10

    :cond_f
    move v10, v13

    :cond_10
    invoke-virtual {v0, v2}, Lp1/q;->h(Z)Z

    move-result v1

    or-int/2addr v1, v10

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_11

    if-ne v4, v14, :cond_12

    :cond_11
    new-instance v4, Lj31/l$b;

    invoke-direct {v4, v3, v2, v15, v11}, Lj31/l$b;-><init>(Ln0/u;ZLj31/k;Lq83/d;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lc93/m;

    invoke-static {v0, v4, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    return-object v15
.end method
