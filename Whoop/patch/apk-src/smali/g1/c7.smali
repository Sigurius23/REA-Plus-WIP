.class public abstract Lg1/c7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a(Lg1/a2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 15

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    const v0, -0x94b7eb

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p7, v0

    and-int/lit8 v1, p8, 0x2

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x30

    move-object/from16 v2, p1

    goto :goto_2

    :cond_1
    move-object/from16 v2, p1

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_1

    :cond_2
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    :goto_2
    const v3, 0x12493

    and-int/2addr v3, v0

    const v5, 0x12492

    if-eq v3, v5, :cond_3

    const/4 v3, 0x1

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    :goto_3
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v4, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_5

    if-eqz v1, :cond_4

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v14, v1

    move v1, v0

    move-object v0, v14

    goto :goto_4

    :cond_4
    move v1, v0

    move-object v0, v2

    :goto_4
    new-instance v5, Lg1/b7;

    move-object v8, p0

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    invoke-direct/range {v5 .. v10}, Lg1/b7;-><init>(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lg1/a2;Lkotlin/jvm/functions/Function3;Lx1/b;)V

    const v2, -0x4c659a01

    invoke-static {v2, v4, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v5, v1, 0xc00

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v7, v2

    :goto_5
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v5, Lg1/z6;

    move-object v6, p0

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    move/from16 v12, p7

    move/from16 v13, p8

    invoke-direct/range {v5 .. v13}, Lg1/z6;-><init>(Lg1/a2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lx1/b;II)V

    iput-object v5, v0, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Lp1/q;)Lg1/a2;
    .locals 7

    sget-object v0, Lg1/b2;->w:Lg1/b2;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    new-instance v3, Lfq0/a;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lfq0/a;-><init>(I)V

    new-instance v4, Lb11/b;

    const/4 v5, 0x4

    invoke-direct {v4, p0, v5}, Lb11/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    new-instance v5, Lp0/n0;

    const/16 v6, 0xa

    invoke-direct {v5, v6, v3, v4}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Lp1/q;->e(I)Z

    move-result v0

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_0

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v3, v0, :cond_1

    :cond_0
    new-instance v3, La6/l0;

    invoke-direct {v3, p0}, La6/l0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v3, Lc93/a;

    invoke-static {v2, v5, v3, p1, v1}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/a2;

    return-object p0
.end method
