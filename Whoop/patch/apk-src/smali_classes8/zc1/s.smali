.class public abstract Lzc1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/s;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move/from16 v0, p1

    move-object/from16 v7, p0

    check-cast v7, Lp1/q;

    const v1, 0x5db4cefc

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v10, 0x1

    if-eqz v0, :cond_0

    move v1, v10

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "A cat was the Mayor of an Alaskan town for 20 years"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    const/4 v3, 0x4

    int-to-float v3, v3

    const/16 v4, 0x36

    invoke-static {v3, v3, v2, v7, v4}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v7, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, v7, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Text - Small"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v2, Ld41/g;->SMALL:Ld41/g;

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v12, "https://placekitten.com/1000/800"

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v23, Lx81/d;->a:Lx81/d;

    invoke-static/range {v23 .. v23}, Lm4/a;->b(Lx81/d;)I

    move-result v1

    const-string v24, "Cat Facts"

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const-string v25, "Aug 19, 2022"

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v4, Ld41/j$c;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v21, 0x185

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v13, v11

    move-object v11, v4

    invoke-direct/range {v11 .. v22}, Ld41/j$c;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld41/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Ld41/j$c;->j:I

    shl-int/lit8 v1, v1, 0x9

    or-int/lit16 v8, v1, 0x6030

    const/16 v9, 0x25

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v26, v2

    const-string v1, "Text - Large"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v2, Ld41/g;->LARGE:Ld41/g;

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v12, "https://placekitten.com/1000/800"

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v23 .. v23}, Lm4/a;->b(Lx81/d;)I

    move-result v1

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v4, Ld41/j$c;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v21, 0x184

    const/4 v14, 0x0

    const-string v12, "id"

    move-object v13, v11

    move-object v11, v4

    invoke-direct/range {v11 .. v22}, Ld41/j$c;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld41/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v27, v2

    const-string v1, "Text - Full Width"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v2, Ld41/g;->FULLWIDTH:Ld41/g;

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v12, "https://placekitten.com/1000/800"

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v23 .. v23}, Lm4/a;->b(Lx81/d;)I

    move-result v1

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-static/range {v25 .. v25}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v4, Ld41/j$c;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/4 v14, 0x0

    const-string v12, "id"

    move-object v13, v11

    move-object v11, v4

    invoke-direct/range {v11 .. v22}, Ld41/j$c;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld41/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v23, v2

    const-string v1, "Text - No Date and No Icon - Small"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v4, Ld41/j$c;

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v12, "https://placekitten.com/1000/800"

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v21, 0x1ad

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v13, v11

    move-object v11, v4

    invoke-direct/range {v11 .. v22}, Ld41/j$c;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld41/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    move-object/from16 v2, v26

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Text - No Date and No Icon - Large"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v4, Ld41/j$c;

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v12, "https://placekitten.com/1000/800"

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v13, v11

    move-object v11, v4

    invoke-direct/range {v11 .. v22}, Ld41/j$c;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld41/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    move-object/from16 v2, v27

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Text - No Date and No Icon - Full Width"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v4, Ld41/j$c;

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v12, "https://placekitten.com/1000/800"

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v13, v11

    move-object v11, v4

    invoke-direct/range {v11 .. v22}, Ld41/j$c;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld41/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    move-object/from16 v2, v23

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Video - Small"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v4, Ld41/j$d;

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v12, "https://placekitten.com/1000/800"

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v17, 0x14

    move-object/from16 v15, v18

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object v12, v11

    move-object v11, v4

    invoke-direct/range {v11 .. v18}, Ld41/j$d;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v15

    sget v1, Ld41/j$d;->f:I

    shl-int/lit8 v1, v1, 0x9

    or-int/lit16 v8, v1, 0x6030

    const/4 v1, 0x0

    move-object/from16 v2, v26

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Video - Large"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v4, Ld41/j$d;

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v12, "https://placekitten.com/1000/800"

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v17, 0x14

    move-object/from16 v15, v18

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object v12, v11

    move-object v11, v4

    invoke-direct/range {v11 .. v18}, Ld41/j$d;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v15

    const/4 v1, 0x0

    move-object/from16 v2, v27

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Video - Full Width"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v4, Ld41/j$d;

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v12, "https://placekitten.com/1000/800"

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v17, 0x14

    move-object/from16 v15, v18

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object v12, v11

    move-object v11, v4

    invoke-direct/range {v11 .. v18}, Ld41/j$d;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    move-object/from16 v2, v23

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Discover - Small"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v4, Ld41/j$a;->a:Ld41/j$a;

    sget v1, Ld41/j$a;->b:I

    shl-int/lit8 v11, v1, 0x9

    or-int/lit16 v8, v11, 0x6030

    const/4 v1, 0x0

    move-object/from16 v2, v26

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Discover - Large"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x0

    move-object/from16 v2, v27

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Discover - Full Width"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x0

    move-object/from16 v2, v23

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Stress Colors"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v3, Ld11/k;

    sget-object v1, Ly81/f;->RECOVERY:Ly81/f;

    const/4 v2, 0x2

    const/4 v5, 0x0

    invoke-direct {v3, v1, v5, v2, v6}, Ld11/k;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Ld11/k;->c:I

    shl-int/lit8 v1, v1, 0x6

    or-int/lit16 v1, v1, 0x6030

    or-int v8, v1, v11

    const/16 v9, 0x21

    const/4 v1, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, v27

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    new-instance v3, Ld11/k;

    sget-object v1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-direct {v3, v1, v6, v5, v9}, Ld11/k;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/16 v9, 0x21

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    new-instance v3, Ld11/k;

    sget-object v1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-direct {v3, v1, v6, v5, v9}, Ld11/k;-><init>(Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/16 v9, 0x21

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Ld41/e;->q(Landroidx/compose/ui/Modifier;Ld41/g;Ld11/a;Ld41/j;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v2, Lzc1/j;

    const/16 v3, 0x8

    invoke-direct {v2, v0, v3}, Lzc1/j;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/s;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
