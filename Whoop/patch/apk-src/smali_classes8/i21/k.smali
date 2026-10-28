.class public abstract Li21/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Li21/j;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "()Lcom/whoop/design/util/TextResource;",
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


# direct methods
.method private static final a()Lcom/whoop/design/util/TextResource;
    .locals 11

    new-instance v0, Li93/j;

    const/16 v1, 0xf

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, v2}, Li93/h;-><init>(III)V

    sget-object v1, Lg93/d;->w:Lg93/c;

    :try_start_0
    invoke-static {v0}, Lo73/a;->U(Li93/j;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    new-instance v1, Li93/c;

    const/16 v3, 0x41

    const/16 v4, 0x5a

    invoke-direct {v1, v3, v4}, Li93/a;-><init>(CC)V

    new-instance v3, Li93/j;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v0, v2}, Li93/h;-><init>(III)V

    new-instance v5, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {v3, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    move-object v3, v0

    check-cast v3, Li93/i;

    iget-boolean v3, v3, Li93/i;->y:Z

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lm83/e0;

    invoke-virtual {v3}, Lm83/e0;->nextInt()I

    sget-object v3, Lg93/d;->w:Lg93/c;

    :try_start_1
    iget-char v3, v1, Li93/a;->w:C

    iget-char v4, v1, Li93/a;->x:C

    add-int/2addr v4, v2

    sget-object v6, Lg93/d;->x:Lg93/a;

    invoke-virtual {v6, v3, v4}, Lg93/d;->h(II)I

    move-result v3
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    int-to-char v3, v3

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    const/4 v9, 0x0

    const/16 v10, 0x3e

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    return-object v0

    :catch_1
    move-exception v0

    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Li21/j;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v1, Li21/j;

    const-string v2, "Eating a diet of only easy mac and beef jerky"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {}, Lz11/a;->h()Ly11/r;

    move-result-object v4

    new-instance v5, Li21/l$a;

    const-string v18, "+24%"

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v22, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    new-instance v15, Ljava/util/UUID;

    const-wide/16 v7, 0x0

    invoke-direct {v15, v7, v8, v7, v8}, Ljava/util/UUID;-><init>(JJ)V

    const/16 v16, 0x1fa

    const/16 v17, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v8, v22

    invoke-direct/range {v5 .. v17}, Li21/l$a;-><init>(Lcom/whoop/design/util/TextResource;ZLy81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lhy0/h1;Ljava/util/List;Ly81/f;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v7}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Li21/j;

    const-string v3, "Throwing your whoop into the pool and replacing it with an Oura"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {}, Lz11/a;->c()Ly11/r;

    move-result-object v5

    new-instance v6, Li21/l$a;

    const-string v4, "-24%"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    sget-object v12, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const/16 v34, 0x3fa

    const/16 v35, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v23, v6

    move-object/from16 v26, v12

    invoke-direct/range {v23 .. v35}, Li21/l$a;-><init>(Lcom/whoop/design/util/TextResource;ZLy81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lhy0/h1;Ljava/util/List;Ly81/f;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Li21/j;

    const-string v4, "Caffeine"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {}, Lz11/a;->h()Ly11/r;

    move-result-object v6

    new-instance v19, Li21/l$a;

    const-string v5, "+4%"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const-string v5, "Avoid caffeine 8 hours before bedtime"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    sget-object v24, Ly81/f;->WHITE_70:Ly81/f;

    const/16 v30, 0x3e2

    const/16 v21, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v19 .. v31}, Li21/l$a;-><init>(Lcom/whoop/design/util/TextResource;ZLy81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lhy0/h1;Ljava/util/List;Ly81/f;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x2

    const/4 v5, 0x0

    move-object/from16 v7, v19

    invoke-direct/range {v3 .. v9}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Li21/j;

    const-string v5, "Yelling into the void"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {}, Lz11/a;->h()Ly11/r;

    move-result-object v7

    new-instance v19, Li21/l$a;

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    new-instance v6, Li21/u;

    sget-object v8, Li21/v;->NEW:Li21/v;

    const-string v9, "NEW"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v10, Ly81/f;->NEUTRAL_15:Ly81/f;

    sget-object v11, Ly81/f;->RECOVERY:Ly81/f;

    invoke-direct {v6, v8, v9, v10, v11}, Li21/u;-><init>(Li21/v;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;)V

    const/16 v30, 0x2da

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v25, v6

    move-object/from16 v28, v11

    invoke-direct/range {v19 .. v31}, Li21/l$a;-><init>(Lcom/whoop/design/util/TextResource;ZLy81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lhy0/h1;Ljava/util/List;Ly81/f;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v6, 0x0

    move-object/from16 v8, v19

    invoke-direct/range {v4 .. v10}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Li21/j;

    const-string v6, "Crying at least twice a day"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {}, Lz11/a;->f()Ly11/r;

    move-result-object v8

    new-instance v9, Li21/l$d;

    const-string v7, "life is pain"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const-string v7, "12"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const-string v23, "32"

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v28, Ly81/f;->WHITE_50:Ly81/f;

    sget-object v29, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/16 v21, 0x60

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v13, v9

    move-object/from16 v17, v28

    move-object/from16 v18, v29

    invoke-direct/range {v13 .. v22}, Li21/l$d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ljava/util/List;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v5 .. v11}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Li21/j;

    const-string v6, "Saying life is pain twice a day"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {}, Lz11/a;->f()Ly11/r;

    move-result-object v16

    new-instance v17, Li21/l$d;

    const-string v6, "1"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    const-string v7, "89"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v27

    const/16 v32, 0x61

    const/16 v25, 0x0

    const/16 v30, 0x0

    move-object/from16 v24, v17

    invoke-direct/range {v24 .. v33}, Li21/l$d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ljava/util/List;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x2

    const/4 v15, 0x0

    invoke-direct/range {v13 .. v19}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v13

    new-instance v7, Li21/j;

    const-string v8, "Having an imaginary friend"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {}, Lz11/a;->f()Ly11/r;

    move-result-object v10

    new-instance v34, Li21/l$d;

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    const-string v6, "3"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v27

    move-object/from16 v24, v34

    invoke-direct/range {v24 .. v33}, Li21/l$d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ljava/util/List;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v35, 0x2

    const/16 v36, 0x0

    const/16 v32, 0x0

    move-object/from16 v30, v7

    move-object/from16 v31, v9

    move-object/from16 v33, v10

    invoke-direct/range {v30 .. v36}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v30

    new-instance v7, Li21/j;

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {}, Lz11/a;->f()Ly11/r;

    move-result-object v9

    new-instance v34, Li21/l$d;

    const-string v10, "54"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v27

    const/16 v32, 0x61

    const/16 v33, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v24, v34

    invoke-direct/range {v24 .. v33}, Li21/l$d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ljava/util/List;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, v28

    const/16 v32, 0x0

    move-object/from16 v30, v7

    move-object/from16 v31, v8

    move-object/from16 v33, v9

    invoke-direct/range {v30 .. v36}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v30

    new-instance v19, Li21/j;

    const-string v7, "Drinking a keg a day, doing 2 back flips and then breaking the sound barrier"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-static {}, Lz11/a;->f()Ly11/r;

    move-result-object v22

    new-instance v23, Li21/l$e;

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7}, Lb9/y;->c(Lx81/d;)I

    move-result v24

    const-string v7, "Unable to calculate impact. Please log more responses"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const/4 v7, 0x6

    invoke-virtual {v10, v0, v7}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v26

    const/16 v28, 0x0

    invoke-direct/range {v23 .. v28}, Li21/l$e;-><init>(ILcom/whoop/design/util/TextResource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v24, 0x2

    const/16 v25, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v19 .. v25}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v20, Li21/j;

    const-string v8, "Being alive"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-static {}, Lz11/a;->f()Ly11/r;

    move-result-object v23

    new-instance v24, Li21/l$c;

    const-string v8, "-%"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const-string v8, "Impact pending, will be calculated on next refresh"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    invoke-virtual {v10, v0, v7}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v27

    const/16 v29, 0x0

    invoke-direct/range {v24 .. v29}, Li21/l$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v25, 0x2

    const/16 v26, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v20 .. v26}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v21, Li21/j;

    invoke-static {}, Li21/k;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v22

    new-instance v23, Ly11/r;

    const/16 v31, 0x7f

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v23 .. v32}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v24, Li21/l$a;

    const-string v0, "24%"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const/16 v35, 0x3fc

    const/16 v26, 0x1

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v24 .. v36}, Li21/l$a;-><init>(Lcom/whoop/design/util/TextResource;ZLy81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lhy0/h1;Ljava/util/List;Ly81/f;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v26, 0x2

    move-object/from16 v25, v24

    move-object/from16 v24, v23

    const/16 v23, 0x0

    invoke-direct/range {v21 .. v27}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v22, Li21/j;

    invoke-static {}, Li21/k;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v23

    new-instance v7, Ly11/r;

    const/16 v15, 0x63

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x3ecccccd    # 0.4f

    const/high16 v11, 0x3f000000    # 0.5f

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v0, "-6%"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v25, Li21/l$a;

    const/16 v36, 0x3f8

    const/16 v37, 0x0

    const/16 v27, 0x1

    const/16 v35, 0x0

    move-object/from16 v28, v12

    invoke-direct/range {v25 .. v37}, Li21/l$a;-><init>(Lcom/whoop/design/util/TextResource;ZLy81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lhy0/h1;Ljava/util/List;Ly81/f;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v27, 0x2

    const/16 v28, 0x0

    const/16 v24, 0x0

    move-object/from16 v26, v25

    move-object/from16 v25, v7

    invoke-direct/range {v22 .. v28}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v23, Li21/j;

    invoke-static {}, Li21/k;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v24

    new-instance v7, Ly11/r;

    const v10, 0x3e4ccccd    # 0.2f

    invoke-direct/range {v7 .. v16}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v0, "-13%"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v25, Li21/l$a;

    const/16 v27, 0x1

    move-object/from16 v28, v12

    invoke-direct/range {v25 .. v37}, Li21/l$a;-><init>(Lcom/whoop/design/util/TextResource;ZLy81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li21/u;Lhy0/h1;Ljava/util/List;Ly81/f;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v28, 0x2

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v26, v7

    invoke-direct/range {v23 .. v29}, Li21/j;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;Li21/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v5, v17

    move-object/from16 v7, v18

    move-object/from16 v8, v19

    move-object/from16 v9, v20

    move-object/from16 v10, v21

    move-object/from16 v11, v22

    move-object/from16 v12, v23

    filled-new-array/range {v0 .. v12}, [Li21/j;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
