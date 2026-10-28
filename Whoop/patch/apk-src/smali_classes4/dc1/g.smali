.class public abstract Ldc1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldc1/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aU\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0008\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001aI\u0010\u000b\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0008\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
        "style",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
        "theme",
        "Ll83/k;",
        "",
        "startPoint",
        "endPoint",
        "Lk61/c;",
        "h",
        "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Ll83/k;Ll83/k;)Lk61/c;",
        "d",
        "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Ll83/k;Ll83/k;)Lk61/c;",
        "design-models_release"
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
.method public static synthetic a(Ll83/k;Ll83/k;Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0, p1, p2}, Ldc1/g;->g(Ll83/k;Ll83/k;Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/g;->e(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ldc1/g;->f(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Ll83/k;Ll83/k;)Lk61/c;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
            "Ll83/k;",
            "Ll83/k;",
            ")",
            "Lk61/c;"
        }
    .end annotation

    sget-object v0, Ldc1/g$a;->a:[I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const v1, 0x3e99999a    # 0.3f

    const/high16 v2, 0x3f000000    # 0.5f

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    new-instance v1, Lk61/c;

    const/4 v0, 0x2

    int-to-float v2, v0

    sget-object v0, Ldc1/g$d0;->w:Ldc1/g$d0;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X0()J

    move-result-wide v6

    const/16 v9, 0x26

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_1
    new-instance v2, Lk61/c;

    new-instance v0, Lbp0/n;

    const/16 v1, 0xc

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    invoke-direct {v0, v1, v3, v4}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v6

    const/16 v10, 0x37

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :pswitch_2
    new-instance v3, Lk61/c;

    sget-object v0, Ldc1/g$c0;->w:Ldc1/g$c0;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v7

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->g0()J

    move-result-wide v0

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v8

    const/16 v11, 0x27

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :pswitch_3
    new-instance v0, Lk61/c;

    double-to-float v5, v3

    sget-object v1, Ldc1/g$b0;->w:Ldc1/g$b0;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v8

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->k0()J

    move-result-wide v9

    const/16 v12, 0x26

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v13}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :pswitch_4
    new-instance v5, Lk61/c;

    double-to-float v6, v3

    sget-object v0, Ldc1/g$a0;->w:Ldc1/g$a0;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v9

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->k0()J

    move-result-wide v10

    const/16 v13, 0x26

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v14}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :pswitch_5
    new-instance v6, Lk61/c;

    double-to-float v7, v3

    sget-object v0, Ldc1/g$z;->w:Ldc1/g$z;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v10

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->k0()J

    move-result-wide v11

    const/16 v14, 0x26

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v15}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :pswitch_6
    new-instance v7, Lk61/c;

    double-to-float v8, v3

    sget-object v0, Ldc1/g$y;->w:Ldc1/g$y;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v11

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v12

    const/16 v15, 0x26

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :pswitch_7
    new-instance v8, Lk61/c;

    double-to-float v9, v3

    sget-object v0, Ldc1/g$x;->w:Ldc1/g$x;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v12

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->f0()J

    move-result-wide v13

    const/16 v16, 0x26

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v17}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :pswitch_8
    new-instance v9, Lk61/c;

    double-to-float v10, v3

    sget-object v0, Ldc1/g$w;->w:Ldc1/g$w;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v13

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->Y0()J

    move-result-wide v14

    const/16 v17, 0x26

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v18}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :pswitch_9
    new-instance v10, Lk61/c;

    int-to-float v11, v5

    sget-object v0, Ldc1/g$v;->w:Ldc1/g$v;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v14

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v15

    const/16 v18, 0x26

    const/16 v19, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v19}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v10

    :pswitch_a
    new-instance v0, Lk61/c;

    int-to-float v1, v5

    sget-object v2, Ldc1/g$t;->w:Ldc1/g$t;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->n0()J

    move-result-wide v5

    const/16 v8, 0x26

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_b
    new-instance v1, Lk61/c;

    int-to-float v2, v5

    sget-object v0, Ldc1/g$s;->w:Ldc1/g$s;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->g0()J

    move-result-wide v6

    const/16 v9, 0x26

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_c
    new-instance v2, Lk61/c;

    int-to-float v3, v5

    sget-object v0, Ldc1/g$r;->w:Ldc1/g$r;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v6

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->i0()J

    move-result-wide v7

    const/16 v10, 0x26

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :pswitch_d
    new-instance v3, Lk61/c;

    int-to-float v4, v5

    sget-object v0, Ldc1/g$q;->w:Ldc1/g$q;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v7

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->f()J

    move-result-wide v8

    const/16 v11, 0x26

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :pswitch_e
    new-instance v4, Lk61/c;

    int-to-float v5, v5

    sget-object v0, Ldc1/g$p;->w:Ldc1/g$p;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v8

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->j()J

    move-result-wide v9

    const/16 v12, 0x26

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v13}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :pswitch_f
    new-instance v0, Lk61/c;

    int-to-float v6, v5

    sget-object v1, Ldc1/g$o;->w:Ldc1/g$o;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v9

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v10

    const/16 v13, 0x26

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v14}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :pswitch_10
    new-instance v6, Lk61/c;

    int-to-float v7, v5

    sget-object v0, Ldc1/g$n;->w:Ldc1/g$n;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v10

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->l0()J

    move-result-wide v11

    const/16 v14, 0x26

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v15}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :pswitch_11
    new-instance v7, Lk61/c;

    int-to-float v8, v5

    sget-object v0, Ldc1/g$m;->w:Ldc1/g$m;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v11

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->h0()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v12

    const/16 v15, 0x26

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :pswitch_12
    new-instance v8, Lk61/c;

    sget-object v0, Ldc1/g$l;->w:Ldc1/g$l;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v12

    const/16 v16, 0x37

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v17}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :pswitch_13
    new-instance v9, Lk61/c;

    new-instance v0, Ldc1/c;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ldc1/c;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v13

    const/16 v17, 0x37

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v18}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :pswitch_14
    new-instance v10, Lk61/c;

    int-to-float v11, v5

    sget-object v0, Ldc1/g$j;->w:Ldc1/g$j;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v14

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->k0()J

    move-result-wide v15

    const/16 v18, 0x26

    const/16 v19, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v19}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v10

    :pswitch_15
    new-instance v0, Lk61/c;

    sget-object v1, Ldc1/g$i;->w:Ldc1/g$i;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->a()J

    move-result-wide v5

    invoke-static {v2, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v5

    const/16 v8, 0x27

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_16
    new-instance v1, Lk61/c;

    int-to-float v2, v5

    sget-object v0, Ldc1/g$h;->w:Ldc1/g$h;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->f0()J

    move-result-wide v6

    const/16 v9, 0x26

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_17
    new-instance v0, Lk61/c;

    new-instance v1, Ldc1/c;

    const/16 v3, 0xf

    invoke-direct {v1, v3}, Ldc1/c;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v6

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->f0()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v7

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x1

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :pswitch_18
    new-instance v3, Lk61/c;

    sget-object v0, Ldc1/g$g;->w:Ldc1/g$g;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v7

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->f0()J

    move-result-wide v0

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v8

    const/16 v11, 0x27

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :pswitch_19
    new-instance v4, Lk61/c;

    int-to-float v5, v5

    sget-object v0, Ldc1/g$f;->w:Ldc1/g$f;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v8

    const/16 v12, 0x36

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v13}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :pswitch_1a
    new-instance v0, Lk61/c;

    int-to-float v6, v5

    sget-object v2, Ldc1/g$e;->w:Ldc1/g$e;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v9

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->j0()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v10

    const/16 v13, 0x26

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v14}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :pswitch_1b
    new-instance v6, Lk61/c;

    int-to-float v7, v5

    sget-object v0, Ldc1/g$d;->w:Ldc1/g$d;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v10

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v11

    const/16 v14, 0x26

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v15}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :pswitch_1c
    new-instance v7, Lk61/c;

    sget-object v0, Ldc1/g$c;->w:Ldc1/g$c;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v11

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v0

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v12

    const/16 v15, 0x27

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :pswitch_1d
    new-instance v8, Lk61/c;

    sget-object v0, Ldc1/g$b;->w:Ldc1/g$b;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v12

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->k0()J

    move-result-wide v0

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v13

    const/16 v16, 0x27

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v17}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :pswitch_1e
    new-instance v9, Lk61/c;

    sget-object v0, Ldc1/g$k0;->w:Ldc1/g$k0;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v13

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->k0()J

    move-result-wide v0

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v14

    const/16 v17, 0x27

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v18}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :pswitch_1f
    new-instance v10, Lk61/c;

    sget-object v0, Ldc1/g$j0;->w:Ldc1/g$j0;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v14

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->Y0()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v15

    const/16 v18, 0x27

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v19}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v10

    :pswitch_20
    new-instance v0, Lk61/c;

    int-to-float v1, v5

    sget-object v2, Ldc1/g$i0;->w:Ldc1/g$i0;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->n0()J

    move-result-wide v5

    const/16 v8, 0x26

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_21
    new-instance v1, Lk61/c;

    int-to-float v2, v5

    sget-object v0, Ldc1/g$h0;->w:Ldc1/g$h0;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->p0()J

    move-result-wide v6

    const/16 v9, 0x26

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_22
    new-instance v2, Lk61/c;

    int-to-float v3, v5

    sget-object v0, Ldc1/g$g0;->w:Ldc1/g$g0;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v6

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->i0()J

    move-result-wide v7

    const/16 v10, 0x26

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :pswitch_23
    new-instance v3, Lk61/c;

    int-to-float v4, v5

    sget-object v0, Ldc1/g$f0;->w:Ldc1/g$f0;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v7

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->m0()J

    move-result-wide v8

    const/16 v11, 0x26

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :pswitch_24
    new-instance v4, Lk61/c;

    sget-object v0, Ldc1/g$e0;->w:Ldc1/g$e0;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v8

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->f0()J

    move-result-wide v0

    invoke-static {v2, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v9

    const/16 v12, 0x27

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v13}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :pswitch_25
    new-instance v0, Lk61/c;

    int-to-float v6, v5

    sget-object v1, Ldc1/g$u;->w:Ldc1/g$u;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v9

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->o0()J

    move-result-wide v10

    const/16 v13, 0x26

    const/4 v14, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v14}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :pswitch_26
    new-instance v6, Lk61/c;

    int-to-float v7, v5

    sget-object v0, Ldc1/g$k;->w:Ldc1/g$k;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v10

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->g0()J

    move-result-wide v11

    const/16 v14, 0x26

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v15}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final e(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    const-wide v2, 0xffb9bfa9L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    const/high16 p0, 0x3f000000    # 0.5f

    invoke-static {p0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0xffc6e3dfL

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    invoke-static {p0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0xffd9c6b6L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    invoke-static {p0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0xffb3a8c0L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    invoke-static {p0, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, v4, v5, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ly81/i;)Li2/t;
    .locals 5

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ll83/k;Ll83/k;Ly81/i;)Li2/t;
    .locals 9

    const-string v0, "$this$brushBackground"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p2}, Ly81/i;->f()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p2}, Ly81/i;->X0()J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p2}, Ly81/i;->j()J

    move-result-wide v2

    new-instance p2, Li2/x;

    invoke-direct {p2, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, v4, p2}, [Li2/x;

    move-result-object p2

    invoke-static {p2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {p0, p1}, Lor2/a1;->b(Ll83/k;Ll83/k;)Ljava/util/List;

    move-result-object v3

    invoke-static {p0, p1}, Lor2/a1;->a(Ll83/k;Ll83/k;)F

    move-result v5

    const/16 v7, 0x14

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lgb1/u;->b(Li2/s;Ljava/util/List;Ljava/util/List;IFZILjava/lang/Object;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Ll83/k;Ll83/k;)Lk61/c;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
            "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
            "Ll83/k;",
            "Ll83/k;",
            ")",
            "Lk61/c;"
        }
    .end annotation

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p3}, Ldc1/g;->d(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Ll83/k;Ll83/k;)Lk61/c;

    move-result-object p0

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getStrokeColor()Ly81/f;

    move-result-object p3

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getStrokeWidth()Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, p2

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getDashPattern()Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, p2

    :goto_2
    if-nez p0, :cond_3

    if-nez p3, :cond_3

    if-nez v0, :cond_3

    if-nez p1, :cond_3

    return-object p2

    :cond_3
    if-nez p0, :cond_4

    new-instance v1, Lk61/c;

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    goto :goto_3

    :cond_4
    move-object v2, p0

    :goto_3
    if-eqz p3, :cond_6

    invoke-static {p3}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object p0

    if-nez p0, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    move-object v6, p0

    goto :goto_6

    :cond_6
    :goto_5
    invoke-virtual {v2}, Lk61/c;->c()Li91/a;

    move-result-object p0

    goto :goto_4

    :goto_6
    if-eqz v0, :cond_7

    invoke-static {v0}, Ldc1/h;->a(Lcom/whoop/design/models/items/graph/plot/line/LineWidth;)F

    move-result p0

    :goto_7
    move v3, p0

    goto :goto_8

    :cond_7
    invoke-virtual {v2}, Lk61/c;->g()F

    move-result p0

    goto :goto_7

    :goto_8
    if-eqz p1, :cond_9

    sget-object p0, Lcom/whoop/design/models/items/graph/plot/line/DashPattern;->SOLID:Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    if-eq p1, p0, :cond_8

    const/4 p0, 0x1

    goto :goto_9

    :cond_8
    const/4 p0, 0x0

    :goto_9
    move v9, p0

    goto :goto_a

    :cond_9
    invoke-virtual {v2}, Lk61/c;->h()Z

    move-result p0

    goto :goto_9

    :goto_a
    const/16 v10, 0x16

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v2 .. v11}, Lk61/c;->b(Lk61/c;FIILi91/a;JZILjava/lang/Object;)Lk61/c;

    move-result-object p0

    return-object p0
.end method
