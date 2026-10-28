.class public final Lb30/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lb30/t3;

.field public final synthetic F:J

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic H:Lb30/g4;

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic K:Lc93/a;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lb30/h4;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Lc93/a;Lb30/h4;ZLb30/t3;JLjava/lang/String;Lb30/g4;ZZLc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/b4;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lb30/b4;->x:Lc93/a;

    iput-object p3, p0, Lb30/b4;->y:Lb30/h4;

    iput-boolean p4, p0, Lb30/b4;->z:Z

    iput-object p5, p0, Lb30/b4;->E:Lb30/t3;

    iput-wide p6, p0, Lb30/b4;->F:J

    iput-object p8, p0, Lb30/b4;->G:Ljava/lang/String;

    iput-object p9, p0, Lb30/b4;->H:Lb30/g4;

    iput-boolean p10, p0, Lb30/b4;->I:Z

    iput-boolean p11, p0, Lb30/b4;->J:Z

    iput-object p12, p0, Lb30/b4;->K:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v9

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    iget-object v1, v0, Lb30/b4;->w:Landroidx/compose/ui/Modifier;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    invoke-static {v9}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    move-object v12, v9

    check-cast v12, Lp1/q;

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_2

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v9, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v4, v12, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    const-string v3, "PRIMARY_BUTTON_TEST_TAG"

    invoke-static {v1, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v2, v0, Lb30/b4;->y:Lb30/h4;

    iget v3, v2, Lb30/h4;->c:F

    const/4 v4, 0x0

    const/4 v13, 0x1

    invoke-static {v1, v4, v3, v13}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    iget v1, v2, Lb30/h4;->a:F

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v15

    iget v1, v2, Lb30/h4;->b:F

    iget-object v2, v0, Lb30/b4;->E:Lb30/t3;

    iget-wide v2, v2, Lb30/t3;->e:J

    invoke-static {v1, v2, v3}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v16

    const/4 v10, 0x0

    const/16 v11, 0xa

    iget-wide v1, v0, Lb30/b4;->F:J

    const-wide/16 v3, 0x0

    const-wide/16 v7, 0x0

    move-wide v5, v1

    invoke-static/range {v1 .. v11}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v6

    new-instance v17, Lb30/z3;

    iget-object v1, v0, Lb30/b4;->G:Ljava/lang/String;

    iget-object v2, v0, Lb30/b4;->H:Lb30/g4;

    iget-boolean v3, v0, Lb30/b4;->I:Z

    iget-boolean v4, v0, Lb30/b4;->J:Z

    iget-object v5, v0, Lb30/b4;->K:Lc93/a;

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move/from16 v20, v3

    move/from16 v21, v4

    move-object/from16 v22, v5

    invoke-direct/range {v17 .. v22}, Lb30/z3;-><init>(Ljava/lang/String;Lb30/g4;ZZLc93/a;)V

    move-object/from16 v1, v17

    const v2, 0x1168011d

    invoke-static {v2, v9, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/high16 v10, 0x30000000

    const/16 v11, 0x118

    iget-object v1, v0, Lb30/b4;->x:Lc93/a;

    iget-boolean v3, v0, Lb30/b4;->z:Z

    const/4 v7, 0x0

    move-object v2, v14

    move-object v4, v15

    move-object/from16 v5, v16

    invoke-static/range {v1 .. v11}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
