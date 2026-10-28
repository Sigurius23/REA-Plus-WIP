.class public abstract Ll1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll0/l1;

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x18

    int-to-float v0, v0

    const/16 v1, 0xa

    int-to-float v1, v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    invoke-static {v0, v1, v0, v2, v3}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v0

    sput-object v0, Ll1/w;->a:Ll0/l1;

    const/16 v0, 0x10

    int-to-float v0, v0

    sput v0, Ll1/w;->b:F

    return-void
.end method

.method public static final a(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Lg2/s;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v3, p2

    move-object/from16 v11, p8

    check-cast v11, Lp1/q;

    const v0, -0x19c50103

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v1, p0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p9, v0

    move-object/from16 v2, p1

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x100

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v0, v4

    move-object/from16 v13, p3

    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x800

    goto :goto_3

    :cond_3
    const/16 v4, 0x400

    :goto_3
    or-int/2addr v0, v4

    move-object/from16 v5, p4

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x4000

    goto :goto_4

    :cond_4
    const/16 v4, 0x2000

    :goto_4
    or-int/2addr v0, v4

    move-object/from16 v14, p5

    invoke-virtual {v11, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/high16 v4, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v4, 0x10000

    :goto_5
    or-int/2addr v0, v4

    move-object/from16 v7, p6

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/high16 v4, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v4, 0x80000

    :goto_6
    or-int/2addr v0, v4

    move-object/from16 v8, p7

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/high16 v4, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v4, 0x400000

    :goto_7
    or-int/2addr v0, v4

    const v4, 0x492493

    and-int/2addr v4, v0

    const v9, 0x492492

    if-eq v4, v9, :cond_8

    const/4 v4, 0x1

    goto :goto_8

    :cond_8
    const/4 v4, 0x0

    :goto_8
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v11, v9, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    iget-object v4, v3, Lm1/o;->a:Ljava/util/Locale;

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_a

    if-ne v9, v15, :cond_9

    goto :goto_9

    :cond_9
    const/4 v12, 0x0

    goto/16 :goto_a

    :cond_a
    :goto_9
    iget-object v4, v3, Lm1/o;->a:Ljava/util/Locale;

    sget-object v9, Ljava/time/format/FormatStyle;->SHORT:Ljava/time/format/FormatStyle;

    invoke-static {v4}, Ljava/time/chrono/Chronology;->ofLocale(Ljava/util/Locale;)Ljava/time/chrono/Chronology;

    move-result-object v12

    const/4 v6, 0x0

    invoke-static {v9, v6, v12, v4}, Ljava/time/format/DateTimeFormatterBuilder;->getLocalizedDateTimePattern(Ljava/time/format/FormatStyle;Ljava/time/format/FormatStyle;Ljava/time/chrono/Chronology;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "[^dMy/\\-.]"

    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    const-string v9, "compile(...)"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "input"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    const-string v6, ""

    invoke-virtual {v4, v6}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "replaceAll(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "d{1,2}"

    invoke-static {v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v12

    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "dd"

    invoke-virtual {v12, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4, v10}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "M{1,2}"

    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "MM"

    invoke-virtual {v10, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4, v12}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "y{1,4}"

    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "yyyy"

    invoke-virtual {v10, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4, v12}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "My"

    const-string v10, "M/y"

    const/4 v12, 0x0

    invoke-static {v4, v6, v10, v12}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    const-string v6, "."

    invoke-static {v4, v6}, Lyb3/r;->s0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "[/\\-.]"

    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    const-string v9, "matcher(...)"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v12, v4}, Lva3/g;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lyb3/n;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, v6, Lyb3/n;->c:Lyb3/m;

    invoke-virtual {v6, v12}, Lyb3/m;->c(I)Lyb3/j;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, v6, Lyb3/j;->a:Ljava/lang/String;

    new-instance v9, Lm1/t;

    invoke-virtual {v6, v12}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-direct {v9, v4, v6}, Lm1/t;-><init>(Ljava/lang/String;C)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v9, Lm1/t;

    const v4, 0x7f1407cf

    invoke-static {v11, v4}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v17

    const v4, 0x7f1407d1

    invoke-static {v11, v4}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v18

    const v4, 0x7f1407d0

    invoke-static {v11, v4}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    const v6, 0xe000

    and-int/2addr v6, v0

    const/16 v10, 0x4000

    if-eq v6, v10, :cond_b

    move v10, v12

    goto :goto_b

    :cond_b
    const/4 v10, 0x1

    :goto_b
    or-int/2addr v4, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_d

    if-ne v6, v15, :cond_c

    goto :goto_c

    :cond_c
    move-object v15, v9

    goto :goto_d

    :cond_d
    :goto_c
    new-instance v12, Ll1/x;

    move-object/from16 v16, v5

    move-object v15, v9

    invoke-direct/range {v12 .. v19}, Ll1/x;-><init>(Li93/j;Ll1/n3;Lm1/t;Ll1/e0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v12

    :goto_d
    check-cast v6, Ll1/x;

    iget-object v4, v15, Lm1/t;->a:Ljava/lang/String;

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "toUpperCase(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x7f1407d2

    invoke-static {v11, v5}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Ll1/w;->a:Ll0/l1;

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v3, Lm1/o;->a:Ljava/util/Locale;

    new-instance v10, Lb30/m6;

    const/4 v12, 0x1

    invoke-direct {v10, v5, v4, v12}, Lb30/m6;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    const v5, -0x2cd51ec5

    invoke-static {v5, v11, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    new-instance v10, Lb30/b0;

    const/4 v12, 0x4

    invoke-direct {v10, v4, v12}, Lb30/b0;-><init>(Ljava/lang/String;I)V

    const v4, -0x464cbd26

    invoke-static {v4, v11, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    shl-int/lit8 v10, v0, 0x3

    and-int/lit8 v12, v10, 0x70

    const v13, 0x1b6006

    or-int/2addr v12, v13

    and-int/lit16 v13, v10, 0x380

    or-int/2addr v12, v13

    and-int/lit16 v10, v10, 0x1c00

    or-int/2addr v12, v10

    shr-int/lit8 v0, v0, 0x12

    and-int/lit8 v13, v0, 0x7e

    move-object v0, v5

    move-object v5, v4

    move-object v4, v0

    move-object/from16 v10, p7

    move-object v0, v9

    move-object v9, v7

    move-object v7, v15

    invoke-static/range {v0 .. v13}, Ll1/w;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lm1/o;Lx1/b;Lx1/b;Ll1/x;Lm1/t;Ljava/util/Locale;Ll1/y;Lg2/s;Landroidx/compose/runtime/Composer;II)V

    goto :goto_e

    :cond_e
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_f

    new-instance v0, Lbm2/p;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lbm2/p;-><init>(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Lg2/s;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lm1/o;Lx1/b;Lx1/b;Ll1/x;Lm1/t;Ljava/util/Locale;Ll1/y;Lg2/s;Landroidx/compose/runtime/Composer;II)V
    .locals 35

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v3, p7

    move-object/from16 v7, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move/from16 v13, p12

    move-object/from16 v0, p11

    check-cast v0, Lp1/q;

    const v1, 0x56cd8699

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v13, 0x6

    move-object/from16 v14, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    goto :goto_1

    :cond_1
    move v1, v13

    :goto_1
    and-int/lit8 v8, v13, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v1, v8

    :cond_3
    and-int/lit16 v8, v13, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_4

    const/16 v16, 0x100

    goto :goto_3

    :cond_4
    const/16 v16, 0x80

    :goto_3
    or-int v1, v1, v16

    goto :goto_4

    :cond_5
    move-object/from16 v8, p2

    :goto_4
    and-int/lit16 v5, v13, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_5

    :cond_6
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v1, v5

    :cond_7
    and-int/lit16 v5, v13, 0x6000

    if-nez v5, :cond_9

    move-object/from16 v5, p4

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x4000

    goto :goto_6

    :cond_8
    const/16 v16, 0x2000

    :goto_6
    or-int v1, v1, v16

    goto :goto_7

    :cond_9
    move-object/from16 v5, p4

    :goto_7
    const/high16 v16, 0x30000

    and-int v16, v13, v16

    move-object/from16 v15, p5

    if-nez v16, :cond_b

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_a

    const/high16 v17, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v17, 0x10000

    :goto_8
    or-int v1, v1, v17

    :cond_b
    const/high16 v17, 0x180000

    and-int v17, v13, v17

    const/4 v15, 0x0

    if-nez v17, :cond_d

    invoke-virtual {v0, v15}, Lp1/q;->e(I)Z

    move-result v17

    if-eqz v17, :cond_c

    const/high16 v17, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v17, 0x80000

    :goto_9
    or-int v1, v1, v17

    :cond_d
    const/high16 v17, 0xc00000

    and-int v17, v13, v17

    move-object/from16 v6, p6

    if-nez v17, :cond_f

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_e

    const/high16 v20, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v20, 0x400000

    :goto_a
    or-int v1, v1, v20

    :cond_f
    const/high16 v20, 0x6000000

    and-int v20, v13, v20

    if-nez v20, :cond_11

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_10

    const/high16 v20, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v20, 0x2000000

    :goto_b
    or-int v1, v1, v20

    :cond_11
    const/high16 v20, 0x30000000

    and-int v20, v13, v20

    if-nez v20, :cond_13

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_12

    const/high16 v20, 0x20000000

    goto :goto_c

    :cond_12
    const/high16 v20, 0x10000000

    :goto_c
    or-int v1, v1, v20

    :cond_13
    and-int/lit8 v20, p13, 0x6

    if-nez v20, :cond_15

    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_14

    const/16 v17, 0x4

    goto :goto_d

    :cond_14
    const/16 v17, 0x2

    :goto_d
    or-int v17, p13, v17

    goto :goto_e

    :cond_15
    move/from16 v17, p13

    :goto_e
    and-int/lit8 v20, p13, 0x30

    if-nez v20, :cond_17

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/16 v19, 0x20

    goto :goto_f

    :cond_16
    const/16 v19, 0x10

    :goto_f
    or-int v17, v17, v19

    :cond_17
    move/from16 v33, v17

    const v17, 0x12492493

    and-int v10, v1, v17

    const v9, 0x12492492

    const/16 v34, 0x1

    if-ne v10, v9, :cond_19

    and-int/lit8 v9, v33, 0x13

    const/16 v10, 0x12

    if-eq v9, v10, :cond_18

    goto :goto_10

    :cond_18
    move v9, v15

    goto :goto_11

    :cond_19
    :goto_10
    move/from16 v9, v34

    :goto_11
    and-int/lit8 v10, v1, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_31

    new-array v9, v15, [Ljava/lang/Object;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v10, v15, :cond_1a

    new-instance v10, Lku2/a;

    const/16 v2, 0x1d

    invoke-direct {v10, v2}, Lku2/a;-><init>(I)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v10, Lc93/a;

    invoke-static {v9, v10, v0}, Ly1/k;->f([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v10

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq3/y;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    const/high16 v20, 0x1c00000

    move/from16 v22, v9

    and-int v9, v1, v20

    const/high16 v3, 0x800000

    if-ne v9, v3, :cond_1b

    move/from16 v17, v34

    goto :goto_12

    :cond_1b
    const/16 v17, 0x0

    :goto_12
    or-int v17, v22, v17

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    or-int v17, v17, v20

    const/high16 v20, 0xe000000

    move/from16 v22, v9

    and-int v9, v1, v20

    const/high16 v3, 0x4000000

    if-ne v9, v3, :cond_1c

    move/from16 v3, v34

    goto :goto_13

    :cond_1c
    const/4 v3, 0x0

    :goto_13
    or-int v3, v17, v3

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v3, v3, v17

    const/high16 v17, 0x380000

    move/from16 v23, v9

    and-int v9, v1, v17

    move/from16 v17, v3

    const/high16 v3, 0x100000

    if-ne v9, v3, :cond_1d

    move/from16 v3, v34

    goto :goto_14

    :cond_1d
    const/4 v3, 0x0

    :goto_14
    or-int v3, v17, v3

    move/from16 v17, v3

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v17, :cond_1f

    if-ne v3, v15, :cond_1e

    goto :goto_15

    :cond_1e
    move v14, v9

    move-object v5, v10

    move/from16 v10, v22

    move/from16 v13, v23

    const/high16 v11, 0x800000

    goto :goto_16

    :cond_1f
    :goto_15
    new-instance v3, La00/h;

    move/from16 v17, v9

    const/16 v9, 0xc

    move-object v5, v4

    move-object v4, v6

    move-object v8, v10

    move/from16 v14, v17

    move/from16 v10, v22

    move/from16 v13, v23

    const/high16 v11, 0x800000

    move-object/from16 v6, p7

    invoke-direct/range {v3 .. v9}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v4, v5

    move-object v5, v8

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    check-cast v3, Lc93/a;

    const/4 v6, 0x0

    invoke-static {v2, v3, v0, v6}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    sget v8, Ll1/w;->b:F

    if-eqz v3, :cond_20

    :goto_17
    move/from16 v17, v8

    goto :goto_18

    :cond_20
    invoke-static {}, Ll1/h4;->d()Ll0/l1;

    move-result-object v3

    iget v9, v3, Ll0/l1;->d:F

    iget v3, v3, Ll0/l1;->b:F

    add-float/2addr v9, v3

    sub-float/2addr v8, v9

    goto :goto_17

    :goto_18
    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v20, v3

    check-cast v20, Lq3/y;

    const/high16 v3, 0x4000000

    if-ne v13, v3, :cond_21

    move/from16 v8, v34

    goto :goto_19

    :cond_21
    move v8, v6

    :goto_19
    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    and-int/lit16 v9, v1, 0x380

    const/16 v3, 0x100

    if-ne v9, v3, :cond_22

    move/from16 v3, v34

    goto :goto_1a

    :cond_22
    move v3, v6

    :goto_1a
    or-int/2addr v3, v8

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v3, v8

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v3, v8

    if-ne v10, v11, :cond_23

    move/from16 v8, v34

    goto :goto_1b

    :cond_23
    move v8, v6

    :goto_1b
    or-int/2addr v3, v8

    const/high16 v8, 0x100000

    if-ne v14, v8, :cond_24

    move/from16 v8, v34

    goto :goto_1c

    :cond_24
    move v8, v6

    :goto_1c
    or-int/2addr v3, v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_26

    if-ne v8, v15, :cond_25

    goto :goto_1d

    :cond_25
    move/from16 v19, v6

    move-object v3, v8

    move-object/from16 v6, p7

    move-object v8, v2

    const/high16 v2, 0x4000000

    goto :goto_1e

    :cond_26
    :goto_1d
    new-instance v3, Lbm2/a0;

    move-object/from16 v9, p6

    move-object v10, v5

    move/from16 v19, v6

    move-object v8, v7

    move-object/from16 v6, p2

    move-object v5, v2

    move-object v7, v4

    const/high16 v2, 0x4000000

    move-object/from16 v4, p7

    invoke-direct/range {v3 .. v10}, Lbm2/a0;-><init>(Lm1/t;Lp1/c1;Lkotlin/jvm/functions/Function1;Lm1/o;Ljava/util/Locale;Ll1/x;Lp1/c1;)V

    move-object v6, v4

    move-object v4, v7

    move-object v7, v8

    move-object v8, v5

    move-object v5, v10

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1e
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v9, v19

    const/16 v19, 0x7

    move-object v10, v15

    const/4 v15, 0x0

    const/16 v11, 0x20

    const/16 v16, 0x0

    move-object/from16 v14, p0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v14, :cond_27

    if-ne v2, v10, :cond_28

    :cond_27
    new-instance v2, Ljs2/e;

    const/4 v14, 0x2

    invoke-direct {v2, v14, v8}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v15, v9, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v12, :cond_29

    invoke-static {v14, v12}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    :cond_29
    invoke-interface {v2, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    new-instance v2, Ll1/u;

    const/4 v14, 0x0

    invoke-direct {v2, v14, v8}, Ll1/u;-><init>(ILp1/c1;)V

    const v14, -0x1554d7ee

    invoke-static {v14, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v21

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    xor-int/lit8 v22, v2, 0x1

    new-instance v2, Ll1/i1;

    invoke-direct {v2, v6}, Ll1/i1;-><init>(Lm1/t;)V

    new-instance v8, Lu0/r0;

    const/4 v14, 0x7

    const/16 v15, 0x71

    const/4 v11, 0x3

    invoke-direct {v8, v9, v11, v14, v15}, Lu0/r0;-><init>(IIII)V

    move-object/from16 v11, p9

    iget-object v14, v11, Ll1/y;->y:Ll1/e4;

    shl-int/lit8 v15, v1, 0x6

    const/high16 v17, 0x1f80000

    and-int v32, v15, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x1

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v19, p4

    move-object/from16 v31, v0

    move-object/from16 v23, v2

    move-object v15, v3

    move-object/from16 v24, v8

    move-object/from16 v30, v14

    move-object/from16 v14, v20

    move-object/from16 v20, p5

    invoke-static/range {v14 .. v32}, Ll1/c3;->b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Ll1/e4;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v8, v31

    and-int/lit8 v0, v33, 0x70

    const/16 v2, 0x20

    if-ne v0, v2, :cond_2a

    move/from16 v15, v34

    goto :goto_1f

    :cond_2a
    move v15, v9

    :goto_1f
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v15, :cond_2b

    if-ne v0, v10, :cond_2c

    :cond_2b
    new-instance v0, Lkd/f;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v12, v3, v2}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v0, Lc93/m;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-static {v8, v0, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v1, 0x70

    const/16 v2, 0x20

    if-ne v0, v2, :cond_2d

    move/from16 v15, v34

    goto :goto_20

    :cond_2d
    move v15, v9

    :goto_20
    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v15

    const/high16 v3, 0x4000000

    if-ne v13, v3, :cond_2e

    move/from16 v15, v34

    goto :goto_21

    :cond_2e
    move v15, v9

    :goto_21
    or-int/2addr v0, v15

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_30

    if-ne v1, v10, :cond_2f

    goto :goto_22

    :cond_2f
    move-object/from16 v2, p1

    goto :goto_23

    :cond_30
    :goto_22
    new-instance v0, Ll1/v;

    const/4 v6, 0x0

    move-object/from16 v1, p1

    move-object/from16 v3, p7

    move-object v2, v4

    move-object v4, v7

    invoke-direct/range {v0 .. v6}, Ll1/v;-><init>(Ljava/lang/Long;Lm1/o;Lm1/t;Ljava/util/Locale;Lp1/c1;Lq83/d;)V

    move-object v2, v1

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_23
    check-cast v1, Lc93/m;

    invoke-static {v8, v1, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    goto :goto_24

    :cond_31
    move-object v8, v0

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_24
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_32

    new-instance v0, Ll1/t;

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v13, p13

    move-object v10, v11

    move-object v11, v12

    move/from16 v12, p12

    invoke-direct/range {v0 .. v13}, Ll1/t;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lm1/o;Lx1/b;Lx1/b;Ll1/x;Lm1/t;Ljava/util/Locale;Ll1/y;Lg2/s;II)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_32
    return-void
.end method
