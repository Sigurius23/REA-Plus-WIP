.class public abstract Lc11/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc11/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lc11/o;",
        "style",
        "Lc11/b;",
        "a",
        "(Lc11/o;Landroidx/compose/runtime/Composer;I)Lc11/b;",
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
.method public static final a(Lc11/o;Landroidx/compose/runtime/Composer;I)Lc11/b;
    .locals 18

    const-string v0, "style"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc11/j$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x6

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    move-object/from16 v0, p1

    check-cast v0, Lp1/q;

    const v1, 0x6bf12b9

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    new-instance v4, Lc11/b;

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->Y0()J

    move-result-wide v5

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->Y0()J

    move-result-wide v7

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->Y0()J

    move-result-wide v9

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->Y0()J

    move-result-wide v11

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->Y0()J

    move-result-wide v13

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->Y0()J

    move-result-wide v15

    const/16 v17, 0x0

    invoke-direct/range {v4 .. v17}, Lc11/b;-><init>(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    const v0, 0x6beda13

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    invoke-static {v0, v1, v2}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1
    move-object/from16 v0, p1

    check-cast v0, Lp1/q;

    const v1, 0x6bede76

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    new-instance v4, Lc11/b;

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v7

    sget v9, Li2/x;->o:I

    sget-wide v9, Li2/x;->n:J

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v11

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->c1()J

    move-result-wide v13

    invoke-virtual {v1, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v15

    const/16 v17, 0x0

    invoke-direct/range {v4 .. v17}, Lc11/b;-><init>(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    :goto_0
    return-object v4
.end method
