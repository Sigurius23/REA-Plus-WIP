.class public abstract Ll21/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Ll21/c;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Ll21/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Ll21/c;",
        "getPreviewJournalEntryWidgetViewState",
        "()Ll21/c;",
        "previewJournalEntryWidgetViewState",
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


# static fields
.field private static final a:Ll21/c;


# direct methods
.method static constructor <clinit>()V
    .locals 30

    new-instance v0, Ll21/c;

    new-instance v1, Lw71/y;

    new-instance v8, Lw71/f0$i;

    const/4 v2, 0x0

    invoke-direct {v8, v2}, Lw71/f0$i;-><init>(Ljava/lang/Boolean;)V

    const/16 v12, 0x3ba

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "Did you have a ginger shot?"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lhy0/e;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v7}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lw71/y;

    new-instance v10, Lw71/f0$d;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0xa

    invoke-direct {v10, v5, v4, v6}, Lw71/f0$d;-><init>(Ljava/lang/Integer;II)V

    const/16 v14, 0x3ba

    const/4 v15, 0x0

    move v5, v4

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const-string v6, "How many shots?"

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v11, v9

    const/4 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v15}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lw71/y;

    new-instance v4, Lw71/f0$g;

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v5

    invoke-virtual {v5}, Lorg/joda/time/DateTime;->withTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object v5

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Lorg/joda/time/DateTime;->plusHours(I)Lorg/joda/time/DateTime;

    move-result-object v5

    const-string v7, "h:mm a"

    invoke-virtual {v5, v7}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {v7}, Lorg/joda/time/DateTime;->withTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {v7}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v7

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v9

    invoke-virtual {v9}, Lorg/joda/time/DateTime;->withTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object v9

    const/16 v10, 0x17

    invoke-virtual {v9, v10}, Lorg/joda/time/DateTime;->plusHours(I)Lorg/joda/time/DateTime;

    move-result-object v9

    const/16 v10, 0x1e

    invoke-virtual {v9, v10}, Lorg/joda/time/DateTime;->plusMinutes(I)Lorg/joda/time/DateTime;

    move-result-object v9

    invoke-virtual {v9}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v9

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v11

    invoke-virtual {v11}, Lorg/joda/time/DateTime;->withTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object v11

    invoke-virtual {v11, v6}, Lorg/joda/time/DateTime;->plusHours(I)Lorg/joda/time/DateTime;

    move-result-object v6

    invoke-virtual {v6}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v11

    move-wide v6, v7

    move-wide v8, v9

    move-wide v10, v11

    invoke-direct/range {v4 .. v11}, Lw71/f0$g;-><init>(Lcom/whoop/design/util/TextResource;JJJ)V

    const/16 v28, 0x3ba

    const/16 v29, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x0

    const-string v20, "What time?"

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v24, v4

    invoke-direct/range {v17 .. v29}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x4

    new-array v4, v4, [Lm91/u;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    aput-object v2, v4, v16

    const/4 v1, 0x2

    aput-object v3, v4, v1

    const/4 v1, 0x3

    aput-object v17, v4, v1

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {}, Ll11/c;->A()Ll11/e;

    move-result-object v4

    const/16 v17, 0xffd

    const/16 v18, 0x0

    const/4 v5, 0x0

    const-string v6, "ADD TO JOURNAL"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v4

    const/16 v8, 0x70

    const-string v1, "ginger-shot-preview"

    const-string v2, "Ginger Shot"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v9}, Ll21/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm91/u;ZLjava/lang/Long;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll21/b;->a:Ll21/c;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Ll21/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p6}, Ll21/b;->i(Ll21/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ll21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ll21/b;->g(Ll21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Ll21/b;->h(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll21/b;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ll21/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll21/c;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, -0xf4885f4

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v4, 0x6

    const/4 v3, 0x2

    const/4 v5, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    and-int/lit8 v6, p5, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v2, v8

    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v2, v10

    :goto_5
    and-int/lit16 v10, v2, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x1

    if-eq v10, v11, :cond_8

    move v10, v12

    goto :goto_6

    :cond_8
    const/4 v10, 0x0

    :goto_6
    and-int/2addr v2, v12

    invoke-virtual {v0, v2, v10}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_f

    if-eqz v6, :cond_9

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_9
    move-object v2, v7

    :goto_7
    if-eqz v8, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_a

    new-instance v6, Lkx1/b;

    const/16 v7, 0x14

    invoke-direct {v6, v7}, Lkx1/b;-><init>(I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v6, v9

    :goto_8
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v8, v12

    invoke-static {}, Lgb1/b0;->P()Li2/t;

    move-result-object v9

    const/4 v10, 0x3

    int-to-float v10, v10

    int-to-float v5, v5

    mul-float/2addr v10, v5

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v8, v7, v9, v5}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {}, Lgb1/b0;->P()Li2/t;

    move-result-object v5

    invoke-static {v5}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v14

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v15

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Li91/c;->e(Landroidx/compose/ui/Modifier;Li91/a;Li2/a1;Ljava/lang/Float;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v3, v3

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v3, v7

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    mul-float/2addr v8, v7

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x6

    invoke-static {v5, v7, v0, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    invoke-static {v7, v0, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll21/c;->h()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v3, "toUpperCase(...)"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v0, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->j()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x2fffa

    move-object v9, v6

    const/4 v6, 0x0

    move-object v3, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    const/16 v28, 0x0

    move/from16 v31, v27

    move-object/from16 v27, v0

    move/from16 v0, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-static {}, Lw71/z;->f()Lp1/t1;

    move-result-object v6

    sget-object v7, Lw71/a0;->COMPACT:Lw71/a0;

    invoke-virtual {v6, v7}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v6

    new-instance v7, Lj21/d;

    const/16 v8, 0x9

    invoke-direct {v7, v8, v1, v3}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v8, -0x455f2dbe

    invoke-static {v8, v5, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/16 v8, 0x38

    invoke-static {v6, v7, v5, v8}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v2, v7

    move-object v3, v9

    :goto_a
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Ll21/a;

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Ll21/a;-><init>(Ll21/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ll21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p3, v2

    move-object v8, p2

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    const p2, -0x6a4ab12b

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Ll21/c;->e()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v4, p3

    check-cast v4, Lm91/u;

    new-instance v6, Lgf1/e;

    const/16 p3, 0x15

    invoke-direct {v6, p3}, Lgf1/e;-><init>(I)V

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v5, 0x0

    move-object v7, p1

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    move-object v7, p1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {p0}, Ll21/c;->c()Lm91/u;

    move-result-object v4

    if-nez v4, :cond_2

    const p0, 0x20fa0347

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    :goto_2
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_2
    const p0, 0x20fa0348

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string p2, "state"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, -0x69acab2c

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    instance-of p0, p0, Lw71/y;

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    int-to-float p0, p0

    const/16 p2, 0x8

    int-to-float p2, p2

    mul-float v1, p0, p2

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method private static final i(Ll21/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ll21/b;->e(Ll21/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
