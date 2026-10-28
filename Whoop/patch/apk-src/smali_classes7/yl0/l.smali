.class public final Lyl0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyl0/l$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lyl0/l;",
        "",
        "Ll21/c;",
        "initialViewState",
        "<init>",
        "(Ll21/c;)V",
        "Lyl0/g;",
        "",
        "served",
        "a",
        "(Lyl0/g;Ljava/lang/Double;)Ljava/lang/Double;",
        "domainState",
        "",
        "Lm91/u;",
        "items",
        "Lyl0/c;",
        "b",
        "(Lyl0/g;Ljava/util/List;)Lyl0/c;",
        "Lyl0/o;",
        "c",
        "(Lyl0/g;)Lyl0/o;",
        "Ll21/c;",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ll21/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ll21/c;->h:I

    sput v0, Lyl0/l;->b:I

    return-void
.end method

.method public constructor <init>(Ll21/c;)V
    .locals 1

    const-string v0, "initialViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyl0/l;->a:Ll21/c;

    return-void
.end method

.method private final a(Lyl0/g;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 1

    invoke-virtual {p1}, Lyl0/g;->j()Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lyl0/g;->h()Z

    move-result p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v0
.end method

.method private final b(Lyl0/g;Ljava/util/List;)Lyl0/c;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyl0/g;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;)",
            "Lyl0/c;"
        }
    .end annotation

    invoke-virtual {p1}, Lyl0/g;->m()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lyl0/g;->i()Lyl0/a;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lw71/y;

    if-eqz v4, :cond_2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lw71/y;

    invoke-virtual {v3}, Lw71/y;->j()Lw71/f0;

    move-result-object v3

    instance-of v3, v3, Lw71/f0$b;

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_5
    move-object v2, v1

    :goto_1
    check-cast v2, Lw71/y;

    if-nez v2, :cond_6

    :goto_2
    return-object v1

    :cond_6
    new-instance v3, Lyl0/c;

    iget-object p2, p0, Lyl0/l;->a:Ll21/c;

    invoke-virtual {p2}, Ll21/c;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lw71/y;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lyl0/g;->j()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v0}, Lyl0/a;->d()D

    move-result-wide v7

    invoke-virtual {v0}, Lyl0/a;->c()D

    move-result-wide v9

    invoke-virtual {v0}, Lyl0/a;->b()I

    move-result v11

    invoke-virtual {v0}, Lyl0/a;->e()Ljava/lang/String;

    move-result-object v12

    invoke-direct/range {v3 .. v12}, Lyl0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;DDILjava/lang/String;)V

    return-object v3
.end method


