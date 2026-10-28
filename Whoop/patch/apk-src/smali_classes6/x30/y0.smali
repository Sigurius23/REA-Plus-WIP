.class public abstract Lx30/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "(https?://[a-z0-9.-]+\\.[a-z]{2,3}(?:/\\S*?(?=\\.*(?:\\s|$)))?)"

    const/16 v1, 0x2a

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lx30/y0;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static final a(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLl3/v0;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p6

    const-string v0, "text"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v3, 0x63a0af46

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v6, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_1
    move v3, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    const/16 v7, 0x10

    if-nez v5, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    move v5, v7

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v6, 0x180

    move-wide/from16 v9, p2

    if-nez v5, :cond_5

    invoke-virtual {v0, v9, v10}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_7

    move-object/from16 v5, p4

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v3, v8

    goto :goto_5

    :cond_7
    move-object/from16 v5, p4

    :goto_5
    and-int/lit16 v8, v3, 0x493

    const/16 v11, 0x492

    if-ne v8, v11, :cond_9

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v29, v0

    goto/16 :goto_e

    :cond_9
    :goto_6
    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v8, v6, 0x1

    if-eqz v8, :cond_b

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_b
    :goto_7
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v8, Lb3/v1;->r:Lp1/u2;

    invoke-virtual {v0, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Lb3/b3;

    const v8, -0x19b107fd

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v11, Lp1/l;->a:Lp1/v0;

    const/4 v15, 0x0

    if-ne v8, v11, :cond_c

    invoke-static {v15}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v12, v8

    check-cast v12, Lp1/c1;

    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    const v13, -0x19b0fb5c

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    and-int/lit8 v13, v3, 0xe

    const/4 v15, 0x1

    if-ne v13, v4, :cond_d

    move v4, v15

    goto :goto_8

    :cond_d
    move v4, v8

    :goto_8
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v4, :cond_e

    if-ne v13, v11, :cond_13

    :cond_e
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v13, Lx30/y0;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v13, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v13

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :goto_9
    invoke-virtual {v13}, Ljava/util/regex/Matcher;->find()Z

    move-result v16

    if-eqz v16, :cond_10

    move-object/from16 v16, v4

    invoke-virtual {v13, v15}, Ljava/util/regex/Matcher;->start(I)I

    move-result v4

    invoke-virtual {v13}, Ljava/util/regex/Matcher;->end()I

    move-result v15

    invoke-virtual {v1, v4, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v1, "substring(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "http://"

    const/4 v6, 0x0

    invoke-static {v5, v1, v6}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_f

    const-string v1, "https://"

    invoke-static {v5, v1, v6}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v19

    if-nez v19, :cond_f

    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_f
    new-instance v1, Lx30/c1;

    invoke-direct {v1, v5, v4, v15}, Lx30/c1;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p0

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v4, v16

    const/4 v15, 0x1

    goto :goto_9

    :cond_10
    move-object/from16 v16, v4

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx30/c1;

    iget-object v5, v4, Lx30/c1;->a:Ljava/lang/String;

    iget v6, v4, Lx30/c1;->b:I

    iget v4, v4, Lx30/c1;->c:I

    new-instance v8, Ll3/c;

    new-instance v13, Ll3/o0;

    invoke-direct {v13, v5}, Ll3/o0;-><init>(Ljava/lang/String;)V

    const-string v5, "URL"

    invoke-direct {v8, v6, v4, v13, v5}, Ll3/c;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_11
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_b
    if-ge v6, v5, :cond_12

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll3/c;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->length()I

    move-result v13

    invoke-virtual {v8, v13}, Ll3/c;->a(I)Ll3/e;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    :cond_12
    new-instance v13, Ll3/g;

    invoke-direct {v13, v1, v4}, Ll3/g;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v13, Ll3/g;

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    const v1, -0x19b0c337

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_14

    if-ne v4, v11, :cond_15

    :cond_14
    move-object v1, v11

    goto :goto_c

    :cond_15
    move-object v1, v11

    goto :goto_d

    :goto_c
    new-instance v11, Lp33/m;

    const/16 v16, 0xb

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v16}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v11

    :goto_d
    check-cast v4, Lc93/m;

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-static {v2, v5, v4}, Lu2/c0;->c(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v4, -0x19b07e62

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_16

    new-instance v4, Lq12/c;

    const/16 v1, 0x1d

    invoke-direct {v4, v1, v12}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v27, v4

    check-cast v27, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    and-int/lit16 v1, v3, 0x380

    shl-int/lit8 v3, v3, 0xc

    const/high16 v4, 0x1c00000

    and-int/2addr v3, v4

    const/high16 v4, 0x180000

    or-int v31, v3, v4

    const v32, 0xfff8

    const-wide/16 v11, 0x0

    move-object v7, v13

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

    move-object/from16 v28, p4

    move-object/from16 v29, v0

    move/from16 v30, v1

    invoke-static/range {v7 .. v32}, Lg1/f9;->c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_e
    invoke-virtual/range {v29 .. v29}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, Lx30/x0;

    move-object/from16 v1, p0

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lx30/x0;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLl3/v0;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method
