.class public final Lbd3/f0;
.super Lva3/d;
.source "SourceFile"

# interfaces
.implements Lad3/k;


# instance fields
.field public final a:Lad3/c;

.field public final b:Lbd3/l0;

.field public final c:Lbd3/a;

.field public final d:Lcd3/f;

.field public e:I

.field public f:Lbd3/e0;

.field public final g:Lad3/i;

.field public final h:Lbd3/p;


# direct methods
.method public constructor <init>(Lad3/c;Lbd3/l0;Lbd3/a;Lyc3/g;Lbd3/e0;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd3/f0;->a:Lad3/c;

    iput-object p2, p0, Lbd3/f0;->b:Lbd3/l0;

    iput-object p3, p0, Lbd3/f0;->c:Lbd3/a;

    iget-object p2, p1, Lad3/c;->b:Lcd3/f;

    iput-object p2, p0, Lbd3/f0;->d:Lcd3/f;

    const/4 p2, -0x1

    iput p2, p0, Lbd3/f0;->e:I

    iput-object p5, p0, Lbd3/f0;->f:Lbd3/e0;

    iget-object p1, p1, Lad3/c;->a:Lad3/i;

    iput-object p1, p0, Lbd3/f0;->g:Lad3/i;

    iget-boolean p1, p1, Lad3/i;->f:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lbd3/p;

    invoke-direct {p1, p4}, Lbd3/p;-><init>(Lyc3/g;)V

    :goto_0
    iput-object p1, p0, Lbd3/f0;->h:Lbd3/p;

    return-void
.end method


# virtual methods
.method public final a()Lad3/c;
    .locals 1

    iget-object v0, p0, Lbd3/f0;->a:Lad3/c;

    return-object v0
.end method

.method public final b()Lkotlinx/serialization/json/JsonElement;
    .locals 3

    new-instance v0, Lbd3/c0;

    iget-object v1, p0, Lbd3/f0;->a:Lad3/c;

    iget-object v1, v1, Lad3/c;->a:Lad3/i;

    iget-object v2, p0, Lbd3/f0;->c:Lbd3/a;

    invoke-direct {v0, v1, v2}, Lbd3/c0;-><init>(Lad3/i;Lbd3/a;)V

    invoke-virtual {v0}, Lbd3/c0;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    return-object v0
.end method

.method public final beginStructure(Lyc3/g;)Lzc3/b;
    .locals 7

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/f0;->a:Lad3/c;

    invoke-static {v0, p1}, Lbd3/q;->u(Lad3/c;Lyc3/g;)Lbd3/l0;

    move-result-object v3

    iget-object v4, p0, Lbd3/f0;->c:Lbd3/a;

    iget-object v1, v4, Lbd3/a;->b:Lae3/k;

    iget v2, v1, Lae3/k;->b:I

    const/4 v5, 0x1

    add-int/2addr v2, v5

    iput v2, v1, Lae3/k;->b:I

    iget-object v6, v1, Lae3/k;->c:Ljava/lang/Object;

    check-cast v6, [Ljava/lang/Object;

    array-length v6, v6

    if-ne v2, v6, :cond_0

    invoke-virtual {v1}, Lae3/k;->f()V

    :cond_0
    iget-object v1, v1, Lae3/k;->c:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    iget-char v1, v3, Lbd3/l0;->w:C

    invoke-virtual {v4, v1}, Lbd3/a;->h(C)V

    invoke-virtual {v4}, Lbd3/a;->w()B

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eq v1, v5, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    iget-object v1, p0, Lbd3/f0;->b:Lbd3/l0;

    if-ne v1, v3, :cond_1

    iget-object v0, v0, Lad3/c;->a:Lad3/i;

    iget-boolean v0, v0, Lad3/i;->f:Z

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    new-instance v1, Lbd3/f0;

    iget-object v2, p0, Lbd3/f0;->a:Lad3/c;

    iget-object v6, p0, Lbd3/f0;->f:Lbd3/e0;

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lbd3/f0;-><init>(Lad3/c;Lbd3/l0;Lbd3/a;Lyc3/g;Lbd3/e0;)V

    return-object v1

    :cond_2
    move-object v5, p1

    new-instance v1, Lbd3/f0;

    iget-object v2, p0, Lbd3/f0;->a:Lad3/c;

    iget-object v6, p0, Lbd3/f0;->f:Lbd3/e0;

    invoke-direct/range {v1 .. v6}, Lbd3/f0;-><init>(Lad3/c;Lbd3/l0;Lbd3/a;Lyc3/g;Lbd3/e0;)V

    return-object v1

    :cond_3
    const/4 p1, 0x0

    const/4 v0, 0x6

    const-string v1, "Unexpected leading comma"

    const/4 v2, 0x0

    invoke-static {v4, v1, p1, v2, v0}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v2
.end method

.method public final decodeBoolean()Z
    .locals 11

    iget-object v0, p0, Lbd3/f0;->c:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->z()I

    move-result v1

    invoke-virtual {v0}, Lbd3/a;->t()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-string v3, "EOF"

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eq v1, v2, :cond_7

    invoke-virtual {v0}, Lbd3/a;->t()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v7, 0x22

    const/4 v8, 0x1

    if-ne v2, v7, :cond_0

    add-int/lit8 v1, v1, 0x1

    move v2, v8

    goto :goto_0

    :cond_0
    move v2, v6

    :goto_0
    invoke-virtual {v0, v1}, Lbd3/a;->y(I)I

    move-result v1

    invoke-virtual {v0}, Lbd3/a;->t()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-ge v1, v9, :cond_6

    const/4 v9, -0x1

    if-eq v1, v9, :cond_6

    invoke-virtual {v0}, Lbd3/a;->t()Ljava/lang/CharSequence;

    move-result-object v9

    add-int/lit8 v10, v1, 0x1

    invoke-interface {v9, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    or-int/lit8 v1, v1, 0x20

    const/16 v9, 0x66

    if-eq v1, v9, :cond_2

    const/16 v9, 0x74

    if-ne v1, v9, :cond_1

    const-string v1, "rue"

    invoke-virtual {v0, v10, v1}, Lbd3/a;->d(ILjava/lang/String;)V

    move v1, v8

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected valid boolean literal prefix, but had \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6, v5, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v5

    :cond_2
    const-string v1, "alse"

    invoke-virtual {v0, v10, v1}, Lbd3/a;->d(ILjava/lang/String;)V

    move v1, v6

    :goto_1
    if-eqz v2, :cond_5

    iget v2, v0, Lbd3/a;->a:I

    invoke-virtual {v0}, Lbd3/a;->t()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-eq v2, v9, :cond_4

    invoke-virtual {v0}, Lbd3/a;->t()Ljava/lang/CharSequence;

    move-result-object v2

    iget v3, v0, Lbd3/a;->a:I

    invoke-interface {v2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-ne v2, v7, :cond_3

    iget v2, v0, Lbd3/a;->a:I

    add-int/2addr v2, v8

    iput v2, v0, Lbd3/a;->a:I

    return v1

    :cond_3
    const-string v1, "Expected closing quotation mark"

    invoke-static {v0, v1, v6, v5, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v5

    :cond_4
    invoke-static {v0, v3, v6, v5, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v5

    :cond_5
    return v1

    :cond_6
    invoke-static {v0, v3, v6, v5, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v5

    :cond_7
    invoke-static {v0, v3, v6, v5, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v5
.end method

.method public final decodeByte()B
    .locals 6

    iget-object v0, p0, Lbd3/f0;->c:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->i()J

    move-result-wide v1

    long-to-int v3, v1

    int-to-byte v3, v3

    int-to-long v4, v3

    cmp-long v4, v1, v4

    if-nez v4, :cond_0

    return v3

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse byte for input \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v4
.end method

.method public final decodeChar()C
    .locals 5

    iget-object v0, p0, Lbd3/f0;->c:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0

    :cond_0
    const-string v2, "Expected single char, but got \'"

    const/16 v3, 0x27

    invoke-static {v3, v2, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {v0, v1, v4, v3, v2}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v3
.end method

.method public final decodeDouble()D
    .locals 9

    iget-object v0, p0, Lbd3/f0;->c:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lbd3/f0;->a:Lad3/c;

    iget-object v1, v1, Lad3/c;->a:Lad3/i;

    iget-boolean v1, v1, Lad3/i;->j:Z

    if-nez v1, :cond_1

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v5

    const-wide v7, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v1, v5, v7

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-static {v0, v1}, Lbd3/q;->v(Lbd3/a;Ljava/lang/Number;)V

    throw v2

    :cond_1
    :goto_0
    return-wide v3

    :catch_0
    const-string v3, "Failed to parse type \'double\' for input \'"

    const/16 v4, 0x27

    invoke-static {v4, v3, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v2, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v2
.end method

.method public final decodeElementIndex(Lyc3/g;)I
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lbd3/f0;->c:Lbd3/a;

    iget-object v3, v2, Lbd3/a;->b:Lae3/k;

    const-string v4, "descriptor"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lbd3/f0;->b:Lbd3/l0;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const-string v6, "object"

    const/4 v7, 0x6

    const/16 v8, 0x3a

    const/4 v9, 0x0

    iget-object v10, v0, Lbd3/f0;->a:Lad3/c;

    const/4 v11, 0x1

    const/4 v12, -0x1

    const/4 v13, 0x0

    if-eqz v5, :cond_e

    const/4 v1, 0x2

    if-eq v5, v1, :cond_4

    invoke-virtual {v2}, Lbd3/a;->B()Z

    move-result v1

    invoke-virtual {v2}, Lbd3/a;->c()Z

    move-result v5

    if-eqz v5, :cond_2

    iget v5, v0, Lbd3/f0;->e:I

    if-eq v5, v12, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Expected end of the array or comma"

    invoke-static {v2, v1, v9, v13, v7}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v13

    :cond_1
    :goto_0
    add-int/lit8 v12, v5, 0x1

    iput v12, v0, Lbd3/f0;->e:I

    goto/16 :goto_12

    :cond_2
    if-nez v1, :cond_3

    goto/16 :goto_12

    :cond_3
    iget-object v1, v10, Lad3/c;->a:Lad3/i;

    const-string v1, "array"

    invoke-static {v2, v1}, Lbd3/q;->q(Lbd3/a;Ljava/lang/String;)V

    throw v13

    :cond_4
    iget v1, v0, Lbd3/f0;->e:I

    rem-int/lit8 v5, v1, 0x2

    if-eqz v5, :cond_5

    move v5, v11

    goto :goto_1

    :cond_5
    move v5, v9

    :goto_1
    if-eqz v5, :cond_6

    if-eq v1, v12, :cond_7

    invoke-virtual {v2}, Lbd3/a;->B()Z

    move-result v9

    goto :goto_2

    :cond_6
    invoke-virtual {v2, v8}, Lbd3/a;->h(C)V

    :cond_7
    :goto_2
    invoke-virtual {v2}, Lbd3/a;->c()Z

    move-result v1

    if-eqz v1, :cond_c

    if-eqz v5, :cond_b

    iget v1, v0, Lbd3/f0;->e:I

    const/4 v5, 0x4

    if-ne v1, v12, :cond_9

    iget v1, v2, Lbd3/a;->a:I

    if-nez v9, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "Unexpected leading comma"

    invoke-static {v2, v3, v1, v13, v5}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v13

    :cond_9
    iget v1, v2, Lbd3/a;->a:I

    if-eqz v9, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "Expected comma after the key-value pair"

    invoke-static {v2, v3, v1, v13, v5}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v13

    :cond_b
    :goto_3
    iget v1, v0, Lbd3/f0;->e:I

    add-int/lit8 v12, v1, 0x1

    iput v12, v0, Lbd3/f0;->e:I

    goto/16 :goto_12

    :cond_c
    if-nez v9, :cond_d

    goto/16 :goto_12

    :cond_d
    iget-object v1, v10, Lad3/c;->a:Lad3/i;

    invoke-static {v2, v6}, Lbd3/q;->q(Lbd3/a;Ljava/lang/String;)V

    throw v13

    :cond_e
    invoke-virtual {v2}, Lbd3/a;->B()Z

    move-result v5

    :goto_4
    invoke-virtual {v2}, Lbd3/a;->c()Z

    move-result v14

    iget-object v15, v0, Lbd3/f0;->h:Lbd3/p;

    if-eqz v14, :cond_27

    iget-object v5, v0, Lbd3/f0;->g:Lad3/i;

    iget-boolean v14, v5, Lad3/i;->c:Z

    if-eqz v14, :cond_f

    invoke-virtual {v2}, Lbd3/a;->m()Ljava/lang/String;

    move-result-object v16

    :goto_5
    move-object/from16 v7, v16

    goto :goto_6

    :cond_f
    invoke-virtual {v2}, Lbd3/a;->e()Ljava/lang/String;

    move-result-object v16

    goto :goto_5

    :goto_6
    invoke-virtual {v2, v8}, Lbd3/a;->h(C)V

    invoke-static {v1, v10, v7}, Lbd3/q;->n(Lyc3/g;Lad3/c;Ljava/lang/String;)I

    move-result v8

    move/from16 v17, v12

    const/4 v12, -0x3

    if-eq v8, v12, :cond_17

    iget-boolean v5, v5, Lad3/i;->h:Z

    if-eqz v5, :cond_15

    invoke-interface {v1, v8}, Lyc3/g;->isElementOptional(I)Z

    move-result v5

    invoke-interface {v1, v8}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v13

    if-eqz v5, :cond_10

    invoke-interface {v13}, Lyc3/g;->isNullable()Z

    move-result v19

    if-nez v19, :cond_10

    invoke-virtual {v2, v11}, Lbd3/a;->C(Z)Z

    move-result v19

    if-eqz v19, :cond_10

    goto :goto_9

    :cond_10
    invoke-interface {v13}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v11

    sget-object v12, Lyc3/j;->a:Lyc3/j;

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_15

    invoke-interface {v13}, Lyc3/g;->isNullable()Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-virtual {v2, v9}, Lbd3/a;->C(Z)Z

    move-result v11

    if-eqz v11, :cond_11

    goto :goto_a

    :cond_11
    invoke-virtual {v2, v14}, Lbd3/a;->x(Z)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_12

    goto :goto_a

    :cond_12
    invoke-static {v13, v10, v11}, Lbd3/q;->n(Lyc3/g;Lad3/c;Ljava/lang/String;)I

    move-result v11

    iget-object v12, v10, Lad3/c;->a:Lad3/i;

    iget-boolean v12, v12, Lad3/i;->f:Z

    if-nez v12, :cond_13

    invoke-interface {v13}, Lyc3/g;->isNullable()Z

    move-result v12

    if-eqz v12, :cond_13

    const/4 v12, 0x1

    :goto_7
    const/4 v13, -0x3

    goto :goto_8

    :cond_13
    move v12, v9

    goto :goto_7

    :goto_8
    if-ne v11, v13, :cond_15

    if-nez v5, :cond_14

    if-eqz v12, :cond_15

    :cond_14
    invoke-virtual {v2}, Lbd3/a;->j()Ljava/lang/String;

    :goto_9
    invoke-virtual {v2}, Lbd3/a;->B()Z

    move-result v5

    move v8, v9

    goto :goto_b

    :cond_15
    :goto_a
    if-eqz v15, :cond_16

    iget-object v1, v15, Lbd3/p;->a:Lkotlinx/serialization/internal/ElementMarker;

    invoke-virtual {v1, v8}, Lkotlinx/serialization/internal/ElementMarker;->mark(I)V

    :cond_16
    move v12, v8

    goto/16 :goto_12

    :cond_17
    move v5, v9

    const/4 v8, 0x1

    :goto_b
    if-eqz v8, :cond_26

    invoke-static {v10, v1}, Lbd3/q;->p(Lad3/c;Lyc3/g;)Z

    move-result v5

    if-nez v5, :cond_18

    iget-object v5, v0, Lbd3/f0;->f:Lbd3/e0;

    if-eqz v5, :cond_19

    iget-object v8, v5, Lbd3/e0;->b:Ljava/lang/String;

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_19

    const/4 v8, 0x0

    iput-object v8, v5, Lbd3/e0;->b:Ljava/lang/String;

    :cond_18
    move/from16 v8, v17

    goto :goto_c

    :cond_19
    iget v1, v3, Lae3/k;->b:I

    iget-object v4, v3, Lae3/k;->d:Ljava/lang/Object;

    check-cast v4, [I

    aget v5, v4, v1

    const/4 v6, -0x2

    if-ne v5, v6, :cond_1a

    aput v17, v4, v1

    add-int/lit8 v1, v1, -0x1

    iput v1, v3, Lae3/k;->b:I

    :cond_1a
    iget v1, v3, Lae3/k;->b:I

    move/from16 v8, v17

    if-eq v1, v8, :cond_1b

    add-int/2addr v1, v8

    iput v1, v3, Lae3/k;->b:I

    :cond_1b
    iget v1, v2, Lbd3/a;->a:I

    invoke-virtual {v2, v9, v1}, Lbd3/a;->A(II)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    invoke-static {v1, v7, v9, v4}, Lyb3/r;->l0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    move-result v1

    new-instance v4, Lkotlinx/serialization/json/internal/JsonDecodingException;

    const-string v5, "\' at offset "

    const-string v6, " at path: "

    const-string v8, "Encountered an unknown key \'"

    invoke-static {v1, v8, v7, v5, v6}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v3}, Lae3/k;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\nUse \'ignoreUnknownKeys = true\' in \'Json {}\' builder or \'@JsonIgnoreUnknownKeys\' annotation to ignore unknown keys.\nJSON input: "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lbd3/a;->t()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v1, v2}, Lbd3/q;->r(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Lkotlinx/serialization/json/internal/JsonDecodingException;-><init>(Ljava/lang/String;)V

    throw v4

    :goto_c
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lbd3/a;->w()B

    move-result v5

    const/16 v11, 0x8

    if-eq v5, v11, :cond_1c

    const/4 v12, 0x6

    if-eq v5, v12, :cond_1c

    invoke-virtual {v2}, Lbd3/a;->l()Ljava/lang/String;

    const/4 v12, 0x1

    const/4 v13, 0x6

    goto/16 :goto_11

    :cond_1c
    :goto_d
    invoke-virtual {v2}, Lbd3/a;->w()B

    move-result v5

    const/4 v12, 0x1

    if-ne v5, v12, :cond_1e

    if-eqz v14, :cond_1d

    invoke-virtual {v2}, Lbd3/a;->l()Ljava/lang/String;

    goto :goto_d

    :cond_1d
    invoke-virtual {v2}, Lbd3/a;->e()Ljava/lang/String;

    goto :goto_d

    :cond_1e
    const/4 v13, 0x6

    if-eq v5, v11, :cond_25

    if-ne v5, v13, :cond_1f

    goto :goto_f

    :cond_1f
    const/16 v13, 0x9

    if-ne v5, v13, :cond_21

    invoke-static {v7}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    move-result v5

    if-ne v5, v11, :cond_20

    invoke-static {v7}, Lm83/s;->l1(Ljava/util/List;)Ljava/lang/Object;

    :goto_e
    const/4 v13, 0x6

    goto :goto_10

    :cond_20
    iget v1, v2, Lbd3/a;->a:I

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "found ] instead of } at path: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lbd3/a;->t()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2, v1, v3}, Lbd3/q;->d(Ljava/lang/CharSequence;ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object v1

    throw v1

    :cond_21
    const/4 v13, 0x7

    if-ne v5, v13, :cond_23

    invoke-static {v7}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->byteValue()B

    move-result v5

    const/4 v13, 0x6

    if-ne v5, v13, :cond_22

    invoke-static {v7}, Lm83/s;->l1(Ljava/util/List;)Ljava/lang/Object;

    goto :goto_e

    :cond_22
    iget v1, v2, Lbd3/a;->a:I

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "found } instead of ] at path: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lbd3/a;->t()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2, v1, v3}, Lbd3/q;->d(Ljava/lang/CharSequence;ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object v1

    throw v1

    :cond_23
    const/16 v13, 0xa

    if-eq v5, v13, :cond_24

    goto :goto_e

    :cond_24
    const-string v1, "Unexpected end of input due to malformed JSON during ignoring unknown keys"

    const/4 v8, 0x0

    const/4 v13, 0x6

    invoke-static {v2, v1, v9, v8, v13}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v8

    :cond_25
    :goto_f
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_10
    invoke-virtual {v2}, Lbd3/a;->f()B

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-nez v5, :cond_1c

    :goto_11
    invoke-virtual {v2}, Lbd3/a;->B()Z

    move-result v5

    move v11, v12

    move v7, v13

    const/4 v13, 0x0

    move v12, v8

    const/16 v8, 0x3a

    goto/16 :goto_4

    :cond_26
    move/from16 v12, v17

    const/4 v7, 0x6

    const/16 v8, 0x3a

    const/4 v11, 0x1

    const/4 v13, 0x0

    goto/16 :goto_4

    :cond_27
    move v8, v12

    if-nez v5, :cond_29

    if-eqz v15, :cond_16

    iget-object v1, v15, Lbd3/p;->a:Lkotlinx/serialization/internal/ElementMarker;

    invoke-virtual {v1}, Lkotlinx/serialization/internal/ElementMarker;->nextUnmarkedIndex()I

    move-result v12

    :goto_12
    sget-object v1, Lbd3/l0;->E:Lbd3/l0;

    if-eq v4, v1, :cond_28

    iget-object v1, v3, Lae3/k;->d:Ljava/lang/Object;

    check-cast v1, [I

    iget v2, v3, Lae3/k;->b:I

    aput v12, v1, v2

    :cond_28
    return v12

    :cond_29
    iget-object v1, v10, Lad3/c;->a:Lad3/i;

    invoke-static {v2, v6}, Lbd3/q;->q(Lbd3/a;Ljava/lang/String;)V

    const/16 v18, 0x0

    throw v18
.end method

.method public final decodeEnum(Lyc3/g;)I
    .locals 3

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbd3/f0;->decodeString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lbd3/f0;->c:Lbd3/a;

    iget-object v2, v2, Lbd3/a;->b:Lae3/k;

    invoke-virtual {v2}, Lae3/k;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lbd3/f0;->a:Lad3/c;

    invoke-static {p1, v2, v0, v1}, Lbd3/q;->o(Lyc3/g;Lad3/c;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final decodeFloat()F
    .locals 5

    iget-object v0, p0, Lbd3/f0;->c:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, p0, Lbd3/f0;->a:Lad3/c;

    iget-object v3, v3, Lad3/c;->a:Lad3/i;

    iget-boolean v3, v3, Lad3/i;->j:Z

    if-nez v3, :cond_1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v3, v3, v4

    if-gtz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v0, v1}, Lbd3/q;->v(Lbd3/a;Ljava/lang/Number;)V

    throw v2

    :cond_1
    :goto_0
    return v1

    :catch_0
    const-string v3, "Failed to parse type \'float\' for input \'"

    const/16 v4, 0x27

    invoke-static {v4, v3, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v2, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v2
.end method

.method public final decodeInline(Lyc3/g;)Lzc3/d;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lbd3/h0;->b(Lyc3/g;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lbd3/o;

    iget-object v0, p0, Lbd3/f0;->c:Lbd3/a;

    iget-object v1, p0, Lbd3/f0;->a:Lad3/c;

    invoke-direct {p1, v0, v1}, Lbd3/o;-><init>(Lbd3/a;Lad3/c;)V

    return-object p1

    :cond_0
    return-object p0
.end method

.method public final decodeInt()I
    .locals 6

    iget-object v0, p0, Lbd3/f0;->c:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->i()J

    move-result-wide v1

    long-to-int v3, v1

    int-to-long v4, v3

    cmp-long v4, v1, v4

    if-nez v4, :cond_0

    return v3

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse int for input \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v4
.end method

.method public final decodeLong()J
    .locals 2

    iget-object v0, p0, Lbd3/f0;->c:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public final decodeNotNullMark()Z
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lbd3/f0;->h:Lbd3/p;

    if-eqz v1, :cond_0

    iget-boolean v1, v1, Lbd3/p;->b:Z

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-nez v1, :cond_1

    iget-object v1, p0, Lbd3/f0;->c:Lbd3/a;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lbd3/a;->C(Z)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    return v0
.end method

.method public final decodeNull()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lbd3/f0;->c:Lbd3/a;

    iget-object v0, v0, Lbd3/a;->b:Lae3/k;

    const-string v1, "descriptor"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "deserializer"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lbd3/f0;->b:Lbd3/l0;

    sget-object v2, Lbd3/l0;->E:Lbd3/l0;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    and-int/lit8 v1, p2, 0x1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x2

    if-eqz v1, :cond_1

    iget-object v4, v0, Lae3/k;->d:Ljava/lang/Object;

    check-cast v4, [I

    iget v5, v0, Lae3/k;->b:I

    aget v4, v4, v5

    if-ne v4, v2, :cond_1

    iget-object v4, v0, Lae3/k;->c:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/Object;

    sget-object v6, Lbd3/r;->a:Lbd3/r;

    aput-object v6, v4, v5

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Lva3/d;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz v1, :cond_3

    iget-object p2, v0, Lae3/k;->d:Ljava/lang/Object;

    check-cast p2, [I

    iget p3, v0, Lae3/k;->b:I

    aget p2, p2, p3

    if-eq p2, v2, :cond_2

    add-int/2addr p3, v3

    iput p3, v0, Lae3/k;->b:I

    iget-object p2, v0, Lae3/k;->c:Ljava/lang/Object;

    check-cast p2, [Ljava/lang/Object;

    array-length p2, p2

    if-ne p3, p2, :cond_2

    invoke-virtual {v0}, Lae3/k;->f()V

    :cond_2
    iget-object p2, v0, Lae3/k;->c:Ljava/lang/Object;

    check-cast p2, [Ljava/lang/Object;

    iget p3, v0, Lae3/k;->b:I

    aput-object p1, p2, p3

    iget-object p2, v0, Lae3/k;->d:Ljava/lang/Object;

    check-cast p2, [I

    aput v2, p2, p3

    :cond_3
    return-object p1
.end method

.method public final decodeSerializableValue(Lwc3/b;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lbd3/f0;->a:Lad3/c;

    iget-object v1, p0, Lbd3/f0;->c:Lbd3/a;

    iget-object v2, v1, Lbd3/a;->b:Lae3/k;

    const-string v3, "Expected "

    const-string v4, "deserializer"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    :try_start_0
    instance-of v5, p1, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    if-eqz v5, :cond_4

    iget-object v5, v0, Lad3/c;->a:Lad3/i;

    move-object v5, p1

    check-cast v5, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    invoke-virtual {v5}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v5

    invoke-static {v0, v5}, Lbd3/q;->j(Lad3/c;Lyc3/g;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lbd3/f0;->g:Lad3/i;

    iget-boolean v6, v6, Lad3/i;->c:Z

    invoke-virtual {v1, v5, v6}, Lbd3/a;->v(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    if-nez v6, :cond_3

    instance-of v1, p1, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lad3/c;->a:Lad3/i;

    move-object v1, p1

    check-cast v1, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    invoke-virtual {v1}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {v0, v1}, Lbd3/q;->j(Lad3/c;Lyc3/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lbd3/f0;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v5

    move-object v6, p1

    check-cast v6, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    invoke-virtual {v6}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object v6

    invoke-interface {v6}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v6

    instance-of v8, v5, Lkotlinx/serialization/json/JsonObject;

    const/4 v9, -0x1

    if-eqz v8, :cond_1

    check-cast v5, Lkotlinx/serialization/json/JsonObject;

    invoke-virtual {v5, v1}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    if-eqz v3, :cond_0

    invoke-static {v3}, Lad3/m;->j(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-static {v3}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v7
    :try_end_0
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    :goto_0
    :try_start_1
    check-cast p1, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    invoke-static {p1, p0, v7}, Lva3/l;->k(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/b;Ljava/lang/String;)Lwc3/b;

    move-result-object p1
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-static {v0, v1, v5, p1}, Lbd3/q;->t(Lad3/c;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lwc3/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lkotlinx/serialization/json/JsonObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9, p1}, Lbd3/q;->d(Ljava/lang/CharSequence;ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v0, Lkotlinx/serialization/json/JsonObject;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", but had "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " as the serialized body of "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " at element: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lae3/k;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9, p1}, Lbd3/q;->d(Ljava/lang/CharSequence;ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-interface {p1, p0}, Lwc3/b;->deserialize(Lzc3/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :cond_3
    :try_start_3
    check-cast p1, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    invoke-static {p1, p0, v6}, Lva3/l;->k(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/b;Ljava/lang/String;)Lwc3/b;

    move-result-object p1
    :try_end_3
    .catch Lkotlinx/serialization/SerializationException; {:try_start_3 .. :try_end_3} :catch_2

    :try_start_4
    new-instance v0, Lbd3/e0;

    invoke-direct {v0}, Lbd3/e0;-><init>()V

    iput-object v5, v0, Lbd3/e0;->b:Ljava/lang/String;

    iput-object v0, p0, Lbd3/f0;->f:Lbd3/e0;

    invoke-interface {p1, p0}, Lwc3/b;->deserialize(Lzc3/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    const-string v5, "."

    invoke-static {v0, v5}, Lyb3/r;->s0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v5, ""

    invoke-static {v3, p1, v5}, Lyb3/r;->D0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x2

    invoke-static {v1, v0, v4, p1, v3}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v7

    :cond_4
    invoke-interface {p1, p0}, Lwc3/b;->deserialize(Lzc3/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v1, "at path"

    invoke-static {v0, v1, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    throw p1

    :cond_5
    new-instance v0, Lkotlinx/serialization/MissingFieldException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " at path: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lae3/k;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lkotlinx/serialization/MissingFieldException;->w:Ljava/util/List;

    invoke-direct {v0, v2, v1, p1}, Lkotlinx/serialization/MissingFieldException;-><init>(Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/MissingFieldException;)V

    throw v0
.end method

.method public final decodeShort()S
    .locals 6

    iget-object v0, p0, Lbd3/f0;->c:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->i()J

    move-result-wide v1

    long-to-int v3, v1

    int-to-short v3, v3

    int-to-long v4, v3

    cmp-long v4, v1, v4

    if-nez v4, :cond_0

    return v3

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to parse short for input \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v4
.end method

.method public final decodeString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lbd3/f0;->g:Lad3/i;

    iget-boolean v0, v0, Lad3/i;->c:Z

    iget-object v1, p0, Lbd3/f0;->c:Lbd3/a;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lbd3/a;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Lbd3/a;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final endStructure(Lyc3/g;)V
    .locals 5

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getElementsCount()I

    move-result v0

    const/4 v1, -0x1

    iget-object v2, p0, Lbd3/f0;->a:Lad3/c;

    if-nez v0, :cond_1

    invoke-static {v2, p1}, Lbd3/q;->p(Lad3/c;Lyc3/g;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0, p1}, Lbd3/f0;->decodeElementIndex(Lyc3/g;)I

    move-result v0

    if-ne v0, v1, :cond_0

    :cond_1
    iget-object p1, p0, Lbd3/f0;->c:Lbd3/a;

    invoke-virtual {p1}, Lbd3/a;->B()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lbd3/f0;->b:Lbd3/l0;

    iget-char v0, v0, Lbd3/l0;->x:C

    invoke-virtual {p1, v0}, Lbd3/a;->h(C)V

    iget-object p1, p1, Lbd3/a;->b:Lae3/k;

    iget v0, p1, Lae3/k;->b:I

    iget-object v2, p1, Lae3/k;->d:Ljava/lang/Object;

    check-cast v2, [I

    aget v3, v2, v0

    const/4 v4, -0x2

    if-ne v3, v4, :cond_2

    aput v1, v2, v0

    add-int/2addr v0, v1

    iput v0, p1, Lae3/k;->b:I

    :cond_2
    iget v0, p1, Lae3/k;->b:I

    if-eq v0, v1, :cond_3

    add-int/2addr v0, v1

    iput v0, p1, Lae3/k;->b:I

    :cond_3
    return-void

    :cond_4
    iget-object v0, v2, Lad3/c;->a:Lad3/i;

    const-string v0, ""

    invoke-static {p1, v0}, Lbd3/q;->q(Lbd3/a;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final getSerializersModule()Lcd3/f;
    .locals 1

    iget-object v0, p0, Lbd3/f0;->d:Lcd3/f;

    return-object v0
.end method
