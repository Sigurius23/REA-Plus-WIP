.class public abstract Li63/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, ""

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Li63/a0;->a:Ljava/util/List;

    return-void
.end method

.method public static final a(IILjava/lang/String;)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge p0, p1, :cond_3

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5b

    if-ne v2, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/16 v3, 0x5d

    if-ne v2, v3, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    const/16 v3, 0x3a

    if-ne v2, v3, :cond_2

    if-nez v1, :cond_2

    return p0

    :cond_2
    :goto_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, -0x1

    return p0
.end method

.method public static final b(Li63/z;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Li63/a0;->c(Li63/z;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    new-instance v0, Lio/ktor/http/URLParserException;

    invoke-direct {v0, p1, p0}, Lio/ktor/http/URLParserException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final c(Li63/z;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "urlString"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v2, :cond_1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Lva3/d;->i(C)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v5

    if-ltz v2, :cond_4

    :goto_2
    add-int/lit8 v6, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Lva3/d;->i(C)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_4

    :cond_2
    if-gez v6, :cond_3

    goto :goto_3

    :cond_3
    move v2, v6

    goto :goto_2

    :cond_4
    :goto_3
    move v2, v5

    :goto_4
    add-int/lit8 v6, v2, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x41

    const/16 v9, 0x5b

    const/16 v10, 0x7b

    const/16 v11, 0x61

    if-gt v11, v7, :cond_5

    if-ge v7, v10, :cond_5

    goto :goto_5

    :cond_5
    if-gt v8, v7, :cond_6

    if-ge v7, v9, :cond_6

    :goto_5
    move v7, v4

    move v12, v5

    goto :goto_6

    :cond_6
    move v7, v4

    move v12, v7

    :goto_6
    const/16 v13, 0x23

    const/16 v14, 0x3f

    const/16 v15, 0x2f

    if-ge v7, v6, :cond_e

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v9, 0x3a

    if-ne v3, v9, :cond_8

    if-ne v12, v5, :cond_7

    sub-int/2addr v7, v4

    goto :goto_9

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Illegal character in scheme at position "

    invoke-static {v12, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    if-eq v3, v15, :cond_e

    if-eq v3, v14, :cond_e

    if-ne v3, v13, :cond_9

    goto :goto_8

    :cond_9
    if-ne v12, v5, :cond_d

    if-gt v11, v3, :cond_a

    if-ge v3, v10, :cond_a

    goto :goto_7

    :cond_a
    if-gt v8, v3, :cond_b

    const/16 v13, 0x5b

    if-ge v3, v13, :cond_b

    goto :goto_7

    :cond_b
    const/16 v13, 0x30

    if-gt v13, v3, :cond_c

    if-ge v3, v9, :cond_c

    goto :goto_7

    :cond_c
    const/16 v9, 0x2e

    if-eq v3, v9, :cond_d

    const/16 v9, 0x2b

    if-eq v3, v9, :cond_d

    const/16 v9, 0x2d

    if-eq v3, v9, :cond_d

    move v12, v7

    :cond_d
    :goto_7
    add-int/lit8 v7, v7, 0x1

    const/16 v9, 0x5b

    goto :goto_6

    :cond_e
    :goto_8
    move v7, v5

    :goto_9
    const-string v3, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    if-lez v7, :cond_1a

    invoke-static {v4, v1, v7, v4, v3}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Li63/b0;->c:Li63/b0;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v12, 0x0

    :goto_a
    const/16 v13, 0x80

    if-ge v12, v11, :cond_13

    invoke-virtual {v10, v12}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-gt v8, v14, :cond_f

    const/16 v9, 0x5b

    const/16 v16, 0x1

    if-ge v14, v9, :cond_10

    add-int/lit8 v9, v14, 0x20

    int-to-char v9, v9

    goto :goto_b

    :cond_f
    const/16 v16, 0x1

    :cond_10
    if-ltz v14, :cond_11

    if-ge v14, v13, :cond_11

    move v9, v14

    goto :goto_b

    :cond_11
    invoke-static {v14}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v9

    :goto_b
    if-eq v9, v14, :cond_12

    goto :goto_c

    :cond_12
    add-int/lit8 v12, v12, 0x1

    const/16 v14, 0x3f

    goto :goto_a

    :cond_13
    const/16 v16, 0x1

    move v12, v5

    :goto_c
    if-ne v12, v5, :cond_14

    goto :goto_f

    :cond_14
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v9

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v9, 0x0

    invoke-virtual {v11, v10, v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-static {v10}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v9

    if-gt v12, v9, :cond_18

    :goto_d
    invoke-virtual {v10, v12}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-gt v8, v14, :cond_15

    const/16 v8, 0x5b

    if-ge v14, v8, :cond_16

    add-int/lit8 v14, v14, 0x20

    int-to-char v14, v14

    goto :goto_e

    :cond_15
    const/16 v8, 0x5b

    :cond_16
    if-ltz v14, :cond_17

    if-ge v14, v13, :cond_17

    goto :goto_e

    :cond_17
    invoke-static {v14}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v14

    :goto_e
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eq v12, v9, :cond_18

    add-int/lit8 v12, v12, 0x1

    const/16 v8, 0x41

    goto :goto_d

    :cond_18
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v8, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_f
    sget-object v8, Li63/b0;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v8, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li63/b0;

    if-nez v8, :cond_19

    new-instance v8, Li63/b0;

    const/4 v9, 0x0

    invoke-direct {v8, v10, v9}, Li63/b0;-><init>(Ljava/lang/String;I)V

    :cond_19
    iput-object v8, v0, Li63/z;->a:Li63/b0;

    add-int/lit8 v7, v7, 0x1

    add-int/2addr v4, v7

    goto :goto_10

    :cond_1a
    const/16 v16, 0x1

    :goto_10
    const/4 v9, 0x0

    :goto_11
    add-int v7, v4, v9

    if-ge v7, v6, :cond_1b

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v8, v15, :cond_1b

    add-int/lit8 v9, v9, 0x1

    goto :goto_11

    :cond_1b
    iget-object v4, v0, Li63/z;->a:Li63/b0;

    iget-object v4, v4, Li63/b0;->a:Ljava/lang/String;

    const-string v8, "file"

    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v8, 0x4

    const-string v10, "/"

    const/4 v11, 0x2

    if-eqz v4, :cond_20

    if-eq v9, v11, :cond_1d

    const/4 v2, 0x3

    if-ne v9, v2, :cond_1c

    const-string v2, ""

    iput-object v2, v0, Li63/z;->b:Ljava/lang/String;

    invoke-virtual {v1, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/room/c1;->N(Li63/z;Ljava/lang/String;)V

    return-void

    :cond_1c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid file url: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    const/4 v9, 0x0

    invoke-static {v1, v15, v7, v9, v8}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v2

    if-eq v2, v5, :cond_1f

    if-ne v2, v6, :cond_1e

    goto :goto_12

    :cond_1e
    invoke-virtual {v1, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Li63/z;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Landroidx/room/c1;->N(Li63/z;Ljava/lang/String;)V

    return-void

    :cond_1f
    :goto_12
    invoke-virtual {v1, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Li63/z;->b:Ljava/lang/String;

    return-void

    :cond_20
    iget-object v4, v0, Li63/z;->a:Li63/b0;

    iget-object v4, v4, Li63/b0;->a:Ljava/lang/String;

    const-string v12, "mailto"

    invoke-virtual {v4, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    if-nez v9, :cond_23

    const-string v2, "@"

    const/4 v9, 0x0

    invoke-static {v1, v2, v7, v9, v8}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v2

    if-eq v2, v5, :cond_22

    invoke-virtual {v1, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Li63/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_21

    invoke-static {v4, v9}, Li63/a;->f(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v12

    goto :goto_13

    :cond_21
    const/4 v12, 0x0

    :goto_13
    iput-object v12, v0, Li63/z;->e:Ljava/lang/String;

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Li63/z;->b:Ljava/lang/String;

    return-void

    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid mailto url: "

    const-string v3, ", it should contain \'@\'."

    invoke-static {v2, v1, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    if-lt v9, v11, :cond_2d

    :goto_14
    const/4 v4, 0x5

    new-array v13, v4, [C

    const/4 v14, 0x0

    :goto_15
    if-ge v14, v4, :cond_25

    const-string v4, "@/\\?#"

    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    move-result v4

    aput-char v4, v13, v14

    add-int/lit8 v14, v14, 0x1

    const/4 v4, 0x5

    goto :goto_15

    :cond_25
    const/4 v4, 0x0

    invoke-static {v1, v13, v7, v4}, Lyb3/r;->h0(Ljava/lang/CharSequence;[CIZ)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-lez v13, :cond_26

    goto :goto_16

    :cond_26
    const/4 v4, 0x0

    :goto_16
    if-eqz v4, :cond_27

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_17

    :cond_27
    move v4, v6

    :goto_17
    if-ge v4, v6, :cond_29

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v14, 0x40

    if-ne v13, v14, :cond_29

    invoke-static {v7, v4, v1}, Li63/a0;->a(IILjava/lang/String;)I

    move-result v13

    if-eq v13, v5, :cond_28

    invoke-virtual {v1, v7, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Li63/z;->e:Ljava/lang/String;

    add-int/lit8 v13, v13, 0x1

    invoke-virtual {v1, v13, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Li63/z;->f:Ljava/lang/String;

    goto :goto_18

    :cond_28
    invoke-virtual {v1, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Li63/z;->e:Ljava/lang/String;

    :goto_18
    add-int/lit8 v7, v4, 0x1

    goto :goto_14

    :cond_29
    invoke-static {v7, v4, v1}, Li63/a0;->a(IILjava/lang/String;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    if-lez v5, :cond_2a

    goto :goto_19

    :cond_2a
    const/4 v13, 0x0

    :goto_19
    if-eqz v13, :cond_2b

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_1a

    :cond_2b
    move v5, v4

    :goto_1a
    invoke-virtual {v1, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, Li63/z;->b:Ljava/lang/String;

    add-int/lit8 v5, v5, 0x1

    if-ge v5, v4, :cond_2c

    invoke-virtual {v1, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    iput v5, v0, Li63/z;->c:I

    goto :goto_1b

    :cond_2c
    const/4 v5, 0x0

    iput v5, v0, Li63/z;->c:I

    :goto_1b
    move v7, v4

    :cond_2d
    sget-object v4, Li63/a0;->a:Ljava/util/List;

    sget-object v5, Lm83/y;->w:Lm83/y;

    if-lt v7, v6, :cond_2f

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v15, :cond_2e

    goto :goto_1c

    :cond_2e
    move-object v4, v5

    :goto_1c
    const-string v1, "<set-?>"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v0, Li63/z;->h:Ljava/util/List;

    return-void

    :cond_2f
    if-nez v9, :cond_30

    iget-object v2, v0, Li63/z;->h:Ljava/util/List;

    move/from16 v13, v16

    invoke-static {v13, v2}, Lm83/s;->A0(ILjava/util/List;)Ljava/util/List;

    move-result-object v2

    goto :goto_1d

    :cond_30
    move-object v2, v5

    :goto_1d
    iput-object v2, v0, Li63/z;->h:Ljava/util/List;

    new-array v2, v11, [C

    const/4 v13, 0x0

    :goto_1e
    if-ge v13, v11, :cond_31

    const-string v14, "?#"

    invoke-virtual {v14, v13}, Ljava/lang/String;->charAt(I)C

    move-result v14

    aput-char v14, v2, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_1e

    :cond_31
    const/4 v13, 0x0

    invoke-static {v1, v2, v7, v13}, Lyb3/r;->h0(Ljava/lang/CharSequence;[CIZ)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    if-lez v2, :cond_32

    goto :goto_1f

    :cond_32
    const/4 v11, 0x0

    :goto_1f
    if-eqz v11, :cond_33

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_20

    :cond_33
    move v2, v6

    :goto_20
    const/4 v11, 0x6

    if-le v2, v7, :cond_37

    invoke-virtual {v1, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v13, v0, Li63/z;->h:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    const/4 v14, 0x1

    if-ne v13, v14, :cond_34

    iget-object v13, v0, Li63/z;->h:Ljava/util/List;

    invoke-static {v13}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/CharSequence;

    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-nez v13, :cond_34

    move-object v13, v5

    goto :goto_21

    :cond_34
    iget-object v13, v0, Li63/z;->h:Ljava/util/List;

    :goto_21
    invoke-virtual {v7, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_35

    move-object v7, v4

    const/4 v14, 0x1

    goto :goto_22

    :cond_35
    const/4 v14, 0x1

    new-array v10, v14, [C

    const/4 v12, 0x0

    aput-char v15, v10, v12

    invoke-static {v7, v10, v12, v11}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v7

    :goto_22
    if-ne v9, v14, :cond_36

    goto :goto_23

    :cond_36
    move-object v4, v5

    :goto_23
    check-cast v4, Ljava/util/Collection;

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v4, v7}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v4

    check-cast v13, Ljava/util/Collection;

    invoke-static {v13, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, v0, Li63/z;->h:Ljava/util/List;

    move v7, v2

    :cond_37
    if-ge v7, v6, :cond_3b

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x3f

    if-ne v2, v4, :cond_3b

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v6, :cond_38

    const/4 v14, 0x1

    iput-boolean v14, v0, Li63/z;->d:Z

    move v7, v6

    goto :goto_26

    :cond_38
    const/16 v2, 0x23

    const/4 v9, 0x0

    invoke-static {v1, v2, v7, v9, v8}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-lez v4, :cond_39

    move-object v12, v2

    goto :goto_24

    :cond_39
    const/4 v12, 0x0

    :goto_24
    if-eqz v12, :cond_3a

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_25

    :cond_3a
    move v2, v6

    :goto_25
    invoke-virtual {v1, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v4}, Lwb3/f;->W(ILjava/lang/String;)Li63/w;

    move-result-object v4

    new-instance v5, Lb2/r;

    const/4 v7, 0x7

    invoke-direct {v5, v0, v7}, Lb2/r;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v4, v5}, Lo63/m;->c(Lc93/m;)V

    move v7, v2

    :cond_3b
    :goto_26
    if-ge v7, v6, :cond_3c

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x23

    if-ne v2, v4, :cond_3c

    const/16 v16, 0x1

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v1, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Li63/z;->g:Ljava/lang/String;

    :cond_3c
    return-void
.end method