# virtual methods
.method public final c(Lyl0/g;)Lyl0/o;
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "domainState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lyl0/g;->d()Lyl0/e;

    move-result-object v2

    sget-object v3, Lyl0/l$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eq v2, v7, :cond_2

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_1
    :goto_0
    move v14, v7

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    move v14, v2

    :goto_1
    iget-object v2, v0, Lyl0/l;->a:Ll21/c;

    invoke-virtual {v2}, Ll21/c;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lm91/u;

    instance-of v11, v9, Lw71/y;

    if-eqz v11, :cond_13

    check-cast v9, Lw71/y;

    invoke-virtual {v9}, Lw71/y;->j()Lw71/f0;

    move-result-object v11

    instance-of v12, v11, Lw71/f0$i;

    if-eqz v12, :cond_4

    check-cast v11, Lw71/f0$i;

    invoke-virtual {v1}, Lyl0/g;->c()Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v11, v10}, Lw71/f0$i;->a(Ljava/lang/Boolean;)Lw71/f0$i;

    move-result-object v11

    :cond_3
    :goto_3
    move-object v15, v11

    goto/16 :goto_c

    :cond_4
    instance-of v12, v11, Lw71/f0$d;

    if-eqz v12, :cond_7

    move-object v15, v11

    check-cast v15, Lw71/f0$d;

    invoke-virtual {v15}, Lw71/f0$d;->e()Ljava/lang/Integer;

    move-result-object v11

    if-eqz v11, :cond_5

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    int-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    goto :goto_4

    :cond_5
    move-object v11, v10

    :goto_4
    invoke-direct {v0, v1, v11}, Lyl0/l;->a(Lyl0/g;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v11

    if-eqz v11, :cond_6

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    double-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    :cond_6
    move-object/from16 v16, v10

    const/16 v19, 0x6

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Lw71/f0$d;->b(Lw71/f0$d;Ljava/lang/Integer;IIILjava/lang/Object;)Lw71/f0$d;

    move-result-object v11

    goto :goto_3

    :cond_7
    instance-of v12, v11, Lw71/f0$e;

    if-eqz v12, :cond_c

    move-object v15, v11

    check-cast v15, Lw71/f0$e;

    invoke-virtual {v15}, Lw71/f0$e;->g()Ljava/lang/Integer;

    move-result-object v11

    if-eqz v11, :cond_8

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    int-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    goto :goto_5

    :cond_8
    move-object v11, v10

    :goto_5
    invoke-direct {v0, v1, v11}, Lyl0/l;->a(Lyl0/g;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v11

    if-eqz v11, :cond_9

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    double-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    move-object/from16 v16, v11

    goto :goto_6

    :cond_9
    move-object/from16 v16, v10

    :goto_6
    if-eqz v16, :cond_a

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    move-result v10

    iget-object v11, v0, Lyl0/l;->a:Ll21/c;

    invoke-virtual {v11}, Ll21/c;->f()Ljava/util/Map;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    :cond_a
    if-nez v10, :cond_b

    const-string v10, ""

    :cond_b
    move-object/from16 v20, v10

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v15 .. v22}, Lw71/f0$e;->b(Lw71/f0$e;Ljava/lang/Integer;IIILjava/lang/String;ILjava/lang/Object;)Lw71/f0$e;

    move-result-object v11

    goto/16 :goto_3

    :cond_c
    instance-of v12, v11, Lw71/f0$b;

    if-eqz v12, :cond_d

    move-object v15, v11

    check-cast v15, Lw71/f0$b;

    invoke-virtual {v15}, Lw71/f0$b;->f()Ljava/lang/Double;

    move-result-object v10

    invoke-direct {v0, v1, v10}, Lyl0/l;->a(Lyl0/g;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v16

    const/16 v21, 0x1e

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v15 .. v22}, Lw71/f0$b;->b(Lw71/f0$b;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;ILjava/lang/Object;)Lw71/f0$b;

    move-result-object v11

    goto/16 :goto_3

    :cond_d
    instance-of v12, v11, Lw71/f0$g;

    if-eqz v12, :cond_3

    invoke-virtual {v1}, Lyl0/g;->k()Ljava/lang/Long;

    move-result-object v12

    if-nez v12, :cond_e

    move-object v12, v11

    check-cast v12, Lw71/f0$g;

    invoke-virtual {v12}, Lw71/f0$g;->c()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v1}, Lyl0/g;->h()Z

    move-result v13

    if-nez v13, :cond_f

    :cond_e
    move-object v10, v12

    :cond_f
    move-object v15, v11

    check-cast v15, Lw71/f0$g;

    if-eqz v10, :cond_10

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    :goto_7
    move-wide/from16 v21, v11

    goto :goto_8

    :cond_10
    const-wide/16 v11, 0x0

    goto :goto_7

    :goto_8
    if-eqz v10, :cond_12

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    new-instance v12, Lorg/joda/time/DateTime;

    invoke-direct {v12, v10, v11}, Lorg/joda/time/DateTime;-><init>(J)V

    const-string v10, "h:mm a"

    invoke-virtual {v12, v10}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    if-nez v10, :cond_11

    goto :goto_a

    :cond_11
    :goto_9
    move-object/from16 v16, v10

    goto :goto_b

    :cond_12
    :goto_a
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    goto :goto_9

    :goto_b
    const/16 v23, 0x6

    const/16 v24, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    invoke-static/range {v15 .. v24}, Lw71/f0$g;->b(Lw71/f0$g;Lcom/whoop/design/util/TextResource;JJJILjava/lang/Object;)Lw71/f0$g;

    move-result-object v11

    goto/16 :goto_3

    :goto_c
    const/16 v19, 0x39f

    const/16 v20, 0x0

    move-object/from16 v18, v8

    move-object v8, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v3, v21

    invoke-static/range {v8 .. v20}, Lw71/y;->b(Lw71/y;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILjava/lang/Object;)Lw71/y;

    move-result-object v9

    goto :goto_d

    :cond_13
    move-object v3, v8

    :goto_d
    invoke-interface {v3, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v8, v3

    const/4 v3, 0x5

    goto/16 :goto_2

    :cond_14
    move-object v3, v8

    iget-object v2, v0, Lyl0/l;->a:Ll21/c;

    invoke-virtual {v2}, Ll21/c;->c()Lm91/u;

    move-result-object v2

    instance-of v8, v2, Ll11/e;

    if-eqz v8, :cond_15

    move-object v10, v2

    check-cast v10, Ll11/e;

    :cond_15
    move-object/from16 v23, v10

    if-eqz v23, :cond_1c

    invoke-virtual {v1}, Lyl0/g;->d()Lyl0/e;

    move-result-object v2

    sget-object v8, Lyl0/l$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v8, v2

    if-eq v2, v7, :cond_1a

    if-eq v2, v6, :cond_19

    if-eq v2, v5, :cond_18

    if-eq v2, v4, :cond_17

    const/4 v4, 0x5

    if-ne v2, v4, :cond_16

    sget-object v31, Ll11/d$f;->a:Ll11/d$f;

    const/16 v36, 0xf7f

    const/16 v37, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v23 .. v37}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v23

    goto/16 :goto_e

    :cond_16
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_17
    sget-object v31, Ll11/d$a;->a:Ll11/d$a;

    const/16 v36, 0xf7f

    const/16 v37, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v23 .. v37}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v23

    goto :goto_e

    :cond_18
    sget-object v31, Ll11/d$c;->a:Ll11/d$c;

    const/16 v36, 0xf5f

    const/16 v37, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-string v29, ""

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v23 .. v37}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v23

    goto :goto_e

    :cond_19
    sget-object v31, Ll11/d$g;->a:Ll11/d$g;

    const/16 v36, 0xf7f

    const/16 v37, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v23 .. v37}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v23

    goto :goto_e

    :cond_1a
    invoke-virtual/range {v23 .. v23}, Ll11/e;->j()Z

    move-result v2

    if-eqz v2, :cond_1b

    sget-object v31, Ll11/d$d;->a:Ll11/d$d;

    const/16 v36, 0xf7f

    const/16 v37, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v23 .. v37}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v23

    :cond_1b
    :goto_e
    if-eqz v23, :cond_1c

    :goto_f
    move-object/from16 v19, v23

    goto :goto_10

    :cond_1c
    iget-object v2, v0, Lyl0/l;->a:Ll21/c;

    invoke-virtual {v2}, Ll21/c;->c()Lm91/u;

    move-result-object v23

    goto :goto_f

    :goto_10
    new-instance v2, Lyl0/o;

    iget-object v15, v0, Lyl0/l;->a:Ll21/c;

    const/16 v23, 0x73

    const/16 v24, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v18, v3

    invoke-static/range {v15 .. v24}, Ll21/c;->b(Ll21/c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm91/u;ZLjava/lang/Long;Ljava/util/Map;ILjava/lang/Object;)Ll21/c;

    move-result-object v3

    move-object/from16 v4, v18

    invoke-virtual {v1}, Lyl0/g;->g()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v1, v4}, Lyl0/l;->b(Lyl0/g;Ljava/util/List;)Lyl0/c;

    move-result-object v4

    invoke-virtual {v1}, Lyl0/g;->f()Z

    move-result v1

    invoke-direct {v2, v3, v5, v4, v1}, Lyl0/o;-><init>(Ll21/c;Ljava/lang/String;Lyl0/c;Z)V

    return-object v2
.end method
