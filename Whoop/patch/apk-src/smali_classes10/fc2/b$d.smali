.class public final Lfc2/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfc2/b;->g(Lec2/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:J

.field final synthetic F:J

.field final synthetic G:J

.field final synthetic H:J

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lp1/c1;

.field final synthetic y:J

.field final synthetic z:J


# direct methods
.method public constructor <init>(Ljava/util/List;Lp1/c1;JJJJJJ)V
    .locals 0

    iput-object p1, p0, Lfc2/b$d;->w:Ljava/util/List;

    iput-object p2, p0, Lfc2/b$d;->x:Lp1/c1;

    iput-wide p3, p0, Lfc2/b$d;->y:J

    iput-wide p5, p0, Lfc2/b$d;->z:J

    iput-wide p7, p0, Lfc2/b$d;->E:J

    iput-wide p9, p0, Lfc2/b$d;->F:J

    iput-wide p11, p0, Lfc2/b$d;->G:J

    iput-wide p13, p0, Lfc2/b$d;->H:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_4

    move v3, v6

    goto :goto_3

    :cond_4
    move v3, v5

    :goto_3
    and-int/2addr v2, v6

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v2, v0, Lfc2/b$d;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lec2/a;

    const v2, -0x34c1f545    # -1.2454587E7f

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    iget-object v2, v0, Lfc2/b$d;->x:Lp1/c1;

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_6

    :cond_5
    new-instance v3, Lfc2/b$a;

    iget-object v2, v0, Lfc2/b$d;->x:Lp1/c1;

    invoke-direct {v3, v1, v2}, Lfc2/b$a;-><init>(Lec2/a;Lp1/c1;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v11, v3

    check-cast v11, Lc93/a;

    const/16 v12, 0xf

    sget-object v7, Lb2/t;->w:Lb2/t;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lec2/a;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v7, v0, Lfc2/b$d;->x:Lp1/c1;

    invoke-static {v7}, Lfc2/b;->p(Lp1/c1;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-wide v7, v0, Lfc2/b$d;->y:J

    goto :goto_4

    :cond_7
    iget-wide v7, v0, Lfc2/b$d;->z:J

    :goto_4
    sget-object v3, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v3}, Lkd1/w;->a()Lk91/a;

    move-result-object v3

    invoke-virtual {v3}, Lk91/a;->c()Lt0/i;

    move-result-object v3

    invoke-static {v2, v7, v8, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v7, 0x4004000000000000L    # 2.5

    double-to-float v3, v7

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v3, v7

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->e:Ll0/h;

    sget-object v7, Lb2/e;->N:Lb2/k;

    const/16 v8, 0x36

    invoke-static {v3, v7, v4, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_8

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_5
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_9

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v7, v4, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v4, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lec2/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v4, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lec2/a;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v8, v0, Lfc2/b$d;->x:Lp1/c1;

    invoke-static {v8}, Lfc2/b;->p(Lp1/c1;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-wide v8, v0, Lfc2/b$d;->E:J

    :goto_6
    move-wide v9, v8

    goto :goto_7

    :cond_b
    iget-wide v8, v0, Lfc2/b$d;->F:J

    goto :goto_6

    :goto_7
    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v2, v4, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->r()Lb91/a;

    move-result-object v27

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v31, v11, 0x12

    const v32, 0x2fffa

    move v11, v8

    const/4 v8, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v29, v28

    const/16 v28, 0x0

    const/16 v30, 0x0

    move/from16 v33, v29

    move-object/from16 v29, v4

    move/from16 v4, v33

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v1}, Lec2/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v7, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lec2/a;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v8, v0, Lfc2/b$d;->x:Lp1/c1;

    invoke-static {v8}, Lfc2/b;->p(Lp1/c1;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-wide v8, v0, Lfc2/b$d;->G:J

    :goto_8
    move-wide v9, v8

    goto :goto_9

    :cond_c
    iget-wide v8, v0, Lfc2/b$d;->H:J

    goto :goto_8

    :goto_9
    invoke-virtual {v2, v7, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->c()Lb91/a;

    move-result-object v27

    const/16 v30, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v29, v7

    move-object v7, v3

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    return-void

    :cond_d
    move-object v7, v4

    invoke-virtual {v7}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lfc2/b$d;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
