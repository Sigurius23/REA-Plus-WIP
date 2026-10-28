.class public abstract Luj/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, ""

    const-string v1, "_"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Luj/j;->a:[Ljava/lang/String;

    return-void
.end method

.method public static final a(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;
    .locals 23

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "--form-control-height"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Float;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v3, Ljava/lang/Float;

    goto :goto_0

    :cond_0
    move-object v3, v5

    :goto_0
    if-nez v3, :cond_2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Float;

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Ljava/lang/Float;

    goto :goto_1

    :cond_1
    move-object v3, v5

    :cond_2
    :goto_1
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v7

    const/4 v15, 0x0

    const v16, 0x1fffe

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v6, p0

    invoke-static/range {v6 .. v16}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object v2

    move-object v6, v2

    goto :goto_2

    :cond_3
    move-object/from16 v6, p0

    :goto_2
    const-string v2, "--form-control-width"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Float;

    if-eqz v4, :cond_4

    check-cast v3, Ljava/lang/Float;

    goto :goto_3

    :cond_4
    move-object v3, v5

    :goto_3
    if-nez v3, :cond_6

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Float;

    if-eqz v3, :cond_5

    move-object v3, v2

    check-cast v3, Ljava/lang/Float;

    goto :goto_4

    :cond_5
    move-object v3, v5

    :cond_6
    :goto_4
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    const/4 v15, 0x0

    const v16, 0x1fffd

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v6 .. v16}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object v6

    :cond_7
    move-object v7, v6

    const-string v2, "--form-control-padding-x"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Float;

    if-eqz v4, :cond_8

    check-cast v3, Ljava/lang/Float;

    goto :goto_5

    :cond_8
    move-object v3, v5

    :goto_5
    if-nez v3, :cond_a

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Float;

    if-eqz v3, :cond_9

    move-object v3, v2

    check-cast v3, Ljava/lang/Float;

    goto :goto_6

    :cond_9
    move-object v3, v5

    :cond_a
    :goto_6
    if-eqz v3, :cond_b

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v10

    const/16 v16, 0x0

    const v17, 0x1fffb

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v7 .. v17}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object v7

    :cond_b
    move-object v8, v7

    const-string v2, "--layout-radius-button"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Float;

    if-eqz v4, :cond_c

    check-cast v3, Ljava/lang/Float;

    goto :goto_7

    :cond_c
    move-object v3, v5

    :goto_7
    if-nez v3, :cond_e

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Float;

    if-eqz v3, :cond_d

    move-object v3, v2

    check-cast v3, Ljava/lang/Float;

    goto :goto_8

    :cond_d
    move-object v3, v5

    :cond_e
    :goto_8
    if-eqz v3, :cond_f

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v12

    const/16 v17, 0x0

    const v18, 0x1fff7

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v8 .. v18}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object v8

    :cond_f
    move-object v9, v8

    const-string v2, "--form-control-shadow"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_10

    check-cast v3, Ljava/lang/String;

    goto :goto_9

    :cond_10
    move-object v3, v5

    :goto_9
    if-nez v3, :cond_11

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_12

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    :cond_11
    move-object v15, v3

    goto :goto_a

    :cond_12
    move-object v15, v5

    :goto_a
    if-eqz v15, :cond_13

    const/16 v18, 0x0

    const v19, 0x1feff

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v9 .. v19}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object v9

    :cond_13
    move-object v10, v9

    const-string v2, "--form-control-shadow-color"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Li2/x;

    if-eqz v4, :cond_14

    check-cast v3, Li2/x;

    goto :goto_b

    :cond_14
    move-object v3, v5

    :goto_b
    if-nez v3, :cond_16

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Li2/x;

    if-eqz v3, :cond_15

    move-object v3, v2

    check-cast v3, Li2/x;

    goto :goto_c

    :cond_15
    move-object v3, v5

    :cond_16
    :goto_c
    if-eqz v3, :cond_17

    iget-wide v2, v3, Li2/x;->a:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    const/16 v19, 0x0

    const v20, 0x1fdff

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v17, v4

    invoke-static/range {v10 .. v20}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object v10

    :cond_17
    move-object v11, v10

    const-string v2, "--base-accent"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Li2/x;

    if-eqz v4, :cond_18

    check-cast v3, Li2/x;

    goto :goto_d

    :cond_18
    move-object v3, v5

    :goto_d
    if-nez v3, :cond_1a

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Li2/x;

    if-eqz v3, :cond_19

    move-object v3, v2

    check-cast v3, Li2/x;

    goto :goto_e

    :cond_19
    move-object v3, v5

    :cond_1a
    :goto_e
    if-eqz v3, :cond_1b

    iget-wide v2, v3, Li2/x;->a:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    const/16 v20, 0x0

    const v21, 0x1f7ff

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v4

    invoke-static/range {v11 .. v21}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object v11

    :cond_1b
    move-object v12, v11

    const-string v2, "--form-control-active-background"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Li2/x;

    if-eqz v3, :cond_1c

    check-cast v1, Li2/x;

    goto :goto_f

    :cond_1c
    move-object v1, v5

    :goto_f
    if-nez v1, :cond_1d

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Li2/x;

    if-eqz v1, :cond_1e

    move-object v5, v0

    check-cast v5, Li2/x;

    goto :goto_10

    :cond_1d
    move-object v5, v1

    :cond_1e
    :goto_10
    if-eqz v5, :cond_1f

    iget-wide v0, v5, Li2/x;->a:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    const v22, 0x1efff

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v2

    invoke-static/range {v12 .. v22}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object v0

    return-object v0

    :cond_1f
    return-object v12
.end method

.method public static final b(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;
    .locals 11

    const-string v0, "--font-weight-semibold"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p2, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_1
    move v5, p1

    goto :goto_2

    :cond_1
    const-string p2, "--font-weight-medium"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/Integer;

    if-eqz p2, :cond_2

    move-object v1, p1

    check-cast v1, Ljava/lang/Integer;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :goto_2
    const/4 v9, 0x0

    const v10, 0x1ff7f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v10}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object p0

    return-object p0

    :cond_3
    move-object v0, p0

    return-object v0
.end method

