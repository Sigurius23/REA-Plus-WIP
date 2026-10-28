.class public final synthetic Lg1/u4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg1/u4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lg1/u4;->w:I

    const-string v2, "fieldElements"

    const-string v3, "addressElement"

    const-string v4, "toUpperCase(...)"

    const/4 v5, 0x0

    const-string v6, "\ud83c\udf10"

    const-string v7, "countryCode"

    const-string v9, "toChars(...)"

    sget-object v10, Lm83/y;->w:Lm83/y;

    const-string v12, "country"

    const/4 v13, 0x2

    sget-object v14, Ll83/a0;->a:Ll83/a0;

    const/4 v15, 0x1

    const v16, -0x1f1a5

    const-string v8, "it"

    const/4 v11, 0x0

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lcom/stripe/android/core/model/Country;

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v3, v13, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v2, v11}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v3

    sub-int v3, v3, v16

    invoke-static {v2, v15}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    sub-int v2, v2, v16

    invoke-static {v3}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v6, v3

    array-length v8, v2

    add-int v9, v6, v8

    invoke-static {v3, v9}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v3

    invoke-static {v2, v11, v3, v6, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v3}, Ljava/lang/String;-><init>([C)V

    :goto_0
    invoke-virtual {v1}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lg40/k2;->a:Li93/c;

    invoke-virtual {v1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lg40/k2;->b:Ljava/lang/Object;

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/g2;

    if-eqz v1, :cond_1

    iget-object v5, v1, Lg40/g2;->a:Ljava/lang/String;

    :cond_1
    filled-new-array {v6, v2, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const-string v3, " "

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lg40/k2;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lg40/k2;->d()Lq3/g0;

    move-result-object v1

    return-object v1

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Lg40/k2;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lg40/k2;->b()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Lcom/stripe/android/core/model/Country;

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v3, v13, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v2, v11}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v3

    sub-int v3, v3, v16

    invoke-static {v2, v15}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    sub-int v2, v2, v16

    invoke-static {v3}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v6, v3

    array-length v8, v2

    add-int v9, v6, v8

    invoke-static {v3, v9}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v3

    invoke-static {v2, v11, v3, v6, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v3}, Ljava/lang/String;-><init>([C)V

    :goto_1
    sget-object v2, Lg40/k2;->a:Li93/c;

    invoke-virtual {v1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lg40/k2;->b:Ljava/lang/Object;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/g2;

    if-eqz v1, :cond_3

    iget-object v1, v1, Lg40/g2;->a:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v1, v5

    :goto_2
    if-eqz v1, :cond_4

    const-string v2, "  "

    invoke-static {v2, v1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_4
    filled-new-array {v6, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Li3/z;

    const-string v2, "$this$semantics"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Li3/x;->a(Li3/z;)V

    return-object v14

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Lq3/y;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v14

    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, Lg2/m;

    const-string v2, "$this$focusProperties"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v11}, Lg2/m;->b(Z)V

    return-object v14

    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    move v15, v11

    :goto_3
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Lcom/stripe/android/core/model/Country;

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v3, v13, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {v2, v11}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v3

    sub-int v3, v3, v16

    invoke-static {v2, v15}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    sub-int v2, v2, v16

    invoke-static {v3}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v4, v3

    array-length v5, v2

    add-int v6, v4, v5

    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object v3

    invoke-static {v2, v11, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v3}, Ljava/lang/String;-><init>([C)V

    :goto_4
    invoke-virtual {v1}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " "

    invoke-static {v6, v2, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Lcom/stripe/android/core/model/Country;

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Lg40/e;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lg40/e;->b:Ln53/e;

    return-object v1

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Lg40/f;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lg40/f;->r:Lec3/r1;

    return-object v1

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, Lg40/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lg40/f;->f()Lec3/f2;

    move-result-object v1

    return-object v1

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Lg40/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lg40/f;->e()Lec3/f2;

    move-result-object v1

    return-object v1

    :pswitch_d
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v14

    :pswitch_e
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    new-instance v2, Lg40/f1;

    const v3, 0x7f140fce

    invoke-direct {v2, v3, v5}, Lg40/f1;-><init>(ILjava/util/List;)V

    if-eqz v1, :cond_7

    move-object v5, v2

    :cond_7
    return-object v5

    :pswitch_f
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg40/y2;

    invoke-interface {v3}, Lg40/y2;->f()Lec3/f2;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v3, 0x3

    if-eqz v1, :cond_9

    invoke-static {v10}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    goto :goto_6

    :cond_9
    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    new-array v4, v11, [Lec3/l;

    invoke-interface {v1, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lec3/l;

    new-instance v4, Lg40/c;

    invoke-direct {v4, v1, v3}, Lg40/c;-><init>([Lec3/l;I)V

    move-object v1, v4

    :goto_6
    new-instance v4, Lg40/d;

    invoke-direct {v4, v2, v3}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    new-instance v2, Ln53/e;

    invoke-direct {v2, v1, v4}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    return-object v2

    :pswitch_10
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg40/y2;

    invoke-interface {v3}, Lg40/y2;->e()Lec3/f2;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {v10}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    goto :goto_8

    :cond_b
    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    new-array v3, v11, [Lec3/l;

    invoke-interface {v1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lec3/l;

    new-instance v3, Lg40/c;

    invoke-direct {v3, v1, v13}, Lg40/c;-><init>([Lec3/l;I)V

    move-object v1, v3

    :goto_8
    new-instance v3, Lg40/d;

    invoke-direct {v3, v2, v13}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    new-instance v2, Ln53/e;

    invoke-direct {v2, v1, v3}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    return-object v2

    :pswitch_11
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg40/y2;

    invoke-interface {v3}, Lg40/y2;->e()Lec3/f2;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {v10}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    goto :goto_a

    :cond_d
    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    new-array v3, v11, [Lec3/l;

    invoke-interface {v1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lec3/l;

    new-instance v3, Lg40/c;

    invoke-direct {v3, v1, v15}, Lg40/c;-><init>([Lec3/l;I)V

    move-object v1, v3

    :goto_a
    new-instance v3, Lg40/d;

    invoke-direct {v3, v2, v15}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    new-instance v2, Ln53/e;

    invoke-direct {v2, v1, v3}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    return-object v2

    :pswitch_12
    move-object/from16 v1, p1

    check-cast v1, Ljava/util/List;

    const-string v2, "sectionFieldElements"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg40/y2;

    invoke-interface {v3}, Lg40/y2;->i()Lg40/z2;

    move-result-object v3

    invoke-interface {v3}, Lg40/z2;->f()Lec3/f2;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_e
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {v10}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/h1;

    invoke-static {v1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v1

    goto :goto_c

    :cond_f
    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    new-array v3, v11, [Lec3/l;

    invoke-interface {v1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lec3/l;

    new-instance v3, Lg40/c;

    invoke-direct {v3, v1, v11}, Lg40/c;-><init>([Lec3/l;I)V

    move-object v1, v3

    :goto_c
    new-instance v3, Lg40/d;

    invoke-direct {v3, v2, v11}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    new-instance v2, Ln53/e;

    invoke-direct {v2, v1, v3}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    return-object v2

    :pswitch_13
    invoke-static/range {p1 .. p1}, Lg32/k;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_14
    invoke-static/range {p1 .. p1}, Lg32/k;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lg31/c;->d(I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    move-object/from16 v1, p1

    check-cast v1, Lg/t;

    sget v2, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;->z:I

    const-string v2, "$this$addCallback"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v14

    :pswitch_17
    move-object/from16 v1, p1

    check-cast v1, Lio/getstream/chat/android/models/ThreadParticipant;

    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->a(Lio/getstream/chat/android/models/ThreadParticipant;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_18
    move-object/from16 v1, p1

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->b(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_19
    move-object/from16 v1, p1

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->a(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const v2, 0x3f333333    # 0.7f

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    return-object v1

    :pswitch_1b
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :pswitch_1c
    move-object/from16 v1, p1

    check-cast v1, Ld0/o0;

    const/16 v2, 0x708

    iput v2, v1, Ld0/o0;->a:I

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/16 v4, 0x4f3

    invoke-virtual {v1, v4, v3}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object v3

    sget-object v4, Lg1/v4;->g:Ld0/v;

    iput-object v4, v3, Ld0/n0;->b:Ld0/z;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    return-object v14

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
