.class public final Lzc1/h3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc1/h3;->b(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 29

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_15

    const v0, -0x51b38b90

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->N:Lb2/k;

    int-to-float v5, v3

    const/4 v6, 0x4

    int-to-float v6, v6

    const/16 v7, 0x36

    invoke-static {v5, v6, v1, v4, v7}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v1

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v4, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v4, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "Default"

    const/4 v1, 0x6

    invoke-static {v0, v4, v1}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v0, "1"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v0, v6, :cond_4

    sget-object v0, Lzc1/h3$b;->w:Lzc1/h3$b;

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v25, v7, 0x3

    const/16 v26, 0x0

    const v27, 0xffff9

    move-object/from16 v24, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v28, v6

    move-object v6, v0

    move-object/from16 v0, v28

    invoke-static/range {v4 .. v27}, Lqy0/f;->v(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly3/f;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;FZFZZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v24

    const-string v5, "With Legend"

    invoke-static {v5, v4, v1}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v5, "2"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_5

    sget-object v6, Lzc1/h3$k;->w:Lzc1/h3$k;

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_6

    sget-object v7, Lzc1/h3$l;->w:Lzc1/h3$l;

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_7

    sget-object v7, Lzc1/h3$m;->w:Lzc1/h3$m;

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    const/16 v26, 0x0

    const v27, 0xfef79

    move-object/from16 v24, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v4 .. v27}, Lqy0/f;->v(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly3/f;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;FZFZZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v24

    const-string v5, "With Legend & Marker"

    invoke-static {v5, v4, v1}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v5, "3"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_8

    sget-object v6, Lzc1/h3$n;->w:Lzc1/h3$n;

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_9

    sget-object v7, Lzc1/h3$o;->w:Lzc1/h3$o;

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_a

    sget-object v7, Lzc1/h3$p;->w:Lzc1/h3$p;

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v17

    const/16 v26, 0x0

    const v27, 0xfdf79

    move-object/from16 v24, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v4 .. v27}, Lqy0/f;->v(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly3/f;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;FZFZZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v24

    const-string v5, "Low Recovery Color"

    invoke-static {v5, v4, v1}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v5, "4"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_b

    sget-object v6, Lzc1/h3$q;->w:Lzc1/h3$q;

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    const/16 v26, 0x0

    const v27, 0xffff9

    move-object/from16 v24, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v4 .. v27}, Lqy0/f;->v(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly3/f;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;FZFZZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v24

    const-string v5, "Low Recovery Legend"

    invoke-static {v5, v4, v1}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v5, "5"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_c

    sget-object v6, Lzc1/h3$r;->w:Lzc1/h3$r;

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_d

    sget-object v7, Lzc1/h3$c;->w:Lzc1/h3$c;

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    const/16 v26, 0x0

    const v27, 0xfff79

    move-object/from16 v24, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v4 .. v27}, Lqy0/f;->v(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly3/f;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;FZFZZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v24

    const-string v5, "White Border"

    invoke-static {v5, v4, v1}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v5, "6"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_e

    sget-object v6, Lzc1/h3$d;->w:Lzc1/h3$d;

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_f

    sget-object v7, Lzc1/h3$e;->w:Lzc1/h3$e;

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v17

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_10

    sget-object v7, Lzc1/h3$f;->w:Lzc1/h3$f;

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    const/16 v26, 0x0

    const v27, 0xfcff9

    move-object/from16 v24, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v4 .. v27}, Lqy0/f;->v(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly3/f;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;FZFZZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v24

    const-string v5, "Mix & Match"

    invoke-static {v5, v4, v1}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "7"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_11

    sget-object v1, Lzc1/h3$g;->w:Lzc1/h3$g;

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_12

    sget-object v1, Lzc1/h3$h;->w:Lzc1/h3$h;

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_13

    sget-object v1, Lzc1/h3$i;->w:Lzc1/h3$i;

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_14

    sget-object v1, Lzc1/h3$j;->w:Lzc1/h3$j;

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v17

    const/high16 v26, 0x6000000

    const v27, 0xbcfe9

    move-object/from16 v24, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    invoke-static/range {v4 .. v27}, Lqy0/f;->v(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly3/f;Lqy0/g;Ly81/e;Ly81/e;Ly81/e;ZLjava/lang/Float;Ly81/e;Ly81/e;FZFZZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v24

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_15
    invoke-virtual {v4}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lzc1/h3$a;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