.method public static final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    instance-of v0, p0, Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/lang/Float;

    goto :goto_0

    :cond_1
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    double-to-float v0, v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/lang/String;

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v3, p0

    check-cast v3, Ljava/lang/String;

    const-string v4, "rgb(from rgb"

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    const/4 v6, 0x3

    const/4 v7, 0x4

    const/4 v8, 0x1

    const/16 v9, 0xff

    if-eqz v4, :cond_6

    sget-object v4, Luj/l;->b:Lyb3/p;

    invoke-virtual {v4, v3}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v3

    if-eqz v3, :cond_4

    new-array v4, v7, [F

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v10

    check-cast v10, Lyb3/l;

    invoke-virtual {v10, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v10

    aput v10, v4, v5

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v10

    check-cast v10, Lyb3/l;

    invoke-virtual {v10, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v10

    aput v10, v4, v8

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v10

    check-cast v10, Lyb3/l;

    invoke-virtual {v10, v6}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v10

    aput v10, v4, v2

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Lyb3/l;

    invoke-virtual {v3, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    aput v3, v4, v6

    goto :goto_1

    :cond_4
    move-object v4, v1

    :goto_1
    if-eqz v4, :cond_5

    aget v3, v4, v6

    int-to-float v6, v9

    mul-float/2addr v3, v6

    float-to-int v3, v3

    aget v5, v4, v5

    float-to-int v5, v5

    aget v6, v4, v8

    float-to-int v6, v6

    aget v4, v4, v2

    float-to-int v4, v4

    invoke-static {v5, v6, v4, v3}, Li2/w0;->d(IIII)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    goto/16 :goto_9

    :cond_5
    move-object v5, v1

    goto/16 :goto_9

    :cond_6
    const-string v4, "rgb(from #"

    invoke-static {v3, v4, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    const-string v10, "substring(...)"

    const/4 v11, 0x6

    if-eqz v4, :cond_9

    sget-object v4, Luj/l;->c:Lyb3/p;

    invoke-virtual {v4, v3}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Lyb3/l;

    invoke-virtual {v4, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Lyb3/l;

    invoke-virtual {v3, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    const-string v6, "<this>"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-gt v11, v6, :cond_7

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_3

    :cond_7
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    rsub-int/lit8 v4, v4, 0x6

    if-gt v8, v4, :cond_8

    :goto_2
    const/16 v12, 0x30

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eq v8, v4, :cond_8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_8
    move-object v4, v6

    :goto_3
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x10

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v5, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v4, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v8, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    invoke-virtual {v4, v7, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lva3/d;->c(I)V

    invoke-static {v4, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    invoke-static {v5, v8, v4, v9}, Li2/w0;->d(IIII)J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    goto/16 :goto_9

    :cond_9
    const-string v4, "color-mix"

    invoke-static {v3, v4, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    const/high16 v12, 0x3f800000    # 1.0f

    if-eqz v4, :cond_c

    sget-object v4, Luj/l;->d:Lyb3/p;

    invoke-virtual {v4, v3}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Lyb3/l;

    invoke-virtual {v4, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v5

    check-cast v5, Lyb3/l;

    invoke-virtual {v5, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v8

    check-cast v8, Lyb3/l;

    invoke-virtual {v8, v6}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v8

    check-cast v8, Lyb3/l;

    invoke-virtual {v8, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-nez v8, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v8

    check-cast v8, Lyb3/l;

    invoke-virtual {v8, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v7

    int-to-float v8, v9

    mul-float/2addr v7, v8

    float-to-int v9, v7

    :goto_4
    invoke-static {v9, v4, v5, v6}, Li2/w0;->d(IIII)J

    move-result-wide v4

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v6

    check-cast v6, Lyb3/l;

    invoke-virtual {v6, v11}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "white"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    sget-wide v6, Li2/x;->f:J

    goto :goto_5

    :cond_b
    const-string v7, "black"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    sget-wide v6, Li2/x;->b:J

    :goto_5
    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v3

    const/4 v8, 0x5

    check-cast v3, Lyb3/l;

    invoke-virtual {v3, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v3, v8

    sget v8, Luj/f;->A:I

    const/4 v8, 0x0

    invoke-static {v3, v8, v12}, Le93/b;->m(FFF)F

    move-result v3

    sub-float/2addr v12, v3

    invoke-static {v4, v5}, Li2/x;->e(J)F

    move-result v8

    mul-float/2addr v8, v3

    invoke-static {v6, v7}, Li2/x;->e(J)F

    move-result v9

    mul-float/2addr v9, v12

    add-float/2addr v9, v8

    float-to-int v8, v9

    invoke-static {v4, v5}, Li2/x;->i(J)F

    move-result v9

    mul-float/2addr v9, v3

    invoke-static {v6, v7}, Li2/x;->i(J)F

    move-result v10

    mul-float/2addr v10, v12

    add-float/2addr v10, v9

    float-to-int v9, v10

    invoke-static {v4, v5}, Li2/x;->h(J)F

    move-result v10

    mul-float/2addr v10, v3

    invoke-static {v6, v7}, Li2/x;->h(J)F

    move-result v11

    mul-float/2addr v11, v12

    add-float/2addr v11, v10

    float-to-int v10, v11

    invoke-static {v4, v5}, Li2/x;->f(J)F

    move-result v4

    mul-float/2addr v4, v3

    invoke-static {v6, v7}, Li2/x;->f(J)F

    move-result v3

    mul-float/2addr v3, v12

    add-float/2addr v3, v4

    float-to-int v3, v3

    invoke-static {v9, v10, v3, v8}, Li2/w0;->d(IIII)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    goto/16 :goto_9

    :cond_c
    const-string v4, "rgb"

    invoke-static {v3, v4, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-object v4, Luj/l;->e:Lyb3/p;

    invoke-virtual {v4, v3}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Lyb3/l;

    invoke-virtual {v4, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v10

    check-cast v10, Lyb3/l;

    invoke-virtual {v10, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v10

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v11

    check-cast v11, Lyb3/l;

    invoke-virtual {v11, v6}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v11

    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v13

    check-cast v13, Lyb3/l;

    invoke-virtual {v13, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/CharSequence;

    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-nez v13, :cond_d

    goto :goto_6

    :cond_d
    invoke-virtual {v3}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Lyb3/l;

    invoke-virtual {v3, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v12

    :goto_6
    new-array v3, v7, [F

    aput v4, v3, v5

    aput v10, v3, v8

    aput v11, v3, v2

    aput v12, v3, v6

    goto :goto_7

    :cond_e
    move-object v3, v1

    :goto_7
    if-eqz v3, :cond_5

    aget v4, v3, v6

    int-to-float v6, v9

    mul-float/2addr v4, v6

    float-to-int v4, v4

    aget v5, v3, v5

    float-to-int v5, v5

    aget v6, v3, v8

    float-to-int v6, v6

    aget v3, v3, v2

    float-to-int v3, v3

    invoke-static {v5, v6, v3, v4}, Li2/w0;->d(IIII)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    goto :goto_9

    :cond_f
    const-string v4, "#"

    invoke-static {v3, v4, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v3, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_10

    invoke-virtual {v6, v11, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v5, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    goto :goto_8

    :cond_10
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Li2/w0;->c(I)J

    move-result-wide v3

    :goto_8
    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    :goto_9
    if-eqz v5, :cond_11

    iget-wide v0, v5, Li2/x;->a:J

    new-instance p0, Li2/x;

    invoke-direct {p0, v0, v1}, Li2/x;-><init>(J)V

    return-object p0

    :cond_11
    if-eqz v0, :cond_13

    move-object v0, p0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Luj/l;->a:Lyb3/p;

    invoke-virtual {v1, v0}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-static {v2, v0}, Lyb3/r;->X(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    :cond_12
    return-object p0

    :cond_13
    return-object v1
.end method

.method public static d(Lorg/json/JSONObject;)Luj/m;
    .locals 132

    move-object/from16 v0, p0

    const-string v1, "mode"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-static {v1}, Le4/p;->f(I)[I

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    aget v6, v1, v5

    invoke-static {v6}, Lte0/d;->b(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    move v4, v6

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v1, 0x1

    if-nez v4, :cond_2

    move v4, v1

    :cond_2
    const-string v2, "theme"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_3
    const/4 v2, 0x2

    if-ne v4, v2, :cond_4

    sget-object v2, Luj/m;->p0:Luj/m;

    goto :goto_2

    :cond_4
    sget-object v2, Luj/m;->o0:Luj/m;

    :goto_2
    const-string v3, "lightMode"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_5

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :cond_5
    const-string v5, "varOverrides"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-nez v6, :cond_6

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    :cond_6
    invoke-static {v4}, Lte0/d;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_7

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_7
    move-object v4, v0

    const-string v0, "varDefaults"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_8

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_8
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-nez v5, :cond_9

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    :cond_9
    invoke-virtual {v6}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v7

    const-string v8, "lightModeVarOverrides.keys()"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    :cond_a
    invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v6

    const-string v7, "targetVarOverrides.keys()"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_4

    :cond_b
    new-instance v5, Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_c

    goto :goto_5

    :cond_c
    sget-object v10, Luj/l;->f:Lyb3/p;

    invoke-virtual {v10, v9}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v10

    :goto_6
    if-eqz v10, :cond_e

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "--"

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v12

    check-cast v12, Lyb3/l;

    invoke-virtual {v12, v1}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v11, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_d

    goto :goto_7

    :cond_d
    invoke-virtual {v10}, Lyb3/n;->c()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v11}, Lyb3/y;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Luj/l;->f:Lyb3/p;

    invoke-virtual {v10, v9}, Lyb3/p;->a(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v10

    goto :goto_6

    :cond_e
    :goto_7
    invoke-virtual {v5, v7, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_5

    :cond_f
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v5}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v6

    const-string v0, "resolvedTargetVarDefaultsWithOverrides.keys()"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v7, "value"

    if-eqz v0, :cond_10

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    :try_start_0
    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Luj/j;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v1, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_8

    :cond_10
    const-string v0, "componentOverrides"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_11

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :cond_11
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_12

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_12
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    const-string v5, "targetComponentOverrides.keys()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    if-eqz v6, :cond_14

    if-eqz v9, :cond_14

    invoke-virtual {v9}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v10

    const-string v11, "newValue.keys()"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_13

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v6, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_a

    :cond_13
    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_9

    :cond_14
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_9

    :cond_15
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_9

    :cond_16
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    const-string v5, "componentOverrides.keys()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-nez v6, :cond_17

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    :cond_17
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v6}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v10

    const-string v11, "overrides.keys()"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v6, v11}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12}, Luj/j;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v9, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_c

    :cond_18
    invoke-virtual {v0, v5, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_b

    :cond_19
    const-string v3, "primaryButton"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_1a

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :cond_1a
    const-string v4, "secondaryButton"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_1b

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    :cond_1b
    const-string v5, "tertiaryButton"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-nez v5, :cond_1c

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    :cond_1c
    const-string v6, "secondaryIconButton"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-nez v6, :cond_1d

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    :cond_1d
    const-string v7, "tertiaryIconButton"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    if-nez v7, :cond_1e

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    :cond_1e
    const-string v9, "inlineButton"

    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    if-nez v9, :cond_1f

    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    :cond_1f
    const-string v10, "toggleButton"

    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    if-nez v10, :cond_20

    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    :cond_20
    const-string v11, "nudgeRatingEmojis"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    if-nez v11, :cond_21

    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    :cond_21
    const-string v12, "nudgeRatingNumbers"

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v12

    if-nez v12, :cond_22

    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    :cond_22
    const-string v13, "nudgeRatingStars"

    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v13

    if-nez v13, :cond_23

    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    :cond_23
    const-string v14, "input"

    invoke-virtual {v0, v14}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v14

    if-nez v14, :cond_24

    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    :cond_24
    const-string v15, "textarea"

    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v15

    if-nez v15, :cond_25

    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    :cond_25
    const-string v8, "select"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    if-nez v8, :cond_26

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    :cond_26
    move-object/from16 v16, v8

    const-string v8, "radioOption"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    if-nez v8, :cond_27

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    :cond_27
    move-object/from16 v17, v8

    const-string v8, "checkboxOption"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    if-nez v8, :cond_28

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    :cond_28
    move-object/from16 v18, v8

    const-string v8, "beacon"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_29

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_29
    new-instance v19, Luj/m;

    const-string v8, "--base-accent"

    move-object/from16 v20, v0

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v8

    instance-of v8, v0, Li2/x;

    if-eqz v8, :cond_2a

    check-cast v0, Li2/x;

    goto :goto_d

    :cond_2a
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_2b

    move-object v8, v14

    move-object/from16 v22, v15

    iget-wide v14, v0, Li2/x;->a:J

    goto :goto_e

    :cond_2b
    move-object v8, v14

    move-object/from16 v22, v15

    iget-wide v14, v2, Luj/m;->a:J

    :goto_e
    const-string v0, "--font-font-family"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v8

    instance-of v8, v0, Ljava/lang/String;

    if-eqz v8, :cond_2c

    check-cast v0, Ljava/lang/String;

    goto :goto_f

    :cond_2c
    const/4 v0, 0x0

    :goto_f
    const-string v8, "--font-size-small"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v24, v0

    instance-of v0, v8, Ljava/lang/Float;

    if-eqz v0, :cond_2d

    check-cast v8, Ljava/lang/Float;

    goto :goto_10

    :cond_2d
    const/4 v8, 0x0

    :goto_10
    if-eqz v8, :cond_2e

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_11

    :cond_2e
    iget v0, v2, Luj/m;->c:F

    :goto_11
    const-string v8, "--font-size-base"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    move/from16 v25, v0

    instance-of v0, v8, Ljava/lang/Float;

    if-eqz v0, :cond_2f

    check-cast v8, Ljava/lang/Float;

    goto :goto_12

    :cond_2f
    const/4 v8, 0x0

    :goto_12
    if-eqz v8, :cond_30

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_13

    :cond_30
    iget v0, v2, Luj/m;->d:F

    :goto_13
    const-string v8, "--font-size-large"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    move/from16 v26, v0

    instance-of v0, v8, Ljava/lang/Float;

    if-eqz v0, :cond_31

    check-cast v8, Ljava/lang/Float;

    goto :goto_14

    :cond_31
    const/4 v8, 0x0

    :goto_14
    if-eqz v8, :cond_32

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_15

    :cond_32
    iget v0, v2, Luj/m;->e:F

    :goto_15
    const-string v8, "--font-size-extra-large"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    move/from16 v27, v0

    instance-of v0, v8, Ljava/lang/Float;

    if-eqz v0, :cond_33

    check-cast v8, Ljava/lang/Float;

    goto :goto_16

    :cond_33
    const/4 v8, 0x0

    :goto_16
    if-eqz v8, :cond_34

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_17

    :cond_34
    iget v0, v2, Luj/m;->f:F

    :goto_17
    const-string v8, "--font-weight-regular"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    move/from16 v28, v0

    instance-of v0, v8, Ljava/lang/Integer;

    if-eqz v0, :cond_35

    check-cast v8, Ljava/lang/Integer;

    goto :goto_18

    :cond_35
    const/4 v8, 0x0

    :goto_18
    if-eqz v8, :cond_36

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_19

    :cond_36
    iget v0, v2, Luj/m;->g:I

    :goto_19
    const-string v8, "--font-weight-medium"

    move/from16 v29, v0

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v30, v14

    instance-of v14, v0, Ljava/lang/Integer;

    if-eqz v14, :cond_37

    check-cast v0, Ljava/lang/Integer;

    goto :goto_1a

    :cond_37
    const/4 v0, 0x0

    :goto_1a
    if-eqz v0, :cond_38

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1b

    :cond_38
    iget v0, v2, Luj/m;->h:I

    :goto_1b
    const-string v14, "--font-weight-semibold"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/lang/Integer;

    if-eqz v15, :cond_39

    check-cast v14, Ljava/lang/Integer;

    goto :goto_1c

    :cond_39
    const/4 v14, 0x0

    :goto_1c
    if-eqz v14, :cond_3a

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    goto :goto_1d

    :cond_3a
    iget v14, v2, Luj/m;->i:I

    :goto_1d
    const-string v15, "--font-weight-bold"

    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    move/from16 v32, v0

    instance-of v0, v15, Ljava/lang/Integer;

    if-eqz v0, :cond_3b

    check-cast v15, Ljava/lang/Integer;

    goto :goto_1e

    :cond_3b
    const/4 v15, 0x0

    :goto_1e
    if-eqz v15, :cond_3c

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1f

    :cond_3c
    iget v0, v2, Luj/m;->j:I

    :goto_1f
    const-string v15, "--font-line-height-none"

    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    move/from16 v33, v0

    instance-of v0, v15, Ljava/lang/Float;

    if-eqz v0, :cond_3d

    check-cast v15, Ljava/lang/Float;

    goto :goto_20

    :cond_3d
    const/4 v15, 0x0

    :goto_20
    if-eqz v15, :cond_3e

    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_21

    :cond_3e
    iget v0, v2, Luj/m;->k:F

    :goto_21
    const-string v15, "--font-line-height-tight"

    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    move/from16 v34, v0

    instance-of v0, v15, Ljava/lang/Float;

    if-eqz v0, :cond_3f

    check-cast v15, Ljava/lang/Float;

    goto :goto_22

    :cond_3f
    const/4 v15, 0x0

    :goto_22
    if-eqz v15, :cond_40

    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_23

    :cond_40
    iget v0, v2, Luj/m;->l:F

    :goto_23
    const-string v15, "--font-line-height-snug"

    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    move/from16 v35, v0

    instance-of v0, v15, Ljava/lang/Float;

    if-eqz v0, :cond_41

    check-cast v15, Ljava/lang/Float;

    goto :goto_24

    :cond_41
    const/4 v15, 0x0

    :goto_24
    if-eqz v15, :cond_42

    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_25

    :cond_42
    iget v0, v2, Luj/m;->m:F

    :goto_25
    const-string v15, "--font-line-height-normal"

    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    move/from16 v36, v0

    instance-of v0, v15, Ljava/lang/Float;

    if-eqz v0, :cond_43

    check-cast v15, Ljava/lang/Float;

    goto :goto_26

    :cond_43
    const/4 v15, 0x0

    :goto_26
    if-eqz v15, :cond_44

    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_27

    :cond_44
    iget v0, v2, Luj/m;->n:F

    :goto_27
    const-string v15, "--content-primary"

    move/from16 v37, v0

    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v38, v14

    instance-of v14, v0, Li2/x;

    if-eqz v14, :cond_45

    check-cast v0, Li2/x;

    goto :goto_28

    :cond_45
    const/4 v0, 0x0

    :goto_28
    if-eqz v0, :cond_46

    move-object/from16 v39, v13

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_29

    :cond_46
    move-object/from16 v39, v13

    iget-wide v13, v2, Luj/m;->o:J

    :goto_29
    const-string v0, "--content-secondary"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v40, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_47

    check-cast v0, Li2/x;

    goto :goto_2a

    :cond_47
    const/4 v0, 0x0

    :goto_2a
    if-eqz v0, :cond_48

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_2b

    :cond_48
    iget-wide v13, v2, Luj/m;->p:J

    :goto_2b
    const-string v0, "--content-disabled"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v42, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_49

    check-cast v0, Li2/x;

    goto :goto_2c

    :cond_49
    const/4 v0, 0x0

    :goto_2c
    if-eqz v0, :cond_4a

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_2d

    :cond_4a
    iget-wide v13, v2, Luj/m;->q:J

    :goto_2d
    const-string v0, "--content-link"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v44, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_4b

    check-cast v0, Li2/x;

    goto :goto_2e

    :cond_4b
    const/4 v0, 0x0

    :goto_2e
    if-eqz v0, :cond_4c

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_2f

    :cond_4c
    iget-wide v13, v2, Luj/m;->r:J

    :goto_2f
    const-string v0, "--content-link-visited"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v46, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_4d

    check-cast v0, Li2/x;

    goto :goto_30

    :cond_4d
    const/4 v0, 0x0

    :goto_30
    if-eqz v0, :cond_4e

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_31

    :cond_4e
    iget-wide v13, v2, Luj/m;->s:J

    :goto_31
    const-string v0, "--highlight-color"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v48, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_4f

    check-cast v0, Li2/x;

    goto :goto_32

    :cond_4f
    const/4 v0, 0x0

    :goto_32
    if-eqz v0, :cond_50

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_33

    :cond_50
    iget-wide v13, v2, Luj/m;->t:J

    :goto_33
    const-string v0, "--border-primary"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v50, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_51

    check-cast v0, Li2/x;

    goto :goto_34

    :cond_51
    const/4 v0, 0x0

    :goto_34
    if-eqz v0, :cond_52

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_35

    :cond_52
    iget-wide v13, v2, Luj/m;->u:J

    :goto_35
    const-string v0, "--border-primary-disabled"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v52, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_53

    check-cast v0, Li2/x;

    goto :goto_36

    :cond_53
    const/4 v0, 0x0

    :goto_36
    if-eqz v0, :cond_54

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_37

    :cond_54
    iget-wide v13, v2, Luj/m;->v:J

    :goto_37
    const-string v0, "--background-primary"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v54, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_55

    check-cast v0, Li2/x;

    goto :goto_38

    :cond_55
    const/4 v0, 0x0

    :goto_38
    if-eqz v0, :cond_56

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_39

    :cond_56
    iget-wide v13, v2, Luj/m;->w:J

    :goto_39
    const-string v0, "--background-secondary"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v56, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_57

    check-cast v0, Li2/x;

    goto :goto_3a

    :cond_57
    const/4 v0, 0x0

    :goto_3a
    if-eqz v0, :cond_58

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_3b

    :cond_58
    iget-wide v13, v2, Luj/m;->x:J

    :goto_3b
    const-string v0, "--background-disabled"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v58, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_59

    check-cast v0, Li2/x;

    goto :goto_3c

    :cond_59
    const/4 v0, 0x0

    :goto_3c
    if-eqz v0, :cond_5a

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_3d

    :cond_5a
    iget-wide v13, v2, Luj/m;->y:J

    :goto_3d
    const-string v0, "--height-small"

    move-wide/from16 v60, v13

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Ljava/lang/Float;

    if-eqz v14, :cond_5b

    check-cast v13, Ljava/lang/Float;

    goto :goto_3e

    :cond_5b
    const/4 v13, 0x0

    :goto_3e
    if-eqz v13, :cond_5c

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v13

    goto :goto_3f

    :cond_5c
    iget v13, v2, Luj/m;->z:F

    :goto_3f
    const-string v14, "--layout-radius-beacon"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v62, v13

    instance-of v13, v14, Ljava/lang/Float;

    if-eqz v13, :cond_5d

    check-cast v14, Ljava/lang/Float;

    goto :goto_40

    :cond_5d
    const/4 v14, 0x0

    :goto_40
    if-eqz v14, :cond_5e

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v13

    goto :goto_41

    :cond_5e
    iget v13, v2, Luj/m;->A:F

    :goto_41
    const-string v14, "--form-control-height"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v63, v13

    instance-of v13, v14, Ljava/lang/Float;

    if-eqz v13, :cond_5f

    check-cast v14, Ljava/lang/Float;

    goto :goto_42

    :cond_5f
    const/4 v14, 0x0

    :goto_42
    if-eqz v14, :cond_60

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v13

    goto :goto_43

    :cond_60
    iget v13, v2, Luj/m;->B:F

    :goto_43
    const-string v14, "--layout-radius-button"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v64, v13

    instance-of v13, v14, Ljava/lang/Float;

    if-eqz v13, :cond_61

    check-cast v14, Ljava/lang/Float;

    goto :goto_44

    :cond_61
    const/4 v14, 0x0

    :goto_44
    if-eqz v14, :cond_62

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v13

    goto :goto_45

    :cond_62
    iget v13, v2, Luj/m;->C:F

    :goto_45
    const-string v14, "--form-control-padding-x"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v65, v13

    instance-of v13, v14, Ljava/lang/Float;

    if-eqz v13, :cond_63

    check-cast v14, Ljava/lang/Float;

    goto :goto_46

    :cond_63
    const/4 v14, 0x0

    :goto_46
    if-eqz v14, :cond_64

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v13

    goto :goto_47

    :cond_64
    iget v13, v2, Luj/m;->D:F

    :goto_47
    const-string v14, "--form-control-gap"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v66, v13

    instance-of v13, v14, Ljava/lang/Float;

    if-eqz v13, :cond_65

    check-cast v14, Ljava/lang/Float;

    goto :goto_48

    :cond_65
    const/4 v14, 0x0

    :goto_48
    if-eqz v14, :cond_66

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v13

    goto :goto_49

    :cond_66
    iget v13, v2, Luj/m;->E:F

    :goto_49
    const-string v14, "--form-control-shadow"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v67, v13

    instance-of v13, v14, Ljava/lang/String;

    if-eqz v13, :cond_67

    check-cast v14, Ljava/lang/String;

    goto :goto_4a

    :cond_67
    const/4 v14, 0x0

    :goto_4a
    if-nez v14, :cond_68

    iget-object v14, v2, Luj/m;->F:Ljava/lang/String;

    :cond_68
    const-string v13, "--form-control-shadow-color"

    invoke-virtual {v1, v13}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v68, v14

    instance-of v14, v13, Li2/x;

    if-eqz v14, :cond_69

    check-cast v13, Li2/x;

    goto :goto_4b

    :cond_69
    const/4 v13, 0x0

    :goto_4b
    if-eqz v13, :cond_6a

    iget-wide v13, v13, Li2/x;->a:J

    :goto_4c
    move-wide/from16 v69, v13

    goto :goto_4d

    :cond_6a
    iget-wide v13, v2, Luj/m;->G:J

    goto :goto_4c

    :goto_4d
    const-string v13, "--form-control-background"

    invoke-virtual {v1, v13}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v71, v0

    instance-of v0, v14, Li2/x;

    if-eqz v0, :cond_6b

    check-cast v14, Li2/x;

    goto :goto_4e

    :cond_6b
    const/4 v14, 0x0

    :goto_4e
    if-eqz v14, :cond_6c

    move-object v0, v13

    iget-wide v13, v14, Li2/x;->a:J

    :goto_4f
    move-object/from16 v72, v0

    goto :goto_50

    :cond_6c
    move-object v0, v13

    iget-wide v13, v2, Luj/m;->H:J

    goto :goto_4f

    :goto_50
    const-string v0, "--form-control-active-background"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v73, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_6d

    check-cast v0, Li2/x;

    goto :goto_51

    :cond_6d
    const/4 v0, 0x0

    :goto_51
    if-eqz v0, :cond_6e

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_52

    :cond_6e
    iget-wide v13, v2, Luj/m;->I:J

    :goto_52
    const-string v0, "--form-control-focus-ring-color"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v75, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_6f

    check-cast v0, Li2/x;

    goto :goto_53

    :cond_6f
    const/4 v0, 0x0

    :goto_53
    if-eqz v0, :cond_70

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_54

    :cond_70
    iget-wide v13, v2, Luj/m;->J:J

    :goto_54
    const-string v0, "--form-control-focus-ring-width"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v77, v13

    instance-of v13, v0, Ljava/lang/Float;

    if-eqz v13, :cond_71

    check-cast v0, Ljava/lang/Float;

    goto :goto_55

    :cond_71
    const/4 v0, 0x0

    :goto_55
    if-eqz v0, :cond_72

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_56

    :cond_72
    iget v0, v2, Luj/m;->K:F

    :goto_56
    const-string v13, "--layout-radius-card"

    invoke-virtual {v1, v13}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Ljava/lang/Float;

    if-eqz v14, :cond_73

    check-cast v13, Ljava/lang/Float;

    goto :goto_57

    :cond_73
    const/4 v13, 0x0

    :goto_57
    if-eqz v13, :cond_74

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v13

    goto :goto_58

    :cond_74
    iget v13, v2, Luj/m;->L:F

    :goto_58
    const-string v14, "--layout-padding"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v79, v0

    instance-of v0, v14, Ljava/lang/Float;

    if-eqz v0, :cond_75

    check-cast v14, Ljava/lang/Float;

    goto :goto_59

    :cond_75
    const/4 v14, 0x0

    :goto_59
    if-eqz v14, :cond_76

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_5a

    :cond_76
    iget v0, v2, Luj/m;->M:F

    :goto_5a
    const-string v14, "--layout-gap"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v80, v0

    instance-of v0, v14, Ljava/lang/Float;

    if-eqz v0, :cond_77

    check-cast v14, Ljava/lang/Float;

    goto :goto_5b

    :cond_77
    const/4 v14, 0x0

    :goto_5b
    if-eqz v14, :cond_78

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_5c

    :cond_78
    iget v0, v2, Luj/m;->N:F

    :goto_5c
    const-string v14, "--layout-shadow"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v81, v0

    instance-of v0, v14, Ljava/lang/String;

    if-eqz v0, :cond_79

    check-cast v14, Ljava/lang/String;

    goto :goto_5d

    :cond_79
    const/4 v14, 0x0

    :goto_5d
    if-nez v14, :cond_7a

    iget-object v14, v2, Luj/m;->O:Ljava/lang/String;

    :cond_7a
    const-string v0, "--layout-shadow-color"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v82, v13

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_7b

    check-cast v0, Li2/x;

    goto :goto_5e

    :cond_7b
    const/4 v0, 0x0

    :goto_5e
    if-eqz v0, :cond_7c

    move-object/from16 v83, v14

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_5f

    :cond_7c
    move-object/from16 v83, v14

    iget-wide v13, v2, Luj/m;->P:J

    :goto_5f
    const-string v0, "--modal-width"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-wide/from16 v84, v13

    instance-of v13, v0, Ljava/lang/Float;

    if-eqz v13, :cond_7d

    check-cast v0, Ljava/lang/Float;

    goto :goto_60

    :cond_7d
    const/4 v0, 0x0

    :goto_60
    if-eqz v0, :cond_7e

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_61

    :cond_7e
    iget v0, v2, Luj/m;->Q:F

    :goto_61
    const-string v13, "--modal-max-height"

    invoke-virtual {v1, v13}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Ljava/lang/Float;

    if-eqz v14, :cond_7f

    check-cast v13, Ljava/lang/Float;

    goto :goto_62

    :cond_7f
    const/4 v13, 0x0

    :goto_62
    if-nez v13, :cond_80

    iget-object v13, v2, Luj/m;->R:Ljava/lang/Float;

    :cond_80
    const-string v14, "--popover-width"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v86, v0

    instance-of v0, v14, Ljava/lang/Float;

    if-eqz v0, :cond_81

    check-cast v14, Ljava/lang/Float;

    goto :goto_63

    :cond_81
    const/4 v14, 0x0

    :goto_63
    if-eqz v14, :cond_82

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_64

    :cond_82
    iget v0, v2, Luj/m;->S:F

    :goto_64
    const-string v14, "--popover-max-height"

    invoke-virtual {v1, v14}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    move/from16 v87, v0

    instance-of v0, v14, Ljava/lang/Float;

    if-eqz v0, :cond_83

    check-cast v14, Ljava/lang/Float;

    goto :goto_65

    :cond_83
    const/4 v14, 0x0

    :goto_65
    if-nez v14, :cond_84

    iget-object v14, v2, Luj/m;->T:Ljava/lang/Float;

    :cond_84
    const-string v0, "--tooltip-max-width"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v88, v13

    instance-of v13, v0, Ljava/lang/Float;

    if-eqz v13, :cond_85

    check-cast v0, Ljava/lang/Float;

    goto :goto_66

    :cond_85
    const/4 v0, 0x0

    :goto_66
    if-eqz v0, :cond_86

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_67

    :cond_86
    iget v0, v2, Luj/m;->U:F

    :goto_67
    const-string v13, "--tooltip-max-height"

    invoke-virtual {v1, v13}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    move/from16 v89, v0

    instance-of v0, v13, Ljava/lang/Float;

    if-eqz v0, :cond_87

    check-cast v13, Ljava/lang/Float;

    goto :goto_68

    :cond_87
    const/4 v13, 0x0

    :goto_68
    if-nez v13, :cond_88

    iget-object v13, v2, Luj/m;->V:Ljava/lang/Float;

    :cond_88
    const-string v0, "--checklist-width"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v90, v13

    instance-of v13, v0, Ljava/lang/Float;

    if-eqz v13, :cond_89

    check-cast v0, Ljava/lang/Float;

    goto :goto_69

    :cond_89
    const/4 v0, 0x0

    :goto_69
    if-eqz v0, :cond_8a

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_6a

    :cond_8a
    iget v0, v2, Luj/m;->W:F

    :goto_6a
    const-string v13, "--checklist-max-height"

    invoke-virtual {v1, v13}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    move/from16 v91, v0

    instance-of v0, v13, Ljava/lang/Float;

    if-eqz v0, :cond_8b

    check-cast v13, Ljava/lang/Float;

    goto :goto_6b

    :cond_8b
    const/4 v13, 0x0

    :goto_6b
    if-eqz v13, :cond_8c

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_6c

    :cond_8c
    iget v0, v2, Luj/m;->X:F

    :goto_6c
    const-string v13, "defaultTheme"

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v92, v14

    iget-wide v13, v2, Luj/m;->a:J

    move/from16 v93, v0

    iget v0, v2, Luj/m;->h:I

    new-instance v94, Luj/i;

    move/from16 v108, v0

    const-string v0, "--button-primary-background"

    move-wide/from16 v109, v13

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Li2/x;

    if-eqz v14, :cond_8d

    check-cast v13, Li2/x;

    goto :goto_6d

    :cond_8d
    const/4 v13, 0x0

    :goto_6d
    if-eqz v13, :cond_8e

    iget-wide v13, v13, Li2/x;->a:J

    :goto_6e
    move-wide/from16 v97, v13

    goto :goto_70

    :cond_8e
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_8f

    check-cast v0, Li2/x;

    goto :goto_6f

    :cond_8f
    const/4 v0, 0x0

    :goto_6f
    if-eqz v0, :cond_90

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_6e

    :cond_90
    move-wide/from16 v97, v109

    :goto_70
    const-string v0, "--button-primary-border-color"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Li2/x;

    if-eqz v14, :cond_91

    check-cast v13, Li2/x;

    goto :goto_71

    :cond_91
    const/4 v13, 0x0

    :goto_71
    if-eqz v13, :cond_92

    iget-wide v13, v13, Li2/x;->a:J

    :goto_72
    move-wide/from16 v99, v13

    goto :goto_74

    :cond_92
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_93

    check-cast v0, Li2/x;

    goto :goto_73

    :cond_93
    const/4 v0, 0x0

    :goto_73
    if-eqz v0, :cond_94

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_72

    :cond_94
    move-wide/from16 v99, v109

    :goto_74
    const-string v0, "--button-primary-content"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Li2/x;

    if-eqz v14, :cond_95

    check-cast v13, Li2/x;

    goto :goto_75

    :cond_95
    const/4 v13, 0x0

    :goto_75
    if-eqz v13, :cond_96

    iget-wide v13, v13, Li2/x;->a:J

    :goto_76
    move-wide/from16 v101, v13

    goto :goto_78

    :cond_96
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v13, v0, Li2/x;

    if-eqz v13, :cond_97

    check-cast v0, Li2/x;

    goto :goto_77

    :cond_97
    const/4 v0, 0x0

    :goto_77
    if-eqz v0, :cond_98

    iget-wide v13, v0, Li2/x;->a:J

    goto :goto_76

    :cond_98
    sget-wide v13, Li2/x;->f:J

    goto :goto_76

    :goto_78
    const/16 v106, 0x0

    const v107, 0x1ff8f

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    invoke-direct/range {v94 .. v107}, Luj/i;-><init>(FFJJJILi2/x;Li2/x;Li2/x;I)V

    move-object/from16 v0, v94

    invoke-static {v0, v1, v3}, Luj/j;->a(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v0

    invoke-static {v0, v1, v3}, Luj/j;->b(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v0

    invoke-static {v1, v4, v2}, Luj/j;->h(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v3

    invoke-static {v1, v5, v2}, Luj/j;->i(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v4

    invoke-static {v1, v6, v2}, Luj/j;->h(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v5

    invoke-static {v1, v7, v2}, Luj/j;->i(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v6

    new-instance v94, Luj/i;

    sget-wide v97, Li2/x;->m:J

    invoke-virtual {v9, v15}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    instance-of v13, v7, Li2/x;

    if-eqz v13, :cond_99

    check-cast v7, Li2/x;

    goto :goto_79

    :cond_99
    const/4 v7, 0x0

    :goto_79
    if-eqz v7, :cond_9a

    :goto_7a
    iget-wide v13, v7, Li2/x;->a:J

    :goto_7b
    move-wide/from16 v101, v13

    goto :goto_7d

    :cond_9a
    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    instance-of v13, v7, Li2/x;

    if-eqz v13, :cond_9b

    check-cast v7, Li2/x;

    goto :goto_7c

    :cond_9b
    const/4 v7, 0x0

    :goto_7c
    if-eqz v7, :cond_9c

    goto :goto_7a

    :cond_9c
    iget-wide v13, v2, Luj/m;->o:J

    goto :goto_7b

    :goto_7d
    const/16 v106, 0x0

    const v107, 0x1ff8f

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    move-wide/from16 v99, v97

    invoke-direct/range {v94 .. v107}, Luj/i;-><init>(FFJJJILi2/x;Li2/x;Li2/x;I)V

    move-wide/from16 v116, v97

    invoke-virtual {v9, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    instance-of v9, v7, Ljava/lang/Integer;

    if-eqz v9, :cond_9d

    check-cast v7, Ljava/lang/Integer;

    goto :goto_7e

    :cond_9d
    const/4 v7, 0x0

    :goto_7e
    if-eqz v7, :cond_9e

    :goto_7f
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move/from16 v99, v7

    goto :goto_81

    :cond_9e
    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    instance-of v9, v7, Ljava/lang/Integer;

    if-eqz v9, :cond_9f

    check-cast v7, Ljava/lang/Integer;

    goto :goto_80

    :cond_9f
    const/4 v7, 0x0

    :goto_80
    if-eqz v7, :cond_a0

    goto :goto_7f

    :cond_a0
    move/from16 v99, v108

    :goto_81
    const/16 v103, 0x0

    const v104, 0x1ff7f

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    invoke-static/range {v94 .. v104}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object v7

    invoke-static {v1, v10, v2}, Luj/j;->i(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v94

    invoke-virtual {v10, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ljava/lang/Integer;

    if-eqz v10, :cond_a1

    check-cast v9, Ljava/lang/Integer;

    goto :goto_82

    :cond_a1
    const/4 v9, 0x0

    :goto_82
    if-eqz v9, :cond_a2

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :goto_83
    move/from16 v99, v8

    goto :goto_85

    :cond_a2
    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/Integer;

    if-eqz v9, :cond_a3

    check-cast v8, Ljava/lang/Integer;

    goto :goto_84

    :cond_a3
    const/4 v8, 0x0

    :goto_84
    if-eqz v8, :cond_a4

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_83

    :cond_a4
    move/from16 v99, v108

    :goto_85
    const/16 v103, 0x0

    const v104, 0x1ff7f

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    invoke-static/range {v94 .. v104}, Luj/i;->a(Luj/i;FLjava/lang/Float;FFILjava/lang/String;Li2/x;Li2/x;Li2/x;I)Luj/i;

    move-result-object v8

    invoke-static {v1, v11, v2}, Luj/j;->j(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v94

    invoke-static {v1, v12, v2}, Luj/j;->j(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v95

    new-instance v118, Luj/i;

    move-object/from16 v13, v39

    move-object/from16 v9, v72

    invoke-virtual {v13, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Li2/x;

    if-eqz v11, :cond_a5

    check-cast v10, Li2/x;

    goto :goto_86

    :cond_a5
    const/4 v10, 0x0

    :goto_86
    if-eqz v10, :cond_a6

    iget-wide v9, v10, Li2/x;->a:J

    :goto_87
    move-wide/from16 v121, v9

    goto :goto_89

    :cond_a6
    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Li2/x;

    if-eqz v10, :cond_a7

    check-cast v9, Li2/x;

    goto :goto_88

    :cond_a7
    const/4 v9, 0x0

    :goto_88
    if-eqz v9, :cond_a8

    iget-wide v9, v9, Li2/x;->a:J

    goto :goto_87

    :cond_a8
    iget-wide v9, v2, Luj/m;->w:J

    goto :goto_87

    :goto_89
    const-string v9, "--form-control-border-color"

    invoke-virtual {v13, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Li2/x;

    if-eqz v11, :cond_a9

    check-cast v10, Li2/x;

    goto :goto_8a

    :cond_a9
    const/4 v10, 0x0

    :goto_8a
    if-eqz v10, :cond_aa

    iget-wide v9, v10, Li2/x;->a:J

    :goto_8b
    move-wide/from16 v123, v9

    goto :goto_8d

    :cond_aa
    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Li2/x;

    if-eqz v10, :cond_ab

    check-cast v9, Li2/x;

    goto :goto_8c

    :cond_ab
    const/4 v9, 0x0

    :goto_8c
    if-eqz v9, :cond_ac

    iget-wide v9, v9, Li2/x;->a:J

    goto :goto_8b

    :cond_ac
    iget-wide v9, v2, Luj/m;->u:J

    goto :goto_8b

    :goto_8d
    const-string v9, "--nudge-rating-star-color"

    invoke-virtual {v13, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Li2/x;

    if-eqz v11, :cond_ad

    check-cast v10, Li2/x;

    goto :goto_8e

    :cond_ad
    const/4 v10, 0x0

    :goto_8e
    if-eqz v10, :cond_ae

    :goto_8f
    iget-wide v10, v10, Li2/x;->a:J

    :goto_90
    move-wide/from16 v125, v10

    goto :goto_92

    :cond_ae
    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Li2/x;

    if-eqz v11, :cond_af

    check-cast v10, Li2/x;

    goto :goto_91

    :cond_af
    const/4 v10, 0x0

    :goto_91
    if-eqz v10, :cond_b0

    goto :goto_8f

    :cond_b0
    sget-wide v10, Luj/f;->z:J

    goto :goto_90

    :goto_92
    invoke-virtual {v13, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Li2/x;

    if-eqz v11, :cond_b1

    check-cast v10, Li2/x;

    goto :goto_93

    :cond_b1
    const/4 v10, 0x0

    :goto_93
    if-eqz v10, :cond_b2

    iget-wide v9, v10, Li2/x;->a:J

    goto :goto_95

    :cond_b2
    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Li2/x;

    if-eqz v10, :cond_b3

    check-cast v9, Li2/x;

    goto :goto_94

    :cond_b3
    const/4 v9, 0x0

    :goto_94
    if-eqz v9, :cond_b4

    iget-wide v9, v9, Li2/x;->a:J

    goto :goto_95

    :cond_b4
    sget-wide v9, Luj/f;->z:J

    :goto_95
    new-instance v11, Li2/x;

    invoke-direct {v11, v9, v10}, Li2/x;-><init>(J)V

    const-string v9, "--nudge-rating-star-color-selected"

    invoke-virtual {v13, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v12, v10, Li2/x;

    if-eqz v12, :cond_b5

    check-cast v10, Li2/x;

    goto :goto_96

    :cond_b5
    const/4 v10, 0x0

    :goto_96
    if-eqz v10, :cond_b6

    iget-wide v9, v10, Li2/x;->a:J

    goto :goto_98

    :cond_b6
    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Li2/x;

    if-eqz v10, :cond_b7

    check-cast v9, Li2/x;

    goto :goto_97

    :cond_b7
    const/4 v9, 0x0

    :goto_97
    if-eqz v9, :cond_b8

    iget-wide v9, v9, Li2/x;->a:J

    goto :goto_98

    :cond_b8
    sget-wide v9, Luj/f;->z:J

    :goto_98
    new-instance v12, Li2/x;

    invoke-direct {v12, v9, v10}, Li2/x;-><init>(J)V

    const v131, 0x19f8f

    const/16 v119, 0x0

    const/16 v120, 0x0

    const/16 v127, 0x0

    const/16 v128, 0x0

    move-object/from16 v129, v11

    move-object/from16 v130, v12

    invoke-direct/range {v118 .. v131}, Luj/i;-><init>(FFJJJILi2/x;Li2/x;Li2/x;I)V

    move-object/from16 v9, v118

    invoke-static {v9, v1, v13}, Luj/j;->a(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v9

    invoke-static {v9, v1, v13}, Luj/j;->b(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v96

    move-object/from16 v14, v23

    invoke-static {v1, v14, v2}, Luj/j;->g(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v97

    move-object/from16 v15, v22

    invoke-static {v1, v15, v2}, Luj/j;->g(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v98

    move-object/from16 v9, v16

    invoke-static {v1, v9, v2}, Luj/j;->g(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v99

    move-object/from16 v9, v17

    invoke-static {v1, v9, v2}, Luj/j;->g(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v100

    move-object/from16 v9, v18

    invoke-static {v1, v9, v2}, Luj/j;->g(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;

    move-result-object v101

    move-object/from16 v9, v20

    move-object/from16 v10, v71

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Ljava/lang/Float;

    if-eqz v12, :cond_b9

    check-cast v11, Ljava/lang/Float;

    goto :goto_99

    :cond_b9
    const/4 v11, 0x0

    :goto_99
    if-eqz v11, :cond_ba

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v10

    :goto_9a
    move/from16 v112, v10

    move-object/from16 v10, v21

    goto :goto_9c

    :cond_ba
    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Ljava/lang/Float;

    if-eqz v11, :cond_bb

    check-cast v10, Ljava/lang/Float;

    goto :goto_9b

    :cond_bb
    const/4 v10, 0x0

    :goto_9b
    if-eqz v10, :cond_bc

    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    move-result v10

    goto :goto_9a

    :cond_bc
    iget v10, v2, Luj/m;->z:F

    goto :goto_9a

    :goto_9c
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Li2/x;

    if-eqz v12, :cond_bd

    check-cast v11, Li2/x;

    goto :goto_9d

    :cond_bd
    const/4 v11, 0x0

    :goto_9d
    if-eqz v11, :cond_be

    iget-wide v13, v11, Li2/x;->a:J

    :goto_9e
    move-wide/from16 v114, v13

    goto :goto_a0

    :cond_be
    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Li2/x;

    if-eqz v11, :cond_bf

    check-cast v10, Li2/x;

    goto :goto_9f

    :cond_bf
    const/4 v10, 0x0

    :goto_9f
    if-eqz v10, :cond_c0

    iget-wide v13, v10, Li2/x;->a:J

    goto :goto_9e

    :cond_c0
    move-wide/from16 v114, v109

    :goto_a0
    const-string v10, "--layout-radius-circle"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    instance-of v11, v9, Ljava/lang/Float;

    if-eqz v11, :cond_c1

    check-cast v9, Ljava/lang/Float;

    goto :goto_a1

    :cond_c1
    const/4 v9, 0x0

    :goto_a1
    if-eqz v9, :cond_c2

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_a2
    move/from16 v113, v1

    goto :goto_a4

    :cond_c2
    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v9, v1, Ljava/lang/Float;

    if-eqz v9, :cond_c3

    check-cast v1, Ljava/lang/Float;

    goto :goto_a3

    :cond_c3
    const/4 v1, 0x0

    :goto_a3
    if-eqz v1, :cond_c4

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_a2

    :cond_c4
    iget v1, v2, Luj/m;->A:F

    goto :goto_a2

    :goto_a4
    new-instance v111, Luj/i;

    const/16 v123, 0x0

    const v124, 0x1ff86

    const/16 v120, 0x0

    const/16 v121, 0x0

    const/16 v122, 0x0

    move-wide/from16 v118, v116

    invoke-direct/range {v111 .. v124}, Luj/i;-><init>(FFJJJILi2/x;Li2/x;Li2/x;I)V

    move-object/from16 v22, v24

    move/from16 v23, v25

    move/from16 v24, v26

    move/from16 v25, v27

    move/from16 v26, v28

    move/from16 v27, v29

    move-wide/from16 v20, v30

    move/from16 v28, v32

    move/from16 v30, v33

    move/from16 v31, v34

    move/from16 v32, v35

    move/from16 v33, v36

    move/from16 v34, v37

    move/from16 v29, v38

    move-wide/from16 v35, v40

    move-wide/from16 v37, v42

    move-wide/from16 v39, v44

    move-wide/from16 v41, v46

    move-wide/from16 v43, v48

    move-wide/from16 v45, v50

    move-wide/from16 v47, v52

    move-wide/from16 v49, v54

    move-wide/from16 v51, v56

    move-wide/from16 v53, v58

    move-wide/from16 v55, v60

    move/from16 v57, v62

    move/from16 v58, v63

    move/from16 v59, v64

    move/from16 v60, v65

    move/from16 v61, v66

    move/from16 v62, v67

    move-object/from16 v63, v68

    move-wide/from16 v64, v69

    move-wide/from16 v66, v73

    move-wide/from16 v68, v75

    move-wide/from16 v70, v77

    move/from16 v72, v79

    move/from16 v74, v80

    move/from16 v75, v81

    move/from16 v73, v82

    move-object/from16 v76, v83

    move-wide/from16 v77, v84

    move/from16 v79, v86

    move/from16 v81, v87

    move-object/from16 v80, v88

    move/from16 v83, v89

    move-object/from16 v84, v90

    move/from16 v85, v91

    move-object/from16 v82, v92

    move/from16 v86, v93

    move-object/from16 v102, v111

    move-object/from16 v87, v0

    move-object/from16 v88, v3

    move-object/from16 v89, v4

    move-object/from16 v90, v5

    move-object/from16 v91, v6

    move-object/from16 v92, v7

    move-object/from16 v93, v8

    invoke-direct/range {v19 .. v102}, Luj/m;-><init>(JLjava/lang/String;FFFFIIIIFFFFJJJJJJJJJJJFFFFFFLjava/lang/String;JJJJFFFFLjava/lang/String;JFLjava/lang/Float;FLjava/lang/Float;FLjava/lang/Float;FFLuj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;Luj/i;)V

    return-object v19
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 9

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v1, Lyb3/p;

    const-string v2, "\\s*(?:\"([^\"]*)\"|\'([^\']*)\'|([^,\'\"]+))\\s*(?:,|$)"

    invoke-direct {v1, v2}, Lyb3/p;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lyb3/p;->b(Ljava/lang/CharSequence;Lyb3/p;)Lx83/h;

    move-result-object p1

    sget-object v1, Luj/h;->x:Luj/h;

    invoke-static {p1, v1}, Lxb3/k;->B(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p1

    sget-object v1, Luj/h;->y:Luj/h;

    invoke-static {p1, v1}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object p1

    sget-object v1, Luj/h;->z:Luj/h;

    invoke-static {p1, v1}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p1

    invoke-static {p1}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x2

    if-ge v4, v5, :cond_1

    sget-object v5, Luj/j;->a:[Ljava/lang/String;

    aget-object v5, v5, v4

    const-string v6, " "

    invoke-static {v2, v6, v5, v3}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const-string v7, "font"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v5, v7, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    sget-object p0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v1, "Attempted to find a font matching `"

    const-string v2, "`, but none found. Falling back to default font."

    invoke-static {v1, v2, p1}, Lte0/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    :cond_4
    :goto_1
    return-object v0
.end method

.method public static f(Landroidx/compose/runtime/Composer;)Luj/m;
    .locals 2

    check-cast p0, Lp1/q;

    const v0, -0x1896950d

    invoke-virtual {p0, v0}, Lp1/q;->f0(I)V

    sget-object v0, Luj/k;->a:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luj/m;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method

.method public static final g(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "--form-control-background"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Li2/x;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    check-cast v4, Li2/x;

    goto :goto_0

    :cond_0
    move-object v4, v6

    :goto_0
    if-eqz v4, :cond_1

    iget-wide v3, v4, Li2/x;->a:J

    :goto_1
    move-wide v10, v3

    goto :goto_3

    :cond_1
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Li2/x;

    if-eqz v4, :cond_2

    check-cast v3, Li2/x;

    goto :goto_2

    :cond_2
    move-object v3, v6

    :goto_2
    if-eqz v3, :cond_3

    iget-wide v3, v3, Li2/x;->a:J

    goto :goto_1

    :cond_3
    iget-wide v3, v2, Luj/m;->w:J

    goto :goto_1

    :goto_3
    const-string v3, "--form-control-border-color"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Li2/x;

    if-eqz v5, :cond_4

    check-cast v4, Li2/x;

    goto :goto_4

    :cond_4
    move-object v4, v6

    :goto_4
    if-eqz v4, :cond_5

    iget-wide v3, v4, Li2/x;->a:J

    :goto_5
    move-wide v12, v3

    goto :goto_7

    :cond_5
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Li2/x;

    if-eqz v4, :cond_6

    check-cast v3, Li2/x;

    goto :goto_6

    :cond_6
    move-object v3, v6

    :goto_6
    if-eqz v3, :cond_7

    iget-wide v3, v3, Li2/x;->a:J

    goto :goto_5

    :cond_7
    iget-wide v3, v2, Luj/m;->u:J

    goto :goto_5

    :goto_7
    const-string v3, "--content-primary"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Li2/x;

    if-eqz v5, :cond_8

    check-cast v4, Li2/x;

    goto :goto_8

    :cond_8
    move-object v4, v6

    :goto_8
    if-eqz v4, :cond_9

    iget-wide v3, v4, Li2/x;->a:J

    :goto_9
    move-wide v14, v3

    goto :goto_b

    :cond_9
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Li2/x;

    if-eqz v4, :cond_a

    check-cast v3, Li2/x;

    goto :goto_a

    :cond_a
    move-object v3, v6

    :goto_a
    if-eqz v3, :cond_b

    iget-wide v3, v3, Li2/x;->a:J

    goto :goto_9

    :cond_b
    iget-wide v3, v2, Luj/m;->o:J

    goto :goto_9

    :goto_b
    const-string v3, "--layout-radius-button"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/Float;

    if-eqz v5, :cond_c

    check-cast v4, Ljava/lang/Float;

    goto :goto_c

    :cond_c
    move-object v4, v6

    :goto_c
    if-eqz v4, :cond_d

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :goto_d
    move v9, v3

    goto :goto_f

    :cond_d
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Float;

    if-eqz v4, :cond_e

    check-cast v3, Ljava/lang/Float;

    goto :goto_e

    :cond_e
    move-object v3, v6

    :goto_e
    if-eqz v3, :cond_f

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_d

    :cond_f
    iget v3, v2, Luj/m;->C:F

    goto :goto_d

    :goto_f
    const-string v3, "--font-weight-medium"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/Integer;

    if-eqz v5, :cond_10

    check-cast v4, Ljava/lang/Integer;

    goto :goto_10

    :cond_10
    move-object v4, v6

    :goto_10
    if-eqz v4, :cond_11

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_11
    move/from16 v16, v3

    goto :goto_13

    :cond_11
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Integer;

    if-eqz v4, :cond_12

    check-cast v3, Ljava/lang/Integer;

    goto :goto_12

    :cond_12
    move-object v3, v6

    :goto_12
    if-eqz v3, :cond_13

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_11

    :cond_13
    iget v3, v2, Luj/m;->h:I

    goto :goto_11

    :goto_13
    const-string v3, "--content-secondary"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Li2/x;

    if-eqz v5, :cond_14

    check-cast v4, Li2/x;

    goto :goto_14

    :cond_14
    move-object v4, v6

    :goto_14
    if-eqz v4, :cond_15

    iget-wide v2, v4, Li2/x;->a:J

    goto :goto_15

    :cond_15
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Li2/x;

    if-eqz v4, :cond_16

    move-object v6, v3

    check-cast v6, Li2/x;

    :cond_16
    if-eqz v6, :cond_17

    iget-wide v2, v6, Li2/x;->a:J

    goto :goto_15

    :cond_17
    iget-wide v2, v2, Luj/m;->p:J

    :goto_15
    new-instance v7, Luj/i;

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    const/16 v19, 0x0

    const v20, 0x1fb07

    const/4 v8, 0x0

    const/16 v18, 0x0

    move-object/from16 v17, v4

    invoke-direct/range {v7 .. v20}, Luj/i;-><init>(FFJJJILi2/x;Li2/x;Li2/x;I)V

    invoke-static {v7, v0, v1}, Luj/j;->a(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v0

    return-object v0
.end method

.method public static final h(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    new-instance v3, Luj/i;

    const-string v4, "--button-secondary-background"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Li2/x;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    check-cast v5, Li2/x;

    goto :goto_0

    :cond_0
    move-object v5, v7

    :goto_0
    if-eqz v5, :cond_1

    iget-wide v4, v5, Li2/x;->a:J

    :goto_1
    move-wide v5, v4

    goto :goto_3

    :cond_1
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Li2/x;

    if-eqz v5, :cond_2

    check-cast v4, Li2/x;

    goto :goto_2

    :cond_2
    move-object v4, v7

    :goto_2
    if-eqz v4, :cond_3

    iget-wide v4, v4, Li2/x;->a:J

    goto :goto_1

    :cond_3
    iget-wide v4, v2, Luj/m;->w:J

    goto :goto_1

    :goto_3
    const-string v4, "--button-secondary-border-color"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Li2/x;

    if-eqz v9, :cond_4

    check-cast v8, Li2/x;

    goto :goto_4

    :cond_4
    move-object v8, v7

    :goto_4
    if-eqz v8, :cond_5

    iget-wide v8, v8, Li2/x;->a:J

    goto :goto_6

    :cond_5
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v8, v4, Li2/x;

    if-eqz v8, :cond_6

    check-cast v4, Li2/x;

    goto :goto_5

    :cond_6
    move-object v4, v7

    :goto_5
    if-eqz v4, :cond_7

    iget-wide v8, v4, Li2/x;->a:J

    goto :goto_6

    :cond_7
    iget-wide v8, v2, Luj/m;->u:J

    :goto_6
    const-string v4, "--button-secondary-content"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Li2/x;

    if-eqz v11, :cond_8

    check-cast v10, Li2/x;

    goto :goto_7

    :cond_8
    move-object v10, v7

    :goto_7
    if-eqz v10, :cond_9

    iget-wide v10, v10, Li2/x;->a:J

    goto :goto_8

    :cond_9
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v10, v4, Li2/x;

    if-eqz v10, :cond_a

    move-object v7, v4

    check-cast v7, Li2/x;

    :cond_a
    if-eqz v7, :cond_b

    iget-wide v10, v7, Li2/x;->a:J

    goto :goto_8

    :cond_b
    iget-wide v10, v2, Luj/m;->p:J

    :goto_8
    const/4 v14, 0x0

    const v15, 0x1ff8f

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-wide v7, v8

    move-wide v9, v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v2 .. v15}, Luj/i;-><init>(FFJJJILi2/x;Li2/x;Li2/x;I)V

    invoke-static {v2, v0, v1}, Luj/j;->a(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v2

    invoke-static {v2, v0, v1}, Luj/j;->b(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v0

    return-object v0
.end method

.method public static final i(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Luj/i;

    const-string v3, "--button-tertiary-background"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Li2/x;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    check-cast v4, Li2/x;

    goto :goto_0

    :cond_0
    move-object v4, v6

    :goto_0
    if-eqz v4, :cond_1

    iget-wide v3, v4, Li2/x;->a:J

    goto :goto_2

    :cond_1
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Li2/x;

    if-eqz v4, :cond_2

    check-cast v3, Li2/x;

    goto :goto_1

    :cond_2
    move-object v3, v6

    :goto_1
    if-eqz v3, :cond_3

    iget-wide v3, v3, Li2/x;->a:J

    goto :goto_2

    :cond_3
    sget-wide v3, Li2/x;->m:J

    :goto_2
    const-string v5, "--button-tertiary-border-color"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Li2/x;

    if-eqz v8, :cond_4

    check-cast v7, Li2/x;

    goto :goto_3

    :cond_4
    move-object v7, v6

    :goto_3
    if-eqz v7, :cond_5

    iget-wide v7, v7, Li2/x;->a:J

    goto :goto_5

    :cond_5
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Li2/x;

    if-eqz v7, :cond_6

    check-cast v5, Li2/x;

    goto :goto_4

    :cond_6
    move-object v5, v6

    :goto_4
    if-eqz v5, :cond_7

    iget-wide v7, v5, Li2/x;->a:J

    goto :goto_5

    :cond_7
    sget-wide v7, Li2/x;->m:J

    :goto_5
    const-string v5, "--button-tertiary-content"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Li2/x;

    if-eqz v10, :cond_8

    check-cast v9, Li2/x;

    goto :goto_6

    :cond_8
    move-object v9, v6

    :goto_6
    if-eqz v9, :cond_9

    iget-wide v5, v9, Li2/x;->a:J

    :goto_7
    move-wide v9, v5

    goto :goto_8

    :cond_9
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    instance-of v9, v5, Li2/x;

    if-eqz v9, :cond_a

    move-object v6, v5

    check-cast v6, Li2/x;

    :cond_a
    if-eqz v6, :cond_b

    iget-wide v5, v6, Li2/x;->a:J

    goto :goto_7

    :cond_b
    move-object/from16 v5, p2

    iget-wide v5, v5, Luj/m;->p:J

    goto :goto_7

    :goto_8
    const/4 v14, 0x0

    const v15, 0x1ff8f

    move-wide v5, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v2 .. v15}, Luj/i;-><init>(FFJJJILi2/x;Li2/x;Li2/x;I)V

    invoke-static {v2, v0, v1}, Luj/j;->a(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v2

    invoke-static {v2, v0, v1}, Luj/j;->b(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v0

    return-object v0
.end method

.method public static final j(Lorg/json/JSONObject;Lorg/json/JSONObject;Luj/m;)Luj/i;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    new-instance v3, Luj/i;

    const-string v4, "--form-control-background"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Li2/x;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    check-cast v5, Li2/x;

    goto :goto_0

    :cond_0
    move-object v5, v7

    :goto_0
    if-eqz v5, :cond_1

    iget-wide v4, v5, Li2/x;->a:J

    :goto_1
    move-wide v5, v4

    goto :goto_3

    :cond_1
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Li2/x;

    if-eqz v5, :cond_2

    check-cast v4, Li2/x;

    goto :goto_2

    :cond_2
    move-object v4, v7

    :goto_2
    if-eqz v4, :cond_3

    iget-wide v4, v4, Li2/x;->a:J

    goto :goto_1

    :cond_3
    iget-wide v4, v2, Luj/m;->w:J

    goto :goto_1

    :goto_3
    const-string v4, "--form-control-border-color"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Li2/x;

    if-eqz v9, :cond_4

    check-cast v8, Li2/x;

    goto :goto_4

    :cond_4
    move-object v8, v7

    :goto_4
    if-eqz v8, :cond_5

    iget-wide v8, v8, Li2/x;->a:J

    goto :goto_6

    :cond_5
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v8, v4, Li2/x;

    if-eqz v8, :cond_6

    check-cast v4, Li2/x;

    goto :goto_5

    :cond_6
    move-object v4, v7

    :goto_5
    if-eqz v4, :cond_7

    iget-wide v8, v4, Li2/x;->a:J

    goto :goto_6

    :cond_7
    iget-wide v8, v2, Luj/m;->u:J

    :goto_6
    const-string v4, "--content-primary"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Li2/x;

    if-eqz v11, :cond_8

    check-cast v10, Li2/x;

    goto :goto_7

    :cond_8
    move-object v10, v7

    :goto_7
    if-eqz v10, :cond_9

    iget-wide v10, v10, Li2/x;->a:J

    goto :goto_8

    :cond_9
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v10, v4, Li2/x;

    if-eqz v10, :cond_a

    move-object v7, v4

    check-cast v7, Li2/x;

    :cond_a
    if-eqz v7, :cond_b

    iget-wide v10, v7, Li2/x;->a:J

    goto :goto_8

    :cond_b
    iget-wide v10, v2, Luj/m;->o:J

    :goto_8
    const/4 v14, 0x0

    const v15, 0x1ff8f

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-wide v7, v8

    move-wide v9, v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v2 .. v15}, Luj/i;-><init>(FFJJJILi2/x;Li2/x;Li2/x;I)V

    invoke-static {v2, v0, v1}, Luj/j;->a(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v2

    invoke-static {v2, v0, v1}, Luj/j;->b(Luj/i;Lorg/json/JSONObject;Lorg/json/JSONObject;)Luj/i;

    move-result-object v0

    return-object v0
.end method
