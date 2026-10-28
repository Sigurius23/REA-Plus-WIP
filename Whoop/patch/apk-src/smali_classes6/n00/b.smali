.class public final Ln00/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lg40/m3;

.field public final synthetic F:Lg2/s;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lg40/z1;

.field public final synthetic I:Lg40/m3;

.field public final synthetic w:Ln00/c;

.field public final synthetic x:Z

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lb3/x2;


# direct methods
.method public constructor <init>(Ln00/c;ZLc93/a;Lb3/x2;Lg40/m3;Lg2/s;Lkotlin/jvm/functions/Function1;Lg40/z1;Lg40/m3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln00/b;->w:Ln00/c;

    iput-boolean p2, p0, Ln00/b;->x:Z

    iput-object p3, p0, Ln00/b;->y:Lc93/a;

    iput-object p4, p0, Ln00/b;->z:Lb3/x2;

    iput-object p5, p0, Ln00/b;->E:Lg40/m3;

    iput-object p6, p0, Ln00/b;->F:Lg2/s;

    iput-object p7, p0, Ln00/b;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Ln00/b;->H:Lg40/z1;

    iput-object p9, p0, Ln00/b;->I:Lg40/m3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "$this$ScrollableTopLevelColumn"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    move-object v3, v8

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    :cond_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    move-object v3, v8

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_3
    :goto_1
    and-int/lit8 v11, v2, 0xe

    invoke-static {v1, v8, v11}, Lse/b;->q(Ll0/y;Landroidx/compose/runtime/Composer;I)V

    sget-object v2, Ld40/m;->w:Ld40/m;

    new-instance v3, Lg1/f;

    iget-object v4, v0, Ln00/b;->F:Lg2/s;

    const/16 v5, 0xa

    iget-object v12, v0, Ln00/b;->w:Ln00/c;

    iget-object v6, v0, Ln00/b;->E:Lg40/m3;

    invoke-direct {v3, v12, v6, v4, v5}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v4, -0x5f293575

    invoke-static {v4, v8, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x36

    const/4 v13, 0x0

    invoke-static {v2, v3, v8, v4, v13}, Lg00/a;->a(Ld40/m;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    iget-object v2, v12, Ln00/c;->h:Ljava/lang/String;

    const/4 v14, 0x1

    if-eqz v2, :cond_4

    iget-object v2, v12, Ln00/c;->e:Ln00/d;

    sget-object v3, Ln00/d;->x:Ln00/d;

    if-eq v2, v3, :cond_4

    move v2, v14

    goto :goto_2

    :cond_4
    move v2, v13

    :goto_2
    const/high16 v15, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    move-object v4, v3

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v5, Ld30/b0;

    iget-object v6, v0, Ln00/b;->G:Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x5

    invoke-direct {v5, v7, v12, v6}, Ld30/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, 0x1759de8

    invoke-static {v6, v8, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v5, 0x180180

    or-int v9, v11, v5

    const/16 v10, 0x1c

    move-object v5, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object/from16 v16, v6

    const/4 v6, 0x0

    move-object/from16 v13, v16

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    iget-boolean v2, v0, Ln00/b;->x:Z

    if-nez v2, :cond_5

    iget-object v2, v12, Ln00/c;->g:Lzy/c;

    if-eqz v2, :cond_5

    move v2, v14

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v4, Ln00/a;

    const/4 v5, 0x1

    invoke-direct {v4, v12, v5}, Ln00/a;-><init>(Ln00/c;I)V

    const v5, 0x1e8bbc51

    invoke-static {v5, v8, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/16 v10, 0x1c

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    new-instance v2, Lch/t;

    iget-object v3, v0, Ln00/b;->I:Lg40/m3;

    const/4 v4, 0x4

    iget-object v5, v0, Ln00/b;->H:Lg40/z1;

    invoke-direct {v2, v5, v3, v12, v4}, Lch/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v3, 0x4c9f6b70    # 8.358182E7f

    invoke-static {v3, v8, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/high16 v2, 0x180000

    or-int v9, v11, v2

    const/16 v10, 0x1e

    iget-boolean v2, v0, Ln00/b;->x:Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    iget-object v5, v0, Ln00/b;->z:Lb3/x2;

    const/4 v7, 0x0

    iget-boolean v2, v0, Ln00/b;->x:Z

    iget-object v3, v0, Ln00/b;->w:Ln00/c;

    iget-object v4, v0, Ln00/b;->y:Lc93/a;

    move-object v6, v8

    invoke-static/range {v2 .. v7}, Lse/b;->p(ZLn00/c;Lc93/a;Lb3/x2;Landroidx/compose/runtime/Composer;I)V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
